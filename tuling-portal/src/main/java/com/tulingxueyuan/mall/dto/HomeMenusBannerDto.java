package com.tulingxueyuan.mall.dto;

import com.tulingxueyuan.mall.modules.sms.model.SmsHomeAdvertise;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "首页类型导航栏和banner组合数据传输对象", description = "首页类型导航栏数据和banner")
public class HomeMenusBannerDto {

    private List<HomeMenusDto> homeMenusList;
    private List<SmsHomeAdvertise> homeAdvertisesList;
}
