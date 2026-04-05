package io.bidmachine.protobuf.sdk;

import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.cc;
import com.explorestack.protobuf.d;
import com.explorestack.protobuf.fa;
import com.explorestack.protobuf.gc;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.ib;
import com.explorestack.protobuf.j7;
import com.explorestack.protobuf.jb;
import com.explorestack.protobuf.k7;
import com.explorestack.protobuf.m5;
import com.explorestack.protobuf.o6;
import com.explorestack.protobuf.p6;
import com.explorestack.protobuf.xa;
import com.explorestack.protobuf.y;
import e3.g;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class Placement extends k7 implements PlacementOrBuilder {
    public static final int AD_TYPE_FIELD_NUMBER = 1;
    public static final int CUSTOM_DATA_FIELD_NUMBER = 3;
    public static final int HB_PLACEMENT_FIELD_NUMBER = 4;
    public static final int PLACEMENT_ID_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private volatile Object adType_;
    private Struct customData_;
    private HeaderBiddingPlacement hbPlacement_;
    private byte memoizedIsInitialized;
    private StringValue placementId_;
    private static final Placement DEFAULT_INSTANCE = new Placement();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Placement.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public Placement parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new Placement(yVar, m5Var);
        }
    };

    public static Placement getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKProto.internal_static_bidmachine_protobuf_sdk_Placement_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Placement parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Placement) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Placement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Placement)) {
            return super.equals(obj);
        }
        Placement placement = (Placement) obj;
        if (!getAdType().equals(placement.getAdType()) || hasPlacementId() != placement.hasPlacementId()) {
            return false;
        }
        if ((hasPlacementId() && !getPlacementId().equals(placement.getPlacementId())) || hasCustomData() != placement.hasCustomData()) {
            return false;
        }
        if ((!hasCustomData() || getCustomData().equals(placement.getCustomData())) && hasHbPlacement() == placement.hasHbPlacement()) {
            return (!hasHbPlacement() || getHbPlacement().equals(placement.getHbPlacement())) && this.unknownFields.equals(placement.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public String getAdType() {
        Object obj = this.adType_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.adType_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public ByteString getAdTypeBytes() {
        Object obj = this.adType_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.adType_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public Struct getCustomData() {
        Struct struct = this.customData_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public jb getCustomDataOrBuilder() {
        return getCustomData();
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public HeaderBiddingPlacement getHbPlacement() {
        HeaderBiddingPlacement headerBiddingPlacement = this.hbPlacement_;
        return headerBiddingPlacement == null ? HeaderBiddingPlacement.getDefaultInstance() : headerBiddingPlacement;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public HeaderBiddingPlacementOrBuilder getHbPlacementOrBuilder() {
        return getHbPlacement();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public StringValue getPlacementId() {
        StringValue stringValue = this.placementId_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public ib getPlacementIdOrBuilder() {
        return getPlacementId();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getAdTypeBytes().isEmpty() ? k7.computeStringSize(1, this.adType_) : 0;
        if (this.placementId_ != null) {
            iComputeStringSize += h0.computeMessageSize(2, getPlacementId());
        }
        if (this.customData_ != null) {
            iComputeStringSize += h0.computeMessageSize(3, getCustomData());
        }
        if (this.hbPlacement_ != null) {
            iComputeStringSize += h0.computeMessageSize(4, getHbPlacement());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public boolean hasCustomData() {
        return this.customData_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public boolean hasHbPlacement() {
        return this.hbPlacement_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public boolean hasPlacementId() {
        return this.placementId_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getAdType().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
        if (hasPlacementId()) {
            iHashCode = getPlacementId().hashCode() + o2.B(iHashCode, 37, 2, 53);
        }
        if (hasCustomData()) {
            iHashCode = getCustomData().hashCode() + o2.B(iHashCode, 37, 3, 53);
        }
        if (hasHbPlacement()) {
            iHashCode = getHbPlacement().hashCode() + o2.B(iHashCode, 37, 4, 53);
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return SDKProto.internal_static_bidmachine_protobuf_sdk_Placement_fieldAccessorTable.ensureFieldAccessorsInitialized(Placement.class, Builder.class);
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
        return new Placement();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (!getAdTypeBytes().isEmpty()) {
            k7.writeString(h0Var, 1, this.adType_);
        }
        if (this.placementId_ != null) {
            h0Var.writeMessage(2, getPlacementId());
        }
        if (this.customData_ != null) {
            h0Var.writeMessage(3, getCustomData());
        }
        if (this.hbPlacement_ != null) {
            h0Var.writeMessage(4, getHbPlacement());
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements PlacementOrBuilder {
        private Object adType_;
        private xa customDataBuilder_;
        private Struct customData_;
        private xa hbPlacementBuilder_;
        private HeaderBiddingPlacement hbPlacement_;
        private xa placementIdBuilder_;
        private StringValue placementId_;

        private xa getCustomDataFieldBuilder() {
            if (this.customDataBuilder_ == null) {
                this.customDataBuilder_ = new xa(getCustomData(), getParentForChildren(), isClean());
                this.customData_ = null;
            }
            return this.customDataBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_Placement_descriptor;
        }

        private xa getHbPlacementFieldBuilder() {
            if (this.hbPlacementBuilder_ == null) {
                this.hbPlacementBuilder_ = new xa(getHbPlacement(), getParentForChildren(), isClean());
                this.hbPlacement_ = null;
            }
            return this.hbPlacementBuilder_;
        }

        private xa getPlacementIdFieldBuilder() {
            if (this.placementIdBuilder_ == null) {
                this.placementIdBuilder_ = new xa(getPlacementId(), getParentForChildren(), isClean());
                this.placementId_ = null;
            }
            return this.placementIdBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = k7.alwaysUseFieldBuilders;
        }

        public Builder clearAdType() {
            this.adType_ = Placement.getDefaultInstance().getAdType();
            onChanged();
            return this;
        }

        public Builder clearCustomData() {
            if (this.customDataBuilder_ == null) {
                this.customData_ = null;
                onChanged();
                return this;
            }
            this.customData_ = null;
            this.customDataBuilder_ = null;
            return this;
        }

        public Builder clearHbPlacement() {
            if (this.hbPlacementBuilder_ == null) {
                this.hbPlacement_ = null;
                onChanged();
                return this;
            }
            this.hbPlacement_ = null;
            this.hbPlacementBuilder_ = null;
            return this;
        }

        public Builder clearPlacementId() {
            if (this.placementIdBuilder_ == null) {
                this.placementId_ = null;
                onChanged();
                return this;
            }
            this.placementId_ = null;
            this.placementIdBuilder_ = null;
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public String getAdType() {
            Object obj = this.adType_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.adType_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public ByteString getAdTypeBytes() {
            Object obj = this.adType_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.adType_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public Struct getCustomData() {
            xa xaVar = this.customDataBuilder_;
            if (xaVar != null) {
                return (Struct) xaVar.getMessage();
            }
            Struct struct = this.customData_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Struct.Builder getCustomDataBuilder() {
            onChanged();
            return (Struct.Builder) getCustomDataFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public jb getCustomDataOrBuilder() {
            xa xaVar = this.customDataBuilder_;
            if (xaVar != null) {
                return (jb) xaVar.getMessageOrBuilder();
            }
            Struct struct = this.customData_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_Placement_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public HeaderBiddingPlacement getHbPlacement() {
            xa xaVar = this.hbPlacementBuilder_;
            if (xaVar != null) {
                return (HeaderBiddingPlacement) xaVar.getMessage();
            }
            HeaderBiddingPlacement headerBiddingPlacement = this.hbPlacement_;
            return headerBiddingPlacement == null ? HeaderBiddingPlacement.getDefaultInstance() : headerBiddingPlacement;
        }

        public HeaderBiddingPlacement.Builder getHbPlacementBuilder() {
            onChanged();
            return (HeaderBiddingPlacement.Builder) getHbPlacementFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public HeaderBiddingPlacementOrBuilder getHbPlacementOrBuilder() {
            xa xaVar = this.hbPlacementBuilder_;
            if (xaVar != null) {
                return (HeaderBiddingPlacementOrBuilder) xaVar.getMessageOrBuilder();
            }
            HeaderBiddingPlacement headerBiddingPlacement = this.hbPlacement_;
            return headerBiddingPlacement == null ? HeaderBiddingPlacement.getDefaultInstance() : headerBiddingPlacement;
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public StringValue getPlacementId() {
            xa xaVar = this.placementIdBuilder_;
            if (xaVar != null) {
                return (StringValue) xaVar.getMessage();
            }
            StringValue stringValue = this.placementId_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        public StringValue.Builder getPlacementIdBuilder() {
            onChanged();
            return (StringValue.Builder) getPlacementIdFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public ib getPlacementIdOrBuilder() {
            xa xaVar = this.placementIdBuilder_;
            if (xaVar != null) {
                return (ib) xaVar.getMessageOrBuilder();
            }
            StringValue stringValue = this.placementId_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public boolean hasCustomData() {
            return (this.customDataBuilder_ == null && this.customData_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public boolean hasHbPlacement() {
            return (this.hbPlacementBuilder_ == null && this.hbPlacement_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public boolean hasPlacementId() {
            return (this.placementIdBuilder_ == null && this.placementId_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_Placement_fieldAccessorTable.ensureFieldAccessorsInitialized(Placement.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeCustomData(Struct struct) {
            xa xaVar = this.customDataBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(struct);
                return this;
            }
            Struct struct2 = this.customData_;
            if (struct2 != null) {
                this.customData_ = a.i(struct2, struct);
            } else {
                this.customData_ = struct;
            }
            onChanged();
            return this;
        }

        public Builder mergeHbPlacement(HeaderBiddingPlacement headerBiddingPlacement) {
            xa xaVar = this.hbPlacementBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(headerBiddingPlacement);
                return this;
            }
            HeaderBiddingPlacement headerBiddingPlacement2 = this.hbPlacement_;
            if (headerBiddingPlacement2 != null) {
                this.hbPlacement_ = HeaderBiddingPlacement.newBuilder(headerBiddingPlacement2).mergeFrom(headerBiddingPlacement).buildPartial();
            } else {
                this.hbPlacement_ = headerBiddingPlacement;
            }
            onChanged();
            return this;
        }

        public Builder mergePlacementId(StringValue stringValue) {
            xa xaVar = this.placementIdBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(stringValue);
                return this;
            }
            StringValue stringValue2 = this.placementId_;
            if (stringValue2 != null) {
                this.placementId_ = g.h(stringValue2, stringValue);
            } else {
                this.placementId_ = stringValue;
            }
            onChanged();
            return this;
        }

        public Builder setAdType(String str) {
            str.getClass();
            this.adType_ = str;
            onChanged();
            return this;
        }

        public Builder setAdTypeBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.adType_ = byteString;
            onChanged();
            return this;
        }

        public Builder setCustomData(Struct struct) {
            xa xaVar = this.customDataBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(struct);
                return this;
            }
            struct.getClass();
            this.customData_ = struct;
            onChanged();
            return this;
        }

        public Builder setHbPlacement(HeaderBiddingPlacement headerBiddingPlacement) {
            xa xaVar = this.hbPlacementBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(headerBiddingPlacement);
                return this;
            }
            headerBiddingPlacement.getClass();
            this.hbPlacement_ = headerBiddingPlacement;
            onChanged();
            return this;
        }

        public Builder setPlacementId(StringValue stringValue) {
            xa xaVar = this.placementIdBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(stringValue);
                return this;
            }
            stringValue.getClass();
            this.placementId_ = stringValue;
            onChanged();
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            this.adType_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Placement build() {
            Placement placementBuildPartial = buildPartial();
            if (placementBuildPartial.isInitialized()) {
                return placementBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) placementBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Placement buildPartial() {
            Placement placement = new Placement(this);
            placement.adType_ = this.adType_;
            xa xaVar = this.placementIdBuilder_;
            if (xaVar == null) {
                placement.placementId_ = this.placementId_;
            } else {
                placement.placementId_ = (StringValue) xaVar.build();
            }
            xa xaVar2 = this.customDataBuilder_;
            if (xaVar2 == null) {
                placement.customData_ = this.customData_;
            } else {
                placement.customData_ = (Struct) xaVar2.build();
            }
            xa xaVar3 = this.hbPlacementBuilder_;
            if (xaVar3 == null) {
                placement.hbPlacement_ = this.hbPlacement_;
            } else {
                placement.hbPlacement_ = (HeaderBiddingPlacement) xaVar3.build();
            }
            onBuilt();
            return placement;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Placement getDefaultInstanceForType() {
            return Placement.getDefaultInstance();
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
            this.adType_ = "";
            if (this.placementIdBuilder_ == null) {
                this.placementId_ = null;
            } else {
                this.placementId_ = null;
                this.placementIdBuilder_ = null;
            }
            if (this.customDataBuilder_ == null) {
                this.customData_ = null;
            } else {
                this.customData_ = null;
                this.customDataBuilder_ = null;
            }
            if (this.hbPlacementBuilder_ == null) {
                this.hbPlacement_ = null;
                return this;
            }
            this.hbPlacement_ = null;
            this.hbPlacementBuilder_ = null;
            return this;
        }

        private Builder() {
            super(null);
            this.adType_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder setCustomData(Struct.Builder builder) {
            xa xaVar = this.customDataBuilder_;
            if (xaVar == null) {
                this.customData_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder setHbPlacement(HeaderBiddingPlacement.Builder builder) {
            xa xaVar = this.hbPlacementBuilder_;
            if (xaVar == null) {
                this.hbPlacement_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder setPlacementId(StringValue.Builder builder) {
            xa xaVar = this.placementIdBuilder_;
            if (xaVar == null) {
                this.placementId_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
        /* renamed from: clone */
        public Builder mo500clone() {
            return (Builder) super.mo500clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Placement) {
                return mergeFrom((Placement) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Placement placement) {
            if (placement == Placement.getDefaultInstance()) {
                return this;
            }
            if (!placement.getAdType().isEmpty()) {
                this.adType_ = placement.adType_;
                onChanged();
            }
            if (placement.hasPlacementId()) {
                mergePlacementId(placement.getPlacementId());
            }
            if (placement.hasCustomData()) {
                mergeCustomData(placement.getCustomData());
            }
            if (placement.hasHbPlacement()) {
                mergeHbPlacement(placement.getHbPlacement());
            }
            mergeUnknownFields(((k7) placement).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.bidmachine.protobuf.sdk.Placement.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sdk.Placement.access$900()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.sdk.Placement r3 = (io.bidmachine.protobuf.sdk.Placement) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.sdk.Placement r4 = (io.bidmachine.protobuf.sdk.Placement) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Placement.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sdk.Placement$Builder");
        }
    }

    public static Builder newBuilder(Placement placement) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(placement);
    }

    public static Placement parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private Placement(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Placement parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Placement) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static Placement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Placement getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Placement parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Placement() {
        this.memoizedIsInitialized = (byte) -1;
        this.adType_ = "";
    }

    public static Placement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static Placement parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(bArr, m5Var);
    }

    public static Placement parseFrom(InputStream inputStream) throws IOException {
        return (Placement) k7.parseWithIOException(PARSER, inputStream);
    }

    private Placement(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        this();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int tag = yVar.readTag();
                    if (tag != 0) {
                        if (tag != 10) {
                            if (tag == 18) {
                                StringValue stringValue = this.placementId_;
                                StringValue.Builder builder = stringValue != null ? stringValue.toBuilder() : null;
                                StringValue stringValue2 = (StringValue) yVar.readMessage(StringValue.parser(), m5Var);
                                this.placementId_ = stringValue2;
                                if (builder != null) {
                                    builder.mergeFrom(stringValue2);
                                    this.placementId_ = builder.buildPartial();
                                }
                            } else if (tag == 26) {
                                Struct struct = this.customData_;
                                Struct.Builder builder2 = struct != null ? struct.toBuilder() : null;
                                Struct struct2 = (Struct) yVar.readMessage(Struct.parser(), m5Var);
                                this.customData_ = struct2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(struct2);
                                    this.customData_ = builder2.buildPartial();
                                }
                            } else if (tag != 34) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                HeaderBiddingPlacement headerBiddingPlacement = this.hbPlacement_;
                                HeaderBiddingPlacement.Builder builder3 = headerBiddingPlacement != null ? headerBiddingPlacement.toBuilder() : null;
                                HeaderBiddingPlacement headerBiddingPlacement2 = (HeaderBiddingPlacement) yVar.readMessage(HeaderBiddingPlacement.parser(), m5Var);
                                this.hbPlacement_ = headerBiddingPlacement2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(headerBiddingPlacement2);
                                    this.hbPlacement_ = builder3.buildPartial();
                                }
                            }
                        } else {
                            this.adType_ = yVar.readStringRequireUtf8();
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

    public static Placement parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Placement) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static Placement parseFrom(y yVar) throws IOException {
        return (Placement) k7.parseWithIOException(PARSER, yVar);
    }

    public static Placement parseFrom(y yVar, m5 m5Var) throws IOException {
        return (Placement) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
