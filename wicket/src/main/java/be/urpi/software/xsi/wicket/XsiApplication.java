package be.urpi.software.xsi.wicket;

import be.urpi.software.xsi.wicket.html.page.request.RequestPage;
import de.agilecoders.wicket.webjars.WicketWebjars;
import de.agilecoders.wicket.webjars.settings.WebjarsSettings;
import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

public class XsiApplication extends WebApplication {
    @Override
    public Class<? extends Page> getHomePage() {
        return RequestPage.class;
    }

    @Override
    public void init() {
        super.init();

        WebjarsSettings settings = new WebjarsSettings();
        settings.useCdnResources(false);

        WicketWebjars.install(this, settings);

        getComponentInstantiationListeners().add(new SpringComponentInjector(this));
    }
}
