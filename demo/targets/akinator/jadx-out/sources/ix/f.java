package ix;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Timestamp;
import java.util.Collections;
import java.util.List;
import xchange.Cargo$CargoPOCounter;
import xchange.Cargo$ReportDeliveryRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f extends GeneratedMessageLite.Builder implements g {
    public f addAllContent(Iterable<? extends Cargo$CargoPOCounter> iterable) {
        copyOnWrite();
        ((Cargo$ReportDeliveryRequest) this.instance).addAllContent(iterable);
        return this;
    }

    public f addContent(Cargo$CargoPOCounter cargo$CargoPOCounter) {
        copyOnWrite();
        ((Cargo$ReportDeliveryRequest) this.instance).addContent(cargo$CargoPOCounter);
        return this;
    }

    public f clearAccountName() {
        copyOnWrite();
        ((Cargo$ReportDeliveryRequest) this.instance).clearAccountName();
        return this;
    }

    public f clearContent() {
        copyOnWrite();
        ((Cargo$ReportDeliveryRequest) this.instance).clearContent();
        return this;
    }

    public f clearDeliveredAt() {
        copyOnWrite();
        ((Cargo$ReportDeliveryRequest) this.instance).clearDeliveredAt();
        return this;
    }

    public f clearDeliveryHandler() {
        copyOnWrite();
        ((Cargo$ReportDeliveryRequest) this.instance).clearDeliveryHandler();
        return this;
    }

    public f clearDeliveryId() {
        copyOnWrite();
        ((Cargo$ReportDeliveryRequest) this.instance).clearDeliveryId();
        return this;
    }

    public f clearSaleOrder() {
        copyOnWrite();
        ((Cargo$ReportDeliveryRequest) this.instance).clearSaleOrder();
        return this;
    }

    @Override // ix.g
    public String getAccountName() {
        return ((Cargo$ReportDeliveryRequest) this.instance).getAccountName();
    }

    @Override // ix.g
    public ByteString getAccountNameBytes() {
        return ((Cargo$ReportDeliveryRequest) this.instance).getAccountNameBytes();
    }

    @Override // ix.g
    public Cargo$CargoPOCounter getContent(int i10) {
        return ((Cargo$ReportDeliveryRequest) this.instance).getContent(i10);
    }

    @Override // ix.g
    public int getContentCount() {
        return ((Cargo$ReportDeliveryRequest) this.instance).getContentCount();
    }

    @Override // ix.g
    public List<Cargo$CargoPOCounter> getContentList() {
        return Collections.unmodifiableList(((Cargo$ReportDeliveryRequest) this.instance).getContentList());
    }

    @Override // ix.g
    public Timestamp getDeliveredAt() {
        return ((Cargo$ReportDeliveryRequest) this.instance).getDeliveredAt();
    }

    @Override // ix.g
    public String getDeliveryHandler() {
        return ((Cargo$ReportDeliveryRequest) this.instance).getDeliveryHandler();
    }

    @Override // ix.g
    public ByteString getDeliveryHandlerBytes() {
        return ((Cargo$ReportDeliveryRequest) this.instance).getDeliveryHandlerBytes();
    }

    @Override // ix.g
    public String getDeliveryId() {
        return ((Cargo$ReportDeliveryRequest) this.instance).getDeliveryId();
    }

    @Override // ix.g
    public ByteString getDeliveryIdBytes() {
        return ((Cargo$ReportDeliveryRequest) this.instance).getDeliveryIdBytes();
    }

    @Override // ix.g
    public String getSaleOrder() {
        return ((Cargo$ReportDeliveryRequest) this.instance).getSaleOrder();
    }

    @Override // ix.g
    public ByteString getSaleOrderBytes() {
        return ((Cargo$ReportDeliveryRequest) this.instance).getSaleOrderBytes();
    }

    @Override // ix.g
    public boolean hasDeliveredAt() {
        return ((Cargo$ReportDeliveryRequest) this.instance).hasDeliveredAt();
    }

    public f mergeDeliveredAt(Timestamp timestamp) {
        copyOnWrite();
        ((Cargo$ReportDeliveryRequest) this.instance).mergeDeliveredAt(timestamp);
        return this;
    }

    public f removeContent(int i10) {
        copyOnWrite();
        ((Cargo$ReportDeliveryRequest) this.instance).removeContent(i10);
        return this;
    }

    public f setAccountName(String str) {
        copyOnWrite();
        ((Cargo$ReportDeliveryRequest) this.instance).setAccountName(str);
        return this;
    }

    public f setAccountNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Cargo$ReportDeliveryRequest) this.instance).setAccountNameBytes(byteString);
        return this;
    }

    public f setContent(int i10, Cargo$CargoPOCounter cargo$CargoPOCounter) {
        copyOnWrite();
        ((Cargo$ReportDeliveryRequest) this.instance).setContent(i10, cargo$CargoPOCounter);
        return this;
    }

    public f setDeliveredAt(Timestamp timestamp) {
        copyOnWrite();
        ((Cargo$ReportDeliveryRequest) this.instance).setDeliveredAt(timestamp);
        return this;
    }

    public f setDeliveryHandler(String str) {
        copyOnWrite();
        ((Cargo$ReportDeliveryRequest) this.instance).setDeliveryHandler(str);
        return this;
    }

    public f setDeliveryHandlerBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Cargo$ReportDeliveryRequest) this.instance).setDeliveryHandlerBytes(byteString);
        return this;
    }

    public f setDeliveryId(String str) {
        copyOnWrite();
        ((Cargo$ReportDeliveryRequest) this.instance).setDeliveryId(str);
        return this;
    }

    public f setDeliveryIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Cargo$ReportDeliveryRequest) this.instance).setDeliveryIdBytes(byteString);
        return this;
    }

    public f setSaleOrder(String str) {
        copyOnWrite();
        ((Cargo$ReportDeliveryRequest) this.instance).setSaleOrder(str);
        return this;
    }

    public f setSaleOrderBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Cargo$ReportDeliveryRequest) this.instance).setSaleOrderBytes(byteString);
        return this;
    }

    public f addContent(int i10, Cargo$CargoPOCounter cargo$CargoPOCounter) {
        copyOnWrite();
        ((Cargo$ReportDeliveryRequest) this.instance).addContent(i10, cargo$CargoPOCounter);
        return this;
    }

    public f setContent(int i10, d dVar) {
        copyOnWrite();
        ((Cargo$ReportDeliveryRequest) this.instance).setContent(i10, (Cargo$CargoPOCounter) dVar.build());
        return this;
    }

    public f setDeliveredAt(Timestamp.Builder builder) {
        copyOnWrite();
        ((Cargo$ReportDeliveryRequest) this.instance).setDeliveredAt(builder.build());
        return this;
    }

    public f addContent(d dVar) {
        copyOnWrite();
        ((Cargo$ReportDeliveryRequest) this.instance).addContent((Cargo$CargoPOCounter) dVar.build());
        return this;
    }

    public f addContent(int i10, d dVar) {
        copyOnWrite();
        ((Cargo$ReportDeliveryRequest) this.instance).addContent(i10, (Cargo$CargoPOCounter) dVar.build());
        return this;
    }
}
