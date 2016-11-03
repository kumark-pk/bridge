/**
 * This class is generated by jOOQ
 */
package com.bridge.survey.entity.tables.records;


import com.bridge.survey.entity.tables.SurveyDistribution;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;

import java.sql.Time;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SurveyDistributionRecord extends UpdatableRecordImpl<SurveyDistributionRecord> implements Record8<Long, Long, String, Time, Time, Time, String, String> {

    private static final long serialVersionUID = -773872298;

    /**
     * Setter for <code>public.survey_distribution.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.survey_distribution.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.survey_distribution.survey_id</code>.
     */
    public void setSurveyId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.survey_distribution.survey_id</code>.
     */
    public Long getSurveyId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.survey_distribution.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.survey_distribution.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.survey_distribution.closes_at</code>.
     */
    public void setClosesAt(Time value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.survey_distribution.closes_at</code>.
     */
    public Time getClosesAt() {
        return (Time) get(3);
    }

    /**
     * Setter for <code>public.survey_distribution.created_at</code>.
     */
    public void setCreatedAt(Time value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.survey_distribution.created_at</code>.
     */
    public Time getCreatedAt() {
        return (Time) get(4);
    }

    /**
     * Setter for <code>public.survey_distribution.updated_at</code>.
     */
    public void setUpdatedAt(Time value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.survey_distribution.updated_at</code>.
     */
    public Time getUpdatedAt() {
        return (Time) get(5);
    }

    /**
     * Setter for <code>public.survey_distribution.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.survey_distribution.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.survey_distribution.updated_by</code>.
     */
    public void setUpdatedBy(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.survey_distribution.updated_by</code>.
     */
    public String getUpdatedBy() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, Long, String, Time, Time, Time, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, Long, String, Time, Time, Time, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return SurveyDistribution.SURVEY_DISTRIBUTION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return SurveyDistribution.SURVEY_DISTRIBUTION.SURVEY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SurveyDistribution.SURVEY_DISTRIBUTION.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Time> field4() {
        return SurveyDistribution.SURVEY_DISTRIBUTION.CLOSES_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Time> field5() {
        return SurveyDistribution.SURVEY_DISTRIBUTION.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Time> field6() {
        return SurveyDistribution.SURVEY_DISTRIBUTION.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return SurveyDistribution.SURVEY_DISTRIBUTION.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return SurveyDistribution.SURVEY_DISTRIBUTION.UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getSurveyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Time value4() {
        return getClosesAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Time value5() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Time value6() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyDistributionRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyDistributionRecord value2(Long value) {
        setSurveyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyDistributionRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyDistributionRecord value4(Time value) {
        setClosesAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyDistributionRecord value5(Time value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyDistributionRecord value6(Time value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyDistributionRecord value7(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyDistributionRecord value8(String value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyDistributionRecord values(Long value1, Long value2, String value3, Time value4, Time value5, Time value6, String value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SurveyDistributionRecord
     */
    public SurveyDistributionRecord() {
        super(SurveyDistribution.SURVEY_DISTRIBUTION);
    }

    /**
     * Create a detached, initialised SurveyDistributionRecord
     */
    public SurveyDistributionRecord(Long id, Long surveyId, String name, Time closesAt, Time createdAt, Time updatedAt, String createdBy, String updatedBy) {
        super(SurveyDistribution.SURVEY_DISTRIBUTION);

        set(0, id);
        set(1, surveyId);
        set(2, name);
        set(3, closesAt);
        set(4, createdAt);
        set(5, updatedAt);
        set(6, createdBy);
        set(7, updatedBy);
    }
}
