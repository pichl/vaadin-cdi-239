package at.ppichl.test.vaadincdi.views;

import com.vaadin.cdi.CDIView;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Label;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.vaadin.viritin.layouts.MVerticalLayout;

import javax.annotation.PostConstruct;

@CDIView
public class OrderView extends MVerticalLayout implements View {

    private static final Logger LOG = LoggerFactory.getLogger(OrderView.class);

    @PostConstruct
    public void onPostConstruct() {
        LOG.info("postConstruct");
        this.add(new Label("Test"));
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        LOG.info("enter");
    }
}
