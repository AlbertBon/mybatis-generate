package com.bon.model;

import java.io.Serializable;

public class PaySetting implements Serializable {
    private Integer paySetId;

    /**
     * 代理商id
     *
     * @mbggenerated Fri Apr 27 14:20:38 CST 2018
     */
    private Integer agencyId;

    /**
     * URL路径
     *
     * @mbggenerated Fri Apr 27 14:20:38 CST 2018
     */
    private String hostUrl;

    /**
     * 私钥地址
     *
     * @mbggenerated Fri Apr 27 14:20:38 CST 2018
     */
    private String privateKey;

    /**
     * 私钥密码
     *
     * @mbggenerated Fri Apr 27 14:20:38 CST 2018
     */
    private String privateKeyPsw;

    /**
     * 企业代码（企业号），由通莞分配
     *
     * @mbggenerated Fri Apr 27 14:20:38 CST 2018
     */
    private String corpNo;

    /**
     * 费项代码，由通莞分配
     *
     * @mbggenerated Fri Apr 27 14:20:38 CST 2018
     */
    private String feeCode;

    private static final long serialVersionUID = 1L;

    public PaySetting(Integer paySetId, Integer agencyId, String hostUrl, String privateKey, String privateKeyPsw, String corpNo, String feeCode) {
        this.paySetId = paySetId;
        this.agencyId = agencyId;
        this.hostUrl = hostUrl;
        this.privateKey = privateKey;
        this.privateKeyPsw = privateKeyPsw;
        this.corpNo = corpNo;
        this.feeCode = feeCode;
    }

    public PaySetting() {
        super();
    }

    public Integer getPaySetId() {
        return paySetId;
    }

    public void setPaySetId(Integer paySetId) {
        this.paySetId = paySetId;
    }

    public Integer getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Integer agencyId) {
        this.agencyId = agencyId;
    }

    public String getHostUrl() {
        return hostUrl;
    }

    public void setHostUrl(String hostUrl) {
        this.hostUrl = hostUrl == null ? null : hostUrl.trim();
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey == null ? null : privateKey.trim();
    }

    public String getPrivateKeyPsw() {
        return privateKeyPsw;
    }

    public void setPrivateKeyPsw(String privateKeyPsw) {
        this.privateKeyPsw = privateKeyPsw == null ? null : privateKeyPsw.trim();
    }

    public String getCorpNo() {
        return corpNo;
    }

    public void setCorpNo(String corpNo) {
        this.corpNo = corpNo == null ? null : corpNo.trim();
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode == null ? null : feeCode.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", paySetId=").append(paySetId);
        sb.append(", agencyId=").append(agencyId);
        sb.append(", hostUrl=").append(hostUrl);
        sb.append(", privateKey=").append(privateKey);
        sb.append(", privateKeyPsw=").append(privateKeyPsw);
        sb.append(", corpNo=").append(corpNo);
        sb.append(", feeCode=").append(feeCode);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PaySetting other = (PaySetting) that;
        return (this.getPaySetId() == null ? other.getPaySetId() == null : this.getPaySetId().equals(other.getPaySetId()))
            && (this.getAgencyId() == null ? other.getAgencyId() == null : this.getAgencyId().equals(other.getAgencyId()))
            && (this.getHostUrl() == null ? other.getHostUrl() == null : this.getHostUrl().equals(other.getHostUrl()))
            && (this.getPrivateKey() == null ? other.getPrivateKey() == null : this.getPrivateKey().equals(other.getPrivateKey()))
            && (this.getPrivateKeyPsw() == null ? other.getPrivateKeyPsw() == null : this.getPrivateKeyPsw().equals(other.getPrivateKeyPsw()))
            && (this.getCorpNo() == null ? other.getCorpNo() == null : this.getCorpNo().equals(other.getCorpNo()))
            && (this.getFeeCode() == null ? other.getFeeCode() == null : this.getFeeCode().equals(other.getFeeCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPaySetId() == null) ? 0 : getPaySetId().hashCode());
        result = prime * result + ((getAgencyId() == null) ? 0 : getAgencyId().hashCode());
        result = prime * result + ((getHostUrl() == null) ? 0 : getHostUrl().hashCode());
        result = prime * result + ((getPrivateKey() == null) ? 0 : getPrivateKey().hashCode());
        result = prime * result + ((getPrivateKeyPsw() == null) ? 0 : getPrivateKeyPsw().hashCode());
        result = prime * result + ((getCorpNo() == null) ? 0 : getCorpNo().hashCode());
        result = prime * result + ((getFeeCode() == null) ? 0 : getFeeCode().hashCode());
        return result;
    }
}