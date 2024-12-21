package com.aoding.model;

import java.util.ArrayList;

public class CmsPreferenceAreaExample {
    protected boolean distinct;

    protected String orderByClause;

    protected List<Criteria> orderCriteria;

    public CmsPreferenceAreaExample(){
        orderCriteria = new ArrayList<>();
    }









    protected static abstract class generatedCriteria {
        protected List<Criterion> criteria;

        protected generatedCriteria(){
            criteria = new ArrayList<>();
        }


    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }
    }
}
