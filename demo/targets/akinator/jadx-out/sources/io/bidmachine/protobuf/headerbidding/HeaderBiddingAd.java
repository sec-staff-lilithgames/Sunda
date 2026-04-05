package io.bidmachine.protobuf.headerbidding;

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
public final class HeaderBiddingAd extends k7 implements HeaderBiddingAdOrBuilder {
    public static final int BIDDER_FIELD_NUMBER = 1;
    public static final int CLIENT_PARAMS_FIELD_NUMBER = 2;
    private static final HeaderBiddingAd DEFAULT_INSTANCE = new HeaderBiddingAd();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.headerbidding.HeaderBiddingAd.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public HeaderBiddingAd parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new HeaderBiddingAd(yVar, m5Var);
        }
    };
    public static final int SERVER_PARAMS_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private volatile Object bidder_;
    private b9 clientParams_;
    private byte memoizedIsInitialized;
    private b9 serverParams_;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ClientParamsDefaultEntryHolder {
        static final s8 defaultEntry;

        static {
            Descriptors.Descriptor descriptor = HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_ClientParamsEntry_descriptor;
            xc xcVar = bd.f21956f;
            defaultEntry = s8.newDefaultInstance(descriptor, xcVar, "", xcVar, "");
        }

        private ClientParamsDefaultEntryHolder() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ServerParamsDefaultEntryHolder {
        static final s8 defaultEntry;

        static {
            Descriptors.Descriptor descriptor = HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_ServerParamsEntry_descriptor;
            xc xcVar = bd.f21956f;
            defaultEntry = s8.newDefaultInstance(descriptor, xcVar, "", xcVar, "");
        }

        private ServerParamsDefaultEntryHolder() {
        }
    }

    public static HeaderBiddingAd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b9 internalGetClientParams() {
        b9 b9Var = this.clientParams_;
        return b9Var == null ? b9.emptyMapField(ClientParamsDefaultEntryHolder.defaultEntry) : b9Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b9 internalGetServerParams() {
        b9 b9Var = this.serverParams_;
        return b9Var == null ? b9.emptyMapField(ServerParamsDefaultEntryHolder.defaultEntry) : b9Var;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static HeaderBiddingAd parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HeaderBiddingAd) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static HeaderBiddingAd parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HeaderBiddingAd) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public boolean containsClientParams(String str) {
        str.getClass();
        return internalGetClientParams().getMap().containsKey(str);
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public boolean containsServerParams(String str) {
        str.getClass();
        return internalGetServerParams().getMap().containsKey(str);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeaderBiddingAd)) {
            return super.equals(obj);
        }
        HeaderBiddingAd headerBiddingAd = (HeaderBiddingAd) obj;
        return getBidder().equals(headerBiddingAd.getBidder()) && internalGetClientParams().equals(headerBiddingAd.internalGetClientParams()) && internalGetServerParams().equals(headerBiddingAd.internalGetServerParams()) && this.unknownFields.equals(headerBiddingAd.unknownFields);
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public String getBidder() {
        Object obj = this.bidder_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bidder_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public ByteString getBidderBytes() {
        Object obj = this.bidder_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.bidder_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    @Deprecated
    public Map<String, String> getClientParams() {
        return getClientParamsMap();
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public int getClientParamsCount() {
        return internalGetClientParams().getMap().size();
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public Map<String, String> getClientParamsMap() {
        return internalGetClientParams().getMap();
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public String getClientParamsOrDefault(String str, String str2) {
        str.getClass();
        Map<Object, Object> map = internalGetClientParams().getMap();
        return map.containsKey(str) ? (String) map.get(str) : str2;
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public String getClientParamsOrThrow(String str) {
        str.getClass();
        Map<Object, Object> map = internalGetClientParams().getMap();
        if (map.containsKey(str)) {
            return (String) map.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getBidderBytes().isEmpty() ? k7.computeStringSize(1, this.bidder_) : 0;
        Iterator itN = a.n(internalGetClientParams());
        while (itN.hasNext()) {
            Map.Entry entry = (Map.Entry) itN.next();
            iComputeStringSize = a.g(entry, ClientParamsDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()), 2, iComputeStringSize);
        }
        Iterator itN2 = a.n(internalGetServerParams());
        while (itN2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itN2.next();
            iComputeStringSize = a.g(entry2, ServerParamsDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry2.getKey()), 3, iComputeStringSize);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    @Deprecated
    public Map<String, String> getServerParams() {
        return getServerParamsMap();
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public int getServerParamsCount() {
        return internalGetServerParams().getMap().size();
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public Map<String, String> getServerParamsMap() {
        return internalGetServerParams().getMap();
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public String getServerParamsOrDefault(String str, String str2) {
        str.getClass();
        Map<Object, Object> map = internalGetServerParams().getMap();
        return map.containsKey(str) ? (String) map.get(str) : str2;
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public String getServerParamsOrThrow(String str) {
        str.getClass();
        Map<Object, Object> map = internalGetServerParams().getMap();
        if (map.containsKey(str)) {
            return (String) map.get(str);
        }
        throw new IllegalArgumentException();
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
        int iHashCode = getBidder().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
        if (!internalGetClientParams().getMap().isEmpty()) {
            iHashCode = internalGetClientParams().hashCode() + o2.B(iHashCode, 37, 2, 53);
        }
        if (!internalGetServerParams().getMap().isEmpty()) {
            iHashCode = internalGetServerParams().hashCode() + o2.B(iHashCode, 37, 3, 53);
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_fieldAccessorTable.ensureFieldAccessorsInitialized(HeaderBiddingAd.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.k7
    public b9 internalGetMapField(int i10) {
        if (i10 == 2) {
            return internalGetClientParams();
        }
        if (i10 == 3) {
            return internalGetServerParams();
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
        return new HeaderBiddingAd();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (!getBidderBytes().isEmpty()) {
            k7.writeString(h0Var, 1, this.bidder_);
        }
        k7.serializeStringMapTo(h0Var, internalGetClientParams(), ClientParamsDefaultEntryHolder.defaultEntry, 2);
        k7.serializeStringMapTo(h0Var, internalGetServerParams(), ServerParamsDefaultEntryHolder.defaultEntry, 3);
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements HeaderBiddingAdOrBuilder {
        private Object bidder_;
        private int bitField0_;
        private b9 clientParams_;
        private b9 serverParams_;

        private Builder() {
            super(null);
            this.bidder_ = "";
            maybeForceBuilderInitialization();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_descriptor;
        }

        private b9 internalGetClientParams() {
            b9 b9Var = this.clientParams_;
            return b9Var == null ? b9.emptyMapField(ClientParamsDefaultEntryHolder.defaultEntry) : b9Var;
        }

        private b9 internalGetMutableClientParams() {
            onChanged();
            if (this.clientParams_ == null) {
                this.clientParams_ = b9.newMapField(ClientParamsDefaultEntryHolder.defaultEntry);
            }
            if (!this.clientParams_.isMutable()) {
                this.clientParams_ = this.clientParams_.copy();
            }
            return this.clientParams_;
        }

        private b9 internalGetMutableServerParams() {
            onChanged();
            if (this.serverParams_ == null) {
                this.serverParams_ = b9.newMapField(ServerParamsDefaultEntryHolder.defaultEntry);
            }
            if (!this.serverParams_.isMutable()) {
                this.serverParams_ = this.serverParams_.copy();
            }
            return this.serverParams_;
        }

        private b9 internalGetServerParams() {
            b9 b9Var = this.serverParams_;
            return b9Var == null ? b9.emptyMapField(ServerParamsDefaultEntryHolder.defaultEntry) : b9Var;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = k7.alwaysUseFieldBuilders;
        }

        public Builder clearBidder() {
            this.bidder_ = HeaderBiddingAd.getDefaultInstance().getBidder();
            onChanged();
            return this;
        }

        public Builder clearClientParams() {
            internalGetMutableClientParams().getMutableMap().clear();
            return this;
        }

        public Builder clearServerParams() {
            internalGetMutableServerParams().getMutableMap().clear();
            return this;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public boolean containsClientParams(String str) {
            str.getClass();
            return internalGetClientParams().getMap().containsKey(str);
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public boolean containsServerParams(String str) {
            str.getClass();
            return internalGetServerParams().getMap().containsKey(str);
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public String getBidder() {
            Object obj = this.bidder_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bidder_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public ByteString getBidderBytes() {
            Object obj = this.bidder_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bidder_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        @Deprecated
        public Map<String, String> getClientParams() {
            return getClientParamsMap();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public int getClientParamsCount() {
            return internalGetClientParams().getMap().size();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public Map<String, String> getClientParamsMap() {
            return internalGetClientParams().getMap();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public String getClientParamsOrDefault(String str, String str2) {
            str.getClass();
            Map<Object, Object> map = internalGetClientParams().getMap();
            return map.containsKey(str) ? (String) map.get(str) : str2;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public String getClientParamsOrThrow(String str) {
            str.getClass();
            Map<Object, Object> map = internalGetClientParams().getMap();
            if (map.containsKey(str)) {
                return (String) map.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_descriptor;
        }

        @Deprecated
        public Map<String, String> getMutableClientParams() {
            return internalGetMutableClientParams().getMutableMap();
        }

        @Deprecated
        public Map<String, String> getMutableServerParams() {
            return internalGetMutableServerParams().getMutableMap();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        @Deprecated
        public Map<String, String> getServerParams() {
            return getServerParamsMap();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public int getServerParamsCount() {
            return internalGetServerParams().getMap().size();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public Map<String, String> getServerParamsMap() {
            return internalGetServerParams().getMap();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public String getServerParamsOrDefault(String str, String str2) {
            str.getClass();
            Map<Object, Object> map = internalGetServerParams().getMap();
            return map.containsKey(str) ? (String) map.get(str) : str2;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public String getServerParamsOrThrow(String str) {
            str.getClass();
            Map<Object, Object> map = internalGetServerParams().getMap();
            if (map.containsKey(str)) {
                return (String) map.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_fieldAccessorTable.ensureFieldAccessorsInitialized(HeaderBiddingAd.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6
        public b9 internalGetMapField(int i10) {
            if (i10 == 2) {
                return internalGetClientParams();
            }
            if (i10 == 3) {
                return internalGetServerParams();
            }
            throw new RuntimeException(b.e(i10, "Invalid map field number: "));
        }

        @Override // com.explorestack.protobuf.o6
        public b9 internalGetMutableMapField(int i10) {
            if (i10 == 2) {
                return internalGetMutableClientParams();
            }
            if (i10 == 3) {
                return internalGetMutableServerParams();
            }
            throw new RuntimeException(b.e(i10, "Invalid map field number: "));
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder putAllClientParams(Map<String, String> map) {
            internalGetMutableClientParams().getMutableMap().putAll(map);
            return this;
        }

        public Builder putAllServerParams(Map<String, String> map) {
            internalGetMutableServerParams().getMutableMap().putAll(map);
            return this;
        }

        public Builder putClientParams(String str, String str2) {
            str.getClass();
            str2.getClass();
            internalGetMutableClientParams().getMutableMap().put(str, str2);
            return this;
        }

        public Builder putServerParams(String str, String str2) {
            str.getClass();
            str2.getClass();
            internalGetMutableServerParams().getMutableMap().put(str, str2);
            return this;
        }

        public Builder removeClientParams(String str) {
            str.getClass();
            internalGetMutableClientParams().getMutableMap().remove(str);
            return this;
        }

        public Builder removeServerParams(String str) {
            str.getClass();
            internalGetMutableServerParams().getMutableMap().remove(str);
            return this;
        }

        public Builder setBidder(String str) {
            str.getClass();
            this.bidder_ = str;
            onChanged();
            return this;
        }

        public Builder setBidderBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            this.bidder_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public HeaderBiddingAd build() {
            HeaderBiddingAd headerBiddingAdBuildPartial = buildPartial();
            if (headerBiddingAdBuildPartial.isInitialized()) {
                return headerBiddingAdBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) headerBiddingAdBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public HeaderBiddingAd buildPartial() {
            HeaderBiddingAd headerBiddingAd = new HeaderBiddingAd(this);
            headerBiddingAd.bidder_ = this.bidder_;
            headerBiddingAd.clientParams_ = internalGetClientParams();
            headerBiddingAd.clientParams_.makeImmutable();
            headerBiddingAd.serverParams_ = internalGetServerParams();
            headerBiddingAd.serverParams_.makeImmutable();
            onBuilt();
            return headerBiddingAd;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public HeaderBiddingAd getDefaultInstanceForType() {
            return HeaderBiddingAd.getDefaultInstance();
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
            this.bidder_ = "";
            internalGetMutableClientParams().clear();
            internalGetMutableServerParams().clear();
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            this.bidder_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
        /* renamed from: clone */
        public Builder mo500clone() {
            return (Builder) super.mo500clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof HeaderBiddingAd) {
                return mergeFrom((HeaderBiddingAd) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(HeaderBiddingAd headerBiddingAd) {
            if (headerBiddingAd == HeaderBiddingAd.getDefaultInstance()) {
                return this;
            }
            if (!headerBiddingAd.getBidder().isEmpty()) {
                this.bidder_ = headerBiddingAd.bidder_;
                onChanged();
            }
            internalGetMutableClientParams().mergeFrom(headerBiddingAd.internalGetClientParams());
            internalGetMutableServerParams().mergeFrom(headerBiddingAd.internalGetServerParams());
            mergeUnknownFields(((k7) headerBiddingAd).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.bidmachine.protobuf.headerbidding.HeaderBiddingAd.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.headerbidding.HeaderBiddingAd.access$1000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.headerbidding.HeaderBiddingAd r3 = (io.bidmachine.protobuf.headerbidding.HeaderBiddingAd) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.headerbidding.HeaderBiddingAd r4 = (io.bidmachine.protobuf.headerbidding.HeaderBiddingAd) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.headerbidding.HeaderBiddingAd.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.headerbidding.HeaderBiddingAd$Builder");
        }
    }

    public static Builder newBuilder(HeaderBiddingAd headerBiddingAd) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(headerBiddingAd);
    }

    public static HeaderBiddingAd parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (HeaderBiddingAd) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private HeaderBiddingAd(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static HeaderBiddingAd parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (HeaderBiddingAd) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static HeaderBiddingAd parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HeaderBiddingAd) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public HeaderBiddingAd getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static HeaderBiddingAd parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (HeaderBiddingAd) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private HeaderBiddingAd() {
        this.memoizedIsInitialized = (byte) -1;
        this.bidder_ = "";
    }

    public static HeaderBiddingAd parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HeaderBiddingAd) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static HeaderBiddingAd parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (HeaderBiddingAd) PARSER.parseFrom(bArr, m5Var);
    }

    public static HeaderBiddingAd parseFrom(InputStream inputStream) throws IOException {
        return (HeaderBiddingAd) k7.parseWithIOException(PARSER, inputStream);
    }

    private HeaderBiddingAd(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        this();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int tag = yVar.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                this.bidder_ = yVar.readStringRequireUtf8();
                            } else if (tag == 18) {
                                if ((i10 & 1) == 0) {
                                    this.clientParams_ = b9.newMapField(ClientParamsDefaultEntryHolder.defaultEntry);
                                    i10 |= 1;
                                }
                                s8 s8Var = (s8) yVar.readMessage(ClientParamsDefaultEntryHolder.defaultEntry.getParserForType(), m5Var);
                                this.clientParams_.getMutableMap().put(s8Var.getKey(), s8Var.getValue());
                            } else if (tag != 26) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                if ((i10 & 2) == 0) {
                                    this.serverParams_ = b9.newMapField(ServerParamsDefaultEntryHolder.defaultEntry);
                                    i10 |= 2;
                                }
                                s8 s8Var2 = (s8) yVar.readMessage(ServerParamsDefaultEntryHolder.defaultEntry.getParserForType(), m5Var);
                                this.serverParams_.getMutableMap().put(s8Var2.getKey(), s8Var2.getValue());
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

    public static HeaderBiddingAd parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (HeaderBiddingAd) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static HeaderBiddingAd parseFrom(y yVar) throws IOException {
        return (HeaderBiddingAd) k7.parseWithIOException(PARSER, yVar);
    }

    public static HeaderBiddingAd parseFrom(y yVar, m5 m5Var) throws IOException {
        return (HeaderBiddingAd) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
