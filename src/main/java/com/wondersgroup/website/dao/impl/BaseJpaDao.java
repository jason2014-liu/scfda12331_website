/**
 * TODO
 * @Project: scfda12331_website
 * @Title: BaseJpaDao.java
 * @Package com.wondersgroup.website.dao
 * @author jason.liu
 * @Date 2014-12-1 下午3:42:31
 * @Version v1.0
 */
package com.wondersgroup.website.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wondersgroup.website.bo.BaseBo;
import com.wondersgroup.website.dao.IBaseDao;

/**
 * TODO
 * 
 * @ClassName: BaseJpaDao
 * @author jason.liu
 */
@Repository(value = "baseDao")
public class BaseJpaDao implements IBaseDao{

	@PersistenceContext
	private EntityManager entityManager;

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public void persist(Object obj){
		this.entityManager.persist(obj);
	}

	@Override
	public <T extends BaseBo> void persist(T obj) {
		// TODO Auto-generated method stub
		this.entityManager.persist(obj);
		
	}

}
