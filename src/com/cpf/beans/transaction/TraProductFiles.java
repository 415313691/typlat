package com.cpf.beans.transaction;

public class TraProductFiles {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tra_product_files.filesid
     *
     * @mbggenerated
     */
    private String filesid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tra_product_files.productid
     *
     * @mbggenerated
     */
    private String productid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tra_product_files.files
     *
     * @mbggenerated
     */
    private String files;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tra_product_files.filesid
     *
     * @return the value of tra_product_files.filesid
     *
     * @mbggenerated
     */
    public String getFilesid() {
        return filesid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tra_product_files.filesid
     *
     * @param filesid the value for tra_product_files.filesid
     *
     * @mbggenerated
     */
    public void setFilesid(String filesid) {
        this.filesid = filesid == null ? null : filesid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tra_product_files.productid
     *
     * @return the value of tra_product_files.productid
     *
     * @mbggenerated
     */
    public String getProductid() {
        return productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tra_product_files.productid
     *
     * @param productid the value for tra_product_files.productid
     *
     * @mbggenerated
     */
    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tra_product_files.files
     *
     * @return the value of tra_product_files.files
     *
     * @mbggenerated
     */
    public String getFiles() {
        return files;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tra_product_files.files
     *
     * @param files the value for tra_product_files.files
     *
     * @mbggenerated
     */
    public void setFiles(String files) {
        this.files = files == null ? null : files.trim();
    }
}