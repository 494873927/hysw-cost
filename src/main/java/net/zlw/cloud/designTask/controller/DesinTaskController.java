package net.zlw.cloud.designTask.controller;

import net.tec.cloud.common.web.MediaTypes;
import net.zlw.cloud.common.RestUtil;
import net.zlw.cloud.designTask.model.vo.DesignVo;
import net.zlw.cloud.designTask.service.DesinTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Classname 设计任务报装接口
 * @Description TODO
 * @Date 2020/10/29 9:18
 * @Created sjf
 */

@RestController
public class DesinTaskController {


    @Autowired
    private DesinTaskService desinTaskService;

    @RequestMapping(value = "/api/getDesignEngineering", method = {RequestMethod.GET, RequestMethod.POST})
        public Map<String,Object> designEngineering(String account, DesignVo designVo){

        desinTaskService.getDesignEngineering(account,designVo);

        return RestUtil.success();


    }
}
