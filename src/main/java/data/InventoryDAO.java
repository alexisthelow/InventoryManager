package data;

import java.util.List;

public interface InventoryDAO {
	
	//create equipment
	
	Equipment addEquipmentToInventory(Equipment e);
	
	
	//read equipment
	
	List<Equipment> getAllItems();
	List<Equipment> getEquipmentByUser(User u);	
	
	
	//update equipment
	
	Boolean userRequestEquipment(User u, Equipment e);
	Boolean renewUserLendingPeriod(User u, Equipment e);
	Boolean addUserToEquipmentWaitingList(User u, Equipment e);
	Equipment updateEquipmentInInventory(Equipment e);
	Equipment lendEquipmentToUser(User u, Equipment e);				//should update user record, equipment record, transaction record
	
	
	//delete equipment
	
	Boolean deleteEquipment(Equipment e);
	
	
	//create user

	User addUser(User u);
	
	
	//read user
	
	List<User> getAllUsers();
	List<Equipment> getPastItemsLentToUser(User u);			
	List<Equipment> getCurrentItemsLentToUser(User u);
	
	
	//update user
	
	User updateUserInfo(User u);
	Boolean promoteUserToAdmin(User u);
	Boolean demoteAdminToUser(User u);
	
	
	//delete user

	Boolean deleteUser(User u);
	
	
	//create supply
	
	Supply addSupply(Supply s);
	
	
	//read supply
	
	List<Supply> getAllSupplies();
	List<Supply> getSuppliesByUser(User u);
	
	
	//update supply
	
	Supply provideSupplyToUser(User u, Supply s);
	Supply updateSupplyRecord(Supply s);
	
	
	//delete supply
	
	Boolean updateSupply(Supply s);
	
	
	
	/**
	 * have picture of object
	 * look what each user has checked out
	 * get objects by times used
	 * get objects by address
	 * rent equipment and assign to user
	 * decrement supply and give to user
	 * renew rental if no one is waiting
	 * waiting list for item
	 * add inventory
	 * user request item--remove item from available inventory, alert admin to prepare item for check out
	 * 
	 */
	
}
