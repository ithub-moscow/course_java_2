package ru.ithub.context;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Using implements InitializingBean, DisposableBean {

    private Used used;

    public Used getUsed() {
        return used;
    }

    public void setUsed(Used used) {
        this.used = used;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialize " + used.getName());
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy");
    }
}
