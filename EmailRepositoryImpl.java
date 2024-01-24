package com.xworks.repository;

import com.xworks.dto.EmailEntity;

import javax.persistence.*;

public class EmailRepositoryImpl implements EmailRepository{

    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
    @Override
    public Integer save(EmailEntity email) {

        EntityManager em=this.emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            System.out.println("Begin");
            et.begin();
            System.out.println("persist call");
            em.persist(email);
            System.out.println("Commiting");
            et.commit();
            return email.getId();

        }catch (PersistenceException e){
            System.err.println("PersistenceException in save method of fertilize"+e.getMessage());
            et.rollback();
        }finally {//if we use System.exit then finally wil not exit -kills the jvm
            System.out.println("Closing resources");
            em.close();
        }
        return null;
    }
}

