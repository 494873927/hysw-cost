package net.zlw.cloud.costAssessmentDesign.controller;

import net.tec.cloud.common.controller.BaseController;
import net.tec.cloud.common.util.RestUtil;
import net.tec.cloud.common.web.MediaTypes;
import net.zlw.cloud.costAssessmentDesign.model.CostAssessmentDesing;
import net.zlw.cloud.costAssessmentDesign.service.CostAssessmentDesignService;
import net.zlw.cloud.designAssessSettings.model.AssessmentDesign;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**  造价 -考核设计
 * Created by xulei on 2020/9/18.
 */
@RestController
@RequestMapping("/api/costAssessmentDesing")
public class CostAssessmentDesignController extends BaseController {

    @Resource
    private CostAssessmentDesignService costAssessmentDesignService;




    /**
     * @Author Armyman
     * @Description // 根据id查找
     * @Date 21:10 2020/9/18
     **/
    @GetMapping("/findById")
//    @PostMapping("/findById")
//    @RequestMapping(value = "/findById",method = {RequestMethod.POST,RequestMethod.GET},produces = MediaTypes.JSON_UTF_8)
    public Map<String, Object> findById(String id){
        CostAssessmentDesing assessmentDesign = costAssessmentDesignService.findById(id);
        return RestUtil.success(assessmentDesign);
    }


    /**
     * @Author Armyman
     * @Description // 更新
     * @Date 21:10 2020/9/18
     **/
    @PostMapping("/update")
    public Map<String,Object> update(AssessmentDesign assessmentDesign){
        costAssessmentDesignService.update(assessmentDesign,getLoginUser(),request);
        return RestUtil.success("操作成功");
    }

    /**
     * 查询所有
     * @return
     */

//    @PostMapping("/findAll")
    @RequestMapping(value = "/findAll",method = {RequestMethod.POST,RequestMethod.GET},produces = MediaTypes.JSON_UTF_8)
    public Map<String,Object> findall(){
        List<CostAssessmentDesing> all = costAssessmentDesignService.findAll();
        return RestUtil.success(all);
    }
}
