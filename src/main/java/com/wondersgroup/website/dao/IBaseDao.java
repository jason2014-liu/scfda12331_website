/**
* TODO
* @Project: scfda12331_website
* @Title: IBaseDao.java
* @Package com.wondersgroup.website.dao
* @author jason.liu
* @Date 2014-12-2 上午10:55:49
* @Version v1.0
*/
package com.wondersgroup.website.dao;

import com.wondersgroup.website.bo.BaseBo;

/**
 * TODO
 * @ClassName: IBaseDao
 * @author jason.liu
 */
public interface IBaseDao {

	
	public <T extends BaseBo> void  persist(T obj);
}
