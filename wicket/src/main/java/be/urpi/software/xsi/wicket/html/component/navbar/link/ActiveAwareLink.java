package be.urpi.software.xsi.wicket.html.component.navbar.link;

import be.urpi.software.xsi.wicket.html.page.AbstractPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

/**
 * Created by daniel on 12/09/16.
 */
public class ActiveAwareLink<T> extends BookmarkablePageLink<T> {
    private final LinkContainer.ClickListener clickListener;

    public <C extends AbstractPage> ActiveAwareLink(Class<C> pageClass, LinkContainer.ClickListener clickListener) {
        super("link", pageClass);
        this.clickListener = clickListener;
    }

    @Override
    public void onRequest() {
        clickListener.onRequest();
        super.onRequest();
    }
}
