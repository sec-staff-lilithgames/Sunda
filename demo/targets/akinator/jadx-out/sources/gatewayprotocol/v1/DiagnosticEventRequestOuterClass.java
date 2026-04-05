package gatewayprotocol.v1;

import androidx.core.app.NotificationCompat;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class DiagnosticEventRequestOuterClass {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum DiagnosticAdType implements Internal.EnumLite {
        DIAGNOSTIC_AD_TYPE_UNSPECIFIED(0),
        DIAGNOSTIC_AD_TYPE_FULLSCREEN(1),
        DIAGNOSTIC_AD_TYPE_BANNER(2),
        UNRECOGNIZED(-1);

        public static final int DIAGNOSTIC_AD_TYPE_BANNER_VALUE = 2;
        public static final int DIAGNOSTIC_AD_TYPE_FULLSCREEN_VALUE = 1;
        public static final int DIAGNOSTIC_AD_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<DiagnosticAdType> internalValueMap = new o();
        private final int value;

        DiagnosticAdType(int i10) {
            this.value = i10;
        }

        public static DiagnosticAdType forNumber(int i10) {
            if (i10 == 0) {
                return DIAGNOSTIC_AD_TYPE_UNSPECIFIED;
            }
            if (i10 == 1) {
                return DIAGNOSTIC_AD_TYPE_FULLSCREEN;
            }
            if (i10 != 2) {
                return null;
            }
            return DIAGNOSTIC_AD_TYPE_BANNER;
        }

        public static Internal.EnumLiteMap<DiagnosticAdType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return p.f57500a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static DiagnosticAdType valueOf(int i10) {
            return forNumber(i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DiagnosticEvent extends GeneratedMessageLite<DiagnosticEvent, Builder> implements DiagnosticEventOrBuilder {
        public static final int AD_FORMAT_FIELD_NUMBER = 13;
        public static final int AD_TYPE_FIELD_NUMBER = 10;
        public static final int CUSTOM_EVENT_TYPE_FIELD_NUMBER = 2;
        private static final DiagnosticEvent DEFAULT_INSTANCE;
        public static final int EVENT_ID_FIELD_NUMBER = 7;
        public static final int EVENT_TYPE_FIELD_NUMBER = 1;
        public static final int HEADER_BIDDING_TOKEN_NUMBER_FIELD_NUMBER = 12;
        public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 8;
        public static final int INT_TAGS_FIELD_NUMBER = 6;
        public static final int IS_HEADER_BIDDING_FIELD_NUMBER = 11;
        private static volatile Parser<DiagnosticEvent> PARSER = null;
        public static final int PLACEMENT_ID_FIELD_NUMBER = 9;
        public static final int REASON_DEBUG_FIELD_NUMBER = 15;
        public static final int REASON_FIELD_NUMBER = 14;
        public static final int STRING_TAGS_FIELD_NUMBER = 5;
        public static final int TIMESTAMPS_FIELD_NUMBER = 3;
        public static final int TIME_VALUE_FIELD_NUMBER = 4;
        private int adFormat_;
        private int adType_;
        private int bitField0_;
        private int eventId_;
        private int eventType_;
        private int headerBiddingTokenNumber_;
        private boolean isHeaderBidding_;
        private double timeValue_;
        private TimestampsOuterClass.Timestamps timestamps_;
        private MapFieldLite<String, String> stringTags_ = MapFieldLite.emptyMapField();
        private MapFieldLite<String, Integer> intTags_ = MapFieldLite.emptyMapField();
        private String customEventType_ = "";
        private ByteString impressionOpportunityId_ = ByteString.EMPTY;
        private String placementId_ = "";
        private String reason_ = "";
        private String reasonDebug_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<DiagnosticEvent, Builder> implements DiagnosticEventOrBuilder {
            public /* synthetic */ Builder(wl.m mVar) {
                this();
            }

            public Builder clearAdFormat() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearAdFormat();
                return this;
            }

            public Builder clearAdType() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearAdType();
                return this;
            }

            public Builder clearCustomEventType() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearCustomEventType();
                return this;
            }

            public Builder clearEventId() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearEventId();
                return this;
            }

            public Builder clearEventType() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearEventType();
                return this;
            }

            public Builder clearHeaderBiddingTokenNumber() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearHeaderBiddingTokenNumber();
                return this;
            }

            public Builder clearImpressionOpportunityId() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearImpressionOpportunityId();
                return this;
            }

            public Builder clearIntTags() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).getMutableIntTagsMap().clear();
                return this;
            }

            public Builder clearIsHeaderBidding() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearIsHeaderBidding();
                return this;
            }

            public Builder clearPlacementId() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearPlacementId();
                return this;
            }

            public Builder clearReason() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearReason();
                return this;
            }

            public Builder clearReasonDebug() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearReasonDebug();
                return this;
            }

            public Builder clearStringTags() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).getMutableStringTagsMap().clear();
                return this;
            }

            public Builder clearTimeValue() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearTimeValue();
                return this;
            }

            public Builder clearTimestamps() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearTimestamps();
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean containsIntTags(String str) {
                str.getClass();
                return ((DiagnosticEvent) this.instance).getIntTagsMap().containsKey(str);
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean containsStringTags(String str) {
                str.getClass();
                return ((DiagnosticEvent) this.instance).getStringTagsMap().containsKey(str);
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public AdFormatOuterClass.AdFormat getAdFormat() {
                return ((DiagnosticEvent) this.instance).getAdFormat();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getAdFormatValue() {
                return ((DiagnosticEvent) this.instance).getAdFormatValue();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public DiagnosticAdType getAdType() {
                return ((DiagnosticEvent) this.instance).getAdType();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getAdTypeValue() {
                return ((DiagnosticEvent) this.instance).getAdTypeValue();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public String getCustomEventType() {
                return ((DiagnosticEvent) this.instance).getCustomEventType();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public ByteString getCustomEventTypeBytes() {
                return ((DiagnosticEvent) this.instance).getCustomEventTypeBytes();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getEventId() {
                return ((DiagnosticEvent) this.instance).getEventId();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public DiagnosticEventType getEventType() {
                return ((DiagnosticEvent) this.instance).getEventType();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getEventTypeValue() {
                return ((DiagnosticEvent) this.instance).getEventTypeValue();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getHeaderBiddingTokenNumber() {
                return ((DiagnosticEvent) this.instance).getHeaderBiddingTokenNumber();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public ByteString getImpressionOpportunityId() {
                return ((DiagnosticEvent) this.instance).getImpressionOpportunityId();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            @Deprecated
            public Map<String, Integer> getIntTags() {
                return getIntTagsMap();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getIntTagsCount() {
                return ((DiagnosticEvent) this.instance).getIntTagsMap().size();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public Map<String, Integer> getIntTagsMap() {
                return Collections.unmodifiableMap(((DiagnosticEvent) this.instance).getIntTagsMap());
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getIntTagsOrDefault(String str, int i10) {
                str.getClass();
                Map<String, Integer> intTagsMap = ((DiagnosticEvent) this.instance).getIntTagsMap();
                return intTagsMap.containsKey(str) ? intTagsMap.get(str).intValue() : i10;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getIntTagsOrThrow(String str) {
                str.getClass();
                Map<String, Integer> intTagsMap = ((DiagnosticEvent) this.instance).getIntTagsMap();
                if (intTagsMap.containsKey(str)) {
                    return intTagsMap.get(str).intValue();
                }
                throw new IllegalArgumentException();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean getIsHeaderBidding() {
                return ((DiagnosticEvent) this.instance).getIsHeaderBidding();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public String getPlacementId() {
                return ((DiagnosticEvent) this.instance).getPlacementId();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public ByteString getPlacementIdBytes() {
                return ((DiagnosticEvent) this.instance).getPlacementIdBytes();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public String getReason() {
                return ((DiagnosticEvent) this.instance).getReason();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public ByteString getReasonBytes() {
                return ((DiagnosticEvent) this.instance).getReasonBytes();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public String getReasonDebug() {
                return ((DiagnosticEvent) this.instance).getReasonDebug();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public ByteString getReasonDebugBytes() {
                return ((DiagnosticEvent) this.instance).getReasonDebugBytes();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            @Deprecated
            public Map<String, String> getStringTags() {
                return getStringTagsMap();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getStringTagsCount() {
                return ((DiagnosticEvent) this.instance).getStringTagsMap().size();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public Map<String, String> getStringTagsMap() {
                return Collections.unmodifiableMap(((DiagnosticEvent) this.instance).getStringTagsMap());
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public String getStringTagsOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> stringTagsMap = ((DiagnosticEvent) this.instance).getStringTagsMap();
                return stringTagsMap.containsKey(str) ? stringTagsMap.get(str) : str2;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public String getStringTagsOrThrow(String str) {
                str.getClass();
                Map<String, String> stringTagsMap = ((DiagnosticEvent) this.instance).getStringTagsMap();
                if (stringTagsMap.containsKey(str)) {
                    return stringTagsMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public double getTimeValue() {
                return ((DiagnosticEvent) this.instance).getTimeValue();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public TimestampsOuterClass.Timestamps getTimestamps() {
                return ((DiagnosticEvent) this.instance).getTimestamps();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasAdFormat() {
                return ((DiagnosticEvent) this.instance).hasAdFormat();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasAdType() {
                return ((DiagnosticEvent) this.instance).hasAdType();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasCustomEventType() {
                return ((DiagnosticEvent) this.instance).hasCustomEventType();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasHeaderBiddingTokenNumber() {
                return ((DiagnosticEvent) this.instance).hasHeaderBiddingTokenNumber();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasImpressionOpportunityId() {
                return ((DiagnosticEvent) this.instance).hasImpressionOpportunityId();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasIsHeaderBidding() {
                return ((DiagnosticEvent) this.instance).hasIsHeaderBidding();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasPlacementId() {
                return ((DiagnosticEvent) this.instance).hasPlacementId();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasReason() {
                return ((DiagnosticEvent) this.instance).hasReason();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasReasonDebug() {
                return ((DiagnosticEvent) this.instance).hasReasonDebug();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasTimeValue() {
                return ((DiagnosticEvent) this.instance).hasTimeValue();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasTimestamps() {
                return ((DiagnosticEvent) this.instance).hasTimestamps();
            }

            public Builder mergeTimestamps(TimestampsOuterClass.Timestamps timestamps) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).mergeTimestamps(timestamps);
                return this;
            }

            public Builder putAllIntTags(Map<String, Integer> map) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).getMutableIntTagsMap().putAll(map);
                return this;
            }

            public Builder putAllStringTags(Map<String, String> map) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).getMutableStringTagsMap().putAll(map);
                return this;
            }

            public Builder putIntTags(String str, int i10) {
                str.getClass();
                copyOnWrite();
                ((DiagnosticEvent) this.instance).getMutableIntTagsMap().put(str, Integer.valueOf(i10));
                return this;
            }

            public Builder putStringTags(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((DiagnosticEvent) this.instance).getMutableStringTagsMap().put(str, str2);
                return this;
            }

            public Builder removeIntTags(String str) {
                str.getClass();
                copyOnWrite();
                ((DiagnosticEvent) this.instance).getMutableIntTagsMap().remove(str);
                return this;
            }

            public Builder removeStringTags(String str) {
                str.getClass();
                copyOnWrite();
                ((DiagnosticEvent) this.instance).getMutableStringTagsMap().remove(str);
                return this;
            }

            public Builder setAdFormat(AdFormatOuterClass.AdFormat adFormat) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setAdFormat(adFormat);
                return this;
            }

            public Builder setAdFormatValue(int i10) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setAdFormatValue(i10);
                return this;
            }

            public Builder setAdType(DiagnosticAdType diagnosticAdType) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setAdType(diagnosticAdType);
                return this;
            }

            public Builder setAdTypeValue(int i10) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setAdTypeValue(i10);
                return this;
            }

            public Builder setCustomEventType(String str) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setCustomEventType(str);
                return this;
            }

            public Builder setCustomEventTypeBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setCustomEventTypeBytes(byteString);
                return this;
            }

            public Builder setEventId(int i10) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setEventId(i10);
                return this;
            }

            public Builder setEventType(DiagnosticEventType diagnosticEventType) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setEventType(diagnosticEventType);
                return this;
            }

            public Builder setEventTypeValue(int i10) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setEventTypeValue(i10);
                return this;
            }

            public Builder setHeaderBiddingTokenNumber(int i10) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setHeaderBiddingTokenNumber(i10);
                return this;
            }

            public Builder setImpressionOpportunityId(ByteString byteString) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setImpressionOpportunityId(byteString);
                return this;
            }

            public Builder setIsHeaderBidding(boolean z10) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setIsHeaderBidding(z10);
                return this;
            }

            public Builder setPlacementId(String str) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setPlacementId(str);
                return this;
            }

            public Builder setPlacementIdBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setPlacementIdBytes(byteString);
                return this;
            }

            public Builder setReason(String str) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setReason(str);
                return this;
            }

            public Builder setReasonBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setReasonBytes(byteString);
                return this;
            }

            public Builder setReasonDebug(String str) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setReasonDebug(str);
                return this;
            }

            public Builder setReasonDebugBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setReasonDebugBytes(byteString);
                return this;
            }

            public Builder setTimeValue(double d10) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setTimeValue(d10);
                return this;
            }

            public Builder setTimestamps(TimestampsOuterClass.Timestamps timestamps) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setTimestamps(timestamps);
                return this;
            }

            private Builder() {
                super(DiagnosticEvent.DEFAULT_INSTANCE);
            }

            public Builder setTimestamps(TimestampsOuterClass.Timestamps.Builder builder) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setTimestamps(builder.build());
                return this;
            }
        }

        static {
            DiagnosticEvent diagnosticEvent = new DiagnosticEvent();
            DEFAULT_INSTANCE = diagnosticEvent;
            GeneratedMessageLite.registerDefaultInstance(DiagnosticEvent.class, diagnosticEvent);
        }

        private DiagnosticEvent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdFormat() {
            this.bitField0_ &= -257;
            this.adFormat_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdType() {
            this.bitField0_ &= -33;
            this.adType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCustomEventType() {
            this.bitField0_ &= -2;
            this.customEventType_ = getDefaultInstance().getCustomEventType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventId() {
            this.eventId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventType() {
            this.eventType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeaderBiddingTokenNumber() {
            this.bitField0_ &= -129;
            this.headerBiddingTokenNumber_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImpressionOpportunityId() {
            this.bitField0_ &= -9;
            this.impressionOpportunityId_ = getDefaultInstance().getImpressionOpportunityId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsHeaderBidding() {
            this.bitField0_ &= -65;
            this.isHeaderBidding_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlacementId() {
            this.bitField0_ &= -17;
            this.placementId_ = getDefaultInstance().getPlacementId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReason() {
            this.bitField0_ &= -513;
            this.reason_ = getDefaultInstance().getReason();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReasonDebug() {
            this.bitField0_ &= -1025;
            this.reasonDebug_ = getDefaultInstance().getReasonDebug();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeValue() {
            this.bitField0_ &= -5;
            this.timeValue_ = 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamps() {
            this.timestamps_ = null;
            this.bitField0_ &= -3;
        }

        public static DiagnosticEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, Integer> getMutableIntTagsMap() {
            return internalGetMutableIntTags();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableStringTagsMap() {
            return internalGetMutableStringTags();
        }

        private MapFieldLite<String, Integer> internalGetIntTags() {
            return this.intTags_;
        }

        private MapFieldLite<String, Integer> internalGetMutableIntTags() {
            if (!this.intTags_.isMutable()) {
                this.intTags_ = this.intTags_.mutableCopy();
            }
            return this.intTags_;
        }

        private MapFieldLite<String, String> internalGetMutableStringTags() {
            if (!this.stringTags_.isMutable()) {
                this.stringTags_ = this.stringTags_.mutableCopy();
            }
            return this.stringTags_;
        }

        private MapFieldLite<String, String> internalGetStringTags() {
            return this.stringTags_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTimestamps(TimestampsOuterClass.Timestamps timestamps) {
            timestamps.getClass();
            TimestampsOuterClass.Timestamps timestamps2 = this.timestamps_;
            if (timestamps2 == null || timestamps2 == TimestampsOuterClass.Timestamps.getDefaultInstance()) {
                this.timestamps_ = timestamps;
            } else {
                this.timestamps_ = TimestampsOuterClass.Timestamps.newBuilder(this.timestamps_).mergeFrom((TimestampsOuterClass.Timestamps.Builder) timestamps).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DiagnosticEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DiagnosticEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DiagnosticEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormat(AdFormatOuterClass.AdFormat adFormat) {
            this.adFormat_ = adFormat.getNumber();
            this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormatValue(int i10) {
            this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
            this.adFormat_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdType(DiagnosticAdType diagnosticAdType) {
            this.adType_ = diagnosticAdType.getNumber();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdTypeValue(int i10) {
            this.bitField0_ |= 32;
            this.adType_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomEventType(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.customEventType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomEventTypeBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.customEventType_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventId(int i10) {
            this.eventId_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventType(DiagnosticEventType diagnosticEventType) {
            this.eventType_ = diagnosticEventType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventTypeValue(int i10) {
            this.eventType_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeaderBiddingTokenNumber(int i10) {
            this.bitField0_ |= 128;
            this.headerBiddingTokenNumber_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImpressionOpportunityId(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 8;
            this.impressionOpportunityId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsHeaderBidding(boolean z10) {
            this.bitField0_ |= 64;
            this.isHeaderBidding_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlacementId(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.placementId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlacementIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.placementId_ = byteString.toStringUtf8();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReason(String str) {
            str.getClass();
            this.bitField0_ |= 512;
            this.reason_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReasonBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.reason_ = byteString.toStringUtf8();
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReasonDebug(String str) {
            str.getClass();
            this.bitField0_ |= 1024;
            this.reasonDebug_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReasonDebugBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.reasonDebug_ = byteString.toStringUtf8();
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeValue(double d10) {
            this.bitField0_ |= 4;
            this.timeValue_ = d10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamps(TimestampsOuterClass.Timestamps timestamps) {
            timestamps.getClass();
            this.timestamps_ = timestamps;
            this.bitField0_ |= 2;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean containsIntTags(String str) {
            str.getClass();
            return internalGetIntTags().containsKey(str);
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean containsStringTags(String str) {
            str.getClass();
            return internalGetStringTags().containsKey(str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            wl.m mVar = null;
            switch (wl.m.f90720a[methodToInvoke.ordinal()]) {
                case 1:
                    return new DiagnosticEvent();
                case 2:
                    return new Builder(mVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0001\u0001\u000f\u000f\u0002\u0000\u0000\u0001\f\u0002ለ\u0000\u0003ဉ\u0001\u0004က\u0002\u00052\u00062\u0007\u0004\bည\u0003\tለ\u0004\nဌ\u0005\u000bဇ\u0006\fင\u0007\rဌ\b\u000eለ\t\u000fለ\n", new Object[]{"bitField0_", "eventType_", "customEventType_", "timestamps_", "timeValue_", "stringTags_", r.f57503a, "intTags_", q.f57501a, "eventId_", "impressionOpportunityId_", "placementId_", "adType_", "isHeaderBidding_", "headerBiddingTokenNumber_", "adFormat_", "reason_", "reasonDebug_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DiagnosticEvent> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (DiagnosticEvent.class) {
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

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat adFormatForNumber = AdFormatOuterClass.AdFormat.forNumber(this.adFormat_);
            return adFormatForNumber == null ? AdFormatOuterClass.AdFormat.UNRECOGNIZED : adFormatForNumber;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getAdFormatValue() {
            return this.adFormat_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public DiagnosticAdType getAdType() {
            DiagnosticAdType diagnosticAdTypeForNumber = DiagnosticAdType.forNumber(this.adType_);
            return diagnosticAdTypeForNumber == null ? DiagnosticAdType.UNRECOGNIZED : diagnosticAdTypeForNumber;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getAdTypeValue() {
            return this.adType_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public String getCustomEventType() {
            return this.customEventType_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public ByteString getCustomEventTypeBytes() {
            return ByteString.copyFromUtf8(this.customEventType_);
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getEventId() {
            return this.eventId_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public DiagnosticEventType getEventType() {
            DiagnosticEventType diagnosticEventTypeForNumber = DiagnosticEventType.forNumber(this.eventType_);
            return diagnosticEventTypeForNumber == null ? DiagnosticEventType.UNRECOGNIZED : diagnosticEventTypeForNumber;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getEventTypeValue() {
            return this.eventType_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getHeaderBiddingTokenNumber() {
            return this.headerBiddingTokenNumber_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public ByteString getImpressionOpportunityId() {
            return this.impressionOpportunityId_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        @Deprecated
        public Map<String, Integer> getIntTags() {
            return getIntTagsMap();
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getIntTagsCount() {
            return internalGetIntTags().size();
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public Map<String, Integer> getIntTagsMap() {
            return Collections.unmodifiableMap(internalGetIntTags());
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getIntTagsOrDefault(String str, int i10) {
            str.getClass();
            MapFieldLite<String, Integer> mapFieldLiteInternalGetIntTags = internalGetIntTags();
            return mapFieldLiteInternalGetIntTags.containsKey(str) ? mapFieldLiteInternalGetIntTags.get(str).intValue() : i10;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getIntTagsOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, Integer> mapFieldLiteInternalGetIntTags = internalGetIntTags();
            if (mapFieldLiteInternalGetIntTags.containsKey(str)) {
                return mapFieldLiteInternalGetIntTags.get(str).intValue();
            }
            throw new IllegalArgumentException();
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean getIsHeaderBidding() {
            return this.isHeaderBidding_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public String getPlacementId() {
            return this.placementId_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public ByteString getPlacementIdBytes() {
            return ByteString.copyFromUtf8(this.placementId_);
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public String getReason() {
            return this.reason_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public ByteString getReasonBytes() {
            return ByteString.copyFromUtf8(this.reason_);
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public String getReasonDebug() {
            return this.reasonDebug_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public ByteString getReasonDebugBytes() {
            return ByteString.copyFromUtf8(this.reasonDebug_);
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        @Deprecated
        public Map<String, String> getStringTags() {
            return getStringTagsMap();
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getStringTagsCount() {
            return internalGetStringTags().size();
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public Map<String, String> getStringTagsMap() {
            return Collections.unmodifiableMap(internalGetStringTags());
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public String getStringTagsOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetStringTags = internalGetStringTags();
            return mapFieldLiteInternalGetStringTags.containsKey(str) ? mapFieldLiteInternalGetStringTags.get(str) : str2;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public String getStringTagsOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetStringTags = internalGetStringTags();
            if (mapFieldLiteInternalGetStringTags.containsKey(str)) {
                return mapFieldLiteInternalGetStringTags.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public double getTimeValue() {
            return this.timeValue_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public TimestampsOuterClass.Timestamps getTimestamps() {
            TimestampsOuterClass.Timestamps timestamps = this.timestamps_;
            return timestamps == null ? TimestampsOuterClass.Timestamps.getDefaultInstance() : timestamps;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasAdFormat() {
            return (this.bitField0_ & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasAdType() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasCustomEventType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasHeaderBiddingTokenNumber() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasImpressionOpportunityId() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasIsHeaderBidding() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasPlacementId() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasReason() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasReasonDebug() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasTimeValue() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasTimestamps() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(DiagnosticEvent diagnosticEvent) {
            return DEFAULT_INSTANCE.createBuilder(diagnosticEvent);
        }

        public static DiagnosticEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DiagnosticEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DiagnosticEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DiagnosticEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DiagnosticEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DiagnosticEvent parseFrom(InputStream inputStream) throws IOException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DiagnosticEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface DiagnosticEventOrBuilder extends MessageLiteOrBuilder {
        boolean containsIntTags(String str);

        boolean containsStringTags(String str);

        AdFormatOuterClass.AdFormat getAdFormat();

        int getAdFormatValue();

        DiagnosticAdType getAdType();

        int getAdTypeValue();

        String getCustomEventType();

        ByteString getCustomEventTypeBytes();

        int getEventId();

        DiagnosticEventType getEventType();

        int getEventTypeValue();

        int getHeaderBiddingTokenNumber();

        ByteString getImpressionOpportunityId();

        @Deprecated
        Map<String, Integer> getIntTags();

        int getIntTagsCount();

        Map<String, Integer> getIntTagsMap();

        int getIntTagsOrDefault(String str, int i10);

        int getIntTagsOrThrow(String str);

        boolean getIsHeaderBidding();

        String getPlacementId();

        ByteString getPlacementIdBytes();

        String getReason();

        ByteString getReasonBytes();

        String getReasonDebug();

        ByteString getReasonDebugBytes();

        @Deprecated
        Map<String, String> getStringTags();

        int getStringTagsCount();

        Map<String, String> getStringTagsMap();

        String getStringTagsOrDefault(String str, String str2);

        String getStringTagsOrThrow(String str);

        double getTimeValue();

        TimestampsOuterClass.Timestamps getTimestamps();

        boolean hasAdFormat();

        boolean hasAdType();

        boolean hasCustomEventType();

        boolean hasHeaderBiddingTokenNumber();

        boolean hasImpressionOpportunityId();

        boolean hasIsHeaderBidding();

        boolean hasPlacementId();

        boolean hasReason();

        boolean hasReasonDebug();

        boolean hasTimeValue();

        boolean hasTimestamps();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DiagnosticEventRequest extends GeneratedMessageLite<DiagnosticEventRequest, Builder> implements DiagnosticEventRequestOrBuilder {
        public static final int BATCH_FIELD_NUMBER = 1;
        private static final DiagnosticEventRequest DEFAULT_INSTANCE;
        private static volatile Parser<DiagnosticEventRequest> PARSER;
        private Internal.ProtobufList<DiagnosticEvent> batch_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<DiagnosticEventRequest, Builder> implements DiagnosticEventRequestOrBuilder {
            public /* synthetic */ Builder(wl.m mVar) {
                this();
            }

            public Builder addAllBatch(Iterable<? extends DiagnosticEvent> iterable) {
                copyOnWrite();
                ((DiagnosticEventRequest) this.instance).addAllBatch(iterable);
                return this;
            }

            public Builder addBatch(DiagnosticEvent diagnosticEvent) {
                copyOnWrite();
                ((DiagnosticEventRequest) this.instance).addBatch(diagnosticEvent);
                return this;
            }

            public Builder clearBatch() {
                copyOnWrite();
                ((DiagnosticEventRequest) this.instance).clearBatch();
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequestOrBuilder
            public DiagnosticEvent getBatch(int i10) {
                return ((DiagnosticEventRequest) this.instance).getBatch(i10);
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequestOrBuilder
            public int getBatchCount() {
                return ((DiagnosticEventRequest) this.instance).getBatchCount();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequestOrBuilder
            public List<DiagnosticEvent> getBatchList() {
                return Collections.unmodifiableList(((DiagnosticEventRequest) this.instance).getBatchList());
            }

            public Builder removeBatch(int i10) {
                copyOnWrite();
                ((DiagnosticEventRequest) this.instance).removeBatch(i10);
                return this;
            }

            public Builder setBatch(int i10, DiagnosticEvent diagnosticEvent) {
                copyOnWrite();
                ((DiagnosticEventRequest) this.instance).setBatch(i10, diagnosticEvent);
                return this;
            }

            private Builder() {
                super(DiagnosticEventRequest.DEFAULT_INSTANCE);
            }

            public Builder addBatch(int i10, DiagnosticEvent diagnosticEvent) {
                copyOnWrite();
                ((DiagnosticEventRequest) this.instance).addBatch(i10, diagnosticEvent);
                return this;
            }

            public Builder setBatch(int i10, DiagnosticEvent.Builder builder) {
                copyOnWrite();
                ((DiagnosticEventRequest) this.instance).setBatch(i10, builder.build());
                return this;
            }

            public Builder addBatch(DiagnosticEvent.Builder builder) {
                copyOnWrite();
                ((DiagnosticEventRequest) this.instance).addBatch(builder.build());
                return this;
            }

            public Builder addBatch(int i10, DiagnosticEvent.Builder builder) {
                copyOnWrite();
                ((DiagnosticEventRequest) this.instance).addBatch(i10, builder.build());
                return this;
            }
        }

        static {
            DiagnosticEventRequest diagnosticEventRequest = new DiagnosticEventRequest();
            DEFAULT_INSTANCE = diagnosticEventRequest;
            GeneratedMessageLite.registerDefaultInstance(DiagnosticEventRequest.class, diagnosticEventRequest);
        }

        private DiagnosticEventRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBatch(Iterable<? extends DiagnosticEvent> iterable) {
            ensureBatchIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.batch_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBatch(DiagnosticEvent diagnosticEvent) {
            diagnosticEvent.getClass();
            ensureBatchIsMutable();
            this.batch_.add(diagnosticEvent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBatch() {
            this.batch_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureBatchIsMutable() {
            Internal.ProtobufList<DiagnosticEvent> protobufList = this.batch_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.batch_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static DiagnosticEventRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DiagnosticEventRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticEventRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DiagnosticEventRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeBatch(int i10) {
            ensureBatchIsMutable();
            this.batch_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBatch(int i10, DiagnosticEvent diagnosticEvent) {
            diagnosticEvent.getClass();
            ensureBatchIsMutable();
            this.batch_.set(i10, diagnosticEvent);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            wl.m mVar = null;
            switch (wl.m.f90720a[methodToInvoke.ordinal()]) {
                case 1:
                    return new DiagnosticEventRequest();
                case 2:
                    return new Builder(mVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"batch_", DiagnosticEvent.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DiagnosticEventRequest> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (DiagnosticEventRequest.class) {
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

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequestOrBuilder
        public DiagnosticEvent getBatch(int i10) {
            return this.batch_.get(i10);
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequestOrBuilder
        public int getBatchCount() {
            return this.batch_.size();
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequestOrBuilder
        public List<DiagnosticEvent> getBatchList() {
            return this.batch_;
        }

        public DiagnosticEventOrBuilder getBatchOrBuilder(int i10) {
            return this.batch_.get(i10);
        }

        public List<? extends DiagnosticEventOrBuilder> getBatchOrBuilderList() {
            return this.batch_;
        }

        public static Builder newBuilder(DiagnosticEventRequest diagnosticEventRequest) {
            return DEFAULT_INSTANCE.createBuilder(diagnosticEventRequest);
        }

        public static DiagnosticEventRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticEventRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DiagnosticEventRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBatch(int i10, DiagnosticEvent diagnosticEvent) {
            diagnosticEvent.getClass();
            ensureBatchIsMutable();
            this.batch_.add(i10, diagnosticEvent);
        }

        public static DiagnosticEventRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DiagnosticEventRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DiagnosticEventRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DiagnosticEventRequest parseFrom(InputStream inputStream) throws IOException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticEventRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticEventRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DiagnosticEventRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface DiagnosticEventRequestOrBuilder extends MessageLiteOrBuilder {
        DiagnosticEvent getBatch(int i10);

        int getBatchCount();

        List<DiagnosticEvent> getBatchList();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum DiagnosticEventType implements Internal.EnumLite {
        DIAGNOSTIC_EVENT_TYPE_UNSPECIFIED(0),
        DIAGNOSTIC_EVENT_TYPE_CUSTOM(1),
        UNRECOGNIZED(-1);

        public static final int DIAGNOSTIC_EVENT_TYPE_CUSTOM_VALUE = 1;
        public static final int DIAGNOSTIC_EVENT_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<DiagnosticEventType> internalValueMap = new s();
        private final int value;

        DiagnosticEventType(int i10) {
            this.value = i10;
        }

        public static DiagnosticEventType forNumber(int i10) {
            if (i10 == 0) {
                return DIAGNOSTIC_EVENT_TYPE_UNSPECIFIED;
            }
            if (i10 != 1) {
                return null;
            }
            return DIAGNOSTIC_EVENT_TYPE_CUSTOM;
        }

        public static Internal.EnumLiteMap<DiagnosticEventType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return t.f57505a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static DiagnosticEventType valueOf(int i10) {
            return forNumber(i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum DiagnosticEventsSeverity implements Internal.EnumLite {
        DIAGNOSTIC_EVENTS_SEVERITY_UNSPECIFIED(0),
        DIAGNOSTIC_EVENTS_SEVERITY_DEBUG(1),
        DIAGNOSTIC_EVENTS_SEVERITY_INFO(2),
        DIAGNOSTIC_EVENTS_SEVERITY_WARNING(3),
        DIAGNOSTIC_EVENTS_SEVERITY_ERROR(4),
        DIAGNOSTIC_EVENTS_SEVERITY_ALWAYS(5),
        UNRECOGNIZED(-1);

        public static final int DIAGNOSTIC_EVENTS_SEVERITY_ALWAYS_VALUE = 5;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_DEBUG_VALUE = 1;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_ERROR_VALUE = 4;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_INFO_VALUE = 2;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_UNSPECIFIED_VALUE = 0;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_WARNING_VALUE = 3;
        private static final Internal.EnumLiteMap<DiagnosticEventsSeverity> internalValueMap = new u();
        private final int value;

        DiagnosticEventsSeverity(int i10) {
            this.value = i10;
        }

        public static DiagnosticEventsSeverity forNumber(int i10) {
            if (i10 == 0) {
                return DIAGNOSTIC_EVENTS_SEVERITY_UNSPECIFIED;
            }
            if (i10 == 1) {
                return DIAGNOSTIC_EVENTS_SEVERITY_DEBUG;
            }
            if (i10 == 2) {
                return DIAGNOSTIC_EVENTS_SEVERITY_INFO;
            }
            if (i10 == 3) {
                return DIAGNOSTIC_EVENTS_SEVERITY_WARNING;
            }
            if (i10 == 4) {
                return DIAGNOSTIC_EVENTS_SEVERITY_ERROR;
            }
            if (i10 != 5) {
                return null;
            }
            return DIAGNOSTIC_EVENTS_SEVERITY_ALWAYS;
        }

        public static Internal.EnumLiteMap<DiagnosticEventsSeverity> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return v.f57507a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static DiagnosticEventsSeverity valueOf(int i10) {
            return forNumber(i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DiagnosticTag extends GeneratedMessageLite<DiagnosticTag, Builder> implements DiagnosticTagOrBuilder {
        public static final int CUSTOM_TAG_TYPE_FIELD_NUMBER = 2;
        private static final DiagnosticTag DEFAULT_INSTANCE;
        public static final int INT_VALUE_FIELD_NUMBER = 4;
        private static volatile Parser<DiagnosticTag> PARSER = null;
        public static final int STRING_VALUE_FIELD_NUMBER = 3;
        public static final int TAG_TYPE_FIELD_NUMBER = 1;
        private static final Internal.ListAdapter.Converter<Integer, DiagnosticTagType> tagType_converter_ = new w();
        private int bitField0_;
        private int tagTypeMemoizedSerializedSize;
        private Object value_;
        private int valueCase_ = 0;
        private Internal.IntList tagType_ = GeneratedMessageLite.emptyIntList();
        private String customTagType_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<DiagnosticTag, Builder> implements DiagnosticTagOrBuilder {
            public /* synthetic */ Builder(wl.m mVar) {
                this();
            }

            public Builder addAllTagType(Iterable<? extends DiagnosticTagType> iterable) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).addAllTagType(iterable);
                return this;
            }

            public Builder addAllTagTypeValue(Iterable<Integer> iterable) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).addAllTagTypeValue(iterable);
                return this;
            }

            public Builder addTagType(DiagnosticTagType diagnosticTagType) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).addTagType(diagnosticTagType);
                return this;
            }

            public Builder addTagTypeValue(int i10) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).addTagTypeValue(i10);
                return this;
            }

            public Builder clearCustomTagType() {
                copyOnWrite();
                ((DiagnosticTag) this.instance).clearCustomTagType();
                return this;
            }

            public Builder clearIntValue() {
                copyOnWrite();
                ((DiagnosticTag) this.instance).clearIntValue();
                return this;
            }

            public Builder clearStringValue() {
                copyOnWrite();
                ((DiagnosticTag) this.instance).clearStringValue();
                return this;
            }

            public Builder clearTagType() {
                copyOnWrite();
                ((DiagnosticTag) this.instance).clearTagType();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((DiagnosticTag) this.instance).clearValue();
                return this;
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public String getCustomTagType() {
                return ((DiagnosticTag) this.instance).getCustomTagType();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public ByteString getCustomTagTypeBytes() {
                return ((DiagnosticTag) this.instance).getCustomTagTypeBytes();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public int getIntValue() {
                return ((DiagnosticTag) this.instance).getIntValue();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public String getStringValue() {
                return ((DiagnosticTag) this.instance).getStringValue();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public ByteString getStringValueBytes() {
                return ((DiagnosticTag) this.instance).getStringValueBytes();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public DiagnosticTagType getTagType(int i10) {
                return ((DiagnosticTag) this.instance).getTagType(i10);
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public int getTagTypeCount() {
                return ((DiagnosticTag) this.instance).getTagTypeCount();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public List<DiagnosticTagType> getTagTypeList() {
                return ((DiagnosticTag) this.instance).getTagTypeList();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public int getTagTypeValue(int i10) {
                return ((DiagnosticTag) this.instance).getTagTypeValue(i10);
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public List<Integer> getTagTypeValueList() {
                return Collections.unmodifiableList(((DiagnosticTag) this.instance).getTagTypeValueList());
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public ValueCase getValueCase() {
                return ((DiagnosticTag) this.instance).getValueCase();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public boolean hasCustomTagType() {
                return ((DiagnosticTag) this.instance).hasCustomTagType();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public boolean hasIntValue() {
                return ((DiagnosticTag) this.instance).hasIntValue();
            }

            @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public boolean hasStringValue() {
                return ((DiagnosticTag) this.instance).hasStringValue();
            }

            public Builder setCustomTagType(String str) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).setCustomTagType(str);
                return this;
            }

            public Builder setCustomTagTypeBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((DiagnosticTag) this.instance).setCustomTagTypeBytes(byteString);
                return this;
            }

            public Builder setIntValue(int i10) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).setIntValue(i10);
                return this;
            }

            public Builder setStringValue(String str) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).setStringValue(str);
                return this;
            }

            public Builder setStringValueBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((DiagnosticTag) this.instance).setStringValueBytes(byteString);
                return this;
            }

            public Builder setTagType(int i10, DiagnosticTagType diagnosticTagType) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).setTagType(i10, diagnosticTagType);
                return this;
            }

            public Builder setTagTypeValue(int i10, int i11) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).setTagTypeValue(i10, i11);
                return this;
            }

            private Builder() {
                super(DiagnosticTag.DEFAULT_INSTANCE);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public enum ValueCase {
            STRING_VALUE(3),
            INT_VALUE(4),
            VALUE_NOT_SET(0);

            private final int value;

            ValueCase(int i10) {
                this.value = i10;
            }

            public static ValueCase forNumber(int i10) {
                if (i10 == 0) {
                    return VALUE_NOT_SET;
                }
                if (i10 == 3) {
                    return STRING_VALUE;
                }
                if (i10 != 4) {
                    return null;
                }
                return INT_VALUE;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ValueCase valueOf(int i10) {
                return forNumber(i10);
            }
        }

        static {
            DiagnosticTag diagnosticTag = new DiagnosticTag();
            DEFAULT_INSTANCE = diagnosticTag;
            GeneratedMessageLite.registerDefaultInstance(DiagnosticTag.class, diagnosticTag);
        }

        private DiagnosticTag() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTagType(Iterable<? extends DiagnosticTagType> iterable) {
            ensureTagTypeIsMutable();
            Iterator<? extends DiagnosticTagType> it = iterable.iterator();
            while (it.hasNext()) {
                this.tagType_.addInt(it.next().getNumber());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTagTypeValue(Iterable<Integer> iterable) {
            ensureTagTypeIsMutable();
            Iterator<Integer> it = iterable.iterator();
            while (it.hasNext()) {
                this.tagType_.addInt(it.next().intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTagType(DiagnosticTagType diagnosticTagType) {
            diagnosticTagType.getClass();
            ensureTagTypeIsMutable();
            this.tagType_.addInt(diagnosticTagType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTagTypeValue(int i10) {
            ensureTagTypeIsMutable();
            this.tagType_.addInt(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCustomTagType() {
            this.bitField0_ &= -2;
            this.customTagType_ = getDefaultInstance().getCustomTagType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIntValue() {
            if (this.valueCase_ == 4) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStringValue() {
            if (this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTagType() {
            this.tagType_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.valueCase_ = 0;
            this.value_ = null;
        }

        private void ensureTagTypeIsMutable() {
            Internal.IntList intList = this.tagType_;
            if (intList.isModifiable()) {
                return;
            }
            this.tagType_ = GeneratedMessageLite.mutableCopy(intList);
        }

        public static DiagnosticTag getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DiagnosticTag parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DiagnosticTag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticTag parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DiagnosticTag> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomTagType(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.customTagType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomTagTypeBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.customTagType_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIntValue(int i10) {
            this.valueCase_ = 4;
            this.value_ = Integer.valueOf(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringValue(String str) {
            str.getClass();
            this.valueCase_ = 3;
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringValueBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.value_ = byteString.toStringUtf8();
            this.valueCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTagType(int i10, DiagnosticTagType diagnosticTagType) {
            diagnosticTagType.getClass();
            ensureTagTypeIsMutable();
            this.tagType_.setInt(i10, diagnosticTagType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTagTypeValue(int i10, int i11) {
            ensureTagTypeIsMutable();
            this.tagType_.setInt(i10, i11);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            wl.m mVar = null;
            switch (wl.m.f90720a[methodToInvoke.ordinal()]) {
                case 1:
                    return new DiagnosticTag();
                case 2:
                    return new Builder(mVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001,\u0002ለ\u0000\u0003Ȼ\u0000\u00047\u0000", new Object[]{"value_", "valueCase_", "bitField0_", "tagType_", "customTagType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DiagnosticTag> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (DiagnosticTag.class) {
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

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public String getCustomTagType() {
            return this.customTagType_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public ByteString getCustomTagTypeBytes() {
            return ByteString.copyFromUtf8(this.customTagType_);
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public int getIntValue() {
            if (this.valueCase_ == 4) {
                return ((Integer) this.value_).intValue();
            }
            return 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public String getStringValue() {
            return this.valueCase_ == 3 ? (String) this.value_ : "";
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public ByteString getStringValueBytes() {
            return ByteString.copyFromUtf8(this.valueCase_ == 3 ? (String) this.value_ : "");
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public DiagnosticTagType getTagType(int i10) {
            DiagnosticTagType diagnosticTagTypeForNumber = DiagnosticTagType.forNumber(this.tagType_.getInt(i10));
            return diagnosticTagTypeForNumber == null ? DiagnosticTagType.UNRECOGNIZED : diagnosticTagTypeForNumber;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public int getTagTypeCount() {
            return this.tagType_.size();
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public List<DiagnosticTagType> getTagTypeList() {
            return new Internal.ListAdapter(this.tagType_, tagType_converter_);
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public int getTagTypeValue(int i10) {
            return this.tagType_.getInt(i10);
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public List<Integer> getTagTypeValueList() {
            return this.tagType_;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public ValueCase getValueCase() {
            return ValueCase.forNumber(this.valueCase_);
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public boolean hasCustomTagType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public boolean hasIntValue() {
            return this.valueCase_ == 4;
        }

        @Override // gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public boolean hasStringValue() {
            return this.valueCase_ == 3;
        }

        public static Builder newBuilder(DiagnosticTag diagnosticTag) {
            return DEFAULT_INSTANCE.createBuilder(diagnosticTag);
        }

        public static DiagnosticTag parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticTag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticTag parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DiagnosticTag parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DiagnosticTag parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DiagnosticTag parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DiagnosticTag parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DiagnosticTag parseFrom(InputStream inputStream) throws IOException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticTag parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticTag parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DiagnosticTag parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface DiagnosticTagOrBuilder extends MessageLiteOrBuilder {
        String getCustomTagType();

        ByteString getCustomTagTypeBytes();

        int getIntValue();

        String getStringValue();

        ByteString getStringValueBytes();

        DiagnosticTagType getTagType(int i10);

        int getTagTypeCount();

        List<DiagnosticTagType> getTagTypeList();

        int getTagTypeValue(int i10);

        List<Integer> getTagTypeValueList();

        DiagnosticTag.ValueCase getValueCase();

        boolean hasCustomTagType();

        boolean hasIntValue();

        boolean hasStringValue();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum DiagnosticTagType implements Internal.EnumLite {
        DIAGNOSTIC_TAG_TYPE_UNSPECIFIED(0),
        DIAGNOSTIC_TAG_TYPE_CUSTOM(1),
        UNRECOGNIZED(-1);

        public static final int DIAGNOSTIC_TAG_TYPE_CUSTOM_VALUE = 1;
        public static final int DIAGNOSTIC_TAG_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<DiagnosticTagType> internalValueMap = new x();
        private final int value;

        DiagnosticTagType(int i10) {
            this.value = i10;
        }

        public static DiagnosticTagType forNumber(int i10) {
            if (i10 == 0) {
                return DIAGNOSTIC_TAG_TYPE_UNSPECIFIED;
            }
            if (i10 != 1) {
                return null;
            }
            return DIAGNOSTIC_TAG_TYPE_CUSTOM;
        }

        public static Internal.EnumLiteMap<DiagnosticTagType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return y.f57508a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static DiagnosticTagType valueOf(int i10) {
            return forNumber(i10);
        }
    }

    private DiagnosticEventRequestOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
