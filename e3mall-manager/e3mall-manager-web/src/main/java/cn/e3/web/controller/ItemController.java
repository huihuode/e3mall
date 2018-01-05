package cn.e3.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3.manager.service.ItemService;
import cn.e3.pojo.TbItem;

@Controller
@RequestMapping("/tbitem")
public class ItemController {

	@Autowired
	private ItemService itemServie;
	
	@RequestMapping("/tbItem/{id}")
	@ResponseBody
	public TbItem findTbItemById(@PathVariable Long id) throws Exception{
		TbItem item = itemServie.findTbItemById(id);
		return item;
	}
}
