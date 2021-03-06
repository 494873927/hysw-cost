package net.zlw.cloud.clearProject.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

@Data
@Table(name = "clear_project")
public class ClearProject implements Serializable {
    /**
     * 唯一标识
     */
    @Id
    @Column(name = "id")
    private String id;

    /**
     * 项目编号
     */
    @Column(name = "project_num")
    private String projectNum;

    /**
     * 项目名称
     */
    @Column(name = "project_name")
    private String projectName;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private String createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private String updateTime;

    /**
     * 创建人id
     */
    @Column(name = "founder_id")
    private String founderId;

    /**
     * 创建人公司id
     */
    @Column(name = "founder_company_id")
    private String founderCompanyId;

    /**
     * 状态 0,正常 1,删除
     */
    @Column(name = "del_flag")
    private String delFlag;

    @Column(name = "budgeting_id")
    private String budgetingId;

    @Transient
    private String constructionUnit;

    @Transient
    private String founderName;
    @Transient
    private String founderTime;

    @Transient
    private String tenderer;
    @Transient
    private String bidMoney;
    @Transient
    private String bidProjectAddress;

    private static final long serialVersionUID = 1L;
}