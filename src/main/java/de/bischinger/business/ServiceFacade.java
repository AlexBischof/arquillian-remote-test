package de.bischinger.business;

import javax.ejb.Stateless;

/**
 * Created by Alexander Bischof on 01.06.15.
 */
@Stateless
public class ServiceFacade {
    public String getHello() {
        return "hello";
    }

    public String getPrint() {
        return "print";
    }
}
