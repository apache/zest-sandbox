package org.qi4j.entity.s3;

import org.qi4j.entity.EntityComposite;
import org.qi4j.entity.Queryable;
import org.qi4j.property.Property;

/**
 * Configuration for the Amazon S3 EntityStore
 */
@Queryable( false )
public interface S3Configuration
    extends EntityComposite
{
    Property<String> accessKey();

    Property<String> secretKey();
}
