package at.ppichl.test.vaadincdi;

import com.vaadin.cdi.UIScoped;
import com.vaadin.cdi.internal.Conventions;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.navigator.ViewProvider;
import com.vaadin.ui.UI;

@UIScoped
public class NavigationService extends Navigator  {

    public void init(UI ui, ViewProvider viewProvider, ViewDisplay display) {
        init(ui, new UriFragmentManager(ui.getPage()),display);
        addProvider(viewProvider);
    }

    public void navigateTo(Class<? extends View> targetView) {
        String viewId = getViewId(targetView);
        navigateTo(viewId);
    }

    public String getViewId(Class<? extends View> viewClass) {
        return Conventions.deriveMappingForView(viewClass);
    }

}
