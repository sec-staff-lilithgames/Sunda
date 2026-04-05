package xchange;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import ix.i;
import ix.j;
import ix.k;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Domain$Account extends GeneratedMessageLite<Domain$Account, j> implements k {
    private static final Domain$Account DEFAULT_INSTANCE;
    public static final int IAB_ID_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile Parser<Domain$Account> PARSER = null;
    public static final int PURCHASE_ORDERS_FIELD_NUMBER = 4;
    public static final int SALE_ORDERS_FIELD_NUMBER = 5;
    private int iabId_;
    private String id_ = "";
    private String name_ = "";
    private Internal.ProtobufList<String> purchaseOrders_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> saleOrders_ = GeneratedMessageLite.emptyProtobufList();

    static {
        Domain$Account domain$Account = new Domain$Account();
        DEFAULT_INSTANCE = domain$Account;
        GeneratedMessageLite.registerDefaultInstance(Domain$Account.class, domain$Account);
    }

    private Domain$Account() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPurchaseOrders(Iterable<String> iterable) {
        ensurePurchaseOrdersIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.purchaseOrders_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSaleOrders(Iterable<String> iterable) {
        ensureSaleOrdersIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.saleOrders_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPurchaseOrders(String str) {
        str.getClass();
        ensurePurchaseOrdersIsMutable();
        this.purchaseOrders_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPurchaseOrdersBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensurePurchaseOrdersIsMutable();
        this.purchaseOrders_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSaleOrders(String str) {
        str.getClass();
        ensureSaleOrdersIsMutable();
        this.saleOrders_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSaleOrdersBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureSaleOrdersIsMutable();
        this.saleOrders_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIabId() {
        this.iabId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPurchaseOrders() {
        this.purchaseOrders_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSaleOrders() {
        this.saleOrders_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensurePurchaseOrdersIsMutable() {
        Internal.ProtobufList<String> protobufList = this.purchaseOrders_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.purchaseOrders_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureSaleOrdersIsMutable() {
        Internal.ProtobufList<String> protobufList = this.saleOrders_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.saleOrders_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Domain$Account getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static j newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Domain$Account parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Domain$Account) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Domain$Account parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Domain$Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Domain$Account> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIabId(int i10) {
        this.iabId_ = i10;
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
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPurchaseOrders(int i10, String str) {
        str.getClass();
        ensurePurchaseOrdersIsMutable();
        this.purchaseOrders_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSaleOrders(int i10, String str) {
        str.getClass();
        ensureSaleOrdersIsMutable();
        this.saleOrders_.set(i10, str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (i.f68432a[methodToInvoke.ordinal()]) {
            case 1:
                return new Domain$Account();
            case 2:
                return new j(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004Ț\u0005Ț", new Object[]{"id_", "name_", "iabId_", "purchaseOrders_", "saleOrders_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Domain$Account> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Domain$Account.class) {
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

    @Override // ix.k
    public int getIabId() {
        return this.iabId_;
    }

    @Override // ix.k
    public String getId() {
        return this.id_;
    }

    @Override // ix.k
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    @Override // ix.k
    public String getName() {
        return this.name_;
    }

    @Override // ix.k
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // ix.k
    public String getPurchaseOrders(int i10) {
        return this.purchaseOrders_.get(i10);
    }

    @Override // ix.k
    public ByteString getPurchaseOrdersBytes(int i10) {
        return ByteString.copyFromUtf8(this.purchaseOrders_.get(i10));
    }

    @Override // ix.k
    public int getPurchaseOrdersCount() {
        return this.purchaseOrders_.size();
    }

    @Override // ix.k
    public List<String> getPurchaseOrdersList() {
        return this.purchaseOrders_;
    }

    @Override // ix.k
    public String getSaleOrders(int i10) {
        return this.saleOrders_.get(i10);
    }

    @Override // ix.k
    public ByteString getSaleOrdersBytes(int i10) {
        return ByteString.copyFromUtf8(this.saleOrders_.get(i10));
    }

    @Override // ix.k
    public int getSaleOrdersCount() {
        return this.saleOrders_.size();
    }

    @Override // ix.k
    public List<String> getSaleOrdersList() {
        return this.saleOrders_;
    }

    public static j newBuilder(Domain$Account domain$Account) {
        return DEFAULT_INSTANCE.createBuilder(domain$Account);
    }

    public static Domain$Account parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Domain$Account) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Domain$Account parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Domain$Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Domain$Account parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Domain$Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Domain$Account parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Domain$Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Domain$Account parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Domain$Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Domain$Account parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Domain$Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Domain$Account parseFrom(InputStream inputStream) throws IOException {
        return (Domain$Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Domain$Account parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Domain$Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Domain$Account parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Domain$Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Domain$Account parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Domain$Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
