package io.bidmachine.protobuf.analytics.events;

import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Timestamp;
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
import com.explorestack.protobuf.sb;
import com.explorestack.protobuf.x7;
import com.explorestack.protobuf.xa;
import com.explorestack.protobuf.y;
import e3.g;
import io.bidmachine.protobuf.sdk.Error;
import io.bidmachine.protobuf.sdk.ErrorOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class SDKEvent extends k7 implements SDKEventOrBuilder {
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int AD_TYPE_FIELD_NUMBER = 6;
    public static final int CONTEXT_FIELD_NUMBER = 2;
    public static final int CUSTOM_PARAMS_FIELD_NUMBER = 9;
    public static final int ERROR_FIELD_NUMBER = 8;
    public static final int FINISH_TIME_FIELD_NUMBER = 5;
    public static final int NETWORK_FIELD_NUMBER = 3;
    public static final int PRICE_FIELD_NUMBER = 7;
    public static final int START_TIME_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private int action_;
    private StringValue adType_;
    private volatile Object context_;
    private Struct customParams_;
    private Error error_;
    private Timestamp finishTime_;
    private byte memoizedIsInitialized;
    private StringValue network_;
    private double price_;
    private Timestamp startTime_;
    private static final SDKEvent DEFAULT_INSTANCE = new SDKEvent();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.analytics.events.SDKEvent.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public SDKEvent parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new SDKEvent(yVar, m5Var);
        }
    };

    public static SDKEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return EventsProto.internal_static_bidmachine_protobuf_analytics_events_SDKEvent_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static SDKEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SDKEvent) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SDKEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SDKEvent) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SDKEvent)) {
            return super.equals(obj);
        }
        SDKEvent sDKEvent = (SDKEvent) obj;
        if (getAction() != sDKEvent.getAction() || !getContext().equals(sDKEvent.getContext()) || hasNetwork() != sDKEvent.hasNetwork()) {
            return false;
        }
        if ((hasNetwork() && !getNetwork().equals(sDKEvent.getNetwork())) || hasStartTime() != sDKEvent.hasStartTime()) {
            return false;
        }
        if ((hasStartTime() && !getStartTime().equals(sDKEvent.getStartTime())) || hasFinishTime() != sDKEvent.hasFinishTime()) {
            return false;
        }
        if ((hasFinishTime() && !getFinishTime().equals(sDKEvent.getFinishTime())) || hasAdType() != sDKEvent.hasAdType()) {
            return false;
        }
        if ((hasAdType() && !getAdType().equals(sDKEvent.getAdType())) || Double.doubleToLongBits(getPrice()) != Double.doubleToLongBits(sDKEvent.getPrice()) || hasError() != sDKEvent.hasError()) {
            return false;
        }
        if ((!hasError() || getError().equals(sDKEvent.getError())) && hasCustomParams() == sDKEvent.hasCustomParams()) {
            return (!hasCustomParams() || getCustomParams().equals(sDKEvent.getCustomParams())) && this.unknownFields.equals(sDKEvent.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public int getAction() {
        return this.action_;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public StringValue getAdType() {
        StringValue stringValue = this.adType_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public ib getAdTypeOrBuilder() {
        return getAdType();
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public String getContext() {
        Object obj = this.context_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.context_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public ByteString getContextBytes() {
        Object obj = this.context_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.context_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public Struct getCustomParams() {
        Struct struct = this.customParams_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public jb getCustomParamsOrBuilder() {
        return getCustomParams();
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public Error getError() {
        Error error = this.error_;
        return error == null ? Error.getDefaultInstance() : error;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public ErrorOrBuilder getErrorOrBuilder() {
        return getError();
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public Timestamp getFinishTime() {
        Timestamp timestamp = this.finishTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public sb getFinishTimeOrBuilder() {
        return getFinishTime();
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public StringValue getNetwork() {
        StringValue stringValue = this.network_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public ib getNetworkOrBuilder() {
        return getNetwork();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public double getPrice() {
        return this.price_;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.action_;
        int iComputeUInt32Size = i11 != 0 ? h0.computeUInt32Size(1, i11) : 0;
        if (!getContextBytes().isEmpty()) {
            iComputeUInt32Size += k7.computeStringSize(2, this.context_);
        }
        if (this.network_ != null) {
            iComputeUInt32Size += h0.computeMessageSize(3, getNetwork());
        }
        if (this.startTime_ != null) {
            iComputeUInt32Size += h0.computeMessageSize(4, getStartTime());
        }
        if (this.finishTime_ != null) {
            iComputeUInt32Size += h0.computeMessageSize(5, getFinishTime());
        }
        if (this.adType_ != null) {
            iComputeUInt32Size += h0.computeMessageSize(6, getAdType());
        }
        double d10 = this.price_;
        if (d10 != 0.0d) {
            iComputeUInt32Size += h0.computeDoubleSize(7, d10);
        }
        if (this.error_ != null) {
            iComputeUInt32Size += h0.computeMessageSize(8, getError());
        }
        if (this.customParams_ != null) {
            iComputeUInt32Size += h0.computeMessageSize(9, getCustomParams());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeUInt32Size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public Timestamp getStartTime() {
        Timestamp timestamp = this.startTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public sb getStartTimeOrBuilder() {
        return getStartTime();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public boolean hasAdType() {
        return this.adType_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public boolean hasCustomParams() {
        return this.customParams_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public boolean hasError() {
        return this.error_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public boolean hasFinishTime() {
        return this.finishTime_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public boolean hasNetwork() {
        return this.network_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public boolean hasStartTime() {
        return this.startTime_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getContext().hashCode() + ((((getAction() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
        if (hasNetwork()) {
            iHashCode = o2.B(iHashCode, 37, 3, 53) + getNetwork().hashCode();
        }
        if (hasStartTime()) {
            iHashCode = o2.B(iHashCode, 37, 4, 53) + getStartTime().hashCode();
        }
        if (hasFinishTime()) {
            iHashCode = o2.B(iHashCode, 37, 5, 53) + getFinishTime().hashCode();
        }
        if (hasAdType()) {
            iHashCode = o2.B(iHashCode, 37, 6, 53) + getAdType().hashCode();
        }
        int iHashLong = x7.hashLong(Double.doubleToLongBits(getPrice())) + o2.B(iHashCode, 37, 7, 53);
        if (hasError()) {
            iHashLong = getError().hashCode() + o2.B(iHashLong, 37, 8, 53);
        }
        if (hasCustomParams()) {
            iHashLong = getCustomParams().hashCode() + o2.B(iHashLong, 37, 9, 53);
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashLong * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return EventsProto.internal_static_bidmachine_protobuf_analytics_events_SDKEvent_fieldAccessorTable.ensureFieldAccessorsInitialized(SDKEvent.class, Builder.class);
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
        return new SDKEvent();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        int i10 = this.action_;
        if (i10 != 0) {
            h0Var.writeUInt32(1, i10);
        }
        if (!getContextBytes().isEmpty()) {
            k7.writeString(h0Var, 2, this.context_);
        }
        if (this.network_ != null) {
            h0Var.writeMessage(3, getNetwork());
        }
        if (this.startTime_ != null) {
            h0Var.writeMessage(4, getStartTime());
        }
        if (this.finishTime_ != null) {
            h0Var.writeMessage(5, getFinishTime());
        }
        if (this.adType_ != null) {
            h0Var.writeMessage(6, getAdType());
        }
        double d10 = this.price_;
        if (d10 != 0.0d) {
            h0Var.writeDouble(7, d10);
        }
        if (this.error_ != null) {
            h0Var.writeMessage(8, getError());
        }
        if (this.customParams_ != null) {
            h0Var.writeMessage(9, getCustomParams());
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements SDKEventOrBuilder {
        private int action_;
        private xa adTypeBuilder_;
        private StringValue adType_;
        private Object context_;
        private xa customParamsBuilder_;
        private Struct customParams_;
        private xa errorBuilder_;
        private Error error_;
        private xa finishTimeBuilder_;
        private Timestamp finishTime_;
        private xa networkBuilder_;
        private StringValue network_;
        private double price_;
        private xa startTimeBuilder_;
        private Timestamp startTime_;

        private Builder() {
            super(null);
            this.context_ = "";
            maybeForceBuilderInitialization();
        }

        private xa getAdTypeFieldBuilder() {
            if (this.adTypeBuilder_ == null) {
                this.adTypeBuilder_ = new xa(getAdType(), getParentForChildren(), isClean());
                this.adType_ = null;
            }
            return this.adTypeBuilder_;
        }

        private xa getCustomParamsFieldBuilder() {
            if (this.customParamsBuilder_ == null) {
                this.customParamsBuilder_ = new xa(getCustomParams(), getParentForChildren(), isClean());
                this.customParams_ = null;
            }
            return this.customParamsBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EventsProto.internal_static_bidmachine_protobuf_analytics_events_SDKEvent_descriptor;
        }

        private xa getErrorFieldBuilder() {
            if (this.errorBuilder_ == null) {
                this.errorBuilder_ = new xa(getError(), getParentForChildren(), isClean());
                this.error_ = null;
            }
            return this.errorBuilder_;
        }

        private xa getFinishTimeFieldBuilder() {
            if (this.finishTimeBuilder_ == null) {
                this.finishTimeBuilder_ = new xa(getFinishTime(), getParentForChildren(), isClean());
                this.finishTime_ = null;
            }
            return this.finishTimeBuilder_;
        }

        private xa getNetworkFieldBuilder() {
            if (this.networkBuilder_ == null) {
                this.networkBuilder_ = new xa(getNetwork(), getParentForChildren(), isClean());
                this.network_ = null;
            }
            return this.networkBuilder_;
        }

        private xa getStartTimeFieldBuilder() {
            if (this.startTimeBuilder_ == null) {
                this.startTimeBuilder_ = new xa(getStartTime(), getParentForChildren(), isClean());
                this.startTime_ = null;
            }
            return this.startTimeBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = k7.alwaysUseFieldBuilders;
        }

        public Builder clearAction() {
            this.action_ = 0;
            onChanged();
            return this;
        }

        public Builder clearAdType() {
            if (this.adTypeBuilder_ == null) {
                this.adType_ = null;
                onChanged();
                return this;
            }
            this.adType_ = null;
            this.adTypeBuilder_ = null;
            return this;
        }

        public Builder clearContext() {
            this.context_ = SDKEvent.getDefaultInstance().getContext();
            onChanged();
            return this;
        }

        public Builder clearCustomParams() {
            if (this.customParamsBuilder_ == null) {
                this.customParams_ = null;
                onChanged();
                return this;
            }
            this.customParams_ = null;
            this.customParamsBuilder_ = null;
            return this;
        }

        public Builder clearError() {
            if (this.errorBuilder_ == null) {
                this.error_ = null;
                onChanged();
                return this;
            }
            this.error_ = null;
            this.errorBuilder_ = null;
            return this;
        }

        public Builder clearFinishTime() {
            if (this.finishTimeBuilder_ == null) {
                this.finishTime_ = null;
                onChanged();
                return this;
            }
            this.finishTime_ = null;
            this.finishTimeBuilder_ = null;
            return this;
        }

        public Builder clearNetwork() {
            if (this.networkBuilder_ == null) {
                this.network_ = null;
                onChanged();
                return this;
            }
            this.network_ = null;
            this.networkBuilder_ = null;
            return this;
        }

        public Builder clearPrice() {
            this.price_ = 0.0d;
            onChanged();
            return this;
        }

        public Builder clearStartTime() {
            if (this.startTimeBuilder_ == null) {
                this.startTime_ = null;
                onChanged();
                return this;
            }
            this.startTime_ = null;
            this.startTimeBuilder_ = null;
            return this;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public int getAction() {
            return this.action_;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public StringValue getAdType() {
            xa xaVar = this.adTypeBuilder_;
            if (xaVar != null) {
                return (StringValue) xaVar.getMessage();
            }
            StringValue stringValue = this.adType_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        public StringValue.Builder getAdTypeBuilder() {
            onChanged();
            return (StringValue.Builder) getAdTypeFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public ib getAdTypeOrBuilder() {
            xa xaVar = this.adTypeBuilder_;
            if (xaVar != null) {
                return (ib) xaVar.getMessageOrBuilder();
            }
            StringValue stringValue = this.adType_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public String getContext() {
            Object obj = this.context_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.context_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public ByteString getContextBytes() {
            Object obj = this.context_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.context_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public Struct getCustomParams() {
            xa xaVar = this.customParamsBuilder_;
            if (xaVar != null) {
                return (Struct) xaVar.getMessage();
            }
            Struct struct = this.customParams_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Struct.Builder getCustomParamsBuilder() {
            onChanged();
            return (Struct.Builder) getCustomParamsFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public jb getCustomParamsOrBuilder() {
            xa xaVar = this.customParamsBuilder_;
            if (xaVar != null) {
                return (jb) xaVar.getMessageOrBuilder();
            }
            Struct struct = this.customParams_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return EventsProto.internal_static_bidmachine_protobuf_analytics_events_SDKEvent_descriptor;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public Error getError() {
            xa xaVar = this.errorBuilder_;
            if (xaVar != null) {
                return (Error) xaVar.getMessage();
            }
            Error error = this.error_;
            return error == null ? Error.getDefaultInstance() : error;
        }

        public Error.Builder getErrorBuilder() {
            onChanged();
            return (Error.Builder) getErrorFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public ErrorOrBuilder getErrorOrBuilder() {
            xa xaVar = this.errorBuilder_;
            if (xaVar != null) {
                return (ErrorOrBuilder) xaVar.getMessageOrBuilder();
            }
            Error error = this.error_;
            return error == null ? Error.getDefaultInstance() : error;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public Timestamp getFinishTime() {
            xa xaVar = this.finishTimeBuilder_;
            if (xaVar != null) {
                return (Timestamp) xaVar.getMessage();
            }
            Timestamp timestamp = this.finishTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Timestamp.Builder getFinishTimeBuilder() {
            onChanged();
            return (Timestamp.Builder) getFinishTimeFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public sb getFinishTimeOrBuilder() {
            xa xaVar = this.finishTimeBuilder_;
            if (xaVar != null) {
                return (sb) xaVar.getMessageOrBuilder();
            }
            Timestamp timestamp = this.finishTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public StringValue getNetwork() {
            xa xaVar = this.networkBuilder_;
            if (xaVar != null) {
                return (StringValue) xaVar.getMessage();
            }
            StringValue stringValue = this.network_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        public StringValue.Builder getNetworkBuilder() {
            onChanged();
            return (StringValue.Builder) getNetworkFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public ib getNetworkOrBuilder() {
            xa xaVar = this.networkBuilder_;
            if (xaVar != null) {
                return (ib) xaVar.getMessageOrBuilder();
            }
            StringValue stringValue = this.network_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public double getPrice() {
            return this.price_;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public Timestamp getStartTime() {
            xa xaVar = this.startTimeBuilder_;
            if (xaVar != null) {
                return (Timestamp) xaVar.getMessage();
            }
            Timestamp timestamp = this.startTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Timestamp.Builder getStartTimeBuilder() {
            onChanged();
            return (Timestamp.Builder) getStartTimeFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public sb getStartTimeOrBuilder() {
            xa xaVar = this.startTimeBuilder_;
            if (xaVar != null) {
                return (sb) xaVar.getMessageOrBuilder();
            }
            Timestamp timestamp = this.startTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public boolean hasAdType() {
            return (this.adTypeBuilder_ == null && this.adType_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public boolean hasCustomParams() {
            return (this.customParamsBuilder_ == null && this.customParams_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public boolean hasError() {
            return (this.errorBuilder_ == null && this.error_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public boolean hasFinishTime() {
            return (this.finishTimeBuilder_ == null && this.finishTime_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public boolean hasNetwork() {
            return (this.networkBuilder_ == null && this.network_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public boolean hasStartTime() {
            return (this.startTimeBuilder_ == null && this.startTime_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return EventsProto.internal_static_bidmachine_protobuf_analytics_events_SDKEvent_fieldAccessorTable.ensureFieldAccessorsInitialized(SDKEvent.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeAdType(StringValue stringValue) {
            xa xaVar = this.adTypeBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(stringValue);
                return this;
            }
            StringValue stringValue2 = this.adType_;
            if (stringValue2 != null) {
                this.adType_ = g.h(stringValue2, stringValue);
            } else {
                this.adType_ = stringValue;
            }
            onChanged();
            return this;
        }

        public Builder mergeCustomParams(Struct struct) {
            xa xaVar = this.customParamsBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(struct);
                return this;
            }
            Struct struct2 = this.customParams_;
            if (struct2 != null) {
                this.customParams_ = a.i(struct2, struct);
            } else {
                this.customParams_ = struct;
            }
            onChanged();
            return this;
        }

        public Builder mergeError(Error error) {
            xa xaVar = this.errorBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(error);
                return this;
            }
            Error error2 = this.error_;
            if (error2 != null) {
                this.error_ = Error.newBuilder(error2).mergeFrom(error).buildPartial();
            } else {
                this.error_ = error;
            }
            onChanged();
            return this;
        }

        public Builder mergeFinishTime(Timestamp timestamp) {
            xa xaVar = this.finishTimeBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(timestamp);
                return this;
            }
            Timestamp timestamp2 = this.finishTime_;
            if (timestamp2 != null) {
                this.finishTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
            } else {
                this.finishTime_ = timestamp;
            }
            onChanged();
            return this;
        }

        public Builder mergeNetwork(StringValue stringValue) {
            xa xaVar = this.networkBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(stringValue);
                return this;
            }
            StringValue stringValue2 = this.network_;
            if (stringValue2 != null) {
                this.network_ = g.h(stringValue2, stringValue);
            } else {
                this.network_ = stringValue;
            }
            onChanged();
            return this;
        }

        public Builder mergeStartTime(Timestamp timestamp) {
            xa xaVar = this.startTimeBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(timestamp);
                return this;
            }
            Timestamp timestamp2 = this.startTime_;
            if (timestamp2 != null) {
                this.startTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
            } else {
                this.startTime_ = timestamp;
            }
            onChanged();
            return this;
        }

        public Builder setAction(int i10) {
            this.action_ = i10;
            onChanged();
            return this;
        }

        public Builder setAdType(StringValue stringValue) {
            xa xaVar = this.adTypeBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(stringValue);
                return this;
            }
            stringValue.getClass();
            this.adType_ = stringValue;
            onChanged();
            return this;
        }

        public Builder setContext(String str) {
            str.getClass();
            this.context_ = str;
            onChanged();
            return this;
        }

        public Builder setContextBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.context_ = byteString;
            onChanged();
            return this;
        }

        public Builder setCustomParams(Struct struct) {
            xa xaVar = this.customParamsBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(struct);
                return this;
            }
            struct.getClass();
            this.customParams_ = struct;
            onChanged();
            return this;
        }

        public Builder setError(Error error) {
            xa xaVar = this.errorBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(error);
                return this;
            }
            error.getClass();
            this.error_ = error;
            onChanged();
            return this;
        }

        public Builder setFinishTime(Timestamp timestamp) {
            xa xaVar = this.finishTimeBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(timestamp);
                return this;
            }
            timestamp.getClass();
            this.finishTime_ = timestamp;
            onChanged();
            return this;
        }

        public Builder setNetwork(StringValue stringValue) {
            xa xaVar = this.networkBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(stringValue);
                return this;
            }
            stringValue.getClass();
            this.network_ = stringValue;
            onChanged();
            return this;
        }

        public Builder setPrice(double d10) {
            this.price_ = d10;
            onChanged();
            return this;
        }

        public Builder setStartTime(Timestamp timestamp) {
            xa xaVar = this.startTimeBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(timestamp);
                return this;
            }
            timestamp.getClass();
            this.startTime_ = timestamp;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SDKEvent build() {
            SDKEvent sDKEventBuildPartial = buildPartial();
            if (sDKEventBuildPartial.isInitialized()) {
                return sDKEventBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) sDKEventBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SDKEvent buildPartial() {
            SDKEvent sDKEvent = new SDKEvent(this);
            sDKEvent.action_ = this.action_;
            sDKEvent.context_ = this.context_;
            xa xaVar = this.networkBuilder_;
            if (xaVar == null) {
                sDKEvent.network_ = this.network_;
            } else {
                sDKEvent.network_ = (StringValue) xaVar.build();
            }
            xa xaVar2 = this.startTimeBuilder_;
            if (xaVar2 == null) {
                sDKEvent.startTime_ = this.startTime_;
            } else {
                sDKEvent.startTime_ = (Timestamp) xaVar2.build();
            }
            xa xaVar3 = this.finishTimeBuilder_;
            if (xaVar3 == null) {
                sDKEvent.finishTime_ = this.finishTime_;
            } else {
                sDKEvent.finishTime_ = (Timestamp) xaVar3.build();
            }
            xa xaVar4 = this.adTypeBuilder_;
            if (xaVar4 == null) {
                sDKEvent.adType_ = this.adType_;
            } else {
                sDKEvent.adType_ = (StringValue) xaVar4.build();
            }
            sDKEvent.price_ = this.price_;
            xa xaVar5 = this.errorBuilder_;
            if (xaVar5 == null) {
                sDKEvent.error_ = this.error_;
            } else {
                sDKEvent.error_ = (Error) xaVar5.build();
            }
            xa xaVar6 = this.customParamsBuilder_;
            if (xaVar6 == null) {
                sDKEvent.customParams_ = this.customParams_;
            } else {
                sDKEvent.customParams_ = (Struct) xaVar6.build();
            }
            onBuilt();
            return sDKEvent;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public SDKEvent getDefaultInstanceForType() {
            return SDKEvent.getDefaultInstance();
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
            this.action_ = 0;
            this.context_ = "";
            if (this.networkBuilder_ == null) {
                this.network_ = null;
            } else {
                this.network_ = null;
                this.networkBuilder_ = null;
            }
            if (this.startTimeBuilder_ == null) {
                this.startTime_ = null;
            } else {
                this.startTime_ = null;
                this.startTimeBuilder_ = null;
            }
            if (this.finishTimeBuilder_ == null) {
                this.finishTime_ = null;
            } else {
                this.finishTime_ = null;
                this.finishTimeBuilder_ = null;
            }
            if (this.adTypeBuilder_ == null) {
                this.adType_ = null;
            } else {
                this.adType_ = null;
                this.adTypeBuilder_ = null;
            }
            this.price_ = 0.0d;
            if (this.errorBuilder_ == null) {
                this.error_ = null;
            } else {
                this.error_ = null;
                this.errorBuilder_ = null;
            }
            if (this.customParamsBuilder_ == null) {
                this.customParams_ = null;
                return this;
            }
            this.customParams_ = null;
            this.customParamsBuilder_ = null;
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            this.context_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder setAdType(StringValue.Builder builder) {
            xa xaVar = this.adTypeBuilder_;
            if (xaVar == null) {
                this.adType_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder setCustomParams(Struct.Builder builder) {
            xa xaVar = this.customParamsBuilder_;
            if (xaVar == null) {
                this.customParams_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder setError(Error.Builder builder) {
            xa xaVar = this.errorBuilder_;
            if (xaVar == null) {
                this.error_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder setFinishTime(Timestamp.Builder builder) {
            xa xaVar = this.finishTimeBuilder_;
            if (xaVar == null) {
                this.finishTime_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder setNetwork(StringValue.Builder builder) {
            xa xaVar = this.networkBuilder_;
            if (xaVar == null) {
                this.network_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder setStartTime(Timestamp.Builder builder) {
            xa xaVar = this.startTimeBuilder_;
            if (xaVar == null) {
                this.startTime_ = builder.build();
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
            if (message instanceof SDKEvent) {
                return mergeFrom((SDKEvent) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(SDKEvent sDKEvent) {
            if (sDKEvent == SDKEvent.getDefaultInstance()) {
                return this;
            }
            if (sDKEvent.getAction() != 0) {
                setAction(sDKEvent.getAction());
            }
            if (!sDKEvent.getContext().isEmpty()) {
                this.context_ = sDKEvent.context_;
                onChanged();
            }
            if (sDKEvent.hasNetwork()) {
                mergeNetwork(sDKEvent.getNetwork());
            }
            if (sDKEvent.hasStartTime()) {
                mergeStartTime(sDKEvent.getStartTime());
            }
            if (sDKEvent.hasFinishTime()) {
                mergeFinishTime(sDKEvent.getFinishTime());
            }
            if (sDKEvent.hasAdType()) {
                mergeAdType(sDKEvent.getAdType());
            }
            if (sDKEvent.getPrice() != 0.0d) {
                setPrice(sDKEvent.getPrice());
            }
            if (sDKEvent.hasError()) {
                mergeError(sDKEvent.getError());
            }
            if (sDKEvent.hasCustomParams()) {
                mergeCustomParams(sDKEvent.getCustomParams());
            }
            mergeUnknownFields(((k7) sDKEvent).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.bidmachine.protobuf.analytics.events.SDKEvent.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.analytics.events.SDKEvent.access$1400()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.analytics.events.SDKEvent r3 = (io.bidmachine.protobuf.analytics.events.SDKEvent) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.analytics.events.SDKEvent r4 = (io.bidmachine.protobuf.analytics.events.SDKEvent) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.events.SDKEvent.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.analytics.events.SDKEvent$Builder");
        }
    }

    public static Builder newBuilder(SDKEvent sDKEvent) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(sDKEvent);
    }

    public static SDKEvent parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (SDKEvent) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private SDKEvent(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static SDKEvent parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (SDKEvent) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static SDKEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SDKEvent) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public SDKEvent getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static SDKEvent parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (SDKEvent) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private SDKEvent() {
        this.memoizedIsInitialized = (byte) -1;
        this.context_ = "";
    }

    public static SDKEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SDKEvent) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static SDKEvent parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (SDKEvent) PARSER.parseFrom(bArr, m5Var);
    }

    public static SDKEvent parseFrom(InputStream inputStream) throws IOException {
        return (SDKEvent) k7.parseWithIOException(PARSER, inputStream);
    }

    private SDKEvent(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        this();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int tag = yVar.readTag();
                    if (tag != 0) {
                        if (tag == 8) {
                            this.action_ = yVar.readUInt32();
                        } else if (tag != 18) {
                            if (tag == 26) {
                                StringValue stringValue = this.network_;
                                StringValue.Builder builder = stringValue != null ? stringValue.toBuilder() : null;
                                StringValue stringValue2 = (StringValue) yVar.readMessage(StringValue.parser(), m5Var);
                                this.network_ = stringValue2;
                                if (builder != null) {
                                    builder.mergeFrom(stringValue2);
                                    this.network_ = builder.buildPartial();
                                }
                            } else if (tag == 34) {
                                Timestamp timestamp = this.startTime_;
                                Timestamp.Builder builder2 = timestamp != null ? timestamp.toBuilder() : null;
                                Timestamp timestamp2 = (Timestamp) yVar.readMessage(Timestamp.parser(), m5Var);
                                this.startTime_ = timestamp2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(timestamp2);
                                    this.startTime_ = builder2.buildPartial();
                                }
                            } else if (tag == 42) {
                                Timestamp timestamp3 = this.finishTime_;
                                Timestamp.Builder builder3 = timestamp3 != null ? timestamp3.toBuilder() : null;
                                Timestamp timestamp4 = (Timestamp) yVar.readMessage(Timestamp.parser(), m5Var);
                                this.finishTime_ = timestamp4;
                                if (builder3 != null) {
                                    builder3.mergeFrom(timestamp4);
                                    this.finishTime_ = builder3.buildPartial();
                                }
                            } else if (tag == 50) {
                                StringValue stringValue3 = this.adType_;
                                StringValue.Builder builder4 = stringValue3 != null ? stringValue3.toBuilder() : null;
                                StringValue stringValue4 = (StringValue) yVar.readMessage(StringValue.parser(), m5Var);
                                this.adType_ = stringValue4;
                                if (builder4 != null) {
                                    builder4.mergeFrom(stringValue4);
                                    this.adType_ = builder4.buildPartial();
                                }
                            } else if (tag == 57) {
                                this.price_ = yVar.readDouble();
                            } else if (tag == 66) {
                                Error error = this.error_;
                                Error.Builder builder5 = error != null ? error.toBuilder() : null;
                                Error error2 = (Error) yVar.readMessage(Error.parser(), m5Var);
                                this.error_ = error2;
                                if (builder5 != null) {
                                    builder5.mergeFrom(error2);
                                    this.error_ = builder5.buildPartial();
                                }
                            } else if (tag != 74) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                Struct struct = this.customParams_;
                                Struct.Builder builder6 = struct != null ? struct.toBuilder() : null;
                                Struct struct2 = (Struct) yVar.readMessage(Struct.parser(), m5Var);
                                this.customParams_ = struct2;
                                if (builder6 != null) {
                                    builder6.mergeFrom(struct2);
                                    this.customParams_ = builder6.buildPartial();
                                }
                            }
                        } else {
                            this.context_ = yVar.readStringRequireUtf8();
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

    public static SDKEvent parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (SDKEvent) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static SDKEvent parseFrom(y yVar) throws IOException {
        return (SDKEvent) k7.parseWithIOException(PARSER, yVar);
    }

    public static SDKEvent parseFrom(y yVar, m5 m5Var) throws IOException {
        return (SDKEvent) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
