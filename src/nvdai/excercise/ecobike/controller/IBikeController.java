package nvdai.excercise.ecobike.controller;

public interface IBikeController<T> {
	public void create();
	public void getAll();
	public void getById();
	public void update();
	public void destroy();
}
