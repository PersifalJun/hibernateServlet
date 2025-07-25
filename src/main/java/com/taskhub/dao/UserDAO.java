package com.taskhub.dao;

import com.taskhub.entity.User;
import org.hibernate.SessionFactory;

public class UserDAO extends AbstractHibernateDAO<User> {

    public UserDAO(SessionFactory sessionFactory) {
        super(User.class, sessionFactory);
    }
}
