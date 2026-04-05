package io.bidmachine.protobuf.analytics;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.b;
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
import com.explorestack.protobuf.sb;
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
public final class SDKAnalyticPayload extends k7 implements SDKAnalyticPayloadOrBuilder {
    public static final int METRICS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private List<Metric> metrics_;
    private static final SDKAnalyticPayload DEFAULT_INSTANCE = new SDKAnalyticPayload();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public SDKAnalyticPayload parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new SDKAnalyticPayload(yVar, m5Var);
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Metric extends k7 implements MetricOrBuilder {
        public static final int CONTEXT_FIELD_NUMBER = 1;
        public static final int DATA_FIELD_NUMBER = 2;
        private static final Metric DEFAULT_INSTANCE = new Metric();
        private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public Metric parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new Metric(yVar, m5Var);
            }
        };
        private static final long serialVersionUID = 0;
        private volatile Object context_;
        private List<MetricData> data_;
        private byte memoizedIsInitialized;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class MetricData extends k7 implements MetricDataOrBuilder {
            public static final int DIMENSIONS_FIELD_NUMBER = 3;
            public static final int ERROR_FIELD_NUMBER = 5;
            public static final int MEASURES_FIELD_NUMBER = 4;
            public static final int NAME_FIELD_NUMBER = 2;
            public static final int TIMESTAMP_FIELD_NUMBER = 1;
            public static final int TS_FIELD_NUMBER = 6;
            private static final long serialVersionUID = 0;
            private List<Dimension> dimensions_;
            private Error error_;
            private List<Measure> measures_;
            private byte memoizedIsInitialized;
            private volatile Object name_;
            private volatile Object timestamp_;
            private Timestamp ts_;
            private static final MetricData DEFAULT_INSTANCE = new MetricData();
            private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public MetricData parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new MetricData(yVar, m5Var);
                }
            };

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Dimension extends k7 implements DimensionOrBuilder {
                public static final int NAME_FIELD_NUMBER = 1;
                public static final int VALUE_FIELD_NUMBER = 2;
                private static final long serialVersionUID = 0;
                private byte memoizedIsInitialized;
                private volatile Object name_;
                private volatile Object value_;
                private static final Dimension DEFAULT_INSTANCE = new Dimension();
                private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Dimension.1
                    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                    public Dimension parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                        return new Dimension(yVar, m5Var);
                    }
                };

                public static Dimension getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_descriptor;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Dimension parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Dimension) k7.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Dimension parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (Dimension) PARSER.parseFrom(byteBuffer);
                }

                public static fa parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Dimension)) {
                        return super.equals(obj);
                    }
                    Dimension dimension = (Dimension) obj;
                    return getName().equals(dimension.getName()) && getValue().equals(dimension.getValue()) && this.unknownFields.equals(dimension.unknownFields);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
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
                    if (!getValueBytes().isEmpty()) {
                        iComputeStringSize += k7.computeStringSize(2, this.value_);
                    }
                    int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
                public final gc getUnknownFields() {
                    return this.unknownFields;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                public String getValue() {
                    Object obj = this.value_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.value_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                public ByteString getValueBytes() {
                    Object obj = this.value_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.value_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = this.unknownFields.hashCode() + ((getValue().hashCode() + ((((getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
                    this.memoizedHashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.explorestack.protobuf.k7
                public i7 internalGetFieldAccessorTable() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_fieldAccessorTable.ensureFieldAccessorsInitialized(Dimension.class, Builder.class);
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
                    return new Dimension();
                }

                @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(h0 h0Var) throws IOException {
                    if (!getNameBytes().isEmpty()) {
                        k7.writeString(h0Var, 1, this.name_);
                    }
                    if (!getValueBytes().isEmpty()) {
                        k7.writeString(h0Var, 2, this.value_);
                    }
                    this.unknownFields.writeTo(h0Var);
                }

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public static final class Builder extends o6 implements DimensionOrBuilder {
                    private Object name_;
                    private Object value_;

                    private Builder() {
                        super(null);
                        this.name_ = "";
                        this.value_ = "";
                        maybeForceBuilderInitialization();
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_descriptor;
                    }

                    private void maybeForceBuilderInitialization() {
                        boolean unused = k7.alwaysUseFieldBuilders;
                    }

                    public Builder clearName() {
                        this.name_ = Dimension.getDefaultInstance().getName();
                        onChanged();
                        return this;
                    }

                    public Builder clearValue() {
                        this.value_ = Dimension.getDefaultInstance().getValue();
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_descriptor;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                    public String getName() {
                        Object obj = this.name_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.name_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                    public ByteString getNameBytes() {
                        Object obj = this.name_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.name_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                    public String getValue() {
                        Object obj = this.value_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.value_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                    public ByteString getValueBytes() {
                        Object obj = this.value_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.value_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.o6
                    public i7 internalGetFieldAccessorTable() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_fieldAccessorTable.ensureFieldAccessorsInitialized(Dimension.class, Builder.class);
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

                    public Builder setValue(String str) {
                        str.getClass();
                        this.value_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setValueBytes(ByteString byteString) throws IllegalArgumentException {
                        byteString.getClass();
                        b.checkByteStringIsUtf8(byteString);
                        this.value_ = byteString;
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                    public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Dimension build() {
                        Dimension dimensionBuildPartial = buildPartial();
                        if (dimensionBuildPartial.isInitialized()) {
                            return dimensionBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) dimensionBuildPartial);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Dimension buildPartial() {
                        Dimension dimension = new Dimension(this);
                        dimension.name_ = this.name_;
                        dimension.value_ = this.value_;
                        onBuilt();
                        return dimension;
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    public Dimension getDefaultInstanceForType() {
                        return Dimension.getDefaultInstance();
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
                        this.value_ = "";
                        return this;
                    }

                    private Builder(p6 p6Var) {
                        super(p6Var);
                        this.name_ = "";
                        this.value_ = "";
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
                    /* renamed from: clone */
                    public Builder mo500clone() {
                        return (Builder) super.mo500clone();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder mergeFrom(Message message) {
                        if (message instanceof Dimension) {
                            return mergeFrom((Dimension) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    public Builder mergeFrom(Dimension dimension) {
                        if (dimension == Dimension.getDefaultInstance()) {
                            return this;
                        }
                        if (!dimension.getName().isEmpty()) {
                            this.name_ = dimension.name_;
                            onChanged();
                        }
                        if (!dimension.getValue().isEmpty()) {
                            this.value_ = dimension.value_;
                            onChanged();
                        }
                        mergeUnknownFields(((k7) dimension).unknownFields);
                        onChanged();
                        return this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Dimension.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Dimension.access$700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Dimension r3 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Dimension) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                            io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Dimension r4 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Dimension) r4     // Catch: java.lang.Throwable -> L11
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
                        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Dimension.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Dimension$Builder");
                    }
                }

                public static Builder newBuilder(Dimension dimension) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(dimension);
                }

                public static Dimension parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                    return (Dimension) PARSER.parseFrom(byteBuffer, m5Var);
                }

                private Dimension(o6 o6Var) {
                    super(o6Var);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static Dimension parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                    return (Dimension) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
                }

                public static Dimension parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (Dimension) PARSER.parseFrom(byteString);
                }

                @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public Dimension getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static Dimension parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                    return (Dimension) PARSER.parseFrom(byteString, m5Var);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private Dimension() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.name_ = "";
                    this.value_ = "";
                }

                public static Dimension parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (Dimension) PARSER.parseFrom(bArr);
                }

                @Override // com.explorestack.protobuf.k7
                public Builder newBuilderForType(p6 p6Var) {
                    return new Builder(p6Var);
                }

                public static Dimension parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                    return (Dimension) PARSER.parseFrom(bArr, m5Var);
                }

                public static Dimension parseFrom(InputStream inputStream) throws IOException {
                    return (Dimension) k7.parseWithIOException(PARSER, inputStream);
                }

                private Dimension(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                    } else if (tag != 18) {
                                        if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                        }
                                    } else {
                                        this.value_ = yVar.readStringRequireUtf8();
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

                public static Dimension parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                    return (Dimension) k7.parseWithIOException(PARSER, inputStream, m5Var);
                }

                public static Dimension parseFrom(y yVar) throws IOException {
                    return (Dimension) k7.parseWithIOException(PARSER, yVar);
                }

                public static Dimension parseFrom(y yVar, m5 m5Var) throws IOException {
                    return (Dimension) k7.parseWithIOException(PARSER, yVar, m5Var);
                }
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public interface DimensionOrBuilder extends MessageOrBuilder {
                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ MessageLite getDefaultInstanceForType();

                String getName();

                ByteString getNameBytes();

                String getValue();

                ByteString getValueBytes();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Error extends k7 implements ErrorOrBuilder {
                public static final int DESCRIPTION_FIELD_NUMBER = 2;
                public static final int NAME_FIELD_NUMBER = 1;
                private static final long serialVersionUID = 0;
                private volatile Object description_;
                private byte memoizedIsInitialized;
                private volatile Object name_;
                private static final Error DEFAULT_INSTANCE = new Error();
                private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Error.1
                    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                    public Error parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                        return new Error(yVar, m5Var);
                    }
                };

                public static Error getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_descriptor;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Error parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Error) k7.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Error parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (Error) PARSER.parseFrom(byteBuffer);
                }

                public static fa parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Error)) {
                        return super.equals(obj);
                    }
                    Error error = (Error) obj;
                    return getName().equals(error.getName()) && getDescription().equals(error.getDescription()) && this.unknownFields.equals(error.unknownFields);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                public String getDescription() {
                    Object obj = this.description_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.description_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                public ByteString getDescriptionBytes() {
                    Object obj = this.description_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.description_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
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
                    if (!getDescriptionBytes().isEmpty()) {
                        iComputeStringSize += k7.computeStringSize(2, this.description_);
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
                    int iHashCode = this.unknownFields.hashCode() + ((getDescription().hashCode() + ((((getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
                    this.memoizedHashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.explorestack.protobuf.k7
                public i7 internalGetFieldAccessorTable() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_fieldAccessorTable.ensureFieldAccessorsInitialized(Error.class, Builder.class);
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
                    return new Error();
                }

                @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(h0 h0Var) throws IOException {
                    if (!getNameBytes().isEmpty()) {
                        k7.writeString(h0Var, 1, this.name_);
                    }
                    if (!getDescriptionBytes().isEmpty()) {
                        k7.writeString(h0Var, 2, this.description_);
                    }
                    this.unknownFields.writeTo(h0Var);
                }

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public static final class Builder extends o6 implements ErrorOrBuilder {
                    private Object description_;
                    private Object name_;

                    private Builder() {
                        super(null);
                        this.name_ = "";
                        this.description_ = "";
                        maybeForceBuilderInitialization();
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_descriptor;
                    }

                    private void maybeForceBuilderInitialization() {
                        boolean unused = k7.alwaysUseFieldBuilders;
                    }

                    public Builder clearDescription() {
                        this.description_ = Error.getDefaultInstance().getDescription();
                        onChanged();
                        return this;
                    }

                    public Builder clearName() {
                        this.name_ = Error.getDefaultInstance().getName();
                        onChanged();
                        return this;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                    public String getDescription() {
                        Object obj = this.description_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.description_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                    public ByteString getDescriptionBytes() {
                        Object obj = this.description_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.description_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_descriptor;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                    public String getName() {
                        Object obj = this.name_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.name_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                    public ByteString getNameBytes() {
                        Object obj = this.name_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.name_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.o6
                    public i7 internalGetFieldAccessorTable() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_fieldAccessorTable.ensureFieldAccessorsInitialized(Error.class, Builder.class);
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    public Builder setDescription(String str) {
                        str.getClass();
                        this.description_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setDescriptionBytes(ByteString byteString) throws IllegalArgumentException {
                        byteString.getClass();
                        b.checkByteStringIsUtf8(byteString);
                        this.description_ = byteString;
                        onChanged();
                        return this;
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

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                    public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Error build() {
                        Error errorBuildPartial = buildPartial();
                        if (errorBuildPartial.isInitialized()) {
                            return errorBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) errorBuildPartial);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Error buildPartial() {
                        Error error = new Error(this);
                        error.name_ = this.name_;
                        error.description_ = this.description_;
                        onBuilt();
                        return error;
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    public Error getDefaultInstanceForType() {
                        return Error.getDefaultInstance();
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
                        this.description_ = "";
                        return this;
                    }

                    private Builder(p6 p6Var) {
                        super(p6Var);
                        this.name_ = "";
                        this.description_ = "";
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
                    /* renamed from: clone */
                    public Builder mo500clone() {
                        return (Builder) super.mo500clone();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder mergeFrom(Message message) {
                        if (message instanceof Error) {
                            return mergeFrom((Error) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    public Builder mergeFrom(Error error) {
                        if (error == Error.getDefaultInstance()) {
                            return this;
                        }
                        if (!error.getName().isEmpty()) {
                            this.name_ = error.name_;
                            onChanged();
                        }
                        if (!error.getDescription().isEmpty()) {
                            this.description_ = error.description_;
                            onChanged();
                        }
                        mergeUnknownFields(((k7) error).unknownFields);
                        onChanged();
                        return this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Error.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Error.access$2800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Error r3 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Error) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                            io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Error r4 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Error) r4     // Catch: java.lang.Throwable -> L11
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
                        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Error.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Error$Builder");
                    }
                }

                public static Builder newBuilder(Error error) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(error);
                }

                public static Error parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                    return (Error) PARSER.parseFrom(byteBuffer, m5Var);
                }

                private Error(o6 o6Var) {
                    super(o6Var);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static Error parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                    return (Error) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
                }

                public static Error parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (Error) PARSER.parseFrom(byteString);
                }

                @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public Error getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static Error parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                    return (Error) PARSER.parseFrom(byteString, m5Var);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private Error() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.name_ = "";
                    this.description_ = "";
                }

                public static Error parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (Error) PARSER.parseFrom(bArr);
                }

                @Override // com.explorestack.protobuf.k7
                public Builder newBuilderForType(p6 p6Var) {
                    return new Builder(p6Var);
                }

                public static Error parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                    return (Error) PARSER.parseFrom(bArr, m5Var);
                }

                public static Error parseFrom(InputStream inputStream) throws IOException {
                    return (Error) k7.parseWithIOException(PARSER, inputStream);
                }

                private Error(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                    } else if (tag != 18) {
                                        if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                        }
                                    } else {
                                        this.description_ = yVar.readStringRequireUtf8();
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

                public static Error parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                    return (Error) k7.parseWithIOException(PARSER, inputStream, m5Var);
                }

                public static Error parseFrom(y yVar) throws IOException {
                    return (Error) k7.parseWithIOException(PARSER, yVar);
                }

                public static Error parseFrom(y yVar, m5 m5Var) throws IOException {
                    return (Error) k7.parseWithIOException(PARSER, yVar, m5Var);
                }
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public interface ErrorOrBuilder extends MessageOrBuilder {
                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ MessageLite getDefaultInstanceForType();

                String getDescription();

                ByteString getDescriptionBytes();

                String getName();

                ByteString getNameBytes();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Measure extends k7 implements MeasureOrBuilder {
                public static final int NAME_FIELD_NUMBER = 1;
                public static final int VALUE_FIELD_NUMBER = 2;
                private static final long serialVersionUID = 0;
                private byte memoizedIsInitialized;
                private volatile Object name_;
                private double value_;
                private static final Measure DEFAULT_INSTANCE = new Measure();
                private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Measure.1
                    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                    public Measure parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                        return new Measure(yVar, m5Var);
                    }
                };

                public static Measure getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_descriptor;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Measure parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Measure) k7.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Measure parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (Measure) PARSER.parseFrom(byteBuffer);
                }

                public static fa parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Measure)) {
                        return super.equals(obj);
                    }
                    Measure measure = (Measure) obj;
                    return getName().equals(measure.getName()) && Double.doubleToLongBits(getValue()) == Double.doubleToLongBits(measure.getValue()) && this.unknownFields.equals(measure.unknownFields);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
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
                    double d10 = this.value_;
                    if (d10 != 0.0d) {
                        iComputeStringSize += h0.computeDoubleSize(2, d10);
                    }
                    int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
                public final gc getUnknownFields() {
                    return this.unknownFields;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
                public double getValue() {
                    return this.value_;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = this.unknownFields.hashCode() + ((x7.hashLong(Double.doubleToLongBits(getValue())) + ((((getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
                    this.memoizedHashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.explorestack.protobuf.k7
                public i7 internalGetFieldAccessorTable() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_fieldAccessorTable.ensureFieldAccessorsInitialized(Measure.class, Builder.class);
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
                    return new Measure();
                }

                @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(h0 h0Var) throws IOException {
                    if (!getNameBytes().isEmpty()) {
                        k7.writeString(h0Var, 1, this.name_);
                    }
                    double d10 = this.value_;
                    if (d10 != 0.0d) {
                        h0Var.writeDouble(2, d10);
                    }
                    this.unknownFields.writeTo(h0Var);
                }

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public static final class Builder extends o6 implements MeasureOrBuilder {
                    private Object name_;
                    private double value_;

                    private Builder() {
                        super(null);
                        this.name_ = "";
                        maybeForceBuilderInitialization();
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_descriptor;
                    }

                    private void maybeForceBuilderInitialization() {
                        boolean unused = k7.alwaysUseFieldBuilders;
                    }

                    public Builder clearName() {
                        this.name_ = Measure.getDefaultInstance().getName();
                        onChanged();
                        return this;
                    }

                    public Builder clearValue() {
                        this.value_ = 0.0d;
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_descriptor;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
                    public String getName() {
                        Object obj = this.name_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.name_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
                    public ByteString getNameBytes() {
                        Object obj = this.name_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.name_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
                    public double getValue() {
                        return this.value_;
                    }

                    @Override // com.explorestack.protobuf.o6
                    public i7 internalGetFieldAccessorTable() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_fieldAccessorTable.ensureFieldAccessorsInitialized(Measure.class, Builder.class);
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

                    public Builder setValue(double d10) {
                        this.value_ = d10;
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                    public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Measure build() {
                        Measure measureBuildPartial = buildPartial();
                        if (measureBuildPartial.isInitialized()) {
                            return measureBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) measureBuildPartial);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Measure buildPartial() {
                        Measure measure = new Measure(this);
                        measure.name_ = this.name_;
                        measure.value_ = this.value_;
                        onBuilt();
                        return measure;
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    public Measure getDefaultInstanceForType() {
                        return Measure.getDefaultInstance();
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
                        this.value_ = 0.0d;
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
                        if (message instanceof Measure) {
                            return mergeFrom((Measure) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    public Builder mergeFrom(Measure measure) {
                        if (measure == Measure.getDefaultInstance()) {
                            return this;
                        }
                        if (!measure.getName().isEmpty()) {
                            this.name_ = measure.name_;
                            onChanged();
                        }
                        if (measure.getValue() != 0.0d) {
                            setValue(measure.getValue());
                        }
                        mergeUnknownFields(((k7) measure).unknownFields);
                        onChanged();
                        return this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Measure.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Measure.access$1800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Measure r3 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Measure) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                            io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Measure r4 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Measure) r4     // Catch: java.lang.Throwable -> L11
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
                        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Measure.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Measure$Builder");
                    }
                }

                public static Builder newBuilder(Measure measure) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(measure);
                }

                public static Measure parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                    return (Measure) PARSER.parseFrom(byteBuffer, m5Var);
                }

                private Measure(o6 o6Var) {
                    super(o6Var);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static Measure parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                    return (Measure) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
                }

                public static Measure parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (Measure) PARSER.parseFrom(byteString);
                }

                @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public Measure getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static Measure parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                    return (Measure) PARSER.parseFrom(byteString, m5Var);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private Measure() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.name_ = "";
                }

                public static Measure parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (Measure) PARSER.parseFrom(bArr);
                }

                @Override // com.explorestack.protobuf.k7
                public Builder newBuilderForType(p6 p6Var) {
                    return new Builder(p6Var);
                }

                public static Measure parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                    return (Measure) PARSER.parseFrom(bArr, m5Var);
                }

                public static Measure parseFrom(InputStream inputStream) throws IOException {
                    return (Measure) k7.parseWithIOException(PARSER, inputStream);
                }

                private Measure(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                    } else if (tag != 17) {
                                        if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                        }
                                    } else {
                                        this.value_ = yVar.readDouble();
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

                public static Measure parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                    return (Measure) k7.parseWithIOException(PARSER, inputStream, m5Var);
                }

                public static Measure parseFrom(y yVar) throws IOException {
                    return (Measure) k7.parseWithIOException(PARSER, yVar);
                }

                public static Measure parseFrom(y yVar, m5 m5Var) throws IOException {
                    return (Measure) k7.parseWithIOException(PARSER, yVar, m5Var);
                }
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public interface MeasureOrBuilder extends MessageOrBuilder {
                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ MessageLite getDefaultInstanceForType();

                String getName();

                ByteString getNameBytes();

                double getValue();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            public static MetricData getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static MetricData parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (MetricData) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static MetricData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (MetricData) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof MetricData)) {
                    return super.equals(obj);
                }
                MetricData metricData = (MetricData) obj;
                if (!getTimestamp().equals(metricData.getTimestamp()) || !getName().equals(metricData.getName()) || !getDimensionsList().equals(metricData.getDimensionsList()) || !getMeasuresList().equals(metricData.getMeasuresList()) || hasError() != metricData.hasError()) {
                    return false;
                }
                if ((!hasError() || getError().equals(metricData.getError())) && hasTs() == metricData.hasTs()) {
                    return (!hasTs() || getTs().equals(metricData.getTs())) && this.unknownFields.equals(metricData.unknownFields);
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public Dimension getDimensions(int i10) {
                return this.dimensions_.get(i10);
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public int getDimensionsCount() {
                return this.dimensions_.size();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public List<Dimension> getDimensionsList() {
                return this.dimensions_;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public DimensionOrBuilder getDimensionsOrBuilder(int i10) {
                return this.dimensions_.get(i10);
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public List<? extends DimensionOrBuilder> getDimensionsOrBuilderList() {
                return this.dimensions_;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public Error getError() {
                Error error = this.error_;
                return error == null ? Error.getDefaultInstance() : error;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public ErrorOrBuilder getErrorOrBuilder() {
                return getError();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public Measure getMeasures(int i10) {
                return this.measures_.get(i10);
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public int getMeasuresCount() {
                return this.measures_.size();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public List<Measure> getMeasuresList() {
                return this.measures_;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public MeasureOrBuilder getMeasuresOrBuilder(int i10) {
                return this.measures_.get(i10);
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public List<? extends MeasureOrBuilder> getMeasuresOrBuilderList() {
                return this.measures_;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
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
                int iComputeStringSize = !getTimestampBytes().isEmpty() ? k7.computeStringSize(1, this.timestamp_) : 0;
                if (!getNameBytes().isEmpty()) {
                    iComputeStringSize += k7.computeStringSize(2, this.name_);
                }
                for (int i11 = 0; i11 < this.dimensions_.size(); i11++) {
                    iComputeStringSize += h0.computeMessageSize(3, this.dimensions_.get(i11));
                }
                for (int i12 = 0; i12 < this.measures_.size(); i12++) {
                    iComputeStringSize += h0.computeMessageSize(4, this.measures_.get(i12));
                }
                if (this.error_ != null) {
                    iComputeStringSize += h0.computeMessageSize(5, getError());
                }
                if (this.ts_ != null) {
                    iComputeStringSize += h0.computeMessageSize(6, getTs());
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            @Deprecated
            public String getTimestamp() {
                Object obj = this.timestamp_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.timestamp_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            @Deprecated
            public ByteString getTimestampBytes() {
                Object obj = this.timestamp_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.timestamp_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public Timestamp getTs() {
                Timestamp timestamp = this.ts_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public sb getTsOrBuilder() {
                return getTs();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
            public final gc getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public boolean hasError() {
                return this.error_ != null;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public boolean hasTs() {
                return this.ts_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = getName().hashCode() + ((((getTimestamp().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
                if (getDimensionsCount() > 0) {
                    iHashCode = o2.B(iHashCode, 37, 3, 53) + getDimensionsList().hashCode();
                }
                if (getMeasuresCount() > 0) {
                    iHashCode = o2.B(iHashCode, 37, 4, 53) + getMeasuresList().hashCode();
                }
                if (hasError()) {
                    iHashCode = o2.B(iHashCode, 37, 5, 53) + getError().hashCode();
                }
                if (hasTs()) {
                    iHashCode = o2.B(iHashCode, 37, 6, 53) + getTs().hashCode();
                }
                int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.k7
            public i7 internalGetFieldAccessorTable() {
                return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_fieldAccessorTable.ensureFieldAccessorsInitialized(MetricData.class, Builder.class);
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
                return new MetricData();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                if (!getTimestampBytes().isEmpty()) {
                    k7.writeString(h0Var, 1, this.timestamp_);
                }
                if (!getNameBytes().isEmpty()) {
                    k7.writeString(h0Var, 2, this.name_);
                }
                for (int i10 = 0; i10 < this.dimensions_.size(); i10++) {
                    h0Var.writeMessage(3, this.dimensions_.get(i10));
                }
                for (int i11 = 0; i11 < this.measures_.size(); i11++) {
                    h0Var.writeMessage(4, this.measures_.get(i11));
                }
                if (this.error_ != null) {
                    h0Var.writeMessage(5, getError());
                }
                if (this.ts_ != null) {
                    h0Var.writeMessage(6, getTs());
                }
                this.unknownFields.writeTo(h0Var);
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends o6 implements MetricDataOrBuilder {
                private int bitField0_;
                private pa dimensionsBuilder_;
                private List<Dimension> dimensions_;
                private xa errorBuilder_;
                private Error error_;
                private pa measuresBuilder_;
                private List<Measure> measures_;
                private Object name_;
                private Object timestamp_;
                private xa tsBuilder_;
                private Timestamp ts_;

                private Builder() {
                    super(null);
                    this.timestamp_ = "";
                    this.name_ = "";
                    List list = Collections.EMPTY_LIST;
                    this.dimensions_ = list;
                    this.measures_ = list;
                    maybeForceBuilderInitialization();
                }

                private void ensureDimensionsIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.dimensions_ = new ArrayList(this.dimensions_);
                        this.bitField0_ |= 1;
                    }
                }

                private void ensureMeasuresIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.measures_ = new ArrayList(this.measures_);
                        this.bitField0_ |= 2;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_descriptor;
                }

                private pa getDimensionsFieldBuilder() {
                    if (this.dimensionsBuilder_ == null) {
                        this.dimensionsBuilder_ = new pa(this.dimensions_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.dimensions_ = null;
                    }
                    return this.dimensionsBuilder_;
                }

                private xa getErrorFieldBuilder() {
                    if (this.errorBuilder_ == null) {
                        this.errorBuilder_ = new xa(getError(), getParentForChildren(), isClean());
                        this.error_ = null;
                    }
                    return this.errorBuilder_;
                }

                private pa getMeasuresFieldBuilder() {
                    if (this.measuresBuilder_ == null) {
                        this.measuresBuilder_ = new pa(this.measures_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                        this.measures_ = null;
                    }
                    return this.measuresBuilder_;
                }

                private xa getTsFieldBuilder() {
                    if (this.tsBuilder_ == null) {
                        this.tsBuilder_ = new xa(getTs(), getParentForChildren(), isClean());
                        this.ts_ = null;
                    }
                    return this.tsBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (k7.alwaysUseFieldBuilders) {
                        getDimensionsFieldBuilder();
                        getMeasuresFieldBuilder();
                    }
                }

                public Builder addAllDimensions(Iterable<? extends Dimension> iterable) {
                    pa paVar = this.dimensionsBuilder_;
                    if (paVar != null) {
                        paVar.addAllMessages(iterable);
                        return this;
                    }
                    ensureDimensionsIsMutable();
                    b.a.addAll((Iterable) iterable, (List) this.dimensions_);
                    onChanged();
                    return this;
                }

                public Builder addAllMeasures(Iterable<? extends Measure> iterable) {
                    pa paVar = this.measuresBuilder_;
                    if (paVar != null) {
                        paVar.addAllMessages(iterable);
                        return this;
                    }
                    ensureMeasuresIsMutable();
                    b.a.addAll((Iterable) iterable, (List) this.measures_);
                    onChanged();
                    return this;
                }

                public Builder addDimensions(Dimension dimension) {
                    pa paVar = this.dimensionsBuilder_;
                    if (paVar != null) {
                        paVar.addMessage(dimension);
                        return this;
                    }
                    dimension.getClass();
                    ensureDimensionsIsMutable();
                    this.dimensions_.add(dimension);
                    onChanged();
                    return this;
                }

                public Dimension.Builder addDimensionsBuilder() {
                    return (Dimension.Builder) getDimensionsFieldBuilder().addBuilder(Dimension.getDefaultInstance());
                }

                public Builder addMeasures(Measure measure) {
                    pa paVar = this.measuresBuilder_;
                    if (paVar != null) {
                        paVar.addMessage(measure);
                        return this;
                    }
                    measure.getClass();
                    ensureMeasuresIsMutable();
                    this.measures_.add(measure);
                    onChanged();
                    return this;
                }

                public Measure.Builder addMeasuresBuilder() {
                    return (Measure.Builder) getMeasuresFieldBuilder().addBuilder(Measure.getDefaultInstance());
                }

                public Builder clearDimensions() {
                    pa paVar = this.dimensionsBuilder_;
                    if (paVar != null) {
                        paVar.clear();
                        return this;
                    }
                    this.dimensions_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
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

                public Builder clearMeasures() {
                    pa paVar = this.measuresBuilder_;
                    if (paVar != null) {
                        paVar.clear();
                        return this;
                    }
                    this.measures_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                public Builder clearName() {
                    this.name_ = MetricData.getDefaultInstance().getName();
                    onChanged();
                    return this;
                }

                @Deprecated
                public Builder clearTimestamp() {
                    this.timestamp_ = MetricData.getDefaultInstance().getTimestamp();
                    onChanged();
                    return this;
                }

                public Builder clearTs() {
                    if (this.tsBuilder_ == null) {
                        this.ts_ = null;
                        onChanged();
                        return this;
                    }
                    this.ts_ = null;
                    this.tsBuilder_ = null;
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_descriptor;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public Dimension getDimensions(int i10) {
                    pa paVar = this.dimensionsBuilder_;
                    return paVar == null ? this.dimensions_.get(i10) : (Dimension) paVar.getMessage(i10);
                }

                public Dimension.Builder getDimensionsBuilder(int i10) {
                    return (Dimension.Builder) getDimensionsFieldBuilder().getBuilder(i10);
                }

                public List<Dimension.Builder> getDimensionsBuilderList() {
                    return getDimensionsFieldBuilder().getBuilderList();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public int getDimensionsCount() {
                    pa paVar = this.dimensionsBuilder_;
                    return paVar == null ? this.dimensions_.size() : paVar.getCount();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public List<Dimension> getDimensionsList() {
                    pa paVar = this.dimensionsBuilder_;
                    return paVar == null ? Collections.unmodifiableList(this.dimensions_) : paVar.getMessageList();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public DimensionOrBuilder getDimensionsOrBuilder(int i10) {
                    pa paVar = this.dimensionsBuilder_;
                    return paVar == null ? this.dimensions_.get(i10) : (DimensionOrBuilder) paVar.getMessageOrBuilder(i10);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public List<? extends DimensionOrBuilder> getDimensionsOrBuilderList() {
                    pa paVar = this.dimensionsBuilder_;
                    return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.dimensions_);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
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

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public ErrorOrBuilder getErrorOrBuilder() {
                    xa xaVar = this.errorBuilder_;
                    if (xaVar != null) {
                        return (ErrorOrBuilder) xaVar.getMessageOrBuilder();
                    }
                    Error error = this.error_;
                    return error == null ? Error.getDefaultInstance() : error;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public Measure getMeasures(int i10) {
                    pa paVar = this.measuresBuilder_;
                    return paVar == null ? this.measures_.get(i10) : (Measure) paVar.getMessage(i10);
                }

                public Measure.Builder getMeasuresBuilder(int i10) {
                    return (Measure.Builder) getMeasuresFieldBuilder().getBuilder(i10);
                }

                public List<Measure.Builder> getMeasuresBuilderList() {
                    return getMeasuresFieldBuilder().getBuilderList();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public int getMeasuresCount() {
                    pa paVar = this.measuresBuilder_;
                    return paVar == null ? this.measures_.size() : paVar.getCount();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public List<Measure> getMeasuresList() {
                    pa paVar = this.measuresBuilder_;
                    return paVar == null ? Collections.unmodifiableList(this.measures_) : paVar.getMessageList();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public MeasureOrBuilder getMeasuresOrBuilder(int i10) {
                    pa paVar = this.measuresBuilder_;
                    return paVar == null ? this.measures_.get(i10) : (MeasureOrBuilder) paVar.getMessageOrBuilder(i10);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public List<? extends MeasureOrBuilder> getMeasuresOrBuilderList() {
                    pa paVar = this.measuresBuilder_;
                    return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.measures_);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public ByteString getNameBytes() {
                    Object obj = this.name_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.name_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                @Deprecated
                public String getTimestamp() {
                    Object obj = this.timestamp_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.timestamp_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                @Deprecated
                public ByteString getTimestampBytes() {
                    Object obj = this.timestamp_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.timestamp_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public Timestamp getTs() {
                    xa xaVar = this.tsBuilder_;
                    if (xaVar != null) {
                        return (Timestamp) xaVar.getMessage();
                    }
                    Timestamp timestamp = this.ts_;
                    return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
                }

                public Timestamp.Builder getTsBuilder() {
                    onChanged();
                    return (Timestamp.Builder) getTsFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public sb getTsOrBuilder() {
                    xa xaVar = this.tsBuilder_;
                    if (xaVar != null) {
                        return (sb) xaVar.getMessageOrBuilder();
                    }
                    Timestamp timestamp = this.ts_;
                    return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public boolean hasError() {
                    return (this.errorBuilder_ == null && this.error_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public boolean hasTs() {
                    return (this.tsBuilder_ == null && this.ts_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_fieldAccessorTable.ensureFieldAccessorsInitialized(MetricData.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
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

                public Builder mergeTs(Timestamp timestamp) {
                    xa xaVar = this.tsBuilder_;
                    if (xaVar != null) {
                        xaVar.mergeFrom(timestamp);
                        return this;
                    }
                    Timestamp timestamp2 = this.ts_;
                    if (timestamp2 != null) {
                        this.ts_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                    } else {
                        this.ts_ = timestamp;
                    }
                    onChanged();
                    return this;
                }

                public Builder removeDimensions(int i10) {
                    pa paVar = this.dimensionsBuilder_;
                    if (paVar != null) {
                        paVar.remove(i10);
                        return this;
                    }
                    ensureDimensionsIsMutable();
                    this.dimensions_.remove(i10);
                    onChanged();
                    return this;
                }

                public Builder removeMeasures(int i10) {
                    pa paVar = this.measuresBuilder_;
                    if (paVar != null) {
                        paVar.remove(i10);
                        return this;
                    }
                    ensureMeasuresIsMutable();
                    this.measures_.remove(i10);
                    onChanged();
                    return this;
                }

                public Builder setDimensions(int i10, Dimension dimension) {
                    pa paVar = this.dimensionsBuilder_;
                    if (paVar != null) {
                        paVar.setMessage(i10, dimension);
                        return this;
                    }
                    dimension.getClass();
                    ensureDimensionsIsMutable();
                    this.dimensions_.set(i10, dimension);
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

                public Builder setMeasures(int i10, Measure measure) {
                    pa paVar = this.measuresBuilder_;
                    if (paVar != null) {
                        paVar.setMessage(i10, measure);
                        return this;
                    }
                    measure.getClass();
                    ensureMeasuresIsMutable();
                    this.measures_.set(i10, measure);
                    onChanged();
                    return this;
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

                @Deprecated
                public Builder setTimestamp(String str) {
                    str.getClass();
                    this.timestamp_ = str;
                    onChanged();
                    return this;
                }

                @Deprecated
                public Builder setTimestampBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    b.checkByteStringIsUtf8(byteString);
                    this.timestamp_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setTs(Timestamp timestamp) {
                    xa xaVar = this.tsBuilder_;
                    if (xaVar != null) {
                        xaVar.setMessage(timestamp);
                        return this;
                    }
                    timestamp.getClass();
                    this.ts_ = timestamp;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public MetricData build() {
                    MetricData metricDataBuildPartial = buildPartial();
                    if (metricDataBuildPartial.isInitialized()) {
                        return metricDataBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) metricDataBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public MetricData buildPartial() {
                    MetricData metricData = new MetricData(this);
                    metricData.timestamp_ = this.timestamp_;
                    metricData.name_ = this.name_;
                    pa paVar = this.dimensionsBuilder_;
                    if (paVar != null) {
                        metricData.dimensions_ = paVar.build();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.dimensions_ = Collections.unmodifiableList(this.dimensions_);
                            this.bitField0_ &= -2;
                        }
                        metricData.dimensions_ = this.dimensions_;
                    }
                    pa paVar2 = this.measuresBuilder_;
                    if (paVar2 != null) {
                        metricData.measures_ = paVar2.build();
                    } else {
                        if ((this.bitField0_ & 2) != 0) {
                            this.measures_ = Collections.unmodifiableList(this.measures_);
                            this.bitField0_ &= -3;
                        }
                        metricData.measures_ = this.measures_;
                    }
                    xa xaVar = this.errorBuilder_;
                    if (xaVar == null) {
                        metricData.error_ = this.error_;
                    } else {
                        metricData.error_ = (Error) xaVar.build();
                    }
                    xa xaVar2 = this.tsBuilder_;
                    if (xaVar2 == null) {
                        metricData.ts_ = this.ts_;
                    } else {
                        metricData.ts_ = (Timestamp) xaVar2.build();
                    }
                    onBuilt();
                    return metricData;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public MetricData getDefaultInstanceForType() {
                    return MetricData.getDefaultInstance();
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

                public Dimension.Builder addDimensionsBuilder(int i10) {
                    return (Dimension.Builder) getDimensionsFieldBuilder().addBuilder(i10, Dimension.getDefaultInstance());
                }

                public Measure.Builder addMeasuresBuilder(int i10) {
                    return (Measure.Builder) getMeasuresFieldBuilder().addBuilder(i10, Measure.getDefaultInstance());
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
                    this.timestamp_ = "";
                    this.name_ = "";
                    pa paVar = this.dimensionsBuilder_;
                    if (paVar == null) {
                        this.dimensions_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -2;
                    } else {
                        paVar.clear();
                    }
                    pa paVar2 = this.measuresBuilder_;
                    if (paVar2 == null) {
                        this.measures_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -3;
                    } else {
                        paVar2.clear();
                    }
                    if (this.errorBuilder_ == null) {
                        this.error_ = null;
                    } else {
                        this.error_ = null;
                        this.errorBuilder_ = null;
                    }
                    if (this.tsBuilder_ == null) {
                        this.ts_ = null;
                        return this;
                    }
                    this.ts_ = null;
                    this.tsBuilder_ = null;
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

                public Builder setTs(Timestamp.Builder builder) {
                    xa xaVar = this.tsBuilder_;
                    if (xaVar == null) {
                        this.ts_ = builder.build();
                        onChanged();
                        return this;
                    }
                    xaVar.setMessage(builder.build());
                    return this;
                }

                public Builder addDimensions(int i10, Dimension dimension) {
                    pa paVar = this.dimensionsBuilder_;
                    if (paVar == null) {
                        dimension.getClass();
                        ensureDimensionsIsMutable();
                        this.dimensions_.add(i10, dimension);
                        onChanged();
                        return this;
                    }
                    paVar.addMessage(i10, dimension);
                    return this;
                }

                public Builder addMeasures(int i10, Measure measure) {
                    pa paVar = this.measuresBuilder_;
                    if (paVar == null) {
                        measure.getClass();
                        ensureMeasuresIsMutable();
                        this.measures_.add(i10, measure);
                        onChanged();
                        return this;
                    }
                    paVar.addMessage(i10, measure);
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
                /* renamed from: clone */
                public Builder mo500clone() {
                    return (Builder) super.mo500clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof MetricData) {
                        return mergeFrom((MetricData) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setDimensions(int i10, Dimension.Builder builder) {
                    pa paVar = this.dimensionsBuilder_;
                    if (paVar == null) {
                        ensureDimensionsIsMutable();
                        this.dimensions_.set(i10, builder.build());
                        onChanged();
                        return this;
                    }
                    paVar.setMessage(i10, builder.build());
                    return this;
                }

                public Builder setMeasures(int i10, Measure.Builder builder) {
                    pa paVar = this.measuresBuilder_;
                    if (paVar == null) {
                        ensureMeasuresIsMutable();
                        this.measures_.set(i10, builder.build());
                        onChanged();
                        return this;
                    }
                    paVar.setMessage(i10, builder.build());
                    return this;
                }

                private Builder(p6 p6Var) {
                    super(p6Var);
                    this.timestamp_ = "";
                    this.name_ = "";
                    List list = Collections.EMPTY_LIST;
                    this.dimensions_ = list;
                    this.measures_ = list;
                    maybeForceBuilderInitialization();
                }

                public Builder mergeFrom(MetricData metricData) {
                    if (metricData == MetricData.getDefaultInstance()) {
                        return this;
                    }
                    if (!metricData.getTimestamp().isEmpty()) {
                        this.timestamp_ = metricData.timestamp_;
                        onChanged();
                    }
                    if (!metricData.getName().isEmpty()) {
                        this.name_ = metricData.name_;
                        onChanged();
                    }
                    if (this.dimensionsBuilder_ == null) {
                        if (!metricData.dimensions_.isEmpty()) {
                            if (this.dimensions_.isEmpty()) {
                                this.dimensions_ = metricData.dimensions_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureDimensionsIsMutable();
                                this.dimensions_.addAll(metricData.dimensions_);
                            }
                            onChanged();
                        }
                    } else if (!metricData.dimensions_.isEmpty()) {
                        if (!this.dimensionsBuilder_.isEmpty()) {
                            this.dimensionsBuilder_.addAllMessages(metricData.dimensions_);
                        } else {
                            this.dimensionsBuilder_.dispose();
                            this.dimensionsBuilder_ = null;
                            this.dimensions_ = metricData.dimensions_;
                            this.bitField0_ &= -2;
                            this.dimensionsBuilder_ = k7.alwaysUseFieldBuilders ? getDimensionsFieldBuilder() : null;
                        }
                    }
                    if (this.measuresBuilder_ == null) {
                        if (!metricData.measures_.isEmpty()) {
                            if (this.measures_.isEmpty()) {
                                this.measures_ = metricData.measures_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureMeasuresIsMutable();
                                this.measures_.addAll(metricData.measures_);
                            }
                            onChanged();
                        }
                    } else if (!metricData.measures_.isEmpty()) {
                        if (!this.measuresBuilder_.isEmpty()) {
                            this.measuresBuilder_.addAllMessages(metricData.measures_);
                        } else {
                            this.measuresBuilder_.dispose();
                            this.measuresBuilder_ = null;
                            this.measures_ = metricData.measures_;
                            this.bitField0_ &= -3;
                            this.measuresBuilder_ = k7.alwaysUseFieldBuilders ? getMeasuresFieldBuilder() : null;
                        }
                    }
                    if (metricData.hasError()) {
                        mergeError(metricData.getError());
                    }
                    if (metricData.hasTs()) {
                        mergeTs(metricData.getTs());
                    }
                    mergeUnknownFields(((k7) metricData).unknownFields);
                    onChanged();
                    return this;
                }

                public Builder addDimensions(Dimension.Builder builder) {
                    pa paVar = this.dimensionsBuilder_;
                    if (paVar == null) {
                        ensureDimensionsIsMutable();
                        this.dimensions_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    paVar.addMessage(builder.build());
                    return this;
                }

                public Builder addMeasures(Measure.Builder builder) {
                    pa paVar = this.measuresBuilder_;
                    if (paVar == null) {
                        ensureMeasuresIsMutable();
                        this.measures_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    paVar.addMessage(builder.build());
                    return this;
                }

                public Builder addDimensions(int i10, Dimension.Builder builder) {
                    pa paVar = this.dimensionsBuilder_;
                    if (paVar == null) {
                        ensureDimensionsIsMutable();
                        this.dimensions_.add(i10, builder.build());
                        onChanged();
                        return this;
                    }
                    paVar.addMessage(i10, builder.build());
                    return this;
                }

                public Builder addMeasures(int i10, Measure.Builder builder) {
                    pa paVar = this.measuresBuilder_;
                    if (paVar == null) {
                        ensureMeasuresIsMutable();
                        this.measures_.add(i10, builder.build());
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
                public io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.access$4500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData r3 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData r4 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Builder");
                }
            }

            public static Builder newBuilder(MetricData metricData) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(metricData);
            }

            public static MetricData parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (MetricData) PARSER.parseFrom(byteBuffer, m5Var);
            }

            private MetricData(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static MetricData parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (MetricData) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static MetricData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (MetricData) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public MetricData getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static MetricData parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (MetricData) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private MetricData() {
                this.memoizedIsInitialized = (byte) -1;
                this.timestamp_ = "";
                this.name_ = "";
                List list = Collections.EMPTY_LIST;
                this.dimensions_ = list;
                this.measures_ = list;
            }

            public static MetricData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (MetricData) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static MetricData parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (MetricData) PARSER.parseFrom(bArr, m5Var);
            }

            public static MetricData parseFrom(InputStream inputStream) throws IOException {
                return (MetricData) k7.parseWithIOException(PARSER, inputStream);
            }

            public static MetricData parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (MetricData) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v4 */
            /* JADX WARN: Type inference failed for: r2v6 */
            private MetricData(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                this();
                m5Var.getClass();
                cc ccVarNewBuilder = gc.newBuilder();
                boolean z10 = false;
                char c10 = 0;
                while (!z10) {
                    try {
                        try {
                            int tag = yVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.timestamp_ = yVar.readStringRequireUtf8();
                                } else if (tag == 18) {
                                    this.name_ = yVar.readStringRequireUtf8();
                                } else if (tag == 26) {
                                    int i10 = (c10 == true ? 1 : 0) & 1;
                                    c10 = c10;
                                    if (i10 == 0) {
                                        this.dimensions_ = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 1;
                                    }
                                    this.dimensions_.add(yVar.readMessage(Dimension.parser(), m5Var));
                                } else if (tag != 34) {
                                    if (tag == 42) {
                                        Error error = this.error_;
                                        Error.Builder builder = error != null ? error.toBuilder() : null;
                                        Error error2 = (Error) yVar.readMessage(Error.parser(), m5Var);
                                        this.error_ = error2;
                                        if (builder != null) {
                                            builder.mergeFrom(error2);
                                            this.error_ = builder.buildPartial();
                                        }
                                    } else if (tag != 50) {
                                        if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                        }
                                    } else {
                                        Timestamp timestamp = this.ts_;
                                        Timestamp.Builder builder2 = timestamp != null ? timestamp.toBuilder() : null;
                                        Timestamp timestamp2 = (Timestamp) yVar.readMessage(Timestamp.parser(), m5Var);
                                        this.ts_ = timestamp2;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(timestamp2);
                                            this.ts_ = builder2.buildPartial();
                                        }
                                    }
                                } else {
                                    int i11 = (c10 == true ? 1 : 0) & 2;
                                    c10 = c10;
                                    if (i11 == 0) {
                                        this.measures_ = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 2;
                                    }
                                    this.measures_.add(yVar.readMessage(Measure.parser(), m5Var));
                                }
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(this);
                        } catch (IOException e11) {
                            throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th2) {
                        if (((c10 == true ? 1 : 0) & 1) != 0) {
                            this.dimensions_ = Collections.unmodifiableList(this.dimensions_);
                        }
                        if (((c10 == true ? 1 : 0) & 2) != 0) {
                            this.measures_ = Collections.unmodifiableList(this.measures_);
                        }
                        this.unknownFields = ccVarNewBuilder.build();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                if (((c10 == true ? 1 : 0) & 1) != 0) {
                    this.dimensions_ = Collections.unmodifiableList(this.dimensions_);
                }
                if (((c10 == true ? 1 : 0) & 2) != 0) {
                    this.measures_ = Collections.unmodifiableList(this.measures_);
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
            }

            public static MetricData parseFrom(y yVar) throws IOException {
                return (MetricData) k7.parseWithIOException(PARSER, yVar);
            }

            public static MetricData parseFrom(y yVar, m5 m5Var) throws IOException {
                return (MetricData) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface MetricDataOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            MetricData.Dimension getDimensions(int i10);

            int getDimensionsCount();

            List<MetricData.Dimension> getDimensionsList();

            MetricData.DimensionOrBuilder getDimensionsOrBuilder(int i10);

            List<? extends MetricData.DimensionOrBuilder> getDimensionsOrBuilderList();

            MetricData.Error getError();

            MetricData.ErrorOrBuilder getErrorOrBuilder();

            MetricData.Measure getMeasures(int i10);

            int getMeasuresCount();

            List<MetricData.Measure> getMeasuresList();

            MetricData.MeasureOrBuilder getMeasuresOrBuilder(int i10);

            List<? extends MetricData.MeasureOrBuilder> getMeasuresOrBuilderList();

            String getName();

            ByteString getNameBytes();

            @Deprecated
            String getTimestamp();

            @Deprecated
            ByteString getTimestampBytes();

            Timestamp getTs();

            sb getTsOrBuilder();

            boolean hasError();

            boolean hasTs();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static Metric getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Metric parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Metric) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Metric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Metric) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Metric)) {
                return super.equals(obj);
            }
            Metric metric2 = (Metric) obj;
            return getContext().equals(metric2.getContext()) && getDataList().equals(metric2.getDataList()) && this.unknownFields.equals(metric2.unknownFields);
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public String getContext() {
            Object obj = this.context_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.context_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public ByteString getContextBytes() {
            Object obj = this.context_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.context_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public MetricData getData(int i10) {
            return this.data_.get(i10);
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public int getDataCount() {
            return this.data_.size();
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public List<MetricData> getDataList() {
            return this.data_;
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public MetricDataOrBuilder getDataOrBuilder(int i10) {
            return this.data_.get(i10);
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public List<? extends MetricDataOrBuilder> getDataOrBuilderList() {
            return this.data_;
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
            int iComputeStringSize = !getContextBytes().isEmpty() ? k7.computeStringSize(1, this.context_) : 0;
            for (int i11 = 0; i11 < this.data_.size(); i11++) {
                iComputeStringSize += h0.computeMessageSize(2, this.data_.get(i11));
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
            int iHashCode = getContext().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
            if (getDataCount() > 0) {
                iHashCode = getDataList().hashCode() + o2.B(iHashCode, 37, 2, 53);
            }
            int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_fieldAccessorTable.ensureFieldAccessorsInitialized(Metric.class, Builder.class);
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
            return new Metric();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            if (!getContextBytes().isEmpty()) {
                k7.writeString(h0Var, 1, this.context_);
            }
            for (int i10 = 0; i10 < this.data_.size(); i10++) {
                h0Var.writeMessage(2, this.data_.get(i10));
            }
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements MetricOrBuilder {
            private int bitField0_;
            private Object context_;
            private pa dataBuilder_;
            private List<MetricData> data_;

            private Builder() {
                super(null);
                this.context_ = "";
                this.data_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private void ensureDataIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.data_ = new ArrayList(this.data_);
                    this.bitField0_ |= 1;
                }
            }

            private pa getDataFieldBuilder() {
                if (this.dataBuilder_ == null) {
                    this.dataBuilder_ = new pa(this.data_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.data_ = null;
                }
                return this.dataBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (k7.alwaysUseFieldBuilders) {
                    getDataFieldBuilder();
                }
            }

            public Builder addAllData(Iterable<? extends MetricData> iterable) {
                pa paVar = this.dataBuilder_;
                if (paVar != null) {
                    paVar.addAllMessages(iterable);
                    return this;
                }
                ensureDataIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.data_);
                onChanged();
                return this;
            }

            public Builder addData(MetricData metricData) {
                pa paVar = this.dataBuilder_;
                if (paVar != null) {
                    paVar.addMessage(metricData);
                    return this;
                }
                metricData.getClass();
                ensureDataIsMutable();
                this.data_.add(metricData);
                onChanged();
                return this;
            }

            public MetricData.Builder addDataBuilder() {
                return (MetricData.Builder) getDataFieldBuilder().addBuilder(MetricData.getDefaultInstance());
            }

            public Builder clearContext() {
                this.context_ = Metric.getDefaultInstance().getContext();
                onChanged();
                return this;
            }

            public Builder clearData() {
                pa paVar = this.dataBuilder_;
                if (paVar != null) {
                    paVar.clear();
                    return this;
                }
                this.data_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public String getContext() {
                Object obj = this.context_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.context_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public ByteString getContextBytes() {
                Object obj = this.context_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.context_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public MetricData getData(int i10) {
                pa paVar = this.dataBuilder_;
                return paVar == null ? this.data_.get(i10) : (MetricData) paVar.getMessage(i10);
            }

            public MetricData.Builder getDataBuilder(int i10) {
                return (MetricData.Builder) getDataFieldBuilder().getBuilder(i10);
            }

            public List<MetricData.Builder> getDataBuilderList() {
                return getDataFieldBuilder().getBuilderList();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public int getDataCount() {
                pa paVar = this.dataBuilder_;
                return paVar == null ? this.data_.size() : paVar.getCount();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public List<MetricData> getDataList() {
                pa paVar = this.dataBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.data_) : paVar.getMessageList();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public MetricDataOrBuilder getDataOrBuilder(int i10) {
                pa paVar = this.dataBuilder_;
                return paVar == null ? this.data_.get(i10) : (MetricDataOrBuilder) paVar.getMessageOrBuilder(i10);
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public List<? extends MetricDataOrBuilder> getDataOrBuilderList() {
                pa paVar = this.dataBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.data_);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_descriptor;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_fieldAccessorTable.ensureFieldAccessorsInitialized(Metric.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder removeData(int i10) {
                pa paVar = this.dataBuilder_;
                if (paVar != null) {
                    paVar.remove(i10);
                    return this;
                }
                ensureDataIsMutable();
                this.data_.remove(i10);
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

            public Builder setData(int i10, MetricData metricData) {
                pa paVar = this.dataBuilder_;
                if (paVar != null) {
                    paVar.setMessage(i10, metricData);
                    return this;
                }
                metricData.getClass();
                ensureDataIsMutable();
                this.data_.set(i10, metricData);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Metric build() {
                Metric metricBuildPartial = buildPartial();
                if (metricBuildPartial.isInitialized()) {
                    return metricBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) metricBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Metric buildPartial() {
                Metric metric2 = new Metric(this);
                metric2.context_ = this.context_;
                pa paVar = this.dataBuilder_;
                if (paVar != null) {
                    metric2.data_ = paVar.build();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.data_ = Collections.unmodifiableList(this.data_);
                        this.bitField0_ &= -2;
                    }
                    metric2.data_ = this.data_;
                }
                onBuilt();
                return metric2;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Metric getDefaultInstanceForType() {
                return Metric.getDefaultInstance();
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

            public MetricData.Builder addDataBuilder(int i10) {
                return (MetricData.Builder) getDataFieldBuilder().addBuilder(i10, MetricData.getDefaultInstance());
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
                this.context_ = "";
                pa paVar = this.dataBuilder_;
                if (paVar == null) {
                    this.data_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    return this;
                }
                paVar.clear();
                return this;
            }

            private Builder(p6 p6Var) {
                super(p6Var);
                this.context_ = "";
                this.data_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder addData(int i10, MetricData metricData) {
                pa paVar = this.dataBuilder_;
                if (paVar == null) {
                    metricData.getClass();
                    ensureDataIsMutable();
                    this.data_.add(i10, metricData);
                    onChanged();
                    return this;
                }
                paVar.addMessage(i10, metricData);
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
            /* renamed from: clone */
            public Builder mo500clone() {
                return (Builder) super.mo500clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Metric) {
                    return mergeFrom((Metric) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setData(int i10, MetricData.Builder builder) {
                pa paVar = this.dataBuilder_;
                if (paVar == null) {
                    ensureDataIsMutable();
                    this.data_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                paVar.setMessage(i10, builder.build());
                return this;
            }

            public Builder mergeFrom(Metric metric2) {
                if (metric2 == Metric.getDefaultInstance()) {
                    return this;
                }
                if (!metric2.getContext().isEmpty()) {
                    this.context_ = metric2.context_;
                    onChanged();
                }
                if (this.dataBuilder_ == null) {
                    if (!metric2.data_.isEmpty()) {
                        if (this.data_.isEmpty()) {
                            this.data_ = metric2.data_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureDataIsMutable();
                            this.data_.addAll(metric2.data_);
                        }
                        onChanged();
                    }
                } else if (!metric2.data_.isEmpty()) {
                    if (!this.dataBuilder_.isEmpty()) {
                        this.dataBuilder_.addAllMessages(metric2.data_);
                    } else {
                        this.dataBuilder_.dispose();
                        this.dataBuilder_ = null;
                        this.data_ = metric2.data_;
                        this.bitField0_ &= -2;
                        this.dataBuilder_ = k7.alwaysUseFieldBuilders ? getDataFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((k7) metric2).unknownFields);
                onChanged();
                return this;
            }

            public Builder addData(MetricData.Builder builder) {
                pa paVar = this.dataBuilder_;
                if (paVar == null) {
                    ensureDataIsMutable();
                    this.data_.add(builder.build());
                    onChanged();
                    return this;
                }
                paVar.addMessage(builder.build());
                return this;
            }

            public Builder addData(int i10, MetricData.Builder builder) {
                pa paVar = this.dataBuilder_;
                if (paVar == null) {
                    ensureDataIsMutable();
                    this.data_.add(i10, builder.build());
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
            public io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.access$5700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric r3 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric r4 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$Builder");
            }
        }

        public static Builder newBuilder(Metric metric2) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(metric2);
        }

        public static Metric parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (Metric) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private Metric(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Metric parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Metric) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static Metric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Metric) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Metric getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Metric parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (Metric) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Metric() {
            this.memoizedIsInitialized = (byte) -1;
            this.context_ = "";
            this.data_ = Collections.EMPTY_LIST;
        }

        public static Metric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Metric) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static Metric parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (Metric) PARSER.parseFrom(bArr, m5Var);
        }

        public static Metric parseFrom(InputStream inputStream) throws IOException {
            return (Metric) k7.parseWithIOException(PARSER, inputStream);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Metric(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                this.context_ = yVar.readStringRequireUtf8();
                            } else if (tag != 18) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                if (!z11) {
                                    this.data_ = new ArrayList();
                                    z11 = true;
                                }
                                this.data_.add(yVar.readMessage(MetricData.parser(), m5Var));
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (z11) {
                        this.data_ = Collections.unmodifiableList(this.data_);
                    }
                    this.unknownFields = ccVarNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z11) {
                this.data_ = Collections.unmodifiableList(this.data_);
            }
            this.unknownFields = ccVarNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static Metric parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Metric) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static Metric parseFrom(y yVar) throws IOException {
            return (Metric) k7.parseWithIOException(PARSER, yVar);
        }

        public static Metric parseFrom(y yVar, m5 m5Var) throws IOException {
            return (Metric) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface MetricOrBuilder extends MessageOrBuilder {
        String getContext();

        ByteString getContextBytes();

        Metric.MetricData getData(int i10);

        int getDataCount();

        List<Metric.MetricData> getDataList();

        Metric.MetricDataOrBuilder getDataOrBuilder(int i10);

        List<? extends Metric.MetricDataOrBuilder> getDataOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static SDKAnalyticPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static SDKAnalyticPayload parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SDKAnalyticPayload) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SDKAnalyticPayload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SDKAnalyticPayload) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SDKAnalyticPayload)) {
            return super.equals(obj);
        }
        SDKAnalyticPayload sDKAnalyticPayload = (SDKAnalyticPayload) obj;
        return getMetricsList().equals(sDKAnalyticPayload.getMetricsList()) && this.unknownFields.equals(sDKAnalyticPayload.unknownFields);
    }

    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
    public Metric getMetrics(int i10) {
        return this.metrics_.get(i10);
    }

    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
    public int getMetricsCount() {
        return this.metrics_.size();
    }

    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
    public List<Metric> getMetricsList() {
        return this.metrics_;
    }

    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
    public MetricOrBuilder getMetricsOrBuilder(int i10) {
        return this.metrics_.get(i10);
    }

    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
    public List<? extends MetricOrBuilder> getMetricsOrBuilderList() {
        return this.metrics_;
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
        for (int i11 = 0; i11 < this.metrics_.size(); i11++) {
            iComputeMessageSize += h0.computeMessageSize(1, this.metrics_.get(i11));
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
        if (getMetricsCount() > 0) {
            iHashCode = o2.B(iHashCode, 37, 1, 53) + getMetricsList().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(SDKAnalyticPayload.class, Builder.class);
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
        return new SDKAnalyticPayload();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        for (int i10 = 0; i10 < this.metrics_.size(); i10++) {
            h0Var.writeMessage(1, this.metrics_.get(i10));
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements SDKAnalyticPayloadOrBuilder {
        private int bitField0_;
        private pa metricsBuilder_;
        private List<Metric> metrics_;

        private Builder() {
            super(null);
            this.metrics_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        private void ensureMetricsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.metrics_ = new ArrayList(this.metrics_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_descriptor;
        }

        private pa getMetricsFieldBuilder() {
            if (this.metricsBuilder_ == null) {
                this.metricsBuilder_ = new pa(this.metrics_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.metrics_ = null;
            }
            return this.metricsBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (k7.alwaysUseFieldBuilders) {
                getMetricsFieldBuilder();
            }
        }

        public Builder addAllMetrics(Iterable<? extends Metric> iterable) {
            pa paVar = this.metricsBuilder_;
            if (paVar != null) {
                paVar.addAllMessages(iterable);
                return this;
            }
            ensureMetricsIsMutable();
            b.a.addAll((Iterable) iterable, (List) this.metrics_);
            onChanged();
            return this;
        }

        public Builder addMetrics(Metric metric2) {
            pa paVar = this.metricsBuilder_;
            if (paVar != null) {
                paVar.addMessage(metric2);
                return this;
            }
            metric2.getClass();
            ensureMetricsIsMutable();
            this.metrics_.add(metric2);
            onChanged();
            return this;
        }

        public Metric.Builder addMetricsBuilder() {
            return (Metric.Builder) getMetricsFieldBuilder().addBuilder(Metric.getDefaultInstance());
        }

        public Builder clearMetrics() {
            pa paVar = this.metricsBuilder_;
            if (paVar != null) {
                paVar.clear();
                return this;
            }
            this.metrics_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_descriptor;
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
        public Metric getMetrics(int i10) {
            pa paVar = this.metricsBuilder_;
            return paVar == null ? this.metrics_.get(i10) : (Metric) paVar.getMessage(i10);
        }

        public Metric.Builder getMetricsBuilder(int i10) {
            return (Metric.Builder) getMetricsFieldBuilder().getBuilder(i10);
        }

        public List<Metric.Builder> getMetricsBuilderList() {
            return getMetricsFieldBuilder().getBuilderList();
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
        public int getMetricsCount() {
            pa paVar = this.metricsBuilder_;
            return paVar == null ? this.metrics_.size() : paVar.getCount();
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
        public List<Metric> getMetricsList() {
            pa paVar = this.metricsBuilder_;
            return paVar == null ? Collections.unmodifiableList(this.metrics_) : paVar.getMessageList();
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
        public MetricOrBuilder getMetricsOrBuilder(int i10) {
            pa paVar = this.metricsBuilder_;
            return paVar == null ? this.metrics_.get(i10) : (MetricOrBuilder) paVar.getMessageOrBuilder(i10);
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
        public List<? extends MetricOrBuilder> getMetricsOrBuilderList() {
            pa paVar = this.metricsBuilder_;
            return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.metrics_);
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(SDKAnalyticPayload.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder removeMetrics(int i10) {
            pa paVar = this.metricsBuilder_;
            if (paVar != null) {
                paVar.remove(i10);
                return this;
            }
            ensureMetricsIsMutable();
            this.metrics_.remove(i10);
            onChanged();
            return this;
        }

        public Builder setMetrics(int i10, Metric metric2) {
            pa paVar = this.metricsBuilder_;
            if (paVar != null) {
                paVar.setMessage(i10, metric2);
                return this;
            }
            metric2.getClass();
            ensureMetricsIsMutable();
            this.metrics_.set(i10, metric2);
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SDKAnalyticPayload build() {
            SDKAnalyticPayload sDKAnalyticPayloadBuildPartial = buildPartial();
            if (sDKAnalyticPayloadBuildPartial.isInitialized()) {
                return sDKAnalyticPayloadBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) sDKAnalyticPayloadBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SDKAnalyticPayload buildPartial() {
            SDKAnalyticPayload sDKAnalyticPayload = new SDKAnalyticPayload(this);
            int i10 = this.bitField0_;
            pa paVar = this.metricsBuilder_;
            if (paVar == null) {
                if ((i10 & 1) != 0) {
                    this.metrics_ = Collections.unmodifiableList(this.metrics_);
                    this.bitField0_ &= -2;
                }
                sDKAnalyticPayload.metrics_ = this.metrics_;
            } else {
                sDKAnalyticPayload.metrics_ = paVar.build();
            }
            onBuilt();
            return sDKAnalyticPayload;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public SDKAnalyticPayload getDefaultInstanceForType() {
            return SDKAnalyticPayload.getDefaultInstance();
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

        public Metric.Builder addMetricsBuilder(int i10) {
            return (Metric.Builder) getMetricsFieldBuilder().addBuilder(i10, Metric.getDefaultInstance());
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
            pa paVar = this.metricsBuilder_;
            if (paVar == null) {
                this.metrics_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                return this;
            }
            paVar.clear();
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            this.metrics_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public Builder addMetrics(int i10, Metric metric2) {
            pa paVar = this.metricsBuilder_;
            if (paVar == null) {
                metric2.getClass();
                ensureMetricsIsMutable();
                this.metrics_.add(i10, metric2);
                onChanged();
                return this;
            }
            paVar.addMessage(i10, metric2);
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
        /* renamed from: clone */
        public Builder mo500clone() {
            return (Builder) super.mo500clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof SDKAnalyticPayload) {
                return mergeFrom((SDKAnalyticPayload) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setMetrics(int i10, Metric.Builder builder) {
            pa paVar = this.metricsBuilder_;
            if (paVar == null) {
                ensureMetricsIsMutable();
                this.metrics_.set(i10, builder.build());
                onChanged();
                return this;
            }
            paVar.setMessage(i10, builder.build());
            return this;
        }

        public Builder mergeFrom(SDKAnalyticPayload sDKAnalyticPayload) {
            if (sDKAnalyticPayload == SDKAnalyticPayload.getDefaultInstance()) {
                return this;
            }
            if (this.metricsBuilder_ == null) {
                if (!sDKAnalyticPayload.metrics_.isEmpty()) {
                    if (this.metrics_.isEmpty()) {
                        this.metrics_ = sDKAnalyticPayload.metrics_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMetricsIsMutable();
                        this.metrics_.addAll(sDKAnalyticPayload.metrics_);
                    }
                    onChanged();
                }
            } else if (!sDKAnalyticPayload.metrics_.isEmpty()) {
                if (!this.metricsBuilder_.isEmpty()) {
                    this.metricsBuilder_.addAllMessages(sDKAnalyticPayload.metrics_);
                } else {
                    this.metricsBuilder_.dispose();
                    this.metricsBuilder_ = null;
                    this.metrics_ = sDKAnalyticPayload.metrics_;
                    this.bitField0_ &= -2;
                    this.metricsBuilder_ = k7.alwaysUseFieldBuilders ? getMetricsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((k7) sDKAnalyticPayload).unknownFields);
            onChanged();
            return this;
        }

        public Builder addMetrics(Metric.Builder builder) {
            pa paVar = this.metricsBuilder_;
            if (paVar == null) {
                ensureMetricsIsMutable();
                this.metrics_.add(builder.build());
                onChanged();
                return this;
            }
            paVar.addMessage(builder.build());
            return this;
        }

        public Builder addMetrics(int i10, Metric.Builder builder) {
            pa paVar = this.metricsBuilder_;
            if (paVar == null) {
                ensureMetricsIsMutable();
                this.metrics_.add(i10, builder.build());
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
        public io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.analytics.SDKAnalyticPayload.access$6700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.analytics.SDKAnalyticPayload r3 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.analytics.SDKAnalyticPayload r4 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Builder");
        }
    }

    public static Builder newBuilder(SDKAnalyticPayload sDKAnalyticPayload) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(sDKAnalyticPayload);
    }

    public static SDKAnalyticPayload parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (SDKAnalyticPayload) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private SDKAnalyticPayload(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static SDKAnalyticPayload parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (SDKAnalyticPayload) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static SDKAnalyticPayload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SDKAnalyticPayload) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public SDKAnalyticPayload getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static SDKAnalyticPayload parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (SDKAnalyticPayload) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private SDKAnalyticPayload() {
        this.memoizedIsInitialized = (byte) -1;
        this.metrics_ = Collections.EMPTY_LIST;
    }

    public static SDKAnalyticPayload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SDKAnalyticPayload) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static SDKAnalyticPayload parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (SDKAnalyticPayload) PARSER.parseFrom(bArr, m5Var);
    }

    public static SDKAnalyticPayload parseFrom(InputStream inputStream) throws IOException {
        return (SDKAnalyticPayload) k7.parseWithIOException(PARSER, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SDKAnalyticPayload(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                    this.metrics_ = new ArrayList();
                                    z11 = true;
                                }
                                this.metrics_.add(yVar.readMessage(Metric.parser(), m5Var));
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
                    this.metrics_ = Collections.unmodifiableList(this.metrics_);
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z11) {
            this.metrics_ = Collections.unmodifiableList(this.metrics_);
        }
        this.unknownFields = ccVarNewBuilder.build();
        makeExtensionsImmutable();
    }

    public static SDKAnalyticPayload parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (SDKAnalyticPayload) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static SDKAnalyticPayload parseFrom(y yVar) throws IOException {
        return (SDKAnalyticPayload) k7.parseWithIOException(PARSER, yVar);
    }

    public static SDKAnalyticPayload parseFrom(y yVar, m5 m5Var) throws IOException {
        return (SDKAnalyticPayload) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
