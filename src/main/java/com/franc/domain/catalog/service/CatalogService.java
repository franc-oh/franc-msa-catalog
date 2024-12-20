package com.franc.domain.catalog.service;

import com.franc.domain.catalog.domain.Catalog;
import com.franc.domain.catalog.repository.CatalogRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * [상품/재고] Service (Controller > Facade > Service > Repository)
 * - 해당 도메인의 개별 기능구현
 *      - 쿼리호출
 *      - 데이터 가공
 *      - 재사용
 */
@Service
@RequiredArgsConstructor
public class CatalogService {
    private static final Logger logger = LoggerFactory.getLogger(CatalogService.class);

    private final CatalogRepository catalogRepository;

    public List<Catalog>findAllCatalog() throws Exception {
        return catalogRepository.findAll();
    }

}
