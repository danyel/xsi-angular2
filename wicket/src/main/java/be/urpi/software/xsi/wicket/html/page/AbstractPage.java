package be.urpi.software.xsi.wicket.html.page;

import be.urpi.software.xsi.wicket.html.component.navbar.NavbarPanel;
import de.agilecoders.wicket.webjars.request.resource.WebjarsCssResourceReference;
import de.agilecoders.wicket.webjars.request.resource.WebjarsJavaScriptResourceReference;
import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.IModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.request.resource.CssResourceReference;

/**
 * Created by daniel on 11/09/16.
 */
public abstract class AbstractPage extends WebPage {
    public AbstractPage() {
    }

    public AbstractPage(IModel<?> model) {
        super(model);
    }

    public AbstractPage(PageParameters parameters) {
        super(parameters);
    }

    @Override
    protected void onInitialize() {
        super.onInitialize();
        add(new NavbarPanel());
    }

    @Override
    public void renderHead(IHeaderResponse response) {
        super.renderHead(response);

        response.render(JavaScriptHeaderItem.forReference(new WebjarsJavaScriptResourceReference("jquery/current/jquery.min.js")));
        response.render(JavaScriptHeaderItem.forReference(new WebjarsJavaScriptResourceReference("bootstrap/current/js/bootstrap.js")));
        response.render(CssHeaderItem.forReference(new WebjarsCssResourceReference("bootstrap/current/css/bootstrap.css")));
        response.render(CssHeaderItem.forReference(new WebjarsCssResourceReference("bootstrap/current/css/bootstrap-theme.css")));
        response.render(CssHeaderItem.forReference(new CssResourceReference(AbstractPage.class, "AbstractPage.css")));
    }
}
