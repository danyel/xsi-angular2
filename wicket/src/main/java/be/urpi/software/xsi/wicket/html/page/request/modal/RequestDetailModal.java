package be.urpi.software.xsi.wicket.html.page.request.modal;

import be.urpi.software.xsi.request.facade.dto.RequestView;
import be.urpi.software.xsi.wicket.html.component.modal.ModalPanel;
import org.apache.wicket.markup.html.basic.Label;

/**
 * Created by daniel on 17/09/16.
 */
public class RequestDetailModal extends ModalPanel {
    public RequestDetailModal() {
        super("modalPanel");
        this.add(new Label("requestName", ""));
        this.add(new Label("projectName", ""));
    }

    public void setRequestView(RequestView requestView) {
        this.addOrReplace(new Label("requestName", requestView.getRequestName()));
        this.addOrReplace(new Label("projectName", requestView.getProjectName()));
    }
}
