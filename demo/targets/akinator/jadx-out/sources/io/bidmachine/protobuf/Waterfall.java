package io.bidmachine.protobuf;

import a.b;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.DoubleValue;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.UInt32Value;
import com.explorestack.protobuf.UInt64Value;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.b9;
import com.explorestack.protobuf.bd;
import com.explorestack.protobuf.c;
import com.explorestack.protobuf.cc;
import com.explorestack.protobuf.d;
import com.explorestack.protobuf.fa;
import com.explorestack.protobuf.gc;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.ib;
import com.explorestack.protobuf.j7;
import com.explorestack.protobuf.ja;
import com.explorestack.protobuf.jb;
import com.explorestack.protobuf.k7;
import com.explorestack.protobuf.m5;
import com.explorestack.protobuf.o6;
import com.explorestack.protobuf.o7;
import com.explorestack.protobuf.p6;
import com.explorestack.protobuf.p7;
import com.explorestack.protobuf.pa;
import com.explorestack.protobuf.s8;
import com.explorestack.protobuf.x7;
import com.explorestack.protobuf.xa;
import com.explorestack.protobuf.xc;
import com.explorestack.protobuf.y;
import com.explorestack.protobuf.yb;
import com.explorestack.protobuf.z4;
import com.explorestack.protobuf.zb;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import e3.g;
import io.bidmachine.protobuf.AdExtension;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class Waterfall extends k7 implements WaterfallOrBuilder {
    private static final Waterfall DEFAULT_INSTANCE = new Waterfall();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.Waterfall.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public Waterfall parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new Waterfall(yVar, m5Var);
        }
    };
    public static final int REQUEST_FIELD_NUMBER = 1;
    public static final int RESPONSE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int payloadCase_;
    private Object payload_;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.protobuf.Waterfall$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$Waterfall$PayloadCase;

        static {
            int[] iArr = new int[PayloadCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$Waterfall$PayloadCase = iArr;
            try {
                iArr[PayloadCase.REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$Waterfall$PayloadCase[PayloadCase.RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$Waterfall$PayloadCase[PayloadCase.PAYLOAD_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Configuration extends k7 implements ConfigurationOrBuilder {
        public static final int AD_UNITS_FIELD_NUMBER = 8;
        public static final int CACHE_SIZE_FIELD_NUMBER = 7;
        public static final int FORMAT_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int MAX_RETRY_DEGREE_FIELD_NUMBER = 6;
        public static final int REFRESH_TIMEOUT_FIELD_NUMBER = 3;
        public static final int REFRESH_URL_FIELD_NUMBER = 4;
        public static final int RETRY_BASE_FIELD_NUMBER = 5;
        public static final int SERVER_PARAMS_FIELD_NUMBER = 10;
        public static final int SHOULD_BREAK_FIELD_NUMBER = 9;
        private static final long serialVersionUID = 0;
        private List<AdUnit> adUnits_;
        private UInt32Value cacheSize_;
        private volatile Object format_;
        private volatile Object id_;
        private UInt32Value maxRetryDegree_;
        private byte memoizedIsInitialized;
        private UInt64Value refreshTimeout_;
        private StringValue refreshUrl_;
        private UInt32Value retryBase_;
        private StringValue serverParams_;
        private boolean shouldBreak_;
        private static final Configuration DEFAULT_INSTANCE = new Configuration();
        private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.Waterfall.Configuration.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public Configuration parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new Configuration(yVar, m5Var);
            }
        };

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class AdUnit extends k7 implements AdUnitOrBuilder {
            public static final int AD_UNIT_ID_FIELD_NUMBER = 3;
            public static final int CUSTOM_TARGETING_FIELD_NUMBER = 6;
            public static final int EXPIRATION_TIME_FIELD_NUMBER = 2;
            public static final int OVERRIDE_CALLBACKS_FIELD_NUMBER = 1;
            public static final int PRICE_FIELD_NUMBER = 5;
            public static final int REQUEST_AGENT_FIELD_NUMBER = 4;
            public static final int SERVER_PARAMS_FIELD_NUMBER = 9;
            public static final int SLEEP_TIME_AFTER_FIELD_NUMBER = 8;
            public static final int SLEEP_TIME_BEFORE_FIELD_NUMBER = 7;
            private static final long serialVersionUID = 0;
            private volatile Object adUnitId_;
            private b9 customTargeting_;
            private int expirationTime_;
            private byte memoizedIsInitialized;
            private boolean overrideCallbacks_;
            private double price_;
            private volatile Object requestAgent_;
            private StringValue serverParams_;
            private UInt32Value sleepTimeAfter_;
            private UInt32Value sleepTimeBefore_;
            private static final AdUnit DEFAULT_INSTANCE = new AdUnit();
            private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.Waterfall.Configuration.AdUnit.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public AdUnit parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new AdUnit(yVar, m5Var);
                }
            };

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class CustomTargetingDefaultEntryHolder {
                static final s8 defaultEntry;

                static {
                    Descriptors.Descriptor descriptor = WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Configuration_AdUnit_CustomTargetingEntry_descriptor;
                    xc xcVar = bd.f21956f;
                    defaultEntry = s8.newDefaultInstance(descriptor, xcVar, "", xcVar, "");
                }

                private CustomTargetingDefaultEntryHolder() {
                }
            }

            public static AdUnit getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Configuration_AdUnit_descriptor;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public b9 internalGetCustomTargeting() {
                b9 b9Var = this.customTargeting_;
                return b9Var == null ? b9.emptyMapField(CustomTargetingDefaultEntryHolder.defaultEntry) : b9Var;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static AdUnit parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (AdUnit) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static AdUnit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (AdUnit) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public boolean containsCustomTargeting(String str) {
                str.getClass();
                return internalGetCustomTargeting().getMap().containsKey(str);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof AdUnit)) {
                    return super.equals(obj);
                }
                AdUnit adUnit = (AdUnit) obj;
                if (getOverrideCallbacks() != adUnit.getOverrideCallbacks() || getExpirationTime() != adUnit.getExpirationTime() || !getAdUnitId().equals(adUnit.getAdUnitId()) || !getRequestAgent().equals(adUnit.getRequestAgent()) || Double.doubleToLongBits(getPrice()) != Double.doubleToLongBits(adUnit.getPrice()) || !internalGetCustomTargeting().equals(adUnit.internalGetCustomTargeting()) || hasSleepTimeBefore() != adUnit.hasSleepTimeBefore()) {
                    return false;
                }
                if ((hasSleepTimeBefore() && !getSleepTimeBefore().equals(adUnit.getSleepTimeBefore())) || hasSleepTimeAfter() != adUnit.hasSleepTimeAfter()) {
                    return false;
                }
                if ((!hasSleepTimeAfter() || getSleepTimeAfter().equals(adUnit.getSleepTimeAfter())) && hasServerParams() == adUnit.hasServerParams()) {
                    return (!hasServerParams() || getServerParams().equals(adUnit.getServerParams())) && this.unknownFields.equals(adUnit.unknownFields);
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public String getAdUnitId() {
                Object obj = this.adUnitId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.adUnitId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public ByteString getAdUnitIdBytes() {
                Object obj = this.adUnitId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.adUnitId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            @Deprecated
            public Map<String, String> getCustomTargeting() {
                return getCustomTargetingMap();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public int getCustomTargetingCount() {
                return internalGetCustomTargeting().getMap().size();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public Map<String, String> getCustomTargetingMap() {
                return internalGetCustomTargeting().getMap();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public String getCustomTargetingOrDefault(String str, String str2) {
                str.getClass();
                Map<Object, Object> map = internalGetCustomTargeting().getMap();
                return map.containsKey(str) ? (String) map.get(str) : str2;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public String getCustomTargetingOrThrow(String str) {
                str.getClass();
                Map<Object, Object> map = internalGetCustomTargeting().getMap();
                if (map.containsKey(str)) {
                    return (String) map.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public int getExpirationTime() {
                return this.expirationTime_;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public boolean getOverrideCallbacks() {
                return this.overrideCallbacks_;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public fa getParserForType() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public double getPrice() {
                return this.price_;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public String getRequestAgent() {
                Object obj = this.requestAgent_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.requestAgent_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public ByteString getRequestAgentBytes() {
                Object obj = this.requestAgent_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.requestAgent_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                boolean z10 = this.overrideCallbacks_;
                int iComputeBoolSize = z10 ? h0.computeBoolSize(1, z10) : 0;
                int i11 = this.expirationTime_;
                if (i11 != 0) {
                    iComputeBoolSize += h0.computeUInt32Size(2, i11);
                }
                if (!getAdUnitIdBytes().isEmpty()) {
                    iComputeBoolSize += k7.computeStringSize(3, this.adUnitId_);
                }
                if (!getRequestAgentBytes().isEmpty()) {
                    iComputeBoolSize += k7.computeStringSize(4, this.requestAgent_);
                }
                double d10 = this.price_;
                if (d10 != 0.0d) {
                    iComputeBoolSize += h0.computeDoubleSize(5, d10);
                }
                Iterator itN = a.n(internalGetCustomTargeting());
                while (itN.hasNext()) {
                    Map.Entry entry = (Map.Entry) itN.next();
                    iComputeBoolSize = a.g(entry, CustomTargetingDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()), 6, iComputeBoolSize);
                }
                if (this.sleepTimeBefore_ != null) {
                    iComputeBoolSize += h0.computeMessageSize(7, getSleepTimeBefore());
                }
                if (this.sleepTimeAfter_ != null) {
                    iComputeBoolSize += h0.computeMessageSize(8, getSleepTimeAfter());
                }
                if (this.serverParams_ != null) {
                    iComputeBoolSize += h0.computeMessageSize(9, getServerParams());
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeBoolSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public StringValue getServerParams() {
                StringValue stringValue = this.serverParams_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public ib getServerParamsOrBuilder() {
                return getServerParams();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public UInt32Value getSleepTimeAfter() {
                UInt32Value uInt32Value = this.sleepTimeAfter_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public yb getSleepTimeAfterOrBuilder() {
                return getSleepTimeAfter();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public UInt32Value getSleepTimeBefore() {
                UInt32Value uInt32Value = this.sleepTimeBefore_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public yb getSleepTimeBeforeOrBuilder() {
                return getSleepTimeBefore();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
            public final gc getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public boolean hasServerParams() {
                return this.serverParams_ != null;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public boolean hasSleepTimeAfter() {
                return this.sleepTimeAfter_ != null;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public boolean hasSleepTimeBefore() {
                return this.sleepTimeBefore_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashLong = x7.hashLong(Double.doubleToLongBits(getPrice())) + ((((getRequestAgent().hashCode() + ((((getAdUnitId().hashCode() + ((((getExpirationTime() + ((((x7.hashBoolean(getOverrideCallbacks()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53);
                if (!internalGetCustomTargeting().getMap().isEmpty()) {
                    iHashLong = internalGetCustomTargeting().hashCode() + o2.B(iHashLong, 37, 6, 53);
                }
                if (hasSleepTimeBefore()) {
                    iHashLong = getSleepTimeBefore().hashCode() + o2.B(iHashLong, 37, 7, 53);
                }
                if (hasSleepTimeAfter()) {
                    iHashLong = getSleepTimeAfter().hashCode() + o2.B(iHashLong, 37, 8, 53);
                }
                if (hasServerParams()) {
                    iHashLong = getServerParams().hashCode() + o2.B(iHashLong, 37, 9, 53);
                }
                int iHashCode = this.unknownFields.hashCode() + (iHashLong * 29);
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.explorestack.protobuf.k7
            public i7 internalGetFieldAccessorTable() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Configuration_AdUnit_fieldAccessorTable.ensureFieldAccessorsInitialized(AdUnit.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.k7
            public b9 internalGetMapField(int i10) {
                if (i10 == 6) {
                    return internalGetCustomTargeting();
                }
                throw new RuntimeException(b.e(i10, "Invalid map field number: "));
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
                return new AdUnit();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                boolean z10 = this.overrideCallbacks_;
                if (z10) {
                    h0Var.writeBool(1, z10);
                }
                int i10 = this.expirationTime_;
                if (i10 != 0) {
                    h0Var.writeUInt32(2, i10);
                }
                if (!getAdUnitIdBytes().isEmpty()) {
                    k7.writeString(h0Var, 3, this.adUnitId_);
                }
                if (!getRequestAgentBytes().isEmpty()) {
                    k7.writeString(h0Var, 4, this.requestAgent_);
                }
                double d10 = this.price_;
                if (d10 != 0.0d) {
                    h0Var.writeDouble(5, d10);
                }
                k7.serializeStringMapTo(h0Var, internalGetCustomTargeting(), CustomTargetingDefaultEntryHolder.defaultEntry, 6);
                if (this.sleepTimeBefore_ != null) {
                    h0Var.writeMessage(7, getSleepTimeBefore());
                }
                if (this.sleepTimeAfter_ != null) {
                    h0Var.writeMessage(8, getSleepTimeAfter());
                }
                if (this.serverParams_ != null) {
                    h0Var.writeMessage(9, getServerParams());
                }
                this.unknownFields.writeTo(h0Var);
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends o6 implements AdUnitOrBuilder {
                private Object adUnitId_;
                private int bitField0_;
                private b9 customTargeting_;
                private int expirationTime_;
                private boolean overrideCallbacks_;
                private double price_;
                private Object requestAgent_;
                private xa serverParamsBuilder_;
                private StringValue serverParams_;
                private xa sleepTimeAfterBuilder_;
                private UInt32Value sleepTimeAfter_;
                private xa sleepTimeBeforeBuilder_;
                private UInt32Value sleepTimeBefore_;

                private Builder() {
                    super(null);
                    this.adUnitId_ = "";
                    this.requestAgent_ = "";
                    maybeForceBuilderInitialization();
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Configuration_AdUnit_descriptor;
                }

                private xa getServerParamsFieldBuilder() {
                    if (this.serverParamsBuilder_ == null) {
                        this.serverParamsBuilder_ = new xa(getServerParams(), getParentForChildren(), isClean());
                        this.serverParams_ = null;
                    }
                    return this.serverParamsBuilder_;
                }

                private xa getSleepTimeAfterFieldBuilder() {
                    if (this.sleepTimeAfterBuilder_ == null) {
                        this.sleepTimeAfterBuilder_ = new xa(getSleepTimeAfter(), getParentForChildren(), isClean());
                        this.sleepTimeAfter_ = null;
                    }
                    return this.sleepTimeAfterBuilder_;
                }

                private xa getSleepTimeBeforeFieldBuilder() {
                    if (this.sleepTimeBeforeBuilder_ == null) {
                        this.sleepTimeBeforeBuilder_ = new xa(getSleepTimeBefore(), getParentForChildren(), isClean());
                        this.sleepTimeBefore_ = null;
                    }
                    return this.sleepTimeBeforeBuilder_;
                }

                private b9 internalGetCustomTargeting() {
                    b9 b9Var = this.customTargeting_;
                    return b9Var == null ? b9.emptyMapField(CustomTargetingDefaultEntryHolder.defaultEntry) : b9Var;
                }

                private b9 internalGetMutableCustomTargeting() {
                    onChanged();
                    if (this.customTargeting_ == null) {
                        this.customTargeting_ = b9.newMapField(CustomTargetingDefaultEntryHolder.defaultEntry);
                    }
                    if (!this.customTargeting_.isMutable()) {
                        this.customTargeting_ = this.customTargeting_.copy();
                    }
                    return this.customTargeting_;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = k7.alwaysUseFieldBuilders;
                }

                public Builder clearAdUnitId() {
                    this.adUnitId_ = AdUnit.getDefaultInstance().getAdUnitId();
                    onChanged();
                    return this;
                }

                public Builder clearCustomTargeting() {
                    internalGetMutableCustomTargeting().getMutableMap().clear();
                    return this;
                }

                public Builder clearExpirationTime() {
                    this.expirationTime_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearOverrideCallbacks() {
                    this.overrideCallbacks_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearPrice() {
                    this.price_ = 0.0d;
                    onChanged();
                    return this;
                }

                public Builder clearRequestAgent() {
                    this.requestAgent_ = AdUnit.getDefaultInstance().getRequestAgent();
                    onChanged();
                    return this;
                }

                public Builder clearServerParams() {
                    if (this.serverParamsBuilder_ == null) {
                        this.serverParams_ = null;
                        onChanged();
                        return this;
                    }
                    this.serverParams_ = null;
                    this.serverParamsBuilder_ = null;
                    return this;
                }

                public Builder clearSleepTimeAfter() {
                    if (this.sleepTimeAfterBuilder_ == null) {
                        this.sleepTimeAfter_ = null;
                        onChanged();
                        return this;
                    }
                    this.sleepTimeAfter_ = null;
                    this.sleepTimeAfterBuilder_ = null;
                    return this;
                }

                public Builder clearSleepTimeBefore() {
                    if (this.sleepTimeBeforeBuilder_ == null) {
                        this.sleepTimeBefore_ = null;
                        onChanged();
                        return this;
                    }
                    this.sleepTimeBefore_ = null;
                    this.sleepTimeBeforeBuilder_ = null;
                    return this;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public boolean containsCustomTargeting(String str) {
                    str.getClass();
                    return internalGetCustomTargeting().getMap().containsKey(str);
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public String getAdUnitId() {
                    Object obj = this.adUnitId_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.adUnitId_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public ByteString getAdUnitIdBytes() {
                    Object obj = this.adUnitId_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.adUnitId_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                @Deprecated
                public Map<String, String> getCustomTargeting() {
                    return getCustomTargetingMap();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public int getCustomTargetingCount() {
                    return internalGetCustomTargeting().getMap().size();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public Map<String, String> getCustomTargetingMap() {
                    return internalGetCustomTargeting().getMap();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public String getCustomTargetingOrDefault(String str, String str2) {
                    str.getClass();
                    Map<Object, Object> map = internalGetCustomTargeting().getMap();
                    return map.containsKey(str) ? (String) map.get(str) : str2;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public String getCustomTargetingOrThrow(String str) {
                    str.getClass();
                    Map<Object, Object> map = internalGetCustomTargeting().getMap();
                    if (map.containsKey(str)) {
                        return (String) map.get(str);
                    }
                    throw new IllegalArgumentException();
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Configuration_AdUnit_descriptor;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public int getExpirationTime() {
                    return this.expirationTime_;
                }

                @Deprecated
                public Map<String, String> getMutableCustomTargeting() {
                    return internalGetMutableCustomTargeting().getMutableMap();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public boolean getOverrideCallbacks() {
                    return this.overrideCallbacks_;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public double getPrice() {
                    return this.price_;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public String getRequestAgent() {
                    Object obj = this.requestAgent_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.requestAgent_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public ByteString getRequestAgentBytes() {
                    Object obj = this.requestAgent_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.requestAgent_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public StringValue getServerParams() {
                    xa xaVar = this.serverParamsBuilder_;
                    if (xaVar != null) {
                        return (StringValue) xaVar.getMessage();
                    }
                    StringValue stringValue = this.serverParams_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                public StringValue.Builder getServerParamsBuilder() {
                    onChanged();
                    return (StringValue.Builder) getServerParamsFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public ib getServerParamsOrBuilder() {
                    xa xaVar = this.serverParamsBuilder_;
                    if (xaVar != null) {
                        return (ib) xaVar.getMessageOrBuilder();
                    }
                    StringValue stringValue = this.serverParams_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public UInt32Value getSleepTimeAfter() {
                    xa xaVar = this.sleepTimeAfterBuilder_;
                    if (xaVar != null) {
                        return (UInt32Value) xaVar.getMessage();
                    }
                    UInt32Value uInt32Value = this.sleepTimeAfter_;
                    return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
                }

                public UInt32Value.Builder getSleepTimeAfterBuilder() {
                    onChanged();
                    return (UInt32Value.Builder) getSleepTimeAfterFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public yb getSleepTimeAfterOrBuilder() {
                    xa xaVar = this.sleepTimeAfterBuilder_;
                    if (xaVar != null) {
                        return (yb) xaVar.getMessageOrBuilder();
                    }
                    UInt32Value uInt32Value = this.sleepTimeAfter_;
                    return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public UInt32Value getSleepTimeBefore() {
                    xa xaVar = this.sleepTimeBeforeBuilder_;
                    if (xaVar != null) {
                        return (UInt32Value) xaVar.getMessage();
                    }
                    UInt32Value uInt32Value = this.sleepTimeBefore_;
                    return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
                }

                public UInt32Value.Builder getSleepTimeBeforeBuilder() {
                    onChanged();
                    return (UInt32Value.Builder) getSleepTimeBeforeFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public yb getSleepTimeBeforeOrBuilder() {
                    xa xaVar = this.sleepTimeBeforeBuilder_;
                    if (xaVar != null) {
                        return (yb) xaVar.getMessageOrBuilder();
                    }
                    UInt32Value uInt32Value = this.sleepTimeBefore_;
                    return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public boolean hasServerParams() {
                    return (this.serverParamsBuilder_ == null && this.serverParams_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public boolean hasSleepTimeAfter() {
                    return (this.sleepTimeAfterBuilder_ == null && this.sleepTimeAfter_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public boolean hasSleepTimeBefore() {
                    return (this.sleepTimeBeforeBuilder_ == null && this.sleepTimeBefore_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Configuration_AdUnit_fieldAccessorTable.ensureFieldAccessorsInitialized(AdUnit.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.o6
                public b9 internalGetMapField(int i10) {
                    if (i10 == 6) {
                        return internalGetCustomTargeting();
                    }
                    throw new RuntimeException(b.e(i10, "Invalid map field number: "));
                }

                @Override // com.explorestack.protobuf.o6
                public b9 internalGetMutableMapField(int i10) {
                    if (i10 == 6) {
                        return internalGetMutableCustomTargeting();
                    }
                    throw new RuntimeException(b.e(i10, "Invalid map field number: "));
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeServerParams(StringValue stringValue) {
                    xa xaVar = this.serverParamsBuilder_;
                    if (xaVar != null) {
                        xaVar.mergeFrom(stringValue);
                        return this;
                    }
                    StringValue stringValue2 = this.serverParams_;
                    if (stringValue2 != null) {
                        this.serverParams_ = g.h(stringValue2, stringValue);
                    } else {
                        this.serverParams_ = stringValue;
                    }
                    onChanged();
                    return this;
                }

                public Builder mergeSleepTimeAfter(UInt32Value uInt32Value) {
                    xa xaVar = this.sleepTimeAfterBuilder_;
                    if (xaVar != null) {
                        xaVar.mergeFrom(uInt32Value);
                        return this;
                    }
                    UInt32Value uInt32Value2 = this.sleepTimeAfter_;
                    if (uInt32Value2 != null) {
                        this.sleepTimeAfter_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                    } else {
                        this.sleepTimeAfter_ = uInt32Value;
                    }
                    onChanged();
                    return this;
                }

                public Builder mergeSleepTimeBefore(UInt32Value uInt32Value) {
                    xa xaVar = this.sleepTimeBeforeBuilder_;
                    if (xaVar != null) {
                        xaVar.mergeFrom(uInt32Value);
                        return this;
                    }
                    UInt32Value uInt32Value2 = this.sleepTimeBefore_;
                    if (uInt32Value2 != null) {
                        this.sleepTimeBefore_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                    } else {
                        this.sleepTimeBefore_ = uInt32Value;
                    }
                    onChanged();
                    return this;
                }

                public Builder putAllCustomTargeting(Map<String, String> map) {
                    internalGetMutableCustomTargeting().getMutableMap().putAll(map);
                    return this;
                }

                public Builder putCustomTargeting(String str, String str2) {
                    str.getClass();
                    str2.getClass();
                    internalGetMutableCustomTargeting().getMutableMap().put(str, str2);
                    return this;
                }

                public Builder removeCustomTargeting(String str) {
                    str.getClass();
                    internalGetMutableCustomTargeting().getMutableMap().remove(str);
                    return this;
                }

                public Builder setAdUnitId(String str) {
                    str.getClass();
                    this.adUnitId_ = str;
                    onChanged();
                    return this;
                }

                public Builder setAdUnitIdBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.adUnitId_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setExpirationTime(int i10) {
                    this.expirationTime_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setOverrideCallbacks(boolean z10) {
                    this.overrideCallbacks_ = z10;
                    onChanged();
                    return this;
                }

                public Builder setPrice(double d10) {
                    this.price_ = d10;
                    onChanged();
                    return this;
                }

                public Builder setRequestAgent(String str) {
                    str.getClass();
                    this.requestAgent_ = str;
                    onChanged();
                    return this;
                }

                public Builder setRequestAgentBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.requestAgent_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setServerParams(StringValue stringValue) {
                    xa xaVar = this.serverParamsBuilder_;
                    if (xaVar != null) {
                        xaVar.setMessage(stringValue);
                        return this;
                    }
                    stringValue.getClass();
                    this.serverParams_ = stringValue;
                    onChanged();
                    return this;
                }

                public Builder setSleepTimeAfter(UInt32Value uInt32Value) {
                    xa xaVar = this.sleepTimeAfterBuilder_;
                    if (xaVar != null) {
                        xaVar.setMessage(uInt32Value);
                        return this;
                    }
                    uInt32Value.getClass();
                    this.sleepTimeAfter_ = uInt32Value;
                    onChanged();
                    return this;
                }

                public Builder setSleepTimeBefore(UInt32Value uInt32Value) {
                    xa xaVar = this.sleepTimeBeforeBuilder_;
                    if (xaVar != null) {
                        xaVar.setMessage(uInt32Value);
                        return this;
                    }
                    uInt32Value.getClass();
                    this.sleepTimeBefore_ = uInt32Value;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public AdUnit build() {
                    AdUnit adUnitBuildPartial = buildPartial();
                    if (adUnitBuildPartial.isInitialized()) {
                        return adUnitBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) adUnitBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public AdUnit buildPartial() {
                    AdUnit adUnit = new AdUnit(this);
                    adUnit.overrideCallbacks_ = this.overrideCallbacks_;
                    adUnit.expirationTime_ = this.expirationTime_;
                    adUnit.adUnitId_ = this.adUnitId_;
                    adUnit.requestAgent_ = this.requestAgent_;
                    adUnit.price_ = this.price_;
                    adUnit.customTargeting_ = internalGetCustomTargeting();
                    adUnit.customTargeting_.makeImmutable();
                    xa xaVar = this.sleepTimeBeforeBuilder_;
                    if (xaVar == null) {
                        adUnit.sleepTimeBefore_ = this.sleepTimeBefore_;
                    } else {
                        adUnit.sleepTimeBefore_ = (UInt32Value) xaVar.build();
                    }
                    xa xaVar2 = this.sleepTimeAfterBuilder_;
                    if (xaVar2 == null) {
                        adUnit.sleepTimeAfter_ = this.sleepTimeAfter_;
                    } else {
                        adUnit.sleepTimeAfter_ = (UInt32Value) xaVar2.build();
                    }
                    xa xaVar3 = this.serverParamsBuilder_;
                    if (xaVar3 == null) {
                        adUnit.serverParams_ = this.serverParams_;
                    } else {
                        adUnit.serverParams_ = (StringValue) xaVar3.build();
                    }
                    onBuilt();
                    return adUnit;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public AdUnit getDefaultInstanceForType() {
                    return AdUnit.getDefaultInstance();
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
                    this.overrideCallbacks_ = false;
                    this.expirationTime_ = 0;
                    this.adUnitId_ = "";
                    this.requestAgent_ = "";
                    this.price_ = 0.0d;
                    internalGetMutableCustomTargeting().clear();
                    if (this.sleepTimeBeforeBuilder_ == null) {
                        this.sleepTimeBefore_ = null;
                    } else {
                        this.sleepTimeBefore_ = null;
                        this.sleepTimeBeforeBuilder_ = null;
                    }
                    if (this.sleepTimeAfterBuilder_ == null) {
                        this.sleepTimeAfter_ = null;
                    } else {
                        this.sleepTimeAfter_ = null;
                        this.sleepTimeAfterBuilder_ = null;
                    }
                    if (this.serverParamsBuilder_ == null) {
                        this.serverParams_ = null;
                        return this;
                    }
                    this.serverParams_ = null;
                    this.serverParamsBuilder_ = null;
                    return this;
                }

                public Builder setServerParams(StringValue.Builder builder) {
                    xa xaVar = this.serverParamsBuilder_;
                    if (xaVar == null) {
                        this.serverParams_ = builder.build();
                        onChanged();
                        return this;
                    }
                    xaVar.setMessage(builder.build());
                    return this;
                }

                public Builder setSleepTimeAfter(UInt32Value.Builder builder) {
                    xa xaVar = this.sleepTimeAfterBuilder_;
                    if (xaVar == null) {
                        this.sleepTimeAfter_ = builder.build();
                        onChanged();
                        return this;
                    }
                    xaVar.setMessage(builder.build());
                    return this;
                }

                public Builder setSleepTimeBefore(UInt32Value.Builder builder) {
                    xa xaVar = this.sleepTimeBeforeBuilder_;
                    if (xaVar == null) {
                        this.sleepTimeBefore_ = builder.build();
                        onChanged();
                        return this;
                    }
                    xaVar.setMessage(builder.build());
                    return this;
                }

                private Builder(p6 p6Var) {
                    super(p6Var);
                    this.adUnitId_ = "";
                    this.requestAgent_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
                /* renamed from: clone */
                public Builder mo500clone() {
                    return (Builder) super.mo500clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof AdUnit) {
                        return mergeFrom((AdUnit) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(AdUnit adUnit) {
                    if (adUnit == AdUnit.getDefaultInstance()) {
                        return this;
                    }
                    if (adUnit.getOverrideCallbacks()) {
                        setOverrideCallbacks(adUnit.getOverrideCallbacks());
                    }
                    if (adUnit.getExpirationTime() != 0) {
                        setExpirationTime(adUnit.getExpirationTime());
                    }
                    if (!adUnit.getAdUnitId().isEmpty()) {
                        this.adUnitId_ = adUnit.adUnitId_;
                        onChanged();
                    }
                    if (!adUnit.getRequestAgent().isEmpty()) {
                        this.requestAgent_ = adUnit.requestAgent_;
                        onChanged();
                    }
                    if (adUnit.getPrice() != 0.0d) {
                        setPrice(adUnit.getPrice());
                    }
                    internalGetMutableCustomTargeting().mergeFrom(adUnit.internalGetCustomTargeting());
                    if (adUnit.hasSleepTimeBefore()) {
                        mergeSleepTimeBefore(adUnit.getSleepTimeBefore());
                    }
                    if (adUnit.hasSleepTimeAfter()) {
                        mergeSleepTimeAfter(adUnit.getSleepTimeAfter());
                    }
                    if (adUnit.hasServerParams()) {
                        mergeServerParams(adUnit.getServerParams());
                    }
                    mergeUnknownFields(((k7) adUnit).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public io.bidmachine.protobuf.Waterfall.Configuration.AdUnit.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.Waterfall.Configuration.AdUnit.access$1500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.Waterfall$Configuration$AdUnit r3 = (io.bidmachine.protobuf.Waterfall.Configuration.AdUnit) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.Waterfall$Configuration$AdUnit r4 = (io.bidmachine.protobuf.Waterfall.Configuration.AdUnit) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.Waterfall.Configuration.AdUnit.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.Waterfall$Configuration$AdUnit$Builder");
                }
            }

            public static Builder newBuilder(AdUnit adUnit) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(adUnit);
            }

            public static AdUnit parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (AdUnit) PARSER.parseFrom(byteBuffer, m5Var);
            }

            private AdUnit(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static AdUnit parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (AdUnit) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static AdUnit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (AdUnit) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public AdUnit getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static AdUnit parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (AdUnit) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private AdUnit() {
                this.memoizedIsInitialized = (byte) -1;
                this.adUnitId_ = "";
                this.requestAgent_ = "";
            }

            public static AdUnit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (AdUnit) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static AdUnit parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (AdUnit) PARSER.parseFrom(bArr, m5Var);
            }

            public static AdUnit parseFrom(InputStream inputStream) throws IOException {
                return (AdUnit) k7.parseWithIOException(PARSER, inputStream);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private AdUnit(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                if (tag == 8) {
                                    this.overrideCallbacks_ = yVar.readBool();
                                } else if (tag == 16) {
                                    this.expirationTime_ = yVar.readUInt32();
                                } else if (tag == 26) {
                                    this.adUnitId_ = yVar.readStringRequireUtf8();
                                } else if (tag == 34) {
                                    this.requestAgent_ = yVar.readStringRequireUtf8();
                                } else if (tag == 41) {
                                    this.price_ = yVar.readDouble();
                                } else if (tag != 50) {
                                    if (tag == 58) {
                                        UInt32Value uInt32Value = this.sleepTimeBefore_;
                                        UInt32Value.Builder builder = uInt32Value != null ? uInt32Value.toBuilder() : null;
                                        UInt32Value uInt32Value2 = (UInt32Value) yVar.readMessage(UInt32Value.parser(), m5Var);
                                        this.sleepTimeBefore_ = uInt32Value2;
                                        if (builder != null) {
                                            builder.mergeFrom(uInt32Value2);
                                            this.sleepTimeBefore_ = builder.buildPartial();
                                        }
                                    } else if (tag == 66) {
                                        UInt32Value uInt32Value3 = this.sleepTimeAfter_;
                                        UInt32Value.Builder builder2 = uInt32Value3 != null ? uInt32Value3.toBuilder() : null;
                                        UInt32Value uInt32Value4 = (UInt32Value) yVar.readMessage(UInt32Value.parser(), m5Var);
                                        this.sleepTimeAfter_ = uInt32Value4;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(uInt32Value4);
                                            this.sleepTimeAfter_ = builder2.buildPartial();
                                        }
                                    } else if (tag != 74) {
                                        if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                        }
                                    } else {
                                        StringValue stringValue = this.serverParams_;
                                        StringValue.Builder builder3 = stringValue != null ? stringValue.toBuilder() : null;
                                        StringValue stringValue2 = (StringValue) yVar.readMessage(StringValue.parser(), m5Var);
                                        this.serverParams_ = stringValue2;
                                        if (builder3 != null) {
                                            builder3.mergeFrom(stringValue2);
                                            this.serverParams_ = builder3.buildPartial();
                                        }
                                    }
                                } else {
                                    if (objArr == false) {
                                        this.customTargeting_ = b9.newMapField(CustomTargetingDefaultEntryHolder.defaultEntry);
                                        objArr = true;
                                    }
                                    s8 s8Var = (s8) yVar.readMessage(CustomTargetingDefaultEntryHolder.defaultEntry.getParserForType(), m5Var);
                                    this.customTargeting_.getMutableMap().put(s8Var.getKey(), s8Var.getValue());
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

            public static AdUnit parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (AdUnit) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            public static AdUnit parseFrom(y yVar) throws IOException {
                return (AdUnit) k7.parseWithIOException(PARSER, yVar);
            }

            public static AdUnit parseFrom(y yVar, m5 m5Var) throws IOException {
                return (AdUnit) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface AdUnitOrBuilder extends MessageOrBuilder {
            boolean containsCustomTargeting(String str);

            String getAdUnitId();

            ByteString getAdUnitIdBytes();

            @Deprecated
            Map<String, String> getCustomTargeting();

            int getCustomTargetingCount();

            Map<String, String> getCustomTargetingMap();

            String getCustomTargetingOrDefault(String str, String str2);

            String getCustomTargetingOrThrow(String str);

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            int getExpirationTime();

            boolean getOverrideCallbacks();

            double getPrice();

            String getRequestAgent();

            ByteString getRequestAgentBytes();

            StringValue getServerParams();

            ib getServerParamsOrBuilder();

            UInt32Value getSleepTimeAfter();

            yb getSleepTimeAfterOrBuilder();

            UInt32Value getSleepTimeBefore();

            yb getSleepTimeBeforeOrBuilder();

            boolean hasServerParams();

            boolean hasSleepTimeAfter();

            boolean hasSleepTimeBefore();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static Configuration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Configuration_descriptor;
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
            if (!getId().equals(configuration.getId()) || !getFormat().equals(configuration.getFormat()) || hasRefreshTimeout() != configuration.hasRefreshTimeout()) {
                return false;
            }
            if ((hasRefreshTimeout() && !getRefreshTimeout().equals(configuration.getRefreshTimeout())) || hasRefreshUrl() != configuration.hasRefreshUrl()) {
                return false;
            }
            if ((hasRefreshUrl() && !getRefreshUrl().equals(configuration.getRefreshUrl())) || hasRetryBase() != configuration.hasRetryBase()) {
                return false;
            }
            if ((hasRetryBase() && !getRetryBase().equals(configuration.getRetryBase())) || hasMaxRetryDegree() != configuration.hasMaxRetryDegree()) {
                return false;
            }
            if ((hasMaxRetryDegree() && !getMaxRetryDegree().equals(configuration.getMaxRetryDegree())) || hasCacheSize() != configuration.hasCacheSize()) {
                return false;
            }
            if ((!hasCacheSize() || getCacheSize().equals(configuration.getCacheSize())) && getAdUnitsList().equals(configuration.getAdUnitsList()) && getShouldBreak() == configuration.getShouldBreak() && hasServerParams() == configuration.hasServerParams()) {
                return (!hasServerParams() || getServerParams().equals(configuration.getServerParams())) && this.unknownFields.equals(configuration.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public AdUnit getAdUnits(int i10) {
            return this.adUnits_.get(i10);
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public int getAdUnitsCount() {
            return this.adUnits_.size();
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public List<AdUnit> getAdUnitsList() {
            return this.adUnits_;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public AdUnitOrBuilder getAdUnitsOrBuilder(int i10) {
            return this.adUnits_.get(i10);
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public List<? extends AdUnitOrBuilder> getAdUnitsOrBuilderList() {
            return this.adUnits_;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public UInt32Value getCacheSize() {
            UInt32Value uInt32Value = this.cacheSize_;
            return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public yb getCacheSizeOrBuilder() {
            return getCacheSize();
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public String getFormat() {
            Object obj = this.format_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.format_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public ByteString getFormatBytes() {
            Object obj = this.format_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.format_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public UInt32Value getMaxRetryDegree() {
            UInt32Value uInt32Value = this.maxRetryDegree_;
            return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public yb getMaxRetryDegreeOrBuilder() {
            return getMaxRetryDegree();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public fa getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public UInt64Value getRefreshTimeout() {
            UInt64Value uInt64Value = this.refreshTimeout_;
            return uInt64Value == null ? UInt64Value.getDefaultInstance() : uInt64Value;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public zb getRefreshTimeoutOrBuilder() {
            return getRefreshTimeout();
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public StringValue getRefreshUrl() {
            StringValue stringValue = this.refreshUrl_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public ib getRefreshUrlOrBuilder() {
            return getRefreshUrl();
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public UInt32Value getRetryBase() {
            UInt32Value uInt32Value = this.retryBase_;
            return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public yb getRetryBaseOrBuilder() {
            return getRetryBase();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !getIdBytes().isEmpty() ? k7.computeStringSize(1, this.id_) : 0;
            if (!getFormatBytes().isEmpty()) {
                iComputeStringSize += k7.computeStringSize(2, this.format_);
            }
            if (this.refreshTimeout_ != null) {
                iComputeStringSize += h0.computeMessageSize(3, getRefreshTimeout());
            }
            if (this.refreshUrl_ != null) {
                iComputeStringSize += h0.computeMessageSize(4, getRefreshUrl());
            }
            if (this.retryBase_ != null) {
                iComputeStringSize += h0.computeMessageSize(5, getRetryBase());
            }
            if (this.maxRetryDegree_ != null) {
                iComputeStringSize += h0.computeMessageSize(6, getMaxRetryDegree());
            }
            if (this.cacheSize_ != null) {
                iComputeStringSize += h0.computeMessageSize(7, getCacheSize());
            }
            for (int i11 = 0; i11 < this.adUnits_.size(); i11++) {
                iComputeStringSize += h0.computeMessageSize(8, this.adUnits_.get(i11));
            }
            boolean z10 = this.shouldBreak_;
            if (z10) {
                iComputeStringSize += h0.computeBoolSize(9, z10);
            }
            if (this.serverParams_ != null) {
                iComputeStringSize += h0.computeMessageSize(10, getServerParams());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public StringValue getServerParams() {
            StringValue stringValue = this.serverParams_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public ib getServerParamsOrBuilder() {
            return getServerParams();
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public boolean getShouldBreak() {
            return this.shouldBreak_;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
        public final gc getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public boolean hasCacheSize() {
            return this.cacheSize_ != null;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public boolean hasMaxRetryDegree() {
            return this.maxRetryDegree_ != null;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public boolean hasRefreshTimeout() {
            return this.refreshTimeout_ != null;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public boolean hasRefreshUrl() {
            return this.refreshUrl_ != null;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public boolean hasRetryBase() {
            return this.retryBase_ != null;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public boolean hasServerParams() {
            return this.serverParams_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = getFormat().hashCode() + ((((getId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
            if (hasRefreshTimeout()) {
                iHashCode = o2.B(iHashCode, 37, 3, 53) + getRefreshTimeout().hashCode();
            }
            if (hasRefreshUrl()) {
                iHashCode = o2.B(iHashCode, 37, 4, 53) + getRefreshUrl().hashCode();
            }
            if (hasRetryBase()) {
                iHashCode = o2.B(iHashCode, 37, 5, 53) + getRetryBase().hashCode();
            }
            if (hasMaxRetryDegree()) {
                iHashCode = o2.B(iHashCode, 37, 6, 53) + getMaxRetryDegree().hashCode();
            }
            if (hasCacheSize()) {
                iHashCode = o2.B(iHashCode, 37, 7, 53) + getCacheSize().hashCode();
            }
            if (getAdUnitsCount() > 0) {
                iHashCode = o2.B(iHashCode, 37, 8, 53) + getAdUnitsList().hashCode();
            }
            int iHashBoolean = x7.hashBoolean(getShouldBreak()) + o2.B(iHashCode, 37, 9, 53);
            if (hasServerParams()) {
                iHashBoolean = getServerParams().hashCode() + o2.B(iHashBoolean, 37, 10, 53);
            }
            int iHashCode2 = this.unknownFields.hashCode() + (iHashBoolean * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Configuration_fieldAccessorTable.ensureFieldAccessorsInitialized(Configuration.class, Builder.class);
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
            if (!getIdBytes().isEmpty()) {
                k7.writeString(h0Var, 1, this.id_);
            }
            if (!getFormatBytes().isEmpty()) {
                k7.writeString(h0Var, 2, this.format_);
            }
            if (this.refreshTimeout_ != null) {
                h0Var.writeMessage(3, getRefreshTimeout());
            }
            if (this.refreshUrl_ != null) {
                h0Var.writeMessage(4, getRefreshUrl());
            }
            if (this.retryBase_ != null) {
                h0Var.writeMessage(5, getRetryBase());
            }
            if (this.maxRetryDegree_ != null) {
                h0Var.writeMessage(6, getMaxRetryDegree());
            }
            if (this.cacheSize_ != null) {
                h0Var.writeMessage(7, getCacheSize());
            }
            for (int i10 = 0; i10 < this.adUnits_.size(); i10++) {
                h0Var.writeMessage(8, this.adUnits_.get(i10));
            }
            boolean z10 = this.shouldBreak_;
            if (z10) {
                h0Var.writeBool(9, z10);
            }
            if (this.serverParams_ != null) {
                h0Var.writeMessage(10, getServerParams());
            }
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements ConfigurationOrBuilder {
            private pa adUnitsBuilder_;
            private List<AdUnit> adUnits_;
            private int bitField0_;
            private xa cacheSizeBuilder_;
            private UInt32Value cacheSize_;
            private Object format_;
            private Object id_;
            private xa maxRetryDegreeBuilder_;
            private UInt32Value maxRetryDegree_;
            private xa refreshTimeoutBuilder_;
            private UInt64Value refreshTimeout_;
            private xa refreshUrlBuilder_;
            private StringValue refreshUrl_;
            private xa retryBaseBuilder_;
            private UInt32Value retryBase_;
            private xa serverParamsBuilder_;
            private StringValue serverParams_;
            private boolean shouldBreak_;

            private Builder() {
                super(null);
                this.id_ = "";
                this.format_ = "";
                this.adUnits_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private void ensureAdUnitsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.adUnits_ = new ArrayList(this.adUnits_);
                    this.bitField0_ |= 1;
                }
            }

            private pa getAdUnitsFieldBuilder() {
                if (this.adUnitsBuilder_ == null) {
                    this.adUnitsBuilder_ = new pa(this.adUnits_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.adUnits_ = null;
                }
                return this.adUnitsBuilder_;
            }

            private xa getCacheSizeFieldBuilder() {
                if (this.cacheSizeBuilder_ == null) {
                    this.cacheSizeBuilder_ = new xa(getCacheSize(), getParentForChildren(), isClean());
                    this.cacheSize_ = null;
                }
                return this.cacheSizeBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Configuration_descriptor;
            }

            private xa getMaxRetryDegreeFieldBuilder() {
                if (this.maxRetryDegreeBuilder_ == null) {
                    this.maxRetryDegreeBuilder_ = new xa(getMaxRetryDegree(), getParentForChildren(), isClean());
                    this.maxRetryDegree_ = null;
                }
                return this.maxRetryDegreeBuilder_;
            }

            private xa getRefreshTimeoutFieldBuilder() {
                if (this.refreshTimeoutBuilder_ == null) {
                    this.refreshTimeoutBuilder_ = new xa(getRefreshTimeout(), getParentForChildren(), isClean());
                    this.refreshTimeout_ = null;
                }
                return this.refreshTimeoutBuilder_;
            }

            private xa getRefreshUrlFieldBuilder() {
                if (this.refreshUrlBuilder_ == null) {
                    this.refreshUrlBuilder_ = new xa(getRefreshUrl(), getParentForChildren(), isClean());
                    this.refreshUrl_ = null;
                }
                return this.refreshUrlBuilder_;
            }

            private xa getRetryBaseFieldBuilder() {
                if (this.retryBaseBuilder_ == null) {
                    this.retryBaseBuilder_ = new xa(getRetryBase(), getParentForChildren(), isClean());
                    this.retryBase_ = null;
                }
                return this.retryBaseBuilder_;
            }

            private xa getServerParamsFieldBuilder() {
                if (this.serverParamsBuilder_ == null) {
                    this.serverParamsBuilder_ = new xa(getServerParams(), getParentForChildren(), isClean());
                    this.serverParams_ = null;
                }
                return this.serverParamsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (k7.alwaysUseFieldBuilders) {
                    getAdUnitsFieldBuilder();
                }
            }

            public Builder addAdUnits(AdUnit adUnit) {
                pa paVar = this.adUnitsBuilder_;
                if (paVar != null) {
                    paVar.addMessage(adUnit);
                    return this;
                }
                adUnit.getClass();
                ensureAdUnitsIsMutable();
                this.adUnits_.add(adUnit);
                onChanged();
                return this;
            }

            public AdUnit.Builder addAdUnitsBuilder() {
                return (AdUnit.Builder) getAdUnitsFieldBuilder().addBuilder(AdUnit.getDefaultInstance());
            }

            public Builder addAllAdUnits(Iterable<? extends AdUnit> iterable) {
                pa paVar = this.adUnitsBuilder_;
                if (paVar != null) {
                    paVar.addAllMessages(iterable);
                    return this;
                }
                ensureAdUnitsIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.adUnits_);
                onChanged();
                return this;
            }

            public Builder clearAdUnits() {
                pa paVar = this.adUnitsBuilder_;
                if (paVar != null) {
                    paVar.clear();
                    return this;
                }
                this.adUnits_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearCacheSize() {
                if (this.cacheSizeBuilder_ == null) {
                    this.cacheSize_ = null;
                    onChanged();
                    return this;
                }
                this.cacheSize_ = null;
                this.cacheSizeBuilder_ = null;
                return this;
            }

            public Builder clearFormat() {
                this.format_ = Configuration.getDefaultInstance().getFormat();
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.id_ = Configuration.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            public Builder clearMaxRetryDegree() {
                if (this.maxRetryDegreeBuilder_ == null) {
                    this.maxRetryDegree_ = null;
                    onChanged();
                    return this;
                }
                this.maxRetryDegree_ = null;
                this.maxRetryDegreeBuilder_ = null;
                return this;
            }

            public Builder clearRefreshTimeout() {
                if (this.refreshTimeoutBuilder_ == null) {
                    this.refreshTimeout_ = null;
                    onChanged();
                    return this;
                }
                this.refreshTimeout_ = null;
                this.refreshTimeoutBuilder_ = null;
                return this;
            }

            public Builder clearRefreshUrl() {
                if (this.refreshUrlBuilder_ == null) {
                    this.refreshUrl_ = null;
                    onChanged();
                    return this;
                }
                this.refreshUrl_ = null;
                this.refreshUrlBuilder_ = null;
                return this;
            }

            public Builder clearRetryBase() {
                if (this.retryBaseBuilder_ == null) {
                    this.retryBase_ = null;
                    onChanged();
                    return this;
                }
                this.retryBase_ = null;
                this.retryBaseBuilder_ = null;
                return this;
            }

            public Builder clearServerParams() {
                if (this.serverParamsBuilder_ == null) {
                    this.serverParams_ = null;
                    onChanged();
                    return this;
                }
                this.serverParams_ = null;
                this.serverParamsBuilder_ = null;
                return this;
            }

            public Builder clearShouldBreak() {
                this.shouldBreak_ = false;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public AdUnit getAdUnits(int i10) {
                pa paVar = this.adUnitsBuilder_;
                return paVar == null ? this.adUnits_.get(i10) : (AdUnit) paVar.getMessage(i10);
            }

            public AdUnit.Builder getAdUnitsBuilder(int i10) {
                return (AdUnit.Builder) getAdUnitsFieldBuilder().getBuilder(i10);
            }

            public List<AdUnit.Builder> getAdUnitsBuilderList() {
                return getAdUnitsFieldBuilder().getBuilderList();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public int getAdUnitsCount() {
                pa paVar = this.adUnitsBuilder_;
                return paVar == null ? this.adUnits_.size() : paVar.getCount();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public List<AdUnit> getAdUnitsList() {
                pa paVar = this.adUnitsBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.adUnits_) : paVar.getMessageList();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public AdUnitOrBuilder getAdUnitsOrBuilder(int i10) {
                pa paVar = this.adUnitsBuilder_;
                return paVar == null ? this.adUnits_.get(i10) : (AdUnitOrBuilder) paVar.getMessageOrBuilder(i10);
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public List<? extends AdUnitOrBuilder> getAdUnitsOrBuilderList() {
                pa paVar = this.adUnitsBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.adUnits_);
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public UInt32Value getCacheSize() {
                xa xaVar = this.cacheSizeBuilder_;
                if (xaVar != null) {
                    return (UInt32Value) xaVar.getMessage();
                }
                UInt32Value uInt32Value = this.cacheSize_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            public UInt32Value.Builder getCacheSizeBuilder() {
                onChanged();
                return (UInt32Value.Builder) getCacheSizeFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public yb getCacheSizeOrBuilder() {
                xa xaVar = this.cacheSizeBuilder_;
                if (xaVar != null) {
                    return (yb) xaVar.getMessageOrBuilder();
                }
                UInt32Value uInt32Value = this.cacheSize_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Configuration_descriptor;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public String getFormat() {
                Object obj = this.format_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.format_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public ByteString getFormatBytes() {
                Object obj = this.format_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.format_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public UInt32Value getMaxRetryDegree() {
                xa xaVar = this.maxRetryDegreeBuilder_;
                if (xaVar != null) {
                    return (UInt32Value) xaVar.getMessage();
                }
                UInt32Value uInt32Value = this.maxRetryDegree_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            public UInt32Value.Builder getMaxRetryDegreeBuilder() {
                onChanged();
                return (UInt32Value.Builder) getMaxRetryDegreeFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public yb getMaxRetryDegreeOrBuilder() {
                xa xaVar = this.maxRetryDegreeBuilder_;
                if (xaVar != null) {
                    return (yb) xaVar.getMessageOrBuilder();
                }
                UInt32Value uInt32Value = this.maxRetryDegree_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public UInt64Value getRefreshTimeout() {
                xa xaVar = this.refreshTimeoutBuilder_;
                if (xaVar != null) {
                    return (UInt64Value) xaVar.getMessage();
                }
                UInt64Value uInt64Value = this.refreshTimeout_;
                return uInt64Value == null ? UInt64Value.getDefaultInstance() : uInt64Value;
            }

            public UInt64Value.Builder getRefreshTimeoutBuilder() {
                onChanged();
                return (UInt64Value.Builder) getRefreshTimeoutFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public zb getRefreshTimeoutOrBuilder() {
                xa xaVar = this.refreshTimeoutBuilder_;
                if (xaVar != null) {
                    return (zb) xaVar.getMessageOrBuilder();
                }
                UInt64Value uInt64Value = this.refreshTimeout_;
                return uInt64Value == null ? UInt64Value.getDefaultInstance() : uInt64Value;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public StringValue getRefreshUrl() {
                xa xaVar = this.refreshUrlBuilder_;
                if (xaVar != null) {
                    return (StringValue) xaVar.getMessage();
                }
                StringValue stringValue = this.refreshUrl_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            public StringValue.Builder getRefreshUrlBuilder() {
                onChanged();
                return (StringValue.Builder) getRefreshUrlFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public ib getRefreshUrlOrBuilder() {
                xa xaVar = this.refreshUrlBuilder_;
                if (xaVar != null) {
                    return (ib) xaVar.getMessageOrBuilder();
                }
                StringValue stringValue = this.refreshUrl_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public UInt32Value getRetryBase() {
                xa xaVar = this.retryBaseBuilder_;
                if (xaVar != null) {
                    return (UInt32Value) xaVar.getMessage();
                }
                UInt32Value uInt32Value = this.retryBase_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            public UInt32Value.Builder getRetryBaseBuilder() {
                onChanged();
                return (UInt32Value.Builder) getRetryBaseFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public yb getRetryBaseOrBuilder() {
                xa xaVar = this.retryBaseBuilder_;
                if (xaVar != null) {
                    return (yb) xaVar.getMessageOrBuilder();
                }
                UInt32Value uInt32Value = this.retryBase_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public StringValue getServerParams() {
                xa xaVar = this.serverParamsBuilder_;
                if (xaVar != null) {
                    return (StringValue) xaVar.getMessage();
                }
                StringValue stringValue = this.serverParams_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            public StringValue.Builder getServerParamsBuilder() {
                onChanged();
                return (StringValue.Builder) getServerParamsFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public ib getServerParamsOrBuilder() {
                xa xaVar = this.serverParamsBuilder_;
                if (xaVar != null) {
                    return (ib) xaVar.getMessageOrBuilder();
                }
                StringValue stringValue = this.serverParams_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public boolean getShouldBreak() {
                return this.shouldBreak_;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public boolean hasCacheSize() {
                return (this.cacheSizeBuilder_ == null && this.cacheSize_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public boolean hasMaxRetryDegree() {
                return (this.maxRetryDegreeBuilder_ == null && this.maxRetryDegree_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public boolean hasRefreshTimeout() {
                return (this.refreshTimeoutBuilder_ == null && this.refreshTimeout_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public boolean hasRefreshUrl() {
                return (this.refreshUrlBuilder_ == null && this.refreshUrl_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public boolean hasRetryBase() {
                return (this.retryBaseBuilder_ == null && this.retryBase_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public boolean hasServerParams() {
                return (this.serverParamsBuilder_ == null && this.serverParams_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Configuration_fieldAccessorTable.ensureFieldAccessorsInitialized(Configuration.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCacheSize(UInt32Value uInt32Value) {
                xa xaVar = this.cacheSizeBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(uInt32Value);
                    return this;
                }
                UInt32Value uInt32Value2 = this.cacheSize_;
                if (uInt32Value2 != null) {
                    this.cacheSize_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                } else {
                    this.cacheSize_ = uInt32Value;
                }
                onChanged();
                return this;
            }

            public Builder mergeMaxRetryDegree(UInt32Value uInt32Value) {
                xa xaVar = this.maxRetryDegreeBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(uInt32Value);
                    return this;
                }
                UInt32Value uInt32Value2 = this.maxRetryDegree_;
                if (uInt32Value2 != null) {
                    this.maxRetryDegree_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                } else {
                    this.maxRetryDegree_ = uInt32Value;
                }
                onChanged();
                return this;
            }

            public Builder mergeRefreshTimeout(UInt64Value uInt64Value) {
                xa xaVar = this.refreshTimeoutBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(uInt64Value);
                    return this;
                }
                UInt64Value uInt64Value2 = this.refreshTimeout_;
                if (uInt64Value2 != null) {
                    this.refreshTimeout_ = UInt64Value.newBuilder(uInt64Value2).mergeFrom(uInt64Value).buildPartial();
                } else {
                    this.refreshTimeout_ = uInt64Value;
                }
                onChanged();
                return this;
            }

            public Builder mergeRefreshUrl(StringValue stringValue) {
                xa xaVar = this.refreshUrlBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(stringValue);
                    return this;
                }
                StringValue stringValue2 = this.refreshUrl_;
                if (stringValue2 != null) {
                    this.refreshUrl_ = g.h(stringValue2, stringValue);
                } else {
                    this.refreshUrl_ = stringValue;
                }
                onChanged();
                return this;
            }

            public Builder mergeRetryBase(UInt32Value uInt32Value) {
                xa xaVar = this.retryBaseBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(uInt32Value);
                    return this;
                }
                UInt32Value uInt32Value2 = this.retryBase_;
                if (uInt32Value2 != null) {
                    this.retryBase_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                } else {
                    this.retryBase_ = uInt32Value;
                }
                onChanged();
                return this;
            }

            public Builder mergeServerParams(StringValue stringValue) {
                xa xaVar = this.serverParamsBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(stringValue);
                    return this;
                }
                StringValue stringValue2 = this.serverParams_;
                if (stringValue2 != null) {
                    this.serverParams_ = g.h(stringValue2, stringValue);
                } else {
                    this.serverParams_ = stringValue;
                }
                onChanged();
                return this;
            }

            public Builder removeAdUnits(int i10) {
                pa paVar = this.adUnitsBuilder_;
                if (paVar != null) {
                    paVar.remove(i10);
                    return this;
                }
                ensureAdUnitsIsMutable();
                this.adUnits_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setAdUnits(int i10, AdUnit adUnit) {
                pa paVar = this.adUnitsBuilder_;
                if (paVar != null) {
                    paVar.setMessage(i10, adUnit);
                    return this;
                }
                adUnit.getClass();
                ensureAdUnitsIsMutable();
                this.adUnits_.set(i10, adUnit);
                onChanged();
                return this;
            }

            public Builder setCacheSize(UInt32Value uInt32Value) {
                xa xaVar = this.cacheSizeBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(uInt32Value);
                    return this;
                }
                uInt32Value.getClass();
                this.cacheSize_ = uInt32Value;
                onChanged();
                return this;
            }

            public Builder setFormat(String str) {
                str.getClass();
                this.format_ = str;
                onChanged();
                return this;
            }

            public Builder setFormatBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.format_ = byteString;
                onChanged();
                return this;
            }

            public Builder setId(String str) {
                str.getClass();
                this.id_ = str;
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.id_ = byteString;
                onChanged();
                return this;
            }

            public Builder setMaxRetryDegree(UInt32Value uInt32Value) {
                xa xaVar = this.maxRetryDegreeBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(uInt32Value);
                    return this;
                }
                uInt32Value.getClass();
                this.maxRetryDegree_ = uInt32Value;
                onChanged();
                return this;
            }

            public Builder setRefreshTimeout(UInt64Value uInt64Value) {
                xa xaVar = this.refreshTimeoutBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(uInt64Value);
                    return this;
                }
                uInt64Value.getClass();
                this.refreshTimeout_ = uInt64Value;
                onChanged();
                return this;
            }

            public Builder setRefreshUrl(StringValue stringValue) {
                xa xaVar = this.refreshUrlBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(stringValue);
                    return this;
                }
                stringValue.getClass();
                this.refreshUrl_ = stringValue;
                onChanged();
                return this;
            }

            public Builder setRetryBase(UInt32Value uInt32Value) {
                xa xaVar = this.retryBaseBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(uInt32Value);
                    return this;
                }
                uInt32Value.getClass();
                this.retryBase_ = uInt32Value;
                onChanged();
                return this;
            }

            public Builder setServerParams(StringValue stringValue) {
                xa xaVar = this.serverParamsBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(stringValue);
                    return this;
                }
                stringValue.getClass();
                this.serverParams_ = stringValue;
                onChanged();
                return this;
            }

            public Builder setShouldBreak(boolean z10) {
                this.shouldBreak_ = z10;
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
                configuration.id_ = this.id_;
                configuration.format_ = this.format_;
                xa xaVar = this.refreshTimeoutBuilder_;
                if (xaVar == null) {
                    configuration.refreshTimeout_ = this.refreshTimeout_;
                } else {
                    configuration.refreshTimeout_ = (UInt64Value) xaVar.build();
                }
                xa xaVar2 = this.refreshUrlBuilder_;
                if (xaVar2 == null) {
                    configuration.refreshUrl_ = this.refreshUrl_;
                } else {
                    configuration.refreshUrl_ = (StringValue) xaVar2.build();
                }
                xa xaVar3 = this.retryBaseBuilder_;
                if (xaVar3 == null) {
                    configuration.retryBase_ = this.retryBase_;
                } else {
                    configuration.retryBase_ = (UInt32Value) xaVar3.build();
                }
                xa xaVar4 = this.maxRetryDegreeBuilder_;
                if (xaVar4 == null) {
                    configuration.maxRetryDegree_ = this.maxRetryDegree_;
                } else {
                    configuration.maxRetryDegree_ = (UInt32Value) xaVar4.build();
                }
                xa xaVar5 = this.cacheSizeBuilder_;
                if (xaVar5 == null) {
                    configuration.cacheSize_ = this.cacheSize_;
                } else {
                    configuration.cacheSize_ = (UInt32Value) xaVar5.build();
                }
                pa paVar = this.adUnitsBuilder_;
                if (paVar != null) {
                    configuration.adUnits_ = paVar.build();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.adUnits_ = Collections.unmodifiableList(this.adUnits_);
                        this.bitField0_ &= -2;
                    }
                    configuration.adUnits_ = this.adUnits_;
                }
                configuration.shouldBreak_ = this.shouldBreak_;
                xa xaVar6 = this.serverParamsBuilder_;
                if (xaVar6 == null) {
                    configuration.serverParams_ = this.serverParams_;
                } else {
                    configuration.serverParams_ = (StringValue) xaVar6.build();
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

            public AdUnit.Builder addAdUnitsBuilder(int i10) {
                return (AdUnit.Builder) getAdUnitsFieldBuilder().addBuilder(i10, AdUnit.getDefaultInstance());
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
                this.id_ = "";
                this.format_ = "";
                if (this.refreshTimeoutBuilder_ == null) {
                    this.refreshTimeout_ = null;
                } else {
                    this.refreshTimeout_ = null;
                    this.refreshTimeoutBuilder_ = null;
                }
                if (this.refreshUrlBuilder_ == null) {
                    this.refreshUrl_ = null;
                } else {
                    this.refreshUrl_ = null;
                    this.refreshUrlBuilder_ = null;
                }
                if (this.retryBaseBuilder_ == null) {
                    this.retryBase_ = null;
                } else {
                    this.retryBase_ = null;
                    this.retryBaseBuilder_ = null;
                }
                if (this.maxRetryDegreeBuilder_ == null) {
                    this.maxRetryDegree_ = null;
                } else {
                    this.maxRetryDegree_ = null;
                    this.maxRetryDegreeBuilder_ = null;
                }
                if (this.cacheSizeBuilder_ == null) {
                    this.cacheSize_ = null;
                } else {
                    this.cacheSize_ = null;
                    this.cacheSizeBuilder_ = null;
                }
                pa paVar = this.adUnitsBuilder_;
                if (paVar == null) {
                    this.adUnits_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                } else {
                    paVar.clear();
                }
                this.shouldBreak_ = false;
                if (this.serverParamsBuilder_ == null) {
                    this.serverParams_ = null;
                    return this;
                }
                this.serverParams_ = null;
                this.serverParamsBuilder_ = null;
                return this;
            }

            public Builder setCacheSize(UInt32Value.Builder builder) {
                xa xaVar = this.cacheSizeBuilder_;
                if (xaVar == null) {
                    this.cacheSize_ = builder.build();
                    onChanged();
                    return this;
                }
                xaVar.setMessage(builder.build());
                return this;
            }

            public Builder setMaxRetryDegree(UInt32Value.Builder builder) {
                xa xaVar = this.maxRetryDegreeBuilder_;
                if (xaVar == null) {
                    this.maxRetryDegree_ = builder.build();
                    onChanged();
                    return this;
                }
                xaVar.setMessage(builder.build());
                return this;
            }

            public Builder setRefreshTimeout(UInt64Value.Builder builder) {
                xa xaVar = this.refreshTimeoutBuilder_;
                if (xaVar == null) {
                    this.refreshTimeout_ = builder.build();
                    onChanged();
                    return this;
                }
                xaVar.setMessage(builder.build());
                return this;
            }

            public Builder setRefreshUrl(StringValue.Builder builder) {
                xa xaVar = this.refreshUrlBuilder_;
                if (xaVar == null) {
                    this.refreshUrl_ = builder.build();
                    onChanged();
                    return this;
                }
                xaVar.setMessage(builder.build());
                return this;
            }

            public Builder setRetryBase(UInt32Value.Builder builder) {
                xa xaVar = this.retryBaseBuilder_;
                if (xaVar == null) {
                    this.retryBase_ = builder.build();
                    onChanged();
                    return this;
                }
                xaVar.setMessage(builder.build());
                return this;
            }

            public Builder setServerParams(StringValue.Builder builder) {
                xa xaVar = this.serverParamsBuilder_;
                if (xaVar == null) {
                    this.serverParams_ = builder.build();
                    onChanged();
                    return this;
                }
                xaVar.setMessage(builder.build());
                return this;
            }

            public Builder addAdUnits(int i10, AdUnit adUnit) {
                pa paVar = this.adUnitsBuilder_;
                if (paVar == null) {
                    adUnit.getClass();
                    ensureAdUnitsIsMutable();
                    this.adUnits_.add(i10, adUnit);
                    onChanged();
                    return this;
                }
                paVar.addMessage(i10, adUnit);
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

            public Builder setAdUnits(int i10, AdUnit.Builder builder) {
                pa paVar = this.adUnitsBuilder_;
                if (paVar == null) {
                    ensureAdUnitsIsMutable();
                    this.adUnits_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                paVar.setMessage(i10, builder.build());
                return this;
            }

            private Builder(p6 p6Var) {
                super(p6Var);
                this.id_ = "";
                this.format_ = "";
                this.adUnits_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(Configuration configuration) {
                if (configuration == Configuration.getDefaultInstance()) {
                    return this;
                }
                if (!configuration.getId().isEmpty()) {
                    this.id_ = configuration.id_;
                    onChanged();
                }
                if (!configuration.getFormat().isEmpty()) {
                    this.format_ = configuration.format_;
                    onChanged();
                }
                if (configuration.hasRefreshTimeout()) {
                    mergeRefreshTimeout(configuration.getRefreshTimeout());
                }
                if (configuration.hasRefreshUrl()) {
                    mergeRefreshUrl(configuration.getRefreshUrl());
                }
                if (configuration.hasRetryBase()) {
                    mergeRetryBase(configuration.getRetryBase());
                }
                if (configuration.hasMaxRetryDegree()) {
                    mergeMaxRetryDegree(configuration.getMaxRetryDegree());
                }
                if (configuration.hasCacheSize()) {
                    mergeCacheSize(configuration.getCacheSize());
                }
                if (this.adUnitsBuilder_ == null) {
                    if (!configuration.adUnits_.isEmpty()) {
                        if (this.adUnits_.isEmpty()) {
                            this.adUnits_ = configuration.adUnits_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureAdUnitsIsMutable();
                            this.adUnits_.addAll(configuration.adUnits_);
                        }
                        onChanged();
                    }
                } else if (!configuration.adUnits_.isEmpty()) {
                    if (!this.adUnitsBuilder_.isEmpty()) {
                        this.adUnitsBuilder_.addAllMessages(configuration.adUnits_);
                    } else {
                        this.adUnitsBuilder_.dispose();
                        this.adUnitsBuilder_ = null;
                        this.adUnits_ = configuration.adUnits_;
                        this.bitField0_ &= -2;
                        this.adUnitsBuilder_ = k7.alwaysUseFieldBuilders ? getAdUnitsFieldBuilder() : null;
                    }
                }
                if (configuration.getShouldBreak()) {
                    setShouldBreak(configuration.getShouldBreak());
                }
                if (configuration.hasServerParams()) {
                    mergeServerParams(configuration.getServerParams());
                }
                mergeUnknownFields(((k7) configuration).unknownFields);
                onChanged();
                return this;
            }

            public Builder addAdUnits(AdUnit.Builder builder) {
                pa paVar = this.adUnitsBuilder_;
                if (paVar == null) {
                    ensureAdUnitsIsMutable();
                    this.adUnits_.add(builder.build());
                    onChanged();
                    return this;
                }
                paVar.addMessage(builder.build());
                return this;
            }

            public Builder addAdUnits(int i10, AdUnit.Builder builder) {
                pa paVar = this.adUnitsBuilder_;
                if (paVar == null) {
                    ensureAdUnitsIsMutable();
                    this.adUnits_.add(i10, builder.build());
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
            public io.bidmachine.protobuf.Waterfall.Configuration.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.Waterfall.Configuration.access$3500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.Waterfall$Configuration r3 = (io.bidmachine.protobuf.Waterfall.Configuration) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.Waterfall$Configuration r4 = (io.bidmachine.protobuf.Waterfall.Configuration) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.Waterfall.Configuration.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.Waterfall$Configuration$Builder");
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
            this.id_ = "";
            this.format_ = "";
            this.adUnits_ = Collections.EMPTY_LIST;
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

        public static Configuration parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Configuration) k7.parseWithIOException(PARSER, inputStream, m5Var);
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
                        switch (tag) {
                            case 0:
                                z10 = true;
                            case 10:
                                this.id_ = yVar.readStringRequireUtf8();
                            case 18:
                                this.format_ = yVar.readStringRequireUtf8();
                            case 26:
                                UInt64Value uInt64Value = this.refreshTimeout_;
                                UInt64Value.Builder builder = uInt64Value != null ? uInt64Value.toBuilder() : null;
                                UInt64Value uInt64Value2 = (UInt64Value) yVar.readMessage(UInt64Value.parser(), m5Var);
                                this.refreshTimeout_ = uInt64Value2;
                                if (builder != null) {
                                    builder.mergeFrom(uInt64Value2);
                                    this.refreshTimeout_ = builder.buildPartial();
                                }
                            case 34:
                                StringValue stringValue = this.refreshUrl_;
                                StringValue.Builder builder2 = stringValue != null ? stringValue.toBuilder() : null;
                                StringValue stringValue2 = (StringValue) yVar.readMessage(StringValue.parser(), m5Var);
                                this.refreshUrl_ = stringValue2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(stringValue2);
                                    this.refreshUrl_ = builder2.buildPartial();
                                }
                            case 42:
                                UInt32Value uInt32Value = this.retryBase_;
                                UInt32Value.Builder builder3 = uInt32Value != null ? uInt32Value.toBuilder() : null;
                                UInt32Value uInt32Value2 = (UInt32Value) yVar.readMessage(UInt32Value.parser(), m5Var);
                                this.retryBase_ = uInt32Value2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(uInt32Value2);
                                    this.retryBase_ = builder3.buildPartial();
                                }
                            case 50:
                                UInt32Value uInt32Value3 = this.maxRetryDegree_;
                                UInt32Value.Builder builder4 = uInt32Value3 != null ? uInt32Value3.toBuilder() : null;
                                UInt32Value uInt32Value4 = (UInt32Value) yVar.readMessage(UInt32Value.parser(), m5Var);
                                this.maxRetryDegree_ = uInt32Value4;
                                if (builder4 != null) {
                                    builder4.mergeFrom(uInt32Value4);
                                    this.maxRetryDegree_ = builder4.buildPartial();
                                }
                            case 58:
                                UInt32Value uInt32Value5 = this.cacheSize_;
                                UInt32Value.Builder builder5 = uInt32Value5 != null ? uInt32Value5.toBuilder() : null;
                                UInt32Value uInt32Value6 = (UInt32Value) yVar.readMessage(UInt32Value.parser(), m5Var);
                                this.cacheSize_ = uInt32Value6;
                                if (builder5 != null) {
                                    builder5.mergeFrom(uInt32Value6);
                                    this.cacheSize_ = builder5.buildPartial();
                                }
                            case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                                if (objArr == false) {
                                    this.adUnits_ = new ArrayList();
                                    objArr = true;
                                }
                                this.adUnits_.add(yVar.readMessage(AdUnit.parser(), m5Var));
                            case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                                this.shouldBreak_ = yVar.readBool();
                            case 82:
                                StringValue stringValue3 = this.serverParams_;
                                StringValue.Builder builder6 = stringValue3 != null ? stringValue3.toBuilder() : null;
                                StringValue stringValue4 = (StringValue) yVar.readMessage(StringValue.parser(), m5Var);
                                this.serverParams_ = stringValue4;
                                if (builder6 != null) {
                                    builder6.mergeFrom(stringValue4);
                                    this.serverParams_ = builder6.buildPartial();
                                }
                            default:
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                    z10 = true;
                                }
                        }
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (objArr != false) {
                        this.adUnits_ = Collections.unmodifiableList(this.adUnits_);
                    }
                    this.unknownFields = ccVarNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (objArr != false) {
                this.adUnits_ = Collections.unmodifiableList(this.adUnits_);
            }
            this.unknownFields = ccVarNewBuilder.build();
            makeExtensionsImmutable();
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
        Configuration.AdUnit getAdUnits(int i10);

        int getAdUnitsCount();

        List<Configuration.AdUnit> getAdUnitsList();

        Configuration.AdUnitOrBuilder getAdUnitsOrBuilder(int i10);

        List<? extends Configuration.AdUnitOrBuilder> getAdUnitsOrBuilderList();

        UInt32Value getCacheSize();

        yb getCacheSizeOrBuilder();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        String getFormat();

        ByteString getFormatBytes();

        String getId();

        ByteString getIdBytes();

        UInt32Value getMaxRetryDegree();

        yb getMaxRetryDegreeOrBuilder();

        UInt64Value getRefreshTimeout();

        zb getRefreshTimeoutOrBuilder();

        StringValue getRefreshUrl();

        ib getRefreshUrlOrBuilder();

        UInt32Value getRetryBase();

        yb getRetryBaseOrBuilder();

        StringValue getServerParams();

        ib getServerParamsOrBuilder();

        boolean getShouldBreak();

        boolean hasCacheSize();

        boolean hasMaxRetryDegree();

        boolean hasRefreshTimeout();

        boolean hasRefreshUrl();

        boolean hasRetryBase();

        boolean hasServerParams();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Context extends k7 implements ContextOrBuilder {
        public static final int CONFIGURATIONS_FIELD_NUMBER = 1;
        public static final int EVENT_CONFIG_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private List<Configuration> configurations_;
        private AdExtension.EventConfiguration eventConfig_;
        private byte memoizedIsInitialized;
        private static final Context DEFAULT_INSTANCE = new Context();
        private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.Waterfall.Context.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public Context parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new Context(yVar, m5Var);
            }
        };

        public static Context getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Context_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Context parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Context) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Context parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Context) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Context)) {
                return super.equals(obj);
            }
            Context context = (Context) obj;
            if (getConfigurationsList().equals(context.getConfigurationsList()) && hasEventConfig() == context.hasEventConfig()) {
                return (!hasEventConfig() || getEventConfig().equals(context.getEventConfig())) && this.unknownFields.equals(context.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
        public Configuration getConfigurations(int i10) {
            return this.configurations_.get(i10);
        }

        @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
        public int getConfigurationsCount() {
            return this.configurations_.size();
        }

        @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
        public List<Configuration> getConfigurationsList() {
            return this.configurations_;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
        public ConfigurationOrBuilder getConfigurationsOrBuilder(int i10) {
            return this.configurations_.get(i10);
        }

        @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
        public List<? extends ConfigurationOrBuilder> getConfigurationsOrBuilderList() {
            return this.configurations_;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
        public AdExtension.EventConfiguration getEventConfig() {
            AdExtension.EventConfiguration eventConfiguration = this.eventConfig_;
            return eventConfiguration == null ? AdExtension.EventConfiguration.getDefaultInstance() : eventConfiguration;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
        public AdExtension.EventConfigurationOrBuilder getEventConfigOrBuilder() {
            return getEventConfig();
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
            for (int i11 = 0; i11 < this.configurations_.size(); i11++) {
                iComputeMessageSize += h0.computeMessageSize(1, this.configurations_.get(i11));
            }
            if (this.eventConfig_ != null) {
                iComputeMessageSize += h0.computeMessageSize(2, getEventConfig());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
        public final gc getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
        public boolean hasEventConfig() {
            return this.eventConfig_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getConfigurationsCount() > 0) {
                iHashCode = o2.B(iHashCode, 37, 1, 53) + getConfigurationsList().hashCode();
            }
            if (hasEventConfig()) {
                iHashCode = o2.B(iHashCode, 37, 2, 53) + getEventConfig().hashCode();
            }
            int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Context_fieldAccessorTable.ensureFieldAccessorsInitialized(Context.class, Builder.class);
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
            return new Context();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            for (int i10 = 0; i10 < this.configurations_.size(); i10++) {
                h0Var.writeMessage(1, this.configurations_.get(i10));
            }
            if (this.eventConfig_ != null) {
                h0Var.writeMessage(2, getEventConfig());
            }
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements ContextOrBuilder {
            private int bitField0_;
            private pa configurationsBuilder_;
            private List<Configuration> configurations_;
            private xa eventConfigBuilder_;
            private AdExtension.EventConfiguration eventConfig_;

            private Builder() {
                super(null);
                this.configurations_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private void ensureConfigurationsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.configurations_ = new ArrayList(this.configurations_);
                    this.bitField0_ |= 1;
                }
            }

            private pa getConfigurationsFieldBuilder() {
                if (this.configurationsBuilder_ == null) {
                    this.configurationsBuilder_ = new pa(this.configurations_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.configurations_ = null;
                }
                return this.configurationsBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Context_descriptor;
            }

            private xa getEventConfigFieldBuilder() {
                if (this.eventConfigBuilder_ == null) {
                    this.eventConfigBuilder_ = new xa(getEventConfig(), getParentForChildren(), isClean());
                    this.eventConfig_ = null;
                }
                return this.eventConfigBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (k7.alwaysUseFieldBuilders) {
                    getConfigurationsFieldBuilder();
                }
            }

            public Builder addAllConfigurations(Iterable<? extends Configuration> iterable) {
                pa paVar = this.configurationsBuilder_;
                if (paVar != null) {
                    paVar.addAllMessages(iterable);
                    return this;
                }
                ensureConfigurationsIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.configurations_);
                onChanged();
                return this;
            }

            public Builder addConfigurations(Configuration configuration) {
                pa paVar = this.configurationsBuilder_;
                if (paVar != null) {
                    paVar.addMessage(configuration);
                    return this;
                }
                configuration.getClass();
                ensureConfigurationsIsMutable();
                this.configurations_.add(configuration);
                onChanged();
                return this;
            }

            public Configuration.Builder addConfigurationsBuilder() {
                return (Configuration.Builder) getConfigurationsFieldBuilder().addBuilder(Configuration.getDefaultInstance());
            }

            public Builder clearConfigurations() {
                pa paVar = this.configurationsBuilder_;
                if (paVar != null) {
                    paVar.clear();
                    return this;
                }
                this.configurations_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearEventConfig() {
                if (this.eventConfigBuilder_ == null) {
                    this.eventConfig_ = null;
                    onChanged();
                    return this;
                }
                this.eventConfig_ = null;
                this.eventConfigBuilder_ = null;
                return this;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
            public Configuration getConfigurations(int i10) {
                pa paVar = this.configurationsBuilder_;
                return paVar == null ? this.configurations_.get(i10) : (Configuration) paVar.getMessage(i10);
            }

            public Configuration.Builder getConfigurationsBuilder(int i10) {
                return (Configuration.Builder) getConfigurationsFieldBuilder().getBuilder(i10);
            }

            public List<Configuration.Builder> getConfigurationsBuilderList() {
                return getConfigurationsFieldBuilder().getBuilderList();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
            public int getConfigurationsCount() {
                pa paVar = this.configurationsBuilder_;
                return paVar == null ? this.configurations_.size() : paVar.getCount();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
            public List<Configuration> getConfigurationsList() {
                pa paVar = this.configurationsBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.configurations_) : paVar.getMessageList();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
            public ConfigurationOrBuilder getConfigurationsOrBuilder(int i10) {
                pa paVar = this.configurationsBuilder_;
                return paVar == null ? this.configurations_.get(i10) : (ConfigurationOrBuilder) paVar.getMessageOrBuilder(i10);
            }

            @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
            public List<? extends ConfigurationOrBuilder> getConfigurationsOrBuilderList() {
                pa paVar = this.configurationsBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.configurations_);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Context_descriptor;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
            public AdExtension.EventConfiguration getEventConfig() {
                xa xaVar = this.eventConfigBuilder_;
                if (xaVar != null) {
                    return (AdExtension.EventConfiguration) xaVar.getMessage();
                }
                AdExtension.EventConfiguration eventConfiguration = this.eventConfig_;
                return eventConfiguration == null ? AdExtension.EventConfiguration.getDefaultInstance() : eventConfiguration;
            }

            public AdExtension.EventConfiguration.Builder getEventConfigBuilder() {
                onChanged();
                return (AdExtension.EventConfiguration.Builder) getEventConfigFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
            public AdExtension.EventConfigurationOrBuilder getEventConfigOrBuilder() {
                xa xaVar = this.eventConfigBuilder_;
                if (xaVar != null) {
                    return (AdExtension.EventConfigurationOrBuilder) xaVar.getMessageOrBuilder();
                }
                AdExtension.EventConfiguration eventConfiguration = this.eventConfig_;
                return eventConfiguration == null ? AdExtension.EventConfiguration.getDefaultInstance() : eventConfiguration;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
            public boolean hasEventConfig() {
                return (this.eventConfigBuilder_ == null && this.eventConfig_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Context_fieldAccessorTable.ensureFieldAccessorsInitialized(Context.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeEventConfig(AdExtension.EventConfiguration eventConfiguration) {
                xa xaVar = this.eventConfigBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(eventConfiguration);
                    return this;
                }
                AdExtension.EventConfiguration eventConfiguration2 = this.eventConfig_;
                if (eventConfiguration2 != null) {
                    this.eventConfig_ = AdExtension.EventConfiguration.newBuilder(eventConfiguration2).mergeFrom(eventConfiguration).buildPartial();
                } else {
                    this.eventConfig_ = eventConfiguration;
                }
                onChanged();
                return this;
            }

            public Builder removeConfigurations(int i10) {
                pa paVar = this.configurationsBuilder_;
                if (paVar != null) {
                    paVar.remove(i10);
                    return this;
                }
                ensureConfigurationsIsMutable();
                this.configurations_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setConfigurations(int i10, Configuration configuration) {
                pa paVar = this.configurationsBuilder_;
                if (paVar != null) {
                    paVar.setMessage(i10, configuration);
                    return this;
                }
                configuration.getClass();
                ensureConfigurationsIsMutable();
                this.configurations_.set(i10, configuration);
                onChanged();
                return this;
            }

            public Builder setEventConfig(AdExtension.EventConfiguration eventConfiguration) {
                xa xaVar = this.eventConfigBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(eventConfiguration);
                    return this;
                }
                eventConfiguration.getClass();
                this.eventConfig_ = eventConfiguration;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Context build() {
                Context contextBuildPartial = buildPartial();
                if (contextBuildPartial.isInitialized()) {
                    return contextBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) contextBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Context buildPartial() {
                Context context = new Context(this);
                int i10 = this.bitField0_;
                pa paVar = this.configurationsBuilder_;
                if (paVar == null) {
                    if ((i10 & 1) != 0) {
                        this.configurations_ = Collections.unmodifiableList(this.configurations_);
                        this.bitField0_ &= -2;
                    }
                    context.configurations_ = this.configurations_;
                } else {
                    context.configurations_ = paVar.build();
                }
                xa xaVar = this.eventConfigBuilder_;
                if (xaVar == null) {
                    context.eventConfig_ = this.eventConfig_;
                } else {
                    context.eventConfig_ = (AdExtension.EventConfiguration) xaVar.build();
                }
                onBuilt();
                return context;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Context getDefaultInstanceForType() {
                return Context.getDefaultInstance();
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

            public Configuration.Builder addConfigurationsBuilder(int i10) {
                return (Configuration.Builder) getConfigurationsFieldBuilder().addBuilder(i10, Configuration.getDefaultInstance());
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
                pa paVar = this.configurationsBuilder_;
                if (paVar == null) {
                    this.configurations_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                } else {
                    paVar.clear();
                }
                if (this.eventConfigBuilder_ == null) {
                    this.eventConfig_ = null;
                    return this;
                }
                this.eventConfig_ = null;
                this.eventConfigBuilder_ = null;
                return this;
            }

            private Builder(p6 p6Var) {
                super(p6Var);
                this.configurations_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder setEventConfig(AdExtension.EventConfiguration.Builder builder) {
                xa xaVar = this.eventConfigBuilder_;
                if (xaVar == null) {
                    this.eventConfig_ = builder.build();
                    onChanged();
                    return this;
                }
                xaVar.setMessage(builder.build());
                return this;
            }

            public Builder addConfigurations(int i10, Configuration configuration) {
                pa paVar = this.configurationsBuilder_;
                if (paVar == null) {
                    configuration.getClass();
                    ensureConfigurationsIsMutable();
                    this.configurations_.add(i10, configuration);
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
                if (message instanceof Context) {
                    return mergeFrom((Context) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setConfigurations(int i10, Configuration.Builder builder) {
                pa paVar = this.configurationsBuilder_;
                if (paVar == null) {
                    ensureConfigurationsIsMutable();
                    this.configurations_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                paVar.setMessage(i10, builder.build());
                return this;
            }

            public Builder mergeFrom(Context context) {
                if (context == Context.getDefaultInstance()) {
                    return this;
                }
                if (this.configurationsBuilder_ == null) {
                    if (!context.configurations_.isEmpty()) {
                        if (this.configurations_.isEmpty()) {
                            this.configurations_ = context.configurations_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureConfigurationsIsMutable();
                            this.configurations_.addAll(context.configurations_);
                        }
                        onChanged();
                    }
                } else if (!context.configurations_.isEmpty()) {
                    if (!this.configurationsBuilder_.isEmpty()) {
                        this.configurationsBuilder_.addAllMessages(context.configurations_);
                    } else {
                        this.configurationsBuilder_.dispose();
                        this.configurationsBuilder_ = null;
                        this.configurations_ = context.configurations_;
                        this.bitField0_ &= -2;
                        this.configurationsBuilder_ = k7.alwaysUseFieldBuilders ? getConfigurationsFieldBuilder() : null;
                    }
                }
                if (context.hasEventConfig()) {
                    mergeEventConfig(context.getEventConfig());
                }
                mergeUnknownFields(((k7) context).unknownFields);
                onChanged();
                return this;
            }

            public Builder addConfigurations(Configuration.Builder builder) {
                pa paVar = this.configurationsBuilder_;
                if (paVar == null) {
                    ensureConfigurationsIsMutable();
                    this.configurations_.add(builder.build());
                    onChanged();
                    return this;
                }
                paVar.addMessage(builder.build());
                return this;
            }

            public Builder addConfigurations(int i10, Configuration.Builder builder) {
                pa paVar = this.configurationsBuilder_;
                if (paVar == null) {
                    ensureConfigurationsIsMutable();
                    this.configurations_.add(i10, builder.build());
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
            public io.bidmachine.protobuf.Waterfall.Context.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.Waterfall.Context.access$11200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.Waterfall$Context r3 = (io.bidmachine.protobuf.Waterfall.Context) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.Waterfall$Context r4 = (io.bidmachine.protobuf.Waterfall.Context) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.Waterfall.Context.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.Waterfall$Context$Builder");
            }
        }

        public static Builder newBuilder(Context context) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(context);
        }

        public static Context parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (Context) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private Context(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Context parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Context) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static Context parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Context) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Context getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Context parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (Context) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Context() {
            this.memoizedIsInitialized = (byte) -1;
            this.configurations_ = Collections.EMPTY_LIST;
        }

        public static Context parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Context) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static Context parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (Context) PARSER.parseFrom(bArr, m5Var);
        }

        public static Context parseFrom(InputStream inputStream) throws IOException {
            return (Context) k7.parseWithIOException(PARSER, inputStream);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Context(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                if (!z11) {
                                    this.configurations_ = new ArrayList();
                                    z11 = true;
                                }
                                this.configurations_.add(yVar.readMessage(Configuration.parser(), m5Var));
                            } else if (tag != 18) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                AdExtension.EventConfiguration eventConfiguration = this.eventConfig_;
                                AdExtension.EventConfiguration.Builder builder = eventConfiguration != null ? eventConfiguration.toBuilder() : null;
                                AdExtension.EventConfiguration eventConfiguration2 = (AdExtension.EventConfiguration) yVar.readMessage(AdExtension.EventConfiguration.parser(), m5Var);
                                this.eventConfig_ = eventConfiguration2;
                                if (builder != null) {
                                    builder.mergeFrom(eventConfiguration2);
                                    this.eventConfig_ = builder.buildPartial();
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
                    if (z11) {
                        this.configurations_ = Collections.unmodifiableList(this.configurations_);
                    }
                    this.unknownFields = ccVarNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z11) {
                this.configurations_ = Collections.unmodifiableList(this.configurations_);
            }
            this.unknownFields = ccVarNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static Context parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Context) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static Context parseFrom(y yVar) throws IOException {
            return (Context) k7.parseWithIOException(PARSER, yVar);
        }

        public static Context parseFrom(y yVar, m5 m5Var) throws IOException {
            return (Context) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ContextOrBuilder extends MessageOrBuilder {
        Configuration getConfigurations(int i10);

        int getConfigurationsCount();

        List<Configuration> getConfigurationsList();

        ConfigurationOrBuilder getConfigurationsOrBuilder(int i10);

        List<? extends ConfigurationOrBuilder> getConfigurationsOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        AdExtension.EventConfiguration getEventConfig();

        AdExtension.EventConfigurationOrBuilder getEventConfigOrBuilder();

        boolean hasEventConfig();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum PayloadCase implements o7, c {
        REQUEST(1),
        RESPONSE(2),
        PAYLOAD_NOT_SET(0);

        private final int value;

        PayloadCase(int i10) {
            this.value = i10;
        }

        public static PayloadCase forNumber(int i10) {
            if (i10 == 0) {
                return PAYLOAD_NOT_SET;
            }
            if (i10 == 1) {
                return REQUEST;
            }
            if (i10 != 2) {
                return null;
            }
            return RESPONSE;
        }

        @Override // com.explorestack.protobuf.o7
        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static PayloadCase valueOf(int i10) {
            return forNumber(i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Result extends k7 implements ResultOrBuilder {
        public static final int AD_UNIT_RESULTS_FIELD_NUMBER = 4;
        public static final int CACHED_AD_UNITS_FIELD_NUMBER = 5;
        public static final int EXT_FIELD_NUMBER = 2;
        public static final int FORMAT_FIELD_NUMBER = 3;
        public static final int SERVER_PARAMS_FIELD_NUMBER = 6;
        public static final int WATERFALL_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<AdUnit> adUnitResults_;
        private List<CachedAdUnit> cachedAdUnits_;
        private Struct ext_;
        private StringValue format_;
        private byte memoizedIsInitialized;
        private StringValue serverParams_;
        private volatile Object waterfallId_;
        private static final Result DEFAULT_INSTANCE = new Result();
        private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.Waterfall.Result.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public Result parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new Result(yVar, m5Var);
            }
        };

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class AdUnit extends k7 implements AdUnitOrBuilder {
            public static final int AD_RESPONSE_FIELD_NUMBER = 4;
            public static final int AD_UNIT_ID_FIELD_NUMBER = 1;
            public static final int ERROR_FIELD_NUMBER = 6;
            public static final int ESTIMATED_PRICE_FIELD_NUMBER = 3;
            public static final int PRICE_FIELD_NUMBER = 2;
            public static final int SERVER_PARAMS_FIELD_NUMBER = 7;
            public static final int STATUS_FIELD_NUMBER = 5;
            private static final long serialVersionUID = 0;
            private StringValue adResponse_;
            private volatile Object adUnitId_;
            private Error error_;
            private EstimatedPrice estimatedPrice_;
            private byte memoizedIsInitialized;
            private double price_;
            private StringValue serverParams_;
            private int status_;
            private static final AdUnit DEFAULT_INSTANCE = new AdUnit();
            private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.Waterfall.Result.AdUnit.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public AdUnit parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new AdUnit(yVar, m5Var);
                }
            };

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Error extends k7 implements ErrorOrBuilder {
                public static final int CODE_FIELD_NUMBER = 1;
                public static final int DESCRIPTION_FIELD_NUMBER = 2;
                private static final long serialVersionUID = 0;
                private int code_;
                private volatile Object description_;
                private byte memoizedIsInitialized;
                private static final Error DEFAULT_INSTANCE = new Error();
                private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.Waterfall.Result.AdUnit.Error.1
                    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                    public Error parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                        return new Error(yVar, m5Var);
                    }
                };

                public static Error getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_AdUnit_Error_descriptor;
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
                    return getCode() == error.getCode() && getDescription().equals(error.getDescription()) && this.unknownFields.equals(error.unknownFields);
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnit.ErrorOrBuilder
                public int getCode() {
                    return this.code_;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnit.ErrorOrBuilder
                public String getDescription() {
                    Object obj = this.description_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.description_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnit.ErrorOrBuilder
                public ByteString getDescriptionBytes() {
                    Object obj = this.description_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.description_ = byteStringCopyFromUtf8;
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
                    int i11 = this.code_;
                    int iComputeSInt32Size = i11 != 0 ? h0.computeSInt32Size(1, i11) : 0;
                    if (!getDescriptionBytes().isEmpty()) {
                        iComputeSInt32Size += k7.computeStringSize(2, this.description_);
                    }
                    int serializedSize = this.unknownFields.getSerializedSize() + iComputeSInt32Size;
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
                    int iHashCode = this.unknownFields.hashCode() + ((getDescription().hashCode() + ((((getCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
                    this.memoizedHashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.explorestack.protobuf.k7
                public i7 internalGetFieldAccessorTable() {
                    return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_AdUnit_Error_fieldAccessorTable.ensureFieldAccessorsInitialized(Error.class, Builder.class);
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
                    int i10 = this.code_;
                    if (i10 != 0) {
                        h0Var.writeSInt32(1, i10);
                    }
                    if (!getDescriptionBytes().isEmpty()) {
                        k7.writeString(h0Var, 2, this.description_);
                    }
                    this.unknownFields.writeTo(h0Var);
                }

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public static final class Builder extends o6 implements ErrorOrBuilder {
                    private int code_;
                    private Object description_;

                    private Builder() {
                        super(null);
                        this.description_ = "";
                        maybeForceBuilderInitialization();
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_AdUnit_Error_descriptor;
                    }

                    private void maybeForceBuilderInitialization() {
                        boolean unused = k7.alwaysUseFieldBuilders;
                    }

                    public Builder clearCode() {
                        this.code_ = 0;
                        onChanged();
                        return this;
                    }

                    public Builder clearDescription() {
                        this.description_ = Error.getDefaultInstance().getDescription();
                        onChanged();
                        return this;
                    }

                    @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnit.ErrorOrBuilder
                    public int getCode() {
                        return this.code_;
                    }

                    @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnit.ErrorOrBuilder
                    public String getDescription() {
                        Object obj = this.description_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.description_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnit.ErrorOrBuilder
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
                        return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_AdUnit_Error_descriptor;
                    }

                    @Override // com.explorestack.protobuf.o6
                    public i7 internalGetFieldAccessorTable() {
                        return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_AdUnit_Error_fieldAccessorTable.ensureFieldAccessorsInitialized(Error.class, Builder.class);
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    public Builder setCode(int i10) {
                        this.code_ = i10;
                        onChanged();
                        return this;
                    }

                    public Builder setDescription(String str) {
                        str.getClass();
                        this.description_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setDescriptionBytes(ByteString byteString) throws IllegalArgumentException {
                        byteString.getClass();
                        com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                        this.description_ = byteString;
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
                        error.code_ = this.code_;
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
                        this.code_ = 0;
                        this.description_ = "";
                        return this;
                    }

                    private Builder(p6 p6Var) {
                        super(p6Var);
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
                        if (error.getCode() != 0) {
                            setCode(error.getCode());
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
                    public io.bidmachine.protobuf.Waterfall.Result.AdUnit.Error.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.Waterfall.Result.AdUnit.Error.access$5600()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            io.bidmachine.protobuf.Waterfall$Result$AdUnit$Error r3 = (io.bidmachine.protobuf.Waterfall.Result.AdUnit.Error) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                            io.bidmachine.protobuf.Waterfall$Result$AdUnit$Error r4 = (io.bidmachine.protobuf.Waterfall.Result.AdUnit.Error) r4     // Catch: java.lang.Throwable -> L11
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
                        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.Waterfall.Result.AdUnit.Error.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.Waterfall$Result$AdUnit$Error$Builder");
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
                                    if (tag == 8) {
                                        this.code_ = yVar.readSInt32();
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
                int getCode();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ MessageLite getDefaultInstanceForType();

                String getDescription();

                ByteString getDescriptionBytes();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public enum Status implements ja {
                STATUS_INVALID(0),
                STATUS_SUCCESS(1),
                STATUS_ERROR(2),
                STATUS_SKIPPED(3),
                UNRECOGNIZED(-1);

                public static final int STATUS_ERROR_VALUE = 2;
                public static final int STATUS_INVALID_VALUE = 0;
                public static final int STATUS_SKIPPED_VALUE = 3;
                public static final int STATUS_SUCCESS_VALUE = 1;
                private final int value;
                private static final p7 internalValueMap = new p7() { // from class: io.bidmachine.protobuf.Waterfall.Result.AdUnit.Status.1
                    @Override // com.explorestack.protobuf.p7
                    public Status findValueByNumber(int i10) {
                        return Status.forNumber(i10);
                    }
                };
                private static final Status[] VALUES = values();

                Status(int i10) {
                    this.value = i10;
                }

                public static Status forNumber(int i10) {
                    if (i10 == 0) {
                        return STATUS_INVALID;
                    }
                    if (i10 == 1) {
                        return STATUS_SUCCESS;
                    }
                    if (i10 == 2) {
                        return STATUS_ERROR;
                    }
                    if (i10 != 3) {
                        return null;
                    }
                    return STATUS_SKIPPED;
                }

                public static final Descriptors.EnumDescriptor getDescriptor() {
                    return AdUnit.getDescriptor().getEnumTypes().get(0);
                }

                public static p7 internalGetValueMap() {
                    return internalValueMap;
                }

                @Override // com.explorestack.protobuf.ja
                public final Descriptors.EnumDescriptor getDescriptorForType() {
                    return getDescriptor();
                }

                @Override // com.explorestack.protobuf.ja, com.explorestack.protobuf.o7
                public final int getNumber() {
                    if (this != UNRECOGNIZED) {
                        return this.value;
                    }
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }

                @Override // com.explorestack.protobuf.ja
                public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                    if (this != UNRECOGNIZED) {
                        return getDescriptor().getValues().get(ordinal());
                    }
                    throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
                }

                @Deprecated
                public static Status valueOf(int i10) {
                    return forNumber(i10);
                }

                public static Status valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                    if (enumValueDescriptor.getType() == getDescriptor()) {
                        if (enumValueDescriptor.getIndex() == -1) {
                            return UNRECOGNIZED;
                        }
                        return VALUES[enumValueDescriptor.getIndex()];
                    }
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                }
            }

            public static AdUnit getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_AdUnit_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static AdUnit parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (AdUnit) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static AdUnit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (AdUnit) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof AdUnit)) {
                    return super.equals(obj);
                }
                AdUnit adUnit = (AdUnit) obj;
                if (!getAdUnitId().equals(adUnit.getAdUnitId()) || Double.doubleToLongBits(getPrice()) != Double.doubleToLongBits(adUnit.getPrice()) || hasEstimatedPrice() != adUnit.hasEstimatedPrice()) {
                    return false;
                }
                if ((hasEstimatedPrice() && !getEstimatedPrice().equals(adUnit.getEstimatedPrice())) || hasAdResponse() != adUnit.hasAdResponse()) {
                    return false;
                }
                if ((hasAdResponse() && !getAdResponse().equals(adUnit.getAdResponse())) || this.status_ != adUnit.status_ || hasError() != adUnit.hasError()) {
                    return false;
                }
                if ((!hasError() || getError().equals(adUnit.getError())) && hasServerParams() == adUnit.hasServerParams()) {
                    return (!hasServerParams() || getServerParams().equals(adUnit.getServerParams())) && this.unknownFields.equals(adUnit.unknownFields);
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public StringValue getAdResponse() {
                StringValue stringValue = this.adResponse_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public ib getAdResponseOrBuilder() {
                return getAdResponse();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public String getAdUnitId() {
                Object obj = this.adUnitId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.adUnitId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public ByteString getAdUnitIdBytes() {
                Object obj = this.adUnitId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.adUnitId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public Error getError() {
                Error error = this.error_;
                return error == null ? Error.getDefaultInstance() : error;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public ErrorOrBuilder getErrorOrBuilder() {
                return getError();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public EstimatedPrice getEstimatedPrice() {
                EstimatedPrice estimatedPrice = this.estimatedPrice_;
                return estimatedPrice == null ? EstimatedPrice.getDefaultInstance() : estimatedPrice;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public EstimatedPriceOrBuilder getEstimatedPriceOrBuilder() {
                return getEstimatedPrice();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public fa getParserForType() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public double getPrice() {
                return this.price_;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = !getAdUnitIdBytes().isEmpty() ? k7.computeStringSize(1, this.adUnitId_) : 0;
                double d10 = this.price_;
                if (d10 != 0.0d) {
                    iComputeStringSize += h0.computeDoubleSize(2, d10);
                }
                if (this.estimatedPrice_ != null) {
                    iComputeStringSize += h0.computeMessageSize(3, getEstimatedPrice());
                }
                if (this.adResponse_ != null) {
                    iComputeStringSize += h0.computeMessageSize(4, getAdResponse());
                }
                if (this.status_ != Status.STATUS_INVALID.getNumber()) {
                    iComputeStringSize += h0.computeEnumSize(5, this.status_);
                }
                if (this.error_ != null) {
                    iComputeStringSize += h0.computeMessageSize(6, getError());
                }
                if (this.serverParams_ != null) {
                    iComputeStringSize += h0.computeMessageSize(7, getServerParams());
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public StringValue getServerParams() {
                StringValue stringValue = this.serverParams_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public ib getServerParamsOrBuilder() {
                return getServerParams();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public Status getStatus() {
                Status statusValueOf = Status.valueOf(this.status_);
                return statusValueOf == null ? Status.UNRECOGNIZED : statusValueOf;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public int getStatusValue() {
                return this.status_;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
            public final gc getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public boolean hasAdResponse() {
                return this.adResponse_ != null;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public boolean hasError() {
                return this.error_ != null;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public boolean hasEstimatedPrice() {
                return this.estimatedPrice_ != null;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public boolean hasServerParams() {
                return this.serverParams_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashLong = x7.hashLong(Double.doubleToLongBits(getPrice())) + ((((getAdUnitId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
                if (hasEstimatedPrice()) {
                    iHashLong = o2.B(iHashLong, 37, 3, 53) + getEstimatedPrice().hashCode();
                }
                if (hasAdResponse()) {
                    iHashLong = o2.B(iHashLong, 37, 4, 53) + getAdResponse().hashCode();
                }
                int iB = o2.B(iHashLong, 37, 5, 53) + this.status_;
                if (hasError()) {
                    iB = o2.B(iB, 37, 6, 53) + getError().hashCode();
                }
                if (hasServerParams()) {
                    iB = o2.B(iB, 37, 7, 53) + getServerParams().hashCode();
                }
                int iHashCode = this.unknownFields.hashCode() + (iB * 29);
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.explorestack.protobuf.k7
            public i7 internalGetFieldAccessorTable() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_AdUnit_fieldAccessorTable.ensureFieldAccessorsInitialized(AdUnit.class, Builder.class);
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
                return new AdUnit();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                if (!getAdUnitIdBytes().isEmpty()) {
                    k7.writeString(h0Var, 1, this.adUnitId_);
                }
                double d10 = this.price_;
                if (d10 != 0.0d) {
                    h0Var.writeDouble(2, d10);
                }
                if (this.estimatedPrice_ != null) {
                    h0Var.writeMessage(3, getEstimatedPrice());
                }
                if (this.adResponse_ != null) {
                    h0Var.writeMessage(4, getAdResponse());
                }
                if (this.status_ != Status.STATUS_INVALID.getNumber()) {
                    h0Var.writeEnum(5, this.status_);
                }
                if (this.error_ != null) {
                    h0Var.writeMessage(6, getError());
                }
                if (this.serverParams_ != null) {
                    h0Var.writeMessage(7, getServerParams());
                }
                this.unknownFields.writeTo(h0Var);
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends o6 implements AdUnitOrBuilder {
                private xa adResponseBuilder_;
                private StringValue adResponse_;
                private Object adUnitId_;
                private xa errorBuilder_;
                private Error error_;
                private xa estimatedPriceBuilder_;
                private EstimatedPrice estimatedPrice_;
                private double price_;
                private xa serverParamsBuilder_;
                private StringValue serverParams_;
                private int status_;

                private Builder() {
                    super(null);
                    this.adUnitId_ = "";
                    this.status_ = 0;
                    maybeForceBuilderInitialization();
                }

                private xa getAdResponseFieldBuilder() {
                    if (this.adResponseBuilder_ == null) {
                        this.adResponseBuilder_ = new xa(getAdResponse(), getParentForChildren(), isClean());
                        this.adResponse_ = null;
                    }
                    return this.adResponseBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_AdUnit_descriptor;
                }

                private xa getErrorFieldBuilder() {
                    if (this.errorBuilder_ == null) {
                        this.errorBuilder_ = new xa(getError(), getParentForChildren(), isClean());
                        this.error_ = null;
                    }
                    return this.errorBuilder_;
                }

                private xa getEstimatedPriceFieldBuilder() {
                    if (this.estimatedPriceBuilder_ == null) {
                        this.estimatedPriceBuilder_ = new xa(getEstimatedPrice(), getParentForChildren(), isClean());
                        this.estimatedPrice_ = null;
                    }
                    return this.estimatedPriceBuilder_;
                }

                private xa getServerParamsFieldBuilder() {
                    if (this.serverParamsBuilder_ == null) {
                        this.serverParamsBuilder_ = new xa(getServerParams(), getParentForChildren(), isClean());
                        this.serverParams_ = null;
                    }
                    return this.serverParamsBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = k7.alwaysUseFieldBuilders;
                }

                public Builder clearAdResponse() {
                    if (this.adResponseBuilder_ == null) {
                        this.adResponse_ = null;
                        onChanged();
                        return this;
                    }
                    this.adResponse_ = null;
                    this.adResponseBuilder_ = null;
                    return this;
                }

                public Builder clearAdUnitId() {
                    this.adUnitId_ = AdUnit.getDefaultInstance().getAdUnitId();
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

                public Builder clearEstimatedPrice() {
                    if (this.estimatedPriceBuilder_ == null) {
                        this.estimatedPrice_ = null;
                        onChanged();
                        return this;
                    }
                    this.estimatedPrice_ = null;
                    this.estimatedPriceBuilder_ = null;
                    return this;
                }

                public Builder clearPrice() {
                    this.price_ = 0.0d;
                    onChanged();
                    return this;
                }

                public Builder clearServerParams() {
                    if (this.serverParamsBuilder_ == null) {
                        this.serverParams_ = null;
                        onChanged();
                        return this;
                    }
                    this.serverParams_ = null;
                    this.serverParamsBuilder_ = null;
                    return this;
                }

                public Builder clearStatus() {
                    this.status_ = 0;
                    onChanged();
                    return this;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public StringValue getAdResponse() {
                    xa xaVar = this.adResponseBuilder_;
                    if (xaVar != null) {
                        return (StringValue) xaVar.getMessage();
                    }
                    StringValue stringValue = this.adResponse_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                public StringValue.Builder getAdResponseBuilder() {
                    onChanged();
                    return (StringValue.Builder) getAdResponseFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public ib getAdResponseOrBuilder() {
                    xa xaVar = this.adResponseBuilder_;
                    if (xaVar != null) {
                        return (ib) xaVar.getMessageOrBuilder();
                    }
                    StringValue stringValue = this.adResponse_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public String getAdUnitId() {
                    Object obj = this.adUnitId_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.adUnitId_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public ByteString getAdUnitIdBytes() {
                    Object obj = this.adUnitId_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.adUnitId_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_AdUnit_descriptor;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
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

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public ErrorOrBuilder getErrorOrBuilder() {
                    xa xaVar = this.errorBuilder_;
                    if (xaVar != null) {
                        return (ErrorOrBuilder) xaVar.getMessageOrBuilder();
                    }
                    Error error = this.error_;
                    return error == null ? Error.getDefaultInstance() : error;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public EstimatedPrice getEstimatedPrice() {
                    xa xaVar = this.estimatedPriceBuilder_;
                    if (xaVar != null) {
                        return (EstimatedPrice) xaVar.getMessage();
                    }
                    EstimatedPrice estimatedPrice = this.estimatedPrice_;
                    return estimatedPrice == null ? EstimatedPrice.getDefaultInstance() : estimatedPrice;
                }

                public EstimatedPrice.Builder getEstimatedPriceBuilder() {
                    onChanged();
                    return (EstimatedPrice.Builder) getEstimatedPriceFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public EstimatedPriceOrBuilder getEstimatedPriceOrBuilder() {
                    xa xaVar = this.estimatedPriceBuilder_;
                    if (xaVar != null) {
                        return (EstimatedPriceOrBuilder) xaVar.getMessageOrBuilder();
                    }
                    EstimatedPrice estimatedPrice = this.estimatedPrice_;
                    return estimatedPrice == null ? EstimatedPrice.getDefaultInstance() : estimatedPrice;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public double getPrice() {
                    return this.price_;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public StringValue getServerParams() {
                    xa xaVar = this.serverParamsBuilder_;
                    if (xaVar != null) {
                        return (StringValue) xaVar.getMessage();
                    }
                    StringValue stringValue = this.serverParams_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                public StringValue.Builder getServerParamsBuilder() {
                    onChanged();
                    return (StringValue.Builder) getServerParamsFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public ib getServerParamsOrBuilder() {
                    xa xaVar = this.serverParamsBuilder_;
                    if (xaVar != null) {
                        return (ib) xaVar.getMessageOrBuilder();
                    }
                    StringValue stringValue = this.serverParams_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public Status getStatus() {
                    Status statusValueOf = Status.valueOf(this.status_);
                    return statusValueOf == null ? Status.UNRECOGNIZED : statusValueOf;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public int getStatusValue() {
                    return this.status_;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public boolean hasAdResponse() {
                    return (this.adResponseBuilder_ == null && this.adResponse_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public boolean hasError() {
                    return (this.errorBuilder_ == null && this.error_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public boolean hasEstimatedPrice() {
                    return (this.estimatedPriceBuilder_ == null && this.estimatedPrice_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public boolean hasServerParams() {
                    return (this.serverParamsBuilder_ == null && this.serverParams_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_AdUnit_fieldAccessorTable.ensureFieldAccessorsInitialized(AdUnit.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeAdResponse(StringValue stringValue) {
                    xa xaVar = this.adResponseBuilder_;
                    if (xaVar != null) {
                        xaVar.mergeFrom(stringValue);
                        return this;
                    }
                    StringValue stringValue2 = this.adResponse_;
                    if (stringValue2 != null) {
                        this.adResponse_ = g.h(stringValue2, stringValue);
                    } else {
                        this.adResponse_ = stringValue;
                    }
                    onChanged();
                    return this;
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

                public Builder mergeEstimatedPrice(EstimatedPrice estimatedPrice) {
                    xa xaVar = this.estimatedPriceBuilder_;
                    if (xaVar != null) {
                        xaVar.mergeFrom(estimatedPrice);
                        return this;
                    }
                    EstimatedPrice estimatedPrice2 = this.estimatedPrice_;
                    if (estimatedPrice2 != null) {
                        this.estimatedPrice_ = EstimatedPrice.newBuilder(estimatedPrice2).mergeFrom(estimatedPrice).buildPartial();
                    } else {
                        this.estimatedPrice_ = estimatedPrice;
                    }
                    onChanged();
                    return this;
                }

                public Builder mergeServerParams(StringValue stringValue) {
                    xa xaVar = this.serverParamsBuilder_;
                    if (xaVar != null) {
                        xaVar.mergeFrom(stringValue);
                        return this;
                    }
                    StringValue stringValue2 = this.serverParams_;
                    if (stringValue2 != null) {
                        this.serverParams_ = g.h(stringValue2, stringValue);
                    } else {
                        this.serverParams_ = stringValue;
                    }
                    onChanged();
                    return this;
                }

                public Builder setAdResponse(StringValue stringValue) {
                    xa xaVar = this.adResponseBuilder_;
                    if (xaVar != null) {
                        xaVar.setMessage(stringValue);
                        return this;
                    }
                    stringValue.getClass();
                    this.adResponse_ = stringValue;
                    onChanged();
                    return this;
                }

                public Builder setAdUnitId(String str) {
                    str.getClass();
                    this.adUnitId_ = str;
                    onChanged();
                    return this;
                }

                public Builder setAdUnitIdBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.adUnitId_ = byteString;
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

                public Builder setEstimatedPrice(EstimatedPrice estimatedPrice) {
                    xa xaVar = this.estimatedPriceBuilder_;
                    if (xaVar != null) {
                        xaVar.setMessage(estimatedPrice);
                        return this;
                    }
                    estimatedPrice.getClass();
                    this.estimatedPrice_ = estimatedPrice;
                    onChanged();
                    return this;
                }

                public Builder setPrice(double d10) {
                    this.price_ = d10;
                    onChanged();
                    return this;
                }

                public Builder setServerParams(StringValue stringValue) {
                    xa xaVar = this.serverParamsBuilder_;
                    if (xaVar != null) {
                        xaVar.setMessage(stringValue);
                        return this;
                    }
                    stringValue.getClass();
                    this.serverParams_ = stringValue;
                    onChanged();
                    return this;
                }

                public Builder setStatus(Status status) {
                    status.getClass();
                    this.status_ = status.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setStatusValue(int i10) {
                    this.status_ = i10;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public AdUnit build() {
                    AdUnit adUnitBuildPartial = buildPartial();
                    if (adUnitBuildPartial.isInitialized()) {
                        return adUnitBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) adUnitBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public AdUnit buildPartial() {
                    AdUnit adUnit = new AdUnit(this);
                    adUnit.adUnitId_ = this.adUnitId_;
                    adUnit.price_ = this.price_;
                    xa xaVar = this.estimatedPriceBuilder_;
                    if (xaVar == null) {
                        adUnit.estimatedPrice_ = this.estimatedPrice_;
                    } else {
                        adUnit.estimatedPrice_ = (EstimatedPrice) xaVar.build();
                    }
                    xa xaVar2 = this.adResponseBuilder_;
                    if (xaVar2 == null) {
                        adUnit.adResponse_ = this.adResponse_;
                    } else {
                        adUnit.adResponse_ = (StringValue) xaVar2.build();
                    }
                    adUnit.status_ = this.status_;
                    xa xaVar3 = this.errorBuilder_;
                    if (xaVar3 == null) {
                        adUnit.error_ = this.error_;
                    } else {
                        adUnit.error_ = (Error) xaVar3.build();
                    }
                    xa xaVar4 = this.serverParamsBuilder_;
                    if (xaVar4 == null) {
                        adUnit.serverParams_ = this.serverParams_;
                    } else {
                        adUnit.serverParams_ = (StringValue) xaVar4.build();
                    }
                    onBuilt();
                    return adUnit;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public AdUnit getDefaultInstanceForType() {
                    return AdUnit.getDefaultInstance();
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
                    this.adUnitId_ = "";
                    this.price_ = 0.0d;
                    if (this.estimatedPriceBuilder_ == null) {
                        this.estimatedPrice_ = null;
                    } else {
                        this.estimatedPrice_ = null;
                        this.estimatedPriceBuilder_ = null;
                    }
                    if (this.adResponseBuilder_ == null) {
                        this.adResponse_ = null;
                    } else {
                        this.adResponse_ = null;
                        this.adResponseBuilder_ = null;
                    }
                    this.status_ = 0;
                    if (this.errorBuilder_ == null) {
                        this.error_ = null;
                    } else {
                        this.error_ = null;
                        this.errorBuilder_ = null;
                    }
                    if (this.serverParamsBuilder_ == null) {
                        this.serverParams_ = null;
                        return this;
                    }
                    this.serverParams_ = null;
                    this.serverParamsBuilder_ = null;
                    return this;
                }

                public Builder setAdResponse(StringValue.Builder builder) {
                    xa xaVar = this.adResponseBuilder_;
                    if (xaVar == null) {
                        this.adResponse_ = builder.build();
                        onChanged();
                        return this;
                    }
                    xaVar.setMessage(builder.build());
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

                public Builder setEstimatedPrice(EstimatedPrice.Builder builder) {
                    xa xaVar = this.estimatedPriceBuilder_;
                    if (xaVar == null) {
                        this.estimatedPrice_ = builder.build();
                        onChanged();
                        return this;
                    }
                    xaVar.setMessage(builder.build());
                    return this;
                }

                public Builder setServerParams(StringValue.Builder builder) {
                    xa xaVar = this.serverParamsBuilder_;
                    if (xaVar == null) {
                        this.serverParams_ = builder.build();
                        onChanged();
                        return this;
                    }
                    xaVar.setMessage(builder.build());
                    return this;
                }

                private Builder(p6 p6Var) {
                    super(p6Var);
                    this.adUnitId_ = "";
                    this.status_ = 0;
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
                /* renamed from: clone */
                public Builder mo500clone() {
                    return (Builder) super.mo500clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof AdUnit) {
                        return mergeFrom((AdUnit) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(AdUnit adUnit) {
                    if (adUnit == AdUnit.getDefaultInstance()) {
                        return this;
                    }
                    if (!adUnit.getAdUnitId().isEmpty()) {
                        this.adUnitId_ = adUnit.adUnitId_;
                        onChanged();
                    }
                    if (adUnit.getPrice() != 0.0d) {
                        setPrice(adUnit.getPrice());
                    }
                    if (adUnit.hasEstimatedPrice()) {
                        mergeEstimatedPrice(adUnit.getEstimatedPrice());
                    }
                    if (adUnit.hasAdResponse()) {
                        mergeAdResponse(adUnit.getAdResponse());
                    }
                    if (adUnit.status_ != 0) {
                        setStatusValue(adUnit.getStatusValue());
                    }
                    if (adUnit.hasError()) {
                        mergeError(adUnit.getError());
                    }
                    if (adUnit.hasServerParams()) {
                        mergeServerParams(adUnit.getServerParams());
                    }
                    mergeUnknownFields(((k7) adUnit).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public io.bidmachine.protobuf.Waterfall.Result.AdUnit.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.Waterfall.Result.AdUnit.access$7100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.Waterfall$Result$AdUnit r3 = (io.bidmachine.protobuf.Waterfall.Result.AdUnit) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.Waterfall$Result$AdUnit r4 = (io.bidmachine.protobuf.Waterfall.Result.AdUnit) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.Waterfall.Result.AdUnit.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.Waterfall$Result$AdUnit$Builder");
                }
            }

            public static Builder newBuilder(AdUnit adUnit) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(adUnit);
            }

            public static AdUnit parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (AdUnit) PARSER.parseFrom(byteBuffer, m5Var);
            }

            private AdUnit(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static AdUnit parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (AdUnit) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static AdUnit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (AdUnit) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public AdUnit getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static AdUnit parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (AdUnit) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private AdUnit() {
                this.memoizedIsInitialized = (byte) -1;
                this.adUnitId_ = "";
                this.status_ = 0;
            }

            public static AdUnit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (AdUnit) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static AdUnit parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (AdUnit) PARSER.parseFrom(bArr, m5Var);
            }

            public static AdUnit parseFrom(InputStream inputStream) throws IOException {
                return (AdUnit) k7.parseWithIOException(PARSER, inputStream);
            }

            private AdUnit(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                    this.adUnitId_ = yVar.readStringRequireUtf8();
                                } else if (tag != 17) {
                                    if (tag == 26) {
                                        EstimatedPrice estimatedPrice = this.estimatedPrice_;
                                        EstimatedPrice.Builder builder = estimatedPrice != null ? estimatedPrice.toBuilder() : null;
                                        EstimatedPrice estimatedPrice2 = (EstimatedPrice) yVar.readMessage(EstimatedPrice.parser(), m5Var);
                                        this.estimatedPrice_ = estimatedPrice2;
                                        if (builder != null) {
                                            builder.mergeFrom(estimatedPrice2);
                                            this.estimatedPrice_ = builder.buildPartial();
                                        }
                                    } else if (tag == 34) {
                                        StringValue stringValue = this.adResponse_;
                                        StringValue.Builder builder2 = stringValue != null ? stringValue.toBuilder() : null;
                                        StringValue stringValue2 = (StringValue) yVar.readMessage(StringValue.parser(), m5Var);
                                        this.adResponse_ = stringValue2;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(stringValue2);
                                            this.adResponse_ = builder2.buildPartial();
                                        }
                                    } else if (tag == 40) {
                                        this.status_ = yVar.readEnum();
                                    } else if (tag == 50) {
                                        Error error = this.error_;
                                        Error.Builder builder3 = error != null ? error.toBuilder() : null;
                                        Error error2 = (Error) yVar.readMessage(Error.parser(), m5Var);
                                        this.error_ = error2;
                                        if (builder3 != null) {
                                            builder3.mergeFrom(error2);
                                            this.error_ = builder3.buildPartial();
                                        }
                                    } else if (tag != 58) {
                                        if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                        }
                                    } else {
                                        StringValue stringValue3 = this.serverParams_;
                                        StringValue.Builder builder4 = stringValue3 != null ? stringValue3.toBuilder() : null;
                                        StringValue stringValue4 = (StringValue) yVar.readMessage(StringValue.parser(), m5Var);
                                        this.serverParams_ = stringValue4;
                                        if (builder4 != null) {
                                            builder4.mergeFrom(stringValue4);
                                            this.serverParams_ = builder4.buildPartial();
                                        }
                                    }
                                } else {
                                    this.price_ = yVar.readDouble();
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

            public static AdUnit parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (AdUnit) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            public static AdUnit parseFrom(y yVar) throws IOException {
                return (AdUnit) k7.parseWithIOException(PARSER, yVar);
            }

            public static AdUnit parseFrom(y yVar, m5 m5Var) throws IOException {
                return (AdUnit) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface AdUnitOrBuilder extends MessageOrBuilder {
            StringValue getAdResponse();

            ib getAdResponseOrBuilder();

            String getAdUnitId();

            ByteString getAdUnitIdBytes();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            AdUnit.Error getError();

            AdUnit.ErrorOrBuilder getErrorOrBuilder();

            EstimatedPrice getEstimatedPrice();

            EstimatedPriceOrBuilder getEstimatedPriceOrBuilder();

            double getPrice();

            StringValue getServerParams();

            ib getServerParamsOrBuilder();

            AdUnit.Status getStatus();

            int getStatusValue();

            boolean hasAdResponse();

            boolean hasError();

            boolean hasEstimatedPrice();

            boolean hasServerParams();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class CachedAdUnit extends k7 implements CachedAdUnitOrBuilder {
            public static final int AD_RESPONSE_FIELD_NUMBER = 4;
            public static final int AD_UNIT_ID_FIELD_NUMBER = 1;
            public static final int ESTIMATED_PRICE_FIELD_NUMBER = 3;
            public static final int FROZEN_FIELD_NUMBER = 5;
            public static final int PRICE_FIELD_NUMBER = 2;
            public static final int SERVER_PARAMS_FIELD_NUMBER = 6;
            private static final long serialVersionUID = 0;
            private StringValue adResponse_;
            private volatile Object adUnitId_;
            private EstimatedPrice estimatedPrice_;
            private boolean frozen_;
            private byte memoizedIsInitialized;
            private double price_;
            private StringValue serverParams_;
            private static final CachedAdUnit DEFAULT_INSTANCE = new CachedAdUnit();
            private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.Waterfall.Result.CachedAdUnit.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public CachedAdUnit parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new CachedAdUnit(yVar, m5Var);
                }
            };

            public static CachedAdUnit getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_CachedAdUnit_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static CachedAdUnit parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (CachedAdUnit) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static CachedAdUnit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (CachedAdUnit) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof CachedAdUnit)) {
                    return super.equals(obj);
                }
                CachedAdUnit cachedAdUnit = (CachedAdUnit) obj;
                if (!getAdUnitId().equals(cachedAdUnit.getAdUnitId()) || Double.doubleToLongBits(getPrice()) != Double.doubleToLongBits(cachedAdUnit.getPrice()) || hasEstimatedPrice() != cachedAdUnit.hasEstimatedPrice()) {
                    return false;
                }
                if ((hasEstimatedPrice() && !getEstimatedPrice().equals(cachedAdUnit.getEstimatedPrice())) || hasAdResponse() != cachedAdUnit.hasAdResponse()) {
                    return false;
                }
                if ((!hasAdResponse() || getAdResponse().equals(cachedAdUnit.getAdResponse())) && getFrozen() == cachedAdUnit.getFrozen() && hasServerParams() == cachedAdUnit.hasServerParams()) {
                    return (!hasServerParams() || getServerParams().equals(cachedAdUnit.getServerParams())) && this.unknownFields.equals(cachedAdUnit.unknownFields);
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public StringValue getAdResponse() {
                StringValue stringValue = this.adResponse_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public ib getAdResponseOrBuilder() {
                return getAdResponse();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public String getAdUnitId() {
                Object obj = this.adUnitId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.adUnitId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public ByteString getAdUnitIdBytes() {
                Object obj = this.adUnitId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.adUnitId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public EstimatedPrice getEstimatedPrice() {
                EstimatedPrice estimatedPrice = this.estimatedPrice_;
                return estimatedPrice == null ? EstimatedPrice.getDefaultInstance() : estimatedPrice;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public EstimatedPriceOrBuilder getEstimatedPriceOrBuilder() {
                return getEstimatedPrice();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public boolean getFrozen() {
                return this.frozen_;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public fa getParserForType() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public double getPrice() {
                return this.price_;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = !getAdUnitIdBytes().isEmpty() ? k7.computeStringSize(1, this.adUnitId_) : 0;
                double d10 = this.price_;
                if (d10 != 0.0d) {
                    iComputeStringSize += h0.computeDoubleSize(2, d10);
                }
                if (this.estimatedPrice_ != null) {
                    iComputeStringSize += h0.computeMessageSize(3, getEstimatedPrice());
                }
                if (this.adResponse_ != null) {
                    iComputeStringSize += h0.computeMessageSize(4, getAdResponse());
                }
                boolean z10 = this.frozen_;
                if (z10) {
                    iComputeStringSize += h0.computeBoolSize(5, z10);
                }
                if (this.serverParams_ != null) {
                    iComputeStringSize += h0.computeMessageSize(6, getServerParams());
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public StringValue getServerParams() {
                StringValue stringValue = this.serverParams_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public ib getServerParamsOrBuilder() {
                return getServerParams();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
            public final gc getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public boolean hasAdResponse() {
                return this.adResponse_ != null;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public boolean hasEstimatedPrice() {
                return this.estimatedPrice_ != null;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public boolean hasServerParams() {
                return this.serverParams_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashLong = x7.hashLong(Double.doubleToLongBits(getPrice())) + ((((getAdUnitId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
                if (hasEstimatedPrice()) {
                    iHashLong = o2.B(iHashLong, 37, 3, 53) + getEstimatedPrice().hashCode();
                }
                if (hasAdResponse()) {
                    iHashLong = o2.B(iHashLong, 37, 4, 53) + getAdResponse().hashCode();
                }
                int iHashBoolean = x7.hashBoolean(getFrozen()) + o2.B(iHashLong, 37, 5, 53);
                if (hasServerParams()) {
                    iHashBoolean = getServerParams().hashCode() + o2.B(iHashBoolean, 37, 6, 53);
                }
                int iHashCode = this.unknownFields.hashCode() + (iHashBoolean * 29);
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.explorestack.protobuf.k7
            public i7 internalGetFieldAccessorTable() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_CachedAdUnit_fieldAccessorTable.ensureFieldAccessorsInitialized(CachedAdUnit.class, Builder.class);
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
                return new CachedAdUnit();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                if (!getAdUnitIdBytes().isEmpty()) {
                    k7.writeString(h0Var, 1, this.adUnitId_);
                }
                double d10 = this.price_;
                if (d10 != 0.0d) {
                    h0Var.writeDouble(2, d10);
                }
                if (this.estimatedPrice_ != null) {
                    h0Var.writeMessage(3, getEstimatedPrice());
                }
                if (this.adResponse_ != null) {
                    h0Var.writeMessage(4, getAdResponse());
                }
                boolean z10 = this.frozen_;
                if (z10) {
                    h0Var.writeBool(5, z10);
                }
                if (this.serverParams_ != null) {
                    h0Var.writeMessage(6, getServerParams());
                }
                this.unknownFields.writeTo(h0Var);
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends o6 implements CachedAdUnitOrBuilder {
                private xa adResponseBuilder_;
                private StringValue adResponse_;
                private Object adUnitId_;
                private xa estimatedPriceBuilder_;
                private EstimatedPrice estimatedPrice_;
                private boolean frozen_;
                private double price_;
                private xa serverParamsBuilder_;
                private StringValue serverParams_;

                private Builder() {
                    super(null);
                    this.adUnitId_ = "";
                    maybeForceBuilderInitialization();
                }

                private xa getAdResponseFieldBuilder() {
                    if (this.adResponseBuilder_ == null) {
                        this.adResponseBuilder_ = new xa(getAdResponse(), getParentForChildren(), isClean());
                        this.adResponse_ = null;
                    }
                    return this.adResponseBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_CachedAdUnit_descriptor;
                }

                private xa getEstimatedPriceFieldBuilder() {
                    if (this.estimatedPriceBuilder_ == null) {
                        this.estimatedPriceBuilder_ = new xa(getEstimatedPrice(), getParentForChildren(), isClean());
                        this.estimatedPrice_ = null;
                    }
                    return this.estimatedPriceBuilder_;
                }

                private xa getServerParamsFieldBuilder() {
                    if (this.serverParamsBuilder_ == null) {
                        this.serverParamsBuilder_ = new xa(getServerParams(), getParentForChildren(), isClean());
                        this.serverParams_ = null;
                    }
                    return this.serverParamsBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = k7.alwaysUseFieldBuilders;
                }

                public Builder clearAdResponse() {
                    if (this.adResponseBuilder_ == null) {
                        this.adResponse_ = null;
                        onChanged();
                        return this;
                    }
                    this.adResponse_ = null;
                    this.adResponseBuilder_ = null;
                    return this;
                }

                public Builder clearAdUnitId() {
                    this.adUnitId_ = CachedAdUnit.getDefaultInstance().getAdUnitId();
                    onChanged();
                    return this;
                }

                public Builder clearEstimatedPrice() {
                    if (this.estimatedPriceBuilder_ == null) {
                        this.estimatedPrice_ = null;
                        onChanged();
                        return this;
                    }
                    this.estimatedPrice_ = null;
                    this.estimatedPriceBuilder_ = null;
                    return this;
                }

                public Builder clearFrozen() {
                    this.frozen_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearPrice() {
                    this.price_ = 0.0d;
                    onChanged();
                    return this;
                }

                public Builder clearServerParams() {
                    if (this.serverParamsBuilder_ == null) {
                        this.serverParams_ = null;
                        onChanged();
                        return this;
                    }
                    this.serverParams_ = null;
                    this.serverParamsBuilder_ = null;
                    return this;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public StringValue getAdResponse() {
                    xa xaVar = this.adResponseBuilder_;
                    if (xaVar != null) {
                        return (StringValue) xaVar.getMessage();
                    }
                    StringValue stringValue = this.adResponse_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                public StringValue.Builder getAdResponseBuilder() {
                    onChanged();
                    return (StringValue.Builder) getAdResponseFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public ib getAdResponseOrBuilder() {
                    xa xaVar = this.adResponseBuilder_;
                    if (xaVar != null) {
                        return (ib) xaVar.getMessageOrBuilder();
                    }
                    StringValue stringValue = this.adResponse_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public String getAdUnitId() {
                    Object obj = this.adUnitId_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.adUnitId_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public ByteString getAdUnitIdBytes() {
                    Object obj = this.adUnitId_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.adUnitId_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_CachedAdUnit_descriptor;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public EstimatedPrice getEstimatedPrice() {
                    xa xaVar = this.estimatedPriceBuilder_;
                    if (xaVar != null) {
                        return (EstimatedPrice) xaVar.getMessage();
                    }
                    EstimatedPrice estimatedPrice = this.estimatedPrice_;
                    return estimatedPrice == null ? EstimatedPrice.getDefaultInstance() : estimatedPrice;
                }

                public EstimatedPrice.Builder getEstimatedPriceBuilder() {
                    onChanged();
                    return (EstimatedPrice.Builder) getEstimatedPriceFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public EstimatedPriceOrBuilder getEstimatedPriceOrBuilder() {
                    xa xaVar = this.estimatedPriceBuilder_;
                    if (xaVar != null) {
                        return (EstimatedPriceOrBuilder) xaVar.getMessageOrBuilder();
                    }
                    EstimatedPrice estimatedPrice = this.estimatedPrice_;
                    return estimatedPrice == null ? EstimatedPrice.getDefaultInstance() : estimatedPrice;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public boolean getFrozen() {
                    return this.frozen_;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public double getPrice() {
                    return this.price_;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public StringValue getServerParams() {
                    xa xaVar = this.serverParamsBuilder_;
                    if (xaVar != null) {
                        return (StringValue) xaVar.getMessage();
                    }
                    StringValue stringValue = this.serverParams_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                public StringValue.Builder getServerParamsBuilder() {
                    onChanged();
                    return (StringValue.Builder) getServerParamsFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public ib getServerParamsOrBuilder() {
                    xa xaVar = this.serverParamsBuilder_;
                    if (xaVar != null) {
                        return (ib) xaVar.getMessageOrBuilder();
                    }
                    StringValue stringValue = this.serverParams_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public boolean hasAdResponse() {
                    return (this.adResponseBuilder_ == null && this.adResponse_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public boolean hasEstimatedPrice() {
                    return (this.estimatedPriceBuilder_ == null && this.estimatedPrice_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public boolean hasServerParams() {
                    return (this.serverParamsBuilder_ == null && this.serverParams_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_CachedAdUnit_fieldAccessorTable.ensureFieldAccessorsInitialized(CachedAdUnit.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeAdResponse(StringValue stringValue) {
                    xa xaVar = this.adResponseBuilder_;
                    if (xaVar != null) {
                        xaVar.mergeFrom(stringValue);
                        return this;
                    }
                    StringValue stringValue2 = this.adResponse_;
                    if (stringValue2 != null) {
                        this.adResponse_ = g.h(stringValue2, stringValue);
                    } else {
                        this.adResponse_ = stringValue;
                    }
                    onChanged();
                    return this;
                }

                public Builder mergeEstimatedPrice(EstimatedPrice estimatedPrice) {
                    xa xaVar = this.estimatedPriceBuilder_;
                    if (xaVar != null) {
                        xaVar.mergeFrom(estimatedPrice);
                        return this;
                    }
                    EstimatedPrice estimatedPrice2 = this.estimatedPrice_;
                    if (estimatedPrice2 != null) {
                        this.estimatedPrice_ = EstimatedPrice.newBuilder(estimatedPrice2).mergeFrom(estimatedPrice).buildPartial();
                    } else {
                        this.estimatedPrice_ = estimatedPrice;
                    }
                    onChanged();
                    return this;
                }

                public Builder mergeServerParams(StringValue stringValue) {
                    xa xaVar = this.serverParamsBuilder_;
                    if (xaVar != null) {
                        xaVar.mergeFrom(stringValue);
                        return this;
                    }
                    StringValue stringValue2 = this.serverParams_;
                    if (stringValue2 != null) {
                        this.serverParams_ = g.h(stringValue2, stringValue);
                    } else {
                        this.serverParams_ = stringValue;
                    }
                    onChanged();
                    return this;
                }

                public Builder setAdResponse(StringValue stringValue) {
                    xa xaVar = this.adResponseBuilder_;
                    if (xaVar != null) {
                        xaVar.setMessage(stringValue);
                        return this;
                    }
                    stringValue.getClass();
                    this.adResponse_ = stringValue;
                    onChanged();
                    return this;
                }

                public Builder setAdUnitId(String str) {
                    str.getClass();
                    this.adUnitId_ = str;
                    onChanged();
                    return this;
                }

                public Builder setAdUnitIdBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.adUnitId_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setEstimatedPrice(EstimatedPrice estimatedPrice) {
                    xa xaVar = this.estimatedPriceBuilder_;
                    if (xaVar != null) {
                        xaVar.setMessage(estimatedPrice);
                        return this;
                    }
                    estimatedPrice.getClass();
                    this.estimatedPrice_ = estimatedPrice;
                    onChanged();
                    return this;
                }

                public Builder setFrozen(boolean z10) {
                    this.frozen_ = z10;
                    onChanged();
                    return this;
                }

                public Builder setPrice(double d10) {
                    this.price_ = d10;
                    onChanged();
                    return this;
                }

                public Builder setServerParams(StringValue stringValue) {
                    xa xaVar = this.serverParamsBuilder_;
                    if (xaVar != null) {
                        xaVar.setMessage(stringValue);
                        return this;
                    }
                    stringValue.getClass();
                    this.serverParams_ = stringValue;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public CachedAdUnit build() {
                    CachedAdUnit cachedAdUnitBuildPartial = buildPartial();
                    if (cachedAdUnitBuildPartial.isInitialized()) {
                        return cachedAdUnitBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) cachedAdUnitBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public CachedAdUnit buildPartial() {
                    CachedAdUnit cachedAdUnit = new CachedAdUnit(this);
                    cachedAdUnit.adUnitId_ = this.adUnitId_;
                    cachedAdUnit.price_ = this.price_;
                    xa xaVar = this.estimatedPriceBuilder_;
                    if (xaVar == null) {
                        cachedAdUnit.estimatedPrice_ = this.estimatedPrice_;
                    } else {
                        cachedAdUnit.estimatedPrice_ = (EstimatedPrice) xaVar.build();
                    }
                    xa xaVar2 = this.adResponseBuilder_;
                    if (xaVar2 == null) {
                        cachedAdUnit.adResponse_ = this.adResponse_;
                    } else {
                        cachedAdUnit.adResponse_ = (StringValue) xaVar2.build();
                    }
                    cachedAdUnit.frozen_ = this.frozen_;
                    xa xaVar3 = this.serverParamsBuilder_;
                    if (xaVar3 == null) {
                        cachedAdUnit.serverParams_ = this.serverParams_;
                    } else {
                        cachedAdUnit.serverParams_ = (StringValue) xaVar3.build();
                    }
                    onBuilt();
                    return cachedAdUnit;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public CachedAdUnit getDefaultInstanceForType() {
                    return CachedAdUnit.getDefaultInstance();
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
                    this.adUnitId_ = "";
                    this.price_ = 0.0d;
                    if (this.estimatedPriceBuilder_ == null) {
                        this.estimatedPrice_ = null;
                    } else {
                        this.estimatedPrice_ = null;
                        this.estimatedPriceBuilder_ = null;
                    }
                    if (this.adResponseBuilder_ == null) {
                        this.adResponse_ = null;
                    } else {
                        this.adResponse_ = null;
                        this.adResponseBuilder_ = null;
                    }
                    this.frozen_ = false;
                    if (this.serverParamsBuilder_ == null) {
                        this.serverParams_ = null;
                        return this;
                    }
                    this.serverParams_ = null;
                    this.serverParamsBuilder_ = null;
                    return this;
                }

                private Builder(p6 p6Var) {
                    super(p6Var);
                    this.adUnitId_ = "";
                    maybeForceBuilderInitialization();
                }

                public Builder setAdResponse(StringValue.Builder builder) {
                    xa xaVar = this.adResponseBuilder_;
                    if (xaVar == null) {
                        this.adResponse_ = builder.build();
                        onChanged();
                        return this;
                    }
                    xaVar.setMessage(builder.build());
                    return this;
                }

                public Builder setEstimatedPrice(EstimatedPrice.Builder builder) {
                    xa xaVar = this.estimatedPriceBuilder_;
                    if (xaVar == null) {
                        this.estimatedPrice_ = builder.build();
                        onChanged();
                        return this;
                    }
                    xaVar.setMessage(builder.build());
                    return this;
                }

                public Builder setServerParams(StringValue.Builder builder) {
                    xa xaVar = this.serverParamsBuilder_;
                    if (xaVar == null) {
                        this.serverParams_ = builder.build();
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
                    if (message instanceof CachedAdUnit) {
                        return mergeFrom((CachedAdUnit) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(CachedAdUnit cachedAdUnit) {
                    if (cachedAdUnit == CachedAdUnit.getDefaultInstance()) {
                        return this;
                    }
                    if (!cachedAdUnit.getAdUnitId().isEmpty()) {
                        this.adUnitId_ = cachedAdUnit.adUnitId_;
                        onChanged();
                    }
                    if (cachedAdUnit.getPrice() != 0.0d) {
                        setPrice(cachedAdUnit.getPrice());
                    }
                    if (cachedAdUnit.hasEstimatedPrice()) {
                        mergeEstimatedPrice(cachedAdUnit.getEstimatedPrice());
                    }
                    if (cachedAdUnit.hasAdResponse()) {
                        mergeAdResponse(cachedAdUnit.getAdResponse());
                    }
                    if (cachedAdUnit.getFrozen()) {
                        setFrozen(cachedAdUnit.getFrozen());
                    }
                    if (cachedAdUnit.hasServerParams()) {
                        mergeServerParams(cachedAdUnit.getServerParams());
                    }
                    mergeUnknownFields(((k7) cachedAdUnit).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public io.bidmachine.protobuf.Waterfall.Result.CachedAdUnit.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.Waterfall.Result.CachedAdUnit.access$8500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.Waterfall$Result$CachedAdUnit r3 = (io.bidmachine.protobuf.Waterfall.Result.CachedAdUnit) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.Waterfall$Result$CachedAdUnit r4 = (io.bidmachine.protobuf.Waterfall.Result.CachedAdUnit) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.Waterfall.Result.CachedAdUnit.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.Waterfall$Result$CachedAdUnit$Builder");
                }
            }

            public static Builder newBuilder(CachedAdUnit cachedAdUnit) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(cachedAdUnit);
            }

            public static CachedAdUnit parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (CachedAdUnit) PARSER.parseFrom(byteBuffer, m5Var);
            }

            private CachedAdUnit(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static CachedAdUnit parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (CachedAdUnit) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static CachedAdUnit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (CachedAdUnit) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public CachedAdUnit getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static CachedAdUnit parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (CachedAdUnit) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private CachedAdUnit() {
                this.memoizedIsInitialized = (byte) -1;
                this.adUnitId_ = "";
            }

            public static CachedAdUnit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (CachedAdUnit) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static CachedAdUnit parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (CachedAdUnit) PARSER.parseFrom(bArr, m5Var);
            }

            public static CachedAdUnit parseFrom(InputStream inputStream) throws IOException {
                return (CachedAdUnit) k7.parseWithIOException(PARSER, inputStream);
            }

            private CachedAdUnit(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                    this.adUnitId_ = yVar.readStringRequireUtf8();
                                } else if (tag != 17) {
                                    if (tag == 26) {
                                        EstimatedPrice estimatedPrice = this.estimatedPrice_;
                                        EstimatedPrice.Builder builder = estimatedPrice != null ? estimatedPrice.toBuilder() : null;
                                        EstimatedPrice estimatedPrice2 = (EstimatedPrice) yVar.readMessage(EstimatedPrice.parser(), m5Var);
                                        this.estimatedPrice_ = estimatedPrice2;
                                        if (builder != null) {
                                            builder.mergeFrom(estimatedPrice2);
                                            this.estimatedPrice_ = builder.buildPartial();
                                        }
                                    } else if (tag == 34) {
                                        StringValue stringValue = this.adResponse_;
                                        StringValue.Builder builder2 = stringValue != null ? stringValue.toBuilder() : null;
                                        StringValue stringValue2 = (StringValue) yVar.readMessage(StringValue.parser(), m5Var);
                                        this.adResponse_ = stringValue2;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(stringValue2);
                                            this.adResponse_ = builder2.buildPartial();
                                        }
                                    } else if (tag == 40) {
                                        this.frozen_ = yVar.readBool();
                                    } else if (tag != 50) {
                                        if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                        }
                                    } else {
                                        StringValue stringValue3 = this.serverParams_;
                                        StringValue.Builder builder3 = stringValue3 != null ? stringValue3.toBuilder() : null;
                                        StringValue stringValue4 = (StringValue) yVar.readMessage(StringValue.parser(), m5Var);
                                        this.serverParams_ = stringValue4;
                                        if (builder3 != null) {
                                            builder3.mergeFrom(stringValue4);
                                            this.serverParams_ = builder3.buildPartial();
                                        }
                                    }
                                } else {
                                    this.price_ = yVar.readDouble();
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

            public static CachedAdUnit parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (CachedAdUnit) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            public static CachedAdUnit parseFrom(y yVar) throws IOException {
                return (CachedAdUnit) k7.parseWithIOException(PARSER, yVar);
            }

            public static CachedAdUnit parseFrom(y yVar, m5 m5Var) throws IOException {
                return (CachedAdUnit) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface CachedAdUnitOrBuilder extends MessageOrBuilder {
            StringValue getAdResponse();

            ib getAdResponseOrBuilder();

            String getAdUnitId();

            ByteString getAdUnitIdBytes();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            EstimatedPrice getEstimatedPrice();

            EstimatedPriceOrBuilder getEstimatedPriceOrBuilder();

            boolean getFrozen();

            double getPrice();

            StringValue getServerParams();

            ib getServerParamsOrBuilder();

            boolean hasAdResponse();

            boolean hasEstimatedPrice();

            boolean hasServerParams();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class EstimatedPrice extends k7 implements EstimatedPriceOrBuilder {
            public static final int CURRENCY_FIELD_NUMBER = 3;
            private static final EstimatedPrice DEFAULT_INSTANCE = new EstimatedPrice();
            private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.Waterfall.Result.EstimatedPrice.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public EstimatedPrice parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new EstimatedPrice(yVar, m5Var);
                }
            };
            public static final int PRECISION_FIELD_NUMBER = 2;
            public static final int VALUE_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private StringValue currency_;
            private byte memoizedIsInitialized;
            private UInt32Value precision_;
            private DoubleValue value_;

            public static EstimatedPrice getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_EstimatedPrice_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static EstimatedPrice parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (EstimatedPrice) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static EstimatedPrice parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (EstimatedPrice) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof EstimatedPrice)) {
                    return super.equals(obj);
                }
                EstimatedPrice estimatedPrice = (EstimatedPrice) obj;
                if (hasValue() != estimatedPrice.hasValue()) {
                    return false;
                }
                if ((hasValue() && !getValue().equals(estimatedPrice.getValue())) || hasPrecision() != estimatedPrice.hasPrecision()) {
                    return false;
                }
                if ((!hasPrecision() || getPrecision().equals(estimatedPrice.getPrecision())) && hasCurrency() == estimatedPrice.hasCurrency()) {
                    return (!hasCurrency() || getCurrency().equals(estimatedPrice.getCurrency())) && this.unknownFields.equals(estimatedPrice.unknownFields);
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
            public StringValue getCurrency() {
                StringValue stringValue = this.currency_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
            public ib getCurrencyOrBuilder() {
                return getCurrency();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public fa getParserForType() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
            public UInt32Value getPrecision() {
                UInt32Value uInt32Value = this.precision_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
            public yb getPrecisionOrBuilder() {
                return getPrecision();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeMessageSize = this.value_ != null ? h0.computeMessageSize(1, getValue()) : 0;
                if (this.precision_ != null) {
                    iComputeMessageSize += h0.computeMessageSize(2, getPrecision());
                }
                if (this.currency_ != null) {
                    iComputeMessageSize += h0.computeMessageSize(3, getCurrency());
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
            public final gc getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
            public DoubleValue getValue() {
                DoubleValue doubleValue = this.value_;
                return doubleValue == null ? DoubleValue.getDefaultInstance() : doubleValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
            public z4 getValueOrBuilder() {
                return getValue();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
            public boolean hasCurrency() {
                return this.currency_ != null;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
            public boolean hasPrecision() {
                return this.precision_ != null;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
            public boolean hasValue() {
                return this.value_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = getDescriptor().hashCode() + 779;
                if (hasValue()) {
                    iHashCode = o2.B(iHashCode, 37, 1, 53) + getValue().hashCode();
                }
                if (hasPrecision()) {
                    iHashCode = o2.B(iHashCode, 37, 2, 53) + getPrecision().hashCode();
                }
                if (hasCurrency()) {
                    iHashCode = o2.B(iHashCode, 37, 3, 53) + getCurrency().hashCode();
                }
                int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.k7
            public i7 internalGetFieldAccessorTable() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_EstimatedPrice_fieldAccessorTable.ensureFieldAccessorsInitialized(EstimatedPrice.class, Builder.class);
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
                return new EstimatedPrice();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                if (this.value_ != null) {
                    h0Var.writeMessage(1, getValue());
                }
                if (this.precision_ != null) {
                    h0Var.writeMessage(2, getPrecision());
                }
                if (this.currency_ != null) {
                    h0Var.writeMessage(3, getCurrency());
                }
                this.unknownFields.writeTo(h0Var);
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends o6 implements EstimatedPriceOrBuilder {
                private xa currencyBuilder_;
                private StringValue currency_;
                private xa precisionBuilder_;
                private UInt32Value precision_;
                private xa valueBuilder_;
                private DoubleValue value_;

                private Builder() {
                    super(null);
                    maybeForceBuilderInitialization();
                }

                private xa getCurrencyFieldBuilder() {
                    if (this.currencyBuilder_ == null) {
                        this.currencyBuilder_ = new xa(getCurrency(), getParentForChildren(), isClean());
                        this.currency_ = null;
                    }
                    return this.currencyBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_EstimatedPrice_descriptor;
                }

                private xa getPrecisionFieldBuilder() {
                    if (this.precisionBuilder_ == null) {
                        this.precisionBuilder_ = new xa(getPrecision(), getParentForChildren(), isClean());
                        this.precision_ = null;
                    }
                    return this.precisionBuilder_;
                }

                private xa getValueFieldBuilder() {
                    if (this.valueBuilder_ == null) {
                        this.valueBuilder_ = new xa(getValue(), getParentForChildren(), isClean());
                        this.value_ = null;
                    }
                    return this.valueBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = k7.alwaysUseFieldBuilders;
                }

                public Builder clearCurrency() {
                    if (this.currencyBuilder_ == null) {
                        this.currency_ = null;
                        onChanged();
                        return this;
                    }
                    this.currency_ = null;
                    this.currencyBuilder_ = null;
                    return this;
                }

                public Builder clearPrecision() {
                    if (this.precisionBuilder_ == null) {
                        this.precision_ = null;
                        onChanged();
                        return this;
                    }
                    this.precision_ = null;
                    this.precisionBuilder_ = null;
                    return this;
                }

                public Builder clearValue() {
                    if (this.valueBuilder_ == null) {
                        this.value_ = null;
                        onChanged();
                        return this;
                    }
                    this.value_ = null;
                    this.valueBuilder_ = null;
                    return this;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
                public StringValue getCurrency() {
                    xa xaVar = this.currencyBuilder_;
                    if (xaVar != null) {
                        return (StringValue) xaVar.getMessage();
                    }
                    StringValue stringValue = this.currency_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                public StringValue.Builder getCurrencyBuilder() {
                    onChanged();
                    return (StringValue.Builder) getCurrencyFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
                public ib getCurrencyOrBuilder() {
                    xa xaVar = this.currencyBuilder_;
                    if (xaVar != null) {
                        return (ib) xaVar.getMessageOrBuilder();
                    }
                    StringValue stringValue = this.currency_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_EstimatedPrice_descriptor;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
                public UInt32Value getPrecision() {
                    xa xaVar = this.precisionBuilder_;
                    if (xaVar != null) {
                        return (UInt32Value) xaVar.getMessage();
                    }
                    UInt32Value uInt32Value = this.precision_;
                    return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
                }

                public UInt32Value.Builder getPrecisionBuilder() {
                    onChanged();
                    return (UInt32Value.Builder) getPrecisionFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
                public yb getPrecisionOrBuilder() {
                    xa xaVar = this.precisionBuilder_;
                    if (xaVar != null) {
                        return (yb) xaVar.getMessageOrBuilder();
                    }
                    UInt32Value uInt32Value = this.precision_;
                    return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
                public DoubleValue getValue() {
                    xa xaVar = this.valueBuilder_;
                    if (xaVar != null) {
                        return (DoubleValue) xaVar.getMessage();
                    }
                    DoubleValue doubleValue = this.value_;
                    return doubleValue == null ? DoubleValue.getDefaultInstance() : doubleValue;
                }

                public DoubleValue.Builder getValueBuilder() {
                    onChanged();
                    return (DoubleValue.Builder) getValueFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
                public z4 getValueOrBuilder() {
                    xa xaVar = this.valueBuilder_;
                    if (xaVar != null) {
                        return (z4) xaVar.getMessageOrBuilder();
                    }
                    DoubleValue doubleValue = this.value_;
                    return doubleValue == null ? DoubleValue.getDefaultInstance() : doubleValue;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
                public boolean hasCurrency() {
                    return (this.currencyBuilder_ == null && this.currency_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
                public boolean hasPrecision() {
                    return (this.precisionBuilder_ == null && this.precision_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
                public boolean hasValue() {
                    return (this.valueBuilder_ == null && this.value_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_EstimatedPrice_fieldAccessorTable.ensureFieldAccessorsInitialized(EstimatedPrice.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeCurrency(StringValue stringValue) {
                    xa xaVar = this.currencyBuilder_;
                    if (xaVar != null) {
                        xaVar.mergeFrom(stringValue);
                        return this;
                    }
                    StringValue stringValue2 = this.currency_;
                    if (stringValue2 != null) {
                        this.currency_ = g.h(stringValue2, stringValue);
                    } else {
                        this.currency_ = stringValue;
                    }
                    onChanged();
                    return this;
                }

                public Builder mergePrecision(UInt32Value uInt32Value) {
                    xa xaVar = this.precisionBuilder_;
                    if (xaVar != null) {
                        xaVar.mergeFrom(uInt32Value);
                        return this;
                    }
                    UInt32Value uInt32Value2 = this.precision_;
                    if (uInt32Value2 != null) {
                        this.precision_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                    } else {
                        this.precision_ = uInt32Value;
                    }
                    onChanged();
                    return this;
                }

                public Builder mergeValue(DoubleValue doubleValue) {
                    xa xaVar = this.valueBuilder_;
                    if (xaVar != null) {
                        xaVar.mergeFrom(doubleValue);
                        return this;
                    }
                    DoubleValue doubleValue2 = this.value_;
                    if (doubleValue2 != null) {
                        this.value_ = DoubleValue.newBuilder(doubleValue2).mergeFrom(doubleValue).buildPartial();
                    } else {
                        this.value_ = doubleValue;
                    }
                    onChanged();
                    return this;
                }

                public Builder setCurrency(StringValue stringValue) {
                    xa xaVar = this.currencyBuilder_;
                    if (xaVar != null) {
                        xaVar.setMessage(stringValue);
                        return this;
                    }
                    stringValue.getClass();
                    this.currency_ = stringValue;
                    onChanged();
                    return this;
                }

                public Builder setPrecision(UInt32Value uInt32Value) {
                    xa xaVar = this.precisionBuilder_;
                    if (xaVar != null) {
                        xaVar.setMessage(uInt32Value);
                        return this;
                    }
                    uInt32Value.getClass();
                    this.precision_ = uInt32Value;
                    onChanged();
                    return this;
                }

                public Builder setValue(DoubleValue doubleValue) {
                    xa xaVar = this.valueBuilder_;
                    if (xaVar != null) {
                        xaVar.setMessage(doubleValue);
                        return this;
                    }
                    doubleValue.getClass();
                    this.value_ = doubleValue;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public EstimatedPrice build() {
                    EstimatedPrice estimatedPriceBuildPartial = buildPartial();
                    if (estimatedPriceBuildPartial.isInitialized()) {
                        return estimatedPriceBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) estimatedPriceBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public EstimatedPrice buildPartial() {
                    EstimatedPrice estimatedPrice = new EstimatedPrice(this);
                    xa xaVar = this.valueBuilder_;
                    if (xaVar == null) {
                        estimatedPrice.value_ = this.value_;
                    } else {
                        estimatedPrice.value_ = (DoubleValue) xaVar.build();
                    }
                    xa xaVar2 = this.precisionBuilder_;
                    if (xaVar2 == null) {
                        estimatedPrice.precision_ = this.precision_;
                    } else {
                        estimatedPrice.precision_ = (UInt32Value) xaVar2.build();
                    }
                    xa xaVar3 = this.currencyBuilder_;
                    if (xaVar3 == null) {
                        estimatedPrice.currency_ = this.currency_;
                    } else {
                        estimatedPrice.currency_ = (StringValue) xaVar3.build();
                    }
                    onBuilt();
                    return estimatedPrice;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public EstimatedPrice getDefaultInstanceForType() {
                    return EstimatedPrice.getDefaultInstance();
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
                    if (this.valueBuilder_ == null) {
                        this.value_ = null;
                    } else {
                        this.value_ = null;
                        this.valueBuilder_ = null;
                    }
                    if (this.precisionBuilder_ == null) {
                        this.precision_ = null;
                    } else {
                        this.precision_ = null;
                        this.precisionBuilder_ = null;
                    }
                    if (this.currencyBuilder_ == null) {
                        this.currency_ = null;
                        return this;
                    }
                    this.currency_ = null;
                    this.currencyBuilder_ = null;
                    return this;
                }

                public Builder setCurrency(StringValue.Builder builder) {
                    xa xaVar = this.currencyBuilder_;
                    if (xaVar == null) {
                        this.currency_ = builder.build();
                        onChanged();
                        return this;
                    }
                    xaVar.setMessage(builder.build());
                    return this;
                }

                public Builder setPrecision(UInt32Value.Builder builder) {
                    xa xaVar = this.precisionBuilder_;
                    if (xaVar == null) {
                        this.precision_ = builder.build();
                        onChanged();
                        return this;
                    }
                    xaVar.setMessage(builder.build());
                    return this;
                }

                public Builder setValue(DoubleValue.Builder builder) {
                    xa xaVar = this.valueBuilder_;
                    if (xaVar == null) {
                        this.value_ = builder.build();
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
                    if (message instanceof EstimatedPrice) {
                        return mergeFrom((EstimatedPrice) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(EstimatedPrice estimatedPrice) {
                    if (estimatedPrice == EstimatedPrice.getDefaultInstance()) {
                        return this;
                    }
                    if (estimatedPrice.hasValue()) {
                        mergeValue(estimatedPrice.getValue());
                    }
                    if (estimatedPrice.hasPrecision()) {
                        mergePrecision(estimatedPrice.getPrecision());
                    }
                    if (estimatedPrice.hasCurrency()) {
                        mergeCurrency(estimatedPrice.getCurrency());
                    }
                    mergeUnknownFields(((k7) estimatedPrice).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public io.bidmachine.protobuf.Waterfall.Result.EstimatedPrice.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.Waterfall.Result.EstimatedPrice.access$4700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.Waterfall$Result$EstimatedPrice r3 = (io.bidmachine.protobuf.Waterfall.Result.EstimatedPrice) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.Waterfall$Result$EstimatedPrice r4 = (io.bidmachine.protobuf.Waterfall.Result.EstimatedPrice) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.Waterfall.Result.EstimatedPrice.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.Waterfall$Result$EstimatedPrice$Builder");
                }
            }

            public static Builder newBuilder(EstimatedPrice estimatedPrice) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(estimatedPrice);
            }

            public static EstimatedPrice parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (EstimatedPrice) PARSER.parseFrom(byteBuffer, m5Var);
            }

            private EstimatedPrice(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static EstimatedPrice parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (EstimatedPrice) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static EstimatedPrice parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (EstimatedPrice) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public EstimatedPrice getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static EstimatedPrice parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (EstimatedPrice) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private EstimatedPrice() {
                this.memoizedIsInitialized = (byte) -1;
            }

            public static EstimatedPrice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (EstimatedPrice) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static EstimatedPrice parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (EstimatedPrice) PARSER.parseFrom(bArr, m5Var);
            }

            private EstimatedPrice(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                        DoubleValue doubleValue = this.value_;
                                        DoubleValue.Builder builder = doubleValue != null ? doubleValue.toBuilder() : null;
                                        DoubleValue doubleValue2 = (DoubleValue) yVar.readMessage(DoubleValue.parser(), m5Var);
                                        this.value_ = doubleValue2;
                                        if (builder != null) {
                                            builder.mergeFrom(doubleValue2);
                                            this.value_ = builder.buildPartial();
                                        }
                                    } else if (tag == 18) {
                                        UInt32Value uInt32Value = this.precision_;
                                        UInt32Value.Builder builder2 = uInt32Value != null ? uInt32Value.toBuilder() : null;
                                        UInt32Value uInt32Value2 = (UInt32Value) yVar.readMessage(UInt32Value.parser(), m5Var);
                                        this.precision_ = uInt32Value2;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(uInt32Value2);
                                            this.precision_ = builder2.buildPartial();
                                        }
                                    } else if (tag != 26) {
                                        if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                        }
                                    } else {
                                        StringValue stringValue = this.currency_;
                                        StringValue.Builder builder3 = stringValue != null ? stringValue.toBuilder() : null;
                                        StringValue stringValue2 = (StringValue) yVar.readMessage(StringValue.parser(), m5Var);
                                        this.currency_ = stringValue2;
                                        if (builder3 != null) {
                                            builder3.mergeFrom(stringValue2);
                                            this.currency_ = builder3.buildPartial();
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

            public static EstimatedPrice parseFrom(InputStream inputStream) throws IOException {
                return (EstimatedPrice) k7.parseWithIOException(PARSER, inputStream);
            }

            public static EstimatedPrice parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (EstimatedPrice) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            public static EstimatedPrice parseFrom(y yVar) throws IOException {
                return (EstimatedPrice) k7.parseWithIOException(PARSER, yVar);
            }

            public static EstimatedPrice parseFrom(y yVar, m5 m5Var) throws IOException {
                return (EstimatedPrice) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface EstimatedPriceOrBuilder extends MessageOrBuilder {
            StringValue getCurrency();

            ib getCurrencyOrBuilder();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            UInt32Value getPrecision();

            yb getPrecisionOrBuilder();

            DoubleValue getValue();

            z4 getValueOrBuilder();

            boolean hasCurrency();

            boolean hasPrecision();

            boolean hasValue();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static Result getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Result parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Result) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Result parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Result) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return super.equals(obj);
            }
            Result result = (Result) obj;
            if (!getWaterfallId().equals(result.getWaterfallId()) || hasExt() != result.hasExt()) {
                return false;
            }
            if ((hasExt() && !getExt().equals(result.getExt())) || hasFormat() != result.hasFormat()) {
                return false;
            }
            if ((!hasFormat() || getFormat().equals(result.getFormat())) && getAdUnitResultsList().equals(result.getAdUnitResultsList()) && getCachedAdUnitsList().equals(result.getCachedAdUnitsList()) && hasServerParams() == result.hasServerParams()) {
                return (!hasServerParams() || getServerParams().equals(result.getServerParams())) && this.unknownFields.equals(result.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public AdUnit getAdUnitResults(int i10) {
            return this.adUnitResults_.get(i10);
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public int getAdUnitResultsCount() {
            return this.adUnitResults_.size();
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public List<AdUnit> getAdUnitResultsList() {
            return this.adUnitResults_;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public AdUnitOrBuilder getAdUnitResultsOrBuilder(int i10) {
            return this.adUnitResults_.get(i10);
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public List<? extends AdUnitOrBuilder> getAdUnitResultsOrBuilderList() {
            return this.adUnitResults_;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public CachedAdUnit getCachedAdUnits(int i10) {
            return this.cachedAdUnits_.get(i10);
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public int getCachedAdUnitsCount() {
            return this.cachedAdUnits_.size();
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public List<CachedAdUnit> getCachedAdUnitsList() {
            return this.cachedAdUnits_;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public CachedAdUnitOrBuilder getCachedAdUnitsOrBuilder(int i10) {
            return this.cachedAdUnits_.get(i10);
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public List<? extends CachedAdUnitOrBuilder> getCachedAdUnitsOrBuilderList() {
            return this.cachedAdUnits_;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public jb getExtOrBuilder() {
            return getExt();
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public StringValue getFormat() {
            StringValue stringValue = this.format_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public ib getFormatOrBuilder() {
            return getFormat();
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
            int iComputeStringSize = !getWaterfallIdBytes().isEmpty() ? k7.computeStringSize(1, this.waterfallId_) : 0;
            if (this.ext_ != null) {
                iComputeStringSize += h0.computeMessageSize(2, getExt());
            }
            if (this.format_ != null) {
                iComputeStringSize += h0.computeMessageSize(3, getFormat());
            }
            for (int i11 = 0; i11 < this.adUnitResults_.size(); i11++) {
                iComputeStringSize += h0.computeMessageSize(4, this.adUnitResults_.get(i11));
            }
            for (int i12 = 0; i12 < this.cachedAdUnits_.size(); i12++) {
                iComputeStringSize += h0.computeMessageSize(5, this.cachedAdUnits_.get(i12));
            }
            if (this.serverParams_ != null) {
                iComputeStringSize += h0.computeMessageSize(6, getServerParams());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public StringValue getServerParams() {
            StringValue stringValue = this.serverParams_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public ib getServerParamsOrBuilder() {
            return getServerParams();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
        public final gc getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public String getWaterfallId() {
            Object obj = this.waterfallId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.waterfallId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public ByteString getWaterfallIdBytes() {
            Object obj = this.waterfallId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.waterfallId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public boolean hasFormat() {
            return this.format_ != null;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public boolean hasServerParams() {
            return this.serverParams_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = getWaterfallId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
            if (hasExt()) {
                iHashCode = getExt().hashCode() + o2.B(iHashCode, 37, 2, 53);
            }
            if (hasFormat()) {
                iHashCode = getFormat().hashCode() + o2.B(iHashCode, 37, 3, 53);
            }
            if (getAdUnitResultsCount() > 0) {
                iHashCode = getAdUnitResultsList().hashCode() + o2.B(iHashCode, 37, 4, 53);
            }
            if (getCachedAdUnitsCount() > 0) {
                iHashCode = getCachedAdUnitsList().hashCode() + o2.B(iHashCode, 37, 5, 53);
            }
            if (hasServerParams()) {
                iHashCode = getServerParams().hashCode() + o2.B(iHashCode, 37, 6, 53);
            }
            int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_fieldAccessorTable.ensureFieldAccessorsInitialized(Result.class, Builder.class);
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
            return new Result();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            if (!getWaterfallIdBytes().isEmpty()) {
                k7.writeString(h0Var, 1, this.waterfallId_);
            }
            if (this.ext_ != null) {
                h0Var.writeMessage(2, getExt());
            }
            if (this.format_ != null) {
                h0Var.writeMessage(3, getFormat());
            }
            for (int i10 = 0; i10 < this.adUnitResults_.size(); i10++) {
                h0Var.writeMessage(4, this.adUnitResults_.get(i10));
            }
            for (int i11 = 0; i11 < this.cachedAdUnits_.size(); i11++) {
                h0Var.writeMessage(5, this.cachedAdUnits_.get(i11));
            }
            if (this.serverParams_ != null) {
                h0Var.writeMessage(6, getServerParams());
            }
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements ResultOrBuilder {
            private pa adUnitResultsBuilder_;
            private List<AdUnit> adUnitResults_;
            private int bitField0_;
            private pa cachedAdUnitsBuilder_;
            private List<CachedAdUnit> cachedAdUnits_;
            private xa extBuilder_;
            private Struct ext_;
            private xa formatBuilder_;
            private StringValue format_;
            private xa serverParamsBuilder_;
            private StringValue serverParams_;
            private Object waterfallId_;

            private Builder() {
                super(null);
                this.waterfallId_ = "";
                List list = Collections.EMPTY_LIST;
                this.adUnitResults_ = list;
                this.cachedAdUnits_ = list;
                maybeForceBuilderInitialization();
            }

            private void ensureAdUnitResultsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.adUnitResults_ = new ArrayList(this.adUnitResults_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureCachedAdUnitsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.cachedAdUnits_ = new ArrayList(this.cachedAdUnits_);
                    this.bitField0_ |= 2;
                }
            }

            private pa getAdUnitResultsFieldBuilder() {
                if (this.adUnitResultsBuilder_ == null) {
                    this.adUnitResultsBuilder_ = new pa(this.adUnitResults_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.adUnitResults_ = null;
                }
                return this.adUnitResultsBuilder_;
            }

            private pa getCachedAdUnitsFieldBuilder() {
                if (this.cachedAdUnitsBuilder_ == null) {
                    this.cachedAdUnitsBuilder_ = new pa(this.cachedAdUnits_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.cachedAdUnits_ = null;
                }
                return this.cachedAdUnitsBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_descriptor;
            }

            private xa getExtFieldBuilder() {
                if (this.extBuilder_ == null) {
                    this.extBuilder_ = new xa(getExt(), getParentForChildren(), isClean());
                    this.ext_ = null;
                }
                return this.extBuilder_;
            }

            private xa getFormatFieldBuilder() {
                if (this.formatBuilder_ == null) {
                    this.formatBuilder_ = new xa(getFormat(), getParentForChildren(), isClean());
                    this.format_ = null;
                }
                return this.formatBuilder_;
            }

            private xa getServerParamsFieldBuilder() {
                if (this.serverParamsBuilder_ == null) {
                    this.serverParamsBuilder_ = new xa(getServerParams(), getParentForChildren(), isClean());
                    this.serverParams_ = null;
                }
                return this.serverParamsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (k7.alwaysUseFieldBuilders) {
                    getAdUnitResultsFieldBuilder();
                    getCachedAdUnitsFieldBuilder();
                }
            }

            public Builder addAdUnitResults(AdUnit adUnit) {
                pa paVar = this.adUnitResultsBuilder_;
                if (paVar != null) {
                    paVar.addMessage(adUnit);
                    return this;
                }
                adUnit.getClass();
                ensureAdUnitResultsIsMutable();
                this.adUnitResults_.add(adUnit);
                onChanged();
                return this;
            }

            public AdUnit.Builder addAdUnitResultsBuilder() {
                return (AdUnit.Builder) getAdUnitResultsFieldBuilder().addBuilder(AdUnit.getDefaultInstance());
            }

            public Builder addAllAdUnitResults(Iterable<? extends AdUnit> iterable) {
                pa paVar = this.adUnitResultsBuilder_;
                if (paVar != null) {
                    paVar.addAllMessages(iterable);
                    return this;
                }
                ensureAdUnitResultsIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.adUnitResults_);
                onChanged();
                return this;
            }

            public Builder addAllCachedAdUnits(Iterable<? extends CachedAdUnit> iterable) {
                pa paVar = this.cachedAdUnitsBuilder_;
                if (paVar != null) {
                    paVar.addAllMessages(iterable);
                    return this;
                }
                ensureCachedAdUnitsIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.cachedAdUnits_);
                onChanged();
                return this;
            }

            public Builder addCachedAdUnits(CachedAdUnit cachedAdUnit) {
                pa paVar = this.cachedAdUnitsBuilder_;
                if (paVar != null) {
                    paVar.addMessage(cachedAdUnit);
                    return this;
                }
                cachedAdUnit.getClass();
                ensureCachedAdUnitsIsMutable();
                this.cachedAdUnits_.add(cachedAdUnit);
                onChanged();
                return this;
            }

            public CachedAdUnit.Builder addCachedAdUnitsBuilder() {
                return (CachedAdUnit.Builder) getCachedAdUnitsFieldBuilder().addBuilder(CachedAdUnit.getDefaultInstance());
            }

            public Builder clearAdUnitResults() {
                pa paVar = this.adUnitResultsBuilder_;
                if (paVar != null) {
                    paVar.clear();
                    return this;
                }
                this.adUnitResults_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearCachedAdUnits() {
                pa paVar = this.cachedAdUnitsBuilder_;
                if (paVar != null) {
                    paVar.clear();
                    return this;
                }
                this.cachedAdUnits_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearExt() {
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                    onChanged();
                    return this;
                }
                this.ext_ = null;
                this.extBuilder_ = null;
                return this;
            }

            public Builder clearFormat() {
                if (this.formatBuilder_ == null) {
                    this.format_ = null;
                    onChanged();
                    return this;
                }
                this.format_ = null;
                this.formatBuilder_ = null;
                return this;
            }

            public Builder clearServerParams() {
                if (this.serverParamsBuilder_ == null) {
                    this.serverParams_ = null;
                    onChanged();
                    return this;
                }
                this.serverParams_ = null;
                this.serverParamsBuilder_ = null;
                return this;
            }

            public Builder clearWaterfallId() {
                this.waterfallId_ = Result.getDefaultInstance().getWaterfallId();
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public AdUnit getAdUnitResults(int i10) {
                pa paVar = this.adUnitResultsBuilder_;
                return paVar == null ? this.adUnitResults_.get(i10) : (AdUnit) paVar.getMessage(i10);
            }

            public AdUnit.Builder getAdUnitResultsBuilder(int i10) {
                return (AdUnit.Builder) getAdUnitResultsFieldBuilder().getBuilder(i10);
            }

            public List<AdUnit.Builder> getAdUnitResultsBuilderList() {
                return getAdUnitResultsFieldBuilder().getBuilderList();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public int getAdUnitResultsCount() {
                pa paVar = this.adUnitResultsBuilder_;
                return paVar == null ? this.adUnitResults_.size() : paVar.getCount();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public List<AdUnit> getAdUnitResultsList() {
                pa paVar = this.adUnitResultsBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.adUnitResults_) : paVar.getMessageList();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public AdUnitOrBuilder getAdUnitResultsOrBuilder(int i10) {
                pa paVar = this.adUnitResultsBuilder_;
                return paVar == null ? this.adUnitResults_.get(i10) : (AdUnitOrBuilder) paVar.getMessageOrBuilder(i10);
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public List<? extends AdUnitOrBuilder> getAdUnitResultsOrBuilderList() {
                pa paVar = this.adUnitResultsBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.adUnitResults_);
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public CachedAdUnit getCachedAdUnits(int i10) {
                pa paVar = this.cachedAdUnitsBuilder_;
                return paVar == null ? this.cachedAdUnits_.get(i10) : (CachedAdUnit) paVar.getMessage(i10);
            }

            public CachedAdUnit.Builder getCachedAdUnitsBuilder(int i10) {
                return (CachedAdUnit.Builder) getCachedAdUnitsFieldBuilder().getBuilder(i10);
            }

            public List<CachedAdUnit.Builder> getCachedAdUnitsBuilderList() {
                return getCachedAdUnitsFieldBuilder().getBuilderList();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public int getCachedAdUnitsCount() {
                pa paVar = this.cachedAdUnitsBuilder_;
                return paVar == null ? this.cachedAdUnits_.size() : paVar.getCount();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public List<CachedAdUnit> getCachedAdUnitsList() {
                pa paVar = this.cachedAdUnitsBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.cachedAdUnits_) : paVar.getMessageList();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public CachedAdUnitOrBuilder getCachedAdUnitsOrBuilder(int i10) {
                pa paVar = this.cachedAdUnitsBuilder_;
                return paVar == null ? this.cachedAdUnits_.get(i10) : (CachedAdUnitOrBuilder) paVar.getMessageOrBuilder(i10);
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public List<? extends CachedAdUnitOrBuilder> getCachedAdUnitsOrBuilderList() {
                pa paVar = this.cachedAdUnitsBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.cachedAdUnits_);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_descriptor;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public Struct getExt() {
                xa xaVar = this.extBuilder_;
                if (xaVar != null) {
                    return (Struct) xaVar.getMessage();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            public Struct.Builder getExtBuilder() {
                onChanged();
                return (Struct.Builder) getExtFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public jb getExtOrBuilder() {
                xa xaVar = this.extBuilder_;
                if (xaVar != null) {
                    return (jb) xaVar.getMessageOrBuilder();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public StringValue getFormat() {
                xa xaVar = this.formatBuilder_;
                if (xaVar != null) {
                    return (StringValue) xaVar.getMessage();
                }
                StringValue stringValue = this.format_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            public StringValue.Builder getFormatBuilder() {
                onChanged();
                return (StringValue.Builder) getFormatFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public ib getFormatOrBuilder() {
                xa xaVar = this.formatBuilder_;
                if (xaVar != null) {
                    return (ib) xaVar.getMessageOrBuilder();
                }
                StringValue stringValue = this.format_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public StringValue getServerParams() {
                xa xaVar = this.serverParamsBuilder_;
                if (xaVar != null) {
                    return (StringValue) xaVar.getMessage();
                }
                StringValue stringValue = this.serverParams_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            public StringValue.Builder getServerParamsBuilder() {
                onChanged();
                return (StringValue.Builder) getServerParamsFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public ib getServerParamsOrBuilder() {
                xa xaVar = this.serverParamsBuilder_;
                if (xaVar != null) {
                    return (ib) xaVar.getMessageOrBuilder();
                }
                StringValue stringValue = this.serverParams_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public String getWaterfallId() {
                Object obj = this.waterfallId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.waterfallId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public ByteString getWaterfallIdBytes() {
                Object obj = this.waterfallId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.waterfallId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public boolean hasFormat() {
                return (this.formatBuilder_ == null && this.format_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public boolean hasServerParams() {
                return (this.serverParamsBuilder_ == null && this.serverParams_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_fieldAccessorTable.ensureFieldAccessorsInitialized(Result.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeExt(Struct struct) {
                xa xaVar = this.extBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(struct);
                    return this;
                }
                Struct struct2 = this.ext_;
                if (struct2 != null) {
                    this.ext_ = a.i(struct2, struct);
                } else {
                    this.ext_ = struct;
                }
                onChanged();
                return this;
            }

            public Builder mergeFormat(StringValue stringValue) {
                xa xaVar = this.formatBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(stringValue);
                    return this;
                }
                StringValue stringValue2 = this.format_;
                if (stringValue2 != null) {
                    this.format_ = g.h(stringValue2, stringValue);
                } else {
                    this.format_ = stringValue;
                }
                onChanged();
                return this;
            }

            public Builder mergeServerParams(StringValue stringValue) {
                xa xaVar = this.serverParamsBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(stringValue);
                    return this;
                }
                StringValue stringValue2 = this.serverParams_;
                if (stringValue2 != null) {
                    this.serverParams_ = g.h(stringValue2, stringValue);
                } else {
                    this.serverParams_ = stringValue;
                }
                onChanged();
                return this;
            }

            public Builder removeAdUnitResults(int i10) {
                pa paVar = this.adUnitResultsBuilder_;
                if (paVar != null) {
                    paVar.remove(i10);
                    return this;
                }
                ensureAdUnitResultsIsMutable();
                this.adUnitResults_.remove(i10);
                onChanged();
                return this;
            }

            public Builder removeCachedAdUnits(int i10) {
                pa paVar = this.cachedAdUnitsBuilder_;
                if (paVar != null) {
                    paVar.remove(i10);
                    return this;
                }
                ensureCachedAdUnitsIsMutable();
                this.cachedAdUnits_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setAdUnitResults(int i10, AdUnit adUnit) {
                pa paVar = this.adUnitResultsBuilder_;
                if (paVar != null) {
                    paVar.setMessage(i10, adUnit);
                    return this;
                }
                adUnit.getClass();
                ensureAdUnitResultsIsMutable();
                this.adUnitResults_.set(i10, adUnit);
                onChanged();
                return this;
            }

            public Builder setCachedAdUnits(int i10, CachedAdUnit cachedAdUnit) {
                pa paVar = this.cachedAdUnitsBuilder_;
                if (paVar != null) {
                    paVar.setMessage(i10, cachedAdUnit);
                    return this;
                }
                cachedAdUnit.getClass();
                ensureCachedAdUnitsIsMutable();
                this.cachedAdUnits_.set(i10, cachedAdUnit);
                onChanged();
                return this;
            }

            public Builder setExt(Struct struct) {
                xa xaVar = this.extBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(struct);
                    return this;
                }
                struct.getClass();
                this.ext_ = struct;
                onChanged();
                return this;
            }

            public Builder setFormat(StringValue stringValue) {
                xa xaVar = this.formatBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(stringValue);
                    return this;
                }
                stringValue.getClass();
                this.format_ = stringValue;
                onChanged();
                return this;
            }

            public Builder setServerParams(StringValue stringValue) {
                xa xaVar = this.serverParamsBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(stringValue);
                    return this;
                }
                stringValue.getClass();
                this.serverParams_ = stringValue;
                onChanged();
                return this;
            }

            public Builder setWaterfallId(String str) {
                str.getClass();
                this.waterfallId_ = str;
                onChanged();
                return this;
            }

            public Builder setWaterfallIdBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.waterfallId_ = byteString;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Result build() {
                Result resultBuildPartial = buildPartial();
                if (resultBuildPartial.isInitialized()) {
                    return resultBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) resultBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Result buildPartial() {
                Result result = new Result(this);
                result.waterfallId_ = this.waterfallId_;
                xa xaVar = this.extBuilder_;
                if (xaVar == null) {
                    result.ext_ = this.ext_;
                } else {
                    result.ext_ = (Struct) xaVar.build();
                }
                xa xaVar2 = this.formatBuilder_;
                if (xaVar2 == null) {
                    result.format_ = this.format_;
                } else {
                    result.format_ = (StringValue) xaVar2.build();
                }
                pa paVar = this.adUnitResultsBuilder_;
                if (paVar != null) {
                    result.adUnitResults_ = paVar.build();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.adUnitResults_ = Collections.unmodifiableList(this.adUnitResults_);
                        this.bitField0_ &= -2;
                    }
                    result.adUnitResults_ = this.adUnitResults_;
                }
                pa paVar2 = this.cachedAdUnitsBuilder_;
                if (paVar2 != null) {
                    result.cachedAdUnits_ = paVar2.build();
                } else {
                    if ((this.bitField0_ & 2) != 0) {
                        this.cachedAdUnits_ = Collections.unmodifiableList(this.cachedAdUnits_);
                        this.bitField0_ &= -3;
                    }
                    result.cachedAdUnits_ = this.cachedAdUnits_;
                }
                xa xaVar3 = this.serverParamsBuilder_;
                if (xaVar3 == null) {
                    result.serverParams_ = this.serverParams_;
                } else {
                    result.serverParams_ = (StringValue) xaVar3.build();
                }
                onBuilt();
                return result;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Result getDefaultInstanceForType() {
                return Result.getDefaultInstance();
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

            public AdUnit.Builder addAdUnitResultsBuilder(int i10) {
                return (AdUnit.Builder) getAdUnitResultsFieldBuilder().addBuilder(i10, AdUnit.getDefaultInstance());
            }

            public CachedAdUnit.Builder addCachedAdUnitsBuilder(int i10) {
                return (CachedAdUnit.Builder) getCachedAdUnitsFieldBuilder().addBuilder(i10, CachedAdUnit.getDefaultInstance());
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
                this.waterfallId_ = "";
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                if (this.formatBuilder_ == null) {
                    this.format_ = null;
                } else {
                    this.format_ = null;
                    this.formatBuilder_ = null;
                }
                pa paVar = this.adUnitResultsBuilder_;
                if (paVar == null) {
                    this.adUnitResults_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                } else {
                    paVar.clear();
                }
                pa paVar2 = this.cachedAdUnitsBuilder_;
                if (paVar2 == null) {
                    this.cachedAdUnits_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -3;
                } else {
                    paVar2.clear();
                }
                if (this.serverParamsBuilder_ == null) {
                    this.serverParams_ = null;
                    return this;
                }
                this.serverParams_ = null;
                this.serverParamsBuilder_ = null;
                return this;
            }

            public Builder setExt(Struct.Builder builder) {
                xa xaVar = this.extBuilder_;
                if (xaVar == null) {
                    this.ext_ = builder.build();
                    onChanged();
                    return this;
                }
                xaVar.setMessage(builder.build());
                return this;
            }

            public Builder setFormat(StringValue.Builder builder) {
                xa xaVar = this.formatBuilder_;
                if (xaVar == null) {
                    this.format_ = builder.build();
                    onChanged();
                    return this;
                }
                xaVar.setMessage(builder.build());
                return this;
            }

            public Builder setServerParams(StringValue.Builder builder) {
                xa xaVar = this.serverParamsBuilder_;
                if (xaVar == null) {
                    this.serverParams_ = builder.build();
                    onChanged();
                    return this;
                }
                xaVar.setMessage(builder.build());
                return this;
            }

            public Builder addAdUnitResults(int i10, AdUnit adUnit) {
                pa paVar = this.adUnitResultsBuilder_;
                if (paVar == null) {
                    adUnit.getClass();
                    ensureAdUnitResultsIsMutable();
                    this.adUnitResults_.add(i10, adUnit);
                    onChanged();
                    return this;
                }
                paVar.addMessage(i10, adUnit);
                return this;
            }

            public Builder addCachedAdUnits(int i10, CachedAdUnit cachedAdUnit) {
                pa paVar = this.cachedAdUnitsBuilder_;
                if (paVar == null) {
                    cachedAdUnit.getClass();
                    ensureCachedAdUnitsIsMutable();
                    this.cachedAdUnits_.add(i10, cachedAdUnit);
                    onChanged();
                    return this;
                }
                paVar.addMessage(i10, cachedAdUnit);
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
            /* renamed from: clone */
            public Builder mo500clone() {
                return (Builder) super.mo500clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Result) {
                    return mergeFrom((Result) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setAdUnitResults(int i10, AdUnit.Builder builder) {
                pa paVar = this.adUnitResultsBuilder_;
                if (paVar == null) {
                    ensureAdUnitResultsIsMutable();
                    this.adUnitResults_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                paVar.setMessage(i10, builder.build());
                return this;
            }

            public Builder setCachedAdUnits(int i10, CachedAdUnit.Builder builder) {
                pa paVar = this.cachedAdUnitsBuilder_;
                if (paVar == null) {
                    ensureCachedAdUnitsIsMutable();
                    this.cachedAdUnits_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                paVar.setMessage(i10, builder.build());
                return this;
            }

            private Builder(p6 p6Var) {
                super(p6Var);
                this.waterfallId_ = "";
                List list = Collections.EMPTY_LIST;
                this.adUnitResults_ = list;
                this.cachedAdUnits_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(Result result) {
                if (result == Result.getDefaultInstance()) {
                    return this;
                }
                if (!result.getWaterfallId().isEmpty()) {
                    this.waterfallId_ = result.waterfallId_;
                    onChanged();
                }
                if (result.hasExt()) {
                    mergeExt(result.getExt());
                }
                if (result.hasFormat()) {
                    mergeFormat(result.getFormat());
                }
                if (this.adUnitResultsBuilder_ == null) {
                    if (!result.adUnitResults_.isEmpty()) {
                        if (this.adUnitResults_.isEmpty()) {
                            this.adUnitResults_ = result.adUnitResults_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureAdUnitResultsIsMutable();
                            this.adUnitResults_.addAll(result.adUnitResults_);
                        }
                        onChanged();
                    }
                } else if (!result.adUnitResults_.isEmpty()) {
                    if (!this.adUnitResultsBuilder_.isEmpty()) {
                        this.adUnitResultsBuilder_.addAllMessages(result.adUnitResults_);
                    } else {
                        this.adUnitResultsBuilder_.dispose();
                        this.adUnitResultsBuilder_ = null;
                        this.adUnitResults_ = result.adUnitResults_;
                        this.bitField0_ &= -2;
                        this.adUnitResultsBuilder_ = k7.alwaysUseFieldBuilders ? getAdUnitResultsFieldBuilder() : null;
                    }
                }
                if (this.cachedAdUnitsBuilder_ == null) {
                    if (!result.cachedAdUnits_.isEmpty()) {
                        if (this.cachedAdUnits_.isEmpty()) {
                            this.cachedAdUnits_ = result.cachedAdUnits_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureCachedAdUnitsIsMutable();
                            this.cachedAdUnits_.addAll(result.cachedAdUnits_);
                        }
                        onChanged();
                    }
                } else if (!result.cachedAdUnits_.isEmpty()) {
                    if (!this.cachedAdUnitsBuilder_.isEmpty()) {
                        this.cachedAdUnitsBuilder_.addAllMessages(result.cachedAdUnits_);
                    } else {
                        this.cachedAdUnitsBuilder_.dispose();
                        this.cachedAdUnitsBuilder_ = null;
                        this.cachedAdUnits_ = result.cachedAdUnits_;
                        this.bitField0_ &= -3;
                        this.cachedAdUnitsBuilder_ = k7.alwaysUseFieldBuilders ? getCachedAdUnitsFieldBuilder() : null;
                    }
                }
                if (result.hasServerParams()) {
                    mergeServerParams(result.getServerParams());
                }
                mergeUnknownFields(((k7) result).unknownFields);
                onChanged();
                return this;
            }

            public Builder addAdUnitResults(AdUnit.Builder builder) {
                pa paVar = this.adUnitResultsBuilder_;
                if (paVar == null) {
                    ensureAdUnitResultsIsMutable();
                    this.adUnitResults_.add(builder.build());
                    onChanged();
                    return this;
                }
                paVar.addMessage(builder.build());
                return this;
            }

            public Builder addCachedAdUnits(CachedAdUnit.Builder builder) {
                pa paVar = this.cachedAdUnitsBuilder_;
                if (paVar == null) {
                    ensureCachedAdUnitsIsMutable();
                    this.cachedAdUnits_.add(builder.build());
                    onChanged();
                    return this;
                }
                paVar.addMessage(builder.build());
                return this;
            }

            public Builder addAdUnitResults(int i10, AdUnit.Builder builder) {
                pa paVar = this.adUnitResultsBuilder_;
                if (paVar == null) {
                    ensureAdUnitResultsIsMutable();
                    this.adUnitResults_.add(i10, builder.build());
                    onChanged();
                    return this;
                }
                paVar.addMessage(i10, builder.build());
                return this;
            }

            public Builder addCachedAdUnits(int i10, CachedAdUnit.Builder builder) {
                pa paVar = this.cachedAdUnitsBuilder_;
                if (paVar == null) {
                    ensureCachedAdUnitsIsMutable();
                    this.cachedAdUnits_.add(i10, builder.build());
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
            public io.bidmachine.protobuf.Waterfall.Result.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.Waterfall.Result.access$10100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.Waterfall$Result r3 = (io.bidmachine.protobuf.Waterfall.Result) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.Waterfall$Result r4 = (io.bidmachine.protobuf.Waterfall.Result) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.Waterfall.Result.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.Waterfall$Result$Builder");
            }
        }

        public static Builder newBuilder(Result result) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(result);
        }

        public static Result parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (Result) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private Result(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Result parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Result) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static Result parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Result) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Result getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Result parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (Result) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Result() {
            this.memoizedIsInitialized = (byte) -1;
            this.waterfallId_ = "";
            List list = Collections.EMPTY_LIST;
            this.adUnitResults_ = list;
            this.cachedAdUnits_ = list;
        }

        public static Result parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Result) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static Result parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (Result) PARSER.parseFrom(bArr, m5Var);
        }

        public static Result parseFrom(InputStream inputStream) throws IOException {
            return (Result) k7.parseWithIOException(PARSER, inputStream);
        }

        public static Result parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Result) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v6 */
        private Result(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                            if (tag != 10) {
                                if (tag == 18) {
                                    Struct struct = this.ext_;
                                    Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                    Struct struct2 = (Struct) yVar.readMessage(Struct.parser(), m5Var);
                                    this.ext_ = struct2;
                                    if (builder != null) {
                                        builder.mergeFrom(struct2);
                                        this.ext_ = builder.buildPartial();
                                    }
                                } else if (tag == 26) {
                                    StringValue stringValue = this.format_;
                                    StringValue.Builder builder2 = stringValue != null ? stringValue.toBuilder() : null;
                                    StringValue stringValue2 = (StringValue) yVar.readMessage(StringValue.parser(), m5Var);
                                    this.format_ = stringValue2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(stringValue2);
                                        this.format_ = builder2.buildPartial();
                                    }
                                } else if (tag == 34) {
                                    int i10 = (c10 == true ? 1 : 0) & 1;
                                    c10 = c10;
                                    if (i10 == 0) {
                                        this.adUnitResults_ = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 1;
                                    }
                                    this.adUnitResults_.add(yVar.readMessage(AdUnit.parser(), m5Var));
                                } else if (tag == 42) {
                                    int i11 = (c10 == true ? 1 : 0) & 2;
                                    c10 = c10;
                                    if (i11 == 0) {
                                        this.cachedAdUnits_ = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 2;
                                    }
                                    this.cachedAdUnits_.add(yVar.readMessage(CachedAdUnit.parser(), m5Var));
                                } else if (tag != 50) {
                                    if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                    }
                                } else {
                                    StringValue stringValue3 = this.serverParams_;
                                    StringValue.Builder builder3 = stringValue3 != null ? stringValue3.toBuilder() : null;
                                    StringValue stringValue4 = (StringValue) yVar.readMessage(StringValue.parser(), m5Var);
                                    this.serverParams_ = stringValue4;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(stringValue4);
                                        this.serverParams_ = builder3.buildPartial();
                                    }
                                }
                            } else {
                                this.waterfallId_ = yVar.readStringRequireUtf8();
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
                        this.adUnitResults_ = Collections.unmodifiableList(this.adUnitResults_);
                    }
                    if (((c10 == true ? 1 : 0) & 2) != 0) {
                        this.cachedAdUnits_ = Collections.unmodifiableList(this.cachedAdUnits_);
                    }
                    this.unknownFields = ccVarNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (((c10 == true ? 1 : 0) & 1) != 0) {
                this.adUnitResults_ = Collections.unmodifiableList(this.adUnitResults_);
            }
            if (((c10 == true ? 1 : 0) & 2) != 0) {
                this.cachedAdUnits_ = Collections.unmodifiableList(this.cachedAdUnits_);
            }
            this.unknownFields = ccVarNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static Result parseFrom(y yVar) throws IOException {
            return (Result) k7.parseWithIOException(PARSER, yVar);
        }

        public static Result parseFrom(y yVar, m5 m5Var) throws IOException {
            return (Result) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ResultOrBuilder extends MessageOrBuilder {
        Result.AdUnit getAdUnitResults(int i10);

        int getAdUnitResultsCount();

        List<Result.AdUnit> getAdUnitResultsList();

        Result.AdUnitOrBuilder getAdUnitResultsOrBuilder(int i10);

        List<? extends Result.AdUnitOrBuilder> getAdUnitResultsOrBuilderList();

        Result.CachedAdUnit getCachedAdUnits(int i10);

        int getCachedAdUnitsCount();

        List<Result.CachedAdUnit> getCachedAdUnitsList();

        Result.CachedAdUnitOrBuilder getCachedAdUnitsOrBuilder(int i10);

        List<? extends Result.CachedAdUnitOrBuilder> getCachedAdUnitsOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        Struct getExt();

        jb getExtOrBuilder();

        StringValue getFormat();

        ib getFormatOrBuilder();

        StringValue getServerParams();

        ib getServerParamsOrBuilder();

        String getWaterfallId();

        ByteString getWaterfallIdBytes();

        boolean hasExt();

        boolean hasFormat();

        boolean hasServerParams();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static Waterfall getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Waterfall parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Waterfall) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Waterfall parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Waterfall) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Waterfall)) {
            return super.equals(obj);
        }
        Waterfall waterfall = (Waterfall) obj;
        if (!getPayloadCase().equals(waterfall.getPayloadCase())) {
            return false;
        }
        int i10 = this.payloadCase_;
        if (i10 != 1) {
            if (i10 == 2 && !getResponse().equals(waterfall.getResponse())) {
                return false;
            }
        } else if (!getRequest().equals(waterfall.getRequest())) {
            return false;
        }
        return this.unknownFields.equals(waterfall.unknownFields);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.WaterfallOrBuilder
    public PayloadCase getPayloadCase() {
        return PayloadCase.forNumber(this.payloadCase_);
    }

    @Override // io.bidmachine.protobuf.WaterfallOrBuilder
    public Result getRequest() {
        return this.payloadCase_ == 1 ? (Result) this.payload_ : Result.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.WaterfallOrBuilder
    public ResultOrBuilder getRequestOrBuilder() {
        return this.payloadCase_ == 1 ? (Result) this.payload_ : Result.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.WaterfallOrBuilder
    public Configuration getResponse() {
        return this.payloadCase_ == 2 ? (Configuration) this.payload_ : Configuration.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.WaterfallOrBuilder
    public ConfigurationOrBuilder getResponseOrBuilder() {
        return this.payloadCase_ == 2 ? (Configuration) this.payload_ : Configuration.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeMessageSize = this.payloadCase_ == 1 ? h0.computeMessageSize(1, (Result) this.payload_) : 0;
        if (this.payloadCase_ == 2) {
            iComputeMessageSize += h0.computeMessageSize(2, (Configuration) this.payload_);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.WaterfallOrBuilder
    public boolean hasRequest() {
        return this.payloadCase_ == 1;
    }

    @Override // io.bidmachine.protobuf.WaterfallOrBuilder
    public boolean hasResponse() {
        return this.payloadCase_ == 2;
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
        int i11 = this.payloadCase_;
        if (i11 != 1) {
            if (i11 == 2) {
                iB = o2.B(iHashCode2, 37, 2, 53);
                iHashCode = getResponse().hashCode();
            }
            int iHashCode3 = this.unknownFields.hashCode() + (iHashCode2 * 29);
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }
        iB = o2.B(iHashCode2, 37, 1, 53);
        iHashCode = getRequest().hashCode();
        iHashCode2 = iB + iHashCode;
        int iHashCode32 = this.unknownFields.hashCode() + (iHashCode2 * 29);
        this.memoizedHashCode = iHashCode32;
        return iHashCode32;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_fieldAccessorTable.ensureFieldAccessorsInitialized(Waterfall.class, Builder.class);
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
        return new Waterfall();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (this.payloadCase_ == 1) {
            h0Var.writeMessage(1, (Result) this.payload_);
        }
        if (this.payloadCase_ == 2) {
            h0Var.writeMessage(2, (Configuration) this.payload_);
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements WaterfallOrBuilder {
        private int payloadCase_;
        private Object payload_;
        private xa requestBuilder_;
        private xa responseBuilder_;

        private Builder() {
            super(null);
            this.payloadCase_ = 0;
            maybeForceBuilderInitialization();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_descriptor;
        }

        private xa getRequestFieldBuilder() {
            if (this.requestBuilder_ == null) {
                if (this.payloadCase_ != 1) {
                    this.payload_ = Result.getDefaultInstance();
                }
                this.requestBuilder_ = new xa((Result) this.payload_, getParentForChildren(), isClean());
                this.payload_ = null;
            }
            this.payloadCase_ = 1;
            onChanged();
            return this.requestBuilder_;
        }

        private xa getResponseFieldBuilder() {
            if (this.responseBuilder_ == null) {
                if (this.payloadCase_ != 2) {
                    this.payload_ = Configuration.getDefaultInstance();
                }
                this.responseBuilder_ = new xa((Configuration) this.payload_, getParentForChildren(), isClean());
                this.payload_ = null;
            }
            this.payloadCase_ = 2;
            onChanged();
            return this.responseBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = k7.alwaysUseFieldBuilders;
        }

        public Builder clearPayload() {
            this.payloadCase_ = 0;
            this.payload_ = null;
            onChanged();
            return this;
        }

        public Builder clearRequest() {
            xa xaVar = this.requestBuilder_;
            if (xaVar == null) {
                if (this.payloadCase_ == 1) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }
            if (this.payloadCase_ == 1) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
            xaVar.clear();
            return this;
        }

        public Builder clearResponse() {
            xa xaVar = this.responseBuilder_;
            if (xaVar == null) {
                if (this.payloadCase_ == 2) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }
            if (this.payloadCase_ == 2) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
            xaVar.clear();
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_descriptor;
        }

        @Override // io.bidmachine.protobuf.WaterfallOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // io.bidmachine.protobuf.WaterfallOrBuilder
        public Result getRequest() {
            xa xaVar = this.requestBuilder_;
            return xaVar == null ? this.payloadCase_ == 1 ? (Result) this.payload_ : Result.getDefaultInstance() : this.payloadCase_ == 1 ? (Result) xaVar.getMessage() : Result.getDefaultInstance();
        }

        public Result.Builder getRequestBuilder() {
            return (Result.Builder) getRequestFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.WaterfallOrBuilder
        public ResultOrBuilder getRequestOrBuilder() {
            xa xaVar;
            int i10 = this.payloadCase_;
            return (i10 != 1 || (xaVar = this.requestBuilder_) == null) ? i10 == 1 ? (Result) this.payload_ : Result.getDefaultInstance() : (ResultOrBuilder) xaVar.getMessageOrBuilder();
        }

        @Override // io.bidmachine.protobuf.WaterfallOrBuilder
        public Configuration getResponse() {
            xa xaVar = this.responseBuilder_;
            return xaVar == null ? this.payloadCase_ == 2 ? (Configuration) this.payload_ : Configuration.getDefaultInstance() : this.payloadCase_ == 2 ? (Configuration) xaVar.getMessage() : Configuration.getDefaultInstance();
        }

        public Configuration.Builder getResponseBuilder() {
            return (Configuration.Builder) getResponseFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.WaterfallOrBuilder
        public ConfigurationOrBuilder getResponseOrBuilder() {
            xa xaVar;
            int i10 = this.payloadCase_;
            return (i10 != 2 || (xaVar = this.responseBuilder_) == null) ? i10 == 2 ? (Configuration) this.payload_ : Configuration.getDefaultInstance() : (ConfigurationOrBuilder) xaVar.getMessageOrBuilder();
        }

        @Override // io.bidmachine.protobuf.WaterfallOrBuilder
        public boolean hasRequest() {
            return this.payloadCase_ == 1;
        }

        @Override // io.bidmachine.protobuf.WaterfallOrBuilder
        public boolean hasResponse() {
            return this.payloadCase_ == 2;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_fieldAccessorTable.ensureFieldAccessorsInitialized(Waterfall.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeRequest(Result result) {
            xa xaVar = this.requestBuilder_;
            if (xaVar == null) {
                if (this.payloadCase_ != 1 || this.payload_ == Result.getDefaultInstance()) {
                    this.payload_ = result;
                } else {
                    this.payload_ = Result.newBuilder((Result) this.payload_).mergeFrom(result).buildPartial();
                }
                onChanged();
            } else {
                if (this.payloadCase_ == 1) {
                    xaVar.mergeFrom(result);
                }
                this.requestBuilder_.setMessage(result);
            }
            this.payloadCase_ = 1;
            return this;
        }

        public Builder mergeResponse(Configuration configuration) {
            xa xaVar = this.responseBuilder_;
            if (xaVar == null) {
                if (this.payloadCase_ != 2 || this.payload_ == Configuration.getDefaultInstance()) {
                    this.payload_ = configuration;
                } else {
                    this.payload_ = Configuration.newBuilder((Configuration) this.payload_).mergeFrom(configuration).buildPartial();
                }
                onChanged();
            } else {
                if (this.payloadCase_ == 2) {
                    xaVar.mergeFrom(configuration);
                }
                this.responseBuilder_.setMessage(configuration);
            }
            this.payloadCase_ = 2;
            return this;
        }

        public Builder setRequest(Result result) {
            xa xaVar = this.requestBuilder_;
            if (xaVar == null) {
                result.getClass();
                this.payload_ = result;
                onChanged();
            } else {
                xaVar.setMessage(result);
            }
            this.payloadCase_ = 1;
            return this;
        }

        public Builder setResponse(Configuration configuration) {
            xa xaVar = this.responseBuilder_;
            if (xaVar == null) {
                configuration.getClass();
                this.payload_ = configuration;
                onChanged();
            } else {
                xaVar.setMessage(configuration);
            }
            this.payloadCase_ = 2;
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Waterfall build() {
            Waterfall waterfallBuildPartial = buildPartial();
            if (waterfallBuildPartial.isInitialized()) {
                return waterfallBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) waterfallBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Waterfall buildPartial() {
            Waterfall waterfall = new Waterfall(this);
            if (this.payloadCase_ == 1) {
                xa xaVar = this.requestBuilder_;
                if (xaVar == null) {
                    waterfall.payload_ = this.payload_;
                } else {
                    waterfall.payload_ = xaVar.build();
                }
            }
            if (this.payloadCase_ == 2) {
                xa xaVar2 = this.responseBuilder_;
                if (xaVar2 == null) {
                    waterfall.payload_ = this.payload_;
                } else {
                    waterfall.payload_ = xaVar2.build();
                }
            }
            waterfall.payloadCase_ = this.payloadCase_;
            onBuilt();
            return waterfall;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Waterfall getDefaultInstanceForType() {
            return Waterfall.getDefaultInstance();
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
            this.payloadCase_ = 0;
            this.payload_ = null;
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            this.payloadCase_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
        /* renamed from: clone */
        public Builder mo500clone() {
            return (Builder) super.mo500clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Waterfall) {
                return mergeFrom((Waterfall) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setRequest(Result.Builder builder) {
            xa xaVar = this.requestBuilder_;
            if (xaVar == null) {
                this.payload_ = builder.build();
                onChanged();
            } else {
                xaVar.setMessage(builder.build());
            }
            this.payloadCase_ = 1;
            return this;
        }

        public Builder setResponse(Configuration.Builder builder) {
            xa xaVar = this.responseBuilder_;
            if (xaVar == null) {
                this.payload_ = builder.build();
                onChanged();
            } else {
                xaVar.setMessage(builder.build());
            }
            this.payloadCase_ = 2;
            return this;
        }

        public Builder mergeFrom(Waterfall waterfall) {
            if (waterfall == Waterfall.getDefaultInstance()) {
                return this;
            }
            int i10 = AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$Waterfall$PayloadCase[waterfall.getPayloadCase().ordinal()];
            if (i10 == 1) {
                mergeRequest(waterfall.getRequest());
            } else if (i10 == 2) {
                mergeResponse(waterfall.getResponse());
            }
            mergeUnknownFields(((k7) waterfall).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.bidmachine.protobuf.Waterfall.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.Waterfall.access$12100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.Waterfall r3 = (io.bidmachine.protobuf.Waterfall) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.Waterfall r4 = (io.bidmachine.protobuf.Waterfall) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.Waterfall.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.Waterfall$Builder");
        }
    }

    public static Builder newBuilder(Waterfall waterfall) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(waterfall);
    }

    public static Waterfall parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (Waterfall) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private Waterfall(o6 o6Var) {
        super(o6Var);
        this.payloadCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Waterfall parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Waterfall) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static Waterfall parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Waterfall) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Waterfall getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Waterfall parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (Waterfall) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Waterfall parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Waterfall) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    private Waterfall() {
        this.payloadCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Waterfall parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (Waterfall) PARSER.parseFrom(bArr, m5Var);
    }

    public static Waterfall parseFrom(InputStream inputStream) throws IOException {
        return (Waterfall) k7.parseWithIOException(PARSER, inputStream);
    }

    private Waterfall(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                            Result.Builder builder = this.payloadCase_ == 1 ? ((Result) this.payload_).toBuilder() : null;
                            MessageLite message = yVar.readMessage(Result.parser(), m5Var);
                            this.payload_ = message;
                            if (builder != null) {
                                builder.mergeFrom((Result) message);
                                this.payload_ = builder.buildPartial();
                            }
                            this.payloadCase_ = 1;
                        } else if (tag != 18) {
                            if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                            }
                        } else {
                            Configuration.Builder builder2 = this.payloadCase_ == 2 ? ((Configuration) this.payload_).toBuilder() : null;
                            MessageLite message2 = yVar.readMessage(Configuration.parser(), m5Var);
                            this.payload_ = message2;
                            if (builder2 != null) {
                                builder2.mergeFrom((Configuration) message2);
                                this.payload_ = builder2.buildPartial();
                            }
                            this.payloadCase_ = 2;
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

    public static Waterfall parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Waterfall) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static Waterfall parseFrom(y yVar) throws IOException {
        return (Waterfall) k7.parseWithIOException(PARSER, yVar);
    }

    public static Waterfall parseFrom(y yVar, m5 m5Var) throws IOException {
        return (Waterfall) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
