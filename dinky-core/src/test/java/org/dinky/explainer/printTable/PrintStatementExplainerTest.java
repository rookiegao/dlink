/*
 *
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.dinky.explainer.printTable;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class PrintStatementExplainerTest {

    @Test
    void getTableNames() {
        String sql = "print VersionT";
        PrintStatementExplainer printStatementExplainer = new PrintStatementExplainer(sql);
        assertArrayEquals(new String[] {"VersionT"}, printStatementExplainer.getTableNames());

        sql = "print VersionT, Buyers, r, rr, vvv";
        PrintStatementExplainer wse = new PrintStatementExplainer(sql);

        assertArrayEquals(new String[] {"VersionT", "Buyers", "r", "rr", "vvv"}, wse.getTableNames());
    }
}
