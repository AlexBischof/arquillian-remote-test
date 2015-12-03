package de.bischinger.business;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;


@RunWith(Arquillian.class)
public class ServiceFacade_Hello_Test {

    @Inject ServiceFacade serviceFacade;

    @Deployment
    public static WebArchive create() {
        return DefaultDeployment.create().addClass(ServiceFacade.class);
    }

    @Test
    public void test() {
        assertEquals(serviceFacade.getHello(),"hello");
    }
}