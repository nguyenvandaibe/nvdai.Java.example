package nvdai.excercise.ecobike.gui;

import nvdai.excercise.ecobike.bean.SingleBike;
import nvdai.excercise.ecobike.controller.ABikeController;

@SuppressWarnings("serial")
public class SingleBikeFormDialog extends ABikeForm<SingleBike> {

	public SingleBikeFormDialog(SingleBike t, ABikeController<SingleBike> controller) {
		super(t, controller);
	}

	@Override
	public void buildControls() {
		super.buildControls();
		System.out.println("SingleBikeFormDialog buildControls");
	}

	@Override
	public SingleBike getInputs() {
		// get data of new t

		System.out.println("SingleBikeFormDialog getInputs");
		return t;
	}
}
