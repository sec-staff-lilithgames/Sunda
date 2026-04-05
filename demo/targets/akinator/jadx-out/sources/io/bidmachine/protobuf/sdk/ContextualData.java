package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
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
import com.explorestack.protobuf.xa;
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class ContextualData extends k7 implements ContextualDataOrBuilder {
    public static final int DATA_FIELD_NUMBER = 3;
    public static final int MEDIATOR_NAME_FIELD_NUMBER = 2;
    public static final int PLACEMENT_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private ImpressionData data_;
    private volatile Object mediatorName_;
    private byte memoizedIsInitialized;
    private volatile Object placement_;
    private static final ContextualData DEFAULT_INSTANCE = new ContextualData();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.ContextualData.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public ContextualData parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new ContextualData(yVar, m5Var);
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ImpressionData extends k7 implements ImpressionDataOrBuilder {
        public static final int AGENCY_FIELD_NUMBER = 8;
        public static final int BUNDLE_FIELD_NUMBER = 6;
        public static final int IMAGENCY_FIELD_NUMBER = 7;
        public static final int IMBUNDLE_FIELD_NUMBER = 5;
        public static final int IMD_FIELD_NUMBER = 2;
        public static final int IMIMD_FIELD_NUMBER = 1;
        public static final int IMWP_FIELD_NUMBER = 3;
        public static final int WP_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private volatile Object agency_;
        private volatile Object bundle_;
        private volatile Object imagency_;
        private volatile Object imbundle_;
        private int imd_;
        private int imimd_;
        private float imwp_;
        private byte memoizedIsInitialized;
        private float wp_;
        private static final ImpressionData DEFAULT_INSTANCE = new ImpressionData();
        private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.ContextualData.ImpressionData.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public ImpressionData parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new ImpressionData(yVar, m5Var);
            }
        };

        public static ImpressionData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_ContextualData_ImpressionData_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ImpressionData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ImpressionData) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ImpressionData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ImpressionData) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ImpressionData)) {
                return super.equals(obj);
            }
            ImpressionData impressionData = (ImpressionData) obj;
            return getImimd() == impressionData.getImimd() && getImd() == impressionData.getImd() && Float.floatToIntBits(getImwp()) == Float.floatToIntBits(impressionData.getImwp()) && Float.floatToIntBits(getWp()) == Float.floatToIntBits(impressionData.getWp()) && getImbundle().equals(impressionData.getImbundle()) && getBundle().equals(impressionData.getBundle()) && getImagency().equals(impressionData.getImagency()) && getAgency().equals(impressionData.getAgency()) && this.unknownFields.equals(impressionData.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
        public String getAgency() {
            Object obj = this.agency_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.agency_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
        public ByteString getAgencyBytes() {
            Object obj = this.agency_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.agency_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
        public String getBundle() {
            Object obj = this.bundle_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bundle_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
        public ByteString getBundleBytes() {
            Object obj = this.bundle_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bundle_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
        public String getImagency() {
            Object obj = this.imagency_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.imagency_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
        public ByteString getImagencyBytes() {
            Object obj = this.imagency_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.imagency_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
        public String getImbundle() {
            Object obj = this.imbundle_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.imbundle_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
        public ByteString getImbundleBytes() {
            Object obj = this.imbundle_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.imbundle_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
        public int getImd() {
            return this.imd_;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
        public int getImimd() {
            return this.imimd_;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
        public float getImwp() {
            return this.imwp_;
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
            int i11 = this.imimd_;
            int iComputeUInt32Size = i11 != 0 ? h0.computeUInt32Size(1, i11) : 0;
            int i12 = this.imd_;
            if (i12 != 0) {
                iComputeUInt32Size += h0.computeUInt32Size(2, i12);
            }
            float f10 = this.imwp_;
            if (f10 != 0.0f) {
                iComputeUInt32Size += h0.computeFloatSize(3, f10);
            }
            float f11 = this.wp_;
            if (f11 != 0.0f) {
                iComputeUInt32Size += h0.computeFloatSize(4, f11);
            }
            if (!getImbundleBytes().isEmpty()) {
                iComputeUInt32Size += k7.computeStringSize(5, this.imbundle_);
            }
            if (!getBundleBytes().isEmpty()) {
                iComputeUInt32Size += k7.computeStringSize(6, this.bundle_);
            }
            if (!getImagencyBytes().isEmpty()) {
                iComputeUInt32Size += k7.computeStringSize(7, this.imagency_);
            }
            if (!getAgencyBytes().isEmpty()) {
                iComputeUInt32Size += k7.computeStringSize(8, this.agency_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
        public final gc getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
        public float getWp() {
            return this.wp_;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = this.unknownFields.hashCode() + ((getAgency().hashCode() + ((((getImagency().hashCode() + ((((getBundle().hashCode() + ((((getImbundle().hashCode() + ((((Float.floatToIntBits(getWp()) + ((((Float.floatToIntBits(getImwp()) + ((((getImd() + ((((getImimd() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_ContextualData_ImpressionData_fieldAccessorTable.ensureFieldAccessorsInitialized(ImpressionData.class, Builder.class);
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
            return new ImpressionData();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            int i10 = this.imimd_;
            if (i10 != 0) {
                h0Var.writeUInt32(1, i10);
            }
            int i11 = this.imd_;
            if (i11 != 0) {
                h0Var.writeUInt32(2, i11);
            }
            float f10 = this.imwp_;
            if (f10 != 0.0f) {
                h0Var.writeFloat(3, f10);
            }
            float f11 = this.wp_;
            if (f11 != 0.0f) {
                h0Var.writeFloat(4, f11);
            }
            if (!getImbundleBytes().isEmpty()) {
                k7.writeString(h0Var, 5, this.imbundle_);
            }
            if (!getBundleBytes().isEmpty()) {
                k7.writeString(h0Var, 6, this.bundle_);
            }
            if (!getImagencyBytes().isEmpty()) {
                k7.writeString(h0Var, 7, this.imagency_);
            }
            if (!getAgencyBytes().isEmpty()) {
                k7.writeString(h0Var, 8, this.agency_);
            }
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements ImpressionDataOrBuilder {
            private Object agency_;
            private Object bundle_;
            private Object imagency_;
            private Object imbundle_;
            private int imd_;
            private int imimd_;
            private float imwp_;
            private float wp_;

            private Builder() {
                super(null);
                this.imbundle_ = "";
                this.bundle_ = "";
                this.imagency_ = "";
                this.agency_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_ContextualData_ImpressionData_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = k7.alwaysUseFieldBuilders;
            }

            public Builder clearAgency() {
                this.agency_ = ImpressionData.getDefaultInstance().getAgency();
                onChanged();
                return this;
            }

            public Builder clearBundle() {
                this.bundle_ = ImpressionData.getDefaultInstance().getBundle();
                onChanged();
                return this;
            }

            public Builder clearImagency() {
                this.imagency_ = ImpressionData.getDefaultInstance().getImagency();
                onChanged();
                return this;
            }

            public Builder clearImbundle() {
                this.imbundle_ = ImpressionData.getDefaultInstance().getImbundle();
                onChanged();
                return this;
            }

            public Builder clearImd() {
                this.imd_ = 0;
                onChanged();
                return this;
            }

            public Builder clearImimd() {
                this.imimd_ = 0;
                onChanged();
                return this;
            }

            public Builder clearImwp() {
                this.imwp_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearWp() {
                this.wp_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
            public String getAgency() {
                Object obj = this.agency_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.agency_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
            public ByteString getAgencyBytes() {
                Object obj = this.agency_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.agency_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
            public String getBundle() {
                Object obj = this.bundle_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.bundle_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
            public ByteString getBundleBytes() {
                Object obj = this.bundle_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bundle_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_ContextualData_ImpressionData_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
            public String getImagency() {
                Object obj = this.imagency_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.imagency_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
            public ByteString getImagencyBytes() {
                Object obj = this.imagency_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.imagency_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
            public String getImbundle() {
                Object obj = this.imbundle_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.imbundle_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
            public ByteString getImbundleBytes() {
                Object obj = this.imbundle_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.imbundle_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
            public int getImd() {
                return this.imd_;
            }

            @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
            public int getImimd() {
                return this.imimd_;
            }

            @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
            public float getImwp() {
                return this.imwp_;
            }

            @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
            public float getWp() {
                return this.wp_;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_ContextualData_ImpressionData_fieldAccessorTable.ensureFieldAccessorsInitialized(ImpressionData.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setAgency(String str) {
                str.getClass();
                this.agency_ = str;
                onChanged();
                return this;
            }

            public Builder setAgencyBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                b.checkByteStringIsUtf8(byteString);
                this.agency_ = byteString;
                onChanged();
                return this;
            }

            public Builder setBundle(String str) {
                str.getClass();
                this.bundle_ = str;
                onChanged();
                return this;
            }

            public Builder setBundleBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                b.checkByteStringIsUtf8(byteString);
                this.bundle_ = byteString;
                onChanged();
                return this;
            }

            public Builder setImagency(String str) {
                str.getClass();
                this.imagency_ = str;
                onChanged();
                return this;
            }

            public Builder setImagencyBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                b.checkByteStringIsUtf8(byteString);
                this.imagency_ = byteString;
                onChanged();
                return this;
            }

            public Builder setImbundle(String str) {
                str.getClass();
                this.imbundle_ = str;
                onChanged();
                return this;
            }

            public Builder setImbundleBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                b.checkByteStringIsUtf8(byteString);
                this.imbundle_ = byteString;
                onChanged();
                return this;
            }

            public Builder setImd(int i10) {
                this.imd_ = i10;
                onChanged();
                return this;
            }

            public Builder setImimd(int i10) {
                this.imimd_ = i10;
                onChanged();
                return this;
            }

            public Builder setImwp(float f10) {
                this.imwp_ = f10;
                onChanged();
                return this;
            }

            public Builder setWp(float f10) {
                this.wp_ = f10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public ImpressionData build() {
                ImpressionData impressionDataBuildPartial = buildPartial();
                if (impressionDataBuildPartial.isInitialized()) {
                    return impressionDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) impressionDataBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public ImpressionData buildPartial() {
                ImpressionData impressionData = new ImpressionData(this);
                impressionData.imimd_ = this.imimd_;
                impressionData.imd_ = this.imd_;
                impressionData.imwp_ = this.imwp_;
                impressionData.wp_ = this.wp_;
                impressionData.imbundle_ = this.imbundle_;
                impressionData.bundle_ = this.bundle_;
                impressionData.imagency_ = this.imagency_;
                impressionData.agency_ = this.agency_;
                onBuilt();
                return impressionData;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public ImpressionData getDefaultInstanceForType() {
                return ImpressionData.getDefaultInstance();
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
                this.imimd_ = 0;
                this.imd_ = 0;
                this.imwp_ = 0.0f;
                this.wp_ = 0.0f;
                this.imbundle_ = "";
                this.bundle_ = "";
                this.imagency_ = "";
                this.agency_ = "";
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
            /* renamed from: clone */
            public Builder mo500clone() {
                return (Builder) super.mo500clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ImpressionData) {
                    return mergeFrom((ImpressionData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            private Builder(p6 p6Var) {
                super(p6Var);
                this.imbundle_ = "";
                this.bundle_ = "";
                this.imagency_ = "";
                this.agency_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(ImpressionData impressionData) {
                if (impressionData == ImpressionData.getDefaultInstance()) {
                    return this;
                }
                if (impressionData.getImimd() != 0) {
                    setImimd(impressionData.getImimd());
                }
                if (impressionData.getImd() != 0) {
                    setImd(impressionData.getImd());
                }
                if (impressionData.getImwp() != 0.0f) {
                    setImwp(impressionData.getImwp());
                }
                if (impressionData.getWp() != 0.0f) {
                    setWp(impressionData.getWp());
                }
                if (!impressionData.getImbundle().isEmpty()) {
                    this.imbundle_ = impressionData.imbundle_;
                    onChanged();
                }
                if (!impressionData.getBundle().isEmpty()) {
                    this.bundle_ = impressionData.bundle_;
                    onChanged();
                }
                if (!impressionData.getImagency().isEmpty()) {
                    this.imagency_ = impressionData.imagency_;
                    onChanged();
                }
                if (!impressionData.getAgency().isEmpty()) {
                    this.agency_ = impressionData.agency_;
                    onChanged();
                }
                mergeUnknownFields(((k7) impressionData).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public io.bidmachine.protobuf.sdk.ContextualData.ImpressionData.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sdk.ContextualData.ImpressionData.access$1300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sdk.ContextualData$ImpressionData r3 = (io.bidmachine.protobuf.sdk.ContextualData.ImpressionData) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sdk.ContextualData$ImpressionData r4 = (io.bidmachine.protobuf.sdk.ContextualData.ImpressionData) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.ContextualData.ImpressionData.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sdk.ContextualData$ImpressionData$Builder");
            }
        }

        public static Builder newBuilder(ImpressionData impressionData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(impressionData);
        }

        public static ImpressionData parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (ImpressionData) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private ImpressionData(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ImpressionData parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (ImpressionData) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static ImpressionData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ImpressionData) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public ImpressionData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static ImpressionData parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (ImpressionData) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ImpressionData() {
            this.memoizedIsInitialized = (byte) -1;
            this.imbundle_ = "";
            this.bundle_ = "";
            this.imagency_ = "";
            this.agency_ = "";
        }

        public static ImpressionData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ImpressionData) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static ImpressionData parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (ImpressionData) PARSER.parseFrom(bArr, m5Var);
        }

        public static ImpressionData parseFrom(InputStream inputStream) throws IOException {
            return (ImpressionData) k7.parseWithIOException(PARSER, inputStream);
        }

        public static ImpressionData parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (ImpressionData) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        private ImpressionData(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                this.imimd_ = yVar.readUInt32();
                            } else if (tag == 16) {
                                this.imd_ = yVar.readUInt32();
                            } else if (tag == 29) {
                                this.imwp_ = yVar.readFloat();
                            } else if (tag == 37) {
                                this.wp_ = yVar.readFloat();
                            } else if (tag == 42) {
                                this.imbundle_ = yVar.readStringRequireUtf8();
                            } else if (tag == 50) {
                                this.bundle_ = yVar.readStringRequireUtf8();
                            } else if (tag == 58) {
                                this.imagency_ = yVar.readStringRequireUtf8();
                            } else if (tag != 66) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                this.agency_ = yVar.readStringRequireUtf8();
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

        public static ImpressionData parseFrom(y yVar) throws IOException {
            return (ImpressionData) k7.parseWithIOException(PARSER, yVar);
        }

        public static ImpressionData parseFrom(y yVar, m5 m5Var) throws IOException {
            return (ImpressionData) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ImpressionDataOrBuilder extends MessageOrBuilder {
        String getAgency();

        ByteString getAgencyBytes();

        String getBundle();

        ByteString getBundleBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        String getImagency();

        ByteString getImagencyBytes();

        String getImbundle();

        ByteString getImbundleBytes();

        int getImd();

        int getImimd();

        float getImwp();

        float getWp();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static ContextualData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_ContextualData_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static ContextualData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ContextualData) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ContextualData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ContextualData) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContextualData)) {
            return super.equals(obj);
        }
        ContextualData contextualData = (ContextualData) obj;
        if (getPlacement().equals(contextualData.getPlacement()) && getMediatorName().equals(contextualData.getMediatorName()) && hasData() == contextualData.hasData()) {
            return (!hasData() || getData().equals(contextualData.getData())) && this.unknownFields.equals(contextualData.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextualDataOrBuilder
    public ImpressionData getData() {
        ImpressionData impressionData = this.data_;
        return impressionData == null ? ImpressionData.getDefaultInstance() : impressionData;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextualDataOrBuilder
    public ImpressionDataOrBuilder getDataOrBuilder() {
        return getData();
    }

    @Override // io.bidmachine.protobuf.sdk.ContextualDataOrBuilder
    public String getMediatorName() {
        Object obj = this.mediatorName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.mediatorName_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextualDataOrBuilder
    public ByteString getMediatorNameBytes() {
        Object obj = this.mediatorName_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.mediatorName_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextualDataOrBuilder
    public String getPlacement() {
        Object obj = this.placement_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.placement_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextualDataOrBuilder
    public ByteString getPlacementBytes() {
        Object obj = this.placement_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.placement_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getPlacementBytes().isEmpty() ? k7.computeStringSize(1, this.placement_) : 0;
        if (!getMediatorNameBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(2, this.mediatorName_);
        }
        if (this.data_ != null) {
            iComputeStringSize += h0.computeMessageSize(3, getData());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextualDataOrBuilder
    public boolean hasData() {
        return this.data_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getMediatorName().hashCode() + ((((getPlacement().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
        if (hasData()) {
            iHashCode = o2.B(iHashCode, 37, 3, 53) + getData().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_ContextualData_fieldAccessorTable.ensureFieldAccessorsInitialized(ContextualData.class, Builder.class);
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
        return new ContextualData();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (!getPlacementBytes().isEmpty()) {
            k7.writeString(h0Var, 1, this.placement_);
        }
        if (!getMediatorNameBytes().isEmpty()) {
            k7.writeString(h0Var, 2, this.mediatorName_);
        }
        if (this.data_ != null) {
            h0Var.writeMessage(3, getData());
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements ContextualDataOrBuilder {
        private xa dataBuilder_;
        private ImpressionData data_;
        private Object mediatorName_;
        private Object placement_;

        private Builder() {
            super(null);
            this.placement_ = "";
            this.mediatorName_ = "";
            maybeForceBuilderInitialization();
        }

        private xa getDataFieldBuilder() {
            if (this.dataBuilder_ == null) {
                this.dataBuilder_ = new xa(getData(), getParentForChildren(), isClean());
                this.data_ = null;
            }
            return this.dataBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_ContextualData_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = k7.alwaysUseFieldBuilders;
        }

        public Builder clearData() {
            if (this.dataBuilder_ == null) {
                this.data_ = null;
                onChanged();
                return this;
            }
            this.data_ = null;
            this.dataBuilder_ = null;
            return this;
        }

        public Builder clearMediatorName() {
            this.mediatorName_ = ContextualData.getDefaultInstance().getMediatorName();
            onChanged();
            return this;
        }

        public Builder clearPlacement() {
            this.placement_ = ContextualData.getDefaultInstance().getPlacement();
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualDataOrBuilder
        public ImpressionData getData() {
            xa xaVar = this.dataBuilder_;
            if (xaVar != null) {
                return (ImpressionData) xaVar.getMessage();
            }
            ImpressionData impressionData = this.data_;
            return impressionData == null ? ImpressionData.getDefaultInstance() : impressionData;
        }

        public ImpressionData.Builder getDataBuilder() {
            onChanged();
            return (ImpressionData.Builder) getDataFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualDataOrBuilder
        public ImpressionDataOrBuilder getDataOrBuilder() {
            xa xaVar = this.dataBuilder_;
            if (xaVar != null) {
                return (ImpressionDataOrBuilder) xaVar.getMessageOrBuilder();
            }
            ImpressionData impressionData = this.data_;
            return impressionData == null ? ImpressionData.getDefaultInstance() : impressionData;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_ContextualData_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualDataOrBuilder
        public String getMediatorName() {
            Object obj = this.mediatorName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.mediatorName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualDataOrBuilder
        public ByteString getMediatorNameBytes() {
            Object obj = this.mediatorName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.mediatorName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualDataOrBuilder
        public String getPlacement() {
            Object obj = this.placement_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.placement_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualDataOrBuilder
        public ByteString getPlacementBytes() {
            Object obj = this.placement_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.placement_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualDataOrBuilder
        public boolean hasData() {
            return (this.dataBuilder_ == null && this.data_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_ContextualData_fieldAccessorTable.ensureFieldAccessorsInitialized(ContextualData.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeData(ImpressionData impressionData) {
            xa xaVar = this.dataBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(impressionData);
                return this;
            }
            ImpressionData impressionData2 = this.data_;
            if (impressionData2 != null) {
                this.data_ = ImpressionData.newBuilder(impressionData2).mergeFrom(impressionData).buildPartial();
            } else {
                this.data_ = impressionData;
            }
            onChanged();
            return this;
        }

        public Builder setData(ImpressionData impressionData) {
            xa xaVar = this.dataBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(impressionData);
                return this;
            }
            impressionData.getClass();
            this.data_ = impressionData;
            onChanged();
            return this;
        }

        public Builder setMediatorName(String str) {
            str.getClass();
            this.mediatorName_ = str;
            onChanged();
            return this;
        }

        public Builder setMediatorNameBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.mediatorName_ = byteString;
            onChanged();
            return this;
        }

        public Builder setPlacement(String str) {
            str.getClass();
            this.placement_ = str;
            onChanged();
            return this;
        }

        public Builder setPlacementBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.placement_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public ContextualData build() {
            ContextualData contextualDataBuildPartial = buildPartial();
            if (contextualDataBuildPartial.isInitialized()) {
                return contextualDataBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) contextualDataBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public ContextualData buildPartial() {
            ContextualData contextualData = new ContextualData(this);
            contextualData.placement_ = this.placement_;
            contextualData.mediatorName_ = this.mediatorName_;
            xa xaVar = this.dataBuilder_;
            if (xaVar == null) {
                contextualData.data_ = this.data_;
            } else {
                contextualData.data_ = (ImpressionData) xaVar.build();
            }
            onBuilt();
            return contextualData;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public ContextualData getDefaultInstanceForType() {
            return ContextualData.getDefaultInstance();
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
            this.placement_ = "";
            this.mediatorName_ = "";
            if (this.dataBuilder_ == null) {
                this.data_ = null;
                return this;
            }
            this.data_ = null;
            this.dataBuilder_ = null;
            return this;
        }

        public Builder setData(ImpressionData.Builder builder) {
            xa xaVar = this.dataBuilder_;
            if (xaVar == null) {
                this.data_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            this.placement_ = "";
            this.mediatorName_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
        /* renamed from: clone */
        public Builder mo500clone() {
            return (Builder) super.mo500clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof ContextualData) {
                return mergeFrom((ContextualData) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(ContextualData contextualData) {
            if (contextualData == ContextualData.getDefaultInstance()) {
                return this;
            }
            if (!contextualData.getPlacement().isEmpty()) {
                this.placement_ = contextualData.placement_;
                onChanged();
            }
            if (!contextualData.getMediatorName().isEmpty()) {
                this.mediatorName_ = contextualData.mediatorName_;
                onChanged();
            }
            if (contextualData.hasData()) {
                mergeData(contextualData.getData());
            }
            mergeUnknownFields(((k7) contextualData).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.bidmachine.protobuf.sdk.ContextualData.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sdk.ContextualData.access$2700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.sdk.ContextualData r3 = (io.bidmachine.protobuf.sdk.ContextualData) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.sdk.ContextualData r4 = (io.bidmachine.protobuf.sdk.ContextualData) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.ContextualData.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sdk.ContextualData$Builder");
        }
    }

    public static Builder newBuilder(ContextualData contextualData) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(contextualData);
    }

    public static ContextualData parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (ContextualData) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private ContextualData(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static ContextualData parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (ContextualData) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static ContextualData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ContextualData) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public ContextualData getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static ContextualData parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (ContextualData) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private ContextualData() {
        this.memoizedIsInitialized = (byte) -1;
        this.placement_ = "";
        this.mediatorName_ = "";
    }

    public static ContextualData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ContextualData) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static ContextualData parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (ContextualData) PARSER.parseFrom(bArr, m5Var);
    }

    public static ContextualData parseFrom(InputStream inputStream) throws IOException {
        return (ContextualData) k7.parseWithIOException(PARSER, inputStream);
    }

    private ContextualData(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                            this.placement_ = yVar.readStringRequireUtf8();
                        } else if (tag == 18) {
                            this.mediatorName_ = yVar.readStringRequireUtf8();
                        } else if (tag != 26) {
                            if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                            }
                        } else {
                            ImpressionData impressionData = this.data_;
                            ImpressionData.Builder builder = impressionData != null ? impressionData.toBuilder() : null;
                            ImpressionData impressionData2 = (ImpressionData) yVar.readMessage(ImpressionData.parser(), m5Var);
                            this.data_ = impressionData2;
                            if (builder != null) {
                                builder.mergeFrom(impressionData2);
                                this.data_ = builder.buildPartial();
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

    public static ContextualData parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (ContextualData) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static ContextualData parseFrom(y yVar) throws IOException {
        return (ContextualData) k7.parseWithIOException(PARSER, yVar);
    }

    public static ContextualData parseFrom(y yVar, m5 m5Var) throws IOException {
        return (ContextualData) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
