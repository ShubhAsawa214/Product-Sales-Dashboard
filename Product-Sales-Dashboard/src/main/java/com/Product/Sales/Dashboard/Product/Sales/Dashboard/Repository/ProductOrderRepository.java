package com.Product.Sales.Dashboard.Product.Sales.Dashboard.Repository;

import com.Product.Sales.Dashboard.Product.Sales.Dashboard.Entity.ProductSalesProjection;
import jakarta.persistence.criteria.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import com.Product.Sales.Dashboard.Product.Sales.Dashboard.Entity.ProductOrder;
import com.Product.Sales.Dashboard.Product.Sales.Dashboard.Entity.ProductSalesProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductOrderRepository extends JpaRepository<ProductOrder, Long> {
    @Query(value = """
        SELECT p.name AS productName,
               SUM(o.quantity) AS totalQuantity,
               SUM(o.quantity * p.price) AS totalRevenue
        FROM order_item o
        JOIN product p ON o.product_id = p.id
        GROUP BY p.name
    """, nativeQuery = true)
    List<ProductSalesProjection> getProductSalesReport();
}

