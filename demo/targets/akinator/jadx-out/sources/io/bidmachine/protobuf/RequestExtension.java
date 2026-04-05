package io.bidmachine.protobuf;

import a.b;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.b9;
import com.explorestack.protobuf.bd;
import com.explorestack.protobuf.cc;
import com.explorestack.protobuf.d;
import com.explorestack.protobuf.fa;
import com.explorestack.protobuf.gc;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.j7;
import com.explorestack.protobuf.k7;
import com.explorestack.protobuf.m5;
import com.explorestack.protobuf.o6;
import com.explorestack.protobuf.p6;
import com.explorestack.protobuf.s8;
import com.explorestack.protobuf.xc;
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class RequestExtension extends k7 implements RequestExtensionOrBuilder {
    public static final int BM_IFV_FIELD_NUMBER = 5;
    public static final int HEADER_BIDDING_TYPE_FIELD_NUMBER = 3;
    public static final int IFV_FIELD_NUMBER = 4;
    public static final int INTEGRATION_TYPE_FIELD_NUMBER = 7;
    public static final int SELLER_DATA_FIELD_NUMBER = 2;
    public static final int SELLER_ID_FIELD_NUMBER = 1;
    public static final int SESSION_ID_FIELD_NUMBER = 6;
    private static final long serialVersionUID = 0;
    private volatile Object bmIfv_;
    private int headerBiddingType_;
    private volatile Object ifv_;
    private volatile Object integrationType_;
    private byte memoizedIsInitialized;
    private b9 sellerData_;
    private volatile Object sellerId_;
    private volatile Object sessionId_;
    private static final RequestExtension DEFAULT_INSTANCE = new RequestExtension();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.RequestExtension.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public RequestExtension parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new RequestExtension(yVar, m5Var);
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class SellerDataDefaultEntryHolder {
        static final s8 defaultEntry;

        static {
            Descriptors.Descriptor descriptor = ExtensionsProto.internal_static_bidmachine_protobuf_RequestExtension_SellerDataEntry_descriptor;
            xc xcVar = bd.f21956f;
            defaultEntry = s8.newDefaultInstance(descriptor, xcVar, "", xcVar, "");
        }

        private SellerDataDefaultEntryHolder() {
        }
    }

    public static RequestExtension getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_RequestExtension_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b9 internalGetSellerData() {
        b9 b9Var = this.sellerData_;
        return b9Var == null ? b9.emptyMapField(SellerDataDefaultEntryHolder.defaultEntry) : b9Var;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static RequestExtension parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RequestExtension) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static RequestExtension parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RequestExtension) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public boolean containsSellerData(String str) {
        str.getClass();
        return internalGetSellerData().getMap().containsKey(str);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RequestExtension)) {
            return super.equals(obj);
        }
        RequestExtension requestExtension = (RequestExtension) obj;
        return getSellerId().equals(requestExtension.getSellerId()) && internalGetSellerData().equals(requestExtension.internalGetSellerData()) && this.headerBiddingType_ == requestExtension.headerBiddingType_ && getIfv().equals(requestExtension.getIfv()) && getBmIfv().equals(requestExtension.getBmIfv()) && getSessionId().equals(requestExtension.getSessionId()) && getIntegrationType().equals(requestExtension.getIntegrationType()) && this.unknownFields.equals(requestExtension.unknownFields);
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public String getBmIfv() {
        Object obj = this.bmIfv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bmIfv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public ByteString getBmIfvBytes() {
        Object obj = this.bmIfv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.bmIfv_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public HeaderBiddingType getHeaderBiddingType() {
        HeaderBiddingType headerBiddingTypeValueOf = HeaderBiddingType.valueOf(this.headerBiddingType_);
        return headerBiddingTypeValueOf == null ? HeaderBiddingType.UNRECOGNIZED : headerBiddingTypeValueOf;
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public int getHeaderBiddingTypeValue() {
        return this.headerBiddingType_;
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public String getIfv() {
        Object obj = this.ifv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ifv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public ByteString getIfvBytes() {
        Object obj = this.ifv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.ifv_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public String getIntegrationType() {
        Object obj = this.integrationType_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.integrationType_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public ByteString getIntegrationTypeBytes() {
        Object obj = this.integrationType_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.integrationType_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    @Deprecated
    public Map<String, String> getSellerData() {
        return getSellerDataMap();
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public int getSellerDataCount() {
        return internalGetSellerData().getMap().size();
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public Map<String, String> getSellerDataMap() {
        return internalGetSellerData().getMap();
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public String getSellerDataOrDefault(String str, String str2) {
        str.getClass();
        Map<Object, Object> map = internalGetSellerData().getMap();
        return map.containsKey(str) ? (String) map.get(str) : str2;
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public String getSellerDataOrThrow(String str) {
        str.getClass();
        Map<Object, Object> map = internalGetSellerData().getMap();
        if (map.containsKey(str)) {
            return (String) map.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public String getSellerId() {
        Object obj = this.sellerId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sellerId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public ByteString getSellerIdBytes() {
        Object obj = this.sellerId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sellerId_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getSellerIdBytes().isEmpty() ? k7.computeStringSize(1, this.sellerId_) : 0;
        Iterator itN = a.n(internalGetSellerData());
        while (itN.hasNext()) {
            Map.Entry entry = (Map.Entry) itN.next();
            iComputeStringSize = a.g(entry, SellerDataDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()), 2, iComputeStringSize);
        }
        if (this.headerBiddingType_ != HeaderBiddingType.HEADER_BIDDING_TYPE_INVALID.getNumber()) {
            iComputeStringSize += h0.computeEnumSize(3, this.headerBiddingType_);
        }
        if (!getIfvBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(4, this.ifv_);
        }
        if (!getBmIfvBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(5, this.bmIfv_);
        }
        if (!getSessionIdBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(6, this.sessionId_);
        }
        if (!getIntegrationTypeBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(7, this.integrationType_);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public String getSessionId() {
        Object obj = this.sessionId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sessionId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
    public ByteString getSessionIdBytes() {
        Object obj = this.sessionId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sessionId_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getSellerId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
        if (!internalGetSellerData().getMap().isEmpty()) {
            iHashCode = internalGetSellerData().hashCode() + o2.B(iHashCode, 37, 2, 53);
        }
        int iHashCode2 = this.unknownFields.hashCode() + ((getIntegrationType().hashCode() + ((((getSessionId().hashCode() + ((((getBmIfv().hashCode() + ((((getIfv().hashCode() + a.d(o2.B(iHashCode, 37, 3, 53), this.headerBiddingType_, 37, 4, 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_RequestExtension_fieldAccessorTable.ensureFieldAccessorsInitialized(RequestExtension.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.k7
    public b9 internalGetMapField(int i10) {
        if (i10 == 2) {
            return internalGetSellerData();
        }
        throw new RuntimeException(b.e(i10, "Invalid map field number: "));
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.memoizedIsInitialized;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.k7
    public Object newInstance(j7 j7Var) {
        return new RequestExtension();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (!getSellerIdBytes().isEmpty()) {
            k7.writeString(h0Var, 1, this.sellerId_);
        }
        k7.serializeStringMapTo(h0Var, internalGetSellerData(), SellerDataDefaultEntryHolder.defaultEntry, 2);
        if (this.headerBiddingType_ != HeaderBiddingType.HEADER_BIDDING_TYPE_INVALID.getNumber()) {
            h0Var.writeEnum(3, this.headerBiddingType_);
        }
        if (!getIfvBytes().isEmpty()) {
            k7.writeString(h0Var, 4, this.ifv_);
        }
        if (!getBmIfvBytes().isEmpty()) {
            k7.writeString(h0Var, 5, this.bmIfv_);
        }
        if (!getSessionIdBytes().isEmpty()) {
            k7.writeString(h0Var, 6, this.sessionId_);
        }
        if (!getIntegrationTypeBytes().isEmpty()) {
            k7.writeString(h0Var, 7, this.integrationType_);
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements RequestExtensionOrBuilder {
        private int bitField0_;
        private Object bmIfv_;
        private int headerBiddingType_;
        private Object ifv_;
        private Object integrationType_;
        private b9 sellerData_;
        private Object sellerId_;
        private Object sessionId_;

        private Builder() {
            super(null);
            this.sellerId_ = "";
            this.headerBiddingType_ = 0;
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.sessionId_ = "";
            this.integrationType_ = "";
            maybeForceBuilderInitialization();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_RequestExtension_descriptor;
        }

        private b9 internalGetMutableSellerData() {
            onChanged();
            if (this.sellerData_ == null) {
                this.sellerData_ = b9.newMapField(SellerDataDefaultEntryHolder.defaultEntry);
            }
            if (!this.sellerData_.isMutable()) {
                this.sellerData_ = this.sellerData_.copy();
            }
            return this.sellerData_;
        }

        private b9 internalGetSellerData() {
            b9 b9Var = this.sellerData_;
            return b9Var == null ? b9.emptyMapField(SellerDataDefaultEntryHolder.defaultEntry) : b9Var;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = k7.alwaysUseFieldBuilders;
        }

        public Builder clearBmIfv() {
            this.bmIfv_ = RequestExtension.getDefaultInstance().getBmIfv();
            onChanged();
            return this;
        }

        public Builder clearHeaderBiddingType() {
            this.headerBiddingType_ = 0;
            onChanged();
            return this;
        }

        public Builder clearIfv() {
            this.ifv_ = RequestExtension.getDefaultInstance().getIfv();
            onChanged();
            return this;
        }

        public Builder clearIntegrationType() {
            this.integrationType_ = RequestExtension.getDefaultInstance().getIntegrationType();
            onChanged();
            return this;
        }

        public Builder clearSellerData() {
            internalGetMutableSellerData().getMutableMap().clear();
            return this;
        }

        public Builder clearSellerId() {
            this.sellerId_ = RequestExtension.getDefaultInstance().getSellerId();
            onChanged();
            return this;
        }

        public Builder clearSessionId() {
            this.sessionId_ = RequestExtension.getDefaultInstance().getSessionId();
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public boolean containsSellerData(String str) {
            str.getClass();
            return internalGetSellerData().getMap().containsKey(str);
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public String getBmIfv() {
            Object obj = this.bmIfv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bmIfv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public ByteString getBmIfvBytes() {
            Object obj = this.bmIfv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bmIfv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_RequestExtension_descriptor;
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public HeaderBiddingType getHeaderBiddingType() {
            HeaderBiddingType headerBiddingTypeValueOf = HeaderBiddingType.valueOf(this.headerBiddingType_);
            return headerBiddingTypeValueOf == null ? HeaderBiddingType.UNRECOGNIZED : headerBiddingTypeValueOf;
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public int getHeaderBiddingTypeValue() {
            return this.headerBiddingType_;
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public String getIfv() {
            Object obj = this.ifv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ifv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public ByteString getIfvBytes() {
            Object obj = this.ifv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ifv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public String getIntegrationType() {
            Object obj = this.integrationType_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.integrationType_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public ByteString getIntegrationTypeBytes() {
            Object obj = this.integrationType_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.integrationType_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Deprecated
        public Map<String, String> getMutableSellerData() {
            return internalGetMutableSellerData().getMutableMap();
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        @Deprecated
        public Map<String, String> getSellerData() {
            return getSellerDataMap();
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public int getSellerDataCount() {
            return internalGetSellerData().getMap().size();
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public Map<String, String> getSellerDataMap() {
            return internalGetSellerData().getMap();
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public String getSellerDataOrDefault(String str, String str2) {
            str.getClass();
            Map<Object, Object> map = internalGetSellerData().getMap();
            return map.containsKey(str) ? (String) map.get(str) : str2;
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public String getSellerDataOrThrow(String str) {
            str.getClass();
            Map<Object, Object> map = internalGetSellerData().getMap();
            if (map.containsKey(str)) {
                return (String) map.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public String getSellerId() {
            Object obj = this.sellerId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sellerId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public ByteString getSellerIdBytes() {
            Object obj = this.sellerId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sellerId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public String getSessionId() {
            Object obj = this.sessionId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sessionId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestExtensionOrBuilder
        public ByteString getSessionIdBytes() {
            Object obj = this.sessionId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sessionId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_RequestExtension_fieldAccessorTable.ensureFieldAccessorsInitialized(RequestExtension.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6
        public b9 internalGetMapField(int i10) {
            if (i10 == 2) {
                return internalGetSellerData();
            }
            throw new RuntimeException(b.e(i10, "Invalid map field number: "));
        }

        @Override // com.explorestack.protobuf.o6
        public b9 internalGetMutableMapField(int i10) {
            if (i10 == 2) {
                return internalGetMutableSellerData();
            }
            throw new RuntimeException(b.e(i10, "Invalid map field number: "));
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder putAllSellerData(Map<String, String> map) {
            internalGetMutableSellerData().getMutableMap().putAll(map);
            return this;
        }

        public Builder putSellerData(String str, String str2) {
            str.getClass();
            str2.getClass();
            internalGetMutableSellerData().getMutableMap().put(str, str2);
            return this;
        }

        public Builder removeSellerData(String str) {
            str.getClass();
            internalGetMutableSellerData().getMutableMap().remove(str);
            return this;
        }

        public Builder setBmIfv(String str) {
            str.getClass();
            this.bmIfv_ = str;
            onChanged();
            return this;
        }

        public Builder setBmIfvBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            this.bmIfv_ = byteString;
            onChanged();
            return this;
        }

        public Builder setHeaderBiddingType(HeaderBiddingType headerBiddingType) {
            headerBiddingType.getClass();
            this.headerBiddingType_ = headerBiddingType.getNumber();
            onChanged();
            return this;
        }

        public Builder setHeaderBiddingTypeValue(int i10) {
            this.headerBiddingType_ = i10;
            onChanged();
            return this;
        }

        public Builder setIfv(String str) {
            str.getClass();
            this.ifv_ = str;
            onChanged();
            return this;
        }

        public Builder setIfvBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            this.ifv_ = byteString;
            onChanged();
            return this;
        }

        public Builder setIntegrationType(String str) {
            str.getClass();
            this.integrationType_ = str;
            onChanged();
            return this;
        }

        public Builder setIntegrationTypeBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            this.integrationType_ = byteString;
            onChanged();
            return this;
        }

        public Builder setSellerId(String str) {
            str.getClass();
            this.sellerId_ = str;
            onChanged();
            return this;
        }

        public Builder setSellerIdBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            this.sellerId_ = byteString;
            onChanged();
            return this;
        }

        public Builder setSessionId(String str) {
            str.getClass();
            this.sessionId_ = str;
            onChanged();
            return this;
        }

        public Builder setSessionIdBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            this.sessionId_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public RequestExtension build() {
            RequestExtension requestExtensionBuildPartial = buildPartial();
            if (requestExtensionBuildPartial.isInitialized()) {
                return requestExtensionBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) requestExtensionBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public RequestExtension buildPartial() {
            RequestExtension requestExtension = new RequestExtension(this);
            requestExtension.sellerId_ = this.sellerId_;
            requestExtension.sellerData_ = internalGetSellerData();
            requestExtension.sellerData_.makeImmutable();
            requestExtension.headerBiddingType_ = this.headerBiddingType_;
            requestExtension.ifv_ = this.ifv_;
            requestExtension.bmIfv_ = this.bmIfv_;
            requestExtension.sessionId_ = this.sessionId_;
            requestExtension.integrationType_ = this.integrationType_;
            onBuilt();
            return requestExtension;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public RequestExtension getDefaultInstanceForType() {
            return RequestExtension.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public final Builder setUnknownFields(gc gcVar) {
            return (Builder) super.setUnknownFields(gcVar);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(gc gcVar) {
            return (Builder) super.mergeUnknownFields(gcVar);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.sellerId_ = "";
            internalGetMutableSellerData().clear();
            this.headerBiddingType_ = 0;
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.sessionId_ = "";
            this.integrationType_ = "";
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
        /* renamed from: clone */
        public Builder mo500clone() {
            return (Builder) super.mo500clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof RequestExtension) {
                return mergeFrom((RequestExtension) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(RequestExtension requestExtension) {
            if (requestExtension == RequestExtension.getDefaultInstance()) {
                return this;
            }
            if (!requestExtension.getSellerId().isEmpty()) {
                this.sellerId_ = requestExtension.sellerId_;
                onChanged();
            }
            internalGetMutableSellerData().mergeFrom(requestExtension.internalGetSellerData());
            if (requestExtension.headerBiddingType_ != 0) {
                setHeaderBiddingTypeValue(requestExtension.getHeaderBiddingTypeValue());
            }
            if (!requestExtension.getIfv().isEmpty()) {
                this.ifv_ = requestExtension.ifv_;
                onChanged();
            }
            if (!requestExtension.getBmIfv().isEmpty()) {
                this.bmIfv_ = requestExtension.bmIfv_;
                onChanged();
            }
            if (!requestExtension.getSessionId().isEmpty()) {
                this.sessionId_ = requestExtension.sessionId_;
                onChanged();
            }
            if (!requestExtension.getIntegrationType().isEmpty()) {
                this.integrationType_ = requestExtension.integrationType_;
                onChanged();
            }
            mergeUnknownFields(((k7) requestExtension).unknownFields);
            onChanged();
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            this.sellerId_ = "";
            this.headerBiddingType_ = 0;
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.sessionId_ = "";
            this.integrationType_ = "";
            maybeForceBuilderInitialization();
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.bidmachine.protobuf.RequestExtension.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.RequestExtension.access$1300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.RequestExtension r3 = (io.bidmachine.protobuf.RequestExtension) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                if (r3 == 0) goto L10
                r2.mergeFrom(r3)
            L10:
                return r2
            L11:
                r3 = move-exception
                goto L21
            L13:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                io.bidmachine.protobuf.RequestExtension r4 = (io.bidmachine.protobuf.RequestExtension) r4     // Catch: java.lang.Throwable -> L11
                java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                throw r3     // Catch: java.lang.Throwable -> L1f
            L1f:
                r3 = move-exception
                r0 = r4
            L21:
                if (r0 == 0) goto L26
                r2.mergeFrom(r0)
            L26:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.RequestExtension.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.RequestExtension$Builder");
        }
    }

    public static Builder newBuilder(RequestExtension requestExtension) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(requestExtension);
    }

    public static RequestExtension parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (RequestExtension) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private RequestExtension(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static RequestExtension parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (RequestExtension) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static RequestExtension parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RequestExtension) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public RequestExtension getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static RequestExtension parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (RequestExtension) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private RequestExtension() {
        this.memoizedIsInitialized = (byte) -1;
        this.sellerId_ = "";
        this.headerBiddingType_ = 0;
        this.ifv_ = "";
        this.bmIfv_ = "";
        this.sessionId_ = "";
        this.integrationType_ = "";
    }

    public static RequestExtension parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RequestExtension) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static RequestExtension parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (RequestExtension) PARSER.parseFrom(bArr, m5Var);
    }

    public static RequestExtension parseFrom(InputStream inputStream) throws IOException {
        return (RequestExtension) k7.parseWithIOException(PARSER, inputStream);
    }

    public static RequestExtension parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (RequestExtension) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static RequestExtension parseFrom(y yVar) throws IOException {
        return (RequestExtension) k7.parseWithIOException(PARSER, yVar);
    }

    private RequestExtension(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        this();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int tag = yVar.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                this.sellerId_ = yVar.readStringRequireUtf8();
                            } else if (tag == 18) {
                                if (!z11) {
                                    this.sellerData_ = b9.newMapField(SellerDataDefaultEntryHolder.defaultEntry);
                                    z11 = true;
                                }
                                s8 s8Var = (s8) yVar.readMessage(SellerDataDefaultEntryHolder.defaultEntry.getParserForType(), m5Var);
                                this.sellerData_.getMutableMap().put(s8Var.getKey(), s8Var.getValue());
                            } else if (tag == 24) {
                                this.headerBiddingType_ = yVar.readEnum();
                            } else if (tag == 34) {
                                this.ifv_ = yVar.readStringRequireUtf8();
                            } else if (tag == 42) {
                                this.bmIfv_ = yVar.readStringRequireUtf8();
                            } else if (tag == 50) {
                                this.sessionId_ = yVar.readStringRequireUtf8();
                            } else if (tag != 58) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                this.integrationType_ = yVar.readStringRequireUtf8();
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    }
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                }
            } catch (Throwable th2) {
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        this.unknownFields = ccVarNewBuilder.build();
        makeExtensionsImmutable();
    }

    public static RequestExtension parseFrom(y yVar, m5 m5Var) throws IOException {
        return (RequestExtension) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
