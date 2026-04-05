package ix;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;
import xchange.Domain$Account;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j extends GeneratedMessageLite.Builder implements k {
    public j addAllPurchaseOrders(Iterable<String> iterable) {
        copyOnWrite();
        ((Domain$Account) this.instance).addAllPurchaseOrders(iterable);
        return this;
    }

    public j addAllSaleOrders(Iterable<String> iterable) {
        copyOnWrite();
        ((Domain$Account) this.instance).addAllSaleOrders(iterable);
        return this;
    }

    public j addPurchaseOrders(String str) {
        copyOnWrite();
        ((Domain$Account) this.instance).addPurchaseOrders(str);
        return this;
    }

    public j addPurchaseOrdersBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Domain$Account) this.instance).addPurchaseOrdersBytes(byteString);
        return this;
    }

    public j addSaleOrders(String str) {
        copyOnWrite();
        ((Domain$Account) this.instance).addSaleOrders(str);
        return this;
    }

    public j addSaleOrdersBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Domain$Account) this.instance).addSaleOrdersBytes(byteString);
        return this;
    }

    public j clearIabId() {
        copyOnWrite();
        ((Domain$Account) this.instance).clearIabId();
        return this;
    }

    public j clearId() {
        copyOnWrite();
        ((Domain$Account) this.instance).clearId();
        return this;
    }

    public j clearName() {
        copyOnWrite();
        ((Domain$Account) this.instance).clearName();
        return this;
    }

    public j clearPurchaseOrders() {
        copyOnWrite();
        ((Domain$Account) this.instance).clearPurchaseOrders();
        return this;
    }

    public j clearSaleOrders() {
        copyOnWrite();
        ((Domain$Account) this.instance).clearSaleOrders();
        return this;
    }

    @Override // ix.k
    public int getIabId() {
        return ((Domain$Account) this.instance).getIabId();
    }

    @Override // ix.k
    public String getId() {
        return ((Domain$Account) this.instance).getId();
    }

    @Override // ix.k
    public ByteString getIdBytes() {
        return ((Domain$Account) this.instance).getIdBytes();
    }

    @Override // ix.k
    public String getName() {
        return ((Domain$Account) this.instance).getName();
    }

    @Override // ix.k
    public ByteString getNameBytes() {
        return ((Domain$Account) this.instance).getNameBytes();
    }

    @Override // ix.k
    public String getPurchaseOrders(int i10) {
        return ((Domain$Account) this.instance).getPurchaseOrders(i10);
    }

    @Override // ix.k
    public ByteString getPurchaseOrdersBytes(int i10) {
        return ((Domain$Account) this.instance).getPurchaseOrdersBytes(i10);
    }

    @Override // ix.k
    public int getPurchaseOrdersCount() {
        return ((Domain$Account) this.instance).getPurchaseOrdersCount();
    }

    @Override // ix.k
    public List<String> getPurchaseOrdersList() {
        return Collections.unmodifiableList(((Domain$Account) this.instance).getPurchaseOrdersList());
    }

    @Override // ix.k
    public String getSaleOrders(int i10) {
        return ((Domain$Account) this.instance).getSaleOrders(i10);
    }

    @Override // ix.k
    public ByteString getSaleOrdersBytes(int i10) {
        return ((Domain$Account) this.instance).getSaleOrdersBytes(i10);
    }

    @Override // ix.k
    public int getSaleOrdersCount() {
        return ((Domain$Account) this.instance).getSaleOrdersCount();
    }

    @Override // ix.k
    public List<String> getSaleOrdersList() {
        return Collections.unmodifiableList(((Domain$Account) this.instance).getSaleOrdersList());
    }

    public j setIabId(int i10) {
        copyOnWrite();
        ((Domain$Account) this.instance).setIabId(i10);
        return this;
    }

    public j setId(String str) {
        copyOnWrite();
        ((Domain$Account) this.instance).setId(str);
        return this;
    }

    public j setIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Domain$Account) this.instance).setIdBytes(byteString);
        return this;
    }

    public j setName(String str) {
        copyOnWrite();
        ((Domain$Account) this.instance).setName(str);
        return this;
    }

    public j setNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Domain$Account) this.instance).setNameBytes(byteString);
        return this;
    }

    public j setPurchaseOrders(int i10, String str) {
        copyOnWrite();
        ((Domain$Account) this.instance).setPurchaseOrders(i10, str);
        return this;
    }

    public j setSaleOrders(int i10, String str) {
        copyOnWrite();
        ((Domain$Account) this.instance).setSaleOrders(i10, str);
        return this;
    }
}
