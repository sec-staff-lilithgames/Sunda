package ix;

import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;
import xchange.Domain$Account;
import xchange.Domain$PurchaseOrder;
import xchange.Domain$SaleOrder;
import xchange.Xchange$WebContractRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b0 extends GeneratedMessageLite.Builder implements c0 {
    public b0 addAllPurchaseOrders(Iterable<? extends Domain$PurchaseOrder> iterable) {
        copyOnWrite();
        ((Xchange$WebContractRequest) this.instance).addAllPurchaseOrders(iterable);
        return this;
    }

    public b0 addAllSaleOrders(Iterable<? extends Domain$SaleOrder> iterable) {
        copyOnWrite();
        ((Xchange$WebContractRequest) this.instance).addAllSaleOrders(iterable);
        return this;
    }

    public b0 addPurchaseOrders(Domain$PurchaseOrder domain$PurchaseOrder) {
        copyOnWrite();
        ((Xchange$WebContractRequest) this.instance).addPurchaseOrders(domain$PurchaseOrder);
        return this;
    }

    public b0 addSaleOrders(Domain$SaleOrder domain$SaleOrder) {
        copyOnWrite();
        ((Xchange$WebContractRequest) this.instance).addSaleOrders(domain$SaleOrder);
        return this;
    }

    public b0 clearAccount() {
        copyOnWrite();
        ((Xchange$WebContractRequest) this.instance).clearAccount();
        return this;
    }

    public b0 clearPurchaseOrders() {
        copyOnWrite();
        ((Xchange$WebContractRequest) this.instance).clearPurchaseOrders();
        return this;
    }

    public b0 clearSaleOrders() {
        copyOnWrite();
        ((Xchange$WebContractRequest) this.instance).clearSaleOrders();
        return this;
    }

    @Override // ix.c0
    public Domain$Account getAccount() {
        return ((Xchange$WebContractRequest) this.instance).getAccount();
    }

    @Override // ix.c0
    public Domain$PurchaseOrder getPurchaseOrders(int i10) {
        return ((Xchange$WebContractRequest) this.instance).getPurchaseOrders(i10);
    }

    @Override // ix.c0
    public int getPurchaseOrdersCount() {
        return ((Xchange$WebContractRequest) this.instance).getPurchaseOrdersCount();
    }

    @Override // ix.c0
    public List<Domain$PurchaseOrder> getPurchaseOrdersList() {
        return Collections.unmodifiableList(((Xchange$WebContractRequest) this.instance).getPurchaseOrdersList());
    }

    @Override // ix.c0
    public Domain$SaleOrder getSaleOrders(int i10) {
        return ((Xchange$WebContractRequest) this.instance).getSaleOrders(i10);
    }

    @Override // ix.c0
    public int getSaleOrdersCount() {
        return ((Xchange$WebContractRequest) this.instance).getSaleOrdersCount();
    }

    @Override // ix.c0
    public List<Domain$SaleOrder> getSaleOrdersList() {
        return Collections.unmodifiableList(((Xchange$WebContractRequest) this.instance).getSaleOrdersList());
    }

    @Override // ix.c0
    public boolean hasAccount() {
        return ((Xchange$WebContractRequest) this.instance).hasAccount();
    }

    public b0 mergeAccount(Domain$Account domain$Account) {
        copyOnWrite();
        ((Xchange$WebContractRequest) this.instance).mergeAccount(domain$Account);
        return this;
    }

    public b0 removePurchaseOrders(int i10) {
        copyOnWrite();
        ((Xchange$WebContractRequest) this.instance).removePurchaseOrders(i10);
        return this;
    }

    public b0 removeSaleOrders(int i10) {
        copyOnWrite();
        ((Xchange$WebContractRequest) this.instance).removeSaleOrders(i10);
        return this;
    }

    public b0 setAccount(Domain$Account domain$Account) {
        copyOnWrite();
        ((Xchange$WebContractRequest) this.instance).setAccount(domain$Account);
        return this;
    }

    public b0 setPurchaseOrders(int i10, Domain$PurchaseOrder domain$PurchaseOrder) {
        copyOnWrite();
        ((Xchange$WebContractRequest) this.instance).setPurchaseOrders(i10, domain$PurchaseOrder);
        return this;
    }

    public b0 setSaleOrders(int i10, Domain$SaleOrder domain$SaleOrder) {
        copyOnWrite();
        ((Xchange$WebContractRequest) this.instance).setSaleOrders(i10, domain$SaleOrder);
        return this;
    }

    public b0 addPurchaseOrders(int i10, Domain$PurchaseOrder domain$PurchaseOrder) {
        copyOnWrite();
        ((Xchange$WebContractRequest) this.instance).addPurchaseOrders(i10, domain$PurchaseOrder);
        return this;
    }

    public b0 addSaleOrders(int i10, Domain$SaleOrder domain$SaleOrder) {
        copyOnWrite();
        ((Xchange$WebContractRequest) this.instance).addSaleOrders(i10, domain$SaleOrder);
        return this;
    }

    public b0 setAccount(j jVar) {
        copyOnWrite();
        ((Xchange$WebContractRequest) this.instance).setAccount((Domain$Account) jVar.build());
        return this;
    }

    public b0 setPurchaseOrders(int i10, l lVar) {
        copyOnWrite();
        ((Xchange$WebContractRequest) this.instance).setPurchaseOrders(i10, (Domain$PurchaseOrder) lVar.build());
        return this;
    }

    public b0 setSaleOrders(int i10, n nVar) {
        copyOnWrite();
        ((Xchange$WebContractRequest) this.instance).setSaleOrders(i10, (Domain$SaleOrder) nVar.build());
        return this;
    }

    public b0 addPurchaseOrders(l lVar) {
        copyOnWrite();
        ((Xchange$WebContractRequest) this.instance).addPurchaseOrders((Domain$PurchaseOrder) lVar.build());
        return this;
    }

    public b0 addSaleOrders(n nVar) {
        copyOnWrite();
        ((Xchange$WebContractRequest) this.instance).addSaleOrders((Domain$SaleOrder) nVar.build());
        return this;
    }

    public b0 addPurchaseOrders(int i10, l lVar) {
        copyOnWrite();
        ((Xchange$WebContractRequest) this.instance).addPurchaseOrders(i10, (Domain$PurchaseOrder) lVar.build());
        return this;
    }

    public b0 addSaleOrders(int i10, n nVar) {
        copyOnWrite();
        ((Xchange$WebContractRequest) this.instance).addSaleOrders(i10, (Domain$SaleOrder) nVar.build());
        return this;
    }
}
