package be.urpi.software.xsi.wicket.html.component.navbar;

import be.urpi.software.xsi.wicket.html.component.navbar.link.HomeLink;
import be.urpi.software.xsi.wicket.html.component.navbar.link.LinkContainer;
import be.urpi.software.xsi.wicket.html.page.AbstractPage;
import be.urpi.software.xsi.wicket.html.page.request.RequestPage;
import org.apache.wicket.markup.html.panel.Panel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel on 12/09/16.
 */
public class NavbarPanel extends Panel {
    private final List<LinkContainer> links = new ArrayList<>();

    public NavbarPanel() {
        super("navbar");
        add(new HomeLink());
        addLinkContainer("requestLink", "link.request.label", "glyphicon-arrow-down", RequestPage.class);
        addLinkContainer("otherLink", "link.other.label", "glyphicon-resize-full", RequestPage.class);
    }

    private <C extends AbstractPage> void addLinkContainer(String id, String label, String icon, Class<C> page) {
        LinkContainer requestLink = new LinkContainer(id, label, icon, page, this);
        links.add(requestLink);
        add(requestLink);
    }

    public List<LinkContainer> getLinks() {
        return links;
    }
}
