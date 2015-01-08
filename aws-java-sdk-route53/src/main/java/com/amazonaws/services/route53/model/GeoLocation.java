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
package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains information about a geo location.
 * </p>
 */
public class GeoLocation implements Serializable {

    /**
     * The code for a continent geo location. Note: only continent locations
     * have a continent code. <p>Valid values: <code>AF</code> |
     * <code>AN</code> | <code>AS</code> | <code>EU</code> | <code>OC</code>
     * | <code>NA</code> | <code>SA</code> <p>Constraint: Specifying
     * <code>ContinentCode</code> with either <code>CountryCode</code> or
     * <code>SubdivisionCode</code> returns an <a>InvalidInput</a> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     */
    private String continentCode;

    /**
     * The code for a country geo location. The default location uses '*' for
     * the country code and will match all locations that are not matched by
     * a geo location. <p>The default geo location uses a <code>*</code> for
     * the country code. All other country codes follow the ISO 3166
     * two-character code.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     */
    private String countryCode;

    /**
     * The code for a country's subdivision (e.g., a province of Canada). A
     * subdivision code is only valid with the appropriate country code.
     * <p>Constraint: Specifying <code>SubdivisionCode</code> without
     * <code>CountryCode</code> returns an <a>InvalidInput</a> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     */
    private String subdivisionCode;

    /**
     * The code for a continent geo location. Note: only continent locations
     * have a continent code. <p>Valid values: <code>AF</code> |
     * <code>AN</code> | <code>AS</code> | <code>EU</code> | <code>OC</code>
     * | <code>NA</code> | <code>SA</code> <p>Constraint: Specifying
     * <code>ContinentCode</code> with either <code>CountryCode</code> or
     * <code>SubdivisionCode</code> returns an <a>InvalidInput</a> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     *
     * @return The code for a continent geo location. Note: only continent locations
     *         have a continent code. <p>Valid values: <code>AF</code> |
     *         <code>AN</code> | <code>AS</code> | <code>EU</code> | <code>OC</code>
     *         | <code>NA</code> | <code>SA</code> <p>Constraint: Specifying
     *         <code>ContinentCode</code> with either <code>CountryCode</code> or
     *         <code>SubdivisionCode</code> returns an <a>InvalidInput</a> error.
     */
    public String getContinentCode() {
        return continentCode;
    }
    
    /**
     * The code for a continent geo location. Note: only continent locations
     * have a continent code. <p>Valid values: <code>AF</code> |
     * <code>AN</code> | <code>AS</code> | <code>EU</code> | <code>OC</code>
     * | <code>NA</code> | <code>SA</code> <p>Constraint: Specifying
     * <code>ContinentCode</code> with either <code>CountryCode</code> or
     * <code>SubdivisionCode</code> returns an <a>InvalidInput</a> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     *
     * @param continentCode The code for a continent geo location. Note: only continent locations
     *         have a continent code. <p>Valid values: <code>AF</code> |
     *         <code>AN</code> | <code>AS</code> | <code>EU</code> | <code>OC</code>
     *         | <code>NA</code> | <code>SA</code> <p>Constraint: Specifying
     *         <code>ContinentCode</code> with either <code>CountryCode</code> or
     *         <code>SubdivisionCode</code> returns an <a>InvalidInput</a> error.
     */
    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode;
    }
    
    /**
     * The code for a continent geo location. Note: only continent locations
     * have a continent code. <p>Valid values: <code>AF</code> |
     * <code>AN</code> | <code>AS</code> | <code>EU</code> | <code>OC</code>
     * | <code>NA</code> | <code>SA</code> <p>Constraint: Specifying
     * <code>ContinentCode</code> with either <code>CountryCode</code> or
     * <code>SubdivisionCode</code> returns an <a>InvalidInput</a> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     *
     * @param continentCode The code for a continent geo location. Note: only continent locations
     *         have a continent code. <p>Valid values: <code>AF</code> |
     *         <code>AN</code> | <code>AS</code> | <code>EU</code> | <code>OC</code>
     *         | <code>NA</code> | <code>SA</code> <p>Constraint: Specifying
     *         <code>ContinentCode</code> with either <code>CountryCode</code> or
     *         <code>SubdivisionCode</code> returns an <a>InvalidInput</a> error.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GeoLocation withContinentCode(String continentCode) {
        this.continentCode = continentCode;
        return this;
    }

    /**
     * The code for a country geo location. The default location uses '*' for
     * the country code and will match all locations that are not matched by
     * a geo location. <p>The default geo location uses a <code>*</code> for
     * the country code. All other country codes follow the ISO 3166
     * two-character code.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @return The code for a country geo location. The default location uses '*' for
     *         the country code and will match all locations that are not matched by
     *         a geo location. <p>The default geo location uses a <code>*</code> for
     *         the country code. All other country codes follow the ISO 3166
     *         two-character code.
     */
    public String getCountryCode() {
        return countryCode;
    }
    
    /**
     * The code for a country geo location. The default location uses '*' for
     * the country code and will match all locations that are not matched by
     * a geo location. <p>The default geo location uses a <code>*</code> for
     * the country code. All other country codes follow the ISO 3166
     * two-character code.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param countryCode The code for a country geo location. The default location uses '*' for
     *         the country code and will match all locations that are not matched by
     *         a geo location. <p>The default geo location uses a <code>*</code> for
     *         the country code. All other country codes follow the ISO 3166
     *         two-character code.
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    
    /**
     * The code for a country geo location. The default location uses '*' for
     * the country code and will match all locations that are not matched by
     * a geo location. <p>The default geo location uses a <code>*</code> for
     * the country code. All other country codes follow the ISO 3166
     * two-character code.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param countryCode The code for a country geo location. The default location uses '*' for
     *         the country code and will match all locations that are not matched by
     *         a geo location. <p>The default geo location uses a <code>*</code> for
     *         the country code. All other country codes follow the ISO 3166
     *         two-character code.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GeoLocation withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * The code for a country's subdivision (e.g., a province of Canada). A
     * subdivision code is only valid with the appropriate country code.
     * <p>Constraint: Specifying <code>SubdivisionCode</code> without
     * <code>CountryCode</code> returns an <a>InvalidInput</a> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     *
     * @return The code for a country's subdivision (e.g., a province of Canada). A
     *         subdivision code is only valid with the appropriate country code.
     *         <p>Constraint: Specifying <code>SubdivisionCode</code> without
     *         <code>CountryCode</code> returns an <a>InvalidInput</a> error.
     */
    public String getSubdivisionCode() {
        return subdivisionCode;
    }
    
    /**
     * The code for a country's subdivision (e.g., a province of Canada). A
     * subdivision code is only valid with the appropriate country code.
     * <p>Constraint: Specifying <code>SubdivisionCode</code> without
     * <code>CountryCode</code> returns an <a>InvalidInput</a> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     *
     * @param subdivisionCode The code for a country's subdivision (e.g., a province of Canada). A
     *         subdivision code is only valid with the appropriate country code.
     *         <p>Constraint: Specifying <code>SubdivisionCode</code> without
     *         <code>CountryCode</code> returns an <a>InvalidInput</a> error.
     */
    public void setSubdivisionCode(String subdivisionCode) {
        this.subdivisionCode = subdivisionCode;
    }
    
    /**
     * The code for a country's subdivision (e.g., a province of Canada). A
     * subdivision code is only valid with the appropriate country code.
     * <p>Constraint: Specifying <code>SubdivisionCode</code> without
     * <code>CountryCode</code> returns an <a>InvalidInput</a> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     *
     * @param subdivisionCode The code for a country's subdivision (e.g., a province of Canada). A
     *         subdivision code is only valid with the appropriate country code.
     *         <p>Constraint: Specifying <code>SubdivisionCode</code> without
     *         <code>CountryCode</code> returns an <a>InvalidInput</a> error.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GeoLocation withSubdivisionCode(String subdivisionCode) {
        this.subdivisionCode = subdivisionCode;
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
        if (getContinentCode() != null) sb.append("ContinentCode: " + getContinentCode() + ",");
        if (getCountryCode() != null) sb.append("CountryCode: " + getCountryCode() + ",");
        if (getSubdivisionCode() != null) sb.append("SubdivisionCode: " + getSubdivisionCode() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getContinentCode() == null) ? 0 : getContinentCode().hashCode()); 
        hashCode = prime * hashCode + ((getCountryCode() == null) ? 0 : getCountryCode().hashCode()); 
        hashCode = prime * hashCode + ((getSubdivisionCode() == null) ? 0 : getSubdivisionCode().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GeoLocation == false) return false;
        GeoLocation other = (GeoLocation)obj;
        
        if (other.getContinentCode() == null ^ this.getContinentCode() == null) return false;
        if (other.getContinentCode() != null && other.getContinentCode().equals(this.getContinentCode()) == false) return false; 
        if (other.getCountryCode() == null ^ this.getCountryCode() == null) return false;
        if (other.getCountryCode() != null && other.getCountryCode().equals(this.getCountryCode()) == false) return false; 
        if (other.getSubdivisionCode() == null ^ this.getSubdivisionCode() == null) return false;
        if (other.getSubdivisionCode() != null && other.getSubdivisionCode().equals(this.getSubdivisionCode()) == false) return false; 
        return true;
    }
    
}
    