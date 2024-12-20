package com.franc.domain.catalog.mapper;

import com.franc.domain.catalog.domain.Catalog;
import com.franc.domain.catalog.dto.CatalogGetAllDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CatalogMapper {
    List<CatalogGetAllDto.Response.CatalogInfo> toGetAllDto(List<Catalog> catalogs);
}
