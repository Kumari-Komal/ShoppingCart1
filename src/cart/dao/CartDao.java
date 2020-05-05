package cart.dao;

import java.sql.SQLException;
import java.util.List;

import cart.model.Cart;

public interface CartDao {

	void insertTodo(Cart todo) throws SQLException;

	Cart selectTodo(long todoId);

	List<Cart> selectAllTodos();

	boolean deleteTodo(int id) throws SQLException;

	boolean updateTodo(Cart todo) throws SQLException;

}