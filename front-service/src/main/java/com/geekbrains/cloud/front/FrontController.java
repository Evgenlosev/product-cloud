package com.geekbrains.cloud.front;

import com.geekbrains.cloud.common.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class FrontController {
    private  final FrontService frontService;

    @GetMapping
    public List<ProductDto> getProducts() {
        return frontService.getAllProducts();
    }
}
