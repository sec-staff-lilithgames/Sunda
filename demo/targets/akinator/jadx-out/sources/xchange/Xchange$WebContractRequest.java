package xchange;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import ix.b0;
import ix.c0;
import ix.j;
import ix.m;
import ix.o;
import ix.v;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Xchange$WebContractRequest extends GeneratedMessageLite<Xchange$WebContractRequest, b0> implements c0 {
    public static final int ACCOUNT_FIELD_NUMBER = 1;
    private static final Xchange$WebContractRequest DEFAULT_INSTANCE;
    private static volatile Parser<Xchange$WebContractRequest> PARSER = null;
    public static final int PURCHASE_ORDERS_FIELD_NUMBER = 2;
    public static final int SALE_ORDERS_FIELD_NUMBER = 3;
    private Domain$Account account_;
    private Internal.ProtobufList<Domain$PurchaseOrder> purchaseOrders_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Domain$SaleOrder> saleOrders_ = GeneratedMessageLite.emptyProtobufList();

    static {
        Xchange$WebContractRequest xchange$WebContractRequest = new Xchange$WebContractRequest();
        DEFAULT_INSTANCE = xchange$WebContractRequest;
        GeneratedMessageLite.registerDefaultInstance(Xchange$WebContractRequest.class, xchange$WebContractRequest);
    }

    private Xchange$WebContractRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPurchaseOrders(Iterable<? extends Domain$PurchaseOrder> iterable) {
        ensurePurchaseOrdersIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.purchaseOrders_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSaleOrders(Iterable<? extends Domain$SaleOrder> iterable) {
        ensureSaleOrdersIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.saleOrders_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPurchaseOrders(Domain$PurchaseOrder domain$PurchaseOrder) {
        domain$PurchaseOrder.getClass();
        ensurePurchaseOrdersIsMutable();
        this.purchaseOrders_.add(domain$PurchaseOrder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSaleOrders(Domain$SaleOrder domain$SaleOrder) {
        domain$SaleOrder.getClass();
        ensureSaleOrdersIsMutable();
        this.saleOrders_.add(domain$SaleOrder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccount() {
        this.account_ = null;
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
        Internal.ProtobufList<Domain$PurchaseOrder> protobufList = this.purchaseOrders_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.purchaseOrders_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureSaleOrdersIsMutable() {
        Internal.ProtobufList<Domain$SaleOrder> protobufList = this.saleOrders_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.saleOrders_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Xchange$WebContractRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAccount(Domain$Account domain$Account) {
        domain$Account.getClass();
        Domain$Account domain$Account2 = this.account_;
        if (domain$Account2 == null || domain$Account2 == Domain$Account.getDefaultInstance()) {
            this.account_ = domain$Account;
        } else {
            this.account_ = (Domain$Account) ((j) Domain$Account.newBuilder(this.account_).mergeFrom((j) domain$Account)).buildPartial();
        }
    }

    public static b0 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Xchange$WebContractRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Xchange$WebContractRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Xchange$WebContractRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Xchange$WebContractRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Xchange$WebContractRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePurchaseOrders(int i10) {
        ensurePurchaseOrdersIsMutable();
        this.purchaseOrders_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSaleOrders(int i10) {
        ensureSaleOrdersIsMutable();
        this.saleOrders_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccount(Domain$Account domain$Account) {
        domain$Account.getClass();
        this.account_ = domain$Account;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPurchaseOrders(int i10, Domain$PurchaseOrder domain$PurchaseOrder) {
        domain$PurchaseOrder.getClass();
        ensurePurchaseOrdersIsMutable();
        this.purchaseOrders_.set(i10, domain$PurchaseOrder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSaleOrders(int i10, Domain$SaleOrder domain$SaleOrder) {
        domain$SaleOrder.getClass();
        ensureSaleOrdersIsMutable();
        this.saleOrders_.set(i10, domain$SaleOrder);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (v.f68440a[methodToInvoke.ordinal()]) {
            case 1:
                return new Xchange$WebContractRequest();
            case 2:
                return new b0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\t\u0002\u001b\u0003\u001b", new Object[]{"account_", "purchaseOrders_", Domain$PurchaseOrder.class, "saleOrders_", Domain$SaleOrder.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Xchange$WebContractRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Xchange$WebContractRequest.class) {
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

    @Override // ix.c0
    public Domain$Account getAccount() {
        Domain$Account domain$Account = this.account_;
        return domain$Account == null ? Domain$Account.getDefaultInstance() : domain$Account;
    }

    @Override // ix.c0
    public Domain$PurchaseOrder getPurchaseOrders(int i10) {
        return this.purchaseOrders_.get(i10);
    }

    @Override // ix.c0
    public int getPurchaseOrdersCount() {
        return this.purchaseOrders_.size();
    }

    @Override // ix.c0
    public List<Domain$PurchaseOrder> getPurchaseOrdersList() {
        return this.purchaseOrders_;
    }

    public m getPurchaseOrdersOrBuilder(int i10) {
        return this.purchaseOrders_.get(i10);
    }

    public List<? extends m> getPurchaseOrdersOrBuilderList() {
        return this.purchaseOrders_;
    }

    @Override // ix.c0
    public Domain$SaleOrder getSaleOrders(int i10) {
        return this.saleOrders_.get(i10);
    }

    @Override // ix.c0
    public int getSaleOrdersCount() {
        return this.saleOrders_.size();
    }

    @Override // ix.c0
    public List<Domain$SaleOrder> getSaleOrdersList() {
        return this.saleOrders_;
    }

    public o getSaleOrdersOrBuilder(int i10) {
        return this.saleOrders_.get(i10);
    }

    public List<? extends o> getSaleOrdersOrBuilderList() {
        return this.saleOrders_;
    }

    @Override // ix.c0
    public boolean hasAccount() {
        return this.account_ != null;
    }

    public static b0 newBuilder(Xchange$WebContractRequest xchange$WebContractRequest) {
        return DEFAULT_INSTANCE.createBuilder(xchange$WebContractRequest);
    }

    public static Xchange$WebContractRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Xchange$WebContractRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Xchange$WebContractRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Xchange$WebContractRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Xchange$WebContractRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Xchange$WebContractRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPurchaseOrders(int i10, Domain$PurchaseOrder domain$PurchaseOrder) {
        domain$PurchaseOrder.getClass();
        ensurePurchaseOrdersIsMutable();
        this.purchaseOrders_.add(i10, domain$PurchaseOrder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSaleOrders(int i10, Domain$SaleOrder domain$SaleOrder) {
        domain$SaleOrder.getClass();
        ensureSaleOrdersIsMutable();
        this.saleOrders_.add(i10, domain$SaleOrder);
    }

    public static Xchange$WebContractRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Xchange$WebContractRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Xchange$WebContractRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Xchange$WebContractRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Xchange$WebContractRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Xchange$WebContractRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Xchange$WebContractRequest parseFrom(InputStream inputStream) throws IOException {
        return (Xchange$WebContractRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Xchange$WebContractRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Xchange$WebContractRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Xchange$WebContractRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Xchange$WebContractRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Xchange$WebContractRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Xchange$WebContractRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
