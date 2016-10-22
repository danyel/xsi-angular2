package be.urpi.software.xsi.wicket.html.page.request;

import be.urpi.software.xsi.request.facade.api.RequestManagementService;
import be.urpi.software.xsi.request.facade.dto.RequestView;
import be.urpi.software.xsi.wicket.html.component.modal.Modal;
import be.urpi.software.xsi.wicket.html.page.AbstractPage;
import be.urpi.software.xsi.wicket.html.page.request.modal.RequestDetailModal;
import org.apache.wicket.AttributeModifier;
import org.apache.wicket.extensions.markup.html.repeater.data.grid.ICellPopulator;
import org.apache.wicket.extensions.markup.html.repeater.data.table.DataTable;
import org.apache.wicket.extensions.markup.html.repeater.data.table.IColumn;
import org.apache.wicket.extensions.markup.html.repeater.data.table.PropertyColumn;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.data.ListDataProvider;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.spring.injection.annot.SpringBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel on 11/09/16.
 */
public class RequestPage extends AbstractPage {
    @SpringBean
    private RequestManagementService requestManagementService;

    // class="btn btn-primary btn-lg" data-toggle="modal" data-target="#requestDetailModal"
    public RequestPage() {
        RequestDetailModal requestDetailModal = new RequestDetailModal();
        Modal modal = new Modal("requestDetailModal", "requestDetailModal", requestDetailModal);
        List<IColumn<RequestView, String>> columns = new ArrayList<>();
        columns.add(new PropertyColumn<>(new Model<>("Name"), "requestName", "requestName"));
        columns.add(new PropertyColumn<>(new Model<>("Project"), "projectName", "projectName"));
        columns.add(new PropertyColumn<RequestView, String>(new Model<>("Action"), "uuid", "uuid") {
            @Override
            public void populateItem(Item<ICellPopulator<RequestView>> item, String componentId, IModel<RequestView> rowModel) {
                Button showRequestDetail = new Button(componentId, new Model<>(rowModel.getObject().getRequestName())) {
                    @Override
                    public void onSubmit() {
                        requestDetailModal.setRequestView(rowModel.getObject());
                    }
                };
                showRequestDetail.add(new AttributeModifier("class", "btn btn-link"));
                showRequestDetail.add(new AttributeModifier("data-toggle", "modal"));
                showRequestDetail.add(new AttributeModifier("data-target", "#requestDetailModal"));
                item.add(showRequestDetail);
            }
        });
        ListDataProvider<RequestView> dataProvider = new ListDataProvider<>(requestManagementService.findAll());
        DataTable<RequestView, String> dataTable = new DataTable<>("table", columns, dataProvider, 8);

        add(dataTable);
        add(modal);
    }
}
