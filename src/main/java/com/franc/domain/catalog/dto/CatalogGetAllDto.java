package com.franc.domain.catalog.dto;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 상품/재고 전체조회 DTO
 */
public record CatalogGetAllDto() {

    /**
     * 응답
     * @param catalogs
     */
    public record Response(
            List<CatalogInfo> catalogs

    ) {

        /**
         * Nested Object
         * @param productId
         * @param productName
         * @param stock
         * @param unitPrice
         * @param createdAt
         */
        public record CatalogInfo(
                String productId,
                String productName,
                Integer stock,
                Integer unitPrice,
                LocalDateTime createdAt
        ){}
    }

}
