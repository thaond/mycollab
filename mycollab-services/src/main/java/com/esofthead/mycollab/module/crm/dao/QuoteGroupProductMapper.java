/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.module.crm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.esofthead.mycollab.core.persistence.ICrudGenericDAO;
import com.esofthead.mycollab.module.crm.domain.QuoteGroupProduct;
import com.esofthead.mycollab.module.crm.domain.QuoteGroupProductExample;

public interface QuoteGroupProductMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_quote_group_product
     *
     * @mbggenerated Mon Jan 14 14:41:39 GMT+07:00 2013
     */
    int countByExample(QuoteGroupProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_quote_group_product
     *
     * @mbggenerated Mon Jan 14 14:41:39 GMT+07:00 2013
     */
    int deleteByExample(QuoteGroupProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_quote_group_product
     *
     * @mbggenerated Mon Jan 14 14:41:39 GMT+07:00 2013
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_quote_group_product
     *
     * @mbggenerated Mon Jan 14 14:41:39 GMT+07:00 2013
     */
    int insert(QuoteGroupProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_quote_group_product
     *
     * @mbggenerated Mon Jan 14 14:41:39 GMT+07:00 2013
     */
    int insertSelective(QuoteGroupProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_quote_group_product
     *
     * @mbggenerated Mon Jan 14 14:41:39 GMT+07:00 2013
     */
    List<QuoteGroupProduct> selectByExample(QuoteGroupProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_quote_group_product
     *
     * @mbggenerated Mon Jan 14 14:41:39 GMT+07:00 2013
     */
    QuoteGroupProduct selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_quote_group_product
     *
     * @mbggenerated Mon Jan 14 14:41:39 GMT+07:00 2013
     */
    int updateByExampleSelective(@Param("record") QuoteGroupProduct record, @Param("example") QuoteGroupProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_quote_group_product
     *
     * @mbggenerated Mon Jan 14 14:41:39 GMT+07:00 2013
     */
    int updateByExample(@Param("record") QuoteGroupProduct record, @Param("example") QuoteGroupProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_quote_group_product
     *
     * @mbggenerated Mon Jan 14 14:41:39 GMT+07:00 2013
     */
    int updateByPrimaryKeySelective(QuoteGroupProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_quote_group_product
     *
     * @mbggenerated Mon Jan 14 14:41:39 GMT+07:00 2013
     */
    int updateByPrimaryKey(QuoteGroupProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_quote_group_product
     *
     * @mbggenerated Mon Jan 14 14:41:39 GMT+07:00 2013
     */
    Integer insertAndReturnKey(QuoteGroupProduct value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_quote_group_product
     *
     * @mbggenerated Mon Jan 14 14:41:39 GMT+07:00 2013
     */
    void removeWithSession(List primaryKeys);
}