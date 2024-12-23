package com.aoding.model;

import java.util.ArrayList;
import java.util.List;

public class CmsPreferenceAreaExample {
    protected boolean distinct;

    protected String orderByClause;

    protected List<Criteria> orderCriteria;

    public CmsPreferenceAreaExample() {
        orderCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    protected static abstract class generatedCriteria {
        protected List<Criterion> criteria;

        protected generatedCriteria() {
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


        protected static abstract class GeneratedCriteria {
            protected List<Criterion> criteria;

            protected GeneratedCriteria() {
                super();
                criteria = new ArrayList<>();
            }

            public boolean isVaild(){
                return criteria.size() > 0;
            }

            public List<Criterion> getAllCriterion(){
                return criteria;
            }

            protected void addCriterion(String condition) {
                if (condition == null) {
                    throw new RuntimeException("condition cant not be null");
                }

                criteria.add(new Criterion(condition));
            }

            protected void addCriterion(String condition , Object value , String property){
                if ( value == null ){
                    throw new RuntimeException("value for"+ property+ "cant be null");
                }
                criteria.add(new Criterion(condition , value));
            }

            protected void addCriterion(String condition, Object value1, Object value2, String property) {
                if (value1 == null || value2 == null) {
                    throw new RuntimeException("Between values for " + property + " cannot be null");
                }
                criteria.add(new Criterion(condition, value1, value2));
            }
        }

        public Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }


        public Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        public Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        public Criterion(String condition, Object value, Object secondvalue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondvalue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        public Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }

    }
}
