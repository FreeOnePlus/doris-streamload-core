// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
package com.doris.streamload.demo.conf;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Repository;

/**
 * This Config Bean should have all Doris Params.
 */
@Getter
@Setter
@Repository
@AllArgsConstructor
@NoArgsConstructor
public class DorisConfig {
    private String host = "139.9.207.36"; // Host
    private int httpPort = 59371; // HTTP Port
    private String database = "demo"; // Database
    private String table = "app_log"; // Table
    private String username = "admin"; // Doris Username
    private String password = "Syj123456"; // Doris Password
}
