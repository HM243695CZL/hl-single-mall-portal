package com.tulingxueyuan.mall.modules.pms.controller;


import com.tulingxueyuan.mall.common.api.CommonResult;
import com.tulingxueyuan.mall.modules.pms.model.dto.HomeMenusBannerDto;
import com.tulingxueyuan.mall.modules.pms.model.dto.HomeMenusDto;
import com.tulingxueyuan.mall.modules.pms.service.PmsProductCategoryService;
import com.tulingxueyuan.mall.modules.sms.model.SmsHomeAdvertise;
import com.tulingxueyuan.mall.modules.sms.service.SmsHomeAdvertiseService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "HomeController", description = "首页内容管理")
@RequestMapping("/home")
public class HomeController {

    @Autowired
    PmsProductCategoryService productCategoryService;

    @Autowired
    SmsHomeAdvertiseService homeAdvertiseService;

    /**
     * 获取首页类型导航栏
     */
    @RequestMapping(value = "/menus_banner", method = RequestMethod.GET)
    public CommonResult getMenus() {
        // 分类导航
        List<HomeMenusDto> list = productCategoryService.getMenu();
        // banner
        List<SmsHomeAdvertise> homeAdvertisesList = homeAdvertiseService.getBannerList();
        HomeMenusBannerDto homeMenusBannerDto = new HomeMenusBannerDto();
        homeMenusBannerDto.setHomeMenusList(list);
        homeMenusBannerDto.setHomeAdvertisesList(homeAdvertisesList);
        return CommonResult.success(homeMenusBannerDto);
    }

}
