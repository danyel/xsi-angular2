package be.urpi.software.xsi.wicket.html.component.modal;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;

/**
 * Created by daniel on 17/09/16.
 */
public class Modal extends Panel {
    public Modal(String id, String modalId, ModalPanel modalPanel) {
        super(id);
        ModalFadeDivContainer components = new ModalFadeDivContainer("modalFadeDivContainer", modalId);
        components.add(new Label("modalHeader", "modalHeader"));
        components.add(new ModelButtonPanel("modalFooterButtonPanel"));
        components.add(modalPanel);
        add(components);
    }

    public class ModalFadeDivContainer extends WebMarkupContainer {
        public ModalFadeDivContainer(String panelId, String modalId) {
            super(panelId);
            add(new AttributeModifier("id", modalId));

        }
    }
}
