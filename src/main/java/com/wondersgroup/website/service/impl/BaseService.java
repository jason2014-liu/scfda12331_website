/**
* TODO
* @Project: scfda12331_website
* @Title: BaseService.java
* @Package com.wondersgroup.website.service.impl
* @author jason.liu
* @Date 2014-12-2 上午10:58:44
* @Version v1.0
*/
package com.wondersgroup.website.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wondersgroup.website.dao.IBaseDao;

/**
 * TODO
 * @ClassName: BaseService
 * @author jason.liu
 */
@Service(value="baseService")
public class BaseService {

	@Autowired
	protected IBaseDao baseDao;
	
}
