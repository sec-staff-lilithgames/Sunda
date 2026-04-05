package ix;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;
import xchange.Domain$Account;
import xchange.Domain$PurchaseOrder;
import xchange.Domain$SaleOrder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface c0 extends MessageLiteOrBuilder {
    Domain$Account getAccount();

    Domain$PurchaseOrder getPurchaseOrders(int i10);

    int getPurchaseOrdersCount();

    List<Domain$PurchaseOrder> getPurchaseOrdersList();

    Domain$SaleOrder getSaleOrders(int i10);

    int getSaleOrdersCount();

    List<Domain$SaleOrder> getSaleOrdersList();

    boolean hasAccount();
}
