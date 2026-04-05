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
import ix.a;
import ix.e;
import ix.f;
import ix.g;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Cargo$ReportDeliveryRequest extends GeneratedMessageLite<Cargo$ReportDeliveryRequest, f> implements g {
    public static final int ACCOUNT_NAME_FIELD_NUMBER = 2;
    public static final int CONTENT_FIELD_NUMBER = 6;
    private static final Cargo$ReportDeliveryRequest DEFAULT_INSTANCE;
    public static final int DELIVERED_AT_FIELD_NUMBER = 5;
    public static final int DELIVERY_HANDLER_FIELD_NUMBER = 4;
    public static final int DELIVERY_ID_FIELD_NUMBER = 3;
    private static volatile Parser<Cargo$ReportDeliveryRequest> PARSER = null;
    public static final int SALE_ORDER_FIELD_NUMBER = 1;
    private Timestamp deliveredAt_;
    private String saleOrder_ = "";
    private String accountName_ = "";
    private String deliveryId_ = "";
    private String deliveryHandler_ = "";
    private Internal.ProtobufList<Cargo$CargoPOCounter> content_ = GeneratedMessageLite.emptyProtobufList();

    static {
        Cargo$ReportDeliveryRequest cargo$ReportDeliveryRequest = new Cargo$ReportDeliveryRequest();
        DEFAULT_INSTANCE = cargo$ReportDeliveryRequest;
        GeneratedMessageLite.registerDefaultInstance(Cargo$ReportDeliveryRequest.class, cargo$ReportDeliveryRequest);
    }

    private Cargo$ReportDeliveryRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllContent(Iterable<? extends Cargo$CargoPOCounter> iterable) {
        ensureContentIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.content_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addContent(Cargo$CargoPOCounter cargo$CargoPOCounter) {
        cargo$CargoPOCounter.getClass();
        ensureContentIsMutable();
        this.content_.add(cargo$CargoPOCounter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountName() {
        this.accountName_ = getDefaultInstance().getAccountName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeliveredAt() {
        this.deliveredAt_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeliveryHandler() {
        this.deliveryHandler_ = getDefaultInstance().getDeliveryHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeliveryId() {
        this.deliveryId_ = getDefaultInstance().getDeliveryId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSaleOrder() {
        this.saleOrder_ = getDefaultInstance().getSaleOrder();
    }

    private void ensureContentIsMutable() {
        Internal.ProtobufList<Cargo$CargoPOCounter> protobufList = this.content_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.content_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Cargo$ReportDeliveryRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeliveredAt(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.deliveredAt_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.deliveredAt_ = timestamp;
        } else {
            this.deliveredAt_ = Timestamp.newBuilder(this.deliveredAt_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
        }
    }

    public static f newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Cargo$ReportDeliveryRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Cargo$ReportDeliveryRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Cargo$ReportDeliveryRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Cargo$ReportDeliveryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Cargo$ReportDeliveryRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeContent(int i10) {
        ensureContentIsMutable();
        this.content_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountName(String str) {
        str.getClass();
        this.accountName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountNameBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.accountName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(int i10, Cargo$CargoPOCounter cargo$CargoPOCounter) {
        cargo$CargoPOCounter.getClass();
        ensureContentIsMutable();
        this.content_.set(i10, cargo$CargoPOCounter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeliveredAt(Timestamp timestamp) {
        timestamp.getClass();
        this.deliveredAt_ = timestamp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeliveryHandler(String str) {
        str.getClass();
        this.deliveryHandler_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeliveryHandlerBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deliveryHandler_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeliveryId(String str) {
        str.getClass();
        this.deliveryId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeliveryIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deliveryId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSaleOrder(String str) {
        str.getClass();
        this.saleOrder_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSaleOrderBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.saleOrder_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.f68431a[methodToInvoke.ordinal()]) {
            case 1:
                return new Cargo$ReportDeliveryRequest();
            case 2:
                return new f(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\t\u0006\u001b", new Object[]{"saleOrder_", "accountName_", "deliveryId_", "deliveryHandler_", "deliveredAt_", "content_", Cargo$CargoPOCounter.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Cargo$ReportDeliveryRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Cargo$ReportDeliveryRequest.class) {
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

    @Override // ix.g
    public String getAccountName() {
        return this.accountName_;
    }

    @Override // ix.g
    public ByteString getAccountNameBytes() {
        return ByteString.copyFromUtf8(this.accountName_);
    }

    @Override // ix.g
    public Cargo$CargoPOCounter getContent(int i10) {
        return this.content_.get(i10);
    }

    @Override // ix.g
    public int getContentCount() {
        return this.content_.size();
    }

    @Override // ix.g
    public List<Cargo$CargoPOCounter> getContentList() {
        return this.content_;
    }

    public e getContentOrBuilder(int i10) {
        return this.content_.get(i10);
    }

    public List<? extends e> getContentOrBuilderList() {
        return this.content_;
    }

    @Override // ix.g
    public Timestamp getDeliveredAt() {
        Timestamp timestamp = this.deliveredAt_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // ix.g
    public String getDeliveryHandler() {
        return this.deliveryHandler_;
    }

    @Override // ix.g
    public ByteString getDeliveryHandlerBytes() {
        return ByteString.copyFromUtf8(this.deliveryHandler_);
    }

    @Override // ix.g
    public String getDeliveryId() {
        return this.deliveryId_;
    }

    @Override // ix.g
    public ByteString getDeliveryIdBytes() {
        return ByteString.copyFromUtf8(this.deliveryId_);
    }

    @Override // ix.g
    public String getSaleOrder() {
        return this.saleOrder_;
    }

    @Override // ix.g
    public ByteString getSaleOrderBytes() {
        return ByteString.copyFromUtf8(this.saleOrder_);
    }

    @Override // ix.g
    public boolean hasDeliveredAt() {
        return this.deliveredAt_ != null;
    }

    public static f newBuilder(Cargo$ReportDeliveryRequest cargo$ReportDeliveryRequest) {
        return DEFAULT_INSTANCE.createBuilder(cargo$ReportDeliveryRequest);
    }

    public static Cargo$ReportDeliveryRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cargo$ReportDeliveryRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Cargo$ReportDeliveryRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Cargo$ReportDeliveryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Cargo$ReportDeliveryRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Cargo$ReportDeliveryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addContent(int i10, Cargo$CargoPOCounter cargo$CargoPOCounter) {
        cargo$CargoPOCounter.getClass();
        ensureContentIsMutable();
        this.content_.add(i10, cargo$CargoPOCounter);
    }

    public static Cargo$ReportDeliveryRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Cargo$ReportDeliveryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Cargo$ReportDeliveryRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Cargo$ReportDeliveryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Cargo$ReportDeliveryRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Cargo$ReportDeliveryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Cargo$ReportDeliveryRequest parseFrom(InputStream inputStream) throws IOException {
        return (Cargo$ReportDeliveryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Cargo$ReportDeliveryRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cargo$ReportDeliveryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Cargo$ReportDeliveryRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Cargo$ReportDeliveryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Cargo$ReportDeliveryRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cargo$ReportDeliveryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
