package com.cpf.mapper.transaction;

import com.cpf.beans.transaction.TraTrading;

public interface TraTradingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_trading
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String tradingid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_trading
     *
     * @mbggenerated
     */
    int insert(TraTrading record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_trading
     *
     * @mbggenerated
     */
    int insertSelective(TraTrading record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_trading
     *
     * @mbggenerated
     */
    TraTrading selectByPrimaryKey(String tradingid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_trading
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TraTrading record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_trading
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TraTrading record);
}