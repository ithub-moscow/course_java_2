package ru.ithub.context;

import org.springframework.beans.factory.InitializingBean;

public class Other implements InitializingBean {

    private Used used;

    public Used getUsed() {
        return used;
    }

    public void setUsed(Used used) {
        this.used = used;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        used.setName("Other" + used.getName());
    }
}
