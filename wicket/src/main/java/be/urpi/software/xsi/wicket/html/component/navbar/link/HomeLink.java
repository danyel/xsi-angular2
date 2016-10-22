package be.urpi.software.xsi.wicket.html.component.navbar.link;

import be.urpi.software.xsi.wicket.XsiApplication;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

/**
 * Created by daniel on 12/09/16.
 */
public class HomeLink extends BookmarkablePageLink<Void> {
    public HomeLink() {
        super("homePage", XsiApplication.get().getHomePage());
    }
}
