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

package org.hornetq.api.jms.config;

import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;


/**
 * A JMSConfigurationImpl
 *
 * @author <a href="mailto:jmesnil@redhat.com">Jeff Mesnil</a>
 *
 *
 */
public class JMSConfigurationImpl implements JMSConfiguration
{

   private final List<ConnectionFactoryConfiguration> connectionFactoryConfigurations = new ArrayList<ConnectionFactoryConfiguration>();

   private final List<QueueConfiguration> queueConfigurations = new ArrayList<QueueConfiguration>();

   private final List<TopicConfiguration> topicConfigurations = new ArrayList<TopicConfiguration>();

   private Context context = null;

   // Constants -----------------------------------------------------

   // Attributes ----------------------------------------------------

   // Static --------------------------------------------------------

   // Constructors --------------------------------------------------

   public JMSConfigurationImpl()
   {
   }

   public JMSConfigurationImpl(final List<ConnectionFactoryConfiguration> connectionFactoryConfigurations,
                               final List<QueueConfiguration> queueConfigurations,
                               final List<TopicConfiguration> topicConfigurations)
   {
      this.connectionFactoryConfigurations.addAll(connectionFactoryConfigurations);
      this.queueConfigurations.addAll(queueConfigurations);
      this.topicConfigurations.addAll(topicConfigurations);
   }

   // JMSConfiguration implementation -------------------------------

   public List<ConnectionFactoryConfiguration> getConnectionFactoryConfigurations()
   {
      return connectionFactoryConfigurations;
   }

   public List<QueueConfiguration> getQueueConfigurations()
   {
      return queueConfigurations;
   }

   public List<TopicConfiguration> getTopicConfigurations()
   {
      return topicConfigurations;
   }

   public Context getContext()
   {
      return context;
   }

   public void setContext(final Context context)
   {
      this.context = context;
   }

   // Public --------------------------------------------------------

   // Package protected ---------------------------------------------

   // Protected -----------------------------------------------------

   // Private -------------------------------------------------------

   // Inner classes -------------------------------------------------

}