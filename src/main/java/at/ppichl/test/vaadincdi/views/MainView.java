package at.ppichl.test.vaadincdi.views;

import com.vaadin.cdi.UIScoped;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

@UIScoped
public class MainView extends VerticalLayout implements ViewDisplay {

    private static final Logger LOG = LoggerFactory.getLogger(MainView.class);

    private Panel panel = new Panel();

    @PostConstruct
    public void onPostConstruct() {
        LOG.info("postConstruct");
        this.addComponents(panel);
    }

    @Override
    public void showView(View view) {
        LOG.info("showView");
        panel.setContent(view.getViewComponent());
    }


}
