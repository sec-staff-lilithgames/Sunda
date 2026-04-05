package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.BytesValue;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.UInt32Value;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.c;
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
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.o;
import com.explorestack.protobuf.o6;
import com.explorestack.protobuf.o7;
import com.explorestack.protobuf.p;
import com.explorestack.protobuf.p6;
import com.explorestack.protobuf.pa;
import com.explorestack.protobuf.sb;
import com.explorestack.protobuf.t;
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
public final class Reader extends k7 implements ReaderOrBuilder {
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int RECORDS_FIELD_NUMBER = 3;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private List<Record> records_;
    private Timestamp timestamp_;
    private static final Reader DEFAULT_INSTANCE = new Reader();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Reader.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public Reader parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new Reader(yVar, m5Var);
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.protobuf.sdk.Reader$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$sdk$Reader$Rule$RuleOneofCase;

        static {
            int[] iArr = new int[Rule.RuleOneofCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$sdk$Reader$Rule$RuleOneofCase = iArr;
            try {
                iArr[Rule.RuleOneofCase.GENERAL_RULE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Reader$Rule$RuleOneofCase[Rule.RuleOneofCase.IOS_LOG_RULE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Reader$Rule$RuleOneofCase[Rule.RuleOneofCase.RULEONEOF_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Configuration extends k7 implements ConfigurationOrBuilder {
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int RULES_FIELD_NUMBER = 5;
        public static final int UNIQUE_ONLY_FIELD_NUMBER = 4;
        public static final int UPDATE_INTERVAL_FIELD_NUMBER = 3;
        public static final int URL_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private StringValue name_;
        private List<Rule> rules_;
        private o uniqueOnly_;
        private UInt32Value updateInterval_;
        private StringValue url_;
        private static final Configuration DEFAULT_INSTANCE = new Configuration();
        private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Reader.Configuration.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public Configuration parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new Configuration(yVar, m5Var);
            }
        };

        public static Configuration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Configuration_descriptor;
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
            if ((hasUrl() && !getUrl().equals(configuration.getUrl())) || hasUpdateInterval() != configuration.hasUpdateInterval()) {
                return false;
            }
            if ((!hasUpdateInterval() || getUpdateInterval().equals(configuration.getUpdateInterval())) && hasUniqueOnly() == configuration.hasUniqueOnly()) {
                return (!hasUniqueOnly() || getUniqueOnly().equals(configuration.getUniqueOnly())) && getRulesList().equals(configuration.getRulesList()) && this.unknownFields.equals(configuration.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public StringValue getName() {
            StringValue stringValue = this.name_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public ib getNameOrBuilder() {
            return getName();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public fa getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public Rule getRules(int i10) {
            return this.rules_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public int getRulesCount() {
            return this.rules_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public List<Rule> getRulesList() {
            return this.rules_;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public RuleOrBuilder getRulesOrBuilder(int i10) {
            return this.rules_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public List<? extends RuleOrBuilder> getRulesOrBuilderList() {
            return this.rules_;
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
            if (this.updateInterval_ != null) {
                iComputeMessageSize += h0.computeMessageSize(3, getUpdateInterval());
            }
            if (this.uniqueOnly_ != null) {
                iComputeMessageSize += h0.computeMessageSize(4, getUniqueOnly());
            }
            for (int i11 = 0; i11 < this.rules_.size(); i11++) {
                iComputeMessageSize += h0.computeMessageSize(5, this.rules_.get(i11));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public o getUniqueOnly() {
            o oVar = this.uniqueOnly_;
            return oVar == null ? o.getDefaultInstance() : oVar;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public p getUniqueOnlyOrBuilder() {
            return getUniqueOnly();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
        public final gc getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public UInt32Value getUpdateInterval() {
            UInt32Value uInt32Value = this.updateInterval_;
            return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public yb getUpdateIntervalOrBuilder() {
            return getUpdateInterval();
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public StringValue getUrl() {
            StringValue stringValue = this.url_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public ib getUrlOrBuilder() {
            return getUrl();
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public boolean hasName() {
            return this.name_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public boolean hasUniqueOnly() {
            return this.uniqueOnly_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public boolean hasUpdateInterval() {
            return this.updateInterval_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
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
            if (hasUpdateInterval()) {
                iHashCode = o2.B(iHashCode, 37, 3, 53) + getUpdateInterval().hashCode();
            }
            if (hasUniqueOnly()) {
                iHashCode = o2.B(iHashCode, 37, 4, 53) + getUniqueOnly().hashCode();
            }
            if (getRulesCount() > 0) {
                iHashCode = o2.B(iHashCode, 37, 5, 53) + getRulesList().hashCode();
            }
            int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Configuration_fieldAccessorTable.ensureFieldAccessorsInitialized(Configuration.class, Builder.class);
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
            if (this.updateInterval_ != null) {
                h0Var.writeMessage(3, getUpdateInterval());
            }
            if (this.uniqueOnly_ != null) {
                h0Var.writeMessage(4, getUniqueOnly());
            }
            for (int i10 = 0; i10 < this.rules_.size(); i10++) {
                h0Var.writeMessage(5, this.rules_.get(i10));
            }
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements ConfigurationOrBuilder {
            private int bitField0_;
            private xa nameBuilder_;
            private StringValue name_;
            private pa rulesBuilder_;
            private List<Rule> rules_;
            private xa uniqueOnlyBuilder_;
            private o uniqueOnly_;
            private xa updateIntervalBuilder_;
            private UInt32Value updateInterval_;
            private xa urlBuilder_;
            private StringValue url_;

            private Builder() {
                super(null);
                this.rules_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private void ensureRulesIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.rules_ = new ArrayList(this.rules_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Configuration_descriptor;
            }

            private xa getNameFieldBuilder() {
                if (this.nameBuilder_ == null) {
                    this.nameBuilder_ = new xa(getName(), getParentForChildren(), isClean());
                    this.name_ = null;
                }
                return this.nameBuilder_;
            }

            private pa getRulesFieldBuilder() {
                if (this.rulesBuilder_ == null) {
                    this.rulesBuilder_ = new pa(this.rules_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.rules_ = null;
                }
                return this.rulesBuilder_;
            }

            private xa getUniqueOnlyFieldBuilder() {
                if (this.uniqueOnlyBuilder_ == null) {
                    this.uniqueOnlyBuilder_ = new xa(getUniqueOnly(), getParentForChildren(), isClean());
                    this.uniqueOnly_ = null;
                }
                return this.uniqueOnlyBuilder_;
            }

            private xa getUpdateIntervalFieldBuilder() {
                if (this.updateIntervalBuilder_ == null) {
                    this.updateIntervalBuilder_ = new xa(getUpdateInterval(), getParentForChildren(), isClean());
                    this.updateInterval_ = null;
                }
                return this.updateIntervalBuilder_;
            }

            private xa getUrlFieldBuilder() {
                if (this.urlBuilder_ == null) {
                    this.urlBuilder_ = new xa(getUrl(), getParentForChildren(), isClean());
                    this.url_ = null;
                }
                return this.urlBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (k7.alwaysUseFieldBuilders) {
                    getRulesFieldBuilder();
                }
            }

            public Builder addAllRules(Iterable<? extends Rule> iterable) {
                pa paVar = this.rulesBuilder_;
                if (paVar != null) {
                    paVar.addAllMessages(iterable);
                    return this;
                }
                ensureRulesIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.rules_);
                onChanged();
                return this;
            }

            public Builder addRules(Rule rule) {
                pa paVar = this.rulesBuilder_;
                if (paVar != null) {
                    paVar.addMessage(rule);
                    return this;
                }
                rule.getClass();
                ensureRulesIsMutable();
                this.rules_.add(rule);
                onChanged();
                return this;
            }

            public Rule.Builder addRulesBuilder() {
                return (Rule.Builder) getRulesFieldBuilder().addBuilder(Rule.getDefaultInstance());
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

            public Builder clearRules() {
                pa paVar = this.rulesBuilder_;
                if (paVar != null) {
                    paVar.clear();
                    return this;
                }
                this.rules_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearUniqueOnly() {
                if (this.uniqueOnlyBuilder_ == null) {
                    this.uniqueOnly_ = null;
                    onChanged();
                    return this;
                }
                this.uniqueOnly_ = null;
                this.uniqueOnlyBuilder_ = null;
                return this;
            }

            public Builder clearUpdateInterval() {
                if (this.updateIntervalBuilder_ == null) {
                    this.updateInterval_ = null;
                    onChanged();
                    return this;
                }
                this.updateInterval_ = null;
                this.updateIntervalBuilder_ = null;
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

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Configuration_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
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

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public ib getNameOrBuilder() {
                xa xaVar = this.nameBuilder_;
                if (xaVar != null) {
                    return (ib) xaVar.getMessageOrBuilder();
                }
                StringValue stringValue = this.name_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public Rule getRules(int i10) {
                pa paVar = this.rulesBuilder_;
                return paVar == null ? this.rules_.get(i10) : (Rule) paVar.getMessage(i10);
            }

            public Rule.Builder getRulesBuilder(int i10) {
                return (Rule.Builder) getRulesFieldBuilder().getBuilder(i10);
            }

            public List<Rule.Builder> getRulesBuilderList() {
                return getRulesFieldBuilder().getBuilderList();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public int getRulesCount() {
                pa paVar = this.rulesBuilder_;
                return paVar == null ? this.rules_.size() : paVar.getCount();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public List<Rule> getRulesList() {
                pa paVar = this.rulesBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.rules_) : paVar.getMessageList();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public RuleOrBuilder getRulesOrBuilder(int i10) {
                pa paVar = this.rulesBuilder_;
                return paVar == null ? this.rules_.get(i10) : (RuleOrBuilder) paVar.getMessageOrBuilder(i10);
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public List<? extends RuleOrBuilder> getRulesOrBuilderList() {
                pa paVar = this.rulesBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.rules_);
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public o getUniqueOnly() {
                xa xaVar = this.uniqueOnlyBuilder_;
                if (xaVar != null) {
                    return (o) xaVar.getMessage();
                }
                o oVar = this.uniqueOnly_;
                return oVar == null ? o.getDefaultInstance() : oVar;
            }

            public n getUniqueOnlyBuilder() {
                onChanged();
                return (n) getUniqueOnlyFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public p getUniqueOnlyOrBuilder() {
                xa xaVar = this.uniqueOnlyBuilder_;
                if (xaVar != null) {
                    return (p) xaVar.getMessageOrBuilder();
                }
                o oVar = this.uniqueOnly_;
                return oVar == null ? o.getDefaultInstance() : oVar;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public UInt32Value getUpdateInterval() {
                xa xaVar = this.updateIntervalBuilder_;
                if (xaVar != null) {
                    return (UInt32Value) xaVar.getMessage();
                }
                UInt32Value uInt32Value = this.updateInterval_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            public UInt32Value.Builder getUpdateIntervalBuilder() {
                onChanged();
                return (UInt32Value.Builder) getUpdateIntervalFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public yb getUpdateIntervalOrBuilder() {
                xa xaVar = this.updateIntervalBuilder_;
                if (xaVar != null) {
                    return (yb) xaVar.getMessageOrBuilder();
                }
                UInt32Value uInt32Value = this.updateInterval_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
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

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public ib getUrlOrBuilder() {
                xa xaVar = this.urlBuilder_;
                if (xaVar != null) {
                    return (ib) xaVar.getMessageOrBuilder();
                }
                StringValue stringValue = this.url_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public boolean hasName() {
                return (this.nameBuilder_ == null && this.name_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public boolean hasUniqueOnly() {
                return (this.uniqueOnlyBuilder_ == null && this.uniqueOnly_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public boolean hasUpdateInterval() {
                return (this.updateIntervalBuilder_ == null && this.updateInterval_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public boolean hasUrl() {
                return (this.urlBuilder_ == null && this.url_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Configuration_fieldAccessorTable.ensureFieldAccessorsInitialized(Configuration.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
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

            public Builder mergeUniqueOnly(o oVar) {
                xa xaVar = this.uniqueOnlyBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(oVar);
                    return this;
                }
                o oVar2 = this.uniqueOnly_;
                if (oVar2 != null) {
                    this.uniqueOnly_ = o.newBuilder(oVar2).mergeFrom(oVar).buildPartial();
                } else {
                    this.uniqueOnly_ = oVar;
                }
                onChanged();
                return this;
            }

            public Builder mergeUpdateInterval(UInt32Value uInt32Value) {
                xa xaVar = this.updateIntervalBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(uInt32Value);
                    return this;
                }
                UInt32Value uInt32Value2 = this.updateInterval_;
                if (uInt32Value2 != null) {
                    this.updateInterval_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                } else {
                    this.updateInterval_ = uInt32Value;
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

            public Builder removeRules(int i10) {
                pa paVar = this.rulesBuilder_;
                if (paVar != null) {
                    paVar.remove(i10);
                    return this;
                }
                ensureRulesIsMutable();
                this.rules_.remove(i10);
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

            public Builder setRules(int i10, Rule rule) {
                pa paVar = this.rulesBuilder_;
                if (paVar != null) {
                    paVar.setMessage(i10, rule);
                    return this;
                }
                rule.getClass();
                ensureRulesIsMutable();
                this.rules_.set(i10, rule);
                onChanged();
                return this;
            }

            public Builder setUniqueOnly(o oVar) {
                xa xaVar = this.uniqueOnlyBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(oVar);
                    return this;
                }
                oVar.getClass();
                this.uniqueOnly_ = oVar;
                onChanged();
                return this;
            }

            public Builder setUpdateInterval(UInt32Value uInt32Value) {
                xa xaVar = this.updateIntervalBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(uInt32Value);
                    return this;
                }
                uInt32Value.getClass();
                this.updateInterval_ = uInt32Value;
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
                xa xaVar3 = this.updateIntervalBuilder_;
                if (xaVar3 == null) {
                    configuration.updateInterval_ = this.updateInterval_;
                } else {
                    configuration.updateInterval_ = (UInt32Value) xaVar3.build();
                }
                xa xaVar4 = this.uniqueOnlyBuilder_;
                if (xaVar4 == null) {
                    configuration.uniqueOnly_ = this.uniqueOnly_;
                } else {
                    configuration.uniqueOnly_ = (o) xaVar4.build();
                }
                pa paVar = this.rulesBuilder_;
                if (paVar != null) {
                    configuration.rules_ = paVar.build();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.rules_ = Collections.unmodifiableList(this.rules_);
                        this.bitField0_ &= -2;
                    }
                    configuration.rules_ = this.rules_;
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

            public Rule.Builder addRulesBuilder(int i10) {
                return (Rule.Builder) getRulesFieldBuilder().addBuilder(i10, Rule.getDefaultInstance());
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
                if (this.updateIntervalBuilder_ == null) {
                    this.updateInterval_ = null;
                } else {
                    this.updateInterval_ = null;
                    this.updateIntervalBuilder_ = null;
                }
                if (this.uniqueOnlyBuilder_ == null) {
                    this.uniqueOnly_ = null;
                } else {
                    this.uniqueOnly_ = null;
                    this.uniqueOnlyBuilder_ = null;
                }
                pa paVar = this.rulesBuilder_;
                if (paVar == null) {
                    this.rules_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    return this;
                }
                paVar.clear();
                return this;
            }

            private Builder(p6 p6Var) {
                super(p6Var);
                this.rules_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
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

            public Builder setUniqueOnly(n nVar) {
                xa xaVar = this.uniqueOnlyBuilder_;
                if (xaVar == null) {
                    this.uniqueOnly_ = nVar.build();
                    onChanged();
                    return this;
                }
                xaVar.setMessage(nVar.build());
                return this;
            }

            public Builder setUpdateInterval(UInt32Value.Builder builder) {
                xa xaVar = this.updateIntervalBuilder_;
                if (xaVar == null) {
                    this.updateInterval_ = builder.build();
                    onChanged();
                    return this;
                }
                xaVar.setMessage(builder.build());
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

            public Builder addRules(int i10, Rule rule) {
                pa paVar = this.rulesBuilder_;
                if (paVar == null) {
                    rule.getClass();
                    ensureRulesIsMutable();
                    this.rules_.add(i10, rule);
                    onChanged();
                    return this;
                }
                paVar.addMessage(i10, rule);
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

            public Builder setRules(int i10, Rule.Builder builder) {
                pa paVar = this.rulesBuilder_;
                if (paVar == null) {
                    ensureRulesIsMutable();
                    this.rules_.set(i10, builder.build());
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
                if (configuration.hasName()) {
                    mergeName(configuration.getName());
                }
                if (configuration.hasUrl()) {
                    mergeUrl(configuration.getUrl());
                }
                if (configuration.hasUpdateInterval()) {
                    mergeUpdateInterval(configuration.getUpdateInterval());
                }
                if (configuration.hasUniqueOnly()) {
                    mergeUniqueOnly(configuration.getUniqueOnly());
                }
                if (this.rulesBuilder_ == null) {
                    if (!configuration.rules_.isEmpty()) {
                        if (this.rules_.isEmpty()) {
                            this.rules_ = configuration.rules_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureRulesIsMutable();
                            this.rules_.addAll(configuration.rules_);
                        }
                        onChanged();
                    }
                } else if (!configuration.rules_.isEmpty()) {
                    if (!this.rulesBuilder_.isEmpty()) {
                        this.rulesBuilder_.addAllMessages(configuration.rules_);
                    } else {
                        this.rulesBuilder_.dispose();
                        this.rulesBuilder_ = null;
                        this.rules_ = configuration.rules_;
                        this.bitField0_ &= -2;
                        this.rulesBuilder_ = k7.alwaysUseFieldBuilders ? getRulesFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((k7) configuration).unknownFields);
                onChanged();
                return this;
            }

            public Builder addRules(Rule.Builder builder) {
                pa paVar = this.rulesBuilder_;
                if (paVar == null) {
                    ensureRulesIsMutable();
                    this.rules_.add(builder.build());
                    onChanged();
                    return this;
                }
                paVar.addMessage(builder.build());
                return this;
            }

            public Builder addRules(int i10, Rule.Builder builder) {
                pa paVar = this.rulesBuilder_;
                if (paVar == null) {
                    ensureRulesIsMutable();
                    this.rules_.add(i10, builder.build());
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
            public io.bidmachine.protobuf.sdk.Reader.Configuration.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sdk.Reader.Configuration.access$1100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sdk.Reader$Configuration r3 = (io.bidmachine.protobuf.sdk.Reader.Configuration) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sdk.Reader$Configuration r4 = (io.bidmachine.protobuf.sdk.Reader.Configuration) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Reader.Configuration.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sdk.Reader$Configuration$Builder");
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
            this.rules_ = Collections.EMPTY_LIST;
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
            Object[] objArr = false;
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
                                UInt32Value uInt32Value = this.updateInterval_;
                                UInt32Value.Builder builder3 = uInt32Value != null ? uInt32Value.toBuilder() : null;
                                UInt32Value uInt32Value2 = (UInt32Value) yVar.readMessage(UInt32Value.parser(), m5Var);
                                this.updateInterval_ = uInt32Value2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(uInt32Value2);
                                    this.updateInterval_ = builder3.buildPartial();
                                }
                            } else if (tag == 34) {
                                o oVar = this.uniqueOnly_;
                                n builder4 = oVar != null ? oVar.toBuilder() : null;
                                o oVar2 = (o) yVar.readMessage(o.parser(), m5Var);
                                this.uniqueOnly_ = oVar2;
                                if (builder4 != null) {
                                    builder4.mergeFrom(oVar2);
                                    this.uniqueOnly_ = builder4.buildPartial();
                                }
                            } else if (tag != 42) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                if (objArr == false) {
                                    this.rules_ = new ArrayList();
                                    objArr = true;
                                }
                                this.rules_.add(yVar.readMessage(Rule.parser(), m5Var));
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (objArr != false) {
                        this.rules_ = Collections.unmodifiableList(this.rules_);
                    }
                    this.unknownFields = ccVarNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (objArr != false) {
                this.rules_ = Collections.unmodifiableList(this.rules_);
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
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        StringValue getName();

        ib getNameOrBuilder();

        Rule getRules(int i10);

        int getRulesCount();

        List<Rule> getRulesList();

        RuleOrBuilder getRulesOrBuilder(int i10);

        List<? extends RuleOrBuilder> getRulesOrBuilderList();

        o getUniqueOnly();

        p getUniqueOnlyOrBuilder();

        UInt32Value getUpdateInterval();

        yb getUpdateIntervalOrBuilder();

        StringValue getUrl();

        ib getUrlOrBuilder();

        boolean hasName();

        boolean hasUniqueOnly();

        boolean hasUpdateInterval();

        boolean hasUrl();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Record extends k7 implements RecordOrBuilder {
        public static final int ERROR_FIELD_NUMBER = 3;
        public static final int RAW_DATA_FIELD_NUMBER = 2;
        public static final int RULE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private Error error_;
        private byte memoizedIsInitialized;
        private BytesValue rawData_;
        private Rule rule_;
        private static final Record DEFAULT_INSTANCE = new Record();
        private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Reader.Record.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public Record parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new Record(yVar, m5Var);
            }
        };

        public static Record getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Record_descriptor;
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
            if (hasRule() != record.hasRule()) {
                return false;
            }
            if ((hasRule() && !getRule().equals(record.getRule())) || hasRawData() != record.hasRawData()) {
                return false;
            }
            if ((!hasRawData() || getRawData().equals(record.getRawData())) && hasError() == record.hasError()) {
                return (!hasError() || getError().equals(record.getError())) && this.unknownFields.equals(record.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
        public Error getError() {
            Error error = this.error_;
            return error == null ? Error.getDefaultInstance() : error;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
        public ErrorOrBuilder getErrorOrBuilder() {
            return getError();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public fa getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
        public BytesValue getRawData() {
            BytesValue bytesValue = this.rawData_;
            return bytesValue == null ? BytesValue.getDefaultInstance() : bytesValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
        public t getRawDataOrBuilder() {
            return getRawData();
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
        public Rule getRule() {
            Rule rule = this.rule_;
            return rule == null ? Rule.getDefaultInstance() : rule;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
        public RuleOrBuilder getRuleOrBuilder() {
            return getRule();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = this.rule_ != null ? h0.computeMessageSize(1, getRule()) : 0;
            if (this.rawData_ != null) {
                iComputeMessageSize += h0.computeMessageSize(2, getRawData());
            }
            if (this.error_ != null) {
                iComputeMessageSize += h0.computeMessageSize(3, getError());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
        public final gc getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
        public boolean hasError() {
            return this.error_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
        public boolean hasRawData() {
            return this.rawData_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
        public boolean hasRule() {
            return this.rule_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasRule()) {
                iHashCode = o2.B(iHashCode, 37, 1, 53) + getRule().hashCode();
            }
            if (hasRawData()) {
                iHashCode = o2.B(iHashCode, 37, 2, 53) + getRawData().hashCode();
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
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Record_fieldAccessorTable.ensureFieldAccessorsInitialized(Record.class, Builder.class);
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
            if (this.rule_ != null) {
                h0Var.writeMessage(1, getRule());
            }
            if (this.rawData_ != null) {
                h0Var.writeMessage(2, getRawData());
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
            private xa rawDataBuilder_;
            private BytesValue rawData_;
            private xa ruleBuilder_;
            private Rule rule_;

            private Builder() {
                super(null);
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Record_descriptor;
            }

            private xa getErrorFieldBuilder() {
                if (this.errorBuilder_ == null) {
                    this.errorBuilder_ = new xa(getError(), getParentForChildren(), isClean());
                    this.error_ = null;
                }
                return this.errorBuilder_;
            }

            private xa getRawDataFieldBuilder() {
                if (this.rawDataBuilder_ == null) {
                    this.rawDataBuilder_ = new xa(getRawData(), getParentForChildren(), isClean());
                    this.rawData_ = null;
                }
                return this.rawDataBuilder_;
            }

            private xa getRuleFieldBuilder() {
                if (this.ruleBuilder_ == null) {
                    this.ruleBuilder_ = new xa(getRule(), getParentForChildren(), isClean());
                    this.rule_ = null;
                }
                return this.ruleBuilder_;
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

            public Builder clearRawData() {
                if (this.rawDataBuilder_ == null) {
                    this.rawData_ = null;
                    onChanged();
                    return this;
                }
                this.rawData_ = null;
                this.rawDataBuilder_ = null;
                return this;
            }

            public Builder clearRule() {
                if (this.ruleBuilder_ == null) {
                    this.rule_ = null;
                    onChanged();
                    return this;
                }
                this.rule_ = null;
                this.ruleBuilder_ = null;
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Record_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
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

            @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
            public ErrorOrBuilder getErrorOrBuilder() {
                xa xaVar = this.errorBuilder_;
                if (xaVar != null) {
                    return (ErrorOrBuilder) xaVar.getMessageOrBuilder();
                }
                Error error = this.error_;
                return error == null ? Error.getDefaultInstance() : error;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
            public BytesValue getRawData() {
                xa xaVar = this.rawDataBuilder_;
                if (xaVar != null) {
                    return (BytesValue) xaVar.getMessage();
                }
                BytesValue bytesValue = this.rawData_;
                return bytesValue == null ? BytesValue.getDefaultInstance() : bytesValue;
            }

            public BytesValue.Builder getRawDataBuilder() {
                onChanged();
                return (BytesValue.Builder) getRawDataFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
            public t getRawDataOrBuilder() {
                xa xaVar = this.rawDataBuilder_;
                if (xaVar != null) {
                    return (t) xaVar.getMessageOrBuilder();
                }
                BytesValue bytesValue = this.rawData_;
                return bytesValue == null ? BytesValue.getDefaultInstance() : bytesValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
            public Rule getRule() {
                xa xaVar = this.ruleBuilder_;
                if (xaVar != null) {
                    return (Rule) xaVar.getMessage();
                }
                Rule rule = this.rule_;
                return rule == null ? Rule.getDefaultInstance() : rule;
            }

            public Rule.Builder getRuleBuilder() {
                onChanged();
                return (Rule.Builder) getRuleFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
            public RuleOrBuilder getRuleOrBuilder() {
                xa xaVar = this.ruleBuilder_;
                if (xaVar != null) {
                    return (RuleOrBuilder) xaVar.getMessageOrBuilder();
                }
                Rule rule = this.rule_;
                return rule == null ? Rule.getDefaultInstance() : rule;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
            public boolean hasError() {
                return (this.errorBuilder_ == null && this.error_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
            public boolean hasRawData() {
                return (this.rawDataBuilder_ == null && this.rawData_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
            public boolean hasRule() {
                return (this.ruleBuilder_ == null && this.rule_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Record_fieldAccessorTable.ensureFieldAccessorsInitialized(Record.class, Builder.class);
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

            public Builder mergeRawData(BytesValue bytesValue) {
                xa xaVar = this.rawDataBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(bytesValue);
                    return this;
                }
                BytesValue bytesValue2 = this.rawData_;
                if (bytesValue2 != null) {
                    this.rawData_ = BytesValue.newBuilder(bytesValue2).mergeFrom(bytesValue).buildPartial();
                } else {
                    this.rawData_ = bytesValue;
                }
                onChanged();
                return this;
            }

            public Builder mergeRule(Rule rule) {
                xa xaVar = this.ruleBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(rule);
                    return this;
                }
                Rule rule2 = this.rule_;
                if (rule2 != null) {
                    this.rule_ = Rule.newBuilder(rule2).mergeFrom(rule).buildPartial();
                } else {
                    this.rule_ = rule;
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

            public Builder setRawData(BytesValue bytesValue) {
                xa xaVar = this.rawDataBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(bytesValue);
                    return this;
                }
                bytesValue.getClass();
                this.rawData_ = bytesValue;
                onChanged();
                return this;
            }

            public Builder setRule(Rule rule) {
                xa xaVar = this.ruleBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(rule);
                    return this;
                }
                rule.getClass();
                this.rule_ = rule;
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
                xa xaVar = this.ruleBuilder_;
                if (xaVar == null) {
                    record.rule_ = this.rule_;
                } else {
                    record.rule_ = (Rule) xaVar.build();
                }
                xa xaVar2 = this.rawDataBuilder_;
                if (xaVar2 == null) {
                    record.rawData_ = this.rawData_;
                } else {
                    record.rawData_ = (BytesValue) xaVar2.build();
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
                if (this.ruleBuilder_ == null) {
                    this.rule_ = null;
                } else {
                    this.rule_ = null;
                    this.ruleBuilder_ = null;
                }
                if (this.rawDataBuilder_ == null) {
                    this.rawData_ = null;
                } else {
                    this.rawData_ = null;
                    this.rawDataBuilder_ = null;
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

            public Builder setRawData(BytesValue.Builder builder) {
                xa xaVar = this.rawDataBuilder_;
                if (xaVar == null) {
                    this.rawData_ = builder.build();
                    onChanged();
                    return this;
                }
                xaVar.setMessage(builder.build());
                return this;
            }

            public Builder setRule(Rule.Builder builder) {
                xa xaVar = this.ruleBuilder_;
                if (xaVar == null) {
                    this.rule_ = builder.build();
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
                if (record.hasRule()) {
                    mergeRule(record.getRule());
                }
                if (record.hasRawData()) {
                    mergeRawData(record.getRawData());
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
            public io.bidmachine.protobuf.sdk.Reader.Record.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sdk.Reader.Record.access$5100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sdk.Reader$Record r3 = (io.bidmachine.protobuf.sdk.Reader.Record) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sdk.Reader$Record r4 = (io.bidmachine.protobuf.sdk.Reader.Record) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Reader.Record.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sdk.Reader$Record$Builder");
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
                                    Rule rule = this.rule_;
                                    Rule.Builder builder = rule != null ? rule.toBuilder() : null;
                                    Rule rule2 = (Rule) yVar.readMessage(Rule.parser(), m5Var);
                                    this.rule_ = rule2;
                                    if (builder != null) {
                                        builder.mergeFrom(rule2);
                                        this.rule_ = builder.buildPartial();
                                    }
                                } else if (tag == 18) {
                                    BytesValue bytesValue = this.rawData_;
                                    BytesValue.Builder builder2 = bytesValue != null ? bytesValue.toBuilder() : null;
                                    BytesValue bytesValue2 = (BytesValue) yVar.readMessage(BytesValue.parser(), m5Var);
                                    this.rawData_ = bytesValue2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(bytesValue2);
                                        this.rawData_ = builder2.buildPartial();
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

        BytesValue getRawData();

        t getRawDataOrBuilder();

        Rule getRule();

        RuleOrBuilder getRuleOrBuilder();

        boolean hasError();

        boolean hasRawData();

        boolean hasRule();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Rule extends k7 implements RuleOrBuilder {
        public static final int GENERAL_RULE_FIELD_NUMBER = 1;
        public static final int IOS_LOG_RULE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int ruleOneofCase_;
        private Object ruleOneof_;
        private static final Rule DEFAULT_INSTANCE = new Rule();
        private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Reader.Rule.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public Rule parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new Rule(yVar, m5Var);
            }
        };

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class GeneralRule extends k7 implements GeneralRuleOrBuilder {
            private static final GeneralRule DEFAULT_INSTANCE = new GeneralRule();
            private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRule.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public GeneralRule parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new GeneralRule(yVar, m5Var);
                }
            };
            public static final int PATH_FIELD_NUMBER = 2;
            public static final int TAG_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private byte memoizedIsInitialized;
            private StringValue path_;
            private StringValue tag_;

            public static GeneralRule getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_GeneralRule_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static GeneralRule parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (GeneralRule) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static GeneralRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (GeneralRule) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof GeneralRule)) {
                    return super.equals(obj);
                }
                GeneralRule generalRule = (GeneralRule) obj;
                if (hasTag() != generalRule.hasTag()) {
                    return false;
                }
                if ((!hasTag() || getTag().equals(generalRule.getTag())) && hasPath() == generalRule.hasPath()) {
                    return (!hasPath() || getPath().equals(generalRule.getPath())) && this.unknownFields.equals(generalRule.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public fa getParserForType() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
            public StringValue getPath() {
                StringValue stringValue = this.path_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
            public ib getPathOrBuilder() {
                return getPath();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeMessageSize = this.tag_ != null ? h0.computeMessageSize(1, getTag()) : 0;
                if (this.path_ != null) {
                    iComputeMessageSize += h0.computeMessageSize(2, getPath());
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
            public StringValue getTag() {
                StringValue stringValue = this.tag_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
            public ib getTagOrBuilder() {
                return getTag();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
            public final gc getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
            public boolean hasPath() {
                return this.path_ != null;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
            public boolean hasTag() {
                return this.tag_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = getDescriptor().hashCode() + 779;
                if (hasTag()) {
                    iHashCode = o2.B(iHashCode, 37, 1, 53) + getTag().hashCode();
                }
                if (hasPath()) {
                    iHashCode = o2.B(iHashCode, 37, 2, 53) + getPath().hashCode();
                }
                int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.k7
            public i7 internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_GeneralRule_fieldAccessorTable.ensureFieldAccessorsInitialized(GeneralRule.class, Builder.class);
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
                return new GeneralRule();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                if (this.tag_ != null) {
                    h0Var.writeMessage(1, getTag());
                }
                if (this.path_ != null) {
                    h0Var.writeMessage(2, getPath());
                }
                this.unknownFields.writeTo(h0Var);
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends o6 implements GeneralRuleOrBuilder {
                private xa pathBuilder_;
                private StringValue path_;
                private xa tagBuilder_;
                private StringValue tag_;

                private Builder() {
                    super(null);
                    maybeForceBuilderInitialization();
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_GeneralRule_descriptor;
                }

                private xa getPathFieldBuilder() {
                    if (this.pathBuilder_ == null) {
                        this.pathBuilder_ = new xa(getPath(), getParentForChildren(), isClean());
                        this.path_ = null;
                    }
                    return this.pathBuilder_;
                }

                private xa getTagFieldBuilder() {
                    if (this.tagBuilder_ == null) {
                        this.tagBuilder_ = new xa(getTag(), getParentForChildren(), isClean());
                        this.tag_ = null;
                    }
                    return this.tagBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = k7.alwaysUseFieldBuilders;
                }

                public Builder clearPath() {
                    if (this.pathBuilder_ == null) {
                        this.path_ = null;
                        onChanged();
                        return this;
                    }
                    this.path_ = null;
                    this.pathBuilder_ = null;
                    return this;
                }

                public Builder clearTag() {
                    if (this.tagBuilder_ == null) {
                        this.tag_ = null;
                        onChanged();
                        return this;
                    }
                    this.tag_ = null;
                    this.tagBuilder_ = null;
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_GeneralRule_descriptor;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
                public StringValue getPath() {
                    xa xaVar = this.pathBuilder_;
                    if (xaVar != null) {
                        return (StringValue) xaVar.getMessage();
                    }
                    StringValue stringValue = this.path_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                public StringValue.Builder getPathBuilder() {
                    onChanged();
                    return (StringValue.Builder) getPathFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
                public ib getPathOrBuilder() {
                    xa xaVar = this.pathBuilder_;
                    if (xaVar != null) {
                        return (ib) xaVar.getMessageOrBuilder();
                    }
                    StringValue stringValue = this.path_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
                public StringValue getTag() {
                    xa xaVar = this.tagBuilder_;
                    if (xaVar != null) {
                        return (StringValue) xaVar.getMessage();
                    }
                    StringValue stringValue = this.tag_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                public StringValue.Builder getTagBuilder() {
                    onChanged();
                    return (StringValue.Builder) getTagFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
                public ib getTagOrBuilder() {
                    xa xaVar = this.tagBuilder_;
                    if (xaVar != null) {
                        return (ib) xaVar.getMessageOrBuilder();
                    }
                    StringValue stringValue = this.tag_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
                public boolean hasPath() {
                    return (this.pathBuilder_ == null && this.path_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
                public boolean hasTag() {
                    return (this.tagBuilder_ == null && this.tag_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_GeneralRule_fieldAccessorTable.ensureFieldAccessorsInitialized(GeneralRule.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergePath(StringValue stringValue) {
                    xa xaVar = this.pathBuilder_;
                    if (xaVar != null) {
                        xaVar.mergeFrom(stringValue);
                        return this;
                    }
                    StringValue stringValue2 = this.path_;
                    if (stringValue2 != null) {
                        this.path_ = g.h(stringValue2, stringValue);
                    } else {
                        this.path_ = stringValue;
                    }
                    onChanged();
                    return this;
                }

                public Builder mergeTag(StringValue stringValue) {
                    xa xaVar = this.tagBuilder_;
                    if (xaVar != null) {
                        xaVar.mergeFrom(stringValue);
                        return this;
                    }
                    StringValue stringValue2 = this.tag_;
                    if (stringValue2 != null) {
                        this.tag_ = g.h(stringValue2, stringValue);
                    } else {
                        this.tag_ = stringValue;
                    }
                    onChanged();
                    return this;
                }

                public Builder setPath(StringValue stringValue) {
                    xa xaVar = this.pathBuilder_;
                    if (xaVar != null) {
                        xaVar.setMessage(stringValue);
                        return this;
                    }
                    stringValue.getClass();
                    this.path_ = stringValue;
                    onChanged();
                    return this;
                }

                public Builder setTag(StringValue stringValue) {
                    xa xaVar = this.tagBuilder_;
                    if (xaVar != null) {
                        xaVar.setMessage(stringValue);
                        return this;
                    }
                    stringValue.getClass();
                    this.tag_ = stringValue;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public GeneralRule build() {
                    GeneralRule generalRuleBuildPartial = buildPartial();
                    if (generalRuleBuildPartial.isInitialized()) {
                        return generalRuleBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) generalRuleBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public GeneralRule buildPartial() {
                    GeneralRule generalRule = new GeneralRule(this);
                    xa xaVar = this.tagBuilder_;
                    if (xaVar == null) {
                        generalRule.tag_ = this.tag_;
                    } else {
                        generalRule.tag_ = (StringValue) xaVar.build();
                    }
                    xa xaVar2 = this.pathBuilder_;
                    if (xaVar2 == null) {
                        generalRule.path_ = this.path_;
                    } else {
                        generalRule.path_ = (StringValue) xaVar2.build();
                    }
                    onBuilt();
                    return generalRule;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public GeneralRule getDefaultInstanceForType() {
                    return GeneralRule.getDefaultInstance();
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
                    if (this.tagBuilder_ == null) {
                        this.tag_ = null;
                    } else {
                        this.tag_ = null;
                        this.tagBuilder_ = null;
                    }
                    if (this.pathBuilder_ == null) {
                        this.path_ = null;
                        return this;
                    }
                    this.path_ = null;
                    this.pathBuilder_ = null;
                    return this;
                }

                public Builder setPath(StringValue.Builder builder) {
                    xa xaVar = this.pathBuilder_;
                    if (xaVar == null) {
                        this.path_ = builder.build();
                        onChanged();
                        return this;
                    }
                    xaVar.setMessage(builder.build());
                    return this;
                }

                public Builder setTag(StringValue.Builder builder) {
                    xa xaVar = this.tagBuilder_;
                    if (xaVar == null) {
                        this.tag_ = builder.build();
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
                    if (message instanceof GeneralRule) {
                        return mergeFrom((GeneralRule) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(GeneralRule generalRule) {
                    if (generalRule == GeneralRule.getDefaultInstance()) {
                        return this;
                    }
                    if (generalRule.hasTag()) {
                        mergeTag(generalRule.getTag());
                    }
                    if (generalRule.hasPath()) {
                        mergePath(generalRule.getPath());
                    }
                    mergeUnknownFields(((k7) generalRule).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRule.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRule.access$2000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.sdk.Reader$Rule$GeneralRule r3 = (io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRule) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.sdk.Reader$Rule$GeneralRule r4 = (io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRule) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRule.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sdk.Reader$Rule$GeneralRule$Builder");
                }
            }

            public static Builder newBuilder(GeneralRule generalRule) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(generalRule);
            }

            public static GeneralRule parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (GeneralRule) PARSER.parseFrom(byteBuffer, m5Var);
            }

            private GeneralRule(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static GeneralRule parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (GeneralRule) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static GeneralRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (GeneralRule) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public GeneralRule getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static GeneralRule parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (GeneralRule) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private GeneralRule() {
                this.memoizedIsInitialized = (byte) -1;
            }

            public static GeneralRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (GeneralRule) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static GeneralRule parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (GeneralRule) PARSER.parseFrom(bArr, m5Var);
            }

            private GeneralRule(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                StringValue.Builder builder;
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
                                    StringValue stringValue = this.tag_;
                                    builder = stringValue != null ? stringValue.toBuilder() : null;
                                    StringValue stringValue2 = (StringValue) yVar.readMessage(StringValue.parser(), m5Var);
                                    this.tag_ = stringValue2;
                                    if (builder != null) {
                                        builder.mergeFrom(stringValue2);
                                        this.tag_ = builder.buildPartial();
                                    }
                                } else if (tag != 18) {
                                    if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                    }
                                } else {
                                    StringValue stringValue3 = this.path_;
                                    builder = stringValue3 != null ? stringValue3.toBuilder() : null;
                                    StringValue stringValue4 = (StringValue) yVar.readMessage(StringValue.parser(), m5Var);
                                    this.path_ = stringValue4;
                                    if (builder != null) {
                                        builder.mergeFrom(stringValue4);
                                        this.path_ = builder.buildPartial();
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

            public static GeneralRule parseFrom(InputStream inputStream) throws IOException {
                return (GeneralRule) k7.parseWithIOException(PARSER, inputStream);
            }

            public static GeneralRule parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (GeneralRule) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            public static GeneralRule parseFrom(y yVar) throws IOException {
                return (GeneralRule) k7.parseWithIOException(PARSER, yVar);
            }

            public static GeneralRule parseFrom(y yVar, m5 m5Var) throws IOException {
                return (GeneralRule) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface GeneralRuleOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            StringValue getPath();

            ib getPathOrBuilder();

            StringValue getTag();

            ib getTagOrBuilder();

            boolean hasPath();

            boolean hasTag();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class IOSLogRule extends k7 implements IOSLogRuleOrBuilder {
            public static final int LEVELS_FIELD_NUMBER = 2;
            public static final int SOURCES_FIELD_NUMBER = 3;
            public static final int TAG_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private List<StringValue> levels_;
            private byte memoizedIsInitialized;
            private List<StringValue> sources_;
            private StringValue tag_;
            private static final IOSLogRule DEFAULT_INSTANCE = new IOSLogRule();
            private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRule.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public IOSLogRule parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new IOSLogRule(yVar, m5Var);
                }
            };

            public static IOSLogRule getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_IOSLogRule_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static IOSLogRule parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (IOSLogRule) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static IOSLogRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (IOSLogRule) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof IOSLogRule)) {
                    return super.equals(obj);
                }
                IOSLogRule iOSLogRule = (IOSLogRule) obj;
                if (hasTag() != iOSLogRule.hasTag()) {
                    return false;
                }
                return (!hasTag() || getTag().equals(iOSLogRule.getTag())) && getLevelsList().equals(iOSLogRule.getLevelsList()) && getSourcesList().equals(iOSLogRule.getSourcesList()) && this.unknownFields.equals(iOSLogRule.unknownFields);
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public StringValue getLevels(int i10) {
                return this.levels_.get(i10);
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public int getLevelsCount() {
                return this.levels_.size();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public List<StringValue> getLevelsList() {
                return this.levels_;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public ib getLevelsOrBuilder(int i10) {
                return this.levels_.get(i10);
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public List<? extends ib> getLevelsOrBuilderList() {
                return this.levels_;
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
                int iComputeMessageSize = this.tag_ != null ? h0.computeMessageSize(1, getTag()) : 0;
                for (int i11 = 0; i11 < this.levels_.size(); i11++) {
                    iComputeMessageSize += h0.computeMessageSize(2, this.levels_.get(i11));
                }
                for (int i12 = 0; i12 < this.sources_.size(); i12++) {
                    iComputeMessageSize += h0.computeMessageSize(3, this.sources_.get(i12));
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public StringValue getSources(int i10) {
                return this.sources_.get(i10);
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public int getSourcesCount() {
                return this.sources_.size();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public List<StringValue> getSourcesList() {
                return this.sources_;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public ib getSourcesOrBuilder(int i10) {
                return this.sources_.get(i10);
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public List<? extends ib> getSourcesOrBuilderList() {
                return this.sources_;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public StringValue getTag() {
                StringValue stringValue = this.tag_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public ib getTagOrBuilder() {
                return getTag();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
            public final gc getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public boolean hasTag() {
                return this.tag_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = getDescriptor().hashCode() + 779;
                if (hasTag()) {
                    iHashCode = o2.B(iHashCode, 37, 1, 53) + getTag().hashCode();
                }
                if (getLevelsCount() > 0) {
                    iHashCode = o2.B(iHashCode, 37, 2, 53) + getLevelsList().hashCode();
                }
                if (getSourcesCount() > 0) {
                    iHashCode = o2.B(iHashCode, 37, 3, 53) + getSourcesList().hashCode();
                }
                int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.k7
            public i7 internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_IOSLogRule_fieldAccessorTable.ensureFieldAccessorsInitialized(IOSLogRule.class, Builder.class);
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
                return new IOSLogRule();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                if (this.tag_ != null) {
                    h0Var.writeMessage(1, getTag());
                }
                for (int i10 = 0; i10 < this.levels_.size(); i10++) {
                    h0Var.writeMessage(2, this.levels_.get(i10));
                }
                for (int i11 = 0; i11 < this.sources_.size(); i11++) {
                    h0Var.writeMessage(3, this.sources_.get(i11));
                }
                this.unknownFields.writeTo(h0Var);
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends o6 implements IOSLogRuleOrBuilder {
                private int bitField0_;
                private pa levelsBuilder_;
                private List<StringValue> levels_;
                private pa sourcesBuilder_;
                private List<StringValue> sources_;
                private xa tagBuilder_;
                private StringValue tag_;

                private Builder() {
                    super(null);
                    List<StringValue> list = Collections.EMPTY_LIST;
                    this.levels_ = list;
                    this.sources_ = list;
                    maybeForceBuilderInitialization();
                }

                private void ensureLevelsIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.levels_ = new ArrayList(this.levels_);
                        this.bitField0_ |= 1;
                    }
                }

                private void ensureSourcesIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.sources_ = new ArrayList(this.sources_);
                        this.bitField0_ |= 2;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_IOSLogRule_descriptor;
                }

                private pa getLevelsFieldBuilder() {
                    if (this.levelsBuilder_ == null) {
                        this.levelsBuilder_ = new pa(this.levels_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.levels_ = null;
                    }
                    return this.levelsBuilder_;
                }

                private pa getSourcesFieldBuilder() {
                    if (this.sourcesBuilder_ == null) {
                        this.sourcesBuilder_ = new pa(this.sources_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                        this.sources_ = null;
                    }
                    return this.sourcesBuilder_;
                }

                private xa getTagFieldBuilder() {
                    if (this.tagBuilder_ == null) {
                        this.tagBuilder_ = new xa(getTag(), getParentForChildren(), isClean());
                        this.tag_ = null;
                    }
                    return this.tagBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (k7.alwaysUseFieldBuilders) {
                        getLevelsFieldBuilder();
                        getSourcesFieldBuilder();
                    }
                }

                public Builder addAllLevels(Iterable<? extends StringValue> iterable) {
                    pa paVar = this.levelsBuilder_;
                    if (paVar != null) {
                        paVar.addAllMessages(iterable);
                        return this;
                    }
                    ensureLevelsIsMutable();
                    b.a.addAll((Iterable) iterable, (List) this.levels_);
                    onChanged();
                    return this;
                }

                public Builder addAllSources(Iterable<? extends StringValue> iterable) {
                    pa paVar = this.sourcesBuilder_;
                    if (paVar != null) {
                        paVar.addAllMessages(iterable);
                        return this;
                    }
                    ensureSourcesIsMutable();
                    b.a.addAll((Iterable) iterable, (List) this.sources_);
                    onChanged();
                    return this;
                }

                public Builder addLevels(StringValue stringValue) {
                    pa paVar = this.levelsBuilder_;
                    if (paVar != null) {
                        paVar.addMessage(stringValue);
                        return this;
                    }
                    stringValue.getClass();
                    ensureLevelsIsMutable();
                    this.levels_.add(stringValue);
                    onChanged();
                    return this;
                }

                public StringValue.Builder addLevelsBuilder() {
                    return (StringValue.Builder) getLevelsFieldBuilder().addBuilder(StringValue.getDefaultInstance());
                }

                public Builder addSources(StringValue stringValue) {
                    pa paVar = this.sourcesBuilder_;
                    if (paVar != null) {
                        paVar.addMessage(stringValue);
                        return this;
                    }
                    stringValue.getClass();
                    ensureSourcesIsMutable();
                    this.sources_.add(stringValue);
                    onChanged();
                    return this;
                }

                public StringValue.Builder addSourcesBuilder() {
                    return (StringValue.Builder) getSourcesFieldBuilder().addBuilder(StringValue.getDefaultInstance());
                }

                public Builder clearLevels() {
                    pa paVar = this.levelsBuilder_;
                    if (paVar != null) {
                        paVar.clear();
                        return this;
                    }
                    this.levels_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearSources() {
                    pa paVar = this.sourcesBuilder_;
                    if (paVar != null) {
                        paVar.clear();
                        return this;
                    }
                    this.sources_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                public Builder clearTag() {
                    if (this.tagBuilder_ == null) {
                        this.tag_ = null;
                        onChanged();
                        return this;
                    }
                    this.tag_ = null;
                    this.tagBuilder_ = null;
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_IOSLogRule_descriptor;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public StringValue getLevels(int i10) {
                    pa paVar = this.levelsBuilder_;
                    return paVar == null ? this.levels_.get(i10) : (StringValue) paVar.getMessage(i10);
                }

                public StringValue.Builder getLevelsBuilder(int i10) {
                    return (StringValue.Builder) getLevelsFieldBuilder().getBuilder(i10);
                }

                public List<StringValue.Builder> getLevelsBuilderList() {
                    return getLevelsFieldBuilder().getBuilderList();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public int getLevelsCount() {
                    pa paVar = this.levelsBuilder_;
                    return paVar == null ? this.levels_.size() : paVar.getCount();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public List<StringValue> getLevelsList() {
                    pa paVar = this.levelsBuilder_;
                    return paVar == null ? Collections.unmodifiableList(this.levels_) : paVar.getMessageList();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public ib getLevelsOrBuilder(int i10) {
                    pa paVar = this.levelsBuilder_;
                    return paVar == null ? this.levels_.get(i10) : (ib) paVar.getMessageOrBuilder(i10);
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public List<? extends ib> getLevelsOrBuilderList() {
                    pa paVar = this.levelsBuilder_;
                    return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.levels_);
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public StringValue getSources(int i10) {
                    pa paVar = this.sourcesBuilder_;
                    return paVar == null ? this.sources_.get(i10) : (StringValue) paVar.getMessage(i10);
                }

                public StringValue.Builder getSourcesBuilder(int i10) {
                    return (StringValue.Builder) getSourcesFieldBuilder().getBuilder(i10);
                }

                public List<StringValue.Builder> getSourcesBuilderList() {
                    return getSourcesFieldBuilder().getBuilderList();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public int getSourcesCount() {
                    pa paVar = this.sourcesBuilder_;
                    return paVar == null ? this.sources_.size() : paVar.getCount();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public List<StringValue> getSourcesList() {
                    pa paVar = this.sourcesBuilder_;
                    return paVar == null ? Collections.unmodifiableList(this.sources_) : paVar.getMessageList();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public ib getSourcesOrBuilder(int i10) {
                    pa paVar = this.sourcesBuilder_;
                    return paVar == null ? this.sources_.get(i10) : (ib) paVar.getMessageOrBuilder(i10);
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public List<? extends ib> getSourcesOrBuilderList() {
                    pa paVar = this.sourcesBuilder_;
                    return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.sources_);
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public StringValue getTag() {
                    xa xaVar = this.tagBuilder_;
                    if (xaVar != null) {
                        return (StringValue) xaVar.getMessage();
                    }
                    StringValue stringValue = this.tag_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                public StringValue.Builder getTagBuilder() {
                    onChanged();
                    return (StringValue.Builder) getTagFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public ib getTagOrBuilder() {
                    xa xaVar = this.tagBuilder_;
                    if (xaVar != null) {
                        return (ib) xaVar.getMessageOrBuilder();
                    }
                    StringValue stringValue = this.tag_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public boolean hasTag() {
                    return (this.tagBuilder_ == null && this.tag_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_IOSLogRule_fieldAccessorTable.ensureFieldAccessorsInitialized(IOSLogRule.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeTag(StringValue stringValue) {
                    xa xaVar = this.tagBuilder_;
                    if (xaVar != null) {
                        xaVar.mergeFrom(stringValue);
                        return this;
                    }
                    StringValue stringValue2 = this.tag_;
                    if (stringValue2 != null) {
                        this.tag_ = g.h(stringValue2, stringValue);
                    } else {
                        this.tag_ = stringValue;
                    }
                    onChanged();
                    return this;
                }

                public Builder removeLevels(int i10) {
                    pa paVar = this.levelsBuilder_;
                    if (paVar != null) {
                        paVar.remove(i10);
                        return this;
                    }
                    ensureLevelsIsMutable();
                    this.levels_.remove(i10);
                    onChanged();
                    return this;
                }

                public Builder removeSources(int i10) {
                    pa paVar = this.sourcesBuilder_;
                    if (paVar != null) {
                        paVar.remove(i10);
                        return this;
                    }
                    ensureSourcesIsMutable();
                    this.sources_.remove(i10);
                    onChanged();
                    return this;
                }

                public Builder setLevels(int i10, StringValue stringValue) {
                    pa paVar = this.levelsBuilder_;
                    if (paVar != null) {
                        paVar.setMessage(i10, stringValue);
                        return this;
                    }
                    stringValue.getClass();
                    ensureLevelsIsMutable();
                    this.levels_.set(i10, stringValue);
                    onChanged();
                    return this;
                }

                public Builder setSources(int i10, StringValue stringValue) {
                    pa paVar = this.sourcesBuilder_;
                    if (paVar != null) {
                        paVar.setMessage(i10, stringValue);
                        return this;
                    }
                    stringValue.getClass();
                    ensureSourcesIsMutable();
                    this.sources_.set(i10, stringValue);
                    onChanged();
                    return this;
                }

                public Builder setTag(StringValue stringValue) {
                    xa xaVar = this.tagBuilder_;
                    if (xaVar != null) {
                        xaVar.setMessage(stringValue);
                        return this;
                    }
                    stringValue.getClass();
                    this.tag_ = stringValue;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public IOSLogRule build() {
                    IOSLogRule iOSLogRuleBuildPartial = buildPartial();
                    if (iOSLogRuleBuildPartial.isInitialized()) {
                        return iOSLogRuleBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) iOSLogRuleBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public IOSLogRule buildPartial() {
                    IOSLogRule iOSLogRule = new IOSLogRule(this);
                    xa xaVar = this.tagBuilder_;
                    if (xaVar == null) {
                        iOSLogRule.tag_ = this.tag_;
                    } else {
                        iOSLogRule.tag_ = (StringValue) xaVar.build();
                    }
                    pa paVar = this.levelsBuilder_;
                    if (paVar != null) {
                        iOSLogRule.levels_ = paVar.build();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.levels_ = Collections.unmodifiableList(this.levels_);
                            this.bitField0_ &= -2;
                        }
                        iOSLogRule.levels_ = this.levels_;
                    }
                    pa paVar2 = this.sourcesBuilder_;
                    if (paVar2 != null) {
                        iOSLogRule.sources_ = paVar2.build();
                    } else {
                        if ((this.bitField0_ & 2) != 0) {
                            this.sources_ = Collections.unmodifiableList(this.sources_);
                            this.bitField0_ &= -3;
                        }
                        iOSLogRule.sources_ = this.sources_;
                    }
                    onBuilt();
                    return iOSLogRule;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public IOSLogRule getDefaultInstanceForType() {
                    return IOSLogRule.getDefaultInstance();
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

                public StringValue.Builder addLevelsBuilder(int i10) {
                    return (StringValue.Builder) getLevelsFieldBuilder().addBuilder(i10, StringValue.getDefaultInstance());
                }

                public StringValue.Builder addSourcesBuilder(int i10) {
                    return (StringValue.Builder) getSourcesFieldBuilder().addBuilder(i10, StringValue.getDefaultInstance());
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
                    if (this.tagBuilder_ == null) {
                        this.tag_ = null;
                    } else {
                        this.tag_ = null;
                        this.tagBuilder_ = null;
                    }
                    pa paVar = this.levelsBuilder_;
                    if (paVar == null) {
                        this.levels_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -2;
                    } else {
                        paVar.clear();
                    }
                    pa paVar2 = this.sourcesBuilder_;
                    if (paVar2 == null) {
                        this.sources_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -3;
                        return this;
                    }
                    paVar2.clear();
                    return this;
                }

                public Builder setTag(StringValue.Builder builder) {
                    xa xaVar = this.tagBuilder_;
                    if (xaVar == null) {
                        this.tag_ = builder.build();
                        onChanged();
                        return this;
                    }
                    xaVar.setMessage(builder.build());
                    return this;
                }

                private Builder(p6 p6Var) {
                    super(p6Var);
                    List<StringValue> list = Collections.EMPTY_LIST;
                    this.levels_ = list;
                    this.sources_ = list;
                    maybeForceBuilderInitialization();
                }

                public Builder addLevels(int i10, StringValue stringValue) {
                    pa paVar = this.levelsBuilder_;
                    if (paVar == null) {
                        stringValue.getClass();
                        ensureLevelsIsMutable();
                        this.levels_.add(i10, stringValue);
                        onChanged();
                        return this;
                    }
                    paVar.addMessage(i10, stringValue);
                    return this;
                }

                public Builder addSources(int i10, StringValue stringValue) {
                    pa paVar = this.sourcesBuilder_;
                    if (paVar == null) {
                        stringValue.getClass();
                        ensureSourcesIsMutable();
                        this.sources_.add(i10, stringValue);
                        onChanged();
                        return this;
                    }
                    paVar.addMessage(i10, stringValue);
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
                /* renamed from: clone */
                public Builder mo500clone() {
                    return (Builder) super.mo500clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof IOSLogRule) {
                        return mergeFrom((IOSLogRule) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setLevels(int i10, StringValue.Builder builder) {
                    pa paVar = this.levelsBuilder_;
                    if (paVar == null) {
                        ensureLevelsIsMutable();
                        this.levels_.set(i10, builder.build());
                        onChanged();
                        return this;
                    }
                    paVar.setMessage(i10, builder.build());
                    return this;
                }

                public Builder setSources(int i10, StringValue.Builder builder) {
                    pa paVar = this.sourcesBuilder_;
                    if (paVar == null) {
                        ensureSourcesIsMutable();
                        this.sources_.set(i10, builder.build());
                        onChanged();
                        return this;
                    }
                    paVar.setMessage(i10, builder.build());
                    return this;
                }

                public Builder mergeFrom(IOSLogRule iOSLogRule) {
                    if (iOSLogRule == IOSLogRule.getDefaultInstance()) {
                        return this;
                    }
                    if (iOSLogRule.hasTag()) {
                        mergeTag(iOSLogRule.getTag());
                    }
                    if (this.levelsBuilder_ == null) {
                        if (!iOSLogRule.levels_.isEmpty()) {
                            if (this.levels_.isEmpty()) {
                                this.levels_ = iOSLogRule.levels_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureLevelsIsMutable();
                                this.levels_.addAll(iOSLogRule.levels_);
                            }
                            onChanged();
                        }
                    } else if (!iOSLogRule.levels_.isEmpty()) {
                        if (!this.levelsBuilder_.isEmpty()) {
                            this.levelsBuilder_.addAllMessages(iOSLogRule.levels_);
                        } else {
                            this.levelsBuilder_.dispose();
                            this.levelsBuilder_ = null;
                            this.levels_ = iOSLogRule.levels_;
                            this.bitField0_ &= -2;
                            this.levelsBuilder_ = k7.alwaysUseFieldBuilders ? getLevelsFieldBuilder() : null;
                        }
                    }
                    if (this.sourcesBuilder_ == null) {
                        if (!iOSLogRule.sources_.isEmpty()) {
                            if (this.sources_.isEmpty()) {
                                this.sources_ = iOSLogRule.sources_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureSourcesIsMutable();
                                this.sources_.addAll(iOSLogRule.sources_);
                            }
                            onChanged();
                        }
                    } else if (!iOSLogRule.sources_.isEmpty()) {
                        if (!this.sourcesBuilder_.isEmpty()) {
                            this.sourcesBuilder_.addAllMessages(iOSLogRule.sources_);
                        } else {
                            this.sourcesBuilder_.dispose();
                            this.sourcesBuilder_ = null;
                            this.sources_ = iOSLogRule.sources_;
                            this.bitField0_ &= -3;
                            this.sourcesBuilder_ = k7.alwaysUseFieldBuilders ? getSourcesFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((k7) iOSLogRule).unknownFields);
                    onChanged();
                    return this;
                }

                public Builder addLevels(StringValue.Builder builder) {
                    pa paVar = this.levelsBuilder_;
                    if (paVar == null) {
                        ensureLevelsIsMutable();
                        this.levels_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    paVar.addMessage(builder.build());
                    return this;
                }

                public Builder addSources(StringValue.Builder builder) {
                    pa paVar = this.sourcesBuilder_;
                    if (paVar == null) {
                        ensureSourcesIsMutable();
                        this.sources_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    paVar.addMessage(builder.build());
                    return this;
                }

                public Builder addLevels(int i10, StringValue.Builder builder) {
                    pa paVar = this.levelsBuilder_;
                    if (paVar == null) {
                        ensureLevelsIsMutable();
                        this.levels_.add(i10, builder.build());
                        onChanged();
                        return this;
                    }
                    paVar.addMessage(i10, builder.build());
                    return this;
                }

                public Builder addSources(int i10, StringValue.Builder builder) {
                    pa paVar = this.sourcesBuilder_;
                    if (paVar == null) {
                        ensureSourcesIsMutable();
                        this.sources_.add(i10, builder.build());
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
                public io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRule.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRule.access$3200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.sdk.Reader$Rule$IOSLogRule r3 = (io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRule) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.sdk.Reader$Rule$IOSLogRule r4 = (io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRule) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRule.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sdk.Reader$Rule$IOSLogRule$Builder");
                }
            }

            public static Builder newBuilder(IOSLogRule iOSLogRule) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(iOSLogRule);
            }

            public static IOSLogRule parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (IOSLogRule) PARSER.parseFrom(byteBuffer, m5Var);
            }

            private IOSLogRule(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static IOSLogRule parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (IOSLogRule) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static IOSLogRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (IOSLogRule) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public IOSLogRule getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static IOSLogRule parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (IOSLogRule) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private IOSLogRule() {
                this.memoizedIsInitialized = (byte) -1;
                List<StringValue> list = Collections.EMPTY_LIST;
                this.levels_ = list;
                this.sources_ = list;
            }

            public static IOSLogRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (IOSLogRule) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static IOSLogRule parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (IOSLogRule) PARSER.parseFrom(bArr, m5Var);
            }

            public static IOSLogRule parseFrom(InputStream inputStream) throws IOException {
                return (IOSLogRule) k7.parseWithIOException(PARSER, inputStream);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private IOSLogRule(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                        StringValue stringValue = this.tag_;
                                        StringValue.Builder builder = stringValue != null ? stringValue.toBuilder() : null;
                                        StringValue stringValue2 = (StringValue) yVar.readMessage(StringValue.parser(), m5Var);
                                        this.tag_ = stringValue2;
                                        if (builder != null) {
                                            builder.mergeFrom(stringValue2);
                                            this.tag_ = builder.buildPartial();
                                        }
                                    } else if (tag == 18) {
                                        if ((i10 & 1) == 0) {
                                            this.levels_ = new ArrayList();
                                            i10 |= 1;
                                        }
                                        this.levels_.add(yVar.readMessage(StringValue.parser(), m5Var));
                                    } else if (tag != 26) {
                                        if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                        }
                                    } else {
                                        if ((i10 & 2) == 0) {
                                            this.sources_ = new ArrayList();
                                            i10 |= 2;
                                        }
                                        this.sources_.add(yVar.readMessage(StringValue.parser(), m5Var));
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
                            this.levels_ = Collections.unmodifiableList(this.levels_);
                        }
                        if ((i10 & 2) != 0) {
                            this.sources_ = Collections.unmodifiableList(this.sources_);
                        }
                        this.unknownFields = ccVarNewBuilder.build();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                if ((i10 & 1) != 0) {
                    this.levels_ = Collections.unmodifiableList(this.levels_);
                }
                if ((i10 & 2) != 0) {
                    this.sources_ = Collections.unmodifiableList(this.sources_);
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
            }

            public static IOSLogRule parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (IOSLogRule) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            public static IOSLogRule parseFrom(y yVar) throws IOException {
                return (IOSLogRule) k7.parseWithIOException(PARSER, yVar);
            }

            public static IOSLogRule parseFrom(y yVar, m5 m5Var) throws IOException {
                return (IOSLogRule) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface IOSLogRuleOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            StringValue getLevels(int i10);

            int getLevelsCount();

            List<StringValue> getLevelsList();

            ib getLevelsOrBuilder(int i10);

            List<? extends ib> getLevelsOrBuilderList();

            StringValue getSources(int i10);

            int getSourcesCount();

            List<StringValue> getSourcesList();

            ib getSourcesOrBuilder(int i10);

            List<? extends ib> getSourcesOrBuilderList();

            StringValue getTag();

            ib getTagOrBuilder();

            boolean hasTag();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public enum RuleOneofCase implements o7, c {
            GENERAL_RULE(1),
            IOS_LOG_RULE(2),
            RULEONEOF_NOT_SET(0);

            private final int value;

            RuleOneofCase(int i10) {
                this.value = i10;
            }

            public static RuleOneofCase forNumber(int i10) {
                if (i10 == 0) {
                    return RULEONEOF_NOT_SET;
                }
                if (i10 == 1) {
                    return GENERAL_RULE;
                }
                if (i10 != 2) {
                    return null;
                }
                return IOS_LOG_RULE;
            }

            @Override // com.explorestack.protobuf.o7
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static RuleOneofCase valueOf(int i10) {
                return forNumber(i10);
            }
        }

        public static Rule getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Rule parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Rule) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Rule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Rule) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Rule)) {
                return super.equals(obj);
            }
            Rule rule = (Rule) obj;
            if (!getRuleOneofCase().equals(rule.getRuleOneofCase())) {
                return false;
            }
            int i10 = this.ruleOneofCase_;
            if (i10 != 1) {
                if (i10 == 2 && !getIosLogRule().equals(rule.getIosLogRule())) {
                    return false;
                }
            } else if (!getGeneralRule().equals(rule.getGeneralRule())) {
                return false;
            }
            return this.unknownFields.equals(rule.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
        public GeneralRule getGeneralRule() {
            return this.ruleOneofCase_ == 1 ? (GeneralRule) this.ruleOneof_ : GeneralRule.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
        public GeneralRuleOrBuilder getGeneralRuleOrBuilder() {
            return this.ruleOneofCase_ == 1 ? (GeneralRule) this.ruleOneof_ : GeneralRule.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
        public IOSLogRule getIosLogRule() {
            return this.ruleOneofCase_ == 2 ? (IOSLogRule) this.ruleOneof_ : IOSLogRule.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
        public IOSLogRuleOrBuilder getIosLogRuleOrBuilder() {
            return this.ruleOneofCase_ == 2 ? (IOSLogRule) this.ruleOneof_ : IOSLogRule.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public fa getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
        public RuleOneofCase getRuleOneofCase() {
            return RuleOneofCase.forNumber(this.ruleOneofCase_);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = this.ruleOneofCase_ == 1 ? h0.computeMessageSize(1, (GeneralRule) this.ruleOneof_) : 0;
            if (this.ruleOneofCase_ == 2) {
                iComputeMessageSize += h0.computeMessageSize(2, (IOSLogRule) this.ruleOneof_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
        public final gc getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
        public boolean hasGeneralRule() {
            return this.ruleOneofCase_ == 1;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
        public boolean hasIosLogRule() {
            return this.ruleOneofCase_ == 2;
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
            int i11 = this.ruleOneofCase_;
            if (i11 != 1) {
                if (i11 == 2) {
                    iB = o2.B(iHashCode2, 37, 2, 53);
                    iHashCode = getIosLogRule().hashCode();
                }
                int iHashCode3 = this.unknownFields.hashCode() + (iHashCode2 * 29);
                this.memoizedHashCode = iHashCode3;
                return iHashCode3;
            }
            iB = o2.B(iHashCode2, 37, 1, 53);
            iHashCode = getGeneralRule().hashCode();
            iHashCode2 = iB + iHashCode;
            int iHashCode32 = this.unknownFields.hashCode() + (iHashCode2 * 29);
            this.memoizedHashCode = iHashCode32;
            return iHashCode32;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_fieldAccessorTable.ensureFieldAccessorsInitialized(Rule.class, Builder.class);
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
            return new Rule();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            if (this.ruleOneofCase_ == 1) {
                h0Var.writeMessage(1, (GeneralRule) this.ruleOneof_);
            }
            if (this.ruleOneofCase_ == 2) {
                h0Var.writeMessage(2, (IOSLogRule) this.ruleOneof_);
            }
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements RuleOrBuilder {
            private xa generalRuleBuilder_;
            private xa iosLogRuleBuilder_;
            private int ruleOneofCase_;
            private Object ruleOneof_;

            private Builder() {
                super(null);
                this.ruleOneofCase_ = 0;
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_descriptor;
            }

            private xa getGeneralRuleFieldBuilder() {
                if (this.generalRuleBuilder_ == null) {
                    if (this.ruleOneofCase_ != 1) {
                        this.ruleOneof_ = GeneralRule.getDefaultInstance();
                    }
                    this.generalRuleBuilder_ = new xa((GeneralRule) this.ruleOneof_, getParentForChildren(), isClean());
                    this.ruleOneof_ = null;
                }
                this.ruleOneofCase_ = 1;
                onChanged();
                return this.generalRuleBuilder_;
            }

            private xa getIosLogRuleFieldBuilder() {
                if (this.iosLogRuleBuilder_ == null) {
                    if (this.ruleOneofCase_ != 2) {
                        this.ruleOneof_ = IOSLogRule.getDefaultInstance();
                    }
                    this.iosLogRuleBuilder_ = new xa((IOSLogRule) this.ruleOneof_, getParentForChildren(), isClean());
                    this.ruleOneof_ = null;
                }
                this.ruleOneofCase_ = 2;
                onChanged();
                return this.iosLogRuleBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = k7.alwaysUseFieldBuilders;
            }

            public Builder clearGeneralRule() {
                xa xaVar = this.generalRuleBuilder_;
                if (xaVar == null) {
                    if (this.ruleOneofCase_ == 1) {
                        this.ruleOneofCase_ = 0;
                        this.ruleOneof_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.ruleOneofCase_ == 1) {
                    this.ruleOneofCase_ = 0;
                    this.ruleOneof_ = null;
                }
                xaVar.clear();
                return this;
            }

            public Builder clearIosLogRule() {
                xa xaVar = this.iosLogRuleBuilder_;
                if (xaVar == null) {
                    if (this.ruleOneofCase_ == 2) {
                        this.ruleOneofCase_ = 0;
                        this.ruleOneof_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.ruleOneofCase_ == 2) {
                    this.ruleOneofCase_ = 0;
                    this.ruleOneof_ = null;
                }
                xaVar.clear();
                return this;
            }

            public Builder clearRuleOneof() {
                this.ruleOneofCase_ = 0;
                this.ruleOneof_ = null;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
            public GeneralRule getGeneralRule() {
                xa xaVar = this.generalRuleBuilder_;
                return xaVar == null ? this.ruleOneofCase_ == 1 ? (GeneralRule) this.ruleOneof_ : GeneralRule.getDefaultInstance() : this.ruleOneofCase_ == 1 ? (GeneralRule) xaVar.getMessage() : GeneralRule.getDefaultInstance();
            }

            public GeneralRule.Builder getGeneralRuleBuilder() {
                return (GeneralRule.Builder) getGeneralRuleFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
            public GeneralRuleOrBuilder getGeneralRuleOrBuilder() {
                xa xaVar;
                int i10 = this.ruleOneofCase_;
                return (i10 != 1 || (xaVar = this.generalRuleBuilder_) == null) ? i10 == 1 ? (GeneralRule) this.ruleOneof_ : GeneralRule.getDefaultInstance() : (GeneralRuleOrBuilder) xaVar.getMessageOrBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
            public IOSLogRule getIosLogRule() {
                xa xaVar = this.iosLogRuleBuilder_;
                return xaVar == null ? this.ruleOneofCase_ == 2 ? (IOSLogRule) this.ruleOneof_ : IOSLogRule.getDefaultInstance() : this.ruleOneofCase_ == 2 ? (IOSLogRule) xaVar.getMessage() : IOSLogRule.getDefaultInstance();
            }

            public IOSLogRule.Builder getIosLogRuleBuilder() {
                return (IOSLogRule.Builder) getIosLogRuleFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
            public IOSLogRuleOrBuilder getIosLogRuleOrBuilder() {
                xa xaVar;
                int i10 = this.ruleOneofCase_;
                return (i10 != 2 || (xaVar = this.iosLogRuleBuilder_) == null) ? i10 == 2 ? (IOSLogRule) this.ruleOneof_ : IOSLogRule.getDefaultInstance() : (IOSLogRuleOrBuilder) xaVar.getMessageOrBuilder();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
            public RuleOneofCase getRuleOneofCase() {
                return RuleOneofCase.forNumber(this.ruleOneofCase_);
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
            public boolean hasGeneralRule() {
                return this.ruleOneofCase_ == 1;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
            public boolean hasIosLogRule() {
                return this.ruleOneofCase_ == 2;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_fieldAccessorTable.ensureFieldAccessorsInitialized(Rule.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeGeneralRule(GeneralRule generalRule) {
                xa xaVar = this.generalRuleBuilder_;
                if (xaVar == null) {
                    if (this.ruleOneofCase_ != 1 || this.ruleOneof_ == GeneralRule.getDefaultInstance()) {
                        this.ruleOneof_ = generalRule;
                    } else {
                        this.ruleOneof_ = GeneralRule.newBuilder((GeneralRule) this.ruleOneof_).mergeFrom(generalRule).buildPartial();
                    }
                    onChanged();
                } else {
                    if (this.ruleOneofCase_ == 1) {
                        xaVar.mergeFrom(generalRule);
                    }
                    this.generalRuleBuilder_.setMessage(generalRule);
                }
                this.ruleOneofCase_ = 1;
                return this;
            }

            public Builder mergeIosLogRule(IOSLogRule iOSLogRule) {
                xa xaVar = this.iosLogRuleBuilder_;
                if (xaVar == null) {
                    if (this.ruleOneofCase_ != 2 || this.ruleOneof_ == IOSLogRule.getDefaultInstance()) {
                        this.ruleOneof_ = iOSLogRule;
                    } else {
                        this.ruleOneof_ = IOSLogRule.newBuilder((IOSLogRule) this.ruleOneof_).mergeFrom(iOSLogRule).buildPartial();
                    }
                    onChanged();
                } else {
                    if (this.ruleOneofCase_ == 2) {
                        xaVar.mergeFrom(iOSLogRule);
                    }
                    this.iosLogRuleBuilder_.setMessage(iOSLogRule);
                }
                this.ruleOneofCase_ = 2;
                return this;
            }

            public Builder setGeneralRule(GeneralRule generalRule) {
                xa xaVar = this.generalRuleBuilder_;
                if (xaVar == null) {
                    generalRule.getClass();
                    this.ruleOneof_ = generalRule;
                    onChanged();
                } else {
                    xaVar.setMessage(generalRule);
                }
                this.ruleOneofCase_ = 1;
                return this;
            }

            public Builder setIosLogRule(IOSLogRule iOSLogRule) {
                xa xaVar = this.iosLogRuleBuilder_;
                if (xaVar == null) {
                    iOSLogRule.getClass();
                    this.ruleOneof_ = iOSLogRule;
                    onChanged();
                } else {
                    xaVar.setMessage(iOSLogRule);
                }
                this.ruleOneofCase_ = 2;
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Rule build() {
                Rule ruleBuildPartial = buildPartial();
                if (ruleBuildPartial.isInitialized()) {
                    return ruleBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) ruleBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Rule buildPartial() {
                Rule rule = new Rule(this);
                if (this.ruleOneofCase_ == 1) {
                    xa xaVar = this.generalRuleBuilder_;
                    if (xaVar == null) {
                        rule.ruleOneof_ = this.ruleOneof_;
                    } else {
                        rule.ruleOneof_ = xaVar.build();
                    }
                }
                if (this.ruleOneofCase_ == 2) {
                    xa xaVar2 = this.iosLogRuleBuilder_;
                    if (xaVar2 == null) {
                        rule.ruleOneof_ = this.ruleOneof_;
                    } else {
                        rule.ruleOneof_ = xaVar2.build();
                    }
                }
                rule.ruleOneofCase_ = this.ruleOneofCase_;
                onBuilt();
                return rule;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Rule getDefaultInstanceForType() {
                return Rule.getDefaultInstance();
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
                this.ruleOneofCase_ = 0;
                this.ruleOneof_ = null;
                return this;
            }

            private Builder(p6 p6Var) {
                super(p6Var);
                this.ruleOneofCase_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
            /* renamed from: clone */
            public Builder mo500clone() {
                return (Builder) super.mo500clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Rule) {
                    return mergeFrom((Rule) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setGeneralRule(GeneralRule.Builder builder) {
                xa xaVar = this.generalRuleBuilder_;
                if (xaVar == null) {
                    this.ruleOneof_ = builder.build();
                    onChanged();
                } else {
                    xaVar.setMessage(builder.build());
                }
                this.ruleOneofCase_ = 1;
                return this;
            }

            public Builder setIosLogRule(IOSLogRule.Builder builder) {
                xa xaVar = this.iosLogRuleBuilder_;
                if (xaVar == null) {
                    this.ruleOneof_ = builder.build();
                    onChanged();
                } else {
                    xaVar.setMessage(builder.build());
                }
                this.ruleOneofCase_ = 2;
                return this;
            }

            public Builder mergeFrom(Rule rule) {
                if (rule == Rule.getDefaultInstance()) {
                    return this;
                }
                int i10 = AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$sdk$Reader$Rule$RuleOneofCase[rule.getRuleOneofCase().ordinal()];
                if (i10 == 1) {
                    mergeGeneralRule(rule.getGeneralRule());
                } else if (i10 == 2) {
                    mergeIosLogRule(rule.getIosLogRule());
                }
                mergeUnknownFields(((k7) rule).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public io.bidmachine.protobuf.sdk.Reader.Rule.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sdk.Reader.Rule.access$4100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sdk.Reader$Rule r3 = (io.bidmachine.protobuf.sdk.Reader.Rule) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sdk.Reader$Rule r4 = (io.bidmachine.protobuf.sdk.Reader.Rule) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Reader.Rule.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sdk.Reader$Rule$Builder");
            }
        }

        public static Builder newBuilder(Rule rule) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(rule);
        }

        public static Rule parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (Rule) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private Rule(o6 o6Var) {
            super(o6Var);
            this.ruleOneofCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Rule parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Rule) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static Rule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Rule) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Rule getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Rule parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (Rule) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Rule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Rule) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        private Rule() {
            this.ruleOneofCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Rule parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (Rule) PARSER.parseFrom(bArr, m5Var);
        }

        public static Rule parseFrom(InputStream inputStream) throws IOException {
            return (Rule) k7.parseWithIOException(PARSER, inputStream);
        }

        private Rule(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                GeneralRule.Builder builder = this.ruleOneofCase_ == 1 ? ((GeneralRule) this.ruleOneof_).toBuilder() : null;
                                MessageLite message = yVar.readMessage(GeneralRule.parser(), m5Var);
                                this.ruleOneof_ = message;
                                if (builder != null) {
                                    builder.mergeFrom((GeneralRule) message);
                                    this.ruleOneof_ = builder.buildPartial();
                                }
                                this.ruleOneofCase_ = 1;
                            } else if (tag != 18) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                IOSLogRule.Builder builder2 = this.ruleOneofCase_ == 2 ? ((IOSLogRule) this.ruleOneof_).toBuilder() : null;
                                MessageLite message2 = yVar.readMessage(IOSLogRule.parser(), m5Var);
                                this.ruleOneof_ = message2;
                                if (builder2 != null) {
                                    builder2.mergeFrom((IOSLogRule) message2);
                                    this.ruleOneof_ = builder2.buildPartial();
                                }
                                this.ruleOneofCase_ = 2;
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

        public static Rule parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Rule) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static Rule parseFrom(y yVar) throws IOException {
            return (Rule) k7.parseWithIOException(PARSER, yVar);
        }

        public static Rule parseFrom(y yVar, m5 m5Var) throws IOException {
            return (Rule) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface RuleOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        Rule.GeneralRule getGeneralRule();

        Rule.GeneralRuleOrBuilder getGeneralRuleOrBuilder();

        Rule.IOSLogRule getIosLogRule();

        Rule.IOSLogRuleOrBuilder getIosLogRuleOrBuilder();

        Rule.RuleOneofCase getRuleOneofCase();

        boolean hasGeneralRule();

        boolean hasIosLogRule();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static Reader getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Reader parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Reader) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Reader parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Reader) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Reader)) {
            return super.equals(obj);
        }
        Reader reader = (Reader) obj;
        if (getName().equals(reader.getName()) && hasTimestamp() == reader.hasTimestamp()) {
            return (!hasTimestamp() || getTimestamp().equals(reader.getTimestamp())) && getRecordsList().equals(reader.getRecordsList()) && this.unknownFields.equals(reader.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
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

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
    public Record getRecords(int i10) {
        return this.records_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
    public int getRecordsCount() {
        return this.records_.size();
    }

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
    public List<Record> getRecordsList() {
        return this.records_;
    }

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
    public RecordOrBuilder getRecordsOrBuilder(int i10) {
        return this.records_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
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
        if (this.timestamp_ != null) {
            iComputeStringSize += h0.computeMessageSize(2, getTimestamp());
        }
        for (int i11 = 0; i11 < this.records_.size(); i11++) {
            iComputeStringSize += h0.computeMessageSize(3, this.records_.get(i11));
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
    public Timestamp getTimestamp() {
        Timestamp timestamp = this.timestamp_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
    public sb getTimestampOrBuilder() {
        return getTimestamp();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
    public boolean hasTimestamp() {
        return this.timestamp_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
        if (hasTimestamp()) {
            iHashCode = getTimestamp().hashCode() + o2.B(iHashCode, 37, 2, 53);
        }
        if (getRecordsCount() > 0) {
            iHashCode = getRecordsList().hashCode() + o2.B(iHashCode, 37, 3, 53);
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_fieldAccessorTable.ensureFieldAccessorsInitialized(Reader.class, Builder.class);
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
        return new Reader();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (!getNameBytes().isEmpty()) {
            k7.writeString(h0Var, 1, this.name_);
        }
        if (this.timestamp_ != null) {
            h0Var.writeMessage(2, getTimestamp());
        }
        for (int i10 = 0; i10 < this.records_.size(); i10++) {
            h0Var.writeMessage(3, this.records_.get(i10));
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements ReaderOrBuilder {
        private int bitField0_;
        private Object name_;
        private pa recordsBuilder_;
        private List<Record> records_;
        private xa timestampBuilder_;
        private Timestamp timestamp_;

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
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_descriptor;
        }

        private pa getRecordsFieldBuilder() {
            if (this.recordsBuilder_ == null) {
                this.recordsBuilder_ = new pa(this.records_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.records_ = null;
            }
            return this.recordsBuilder_;
        }

        private xa getTimestampFieldBuilder() {
            if (this.timestampBuilder_ == null) {
                this.timestampBuilder_ = new xa(getTimestamp(), getParentForChildren(), isClean());
                this.timestamp_ = null;
            }
            return this.timestampBuilder_;
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
            this.name_ = Reader.getDefaultInstance().getName();
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
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
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

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
        public int getRecordsCount() {
            pa paVar = this.recordsBuilder_;
            return paVar == null ? this.records_.size() : paVar.getCount();
        }

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
        public List<Record> getRecordsList() {
            pa paVar = this.recordsBuilder_;
            return paVar == null ? Collections.unmodifiableList(this.records_) : paVar.getMessageList();
        }

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
        public RecordOrBuilder getRecordsOrBuilder(int i10) {
            pa paVar = this.recordsBuilder_;
            return paVar == null ? this.records_.get(i10) : (RecordOrBuilder) paVar.getMessageOrBuilder(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
        public List<? extends RecordOrBuilder> getRecordsOrBuilderList() {
            pa paVar = this.recordsBuilder_;
            return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.records_);
        }

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
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

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
        public sb getTimestampOrBuilder() {
            xa xaVar = this.timestampBuilder_;
            if (xaVar != null) {
                return (sb) xaVar.getMessageOrBuilder();
            }
            Timestamp timestamp = this.timestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
        public boolean hasTimestamp() {
            return (this.timestampBuilder_ == null && this.timestamp_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_fieldAccessorTable.ensureFieldAccessorsInitialized(Reader.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
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
        public Reader build() {
            Reader readerBuildPartial = buildPartial();
            if (readerBuildPartial.isInitialized()) {
                return readerBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) readerBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Reader buildPartial() {
            Reader reader = new Reader(this);
            reader.name_ = this.name_;
            xa xaVar = this.timestampBuilder_;
            if (xaVar == null) {
                reader.timestamp_ = this.timestamp_;
            } else {
                reader.timestamp_ = (Timestamp) xaVar.build();
            }
            pa paVar = this.recordsBuilder_;
            if (paVar != null) {
                reader.records_ = paVar.build();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.records_ = Collections.unmodifiableList(this.records_);
                    this.bitField0_ &= -2;
                }
                reader.records_ = this.records_;
            }
            onBuilt();
            return reader;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Reader getDefaultInstanceForType() {
            return Reader.getDefaultInstance();
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
            if (this.timestampBuilder_ == null) {
                this.timestamp_ = null;
            } else {
                this.timestamp_ = null;
                this.timestampBuilder_ = null;
            }
            pa paVar = this.recordsBuilder_;
            if (paVar == null) {
                this.records_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                return this;
            }
            paVar.clear();
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
            if (message instanceof Reader) {
                return mergeFrom((Reader) message);
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

        public Builder mergeFrom(Reader reader) {
            if (reader == Reader.getDefaultInstance()) {
                return this;
            }
            if (!reader.getName().isEmpty()) {
                this.name_ = reader.name_;
                onChanged();
            }
            if (reader.hasTimestamp()) {
                mergeTimestamp(reader.getTimestamp());
            }
            if (this.recordsBuilder_ == null) {
                if (!reader.records_.isEmpty()) {
                    if (this.records_.isEmpty()) {
                        this.records_ = reader.records_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureRecordsIsMutable();
                        this.records_.addAll(reader.records_);
                    }
                    onChanged();
                }
            } else if (!reader.records_.isEmpty()) {
                if (!this.recordsBuilder_.isEmpty()) {
                    this.recordsBuilder_.addAllMessages(reader.records_);
                } else {
                    this.recordsBuilder_.dispose();
                    this.recordsBuilder_ = null;
                    this.records_ = reader.records_;
                    this.bitField0_ &= -2;
                    this.recordsBuilder_ = k7.alwaysUseFieldBuilders ? getRecordsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((k7) reader).unknownFields);
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
        public io.bidmachine.protobuf.sdk.Reader.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sdk.Reader.access$6200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.sdk.Reader r3 = (io.bidmachine.protobuf.sdk.Reader) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.sdk.Reader r4 = (io.bidmachine.protobuf.sdk.Reader) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Reader.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sdk.Reader$Builder");
        }
    }

    public static Builder newBuilder(Reader reader) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(reader);
    }

    public static Reader parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (Reader) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private Reader(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Reader parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Reader) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static Reader parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Reader) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Reader getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Reader parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (Reader) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Reader() {
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.records_ = Collections.EMPTY_LIST;
    }

    public static Reader parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Reader) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static Reader parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (Reader) PARSER.parseFrom(bArr, m5Var);
    }

    public static Reader parseFrom(InputStream inputStream) throws IOException {
        return (Reader) k7.parseWithIOException(PARSER, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Reader(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                            if (tag == 10) {
                                this.name_ = yVar.readStringRequireUtf8();
                            } else if (tag == 18) {
                                Timestamp timestamp = this.timestamp_;
                                Timestamp.Builder builder = timestamp != null ? timestamp.toBuilder() : null;
                                Timestamp timestamp2 = (Timestamp) yVar.readMessage(Timestamp.parser(), m5Var);
                                this.timestamp_ = timestamp2;
                                if (builder != null) {
                                    builder.mergeFrom(timestamp2);
                                    this.timestamp_ = builder.buildPartial();
                                }
                            } else if (tag != 26) {
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
                    }
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

    public static Reader parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Reader) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static Reader parseFrom(y yVar) throws IOException {
        return (Reader) k7.parseWithIOException(PARSER, yVar);
    }

    public static Reader parseFrom(y yVar, m5 m5Var) throws IOException {
        return (Reader) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
