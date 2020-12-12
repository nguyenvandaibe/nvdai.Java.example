package nvdai.excercise.ecobike.controller;

public interface IDataCRUD<T> {
	public void create(T t);
	public void getAll(T t);
	public void getById(T t);
	public void update(T t);
	public void destroy(T t);
}
