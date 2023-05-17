package com.techpalle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class ProductService
{
    @Autowired
    private IProductService iproductRepository;

    public ProductService(IProductService iproductRepository) {
        this.iproductRepository = iproductRepository;
    }
    //read, save,delete

    public List<Product> getAllProducts()
    {
        return iproductRepository.findAll();
    }

    public Product getProductById(Integer id)
    {
        return iproductRepository.findById(id).orElse(null);
    }

    public Product saveProduct(Product product)
    {
        return iproductRepository.save(product);
    }

    public void deleteProduct(Integer id)
    {
        iproductRepository.deleteById(id);
    }
}
