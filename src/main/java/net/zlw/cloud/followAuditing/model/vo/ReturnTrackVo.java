package net.zlw.cloud.followAuditing.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.zlw.cloud.budgeting.model.vo.BudgetingListVo;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReturnTrackVo {
    private String id;
    private String ceaNum;
    private String projectNum;
    private String projectName;
    private String trackStatus;
    private String district;
    private String constructionUnit;
    private String projectNature;
    private String designCategory;
    private String waterSupplyType;
    private String customerName;
    private String waterAddress;
    private String constructionOrganization;
    private String writter;
    private String fillTime;
    private String outsource;
    private String auditUnitNameId;
    private String ceaTotalMoney;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReturnTrackVo that = (ReturnTrackVo) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
