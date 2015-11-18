package book.com.dao;

import java.util.List;

import javax.transaction.Transactional;

import book.com.domain.BaseDomain;
import book.com.exception.BookStoreAppException;

@Transactional
public interface BaseDao<T extends BaseDomain>{


    T save(T domainObj) throws BookStoreAppException;
    

    void update(T domainObj) throws BookStoreAppException;
    

    void delete(T domainObj) throws BookStoreAppException;
        
    

    void saveOrUpdateAll(List<T> objList) throws BookStoreAppException;
    

    Object findById(Class<T> domainObj, int id) throws BookStoreAppException;
    
 
    List<T> findAll(Class<T> domainClass) throws BookStoreAppException;
    
}
