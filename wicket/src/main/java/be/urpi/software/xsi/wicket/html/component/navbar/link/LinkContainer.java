package be.urpi.software.xsi.wicket.html.component.navbar.link;

import be.urpi.software.xsi.wicket.html.component.navbar.NavbarPanel;
import be.urpi.software.xsi.wicket.html.page.AbstractPage;
import org.apache.wicket.MarkupContainer;
import org.apache.wicket.behavior.AttributeAppender;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.ResourceModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by daniel on 12/09/16.
 */
public class LinkContainer<C extends AbstractPage> extends MarkupContainer {
    private static Logger log = LoggerFactory.getLogger(LinkContainer.class);
    private final AttributeAppender attributeAppender = new AttributeAppender("class", Model.of("active"), " ");
    private final NavbarPanel navbarPanel;

    public LinkContainer(String id, String labelKey, String icon, Class<C> page, NavbarPanel navbarPanel) {
        super(id);
        this.navbarPanel = navbarPanel;
        ActiveAwareLink<Void> link = new ActiveAwareLink<>(page, new ClickListener());
        link.add(new Label("label", new ResourceModel(labelKey)));
        link.add(new IconContainer(icon));
        add(link);
    }

    public void setActive() {
        add(attributeAppender);
    }

    public void removeActive() {
        remove(attributeAppender);
    }

    public static class IconContainer extends MarkupContainer {
        public IconContainer(String id) {
            super("icon");
            add(new AttributeAppender("class", Model.of("glyphicon"), " "));
            add(new AttributeAppender("class", Model.of(id), " "));
        }
    }

    public class ClickListener {

        public void onRequest() {
            log.info("Hier?");
            LinkContainer.this.navbarPanel.getLinks().forEach(LinkContainer::removeActive);
            LinkContainer.this.setActive();
        }
    }
}
