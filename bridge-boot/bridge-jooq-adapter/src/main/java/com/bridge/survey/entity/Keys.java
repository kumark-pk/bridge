/**
 * This class is generated by jOOQ
 */
package com.bridge.survey.entity;


import com.bridge.survey.entity.tables.SurveyDistribution;
import com.bridge.survey.entity.tables.Surveys;
import com.bridge.survey.entity.tables.records.SurveyDistributionRecord;
import com.bridge.survey.entity.tables.records.SurveysRecord;

import org.jooq.ForeignKey;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;

import javax.annotation.Generated;


/**
 * A class modelling foreign key relationships between tables of the <code>public</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<SurveyDistributionRecord> SURVEY_DISTRIBUTION_PKEY = UniqueKeys0.SURVEY_DISTRIBUTION_PKEY;
    public static final UniqueKey<SurveysRecord> SURVEYS_PKEY = UniqueKeys0.SURVEYS_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<SurveyDistributionRecord, SurveysRecord> SURVEY_DISTRIBUTION__SURVEY_DISTRIBUTION_SURVEY_ID_FKEY = ForeignKeys0.SURVEY_DISTRIBUTION__SURVEY_DISTRIBUTION_SURVEY_ID_FKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<SurveyDistributionRecord> SURVEY_DISTRIBUTION_PKEY = createUniqueKey(SurveyDistribution.SURVEY_DISTRIBUTION, "survey_distribution_pkey", SurveyDistribution.SURVEY_DISTRIBUTION.ID);
        public static final UniqueKey<SurveysRecord> SURVEYS_PKEY = createUniqueKey(Surveys.SURVEYS, "surveys_pkey", Surveys.SURVEYS.ID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<SurveyDistributionRecord, SurveysRecord> SURVEY_DISTRIBUTION__SURVEY_DISTRIBUTION_SURVEY_ID_FKEY = createForeignKey(Keys.SURVEYS_PKEY, SurveyDistribution.SURVEY_DISTRIBUTION, "survey_distribution__survey_distribution_survey_id_fkey", SurveyDistribution.SURVEY_DISTRIBUTION.SURVEY_ID);
    }
}
