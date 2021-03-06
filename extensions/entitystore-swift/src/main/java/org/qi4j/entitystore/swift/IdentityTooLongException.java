/*
 * Copyright 2008 Niclas Hedhman.
 *
 * Licensed  under the  Apache License,  Version 2.0  (the "License");
 * you may not use  this file  except in  compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed  under the  License is distributed on an "AS IS" BASIS,
 * WITHOUT  WARRANTIES OR CONDITIONS  OF ANY KIND, either  express  or
 * implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.qi4j.entitystore.swift;

import org.qi4j.api.entity.EntityReference;
import org.qi4j.spi.entitystore.EntityStoreException;

public class IdentityTooLongException extends EntityStoreException
{
    public IdentityTooLongException( EntityReference identity )
    {
        super( "The identity is too long for the configured store: " + identity.toString().length() + ", " + identity );

    }
}
