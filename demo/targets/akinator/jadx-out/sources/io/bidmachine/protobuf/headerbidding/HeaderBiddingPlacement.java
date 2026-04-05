package io.bidmachine.protobuf.headerbidding;

import a.b;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.b;
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
import com.explorestack.protobuf.pa;
import com.explorestack.protobuf.s8;
import com.explorestack.protobuf.x7;
import com.explorestack.protobuf.xc;
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class HeaderBiddingPlacement extends k7 implements HeaderBiddingPlacementOrBuilder {
    public static final int AD_UNITS_FIELD_NUMBER = 1;
    private static final HeaderBiddingPlacement DEFAULT_INSTANCE = new HeaderBiddingPlacement();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public HeaderBiddingPlacement parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new HeaderBiddingPlacement(yVar, m5Var);
        }
    };
    private static final long serialVersionUID = 0;
    private List<AdUnit> adUnits_;
    private byte memoizedIsInitialized;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AdUnit extends k7 implements AdUnitOrBuilder {
        public static final int BIDDER_FIELD_NUMBER = 1;
        public static final int BIDDER_SDKVER_FIELD_NUMBER = 2;
        public static final int CLIENT_PARAMS_FIELD_NUMBER = 3;
        private static final AdUnit DEFAULT_INSTANCE = new AdUnit();
        private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnit.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public AdUnit parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new AdUnit(yVar, m5Var);
            }
        };
        public static final int PRICE_ESTIMATE_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private volatile Object bidderSdkver_;
        private volatile Object bidder_;
        private b9 clientParams_;
        private byte memoizedIsInitialized;
        private double priceEstimate_;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class ClientParamsDefaultEntryHolder {
            static final s8 defaultEntry;

            static {
                Descriptors.Descriptor descriptor = HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_ClientParamsEntry_descriptor;
                xc xcVar = bd.f21956f;
                defaultEntry = s8.newDefaultInstance(descriptor, xcVar, "", xcVar, "");
            }

            private ClientParamsDefaultEntryHolder() {
            }
        }

        public static AdUnit getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b9 internalGetClientParams() {
            b9 b9Var = this.clientParams_;
            return b9Var == null ? b9.emptyMapField(ClientParamsDefaultEntryHolder.defaultEntry) : b9Var;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AdUnit parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdUnit) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AdUnit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        public boolean containsClientParams(String str) {
            str.getClass();
            return internalGetClientParams().getMap().containsKey(str);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AdUnit)) {
                return super.equals(obj);
            }
            AdUnit adUnit = (AdUnit) obj;
            return getBidder().equals(adUnit.getBidder()) && getBidderSdkver().equals(adUnit.getBidderSdkver()) && internalGetClientParams().equals(adUnit.internalGetClientParams()) && Double.doubleToLongBits(getPriceEstimate()) == Double.doubleToLongBits(adUnit.getPriceEstimate()) && this.unknownFields.equals(adUnit.unknownFields);
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        public String getBidder() {
            Object obj = this.bidder_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bidder_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        public ByteString getBidderBytes() {
            Object obj = this.bidder_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bidder_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        public String getBidderSdkver() {
            Object obj = this.bidderSdkver_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bidderSdkver_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        public ByteString getBidderSdkverBytes() {
            Object obj = this.bidderSdkver_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bidderSdkver_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        @Deprecated
        public Map<String, String> getClientParams() {
            return getClientParamsMap();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        public int getClientParamsCount() {
            return internalGetClientParams().getMap().size();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        public Map<String, String> getClientParamsMap() {
            return internalGetClientParams().getMap();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        public String getClientParamsOrDefault(String str, String str2) {
            str.getClass();
            Map<Object, Object> map = internalGetClientParams().getMap();
            return map.containsKey(str) ? (String) map.get(str) : str2;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
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

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        public double getPriceEstimate() {
            return this.priceEstimate_;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !getBidderBytes().isEmpty() ? k7.computeStringSize(1, this.bidder_) : 0;
            if (!getBidderSdkverBytes().isEmpty()) {
                iComputeStringSize += k7.computeStringSize(2, this.bidderSdkver_);
            }
            Iterator itN = a.n(internalGetClientParams());
            while (itN.hasNext()) {
                Map.Entry entry = (Map.Entry) itN.next();
                iComputeStringSize = a.g(entry, ClientParamsDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()), 3, iComputeStringSize);
            }
            double d10 = this.priceEstimate_;
            if (d10 != 0.0d) {
                iComputeStringSize += h0.computeDoubleSize(4, d10);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
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
            int iHashCode = getBidderSdkver().hashCode() + ((((getBidder().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
            if (!internalGetClientParams().getMap().isEmpty()) {
                iHashCode = o2.B(iHashCode, 37, 3, 53) + internalGetClientParams().hashCode();
            }
            int iHashCode2 = this.unknownFields.hashCode() + ((x7.hashLong(Double.doubleToLongBits(getPriceEstimate())) + o2.B(iHashCode, 37, 4, 53)) * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_fieldAccessorTable.ensureFieldAccessorsInitialized(AdUnit.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.k7
        public b9 internalGetMapField(int i10) {
            if (i10 == 3) {
                return internalGetClientParams();
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
            return new AdUnit();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            if (!getBidderBytes().isEmpty()) {
                k7.writeString(h0Var, 1, this.bidder_);
            }
            if (!getBidderSdkverBytes().isEmpty()) {
                k7.writeString(h0Var, 2, this.bidderSdkver_);
            }
            k7.serializeStringMapTo(h0Var, internalGetClientParams(), ClientParamsDefaultEntryHolder.defaultEntry, 3);
            double d10 = this.priceEstimate_;
            if (d10 != 0.0d) {
                h0Var.writeDouble(4, d10);
            }
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements AdUnitOrBuilder {
            private Object bidderSdkver_;
            private Object bidder_;
            private int bitField0_;
            private b9 clientParams_;
            private double priceEstimate_;

            private Builder() {
                super(null);
                this.bidder_ = "";
                this.bidderSdkver_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_descriptor;
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

            private void maybeForceBuilderInitialization() {
                boolean unused = k7.alwaysUseFieldBuilders;
            }

            public Builder clearBidder() {
                this.bidder_ = AdUnit.getDefaultInstance().getBidder();
                onChanged();
                return this;
            }

            public Builder clearBidderSdkver() {
                this.bidderSdkver_ = AdUnit.getDefaultInstance().getBidderSdkver();
                onChanged();
                return this;
            }

            public Builder clearClientParams() {
                internalGetMutableClientParams().getMutableMap().clear();
                return this;
            }

            public Builder clearPriceEstimate() {
                this.priceEstimate_ = 0.0d;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            public boolean containsClientParams(String str) {
                str.getClass();
                return internalGetClientParams().getMap().containsKey(str);
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            public String getBidder() {
                Object obj = this.bidder_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.bidder_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            public ByteString getBidderBytes() {
                Object obj = this.bidder_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bidder_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            public String getBidderSdkver() {
                Object obj = this.bidderSdkver_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.bidderSdkver_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            public ByteString getBidderSdkverBytes() {
                Object obj = this.bidderSdkver_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bidderSdkver_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            @Deprecated
            public Map<String, String> getClientParams() {
                return getClientParamsMap();
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            public int getClientParamsCount() {
                return internalGetClientParams().getMap().size();
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            public Map<String, String> getClientParamsMap() {
                return internalGetClientParams().getMap();
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            public String getClientParamsOrDefault(String str, String str2) {
                str.getClass();
                Map<Object, Object> map = internalGetClientParams().getMap();
                return map.containsKey(str) ? (String) map.get(str) : str2;
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
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
                return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_descriptor;
            }

            @Deprecated
            public Map<String, String> getMutableClientParams() {
                return internalGetMutableClientParams().getMutableMap();
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            public double getPriceEstimate() {
                return this.priceEstimate_;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_fieldAccessorTable.ensureFieldAccessorsInitialized(AdUnit.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.o6
            public b9 internalGetMapField(int i10) {
                if (i10 == 3) {
                    return internalGetClientParams();
                }
                throw new RuntimeException(b.e(i10, "Invalid map field number: "));
            }

            @Override // com.explorestack.protobuf.o6
            public b9 internalGetMutableMapField(int i10) {
                if (i10 == 3) {
                    return internalGetMutableClientParams();
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

            public Builder putClientParams(String str, String str2) {
                str.getClass();
                str2.getClass();
                internalGetMutableClientParams().getMutableMap().put(str, str2);
                return this;
            }

            public Builder removeClientParams(String str) {
                str.getClass();
                internalGetMutableClientParams().getMutableMap().remove(str);
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

            public Builder setBidderSdkver(String str) {
                str.getClass();
                this.bidderSdkver_ = str;
                onChanged();
                return this;
            }

            public Builder setBidderSdkverBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.bidderSdkver_ = byteString;
                onChanged();
                return this;
            }

            public Builder setPriceEstimate(double d10) {
                this.priceEstimate_ = d10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AdUnit build() {
                AdUnit adUnitBuildPartial = buildPartial();
                if (adUnitBuildPartial.isInitialized()) {
                    return adUnitBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) adUnitBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AdUnit buildPartial() {
                AdUnit adUnit = new AdUnit(this);
                adUnit.bidder_ = this.bidder_;
                adUnit.bidderSdkver_ = this.bidderSdkver_;
                adUnit.clientParams_ = internalGetClientParams();
                adUnit.clientParams_.makeImmutable();
                adUnit.priceEstimate_ = this.priceEstimate_;
                onBuilt();
                return adUnit;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public AdUnit getDefaultInstanceForType() {
                return AdUnit.getDefaultInstance();
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
                this.bidderSdkver_ = "";
                internalGetMutableClientParams().clear();
                this.priceEstimate_ = 0.0d;
                return this;
            }

            private Builder(p6 p6Var) {
                super(p6Var);
                this.bidder_ = "";
                this.bidderSdkver_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
            /* renamed from: clone */
            public Builder mo500clone() {
                return (Builder) super.mo500clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AdUnit) {
                    return mergeFrom((AdUnit) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AdUnit adUnit) {
                if (adUnit == AdUnit.getDefaultInstance()) {
                    return this;
                }
                if (!adUnit.getBidder().isEmpty()) {
                    this.bidder_ = adUnit.bidder_;
                    onChanged();
                }
                if (!adUnit.getBidderSdkver().isEmpty()) {
                    this.bidderSdkver_ = adUnit.bidderSdkver_;
                    onChanged();
                }
                internalGetMutableClientParams().mergeFrom(adUnit.internalGetClientParams());
                if (adUnit.getPriceEstimate() != 0.0d) {
                    setPriceEstimate(adUnit.getPriceEstimate());
                }
                mergeUnknownFields(((k7) adUnit).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnit.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnit.access$1000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement$AdUnit r3 = (io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnit) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement$AdUnit r4 = (io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnit) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnit.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement$AdUnit$Builder");
            }
        }

        public static Builder newBuilder(AdUnit adUnit) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(adUnit);
        }

        public static AdUnit parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private AdUnit(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AdUnit parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (AdUnit) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static AdUnit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public AdUnit getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static AdUnit parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private AdUnit() {
            this.memoizedIsInitialized = (byte) -1;
            this.bidder_ = "";
            this.bidderSdkver_ = "";
        }

        public static AdUnit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static AdUnit parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(bArr, m5Var);
        }

        public static AdUnit parseFrom(InputStream inputStream) throws IOException {
            return (AdUnit) k7.parseWithIOException(PARSER, inputStream);
        }

        private AdUnit(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            this();
            m5Var.getClass();
            cc ccVarNewBuilder = gc.newBuilder();
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        int tag = yVar.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                this.bidder_ = yVar.readStringRequireUtf8();
                            } else if (tag == 18) {
                                this.bidderSdkver_ = yVar.readStringRequireUtf8();
                            } else if (tag == 26) {
                                if (!z11) {
                                    this.clientParams_ = b9.newMapField(ClientParamsDefaultEntryHolder.defaultEntry);
                                    z11 = true;
                                }
                                s8 s8Var = (s8) yVar.readMessage(ClientParamsDefaultEntryHolder.defaultEntry.getParserForType(), m5Var);
                                this.clientParams_.getMutableMap().put(s8Var.getKey(), s8Var.getValue());
                            } else if (tag != 33) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                this.priceEstimate_ = yVar.readDouble();
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
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

        public static AdUnit parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (AdUnit) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static AdUnit parseFrom(y yVar) throws IOException {
            return (AdUnit) k7.parseWithIOException(PARSER, yVar);
        }

        public static AdUnit parseFrom(y yVar, m5 m5Var) throws IOException {
            return (AdUnit) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface AdUnitOrBuilder extends MessageOrBuilder {
        boolean containsClientParams(String str);

        String getBidder();

        ByteString getBidderBytes();

        String getBidderSdkver();

        ByteString getBidderSdkverBytes();

        @Deprecated
        Map<String, String> getClientParams();

        int getClientParamsCount();

        Map<String, String> getClientParamsMap();

        String getClientParamsOrDefault(String str, String str2);

        String getClientParamsOrThrow(String str);

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        double getPriceEstimate();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static HeaderBiddingPlacement getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static HeaderBiddingPlacement parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HeaderBiddingPlacement) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static HeaderBiddingPlacement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HeaderBiddingPlacement) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeaderBiddingPlacement)) {
            return super.equals(obj);
        }
        HeaderBiddingPlacement headerBiddingPlacement = (HeaderBiddingPlacement) obj;
        return getAdUnitsList().equals(headerBiddingPlacement.getAdUnitsList()) && this.unknownFields.equals(headerBiddingPlacement.unknownFields);
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
    public AdUnit getAdUnits(int i10) {
        return this.adUnits_.get(i10);
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
    public int getAdUnitsCount() {
        return this.adUnits_.size();
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
    public List<AdUnit> getAdUnitsList() {
        return this.adUnits_;
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
    public AdUnitOrBuilder getAdUnitsOrBuilder(int i10) {
        return this.adUnits_.get(i10);
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
    public List<? extends AdUnitOrBuilder> getAdUnitsOrBuilderList() {
        return this.adUnits_;
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
        int iComputeMessageSize = 0;
        for (int i11 = 0; i11 < this.adUnits_.size(); i11++) {
            iComputeMessageSize += h0.computeMessageSize(1, this.adUnits_.get(i11));
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
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
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getAdUnitsCount() > 0) {
            iHashCode = o2.B(iHashCode, 37, 1, 53) + getAdUnitsList().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_fieldAccessorTable.ensureFieldAccessorsInitialized(HeaderBiddingPlacement.class, Builder.class);
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
        return new HeaderBiddingPlacement();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        for (int i10 = 0; i10 < this.adUnits_.size(); i10++) {
            h0Var.writeMessage(1, this.adUnits_.get(i10));
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements HeaderBiddingPlacementOrBuilder {
        private pa adUnitsBuilder_;
        private List<AdUnit> adUnits_;
        private int bitField0_;

        private Builder() {
            super(null);
            this.adUnits_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        private void ensureAdUnitsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.adUnits_ = new ArrayList(this.adUnits_);
                this.bitField0_ |= 1;
            }
        }

        private pa getAdUnitsFieldBuilder() {
            if (this.adUnitsBuilder_ == null) {
                this.adUnitsBuilder_ = new pa(this.adUnits_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.adUnits_ = null;
            }
            return this.adUnitsBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            if (k7.alwaysUseFieldBuilders) {
                getAdUnitsFieldBuilder();
            }
        }

        public Builder addAdUnits(AdUnit adUnit) {
            pa paVar = this.adUnitsBuilder_;
            if (paVar != null) {
                paVar.addMessage(adUnit);
                return this;
            }
            adUnit.getClass();
            ensureAdUnitsIsMutable();
            this.adUnits_.add(adUnit);
            onChanged();
            return this;
        }

        public AdUnit.Builder addAdUnitsBuilder() {
            return (AdUnit.Builder) getAdUnitsFieldBuilder().addBuilder(AdUnit.getDefaultInstance());
        }

        public Builder addAllAdUnits(Iterable<? extends AdUnit> iterable) {
            pa paVar = this.adUnitsBuilder_;
            if (paVar != null) {
                paVar.addAllMessages(iterable);
                return this;
            }
            ensureAdUnitsIsMutable();
            b.a.addAll((Iterable) iterable, (List) this.adUnits_);
            onChanged();
            return this;
        }

        public Builder clearAdUnits() {
            pa paVar = this.adUnitsBuilder_;
            if (paVar != null) {
                paVar.clear();
                return this;
            }
            this.adUnits_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
        public AdUnit getAdUnits(int i10) {
            pa paVar = this.adUnitsBuilder_;
            return paVar == null ? this.adUnits_.get(i10) : (AdUnit) paVar.getMessage(i10);
        }

        public AdUnit.Builder getAdUnitsBuilder(int i10) {
            return (AdUnit.Builder) getAdUnitsFieldBuilder().getBuilder(i10);
        }

        public List<AdUnit.Builder> getAdUnitsBuilderList() {
            return getAdUnitsFieldBuilder().getBuilderList();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
        public int getAdUnitsCount() {
            pa paVar = this.adUnitsBuilder_;
            return paVar == null ? this.adUnits_.size() : paVar.getCount();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
        public List<AdUnit> getAdUnitsList() {
            pa paVar = this.adUnitsBuilder_;
            return paVar == null ? Collections.unmodifiableList(this.adUnits_) : paVar.getMessageList();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
        public AdUnitOrBuilder getAdUnitsOrBuilder(int i10) {
            pa paVar = this.adUnitsBuilder_;
            return paVar == null ? this.adUnits_.get(i10) : (AdUnitOrBuilder) paVar.getMessageOrBuilder(i10);
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
        public List<? extends AdUnitOrBuilder> getAdUnitsOrBuilderList() {
            pa paVar = this.adUnitsBuilder_;
            return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.adUnits_);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_descriptor;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_fieldAccessorTable.ensureFieldAccessorsInitialized(HeaderBiddingPlacement.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder removeAdUnits(int i10) {
            pa paVar = this.adUnitsBuilder_;
            if (paVar != null) {
                paVar.remove(i10);
                return this;
            }
            ensureAdUnitsIsMutable();
            this.adUnits_.remove(i10);
            onChanged();
            return this;
        }

        public Builder setAdUnits(int i10, AdUnit adUnit) {
            pa paVar = this.adUnitsBuilder_;
            if (paVar != null) {
                paVar.setMessage(i10, adUnit);
                return this;
            }
            adUnit.getClass();
            ensureAdUnitsIsMutable();
            this.adUnits_.set(i10, adUnit);
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public HeaderBiddingPlacement build() {
            HeaderBiddingPlacement headerBiddingPlacementBuildPartial = buildPartial();
            if (headerBiddingPlacementBuildPartial.isInitialized()) {
                return headerBiddingPlacementBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) headerBiddingPlacementBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public HeaderBiddingPlacement buildPartial() {
            HeaderBiddingPlacement headerBiddingPlacement = new HeaderBiddingPlacement(this);
            int i10 = this.bitField0_;
            pa paVar = this.adUnitsBuilder_;
            if (paVar == null) {
                if ((i10 & 1) != 0) {
                    this.adUnits_ = Collections.unmodifiableList(this.adUnits_);
                    this.bitField0_ &= -2;
                }
                headerBiddingPlacement.adUnits_ = this.adUnits_;
            } else {
                headerBiddingPlacement.adUnits_ = paVar.build();
            }
            onBuilt();
            return headerBiddingPlacement;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public HeaderBiddingPlacement getDefaultInstanceForType() {
            return HeaderBiddingPlacement.getDefaultInstance();
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

        public AdUnit.Builder addAdUnitsBuilder(int i10) {
            return (AdUnit.Builder) getAdUnitsFieldBuilder().addBuilder(i10, AdUnit.getDefaultInstance());
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
            pa paVar = this.adUnitsBuilder_;
            if (paVar == null) {
                this.adUnits_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                return this;
            }
            paVar.clear();
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            this.adUnits_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public Builder addAdUnits(int i10, AdUnit adUnit) {
            pa paVar = this.adUnitsBuilder_;
            if (paVar == null) {
                adUnit.getClass();
                ensureAdUnitsIsMutable();
                this.adUnits_.add(i10, adUnit);
                onChanged();
                return this;
            }
            paVar.addMessage(i10, adUnit);
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
        /* renamed from: clone */
        public Builder mo500clone() {
            return (Builder) super.mo500clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof HeaderBiddingPlacement) {
                return mergeFrom((HeaderBiddingPlacement) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setAdUnits(int i10, AdUnit.Builder builder) {
            pa paVar = this.adUnitsBuilder_;
            if (paVar == null) {
                ensureAdUnitsIsMutable();
                this.adUnits_.set(i10, builder.build());
                onChanged();
                return this;
            }
            paVar.setMessage(i10, builder.build());
            return this;
        }

        public Builder mergeFrom(HeaderBiddingPlacement headerBiddingPlacement) {
            if (headerBiddingPlacement == HeaderBiddingPlacement.getDefaultInstance()) {
                return this;
            }
            if (this.adUnitsBuilder_ == null) {
                if (!headerBiddingPlacement.adUnits_.isEmpty()) {
                    if (this.adUnits_.isEmpty()) {
                        this.adUnits_ = headerBiddingPlacement.adUnits_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureAdUnitsIsMutable();
                        this.adUnits_.addAll(headerBiddingPlacement.adUnits_);
                    }
                    onChanged();
                }
            } else if (!headerBiddingPlacement.adUnits_.isEmpty()) {
                if (!this.adUnitsBuilder_.isEmpty()) {
                    this.adUnitsBuilder_.addAllMessages(headerBiddingPlacement.adUnits_);
                } else {
                    this.adUnitsBuilder_.dispose();
                    this.adUnitsBuilder_ = null;
                    this.adUnits_ = headerBiddingPlacement.adUnits_;
                    this.bitField0_ &= -2;
                    this.adUnitsBuilder_ = k7.alwaysUseFieldBuilders ? getAdUnitsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((k7) headerBiddingPlacement).unknownFields);
            onChanged();
            return this;
        }

        public Builder addAdUnits(AdUnit.Builder builder) {
            pa paVar = this.adUnitsBuilder_;
            if (paVar == null) {
                ensureAdUnitsIsMutable();
                this.adUnits_.add(builder.build());
                onChanged();
                return this;
            }
            paVar.addMessage(builder.build());
            return this;
        }

        public Builder addAdUnits(int i10, AdUnit.Builder builder) {
            pa paVar = this.adUnitsBuilder_;
            if (paVar == null) {
                ensureAdUnitsIsMutable();
                this.adUnits_.add(i10, builder.build());
                onChanged();
                return this;
            }
            paVar.addMessage(i10, builder.build());
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.access$2100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement r3 = (io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement r4 = (io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement$Builder");
        }
    }

    public static Builder newBuilder(HeaderBiddingPlacement headerBiddingPlacement) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(headerBiddingPlacement);
    }

    public static HeaderBiddingPlacement parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (HeaderBiddingPlacement) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private HeaderBiddingPlacement(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static HeaderBiddingPlacement parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (HeaderBiddingPlacement) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static HeaderBiddingPlacement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HeaderBiddingPlacement) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public HeaderBiddingPlacement getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static HeaderBiddingPlacement parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (HeaderBiddingPlacement) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private HeaderBiddingPlacement() {
        this.memoizedIsInitialized = (byte) -1;
        this.adUnits_ = Collections.EMPTY_LIST;
    }

    public static HeaderBiddingPlacement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HeaderBiddingPlacement) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static HeaderBiddingPlacement parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (HeaderBiddingPlacement) PARSER.parseFrom(bArr, m5Var);
    }

    public static HeaderBiddingPlacement parseFrom(InputStream inputStream) throws IOException {
        return (HeaderBiddingPlacement) k7.parseWithIOException(PARSER, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private HeaderBiddingPlacement(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                            if (tag != 10) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                if (!z11) {
                                    this.adUnits_ = new ArrayList();
                                    z11 = true;
                                }
                                this.adUnits_.add(yVar.readMessage(AdUnit.parser(), m5Var));
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
                if (z11) {
                    this.adUnits_ = Collections.unmodifiableList(this.adUnits_);
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z11) {
            this.adUnits_ = Collections.unmodifiableList(this.adUnits_);
        }
        this.unknownFields = ccVarNewBuilder.build();
        makeExtensionsImmutable();
    }

    public static HeaderBiddingPlacement parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (HeaderBiddingPlacement) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static HeaderBiddingPlacement parseFrom(y yVar) throws IOException {
        return (HeaderBiddingPlacement) k7.parseWithIOException(PARSER, yVar);
    }

    public static HeaderBiddingPlacement parseFrom(y yVar, m5 m5Var) throws IOException {
        return (HeaderBiddingPlacement) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
