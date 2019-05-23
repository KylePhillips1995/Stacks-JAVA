
import java.util.*;

public class StackMU<Type> {

	private ArrayList<Type> list;
	
	list = new ArrayList<Type>();
	
	public Type Push(Type Obj) {
		
		if(list.add(Obj))
			
			return Obj;
		
		else
			return null;
		
	}
	
	public Type Pop() {
		
		return list.remove(list.size() - 1);
		
		
	}
	
	public Type peek() {
		
		return list.get(list.size() -1);
		
	}
	
	public boolean isEmpty() {
		
	if(list.size() == 0) {
		
		return true;
	}
	
	else {
		
		return false;
	}
		
	}
	}
