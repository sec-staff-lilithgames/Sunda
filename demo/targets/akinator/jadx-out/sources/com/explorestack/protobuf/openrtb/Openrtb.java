package com.explorestack.protobuf.openrtb;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.cc;
import com.explorestack.protobuf.fa;
import com.explorestack.protobuf.gc;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.j7;
import com.explorestack.protobuf.k7;
import com.explorestack.protobuf.m5;
import com.explorestack.protobuf.o6;
import com.explorestack.protobuf.o7;
import com.explorestack.protobuf.openrtb.Request;
import com.explorestack.protobuf.openrtb.Response;
import com.explorestack.protobuf.p6;
import com.explorestack.protobuf.xa;
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class Openrtb extends k7 implements c {
    public static final int DOMAINSPEC_FIELD_NUMBER = 2;
    public static final int DOMAINVER_FIELD_NUMBER = 3;
    public static final int REQUEST_FIELD_NUMBER = 4;
    public static final int RESPONSE_FIELD_NUMBER = 5;
    public static final int VER_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private volatile Object domainspec_;
    private volatile Object domainver_;
    private byte memoizedIsInitialized;
    private int payloadCase_;
    private Object payload_;
    private volatile Object ver_;
    private static final Openrtb DEFAULT_INSTANCE = new Openrtb();
    private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.openrtb.Openrtb.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public Openrtb parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new Openrtb(yVar, m5Var);
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.explorestack.protobuf.openrtb.Openrtb$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$explorestack$protobuf$openrtb$Openrtb$PayloadCase;

        static {
            int[] iArr = new int[PayloadCase.values().length];
            $SwitchMap$com$explorestack$protobuf$openrtb$Openrtb$PayloadCase = iArr;
            try {
                iArr[PayloadCase.REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$explorestack$protobuf$openrtb$Openrtb$PayloadCase[PayloadCase.RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$explorestack$protobuf$openrtb$Openrtb$PayloadCase[PayloadCase.PAYLOAD_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum PayloadCase implements o7, com.explorestack.protobuf.c {
        REQUEST(4),
        RESPONSE(5),
        PAYLOAD_NOT_SET(0);

        private final int value;

        PayloadCase(int i10) {
            this.value = i10;
        }

        public static PayloadCase forNumber(int i10) {
            if (i10 == 0) {
                return PAYLOAD_NOT_SET;
            }
            if (i10 == 4) {
                return REQUEST;
            }
            if (i10 != 5) {
                return null;
            }
            return RESPONSE;
        }

        @Override // com.explorestack.protobuf.o7
        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static PayloadCase valueOf(int i10) {
            return forNumber(i10);
        }
    }

    public static Openrtb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return d.f22443a;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Openrtb parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Openrtb) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Openrtb parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Openrtb) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Openrtb)) {
            return super.equals(obj);
        }
        Openrtb openrtb = (Openrtb) obj;
        if (!getVer().equals(openrtb.getVer()) || !getDomainspec().equals(openrtb.getDomainspec()) || !getDomainver().equals(openrtb.getDomainver()) || !getPayloadCase().equals(openrtb.getPayloadCase())) {
            return false;
        }
        int i10 = this.payloadCase_;
        if (i10 != 4) {
            if (i10 == 5 && !getResponse().equals(openrtb.getResponse())) {
                return false;
            }
        } else if (!getRequest().equals(openrtb.getRequest())) {
            return false;
        }
        return this.unknownFields.equals(openrtb.unknownFields);
    }

    @Override // com.explorestack.protobuf.openrtb.c
    public String getDomainspec() {
        Object obj = this.domainspec_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.domainspec_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.openrtb.c
    public ByteString getDomainspecBytes() {
        Object obj = this.domainspec_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.domainspec_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.openrtb.c
    public String getDomainver() {
        Object obj = this.domainver_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.domainver_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.openrtb.c
    public ByteString getDomainverBytes() {
        Object obj = this.domainver_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.domainver_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.openrtb.c
    public PayloadCase getPayloadCase() {
        return PayloadCase.forNumber(this.payloadCase_);
    }

    @Override // com.explorestack.protobuf.openrtb.c
    public Request getRequest() {
        return this.payloadCase_ == 4 ? (Request) this.payload_ : Request.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.openrtb.c
    public e getRequestOrBuilder() {
        return this.payloadCase_ == 4 ? (Request) this.payload_ : Request.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.openrtb.c
    public Response getResponse() {
        return this.payloadCase_ == 5 ? (Response) this.payload_ : Response.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.openrtb.c
    public f getResponseOrBuilder() {
        return this.payloadCase_ == 5 ? (Response) this.payload_ : Response.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getVerBytes().isEmpty() ? k7.computeStringSize(1, this.ver_) : 0;
        if (!getDomainspecBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(2, this.domainspec_);
        }
        if (!getDomainverBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(3, this.domainver_);
        }
        if (this.payloadCase_ == 4) {
            iComputeStringSize += h0.computeMessageSize(4, (Request) this.payload_);
        }
        if (this.payloadCase_ == 5) {
            iComputeStringSize += h0.computeMessageSize(5, (Response) this.payload_);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.openrtb.c
    public String getVer() {
        Object obj = this.ver_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ver_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.openrtb.c
    public ByteString getVerBytes() {
        Object obj = this.ver_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.ver_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.openrtb.c
    public boolean hasRequest() {
        return this.payloadCase_ == 4;
    }

    @Override // com.explorestack.protobuf.openrtb.c
    public boolean hasResponse() {
        return this.payloadCase_ == 5;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int iB;
        int iHashCode;
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode2 = getDomainver().hashCode() + ((((getDomainspec().hashCode() + ((((getVer().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53);
        int i11 = this.payloadCase_;
        if (i11 != 4) {
            if (i11 == 5) {
                iB = o2.B(iHashCode2, 37, 5, 53);
                iHashCode = getResponse().hashCode();
            }
            int iHashCode3 = this.unknownFields.hashCode() + (iHashCode2 * 29);
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }
        iB = o2.B(iHashCode2, 37, 4, 53);
        iHashCode = getRequest().hashCode();
        iHashCode2 = iHashCode + iB;
        int iHashCode32 = this.unknownFields.hashCode() + (iHashCode2 * 29);
        this.memoizedHashCode = iHashCode32;
        return iHashCode32;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return d.f22444b.ensureFieldAccessorsInitialized(Openrtb.class, Builder.class);
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
        return new Openrtb();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (!getVerBytes().isEmpty()) {
            k7.writeString(h0Var, 1, this.ver_);
        }
        if (!getDomainspecBytes().isEmpty()) {
            k7.writeString(h0Var, 2, this.domainspec_);
        }
        if (!getDomainverBytes().isEmpty()) {
            k7.writeString(h0Var, 3, this.domainver_);
        }
        if (this.payloadCase_ == 4) {
            h0Var.writeMessage(4, (Request) this.payload_);
        }
        if (this.payloadCase_ == 5) {
            h0Var.writeMessage(5, (Response) this.payload_);
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements c {
        private Object domainspec_;
        private Object domainver_;
        private int payloadCase_;
        private Object payload_;
        private xa requestBuilder_;
        private xa responseBuilder_;
        private Object ver_;

        private Builder() {
            super(null);
            this.payloadCase_ = 0;
            this.ver_ = "";
            this.domainspec_ = "";
            this.domainver_ = "";
            maybeForceBuilderInitialization();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return d.f22443a;
        }

        private xa getRequestFieldBuilder() {
            if (this.requestBuilder_ == null) {
                if (this.payloadCase_ != 4) {
                    this.payload_ = Request.getDefaultInstance();
                }
                this.requestBuilder_ = new xa((Request) this.payload_, getParentForChildren(), isClean());
                this.payload_ = null;
            }
            this.payloadCase_ = 4;
            onChanged();
            return this.requestBuilder_;
        }

        private xa getResponseFieldBuilder() {
            if (this.responseBuilder_ == null) {
                if (this.payloadCase_ != 5) {
                    this.payload_ = Response.getDefaultInstance();
                }
                this.responseBuilder_ = new xa((Response) this.payload_, getParentForChildren(), isClean());
                this.payload_ = null;
            }
            this.payloadCase_ = 5;
            onChanged();
            return this.responseBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = k7.alwaysUseFieldBuilders;
        }

        public Builder clearDomainspec() {
            this.domainspec_ = Openrtb.getDefaultInstance().getDomainspec();
            onChanged();
            return this;
        }

        public Builder clearDomainver() {
            this.domainver_ = Openrtb.getDefaultInstance().getDomainver();
            onChanged();
            return this;
        }

        public Builder clearPayload() {
            this.payloadCase_ = 0;
            this.payload_ = null;
            onChanged();
            return this;
        }

        public Builder clearRequest() {
            xa xaVar = this.requestBuilder_;
            if (xaVar == null) {
                if (this.payloadCase_ == 4) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }
            if (this.payloadCase_ == 4) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
            xaVar.clear();
            return this;
        }

        public Builder clearResponse() {
            xa xaVar = this.responseBuilder_;
            if (xaVar == null) {
                if (this.payloadCase_ == 5) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }
            if (this.payloadCase_ == 5) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
            xaVar.clear();
            return this;
        }

        public Builder clearVer() {
            this.ver_ = Openrtb.getDefaultInstance().getVer();
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return d.f22443a;
        }

        @Override // com.explorestack.protobuf.openrtb.c
        public String getDomainspec() {
            Object obj = this.domainspec_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.domainspec_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.c
        public ByteString getDomainspecBytes() {
            Object obj = this.domainspec_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.domainspec_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.c
        public String getDomainver() {
            Object obj = this.domainver_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.domainver_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.c
        public ByteString getDomainverBytes() {
            Object obj = this.domainver_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.domainver_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.c
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.explorestack.protobuf.openrtb.c
        public Request getRequest() {
            xa xaVar = this.requestBuilder_;
            return xaVar == null ? this.payloadCase_ == 4 ? (Request) this.payload_ : Request.getDefaultInstance() : this.payloadCase_ == 4 ? (Request) xaVar.getMessage() : Request.getDefaultInstance();
        }

        public Request.Builder getRequestBuilder() {
            return (Request.Builder) getRequestFieldBuilder().getBuilder();
        }

        @Override // com.explorestack.protobuf.openrtb.c
        public e getRequestOrBuilder() {
            xa xaVar;
            int i10 = this.payloadCase_;
            return (i10 != 4 || (xaVar = this.requestBuilder_) == null) ? i10 == 4 ? (Request) this.payload_ : Request.getDefaultInstance() : (e) xaVar.getMessageOrBuilder();
        }

        @Override // com.explorestack.protobuf.openrtb.c
        public Response getResponse() {
            xa xaVar = this.responseBuilder_;
            return xaVar == null ? this.payloadCase_ == 5 ? (Response) this.payload_ : Response.getDefaultInstance() : this.payloadCase_ == 5 ? (Response) xaVar.getMessage() : Response.getDefaultInstance();
        }

        public Response.Builder getResponseBuilder() {
            return (Response.Builder) getResponseFieldBuilder().getBuilder();
        }

        @Override // com.explorestack.protobuf.openrtb.c
        public f getResponseOrBuilder() {
            xa xaVar;
            int i10 = this.payloadCase_;
            return (i10 != 5 || (xaVar = this.responseBuilder_) == null) ? i10 == 5 ? (Response) this.payload_ : Response.getDefaultInstance() : (f) xaVar.getMessageOrBuilder();
        }

        @Override // com.explorestack.protobuf.openrtb.c
        public String getVer() {
            Object obj = this.ver_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ver_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.c
        public ByteString getVerBytes() {
            Object obj = this.ver_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ver_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.c
        public boolean hasRequest() {
            return this.payloadCase_ == 4;
        }

        @Override // com.explorestack.protobuf.openrtb.c
        public boolean hasResponse() {
            return this.payloadCase_ == 5;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return d.f22444b.ensureFieldAccessorsInitialized(Openrtb.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeRequest(Request request) {
            xa xaVar = this.requestBuilder_;
            if (xaVar == null) {
                if (this.payloadCase_ != 4 || this.payload_ == Request.getDefaultInstance()) {
                    this.payload_ = request;
                } else {
                    this.payload_ = Request.newBuilder((Request) this.payload_).mergeFrom(request).buildPartial();
                }
                onChanged();
            } else {
                if (this.payloadCase_ == 4) {
                    xaVar.mergeFrom(request);
                }
                this.requestBuilder_.setMessage(request);
            }
            this.payloadCase_ = 4;
            return this;
        }

        public Builder mergeResponse(Response response) {
            xa xaVar = this.responseBuilder_;
            if (xaVar == null) {
                if (this.payloadCase_ != 5 || this.payload_ == Response.getDefaultInstance()) {
                    this.payload_ = response;
                } else {
                    this.payload_ = Response.newBuilder((Response) this.payload_).mergeFrom(response).buildPartial();
                }
                onChanged();
            } else {
                if (this.payloadCase_ == 5) {
                    xaVar.mergeFrom(response);
                }
                this.responseBuilder_.setMessage(response);
            }
            this.payloadCase_ = 5;
            return this;
        }

        public Builder setDomainspec(String str) {
            str.getClass();
            this.domainspec_ = str;
            onChanged();
            return this;
        }

        public Builder setDomainspecBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            this.domainspec_ = byteString;
            onChanged();
            return this;
        }

        public Builder setDomainver(String str) {
            str.getClass();
            this.domainver_ = str;
            onChanged();
            return this;
        }

        public Builder setDomainverBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            this.domainver_ = byteString;
            onChanged();
            return this;
        }

        public Builder setRequest(Request request) {
            xa xaVar = this.requestBuilder_;
            if (xaVar == null) {
                request.getClass();
                this.payload_ = request;
                onChanged();
            } else {
                xaVar.setMessage(request);
            }
            this.payloadCase_ = 4;
            return this;
        }

        public Builder setResponse(Response response) {
            xa xaVar = this.responseBuilder_;
            if (xaVar == null) {
                response.getClass();
                this.payload_ = response;
                onChanged();
            } else {
                xaVar.setMessage(response);
            }
            this.payloadCase_ = 5;
            return this;
        }

        public Builder setVer(String str) {
            str.getClass();
            this.ver_ = str;
            onChanged();
            return this;
        }

        public Builder setVerBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            this.ver_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Openrtb build() {
            Openrtb openrtbBuildPartial = buildPartial();
            if (openrtbBuildPartial.isInitialized()) {
                return openrtbBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) openrtbBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Openrtb buildPartial() {
            Openrtb openrtb = new Openrtb(this);
            openrtb.ver_ = this.ver_;
            openrtb.domainspec_ = this.domainspec_;
            openrtb.domainver_ = this.domainver_;
            if (this.payloadCase_ == 4) {
                xa xaVar = this.requestBuilder_;
                if (xaVar == null) {
                    openrtb.payload_ = this.payload_;
                } else {
                    openrtb.payload_ = xaVar.build();
                }
            }
            if (this.payloadCase_ == 5) {
                xa xaVar2 = this.responseBuilder_;
                if (xaVar2 == null) {
                    openrtb.payload_ = this.payload_;
                } else {
                    openrtb.payload_ = xaVar2.build();
                }
            }
            openrtb.payloadCase_ = this.payloadCase_;
            onBuilt();
            return openrtb;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Openrtb getDefaultInstanceForType() {
            return Openrtb.getDefaultInstance();
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
            this.ver_ = "";
            this.domainspec_ = "";
            this.domainver_ = "";
            this.payloadCase_ = 0;
            this.payload_ = null;
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
        /* renamed from: clone */
        public Builder mo500clone() {
            return (Builder) super.mo500clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Openrtb) {
                return mergeFrom((Openrtb) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setRequest(Request.Builder builder) {
            xa xaVar = this.requestBuilder_;
            if (xaVar == null) {
                this.payload_ = builder.build();
                onChanged();
            } else {
                xaVar.setMessage(builder.build());
            }
            this.payloadCase_ = 4;
            return this;
        }

        public Builder setResponse(Response.Builder builder) {
            xa xaVar = this.responseBuilder_;
            if (xaVar == null) {
                this.payload_ = builder.build();
                onChanged();
            } else {
                xaVar.setMessage(builder.build());
            }
            this.payloadCase_ = 5;
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            this.payloadCase_ = 0;
            this.ver_ = "";
            this.domainspec_ = "";
            this.domainver_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder mergeFrom(Openrtb openrtb) {
            if (openrtb == Openrtb.getDefaultInstance()) {
                return this;
            }
            if (!openrtb.getVer().isEmpty()) {
                this.ver_ = openrtb.ver_;
                onChanged();
            }
            if (!openrtb.getDomainspec().isEmpty()) {
                this.domainspec_ = openrtb.domainspec_;
                onChanged();
            }
            if (!openrtb.getDomainver().isEmpty()) {
                this.domainver_ = openrtb.domainver_;
                onChanged();
            }
            int i10 = AnonymousClass2.$SwitchMap$com$explorestack$protobuf$openrtb$Openrtb$PayloadCase[openrtb.getPayloadCase().ordinal()];
            if (i10 == 1) {
                mergeRequest(openrtb.getRequest());
            } else if (i10 == 2) {
                mergeResponse(openrtb.getResponse());
            }
            mergeUnknownFields(((k7) openrtb).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.explorestack.protobuf.openrtb.Openrtb.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.openrtb.Openrtb.access$1000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.explorestack.protobuf.openrtb.Openrtb r3 = (com.explorestack.protobuf.openrtb.Openrtb) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                com.explorestack.protobuf.openrtb.Openrtb r4 = (com.explorestack.protobuf.openrtb.Openrtb) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Openrtb.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.openrtb.Openrtb$Builder");
        }
    }

    public static Builder newBuilder(Openrtb openrtb) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(openrtb);
    }

    public static Openrtb parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (Openrtb) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private Openrtb(o6 o6Var) {
        super(o6Var);
        this.payloadCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Openrtb parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Openrtb) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static Openrtb parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Openrtb) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Openrtb getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Openrtb parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (Openrtb) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Openrtb parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Openrtb) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    private Openrtb() {
        this.payloadCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.ver_ = "";
        this.domainspec_ = "";
        this.domainver_ = "";
    }

    public static Openrtb parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (Openrtb) PARSER.parseFrom(bArr, m5Var);
    }

    public static Openrtb parseFrom(InputStream inputStream) throws IOException {
        return (Openrtb) k7.parseWithIOException(PARSER, inputStream);
    }

    public static Openrtb parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Openrtb) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static Openrtb parseFrom(y yVar) throws IOException {
        return (Openrtb) k7.parseWithIOException(PARSER, yVar);
    }

    private Openrtb(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        this();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int tag = yVar.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                this.ver_ = yVar.readStringRequireUtf8();
                            } else if (tag == 18) {
                                this.domainspec_ = yVar.readStringRequireUtf8();
                            } else if (tag != 26) {
                                if (tag == 34) {
                                    Request.Builder builder = this.payloadCase_ == 4 ? ((Request) this.payload_).toBuilder() : null;
                                    MessageLite message = yVar.readMessage(Request.parser(), m5Var);
                                    this.payload_ = message;
                                    if (builder != null) {
                                        builder.mergeFrom((Request) message);
                                        this.payload_ = builder.buildPartial();
                                    }
                                    this.payloadCase_ = 4;
                                } else if (tag != 42) {
                                    if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                    }
                                } else {
                                    Response.Builder builder2 = this.payloadCase_ == 5 ? ((Response) this.payload_).toBuilder() : null;
                                    MessageLite message2 = yVar.readMessage(Response.parser(), m5Var);
                                    this.payload_ = message2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((Response) message2);
                                        this.payload_ = builder2.buildPartial();
                                    }
                                    this.payloadCase_ = 5;
                                }
                            } else {
                                this.domainver_ = yVar.readStringRequireUtf8();
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

    public static Openrtb parseFrom(y yVar, m5 m5Var) throws IOException {
        return (Openrtb) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
