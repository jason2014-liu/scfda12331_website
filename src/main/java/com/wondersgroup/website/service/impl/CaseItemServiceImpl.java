/**
* TODO
* @Project: scfda12331_website
* @Title: CaseItemServiceImpl.java
* @Package com.wondersgroup.website.service.impl
* @author jason.liu
* @Date 2014-12-2 上午10:53:44
* @Version v1.0
*/
package com.wondersgroup.website.service.impl;

import org.springframework.stereotype.Service;

import com.wondersgroup.website.bo.CaseItem;
import com.wondersgroup.website.service.ICaseItemService;

/**
 * TODO
 * @ClassName: CaseItemServiceImpl
 * @author jason.liu
 */
@Service(value="caseitemService")
public class CaseItemServiceImpl extends BaseService implements ICaseItemService {

	@Override
	public void addCaseItem(CaseItem caseitem) {
		// TODO Auto-generated method stub
		this.baseDao.persist(caseitem);
	}

	
	
}
