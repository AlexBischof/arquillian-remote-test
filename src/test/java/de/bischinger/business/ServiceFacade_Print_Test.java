package de.bischinger.business;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Arquillian.class)
public class ServiceFacade_Print_Test {

    @Inject ServiceFacade serviceFacade;

    @Deployment
    public static WebArchive create() {
        return DefaultDeployment.create().addClass(ServiceFacade.class);
    }

    @Test
    public void test2() {
        //Does not start already started server again
        assertThat(serviceFacade.getPrint()).isEqualTo("print");
    }
}