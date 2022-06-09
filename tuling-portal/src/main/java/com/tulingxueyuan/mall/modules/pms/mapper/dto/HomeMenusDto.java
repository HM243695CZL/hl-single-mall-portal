package com.tulingxueyuan.mall.modules.pms.mapper.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "首页类型导航栏数据", description = "首页类型导航栏数据")
public class HomeMenusDto {

    private Long id;
    private String name;

    private List<ProductDTO> productList;
}