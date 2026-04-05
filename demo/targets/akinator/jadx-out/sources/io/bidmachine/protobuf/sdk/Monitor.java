package io.bidmachine.protobuf.sdk;

import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.UInt32Value;
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
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.o;
import com.explorestack.protobuf.o6;
import com.explorestack.protobuf.p;
import com.explorestack.protobuf.p6;
import com.explorestack.protobuf.pa;
import com.explorestack.protobuf.sb;
import com.explorestack.protobuf.xa;
import com.explorestack.protobuf.y;
import com.explorestack.protobuf.yb;
import e3.g;
import io.bidmachine.protobuf.sdk.Error;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class Monitor extends k7 implements MonitorOrBuilder {
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int RECORDS_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private List<Record> records_;
    private static final Monitor DEFAULT_INSTANCE = new Monitor();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Monitor.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public Monitor parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new Monitor(yVar, m5Var);
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Configuration extends k7 implements ConfigurationOrBuilder {
        public static final int BATCH_SIZE_FIELD_NUMBER = 3;
        public static final int INTERVAL_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int SHOULD_REPORT_FIELD_NUMBER = 5;
        public static final int URL_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private UInt32Value batchSize_;
        private UInt32Value interval_;
        private byte memoizedIsInitialized;
        private StringValue name_;
        private o shouldReport_;
        private StringValue url_;
        private static final Configuration DEFAULT_INSTANCE = new Configuration();
        private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Monitor.Configuration.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public Configuration parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new Configuration(yVar, m5Var);
            }
        };

        public static Configuration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_descriptor;
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
            if (hasName() != configuration.hasName()) {
                return false;
            }
            if ((hasName() && !getName().equals(configuration.getName())) || hasUrl() != configuration.hasUrl()) {
                return false;
            }
            if ((hasUrl() && !getUrl().equals(configuration.getUrl())) || hasBatchSize() != configuration.hasBatchSize()) {
                return false;
            }
            if ((hasBatchSize() && !getBatchSize().equals(configuration.getBatchSize())) || hasInterval() != configuration.hasInterval()) {
                return false;
            }
            if ((!hasInterval() || getInterval().equals(configuration.getInterval())) && hasShouldReport() == configuration.hasShouldReport()) {
                return (!hasShouldReport() || getShouldReport().equals(configuration.getShouldReport())) && this.unknownFields.equals(configuration.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public UInt32Value getBatchSize() {
            UInt32Value uInt32Value = this.batchSize_;
            return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public yb getBatchSizeOrBuilder() {
            return getBatchSize();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public UInt32Value getInterval() {
            UInt32Value uInt32Value = this.interval_;
            return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public yb getIntervalOrBuilder() {
            return getInterval();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public StringValue getName() {
            StringValue stringValue = this.name_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public ib getNameOrBuilder() {
            return getName();
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
            int iComputeMessageSize = this.name_ != null ? h0.computeMessageSize(1, getName()) : 0;
            if (this.url_ != null) {
                iComputeMessageSize += h0.computeMessageSize(2, getUrl());
            }
            if (this.batchSize_ != null) {
                iComputeMessageSize += h0.computeMessageSize(3, getBatchSize());
            }
            if (this.interval_ != null) {
                iComputeMessageSize += h0.computeMessageSize(4, getInterval());
            }
            if (this.shouldReport_ != null) {
                iComputeMessageSize += h0.computeMessageSize(5, getShouldReport());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public o getShouldReport() {
            o oVar = this.shouldReport_;
            return oVar == null ? o.getDefaultInstance() : oVar;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public p getShouldReportOrBuilder() {
            return getShouldReport();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
        public final gc getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public StringValue getUrl() {
            StringValue stringValue = this.url_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public ib getUrlOrBuilder() {
            return getUrl();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public boolean hasBatchSize() {
            return this.batchSize_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public boolean hasInterval() {
            return this.interval_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public boolean hasName() {
            return this.name_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public boolean hasShouldReport() {
            return this.shouldReport_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public boolean hasUrl() {
            return this.url_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasName()) {
                iHashCode = o2.B(iHashCode, 37, 1, 53) + getName().hashCode();
            }
            if (hasUrl()) {
                iHashCode = o2.B(iHashCode, 37, 2, 53) + getUrl().hashCode();
            }
            if (hasBatchSize()) {
                iHashCode = o2.B(iHashCode, 37, 3, 53) + getBatchSize().hashCode();
            }
            if (hasInterval()) {
                iHashCode = o2.B(iHashCode, 37, 4, 53) + getInterval().hashCode();
            }
            if (hasShouldReport()) {
                iHashCode = o2.B(iHashCode, 37, 5, 53) + getShouldReport().hashCode();
            }
            int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_fieldAccessorTable.ensureFieldAccessorsInitialized(Configuration.class, Builder.class);
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
            if (this.name_ != null) {
                h0Var.writeMessage(1, getName());
            }
            if (this.url_ != null) {
                h0Var.writeMessage(2, getUrl());
            }
            if (this.batchSize_ != null) {
                h0Var.writeMessage(3, getBatchSize());
            }
            if (this.interval_ != null) {
                h0Var.writeMessage(4, getInterval());
            }
            if (this.shouldReport_ != null) {
                h0Var.writeMessage(5, getShouldReport());
            }
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements ConfigurationOrBuilder {
            private xa batchSizeBuilder_;
            private UInt32Value batchSize_;
            private xa intervalBuilder_;
            private UInt32Value interval_;
            private xa nameBuilder_;
            private StringValue name_;
            private xa shouldReportBuilder_;
            private o shouldReport_;
            private xa urlBuilder_;
            private StringValue url_;

            private Builder() {
                super(null);
                maybeForceBuilderInitialization();
            }

            private xa getBatchSizeFieldBuilder() {
                if (this.batchSizeBuilder_ == null) {
                    this.batchSizeBuilder_ = new xa(getBatchSize(), getParentForChildren(), isClean());
                    this.batchSize_ = null;
                }
                return this.batchSizeBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_descriptor;
            }

            private xa getIntervalFieldBuilder() {
                if (this.intervalBuilder_ == null) {
                    this.intervalBuilder_ = new xa(getInterval(), getParentForChildren(), isClean());
                    this.interval_ = null;
                }
                return this.intervalBuilder_;
            }

            private xa getNameFieldBuilder() {
                if (this.nameBuilder_ == null) {
                    this.nameBuilder_ = new xa(getName(), getParentForChildren(), isClean());
                    this.name_ = null;
                }
                return this.nameBuilder_;
            }

            private xa getShouldReportFieldBuilder() {
                if (this.shouldReportBuilder_ == null) {
                    this.shouldReportBuilder_ = new xa(getShouldReport(), getParentForChildren(), isClean());
                    this.shouldReport_ = null;
                }
                return this.shouldReportBuilder_;
            }

            private xa getUrlFieldBuilder() {
                if (this.urlBuilder_ == null) {
                    this.urlBuilder_ = new xa(getUrl(), getParentForChildren(), isClean());
                    this.url_ = null;
                }
                return this.urlBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = k7.alwaysUseFieldBuilders;
            }

            public Builder clearBatchSize() {
                if (this.batchSizeBuilder_ == null) {
                    this.batchSize_ = null;
                    onChanged();
                    return this;
                }
                this.batchSize_ = null;
                this.batchSizeBuilder_ = null;
                return this;
            }

            public Builder clearInterval() {
                if (this.intervalBuilder_ == null) {
                    this.interval_ = null;
                    onChanged();
                    return this;
                }
                this.interval_ = null;
                this.intervalBuilder_ = null;
                return this;
            }

            public Builder clearName() {
                if (this.nameBuilder_ == null) {
                    this.name_ = null;
                    onChanged();
                    return this;
                }
                this.name_ = null;
                this.nameBuilder_ = null;
                return this;
            }

            public Builder clearShouldReport() {
                if (this.shouldReportBuilder_ == null) {
                    this.shouldReport_ = null;
                    onChanged();
                    return this;
                }
                this.shouldReport_ = null;
                this.shouldReportBuilder_ = null;
                return this;
            }

            public Builder clearUrl() {
                if (this.urlBuilder_ == null) {
                    this.url_ = null;
                    onChanged();
                    return this;
                }
                this.url_ = null;
                this.urlBuilder_ = null;
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public UInt32Value getBatchSize() {
                xa xaVar = this.batchSizeBuilder_;
                if (xaVar != null) {
                    return (UInt32Value) xaVar.getMessage();
                }
                UInt32Value uInt32Value = this.batchSize_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            public UInt32Value.Builder getBatchSizeBuilder() {
                onChanged();
                return (UInt32Value.Builder) getBatchSizeFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public yb getBatchSizeOrBuilder() {
                xa xaVar = this.batchSizeBuilder_;
                if (xaVar != null) {
                    return (yb) xaVar.getMessageOrBuilder();
                }
                UInt32Value uInt32Value = this.batchSize_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public UInt32Value getInterval() {
                xa xaVar = this.intervalBuilder_;
                if (xaVar != null) {
                    return (UInt32Value) xaVar.getMessage();
                }
                UInt32Value uInt32Value = this.interval_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            public UInt32Value.Builder getIntervalBuilder() {
                onChanged();
                return (UInt32Value.Builder) getIntervalFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public yb getIntervalOrBuilder() {
                xa xaVar = this.intervalBuilder_;
                if (xaVar != null) {
                    return (yb) xaVar.getMessageOrBuilder();
                }
                UInt32Value uInt32Value = this.interval_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public StringValue getName() {
                xa xaVar = this.nameBuilder_;
                if (xaVar != null) {
                    return (StringValue) xaVar.getMessage();
                }
                StringValue stringValue = this.name_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            public StringValue.Builder getNameBuilder() {
                onChanged();
                return (StringValue.Builder) getNameFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public ib getNameOrBuilder() {
                xa xaVar = this.nameBuilder_;
                if (xaVar != null) {
                    return (ib) xaVar.getMessageOrBuilder();
                }
                StringValue stringValue = this.name_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public o getShouldReport() {
                xa xaVar = this.shouldReportBuilder_;
                if (xaVar != null) {
                    return (o) xaVar.getMessage();
                }
                o oVar = this.shouldReport_;
                return oVar == null ? o.getDefaultInstance() : oVar;
            }

            public n getShouldReportBuilder() {
                onChanged();
                return (n) getShouldReportFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public p getShouldReportOrBuilder() {
                xa xaVar = this.shouldReportBuilder_;
                if (xaVar != null) {
                    return (p) xaVar.getMessageOrBuilder();
                }
                o oVar = this.shouldReport_;
                return oVar == null ? o.getDefaultInstance() : oVar;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public StringValue getUrl() {
                xa xaVar = this.urlBuilder_;
                if (xaVar != null) {
                    return (StringValue) xaVar.getMessage();
                }
                StringValue stringValue = this.url_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            public StringValue.Builder getUrlBuilder() {
                onChanged();
                return (StringValue.Builder) getUrlFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public ib getUrlOrBuilder() {
                xa xaVar = this.urlBuilder_;
                if (xaVar != null) {
                    return (ib) xaVar.getMessageOrBuilder();
                }
                StringValue stringValue = this.url_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public boolean hasBatchSize() {
                return (this.batchSizeBuilder_ == null && this.batchSize_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public boolean hasInterval() {
                return (this.intervalBuilder_ == null && this.interval_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public boolean hasName() {
                return (this.nameBuilder_ == null && this.name_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public boolean hasShouldReport() {
                return (this.shouldReportBuilder_ == null && this.shouldReport_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public boolean hasUrl() {
                return (this.urlBuilder_ == null && this.url_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_fieldAccessorTable.ensureFieldAccessorsInitialized(Configuration.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeBatchSize(UInt32Value uInt32Value) {
                xa xaVar = this.batchSizeBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(uInt32Value);
                    return this;
                }
                UInt32Value uInt32Value2 = this.batchSize_;
                if (uInt32Value2 != null) {
                    this.batchSize_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                } else {
                    this.batchSize_ = uInt32Value;
                }
                onChanged();
                return this;
            }

            public Builder mergeInterval(UInt32Value uInt32Value) {
                xa xaVar = this.intervalBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(uInt32Value);
                    return this;
                }
                UInt32Value uInt32Value2 = this.interval_;
                if (uInt32Value2 != null) {
                    this.interval_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                } else {
                    this.interval_ = uInt32Value;
                }
                onChanged();
                return this;
            }

            public Builder mergeName(StringValue stringValue) {
                xa xaVar = this.nameBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(stringValue);
                    return this;
                }
                StringValue stringValue2 = this.name_;
                if (stringValue2 != null) {
                    this.name_ = g.h(stringValue2, stringValue);
                } else {
                    this.name_ = stringValue;
                }
                onChanged();
                return this;
            }

            public Builder mergeShouldReport(o oVar) {
                xa xaVar = this.shouldReportBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(oVar);
                    return this;
                }
                o oVar2 = this.shouldReport_;
                if (oVar2 != null) {
                    this.shouldReport_ = o.newBuilder(oVar2).mergeFrom(oVar).buildPartial();
                } else {
                    this.shouldReport_ = oVar;
                }
                onChanged();
                return this;
            }

            public Builder mergeUrl(StringValue stringValue) {
                xa xaVar = this.urlBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(stringValue);
                    return this;
                }
                StringValue stringValue2 = this.url_;
                if (stringValue2 != null) {
                    this.url_ = g.h(stringValue2, stringValue);
                } else {
                    this.url_ = stringValue;
                }
                onChanged();
                return this;
            }

            public Builder setBatchSize(UInt32Value uInt32Value) {
                xa xaVar = this.batchSizeBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(uInt32Value);
                    return this;
                }
                uInt32Value.getClass();
                this.batchSize_ = uInt32Value;
                onChanged();
                return this;
            }

            public Builder setInterval(UInt32Value uInt32Value) {
                xa xaVar = this.intervalBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(uInt32Value);
                    return this;
                }
                uInt32Value.getClass();
                this.interval_ = uInt32Value;
                onChanged();
                return this;
            }

            public Builder setName(StringValue stringValue) {
                xa xaVar = this.nameBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(stringValue);
                    return this;
                }
                stringValue.getClass();
                this.name_ = stringValue;
                onChanged();
                return this;
            }

            public Builder setShouldReport(o oVar) {
                xa xaVar = this.shouldReportBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(oVar);
                    return this;
                }
                oVar.getClass();
                this.shouldReport_ = oVar;
                onChanged();
                return this;
            }

            public Builder setUrl(StringValue stringValue) {
                xa xaVar = this.urlBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(stringValue);
                    return this;
                }
                stringValue.getClass();
                this.url_ = stringValue;
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
                xa xaVar = this.nameBuilder_;
                if (xaVar == null) {
                    configuration.name_ = this.name_;
                } else {
                    configuration.name_ = (StringValue) xaVar.build();
                }
                xa xaVar2 = this.urlBuilder_;
                if (xaVar2 == null) {
                    configuration.url_ = this.url_;
                } else {
                    configuration.url_ = (StringValue) xaVar2.build();
                }
                xa xaVar3 = this.batchSizeBuilder_;
                if (xaVar3 == null) {
                    configuration.batchSize_ = this.batchSize_;
                } else {
                    configuration.batchSize_ = (UInt32Value) xaVar3.build();
                }
                xa xaVar4 = this.intervalBuilder_;
                if (xaVar4 == null) {
                    configuration.interval_ = this.interval_;
                } else {
                    configuration.interval_ = (UInt32Value) xaVar4.build();
                }
                xa xaVar5 = this.shouldReportBuilder_;
                if (xaVar5 == null) {
                    configuration.shouldReport_ = this.shouldReport_;
                } else {
                    configuration.shouldReport_ = (o) xaVar5.build();
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
                if (this.nameBuilder_ == null) {
                    this.name_ = null;
                } else {
                    this.name_ = null;
                    this.nameBuilder_ = null;
                }
                if (this.urlBuilder_ == null) {
                    this.url_ = null;
                } else {
                    this.url_ = null;
                    this.urlBuilder_ = null;
                }
                if (this.batchSizeBuilder_ == null) {
                    this.batchSize_ = null;
                } else {
                    this.batchSize_ = null;
                    this.batchSizeBuilder_ = null;
                }
                if (this.intervalBuilder_ == null) {
                    this.interval_ = null;
                } else {
                    this.interval_ = null;
                    this.intervalBuilder_ = null;
                }
                if (this.shouldReportBuilder_ == null) {
                    this.shouldReport_ = null;
                    return this;
                }
                this.shouldReport_ = null;
                this.shouldReportBuilder_ = null;
                return this;
            }

            public Builder setBatchSize(UInt32Value.Builder builder) {
                xa xaVar = this.batchSizeBuilder_;
                if (xaVar == null) {
                    this.batchSize_ = builder.build();
                    onChanged();
                    return this;
                }
                xaVar.setMessage(builder.build());
                return this;
            }

            public Builder setInterval(UInt32Value.Builder builder) {
                xa xaVar = this.intervalBuilder_;
                if (xaVar == null) {
                    this.interval_ = builder.build();
                    onChanged();
                    return this;
                }
                xaVar.setMessage(builder.build());
                return this;
            }

            public Builder setName(StringValue.Builder builder) {
                xa xaVar = this.nameBuilder_;
                if (xaVar == null) {
                    this.name_ = builder.build();
                    onChanged();
                    return this;
                }
                xaVar.setMessage(builder.build());
                return this;
            }

            public Builder setShouldReport(n nVar) {
                xa xaVar = this.shouldReportBuilder_;
                if (xaVar == null) {
                    this.shouldReport_ = nVar.build();
                    onChanged();
                    return this;
                }
                xaVar.setMessage(nVar.build());
                return this;
            }

            public Builder setUrl(StringValue.Builder builder) {
                xa xaVar = this.urlBuilder_;
                if (xaVar == null) {
                    this.url_ = builder.build();
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
                if (message instanceof Configuration) {
                    return mergeFrom((Configuration) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Configuration configuration) {
                if (configuration == Configuration.getDefaultInstance()) {
                    return this;
                }
                if (configuration.hasName()) {
                    mergeName(configuration.getName());
                }
                if (configuration.hasUrl()) {
                    mergeUrl(configuration.getUrl());
                }
                if (configuration.hasBatchSize()) {
                    mergeBatchSize(configuration.getBatchSize());
                }
                if (configuration.hasInterval()) {
                    mergeInterval(configuration.getInterval());
                }
                if (configuration.hasShouldReport()) {
                    mergeShouldReport(configuration.getShouldReport());
                }
                mergeUnknownFields(((k7) configuration).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public io.bidmachine.protobuf.sdk.Monitor.Configuration.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sdk.Monitor.Configuration.access$1000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sdk.Monitor$Configuration r3 = (io.bidmachine.protobuf.sdk.Monitor.Configuration) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sdk.Monitor$Configuration r4 = (io.bidmachine.protobuf.sdk.Monitor.Configuration) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Monitor.Configuration.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sdk.Monitor$Configuration$Builder");
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

        private Configuration(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                StringValue stringValue = this.name_;
                                StringValue.Builder builder = stringValue != null ? stringValue.toBuilder() : null;
                                StringValue stringValue2 = (StringValue) yVar.readMessage(StringValue.parser(), m5Var);
                                this.name_ = stringValue2;
                                if (builder != null) {
                                    builder.mergeFrom(stringValue2);
                                    this.name_ = builder.buildPartial();
                                }
                            } else if (tag == 18) {
                                StringValue stringValue3 = this.url_;
                                StringValue.Builder builder2 = stringValue3 != null ? stringValue3.toBuilder() : null;
                                StringValue stringValue4 = (StringValue) yVar.readMessage(StringValue.parser(), m5Var);
                                this.url_ = stringValue4;
                                if (builder2 != null) {
                                    builder2.mergeFrom(stringValue4);
                                    this.url_ = builder2.buildPartial();
                                }
                            } else if (tag == 26) {
                                UInt32Value uInt32Value = this.batchSize_;
                                UInt32Value.Builder builder3 = uInt32Value != null ? uInt32Value.toBuilder() : null;
                                UInt32Value uInt32Value2 = (UInt32Value) yVar.readMessage(UInt32Value.parser(), m5Var);
                                this.batchSize_ = uInt32Value2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(uInt32Value2);
                                    this.batchSize_ = builder3.buildPartial();
                                }
                            } else if (tag == 34) {
                                UInt32Value uInt32Value3 = this.interval_;
                                UInt32Value.Builder builder4 = uInt32Value3 != null ? uInt32Value3.toBuilder() : null;
                                UInt32Value uInt32Value4 = (UInt32Value) yVar.readMessage(UInt32Value.parser(), m5Var);
                                this.interval_ = uInt32Value4;
                                if (builder4 != null) {
                                    builder4.mergeFrom(uInt32Value4);
                                    this.interval_ = builder4.buildPartial();
                                }
                            } else if (tag != 42) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                o oVar = this.shouldReport_;
                                n builder5 = oVar != null ? oVar.toBuilder() : null;
                                o oVar2 = (o) yVar.readMessage(o.parser(), m5Var);
                                this.shouldReport_ = oVar2;
                                if (builder5 != null) {
                                    builder5.mergeFrom(oVar2);
                                    this.shouldReport_ = builder5.buildPartial();
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

        public static Configuration parseFrom(InputStream inputStream) throws IOException {
            return (Configuration) k7.parseWithIOException(PARSER, inputStream);
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
        UInt32Value getBatchSize();

        yb getBatchSizeOrBuilder();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        UInt32Value getInterval();

        yb getIntervalOrBuilder();

        StringValue getName();

        ib getNameOrBuilder();

        o getShouldReport();

        p getShouldReportOrBuilder();

        StringValue getUrl();

        ib getUrlOrBuilder();

        boolean hasBatchSize();

        boolean hasInterval();

        boolean hasName();

        boolean hasShouldReport();

        boolean hasUrl();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Record extends k7 implements RecordOrBuilder {
        public static final int ERROR_FIELD_NUMBER = 3;
        public static final int FIELDS_FIELD_NUMBER = 2;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private Error error_;
        private Struct fields_;
        private byte memoizedIsInitialized;
        private Timestamp timestamp_;
        private static final Record DEFAULT_INSTANCE = new Record();
        private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Monitor.Record.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public Record parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new Record(yVar, m5Var);
            }
        };

        public static Record getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Record parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Record) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Record parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Record)) {
                return super.equals(obj);
            }
            Record record = (Record) obj;
            if (hasTimestamp() != record.hasTimestamp()) {
                return false;
            }
            if ((hasTimestamp() && !getTimestamp().equals(record.getTimestamp())) || hasFields() != record.hasFields()) {
                return false;
            }
            if ((!hasFields() || getFields().equals(record.getFields())) && hasError() == record.hasError()) {
                return (!hasError() || getError().equals(record.getError())) && this.unknownFields.equals(record.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public Error getError() {
            Error error = this.error_;
            return error == null ? Error.getDefaultInstance() : error;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public ErrorOrBuilder getErrorOrBuilder() {
            return getError();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public Struct getFields() {
            Struct struct = this.fields_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public jb getFieldsOrBuilder() {
            return getFields();
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
            int iComputeMessageSize = this.timestamp_ != null ? h0.computeMessageSize(1, getTimestamp()) : 0;
            if (this.fields_ != null) {
                iComputeMessageSize += h0.computeMessageSize(2, getFields());
            }
            if (this.error_ != null) {
                iComputeMessageSize += h0.computeMessageSize(3, getError());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public Timestamp getTimestamp() {
            Timestamp timestamp = this.timestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public sb getTimestampOrBuilder() {
            return getTimestamp();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
        public final gc getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public boolean hasError() {
            return this.error_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public boolean hasFields() {
            return this.fields_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public boolean hasTimestamp() {
            return this.timestamp_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTimestamp()) {
                iHashCode = o2.B(iHashCode, 37, 1, 53) + getTimestamp().hashCode();
            }
            if (hasFields()) {
                iHashCode = o2.B(iHashCode, 37, 2, 53) + getFields().hashCode();
            }
            if (hasError()) {
                iHashCode = o2.B(iHashCode, 37, 3, 53) + getError().hashCode();
            }
            int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_fieldAccessorTable.ensureFieldAccessorsInitialized(Record.class, Builder.class);
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
            return new Record();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            if (this.timestamp_ != null) {
                h0Var.writeMessage(1, getTimestamp());
            }
            if (this.fields_ != null) {
                h0Var.writeMessage(2, getFields());
            }
            if (this.error_ != null) {
                h0Var.writeMessage(3, getError());
            }
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements RecordOrBuilder {
            private xa errorBuilder_;
            private Error error_;
            private xa fieldsBuilder_;
            private Struct fields_;
            private xa timestampBuilder_;
            private Timestamp timestamp_;

            private Builder() {
                super(null);
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_descriptor;
            }

            private xa getErrorFieldBuilder() {
                if (this.errorBuilder_ == null) {
                    this.errorBuilder_ = new xa(getError(), getParentForChildren(), isClean());
                    this.error_ = null;
                }
                return this.errorBuilder_;
            }

            private xa getFieldsFieldBuilder() {
                if (this.fieldsBuilder_ == null) {
                    this.fieldsBuilder_ = new xa(getFields(), getParentForChildren(), isClean());
                    this.fields_ = null;
                }
                return this.fieldsBuilder_;
            }

            private xa getTimestampFieldBuilder() {
                if (this.timestampBuilder_ == null) {
                    this.timestampBuilder_ = new xa(getTimestamp(), getParentForChildren(), isClean());
                    this.timestamp_ = null;
                }
                return this.timestampBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = k7.alwaysUseFieldBuilders;
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

            public Builder clearFields() {
                if (this.fieldsBuilder_ == null) {
                    this.fields_ = null;
                    onChanged();
                    return this;
                }
                this.fields_ = null;
                this.fieldsBuilder_ = null;
                return this;
            }

            public Builder clearTimestamp() {
                if (this.timestampBuilder_ == null) {
                    this.timestamp_ = null;
                    onChanged();
                    return this;
                }
                this.timestamp_ = null;
                this.timestampBuilder_ = null;
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
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

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public ErrorOrBuilder getErrorOrBuilder() {
                xa xaVar = this.errorBuilder_;
                if (xaVar != null) {
                    return (ErrorOrBuilder) xaVar.getMessageOrBuilder();
                }
                Error error = this.error_;
                return error == null ? Error.getDefaultInstance() : error;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public Struct getFields() {
                xa xaVar = this.fieldsBuilder_;
                if (xaVar != null) {
                    return (Struct) xaVar.getMessage();
                }
                Struct struct = this.fields_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            public Struct.Builder getFieldsBuilder() {
                onChanged();
                return (Struct.Builder) getFieldsFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public jb getFieldsOrBuilder() {
                xa xaVar = this.fieldsBuilder_;
                if (xaVar != null) {
                    return (jb) xaVar.getMessageOrBuilder();
                }
                Struct struct = this.fields_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public Timestamp getTimestamp() {
                xa xaVar = this.timestampBuilder_;
                if (xaVar != null) {
                    return (Timestamp) xaVar.getMessage();
                }
                Timestamp timestamp = this.timestamp_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }

            public Timestamp.Builder getTimestampBuilder() {
                onChanged();
                return (Timestamp.Builder) getTimestampFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public sb getTimestampOrBuilder() {
                xa xaVar = this.timestampBuilder_;
                if (xaVar != null) {
                    return (sb) xaVar.getMessageOrBuilder();
                }
                Timestamp timestamp = this.timestamp_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public boolean hasError() {
                return (this.errorBuilder_ == null && this.error_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public boolean hasFields() {
                return (this.fieldsBuilder_ == null && this.fields_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public boolean hasTimestamp() {
                return (this.timestampBuilder_ == null && this.timestamp_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_fieldAccessorTable.ensureFieldAccessorsInitialized(Record.class, Builder.class);
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

            public Builder mergeFields(Struct struct) {
                xa xaVar = this.fieldsBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(struct);
                    return this;
                }
                Struct struct2 = this.fields_;
                if (struct2 != null) {
                    this.fields_ = a.i(struct2, struct);
                } else {
                    this.fields_ = struct;
                }
                onChanged();
                return this;
            }

            public Builder mergeTimestamp(Timestamp timestamp) {
                xa xaVar = this.timestampBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(timestamp);
                    return this;
                }
                Timestamp timestamp2 = this.timestamp_;
                if (timestamp2 != null) {
                    this.timestamp_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                } else {
                    this.timestamp_ = timestamp;
                }
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

            public Builder setFields(Struct struct) {
                xa xaVar = this.fieldsBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(struct);
                    return this;
                }
                struct.getClass();
                this.fields_ = struct;
                onChanged();
                return this;
            }

            public Builder setTimestamp(Timestamp timestamp) {
                xa xaVar = this.timestampBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(timestamp);
                    return this;
                }
                timestamp.getClass();
                this.timestamp_ = timestamp;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Record build() {
                Record recordBuildPartial = buildPartial();
                if (recordBuildPartial.isInitialized()) {
                    return recordBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) recordBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Record buildPartial() {
                Record record = new Record(this);
                xa xaVar = this.timestampBuilder_;
                if (xaVar == null) {
                    record.timestamp_ = this.timestamp_;
                } else {
                    record.timestamp_ = (Timestamp) xaVar.build();
                }
                xa xaVar2 = this.fieldsBuilder_;
                if (xaVar2 == null) {
                    record.fields_ = this.fields_;
                } else {
                    record.fields_ = (Struct) xaVar2.build();
                }
                xa xaVar3 = this.errorBuilder_;
                if (xaVar3 == null) {
                    record.error_ = this.error_;
                } else {
                    record.error_ = (Error) xaVar3.build();
                }
                onBuilt();
                return record;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Record getDefaultInstanceForType() {
                return Record.getDefaultInstance();
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
                if (this.timestampBuilder_ == null) {
                    this.timestamp_ = null;
                } else {
                    this.timestamp_ = null;
                    this.timestampBuilder_ = null;
                }
                if (this.fieldsBuilder_ == null) {
                    this.fields_ = null;
                } else {
                    this.fields_ = null;
                    this.fieldsBuilder_ = null;
                }
                if (this.errorBuilder_ == null) {
                    this.error_ = null;
                    return this;
                }
                this.error_ = null;
                this.errorBuilder_ = null;
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

            public Builder setFields(Struct.Builder builder) {
                xa xaVar = this.fieldsBuilder_;
                if (xaVar == null) {
                    this.fields_ = builder.build();
                    onChanged();
                    return this;
                }
                xaVar.setMessage(builder.build());
                return this;
            }

            public Builder setTimestamp(Timestamp.Builder builder) {
                xa xaVar = this.timestampBuilder_;
                if (xaVar == null) {
                    this.timestamp_ = builder.build();
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
                if (message instanceof Record) {
                    return mergeFrom((Record) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Record record) {
                if (record == Record.getDefaultInstance()) {
                    return this;
                }
                if (record.hasTimestamp()) {
                    mergeTimestamp(record.getTimestamp());
                }
                if (record.hasFields()) {
                    mergeFields(record.getFields());
                }
                if (record.hasError()) {
                    mergeError(record.getError());
                }
                mergeUnknownFields(((k7) record).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public io.bidmachine.protobuf.sdk.Monitor.Record.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sdk.Monitor.Record.access$2000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sdk.Monitor$Record r3 = (io.bidmachine.protobuf.sdk.Monitor.Record) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sdk.Monitor$Record r4 = (io.bidmachine.protobuf.sdk.Monitor.Record) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Monitor.Record.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sdk.Monitor$Record$Builder");
            }
        }

        public static Builder newBuilder(Record record) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(record);
        }

        public static Record parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private Record(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Record parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Record) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static Record parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Record getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Record parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Record() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Record parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static Record parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(bArr, m5Var);
        }

        private Record(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                    Timestamp timestamp = this.timestamp_;
                                    Timestamp.Builder builder = timestamp != null ? timestamp.toBuilder() : null;
                                    Timestamp timestamp2 = (Timestamp) yVar.readMessage(Timestamp.parser(), m5Var);
                                    this.timestamp_ = timestamp2;
                                    if (builder != null) {
                                        builder.mergeFrom(timestamp2);
                                        this.timestamp_ = builder.buildPartial();
                                    }
                                } else if (tag == 18) {
                                    Struct struct = this.fields_;
                                    Struct.Builder builder2 = struct != null ? struct.toBuilder() : null;
                                    Struct struct2 = (Struct) yVar.readMessage(Struct.parser(), m5Var);
                                    this.fields_ = struct2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(struct2);
                                        this.fields_ = builder2.buildPartial();
                                    }
                                } else if (tag != 26) {
                                    if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                    }
                                } else {
                                    Error error = this.error_;
                                    Error.Builder builder3 = error != null ? error.toBuilder() : null;
                                    Error error2 = (Error) yVar.readMessage(Error.parser(), m5Var);
                                    this.error_ = error2;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(error2);
                                        this.error_ = builder3.buildPartial();
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

        public static Record parseFrom(InputStream inputStream) throws IOException {
            return (Record) k7.parseWithIOException(PARSER, inputStream);
        }

        public static Record parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Record) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static Record parseFrom(y yVar) throws IOException {
            return (Record) k7.parseWithIOException(PARSER, yVar);
        }

        public static Record parseFrom(y yVar, m5 m5Var) throws IOException {
            return (Record) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface RecordOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        Error getError();

        ErrorOrBuilder getErrorOrBuilder();

        Struct getFields();

        jb getFieldsOrBuilder();

        Timestamp getTimestamp();

        sb getTimestampOrBuilder();

        boolean hasError();

        boolean hasFields();

        boolean hasTimestamp();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static Monitor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Monitor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Monitor) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Monitor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Monitor) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Monitor)) {
            return super.equals(obj);
        }
        Monitor monitor = (Monitor) obj;
        return getName().equals(monitor.getName()) && getRecordsList().equals(monitor.getRecordsList()) && this.unknownFields.equals(monitor.unknownFields);
    }

    @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
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

    @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
    public Record getRecords(int i10) {
        return this.records_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
    public int getRecordsCount() {
        return this.records_.size();
    }

    @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
    public List<Record> getRecordsList() {
        return this.records_;
    }

    @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
    public RecordOrBuilder getRecordsOrBuilder(int i10) {
        return this.records_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
    public List<? extends RecordOrBuilder> getRecordsOrBuilderList() {
        return this.records_;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getNameBytes().isEmpty() ? k7.computeStringSize(1, this.name_) : 0;
        for (int i11 = 0; i11 < this.records_.size(); i11++) {
            iComputeStringSize += h0.computeMessageSize(2, this.records_.get(i11));
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
        int iHashCode = getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
        if (getRecordsCount() > 0) {
            iHashCode = getRecordsList().hashCode() + o2.B(iHashCode, 37, 2, 53);
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_fieldAccessorTable.ensureFieldAccessorsInitialized(Monitor.class, Builder.class);
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
        return new Monitor();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (!getNameBytes().isEmpty()) {
            k7.writeString(h0Var, 1, this.name_);
        }
        for (int i10 = 0; i10 < this.records_.size(); i10++) {
            h0Var.writeMessage(2, this.records_.get(i10));
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements MonitorOrBuilder {
        private int bitField0_;
        private Object name_;
        private pa recordsBuilder_;
        private List<Record> records_;

        private Builder() {
            super(null);
            this.name_ = "";
            this.records_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        private void ensureRecordsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.records_ = new ArrayList(this.records_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_descriptor;
        }

        private pa getRecordsFieldBuilder() {
            if (this.recordsBuilder_ == null) {
                this.recordsBuilder_ = new pa(this.records_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.records_ = null;
            }
            return this.recordsBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (k7.alwaysUseFieldBuilders) {
                getRecordsFieldBuilder();
            }
        }

        public Builder addAllRecords(Iterable<? extends Record> iterable) {
            pa paVar = this.recordsBuilder_;
            if (paVar != null) {
                paVar.addAllMessages(iterable);
                return this;
            }
            ensureRecordsIsMutable();
            b.a.addAll((Iterable) iterable, (List) this.records_);
            onChanged();
            return this;
        }

        public Builder addRecords(Record record) {
            pa paVar = this.recordsBuilder_;
            if (paVar != null) {
                paVar.addMessage(record);
                return this;
            }
            record.getClass();
            ensureRecordsIsMutable();
            this.records_.add(record);
            onChanged();
            return this;
        }

        public Record.Builder addRecordsBuilder() {
            return (Record.Builder) getRecordsFieldBuilder().addBuilder(Record.getDefaultInstance());
        }

        public Builder clearName() {
            this.name_ = Monitor.getDefaultInstance().getName();
            onChanged();
            return this;
        }

        public Builder clearRecords() {
            pa paVar = this.recordsBuilder_;
            if (paVar != null) {
                paVar.clear();
                return this;
            }
            this.records_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
        public Record getRecords(int i10) {
            pa paVar = this.recordsBuilder_;
            return paVar == null ? this.records_.get(i10) : (Record) paVar.getMessage(i10);
        }

        public Record.Builder getRecordsBuilder(int i10) {
            return (Record.Builder) getRecordsFieldBuilder().getBuilder(i10);
        }

        public List<Record.Builder> getRecordsBuilderList() {
            return getRecordsFieldBuilder().getBuilderList();
        }

        @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
        public int getRecordsCount() {
            pa paVar = this.recordsBuilder_;
            return paVar == null ? this.records_.size() : paVar.getCount();
        }

        @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
        public List<Record> getRecordsList() {
            pa paVar = this.recordsBuilder_;
            return paVar == null ? Collections.unmodifiableList(this.records_) : paVar.getMessageList();
        }

        @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
        public RecordOrBuilder getRecordsOrBuilder(int i10) {
            pa paVar = this.recordsBuilder_;
            return paVar == null ? this.records_.get(i10) : (RecordOrBuilder) paVar.getMessageOrBuilder(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
        public List<? extends RecordOrBuilder> getRecordsOrBuilderList() {
            pa paVar = this.recordsBuilder_;
            return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.records_);
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_fieldAccessorTable.ensureFieldAccessorsInitialized(Monitor.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder removeRecords(int i10) {
            pa paVar = this.recordsBuilder_;
            if (paVar != null) {
                paVar.remove(i10);
                return this;
            }
            ensureRecordsIsMutable();
            this.records_.remove(i10);
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

        public Builder setRecords(int i10, Record record) {
            pa paVar = this.recordsBuilder_;
            if (paVar != null) {
                paVar.setMessage(i10, record);
                return this;
            }
            record.getClass();
            ensureRecordsIsMutable();
            this.records_.set(i10, record);
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Monitor build() {
            Monitor monitorBuildPartial = buildPartial();
            if (monitorBuildPartial.isInitialized()) {
                return monitorBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) monitorBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Monitor buildPartial() {
            Monitor monitor = new Monitor(this);
            monitor.name_ = this.name_;
            pa paVar = this.recordsBuilder_;
            if (paVar != null) {
                monitor.records_ = paVar.build();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.records_ = Collections.unmodifiableList(this.records_);
                    this.bitField0_ &= -2;
                }
                monitor.records_ = this.records_;
            }
            onBuilt();
            return monitor;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Monitor getDefaultInstanceForType() {
            return Monitor.getDefaultInstance();
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

        public Record.Builder addRecordsBuilder(int i10) {
            return (Record.Builder) getRecordsFieldBuilder().addBuilder(i10, Record.getDefaultInstance());
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
            pa paVar = this.recordsBuilder_;
            if (paVar == null) {
                this.records_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                return this;
            }
            paVar.clear();
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            this.name_ = "";
            this.records_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public Builder addRecords(int i10, Record record) {
            pa paVar = this.recordsBuilder_;
            if (paVar == null) {
                record.getClass();
                ensureRecordsIsMutable();
                this.records_.add(i10, record);
                onChanged();
                return this;
            }
            paVar.addMessage(i10, record);
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
        /* renamed from: clone */
        public Builder mo500clone() {
            return (Builder) super.mo500clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Monitor) {
                return mergeFrom((Monitor) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setRecords(int i10, Record.Builder builder) {
            pa paVar = this.recordsBuilder_;
            if (paVar == null) {
                ensureRecordsIsMutable();
                this.records_.set(i10, builder.build());
                onChanged();
                return this;
            }
            paVar.setMessage(i10, builder.build());
            return this;
        }

        public Builder mergeFrom(Monitor monitor) {
            if (monitor == Monitor.getDefaultInstance()) {
                return this;
            }
            if (!monitor.getName().isEmpty()) {
                this.name_ = monitor.name_;
                onChanged();
            }
            if (this.recordsBuilder_ == null) {
                if (!monitor.records_.isEmpty()) {
                    if (this.records_.isEmpty()) {
                        this.records_ = monitor.records_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureRecordsIsMutable();
                        this.records_.addAll(monitor.records_);
                    }
                    onChanged();
                }
            } else if (!monitor.records_.isEmpty()) {
                if (!this.recordsBuilder_.isEmpty()) {
                    this.recordsBuilder_.addAllMessages(monitor.records_);
                } else {
                    this.recordsBuilder_.dispose();
                    this.recordsBuilder_ = null;
                    this.records_ = monitor.records_;
                    this.bitField0_ &= -2;
                    this.recordsBuilder_ = k7.alwaysUseFieldBuilders ? getRecordsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((k7) monitor).unknownFields);
            onChanged();
            return this;
        }

        public Builder addRecords(Record.Builder builder) {
            pa paVar = this.recordsBuilder_;
            if (paVar == null) {
                ensureRecordsIsMutable();
                this.records_.add(builder.build());
                onChanged();
                return this;
            }
            paVar.addMessage(builder.build());
            return this;
        }

        public Builder addRecords(int i10, Record.Builder builder) {
            pa paVar = this.recordsBuilder_;
            if (paVar == null) {
                ensureRecordsIsMutable();
                this.records_.add(i10, builder.build());
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
        public io.bidmachine.protobuf.sdk.Monitor.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sdk.Monitor.access$3000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.sdk.Monitor r3 = (io.bidmachine.protobuf.sdk.Monitor) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.sdk.Monitor r4 = (io.bidmachine.protobuf.sdk.Monitor) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Monitor.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sdk.Monitor$Builder");
        }
    }

    public static Builder newBuilder(Monitor monitor) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(monitor);
    }

    public static Monitor parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (Monitor) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private Monitor(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Monitor parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Monitor) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static Monitor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Monitor) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Monitor getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Monitor parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (Monitor) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Monitor() {
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.records_ = Collections.EMPTY_LIST;
    }

    public static Monitor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Monitor) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static Monitor parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (Monitor) PARSER.parseFrom(bArr, m5Var);
    }

    public static Monitor parseFrom(InputStream inputStream) throws IOException {
        return (Monitor) k7.parseWithIOException(PARSER, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Monitor(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                            this.name_ = yVar.readStringRequireUtf8();
                        } else if (tag != 18) {
                            if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                            }
                        } else {
                            if (!z11) {
                                this.records_ = new ArrayList();
                                z11 = true;
                            }
                            this.records_.add(yVar.readMessage(Record.parser(), m5Var));
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
                    this.records_ = Collections.unmodifiableList(this.records_);
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z11) {
            this.records_ = Collections.unmodifiableList(this.records_);
        }
        this.unknownFields = ccVarNewBuilder.build();
        makeExtensionsImmutable();
    }

    public static Monitor parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Monitor) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static Monitor parseFrom(y yVar) throws IOException {
        return (Monitor) k7.parseWithIOException(PARSER, yVar);
    }

    public static Monitor parseFrom(y yVar, m5 m5Var) throws IOException {
        return (Monitor) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
