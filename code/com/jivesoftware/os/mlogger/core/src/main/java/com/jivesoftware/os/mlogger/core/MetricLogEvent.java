/*
 * Copyright 2013 Jive Software, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.jivesoftware.os.mlogger.core;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.impl.Log4jLogEvent;
import org.apache.logging.log4j.message.StringFormattedMessage;

public class MetricLogEvent extends Log4jLogEvent {

    private final String[] tags;

    public MetricLogEvent(String fqnOfCategoryClass,
        Level level,
        String[] tags,
        String message,
        Throwable throwable) {
        super(fqnOfCategoryClass, null, fqnOfCategoryClass, level, new StringFormattedMessage(message), throwable);
        this.tags = tags;
    }

    public String[] getTags() {
        return tags;
    }
}