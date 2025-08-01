package com.Product.Sales.Dashboard.Product.Sales.Dashboard.Controller;

import com.Product.Sales.Dashboard.Product.Sales.Dashboard.Entity.ProductSalesProjection;
import com.Product.Sales.Dashboard.Product.Sales.Dashboard.Services.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/sales")
public class SalesController {
    @Autowired
    private SalesService salesService;

    @GetMapping("/report")
    public List<ProductSalesProjection> getReport() {
        return salesService.getSaleReport();
    }
}


