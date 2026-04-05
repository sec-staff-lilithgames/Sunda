package ix;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Timestamp;
import java.util.Collections;
import java.util.List;
import xchange.Domain$PurchaseOrder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l extends GeneratedMessageLite.Builder implements m {
    public l addAllAppKeys(Iterable<String> iterable) {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).addAllAppKeys(iterable);
        return this;
    }

    public l addAllAvailableFields(Iterable<String> iterable) {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).addAllAvailableFields(iterable);
        return this;
    }

    public l addAllBlacklistedIds(Iterable<String> iterable) {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).addAllBlacklistedIds(iterable);
        return this;
    }

    public l addAllBuyerId(Iterable<String> iterable) {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).addAllBuyerId(iterable);
        return this;
    }

    public l addAllSources(Iterable<? extends Integer> iterable) {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).addAllSources(iterable);
        return this;
    }

    public l addAppKeys(String str) {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).addAppKeys(str);
        return this;
    }

    public l addAppKeysBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).addAppKeysBytes(byteString);
        return this;
    }

    public l addAvailableFields(String str) {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).addAvailableFields(str);
        return this;
    }

    public l addAvailableFieldsBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).addAvailableFieldsBytes(byteString);
        return this;
    }

    public l addBlacklistedIds(String str) {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).addBlacklistedIds(str);
        return this;
    }

    public l addBlacklistedIdsBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).addBlacklistedIdsBytes(byteString);
        return this;
    }

    public l addBuyerId(String str) {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).addBuyerId(str);
        return this;
    }

    public l addBuyerIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).addBuyerIdBytes(byteString);
        return this;
    }

    public l addSources(int i10) {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).addSources(i10);
        return this;
    }

    public l clearAcceptPrivacyShield() {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).clearAcceptPrivacyShield();
        return this;
    }

    public l clearActive() {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).clearActive();
        return this;
    }

    public l clearAppKeys() {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).clearAppKeys();
        return this;
    }

    public l clearAvailableFields() {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).clearAvailableFields();
        return this;
    }

    public l clearBlacklistedIds() {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).clearBlacklistedIds();
        return this;
    }

    public l clearBuyerId() {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).clearBuyerId();
        return this;
    }

    public l clearEndDate() {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).clearEndDate();
        return this;
    }

    public l clearId() {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).clearId();
        return this;
    }

    public l clearOrderNumber() {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).clearOrderNumber();
        return this;
    }

    public l clearSellerId() {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).clearSellerId();
        return this;
    }

    public l clearSources() {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).clearSources();
        return this;
    }

    public l clearStartDate() {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).clearStartDate();
        return this;
    }

    @Override // ix.m
    public boolean getAcceptPrivacyShield() {
        return ((Domain$PurchaseOrder) this.instance).getAcceptPrivacyShield();
    }

    @Override // ix.m
    public boolean getActive() {
        return ((Domain$PurchaseOrder) this.instance).getActive();
    }

    @Override // ix.m
    public String getAppKeys(int i10) {
        return ((Domain$PurchaseOrder) this.instance).getAppKeys(i10);
    }

    @Override // ix.m
    public ByteString getAppKeysBytes(int i10) {
        return ((Domain$PurchaseOrder) this.instance).getAppKeysBytes(i10);
    }

    @Override // ix.m
    public int getAppKeysCount() {
        return ((Domain$PurchaseOrder) this.instance).getAppKeysCount();
    }

    @Override // ix.m
    public List<String> getAppKeysList() {
        return Collections.unmodifiableList(((Domain$PurchaseOrder) this.instance).getAppKeysList());
    }

    @Override // ix.m
    public String getAvailableFields(int i10) {
        return ((Domain$PurchaseOrder) this.instance).getAvailableFields(i10);
    }

    @Override // ix.m
    public ByteString getAvailableFieldsBytes(int i10) {
        return ((Domain$PurchaseOrder) this.instance).getAvailableFieldsBytes(i10);
    }

    @Override // ix.m
    public int getAvailableFieldsCount() {
        return ((Domain$PurchaseOrder) this.instance).getAvailableFieldsCount();
    }

    @Override // ix.m
    public List<String> getAvailableFieldsList() {
        return Collections.unmodifiableList(((Domain$PurchaseOrder) this.instance).getAvailableFieldsList());
    }

    @Override // ix.m
    public String getBlacklistedIds(int i10) {
        return ((Domain$PurchaseOrder) this.instance).getBlacklistedIds(i10);
    }

    @Override // ix.m
    public ByteString getBlacklistedIdsBytes(int i10) {
        return ((Domain$PurchaseOrder) this.instance).getBlacklistedIdsBytes(i10);
    }

    @Override // ix.m
    public int getBlacklistedIdsCount() {
        return ((Domain$PurchaseOrder) this.instance).getBlacklistedIdsCount();
    }

    @Override // ix.m
    public List<String> getBlacklistedIdsList() {
        return Collections.unmodifiableList(((Domain$PurchaseOrder) this.instance).getBlacklistedIdsList());
    }

    @Override // ix.m
    public String getBuyerId(int i10) {
        return ((Domain$PurchaseOrder) this.instance).getBuyerId(i10);
    }

    @Override // ix.m
    public ByteString getBuyerIdBytes(int i10) {
        return ((Domain$PurchaseOrder) this.instance).getBuyerIdBytes(i10);
    }

    @Override // ix.m
    public int getBuyerIdCount() {
        return ((Domain$PurchaseOrder) this.instance).getBuyerIdCount();
    }

    @Override // ix.m
    public List<String> getBuyerIdList() {
        return Collections.unmodifiableList(((Domain$PurchaseOrder) this.instance).getBuyerIdList());
    }

    @Override // ix.m
    public Timestamp getEndDate() {
        return ((Domain$PurchaseOrder) this.instance).getEndDate();
    }

    @Override // ix.m
    public String getId() {
        return ((Domain$PurchaseOrder) this.instance).getId();
    }

    @Override // ix.m
    public ByteString getIdBytes() {
        return ((Domain$PurchaseOrder) this.instance).getIdBytes();
    }

    @Override // ix.m
    public String getOrderNumber() {
        return ((Domain$PurchaseOrder) this.instance).getOrderNumber();
    }

    @Override // ix.m
    public ByteString getOrderNumberBytes() {
        return ((Domain$PurchaseOrder) this.instance).getOrderNumberBytes();
    }

    @Override // ix.m
    public String getSellerId() {
        return ((Domain$PurchaseOrder) this.instance).getSellerId();
    }

    @Override // ix.m
    public ByteString getSellerIdBytes() {
        return ((Domain$PurchaseOrder) this.instance).getSellerIdBytes();
    }

    @Override // ix.m
    public int getSources(int i10) {
        return ((Domain$PurchaseOrder) this.instance).getSources(i10);
    }

    @Override // ix.m
    public int getSourcesCount() {
        return ((Domain$PurchaseOrder) this.instance).getSourcesCount();
    }

    @Override // ix.m
    public List<Integer> getSourcesList() {
        return Collections.unmodifiableList(((Domain$PurchaseOrder) this.instance).getSourcesList());
    }

    @Override // ix.m
    public Timestamp getStartDate() {
        return ((Domain$PurchaseOrder) this.instance).getStartDate();
    }

    @Override // ix.m
    public boolean hasEndDate() {
        return ((Domain$PurchaseOrder) this.instance).hasEndDate();
    }

    @Override // ix.m
    public boolean hasStartDate() {
        return ((Domain$PurchaseOrder) this.instance).hasStartDate();
    }

    public l mergeEndDate(Timestamp timestamp) {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).mergeEndDate(timestamp);
        return this;
    }

    public l mergeStartDate(Timestamp timestamp) {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).mergeStartDate(timestamp);
        return this;
    }

    public l setAcceptPrivacyShield(boolean z10) {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).setAcceptPrivacyShield(z10);
        return this;
    }

    public l setActive(boolean z10) {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).setActive(z10);
        return this;
    }

    public l setAppKeys(int i10, String str) {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).setAppKeys(i10, str);
        return this;
    }

    public l setAvailableFields(int i10, String str) {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).setAvailableFields(i10, str);
        return this;
    }

    public l setBlacklistedIds(int i10, String str) {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).setBlacklistedIds(i10, str);
        return this;
    }

    public l setBuyerId(int i10, String str) {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).setBuyerId(i10, str);
        return this;
    }

    public l setEndDate(Timestamp timestamp) {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).setEndDate(timestamp);
        return this;
    }

    public l setId(String str) {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).setId(str);
        return this;
    }

    public l setIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).setIdBytes(byteString);
        return this;
    }

    public l setOrderNumber(String str) {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).setOrderNumber(str);
        return this;
    }

    public l setOrderNumberBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).setOrderNumberBytes(byteString);
        return this;
    }

    public l setSellerId(String str) {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).setSellerId(str);
        return this;
    }

    public l setSellerIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).setSellerIdBytes(byteString);
        return this;
    }

    public l setSources(int i10, int i11) {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).setSources(i10, i11);
        return this;
    }

    public l setStartDate(Timestamp timestamp) {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).setStartDate(timestamp);
        return this;
    }

    public l setEndDate(Timestamp.Builder builder) {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).setEndDate(builder.build());
        return this;
    }

    public l setStartDate(Timestamp.Builder builder) {
        copyOnWrite();
        ((Domain$PurchaseOrder) this.instance).setStartDate(builder.build());
        return this;
    }
}
