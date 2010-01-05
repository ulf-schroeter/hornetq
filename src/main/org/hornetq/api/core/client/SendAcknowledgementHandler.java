/*
 * Copyright 2009 Red Hat, Inc.
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.hornetq.api.core.client;

import org.hornetq.api.core.message.Message;

/**
 * A SendAcknowledgementHandler notifies a client when an message sent asynchronously has been received by the server.
 * <br />
 * If the session is not blocking when sending durable or non-durbale messages, the session can
 * set a SendAcknowledgementHandler to ben notified later when the messages
 * has been received by the server. The method {@code sendAcknowledged} will be called with the message that
 * was sent asynchronously.
 *
 * @author <a href="mailto:tim.fox@jboss.com">Tim Fox</a>
 */
public interface SendAcknowledgementHandler
{
   /**
    * Notifies the client that a message sent asynchronously has been received by the server.
    * 
    * @param message message sent asynchronously
    */
   void sendAcknowledged(Message message);
}