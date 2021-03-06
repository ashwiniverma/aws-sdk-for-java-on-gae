/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudformation.model;

/**
 * Stack Status
 */
public enum StackStatus {
    
    CREATE_IN_PROGRESS("CREATE_IN_PROGRESS"),
    CREATE_FAILED("CREATE_FAILED"),
    CREATE_COMPLETE("CREATE_COMPLETE"),
    ROLLBACK_IN_PROGRESS("ROLLBACK_IN_PROGRESS"),
    ROLLBACK_FAILED("ROLLBACK_FAILED"),
    ROLLBACK_COMPLETE("ROLLBACK_COMPLETE"),
    DELETE_IN_PROGRESS("DELETE_IN_PROGRESS"),
    DELETE_FAILED("DELETE_FAILED");

    private String value;

    private StackStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return StackStatus corresponding to the value
     */
    public static StackStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("CREATE_IN_PROGRESS".equals(value)) {
            return StackStatus.CREATE_IN_PROGRESS;
        } else if ("CREATE_FAILED".equals(value)) {
            return StackStatus.CREATE_FAILED;
        } else if ("CREATE_COMPLETE".equals(value)) {
            return StackStatus.CREATE_COMPLETE;
        } else if ("ROLLBACK_IN_PROGRESS".equals(value)) {
            return StackStatus.ROLLBACK_IN_PROGRESS;
        } else if ("ROLLBACK_FAILED".equals(value)) {
            return StackStatus.ROLLBACK_FAILED;
        } else if ("ROLLBACK_COMPLETE".equals(value)) {
            return StackStatus.ROLLBACK_COMPLETE;
        } else if ("DELETE_IN_PROGRESS".equals(value)) {
            return StackStatus.DELETE_IN_PROGRESS;
        } else if ("DELETE_FAILED".equals(value)) {
            return StackStatus.DELETE_FAILED;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    