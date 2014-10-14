/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.cxf.rs.security.jose.jwt;

import java.util.Map;

import org.apache.cxf.jaxrs.provider.json.AbstractJsonMapObject;




public class JwtClaims extends AbstractJsonMapObject {
    
    public JwtClaims() {
    }
    
    public JwtClaims(Map<String, Object> values) {
        super(values);
    }
    
    public void setIssuer(String issuer) {
        setClaim(JwtConstants.CLAIM_ISSUER, issuer);
    }
    
    public String getIssuer() {
        return (String)getValue(JwtConstants.CLAIM_ISSUER);
    }
    
    public void setSubject(String subject) {
        setClaim(JwtConstants.CLAIM_SUBJECT, subject);
    }
    
    public String getSubject() {
        return (String)getClaim(JwtConstants.CLAIM_SUBJECT);
    }
    
    public void setAudience(String audience) {
        setClaim(JwtConstants.CLAIM_AUDIENCE, audience);
    }
    
    public String getAudience() {
        return (String)getClaim(JwtConstants.CLAIM_AUDIENCE);
    }
    
    public void setExpiryTime(Long expiresIn) {
        setClaim(JwtConstants.CLAIM_EXPIRY, expiresIn);
    }
    
    public Long getExpiryTime() {
        return getLongDate(JwtConstants.CLAIM_EXPIRY);
    }
    
    public void setNotBefore(Long notBefore) {
        setClaim(JwtConstants.CLAIM_NOT_BEFORE, notBefore);
    }
    
    public Long getNotBefore() {
        return getLongDate(JwtConstants.CLAIM_NOT_BEFORE);
    }
    
    public void setIssuedAt(Long issuedAt) {
        setClaim(JwtConstants.CLAIM_ISSUED_AT, issuedAt);
    }
    
    public Long getIssuedAt() {
        return getLongDate(JwtConstants.CLAIM_ISSUED_AT);
    }
    
    public void setTokenId(String id) {
        setValue(JwtConstants.CLAIM_JWT_ID, id);
    }
    
    public String getTokenId() {
        return (String)getClaim(JwtConstants.CLAIM_JWT_ID);
    }
    
    public JwtClaims setClaim(String name, Object value) {
        setValue(name, value);
        return this;
    }
    
    public Object getClaim(String name) {
        return getValue(name);
    }
}
