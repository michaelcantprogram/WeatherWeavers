package use_case.set_city;

import use_case.set_city.SetCityInputBoundary;

public class SetCityInteractor implements SetCityInputBoundary{

    private SetCityOutputBoundary setCityPresenter;
    private SetCityDataAccessInterface setCityDataAccessObject;

    public SetCityInteractor(SetCityOutputBoundary setCityPresenter, SetCityDataAccessInterface setCityDataAccessObject) {
        this.setCityPresenter = setCityPresenter;
        this.setCityDataAccessObject = setCityDataAccessObject;
    }

    public void execute(SetCityInputBoundary setCityInputData){

    }
}
