package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
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
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class AdCachePlacementControl extends k7 implements AdCachePlacementControlOrBuilder {
    public static final int MAX_AGE_FIELD_NUMBER = 3;
    public static final int MAX_CACHE_SIZE_FIELD_NUMBER = 2;
    public static final int MAX_RETAIN_COUNT_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private int maxAge_;
    private int maxCacheSize_;
    private int maxRetainCount_;
    private byte memoizedIsInitialized;
    private static final AdCachePlacementControl DEFAULT_INSTANCE = new AdCachePlacementControl();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.AdCachePlacementControl.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public AdCachePlacementControl parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new AdCachePlacementControl(yVar, m5Var);
        }
    };

    public static AdCachePlacementControl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return InitProto.internal_static_bidmachine_protobuf_AdCachePlacementControl_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static AdCachePlacementControl parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AdCachePlacementControl) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AdCachePlacementControl parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AdCachePlacementControl) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdCachePlacementControl)) {
            return super.equals(obj);
        }
        AdCachePlacementControl adCachePlacementControl = (AdCachePlacementControl) obj;
        return getMaxCacheSize() == adCachePlacementControl.getMaxCacheSize() && getMaxRetainCount() == adCachePlacementControl.getMaxRetainCount() && getMaxAge() == adCachePlacementControl.getMaxAge() && this.unknownFields.equals(adCachePlacementControl.unknownFields);
    }

    @Override // io.bidmachine.protobuf.AdCachePlacementControlOrBuilder
    public int getMaxAge() {
        return this.maxAge_;
    }

    @Override // io.bidmachine.protobuf.AdCachePlacementControlOrBuilder
    public int getMaxCacheSize() {
        return this.maxCacheSize_;
    }

    @Override // io.bidmachine.protobuf.AdCachePlacementControlOrBuilder
    public int getMaxRetainCount() {
        return this.maxRetainCount_;
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
        int i11 = this.maxCacheSize_;
        int iComputeUInt32Size = i11 != 0 ? h0.computeUInt32Size(2, i11) : 0;
        int i12 = this.maxAge_;
        if (i12 != 0) {
            iComputeUInt32Size += h0.computeUInt32Size(3, i12);
        }
        int i13 = this.maxRetainCount_;
        if (i13 != 0) {
            iComputeUInt32Size += h0.computeUInt32Size(4, i13);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeUInt32Size;
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
        int iHashCode = this.unknownFields.hashCode() + ((getMaxAge() + ((((getMaxRetainCount() + ((((getMaxCacheSize() + ((((getDescriptor().hashCode() + 779) * 37) + 2) * 53)) * 37) + 4) * 53)) * 37) + 3) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return InitProto.internal_static_bidmachine_protobuf_AdCachePlacementControl_fieldAccessorTable.ensureFieldAccessorsInitialized(AdCachePlacementControl.class, Builder.class);
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
        return new AdCachePlacementControl();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        int i10 = this.maxCacheSize_;
        if (i10 != 0) {
            h0Var.writeUInt32(2, i10);
        }
        int i11 = this.maxAge_;
        if (i11 != 0) {
            h0Var.writeUInt32(3, i11);
        }
        int i12 = this.maxRetainCount_;
        if (i12 != 0) {
            h0Var.writeUInt32(4, i12);
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements AdCachePlacementControlOrBuilder {
        private int maxAge_;
        private int maxCacheSize_;
        private int maxRetainCount_;

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_AdCachePlacementControl_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = k7.alwaysUseFieldBuilders;
        }

        public Builder clearMaxAge() {
            this.maxAge_ = 0;
            onChanged();
            return this;
        }

        public Builder clearMaxCacheSize() {
            this.maxCacheSize_ = 0;
            onChanged();
            return this;
        }

        public Builder clearMaxRetainCount() {
            this.maxRetainCount_ = 0;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return InitProto.internal_static_bidmachine_protobuf_AdCachePlacementControl_descriptor;
        }

        @Override // io.bidmachine.protobuf.AdCachePlacementControlOrBuilder
        public int getMaxAge() {
            return this.maxAge_;
        }

        @Override // io.bidmachine.protobuf.AdCachePlacementControlOrBuilder
        public int getMaxCacheSize() {
            return this.maxCacheSize_;
        }

        @Override // io.bidmachine.protobuf.AdCachePlacementControlOrBuilder
        public int getMaxRetainCount() {
            return this.maxRetainCount_;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_AdCachePlacementControl_fieldAccessorTable.ensureFieldAccessorsInitialized(AdCachePlacementControl.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setMaxAge(int i10) {
            this.maxAge_ = i10;
            onChanged();
            return this;
        }

        public Builder setMaxCacheSize(int i10) {
            this.maxCacheSize_ = i10;
            onChanged();
            return this;
        }

        public Builder setMaxRetainCount(int i10) {
            this.maxRetainCount_ = i10;
            onChanged();
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AdCachePlacementControl build() {
            AdCachePlacementControl adCachePlacementControlBuildPartial = buildPartial();
            if (adCachePlacementControlBuildPartial.isInitialized()) {
                return adCachePlacementControlBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) adCachePlacementControlBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AdCachePlacementControl buildPartial() {
            AdCachePlacementControl adCachePlacementControl = new AdCachePlacementControl(this);
            adCachePlacementControl.maxCacheSize_ = this.maxCacheSize_;
            adCachePlacementControl.maxRetainCount_ = this.maxRetainCount_;
            adCachePlacementControl.maxAge_ = this.maxAge_;
            onBuilt();
            return adCachePlacementControl;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public AdCachePlacementControl getDefaultInstanceForType() {
            return AdCachePlacementControl.getDefaultInstance();
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

        private Builder() {
            super(null);
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.maxCacheSize_ = 0;
            this.maxRetainCount_ = 0;
            this.maxAge_ = 0;
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
        /* renamed from: clone */
        public Builder mo500clone() {
            return (Builder) super.mo500clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof AdCachePlacementControl) {
                return mergeFrom((AdCachePlacementControl) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(AdCachePlacementControl adCachePlacementControl) {
            if (adCachePlacementControl == AdCachePlacementControl.getDefaultInstance()) {
                return this;
            }
            if (adCachePlacementControl.getMaxCacheSize() != 0) {
                setMaxCacheSize(adCachePlacementControl.getMaxCacheSize());
            }
            if (adCachePlacementControl.getMaxRetainCount() != 0) {
                setMaxRetainCount(adCachePlacementControl.getMaxRetainCount());
            }
            if (adCachePlacementControl.getMaxAge() != 0) {
                setMaxAge(adCachePlacementControl.getMaxAge());
            }
            mergeUnknownFields(((k7) adCachePlacementControl).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.bidmachine.protobuf.AdCachePlacementControl.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.AdCachePlacementControl.access$800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.AdCachePlacementControl r3 = (io.bidmachine.protobuf.AdCachePlacementControl) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.AdCachePlacementControl r4 = (io.bidmachine.protobuf.AdCachePlacementControl) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.AdCachePlacementControl.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.AdCachePlacementControl$Builder");
        }
    }

    public static Builder newBuilder(AdCachePlacementControl adCachePlacementControl) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(adCachePlacementControl);
    }

    public static AdCachePlacementControl parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (AdCachePlacementControl) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private AdCachePlacementControl(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static AdCachePlacementControl parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (AdCachePlacementControl) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static AdCachePlacementControl parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AdCachePlacementControl) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public AdCachePlacementControl getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static AdCachePlacementControl parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (AdCachePlacementControl) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private AdCachePlacementControl() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static AdCachePlacementControl parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AdCachePlacementControl) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static AdCachePlacementControl parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (AdCachePlacementControl) PARSER.parseFrom(bArr, m5Var);
    }

    private AdCachePlacementControl(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        this();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int tag = yVar.readTag();
                    if (tag != 0) {
                        if (tag == 16) {
                            this.maxCacheSize_ = yVar.readUInt32();
                        } else if (tag == 24) {
                            this.maxAge_ = yVar.readUInt32();
                        } else if (tag != 32) {
                            if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                            }
                        } else {
                            this.maxRetainCount_ = yVar.readUInt32();
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

    public static AdCachePlacementControl parseFrom(InputStream inputStream) throws IOException {
        return (AdCachePlacementControl) k7.parseWithIOException(PARSER, inputStream);
    }

    public static AdCachePlacementControl parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (AdCachePlacementControl) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static AdCachePlacementControl parseFrom(y yVar) throws IOException {
        return (AdCachePlacementControl) k7.parseWithIOException(PARSER, yVar);
    }

    public static AdCachePlacementControl parseFrom(y yVar, m5 m5Var) throws IOException {
        return (AdCachePlacementControl) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
