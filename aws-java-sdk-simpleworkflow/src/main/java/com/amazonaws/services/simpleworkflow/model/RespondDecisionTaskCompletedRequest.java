/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#respondDecisionTaskCompleted(RespondDecisionTaskCompletedRequest) RespondDecisionTaskCompleted operation}.
 * <p>
 * Used by deciders to tell the service that the DecisionTask identified
 * by the <code>taskToken</code> has successfully completed. The
 * <code>decisions</code> argument specifies the list of decisions made
 * while processing the task.
 * </p>
 * <p>
 * A <code>DecisionTaskCompleted</code> event is added to the workflow
 * history. The <code>executionContext</code> specified is attached to
 * the event in the workflow execution history.
 * </p>
 * <p>
 * <b>Access Control</b>
 * </p>
 * <p>
 * If an IAM policy grants permission to use
 * <code>RespondDecisionTaskCompleted</code> , it can express permissions
 * for the list of decisions in the <code>decisions</code> parameter.
 * Each of the decisions has one or more parameters, much like a regular
 * API call. To allow for policies to be as readable as possible, you can
 * express permissions on decisions as if they were actual API calls,
 * including applying conditions to some parameters. For more
 * information, see
 * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#respondDecisionTaskCompleted(RespondDecisionTaskCompletedRequest)
 */
public class RespondDecisionTaskCompletedRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The <code>taskToken</code> from the <a>DecisionTask</a>.
     * <important><code>taskToken</code> is generated by the service and
     * should be treated as an opaque value. If the task is passed to another
     * process, its <code>taskToken</code> must also be passed. This enables
     * it to provide its progress and respond with results.</important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String taskToken;

    /**
     * The list of decisions (possibly empty) made by the decider while
     * processing this decision task. See the docs for the <a>Decision</a>
     * structure for details.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Decision> decisions;

    /**
     * User defined context to add to workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String executionContext;

    /**
     * The <code>taskToken</code> from the <a>DecisionTask</a>.
     * <important><code>taskToken</code> is generated by the service and
     * should be treated as an opaque value. If the task is passed to another
     * process, its <code>taskToken</code> must also be passed. This enables
     * it to provide its progress and respond with results.</important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return The <code>taskToken</code> from the <a>DecisionTask</a>.
     *         <important><code>taskToken</code> is generated by the service and
     *         should be treated as an opaque value. If the task is passed to another
     *         process, its <code>taskToken</code> must also be passed. This enables
     *         it to provide its progress and respond with results.</important>
     */
    public String getTaskToken() {
        return taskToken;
    }
    
    /**
     * The <code>taskToken</code> from the <a>DecisionTask</a>.
     * <important><code>taskToken</code> is generated by the service and
     * should be treated as an opaque value. If the task is passed to another
     * process, its <code>taskToken</code> must also be passed. This enables
     * it to provide its progress and respond with results.</important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param taskToken The <code>taskToken</code> from the <a>DecisionTask</a>.
     *         <important><code>taskToken</code> is generated by the service and
     *         should be treated as an opaque value. If the task is passed to another
     *         process, its <code>taskToken</code> must also be passed. This enables
     *         it to provide its progress and respond with results.</important>
     */
    public void setTaskToken(String taskToken) {
        this.taskToken = taskToken;
    }
    
    /**
     * The <code>taskToken</code> from the <a>DecisionTask</a>.
     * <important><code>taskToken</code> is generated by the service and
     * should be treated as an opaque value. If the task is passed to another
     * process, its <code>taskToken</code> must also be passed. This enables
     * it to provide its progress and respond with results.</important>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param taskToken The <code>taskToken</code> from the <a>DecisionTask</a>.
     *         <important><code>taskToken</code> is generated by the service and
     *         should be treated as an opaque value. If the task is passed to another
     *         process, its <code>taskToken</code> must also be passed. This enables
     *         it to provide its progress and respond with results.</important>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RespondDecisionTaskCompletedRequest withTaskToken(String taskToken) {
        this.taskToken = taskToken;
        return this;
    }

    /**
     * The list of decisions (possibly empty) made by the decider while
     * processing this decision task. See the docs for the <a>Decision</a>
     * structure for details.
     *
     * @return The list of decisions (possibly empty) made by the decider while
     *         processing this decision task. See the docs for the <a>Decision</a>
     *         structure for details.
     */
    public java.util.List<Decision> getDecisions() {
        return decisions;
    }
    
    /**
     * The list of decisions (possibly empty) made by the decider while
     * processing this decision task. See the docs for the <a>Decision</a>
     * structure for details.
     *
     * @param decisions The list of decisions (possibly empty) made by the decider while
     *         processing this decision task. See the docs for the <a>Decision</a>
     *         structure for details.
     */
    public void setDecisions(java.util.Collection<Decision> decisions) {
        if (decisions == null) {
            this.decisions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Decision> decisionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Decision>(decisions.size());
        decisionsCopy.addAll(decisions);
        this.decisions = decisionsCopy;
    }
    
    /**
     * The list of decisions (possibly empty) made by the decider while
     * processing this decision task. See the docs for the <a>Decision</a>
     * structure for details.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param decisions The list of decisions (possibly empty) made by the decider while
     *         processing this decision task. See the docs for the <a>Decision</a>
     *         structure for details.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RespondDecisionTaskCompletedRequest withDecisions(Decision... decisions) {
        if (getDecisions() == null) setDecisions(new java.util.ArrayList<Decision>(decisions.length));
        for (Decision value : decisions) {
            getDecisions().add(value);
        }
        return this;
    }
    
    /**
     * The list of decisions (possibly empty) made by the decider while
     * processing this decision task. See the docs for the <a>Decision</a>
     * structure for details.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param decisions The list of decisions (possibly empty) made by the decider while
     *         processing this decision task. See the docs for the <a>Decision</a>
     *         structure for details.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RespondDecisionTaskCompletedRequest withDecisions(java.util.Collection<Decision> decisions) {
        if (decisions == null) {
            this.decisions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Decision> decisionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Decision>(decisions.size());
            decisionsCopy.addAll(decisions);
            this.decisions = decisionsCopy;
        }

        return this;
    }

    /**
     * User defined context to add to workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @return User defined context to add to workflow execution.
     */
    public String getExecutionContext() {
        return executionContext;
    }
    
    /**
     * User defined context to add to workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param executionContext User defined context to add to workflow execution.
     */
    public void setExecutionContext(String executionContext) {
        this.executionContext = executionContext;
    }
    
    /**
     * User defined context to add to workflow execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param executionContext User defined context to add to workflow execution.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RespondDecisionTaskCompletedRequest withExecutionContext(String executionContext) {
        this.executionContext = executionContext;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTaskToken() != null) sb.append("TaskToken: " + getTaskToken() + ",");
        if (getDecisions() != null) sb.append("Decisions: " + getDecisions() + ",");
        if (getExecutionContext() != null) sb.append("ExecutionContext: " + getExecutionContext() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTaskToken() == null) ? 0 : getTaskToken().hashCode()); 
        hashCode = prime * hashCode + ((getDecisions() == null) ? 0 : getDecisions().hashCode()); 
        hashCode = prime * hashCode + ((getExecutionContext() == null) ? 0 : getExecutionContext().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RespondDecisionTaskCompletedRequest == false) return false;
        RespondDecisionTaskCompletedRequest other = (RespondDecisionTaskCompletedRequest)obj;
        
        if (other.getTaskToken() == null ^ this.getTaskToken() == null) return false;
        if (other.getTaskToken() != null && other.getTaskToken().equals(this.getTaskToken()) == false) return false; 
        if (other.getDecisions() == null ^ this.getDecisions() == null) return false;
        if (other.getDecisions() != null && other.getDecisions().equals(this.getDecisions()) == false) return false; 
        if (other.getExecutionContext() == null ^ this.getExecutionContext() == null) return false;
        if (other.getExecutionContext() != null && other.getExecutionContext().equals(this.getExecutionContext()) == false) return false; 
        return true;
    }
    
}
    