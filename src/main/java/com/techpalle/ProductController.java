package com.techpalle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")

public class ProductController {


 @Autowired
 private ProductService productService;

 public ProductController(ProductService productService) {
  this.productService = productService;
 }

 @GetMapping
 public List<Product> getAllProduct() {
  return productService.getAllProducts();
 }

 @GetMapping("/{id}")
 public Product getProductById(@PathVariable("id") Integer id) {
  return productService.getProductById(id);
 }

 @PostMapping
 public Product createProduct(@RequestBody Product product) {
  return productService.saveProduct(product);
 }

 @PutMapping("/{id}")
 public Product updateProduct(@PathVariable("id") Integer id, @RequestBody Product product) {
  Product existingProduct = productService.getProductById(id);
  if (existingProduct == null) {
   return null;
  }
  existingProduct.setPname(product.getPname());
  existingProduct.setBatchno(product.getBatchno());
  existingProduct.setPrice(product.getPrice());
  existingProduct.setNoofproduct(product.getNoofproduct());

  return productService.saveProduct(existingProduct);
 }

 @DeleteMapping("/{id}")
 public void deleteProduct(@PathVariable("id") Integer id) {
  productService.deleteProduct(id);
 }
}