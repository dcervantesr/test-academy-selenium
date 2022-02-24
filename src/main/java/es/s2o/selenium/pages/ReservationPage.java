package es.s2o.selenium.pages;

import es.s2o.selenium.domain.ReservationDTO;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

/**
 * Created by sacrists on 26.02.17.
 */

public class ReservationPage extends PageObjectBase {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    private WebElementFacade ensCloseBanner;

    private WebElementFacade originInput;
    private WebElementFacade destinationInput;
    private WebElementFacade outboundDate;
    private WebElementFacade oneWay;
    private WebElementFacade btnSubmitHomeSearcher;

    public void closeCookies() {
        ensCloseBanner.click();
    }

    public void registerReservation(ReservationDTO reservation) {
        LOGGER.debug("registerReservation starts, reservation: [{}]", reservation);
        typeInto(originInput, reservation.getOrigin());
        btnSubmitHomeSearcher.click();
    }

    private String getHiddenValue(){
        return getDocument().getElementById("hiddenField").attr("value");
    }
}
