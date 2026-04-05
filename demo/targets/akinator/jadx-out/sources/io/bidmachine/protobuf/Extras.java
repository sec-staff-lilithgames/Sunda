package io.bidmachine.protobuf;

import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.cc;
import com.explorestack.protobuf.d;
import com.explorestack.protobuf.fa;
import com.explorestack.protobuf.gc;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.j7;
import com.explorestack.protobuf.jb;
import com.explorestack.protobuf.k7;
import com.explorestack.protobuf.m5;
import com.explorestack.protobuf.o6;
import com.explorestack.protobuf.p6;
import com.explorestack.protobuf.xa;
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class Extras extends k7 implements ExtrasOrBuilder {
    public static final int INTERNAL_FIELD_NUMBER = 2;
    public static final int PRIVATE_FIELD_NUMBER = 1;
    public static final int PUBLIC_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private Struct internal_;
    private byte memoizedIsInitialized;
    private Struct private_;
    private Struct public_;
    private static final Extras DEFAULT_INSTANCE = new Extras();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.Extras.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public Extras parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new Extras(yVar, m5Var);
        }
    };

    public static Extras getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_Extras_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Extras parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Extras) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Extras parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Extras) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Extras)) {
            return super.equals(obj);
        }
        Extras extras = (Extras) obj;
        if (hasPrivate() != extras.hasPrivate()) {
            return false;
        }
        if ((hasPrivate() && !getPrivate().equals(extras.getPrivate())) || hasInternal() != extras.hasInternal()) {
            return false;
        }
        if ((!hasInternal() || getInternal().equals(extras.getInternal())) && hasPublic() == extras.hasPublic()) {
            return (!hasPublic() || getPublic().equals(extras.getPublic())) && this.unknownFields.equals(extras.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.ExtrasOrBuilder
    public Struct getInternal() {
        Struct struct = this.internal_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // io.bidmachine.protobuf.ExtrasOrBuilder
    public jb getInternalOrBuilder() {
        return getInternal();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.ExtrasOrBuilder
    public Struct getPrivate() {
        Struct struct = this.private_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // io.bidmachine.protobuf.ExtrasOrBuilder
    public jb getPrivateOrBuilder() {
        return getPrivate();
    }

    @Override // io.bidmachine.protobuf.ExtrasOrBuilder
    public Struct getPublic() {
        Struct struct = this.public_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // io.bidmachine.protobuf.ExtrasOrBuilder
    public jb getPublicOrBuilder() {
        return getPublic();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeMessageSize = this.private_ != null ? h0.computeMessageSize(1, getPrivate()) : 0;
        if (this.internal_ != null) {
            iComputeMessageSize += h0.computeMessageSize(2, getInternal());
        }
        if (this.public_ != null) {
            iComputeMessageSize += h0.computeMessageSize(3, getPublic());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.ExtrasOrBuilder
    public boolean hasInternal() {
        return this.internal_ != null;
    }

    @Override // io.bidmachine.protobuf.ExtrasOrBuilder
    public boolean hasPrivate() {
        return this.private_ != null;
    }

    @Override // io.bidmachine.protobuf.ExtrasOrBuilder
    public boolean hasPublic() {
        return this.public_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasPrivate()) {
            iHashCode = o2.B(iHashCode, 37, 1, 53) + getPrivate().hashCode();
        }
        if (hasInternal()) {
            iHashCode = o2.B(iHashCode, 37, 2, 53) + getInternal().hashCode();
        }
        if (hasPublic()) {
            iHashCode = o2.B(iHashCode, 37, 3, 53) + getPublic().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_Extras_fieldAccessorTable.ensureFieldAccessorsInitialized(Extras.class, Builder.class);
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
        return new Extras();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (this.private_ != null) {
            h0Var.writeMessage(1, getPrivate());
        }
        if (this.internal_ != null) {
            h0Var.writeMessage(2, getInternal());
        }
        if (this.public_ != null) {
            h0Var.writeMessage(3, getPublic());
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements ExtrasOrBuilder {
        private xa internalBuilder_;
        private Struct internal_;
        private xa privateBuilder_;
        private Struct private_;
        private xa publicBuilder_;
        private Struct public_;

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_Extras_descriptor;
        }

        private xa getInternalFieldBuilder() {
            if (this.internalBuilder_ == null) {
                this.internalBuilder_ = new xa(getInternal(), getParentForChildren(), isClean());
                this.internal_ = null;
            }
            return this.internalBuilder_;
        }

        private xa getPrivateFieldBuilder() {
            if (this.privateBuilder_ == null) {
                this.privateBuilder_ = new xa(getPrivate(), getParentForChildren(), isClean());
                this.private_ = null;
            }
            return this.privateBuilder_;
        }

        private xa getPublicFieldBuilder() {
            if (this.publicBuilder_ == null) {
                this.publicBuilder_ = new xa(getPublic(), getParentForChildren(), isClean());
                this.public_ = null;
            }
            return this.publicBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = k7.alwaysUseFieldBuilders;
        }

        public Builder clearInternal() {
            if (this.internalBuilder_ == null) {
                this.internal_ = null;
                onChanged();
                return this;
            }
            this.internal_ = null;
            this.internalBuilder_ = null;
            return this;
        }

        public Builder clearPrivate() {
            if (this.privateBuilder_ == null) {
                this.private_ = null;
                onChanged();
                return this;
            }
            this.private_ = null;
            this.privateBuilder_ = null;
            return this;
        }

        public Builder clearPublic() {
            if (this.publicBuilder_ == null) {
                this.public_ = null;
                onChanged();
                return this;
            }
            this.public_ = null;
            this.publicBuilder_ = null;
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_Extras_descriptor;
        }

        @Override // io.bidmachine.protobuf.ExtrasOrBuilder
        public Struct getInternal() {
            xa xaVar = this.internalBuilder_;
            if (xaVar != null) {
                return (Struct) xaVar.getMessage();
            }
            Struct struct = this.internal_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Struct.Builder getInternalBuilder() {
            onChanged();
            return (Struct.Builder) getInternalFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.ExtrasOrBuilder
        public jb getInternalOrBuilder() {
            xa xaVar = this.internalBuilder_;
            if (xaVar != null) {
                return (jb) xaVar.getMessageOrBuilder();
            }
            Struct struct = this.internal_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // io.bidmachine.protobuf.ExtrasOrBuilder
        public Struct getPrivate() {
            xa xaVar = this.privateBuilder_;
            if (xaVar != null) {
                return (Struct) xaVar.getMessage();
            }
            Struct struct = this.private_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Struct.Builder getPrivateBuilder() {
            onChanged();
            return (Struct.Builder) getPrivateFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.ExtrasOrBuilder
        public jb getPrivateOrBuilder() {
            xa xaVar = this.privateBuilder_;
            if (xaVar != null) {
                return (jb) xaVar.getMessageOrBuilder();
            }
            Struct struct = this.private_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // io.bidmachine.protobuf.ExtrasOrBuilder
        public Struct getPublic() {
            xa xaVar = this.publicBuilder_;
            if (xaVar != null) {
                return (Struct) xaVar.getMessage();
            }
            Struct struct = this.public_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Struct.Builder getPublicBuilder() {
            onChanged();
            return (Struct.Builder) getPublicFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.ExtrasOrBuilder
        public jb getPublicOrBuilder() {
            xa xaVar = this.publicBuilder_;
            if (xaVar != null) {
                return (jb) xaVar.getMessageOrBuilder();
            }
            Struct struct = this.public_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // io.bidmachine.protobuf.ExtrasOrBuilder
        public boolean hasInternal() {
            return (this.internalBuilder_ == null && this.internal_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.ExtrasOrBuilder
        public boolean hasPrivate() {
            return (this.privateBuilder_ == null && this.private_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.ExtrasOrBuilder
        public boolean hasPublic() {
            return (this.publicBuilder_ == null && this.public_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_Extras_fieldAccessorTable.ensureFieldAccessorsInitialized(Extras.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeInternal(Struct struct) {
            xa xaVar = this.internalBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(struct);
                return this;
            }
            Struct struct2 = this.internal_;
            if (struct2 != null) {
                this.internal_ = a.i(struct2, struct);
            } else {
                this.internal_ = struct;
            }
            onChanged();
            return this;
        }

        public Builder mergePrivate(Struct struct) {
            xa xaVar = this.privateBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(struct);
                return this;
            }
            Struct struct2 = this.private_;
            if (struct2 != null) {
                this.private_ = a.i(struct2, struct);
            } else {
                this.private_ = struct;
            }
            onChanged();
            return this;
        }

        public Builder mergePublic(Struct struct) {
            xa xaVar = this.publicBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(struct);
                return this;
            }
            Struct struct2 = this.public_;
            if (struct2 != null) {
                this.public_ = a.i(struct2, struct);
            } else {
                this.public_ = struct;
            }
            onChanged();
            return this;
        }

        public Builder setInternal(Struct struct) {
            xa xaVar = this.internalBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(struct);
                return this;
            }
            struct.getClass();
            this.internal_ = struct;
            onChanged();
            return this;
        }

        public Builder setPrivate(Struct struct) {
            xa xaVar = this.privateBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(struct);
                return this;
            }
            struct.getClass();
            this.private_ = struct;
            onChanged();
            return this;
        }

        public Builder setPublic(Struct struct) {
            xa xaVar = this.publicBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(struct);
                return this;
            }
            struct.getClass();
            this.public_ = struct;
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
        public Extras build() {
            Extras extrasBuildPartial = buildPartial();
            if (extrasBuildPartial.isInitialized()) {
                return extrasBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) extrasBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Extras buildPartial() {
            Extras extras = new Extras(this);
            xa xaVar = this.privateBuilder_;
            if (xaVar == null) {
                extras.private_ = this.private_;
            } else {
                extras.private_ = (Struct) xaVar.build();
            }
            xa xaVar2 = this.internalBuilder_;
            if (xaVar2 == null) {
                extras.internal_ = this.internal_;
            } else {
                extras.internal_ = (Struct) xaVar2.build();
            }
            xa xaVar3 = this.publicBuilder_;
            if (xaVar3 == null) {
                extras.public_ = this.public_;
            } else {
                extras.public_ = (Struct) xaVar3.build();
            }
            onBuilt();
            return extras;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Extras getDefaultInstanceForType() {
            return Extras.getDefaultInstance();
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
            if (this.privateBuilder_ == null) {
                this.private_ = null;
            } else {
                this.private_ = null;
                this.privateBuilder_ = null;
            }
            if (this.internalBuilder_ == null) {
                this.internal_ = null;
            } else {
                this.internal_ = null;
                this.internalBuilder_ = null;
            }
            if (this.publicBuilder_ == null) {
                this.public_ = null;
                return this;
            }
            this.public_ = null;
            this.publicBuilder_ = null;
            return this;
        }

        public Builder setInternal(Struct.Builder builder) {
            xa xaVar = this.internalBuilder_;
            if (xaVar == null) {
                this.internal_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder setPrivate(Struct.Builder builder) {
            xa xaVar = this.privateBuilder_;
            if (xaVar == null) {
                this.private_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder setPublic(Struct.Builder builder) {
            xa xaVar = this.publicBuilder_;
            if (xaVar == null) {
                this.public_ = builder.build();
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
            if (message instanceof Extras) {
                return mergeFrom((Extras) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Extras extras) {
            if (extras == Extras.getDefaultInstance()) {
                return this;
            }
            if (extras.hasPrivate()) {
                mergePrivate(extras.getPrivate());
            }
            if (extras.hasInternal()) {
                mergeInternal(extras.getInternal());
            }
            if (extras.hasPublic()) {
                mergePublic(extras.getPublic());
            }
            mergeUnknownFields(((k7) extras).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.bidmachine.protobuf.Extras.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.Extras.access$800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.Extras r3 = (io.bidmachine.protobuf.Extras) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.Extras r4 = (io.bidmachine.protobuf.Extras) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.Extras.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.Extras$Builder");
        }
    }

    public static Builder newBuilder(Extras extras) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(extras);
    }

    public static Extras parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (Extras) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private Extras(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Extras parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Extras) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static Extras parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Extras) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Extras getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Extras parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (Extras) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Extras() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Extras parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Extras) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static Extras parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (Extras) PARSER.parseFrom(bArr, m5Var);
    }

    private Extras(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        Struct.Builder builder;
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
                                Struct struct = this.private_;
                                builder = struct != null ? struct.toBuilder() : null;
                                Struct struct2 = (Struct) yVar.readMessage(Struct.parser(), m5Var);
                                this.private_ = struct2;
                                if (builder != null) {
                                    builder.mergeFrom(struct2);
                                    this.private_ = builder.buildPartial();
                                }
                            } else if (tag == 18) {
                                Struct struct3 = this.internal_;
                                builder = struct3 != null ? struct3.toBuilder() : null;
                                Struct struct4 = (Struct) yVar.readMessage(Struct.parser(), m5Var);
                                this.internal_ = struct4;
                                if (builder != null) {
                                    builder.mergeFrom(struct4);
                                    this.internal_ = builder.buildPartial();
                                }
                            } else if (tag != 26) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                Struct struct5 = this.public_;
                                builder = struct5 != null ? struct5.toBuilder() : null;
                                Struct struct6 = (Struct) yVar.readMessage(Struct.parser(), m5Var);
                                this.public_ = struct6;
                                if (builder != null) {
                                    builder.mergeFrom(struct6);
                                    this.public_ = builder.buildPartial();
                                }
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

    public static Extras parseFrom(InputStream inputStream) throws IOException {
        return (Extras) k7.parseWithIOException(PARSER, inputStream);
    }

    public static Extras parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Extras) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static Extras parseFrom(y yVar) throws IOException {
        return (Extras) k7.parseWithIOException(PARSER, yVar);
    }

    public static Extras parseFrom(y yVar, m5 m5Var) throws IOException {
        return (Extras) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
