package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class OperativeEventRequestOuterClass {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class OperativeEventErrorData extends GeneratedMessageLite<OperativeEventErrorData, Builder> implements OperativeEventErrorDataOrBuilder {
        private static final OperativeEventErrorData DEFAULT_INSTANCE;
        public static final int ERROR_TYPE_FIELD_NUMBER = 1;
        public static final int MESSAGE_FIELD_NUMBER = 2;
        private static volatile Parser<OperativeEventErrorData> PARSER;
        private int errorType_;
        private String message_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<OperativeEventErrorData, Builder> implements OperativeEventErrorDataOrBuilder {
            public /* synthetic */ Builder(wl.a0 a0Var) {
                this();
            }

            public Builder clearErrorType() {
                copyOnWrite();
                ((OperativeEventErrorData) this.instance).clearErrorType();
                return this;
            }

            public Builder clearMessage() {
                copyOnWrite();
                ((OperativeEventErrorData) this.instance).clearMessage();
                return this;
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder
            public OperativeEventErrorType getErrorType() {
                return ((OperativeEventErrorData) this.instance).getErrorType();
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder
            public int getErrorTypeValue() {
                return ((OperativeEventErrorData) this.instance).getErrorTypeValue();
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder
            public String getMessage() {
                return ((OperativeEventErrorData) this.instance).getMessage();
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder
            public ByteString getMessageBytes() {
                return ((OperativeEventErrorData) this.instance).getMessageBytes();
            }

            public Builder setErrorType(OperativeEventErrorType operativeEventErrorType) {
                copyOnWrite();
                ((OperativeEventErrorData) this.instance).setErrorType(operativeEventErrorType);
                return this;
            }

            public Builder setErrorTypeValue(int i10) {
                copyOnWrite();
                ((OperativeEventErrorData) this.instance).setErrorTypeValue(i10);
                return this;
            }

            public Builder setMessage(String str) {
                copyOnWrite();
                ((OperativeEventErrorData) this.instance).setMessage(str);
                return this;
            }

            public Builder setMessageBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((OperativeEventErrorData) this.instance).setMessageBytes(byteString);
                return this;
            }

            private Builder() {
                super(OperativeEventErrorData.DEFAULT_INSTANCE);
            }
        }

        static {
            OperativeEventErrorData operativeEventErrorData = new OperativeEventErrorData();
            DEFAULT_INSTANCE = operativeEventErrorData;
            GeneratedMessageLite.registerDefaultInstance(OperativeEventErrorData.class, operativeEventErrorData);
        }

        private OperativeEventErrorData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorType() {
            this.errorType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessage() {
            this.message_ = getDefaultInstance().getMessage();
        }

        public static OperativeEventErrorData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static OperativeEventErrorData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperativeEventErrorData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperativeEventErrorData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OperativeEventErrorData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<OperativeEventErrorData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorType(OperativeEventErrorType operativeEventErrorType) {
            this.errorType_ = operativeEventErrorType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorTypeValue(int i10) {
            this.errorType_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessage(String str) {
            str.getClass();
            this.message_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessageBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.message_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            wl.a0 a0Var = null;
            switch (wl.a0.f90697a[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperativeEventErrorData();
                case 2:
                    return new Builder(a0Var);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"errorType_", "message_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<OperativeEventErrorData> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (OperativeEventErrorData.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder
        public OperativeEventErrorType getErrorType() {
            OperativeEventErrorType operativeEventErrorTypeForNumber = OperativeEventErrorType.forNumber(this.errorType_);
            return operativeEventErrorTypeForNumber == null ? OperativeEventErrorType.UNRECOGNIZED : operativeEventErrorTypeForNumber;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder
        public int getErrorTypeValue() {
            return this.errorType_;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder
        public String getMessage() {
            return this.message_;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorDataOrBuilder
        public ByteString getMessageBytes() {
            return ByteString.copyFromUtf8(this.message_);
        }

        public static Builder newBuilder(OperativeEventErrorData operativeEventErrorData) {
            return DEFAULT_INSTANCE.createBuilder(operativeEventErrorData);
        }

        public static OperativeEventErrorData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OperativeEventErrorData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OperativeEventErrorData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OperativeEventErrorData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static OperativeEventErrorData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperativeEventErrorData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OperativeEventErrorData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OperativeEventErrorData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OperativeEventErrorData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperativeEventErrorData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperativeEventErrorData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OperativeEventErrorData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static OperativeEventErrorData parseFrom(InputStream inputStream) throws IOException {
            return (OperativeEventErrorData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperativeEventErrorData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OperativeEventErrorData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OperativeEventErrorData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (OperativeEventErrorData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OperativeEventErrorData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OperativeEventErrorData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface OperativeEventErrorDataOrBuilder extends MessageLiteOrBuilder {
        OperativeEventErrorType getErrorType();

        int getErrorTypeValue();

        String getMessage();

        ByteString getMessageBytes();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum OperativeEventErrorType implements Internal.EnumLite {
        OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED(0),
        OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT(1),
        OPERATIVE_EVENT_ERROR_TYPE_GATEWAY(2),
        OPERATIVE_EVENT_ERROR_TYPE_EXPIRED(3),
        OPERATIVE_EVENT_ERROR_TYPE_ALREADY_SHOWING(4),
        OPERATIVE_EVENT_ERROR_TYPE_INVALID_AD_MARKUP(5),
        OPERATIVE_EVENT_ERROR_TYPE_DOWNLOAD_FAILED(6),
        OPERATIVE_EVENT_ERROR_TYPE_AD_VIEWER(7),
        UNRECOGNIZED(-1);

        public static final int OPERATIVE_EVENT_ERROR_TYPE_AD_VIEWER_VALUE = 7;
        public static final int OPERATIVE_EVENT_ERROR_TYPE_ALREADY_SHOWING_VALUE = 4;
        public static final int OPERATIVE_EVENT_ERROR_TYPE_DOWNLOAD_FAILED_VALUE = 6;
        public static final int OPERATIVE_EVENT_ERROR_TYPE_EXPIRED_VALUE = 3;
        public static final int OPERATIVE_EVENT_ERROR_TYPE_GATEWAY_VALUE = 2;
        public static final int OPERATIVE_EVENT_ERROR_TYPE_INVALID_AD_MARKUP_VALUE = 5;
        public static final int OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT_VALUE = 1;
        public static final int OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<OperativeEventErrorType> internalValueMap = new j0();
        private final int value;

        OperativeEventErrorType(int i10) {
            this.value = i10;
        }

        public static OperativeEventErrorType forNumber(int i10) {
            switch (i10) {
                case 0:
                    return OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED;
                case 1:
                    return OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT;
                case 2:
                    return OPERATIVE_EVENT_ERROR_TYPE_GATEWAY;
                case 3:
                    return OPERATIVE_EVENT_ERROR_TYPE_EXPIRED;
                case 4:
                    return OPERATIVE_EVENT_ERROR_TYPE_ALREADY_SHOWING;
                case 5:
                    return OPERATIVE_EVENT_ERROR_TYPE_INVALID_AD_MARKUP;
                case 6:
                    return OPERATIVE_EVENT_ERROR_TYPE_DOWNLOAD_FAILED;
                case 7:
                    return OPERATIVE_EVENT_ERROR_TYPE_AD_VIEWER;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<OperativeEventErrorType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return k0.f57495a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static OperativeEventErrorType valueOf(int i10) {
            return forNumber(i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class OperativeEventRequest extends GeneratedMessageLite<OperativeEventRequest, Builder> implements OperativeEventRequestOrBuilder {
        public static final int ADDITIONAL_DATA_FIELD_NUMBER = 5;
        public static final int AD_FORMAT_FIELD_NUMBER = 11;
        public static final int CAMPAIGN_STATE_FIELD_NUMBER = 10;
        private static final OperativeEventRequest DEFAULT_INSTANCE;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 9;
        public static final int EVENT_ID_FIELD_NUMBER = 1;
        public static final int EVENT_TYPE_FIELD_NUMBER = 2;
        public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 3;
        private static volatile Parser<OperativeEventRequest> PARSER = null;
        public static final int SESSION_COUNTERS_FIELD_NUMBER = 7;
        public static final int SID_FIELD_NUMBER = 6;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 8;
        public static final int TRACKING_TOKEN_FIELD_NUMBER = 4;
        private int adFormat_;
        private ByteString additionalData_;
        private int bitField0_;
        private CampaignStateOuterClass.CampaignState campaignState_;
        private DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo_;
        private ByteString eventId_;
        private int eventType_;
        private ByteString impressionOpportunityId_;
        private SessionCountersOuterClass.SessionCounters sessionCounters_;
        private String sid_;
        private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_;
        private ByteString trackingToken_;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<OperativeEventRequest, Builder> implements OperativeEventRequestOrBuilder {
            public /* synthetic */ Builder(wl.a0 a0Var) {
                this();
            }

            public Builder clearAdFormat() {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).clearAdFormat();
                return this;
            }

            public Builder clearAdditionalData() {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).clearAdditionalData();
                return this;
            }

            public Builder clearCampaignState() {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).clearCampaignState();
                return this;
            }

            public Builder clearDynamicDeviceInfo() {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).clearDynamicDeviceInfo();
                return this;
            }

            public Builder clearEventId() {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).clearEventId();
                return this;
            }

            public Builder clearEventType() {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).clearEventType();
                return this;
            }

            public Builder clearImpressionOpportunityId() {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).clearImpressionOpportunityId();
                return this;
            }

            public Builder clearSessionCounters() {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).clearSessionCounters();
                return this;
            }

            public Builder clearSid() {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).clearSid();
                return this;
            }

            public Builder clearStaticDeviceInfo() {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).clearStaticDeviceInfo();
                return this;
            }

            public Builder clearTrackingToken() {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).clearTrackingToken();
                return this;
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public AdFormatOuterClass.AdFormat getAdFormat() {
                return ((OperativeEventRequest) this.instance).getAdFormat();
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public int getAdFormatValue() {
                return ((OperativeEventRequest) this.instance).getAdFormatValue();
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public ByteString getAdditionalData() {
                return ((OperativeEventRequest) this.instance).getAdditionalData();
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public CampaignStateOuterClass.CampaignState getCampaignState() {
                return ((OperativeEventRequest) this.instance).getCampaignState();
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((OperativeEventRequest) this.instance).getDynamicDeviceInfo();
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public ByteString getEventId() {
                return ((OperativeEventRequest) this.instance).getEventId();
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public OperativeEventType getEventType() {
                return ((OperativeEventRequest) this.instance).getEventType();
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public int getEventTypeValue() {
                return ((OperativeEventRequest) this.instance).getEventTypeValue();
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public ByteString getImpressionOpportunityId() {
                return ((OperativeEventRequest) this.instance).getImpressionOpportunityId();
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public SessionCountersOuterClass.SessionCounters getSessionCounters() {
                return ((OperativeEventRequest) this.instance).getSessionCounters();
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public String getSid() {
                return ((OperativeEventRequest) this.instance).getSid();
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public ByteString getSidBytes() {
                return ((OperativeEventRequest) this.instance).getSidBytes();
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
                return ((OperativeEventRequest) this.instance).getStaticDeviceInfo();
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public ByteString getTrackingToken() {
                return ((OperativeEventRequest) this.instance).getTrackingToken();
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public boolean hasAdFormat() {
                return ((OperativeEventRequest) this.instance).hasAdFormat();
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public boolean hasCampaignState() {
                return ((OperativeEventRequest) this.instance).hasCampaignState();
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public boolean hasDynamicDeviceInfo() {
                return ((OperativeEventRequest) this.instance).hasDynamicDeviceInfo();
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public boolean hasSessionCounters() {
                return ((OperativeEventRequest) this.instance).hasSessionCounters();
            }

            @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
            public boolean hasStaticDeviceInfo() {
                return ((OperativeEventRequest) this.instance).hasStaticDeviceInfo();
            }

            public Builder mergeCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).mergeCampaignState(campaignState);
                return this;
            }

            public Builder mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).mergeDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public Builder mergeSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).mergeSessionCounters(sessionCounters);
                return this;
            }

            public Builder mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).mergeStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public Builder setAdFormat(AdFormatOuterClass.AdFormat adFormat) {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).setAdFormat(adFormat);
                return this;
            }

            public Builder setAdFormatValue(int i10) {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).setAdFormatValue(i10);
                return this;
            }

            public Builder setAdditionalData(ByteString byteString) {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).setAdditionalData(byteString);
                return this;
            }

            public Builder setCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).setCampaignState(campaignState);
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).setDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public Builder setEventId(ByteString byteString) {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).setEventId(byteString);
                return this;
            }

            public Builder setEventType(OperativeEventType operativeEventType) {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).setEventType(operativeEventType);
                return this;
            }

            public Builder setEventTypeValue(int i10) {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).setEventTypeValue(i10);
                return this;
            }

            public Builder setImpressionOpportunityId(ByteString byteString) {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).setImpressionOpportunityId(byteString);
                return this;
            }

            public Builder setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).setSessionCounters(sessionCounters);
                return this;
            }

            public Builder setSid(String str) {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).setSid(str);
                return this;
            }

            public Builder setSidBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).setSidBytes(byteString);
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).setStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public Builder setTrackingToken(ByteString byteString) {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).setTrackingToken(byteString);
                return this;
            }

            private Builder() {
                super(OperativeEventRequest.DEFAULT_INSTANCE);
            }

            public Builder setCampaignState(CampaignStateOuterClass.CampaignState.Builder builder) {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).setCampaignState(builder.build());
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).setDynamicDeviceInfo(builder.build());
                return this;
            }

            public Builder setSessionCounters(SessionCountersOuterClass.SessionCounters.Builder builder) {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).setSessionCounters(builder.build());
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                copyOnWrite();
                ((OperativeEventRequest) this.instance).setStaticDeviceInfo(builder.build());
                return this;
            }
        }

        static {
            OperativeEventRequest operativeEventRequest = new OperativeEventRequest();
            DEFAULT_INSTANCE = operativeEventRequest;
            GeneratedMessageLite.registerDefaultInstance(OperativeEventRequest.class, operativeEventRequest);
        }

        private OperativeEventRequest() {
            ByteString byteString = ByteString.EMPTY;
            this.eventId_ = byteString;
            this.impressionOpportunityId_ = byteString;
            this.trackingToken_ = byteString;
            this.additionalData_ = byteString;
            this.sid_ = "";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdFormat() {
            this.bitField0_ &= -17;
            this.adFormat_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdditionalData() {
            this.additionalData_ = getDefaultInstance().getAdditionalData();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCampaignState() {
            this.campaignState_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDynamicDeviceInfo() {
            this.dynamicDeviceInfo_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventId() {
            this.eventId_ = getDefaultInstance().getEventId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventType() {
            this.eventType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImpressionOpportunityId() {
            this.impressionOpportunityId_ = getDefaultInstance().getImpressionOpportunityId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionCounters() {
            this.sessionCounters_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSid() {
            this.sid_ = getDefaultInstance().getSid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStaticDeviceInfo() {
            this.staticDeviceInfo_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrackingToken() {
            this.trackingToken_ = getDefaultInstance().getTrackingToken();
        }

        public static OperativeEventRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
            campaignState.getClass();
            CampaignStateOuterClass.CampaignState campaignState2 = this.campaignState_;
            if (campaignState2 == null || campaignState2 == CampaignStateOuterClass.CampaignState.getDefaultInstance()) {
                this.campaignState_ = campaignState;
            } else {
                this.campaignState_ = CampaignStateOuterClass.CampaignState.newBuilder(this.campaignState_).mergeFrom((CampaignStateOuterClass.CampaignState.Builder) campaignState).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo2 = this.dynamicDeviceInfo_;
            if (dynamicDeviceInfo2 == null || dynamicDeviceInfo2 == DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance()) {
                this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            } else {
                this.dynamicDeviceInfo_ = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder(this.dynamicDeviceInfo_).mergeFrom((DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder) dynamicDeviceInfo).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
            sessionCounters.getClass();
            SessionCountersOuterClass.SessionCounters sessionCounters2 = this.sessionCounters_;
            if (sessionCounters2 == null || sessionCounters2 == SessionCountersOuterClass.SessionCounters.getDefaultInstance()) {
                this.sessionCounters_ = sessionCounters;
            } else {
                this.sessionCounters_ = SessionCountersOuterClass.SessionCounters.newBuilder(this.sessionCounters_).mergeFrom((SessionCountersOuterClass.SessionCounters.Builder) sessionCounters).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo2 = this.staticDeviceInfo_;
            if (staticDeviceInfo2 == null || staticDeviceInfo2 == StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance()) {
                this.staticDeviceInfo_ = staticDeviceInfo;
            } else {
                this.staticDeviceInfo_ = StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder(this.staticDeviceInfo_).mergeFrom((StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder) staticDeviceInfo).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static OperativeEventRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperativeEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperativeEventRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OperativeEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<OperativeEventRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormat(AdFormatOuterClass.AdFormat adFormat) {
            this.adFormat_ = adFormat.getNumber();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormatValue(int i10) {
            this.bitField0_ |= 16;
            this.adFormat_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdditionalData(ByteString byteString) {
            byteString.getClass();
            this.additionalData_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
            campaignState.getClass();
            this.campaignState_ = campaignState;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventId(ByteString byteString) {
            byteString.getClass();
            this.eventId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventType(OperativeEventType operativeEventType) {
            this.eventType_ = operativeEventType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventTypeValue(int i10) {
            this.eventType_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImpressionOpportunityId(ByteString byteString) {
            byteString.getClass();
            this.impressionOpportunityId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
            sessionCounters.getClass();
            this.sessionCounters_ = sessionCounters;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSid(String str) {
            str.getClass();
            this.sid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSidBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.sid_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            this.staticDeviceInfo_ = staticDeviceInfo;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrackingToken(ByteString byteString) {
            byteString.getClass();
            this.trackingToken_ = byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            wl.a0 a0Var = null;
            switch (wl.a0.f90697a[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperativeEventRequest();
                case 2:
                    return new Builder(a0Var);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\n\u0002\f\u0003\n\u0004\n\u0005\n\u0006Ȉ\u0007ဉ\u0000\bဉ\u0001\tဉ\u0002\nဉ\u0003\u000bဌ\u0004", new Object[]{"bitField0_", "eventId_", "eventType_", "impressionOpportunityId_", "trackingToken_", "additionalData_", "sid_", "sessionCounters_", "staticDeviceInfo_", "dynamicDeviceInfo_", "campaignState_", "adFormat_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<OperativeEventRequest> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (OperativeEventRequest.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat adFormatForNumber = AdFormatOuterClass.AdFormat.forNumber(this.adFormat_);
            return adFormatForNumber == null ? AdFormatOuterClass.AdFormat.UNRECOGNIZED : adFormatForNumber;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public int getAdFormatValue() {
            return this.adFormat_;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public ByteString getAdditionalData() {
            return this.additionalData_;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public CampaignStateOuterClass.CampaignState getCampaignState() {
            CampaignStateOuterClass.CampaignState campaignState = this.campaignState_;
            return campaignState == null ? CampaignStateOuterClass.CampaignState.getDefaultInstance() : campaignState;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.dynamicDeviceInfo_;
            return dynamicDeviceInfo == null ? DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance() : dynamicDeviceInfo;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public ByteString getEventId() {
            return this.eventId_;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public OperativeEventType getEventType() {
            OperativeEventType operativeEventTypeForNumber = OperativeEventType.forNumber(this.eventType_);
            return operativeEventTypeForNumber == null ? OperativeEventType.UNRECOGNIZED : operativeEventTypeForNumber;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public int getEventTypeValue() {
            return this.eventType_;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public ByteString getImpressionOpportunityId() {
            return this.impressionOpportunityId_;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this.sessionCounters_;
            return sessionCounters == null ? SessionCountersOuterClass.SessionCounters.getDefaultInstance() : sessionCounters;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public String getSid() {
            return this.sid_;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public ByteString getSidBytes() {
            return ByteString.copyFromUtf8(this.sid_);
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this.staticDeviceInfo_;
            return staticDeviceInfo == null ? StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance() : staticDeviceInfo;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public ByteString getTrackingToken() {
            return this.trackingToken_;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public boolean hasAdFormat() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public boolean hasCampaignState() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public boolean hasDynamicDeviceInfo() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public boolean hasSessionCounters() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder
        public boolean hasStaticDeviceInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(OperativeEventRequest operativeEventRequest) {
            return DEFAULT_INSTANCE.createBuilder(operativeEventRequest);
        }

        public static OperativeEventRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OperativeEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OperativeEventRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OperativeEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static OperativeEventRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperativeEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OperativeEventRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OperativeEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OperativeEventRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperativeEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperativeEventRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OperativeEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static OperativeEventRequest parseFrom(InputStream inputStream) throws IOException {
            return (OperativeEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperativeEventRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OperativeEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OperativeEventRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (OperativeEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OperativeEventRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OperativeEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface OperativeEventRequestOrBuilder extends MessageLiteOrBuilder {
        AdFormatOuterClass.AdFormat getAdFormat();

        int getAdFormatValue();

        ByteString getAdditionalData();

        CampaignStateOuterClass.CampaignState getCampaignState();

        DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

        ByteString getEventId();

        OperativeEventType getEventType();

        int getEventTypeValue();

        ByteString getImpressionOpportunityId();

        SessionCountersOuterClass.SessionCounters getSessionCounters();

        String getSid();

        ByteString getSidBytes();

        StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo();

        ByteString getTrackingToken();

        boolean hasAdFormat();

        boolean hasCampaignState();

        boolean hasDynamicDeviceInfo();

        boolean hasSessionCounters();

        boolean hasStaticDeviceInfo();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum OperativeEventType implements Internal.EnumLite {
        OPERATIVE_EVENT_TYPE_UNSPECIFIED(0),
        OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER(1),
        OPERATIVE_EVENT_TYPE_LOAD_ERROR(2),
        OPERATIVE_EVENT_TYPE_SHOW_ERROR(3),
        UNRECOGNIZED(-1);

        public static final int OPERATIVE_EVENT_TYPE_LOAD_ERROR_VALUE = 2;
        public static final int OPERATIVE_EVENT_TYPE_SHOW_ERROR_VALUE = 3;
        public static final int OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER_VALUE = 1;
        public static final int OPERATIVE_EVENT_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<OperativeEventType> internalValueMap = new l0();
        private final int value;

        OperativeEventType(int i10) {
            this.value = i10;
        }

        public static OperativeEventType forNumber(int i10) {
            if (i10 == 0) {
                return OPERATIVE_EVENT_TYPE_UNSPECIFIED;
            }
            if (i10 == 1) {
                return OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER;
            }
            if (i10 == 2) {
                return OPERATIVE_EVENT_TYPE_LOAD_ERROR;
            }
            if (i10 != 3) {
                return null;
            }
            return OPERATIVE_EVENT_TYPE_SHOW_ERROR;
        }

        public static Internal.EnumLiteMap<OperativeEventType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return m0.f57497a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static OperativeEventType valueOf(int i10) {
            return forNumber(i10);
        }
    }

    private OperativeEventRequestOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
