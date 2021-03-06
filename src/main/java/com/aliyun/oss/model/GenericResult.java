/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.aliyun.oss.model;

/**
 * A generic result that contains some basic response options, such as requestId.
 */
public abstract class GenericResult {
   
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
    
    public Long getClientCRC64() {
        return clientCRC64;
    }

    public void setClientCRC64(Long clientCRC64) {
        this.clientCRC64 = clientCRC64;
    }

    public Long getServerCRC64() {
        return serverCRC64;
    }

    public void setServerCRC64(Long serverCRC64) {
        this.serverCRC64 = serverCRC64;
    }
    
    private String requestId;
    private Long clientCRC64;
    private Long serverCRC64;
}
