package com.cpf.beans.system;

public class RelUserLabel {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rel_user_label.userid
     *
     * @mbggenerated
     */
    private String userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rel_user_label.labelid
     *
     * @mbggenerated
     */
    private String labelid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rel_user_label.userid
     *
     * @return the value of rel_user_label.userid
     *
     * @mbggenerated
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rel_user_label.userid
     *
     * @param userid the value for rel_user_label.userid
     *
     * @mbggenerated
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rel_user_label.labelid
     *
     * @return the value of rel_user_label.labelid
     *
     * @mbggenerated
     */
    public String getLabelid() {
        return labelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rel_user_label.labelid
     *
     * @param labelid the value for rel_user_label.labelid
     *
     * @mbggenerated
     */
    public void setLabelid(String labelid) {
        this.labelid = labelid == null ? null : labelid.trim();
    }
}