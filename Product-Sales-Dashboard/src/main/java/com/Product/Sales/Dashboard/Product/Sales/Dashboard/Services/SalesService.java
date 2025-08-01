package com.Product.Sales.Dashboard.Product.Sales.Dashboard.Services;

import com.Product.Sales.Dashboard.Product.Sales.Dashboard.Entity.ProductSalesProjection;
import com.Product.Sales.Dashboard.Product.Sales.Dashboard.Repository.ProductOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesService {
    @Autowired
    private ProductOrderRepository productOrderRepository;

    public List<ProductSalesProjection> getSaleReport() {
        return productOrderRepository.getProductSalesReport();
    }
}


