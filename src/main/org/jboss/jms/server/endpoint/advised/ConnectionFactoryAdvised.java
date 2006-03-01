/*
  * JBoss, Home of Professional Open Source
  * Copyright 2005, JBoss Inc., and individual contributors as indicated
  * by the @authors tag. See the copyright.txt in the distribution for a
  * full listing of individual contributors.
  *
  * This is free software; you can redistribute it and/or modify it
  * under the terms of the GNU Lesser General Public License as
  * published by the Free Software Foundation; either version 2.1 of
  * the License, or (at your option) any later version.
  *
  * This software is distributed in the hope that it will be useful,
  * but WITHOUT ANY WARRANTY; without even the implied warranty of
  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
  * Lesser General Public License for more details.
  *
  * You should have received a copy of the GNU Lesser General Public
  * License along with this software; if not, write to the Free
  * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
  * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
  */
package org.jboss.jms.server.endpoint.advised;

import javax.jms.JMSException;

import org.jboss.jms.delegate.ConnectionDelegate;
import org.jboss.jms.server.endpoint.ConnectionFactoryEndpoint;

/**
 * ConnectionFactoryAdvised.java,v 1.3 2006/03/01 22:56:51 ovidiu Exp
 */
public class ConnectionFactoryAdvised extends AdvisedSupport implements ConnectionFactoryEndpoint
{
   protected ConnectionFactoryEndpoint endpoint;
   
   public ConnectionFactoryAdvised()
   {      
   }
   
   public ConnectionFactoryAdvised(ConnectionFactoryEndpoint endpoint)
   {
      this.endpoint = endpoint;
   }
   
   public Object getEndpoint()
   {
      return endpoint;
   }

   public ConnectionDelegate createConnectionDelegate(String username, String password)
      throws JMSException
   {
      return endpoint.createConnectionDelegate(username, password);
   }

   public byte[] getClientAOPConfig()
   {
      return endpoint.getClientAOPConfig();
   }
   
   public String toString()
   {
      return "ConnectionFactoryAdvised->" + endpoint;
   }

}
