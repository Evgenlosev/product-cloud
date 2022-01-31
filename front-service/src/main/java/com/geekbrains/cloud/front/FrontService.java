package com.geekbrains.cloud.front;

import com.geekbrains.cloud.common.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FrontService {
    private final FrontConfig frontConfig;

    public List<ProductDto> getAllProducts() {
        return frontConfig.restTemplate().getForObject("http://product-service/api/v1/products", List.class); //UnknownHostException
    }
}
