package dao;
import java.util.ArrayList;
public interface DAOinterface<T> {
	
	public int Insert(T t);
	
	public int Update(T t);
	
	public int Delete(T t);
//	
	public ArrayList<T> selectAll();
	
	public T selectById(T t);
	
	public ArrayList<T> selectByCondition(String condition);


	 
}
