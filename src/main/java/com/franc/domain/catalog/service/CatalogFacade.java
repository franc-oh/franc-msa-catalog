package com.franc.domain.catalog.service;

import com.franc.domain.catalog.domain.Catalog;
import com.franc.domain.catalog.dto.CatalogGetAllDto;
import com.franc.domain.catalog.mapper.CatalogMapper;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * [상품/재고] Facade (Controller > Facade > Service > Repository)
 *  - 하나의 엔드포인트에 대한 비즈니스로직을 담당
 *      - Service의 개별 기능들을 조립 > 비즈니스 로직을 구현
 *      - Transaction 설정
 */
@Component
@RequiredArgsConstructor
public class CatalogFacade {
    private static final Logger logger = LoggerFactory.getLogger(CatalogFacade.class);

    private final CatalogService catalogService;

    private final CatalogMapper catalogMapper;

    /**
     * 상품/재고 전체조회
     * @return
     * @throws Exception
     */
    public CatalogGetAllDto.Response getAllCatalog() throws Exception {
        List<Catalog> catalogs = catalogService.findAllCatalog();

        if(Objects.isNull(catalogs) || catalogs.isEmpty()) {
            return new CatalogGetAllDto.Response(new ArrayList<>());
        }

        return new CatalogGetAllDto.Response(catalogMapper.toGetAllDto(catalogs));
    }

}
