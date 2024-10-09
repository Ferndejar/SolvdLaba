package com.solvd;

import com.solvd.dao.jdbc.CarDao;
import com.solvd.dao.jdbc.ContactInfoDao;
import com.solvd.dao.jdbc.TeacherDao;
import com.solvd.model.ContactInfo;

public class OwnThread extends Thread{

    @Override
    public void run() {
        CarDao carDao = new CarDao();
        carDao.getEntities();

        TeacherDao teacherDao = new TeacherDao();
        teacherDao.getEntities();
        teacherDao.getEntityById(2);
        ContactInfo contactInfo = new ContactInfo("New York","Wall street",212312456,"example@email.com");

        ContactInfoDao contactInfoDao = new ContactInfoDao();
        contactInfoDao.getEntities();
        contactInfoDao.getEntityById(1);
        contactInfoDao.insert(contactInfo);
        contactInfoDao.update(1,contactInfo);
        contactInfoDao.delete(1);


    }
}
