package adm.staf.welf.vo;

import java.math.BigDecimal;

import core.base.DefaultVO;
/**
 * 복지항목코드 MODEL GHRWF010
 *
 * @Author 정우용
 * @Description 복지항목코드 MODEL GHRWF010
 * @Company Daewoo Information Systems Co., Ltd.
 * @Copyright Daewoo Information Systems Co., Copyright (c) 2018
 */

public class Ghrwf010VO extends DefaultVO {
    private String welfrIemCode; /* 복지항목코드 */
    private String welfrIemNm; /* 복지항목명 */
    private String stfscSeCode; /* 교직원구분코드 */
    private String univIacfSeCode; /* 대학산학협력단구분코드 */
    private String welfrIemSeCode; /* 복지항목구분코드 */
    private String pymntEraCn; /* 지급시기내용 */
    private String welfrPymntMthdCn; /* 복지지급방법내용 */
    private String pymntAmtCn; /* 지급금액내용 */
    private String sbdocCn; /* 제출서류내용 */
    private String sportCn; /* 지원내용 */
    private String welfrSportTrgetSeCode; /* 복지지원대상구분코드 */
    private String famlyApplyAt; /* 가족지원여부 */
    private String chrgDeptNm; /* 담당부서명 */
    private String prscgEmpno; /* 담당자사번 */
    private String welfrAplyPosblAt; /* 복지신청가능여부 */
    private String colgPymntIemAt; /* 단과대학지급항목여부 */
    private String welfrPymntSeCode; /* 복지지급구분코드 */
    private String welfrPymntMthdCode; /* 복지지급방법코드 */
    private BigDecimal pymntAmt; /* 지급금액 */
    private String aplyCn; /* 신청내용 */
    private String campsSeCode; /* 캠퍼스구분(2018.05.30추가) */
    private String ctsnnSeCode; /* 경조구분코드(2018.06.11추가) */
    private String incmSeCode; /* 소득구분(2018.06.12추가) */
    private String deptyAplyPosblAt; /* 대리신청가능여부(2018.06.25추가) */


    public String getDeptyAplyPosblAt() {
		return deptyAplyPosblAt;
	}

	public void setDeptyAplyPosblAt(String deptyAplyPosblAt) {
		this.deptyAplyPosblAt = deptyAplyPosblAt;
	}

	public String getIncmSeCode() {
		return incmSeCode;
	}

	public void setIncmSeCode(String incmSeCode) {
		this.incmSeCode = incmSeCode;
	}

	public String getCampsSeCode() {
		return campsSeCode;
	}

	public void setCampsSeCode(String campsSeCode) {
		this.campsSeCode = campsSeCode;
	}

	public String getWelfrIemCode() {
	return welfrIemCode;
    }

    public void setWelfrIemCode(String welfrIemCode) {
	this.welfrIemCode = welfrIemCode;
    }

    public String getWelfrIemNm() {
	return welfrIemNm;
    }

    public void setWelfrIemNm(String welfrIemNm) {
	this.welfrIemNm = welfrIemNm;
    }

    public String getStfscSeCode() {
	return stfscSeCode;
    }

    public void setStfscSeCode(String stfscSeCode) {
	this.stfscSeCode = stfscSeCode;
    }

    public String getUnivIacfSeCode() {
	return univIacfSeCode;
    }

    public void setUnivIacfSeCode(String univIacfSeCode) {
	this.univIacfSeCode = univIacfSeCode;
    }

    public String getWelfrIemSeCode() {
	return welfrIemSeCode;
    }

    public void setWelfrIemSeCode(String welfrIemSeCode) {
	this.welfrIemSeCode = welfrIemSeCode;
    }

    public String getPymntEraCn() {
	return pymntEraCn;
    }

    public void setPymntEraCn(String pymntEraCn) {
	this.pymntEraCn = pymntEraCn;
    }

    public String getWelfrPymntMthdCn() {
	return welfrPymntMthdCn;
    }

    public void setWelfrPymntMthdCn(String welfrPymntMthdCn) {
	this.welfrPymntMthdCn = welfrPymntMthdCn;
    }

    public String getPymntAmtCn() {
	return pymntAmtCn;
    }

    public void setPymntAmtCn(String pymntAmtCn) {
	this.pymntAmtCn = pymntAmtCn;
    }

    public String getSbdocCn() {
	return sbdocCn;
    }

    public void setSbdocCn(String sbdocCn) {
	this.sbdocCn = sbdocCn;
    }

    public String getSportCn() {
	return sportCn;
    }

    public void setSportCn(String sportCn) {
	this.sportCn = sportCn;
    }

    public String getWelfrSportTrgetSeCode() {
	return welfrSportTrgetSeCode;
    }

    public void setWelfrSportTrgetSeCode(String welfrSportTrgetSeCode) {
	this.welfrSportTrgetSeCode = welfrSportTrgetSeCode;
    }

    public String getFamlyApplyAt() {
	return famlyApplyAt;
    }

    public void setFamlyApplyAt(String famlyApplyAt) {
	this.famlyApplyAt = famlyApplyAt;
    }

    public String getChrgDeptNm() {
	return chrgDeptNm;
    }

    public void setChrgDeptNm(String chrgDeptNm) {
	this.chrgDeptNm = chrgDeptNm;
    }

    public String getPrscgEmpno() {
	return prscgEmpno;
    }

    public void setPrscgEmpno(String prscgEmpno) {
	this.prscgEmpno = prscgEmpno;
    }

    public String getWelfrAplyPosblAt() {
	return welfrAplyPosblAt;
    }

    public void setWelfrAplyPosblAt(String welfrAplyPosblAt) {
	this.welfrAplyPosblAt = welfrAplyPosblAt;
    }

    public String getColgPymntIemAt() {
	return colgPymntIemAt;
    }

    public void setColgPymntIemAt(String colgPymntIemAt) {
	this.colgPymntIemAt = colgPymntIemAt;
    }

    public String getWelfrPymntSeCode() {
	return welfrPymntSeCode;
    }

    public void setWelfrPymntSeCode(String welfrPymntSeCode) {
	this.welfrPymntSeCode = welfrPymntSeCode;
    }

    public String getWelfrPymntMthdCode() {
	return welfrPymntMthdCode;
    }

    public void setWelfrPymntMthdCode(String welfrPymntMthdCode) {
	this.welfrPymntMthdCode = welfrPymntMthdCode;
    }

    public BigDecimal getPymntAmt() {
	return pymntAmt;
    }

    public void setPymntAmt(BigDecimal pymntAmt) {
	this.pymntAmt = pymntAmt;
    }

    public String getAplyCn() {
	return aplyCn;
    }

    public void setAplyCn(String aplyCn) {
	this.aplyCn = aplyCn;
    }

	public String getCtsnnSeCode() {
		return ctsnnSeCode;
	}

	public void setCtsnnSeCode(String ctsnnSeCode) {
		this.ctsnnSeCode = ctsnnSeCode;
	}
}