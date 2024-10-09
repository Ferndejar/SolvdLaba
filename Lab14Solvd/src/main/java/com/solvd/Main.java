package com.solvd;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.solvd.dao.jdbc.ContactInfoDao;
import com.solvd.model.ContactInfo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(MysqlxDatatypes.Scalar.String[] args) {
        ContactInfoDao contactInfoDao = new ContactInfoDao();

        ContactInfo contactInfo = new ContactInfo("New York","Wall street",212312456,"example@email.com");
        contactInfoDao.getEntities();
        contactInfoDao.getEntityById(1);
        contactInfoDao.insert(contactInfo);
        contactInfoDao.update(1,contactInfo);
        contactInfoDao.delete(1);

        OwnThread ownThread = new OwnThread();
        ExecutorService executorService = Executors.newFixedThreadPool(7);
        for  (int i = 0; i<7; i++) {
            executorService.execute(ownThread);
        }
    }
}
