package de.bischinger.business;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;

import java.io.File;

/**
 * Created by Alexander Bischof on 01.06.15.
 */
public class DefaultDeployment {

    public static WebArchive create() {
        return ShrinkWrap.create(WebArchive.class, "mytest.war")
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }
}
