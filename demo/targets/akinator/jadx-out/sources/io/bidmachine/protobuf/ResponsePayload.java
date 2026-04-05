package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.s;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.c;
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
import com.explorestack.protobuf.o7;
import com.explorestack.protobuf.openrtb.Openrtb;
import com.explorestack.protobuf.p6;
import com.explorestack.protobuf.sb;
import com.explorestack.protobuf.xa;
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class ResponsePayload extends k7 implements ResponsePayloadOrBuilder {
    public static final int CACHE_TIME_FIELD_NUMBER = 1;
    private static final ResponsePayload DEFAULT_INSTANCE = new ResponsePayload();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.ResponsePayload.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public ResponsePayload parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new ResponsePayload(yVar, m5Var);
        }
    };
    public static final int REQUEST_ITEM_SPEC_FIELD_NUMBER = 4;
    public static final int RESPONSE_CACHE_FIELD_NUMBER = 3;
    public static final int RESPONSE_CACHE_URL_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private Timestamp cacheTime_;
    private byte memoizedIsInitialized;
    private int payloadOneofCase_;
    private Object payloadOneof_;
    private Placement requestItemSpec_;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.protobuf.ResponsePayload$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$ResponsePayload$PayloadOneofCase;

        static {
            int[] iArr = new int[PayloadOneofCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$ResponsePayload$PayloadOneofCase = iArr;
            try {
                iArr[PayloadOneofCase.RESPONSE_CACHE_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$ResponsePayload$PayloadOneofCase[PayloadOneofCase.RESPONSE_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$ResponsePayload$PayloadOneofCase[PayloadOneofCase.PAYLOADONEOF_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum PayloadOneofCase implements o7, c {
        RESPONSE_CACHE_URL(2),
        RESPONSE_CACHE(3),
        PAYLOADONEOF_NOT_SET(0);

        private final int value;

        PayloadOneofCase(int i10) {
            this.value = i10;
        }

        public static PayloadOneofCase forNumber(int i10) {
            if (i10 == 0) {
                return PAYLOADONEOF_NOT_SET;
            }
            if (i10 == 2) {
                return RESPONSE_CACHE_URL;
            }
            if (i10 != 3) {
                return null;
            }
            return RESPONSE_CACHE;
        }

        @Override // com.explorestack.protobuf.o7
        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static PayloadOneofCase valueOf(int i10) {
            return forNumber(i10);
        }
    }

    public static ResponsePayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return CacheProto.internal_static_bidmachine_protobuf_ResponsePayload_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static ResponsePayload parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ResponsePayload) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ResponsePayload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ResponsePayload) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResponsePayload)) {
            return super.equals(obj);
        }
        ResponsePayload responsePayload = (ResponsePayload) obj;
        if (hasCacheTime() != responsePayload.hasCacheTime()) {
            return false;
        }
        if ((hasCacheTime() && !getCacheTime().equals(responsePayload.getCacheTime())) || hasRequestItemSpec() != responsePayload.hasRequestItemSpec()) {
            return false;
        }
        if ((hasRequestItemSpec() && !getRequestItemSpec().equals(responsePayload.getRequestItemSpec())) || !getPayloadOneofCase().equals(responsePayload.getPayloadOneofCase())) {
            return false;
        }
        int i10 = this.payloadOneofCase_;
        if (i10 != 2) {
            if (i10 == 3 && !getResponseCache().equals(responsePayload.getResponseCache())) {
                return false;
            }
        } else if (!getResponseCacheUrl().equals(responsePayload.getResponseCacheUrl())) {
            return false;
        }
        return this.unknownFields.equals(responsePayload.unknownFields);
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public Timestamp getCacheTime() {
        Timestamp timestamp = this.cacheTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public sb getCacheTimeOrBuilder() {
        return getCacheTime();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public PayloadOneofCase getPayloadOneofCase() {
        return PayloadOneofCase.forNumber(this.payloadOneofCase_);
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public Placement getRequestItemSpec() {
        Placement placement = this.requestItemSpec_;
        return placement == null ? Placement.getDefaultInstance() : placement;
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public s getRequestItemSpecOrBuilder() {
        return getRequestItemSpec();
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public Openrtb getResponseCache() {
        return this.payloadOneofCase_ == 3 ? (Openrtb) this.payloadOneof_ : Openrtb.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public com.explorestack.protobuf.openrtb.c getResponseCacheOrBuilder() {
        return this.payloadOneofCase_ == 3 ? (Openrtb) this.payloadOneof_ : Openrtb.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public String getResponseCacheUrl() {
        String str = this.payloadOneofCase_ == 2 ? this.payloadOneof_ : "";
        if (str instanceof String) {
            return (String) str;
        }
        String stringUtf8 = ((ByteString) str).toStringUtf8();
        if (this.payloadOneofCase_ == 2) {
            this.payloadOneof_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public ByteString getResponseCacheUrlBytes() {
        String str = this.payloadOneofCase_ == 2 ? this.payloadOneof_ : "";
        if (!(str instanceof String)) {
            return (ByteString) str;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) str);
        if (this.payloadOneofCase_ == 2) {
            this.payloadOneof_ = byteStringCopyFromUtf8;
        }
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeMessageSize = this.cacheTime_ != null ? h0.computeMessageSize(1, getCacheTime()) : 0;
        if (this.payloadOneofCase_ == 2) {
            iComputeMessageSize += k7.computeStringSize(2, this.payloadOneof_);
        }
        if (this.payloadOneofCase_ == 3) {
            iComputeMessageSize += h0.computeMessageSize(3, (Openrtb) this.payloadOneof_);
        }
        if (this.requestItemSpec_ != null) {
            iComputeMessageSize += h0.computeMessageSize(4, getRequestItemSpec());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public boolean hasCacheTime() {
        return this.cacheTime_ != null;
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public boolean hasRequestItemSpec() {
        return this.requestItemSpec_ != null;
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public boolean hasResponseCache() {
        return this.payloadOneofCase_ == 3;
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public boolean hasResponseCacheUrl() {
        return this.payloadOneofCase_ == 2;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int iB;
        int iHashCode;
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode2 = getDescriptor().hashCode() + 779;
        if (hasCacheTime()) {
            iHashCode2 = o2.B(iHashCode2, 37, 1, 53) + getCacheTime().hashCode();
        }
        if (hasRequestItemSpec()) {
            iHashCode2 = o2.B(iHashCode2, 37, 4, 53) + getRequestItemSpec().hashCode();
        }
        int i11 = this.payloadOneofCase_;
        if (i11 != 2) {
            if (i11 == 3) {
                iB = o2.B(iHashCode2, 37, 3, 53);
                iHashCode = getResponseCache().hashCode();
            }
            int iHashCode3 = this.unknownFields.hashCode() + (iHashCode2 * 29);
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }
        iB = o2.B(iHashCode2, 37, 2, 53);
        iHashCode = getResponseCacheUrl().hashCode();
        iHashCode2 = iB + iHashCode;
        int iHashCode32 = this.unknownFields.hashCode() + (iHashCode2 * 29);
        this.memoizedHashCode = iHashCode32;
        return iHashCode32;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return CacheProto.internal_static_bidmachine_protobuf_ResponsePayload_fieldAccessorTable.ensureFieldAccessorsInitialized(ResponsePayload.class, Builder.class);
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
        return new ResponsePayload();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (this.cacheTime_ != null) {
            h0Var.writeMessage(1, getCacheTime());
        }
        if (this.payloadOneofCase_ == 2) {
            k7.writeString(h0Var, 2, this.payloadOneof_);
        }
        if (this.payloadOneofCase_ == 3) {
            h0Var.writeMessage(3, (Openrtb) this.payloadOneof_);
        }
        if (this.requestItemSpec_ != null) {
            h0Var.writeMessage(4, getRequestItemSpec());
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements ResponsePayloadOrBuilder {
        private xa cacheTimeBuilder_;
        private Timestamp cacheTime_;
        private int payloadOneofCase_;
        private Object payloadOneof_;
        private xa requestItemSpecBuilder_;
        private Placement requestItemSpec_;
        private xa responseCacheBuilder_;

        private xa getCacheTimeFieldBuilder() {
            if (this.cacheTimeBuilder_ == null) {
                this.cacheTimeBuilder_ = new xa(getCacheTime(), getParentForChildren(), isClean());
                this.cacheTime_ = null;
            }
            return this.cacheTimeBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_ResponsePayload_descriptor;
        }

        private xa getRequestItemSpecFieldBuilder() {
            if (this.requestItemSpecBuilder_ == null) {
                this.requestItemSpecBuilder_ = new xa(getRequestItemSpec(), getParentForChildren(), isClean());
                this.requestItemSpec_ = null;
            }
            return this.requestItemSpecBuilder_;
        }

        private xa getResponseCacheFieldBuilder() {
            if (this.responseCacheBuilder_ == null) {
                if (this.payloadOneofCase_ != 3) {
                    this.payloadOneof_ = Openrtb.getDefaultInstance();
                }
                this.responseCacheBuilder_ = new xa((Openrtb) this.payloadOneof_, getParentForChildren(), isClean());
                this.payloadOneof_ = null;
            }
            this.payloadOneofCase_ = 3;
            onChanged();
            return this.responseCacheBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = k7.alwaysUseFieldBuilders;
        }

        public Builder clearCacheTime() {
            if (this.cacheTimeBuilder_ == null) {
                this.cacheTime_ = null;
                onChanged();
                return this;
            }
            this.cacheTime_ = null;
            this.cacheTimeBuilder_ = null;
            return this;
        }

        public Builder clearPayloadOneof() {
            this.payloadOneofCase_ = 0;
            this.payloadOneof_ = null;
            onChanged();
            return this;
        }

        public Builder clearRequestItemSpec() {
            if (this.requestItemSpecBuilder_ == null) {
                this.requestItemSpec_ = null;
                onChanged();
                return this;
            }
            this.requestItemSpec_ = null;
            this.requestItemSpecBuilder_ = null;
            return this;
        }

        public Builder clearResponseCache() {
            xa xaVar = this.responseCacheBuilder_;
            if (xaVar == null) {
                if (this.payloadOneofCase_ == 3) {
                    this.payloadOneofCase_ = 0;
                    this.payloadOneof_ = null;
                    onChanged();
                }
                return this;
            }
            if (this.payloadOneofCase_ == 3) {
                this.payloadOneofCase_ = 0;
                this.payloadOneof_ = null;
            }
            xaVar.clear();
            return this;
        }

        public Builder clearResponseCacheUrl() {
            if (this.payloadOneofCase_ == 2) {
                this.payloadOneofCase_ = 0;
                this.payloadOneof_ = null;
                onChanged();
            }
            return this;
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public Timestamp getCacheTime() {
            xa xaVar = this.cacheTimeBuilder_;
            if (xaVar != null) {
                return (Timestamp) xaVar.getMessage();
            }
            Timestamp timestamp = this.cacheTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Timestamp.Builder getCacheTimeBuilder() {
            onChanged();
            return (Timestamp.Builder) getCacheTimeFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public sb getCacheTimeOrBuilder() {
            xa xaVar = this.cacheTimeBuilder_;
            if (xaVar != null) {
                return (sb) xaVar.getMessageOrBuilder();
            }
            Timestamp timestamp = this.cacheTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CacheProto.internal_static_bidmachine_protobuf_ResponsePayload_descriptor;
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public PayloadOneofCase getPayloadOneofCase() {
            return PayloadOneofCase.forNumber(this.payloadOneofCase_);
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public Placement getRequestItemSpec() {
            xa xaVar = this.requestItemSpecBuilder_;
            if (xaVar != null) {
                return (Placement) xaVar.getMessage();
            }
            Placement placement = this.requestItemSpec_;
            return placement == null ? Placement.getDefaultInstance() : placement;
        }

        public Placement.Builder getRequestItemSpecBuilder() {
            onChanged();
            return (Placement.Builder) getRequestItemSpecFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public s getRequestItemSpecOrBuilder() {
            xa xaVar = this.requestItemSpecBuilder_;
            if (xaVar != null) {
                return (s) xaVar.getMessageOrBuilder();
            }
            Placement placement = this.requestItemSpec_;
            return placement == null ? Placement.getDefaultInstance() : placement;
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public Openrtb getResponseCache() {
            xa xaVar = this.responseCacheBuilder_;
            return xaVar == null ? this.payloadOneofCase_ == 3 ? (Openrtb) this.payloadOneof_ : Openrtb.getDefaultInstance() : this.payloadOneofCase_ == 3 ? (Openrtb) xaVar.getMessage() : Openrtb.getDefaultInstance();
        }

        public Openrtb.Builder getResponseCacheBuilder() {
            return (Openrtb.Builder) getResponseCacheFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public com.explorestack.protobuf.openrtb.c getResponseCacheOrBuilder() {
            xa xaVar;
            int i10 = this.payloadOneofCase_;
            return (i10 != 3 || (xaVar = this.responseCacheBuilder_) == null) ? i10 == 3 ? (Openrtb) this.payloadOneof_ : Openrtb.getDefaultInstance() : (com.explorestack.protobuf.openrtb.c) xaVar.getMessageOrBuilder();
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public String getResponseCacheUrl() {
            String str = this.payloadOneofCase_ == 2 ? this.payloadOneof_ : "";
            if (str instanceof String) {
                return (String) str;
            }
            String stringUtf8 = ((ByteString) str).toStringUtf8();
            if (this.payloadOneofCase_ == 2) {
                this.payloadOneof_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public ByteString getResponseCacheUrlBytes() {
            String str = this.payloadOneofCase_ == 2 ? this.payloadOneof_ : "";
            if (!(str instanceof String)) {
                return (ByteString) str;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) str);
            if (this.payloadOneofCase_ == 2) {
                this.payloadOneof_ = byteStringCopyFromUtf8;
            }
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public boolean hasCacheTime() {
            return (this.cacheTimeBuilder_ == null && this.cacheTime_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public boolean hasRequestItemSpec() {
            return (this.requestItemSpecBuilder_ == null && this.requestItemSpec_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public boolean hasResponseCache() {
            return this.payloadOneofCase_ == 3;
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public boolean hasResponseCacheUrl() {
            return this.payloadOneofCase_ == 2;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_ResponsePayload_fieldAccessorTable.ensureFieldAccessorsInitialized(ResponsePayload.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeCacheTime(Timestamp timestamp) {
            xa xaVar = this.cacheTimeBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(timestamp);
                return this;
            }
            Timestamp timestamp2 = this.cacheTime_;
            if (timestamp2 != null) {
                this.cacheTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
            } else {
                this.cacheTime_ = timestamp;
            }
            onChanged();
            return this;
        }

        public Builder mergeRequestItemSpec(Placement placement) {
            xa xaVar = this.requestItemSpecBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(placement);
                return this;
            }
            Placement placement2 = this.requestItemSpec_;
            if (placement2 != null) {
                this.requestItemSpec_ = Placement.newBuilder(placement2).mergeFrom(placement).buildPartial();
            } else {
                this.requestItemSpec_ = placement;
            }
            onChanged();
            return this;
        }

        public Builder mergeResponseCache(Openrtb openrtb) {
            xa xaVar = this.responseCacheBuilder_;
            if (xaVar == null) {
                if (this.payloadOneofCase_ != 3 || this.payloadOneof_ == Openrtb.getDefaultInstance()) {
                    this.payloadOneof_ = openrtb;
                } else {
                    this.payloadOneof_ = Openrtb.newBuilder((Openrtb) this.payloadOneof_).mergeFrom(openrtb).buildPartial();
                }
                onChanged();
            } else {
                if (this.payloadOneofCase_ == 3) {
                    xaVar.mergeFrom(openrtb);
                }
                this.responseCacheBuilder_.setMessage(openrtb);
            }
            this.payloadOneofCase_ = 3;
            return this;
        }

        public Builder setCacheTime(Timestamp timestamp) {
            xa xaVar = this.cacheTimeBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(timestamp);
                return this;
            }
            timestamp.getClass();
            this.cacheTime_ = timestamp;
            onChanged();
            return this;
        }

        public Builder setRequestItemSpec(Placement placement) {
            xa xaVar = this.requestItemSpecBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(placement);
                return this;
            }
            placement.getClass();
            this.requestItemSpec_ = placement;
            onChanged();
            return this;
        }

        public Builder setResponseCache(Openrtb openrtb) {
            xa xaVar = this.responseCacheBuilder_;
            if (xaVar == null) {
                openrtb.getClass();
                this.payloadOneof_ = openrtb;
                onChanged();
            } else {
                xaVar.setMessage(openrtb);
            }
            this.payloadOneofCase_ = 3;
            return this;
        }

        public Builder setResponseCacheUrl(String str) {
            str.getClass();
            this.payloadOneofCase_ = 2;
            this.payloadOneof_ = str;
            onChanged();
            return this;
        }

        public Builder setResponseCacheUrlBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.payloadOneofCase_ = 2;
            this.payloadOneof_ = byteString;
            onChanged();
            return this;
        }

        private Builder() {
            super(null);
            this.payloadOneofCase_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public ResponsePayload build() {
            ResponsePayload responsePayloadBuildPartial = buildPartial();
            if (responsePayloadBuildPartial.isInitialized()) {
                return responsePayloadBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) responsePayloadBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public ResponsePayload buildPartial() {
            ResponsePayload responsePayload = new ResponsePayload(this);
            xa xaVar = this.cacheTimeBuilder_;
            if (xaVar == null) {
                responsePayload.cacheTime_ = this.cacheTime_;
            } else {
                responsePayload.cacheTime_ = (Timestamp) xaVar.build();
            }
            xa xaVar2 = this.requestItemSpecBuilder_;
            if (xaVar2 == null) {
                responsePayload.requestItemSpec_ = this.requestItemSpec_;
            } else {
                responsePayload.requestItemSpec_ = (Placement) xaVar2.build();
            }
            if (this.payloadOneofCase_ == 2) {
                responsePayload.payloadOneof_ = this.payloadOneof_;
            }
            if (this.payloadOneofCase_ == 3) {
                xa xaVar3 = this.responseCacheBuilder_;
                if (xaVar3 == null) {
                    responsePayload.payloadOneof_ = this.payloadOneof_;
                } else {
                    responsePayload.payloadOneof_ = xaVar3.build();
                }
            }
            responsePayload.payloadOneofCase_ = this.payloadOneofCase_;
            onBuilt();
            return responsePayload;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public ResponsePayload getDefaultInstanceForType() {
            return ResponsePayload.getDefaultInstance();
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
            if (this.cacheTimeBuilder_ == null) {
                this.cacheTime_ = null;
            } else {
                this.cacheTime_ = null;
                this.cacheTimeBuilder_ = null;
            }
            if (this.requestItemSpecBuilder_ == null) {
                this.requestItemSpec_ = null;
            } else {
                this.requestItemSpec_ = null;
                this.requestItemSpecBuilder_ = null;
            }
            this.payloadOneofCase_ = 0;
            this.payloadOneof_ = null;
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            this.payloadOneofCase_ = 0;
            maybeForceBuilderInitialization();
        }

        public Builder setCacheTime(Timestamp.Builder builder) {
            xa xaVar = this.cacheTimeBuilder_;
            if (xaVar == null) {
                this.cacheTime_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder setRequestItemSpec(Placement.Builder builder) {
            xa xaVar = this.requestItemSpecBuilder_;
            if (xaVar == null) {
                this.requestItemSpec_ = builder.build();
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
            if (message instanceof ResponsePayload) {
                return mergeFrom((ResponsePayload) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setResponseCache(Openrtb.Builder builder) {
            xa xaVar = this.responseCacheBuilder_;
            if (xaVar == null) {
                this.payloadOneof_ = builder.build();
                onChanged();
            } else {
                xaVar.setMessage(builder.build());
            }
            this.payloadOneofCase_ = 3;
            return this;
        }

        public Builder mergeFrom(ResponsePayload responsePayload) {
            if (responsePayload == ResponsePayload.getDefaultInstance()) {
                return this;
            }
            if (responsePayload.hasCacheTime()) {
                mergeCacheTime(responsePayload.getCacheTime());
            }
            if (responsePayload.hasRequestItemSpec()) {
                mergeRequestItemSpec(responsePayload.getRequestItemSpec());
            }
            int i10 = AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$ResponsePayload$PayloadOneofCase[responsePayload.getPayloadOneofCase().ordinal()];
            if (i10 == 1) {
                this.payloadOneofCase_ = 2;
                this.payloadOneof_ = responsePayload.payloadOneof_;
                onChanged();
            } else if (i10 == 2) {
                mergeResponseCache(responsePayload.getResponseCache());
            }
            mergeUnknownFields(((k7) responsePayload).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.bidmachine.protobuf.ResponsePayload.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.ResponsePayload.access$900()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.ResponsePayload r3 = (io.bidmachine.protobuf.ResponsePayload) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.ResponsePayload r4 = (io.bidmachine.protobuf.ResponsePayload) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.ResponsePayload.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.ResponsePayload$Builder");
        }
    }

    public static Builder newBuilder(ResponsePayload responsePayload) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(responsePayload);
    }

    public static ResponsePayload parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (ResponsePayload) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private ResponsePayload(o6 o6Var) {
        super(o6Var);
        this.payloadOneofCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static ResponsePayload parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (ResponsePayload) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static ResponsePayload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ResponsePayload) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public ResponsePayload getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static ResponsePayload parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (ResponsePayload) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static ResponsePayload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ResponsePayload) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    private ResponsePayload() {
        this.payloadOneofCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static ResponsePayload parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (ResponsePayload) PARSER.parseFrom(bArr, m5Var);
    }

    public static ResponsePayload parseFrom(InputStream inputStream) throws IOException {
        return (ResponsePayload) k7.parseWithIOException(PARSER, inputStream);
    }

    private ResponsePayload(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        this();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int tag = yVar.readTag();
                    if (tag != 0) {
                        if (tag == 10) {
                            Timestamp timestamp = this.cacheTime_;
                            Timestamp.Builder builder = timestamp != null ? timestamp.toBuilder() : null;
                            Timestamp timestamp2 = (Timestamp) yVar.readMessage(Timestamp.parser(), m5Var);
                            this.cacheTime_ = timestamp2;
                            if (builder != null) {
                                builder.mergeFrom(timestamp2);
                                this.cacheTime_ = builder.buildPartial();
                            }
                        } else if (tag == 18) {
                            String stringRequireUtf8 = yVar.readStringRequireUtf8();
                            this.payloadOneofCase_ = 2;
                            this.payloadOneof_ = stringRequireUtf8;
                        } else if (tag == 26) {
                            Openrtb.Builder builder2 = this.payloadOneofCase_ == 3 ? ((Openrtb) this.payloadOneof_).toBuilder() : null;
                            MessageLite message = yVar.readMessage(Openrtb.parser(), m5Var);
                            this.payloadOneof_ = message;
                            if (builder2 != null) {
                                builder2.mergeFrom((Openrtb) message);
                                this.payloadOneof_ = builder2.buildPartial();
                            }
                            this.payloadOneofCase_ = 3;
                        } else if (tag != 34) {
                            if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                            }
                        } else {
                            Placement placement = this.requestItemSpec_;
                            Placement.Builder builder3 = placement != null ? placement.toBuilder() : null;
                            Placement placement2 = (Placement) yVar.readMessage(Placement.parser(), m5Var);
                            this.requestItemSpec_ = placement2;
                            if (builder3 != null) {
                                builder3.mergeFrom(placement2);
                                this.requestItemSpec_ = builder3.buildPartial();
                            }
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

    public static ResponsePayload parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (ResponsePayload) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static ResponsePayload parseFrom(y yVar) throws IOException {
        return (ResponsePayload) k7.parseWithIOException(PARSER, yVar);
    }

    public static ResponsePayload parseFrom(y yVar, m5 m5Var) throws IOException {
        return (ResponsePayload) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
