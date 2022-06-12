package com.tulingxueyuan.mall.modules.pms.mapper;

import com.tulingxueyuan.mall.dto.HomeMenusDto;
import com.tulingxueyuan.mall.modules.pms.model.PmsProductCategory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 产品分类 Mapper 接口
 * </p>
 *
 * @author XuShu
 * @since 2022-06-09
 */
public interface PmsProductCategoryMapper extends BaseMapper<PmsProductCategory> {

    List<HomeMenusDto> getProductWithCategory();
}
