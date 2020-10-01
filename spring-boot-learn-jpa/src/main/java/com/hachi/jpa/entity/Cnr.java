package com.hachi.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "consignments")
public class Cnr extends BaseEntity {

    @Id
    private Long awbUid;
    private String awbNumber;
    private String cargoFlowType;
    private Integer awbPieces;
    private BigDecimal awbWeight;
    private String origin;
    private String constraintCode;

    public Long getAwbUid() {
        return awbUid;
    }

    public void setAwbUid(Long awbUid) {
        this.awbUid = awbUid;
    }

    public String getAwbNumber() {
        return awbNumber;
    }

    public void setAwbNumber(String awbNumber) {
        this.awbNumber = awbNumber;
    }

    public String getCargoFlowType() {
        return cargoFlowType;
    }

    public void setCargoFlowType(String cargoFlowType) {
        this.cargoFlowType = cargoFlowType;
    }

    public Integer getAwbPieces() {
        return awbPieces;
    }

    public void setAwbPieces(Integer awbPieces) {
        this.awbPieces = awbPieces;
    }

    public BigDecimal getAwbWeight() {
        return awbWeight;
    }

    public void setAwbWeight(BigDecimal awbWeight) {
        this.awbWeight = awbWeight;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getConstraintCode() {
        return constraintCode;
    }

    public void setConstraintCode(String constraintCode) {
        this.constraintCode = constraintCode;
    }
}
