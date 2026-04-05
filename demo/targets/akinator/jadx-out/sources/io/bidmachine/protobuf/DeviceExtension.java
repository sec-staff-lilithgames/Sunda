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
import com.explorestack.protobuf.x7;
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes9.dex */
public final class DeviceExtension extends k7 implements DeviceExtensionOrBuilder {
    public static final int BATTERY_FIELD_NUMBER = 1;
    private static final DeviceExtension DEFAULT_INSTANCE = new DeviceExtension();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.DeviceExtension.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public DeviceExtension parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new DeviceExtension(yVar, m5Var);
        }
    };
    public static final int ROOTED_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private int battery_;
    private byte memoizedIsInitialized;
    private boolean rooted_;

    public static DeviceExtension getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_DeviceExtension_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DeviceExtension parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DeviceExtension) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DeviceExtension parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DeviceExtension) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeviceExtension)) {
            return super.equals(obj);
        }
        DeviceExtension deviceExtension = (DeviceExtension) obj;
        return getBattery() == deviceExtension.getBattery() && getRooted() == deviceExtension.getRooted() && this.unknownFields.equals(deviceExtension.unknownFields);
    }

    @Override // io.bidmachine.protobuf.DeviceExtensionOrBuilder
    public int getBattery() {
        return this.battery_;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.DeviceExtensionOrBuilder
    public boolean getRooted() {
        return this.rooted_;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.battery_;
        int iComputeUInt32Size = i11 != 0 ? h0.computeUInt32Size(1, i11) : 0;
        boolean z10 = this.rooted_;
        if (z10) {
            iComputeUInt32Size += h0.computeBoolSize(2, z10);
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
        int iHashCode = this.unknownFields.hashCode() + ((x7.hashBoolean(getRooted()) + ((((getBattery() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_DeviceExtension_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceExtension.class, Builder.class);
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
        return new DeviceExtension();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        int i10 = this.battery_;
        if (i10 != 0) {
            h0Var.writeUInt32(1, i10);
        }
        boolean z10 = this.rooted_;
        if (z10) {
            h0Var.writeBool(2, z10);
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements DeviceExtensionOrBuilder {
        private int battery_;
        private boolean rooted_;

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_DeviceExtension_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = k7.alwaysUseFieldBuilders;
        }

        public Builder clearBattery() {
            this.battery_ = 0;
            onChanged();
            return this;
        }

        public Builder clearRooted() {
            this.rooted_ = false;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.DeviceExtensionOrBuilder
        public int getBattery() {
            return this.battery_;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_DeviceExtension_descriptor;
        }

        @Override // io.bidmachine.protobuf.DeviceExtensionOrBuilder
        public boolean getRooted() {
            return this.rooted_;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_DeviceExtension_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceExtension.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setBattery(int i10) {
            this.battery_ = i10;
            onChanged();
            return this;
        }

        public Builder setRooted(boolean z10) {
            this.rooted_ = z10;
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
        public DeviceExtension build() {
            DeviceExtension deviceExtensionBuildPartial = buildPartial();
            if (deviceExtensionBuildPartial.isInitialized()) {
                return deviceExtensionBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) deviceExtensionBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public DeviceExtension buildPartial() {
            DeviceExtension deviceExtension = new DeviceExtension(this);
            deviceExtension.battery_ = this.battery_;
            deviceExtension.rooted_ = this.rooted_;
            onBuilt();
            return deviceExtension;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public DeviceExtension getDefaultInstanceForType() {
            return DeviceExtension.getDefaultInstance();
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
            this.battery_ = 0;
            this.rooted_ = false;
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
        /* renamed from: clone */
        public Builder mo500clone() {
            return (Builder) super.mo500clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof DeviceExtension) {
                return mergeFrom((DeviceExtension) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(DeviceExtension deviceExtension) {
            if (deviceExtension == DeviceExtension.getDefaultInstance()) {
                return this;
            }
            if (deviceExtension.getBattery() != 0) {
                setBattery(deviceExtension.getBattery());
            }
            if (deviceExtension.getRooted()) {
                setRooted(deviceExtension.getRooted());
            }
            mergeUnknownFields(((k7) deviceExtension).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.bidmachine.protobuf.DeviceExtension.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.DeviceExtension.access$700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.DeviceExtension r3 = (io.bidmachine.protobuf.DeviceExtension) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.DeviceExtension r4 = (io.bidmachine.protobuf.DeviceExtension) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.DeviceExtension.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.DeviceExtension$Builder");
        }
    }

    public static Builder newBuilder(DeviceExtension deviceExtension) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(deviceExtension);
    }

    public static DeviceExtension parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (DeviceExtension) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private DeviceExtension(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DeviceExtension parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (DeviceExtension) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static DeviceExtension parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DeviceExtension) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public DeviceExtension getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static DeviceExtension parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (DeviceExtension) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private DeviceExtension() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DeviceExtension parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DeviceExtension) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static DeviceExtension parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (DeviceExtension) PARSER.parseFrom(bArr, m5Var);
    }

    private DeviceExtension(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                            this.battery_ = yVar.readUInt32();
                        } else if (tag != 16) {
                            if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                            }
                        } else {
                            this.rooted_ = yVar.readBool();
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

    public static DeviceExtension parseFrom(InputStream inputStream) throws IOException {
        return (DeviceExtension) k7.parseWithIOException(PARSER, inputStream);
    }

    public static DeviceExtension parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (DeviceExtension) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static DeviceExtension parseFrom(y yVar) throws IOException {
        return (DeviceExtension) k7.parseWithIOException(PARSER, yVar);
    }

    public static DeviceExtension parseFrom(y yVar, m5 m5Var) throws IOException {
        return (DeviceExtension) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
