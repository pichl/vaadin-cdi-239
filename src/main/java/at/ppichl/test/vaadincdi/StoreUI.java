package at.ppichl.test.vaadincdi;

import at.ppichl.test.vaadincdi.views.MainView;
import at.ppichl.test.vaadincdi.views.OrderView;
import com.vaadin.cdi.CDIUI;
import com.vaadin.cdi.CDIViewProvider;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.UI;

import javax.inject.Inject;

@CDIUI("ui")
public class StoreUI extends UI {

    @Inject
    CDIViewProvider cdiViewProvider;

    @Inject
    NavigationService navigationService;

    @Inject
    MainView mainView;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(mainView);
        navigationService.init(this, cdiViewProvider, mainView);
        navigationService.navigateTo(OrderView.class);
    }
}
