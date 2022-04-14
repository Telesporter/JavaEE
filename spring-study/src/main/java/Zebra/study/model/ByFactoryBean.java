package Zebra.study.model;

import org.springframework.beans.factory.FactoryBean;

//@Component
public class ByFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        User u = new User();
        u.setUsername("女王陛下");
        u.setPassword("御弟哥哥");
        return u;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
