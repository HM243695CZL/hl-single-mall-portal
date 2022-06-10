package com.tulingxueyuan.mall.modules.sms.service;

import com.tulingxueyuan.mall.modules.pms.model.dto.HomeGoodsSaleDTO;
import com.tulingxueyuan.mall.modules.sms.model.SmsHomeCategory;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author XuShu
 * @since 2022-06-10
 */
public interface SmsHomeCategoryService extends IService<SmsHomeCategory> {

    List<HomeGoodsSaleDTO> getGoodsSale();
}
