package MementoKirsh;

import java.util.ArrayList;

public class Cart {
	
	ArrayList<Item> items = new ArrayList<>();
	
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	
	public ArrayList<Item> getItems() {
		return (ArrayList) items.clone();
	}
	
	
	
	static class CartMemento{
		
		ArrayList<Item> items;

		
		public CartMemento(ArrayList<Item> items) {
			this.items = items;
		}
		
		
		private ArrayList<Item> getItems() {
			return items;
		}


		@Override
		public String toString() {
			return "CartMemento [items=" + items + "]";
		}	
		
		
	}
	
	
	
	public CartMemento save() {
		return new CartMemento(getItems());
	}
	
	
	
	public void revert(CartMemento cartMemento) {
		System.out.println("Cart eke revert ekee" + cartMemento.getItems());
		items = cartMemento.getItems();
	}                                                                                                        

	@Override
	public String toString() {
		return "Cart [items=" + items + "]";
	}
	
	
	
}
