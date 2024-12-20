package com.franc.domain.catalog.controller;

import com.franc.domain.catalog.dto.CatalogGetAllDto;
import com.franc.domain.catalog.service.CatalogFacade;
import com.franc.global.common.ApiResponse;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * [상품/재고] Controller (Controller > Facade > Service > Dao)
 */

@RestController
@RequestMapping("/catalogs")
@RequiredArgsConstructor
@Validated
public class CatalogController {
    private static final Logger logger = LoggerFactory.getLogger(CatalogController.class);

    private final CatalogFacade catalogFacade;


    @GetMapping("/health_check")
    public ApiResponse<?> status(HttpServletRequest request) throws Exception {
        return ApiResponse.ok("User Service Ok! - port="+request.getServerPort());
    }

    /**
     * 상품/재고 전체조회
     * @return
     * @throws Exception
     */
    @GetMapping
    public ApiResponse<?> getAll() throws Exception {
        CatalogGetAllDto.Response response = catalogFacade.getAllCatalog();
        return ApiResponse.ok(response);
    }

}
