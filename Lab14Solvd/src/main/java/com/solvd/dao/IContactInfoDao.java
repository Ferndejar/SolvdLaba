package com.solvd.dao;

import com.solvd.model.Car;
import com.solvd.model.ContactInfo;

import java.util.List;

public interface IContactInfoDao extends IBaseDao<ContactInfo>{

    @Override
    ContactInfo getEntityById(int index);

    @Override
    List<ContactInfo> getEntities();

    @Override
    void insert(ContactInfo contactInfo);

    @Override
    void delete(int index);

    @Override
    void update(int index, ContactInfo contactInfo);
}
