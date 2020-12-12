package nvdai.excercise.ecobike.gui;

import nvdai.excercise.ecobike.bean.ElectrictBike;
import nvdai.excercise.ecobike.controller.ABikeController;

@SuppressWarnings("serial")
public class ElectrictBikeFormDialog extends ABikeForm<ElectrictBike> {

	public ElectrictBikeFormDialog(ElectrictBike t, ABikeController<ElectrictBike> controller) {
		 super(t, controller);
	}
	
	@Override
	public void buildControls() {
		super.buildControls();
		System.out.println("ElectrictBikeFormDialog buildControls");
	}

	@Override
	public ElectrictBike getInputs() {
		// get data of new t

		System.out.println("ElectrictBikeFormDialog getInputs");
		return t;
	}

}
