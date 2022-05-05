package com.qa.ims.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;

//Takes in Item details for CRUD functionality


public class ItemController implements CrudController<Item> {
	
	public static final Logger LOGGER = LogManager.getLogger();
			private ItemDAO itemDAO;
	        private Utils utils;
	        
	 public ItemController(ItemDAO itemDAO, Utils utils) {
		 super();
		 this.setItemDAO(itemDAO);
		 this.setUtils(utils);
	 }

	@Override
	public List<Item> readAll() {
			List<Item> items = itemDAO.readAll();
			for (Item item : items) {
				LOGGER.info(item);
			}
			return items;

	}

	@Override
	public Item create() {
			LOGGER.info("Please enter a item name");
			String itemName = utils.getString();
			LOGGER.info("Please enter a item price");
			String itemPrice = utils.getString();
		    Item item = itemDAO.create(new Item( itemName, itemPrice));
			LOGGER.info("Customer created");
			return item;
		}

	

	@Override
	public Item update() {
		LOGGER.info("Please enter the id of the item you would like to update");
		Long id = utils.getLong();
		LOGGER.info("Please enter a item name");
		String itemName = utils.getString();
		LOGGER.info("Please enter a item price");
		String itemPrice = utils.getString();
		Item item = itemDAO.update(new Item(id, itemName, itemPrice));
		LOGGER.info("Item Updated");
		return item;
		
	}

	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the item you would like to delete");
		Long id = utils.getLong();
		return itemDAO.delete(id);
		
	}

	public ItemDAO getItemDAO() {
		return itemDAO;
	}

	public void setItemDAO(ItemDAO itemDAO) {
		this.itemDAO = itemDAO;
	}

	public Utils getUtils() {
		return utils;
	}

	public void setUtils(Utils utils) {
		this.utils = utils;
	}
	 
	 
	        
	
	
	
	
	

}
