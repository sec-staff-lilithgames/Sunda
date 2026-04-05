package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.cc;
import com.explorestack.protobuf.d;
import com.explorestack.protobuf.fa;
import com.explorestack.protobuf.gc;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.ib;
import com.explorestack.protobuf.j7;
import com.explorestack.protobuf.k7;
import com.explorestack.protobuf.m5;
import com.explorestack.protobuf.o6;
import com.explorestack.protobuf.p6;
import com.explorestack.protobuf.pa;
import com.explorestack.protobuf.xa;
import com.explorestack.protobuf.y;
import e3.g;
import io.bidmachine.protobuf.sdk.Monitor;
import io.bidmachine.protobuf.sdk.Reader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class Configuration extends k7 implements ConfigurationOrBuilder {
    public static final int BPK_FIELD_NUMBER = 3;
    public static final int MONITORS_FIELD_NUMBER = 1;
    public static final int READERS_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private StringValue bpk_;
    private byte memoizedIsInitialized;
    private List<Monitor.Configuration> monitors_;
    private List<Reader.Configuration> readers_;
    private static final Configuration DEFAULT_INSTANCE = new Configuration();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Configuration.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public Configuration parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new Configuration(yVar, m5Var);
        }
    };

    public static Configuration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_descriptor;
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
        if (getMonitorsList().equals(configuration.getMonitorsList()) && getReadersList().equals(configuration.getReadersList()) && hasBpk() == configuration.hasBpk()) {
            return (!hasBpk() || getBpk().equals(configuration.getBpk())) && this.unknownFields.equals(configuration.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public StringValue getBpk() {
        StringValue stringValue = this.bpk_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public ib getBpkOrBuilder() {
        return getBpk();
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public Monitor.Configuration getMonitors(int i10) {
        return this.monitors_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public int getMonitorsCount() {
        return this.monitors_.size();
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public List<Monitor.Configuration> getMonitorsList() {
        return this.monitors_;
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public Monitor.ConfigurationOrBuilder getMonitorsOrBuilder(int i10) {
        return this.monitors_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public List<? extends Monitor.ConfigurationOrBuilder> getMonitorsOrBuilderList() {
        return this.monitors_;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public Reader.Configuration getReaders(int i10) {
        return this.readers_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public int getReadersCount() {
        return this.readers_.size();
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public List<Reader.Configuration> getReadersList() {
        return this.readers_;
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public Reader.ConfigurationOrBuilder getReadersOrBuilder(int i10) {
        return this.readers_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public List<? extends Reader.ConfigurationOrBuilder> getReadersOrBuilderList() {
        return this.readers_;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeMessageSize = 0;
        for (int i11 = 0; i11 < this.monitors_.size(); i11++) {
            iComputeMessageSize += h0.computeMessageSize(1, this.monitors_.get(i11));
        }
        for (int i12 = 0; i12 < this.readers_.size(); i12++) {
            iComputeMessageSize += h0.computeMessageSize(2, this.readers_.get(i12));
        }
        if (this.bpk_ != null) {
            iComputeMessageSize += h0.computeMessageSize(3, getBpk());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public boolean hasBpk() {
        return this.bpk_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getMonitorsCount() > 0) {
            iHashCode = o2.B(iHashCode, 37, 1, 53) + getMonitorsList().hashCode();
        }
        if (getReadersCount() > 0) {
            iHashCode = o2.B(iHashCode, 37, 2, 53) + getReadersList().hashCode();
        }
        if (hasBpk()) {
            iHashCode = o2.B(iHashCode, 37, 3, 53) + getBpk().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_fieldAccessorTable.ensureFieldAccessorsInitialized(Configuration.class, Builder.class);
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
        for (int i10 = 0; i10 < this.monitors_.size(); i10++) {
            h0Var.writeMessage(1, this.monitors_.get(i10));
        }
        for (int i11 = 0; i11 < this.readers_.size(); i11++) {
            h0Var.writeMessage(2, this.readers_.get(i11));
        }
        if (this.bpk_ != null) {
            h0Var.writeMessage(3, getBpk());
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements ConfigurationOrBuilder {
        private int bitField0_;
        private xa bpkBuilder_;
        private StringValue bpk_;
        private pa monitorsBuilder_;
        private List<Monitor.Configuration> monitors_;
        private pa readersBuilder_;
        private List<Reader.Configuration> readers_;

        private void ensureMonitorsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.monitors_ = new ArrayList(this.monitors_);
                this.bitField0_ |= 1;
            }
        }

        private void ensureReadersIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.readers_ = new ArrayList(this.readers_);
                this.bitField0_ |= 2;
            }
        }

        private xa getBpkFieldBuilder() {
            if (this.bpkBuilder_ == null) {
                this.bpkBuilder_ = new xa(getBpk(), getParentForChildren(), isClean());
                this.bpk_ = null;
            }
            return this.bpkBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_descriptor;
        }

        private pa getMonitorsFieldBuilder() {
            if (this.monitorsBuilder_ == null) {
                this.monitorsBuilder_ = new pa(this.monitors_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.monitors_ = null;
            }
            return this.monitorsBuilder_;
        }

        private pa getReadersFieldBuilder() {
            if (this.readersBuilder_ == null) {
                this.readersBuilder_ = new pa(this.readers_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.readers_ = null;
            }
            return this.readersBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (k7.alwaysUseFieldBuilders) {
                getMonitorsFieldBuilder();
                getReadersFieldBuilder();
            }
        }

        public Builder addAllMonitors(Iterable<? extends Monitor.Configuration> iterable) {
            pa paVar = this.monitorsBuilder_;
            if (paVar != null) {
                paVar.addAllMessages(iterable);
                return this;
            }
            ensureMonitorsIsMutable();
            b.a.addAll((Iterable) iterable, (List) this.monitors_);
            onChanged();
            return this;
        }

        public Builder addAllReaders(Iterable<? extends Reader.Configuration> iterable) {
            pa paVar = this.readersBuilder_;
            if (paVar != null) {
                paVar.addAllMessages(iterable);
                return this;
            }
            ensureReadersIsMutable();
            b.a.addAll((Iterable) iterable, (List) this.readers_);
            onChanged();
            return this;
        }

        public Builder addMonitors(Monitor.Configuration configuration) {
            pa paVar = this.monitorsBuilder_;
            if (paVar != null) {
                paVar.addMessage(configuration);
                return this;
            }
            configuration.getClass();
            ensureMonitorsIsMutable();
            this.monitors_.add(configuration);
            onChanged();
            return this;
        }

        public Monitor.Configuration.Builder addMonitorsBuilder() {
            return (Monitor.Configuration.Builder) getMonitorsFieldBuilder().addBuilder(Monitor.Configuration.getDefaultInstance());
        }

        public Builder addReaders(Reader.Configuration configuration) {
            pa paVar = this.readersBuilder_;
            if (paVar != null) {
                paVar.addMessage(configuration);
                return this;
            }
            configuration.getClass();
            ensureReadersIsMutable();
            this.readers_.add(configuration);
            onChanged();
            return this;
        }

        public Reader.Configuration.Builder addReadersBuilder() {
            return (Reader.Configuration.Builder) getReadersFieldBuilder().addBuilder(Reader.Configuration.getDefaultInstance());
        }

        public Builder clearBpk() {
            if (this.bpkBuilder_ == null) {
                this.bpk_ = null;
                onChanged();
                return this;
            }
            this.bpk_ = null;
            this.bpkBuilder_ = null;
            return this;
        }

        public Builder clearMonitors() {
            pa paVar = this.monitorsBuilder_;
            if (paVar != null) {
                paVar.clear();
                return this;
            }
            this.monitors_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearReaders() {
            pa paVar = this.readersBuilder_;
            if (paVar != null) {
                paVar.clear();
                return this;
            }
            this.readers_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public StringValue getBpk() {
            xa xaVar = this.bpkBuilder_;
            if (xaVar != null) {
                return (StringValue) xaVar.getMessage();
            }
            StringValue stringValue = this.bpk_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        public StringValue.Builder getBpkBuilder() {
            onChanged();
            return (StringValue.Builder) getBpkFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public ib getBpkOrBuilder() {
            xa xaVar = this.bpkBuilder_;
            if (xaVar != null) {
                return (ib) xaVar.getMessageOrBuilder();
            }
            StringValue stringValue = this.bpk_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public Monitor.Configuration getMonitors(int i10) {
            pa paVar = this.monitorsBuilder_;
            return paVar == null ? this.monitors_.get(i10) : (Monitor.Configuration) paVar.getMessage(i10);
        }

        public Monitor.Configuration.Builder getMonitorsBuilder(int i10) {
            return (Monitor.Configuration.Builder) getMonitorsFieldBuilder().getBuilder(i10);
        }

        public List<Monitor.Configuration.Builder> getMonitorsBuilderList() {
            return getMonitorsFieldBuilder().getBuilderList();
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public int getMonitorsCount() {
            pa paVar = this.monitorsBuilder_;
            return paVar == null ? this.monitors_.size() : paVar.getCount();
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public List<Monitor.Configuration> getMonitorsList() {
            pa paVar = this.monitorsBuilder_;
            return paVar == null ? Collections.unmodifiableList(this.monitors_) : paVar.getMessageList();
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public Monitor.ConfigurationOrBuilder getMonitorsOrBuilder(int i10) {
            pa paVar = this.monitorsBuilder_;
            return paVar == null ? this.monitors_.get(i10) : (Monitor.ConfigurationOrBuilder) paVar.getMessageOrBuilder(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public List<? extends Monitor.ConfigurationOrBuilder> getMonitorsOrBuilderList() {
            pa paVar = this.monitorsBuilder_;
            return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.monitors_);
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public Reader.Configuration getReaders(int i10) {
            pa paVar = this.readersBuilder_;
            return paVar == null ? this.readers_.get(i10) : (Reader.Configuration) paVar.getMessage(i10);
        }

        public Reader.Configuration.Builder getReadersBuilder(int i10) {
            return (Reader.Configuration.Builder) getReadersFieldBuilder().getBuilder(i10);
        }

        public List<Reader.Configuration.Builder> getReadersBuilderList() {
            return getReadersFieldBuilder().getBuilderList();
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public int getReadersCount() {
            pa paVar = this.readersBuilder_;
            return paVar == null ? this.readers_.size() : paVar.getCount();
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public List<Reader.Configuration> getReadersList() {
            pa paVar = this.readersBuilder_;
            return paVar == null ? Collections.unmodifiableList(this.readers_) : paVar.getMessageList();
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public Reader.ConfigurationOrBuilder getReadersOrBuilder(int i10) {
            pa paVar = this.readersBuilder_;
            return paVar == null ? this.readers_.get(i10) : (Reader.ConfigurationOrBuilder) paVar.getMessageOrBuilder(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public List<? extends Reader.ConfigurationOrBuilder> getReadersOrBuilderList() {
            pa paVar = this.readersBuilder_;
            return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.readers_);
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public boolean hasBpk() {
            return (this.bpkBuilder_ == null && this.bpk_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_fieldAccessorTable.ensureFieldAccessorsInitialized(Configuration.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeBpk(StringValue stringValue) {
            xa xaVar = this.bpkBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(stringValue);
                return this;
            }
            StringValue stringValue2 = this.bpk_;
            if (stringValue2 != null) {
                this.bpk_ = g.h(stringValue2, stringValue);
            } else {
                this.bpk_ = stringValue;
            }
            onChanged();
            return this;
        }

        public Builder removeMonitors(int i10) {
            pa paVar = this.monitorsBuilder_;
            if (paVar != null) {
                paVar.remove(i10);
                return this;
            }
            ensureMonitorsIsMutable();
            this.monitors_.remove(i10);
            onChanged();
            return this;
        }

        public Builder removeReaders(int i10) {
            pa paVar = this.readersBuilder_;
            if (paVar != null) {
                paVar.remove(i10);
                return this;
            }
            ensureReadersIsMutable();
            this.readers_.remove(i10);
            onChanged();
            return this;
        }

        public Builder setBpk(StringValue stringValue) {
            xa xaVar = this.bpkBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(stringValue);
                return this;
            }
            stringValue.getClass();
            this.bpk_ = stringValue;
            onChanged();
            return this;
        }

        public Builder setMonitors(int i10, Monitor.Configuration configuration) {
            pa paVar = this.monitorsBuilder_;
            if (paVar != null) {
                paVar.setMessage(i10, configuration);
                return this;
            }
            configuration.getClass();
            ensureMonitorsIsMutable();
            this.monitors_.set(i10, configuration);
            onChanged();
            return this;
        }

        public Builder setReaders(int i10, Reader.Configuration configuration) {
            pa paVar = this.readersBuilder_;
            if (paVar != null) {
                paVar.setMessage(i10, configuration);
                return this;
            }
            configuration.getClass();
            ensureReadersIsMutable();
            this.readers_.set(i10, configuration);
            onChanged();
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            List list = Collections.EMPTY_LIST;
            this.monitors_ = list;
            this.readers_ = list;
            maybeForceBuilderInitialization();
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
            int i10 = this.bitField0_;
            pa paVar = this.monitorsBuilder_;
            if (paVar == null) {
                if ((i10 & 1) != 0) {
                    this.monitors_ = Collections.unmodifiableList(this.monitors_);
                    this.bitField0_ &= -2;
                }
                configuration.monitors_ = this.monitors_;
            } else {
                configuration.monitors_ = paVar.build();
            }
            pa paVar2 = this.readersBuilder_;
            if (paVar2 != null) {
                configuration.readers_ = paVar2.build();
            } else {
                if ((this.bitField0_ & 2) != 0) {
                    this.readers_ = Collections.unmodifiableList(this.readers_);
                    this.bitField0_ &= -3;
                }
                configuration.readers_ = this.readers_;
            }
            xa xaVar = this.bpkBuilder_;
            if (xaVar == null) {
                configuration.bpk_ = this.bpk_;
            } else {
                configuration.bpk_ = (StringValue) xaVar.build();
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

        public Monitor.Configuration.Builder addMonitorsBuilder(int i10) {
            return (Monitor.Configuration.Builder) getMonitorsFieldBuilder().addBuilder(i10, Monitor.Configuration.getDefaultInstance());
        }

        public Reader.Configuration.Builder addReadersBuilder(int i10) {
            return (Reader.Configuration.Builder) getReadersFieldBuilder().addBuilder(i10, Reader.Configuration.getDefaultInstance());
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
            pa paVar = this.monitorsBuilder_;
            if (paVar == null) {
                this.monitors_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
            } else {
                paVar.clear();
            }
            pa paVar2 = this.readersBuilder_;
            if (paVar2 == null) {
                this.readers_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
            } else {
                paVar2.clear();
            }
            if (this.bpkBuilder_ == null) {
                this.bpk_ = null;
                return this;
            }
            this.bpk_ = null;
            this.bpkBuilder_ = null;
            return this;
        }

        public Builder setBpk(StringValue.Builder builder) {
            xa xaVar = this.bpkBuilder_;
            if (xaVar == null) {
                this.bpk_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        private Builder() {
            super(null);
            List list = Collections.EMPTY_LIST;
            this.monitors_ = list;
            this.readers_ = list;
            maybeForceBuilderInitialization();
        }

        public Builder addMonitors(int i10, Monitor.Configuration configuration) {
            pa paVar = this.monitorsBuilder_;
            if (paVar == null) {
                configuration.getClass();
                ensureMonitorsIsMutable();
                this.monitors_.add(i10, configuration);
                onChanged();
                return this;
            }
            paVar.addMessage(i10, configuration);
            return this;
        }

        public Builder addReaders(int i10, Reader.Configuration configuration) {
            pa paVar = this.readersBuilder_;
            if (paVar == null) {
                configuration.getClass();
                ensureReadersIsMutable();
                this.readers_.add(i10, configuration);
                onChanged();
                return this;
            }
            paVar.addMessage(i10, configuration);
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

        public Builder setMonitors(int i10, Monitor.Configuration.Builder builder) {
            pa paVar = this.monitorsBuilder_;
            if (paVar == null) {
                ensureMonitorsIsMutable();
                this.monitors_.set(i10, builder.build());
                onChanged();
                return this;
            }
            paVar.setMessage(i10, builder.build());
            return this;
        }

        public Builder setReaders(int i10, Reader.Configuration.Builder builder) {
            pa paVar = this.readersBuilder_;
            if (paVar == null) {
                ensureReadersIsMutable();
                this.readers_.set(i10, builder.build());
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
            if (this.monitorsBuilder_ == null) {
                if (!configuration.monitors_.isEmpty()) {
                    if (this.monitors_.isEmpty()) {
                        this.monitors_ = configuration.monitors_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMonitorsIsMutable();
                        this.monitors_.addAll(configuration.monitors_);
                    }
                    onChanged();
                }
            } else if (!configuration.monitors_.isEmpty()) {
                if (!this.monitorsBuilder_.isEmpty()) {
                    this.monitorsBuilder_.addAllMessages(configuration.monitors_);
                } else {
                    this.monitorsBuilder_.dispose();
                    this.monitorsBuilder_ = null;
                    this.monitors_ = configuration.monitors_;
                    this.bitField0_ &= -2;
                    this.monitorsBuilder_ = k7.alwaysUseFieldBuilders ? getMonitorsFieldBuilder() : null;
                }
            }
            if (this.readersBuilder_ == null) {
                if (!configuration.readers_.isEmpty()) {
                    if (this.readers_.isEmpty()) {
                        this.readers_ = configuration.readers_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureReadersIsMutable();
                        this.readers_.addAll(configuration.readers_);
                    }
                    onChanged();
                }
            } else if (!configuration.readers_.isEmpty()) {
                if (!this.readersBuilder_.isEmpty()) {
                    this.readersBuilder_.addAllMessages(configuration.readers_);
                } else {
                    this.readersBuilder_.dispose();
                    this.readersBuilder_ = null;
                    this.readers_ = configuration.readers_;
                    this.bitField0_ &= -3;
                    this.readersBuilder_ = k7.alwaysUseFieldBuilders ? getReadersFieldBuilder() : null;
                }
            }
            if (configuration.hasBpk()) {
                mergeBpk(configuration.getBpk());
            }
            mergeUnknownFields(((k7) configuration).unknownFields);
            onChanged();
            return this;
        }

        public Builder addMonitors(Monitor.Configuration.Builder builder) {
            pa paVar = this.monitorsBuilder_;
            if (paVar == null) {
                ensureMonitorsIsMutable();
                this.monitors_.add(builder.build());
                onChanged();
                return this;
            }
            paVar.addMessage(builder.build());
            return this;
        }

        public Builder addReaders(Reader.Configuration.Builder builder) {
            pa paVar = this.readersBuilder_;
            if (paVar == null) {
                ensureReadersIsMutable();
                this.readers_.add(builder.build());
                onChanged();
                return this;
            }
            paVar.addMessage(builder.build());
            return this;
        }

        public Builder addMonitors(int i10, Monitor.Configuration.Builder builder) {
            pa paVar = this.monitorsBuilder_;
            if (paVar == null) {
                ensureMonitorsIsMutable();
                this.monitors_.add(i10, builder.build());
                onChanged();
                return this;
            }
            paVar.addMessage(i10, builder.build());
            return this;
        }

        public Builder addReaders(int i10, Reader.Configuration.Builder builder) {
            pa paVar = this.readersBuilder_;
            if (paVar == null) {
                ensureReadersIsMutable();
                this.readers_.add(i10, builder.build());
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
        public io.bidmachine.protobuf.sdk.Configuration.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sdk.Configuration.access$1000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.sdk.Configuration r3 = (io.bidmachine.protobuf.sdk.Configuration) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.sdk.Configuration r4 = (io.bidmachine.protobuf.sdk.Configuration) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Configuration.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sdk.Configuration$Builder");
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
        List list = Collections.EMPTY_LIST;
        this.monitors_ = list;
        this.readers_ = list;
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
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int tag = yVar.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                if ((i10 & 1) == 0) {
                                    this.monitors_ = new ArrayList();
                                    i10 |= 1;
                                }
                                this.monitors_.add(yVar.readMessage(Monitor.Configuration.parser(), m5Var));
                            } else if (tag == 18) {
                                if ((i10 & 2) == 0) {
                                    this.readers_ = new ArrayList();
                                    i10 |= 2;
                                }
                                this.readers_.add(yVar.readMessage(Reader.Configuration.parser(), m5Var));
                            } else if (tag != 26) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                StringValue stringValue = this.bpk_;
                                StringValue.Builder builder = stringValue != null ? stringValue.toBuilder() : null;
                                StringValue stringValue2 = (StringValue) yVar.readMessage(StringValue.parser(), m5Var);
                                this.bpk_ = stringValue2;
                                if (builder != null) {
                                    builder.mergeFrom(stringValue2);
                                    this.bpk_ = builder.buildPartial();
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
                if ((i10 & 1) != 0) {
                    this.monitors_ = Collections.unmodifiableList(this.monitors_);
                }
                if ((i10 & 2) != 0) {
                    this.readers_ = Collections.unmodifiableList(this.readers_);
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if ((i10 & 1) != 0) {
            this.monitors_ = Collections.unmodifiableList(this.monitors_);
        }
        if ((i10 & 2) != 0) {
            this.readers_ = Collections.unmodifiableList(this.readers_);
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
