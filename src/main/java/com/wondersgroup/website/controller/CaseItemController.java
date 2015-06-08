/**
* TODO
* @Project: scfda12331_website
* @Title: CaseItemController.java
* @Package com.wondersgroup.website.controller
* @author jason.liu
* @Date 2014-12-1 下午4:03:21
* @Version v1.0
*/
package com.wondersgroup.website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wondersgroup.website.bo.CaseItem;
import com.wondersgroup.website.service.ICaseItemService;

/**
 * TODO
 * @ClassName: CaseItemController
 * @author jason.liu
 */
@Controller
@RequestMapping(value="/caseitem")
public class CaseItemController {

	@Autowired
	private ICaseItemService caseitemService;
	
	@RequestMapping(value="/addCaseItem")
	public String addCaseItem(){
		
		CaseItem caseitem = new CaseItem();
		this.caseitemService.addCaseItem(caseitem);
		return "";
	}

}
