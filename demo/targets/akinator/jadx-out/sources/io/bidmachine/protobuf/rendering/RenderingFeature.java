package io.bidmachine.protobuf.rendering;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
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
import com.explorestack.protobuf.p6;
import com.explorestack.protobuf.pa;
import com.explorestack.protobuf.x7;
import com.explorestack.protobuf.xa;
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class RenderingFeature extends k7 implements RenderingFeatureOrBuilder {
    public static final int BROKEN_CREATIVE_DETECTOR_FIELD_NUMBER = 1;
    private static final RenderingFeature DEFAULT_INSTANCE = new RenderingFeature();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.rendering.RenderingFeature.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public RenderingFeature parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new RenderingFeature(yVar, m5Var);
        }
    };
    private static final long serialVersionUID = 0;
    private int featureCase_;
    private Object feature_;
    private byte memoizedIsInitialized;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.protobuf.rendering.RenderingFeature$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$rendering$RenderingFeature$BrokenCreativeDetector$PayloadOneofCase;
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$rendering$RenderingFeature$FeatureCase;

        static {
            int[] iArr = new int[FeatureCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$rendering$RenderingFeature$FeatureCase = iArr;
            try {
                iArr[FeatureCase.BROKEN_CREATIVE_DETECTOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$rendering$RenderingFeature$FeatureCase[FeatureCase.FEATURE_NOT_SET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[BrokenCreativeDetector.PayloadOneofCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$rendering$RenderingFeature$BrokenCreativeDetector$PayloadOneofCase = iArr2;
            try {
                iArr2[BrokenCreativeDetector.PayloadOneofCase.EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$rendering$RenderingFeature$BrokenCreativeDetector$PayloadOneofCase[BrokenCreativeDetector.PayloadOneofCase.CONFIGURATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$rendering$RenderingFeature$BrokenCreativeDetector$PayloadOneofCase[BrokenCreativeDetector.PayloadOneofCase.PAYLOADONEOF_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class BrokenCreativeDetector extends k7 implements BrokenCreativeDetectorOrBuilder {
        public static final int CONFIGURATION_FIELD_NUMBER = 2;
        public static final int EVENT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int payloadOneofCase_;
        private Object payloadOneof_;
        private static final BrokenCreativeDetector DEFAULT_INSTANCE = new BrokenCreativeDetector();
        private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public BrokenCreativeDetector parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new BrokenCreativeDetector(yVar, m5Var);
            }
        };

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Algorithm extends k7 implements AlgorithmOrBuilder {
            public static final int NAME_FIELD_NUMBER = 1;
            public static final int THRESHOLD_FIELD_NUMBER = 3;
            public static final int WEIGHT_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private byte memoizedIsInitialized;
            private volatile Object name_;
            private double threshold_;
            private double weight_;
            private static final Algorithm DEFAULT_INSTANCE = new Algorithm();
            private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Algorithm.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public Algorithm parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new Algorithm(yVar, m5Var);
                }
            };

            public static Algorithm getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Algorithm_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Algorithm parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Algorithm) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Algorithm parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Algorithm) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Algorithm)) {
                    return super.equals(obj);
                }
                Algorithm algorithm = (Algorithm) obj;
                return getName().equals(algorithm.getName()) && Double.doubleToLongBits(getWeight()) == Double.doubleToLongBits(algorithm.getWeight()) && Double.doubleToLongBits(getThreshold()) == Double.doubleToLongBits(algorithm.getThreshold()) && this.unknownFields.equals(algorithm.unknownFields);
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
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
                int iComputeStringSize = !getNameBytes().isEmpty() ? k7.computeStringSize(1, this.name_) : 0;
                double d10 = this.weight_;
                if (d10 != 0.0d) {
                    iComputeStringSize += h0.computeDoubleSize(2, d10);
                }
                double d11 = this.threshold_;
                if (d11 != 0.0d) {
                    iComputeStringSize += h0.computeDoubleSize(3, d11);
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmOrBuilder
            public double getThreshold() {
                return this.threshold_;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
            public final gc getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmOrBuilder
            public double getWeight() {
                return this.weight_;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = this.unknownFields.hashCode() + ((x7.hashLong(Double.doubleToLongBits(getThreshold())) + ((((x7.hashLong(Double.doubleToLongBits(getWeight())) + ((((getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 29);
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.explorestack.protobuf.k7
            public i7 internalGetFieldAccessorTable() {
                return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Algorithm_fieldAccessorTable.ensureFieldAccessorsInitialized(Algorithm.class, Builder.class);
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
                return new Algorithm();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                if (!getNameBytes().isEmpty()) {
                    k7.writeString(h0Var, 1, this.name_);
                }
                double d10 = this.weight_;
                if (d10 != 0.0d) {
                    h0Var.writeDouble(2, d10);
                }
                double d11 = this.threshold_;
                if (d11 != 0.0d) {
                    h0Var.writeDouble(3, d11);
                }
                this.unknownFields.writeTo(h0Var);
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends o6 implements AlgorithmOrBuilder {
                private Object name_;
                private double threshold_;
                private double weight_;

                private Builder() {
                    super(null);
                    this.name_ = "";
                    maybeForceBuilderInitialization();
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Algorithm_descriptor;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = k7.alwaysUseFieldBuilders;
                }

                public Builder clearName() {
                    this.name_ = Algorithm.getDefaultInstance().getName();
                    onChanged();
                    return this;
                }

                public Builder clearThreshold() {
                    this.threshold_ = 0.0d;
                    onChanged();
                    return this;
                }

                public Builder clearWeight() {
                    this.weight_ = 0.0d;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Algorithm_descriptor;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmOrBuilder
                public ByteString getNameBytes() {
                    Object obj = this.name_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.name_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmOrBuilder
                public double getThreshold() {
                    return this.threshold_;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmOrBuilder
                public double getWeight() {
                    return this.weight_;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Algorithm_fieldAccessorTable.ensureFieldAccessorsInitialized(Algorithm.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setName(String str) {
                    str.getClass();
                    this.name_ = str;
                    onChanged();
                    return this;
                }

                public Builder setNameBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    b.checkByteStringIsUtf8(byteString);
                    this.name_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setThreshold(double d10) {
                    this.threshold_ = d10;
                    onChanged();
                    return this;
                }

                public Builder setWeight(double d10) {
                    this.weight_ = d10;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Algorithm build() {
                    Algorithm algorithmBuildPartial = buildPartial();
                    if (algorithmBuildPartial.isInitialized()) {
                        return algorithmBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) algorithmBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Algorithm buildPartial() {
                    Algorithm algorithm = new Algorithm(this);
                    algorithm.name_ = this.name_;
                    algorithm.weight_ = this.weight_;
                    algorithm.threshold_ = this.threshold_;
                    onBuilt();
                    return algorithm;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public Algorithm getDefaultInstanceForType() {
                    return Algorithm.getDefaultInstance();
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
                    this.name_ = "";
                    this.weight_ = 0.0d;
                    this.threshold_ = 0.0d;
                    return this;
                }

                private Builder(p6 p6Var) {
                    super(p6Var);
                    this.name_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
                /* renamed from: clone */
                public Builder mo500clone() {
                    return (Builder) super.mo500clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof Algorithm) {
                        return mergeFrom((Algorithm) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(Algorithm algorithm) {
                    if (algorithm == Algorithm.getDefaultInstance()) {
                        return this;
                    }
                    if (!algorithm.getName().isEmpty()) {
                        this.name_ = algorithm.name_;
                        onChanged();
                    }
                    if (algorithm.getWeight() != 0.0d) {
                        setWeight(algorithm.getWeight());
                    }
                    if (algorithm.getThreshold() != 0.0d) {
                        setThreshold(algorithm.getThreshold());
                    }
                    mergeUnknownFields(((k7) algorithm).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Algorithm.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Algorithm.access$800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector$Algorithm r3 = (io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Algorithm) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector$Algorithm r4 = (io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Algorithm) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Algorithm.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector$Algorithm$Builder");
                }
            }

            public static Builder newBuilder(Algorithm algorithm) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(algorithm);
            }

            public static Algorithm parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (Algorithm) PARSER.parseFrom(byteBuffer, m5Var);
            }

            private Algorithm(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Algorithm parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Algorithm) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static Algorithm parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Algorithm) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Algorithm getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Algorithm parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (Algorithm) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Algorithm() {
                this.memoizedIsInitialized = (byte) -1;
                this.name_ = "";
            }

            public static Algorithm parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Algorithm) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static Algorithm parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (Algorithm) PARSER.parseFrom(bArr, m5Var);
            }

            public static Algorithm parseFrom(InputStream inputStream) throws IOException {
                return (Algorithm) k7.parseWithIOException(PARSER, inputStream);
            }

            private Algorithm(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                    this.name_ = yVar.readStringRequireUtf8();
                                } else if (tag == 17) {
                                    this.weight_ = yVar.readDouble();
                                } else if (tag != 25) {
                                    if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                    }
                                } else {
                                    this.threshold_ = yVar.readDouble();
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

            public static Algorithm parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Algorithm) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            public static Algorithm parseFrom(y yVar) throws IOException {
                return (Algorithm) k7.parseWithIOException(PARSER, yVar);
            }

            public static Algorithm parseFrom(y yVar, m5 m5Var) throws IOException {
                return (Algorithm) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface AlgorithmOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            String getName();

            ByteString getNameBytes();

            double getThreshold();

            double getWeight();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class AlgorithmResult extends k7 implements AlgorithmResultOrBuilder {
            public static final int ALGORITHM_FIELD_NUMBER = 3;
            public static final int DURATION_FIELD_NUMBER = 2;
            public static final int RESULT_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private Algorithm algorithm_;
            private double duration_;
            private byte memoizedIsInitialized;
            private int result_;
            private static final AlgorithmResult DEFAULT_INSTANCE = new AlgorithmResult();
            private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResult.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public AlgorithmResult parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new AlgorithmResult(yVar, m5Var);
                }
            };

            public static AlgorithmResult getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_AlgorithmResult_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static AlgorithmResult parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (AlgorithmResult) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static AlgorithmResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (AlgorithmResult) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof AlgorithmResult)) {
                    return super.equals(obj);
                }
                AlgorithmResult algorithmResult = (AlgorithmResult) obj;
                if (getResult() == algorithmResult.getResult() && Double.doubleToLongBits(getDuration()) == Double.doubleToLongBits(algorithmResult.getDuration()) && hasAlgorithm() == algorithmResult.hasAlgorithm()) {
                    return (!hasAlgorithm() || getAlgorithm().equals(algorithmResult.getAlgorithm())) && this.unknownFields.equals(algorithmResult.unknownFields);
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResultOrBuilder
            public Algorithm getAlgorithm() {
                Algorithm algorithm = this.algorithm_;
                return algorithm == null ? Algorithm.getDefaultInstance() : algorithm;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResultOrBuilder
            public AlgorithmOrBuilder getAlgorithmOrBuilder() {
                return getAlgorithm();
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResultOrBuilder
            public double getDuration() {
                return this.duration_;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public fa getParserForType() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResultOrBuilder
            public int getResult() {
                return this.result_;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int i11 = this.result_;
                int iComputeInt32Size = i11 != 0 ? h0.computeInt32Size(1, i11) : 0;
                double d10 = this.duration_;
                if (d10 != 0.0d) {
                    iComputeInt32Size += h0.computeDoubleSize(2, d10);
                }
                if (this.algorithm_ != null) {
                    iComputeInt32Size += h0.computeMessageSize(3, getAlgorithm());
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt32Size;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
            public final gc getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResultOrBuilder
            public boolean hasAlgorithm() {
                return this.algorithm_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashLong = x7.hashLong(Double.doubleToLongBits(getDuration())) + ((((getResult() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
                if (hasAlgorithm()) {
                    iHashLong = o2.B(iHashLong, 37, 3, 53) + getAlgorithm().hashCode();
                }
                int iHashCode = this.unknownFields.hashCode() + (iHashLong * 29);
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.explorestack.protobuf.k7
            public i7 internalGetFieldAccessorTable() {
                return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_AlgorithmResult_fieldAccessorTable.ensureFieldAccessorsInitialized(AlgorithmResult.class, Builder.class);
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
                return new AlgorithmResult();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                int i10 = this.result_;
                if (i10 != 0) {
                    h0Var.writeInt32(1, i10);
                }
                double d10 = this.duration_;
                if (d10 != 0.0d) {
                    h0Var.writeDouble(2, d10);
                }
                if (this.algorithm_ != null) {
                    h0Var.writeMessage(3, getAlgorithm());
                }
                this.unknownFields.writeTo(h0Var);
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends o6 implements AlgorithmResultOrBuilder {
                private xa algorithmBuilder_;
                private Algorithm algorithm_;
                private double duration_;
                private int result_;

                private Builder() {
                    super(null);
                    maybeForceBuilderInitialization();
                }

                private xa getAlgorithmFieldBuilder() {
                    if (this.algorithmBuilder_ == null) {
                        this.algorithmBuilder_ = new xa(getAlgorithm(), getParentForChildren(), isClean());
                        this.algorithm_ = null;
                    }
                    return this.algorithmBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_AlgorithmResult_descriptor;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = k7.alwaysUseFieldBuilders;
                }

                public Builder clearAlgorithm() {
                    if (this.algorithmBuilder_ == null) {
                        this.algorithm_ = null;
                        onChanged();
                        return this;
                    }
                    this.algorithm_ = null;
                    this.algorithmBuilder_ = null;
                    return this;
                }

                public Builder clearDuration() {
                    this.duration_ = 0.0d;
                    onChanged();
                    return this;
                }

                public Builder clearResult() {
                    this.result_ = 0;
                    onChanged();
                    return this;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResultOrBuilder
                public Algorithm getAlgorithm() {
                    xa xaVar = this.algorithmBuilder_;
                    if (xaVar != null) {
                        return (Algorithm) xaVar.getMessage();
                    }
                    Algorithm algorithm = this.algorithm_;
                    return algorithm == null ? Algorithm.getDefaultInstance() : algorithm;
                }

                public Algorithm.Builder getAlgorithmBuilder() {
                    onChanged();
                    return (Algorithm.Builder) getAlgorithmFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResultOrBuilder
                public AlgorithmOrBuilder getAlgorithmOrBuilder() {
                    xa xaVar = this.algorithmBuilder_;
                    if (xaVar != null) {
                        return (AlgorithmOrBuilder) xaVar.getMessageOrBuilder();
                    }
                    Algorithm algorithm = this.algorithm_;
                    return algorithm == null ? Algorithm.getDefaultInstance() : algorithm;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_AlgorithmResult_descriptor;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResultOrBuilder
                public double getDuration() {
                    return this.duration_;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResultOrBuilder
                public int getResult() {
                    return this.result_;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResultOrBuilder
                public boolean hasAlgorithm() {
                    return (this.algorithmBuilder_ == null && this.algorithm_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_AlgorithmResult_fieldAccessorTable.ensureFieldAccessorsInitialized(AlgorithmResult.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeAlgorithm(Algorithm algorithm) {
                    xa xaVar = this.algorithmBuilder_;
                    if (xaVar != null) {
                        xaVar.mergeFrom(algorithm);
                        return this;
                    }
                    Algorithm algorithm2 = this.algorithm_;
                    if (algorithm2 != null) {
                        this.algorithm_ = Algorithm.newBuilder(algorithm2).mergeFrom(algorithm).buildPartial();
                    } else {
                        this.algorithm_ = algorithm;
                    }
                    onChanged();
                    return this;
                }

                public Builder setAlgorithm(Algorithm algorithm) {
                    xa xaVar = this.algorithmBuilder_;
                    if (xaVar != null) {
                        xaVar.setMessage(algorithm);
                        return this;
                    }
                    algorithm.getClass();
                    this.algorithm_ = algorithm;
                    onChanged();
                    return this;
                }

                public Builder setDuration(double d10) {
                    this.duration_ = d10;
                    onChanged();
                    return this;
                }

                public Builder setResult(int i10) {
                    this.result_ = i10;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public AlgorithmResult build() {
                    AlgorithmResult algorithmResultBuildPartial = buildPartial();
                    if (algorithmResultBuildPartial.isInitialized()) {
                        return algorithmResultBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) algorithmResultBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public AlgorithmResult buildPartial() {
                    AlgorithmResult algorithmResult = new AlgorithmResult(this);
                    algorithmResult.result_ = this.result_;
                    algorithmResult.duration_ = this.duration_;
                    xa xaVar = this.algorithmBuilder_;
                    if (xaVar == null) {
                        algorithmResult.algorithm_ = this.algorithm_;
                    } else {
                        algorithmResult.algorithm_ = (Algorithm) xaVar.build();
                    }
                    onBuilt();
                    return algorithmResult;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public AlgorithmResult getDefaultInstanceForType() {
                    return AlgorithmResult.getDefaultInstance();
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

                private Builder(p6 p6Var) {
                    super(p6Var);
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.result_ = 0;
                    this.duration_ = 0.0d;
                    if (this.algorithmBuilder_ == null) {
                        this.algorithm_ = null;
                        return this;
                    }
                    this.algorithm_ = null;
                    this.algorithmBuilder_ = null;
                    return this;
                }

                public Builder setAlgorithm(Algorithm.Builder builder) {
                    xa xaVar = this.algorithmBuilder_;
                    if (xaVar == null) {
                        this.algorithm_ = builder.build();
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
                    if (message instanceof AlgorithmResult) {
                        return mergeFrom((AlgorithmResult) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(AlgorithmResult algorithmResult) {
                    if (algorithmResult == AlgorithmResult.getDefaultInstance()) {
                        return this;
                    }
                    if (algorithmResult.getResult() != 0) {
                        setResult(algorithmResult.getResult());
                    }
                    if (algorithmResult.getDuration() != 0.0d) {
                        setDuration(algorithmResult.getDuration());
                    }
                    if (algorithmResult.hasAlgorithm()) {
                        mergeAlgorithm(algorithmResult.getAlgorithm());
                    }
                    mergeUnknownFields(((k7) algorithmResult).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResult.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResult.access$1900()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector$AlgorithmResult r3 = (io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResult) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector$AlgorithmResult r4 = (io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResult) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResult.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector$AlgorithmResult$Builder");
                }
            }

            public static Builder newBuilder(AlgorithmResult algorithmResult) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(algorithmResult);
            }

            public static AlgorithmResult parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (AlgorithmResult) PARSER.parseFrom(byteBuffer, m5Var);
            }

            private AlgorithmResult(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static AlgorithmResult parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (AlgorithmResult) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static AlgorithmResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (AlgorithmResult) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public AlgorithmResult getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static AlgorithmResult parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (AlgorithmResult) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private AlgorithmResult() {
                this.memoizedIsInitialized = (byte) -1;
            }

            public static AlgorithmResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (AlgorithmResult) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static AlgorithmResult parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (AlgorithmResult) PARSER.parseFrom(bArr, m5Var);
            }

            private AlgorithmResult(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                    this.result_ = yVar.readInt32();
                                } else if (tag == 17) {
                                    this.duration_ = yVar.readDouble();
                                } else if (tag != 26) {
                                    if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                    }
                                } else {
                                    Algorithm algorithm = this.algorithm_;
                                    Algorithm.Builder builder = algorithm != null ? algorithm.toBuilder() : null;
                                    Algorithm algorithm2 = (Algorithm) yVar.readMessage(Algorithm.parser(), m5Var);
                                    this.algorithm_ = algorithm2;
                                    if (builder != null) {
                                        builder.mergeFrom(algorithm2);
                                        this.algorithm_ = builder.buildPartial();
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

            public static AlgorithmResult parseFrom(InputStream inputStream) throws IOException {
                return (AlgorithmResult) k7.parseWithIOException(PARSER, inputStream);
            }

            public static AlgorithmResult parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (AlgorithmResult) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            public static AlgorithmResult parseFrom(y yVar) throws IOException {
                return (AlgorithmResult) k7.parseWithIOException(PARSER, yVar);
            }

            public static AlgorithmResult parseFrom(y yVar, m5 m5Var) throws IOException {
                return (AlgorithmResult) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface AlgorithmResultOrBuilder extends MessageOrBuilder {
            Algorithm getAlgorithm();

            AlgorithmOrBuilder getAlgorithmOrBuilder();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            double getDuration();

            int getResult();

            boolean hasAlgorithm();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Configuration extends k7 implements ConfigurationOrBuilder {
            public static final int ALGORITHMS_FIELD_NUMBER = 7;
            public static final int ALLOW_DUPLICATE_FIELD_NUMBER = 4;
            public static final int DOWNSCALE_FACTOR_FIELD_NUMBER = 2;
            public static final int ERROR_ONLY_FIELD_NUMBER = 3;
            public static final int STOP_AFTER_FIELD_NUMBER = 5;
            public static final int TIMEOUT_FIELD_NUMBER = 1;
            public static final int WEIGHT_THRESHOLD_FIELD_NUMBER = 6;
            private static final long serialVersionUID = 0;
            private List<Algorithm> algorithms_;
            private boolean allowDuplicate_;
            private double downscaleFactor_;
            private boolean errorOnly_;
            private byte memoizedIsInitialized;
            private volatile Object stopAfter_;
            private double timeout_;
            private double weightThreshold_;
            private static final Configuration DEFAULT_INSTANCE = new Configuration();
            private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Configuration.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public Configuration parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new Configuration(yVar, m5Var);
                }
            };

            public static Configuration getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Configuration_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Configuration parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Configuration) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Configuration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Configuration) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Configuration)) {
                    return super.equals(obj);
                }
                Configuration configuration = (Configuration) obj;
                return Double.doubleToLongBits(getTimeout()) == Double.doubleToLongBits(configuration.getTimeout()) && Double.doubleToLongBits(getDownscaleFactor()) == Double.doubleToLongBits(configuration.getDownscaleFactor()) && getErrorOnly() == configuration.getErrorOnly() && getAllowDuplicate() == configuration.getAllowDuplicate() && getStopAfter().equals(configuration.getStopAfter()) && Double.doubleToLongBits(getWeightThreshold()) == Double.doubleToLongBits(configuration.getWeightThreshold()) && getAlgorithmsList().equals(configuration.getAlgorithmsList()) && this.unknownFields.equals(configuration.unknownFields);
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
            public Algorithm getAlgorithms(int i10) {
                return this.algorithms_.get(i10);
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
            public int getAlgorithmsCount() {
                return this.algorithms_.size();
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
            public List<Algorithm> getAlgorithmsList() {
                return this.algorithms_;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
            public AlgorithmOrBuilder getAlgorithmsOrBuilder(int i10) {
                return this.algorithms_.get(i10);
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
            public List<? extends AlgorithmOrBuilder> getAlgorithmsOrBuilderList() {
                return this.algorithms_;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
            public boolean getAllowDuplicate() {
                return this.allowDuplicate_;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
            public double getDownscaleFactor() {
                return this.downscaleFactor_;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
            public boolean getErrorOnly() {
                return this.errorOnly_;
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
                double d10 = this.timeout_;
                int iComputeDoubleSize = d10 != 0.0d ? h0.computeDoubleSize(1, d10) : 0;
                double d11 = this.downscaleFactor_;
                if (d11 != 0.0d) {
                    iComputeDoubleSize += h0.computeDoubleSize(2, d11);
                }
                boolean z10 = this.errorOnly_;
                if (z10) {
                    iComputeDoubleSize += h0.computeBoolSize(3, z10);
                }
                boolean z11 = this.allowDuplicate_;
                if (z11) {
                    iComputeDoubleSize += h0.computeBoolSize(4, z11);
                }
                if (!getStopAfterBytes().isEmpty()) {
                    iComputeDoubleSize += k7.computeStringSize(5, this.stopAfter_);
                }
                double d12 = this.weightThreshold_;
                if (d12 != 0.0d) {
                    iComputeDoubleSize += h0.computeDoubleSize(6, d12);
                }
                for (int i11 = 0; i11 < this.algorithms_.size(); i11++) {
                    iComputeDoubleSize += h0.computeMessageSize(7, this.algorithms_.get(i11));
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeDoubleSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
            public String getStopAfter() {
                Object obj = this.stopAfter_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.stopAfter_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
            public ByteString getStopAfterBytes() {
                Object obj = this.stopAfter_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.stopAfter_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
            public double getTimeout() {
                return this.timeout_;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
            public final gc getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
            public double getWeightThreshold() {
                return this.weightThreshold_;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashLong = x7.hashLong(Double.doubleToLongBits(getWeightThreshold())) + ((((getStopAfter().hashCode() + ((((x7.hashBoolean(getAllowDuplicate()) + ((((x7.hashBoolean(getErrorOnly()) + ((((x7.hashLong(Double.doubleToLongBits(getDownscaleFactor())) + ((((x7.hashLong(Double.doubleToLongBits(getTimeout())) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53);
                if (getAlgorithmsCount() > 0) {
                    iHashLong = o2.B(iHashLong, 37, 7, 53) + getAlgorithmsList().hashCode();
                }
                int iHashCode = this.unknownFields.hashCode() + (iHashLong * 29);
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.explorestack.protobuf.k7
            public i7 internalGetFieldAccessorTable() {
                return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Configuration_fieldAccessorTable.ensureFieldAccessorsInitialized(Configuration.class, Builder.class);
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
                return new Configuration();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                double d10 = this.timeout_;
                if (d10 != 0.0d) {
                    h0Var.writeDouble(1, d10);
                }
                double d11 = this.downscaleFactor_;
                if (d11 != 0.0d) {
                    h0Var.writeDouble(2, d11);
                }
                boolean z10 = this.errorOnly_;
                if (z10) {
                    h0Var.writeBool(3, z10);
                }
                boolean z11 = this.allowDuplicate_;
                if (z11) {
                    h0Var.writeBool(4, z11);
                }
                if (!getStopAfterBytes().isEmpty()) {
                    k7.writeString(h0Var, 5, this.stopAfter_);
                }
                double d12 = this.weightThreshold_;
                if (d12 != 0.0d) {
                    h0Var.writeDouble(6, d12);
                }
                for (int i10 = 0; i10 < this.algorithms_.size(); i10++) {
                    h0Var.writeMessage(7, this.algorithms_.get(i10));
                }
                this.unknownFields.writeTo(h0Var);
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends o6 implements ConfigurationOrBuilder {
                private pa algorithmsBuilder_;
                private List<Algorithm> algorithms_;
                private boolean allowDuplicate_;
                private int bitField0_;
                private double downscaleFactor_;
                private boolean errorOnly_;
                private Object stopAfter_;
                private double timeout_;
                private double weightThreshold_;

                private Builder() {
                    super(null);
                    this.stopAfter_ = "";
                    this.algorithms_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                private void ensureAlgorithmsIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.algorithms_ = new ArrayList(this.algorithms_);
                        this.bitField0_ |= 1;
                    }
                }

                private pa getAlgorithmsFieldBuilder() {
                    if (this.algorithmsBuilder_ == null) {
                        this.algorithmsBuilder_ = new pa(this.algorithms_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.algorithms_ = null;
                    }
                    return this.algorithmsBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Configuration_descriptor;
                }

                private void maybeForceBuilderInitialization() {
                    if (k7.alwaysUseFieldBuilders) {
                        getAlgorithmsFieldBuilder();
                    }
                }

                public Builder addAlgorithms(Algorithm algorithm) {
                    pa paVar = this.algorithmsBuilder_;
                    if (paVar != null) {
                        paVar.addMessage(algorithm);
                        return this;
                    }
                    algorithm.getClass();
                    ensureAlgorithmsIsMutable();
                    this.algorithms_.add(algorithm);
                    onChanged();
                    return this;
                }

                public Algorithm.Builder addAlgorithmsBuilder() {
                    return (Algorithm.Builder) getAlgorithmsFieldBuilder().addBuilder(Algorithm.getDefaultInstance());
                }

                public Builder addAllAlgorithms(Iterable<? extends Algorithm> iterable) {
                    pa paVar = this.algorithmsBuilder_;
                    if (paVar != null) {
                        paVar.addAllMessages(iterable);
                        return this;
                    }
                    ensureAlgorithmsIsMutable();
                    b.a.addAll((Iterable) iterable, (List) this.algorithms_);
                    onChanged();
                    return this;
                }

                public Builder clearAlgorithms() {
                    pa paVar = this.algorithmsBuilder_;
                    if (paVar != null) {
                        paVar.clear();
                        return this;
                    }
                    this.algorithms_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearAllowDuplicate() {
                    this.allowDuplicate_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearDownscaleFactor() {
                    this.downscaleFactor_ = 0.0d;
                    onChanged();
                    return this;
                }

                public Builder clearErrorOnly() {
                    this.errorOnly_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearStopAfter() {
                    this.stopAfter_ = Configuration.getDefaultInstance().getStopAfter();
                    onChanged();
                    return this;
                }

                public Builder clearTimeout() {
                    this.timeout_ = 0.0d;
                    onChanged();
                    return this;
                }

                public Builder clearWeightThreshold() {
                    this.weightThreshold_ = 0.0d;
                    onChanged();
                    return this;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
                public Algorithm getAlgorithms(int i10) {
                    pa paVar = this.algorithmsBuilder_;
                    return paVar == null ? this.algorithms_.get(i10) : (Algorithm) paVar.getMessage(i10);
                }

                public Algorithm.Builder getAlgorithmsBuilder(int i10) {
                    return (Algorithm.Builder) getAlgorithmsFieldBuilder().getBuilder(i10);
                }

                public List<Algorithm.Builder> getAlgorithmsBuilderList() {
                    return getAlgorithmsFieldBuilder().getBuilderList();
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
                public int getAlgorithmsCount() {
                    pa paVar = this.algorithmsBuilder_;
                    return paVar == null ? this.algorithms_.size() : paVar.getCount();
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
                public List<Algorithm> getAlgorithmsList() {
                    pa paVar = this.algorithmsBuilder_;
                    return paVar == null ? Collections.unmodifiableList(this.algorithms_) : paVar.getMessageList();
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
                public AlgorithmOrBuilder getAlgorithmsOrBuilder(int i10) {
                    pa paVar = this.algorithmsBuilder_;
                    return paVar == null ? this.algorithms_.get(i10) : (AlgorithmOrBuilder) paVar.getMessageOrBuilder(i10);
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
                public List<? extends AlgorithmOrBuilder> getAlgorithmsOrBuilderList() {
                    pa paVar = this.algorithmsBuilder_;
                    return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.algorithms_);
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
                public boolean getAllowDuplicate() {
                    return this.allowDuplicate_;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Configuration_descriptor;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
                public double getDownscaleFactor() {
                    return this.downscaleFactor_;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
                public boolean getErrorOnly() {
                    return this.errorOnly_;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
                public String getStopAfter() {
                    Object obj = this.stopAfter_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.stopAfter_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
                public ByteString getStopAfterBytes() {
                    Object obj = this.stopAfter_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.stopAfter_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
                public double getTimeout() {
                    return this.timeout_;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
                public double getWeightThreshold() {
                    return this.weightThreshold_;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Configuration_fieldAccessorTable.ensureFieldAccessorsInitialized(Configuration.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder removeAlgorithms(int i10) {
                    pa paVar = this.algorithmsBuilder_;
                    if (paVar != null) {
                        paVar.remove(i10);
                        return this;
                    }
                    ensureAlgorithmsIsMutable();
                    this.algorithms_.remove(i10);
                    onChanged();
                    return this;
                }

                public Builder setAlgorithms(int i10, Algorithm algorithm) {
                    pa paVar = this.algorithmsBuilder_;
                    if (paVar != null) {
                        paVar.setMessage(i10, algorithm);
                        return this;
                    }
                    algorithm.getClass();
                    ensureAlgorithmsIsMutable();
                    this.algorithms_.set(i10, algorithm);
                    onChanged();
                    return this;
                }

                public Builder setAllowDuplicate(boolean z10) {
                    this.allowDuplicate_ = z10;
                    onChanged();
                    return this;
                }

                public Builder setDownscaleFactor(double d10) {
                    this.downscaleFactor_ = d10;
                    onChanged();
                    return this;
                }

                public Builder setErrorOnly(boolean z10) {
                    this.errorOnly_ = z10;
                    onChanged();
                    return this;
                }

                public Builder setStopAfter(String str) {
                    str.getClass();
                    this.stopAfter_ = str;
                    onChanged();
                    return this;
                }

                public Builder setStopAfterBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    b.checkByteStringIsUtf8(byteString);
                    this.stopAfter_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setTimeout(double d10) {
                    this.timeout_ = d10;
                    onChanged();
                    return this;
                }

                public Builder setWeightThreshold(double d10) {
                    this.weightThreshold_ = d10;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Configuration build() {
                    Configuration configurationBuildPartial = buildPartial();
                    if (configurationBuildPartial.isInitialized()) {
                        return configurationBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) configurationBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Configuration buildPartial() {
                    Configuration configuration = new Configuration(this);
                    configuration.timeout_ = this.timeout_;
                    configuration.downscaleFactor_ = this.downscaleFactor_;
                    configuration.errorOnly_ = this.errorOnly_;
                    configuration.allowDuplicate_ = this.allowDuplicate_;
                    configuration.stopAfter_ = this.stopAfter_;
                    configuration.weightThreshold_ = this.weightThreshold_;
                    pa paVar = this.algorithmsBuilder_;
                    if (paVar != null) {
                        configuration.algorithms_ = paVar.build();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.algorithms_ = Collections.unmodifiableList(this.algorithms_);
                            this.bitField0_ &= -2;
                        }
                        configuration.algorithms_ = this.algorithms_;
                    }
                    onBuilt();
                    return configuration;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public Configuration getDefaultInstanceForType() {
                    return Configuration.getDefaultInstance();
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

                public Algorithm.Builder addAlgorithmsBuilder(int i10) {
                    return (Algorithm.Builder) getAlgorithmsFieldBuilder().addBuilder(i10, Algorithm.getDefaultInstance());
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
                    this.timeout_ = 0.0d;
                    this.downscaleFactor_ = 0.0d;
                    this.errorOnly_ = false;
                    this.allowDuplicate_ = false;
                    this.stopAfter_ = "";
                    this.weightThreshold_ = 0.0d;
                    pa paVar = this.algorithmsBuilder_;
                    if (paVar == null) {
                        this.algorithms_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -2;
                        return this;
                    }
                    paVar.clear();
                    return this;
                }

                private Builder(p6 p6Var) {
                    super(p6Var);
                    this.stopAfter_ = "";
                    this.algorithms_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public Builder addAlgorithms(int i10, Algorithm algorithm) {
                    pa paVar = this.algorithmsBuilder_;
                    if (paVar == null) {
                        algorithm.getClass();
                        ensureAlgorithmsIsMutable();
                        this.algorithms_.add(i10, algorithm);
                        onChanged();
                        return this;
                    }
                    paVar.addMessage(i10, algorithm);
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
                /* renamed from: clone */
                public Builder mo500clone() {
                    return (Builder) super.mo500clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof Configuration) {
                        return mergeFrom((Configuration) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setAlgorithms(int i10, Algorithm.Builder builder) {
                    pa paVar = this.algorithmsBuilder_;
                    if (paVar == null) {
                        ensureAlgorithmsIsMutable();
                        this.algorithms_.set(i10, builder.build());
                        onChanged();
                        return this;
                    }
                    paVar.setMessage(i10, builder.build());
                    return this;
                }

                public Builder mergeFrom(Configuration configuration) {
                    if (configuration == Configuration.getDefaultInstance()) {
                        return this;
                    }
                    if (configuration.getTimeout() != 0.0d) {
                        setTimeout(configuration.getTimeout());
                    }
                    if (configuration.getDownscaleFactor() != 0.0d) {
                        setDownscaleFactor(configuration.getDownscaleFactor());
                    }
                    if (configuration.getErrorOnly()) {
                        setErrorOnly(configuration.getErrorOnly());
                    }
                    if (configuration.getAllowDuplicate()) {
                        setAllowDuplicate(configuration.getAllowDuplicate());
                    }
                    if (!configuration.getStopAfter().isEmpty()) {
                        this.stopAfter_ = configuration.stopAfter_;
                        onChanged();
                    }
                    if (configuration.getWeightThreshold() != 0.0d) {
                        setWeightThreshold(configuration.getWeightThreshold());
                    }
                    if (this.algorithmsBuilder_ == null) {
                        if (!configuration.algorithms_.isEmpty()) {
                            if (this.algorithms_.isEmpty()) {
                                this.algorithms_ = configuration.algorithms_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureAlgorithmsIsMutable();
                                this.algorithms_.addAll(configuration.algorithms_);
                            }
                            onChanged();
                        }
                    } else if (!configuration.algorithms_.isEmpty()) {
                        if (!this.algorithmsBuilder_.isEmpty()) {
                            this.algorithmsBuilder_.addAllMessages(configuration.algorithms_);
                        } else {
                            this.algorithmsBuilder_.dispose();
                            this.algorithmsBuilder_ = null;
                            this.algorithms_ = configuration.algorithms_;
                            this.bitField0_ &= -2;
                            this.algorithmsBuilder_ = k7.alwaysUseFieldBuilders ? getAlgorithmsFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((k7) configuration).unknownFields);
                    onChanged();
                    return this;
                }

                public Builder addAlgorithms(Algorithm.Builder builder) {
                    pa paVar = this.algorithmsBuilder_;
                    if (paVar == null) {
                        ensureAlgorithmsIsMutable();
                        this.algorithms_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    paVar.addMessage(builder.build());
                    return this;
                }

                public Builder addAlgorithms(int i10, Algorithm.Builder builder) {
                    pa paVar = this.algorithmsBuilder_;
                    if (paVar == null) {
                        ensureAlgorithmsIsMutable();
                        this.algorithms_.add(i10, builder.build());
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
                public io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Configuration.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Configuration.access$4800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector$Configuration r3 = (io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Configuration) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector$Configuration r4 = (io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Configuration) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Configuration.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector$Configuration$Builder");
                }
            }

            public static Builder newBuilder(Configuration configuration) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(configuration);
            }

            public static Configuration parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (Configuration) PARSER.parseFrom(byteBuffer, m5Var);
            }

            private Configuration(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Configuration parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Configuration) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static Configuration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Configuration) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Configuration getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Configuration parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (Configuration) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Configuration() {
                this.memoizedIsInitialized = (byte) -1;
                this.stopAfter_ = "";
                this.algorithms_ = Collections.EMPTY_LIST;
            }

            public static Configuration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Configuration) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static Configuration parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (Configuration) PARSER.parseFrom(bArr, m5Var);
            }

            public static Configuration parseFrom(InputStream inputStream) throws IOException {
                return (Configuration) k7.parseWithIOException(PARSER, inputStream);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private Configuration(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                    if (tag == 9) {
                                        this.timeout_ = yVar.readDouble();
                                    } else if (tag == 17) {
                                        this.downscaleFactor_ = yVar.readDouble();
                                    } else if (tag == 24) {
                                        this.errorOnly_ = yVar.readBool();
                                    } else if (tag == 32) {
                                        this.allowDuplicate_ = yVar.readBool();
                                    } else if (tag == 42) {
                                        this.stopAfter_ = yVar.readStringRequireUtf8();
                                    } else if (tag == 49) {
                                        this.weightThreshold_ = yVar.readDouble();
                                    } else if (tag != 58) {
                                        if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                        }
                                    } else {
                                        if (!z11) {
                                            this.algorithms_ = new ArrayList();
                                            z11 = true;
                                        }
                                        this.algorithms_.add(yVar.readMessage(Algorithm.parser(), m5Var));
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
                            this.algorithms_ = Collections.unmodifiableList(this.algorithms_);
                        }
                        this.unknownFields = ccVarNewBuilder.build();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                if (z11) {
                    this.algorithms_ = Collections.unmodifiableList(this.algorithms_);
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
            }

            public static Configuration parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Configuration) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            public static Configuration parseFrom(y yVar) throws IOException {
                return (Configuration) k7.parseWithIOException(PARSER, yVar);
            }

            public static Configuration parseFrom(y yVar, m5 m5Var) throws IOException {
                return (Configuration) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface ConfigurationOrBuilder extends MessageOrBuilder {
            Algorithm getAlgorithms(int i10);

            int getAlgorithmsCount();

            List<Algorithm> getAlgorithmsList();

            AlgorithmOrBuilder getAlgorithmsOrBuilder(int i10);

            List<? extends AlgorithmOrBuilder> getAlgorithmsOrBuilderList();

            boolean getAllowDuplicate();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            double getDownscaleFactor();

            boolean getErrorOnly();

            String getStopAfter();

            ByteString getStopAfterBytes();

            double getTimeout();

            double getWeightThreshold();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Event extends k7 implements EventOrBuilder {
            public static final int ALGORITHMS_RESULTS_FIELD_NUMBER = 5;
            public static final int COMPONENT_FIELD_NUMBER = 4;
            public static final int DURATION_FIELD_NUMBER = 3;
            public static final int PHASE_FIELD_NUMBER = 1;
            public static final int RESULT_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private List<AlgorithmResult> algorithmsResults_;
            private volatile Object component_;
            private double duration_;
            private byte memoizedIsInitialized;
            private int phase_;
            private int result_;
            private static final Event DEFAULT_INSTANCE = new Event();
            private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Event.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public Event parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new Event(yVar, m5Var);
                }
            };

            public static Event getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Event_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Event parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Event) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Event parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Event) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Event)) {
                    return super.equals(obj);
                }
                Event event = (Event) obj;
                return getPhase() == event.getPhase() && getResult() == event.getResult() && Double.doubleToLongBits(getDuration()) == Double.doubleToLongBits(event.getDuration()) && getComponent().equals(event.getComponent()) && getAlgorithmsResultsList().equals(event.getAlgorithmsResultsList()) && this.unknownFields.equals(event.unknownFields);
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
            public AlgorithmResult getAlgorithmsResults(int i10) {
                return this.algorithmsResults_.get(i10);
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
            public int getAlgorithmsResultsCount() {
                return this.algorithmsResults_.size();
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
            public List<AlgorithmResult> getAlgorithmsResultsList() {
                return this.algorithmsResults_;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
            public AlgorithmResultOrBuilder getAlgorithmsResultsOrBuilder(int i10) {
                return this.algorithmsResults_.get(i10);
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
            public List<? extends AlgorithmResultOrBuilder> getAlgorithmsResultsOrBuilderList() {
                return this.algorithmsResults_;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
            public String getComponent() {
                Object obj = this.component_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.component_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
            public ByteString getComponentBytes() {
                Object obj = this.component_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.component_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
            public double getDuration() {
                return this.duration_;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public fa getParserForType() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
            public int getPhase() {
                return this.phase_;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
            public int getResult() {
                return this.result_;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int i11 = this.phase_;
                int iComputeInt32Size = i11 != 0 ? h0.computeInt32Size(1, i11) : 0;
                int i12 = this.result_;
                if (i12 != 0) {
                    iComputeInt32Size += h0.computeInt32Size(2, i12);
                }
                double d10 = this.duration_;
                if (d10 != 0.0d) {
                    iComputeInt32Size += h0.computeDoubleSize(3, d10);
                }
                if (!getComponentBytes().isEmpty()) {
                    iComputeInt32Size += k7.computeStringSize(4, this.component_);
                }
                for (int i13 = 0; i13 < this.algorithmsResults_.size(); i13++) {
                    iComputeInt32Size += h0.computeMessageSize(5, this.algorithmsResults_.get(i13));
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt32Size;
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
                int iHashCode = getComponent().hashCode() + ((((x7.hashLong(Double.doubleToLongBits(getDuration())) + ((((getResult() + ((((getPhase() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53);
                if (getAlgorithmsResultsCount() > 0) {
                    iHashCode = o2.B(iHashCode, 37, 5, 53) + getAlgorithmsResultsList().hashCode();
                }
                int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.k7
            public i7 internalGetFieldAccessorTable() {
                return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Event_fieldAccessorTable.ensureFieldAccessorsInitialized(Event.class, Builder.class);
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
                return new Event();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                int i10 = this.phase_;
                if (i10 != 0) {
                    h0Var.writeInt32(1, i10);
                }
                int i11 = this.result_;
                if (i11 != 0) {
                    h0Var.writeInt32(2, i11);
                }
                double d10 = this.duration_;
                if (d10 != 0.0d) {
                    h0Var.writeDouble(3, d10);
                }
                if (!getComponentBytes().isEmpty()) {
                    k7.writeString(h0Var, 4, this.component_);
                }
                for (int i12 = 0; i12 < this.algorithmsResults_.size(); i12++) {
                    h0Var.writeMessage(5, this.algorithmsResults_.get(i12));
                }
                this.unknownFields.writeTo(h0Var);
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends o6 implements EventOrBuilder {
                private pa algorithmsResultsBuilder_;
                private List<AlgorithmResult> algorithmsResults_;
                private int bitField0_;
                private Object component_;
                private double duration_;
                private int phase_;
                private int result_;

                private Builder() {
                    super(null);
                    this.component_ = "";
                    this.algorithmsResults_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                private void ensureAlgorithmsResultsIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.algorithmsResults_ = new ArrayList(this.algorithmsResults_);
                        this.bitField0_ |= 1;
                    }
                }

                private pa getAlgorithmsResultsFieldBuilder() {
                    if (this.algorithmsResultsBuilder_ == null) {
                        this.algorithmsResultsBuilder_ = new pa(this.algorithmsResults_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.algorithmsResults_ = null;
                    }
                    return this.algorithmsResultsBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Event_descriptor;
                }

                private void maybeForceBuilderInitialization() {
                    if (k7.alwaysUseFieldBuilders) {
                        getAlgorithmsResultsFieldBuilder();
                    }
                }

                public Builder addAlgorithmsResults(AlgorithmResult algorithmResult) {
                    pa paVar = this.algorithmsResultsBuilder_;
                    if (paVar != null) {
                        paVar.addMessage(algorithmResult);
                        return this;
                    }
                    algorithmResult.getClass();
                    ensureAlgorithmsResultsIsMutable();
                    this.algorithmsResults_.add(algorithmResult);
                    onChanged();
                    return this;
                }

                public AlgorithmResult.Builder addAlgorithmsResultsBuilder() {
                    return (AlgorithmResult.Builder) getAlgorithmsResultsFieldBuilder().addBuilder(AlgorithmResult.getDefaultInstance());
                }

                public Builder addAllAlgorithmsResults(Iterable<? extends AlgorithmResult> iterable) {
                    pa paVar = this.algorithmsResultsBuilder_;
                    if (paVar != null) {
                        paVar.addAllMessages(iterable);
                        return this;
                    }
                    ensureAlgorithmsResultsIsMutable();
                    b.a.addAll((Iterable) iterable, (List) this.algorithmsResults_);
                    onChanged();
                    return this;
                }

                public Builder clearAlgorithmsResults() {
                    pa paVar = this.algorithmsResultsBuilder_;
                    if (paVar != null) {
                        paVar.clear();
                        return this;
                    }
                    this.algorithmsResults_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearComponent() {
                    this.component_ = Event.getDefaultInstance().getComponent();
                    onChanged();
                    return this;
                }

                public Builder clearDuration() {
                    this.duration_ = 0.0d;
                    onChanged();
                    return this;
                }

                public Builder clearPhase() {
                    this.phase_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearResult() {
                    this.result_ = 0;
                    onChanged();
                    return this;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
                public AlgorithmResult getAlgorithmsResults(int i10) {
                    pa paVar = this.algorithmsResultsBuilder_;
                    return paVar == null ? this.algorithmsResults_.get(i10) : (AlgorithmResult) paVar.getMessage(i10);
                }

                public AlgorithmResult.Builder getAlgorithmsResultsBuilder(int i10) {
                    return (AlgorithmResult.Builder) getAlgorithmsResultsFieldBuilder().getBuilder(i10);
                }

                public List<AlgorithmResult.Builder> getAlgorithmsResultsBuilderList() {
                    return getAlgorithmsResultsFieldBuilder().getBuilderList();
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
                public int getAlgorithmsResultsCount() {
                    pa paVar = this.algorithmsResultsBuilder_;
                    return paVar == null ? this.algorithmsResults_.size() : paVar.getCount();
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
                public List<AlgorithmResult> getAlgorithmsResultsList() {
                    pa paVar = this.algorithmsResultsBuilder_;
                    return paVar == null ? Collections.unmodifiableList(this.algorithmsResults_) : paVar.getMessageList();
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
                public AlgorithmResultOrBuilder getAlgorithmsResultsOrBuilder(int i10) {
                    pa paVar = this.algorithmsResultsBuilder_;
                    return paVar == null ? this.algorithmsResults_.get(i10) : (AlgorithmResultOrBuilder) paVar.getMessageOrBuilder(i10);
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
                public List<? extends AlgorithmResultOrBuilder> getAlgorithmsResultsOrBuilderList() {
                    pa paVar = this.algorithmsResultsBuilder_;
                    return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.algorithmsResults_);
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
                public String getComponent() {
                    Object obj = this.component_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.component_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
                public ByteString getComponentBytes() {
                    Object obj = this.component_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.component_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Event_descriptor;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
                public double getDuration() {
                    return this.duration_;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
                public int getPhase() {
                    return this.phase_;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
                public int getResult() {
                    return this.result_;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Event_fieldAccessorTable.ensureFieldAccessorsInitialized(Event.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder removeAlgorithmsResults(int i10) {
                    pa paVar = this.algorithmsResultsBuilder_;
                    if (paVar != null) {
                        paVar.remove(i10);
                        return this;
                    }
                    ensureAlgorithmsResultsIsMutable();
                    this.algorithmsResults_.remove(i10);
                    onChanged();
                    return this;
                }

                public Builder setAlgorithmsResults(int i10, AlgorithmResult algorithmResult) {
                    pa paVar = this.algorithmsResultsBuilder_;
                    if (paVar != null) {
                        paVar.setMessage(i10, algorithmResult);
                        return this;
                    }
                    algorithmResult.getClass();
                    ensureAlgorithmsResultsIsMutable();
                    this.algorithmsResults_.set(i10, algorithmResult);
                    onChanged();
                    return this;
                }

                public Builder setComponent(String str) {
                    str.getClass();
                    this.component_ = str;
                    onChanged();
                    return this;
                }

                public Builder setComponentBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    b.checkByteStringIsUtf8(byteString);
                    this.component_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setDuration(double d10) {
                    this.duration_ = d10;
                    onChanged();
                    return this;
                }

                public Builder setPhase(int i10) {
                    this.phase_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setResult(int i10) {
                    this.result_ = i10;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Event build() {
                    Event eventBuildPartial = buildPartial();
                    if (eventBuildPartial.isInitialized()) {
                        return eventBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) eventBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Event buildPartial() {
                    Event event = new Event(this);
                    event.phase_ = this.phase_;
                    event.result_ = this.result_;
                    event.duration_ = this.duration_;
                    event.component_ = this.component_;
                    pa paVar = this.algorithmsResultsBuilder_;
                    if (paVar != null) {
                        event.algorithmsResults_ = paVar.build();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.algorithmsResults_ = Collections.unmodifiableList(this.algorithmsResults_);
                            this.bitField0_ &= -2;
                        }
                        event.algorithmsResults_ = this.algorithmsResults_;
                    }
                    onBuilt();
                    return event;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public Event getDefaultInstanceForType() {
                    return Event.getDefaultInstance();
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

                public AlgorithmResult.Builder addAlgorithmsResultsBuilder(int i10) {
                    return (AlgorithmResult.Builder) getAlgorithmsResultsFieldBuilder().addBuilder(i10, AlgorithmResult.getDefaultInstance());
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
                    this.phase_ = 0;
                    this.result_ = 0;
                    this.duration_ = 0.0d;
                    this.component_ = "";
                    pa paVar = this.algorithmsResultsBuilder_;
                    if (paVar == null) {
                        this.algorithmsResults_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -2;
                        return this;
                    }
                    paVar.clear();
                    return this;
                }

                private Builder(p6 p6Var) {
                    super(p6Var);
                    this.component_ = "";
                    this.algorithmsResults_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public Builder addAlgorithmsResults(int i10, AlgorithmResult algorithmResult) {
                    pa paVar = this.algorithmsResultsBuilder_;
                    if (paVar == null) {
                        algorithmResult.getClass();
                        ensureAlgorithmsResultsIsMutable();
                        this.algorithmsResults_.add(i10, algorithmResult);
                        onChanged();
                        return this;
                    }
                    paVar.addMessage(i10, algorithmResult);
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
                /* renamed from: clone */
                public Builder mo500clone() {
                    return (Builder) super.mo500clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof Event) {
                        return mergeFrom((Event) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setAlgorithmsResults(int i10, AlgorithmResult.Builder builder) {
                    pa paVar = this.algorithmsResultsBuilder_;
                    if (paVar == null) {
                        ensureAlgorithmsResultsIsMutable();
                        this.algorithmsResults_.set(i10, builder.build());
                        onChanged();
                        return this;
                    }
                    paVar.setMessage(i10, builder.build());
                    return this;
                }

                public Builder mergeFrom(Event event) {
                    if (event == Event.getDefaultInstance()) {
                        return this;
                    }
                    if (event.getPhase() != 0) {
                        setPhase(event.getPhase());
                    }
                    if (event.getResult() != 0) {
                        setResult(event.getResult());
                    }
                    if (event.getDuration() != 0.0d) {
                        setDuration(event.getDuration());
                    }
                    if (!event.getComponent().isEmpty()) {
                        this.component_ = event.component_;
                        onChanged();
                    }
                    if (this.algorithmsResultsBuilder_ == null) {
                        if (!event.algorithmsResults_.isEmpty()) {
                            if (this.algorithmsResults_.isEmpty()) {
                                this.algorithmsResults_ = event.algorithmsResults_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureAlgorithmsResultsIsMutable();
                                this.algorithmsResults_.addAll(event.algorithmsResults_);
                            }
                            onChanged();
                        }
                    } else if (!event.algorithmsResults_.isEmpty()) {
                        if (!this.algorithmsResultsBuilder_.isEmpty()) {
                            this.algorithmsResultsBuilder_.addAllMessages(event.algorithmsResults_);
                        } else {
                            this.algorithmsResultsBuilder_.dispose();
                            this.algorithmsResultsBuilder_ = null;
                            this.algorithmsResults_ = event.algorithmsResults_;
                            this.bitField0_ &= -2;
                            this.algorithmsResultsBuilder_ = k7.alwaysUseFieldBuilders ? getAlgorithmsResultsFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((k7) event).unknownFields);
                    onChanged();
                    return this;
                }

                public Builder addAlgorithmsResults(AlgorithmResult.Builder builder) {
                    pa paVar = this.algorithmsResultsBuilder_;
                    if (paVar == null) {
                        ensureAlgorithmsResultsIsMutable();
                        this.algorithmsResults_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    paVar.addMessage(builder.build());
                    return this;
                }

                public Builder addAlgorithmsResults(int i10, AlgorithmResult.Builder builder) {
                    pa paVar = this.algorithmsResultsBuilder_;
                    if (paVar == null) {
                        ensureAlgorithmsResultsIsMutable();
                        this.algorithmsResults_.add(i10, builder.build());
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
                public io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Event.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Event.access$3200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector$Event r3 = (io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Event) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector$Event r4 = (io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Event) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Event.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector$Event$Builder");
                }
            }

            public static Builder newBuilder(Event event) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(event);
            }

            public static Event parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (Event) PARSER.parseFrom(byteBuffer, m5Var);
            }

            private Event(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Event parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Event) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static Event parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Event) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Event getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Event parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (Event) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Event() {
                this.memoizedIsInitialized = (byte) -1;
                this.component_ = "";
                this.algorithmsResults_ = Collections.EMPTY_LIST;
            }

            public static Event parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Event) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static Event parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (Event) PARSER.parseFrom(bArr, m5Var);
            }

            public static Event parseFrom(InputStream inputStream) throws IOException {
                return (Event) k7.parseWithIOException(PARSER, inputStream);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private Event(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                    if (tag == 8) {
                                        this.phase_ = yVar.readInt32();
                                    } else if (tag == 16) {
                                        this.result_ = yVar.readInt32();
                                    } else if (tag == 25) {
                                        this.duration_ = yVar.readDouble();
                                    } else if (tag == 34) {
                                        this.component_ = yVar.readStringRequireUtf8();
                                    } else if (tag != 42) {
                                        if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                        }
                                    } else {
                                        if (!z11) {
                                            this.algorithmsResults_ = new ArrayList();
                                            z11 = true;
                                        }
                                        this.algorithmsResults_.add(yVar.readMessage(AlgorithmResult.parser(), m5Var));
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
                            this.algorithmsResults_ = Collections.unmodifiableList(this.algorithmsResults_);
                        }
                        this.unknownFields = ccVarNewBuilder.build();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                if (z11) {
                    this.algorithmsResults_ = Collections.unmodifiableList(this.algorithmsResults_);
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
            }

            public static Event parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Event) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            public static Event parseFrom(y yVar) throws IOException {
                return (Event) k7.parseWithIOException(PARSER, yVar);
            }

            public static Event parseFrom(y yVar, m5 m5Var) throws IOException {
                return (Event) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface EventOrBuilder extends MessageOrBuilder {
            AlgorithmResult getAlgorithmsResults(int i10);

            int getAlgorithmsResultsCount();

            List<AlgorithmResult> getAlgorithmsResultsList();

            AlgorithmResultOrBuilder getAlgorithmsResultsOrBuilder(int i10);

            List<? extends AlgorithmResultOrBuilder> getAlgorithmsResultsOrBuilderList();

            String getComponent();

            ByteString getComponentBytes();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            double getDuration();

            int getPhase();

            int getResult();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public enum PayloadOneofCase implements o7, c {
            EVENT(1),
            CONFIGURATION(2),
            PAYLOADONEOF_NOT_SET(0);

            private final int value;

            PayloadOneofCase(int i10) {
                this.value = i10;
            }

            public static PayloadOneofCase forNumber(int i10) {
                if (i10 == 0) {
                    return PAYLOADONEOF_NOT_SET;
                }
                if (i10 == 1) {
                    return EVENT;
                }
                if (i10 != 2) {
                    return null;
                }
                return CONFIGURATION;
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

        public static BrokenCreativeDetector getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static BrokenCreativeDetector parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BrokenCreativeDetector) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static BrokenCreativeDetector parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (BrokenCreativeDetector) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BrokenCreativeDetector)) {
                return super.equals(obj);
            }
            BrokenCreativeDetector brokenCreativeDetector = (BrokenCreativeDetector) obj;
            if (!getPayloadOneofCase().equals(brokenCreativeDetector.getPayloadOneofCase())) {
                return false;
            }
            int i10 = this.payloadOneofCase_;
            if (i10 != 1) {
                if (i10 == 2 && !getConfiguration().equals(brokenCreativeDetector.getConfiguration())) {
                    return false;
                }
            } else if (!getEvent().equals(brokenCreativeDetector.getEvent())) {
                return false;
            }
            return this.unknownFields.equals(brokenCreativeDetector.unknownFields);
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetectorOrBuilder
        public Configuration getConfiguration() {
            return this.payloadOneofCase_ == 2 ? (Configuration) this.payloadOneof_ : Configuration.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetectorOrBuilder
        public ConfigurationOrBuilder getConfigurationOrBuilder() {
            return this.payloadOneofCase_ == 2 ? (Configuration) this.payloadOneof_ : Configuration.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetectorOrBuilder
        public Event getEvent() {
            return this.payloadOneofCase_ == 1 ? (Event) this.payloadOneof_ : Event.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetectorOrBuilder
        public EventOrBuilder getEventOrBuilder() {
            return this.payloadOneofCase_ == 1 ? (Event) this.payloadOneof_ : Event.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public fa getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetectorOrBuilder
        public PayloadOneofCase getPayloadOneofCase() {
            return PayloadOneofCase.forNumber(this.payloadOneofCase_);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = this.payloadOneofCase_ == 1 ? h0.computeMessageSize(1, (Event) this.payloadOneof_) : 0;
            if (this.payloadOneofCase_ == 2) {
                iComputeMessageSize += h0.computeMessageSize(2, (Configuration) this.payloadOneof_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
        public final gc getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetectorOrBuilder
        public boolean hasConfiguration() {
            return this.payloadOneofCase_ == 2;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetectorOrBuilder
        public boolean hasEvent() {
            return this.payloadOneofCase_ == 1;
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
            int i11 = this.payloadOneofCase_;
            if (i11 != 1) {
                if (i11 == 2) {
                    iB = o2.B(iHashCode2, 37, 2, 53);
                    iHashCode = getConfiguration().hashCode();
                }
                int iHashCode3 = this.unknownFields.hashCode() + (iHashCode2 * 29);
                this.memoizedHashCode = iHashCode3;
                return iHashCode3;
            }
            iB = o2.B(iHashCode2, 37, 1, 53);
            iHashCode = getEvent().hashCode();
            iHashCode2 = iB + iHashCode;
            int iHashCode32 = this.unknownFields.hashCode() + (iHashCode2 * 29);
            this.memoizedHashCode = iHashCode32;
            return iHashCode32;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_fieldAccessorTable.ensureFieldAccessorsInitialized(BrokenCreativeDetector.class, Builder.class);
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
            return new BrokenCreativeDetector();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            if (this.payloadOneofCase_ == 1) {
                h0Var.writeMessage(1, (Event) this.payloadOneof_);
            }
            if (this.payloadOneofCase_ == 2) {
                h0Var.writeMessage(2, (Configuration) this.payloadOneof_);
            }
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements BrokenCreativeDetectorOrBuilder {
            private xa configurationBuilder_;
            private xa eventBuilder_;
            private int payloadOneofCase_;
            private Object payloadOneof_;

            private Builder() {
                super(null);
                this.payloadOneofCase_ = 0;
                maybeForceBuilderInitialization();
            }

            private xa getConfigurationFieldBuilder() {
                if (this.configurationBuilder_ == null) {
                    if (this.payloadOneofCase_ != 2) {
                        this.payloadOneof_ = Configuration.getDefaultInstance();
                    }
                    this.configurationBuilder_ = new xa((Configuration) this.payloadOneof_, getParentForChildren(), isClean());
                    this.payloadOneof_ = null;
                }
                this.payloadOneofCase_ = 2;
                onChanged();
                return this.configurationBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_descriptor;
            }

            private xa getEventFieldBuilder() {
                if (this.eventBuilder_ == null) {
                    if (this.payloadOneofCase_ != 1) {
                        this.payloadOneof_ = Event.getDefaultInstance();
                    }
                    this.eventBuilder_ = new xa((Event) this.payloadOneof_, getParentForChildren(), isClean());
                    this.payloadOneof_ = null;
                }
                this.payloadOneofCase_ = 1;
                onChanged();
                return this.eventBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = k7.alwaysUseFieldBuilders;
            }

            public Builder clearConfiguration() {
                xa xaVar = this.configurationBuilder_;
                if (xaVar == null) {
                    if (this.payloadOneofCase_ == 2) {
                        this.payloadOneofCase_ = 0;
                        this.payloadOneof_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadOneofCase_ == 2) {
                    this.payloadOneofCase_ = 0;
                    this.payloadOneof_ = null;
                }
                xaVar.clear();
                return this;
            }

            public Builder clearEvent() {
                xa xaVar = this.eventBuilder_;
                if (xaVar == null) {
                    if (this.payloadOneofCase_ == 1) {
                        this.payloadOneofCase_ = 0;
                        this.payloadOneof_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadOneofCase_ == 1) {
                    this.payloadOneofCase_ = 0;
                    this.payloadOneof_ = null;
                }
                xaVar.clear();
                return this;
            }

            public Builder clearPayloadOneof() {
                this.payloadOneofCase_ = 0;
                this.payloadOneof_ = null;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetectorOrBuilder
            public Configuration getConfiguration() {
                xa xaVar = this.configurationBuilder_;
                return xaVar == null ? this.payloadOneofCase_ == 2 ? (Configuration) this.payloadOneof_ : Configuration.getDefaultInstance() : this.payloadOneofCase_ == 2 ? (Configuration) xaVar.getMessage() : Configuration.getDefaultInstance();
            }

            public Configuration.Builder getConfigurationBuilder() {
                return (Configuration.Builder) getConfigurationFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetectorOrBuilder
            public ConfigurationOrBuilder getConfigurationOrBuilder() {
                xa xaVar;
                int i10 = this.payloadOneofCase_;
                return (i10 != 2 || (xaVar = this.configurationBuilder_) == null) ? i10 == 2 ? (Configuration) this.payloadOneof_ : Configuration.getDefaultInstance() : (ConfigurationOrBuilder) xaVar.getMessageOrBuilder();
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_descriptor;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetectorOrBuilder
            public Event getEvent() {
                xa xaVar = this.eventBuilder_;
                return xaVar == null ? this.payloadOneofCase_ == 1 ? (Event) this.payloadOneof_ : Event.getDefaultInstance() : this.payloadOneofCase_ == 1 ? (Event) xaVar.getMessage() : Event.getDefaultInstance();
            }

            public Event.Builder getEventBuilder() {
                return (Event.Builder) getEventFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetectorOrBuilder
            public EventOrBuilder getEventOrBuilder() {
                xa xaVar;
                int i10 = this.payloadOneofCase_;
                return (i10 != 1 || (xaVar = this.eventBuilder_) == null) ? i10 == 1 ? (Event) this.payloadOneof_ : Event.getDefaultInstance() : (EventOrBuilder) xaVar.getMessageOrBuilder();
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetectorOrBuilder
            public PayloadOneofCase getPayloadOneofCase() {
                return PayloadOneofCase.forNumber(this.payloadOneofCase_);
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetectorOrBuilder
            public boolean hasConfiguration() {
                return this.payloadOneofCase_ == 2;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetectorOrBuilder
            public boolean hasEvent() {
                return this.payloadOneofCase_ == 1;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_fieldAccessorTable.ensureFieldAccessorsInitialized(BrokenCreativeDetector.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeConfiguration(Configuration configuration) {
                xa xaVar = this.configurationBuilder_;
                if (xaVar == null) {
                    if (this.payloadOneofCase_ != 2 || this.payloadOneof_ == Configuration.getDefaultInstance()) {
                        this.payloadOneof_ = configuration;
                    } else {
                        this.payloadOneof_ = Configuration.newBuilder((Configuration) this.payloadOneof_).mergeFrom(configuration).buildPartial();
                    }
                    onChanged();
                } else {
                    if (this.payloadOneofCase_ == 2) {
                        xaVar.mergeFrom(configuration);
                    }
                    this.configurationBuilder_.setMessage(configuration);
                }
                this.payloadOneofCase_ = 2;
                return this;
            }

            public Builder mergeEvent(Event event) {
                xa xaVar = this.eventBuilder_;
                if (xaVar == null) {
                    if (this.payloadOneofCase_ != 1 || this.payloadOneof_ == Event.getDefaultInstance()) {
                        this.payloadOneof_ = event;
                    } else {
                        this.payloadOneof_ = Event.newBuilder((Event) this.payloadOneof_).mergeFrom(event).buildPartial();
                    }
                    onChanged();
                } else {
                    if (this.payloadOneofCase_ == 1) {
                        xaVar.mergeFrom(event);
                    }
                    this.eventBuilder_.setMessage(event);
                }
                this.payloadOneofCase_ = 1;
                return this;
            }

            public Builder setConfiguration(Configuration configuration) {
                xa xaVar = this.configurationBuilder_;
                if (xaVar == null) {
                    configuration.getClass();
                    this.payloadOneof_ = configuration;
                    onChanged();
                } else {
                    xaVar.setMessage(configuration);
                }
                this.payloadOneofCase_ = 2;
                return this;
            }

            public Builder setEvent(Event event) {
                xa xaVar = this.eventBuilder_;
                if (xaVar == null) {
                    event.getClass();
                    this.payloadOneof_ = event;
                    onChanged();
                } else {
                    xaVar.setMessage(event);
                }
                this.payloadOneofCase_ = 1;
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public BrokenCreativeDetector build() {
                BrokenCreativeDetector brokenCreativeDetectorBuildPartial = buildPartial();
                if (brokenCreativeDetectorBuildPartial.isInitialized()) {
                    return brokenCreativeDetectorBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) brokenCreativeDetectorBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public BrokenCreativeDetector buildPartial() {
                BrokenCreativeDetector brokenCreativeDetector = new BrokenCreativeDetector(this);
                if (this.payloadOneofCase_ == 1) {
                    xa xaVar = this.eventBuilder_;
                    if (xaVar == null) {
                        brokenCreativeDetector.payloadOneof_ = this.payloadOneof_;
                    } else {
                        brokenCreativeDetector.payloadOneof_ = xaVar.build();
                    }
                }
                if (this.payloadOneofCase_ == 2) {
                    xa xaVar2 = this.configurationBuilder_;
                    if (xaVar2 == null) {
                        brokenCreativeDetector.payloadOneof_ = this.payloadOneof_;
                    } else {
                        brokenCreativeDetector.payloadOneof_ = xaVar2.build();
                    }
                }
                brokenCreativeDetector.payloadOneofCase_ = this.payloadOneofCase_;
                onBuilt();
                return brokenCreativeDetector;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public BrokenCreativeDetector getDefaultInstanceForType() {
                return BrokenCreativeDetector.getDefaultInstance();
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
                this.payloadOneofCase_ = 0;
                this.payloadOneof_ = null;
                return this;
            }

            private Builder(p6 p6Var) {
                super(p6Var);
                this.payloadOneofCase_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
            /* renamed from: clone */
            public Builder mo500clone() {
                return (Builder) super.mo500clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof BrokenCreativeDetector) {
                    return mergeFrom((BrokenCreativeDetector) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setConfiguration(Configuration.Builder builder) {
                xa xaVar = this.configurationBuilder_;
                if (xaVar == null) {
                    this.payloadOneof_ = builder.build();
                    onChanged();
                } else {
                    xaVar.setMessage(builder.build());
                }
                this.payloadOneofCase_ = 2;
                return this;
            }

            public Builder setEvent(Event.Builder builder) {
                xa xaVar = this.eventBuilder_;
                if (xaVar == null) {
                    this.payloadOneof_ = builder.build();
                    onChanged();
                } else {
                    xaVar.setMessage(builder.build());
                }
                this.payloadOneofCase_ = 1;
                return this;
            }

            public Builder mergeFrom(BrokenCreativeDetector brokenCreativeDetector) {
                if (brokenCreativeDetector == BrokenCreativeDetector.getDefaultInstance()) {
                    return this;
                }
                int i10 = AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$rendering$RenderingFeature$BrokenCreativeDetector$PayloadOneofCase[brokenCreativeDetector.getPayloadOneofCase().ordinal()];
                if (i10 == 1) {
                    mergeEvent(brokenCreativeDetector.getEvent());
                } else if (i10 == 2) {
                    mergeConfiguration(brokenCreativeDetector.getConfiguration());
                }
                mergeUnknownFields(((k7) brokenCreativeDetector).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.access$5800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector r3 = (io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector r4 = (io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector$Builder");
            }
        }

        public static Builder newBuilder(BrokenCreativeDetector brokenCreativeDetector) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(brokenCreativeDetector);
        }

        public static BrokenCreativeDetector parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (BrokenCreativeDetector) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private BrokenCreativeDetector(o6 o6Var) {
            super(o6Var);
            this.payloadOneofCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static BrokenCreativeDetector parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (BrokenCreativeDetector) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static BrokenCreativeDetector parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BrokenCreativeDetector) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public BrokenCreativeDetector getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static BrokenCreativeDetector parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (BrokenCreativeDetector) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static BrokenCreativeDetector parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BrokenCreativeDetector) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        private BrokenCreativeDetector() {
            this.payloadOneofCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static BrokenCreativeDetector parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (BrokenCreativeDetector) PARSER.parseFrom(bArr, m5Var);
        }

        public static BrokenCreativeDetector parseFrom(InputStream inputStream) throws IOException {
            return (BrokenCreativeDetector) k7.parseWithIOException(PARSER, inputStream);
        }

        private BrokenCreativeDetector(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                Event.Builder builder = this.payloadOneofCase_ == 1 ? ((Event) this.payloadOneof_).toBuilder() : null;
                                MessageLite message = yVar.readMessage(Event.parser(), m5Var);
                                this.payloadOneof_ = message;
                                if (builder != null) {
                                    builder.mergeFrom((Event) message);
                                    this.payloadOneof_ = builder.buildPartial();
                                }
                                this.payloadOneofCase_ = 1;
                            } else if (tag != 18) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                Configuration.Builder builder2 = this.payloadOneofCase_ == 2 ? ((Configuration) this.payloadOneof_).toBuilder() : null;
                                MessageLite message2 = yVar.readMessage(Configuration.parser(), m5Var);
                                this.payloadOneof_ = message2;
                                if (builder2 != null) {
                                    builder2.mergeFrom((Configuration) message2);
                                    this.payloadOneof_ = builder2.buildPartial();
                                }
                                this.payloadOneofCase_ = 2;
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

        public static BrokenCreativeDetector parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (BrokenCreativeDetector) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static BrokenCreativeDetector parseFrom(y yVar) throws IOException {
            return (BrokenCreativeDetector) k7.parseWithIOException(PARSER, yVar);
        }

        public static BrokenCreativeDetector parseFrom(y yVar, m5 m5Var) throws IOException {
            return (BrokenCreativeDetector) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface BrokenCreativeDetectorOrBuilder extends MessageOrBuilder {
        BrokenCreativeDetector.Configuration getConfiguration();

        BrokenCreativeDetector.ConfigurationOrBuilder getConfigurationOrBuilder();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        BrokenCreativeDetector.Event getEvent();

        BrokenCreativeDetector.EventOrBuilder getEventOrBuilder();

        BrokenCreativeDetector.PayloadOneofCase getPayloadOneofCase();

        boolean hasConfiguration();

        boolean hasEvent();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum FeatureCase implements o7, c {
        BROKEN_CREATIVE_DETECTOR(1),
        FEATURE_NOT_SET(0);

        private final int value;

        FeatureCase(int i10) {
            this.value = i10;
        }

        public static FeatureCase forNumber(int i10) {
            if (i10 == 0) {
                return FEATURE_NOT_SET;
            }
            if (i10 != 1) {
                return null;
            }
            return BROKEN_CREATIVE_DETECTOR;
        }

        @Override // com.explorestack.protobuf.o7
        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static FeatureCase valueOf(int i10) {
            return forNumber(i10);
        }
    }

    public static RenderingFeature getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static RenderingFeature parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RenderingFeature) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static RenderingFeature parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RenderingFeature) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RenderingFeature)) {
            return super.equals(obj);
        }
        RenderingFeature renderingFeature = (RenderingFeature) obj;
        if (getFeatureCase().equals(renderingFeature.getFeatureCase())) {
            return (this.featureCase_ != 1 || getBrokenCreativeDetector().equals(renderingFeature.getBrokenCreativeDetector())) && this.unknownFields.equals(renderingFeature.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.rendering.RenderingFeatureOrBuilder
    public BrokenCreativeDetector getBrokenCreativeDetector() {
        return this.featureCase_ == 1 ? (BrokenCreativeDetector) this.feature_ : BrokenCreativeDetector.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.rendering.RenderingFeatureOrBuilder
    public BrokenCreativeDetectorOrBuilder getBrokenCreativeDetectorOrBuilder() {
        return this.featureCase_ == 1 ? (BrokenCreativeDetector) this.feature_ : BrokenCreativeDetector.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.rendering.RenderingFeatureOrBuilder
    public FeatureCase getFeatureCase() {
        return FeatureCase.forNumber(this.featureCase_);
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
        int serializedSize = this.unknownFields.getSerializedSize() + (this.featureCase_ == 1 ? h0.computeMessageSize(1, (BrokenCreativeDetector) this.feature_) : 0);
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.rendering.RenderingFeatureOrBuilder
    public boolean hasBrokenCreativeDetector() {
        return this.featureCase_ == 1;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (this.featureCase_ == 1) {
            iHashCode = o2.B(iHashCode, 37, 1, 53) + getBrokenCreativeDetector().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_fieldAccessorTable.ensureFieldAccessorsInitialized(RenderingFeature.class, Builder.class);
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
        return new RenderingFeature();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (this.featureCase_ == 1) {
            h0Var.writeMessage(1, (BrokenCreativeDetector) this.feature_);
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements RenderingFeatureOrBuilder {
        private xa brokenCreativeDetectorBuilder_;
        private int featureCase_;
        private Object feature_;

        private Builder() {
            super(null);
            this.featureCase_ = 0;
            maybeForceBuilderInitialization();
        }

        private xa getBrokenCreativeDetectorFieldBuilder() {
            if (this.brokenCreativeDetectorBuilder_ == null) {
                if (this.featureCase_ != 1) {
                    this.feature_ = BrokenCreativeDetector.getDefaultInstance();
                }
                this.brokenCreativeDetectorBuilder_ = new xa((BrokenCreativeDetector) this.feature_, getParentForChildren(), isClean());
                this.feature_ = null;
            }
            this.featureCase_ = 1;
            onChanged();
            return this.brokenCreativeDetectorBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = k7.alwaysUseFieldBuilders;
        }

        public Builder clearBrokenCreativeDetector() {
            xa xaVar = this.brokenCreativeDetectorBuilder_;
            if (xaVar == null) {
                if (this.featureCase_ == 1) {
                    this.featureCase_ = 0;
                    this.feature_ = null;
                    onChanged();
                }
                return this;
            }
            if (this.featureCase_ == 1) {
                this.featureCase_ = 0;
                this.feature_ = null;
            }
            xaVar.clear();
            return this;
        }

        public Builder clearFeature() {
            this.featureCase_ = 0;
            this.feature_ = null;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingFeatureOrBuilder
        public BrokenCreativeDetector getBrokenCreativeDetector() {
            xa xaVar = this.brokenCreativeDetectorBuilder_;
            return xaVar == null ? this.featureCase_ == 1 ? (BrokenCreativeDetector) this.feature_ : BrokenCreativeDetector.getDefaultInstance() : this.featureCase_ == 1 ? (BrokenCreativeDetector) xaVar.getMessage() : BrokenCreativeDetector.getDefaultInstance();
        }

        public BrokenCreativeDetector.Builder getBrokenCreativeDetectorBuilder() {
            return (BrokenCreativeDetector.Builder) getBrokenCreativeDetectorFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingFeatureOrBuilder
        public BrokenCreativeDetectorOrBuilder getBrokenCreativeDetectorOrBuilder() {
            xa xaVar;
            int i10 = this.featureCase_;
            return (i10 != 1 || (xaVar = this.brokenCreativeDetectorBuilder_) == null) ? i10 == 1 ? (BrokenCreativeDetector) this.feature_ : BrokenCreativeDetector.getDefaultInstance() : (BrokenCreativeDetectorOrBuilder) xaVar.getMessageOrBuilder();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_descriptor;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingFeatureOrBuilder
        public FeatureCase getFeatureCase() {
            return FeatureCase.forNumber(this.featureCase_);
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingFeatureOrBuilder
        public boolean hasBrokenCreativeDetector() {
            return this.featureCase_ == 1;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_fieldAccessorTable.ensureFieldAccessorsInitialized(RenderingFeature.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeBrokenCreativeDetector(BrokenCreativeDetector brokenCreativeDetector) {
            xa xaVar = this.brokenCreativeDetectorBuilder_;
            if (xaVar == null) {
                if (this.featureCase_ != 1 || this.feature_ == BrokenCreativeDetector.getDefaultInstance()) {
                    this.feature_ = brokenCreativeDetector;
                } else {
                    this.feature_ = BrokenCreativeDetector.newBuilder((BrokenCreativeDetector) this.feature_).mergeFrom(brokenCreativeDetector).buildPartial();
                }
                onChanged();
            } else {
                if (this.featureCase_ == 1) {
                    xaVar.mergeFrom(brokenCreativeDetector);
                }
                this.brokenCreativeDetectorBuilder_.setMessage(brokenCreativeDetector);
            }
            this.featureCase_ = 1;
            return this;
        }

        public Builder setBrokenCreativeDetector(BrokenCreativeDetector brokenCreativeDetector) {
            xa xaVar = this.brokenCreativeDetectorBuilder_;
            if (xaVar == null) {
                brokenCreativeDetector.getClass();
                this.feature_ = brokenCreativeDetector;
                onChanged();
            } else {
                xaVar.setMessage(brokenCreativeDetector);
            }
            this.featureCase_ = 1;
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public RenderingFeature build() {
            RenderingFeature renderingFeatureBuildPartial = buildPartial();
            if (renderingFeatureBuildPartial.isInitialized()) {
                return renderingFeatureBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) renderingFeatureBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public RenderingFeature buildPartial() {
            RenderingFeature renderingFeature = new RenderingFeature(this);
            if (this.featureCase_ == 1) {
                xa xaVar = this.brokenCreativeDetectorBuilder_;
                if (xaVar == null) {
                    renderingFeature.feature_ = this.feature_;
                } else {
                    renderingFeature.feature_ = xaVar.build();
                }
            }
            renderingFeature.featureCase_ = this.featureCase_;
            onBuilt();
            return renderingFeature;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public RenderingFeature getDefaultInstanceForType() {
            return RenderingFeature.getDefaultInstance();
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
            this.featureCase_ = 0;
            this.feature_ = null;
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            this.featureCase_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
        /* renamed from: clone */
        public Builder mo500clone() {
            return (Builder) super.mo500clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof RenderingFeature) {
                return mergeFrom((RenderingFeature) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setBrokenCreativeDetector(BrokenCreativeDetector.Builder builder) {
            xa xaVar = this.brokenCreativeDetectorBuilder_;
            if (xaVar == null) {
                this.feature_ = builder.build();
                onChanged();
            } else {
                xaVar.setMessage(builder.build());
            }
            this.featureCase_ = 1;
            return this;
        }

        public Builder mergeFrom(RenderingFeature renderingFeature) {
            if (renderingFeature == RenderingFeature.getDefaultInstance()) {
                return this;
            }
            if (AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$rendering$RenderingFeature$FeatureCase[renderingFeature.getFeatureCase().ordinal()] == 1) {
                mergeBrokenCreativeDetector(renderingFeature.getBrokenCreativeDetector());
            }
            mergeUnknownFields(((k7) renderingFeature).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.bidmachine.protobuf.rendering.RenderingFeature.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.rendering.RenderingFeature.access$6700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.rendering.RenderingFeature r3 = (io.bidmachine.protobuf.rendering.RenderingFeature) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.rendering.RenderingFeature r4 = (io.bidmachine.protobuf.rendering.RenderingFeature) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.rendering.RenderingFeature.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.rendering.RenderingFeature$Builder");
        }
    }

    public static Builder newBuilder(RenderingFeature renderingFeature) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(renderingFeature);
    }

    public static RenderingFeature parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (RenderingFeature) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private RenderingFeature(o6 o6Var) {
        super(o6Var);
        this.featureCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static RenderingFeature parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (RenderingFeature) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static RenderingFeature parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RenderingFeature) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public RenderingFeature getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static RenderingFeature parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (RenderingFeature) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static RenderingFeature parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RenderingFeature) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    private RenderingFeature() {
        this.featureCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static RenderingFeature parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (RenderingFeature) PARSER.parseFrom(bArr, m5Var);
    }

    public static RenderingFeature parseFrom(InputStream inputStream) throws IOException {
        return (RenderingFeature) k7.parseWithIOException(PARSER, inputStream);
    }

    private RenderingFeature(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                            if (tag != 10) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                BrokenCreativeDetector.Builder builder = this.featureCase_ == 1 ? ((BrokenCreativeDetector) this.feature_).toBuilder() : null;
                                MessageLite message = yVar.readMessage(BrokenCreativeDetector.parser(), m5Var);
                                this.feature_ = message;
                                if (builder != null) {
                                    builder.mergeFrom((BrokenCreativeDetector) message);
                                    this.feature_ = builder.buildPartial();
                                }
                                this.featureCase_ = 1;
                            }
                        }
                        z10 = true;
                    } catch (IOException e10) {
                        throw new InvalidProtocolBufferException(e10).setUnfinishedMessage(this);
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
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

    public static RenderingFeature parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (RenderingFeature) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static RenderingFeature parseFrom(y yVar) throws IOException {
        return (RenderingFeature) k7.parseWithIOException(PARSER, yVar);
    }

    public static RenderingFeature parseFrom(y yVar, m5 m5Var) throws IOException {
        return (RenderingFeature) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
