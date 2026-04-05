package xchange;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import ix.i;
import ix.l;
import ix.m;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Domain$PurchaseOrder extends GeneratedMessageLite<Domain$PurchaseOrder, l> implements m {
    public static final int ACCEPTPRIVACYSHIELD_FIELD_NUMBER = 10;
    public static final int ACTIVE_FIELD_NUMBER = 11;
    public static final int APP_KEYS_FIELD_NUMBER = 9;
    public static final int AVAILABLE_FIELDS_FIELD_NUMBER = 7;
    public static final int BLACKLISTED_IDS_FIELD_NUMBER = 12;
    public static final int BUYER_ID_FIELD_NUMBER = 6;
    private static final Domain$PurchaseOrder DEFAULT_INSTANCE;
    public static final int END_DATE_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ORDER_NUMBER_FIELD_NUMBER = 2;
    private static volatile Parser<Domain$PurchaseOrder> PARSER = null;
    public static final int SELLER_ID_FIELD_NUMBER = 5;
    public static final int SOURCES_FIELD_NUMBER = 8;
    public static final int START_DATE_FIELD_NUMBER = 3;
    private boolean acceptPrivacyShield_;
    private boolean active_;
    private Timestamp endDate_;
    private Timestamp startDate_;
    private int sourcesMemoizedSerializedSize = -1;
    private String id_ = "";
    private String orderNumber_ = "";
    private String sellerId_ = "";
    private Internal.ProtobufList<String> buyerId_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> availableFields_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.IntList sources_ = GeneratedMessageLite.emptyIntList();
    private Internal.ProtobufList<String> appKeys_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> blacklistedIds_ = GeneratedMessageLite.emptyProtobufList();

    static {
        Domain$PurchaseOrder domain$PurchaseOrder = new Domain$PurchaseOrder();
        DEFAULT_INSTANCE = domain$PurchaseOrder;
        GeneratedMessageLite.registerDefaultInstance(Domain$PurchaseOrder.class, domain$PurchaseOrder);
    }

    private Domain$PurchaseOrder() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAppKeys(Iterable<String> iterable) {
        ensureAppKeysIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.appKeys_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAvailableFields(Iterable<String> iterable) {
        ensureAvailableFieldsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.availableFields_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBlacklistedIds(Iterable<String> iterable) {
        ensureBlacklistedIdsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.blacklistedIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBuyerId(Iterable<String> iterable) {
        ensureBuyerIdIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.buyerId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSources(Iterable<? extends Integer> iterable) {
        ensureSourcesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.sources_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAppKeys(String str) {
        str.getClass();
        ensureAppKeysIsMutable();
        this.appKeys_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAppKeysBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureAppKeysIsMutable();
        this.appKeys_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAvailableFields(String str) {
        str.getClass();
        ensureAvailableFieldsIsMutable();
        this.availableFields_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAvailableFieldsBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureAvailableFieldsIsMutable();
        this.availableFields_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBlacklistedIds(String str) {
        str.getClass();
        ensureBlacklistedIdsIsMutable();
        this.blacklistedIds_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBlacklistedIdsBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureBlacklistedIdsIsMutable();
        this.blacklistedIds_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBuyerId(String str) {
        str.getClass();
        ensureBuyerIdIsMutable();
        this.buyerId_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBuyerIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureBuyerIdIsMutable();
        this.buyerId_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSources(int i10) {
        ensureSourcesIsMutable();
        this.sources_.addInt(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAcceptPrivacyShield() {
        this.acceptPrivacyShield_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActive() {
        this.active_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppKeys() {
        this.appKeys_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailableFields() {
        this.availableFields_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBlacklistedIds() {
        this.blacklistedIds_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuyerId() {
        this.buyerId_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndDate() {
        this.endDate_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrderNumber() {
        this.orderNumber_ = getDefaultInstance().getOrderNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSellerId() {
        this.sellerId_ = getDefaultInstance().getSellerId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSources() {
        this.sources_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartDate() {
        this.startDate_ = null;
    }

    private void ensureAppKeysIsMutable() {
        Internal.ProtobufList<String> protobufList = this.appKeys_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.appKeys_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureAvailableFieldsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.availableFields_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.availableFields_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureBlacklistedIdsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.blacklistedIds_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.blacklistedIds_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureBuyerIdIsMutable() {
        Internal.ProtobufList<String> protobufList = this.buyerId_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.buyerId_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureSourcesIsMutable() {
        Internal.IntList intList = this.sources_;
        if (intList.isModifiable()) {
            return;
        }
        this.sources_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public static Domain$PurchaseOrder getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEndDate(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.endDate_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.endDate_ = timestamp;
        } else {
            this.endDate_ = Timestamp.newBuilder(this.endDate_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStartDate(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.startDate_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.startDate_ = timestamp;
        } else {
            this.startDate_ = Timestamp.newBuilder(this.startDate_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
        }
    }

    public static l newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Domain$PurchaseOrder parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Domain$PurchaseOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Domain$PurchaseOrder parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Domain$PurchaseOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Domain$PurchaseOrder> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAcceptPrivacyShield(boolean z10) {
        this.acceptPrivacyShield_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActive(boolean z10) {
        this.active_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppKeys(int i10, String str) {
        str.getClass();
        ensureAppKeysIsMutable();
        this.appKeys_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailableFields(int i10, String str) {
        str.getClass();
        ensureAvailableFieldsIsMutable();
        this.availableFields_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBlacklistedIds(int i10, String str) {
        str.getClass();
        ensureBlacklistedIdsIsMutable();
        this.blacklistedIds_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuyerId(int i10, String str) {
        str.getClass();
        ensureBuyerIdIsMutable();
        this.buyerId_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndDate(Timestamp timestamp) {
        timestamp.getClass();
        this.endDate_ = timestamp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrderNumber(String str) {
        str.getClass();
        this.orderNumber_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrderNumberBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.orderNumber_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSellerId(String str) {
        str.getClass();
        this.sellerId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSellerIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sellerId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSources(int i10, int i11) {
        ensureSourcesIsMutable();
        this.sources_.setInt(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartDate(Timestamp timestamp) {
        timestamp.getClass();
        this.startDate_ = timestamp;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (i.f68432a[methodToInvoke.ordinal()]) {
            case 1:
                return new Domain$PurchaseOrder();
            case 2:
                return new l(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0005\u0000\u0001Ȉ\u0002Ȉ\u0003\t\u0004\t\u0005Ȉ\u0006Ț\u0007Ț\b+\tȚ\n\u0007\u000b\u0007\fȚ", new Object[]{"id_", "orderNumber_", "startDate_", "endDate_", "sellerId_", "buyerId_", "availableFields_", "sources_", "appKeys_", "acceptPrivacyShield_", "active_", "blacklistedIds_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Domain$PurchaseOrder> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Domain$PurchaseOrder.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // ix.m
    public boolean getAcceptPrivacyShield() {
        return this.acceptPrivacyShield_;
    }

    @Override // ix.m
    public boolean getActive() {
        return this.active_;
    }

    @Override // ix.m
    public String getAppKeys(int i10) {
        return this.appKeys_.get(i10);
    }

    @Override // ix.m
    public ByteString getAppKeysBytes(int i10) {
        return ByteString.copyFromUtf8(this.appKeys_.get(i10));
    }

    @Override // ix.m
    public int getAppKeysCount() {
        return this.appKeys_.size();
    }

    @Override // ix.m
    public List<String> getAppKeysList() {
        return this.appKeys_;
    }

    @Override // ix.m
    public String getAvailableFields(int i10) {
        return this.availableFields_.get(i10);
    }

    @Override // ix.m
    public ByteString getAvailableFieldsBytes(int i10) {
        return ByteString.copyFromUtf8(this.availableFields_.get(i10));
    }

    @Override // ix.m
    public int getAvailableFieldsCount() {
        return this.availableFields_.size();
    }

    @Override // ix.m
    public List<String> getAvailableFieldsList() {
        return this.availableFields_;
    }

    @Override // ix.m
    public String getBlacklistedIds(int i10) {
        return this.blacklistedIds_.get(i10);
    }

    @Override // ix.m
    public ByteString getBlacklistedIdsBytes(int i10) {
        return ByteString.copyFromUtf8(this.blacklistedIds_.get(i10));
    }

    @Override // ix.m
    public int getBlacklistedIdsCount() {
        return this.blacklistedIds_.size();
    }

    @Override // ix.m
    public List<String> getBlacklistedIdsList() {
        return this.blacklistedIds_;
    }

    @Override // ix.m
    public String getBuyerId(int i10) {
        return this.buyerId_.get(i10);
    }

    @Override // ix.m
    public ByteString getBuyerIdBytes(int i10) {
        return ByteString.copyFromUtf8(this.buyerId_.get(i10));
    }

    @Override // ix.m
    public int getBuyerIdCount() {
        return this.buyerId_.size();
    }

    @Override // ix.m
    public List<String> getBuyerIdList() {
        return this.buyerId_;
    }

    @Override // ix.m
    public Timestamp getEndDate() {
        Timestamp timestamp = this.endDate_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // ix.m
    public String getId() {
        return this.id_;
    }

    @Override // ix.m
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    @Override // ix.m
    public String getOrderNumber() {
        return this.orderNumber_;
    }

    @Override // ix.m
    public ByteString getOrderNumberBytes() {
        return ByteString.copyFromUtf8(this.orderNumber_);
    }

    @Override // ix.m
    public String getSellerId() {
        return this.sellerId_;
    }

    @Override // ix.m
    public ByteString getSellerIdBytes() {
        return ByteString.copyFromUtf8(this.sellerId_);
    }

    @Override // ix.m
    public int getSources(int i10) {
        return this.sources_.getInt(i10);
    }

    @Override // ix.m
    public int getSourcesCount() {
        return this.sources_.size();
    }

    @Override // ix.m
    public List<Integer> getSourcesList() {
        return this.sources_;
    }

    @Override // ix.m
    public Timestamp getStartDate() {
        Timestamp timestamp = this.startDate_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // ix.m
    public boolean hasEndDate() {
        return this.endDate_ != null;
    }

    @Override // ix.m
    public boolean hasStartDate() {
        return this.startDate_ != null;
    }

    public static l newBuilder(Domain$PurchaseOrder domain$PurchaseOrder) {
        return DEFAULT_INSTANCE.createBuilder(domain$PurchaseOrder);
    }

    public static Domain$PurchaseOrder parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Domain$PurchaseOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Domain$PurchaseOrder parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Domain$PurchaseOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Domain$PurchaseOrder parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Domain$PurchaseOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Domain$PurchaseOrder parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Domain$PurchaseOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Domain$PurchaseOrder parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Domain$PurchaseOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Domain$PurchaseOrder parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Domain$PurchaseOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Domain$PurchaseOrder parseFrom(InputStream inputStream) throws IOException {
        return (Domain$PurchaseOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Domain$PurchaseOrder parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Domain$PurchaseOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Domain$PurchaseOrder parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Domain$PurchaseOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Domain$PurchaseOrder parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Domain$PurchaseOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
