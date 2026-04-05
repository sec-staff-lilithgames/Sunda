package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Timestamp;
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
import com.explorestack.protobuf.sb;
import com.explorestack.protobuf.x7;
import com.explorestack.protobuf.xa;
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes9.dex */
public final class AppExtension extends k7 implements AppExtensionOrBuilder {
    public static final int INSTALL_TIME_FIELD_NUMBER = 1;
    public static final int UPTIME_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private Timestamp installTime_;
    private byte memoizedIsInitialized;
    private long uptime_;
    private static final AppExtension DEFAULT_INSTANCE = new AppExtension();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.AppExtension.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public AppExtension parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new AppExtension(yVar, m5Var);
        }
    };

    public static AppExtension getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_AppExtension_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static AppExtension parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AppExtension) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AppExtension parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AppExtension) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppExtension)) {
            return super.equals(obj);
        }
        AppExtension appExtension = (AppExtension) obj;
        if (hasInstallTime() != appExtension.hasInstallTime()) {
            return false;
        }
        return (!hasInstallTime() || getInstallTime().equals(appExtension.getInstallTime())) && getUptime() == appExtension.getUptime() && this.unknownFields.equals(appExtension.unknownFields);
    }

    @Override // io.bidmachine.protobuf.AppExtensionOrBuilder
    public Timestamp getInstallTime() {
        Timestamp timestamp = this.installTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.AppExtensionOrBuilder
    public sb getInstallTimeOrBuilder() {
        return getInstallTime();
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
        int iComputeMessageSize = this.installTime_ != null ? h0.computeMessageSize(1, getInstallTime()) : 0;
        long j10 = this.uptime_;
        if (j10 != 0) {
            iComputeMessageSize += h0.computeUInt64Size(2, j10);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.AppExtensionOrBuilder
    public long getUptime() {
        return this.uptime_;
    }

    @Override // io.bidmachine.protobuf.AppExtensionOrBuilder
    public boolean hasInstallTime() {
        return this.installTime_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasInstallTime()) {
            iHashCode = o2.B(iHashCode, 37, 1, 53) + getInstallTime().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + ((x7.hashLong(getUptime()) + o2.B(iHashCode, 37, 2, 53)) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_AppExtension_fieldAccessorTable.ensureFieldAccessorsInitialized(AppExtension.class, Builder.class);
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
        return new AppExtension();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (this.installTime_ != null) {
            h0Var.writeMessage(1, getInstallTime());
        }
        long j10 = this.uptime_;
        if (j10 != 0) {
            h0Var.writeUInt64(2, j10);
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements AppExtensionOrBuilder {
        private xa installTimeBuilder_;
        private Timestamp installTime_;
        private long uptime_;

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AppExtension_descriptor;
        }

        private xa getInstallTimeFieldBuilder() {
            if (this.installTimeBuilder_ == null) {
                this.installTimeBuilder_ = new xa(getInstallTime(), getParentForChildren(), isClean());
                this.installTime_ = null;
            }
            return this.installTimeBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = k7.alwaysUseFieldBuilders;
        }

        public Builder clearInstallTime() {
            if (this.installTimeBuilder_ == null) {
                this.installTime_ = null;
                onChanged();
                return this;
            }
            this.installTime_ = null;
            this.installTimeBuilder_ = null;
            return this;
        }

        public Builder clearUptime() {
            this.uptime_ = 0L;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AppExtension_descriptor;
        }

        @Override // io.bidmachine.protobuf.AppExtensionOrBuilder
        public Timestamp getInstallTime() {
            xa xaVar = this.installTimeBuilder_;
            if (xaVar != null) {
                return (Timestamp) xaVar.getMessage();
            }
            Timestamp timestamp = this.installTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Timestamp.Builder getInstallTimeBuilder() {
            onChanged();
            return (Timestamp.Builder) getInstallTimeFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.AppExtensionOrBuilder
        public sb getInstallTimeOrBuilder() {
            xa xaVar = this.installTimeBuilder_;
            if (xaVar != null) {
                return (sb) xaVar.getMessageOrBuilder();
            }
            Timestamp timestamp = this.installTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.AppExtensionOrBuilder
        public long getUptime() {
            return this.uptime_;
        }

        @Override // io.bidmachine.protobuf.AppExtensionOrBuilder
        public boolean hasInstallTime() {
            return (this.installTimeBuilder_ == null && this.installTime_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AppExtension_fieldAccessorTable.ensureFieldAccessorsInitialized(AppExtension.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeInstallTime(Timestamp timestamp) {
            xa xaVar = this.installTimeBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(timestamp);
                return this;
            }
            Timestamp timestamp2 = this.installTime_;
            if (timestamp2 != null) {
                this.installTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
            } else {
                this.installTime_ = timestamp;
            }
            onChanged();
            return this;
        }

        public Builder setInstallTime(Timestamp timestamp) {
            xa xaVar = this.installTimeBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(timestamp);
                return this;
            }
            timestamp.getClass();
            this.installTime_ = timestamp;
            onChanged();
            return this;
        }

        public Builder setUptime(long j10) {
            this.uptime_ = j10;
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
        public AppExtension build() {
            AppExtension appExtensionBuildPartial = buildPartial();
            if (appExtensionBuildPartial.isInitialized()) {
                return appExtensionBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) appExtensionBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AppExtension buildPartial() {
            AppExtension appExtension = new AppExtension(this);
            xa xaVar = this.installTimeBuilder_;
            if (xaVar == null) {
                appExtension.installTime_ = this.installTime_;
            } else {
                appExtension.installTime_ = (Timestamp) xaVar.build();
            }
            appExtension.uptime_ = this.uptime_;
            onBuilt();
            return appExtension;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public AppExtension getDefaultInstanceForType() {
            return AppExtension.getDefaultInstance();
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
            if (this.installTimeBuilder_ == null) {
                this.installTime_ = null;
            } else {
                this.installTime_ = null;
                this.installTimeBuilder_ = null;
            }
            this.uptime_ = 0L;
            return this;
        }

        public Builder setInstallTime(Timestamp.Builder builder) {
            xa xaVar = this.installTimeBuilder_;
            if (xaVar == null) {
                this.installTime_ = builder.build();
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
            if (message instanceof AppExtension) {
                return mergeFrom((AppExtension) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(AppExtension appExtension) {
            if (appExtension == AppExtension.getDefaultInstance()) {
                return this;
            }
            if (appExtension.hasInstallTime()) {
                mergeInstallTime(appExtension.getInstallTime());
            }
            if (appExtension.getUptime() != 0) {
                setUptime(appExtension.getUptime());
            }
            mergeUnknownFields(((k7) appExtension).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.bidmachine.protobuf.AppExtension.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.AppExtension.access$700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.AppExtension r3 = (io.bidmachine.protobuf.AppExtension) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.AppExtension r4 = (io.bidmachine.protobuf.AppExtension) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.AppExtension.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.AppExtension$Builder");
        }
    }

    public static Builder newBuilder(AppExtension appExtension) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(appExtension);
    }

    public static AppExtension parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (AppExtension) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private AppExtension(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static AppExtension parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (AppExtension) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static AppExtension parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AppExtension) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public AppExtension getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static AppExtension parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (AppExtension) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private AppExtension() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static AppExtension parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AppExtension) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static AppExtension parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (AppExtension) PARSER.parseFrom(bArr, m5Var);
    }

    private AppExtension(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                            Timestamp timestamp = this.installTime_;
                            Timestamp.Builder builder = timestamp != null ? timestamp.toBuilder() : null;
                            Timestamp timestamp2 = (Timestamp) yVar.readMessage(Timestamp.parser(), m5Var);
                            this.installTime_ = timestamp2;
                            if (builder != null) {
                                builder.mergeFrom(timestamp2);
                                this.installTime_ = builder.buildPartial();
                            }
                        } else if (tag != 16) {
                            if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                            }
                        } else {
                            this.uptime_ = yVar.readUInt64();
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

    public static AppExtension parseFrom(InputStream inputStream) throws IOException {
        return (AppExtension) k7.parseWithIOException(PARSER, inputStream);
    }

    public static AppExtension parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (AppExtension) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static AppExtension parseFrom(y yVar) throws IOException {
        return (AppExtension) k7.parseWithIOException(PARSER, yVar);
    }

    public static AppExtension parseFrom(y yVar, m5 m5Var) throws IOException {
        return (AppExtension) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
