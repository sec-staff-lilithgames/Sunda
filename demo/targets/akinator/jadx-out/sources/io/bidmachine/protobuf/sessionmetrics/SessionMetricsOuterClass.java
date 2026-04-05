package io.bidmachine.protobuf.sessionmetrics;

import a.b;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.b9;
import com.explorestack.protobuf.bd;
import com.explorestack.protobuf.cc;
import com.explorestack.protobuf.d;
import com.explorestack.protobuf.e;
import com.explorestack.protobuf.fa;
import com.explorestack.protobuf.gc;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.i5;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.j7;
import com.explorestack.protobuf.ja;
import com.explorestack.protobuf.k7;
import com.explorestack.protobuf.l7;
import com.explorestack.protobuf.l8;
import com.explorestack.protobuf.m5;
import com.explorestack.protobuf.n7;
import com.explorestack.protobuf.o6;
import com.explorestack.protobuf.p6;
import com.explorestack.protobuf.p7;
import com.explorestack.protobuf.pa;
import com.explorestack.protobuf.s7;
import com.explorestack.protobuf.s8;
import com.explorestack.protobuf.v7;
import com.explorestack.protobuf.x7;
import com.explorestack.protobuf.xa;
import com.explorestack.protobuf.y;
import com.explorestack.protobuf.y4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p0.o2;
import rw.hIT.uQjDr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class SessionMetricsOuterClass {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n)bidmachine/protobuf/session_metrics.proto\u0012\u000esessionmetrics\"Õ\u0002\n\tUserState\u0012 \n\u0018last_processed_timestamp\u0018\u0001 \u0001(\u0003\u0012?\n\u000bimpressions\u0018\u0002 \u0003(\u000b2*.sessionmetrics.UserState.ImpressionsEntry\u0012>\n\u000bad_requests\u0018\u0003 \u0003(\u000b2).sessionmetrics.UserState.AdRequestsEntry\u001aV\n\u0010ImpressionsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u00121\n\u0005value\u0018\u0002 \u0001(\u000b2\".sessionmetrics.AdDomainTimestamps:\u00028\u0001\u001aM\n\u000fAdRequestsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u0012)\n\u0005value\u0018\u0002 \u0001(\u000b2\u001a.sessionmetrics.Timestamps:\u00028\u0001\"\u0090\u0005\n\u000bUserSession\u0012\u0015\n\rlast_activity\u0018\u0001 \u0001(\u0003\u0012E\n\u0012metrics_by_ad_type\u0018\u0003 \u0003(\u000b2).sessionmetrics.UserSession.AdTypeMetrics\u0012\u0015\n\rsession_start\u0018\u0004 \u0001(\u0003\u001a@\n\u0004Ecpm\u0012\u0014\n\ffirst_prices\u0018\u0001 \u0003(\u0001\u0012\u0013\n\u000blast_prices\u0018\u0002 \u0003(\u0001\u0012\r\n\u0005count\u0018\u0003 \u0001(\u0005\u001aX\n\u0007Auction\u0012\u0019\n\u0011source_request_id\u0018\u0001 \u0001(\f\u0012\u0018\n\u0010winner_bidder_id\u0018\u0002 \u0001(\r\u0012\u0018\n\u0010losers_bidder_id\u0018\u0003 \u0003(\r\u001aï\u0002\n\rAdTypeMetrics\u0012'\n\u0007ad_type\u0018\u0001 \u0001(\u000e2\u0016.sessionmetrics.AdType\u0012\u0013\n\u000bimpressions\u0018\u0002 \u0001(\u0005\u0012\u0013\n\u000bad_requests\u0018\u0003 \u0001(\u0005\u0012\f\n\u0004bids\u0018\u0004 \u0001(\u0005\u0012\f\n\u0004wins\u0018\u0005 \u0001(\u0005\u0012\u000e\n\u0006losses\u0018\u0006 \u0001(\u0005\u0012\r\n\u0005lurls\u0018\u0007 \u0001(\u0005\u0012\r\n\u0005nurls\u0018\b \u0001(\u0005\u0012\u001c\n\u0014cumulative_bid_price\u0018\t \u0001(\u0002\u0012\u001d\n\u0015cumulative_lurl_price\u0018\n \u0001(\u0002\u0012\u001d\n\u0015cumulative_nurl_price\u0018\u000b \u0001(\u0002\u0012.\n\u0004ecpm\u0018\f \u0001(\u000b2 .sessionmetrics.UserSession.Ecpm\u00125\n\bauctions\u0018\r \u0003(\u000b2#.sessionmetrics.UserSession.Auction\"\u009f\u0001\n\nTimestamps\u0012\u0016\n\u000elast_timestamp\u0018\u0001 \u0001(\u0003\u0012\u000e\n\u0006deltas\u0018\u0002 \u0003(\r\u00129\n\u000bday_buckets\u0018\u0003 \u0003(\u000b2$.sessionmetrics.Timestamps.DayBucket\u001a.\n\tDayBucket\u0012\u0012\n\nstart_time\u0018\u0001 \u0001(\u0003\u0012\r\n\u0005count\u0018\u0002 \u0001(\u0005\"©\u0001\n\u0012AdDomainTimestamps\u0012E\n\nad_domains\u0018\u0001 \u0003(\u000b21.sessionmetrics.AdDomainTimestamps.AdDomainsEntry\u001aL\n\u000eAdDomainsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012)\n\u0005value\u0018\u0002 \u0001(\u000b2\u001a.sessionmetrics.Timestamps:\u00028\u0001\"B\n\rWindowMetrics\u0012\u000f\n\u0007last_1h\u0018\u0001 \u0001(\u0005\u0012\u000f\n\u0007last_1d\u0018\u0002 \u0001(\u0005\u0012\u000f\n\u0007last_7d\u0018\u0003 \u0001(\u0005\"Ö\u0001\n\u0011ImpressionMetrics\u0012'\n\u0007ad_type\u0018\u0001 \u0001(\u000e2\u0016.sessionmetrics.AdType\u0012@\n\u0007domains\u0018\u0002 \u0003(\u000b2/.sessionmetrics.ImpressionMetrics.DomainMetrics\u001aV\n\rDomainMetrics\u0012\u000e\n\u0006domain\u0018\u0001 \u0001(\t\u00125\n\u000ewindow_metrics\u0018\u0002 \u0001(\u000b2\u001d.sessionmetrics.WindowMetrics\"\u008b\u0001\n\u0010AdRequestMetrics\u0012'\n\u0007ad_type\u0018\u0001 \u0001(\u000e2\u0016.sessionmetrics.AdType\u00125\n\u000ewindow_metrics\u0018\u0002 \u0001(\u000b2\u001d.sessionmetrics.WindowMetrics\u0012\u0017\n\u000flast_timestamps\u0018\u0003 \u0003(\u0003\"µ\u0001\n\u000eSessionMetrics\u00126\n\u000bimpressions\u0018\u0001 \u0003(\u000b2!.sessionmetrics.ImpressionMetrics\u00125\n\u000bad_requests\u0018\u0002 \u0003(\u000b2 .sessionmetrics.AdRequestMetrics\u00124\n\u000fcurrent_session\u0018\u0003 \u0001(\u000b2\u001b.sessionmetrics.UserSession\"1\n\u000bUserIdQuery\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\t\u0012\u0011\n\ttimestamp\u0018\u0002 \u0001(\u0003\"X\n\tAdRequest\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\t\u0012'\n\u0007ad_type\u0018\u0002 \u0001(\u000e2\u0016.sessionmetrics.AdType\u0012\u0011\n\ttimestamp\u0018\u0003 \u0001(\u0003*A\n\u0006AdType\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0010\n\fINTERSTITIAL\u0010\u0001\u0012\f\n\bREWARDED\u0010\u0002\u0012\n\n\u0006BANNER\u0010\u00032²\u0001\n\u000eSessionService\u0012P\n\u0011GetSessionMetrics\u0012\u001b.sessionmetrics.UserIdQuery\u001a\u001e.sessionmetrics.SessionMetrics\u0012N\n\u0011RegisterAdRequest\u0012\u0019.sessionmetrics.AdRequest\u001a\u001e.sessionmetrics.SessionMetricsB'\n%io.bidmachine.protobuf.sessionmetricsb\u0006proto3"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_sessionmetrics_AdDomainTimestamps_AdDomainsEntry_descriptor;
    private static final i7 internal_static_sessionmetrics_AdDomainTimestamps_AdDomainsEntry_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_AdDomainTimestamps_descriptor;
    private static final i7 internal_static_sessionmetrics_AdDomainTimestamps_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_AdRequestMetrics_descriptor;
    private static final i7 internal_static_sessionmetrics_AdRequestMetrics_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_AdRequest_descriptor;
    private static final i7 internal_static_sessionmetrics_AdRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_ImpressionMetrics_DomainMetrics_descriptor;
    private static final i7 internal_static_sessionmetrics_ImpressionMetrics_DomainMetrics_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_ImpressionMetrics_descriptor;
    private static final i7 internal_static_sessionmetrics_ImpressionMetrics_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_SessionMetrics_descriptor;
    private static final i7 internal_static_sessionmetrics_SessionMetrics_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_Timestamps_DayBucket_descriptor;
    private static final i7 internal_static_sessionmetrics_Timestamps_DayBucket_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_Timestamps_descriptor;
    private static final i7 internal_static_sessionmetrics_Timestamps_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_UserIdQuery_descriptor;
    private static final i7 internal_static_sessionmetrics_UserIdQuery_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_UserSession_AdTypeMetrics_descriptor;
    private static final i7 internal_static_sessionmetrics_UserSession_AdTypeMetrics_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_UserSession_Auction_descriptor;
    private static final i7 internal_static_sessionmetrics_UserSession_Auction_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_UserSession_Ecpm_descriptor;
    private static final i7 internal_static_sessionmetrics_UserSession_Ecpm_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_UserSession_descriptor;
    private static final i7 internal_static_sessionmetrics_UserSession_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_UserState_AdRequestsEntry_descriptor;
    private static final i7 internal_static_sessionmetrics_UserState_AdRequestsEntry_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_UserState_ImpressionsEntry_descriptor;
    private static final i7 internal_static_sessionmetrics_UserState_ImpressionsEntry_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_UserState_descriptor;
    private static final i7 internal_static_sessionmetrics_UserState_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_WindowMetrics_descriptor;
    private static final i7 internal_static_sessionmetrics_WindowMetrics_fieldAccessorTable;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AdDomainTimestamps extends k7 implements AdDomainTimestampsOrBuilder {
        public static final int AD_DOMAINS_FIELD_NUMBER = 1;
        private static final AdDomainTimestamps DEFAULT_INSTANCE = new AdDomainTimestamps();
        private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestamps.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public AdDomainTimestamps parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new AdDomainTimestamps(yVar, m5Var);
            }
        };
        private static final long serialVersionUID = 0;
        private b9 adDomains_;
        private byte memoizedIsInitialized;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class AdDomainsDefaultEntryHolder {
            static final s8 defaultEntry = s8.newDefaultInstance(SessionMetricsOuterClass.internal_static_sessionmetrics_AdDomainTimestamps_AdDomainsEntry_descriptor, bd.f21956f, "", bd.f21958h, Timestamps.getDefaultInstance());

            private AdDomainsDefaultEntryHolder() {
            }
        }

        public static AdDomainTimestamps getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_AdDomainTimestamps_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b9 internalGetAdDomains() {
            b9 b9Var = this.adDomains_;
            return b9Var == null ? b9.emptyMapField(AdDomainsDefaultEntryHolder.defaultEntry) : b9Var;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AdDomainTimestamps parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdDomainTimestamps) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AdDomainTimestamps parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AdDomainTimestamps) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestampsOrBuilder
        public boolean containsAdDomains(String str) {
            str.getClass();
            return internalGetAdDomains().getMap().containsKey(str);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AdDomainTimestamps)) {
                return super.equals(obj);
            }
            AdDomainTimestamps adDomainTimestamps = (AdDomainTimestamps) obj;
            return internalGetAdDomains().equals(adDomainTimestamps.internalGetAdDomains()) && this.unknownFields.equals(adDomainTimestamps.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestampsOrBuilder
        @Deprecated
        public Map<String, Timestamps> getAdDomains() {
            return getAdDomainsMap();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestampsOrBuilder
        public int getAdDomainsCount() {
            return internalGetAdDomains().getMap().size();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestampsOrBuilder
        public Map<String, Timestamps> getAdDomainsMap() {
            return internalGetAdDomains().getMap();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestampsOrBuilder
        public Timestamps getAdDomainsOrDefault(String str, Timestamps timestamps) {
            str.getClass();
            Map<Object, Object> map = internalGetAdDomains().getMap();
            return map.containsKey(str) ? (Timestamps) map.get(str) : timestamps;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestampsOrBuilder
        public Timestamps getAdDomainsOrThrow(String str) {
            str.getClass();
            Map<Object, Object> map = internalGetAdDomains().getMap();
            if (map.containsKey(str)) {
                return (Timestamps) map.get(str);
            }
            throw new IllegalArgumentException();
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
            Iterator itN = a.n(internalGetAdDomains());
            int iG = 0;
            while (itN.hasNext()) {
                Map.Entry entry = (Map.Entry) itN.next();
                iG = a.g(entry, AdDomainsDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()), 1, iG);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iG;
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
            if (!internalGetAdDomains().getMap().isEmpty()) {
                iHashCode = o2.B(iHashCode, 37, 1, 53) + internalGetAdDomains().hashCode();
            }
            int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_AdDomainTimestamps_fieldAccessorTable.ensureFieldAccessorsInitialized(AdDomainTimestamps.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.k7
        public b9 internalGetMapField(int i10) {
            if (i10 == 1) {
                return internalGetAdDomains();
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
            return new AdDomainTimestamps();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            k7.serializeStringMapTo(h0Var, internalGetAdDomains(), AdDomainsDefaultEntryHolder.defaultEntry, 1);
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements AdDomainTimestampsOrBuilder {
            private b9 adDomains_;
            private int bitField0_;

            private Builder() {
                super(null);
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_AdDomainTimestamps_descriptor;
            }

            private b9 internalGetAdDomains() {
                b9 b9Var = this.adDomains_;
                return b9Var == null ? b9.emptyMapField(AdDomainsDefaultEntryHolder.defaultEntry) : b9Var;
            }

            private b9 internalGetMutableAdDomains() {
                onChanged();
                if (this.adDomains_ == null) {
                    this.adDomains_ = b9.newMapField(AdDomainsDefaultEntryHolder.defaultEntry);
                }
                if (!this.adDomains_.isMutable()) {
                    this.adDomains_ = this.adDomains_.copy();
                }
                return this.adDomains_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = k7.alwaysUseFieldBuilders;
            }

            public Builder clearAdDomains() {
                internalGetMutableAdDomains().getMutableMap().clear();
                return this;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestampsOrBuilder
            public boolean containsAdDomains(String str) {
                str.getClass();
                return internalGetAdDomains().getMap().containsKey(str);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestampsOrBuilder
            @Deprecated
            public Map<String, Timestamps> getAdDomains() {
                return getAdDomainsMap();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestampsOrBuilder
            public int getAdDomainsCount() {
                return internalGetAdDomains().getMap().size();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestampsOrBuilder
            public Map<String, Timestamps> getAdDomainsMap() {
                return internalGetAdDomains().getMap();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestampsOrBuilder
            public Timestamps getAdDomainsOrDefault(String str, Timestamps timestamps) {
                str.getClass();
                Map<Object, Object> map = internalGetAdDomains().getMap();
                return map.containsKey(str) ? (Timestamps) map.get(str) : timestamps;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestampsOrBuilder
            public Timestamps getAdDomainsOrThrow(String str) {
                str.getClass();
                Map<Object, Object> map = internalGetAdDomains().getMap();
                if (map.containsKey(str)) {
                    return (Timestamps) map.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_AdDomainTimestamps_descriptor;
            }

            @Deprecated
            public Map<String, Timestamps> getMutableAdDomains() {
                return internalGetMutableAdDomains().getMutableMap();
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_AdDomainTimestamps_fieldAccessorTable.ensureFieldAccessorsInitialized(AdDomainTimestamps.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.o6
            public b9 internalGetMapField(int i10) {
                if (i10 == 1) {
                    return internalGetAdDomains();
                }
                throw new RuntimeException(b.e(i10, "Invalid map field number: "));
            }

            @Override // com.explorestack.protobuf.o6
            public b9 internalGetMutableMapField(int i10) {
                if (i10 == 1) {
                    return internalGetMutableAdDomains();
                }
                throw new RuntimeException(b.e(i10, "Invalid map field number: "));
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder putAdDomains(String str, Timestamps timestamps) {
                str.getClass();
                timestamps.getClass();
                internalGetMutableAdDomains().getMutableMap().put(str, timestamps);
                return this;
            }

            public Builder putAllAdDomains(Map<String, Timestamps> map) {
                internalGetMutableAdDomains().getMutableMap().putAll(map);
                return this;
            }

            public Builder removeAdDomains(String str) {
                str.getClass();
                internalGetMutableAdDomains().getMutableMap().remove(str);
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AdDomainTimestamps build() {
                AdDomainTimestamps adDomainTimestampsBuildPartial = buildPartial();
                if (adDomainTimestampsBuildPartial.isInitialized()) {
                    return adDomainTimestampsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) adDomainTimestampsBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AdDomainTimestamps buildPartial() {
                AdDomainTimestamps adDomainTimestamps = new AdDomainTimestamps(this);
                adDomainTimestamps.adDomains_ = internalGetAdDomains();
                adDomainTimestamps.adDomains_.makeImmutable();
                onBuilt();
                return adDomainTimestamps;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public AdDomainTimestamps getDefaultInstanceForType() {
                return AdDomainTimestamps.getDefaultInstance();
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
                internalGetMutableAdDomains().clear();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
            /* renamed from: clone */
            public Builder mo500clone() {
                return (Builder) super.mo500clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AdDomainTimestamps) {
                    return mergeFrom((AdDomainTimestamps) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AdDomainTimestamps adDomainTimestamps) {
                if (adDomainTimestamps == AdDomainTimestamps.getDefaultInstance()) {
                    return this;
                }
                internalGetMutableAdDomains().mergeFrom(adDomainTimestamps.internalGetAdDomains());
                mergeUnknownFields(((k7) adDomainTimestamps).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestamps.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestamps.access$12600()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$AdDomainTimestamps r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestamps) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$AdDomainTimestamps r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestamps) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestamps.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$AdDomainTimestamps$Builder");
            }
        }

        public static Builder newBuilder(AdDomainTimestamps adDomainTimestamps) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(adDomainTimestamps);
        }

        public static AdDomainTimestamps parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (AdDomainTimestamps) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private AdDomainTimestamps(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AdDomainTimestamps parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (AdDomainTimestamps) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static AdDomainTimestamps parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AdDomainTimestamps) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public AdDomainTimestamps getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static AdDomainTimestamps parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (AdDomainTimestamps) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private AdDomainTimestamps() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AdDomainTimestamps parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AdDomainTimestamps) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static AdDomainTimestamps parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (AdDomainTimestamps) PARSER.parseFrom(bArr, m5Var);
        }

        private AdDomainTimestamps(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                        this.adDomains_ = b9.newMapField(AdDomainsDefaultEntryHolder.defaultEntry);
                                        z11 = true;
                                    }
                                    s8 s8Var = (s8) yVar.readMessage(AdDomainsDefaultEntryHolder.defaultEntry.getParserForType(), m5Var);
                                    this.adDomains_.getMutableMap().put(s8Var.getKey(), s8Var.getValue());
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

        public static AdDomainTimestamps parseFrom(InputStream inputStream) throws IOException {
            return (AdDomainTimestamps) k7.parseWithIOException(PARSER, inputStream);
        }

        public static AdDomainTimestamps parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (AdDomainTimestamps) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static AdDomainTimestamps parseFrom(y yVar) throws IOException {
            return (AdDomainTimestamps) k7.parseWithIOException(PARSER, yVar);
        }

        public static AdDomainTimestamps parseFrom(y yVar, m5 m5Var) throws IOException {
            return (AdDomainTimestamps) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface AdDomainTimestampsOrBuilder extends MessageOrBuilder {
        boolean containsAdDomains(String str);

        @Deprecated
        Map<String, Timestamps> getAdDomains();

        int getAdDomainsCount();

        Map<String, Timestamps> getAdDomainsMap();

        Timestamps getAdDomainsOrDefault(String str, Timestamps timestamps);

        Timestamps getAdDomainsOrThrow(String str);

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AdRequest extends k7 implements AdRequestOrBuilder {
        public static final int AD_TYPE_FIELD_NUMBER = 2;
        private static final AdRequest DEFAULT_INSTANCE = new AdRequest();
        private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequest.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public AdRequest parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new AdRequest(yVar, m5Var);
            }
        };
        public static final int TIMESTAMP_FIELD_NUMBER = 3;
        public static final int USER_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int adType_;
        private byte memoizedIsInitialized;
        private long timestamp_;
        private volatile Object userId_;

        public static AdRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_AdRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AdRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdRequest) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AdRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AdRequest) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AdRequest)) {
                return super.equals(obj);
            }
            AdRequest adRequest = (AdRequest) obj;
            return getUserId().equals(adRequest.getUserId()) && this.adType_ == adRequest.adType_ && getTimestamp() == adRequest.getTimestamp() && this.unknownFields.equals(adRequest.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestOrBuilder
        public AdType getAdType() {
            AdType adTypeValueOf = AdType.valueOf(this.adType_);
            return adTypeValueOf == null ? AdType.UNRECOGNIZED : adTypeValueOf;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestOrBuilder
        public int getAdTypeValue() {
            return this.adType_;
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
            int iComputeStringSize = !getUserIdBytes().isEmpty() ? k7.computeStringSize(1, this.userId_) : 0;
            if (this.adType_ != AdType.UNKNOWN.getNumber()) {
                iComputeStringSize += h0.computeEnumSize(2, this.adType_);
            }
            long j10 = this.timestamp_;
            if (j10 != 0) {
                iComputeStringSize += h0.computeInt64Size(3, j10);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestOrBuilder
        public long getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
        public final gc getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestOrBuilder
        public String getUserId() {
            Object obj = this.userId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.userId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestOrBuilder
        public ByteString getUserIdBytes() {
            Object obj = this.userId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.userId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = this.unknownFields.hashCode() + ((x7.hashLong(getTimestamp()) + a.d((((getUserId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53, this.adType_, 37, 3, 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_AdRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AdRequest.class, Builder.class);
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
            return new AdRequest();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            if (!getUserIdBytes().isEmpty()) {
                k7.writeString(h0Var, 1, this.userId_);
            }
            if (this.adType_ != AdType.UNKNOWN.getNumber()) {
                h0Var.writeEnum(2, this.adType_);
            }
            long j10 = this.timestamp_;
            if (j10 != 0) {
                h0Var.writeInt64(3, j10);
            }
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements AdRequestOrBuilder {
            private int adType_;
            private long timestamp_;
            private Object userId_;

            private Builder() {
                super(null);
                this.userId_ = "";
                this.adType_ = 0;
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_AdRequest_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = k7.alwaysUseFieldBuilders;
            }

            public Builder clearAdType() {
                this.adType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTimestamp() {
                this.timestamp_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearUserId() {
                this.userId_ = AdRequest.getDefaultInstance().getUserId();
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestOrBuilder
            public AdType getAdType() {
                AdType adTypeValueOf = AdType.valueOf(this.adType_);
                return adTypeValueOf == null ? AdType.UNRECOGNIZED : adTypeValueOf;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestOrBuilder
            public int getAdTypeValue() {
                return this.adType_;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_AdRequest_descriptor;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestOrBuilder
            public long getTimestamp() {
                return this.timestamp_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestOrBuilder
            public String getUserId() {
                Object obj = this.userId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.userId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestOrBuilder
            public ByteString getUserIdBytes() {
                Object obj = this.userId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.userId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_AdRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AdRequest.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setAdType(AdType adType) {
                adType.getClass();
                this.adType_ = adType.getNumber();
                onChanged();
                return this;
            }

            public Builder setAdTypeValue(int i10) {
                this.adType_ = i10;
                onChanged();
                return this;
            }

            public Builder setTimestamp(long j10) {
                this.timestamp_ = j10;
                onChanged();
                return this;
            }

            public Builder setUserId(String str) {
                str.getClass();
                this.userId_ = str;
                onChanged();
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.userId_ = byteString;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AdRequest build() {
                AdRequest adRequestBuildPartial = buildPartial();
                if (adRequestBuildPartial.isInitialized()) {
                    return adRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) adRequestBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AdRequest buildPartial() {
                AdRequest adRequest = new AdRequest(this);
                adRequest.userId_ = this.userId_;
                adRequest.adType_ = this.adType_;
                adRequest.timestamp_ = this.timestamp_;
                onBuilt();
                return adRequest;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public AdRequest getDefaultInstanceForType() {
                return AdRequest.getDefaultInstance();
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
                this.userId_ = "";
                this.adType_ = 0;
                this.timestamp_ = 0L;
                return this;
            }

            private Builder(p6 p6Var) {
                super(p6Var);
                this.userId_ = "";
                this.adType_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
            /* renamed from: clone */
            public Builder mo500clone() {
                return (Builder) super.mo500clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AdRequest) {
                    return mergeFrom((AdRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AdRequest adRequest) {
                if (adRequest == AdRequest.getDefaultInstance()) {
                    return this;
                }
                if (!adRequest.getUserId().isEmpty()) {
                    this.userId_ = adRequest.userId_;
                    onChanged();
                }
                if (adRequest.adType_ != 0) {
                    setAdTypeValue(adRequest.getAdTypeValue());
                }
                if (adRequest.getTimestamp() != 0) {
                    setTimestamp(adRequest.getTimestamp());
                }
                mergeUnknownFields(((k7) adRequest).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequest.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequest.access$21600()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$AdRequest r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequest) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$AdRequest r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequest) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequest.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$AdRequest$Builder");
            }
        }

        public static Builder newBuilder(AdRequest adRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(adRequest);
        }

        public static AdRequest parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (AdRequest) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private AdRequest(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AdRequest parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (AdRequest) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static AdRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AdRequest) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public AdRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static AdRequest parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (AdRequest) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private AdRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.userId_ = "";
            this.adType_ = 0;
        }

        public static AdRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AdRequest) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static AdRequest parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (AdRequest) PARSER.parseFrom(bArr, m5Var);
        }

        public static AdRequest parseFrom(InputStream inputStream) throws IOException {
            return (AdRequest) k7.parseWithIOException(PARSER, inputStream);
        }

        private AdRequest(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                this.userId_ = yVar.readStringRequireUtf8();
                            } else if (tag == 16) {
                                this.adType_ = yVar.readEnum();
                            } else if (tag != 24) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                this.timestamp_ = yVar.readInt64();
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

        public static AdRequest parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (AdRequest) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static AdRequest parseFrom(y yVar) throws IOException {
            return (AdRequest) k7.parseWithIOException(PARSER, yVar);
        }

        public static AdRequest parseFrom(y yVar, m5 m5Var) throws IOException {
            return (AdRequest) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AdRequestMetrics extends k7 implements AdRequestMetricsOrBuilder {
        public static final int AD_TYPE_FIELD_NUMBER = 1;
        public static final int LAST_TIMESTAMPS_FIELD_NUMBER = 3;
        public static final int WINDOW_METRICS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int adType_;
        private int lastTimestampsMemoizedSerializedSize;
        private v7 lastTimestamps_;
        private byte memoizedIsInitialized;
        private WindowMetrics windowMetrics_;
        private static final AdRequestMetrics DEFAULT_INSTANCE = new AdRequestMetrics();
        private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetrics.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public AdRequestMetrics parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new AdRequestMetrics(yVar, m5Var);
            }
        };

        public static AdRequestMetrics getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_AdRequestMetrics_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AdRequestMetrics parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdRequestMetrics) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AdRequestMetrics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AdRequestMetrics) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AdRequestMetrics)) {
                return super.equals(obj);
            }
            AdRequestMetrics adRequestMetrics = (AdRequestMetrics) obj;
            if (this.adType_ == adRequestMetrics.adType_ && hasWindowMetrics() == adRequestMetrics.hasWindowMetrics()) {
                return (!hasWindowMetrics() || getWindowMetrics().equals(adRequestMetrics.getWindowMetrics())) && getLastTimestampsList().equals(adRequestMetrics.getLastTimestampsList()) && this.unknownFields.equals(adRequestMetrics.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
        public AdType getAdType() {
            AdType adTypeValueOf = AdType.valueOf(this.adType_);
            return adTypeValueOf == null ? AdType.UNRECOGNIZED : adTypeValueOf;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
        public int getAdTypeValue() {
            return this.adType_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
        public long getLastTimestamps(int i10) {
            return ((l8) this.lastTimestamps_).getLong(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
        public int getLastTimestampsCount() {
            return this.lastTimestamps_.size();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
        public List<Long> getLastTimestampsList() {
            return this.lastTimestamps_;
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
            int iComputeEnumSize = this.adType_ != AdType.UNKNOWN.getNumber() ? h0.computeEnumSize(1, this.adType_) : 0;
            if (this.windowMetrics_ != null) {
                iComputeEnumSize += h0.computeMessageSize(2, getWindowMetrics());
            }
            int iComputeInt64SizeNoTag = 0;
            for (int i11 = 0; i11 < this.lastTimestamps_.size(); i11++) {
                iComputeInt64SizeNoTag += h0.computeInt64SizeNoTag(((l8) this.lastTimestamps_).getLong(i11));
            }
            int iComputeInt32SizeNoTag = iComputeEnumSize + iComputeInt64SizeNoTag;
            if (!getLastTimestampsList().isEmpty()) {
                iComputeInt32SizeNoTag = iComputeInt32SizeNoTag + 1 + h0.computeInt32SizeNoTag(iComputeInt64SizeNoTag);
            }
            this.lastTimestampsMemoizedSerializedSize = iComputeInt64SizeNoTag;
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt32SizeNoTag;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
        public final gc getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
        public WindowMetrics getWindowMetrics() {
            WindowMetrics windowMetrics = this.windowMetrics_;
            return windowMetrics == null ? WindowMetrics.getDefaultInstance() : windowMetrics;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
        public WindowMetricsOrBuilder getWindowMetricsOrBuilder() {
            return getWindowMetrics();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
        public boolean hasWindowMetrics() {
            return this.windowMetrics_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53) + this.adType_;
            if (hasWindowMetrics()) {
                iHashCode = o2.B(iHashCode, 37, 2, 53) + getWindowMetrics().hashCode();
            }
            if (getLastTimestampsCount() > 0) {
                iHashCode = o2.B(iHashCode, 37, 3, 53) + getLastTimestampsList().hashCode();
            }
            int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_AdRequestMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(AdRequestMetrics.class, Builder.class);
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
            return new AdRequestMetrics();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            getSerializedSize();
            if (this.adType_ != AdType.UNKNOWN.getNumber()) {
                h0Var.writeEnum(1, this.adType_);
            }
            if (this.windowMetrics_ != null) {
                h0Var.writeMessage(2, getWindowMetrics());
            }
            if (getLastTimestampsList().size() > 0) {
                h0Var.writeUInt32NoTag(26);
                h0Var.writeUInt32NoTag(this.lastTimestampsMemoizedSerializedSize);
            }
            for (int i10 = 0; i10 < this.lastTimestamps_.size(); i10++) {
                h0Var.writeInt64NoTag(((l8) this.lastTimestamps_).getLong(i10));
            }
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements AdRequestMetricsOrBuilder {
            private int adType_;
            private int bitField0_;
            private v7 lastTimestamps_;
            private xa windowMetricsBuilder_;
            private WindowMetrics windowMetrics_;

            private Builder() {
                super(null);
                this.adType_ = 0;
                this.lastTimestamps_ = k7.emptyLongList();
                maybeForceBuilderInitialization();
            }

            private void ensureLastTimestampsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.lastTimestamps_ = k7.mutableCopy(this.lastTimestamps_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_AdRequestMetrics_descriptor;
            }

            private xa getWindowMetricsFieldBuilder() {
                if (this.windowMetricsBuilder_ == null) {
                    this.windowMetricsBuilder_ = new xa(getWindowMetrics(), getParentForChildren(), isClean());
                    this.windowMetrics_ = null;
                }
                return this.windowMetricsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = k7.alwaysUseFieldBuilders;
            }

            public Builder addAllLastTimestamps(Iterable<? extends Long> iterable) {
                ensureLastTimestampsIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.lastTimestamps_);
                onChanged();
                return this;
            }

            public Builder addLastTimestamps(long j10) {
                ensureLastTimestampsIsMutable();
                ((l8) this.lastTimestamps_).addLong(j10);
                onChanged();
                return this;
            }

            public Builder clearAdType() {
                this.adType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLastTimestamps() {
                this.lastTimestamps_ = k7.emptyLongList();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearWindowMetrics() {
                if (this.windowMetricsBuilder_ == null) {
                    this.windowMetrics_ = null;
                    onChanged();
                    return this;
                }
                this.windowMetrics_ = null;
                this.windowMetricsBuilder_ = null;
                return this;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
            public AdType getAdType() {
                AdType adTypeValueOf = AdType.valueOf(this.adType_);
                return adTypeValueOf == null ? AdType.UNRECOGNIZED : adTypeValueOf;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
            public int getAdTypeValue() {
                return this.adType_;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_AdRequestMetrics_descriptor;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
            public long getLastTimestamps(int i10) {
                return ((l8) this.lastTimestamps_).getLong(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
            public int getLastTimestampsCount() {
                return this.lastTimestamps_.size();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
            public List<Long> getLastTimestampsList() {
                return (this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.lastTimestamps_) : this.lastTimestamps_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
            public WindowMetrics getWindowMetrics() {
                xa xaVar = this.windowMetricsBuilder_;
                if (xaVar != null) {
                    return (WindowMetrics) xaVar.getMessage();
                }
                WindowMetrics windowMetrics = this.windowMetrics_;
                return windowMetrics == null ? WindowMetrics.getDefaultInstance() : windowMetrics;
            }

            public WindowMetrics.Builder getWindowMetricsBuilder() {
                onChanged();
                return (WindowMetrics.Builder) getWindowMetricsFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
            public WindowMetricsOrBuilder getWindowMetricsOrBuilder() {
                xa xaVar = this.windowMetricsBuilder_;
                if (xaVar != null) {
                    return (WindowMetricsOrBuilder) xaVar.getMessageOrBuilder();
                }
                WindowMetrics windowMetrics = this.windowMetrics_;
                return windowMetrics == null ? WindowMetrics.getDefaultInstance() : windowMetrics;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
            public boolean hasWindowMetrics() {
                return (this.windowMetricsBuilder_ == null && this.windowMetrics_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_AdRequestMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(AdRequestMetrics.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeWindowMetrics(WindowMetrics windowMetrics) {
                xa xaVar = this.windowMetricsBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(windowMetrics);
                    return this;
                }
                WindowMetrics windowMetrics2 = this.windowMetrics_;
                if (windowMetrics2 != null) {
                    this.windowMetrics_ = WindowMetrics.newBuilder(windowMetrics2).mergeFrom(windowMetrics).buildPartial();
                } else {
                    this.windowMetrics_ = windowMetrics;
                }
                onChanged();
                return this;
            }

            public Builder setAdType(AdType adType) {
                adType.getClass();
                this.adType_ = adType.getNumber();
                onChanged();
                return this;
            }

            public Builder setAdTypeValue(int i10) {
                this.adType_ = i10;
                onChanged();
                return this;
            }

            public Builder setLastTimestamps(int i10, long j10) {
                ensureLastTimestampsIsMutable();
                ((l8) this.lastTimestamps_).setLong(i10, j10);
                onChanged();
                return this;
            }

            public Builder setWindowMetrics(WindowMetrics windowMetrics) {
                xa xaVar = this.windowMetricsBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(windowMetrics);
                    return this;
                }
                windowMetrics.getClass();
                this.windowMetrics_ = windowMetrics;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AdRequestMetrics build() {
                AdRequestMetrics adRequestMetricsBuildPartial = buildPartial();
                if (adRequestMetricsBuildPartial.isInitialized()) {
                    return adRequestMetricsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) adRequestMetricsBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AdRequestMetrics buildPartial() {
                AdRequestMetrics adRequestMetrics = new AdRequestMetrics(this);
                adRequestMetrics.adType_ = this.adType_;
                xa xaVar = this.windowMetricsBuilder_;
                if (xaVar == null) {
                    adRequestMetrics.windowMetrics_ = this.windowMetrics_;
                } else {
                    adRequestMetrics.windowMetrics_ = (WindowMetrics) xaVar.build();
                }
                if ((this.bitField0_ & 1) != 0) {
                    ((e) this.lastTimestamps_).makeImmutable();
                    this.bitField0_ &= -2;
                }
                adRequestMetrics.lastTimestamps_ = this.lastTimestamps_;
                onBuilt();
                return adRequestMetrics;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public AdRequestMetrics getDefaultInstanceForType() {
                return AdRequestMetrics.getDefaultInstance();
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
                this.adType_ = 0;
                if (this.windowMetricsBuilder_ == null) {
                    this.windowMetrics_ = null;
                } else {
                    this.windowMetrics_ = null;
                    this.windowMetricsBuilder_ = null;
                }
                this.lastTimestamps_ = k7.emptyLongList();
                this.bitField0_ &= -2;
                return this;
            }

            public Builder setWindowMetrics(WindowMetrics.Builder builder) {
                xa xaVar = this.windowMetricsBuilder_;
                if (xaVar == null) {
                    this.windowMetrics_ = builder.build();
                    onChanged();
                    return this;
                }
                xaVar.setMessage(builder.build());
                return this;
            }

            private Builder(p6 p6Var) {
                super(p6Var);
                this.adType_ = 0;
                this.lastTimestamps_ = k7.emptyLongList();
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
            /* renamed from: clone */
            public Builder mo500clone() {
                return (Builder) super.mo500clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AdRequestMetrics) {
                    return mergeFrom((AdRequestMetrics) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AdRequestMetrics adRequestMetrics) {
                if (adRequestMetrics == AdRequestMetrics.getDefaultInstance()) {
                    return this;
                }
                if (adRequestMetrics.adType_ != 0) {
                    setAdTypeValue(adRequestMetrics.getAdTypeValue());
                }
                if (adRequestMetrics.hasWindowMetrics()) {
                    mergeWindowMetrics(adRequestMetrics.getWindowMetrics());
                }
                if (!adRequestMetrics.lastTimestamps_.isEmpty()) {
                    if (this.lastTimestamps_.isEmpty()) {
                        this.lastTimestamps_ = adRequestMetrics.lastTimestamps_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureLastTimestampsIsMutable();
                        this.lastTimestamps_.addAll(adRequestMetrics.lastTimestamps_);
                    }
                    onChanged();
                }
                mergeUnknownFields(((k7) adRequestMetrics).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetrics.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetrics.access$17500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$AdRequestMetrics r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetrics) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$AdRequestMetrics r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetrics) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetrics.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$AdRequestMetrics$Builder");
            }
        }

        public static Builder newBuilder(AdRequestMetrics adRequestMetrics) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(adRequestMetrics);
        }

        public static AdRequestMetrics parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (AdRequestMetrics) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private AdRequestMetrics(o6 o6Var) {
            super(o6Var);
            this.lastTimestampsMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AdRequestMetrics parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (AdRequestMetrics) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static AdRequestMetrics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AdRequestMetrics) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public AdRequestMetrics getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static AdRequestMetrics parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (AdRequestMetrics) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AdRequestMetrics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AdRequestMetrics) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        private AdRequestMetrics() {
            this.lastTimestampsMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.adType_ = 0;
            this.lastTimestamps_ = k7.emptyLongList();
        }

        public static AdRequestMetrics parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (AdRequestMetrics) PARSER.parseFrom(bArr, m5Var);
        }

        public static AdRequestMetrics parseFrom(InputStream inputStream) throws IOException {
            return (AdRequestMetrics) k7.parseWithIOException(PARSER, inputStream);
        }

        public static AdRequestMetrics parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (AdRequestMetrics) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        private AdRequestMetrics(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                            if (tag == 8) {
                                this.adType_ = yVar.readEnum();
                            } else if (tag == 18) {
                                WindowMetrics windowMetrics = this.windowMetrics_;
                                WindowMetrics.Builder builder = windowMetrics != null ? windowMetrics.toBuilder() : null;
                                WindowMetrics windowMetrics2 = (WindowMetrics) yVar.readMessage(WindowMetrics.parser(), m5Var);
                                this.windowMetrics_ = windowMetrics2;
                                if (builder != null) {
                                    builder.mergeFrom(windowMetrics2);
                                    this.windowMetrics_ = builder.buildPartial();
                                }
                            } else if (tag == 24) {
                                if (!z11) {
                                    this.lastTimestamps_ = k7.newLongList();
                                    z11 = true;
                                }
                                ((l8) this.lastTimestamps_).addLong(yVar.readInt64());
                            } else if (tag != 26) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                int iPushLimit = yVar.pushLimit(yVar.readRawVarint32());
                                if (!z11 && yVar.getBytesUntilLimit() > 0) {
                                    this.lastTimestamps_ = k7.newLongList();
                                    z11 = true;
                                }
                                while (yVar.getBytesUntilLimit() > 0) {
                                    ((l8) this.lastTimestamps_).addLong(yVar.readInt64());
                                }
                                yVar.popLimit(iPushLimit);
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
                        ((e) this.lastTimestamps_).makeImmutable();
                    }
                    this.unknownFields = ccVarNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z11) {
                ((e) this.lastTimestamps_).makeImmutable();
            }
            this.unknownFields = ccVarNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static AdRequestMetrics parseFrom(y yVar) throws IOException {
            return (AdRequestMetrics) k7.parseWithIOException(PARSER, yVar);
        }

        public static AdRequestMetrics parseFrom(y yVar, m5 m5Var) throws IOException {
            return (AdRequestMetrics) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface AdRequestMetricsOrBuilder extends MessageOrBuilder {
        AdType getAdType();

        int getAdTypeValue();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        long getLastTimestamps(int i10);

        int getLastTimestampsCount();

        List<Long> getLastTimestampsList();

        WindowMetrics getWindowMetrics();

        WindowMetricsOrBuilder getWindowMetricsOrBuilder();

        boolean hasWindowMetrics();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface AdRequestOrBuilder extends MessageOrBuilder {
        AdType getAdType();

        int getAdTypeValue();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        long getTimestamp();

        String getUserId();

        ByteString getUserIdBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum AdType implements ja {
        UNKNOWN(0),
        INTERSTITIAL(1),
        REWARDED(2),
        BANNER(3),
        UNRECOGNIZED(-1);

        public static final int BANNER_VALUE = 3;
        public static final int INTERSTITIAL_VALUE = 1;
        public static final int REWARDED_VALUE = 2;
        public static final int UNKNOWN_VALUE = 0;
        private final int value;
        private static final p7 internalValueMap = new p7() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdType.1
            @Override // com.explorestack.protobuf.p7
            public AdType findValueByNumber(int i10) {
                return AdType.forNumber(i10);
            }
        };
        private static final AdType[] VALUES = values();

        AdType(int i10) {
            this.value = i10;
        }

        public static AdType forNumber(int i10) {
            if (i10 == 0) {
                return UNKNOWN;
            }
            if (i10 == 1) {
                return INTERSTITIAL;
            }
            if (i10 == 2) {
                return REWARDED;
            }
            if (i10 != 3) {
                return null;
            }
            return BANNER;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return SessionMetricsOuterClass.getDescriptor().getEnumTypes().get(0);
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
        public static AdType valueOf(int i10) {
            return forNumber(i10);
        }

        public static AdType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ImpressionMetrics extends k7 implements ImpressionMetricsOrBuilder {
        public static final int AD_TYPE_FIELD_NUMBER = 1;
        public static final int DOMAINS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int adType_;
        private List<DomainMetrics> domains_;
        private byte memoizedIsInitialized;
        private static final ImpressionMetrics DEFAULT_INSTANCE = new ImpressionMetrics();
        private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public ImpressionMetrics parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new ImpressionMetrics(yVar, m5Var);
            }
        };

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class DomainMetrics extends k7 implements DomainMetricsOrBuilder {
            public static final int DOMAIN_FIELD_NUMBER = 1;
            public static final int WINDOW_METRICS_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private volatile Object domain_;
            private byte memoizedIsInitialized;
            private WindowMetrics windowMetrics_;
            private static final DomainMetrics DEFAULT_INSTANCE = new DomainMetrics();
            private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetrics.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public DomainMetrics parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new DomainMetrics(yVar, m5Var);
                }
            };

            public static DomainMetrics getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_ImpressionMetrics_DomainMetrics_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static DomainMetrics parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (DomainMetrics) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static DomainMetrics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (DomainMetrics) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DomainMetrics)) {
                    return super.equals(obj);
                }
                DomainMetrics domainMetrics = (DomainMetrics) obj;
                if (getDomain().equals(domainMetrics.getDomain()) && hasWindowMetrics() == domainMetrics.hasWindowMetrics()) {
                    return (!hasWindowMetrics() || getWindowMetrics().equals(domainMetrics.getWindowMetrics())) && this.unknownFields.equals(domainMetrics.unknownFields);
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetricsOrBuilder
            public String getDomain() {
                Object obj = this.domain_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.domain_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetricsOrBuilder
            public ByteString getDomainBytes() {
                Object obj = this.domain_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.domain_ = byteStringCopyFromUtf8;
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
                int iComputeStringSize = !getDomainBytes().isEmpty() ? k7.computeStringSize(1, this.domain_) : 0;
                if (this.windowMetrics_ != null) {
                    iComputeStringSize += h0.computeMessageSize(2, getWindowMetrics());
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
            public final gc getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetricsOrBuilder
            public WindowMetrics getWindowMetrics() {
                WindowMetrics windowMetrics = this.windowMetrics_;
                return windowMetrics == null ? WindowMetrics.getDefaultInstance() : windowMetrics;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetricsOrBuilder
            public WindowMetricsOrBuilder getWindowMetricsOrBuilder() {
                return getWindowMetrics();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetricsOrBuilder
            public boolean hasWindowMetrics() {
                return this.windowMetrics_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = getDomain().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
                if (hasWindowMetrics()) {
                    iHashCode = getWindowMetrics().hashCode() + o2.B(iHashCode, 37, 2, 53);
                }
                int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.k7
            public i7 internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_ImpressionMetrics_DomainMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(DomainMetrics.class, Builder.class);
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
                return new DomainMetrics();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                if (!getDomainBytes().isEmpty()) {
                    k7.writeString(h0Var, 1, this.domain_);
                }
                if (this.windowMetrics_ != null) {
                    h0Var.writeMessage(2, getWindowMetrics());
                }
                this.unknownFields.writeTo(h0Var);
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends o6 implements DomainMetricsOrBuilder {
                private Object domain_;
                private xa windowMetricsBuilder_;
                private WindowMetrics windowMetrics_;

                private Builder() {
                    super(null);
                    this.domain_ = "";
                    maybeForceBuilderInitialization();
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_ImpressionMetrics_DomainMetrics_descriptor;
                }

                private xa getWindowMetricsFieldBuilder() {
                    if (this.windowMetricsBuilder_ == null) {
                        this.windowMetricsBuilder_ = new xa(getWindowMetrics(), getParentForChildren(), isClean());
                        this.windowMetrics_ = null;
                    }
                    return this.windowMetricsBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = k7.alwaysUseFieldBuilders;
                }

                public Builder clearDomain() {
                    this.domain_ = DomainMetrics.getDefaultInstance().getDomain();
                    onChanged();
                    return this;
                }

                public Builder clearWindowMetrics() {
                    if (this.windowMetricsBuilder_ == null) {
                        this.windowMetrics_ = null;
                        onChanged();
                        return this;
                    }
                    this.windowMetrics_ = null;
                    this.windowMetricsBuilder_ = null;
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_ImpressionMetrics_DomainMetrics_descriptor;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetricsOrBuilder
                public String getDomain() {
                    Object obj = this.domain_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.domain_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetricsOrBuilder
                public ByteString getDomainBytes() {
                    Object obj = this.domain_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.domain_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetricsOrBuilder
                public WindowMetrics getWindowMetrics() {
                    xa xaVar = this.windowMetricsBuilder_;
                    if (xaVar != null) {
                        return (WindowMetrics) xaVar.getMessage();
                    }
                    WindowMetrics windowMetrics = this.windowMetrics_;
                    return windowMetrics == null ? WindowMetrics.getDefaultInstance() : windowMetrics;
                }

                public WindowMetrics.Builder getWindowMetricsBuilder() {
                    onChanged();
                    return (WindowMetrics.Builder) getWindowMetricsFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetricsOrBuilder
                public WindowMetricsOrBuilder getWindowMetricsOrBuilder() {
                    xa xaVar = this.windowMetricsBuilder_;
                    if (xaVar != null) {
                        return (WindowMetricsOrBuilder) xaVar.getMessageOrBuilder();
                    }
                    WindowMetrics windowMetrics = this.windowMetrics_;
                    return windowMetrics == null ? WindowMetrics.getDefaultInstance() : windowMetrics;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetricsOrBuilder
                public boolean hasWindowMetrics() {
                    return (this.windowMetricsBuilder_ == null && this.windowMetrics_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_ImpressionMetrics_DomainMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(DomainMetrics.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeWindowMetrics(WindowMetrics windowMetrics) {
                    xa xaVar = this.windowMetricsBuilder_;
                    if (xaVar != null) {
                        xaVar.mergeFrom(windowMetrics);
                        return this;
                    }
                    WindowMetrics windowMetrics2 = this.windowMetrics_;
                    if (windowMetrics2 != null) {
                        this.windowMetrics_ = WindowMetrics.newBuilder(windowMetrics2).mergeFrom(windowMetrics).buildPartial();
                    } else {
                        this.windowMetrics_ = windowMetrics;
                    }
                    onChanged();
                    return this;
                }

                public Builder setDomain(String str) {
                    str.getClass();
                    this.domain_ = str;
                    onChanged();
                    return this;
                }

                public Builder setDomainBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.domain_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setWindowMetrics(WindowMetrics windowMetrics) {
                    xa xaVar = this.windowMetricsBuilder_;
                    if (xaVar != null) {
                        xaVar.setMessage(windowMetrics);
                        return this;
                    }
                    windowMetrics.getClass();
                    this.windowMetrics_ = windowMetrics;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public DomainMetrics build() {
                    DomainMetrics domainMetricsBuildPartial = buildPartial();
                    if (domainMetricsBuildPartial.isInitialized()) {
                        return domainMetricsBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) domainMetricsBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public DomainMetrics buildPartial() {
                    DomainMetrics domainMetrics = new DomainMetrics(this);
                    domainMetrics.domain_ = this.domain_;
                    xa xaVar = this.windowMetricsBuilder_;
                    if (xaVar == null) {
                        domainMetrics.windowMetrics_ = this.windowMetrics_;
                    } else {
                        domainMetrics.windowMetrics_ = (WindowMetrics) xaVar.build();
                    }
                    onBuilt();
                    return domainMetrics;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public DomainMetrics getDefaultInstanceForType() {
                    return DomainMetrics.getDefaultInstance();
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
                    this.domain_ = "";
                    if (this.windowMetricsBuilder_ == null) {
                        this.windowMetrics_ = null;
                        return this;
                    }
                    this.windowMetrics_ = null;
                    this.windowMetricsBuilder_ = null;
                    return this;
                }

                private Builder(p6 p6Var) {
                    super(p6Var);
                    this.domain_ = "";
                    maybeForceBuilderInitialization();
                }

                public Builder setWindowMetrics(WindowMetrics.Builder builder) {
                    xa xaVar = this.windowMetricsBuilder_;
                    if (xaVar == null) {
                        this.windowMetrics_ = builder.build();
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
                    if (message instanceof DomainMetrics) {
                        return mergeFrom((DomainMetrics) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(DomainMetrics domainMetrics) {
                    if (domainMetrics == DomainMetrics.getDefaultInstance()) {
                        return this;
                    }
                    if (!domainMetrics.getDomain().isEmpty()) {
                        this.domain_ = domainMetrics.domain_;
                        onChanged();
                    }
                    if (domainMetrics.hasWindowMetrics()) {
                        mergeWindowMetrics(domainMetrics.getWindowMetrics());
                    }
                    mergeUnknownFields(((k7) domainMetrics).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetrics.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetrics.access$15100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$ImpressionMetrics$DomainMetrics r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetrics) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$ImpressionMetrics$DomainMetrics r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetrics) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetrics.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$ImpressionMetrics$DomainMetrics$Builder");
                }
            }

            public static Builder newBuilder(DomainMetrics domainMetrics) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(domainMetrics);
            }

            public static DomainMetrics parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (DomainMetrics) PARSER.parseFrom(byteBuffer, m5Var);
            }

            private DomainMetrics(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static DomainMetrics parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (DomainMetrics) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static DomainMetrics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (DomainMetrics) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public DomainMetrics getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static DomainMetrics parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (DomainMetrics) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private DomainMetrics() {
                this.memoizedIsInitialized = (byte) -1;
                this.domain_ = "";
            }

            public static DomainMetrics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (DomainMetrics) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static DomainMetrics parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (DomainMetrics) PARSER.parseFrom(bArr, m5Var);
            }

            public static DomainMetrics parseFrom(InputStream inputStream) throws IOException {
                return (DomainMetrics) k7.parseWithIOException(PARSER, inputStream);
            }

            private DomainMetrics(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                    this.domain_ = yVar.readStringRequireUtf8();
                                } else if (tag != 18) {
                                    if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                    }
                                } else {
                                    WindowMetrics windowMetrics = this.windowMetrics_;
                                    WindowMetrics.Builder builder = windowMetrics != null ? windowMetrics.toBuilder() : null;
                                    WindowMetrics windowMetrics2 = (WindowMetrics) yVar.readMessage(WindowMetrics.parser(), m5Var);
                                    this.windowMetrics_ = windowMetrics2;
                                    if (builder != null) {
                                        builder.mergeFrom(windowMetrics2);
                                        this.windowMetrics_ = builder.buildPartial();
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

            public static DomainMetrics parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (DomainMetrics) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            public static DomainMetrics parseFrom(y yVar) throws IOException {
                return (DomainMetrics) k7.parseWithIOException(PARSER, yVar);
            }

            public static DomainMetrics parseFrom(y yVar, m5 m5Var) throws IOException {
                return (DomainMetrics) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface DomainMetricsOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            String getDomain();

            ByteString getDomainBytes();

            WindowMetrics getWindowMetrics();

            WindowMetricsOrBuilder getWindowMetricsOrBuilder();

            boolean hasWindowMetrics();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static ImpressionMetrics getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_ImpressionMetrics_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ImpressionMetrics parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ImpressionMetrics) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ImpressionMetrics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ImpressionMetrics) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ImpressionMetrics)) {
                return super.equals(obj);
            }
            ImpressionMetrics impressionMetrics = (ImpressionMetrics) obj;
            return this.adType_ == impressionMetrics.adType_ && getDomainsList().equals(impressionMetrics.getDomainsList()) && this.unknownFields.equals(impressionMetrics.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetricsOrBuilder
        public AdType getAdType() {
            AdType adTypeValueOf = AdType.valueOf(this.adType_);
            return adTypeValueOf == null ? AdType.UNRECOGNIZED : adTypeValueOf;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetricsOrBuilder
        public int getAdTypeValue() {
            return this.adType_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetricsOrBuilder
        public DomainMetrics getDomains(int i10) {
            return this.domains_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetricsOrBuilder
        public int getDomainsCount() {
            return this.domains_.size();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetricsOrBuilder
        public List<DomainMetrics> getDomainsList() {
            return this.domains_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetricsOrBuilder
        public DomainMetricsOrBuilder getDomainsOrBuilder(int i10) {
            return this.domains_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetricsOrBuilder
        public List<? extends DomainMetricsOrBuilder> getDomainsOrBuilderList() {
            return this.domains_;
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
            int iComputeEnumSize = this.adType_ != AdType.UNKNOWN.getNumber() ? h0.computeEnumSize(1, this.adType_) : 0;
            for (int i11 = 0; i11 < this.domains_.size(); i11++) {
                iComputeEnumSize += h0.computeMessageSize(2, this.domains_.get(i11));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeEnumSize;
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
            int iHashCode = ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53) + this.adType_;
            if (getDomainsCount() > 0) {
                iHashCode = o2.B(iHashCode, 37, 2, 53) + getDomainsList().hashCode();
            }
            int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_ImpressionMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(ImpressionMetrics.class, Builder.class);
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
            return new ImpressionMetrics();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            if (this.adType_ != AdType.UNKNOWN.getNumber()) {
                h0Var.writeEnum(1, this.adType_);
            }
            for (int i10 = 0; i10 < this.domains_.size(); i10++) {
                h0Var.writeMessage(2, this.domains_.get(i10));
            }
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements ImpressionMetricsOrBuilder {
            private int adType_;
            private int bitField0_;
            private pa domainsBuilder_;
            private List<DomainMetrics> domains_;

            private Builder() {
                super(null);
                this.adType_ = 0;
                this.domains_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private void ensureDomainsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.domains_ = new ArrayList(this.domains_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_ImpressionMetrics_descriptor;
            }

            private pa getDomainsFieldBuilder() {
                if (this.domainsBuilder_ == null) {
                    this.domainsBuilder_ = new pa(this.domains_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.domains_ = null;
                }
                return this.domainsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (k7.alwaysUseFieldBuilders) {
                    getDomainsFieldBuilder();
                }
            }

            public Builder addAllDomains(Iterable<? extends DomainMetrics> iterable) {
                pa paVar = this.domainsBuilder_;
                if (paVar != null) {
                    paVar.addAllMessages(iterable);
                    return this;
                }
                ensureDomainsIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.domains_);
                onChanged();
                return this;
            }

            public Builder addDomains(DomainMetrics domainMetrics) {
                pa paVar = this.domainsBuilder_;
                if (paVar != null) {
                    paVar.addMessage(domainMetrics);
                    return this;
                }
                domainMetrics.getClass();
                ensureDomainsIsMutable();
                this.domains_.add(domainMetrics);
                onChanged();
                return this;
            }

            public DomainMetrics.Builder addDomainsBuilder() {
                return (DomainMetrics.Builder) getDomainsFieldBuilder().addBuilder(DomainMetrics.getDefaultInstance());
            }

            public Builder clearAdType() {
                this.adType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDomains() {
                pa paVar = this.domainsBuilder_;
                if (paVar != null) {
                    paVar.clear();
                    return this;
                }
                this.domains_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetricsOrBuilder
            public AdType getAdType() {
                AdType adTypeValueOf = AdType.valueOf(this.adType_);
                return adTypeValueOf == null ? AdType.UNRECOGNIZED : adTypeValueOf;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetricsOrBuilder
            public int getAdTypeValue() {
                return this.adType_;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_ImpressionMetrics_descriptor;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetricsOrBuilder
            public DomainMetrics getDomains(int i10) {
                pa paVar = this.domainsBuilder_;
                return paVar == null ? this.domains_.get(i10) : (DomainMetrics) paVar.getMessage(i10);
            }

            public DomainMetrics.Builder getDomainsBuilder(int i10) {
                return (DomainMetrics.Builder) getDomainsFieldBuilder().getBuilder(i10);
            }

            public List<DomainMetrics.Builder> getDomainsBuilderList() {
                return getDomainsFieldBuilder().getBuilderList();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetricsOrBuilder
            public int getDomainsCount() {
                pa paVar = this.domainsBuilder_;
                return paVar == null ? this.domains_.size() : paVar.getCount();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetricsOrBuilder
            public List<DomainMetrics> getDomainsList() {
                pa paVar = this.domainsBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.domains_) : paVar.getMessageList();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetricsOrBuilder
            public DomainMetricsOrBuilder getDomainsOrBuilder(int i10) {
                pa paVar = this.domainsBuilder_;
                return paVar == null ? this.domains_.get(i10) : (DomainMetricsOrBuilder) paVar.getMessageOrBuilder(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetricsOrBuilder
            public List<? extends DomainMetricsOrBuilder> getDomainsOrBuilderList() {
                pa paVar = this.domainsBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.domains_);
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_ImpressionMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(ImpressionMetrics.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder removeDomains(int i10) {
                pa paVar = this.domainsBuilder_;
                if (paVar != null) {
                    paVar.remove(i10);
                    return this;
                }
                ensureDomainsIsMutable();
                this.domains_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setAdType(AdType adType) {
                adType.getClass();
                this.adType_ = adType.getNumber();
                onChanged();
                return this;
            }

            public Builder setAdTypeValue(int i10) {
                this.adType_ = i10;
                onChanged();
                return this;
            }

            public Builder setDomains(int i10, DomainMetrics domainMetrics) {
                pa paVar = this.domainsBuilder_;
                if (paVar != null) {
                    paVar.setMessage(i10, domainMetrics);
                    return this;
                }
                domainMetrics.getClass();
                ensureDomainsIsMutable();
                this.domains_.set(i10, domainMetrics);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public ImpressionMetrics build() {
                ImpressionMetrics impressionMetricsBuildPartial = buildPartial();
                if (impressionMetricsBuildPartial.isInitialized()) {
                    return impressionMetricsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) impressionMetricsBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public ImpressionMetrics buildPartial() {
                ImpressionMetrics impressionMetrics = new ImpressionMetrics(this);
                impressionMetrics.adType_ = this.adType_;
                pa paVar = this.domainsBuilder_;
                if (paVar != null) {
                    impressionMetrics.domains_ = paVar.build();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.domains_ = Collections.unmodifiableList(this.domains_);
                        this.bitField0_ &= -2;
                    }
                    impressionMetrics.domains_ = this.domains_;
                }
                onBuilt();
                return impressionMetrics;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public ImpressionMetrics getDefaultInstanceForType() {
                return ImpressionMetrics.getDefaultInstance();
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

            public DomainMetrics.Builder addDomainsBuilder(int i10) {
                return (DomainMetrics.Builder) getDomainsFieldBuilder().addBuilder(i10, DomainMetrics.getDefaultInstance());
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
                this.adType_ = 0;
                pa paVar = this.domainsBuilder_;
                if (paVar == null) {
                    this.domains_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    return this;
                }
                paVar.clear();
                return this;
            }

            private Builder(p6 p6Var) {
                super(p6Var);
                this.adType_ = 0;
                this.domains_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder addDomains(int i10, DomainMetrics domainMetrics) {
                pa paVar = this.domainsBuilder_;
                if (paVar == null) {
                    domainMetrics.getClass();
                    ensureDomainsIsMutable();
                    this.domains_.add(i10, domainMetrics);
                    onChanged();
                    return this;
                }
                paVar.addMessage(i10, domainMetrics);
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
            /* renamed from: clone */
            public Builder mo500clone() {
                return (Builder) super.mo500clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ImpressionMetrics) {
                    return mergeFrom((ImpressionMetrics) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setDomains(int i10, DomainMetrics.Builder builder) {
                pa paVar = this.domainsBuilder_;
                if (paVar == null) {
                    ensureDomainsIsMutable();
                    this.domains_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                paVar.setMessage(i10, builder.build());
                return this;
            }

            public Builder mergeFrom(ImpressionMetrics impressionMetrics) {
                if (impressionMetrics == ImpressionMetrics.getDefaultInstance()) {
                    return this;
                }
                if (impressionMetrics.adType_ != 0) {
                    setAdTypeValue(impressionMetrics.getAdTypeValue());
                }
                if (this.domainsBuilder_ == null) {
                    if (!impressionMetrics.domains_.isEmpty()) {
                        if (this.domains_.isEmpty()) {
                            this.domains_ = impressionMetrics.domains_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureDomainsIsMutable();
                            this.domains_.addAll(impressionMetrics.domains_);
                        }
                        onChanged();
                    }
                } else if (!impressionMetrics.domains_.isEmpty()) {
                    if (!this.domainsBuilder_.isEmpty()) {
                        this.domainsBuilder_.addAllMessages(impressionMetrics.domains_);
                    } else {
                        this.domainsBuilder_.dispose();
                        this.domainsBuilder_ = null;
                        this.domains_ = impressionMetrics.domains_;
                        this.bitField0_ &= -2;
                        this.domainsBuilder_ = k7.alwaysUseFieldBuilders ? getDomainsFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((k7) impressionMetrics).unknownFields);
                onChanged();
                return this;
            }

            public Builder addDomains(DomainMetrics.Builder builder) {
                pa paVar = this.domainsBuilder_;
                if (paVar == null) {
                    ensureDomainsIsMutable();
                    this.domains_.add(builder.build());
                    onChanged();
                    return this;
                }
                paVar.addMessage(builder.build());
                return this;
            }

            public Builder addDomains(int i10, DomainMetrics.Builder builder) {
                pa paVar = this.domainsBuilder_;
                if (paVar == null) {
                    ensureDomainsIsMutable();
                    this.domains_.add(i10, builder.build());
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
            public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.access$16200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$ImpressionMetrics r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$ImpressionMetrics r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$ImpressionMetrics$Builder");
            }
        }

        public static Builder newBuilder(ImpressionMetrics impressionMetrics) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(impressionMetrics);
        }

        public static ImpressionMetrics parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (ImpressionMetrics) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private ImpressionMetrics(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ImpressionMetrics parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (ImpressionMetrics) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static ImpressionMetrics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ImpressionMetrics) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public ImpressionMetrics getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static ImpressionMetrics parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (ImpressionMetrics) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ImpressionMetrics() {
            this.memoizedIsInitialized = (byte) -1;
            this.adType_ = 0;
            this.domains_ = Collections.EMPTY_LIST;
        }

        public static ImpressionMetrics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ImpressionMetrics) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static ImpressionMetrics parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (ImpressionMetrics) PARSER.parseFrom(bArr, m5Var);
        }

        public static ImpressionMetrics parseFrom(InputStream inputStream) throws IOException {
            return (ImpressionMetrics) k7.parseWithIOException(PARSER, inputStream);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private ImpressionMetrics(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                            if (tag == 8) {
                                this.adType_ = yVar.readEnum();
                            } else if (tag != 18) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                if (!z11) {
                                    this.domains_ = new ArrayList();
                                    z11 = true;
                                }
                                this.domains_.add(yVar.readMessage(DomainMetrics.parser(), m5Var));
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
                        this.domains_ = Collections.unmodifiableList(this.domains_);
                    }
                    this.unknownFields = ccVarNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z11) {
                this.domains_ = Collections.unmodifiableList(this.domains_);
            }
            this.unknownFields = ccVarNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static ImpressionMetrics parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (ImpressionMetrics) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static ImpressionMetrics parseFrom(y yVar) throws IOException {
            return (ImpressionMetrics) k7.parseWithIOException(PARSER, yVar);
        }

        public static ImpressionMetrics parseFrom(y yVar, m5 m5Var) throws IOException {
            return (ImpressionMetrics) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ImpressionMetricsOrBuilder extends MessageOrBuilder {
        AdType getAdType();

        int getAdTypeValue();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        ImpressionMetrics.DomainMetrics getDomains(int i10);

        int getDomainsCount();

        List<ImpressionMetrics.DomainMetrics> getDomainsList();

        ImpressionMetrics.DomainMetricsOrBuilder getDomainsOrBuilder(int i10);

        List<? extends ImpressionMetrics.DomainMetricsOrBuilder> getDomainsOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class SessionMetrics extends k7 implements SessionMetricsOrBuilder {
        public static final int AD_REQUESTS_FIELD_NUMBER = 2;
        public static final int CURRENT_SESSION_FIELD_NUMBER = 3;
        public static final int IMPRESSIONS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<AdRequestMetrics> adRequests_;
        private UserSession currentSession_;
        private List<ImpressionMetrics> impressions_;
        private byte memoizedIsInitialized;
        private static final SessionMetrics DEFAULT_INSTANCE = new SessionMetrics();
        private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetrics.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public SessionMetrics parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new SessionMetrics(yVar, m5Var);
            }
        };

        public static SessionMetrics getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_SessionMetrics_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SessionMetrics parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SessionMetrics) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SessionMetrics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SessionMetrics) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SessionMetrics)) {
                return super.equals(obj);
            }
            SessionMetrics sessionMetrics = (SessionMetrics) obj;
            if (getImpressionsList().equals(sessionMetrics.getImpressionsList()) && getAdRequestsList().equals(sessionMetrics.getAdRequestsList()) && hasCurrentSession() == sessionMetrics.hasCurrentSession()) {
                return (!hasCurrentSession() || getCurrentSession().equals(sessionMetrics.getCurrentSession())) && this.unknownFields.equals(sessionMetrics.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
        public AdRequestMetrics getAdRequests(int i10) {
            return this.adRequests_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
        public int getAdRequestsCount() {
            return this.adRequests_.size();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
        public List<AdRequestMetrics> getAdRequestsList() {
            return this.adRequests_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
        public AdRequestMetricsOrBuilder getAdRequestsOrBuilder(int i10) {
            return this.adRequests_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
        public List<? extends AdRequestMetricsOrBuilder> getAdRequestsOrBuilderList() {
            return this.adRequests_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
        public UserSession getCurrentSession() {
            UserSession userSession = this.currentSession_;
            return userSession == null ? UserSession.getDefaultInstance() : userSession;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
        public UserSessionOrBuilder getCurrentSessionOrBuilder() {
            return getCurrentSession();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
        public ImpressionMetrics getImpressions(int i10) {
            return this.impressions_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
        public int getImpressionsCount() {
            return this.impressions_.size();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
        public List<ImpressionMetrics> getImpressionsList() {
            return this.impressions_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
        public ImpressionMetricsOrBuilder getImpressionsOrBuilder(int i10) {
            return this.impressions_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
        public List<? extends ImpressionMetricsOrBuilder> getImpressionsOrBuilderList() {
            return this.impressions_;
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
            for (int i11 = 0; i11 < this.impressions_.size(); i11++) {
                iComputeMessageSize += h0.computeMessageSize(1, this.impressions_.get(i11));
            }
            for (int i12 = 0; i12 < this.adRequests_.size(); i12++) {
                iComputeMessageSize += h0.computeMessageSize(2, this.adRequests_.get(i12));
            }
            if (this.currentSession_ != null) {
                iComputeMessageSize += h0.computeMessageSize(3, getCurrentSession());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
        public final gc getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
        public boolean hasCurrentSession() {
            return this.currentSession_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getImpressionsCount() > 0) {
                iHashCode = o2.B(iHashCode, 37, 1, 53) + getImpressionsList().hashCode();
            }
            if (getAdRequestsCount() > 0) {
                iHashCode = o2.B(iHashCode, 37, 2, 53) + getAdRequestsList().hashCode();
            }
            if (hasCurrentSession()) {
                iHashCode = o2.B(iHashCode, 37, 3, 53) + getCurrentSession().hashCode();
            }
            int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_SessionMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(SessionMetrics.class, Builder.class);
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
            return new SessionMetrics();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            for (int i10 = 0; i10 < this.impressions_.size(); i10++) {
                h0Var.writeMessage(1, this.impressions_.get(i10));
            }
            for (int i11 = 0; i11 < this.adRequests_.size(); i11++) {
                h0Var.writeMessage(2, this.adRequests_.get(i11));
            }
            if (this.currentSession_ != null) {
                h0Var.writeMessage(3, getCurrentSession());
            }
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements SessionMetricsOrBuilder {
            private pa adRequestsBuilder_;
            private List<AdRequestMetrics> adRequests_;
            private int bitField0_;
            private xa currentSessionBuilder_;
            private UserSession currentSession_;
            private pa impressionsBuilder_;
            private List<ImpressionMetrics> impressions_;

            private Builder() {
                super(null);
                List list = Collections.EMPTY_LIST;
                this.impressions_ = list;
                this.adRequests_ = list;
                maybeForceBuilderInitialization();
            }

            private void ensureAdRequestsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.adRequests_ = new ArrayList(this.adRequests_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureImpressionsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.impressions_ = new ArrayList(this.impressions_);
                    this.bitField0_ |= 1;
                }
            }

            private pa getAdRequestsFieldBuilder() {
                if (this.adRequestsBuilder_ == null) {
                    this.adRequestsBuilder_ = new pa(this.adRequests_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.adRequests_ = null;
                }
                return this.adRequestsBuilder_;
            }

            private xa getCurrentSessionFieldBuilder() {
                if (this.currentSessionBuilder_ == null) {
                    this.currentSessionBuilder_ = new xa(getCurrentSession(), getParentForChildren(), isClean());
                    this.currentSession_ = null;
                }
                return this.currentSessionBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_SessionMetrics_descriptor;
            }

            private pa getImpressionsFieldBuilder() {
                if (this.impressionsBuilder_ == null) {
                    this.impressionsBuilder_ = new pa(this.impressions_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.impressions_ = null;
                }
                return this.impressionsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (k7.alwaysUseFieldBuilders) {
                    getImpressionsFieldBuilder();
                    getAdRequestsFieldBuilder();
                }
            }

            public Builder addAdRequests(AdRequestMetrics adRequestMetrics) {
                pa paVar = this.adRequestsBuilder_;
                if (paVar != null) {
                    paVar.addMessage(adRequestMetrics);
                    return this;
                }
                adRequestMetrics.getClass();
                ensureAdRequestsIsMutable();
                this.adRequests_.add(adRequestMetrics);
                onChanged();
                return this;
            }

            public AdRequestMetrics.Builder addAdRequestsBuilder() {
                return (AdRequestMetrics.Builder) getAdRequestsFieldBuilder().addBuilder(AdRequestMetrics.getDefaultInstance());
            }

            public Builder addAllAdRequests(Iterable<? extends AdRequestMetrics> iterable) {
                pa paVar = this.adRequestsBuilder_;
                if (paVar != null) {
                    paVar.addAllMessages(iterable);
                    return this;
                }
                ensureAdRequestsIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.adRequests_);
                onChanged();
                return this;
            }

            public Builder addAllImpressions(Iterable<? extends ImpressionMetrics> iterable) {
                pa paVar = this.impressionsBuilder_;
                if (paVar != null) {
                    paVar.addAllMessages(iterable);
                    return this;
                }
                ensureImpressionsIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.impressions_);
                onChanged();
                return this;
            }

            public Builder addImpressions(ImpressionMetrics impressionMetrics) {
                pa paVar = this.impressionsBuilder_;
                if (paVar != null) {
                    paVar.addMessage(impressionMetrics);
                    return this;
                }
                impressionMetrics.getClass();
                ensureImpressionsIsMutable();
                this.impressions_.add(impressionMetrics);
                onChanged();
                return this;
            }

            public ImpressionMetrics.Builder addImpressionsBuilder() {
                return (ImpressionMetrics.Builder) getImpressionsFieldBuilder().addBuilder(ImpressionMetrics.getDefaultInstance());
            }

            public Builder clearAdRequests() {
                pa paVar = this.adRequestsBuilder_;
                if (paVar != null) {
                    paVar.clear();
                    return this;
                }
                this.adRequests_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearCurrentSession() {
                if (this.currentSessionBuilder_ == null) {
                    this.currentSession_ = null;
                    onChanged();
                    return this;
                }
                this.currentSession_ = null;
                this.currentSessionBuilder_ = null;
                return this;
            }

            public Builder clearImpressions() {
                pa paVar = this.impressionsBuilder_;
                if (paVar != null) {
                    paVar.clear();
                    return this;
                }
                this.impressions_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
            public AdRequestMetrics getAdRequests(int i10) {
                pa paVar = this.adRequestsBuilder_;
                return paVar == null ? this.adRequests_.get(i10) : (AdRequestMetrics) paVar.getMessage(i10);
            }

            public AdRequestMetrics.Builder getAdRequestsBuilder(int i10) {
                return (AdRequestMetrics.Builder) getAdRequestsFieldBuilder().getBuilder(i10);
            }

            public List<AdRequestMetrics.Builder> getAdRequestsBuilderList() {
                return getAdRequestsFieldBuilder().getBuilderList();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
            public int getAdRequestsCount() {
                pa paVar = this.adRequestsBuilder_;
                return paVar == null ? this.adRequests_.size() : paVar.getCount();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
            public List<AdRequestMetrics> getAdRequestsList() {
                pa paVar = this.adRequestsBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.adRequests_) : paVar.getMessageList();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
            public AdRequestMetricsOrBuilder getAdRequestsOrBuilder(int i10) {
                pa paVar = this.adRequestsBuilder_;
                return paVar == null ? this.adRequests_.get(i10) : (AdRequestMetricsOrBuilder) paVar.getMessageOrBuilder(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
            public List<? extends AdRequestMetricsOrBuilder> getAdRequestsOrBuilderList() {
                pa paVar = this.adRequestsBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.adRequests_);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
            public UserSession getCurrentSession() {
                xa xaVar = this.currentSessionBuilder_;
                if (xaVar != null) {
                    return (UserSession) xaVar.getMessage();
                }
                UserSession userSession = this.currentSession_;
                return userSession == null ? UserSession.getDefaultInstance() : userSession;
            }

            public UserSession.Builder getCurrentSessionBuilder() {
                onChanged();
                return (UserSession.Builder) getCurrentSessionFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
            public UserSessionOrBuilder getCurrentSessionOrBuilder() {
                xa xaVar = this.currentSessionBuilder_;
                if (xaVar != null) {
                    return (UserSessionOrBuilder) xaVar.getMessageOrBuilder();
                }
                UserSession userSession = this.currentSession_;
                return userSession == null ? UserSession.getDefaultInstance() : userSession;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_SessionMetrics_descriptor;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
            public ImpressionMetrics getImpressions(int i10) {
                pa paVar = this.impressionsBuilder_;
                return paVar == null ? this.impressions_.get(i10) : (ImpressionMetrics) paVar.getMessage(i10);
            }

            public ImpressionMetrics.Builder getImpressionsBuilder(int i10) {
                return (ImpressionMetrics.Builder) getImpressionsFieldBuilder().getBuilder(i10);
            }

            public List<ImpressionMetrics.Builder> getImpressionsBuilderList() {
                return getImpressionsFieldBuilder().getBuilderList();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
            public int getImpressionsCount() {
                pa paVar = this.impressionsBuilder_;
                return paVar == null ? this.impressions_.size() : paVar.getCount();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
            public List<ImpressionMetrics> getImpressionsList() {
                pa paVar = this.impressionsBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.impressions_) : paVar.getMessageList();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
            public ImpressionMetricsOrBuilder getImpressionsOrBuilder(int i10) {
                pa paVar = this.impressionsBuilder_;
                return paVar == null ? this.impressions_.get(i10) : (ImpressionMetricsOrBuilder) paVar.getMessageOrBuilder(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
            public List<? extends ImpressionMetricsOrBuilder> getImpressionsOrBuilderList() {
                pa paVar = this.impressionsBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.impressions_);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
            public boolean hasCurrentSession() {
                return (this.currentSessionBuilder_ == null && this.currentSession_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_SessionMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(SessionMetrics.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCurrentSession(UserSession userSession) {
                xa xaVar = this.currentSessionBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(userSession);
                    return this;
                }
                UserSession userSession2 = this.currentSession_;
                if (userSession2 != null) {
                    this.currentSession_ = UserSession.newBuilder(userSession2).mergeFrom(userSession).buildPartial();
                } else {
                    this.currentSession_ = userSession;
                }
                onChanged();
                return this;
            }

            public Builder removeAdRequests(int i10) {
                pa paVar = this.adRequestsBuilder_;
                if (paVar != null) {
                    paVar.remove(i10);
                    return this;
                }
                ensureAdRequestsIsMutable();
                this.adRequests_.remove(i10);
                onChanged();
                return this;
            }

            public Builder removeImpressions(int i10) {
                pa paVar = this.impressionsBuilder_;
                if (paVar != null) {
                    paVar.remove(i10);
                    return this;
                }
                ensureImpressionsIsMutable();
                this.impressions_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setAdRequests(int i10, AdRequestMetrics adRequestMetrics) {
                pa paVar = this.adRequestsBuilder_;
                if (paVar != null) {
                    paVar.setMessage(i10, adRequestMetrics);
                    return this;
                }
                adRequestMetrics.getClass();
                ensureAdRequestsIsMutable();
                this.adRequests_.set(i10, adRequestMetrics);
                onChanged();
                return this;
            }

            public Builder setCurrentSession(UserSession userSession) {
                xa xaVar = this.currentSessionBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(userSession);
                    return this;
                }
                userSession.getClass();
                this.currentSession_ = userSession;
                onChanged();
                return this;
            }

            public Builder setImpressions(int i10, ImpressionMetrics impressionMetrics) {
                pa paVar = this.impressionsBuilder_;
                if (paVar != null) {
                    paVar.setMessage(i10, impressionMetrics);
                    return this;
                }
                impressionMetrics.getClass();
                ensureImpressionsIsMutable();
                this.impressions_.set(i10, impressionMetrics);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public SessionMetrics build() {
                SessionMetrics sessionMetricsBuildPartial = buildPartial();
                if (sessionMetricsBuildPartial.isInitialized()) {
                    return sessionMetricsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sessionMetricsBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public SessionMetrics buildPartial() {
                SessionMetrics sessionMetrics = new SessionMetrics(this);
                int i10 = this.bitField0_;
                pa paVar = this.impressionsBuilder_;
                if (paVar == null) {
                    if ((i10 & 1) != 0) {
                        this.impressions_ = Collections.unmodifiableList(this.impressions_);
                        this.bitField0_ &= -2;
                    }
                    sessionMetrics.impressions_ = this.impressions_;
                } else {
                    sessionMetrics.impressions_ = paVar.build();
                }
                pa paVar2 = this.adRequestsBuilder_;
                if (paVar2 != null) {
                    sessionMetrics.adRequests_ = paVar2.build();
                } else {
                    if ((this.bitField0_ & 2) != 0) {
                        this.adRequests_ = Collections.unmodifiableList(this.adRequests_);
                        this.bitField0_ &= -3;
                    }
                    sessionMetrics.adRequests_ = this.adRequests_;
                }
                xa xaVar = this.currentSessionBuilder_;
                if (xaVar == null) {
                    sessionMetrics.currentSession_ = this.currentSession_;
                } else {
                    sessionMetrics.currentSession_ = (UserSession) xaVar.build();
                }
                onBuilt();
                return sessionMetrics;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public SessionMetrics getDefaultInstanceForType() {
                return SessionMetrics.getDefaultInstance();
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

            public AdRequestMetrics.Builder addAdRequestsBuilder(int i10) {
                return (AdRequestMetrics.Builder) getAdRequestsFieldBuilder().addBuilder(i10, AdRequestMetrics.getDefaultInstance());
            }

            public ImpressionMetrics.Builder addImpressionsBuilder(int i10) {
                return (ImpressionMetrics.Builder) getImpressionsFieldBuilder().addBuilder(i10, ImpressionMetrics.getDefaultInstance());
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
                pa paVar = this.impressionsBuilder_;
                if (paVar == null) {
                    this.impressions_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                } else {
                    paVar.clear();
                }
                pa paVar2 = this.adRequestsBuilder_;
                if (paVar2 == null) {
                    this.adRequests_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -3;
                } else {
                    paVar2.clear();
                }
                if (this.currentSessionBuilder_ == null) {
                    this.currentSession_ = null;
                    return this;
                }
                this.currentSession_ = null;
                this.currentSessionBuilder_ = null;
                return this;
            }

            public Builder setCurrentSession(UserSession.Builder builder) {
                xa xaVar = this.currentSessionBuilder_;
                if (xaVar == null) {
                    this.currentSession_ = builder.build();
                    onChanged();
                    return this;
                }
                xaVar.setMessage(builder.build());
                return this;
            }

            private Builder(p6 p6Var) {
                super(p6Var);
                List list = Collections.EMPTY_LIST;
                this.impressions_ = list;
                this.adRequests_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder addAdRequests(int i10, AdRequestMetrics adRequestMetrics) {
                pa paVar = this.adRequestsBuilder_;
                if (paVar == null) {
                    adRequestMetrics.getClass();
                    ensureAdRequestsIsMutable();
                    this.adRequests_.add(i10, adRequestMetrics);
                    onChanged();
                    return this;
                }
                paVar.addMessage(i10, adRequestMetrics);
                return this;
            }

            public Builder addImpressions(int i10, ImpressionMetrics impressionMetrics) {
                pa paVar = this.impressionsBuilder_;
                if (paVar == null) {
                    impressionMetrics.getClass();
                    ensureImpressionsIsMutable();
                    this.impressions_.add(i10, impressionMetrics);
                    onChanged();
                    return this;
                }
                paVar.addMessage(i10, impressionMetrics);
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
            /* renamed from: clone */
            public Builder mo500clone() {
                return (Builder) super.mo500clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SessionMetrics) {
                    return mergeFrom((SessionMetrics) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setAdRequests(int i10, AdRequestMetrics.Builder builder) {
                pa paVar = this.adRequestsBuilder_;
                if (paVar == null) {
                    ensureAdRequestsIsMutable();
                    this.adRequests_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                paVar.setMessage(i10, builder.build());
                return this;
            }

            public Builder setImpressions(int i10, ImpressionMetrics.Builder builder) {
                pa paVar = this.impressionsBuilder_;
                if (paVar == null) {
                    ensureImpressionsIsMutable();
                    this.impressions_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                paVar.setMessage(i10, builder.build());
                return this;
            }

            public Builder mergeFrom(SessionMetrics sessionMetrics) {
                if (sessionMetrics == SessionMetrics.getDefaultInstance()) {
                    return this;
                }
                if (this.impressionsBuilder_ == null) {
                    if (!sessionMetrics.impressions_.isEmpty()) {
                        if (this.impressions_.isEmpty()) {
                            this.impressions_ = sessionMetrics.impressions_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureImpressionsIsMutable();
                            this.impressions_.addAll(sessionMetrics.impressions_);
                        }
                        onChanged();
                    }
                } else if (!sessionMetrics.impressions_.isEmpty()) {
                    if (!this.impressionsBuilder_.isEmpty()) {
                        this.impressionsBuilder_.addAllMessages(sessionMetrics.impressions_);
                    } else {
                        this.impressionsBuilder_.dispose();
                        this.impressionsBuilder_ = null;
                        this.impressions_ = sessionMetrics.impressions_;
                        this.bitField0_ &= -2;
                        this.impressionsBuilder_ = k7.alwaysUseFieldBuilders ? getImpressionsFieldBuilder() : null;
                    }
                }
                if (this.adRequestsBuilder_ == null) {
                    if (!sessionMetrics.adRequests_.isEmpty()) {
                        if (this.adRequests_.isEmpty()) {
                            this.adRequests_ = sessionMetrics.adRequests_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureAdRequestsIsMutable();
                            this.adRequests_.addAll(sessionMetrics.adRequests_);
                        }
                        onChanged();
                    }
                } else if (!sessionMetrics.adRequests_.isEmpty()) {
                    if (!this.adRequestsBuilder_.isEmpty()) {
                        this.adRequestsBuilder_.addAllMessages(sessionMetrics.adRequests_);
                    } else {
                        this.adRequestsBuilder_.dispose();
                        this.adRequestsBuilder_ = null;
                        this.adRequests_ = sessionMetrics.adRequests_;
                        this.bitField0_ &= -3;
                        this.adRequestsBuilder_ = k7.alwaysUseFieldBuilders ? getAdRequestsFieldBuilder() : null;
                    }
                }
                if (sessionMetrics.hasCurrentSession()) {
                    mergeCurrentSession(sessionMetrics.getCurrentSession());
                }
                mergeUnknownFields(((k7) sessionMetrics).unknownFields);
                onChanged();
                return this;
            }

            public Builder addAdRequests(AdRequestMetrics.Builder builder) {
                pa paVar = this.adRequestsBuilder_;
                if (paVar == null) {
                    ensureAdRequestsIsMutable();
                    this.adRequests_.add(builder.build());
                    onChanged();
                    return this;
                }
                paVar.addMessage(builder.build());
                return this;
            }

            public Builder addImpressions(ImpressionMetrics.Builder builder) {
                pa paVar = this.impressionsBuilder_;
                if (paVar == null) {
                    ensureImpressionsIsMutable();
                    this.impressions_.add(builder.build());
                    onChanged();
                    return this;
                }
                paVar.addMessage(builder.build());
                return this;
            }

            public Builder addAdRequests(int i10, AdRequestMetrics.Builder builder) {
                pa paVar = this.adRequestsBuilder_;
                if (paVar == null) {
                    ensureAdRequestsIsMutable();
                    this.adRequests_.add(i10, builder.build());
                    onChanged();
                    return this;
                }
                paVar.addMessage(i10, builder.build());
                return this;
            }

            public Builder addImpressions(int i10, ImpressionMetrics.Builder builder) {
                pa paVar = this.impressionsBuilder_;
                if (paVar == null) {
                    ensureImpressionsIsMutable();
                    this.impressions_.add(i10, builder.build());
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
            public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetrics.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetrics.access$19200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$SessionMetrics r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetrics) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$SessionMetrics r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetrics) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetrics.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$SessionMetrics$Builder");
            }
        }

        public static Builder newBuilder(SessionMetrics sessionMetrics) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sessionMetrics);
        }

        public static SessionMetrics parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (SessionMetrics) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private SessionMetrics(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SessionMetrics parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (SessionMetrics) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static SessionMetrics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SessionMetrics) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public SessionMetrics getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SessionMetrics parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (SessionMetrics) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SessionMetrics() {
            this.memoizedIsInitialized = (byte) -1;
            List list = Collections.EMPTY_LIST;
            this.impressions_ = list;
            this.adRequests_ = list;
        }

        public static SessionMetrics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SessionMetrics) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static SessionMetrics parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (SessionMetrics) PARSER.parseFrom(bArr, m5Var);
        }

        public static SessionMetrics parseFrom(InputStream inputStream) throws IOException {
            return (SessionMetrics) k7.parseWithIOException(PARSER, inputStream);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private SessionMetrics(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                        this.impressions_ = new ArrayList();
                                        i10 |= 1;
                                    }
                                    this.impressions_.add(yVar.readMessage(ImpressionMetrics.parser(), m5Var));
                                } else if (tag == 18) {
                                    if ((i10 & 2) == 0) {
                                        this.adRequests_ = new ArrayList();
                                        i10 |= 2;
                                    }
                                    this.adRequests_.add(yVar.readMessage(AdRequestMetrics.parser(), m5Var));
                                } else if (tag != 26) {
                                    if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                    }
                                } else {
                                    UserSession userSession = this.currentSession_;
                                    UserSession.Builder builder = userSession != null ? userSession.toBuilder() : null;
                                    UserSession userSession2 = (UserSession) yVar.readMessage(UserSession.parser(), m5Var);
                                    this.currentSession_ = userSession2;
                                    if (builder != null) {
                                        builder.mergeFrom(userSession2);
                                        this.currentSession_ = builder.buildPartial();
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
                        this.impressions_ = Collections.unmodifiableList(this.impressions_);
                    }
                    if ((i10 & 2) != 0) {
                        this.adRequests_ = Collections.unmodifiableList(this.adRequests_);
                    }
                    this.unknownFields = ccVarNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((i10 & 1) != 0) {
                this.impressions_ = Collections.unmodifiableList(this.impressions_);
            }
            if ((i10 & 2) != 0) {
                this.adRequests_ = Collections.unmodifiableList(this.adRequests_);
            }
            this.unknownFields = ccVarNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static SessionMetrics parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (SessionMetrics) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static SessionMetrics parseFrom(y yVar) throws IOException {
            return (SessionMetrics) k7.parseWithIOException(PARSER, yVar);
        }

        public static SessionMetrics parseFrom(y yVar, m5 m5Var) throws IOException {
            return (SessionMetrics) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface SessionMetricsOrBuilder extends MessageOrBuilder {
        AdRequestMetrics getAdRequests(int i10);

        int getAdRequestsCount();

        List<AdRequestMetrics> getAdRequestsList();

        AdRequestMetricsOrBuilder getAdRequestsOrBuilder(int i10);

        List<? extends AdRequestMetricsOrBuilder> getAdRequestsOrBuilderList();

        UserSession getCurrentSession();

        UserSessionOrBuilder getCurrentSessionOrBuilder();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        ImpressionMetrics getImpressions(int i10);

        int getImpressionsCount();

        List<ImpressionMetrics> getImpressionsList();

        ImpressionMetricsOrBuilder getImpressionsOrBuilder(int i10);

        List<? extends ImpressionMetricsOrBuilder> getImpressionsOrBuilderList();

        boolean hasCurrentSession();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Timestamps extends k7 implements TimestampsOrBuilder {
        public static final int DAY_BUCKETS_FIELD_NUMBER = 3;
        public static final int DELTAS_FIELD_NUMBER = 2;
        public static final int LAST_TIMESTAMP_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<DayBucket> dayBuckets_;
        private int deltasMemoizedSerializedSize;
        private s7 deltas_;
        private long lastTimestamp_;
        private byte memoizedIsInitialized;
        private static final Timestamps DEFAULT_INSTANCE = new Timestamps();
        private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public Timestamps parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new Timestamps(yVar, m5Var);
            }
        };

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class DayBucket extends k7 implements DayBucketOrBuilder {
            public static final int COUNT_FIELD_NUMBER = 2;
            private static final DayBucket DEFAULT_INSTANCE = new DayBucket();
            private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps.DayBucket.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public DayBucket parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new DayBucket(yVar, m5Var);
                }
            };
            public static final int START_TIME_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private int count_;
            private byte memoizedIsInitialized;
            private long startTime_;

            public static DayBucket getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_Timestamps_DayBucket_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static DayBucket parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (DayBucket) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static DayBucket parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (DayBucket) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DayBucket)) {
                    return super.equals(obj);
                }
                DayBucket dayBucket = (DayBucket) obj;
                return getStartTime() == dayBucket.getStartTime() && getCount() == dayBucket.getCount() && this.unknownFields.equals(dayBucket.unknownFields);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps.DayBucketOrBuilder
            public int getCount() {
                return this.count_;
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
                long j10 = this.startTime_;
                int iComputeInt64Size = j10 != 0 ? h0.computeInt64Size(1, j10) : 0;
                int i11 = this.count_;
                if (i11 != 0) {
                    iComputeInt64Size += h0.computeInt32Size(2, i11);
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt64Size;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps.DayBucketOrBuilder
            public long getStartTime() {
                return this.startTime_;
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
                int iHashCode = this.unknownFields.hashCode() + ((getCount() + ((((x7.hashLong(getStartTime()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.explorestack.protobuf.k7
            public i7 internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_Timestamps_DayBucket_fieldAccessorTable.ensureFieldAccessorsInitialized(DayBucket.class, Builder.class);
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
                return new DayBucket();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                long j10 = this.startTime_;
                if (j10 != 0) {
                    h0Var.writeInt64(1, j10);
                }
                int i10 = this.count_;
                if (i10 != 0) {
                    h0Var.writeInt32(2, i10);
                }
                this.unknownFields.writeTo(h0Var);
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends o6 implements DayBucketOrBuilder {
                private int count_;
                private long startTime_;

                private Builder() {
                    super(null);
                    maybeForceBuilderInitialization();
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_Timestamps_DayBucket_descriptor;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = k7.alwaysUseFieldBuilders;
                }

                public Builder clearCount() {
                    this.count_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearStartTime() {
                    this.startTime_ = 0L;
                    onChanged();
                    return this;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps.DayBucketOrBuilder
                public int getCount() {
                    return this.count_;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_Timestamps_DayBucket_descriptor;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps.DayBucketOrBuilder
                public long getStartTime() {
                    return this.startTime_;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_Timestamps_DayBucket_fieldAccessorTable.ensureFieldAccessorsInitialized(DayBucket.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setCount(int i10) {
                    this.count_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setStartTime(long j10) {
                    this.startTime_ = j10;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public DayBucket build() {
                    DayBucket dayBucketBuildPartial = buildPartial();
                    if (dayBucketBuildPartial.isInitialized()) {
                        return dayBucketBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) dayBucketBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public DayBucket buildPartial() {
                    DayBucket dayBucket = new DayBucket(this);
                    dayBucket.startTime_ = this.startTime_;
                    dayBucket.count_ = this.count_;
                    onBuilt();
                    return dayBucket;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public DayBucket getDefaultInstanceForType() {
                    return DayBucket.getDefaultInstance();
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
                    this.startTime_ = 0L;
                    this.count_ = 0;
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
                /* renamed from: clone */
                public Builder mo500clone() {
                    return (Builder) super.mo500clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof DayBucket) {
                        return mergeFrom((DayBucket) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(DayBucket dayBucket) {
                    if (dayBucket == DayBucket.getDefaultInstance()) {
                        return this;
                    }
                    if (dayBucket.getStartTime() != 0) {
                        setStartTime(dayBucket.getStartTime());
                    }
                    if (dayBucket.getCount() != 0) {
                        setCount(dayBucket.getCount());
                    }
                    mergeUnknownFields(((k7) dayBucket).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps.DayBucket.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps.DayBucket.access$9900()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$Timestamps$DayBucket r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps.DayBucket) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$Timestamps$DayBucket r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps.DayBucket) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps.DayBucket.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$Timestamps$DayBucket$Builder");
                }
            }

            public static Builder newBuilder(DayBucket dayBucket) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(dayBucket);
            }

            public static DayBucket parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (DayBucket) PARSER.parseFrom(byteBuffer, m5Var);
            }

            private DayBucket(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static DayBucket parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (DayBucket) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static DayBucket parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (DayBucket) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public DayBucket getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static DayBucket parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (DayBucket) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private DayBucket() {
                this.memoizedIsInitialized = (byte) -1;
            }

            public static DayBucket parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (DayBucket) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static DayBucket parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (DayBucket) PARSER.parseFrom(bArr, m5Var);
            }

            private DayBucket(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                    this.startTime_ = yVar.readInt64();
                                } else if (tag != 16) {
                                    if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                    }
                                } else {
                                    this.count_ = yVar.readInt32();
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

            public static DayBucket parseFrom(InputStream inputStream) throws IOException {
                return (DayBucket) k7.parseWithIOException(PARSER, inputStream);
            }

            public static DayBucket parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (DayBucket) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            public static DayBucket parseFrom(y yVar) throws IOException {
                return (DayBucket) k7.parseWithIOException(PARSER, yVar);
            }

            public static DayBucket parseFrom(y yVar, m5 m5Var) throws IOException {
                return (DayBucket) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface DayBucketOrBuilder extends MessageOrBuilder {
            int getCount();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            long getStartTime();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static Timestamps getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_Timestamps_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Timestamps parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Timestamps) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Timestamps parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Timestamps) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Timestamps)) {
                return super.equals(obj);
            }
            Timestamps timestamps = (Timestamps) obj;
            return getLastTimestamp() == timestamps.getLastTimestamp() && getDeltasList().equals(timestamps.getDeltasList()) && getDayBucketsList().equals(timestamps.getDayBucketsList()) && this.unknownFields.equals(timestamps.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
        public DayBucket getDayBuckets(int i10) {
            return this.dayBuckets_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
        public int getDayBucketsCount() {
            return this.dayBuckets_.size();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
        public List<DayBucket> getDayBucketsList() {
            return this.dayBuckets_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
        public DayBucketOrBuilder getDayBucketsOrBuilder(int i10) {
            return this.dayBuckets_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
        public List<? extends DayBucketOrBuilder> getDayBucketsOrBuilderList() {
            return this.dayBuckets_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
        public int getDeltas(int i10) {
            return ((l7) this.deltas_).getInt(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
        public int getDeltasCount() {
            return this.deltas_.size();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
        public List<Integer> getDeltasList() {
            return this.deltas_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
        public long getLastTimestamp() {
            return this.lastTimestamp_;
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
            long j10 = this.lastTimestamp_;
            int iComputeInt64Size = j10 != 0 ? h0.computeInt64Size(1, j10) : 0;
            int iComputeUInt32SizeNoTag = 0;
            for (int i11 = 0; i11 < this.deltas_.size(); i11++) {
                iComputeUInt32SizeNoTag += h0.computeUInt32SizeNoTag(((l7) this.deltas_).getInt(i11));
            }
            int iComputeMessageSize = iComputeInt64Size + iComputeUInt32SizeNoTag;
            if (!getDeltasList().isEmpty()) {
                iComputeMessageSize = iComputeMessageSize + 1 + h0.computeInt32SizeNoTag(iComputeUInt32SizeNoTag);
            }
            this.deltasMemoizedSerializedSize = iComputeUInt32SizeNoTag;
            for (int i12 = 0; i12 < this.dayBuckets_.size(); i12++) {
                iComputeMessageSize += h0.computeMessageSize(3, this.dayBuckets_.get(i12));
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
            int iHashLong = x7.hashLong(getLastTimestamp()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
            if (getDeltasCount() > 0) {
                iHashLong = getDeltasList().hashCode() + o2.B(iHashLong, 37, 2, 53);
            }
            if (getDayBucketsCount() > 0) {
                iHashLong = getDayBucketsList().hashCode() + o2.B(iHashLong, 37, 3, 53);
            }
            int iHashCode = this.unknownFields.hashCode() + (iHashLong * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_Timestamps_fieldAccessorTable.ensureFieldAccessorsInitialized(Timestamps.class, Builder.class);
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
            return new Timestamps();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            getSerializedSize();
            long j10 = this.lastTimestamp_;
            if (j10 != 0) {
                h0Var.writeInt64(1, j10);
            }
            if (getDeltasList().size() > 0) {
                h0Var.writeUInt32NoTag(18);
                h0Var.writeUInt32NoTag(this.deltasMemoizedSerializedSize);
            }
            for (int i10 = 0; i10 < this.deltas_.size(); i10++) {
                h0Var.writeUInt32NoTag(((l7) this.deltas_).getInt(i10));
            }
            for (int i11 = 0; i11 < this.dayBuckets_.size(); i11++) {
                h0Var.writeMessage(3, this.dayBuckets_.get(i11));
            }
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements TimestampsOrBuilder {
            private int bitField0_;
            private pa dayBucketsBuilder_;
            private List<DayBucket> dayBuckets_;
            private s7 deltas_;
            private long lastTimestamp_;

            private Builder() {
                super(null);
                this.deltas_ = k7.emptyIntList();
                this.dayBuckets_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private void ensureDayBucketsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.dayBuckets_ = new ArrayList(this.dayBuckets_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureDeltasIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.deltas_ = k7.mutableCopy(this.deltas_);
                    this.bitField0_ |= 1;
                }
            }

            private pa getDayBucketsFieldBuilder() {
                if (this.dayBucketsBuilder_ == null) {
                    this.dayBucketsBuilder_ = new pa(this.dayBuckets_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.dayBuckets_ = null;
                }
                return this.dayBucketsBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_Timestamps_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (k7.alwaysUseFieldBuilders) {
                    getDayBucketsFieldBuilder();
                }
            }

            public Builder addAllDayBuckets(Iterable<? extends DayBucket> iterable) {
                pa paVar = this.dayBucketsBuilder_;
                if (paVar != null) {
                    paVar.addAllMessages(iterable);
                    return this;
                }
                ensureDayBucketsIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.dayBuckets_);
                onChanged();
                return this;
            }

            public Builder addAllDeltas(Iterable<? extends Integer> iterable) {
                ensureDeltasIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.deltas_);
                onChanged();
                return this;
            }

            public Builder addDayBuckets(DayBucket dayBucket) {
                pa paVar = this.dayBucketsBuilder_;
                if (paVar != null) {
                    paVar.addMessage(dayBucket);
                    return this;
                }
                dayBucket.getClass();
                ensureDayBucketsIsMutable();
                this.dayBuckets_.add(dayBucket);
                onChanged();
                return this;
            }

            public DayBucket.Builder addDayBucketsBuilder() {
                return (DayBucket.Builder) getDayBucketsFieldBuilder().addBuilder(DayBucket.getDefaultInstance());
            }

            public Builder addDeltas(int i10) {
                ensureDeltasIsMutable();
                ((l7) this.deltas_).addInt(i10);
                onChanged();
                return this;
            }

            public Builder clearDayBuckets() {
                pa paVar = this.dayBucketsBuilder_;
                if (paVar != null) {
                    paVar.clear();
                    return this;
                }
                this.dayBuckets_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearDeltas() {
                this.deltas_ = k7.emptyIntList();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearLastTimestamp() {
                this.lastTimestamp_ = 0L;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
            public DayBucket getDayBuckets(int i10) {
                pa paVar = this.dayBucketsBuilder_;
                return paVar == null ? this.dayBuckets_.get(i10) : (DayBucket) paVar.getMessage(i10);
            }

            public DayBucket.Builder getDayBucketsBuilder(int i10) {
                return (DayBucket.Builder) getDayBucketsFieldBuilder().getBuilder(i10);
            }

            public List<DayBucket.Builder> getDayBucketsBuilderList() {
                return getDayBucketsFieldBuilder().getBuilderList();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
            public int getDayBucketsCount() {
                pa paVar = this.dayBucketsBuilder_;
                return paVar == null ? this.dayBuckets_.size() : paVar.getCount();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
            public List<DayBucket> getDayBucketsList() {
                pa paVar = this.dayBucketsBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.dayBuckets_) : paVar.getMessageList();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
            public DayBucketOrBuilder getDayBucketsOrBuilder(int i10) {
                pa paVar = this.dayBucketsBuilder_;
                return paVar == null ? this.dayBuckets_.get(i10) : (DayBucketOrBuilder) paVar.getMessageOrBuilder(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
            public List<? extends DayBucketOrBuilder> getDayBucketsOrBuilderList() {
                pa paVar = this.dayBucketsBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.dayBuckets_);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
            public int getDeltas(int i10) {
                return ((l7) this.deltas_).getInt(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
            public int getDeltasCount() {
                return this.deltas_.size();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
            public List<Integer> getDeltasList() {
                return (this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.deltas_) : this.deltas_;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_Timestamps_descriptor;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
            public long getLastTimestamp() {
                return this.lastTimestamp_;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_Timestamps_fieldAccessorTable.ensureFieldAccessorsInitialized(Timestamps.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder removeDayBuckets(int i10) {
                pa paVar = this.dayBucketsBuilder_;
                if (paVar != null) {
                    paVar.remove(i10);
                    return this;
                }
                ensureDayBucketsIsMutable();
                this.dayBuckets_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setDayBuckets(int i10, DayBucket dayBucket) {
                pa paVar = this.dayBucketsBuilder_;
                if (paVar != null) {
                    paVar.setMessage(i10, dayBucket);
                    return this;
                }
                dayBucket.getClass();
                ensureDayBucketsIsMutable();
                this.dayBuckets_.set(i10, dayBucket);
                onChanged();
                return this;
            }

            public Builder setDeltas(int i10, int i11) {
                ensureDeltasIsMutable();
                ((l7) this.deltas_).setInt(i10, i11);
                onChanged();
                return this;
            }

            public Builder setLastTimestamp(long j10) {
                this.lastTimestamp_ = j10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Timestamps build() {
                Timestamps timestampsBuildPartial = buildPartial();
                if (timestampsBuildPartial.isInitialized()) {
                    return timestampsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) timestampsBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Timestamps buildPartial() {
                Timestamps timestamps = new Timestamps(this);
                timestamps.lastTimestamp_ = this.lastTimestamp_;
                if ((this.bitField0_ & 1) != 0) {
                    ((e) this.deltas_).makeImmutable();
                    this.bitField0_ &= -2;
                }
                timestamps.deltas_ = this.deltas_;
                pa paVar = this.dayBucketsBuilder_;
                if (paVar != null) {
                    timestamps.dayBuckets_ = paVar.build();
                } else {
                    if ((this.bitField0_ & 2) != 0) {
                        this.dayBuckets_ = Collections.unmodifiableList(this.dayBuckets_);
                        this.bitField0_ &= -3;
                    }
                    timestamps.dayBuckets_ = this.dayBuckets_;
                }
                onBuilt();
                return timestamps;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Timestamps getDefaultInstanceForType() {
                return Timestamps.getDefaultInstance();
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

            public DayBucket.Builder addDayBucketsBuilder(int i10) {
                return (DayBucket.Builder) getDayBucketsFieldBuilder().addBuilder(i10, DayBucket.getDefaultInstance());
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
                this.lastTimestamp_ = 0L;
                this.deltas_ = k7.emptyIntList();
                int i10 = this.bitField0_;
                this.bitField0_ = i10 & (-2);
                pa paVar = this.dayBucketsBuilder_;
                if (paVar == null) {
                    this.dayBuckets_ = Collections.EMPTY_LIST;
                    this.bitField0_ = i10 & (-4);
                    return this;
                }
                paVar.clear();
                return this;
            }

            private Builder(p6 p6Var) {
                super(p6Var);
                this.deltas_ = k7.emptyIntList();
                this.dayBuckets_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder addDayBuckets(int i10, DayBucket dayBucket) {
                pa paVar = this.dayBucketsBuilder_;
                if (paVar == null) {
                    dayBucket.getClass();
                    ensureDayBucketsIsMutable();
                    this.dayBuckets_.add(i10, dayBucket);
                    onChanged();
                    return this;
                }
                paVar.addMessage(i10, dayBucket);
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
            /* renamed from: clone */
            public Builder mo500clone() {
                return (Builder) super.mo500clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Timestamps) {
                    return mergeFrom((Timestamps) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setDayBuckets(int i10, DayBucket.Builder builder) {
                pa paVar = this.dayBucketsBuilder_;
                if (paVar == null) {
                    ensureDayBucketsIsMutable();
                    this.dayBuckets_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                paVar.setMessage(i10, builder.build());
                return this;
            }

            public Builder mergeFrom(Timestamps timestamps) {
                if (timestamps == Timestamps.getDefaultInstance()) {
                    return this;
                }
                if (timestamps.getLastTimestamp() != 0) {
                    setLastTimestamp(timestamps.getLastTimestamp());
                }
                if (!timestamps.deltas_.isEmpty()) {
                    if (this.deltas_.isEmpty()) {
                        this.deltas_ = timestamps.deltas_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureDeltasIsMutable();
                        this.deltas_.addAll(timestamps.deltas_);
                    }
                    onChanged();
                }
                if (this.dayBucketsBuilder_ == null) {
                    if (!timestamps.dayBuckets_.isEmpty()) {
                        if (this.dayBuckets_.isEmpty()) {
                            this.dayBuckets_ = timestamps.dayBuckets_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureDayBucketsIsMutable();
                            this.dayBuckets_.addAll(timestamps.dayBuckets_);
                        }
                        onChanged();
                    }
                } else if (!timestamps.dayBuckets_.isEmpty()) {
                    if (!this.dayBucketsBuilder_.isEmpty()) {
                        this.dayBucketsBuilder_.addAllMessages(timestamps.dayBuckets_);
                    } else {
                        this.dayBucketsBuilder_.dispose();
                        this.dayBucketsBuilder_ = null;
                        this.dayBuckets_ = timestamps.dayBuckets_;
                        this.bitField0_ &= -3;
                        this.dayBucketsBuilder_ = k7.alwaysUseFieldBuilders ? getDayBucketsFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((k7) timestamps).unknownFields);
                onChanged();
                return this;
            }

            public Builder addDayBuckets(DayBucket.Builder builder) {
                pa paVar = this.dayBucketsBuilder_;
                if (paVar == null) {
                    ensureDayBucketsIsMutable();
                    this.dayBuckets_.add(builder.build());
                    onChanged();
                    return this;
                }
                paVar.addMessage(builder.build());
                return this;
            }

            public Builder addDayBuckets(int i10, DayBucket.Builder builder) {
                pa paVar = this.dayBucketsBuilder_;
                if (paVar == null) {
                    ensureDayBucketsIsMutable();
                    this.dayBuckets_.add(i10, builder.build());
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
            public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps.access$11100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$Timestamps r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$Timestamps r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$Timestamps$Builder");
            }
        }

        public static Builder newBuilder(Timestamps timestamps) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(timestamps);
        }

        public static Timestamps parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (Timestamps) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private Timestamps(o6 o6Var) {
            super(o6Var);
            this.deltasMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Timestamps parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Timestamps) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static Timestamps parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Timestamps) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Timestamps getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Timestamps parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (Timestamps) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Timestamps parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Timestamps) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        private Timestamps() {
            this.deltasMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.deltas_ = k7.emptyIntList();
            this.dayBuckets_ = Collections.EMPTY_LIST;
        }

        public static Timestamps parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (Timestamps) PARSER.parseFrom(bArr, m5Var);
        }

        public static Timestamps parseFrom(InputStream inputStream) throws IOException {
            return (Timestamps) k7.parseWithIOException(PARSER, inputStream);
        }

        public static Timestamps parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Timestamps) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Timestamps(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            this();
            m5Var.getClass();
            cc ccVarNewBuilder = gc.newBuilder();
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int tag = yVar.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.lastTimestamp_ = yVar.readInt64();
                            } else if (tag == 16) {
                                if ((i10 & 1) == 0) {
                                    this.deltas_ = k7.newIntList();
                                    i10 |= 1;
                                }
                                ((l7) this.deltas_).addInt(yVar.readUInt32());
                            } else if (tag == 18) {
                                int iPushLimit = yVar.pushLimit(yVar.readRawVarint32());
                                if ((i10 & 1) == 0 && yVar.getBytesUntilLimit() > 0) {
                                    this.deltas_ = k7.newIntList();
                                    i10 |= 1;
                                }
                                while (yVar.getBytesUntilLimit() > 0) {
                                    ((l7) this.deltas_).addInt(yVar.readUInt32());
                                }
                                yVar.popLimit(iPushLimit);
                            } else if (tag != 26) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                if ((i10 & 2) == 0) {
                                    this.dayBuckets_ = new ArrayList();
                                    i10 |= 2;
                                }
                                this.dayBuckets_.add(yVar.readMessage(DayBucket.parser(), m5Var));
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if ((i10 & 1) != 0) {
                        ((e) this.deltas_).makeImmutable();
                    }
                    if ((i10 & 2) != 0) {
                        this.dayBuckets_ = Collections.unmodifiableList(this.dayBuckets_);
                    }
                    this.unknownFields = ccVarNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((i10 & 1) != 0) {
                ((e) this.deltas_).makeImmutable();
            }
            if ((i10 & 2) != 0) {
                this.dayBuckets_ = Collections.unmodifiableList(this.dayBuckets_);
            }
            this.unknownFields = ccVarNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static Timestamps parseFrom(y yVar) throws IOException {
            return (Timestamps) k7.parseWithIOException(PARSER, yVar);
        }

        public static Timestamps parseFrom(y yVar, m5 m5Var) throws IOException {
            return (Timestamps) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface TimestampsOrBuilder extends MessageOrBuilder {
        Timestamps.DayBucket getDayBuckets(int i10);

        int getDayBucketsCount();

        List<Timestamps.DayBucket> getDayBucketsList();

        Timestamps.DayBucketOrBuilder getDayBucketsOrBuilder(int i10);

        List<? extends Timestamps.DayBucketOrBuilder> getDayBucketsOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        int getDeltas(int i10);

        int getDeltasCount();

        List<Integer> getDeltasList();

        long getLastTimestamp();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class UserIdQuery extends k7 implements UserIdQueryOrBuilder {
        private static final UserIdQuery DEFAULT_INSTANCE = new UserIdQuery();
        private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserIdQuery.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public UserIdQuery parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new UserIdQuery(yVar, m5Var);
            }
        };
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        public static final int USER_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private long timestamp_;
        private volatile Object userId_;

        public static UserIdQuery getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_UserIdQuery_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserIdQuery parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserIdQuery) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UserIdQuery parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UserIdQuery) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserIdQuery)) {
                return super.equals(obj);
            }
            UserIdQuery userIdQuery = (UserIdQuery) obj;
            return getUserId().equals(userIdQuery.getUserId()) && getTimestamp() == userIdQuery.getTimestamp() && this.unknownFields.equals(userIdQuery.unknownFields);
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
            int iComputeStringSize = !getUserIdBytes().isEmpty() ? k7.computeStringSize(1, this.userId_) : 0;
            long j10 = this.timestamp_;
            if (j10 != 0) {
                iComputeStringSize += h0.computeInt64Size(2, j10);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserIdQueryOrBuilder
        public long getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
        public final gc getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserIdQueryOrBuilder
        public String getUserId() {
            Object obj = this.userId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.userId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserIdQueryOrBuilder
        public ByteString getUserIdBytes() {
            Object obj = this.userId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.userId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = this.unknownFields.hashCode() + ((x7.hashLong(getTimestamp()) + ((((getUserId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_UserIdQuery_fieldAccessorTable.ensureFieldAccessorsInitialized(UserIdQuery.class, Builder.class);
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
            return new UserIdQuery();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            if (!getUserIdBytes().isEmpty()) {
                k7.writeString(h0Var, 1, this.userId_);
            }
            long j10 = this.timestamp_;
            if (j10 != 0) {
                h0Var.writeInt64(2, j10);
            }
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements UserIdQueryOrBuilder {
            private long timestamp_;
            private Object userId_;

            private Builder() {
                super(null);
                this.userId_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserIdQuery_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = k7.alwaysUseFieldBuilders;
            }

            public Builder clearTimestamp() {
                this.timestamp_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearUserId() {
                this.userId_ = UserIdQuery.getDefaultInstance().getUserId();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserIdQuery_descriptor;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserIdQueryOrBuilder
            public long getTimestamp() {
                return this.timestamp_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserIdQueryOrBuilder
            public String getUserId() {
                Object obj = this.userId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.userId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserIdQueryOrBuilder
            public ByteString getUserIdBytes() {
                Object obj = this.userId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.userId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserIdQuery_fieldAccessorTable.ensureFieldAccessorsInitialized(UserIdQuery.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setTimestamp(long j10) {
                this.timestamp_ = j10;
                onChanged();
                return this;
            }

            public Builder setUserId(String str) {
                str.getClass();
                this.userId_ = str;
                onChanged();
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.userId_ = byteString;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public UserIdQuery build() {
                UserIdQuery userIdQueryBuildPartial = buildPartial();
                if (userIdQueryBuildPartial.isInitialized()) {
                    return userIdQueryBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) userIdQueryBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public UserIdQuery buildPartial() {
                UserIdQuery userIdQuery = new UserIdQuery(this);
                userIdQuery.userId_ = this.userId_;
                userIdQuery.timestamp_ = this.timestamp_;
                onBuilt();
                return userIdQuery;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public UserIdQuery getDefaultInstanceForType() {
                return UserIdQuery.getDefaultInstance();
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
                this.userId_ = "";
                this.timestamp_ = 0L;
                return this;
            }

            private Builder(p6 p6Var) {
                super(p6Var);
                this.userId_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
            /* renamed from: clone */
            public Builder mo500clone() {
                return (Builder) super.mo500clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UserIdQuery) {
                    return mergeFrom((UserIdQuery) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UserIdQuery userIdQuery) {
                if (userIdQuery == UserIdQuery.getDefaultInstance()) {
                    return this;
                }
                if (!userIdQuery.getUserId().isEmpty()) {
                    this.userId_ = userIdQuery.userId_;
                    onChanged();
                }
                if (userIdQuery.getTimestamp() != 0) {
                    setTimestamp(userIdQuery.getTimestamp());
                }
                mergeUnknownFields(((k7) userIdQuery).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserIdQuery.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserIdQuery.access$20300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserIdQuery r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserIdQuery) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserIdQuery r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserIdQuery) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserIdQuery.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserIdQuery$Builder");
            }
        }

        public static Builder newBuilder(UserIdQuery userIdQuery) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userIdQuery);
        }

        public static UserIdQuery parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (UserIdQuery) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private UserIdQuery(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UserIdQuery parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (UserIdQuery) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static UserIdQuery parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UserIdQuery) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public UserIdQuery getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static UserIdQuery parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (UserIdQuery) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private UserIdQuery() {
            this.memoizedIsInitialized = (byte) -1;
            this.userId_ = "";
        }

        public static UserIdQuery parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UserIdQuery) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static UserIdQuery parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (UserIdQuery) PARSER.parseFrom(bArr, m5Var);
        }

        public static UserIdQuery parseFrom(InputStream inputStream) throws IOException {
            return (UserIdQuery) k7.parseWithIOException(PARSER, inputStream);
        }

        private UserIdQuery(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                this.userId_ = yVar.readStringRequireUtf8();
                            } else if (tag != 16) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                this.timestamp_ = yVar.readInt64();
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

        public static UserIdQuery parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (UserIdQuery) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static UserIdQuery parseFrom(y yVar) throws IOException {
            return (UserIdQuery) k7.parseWithIOException(PARSER, yVar);
        }

        public static UserIdQuery parseFrom(y yVar, m5 m5Var) throws IOException {
            return (UserIdQuery) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface UserIdQueryOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        long getTimestamp();

        String getUserId();

        ByteString getUserIdBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class UserSession extends k7 implements UserSessionOrBuilder {
        public static final int LAST_ACTIVITY_FIELD_NUMBER = 1;
        public static final int METRICS_BY_AD_TYPE_FIELD_NUMBER = 3;
        public static final int SESSION_START_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private long lastActivity_;
        private byte memoizedIsInitialized;
        private List<AdTypeMetrics> metricsByAdType_;
        private long sessionStart_;
        private static final UserSession DEFAULT_INSTANCE = new UserSession();
        private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public UserSession parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new UserSession(yVar, m5Var);
            }
        };

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class AdTypeMetrics extends k7 implements AdTypeMetricsOrBuilder {
            public static final int AD_REQUESTS_FIELD_NUMBER = 3;
            public static final int AD_TYPE_FIELD_NUMBER = 1;
            public static final int AUCTIONS_FIELD_NUMBER = 13;
            public static final int BIDS_FIELD_NUMBER = 4;
            public static final int CUMULATIVE_BID_PRICE_FIELD_NUMBER = 9;
            public static final int CUMULATIVE_LURL_PRICE_FIELD_NUMBER = 10;
            public static final int CUMULATIVE_NURL_PRICE_FIELD_NUMBER = 11;
            public static final int ECPM_FIELD_NUMBER = 12;
            public static final int IMPRESSIONS_FIELD_NUMBER = 2;
            public static final int LOSSES_FIELD_NUMBER = 6;
            public static final int LURLS_FIELD_NUMBER = 7;
            public static final int NURLS_FIELD_NUMBER = 8;
            public static final int WINS_FIELD_NUMBER = 5;
            private static final long serialVersionUID = 0;
            private int adRequests_;
            private int adType_;
            private List<Auction> auctions_;
            private int bids_;
            private float cumulativeBidPrice_;
            private float cumulativeLurlPrice_;
            private float cumulativeNurlPrice_;
            private Ecpm ecpm_;
            private int impressions_;
            private int losses_;
            private int lurls_;
            private byte memoizedIsInitialized;
            private int nurls_;
            private int wins_;
            private static final AdTypeMetrics DEFAULT_INSTANCE = new AdTypeMetrics();
            private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetrics.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public AdTypeMetrics parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new AdTypeMetrics(yVar, m5Var);
                }
            };

            public static AdTypeMetrics getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_AdTypeMetrics_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static AdTypeMetrics parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (AdTypeMetrics) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static AdTypeMetrics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (AdTypeMetrics) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof AdTypeMetrics)) {
                    return super.equals(obj);
                }
                AdTypeMetrics adTypeMetrics = (AdTypeMetrics) obj;
                if (this.adType_ == adTypeMetrics.adType_ && getImpressions() == adTypeMetrics.getImpressions() && getAdRequests() == adTypeMetrics.getAdRequests() && getBids() == adTypeMetrics.getBids() && getWins() == adTypeMetrics.getWins() && getLosses() == adTypeMetrics.getLosses() && getLurls() == adTypeMetrics.getLurls() && getNurls() == adTypeMetrics.getNurls() && Float.floatToIntBits(getCumulativeBidPrice()) == Float.floatToIntBits(adTypeMetrics.getCumulativeBidPrice()) && Float.floatToIntBits(getCumulativeLurlPrice()) == Float.floatToIntBits(adTypeMetrics.getCumulativeLurlPrice()) && Float.floatToIntBits(getCumulativeNurlPrice()) == Float.floatToIntBits(adTypeMetrics.getCumulativeNurlPrice()) && hasEcpm() == adTypeMetrics.hasEcpm()) {
                    return (!hasEcpm() || getEcpm().equals(adTypeMetrics.getEcpm())) && getAuctionsList().equals(adTypeMetrics.getAuctionsList()) && this.unknownFields.equals(adTypeMetrics.unknownFields);
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public int getAdRequests() {
                return this.adRequests_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public AdType getAdType() {
                AdType adTypeValueOf = AdType.valueOf(this.adType_);
                return adTypeValueOf == null ? AdType.UNRECOGNIZED : adTypeValueOf;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public int getAdTypeValue() {
                return this.adType_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public Auction getAuctions(int i10) {
                return this.auctions_.get(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public int getAuctionsCount() {
                return this.auctions_.size();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public List<Auction> getAuctionsList() {
                return this.auctions_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public AuctionOrBuilder getAuctionsOrBuilder(int i10) {
                return this.auctions_.get(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public List<? extends AuctionOrBuilder> getAuctionsOrBuilderList() {
                return this.auctions_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public int getBids() {
                return this.bids_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public float getCumulativeBidPrice() {
                return this.cumulativeBidPrice_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public float getCumulativeLurlPrice() {
                return this.cumulativeLurlPrice_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public float getCumulativeNurlPrice() {
                return this.cumulativeNurlPrice_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public Ecpm getEcpm() {
                Ecpm ecpm = this.ecpm_;
                return ecpm == null ? Ecpm.getDefaultInstance() : ecpm;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public EcpmOrBuilder getEcpmOrBuilder() {
                return getEcpm();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public int getImpressions() {
                return this.impressions_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public int getLosses() {
                return this.losses_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public int getLurls() {
                return this.lurls_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public int getNurls() {
                return this.nurls_;
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
                int iComputeEnumSize = this.adType_ != AdType.UNKNOWN.getNumber() ? h0.computeEnumSize(1, this.adType_) : 0;
                int i11 = this.impressions_;
                if (i11 != 0) {
                    iComputeEnumSize += h0.computeInt32Size(2, i11);
                }
                int i12 = this.adRequests_;
                if (i12 != 0) {
                    iComputeEnumSize += h0.computeInt32Size(3, i12);
                }
                int i13 = this.bids_;
                if (i13 != 0) {
                    iComputeEnumSize += h0.computeInt32Size(4, i13);
                }
                int i14 = this.wins_;
                if (i14 != 0) {
                    iComputeEnumSize += h0.computeInt32Size(5, i14);
                }
                int i15 = this.losses_;
                if (i15 != 0) {
                    iComputeEnumSize += h0.computeInt32Size(6, i15);
                }
                int i16 = this.lurls_;
                if (i16 != 0) {
                    iComputeEnumSize += h0.computeInt32Size(7, i16);
                }
                int i17 = this.nurls_;
                if (i17 != 0) {
                    iComputeEnumSize += h0.computeInt32Size(8, i17);
                }
                float f10 = this.cumulativeBidPrice_;
                if (f10 != 0.0f) {
                    iComputeEnumSize += h0.computeFloatSize(9, f10);
                }
                float f11 = this.cumulativeLurlPrice_;
                if (f11 != 0.0f) {
                    iComputeEnumSize += h0.computeFloatSize(10, f11);
                }
                float f12 = this.cumulativeNurlPrice_;
                if (f12 != 0.0f) {
                    iComputeEnumSize += h0.computeFloatSize(11, f12);
                }
                if (this.ecpm_ != null) {
                    iComputeEnumSize += h0.computeMessageSize(12, getEcpm());
                }
                for (int i18 = 0; i18 < this.auctions_.size(); i18++) {
                    iComputeEnumSize += h0.computeMessageSize(13, this.auctions_.get(i18));
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeEnumSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
            public final gc getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public int getWins() {
                return this.wins_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public boolean hasEcpm() {
                return this.ecpm_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iFloatToIntBits = Float.floatToIntBits(getCumulativeNurlPrice()) + ((((Float.floatToIntBits(getCumulativeLurlPrice()) + ((((Float.floatToIntBits(getCumulativeBidPrice()) + ((((getNurls() + ((((getLurls() + ((((getLosses() + ((((getWins() + ((((getBids() + ((((getAdRequests() + ((((getImpressions() + a.d((((getDescriptor().hashCode() + 779) * 37) + 1) * 53, this.adType_, 37, 2, 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53)) * 37) + 9) * 53)) * 37) + 10) * 53)) * 37) + 11) * 53);
                if (hasEcpm()) {
                    iFloatToIntBits = o2.B(iFloatToIntBits, 37, 12, 53) + getEcpm().hashCode();
                }
                if (getAuctionsCount() > 0) {
                    iFloatToIntBits = o2.B(iFloatToIntBits, 37, 13, 53) + getAuctionsList().hashCode();
                }
                int iHashCode = this.unknownFields.hashCode() + (iFloatToIntBits * 29);
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.explorestack.protobuf.k7
            public i7 internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_AdTypeMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(AdTypeMetrics.class, Builder.class);
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
                return new AdTypeMetrics();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                if (this.adType_ != AdType.UNKNOWN.getNumber()) {
                    h0Var.writeEnum(1, this.adType_);
                }
                int i10 = this.impressions_;
                if (i10 != 0) {
                    h0Var.writeInt32(2, i10);
                }
                int i11 = this.adRequests_;
                if (i11 != 0) {
                    h0Var.writeInt32(3, i11);
                }
                int i12 = this.bids_;
                if (i12 != 0) {
                    h0Var.writeInt32(4, i12);
                }
                int i13 = this.wins_;
                if (i13 != 0) {
                    h0Var.writeInt32(5, i13);
                }
                int i14 = this.losses_;
                if (i14 != 0) {
                    h0Var.writeInt32(6, i14);
                }
                int i15 = this.lurls_;
                if (i15 != 0) {
                    h0Var.writeInt32(7, i15);
                }
                int i16 = this.nurls_;
                if (i16 != 0) {
                    h0Var.writeInt32(8, i16);
                }
                float f10 = this.cumulativeBidPrice_;
                if (f10 != 0.0f) {
                    h0Var.writeFloat(9, f10);
                }
                float f11 = this.cumulativeLurlPrice_;
                if (f11 != 0.0f) {
                    h0Var.writeFloat(10, f11);
                }
                float f12 = this.cumulativeNurlPrice_;
                if (f12 != 0.0f) {
                    h0Var.writeFloat(11, f12);
                }
                if (this.ecpm_ != null) {
                    h0Var.writeMessage(12, getEcpm());
                }
                for (int i17 = 0; i17 < this.auctions_.size(); i17++) {
                    h0Var.writeMessage(13, this.auctions_.get(i17));
                }
                this.unknownFields.writeTo(h0Var);
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends o6 implements AdTypeMetricsOrBuilder {
                private int adRequests_;
                private int adType_;
                private pa auctionsBuilder_;
                private List<Auction> auctions_;
                private int bids_;
                private int bitField0_;
                private float cumulativeBidPrice_;
                private float cumulativeLurlPrice_;
                private float cumulativeNurlPrice_;
                private xa ecpmBuilder_;
                private Ecpm ecpm_;
                private int impressions_;
                private int losses_;
                private int lurls_;
                private int nurls_;
                private int wins_;

                private Builder() {
                    super(null);
                    this.adType_ = 0;
                    this.auctions_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                private void ensureAuctionsIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.auctions_ = new ArrayList(this.auctions_);
                        this.bitField0_ |= 1;
                    }
                }

                private pa getAuctionsFieldBuilder() {
                    if (this.auctionsBuilder_ == null) {
                        this.auctionsBuilder_ = new pa(this.auctions_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.auctions_ = null;
                    }
                    return this.auctionsBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_AdTypeMetrics_descriptor;
                }

                private xa getEcpmFieldBuilder() {
                    if (this.ecpmBuilder_ == null) {
                        this.ecpmBuilder_ = new xa(getEcpm(), getParentForChildren(), isClean());
                        this.ecpm_ = null;
                    }
                    return this.ecpmBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (k7.alwaysUseFieldBuilders) {
                        getAuctionsFieldBuilder();
                    }
                }

                public Builder addAllAuctions(Iterable<? extends Auction> iterable) {
                    pa paVar = this.auctionsBuilder_;
                    if (paVar != null) {
                        paVar.addAllMessages(iterable);
                        return this;
                    }
                    ensureAuctionsIsMutable();
                    b.a.addAll((Iterable) iterable, (List) this.auctions_);
                    onChanged();
                    return this;
                }

                public Builder addAuctions(Auction auction) {
                    pa paVar = this.auctionsBuilder_;
                    if (paVar != null) {
                        paVar.addMessage(auction);
                        return this;
                    }
                    auction.getClass();
                    ensureAuctionsIsMutable();
                    this.auctions_.add(auction);
                    onChanged();
                    return this;
                }

                public Auction.Builder addAuctionsBuilder() {
                    return (Auction.Builder) getAuctionsFieldBuilder().addBuilder(Auction.getDefaultInstance());
                }

                public Builder clearAdRequests() {
                    this.adRequests_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearAdType() {
                    this.adType_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearAuctions() {
                    pa paVar = this.auctionsBuilder_;
                    if (paVar != null) {
                        paVar.clear();
                        return this;
                    }
                    this.auctions_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearBids() {
                    this.bids_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearCumulativeBidPrice() {
                    this.cumulativeBidPrice_ = 0.0f;
                    onChanged();
                    return this;
                }

                public Builder clearCumulativeLurlPrice() {
                    this.cumulativeLurlPrice_ = 0.0f;
                    onChanged();
                    return this;
                }

                public Builder clearCumulativeNurlPrice() {
                    this.cumulativeNurlPrice_ = 0.0f;
                    onChanged();
                    return this;
                }

                public Builder clearEcpm() {
                    if (this.ecpmBuilder_ == null) {
                        this.ecpm_ = null;
                        onChanged();
                        return this;
                    }
                    this.ecpm_ = null;
                    this.ecpmBuilder_ = null;
                    return this;
                }

                public Builder clearImpressions() {
                    this.impressions_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearLosses() {
                    this.losses_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearLurls() {
                    this.lurls_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearNurls() {
                    this.nurls_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearWins() {
                    this.wins_ = 0;
                    onChanged();
                    return this;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public int getAdRequests() {
                    return this.adRequests_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public AdType getAdType() {
                    AdType adTypeValueOf = AdType.valueOf(this.adType_);
                    return adTypeValueOf == null ? AdType.UNRECOGNIZED : adTypeValueOf;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public int getAdTypeValue() {
                    return this.adType_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public Auction getAuctions(int i10) {
                    pa paVar = this.auctionsBuilder_;
                    return paVar == null ? this.auctions_.get(i10) : (Auction) paVar.getMessage(i10);
                }

                public Auction.Builder getAuctionsBuilder(int i10) {
                    return (Auction.Builder) getAuctionsFieldBuilder().getBuilder(i10);
                }

                public List<Auction.Builder> getAuctionsBuilderList() {
                    return getAuctionsFieldBuilder().getBuilderList();
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public int getAuctionsCount() {
                    pa paVar = this.auctionsBuilder_;
                    return paVar == null ? this.auctions_.size() : paVar.getCount();
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public List<Auction> getAuctionsList() {
                    pa paVar = this.auctionsBuilder_;
                    return paVar == null ? Collections.unmodifiableList(this.auctions_) : paVar.getMessageList();
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public AuctionOrBuilder getAuctionsOrBuilder(int i10) {
                    pa paVar = this.auctionsBuilder_;
                    return paVar == null ? this.auctions_.get(i10) : (AuctionOrBuilder) paVar.getMessageOrBuilder(i10);
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public List<? extends AuctionOrBuilder> getAuctionsOrBuilderList() {
                    pa paVar = this.auctionsBuilder_;
                    return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.auctions_);
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public int getBids() {
                    return this.bids_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public float getCumulativeBidPrice() {
                    return this.cumulativeBidPrice_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public float getCumulativeLurlPrice() {
                    return this.cumulativeLurlPrice_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public float getCumulativeNurlPrice() {
                    return this.cumulativeNurlPrice_;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_AdTypeMetrics_descriptor;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public Ecpm getEcpm() {
                    xa xaVar = this.ecpmBuilder_;
                    if (xaVar != null) {
                        return (Ecpm) xaVar.getMessage();
                    }
                    Ecpm ecpm = this.ecpm_;
                    return ecpm == null ? Ecpm.getDefaultInstance() : ecpm;
                }

                public Ecpm.Builder getEcpmBuilder() {
                    onChanged();
                    return (Ecpm.Builder) getEcpmFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public EcpmOrBuilder getEcpmOrBuilder() {
                    xa xaVar = this.ecpmBuilder_;
                    if (xaVar != null) {
                        return (EcpmOrBuilder) xaVar.getMessageOrBuilder();
                    }
                    Ecpm ecpm = this.ecpm_;
                    return ecpm == null ? Ecpm.getDefaultInstance() : ecpm;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public int getImpressions() {
                    return this.impressions_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public int getLosses() {
                    return this.losses_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public int getLurls() {
                    return this.lurls_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public int getNurls() {
                    return this.nurls_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public int getWins() {
                    return this.wins_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public boolean hasEcpm() {
                    return (this.ecpmBuilder_ == null && this.ecpm_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_AdTypeMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(AdTypeMetrics.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeEcpm(Ecpm ecpm) {
                    xa xaVar = this.ecpmBuilder_;
                    if (xaVar != null) {
                        xaVar.mergeFrom(ecpm);
                        return this;
                    }
                    Ecpm ecpm2 = this.ecpm_;
                    if (ecpm2 != null) {
                        this.ecpm_ = Ecpm.newBuilder(ecpm2).mergeFrom(ecpm).buildPartial();
                    } else {
                        this.ecpm_ = ecpm;
                    }
                    onChanged();
                    return this;
                }

                public Builder removeAuctions(int i10) {
                    pa paVar = this.auctionsBuilder_;
                    if (paVar != null) {
                        paVar.remove(i10);
                        return this;
                    }
                    ensureAuctionsIsMutable();
                    this.auctions_.remove(i10);
                    onChanged();
                    return this;
                }

                public Builder setAdRequests(int i10) {
                    this.adRequests_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setAdType(AdType adType) {
                    adType.getClass();
                    this.adType_ = adType.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setAdTypeValue(int i10) {
                    this.adType_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setAuctions(int i10, Auction auction) {
                    pa paVar = this.auctionsBuilder_;
                    if (paVar != null) {
                        paVar.setMessage(i10, auction);
                        return this;
                    }
                    auction.getClass();
                    ensureAuctionsIsMutable();
                    this.auctions_.set(i10, auction);
                    onChanged();
                    return this;
                }

                public Builder setBids(int i10) {
                    this.bids_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setCumulativeBidPrice(float f10) {
                    this.cumulativeBidPrice_ = f10;
                    onChanged();
                    return this;
                }

                public Builder setCumulativeLurlPrice(float f10) {
                    this.cumulativeLurlPrice_ = f10;
                    onChanged();
                    return this;
                }

                public Builder setCumulativeNurlPrice(float f10) {
                    this.cumulativeNurlPrice_ = f10;
                    onChanged();
                    return this;
                }

                public Builder setEcpm(Ecpm ecpm) {
                    xa xaVar = this.ecpmBuilder_;
                    if (xaVar != null) {
                        xaVar.setMessage(ecpm);
                        return this;
                    }
                    ecpm.getClass();
                    this.ecpm_ = ecpm;
                    onChanged();
                    return this;
                }

                public Builder setImpressions(int i10) {
                    this.impressions_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setLosses(int i10) {
                    this.losses_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setLurls(int i10) {
                    this.lurls_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setNurls(int i10) {
                    this.nurls_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setWins(int i10) {
                    this.wins_ = i10;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public AdTypeMetrics build() {
                    AdTypeMetrics adTypeMetricsBuildPartial = buildPartial();
                    if (adTypeMetricsBuildPartial.isInitialized()) {
                        return adTypeMetricsBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) adTypeMetricsBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public AdTypeMetrics buildPartial() {
                    AdTypeMetrics adTypeMetrics = new AdTypeMetrics(this);
                    adTypeMetrics.adType_ = this.adType_;
                    adTypeMetrics.impressions_ = this.impressions_;
                    adTypeMetrics.adRequests_ = this.adRequests_;
                    adTypeMetrics.bids_ = this.bids_;
                    adTypeMetrics.wins_ = this.wins_;
                    adTypeMetrics.losses_ = this.losses_;
                    adTypeMetrics.lurls_ = this.lurls_;
                    adTypeMetrics.nurls_ = this.nurls_;
                    adTypeMetrics.cumulativeBidPrice_ = this.cumulativeBidPrice_;
                    adTypeMetrics.cumulativeLurlPrice_ = this.cumulativeLurlPrice_;
                    adTypeMetrics.cumulativeNurlPrice_ = this.cumulativeNurlPrice_;
                    xa xaVar = this.ecpmBuilder_;
                    if (xaVar == null) {
                        adTypeMetrics.ecpm_ = this.ecpm_;
                    } else {
                        adTypeMetrics.ecpm_ = (Ecpm) xaVar.build();
                    }
                    pa paVar = this.auctionsBuilder_;
                    if (paVar != null) {
                        adTypeMetrics.auctions_ = paVar.build();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.auctions_ = Collections.unmodifiableList(this.auctions_);
                            this.bitField0_ &= -2;
                        }
                        adTypeMetrics.auctions_ = this.auctions_;
                    }
                    onBuilt();
                    return adTypeMetrics;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public AdTypeMetrics getDefaultInstanceForType() {
                    return AdTypeMetrics.getDefaultInstance();
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

                public Auction.Builder addAuctionsBuilder(int i10) {
                    return (Auction.Builder) getAuctionsFieldBuilder().addBuilder(i10, Auction.getDefaultInstance());
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
                    this.adType_ = 0;
                    this.impressions_ = 0;
                    this.adRequests_ = 0;
                    this.bids_ = 0;
                    this.wins_ = 0;
                    this.losses_ = 0;
                    this.lurls_ = 0;
                    this.nurls_ = 0;
                    this.cumulativeBidPrice_ = 0.0f;
                    this.cumulativeLurlPrice_ = 0.0f;
                    this.cumulativeNurlPrice_ = 0.0f;
                    if (this.ecpmBuilder_ == null) {
                        this.ecpm_ = null;
                    } else {
                        this.ecpm_ = null;
                        this.ecpmBuilder_ = null;
                    }
                    pa paVar = this.auctionsBuilder_;
                    if (paVar == null) {
                        this.auctions_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -2;
                        return this;
                    }
                    paVar.clear();
                    return this;
                }

                public Builder setEcpm(Ecpm.Builder builder) {
                    xa xaVar = this.ecpmBuilder_;
                    if (xaVar == null) {
                        this.ecpm_ = builder.build();
                        onChanged();
                        return this;
                    }
                    xaVar.setMessage(builder.build());
                    return this;
                }

                private Builder(p6 p6Var) {
                    super(p6Var);
                    this.adType_ = 0;
                    this.auctions_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public Builder addAuctions(int i10, Auction auction) {
                    pa paVar = this.auctionsBuilder_;
                    if (paVar == null) {
                        auction.getClass();
                        ensureAuctionsIsMutable();
                        this.auctions_.add(i10, auction);
                        onChanged();
                        return this;
                    }
                    paVar.addMessage(i10, auction);
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
                /* renamed from: clone */
                public Builder mo500clone() {
                    return (Builder) super.mo500clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof AdTypeMetrics) {
                        return mergeFrom((AdTypeMetrics) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setAuctions(int i10, Auction.Builder builder) {
                    pa paVar = this.auctionsBuilder_;
                    if (paVar == null) {
                        ensureAuctionsIsMutable();
                        this.auctions_.set(i10, builder.build());
                        onChanged();
                        return this;
                    }
                    paVar.setMessage(i10, builder.build());
                    return this;
                }

                public Builder mergeFrom(AdTypeMetrics adTypeMetrics) {
                    if (adTypeMetrics == AdTypeMetrics.getDefaultInstance()) {
                        return this;
                    }
                    if (adTypeMetrics.adType_ != 0) {
                        setAdTypeValue(adTypeMetrics.getAdTypeValue());
                    }
                    if (adTypeMetrics.getImpressions() != 0) {
                        setImpressions(adTypeMetrics.getImpressions());
                    }
                    if (adTypeMetrics.getAdRequests() != 0) {
                        setAdRequests(adTypeMetrics.getAdRequests());
                    }
                    if (adTypeMetrics.getBids() != 0) {
                        setBids(adTypeMetrics.getBids());
                    }
                    if (adTypeMetrics.getWins() != 0) {
                        setWins(adTypeMetrics.getWins());
                    }
                    if (adTypeMetrics.getLosses() != 0) {
                        setLosses(adTypeMetrics.getLosses());
                    }
                    if (adTypeMetrics.getLurls() != 0) {
                        setLurls(adTypeMetrics.getLurls());
                    }
                    if (adTypeMetrics.getNurls() != 0) {
                        setNurls(adTypeMetrics.getNurls());
                    }
                    if (adTypeMetrics.getCumulativeBidPrice() != 0.0f) {
                        setCumulativeBidPrice(adTypeMetrics.getCumulativeBidPrice());
                    }
                    if (adTypeMetrics.getCumulativeLurlPrice() != 0.0f) {
                        setCumulativeLurlPrice(adTypeMetrics.getCumulativeLurlPrice());
                    }
                    if (adTypeMetrics.getCumulativeNurlPrice() != 0.0f) {
                        setCumulativeNurlPrice(adTypeMetrics.getCumulativeNurlPrice());
                    }
                    if (adTypeMetrics.hasEcpm()) {
                        mergeEcpm(adTypeMetrics.getEcpm());
                    }
                    if (this.auctionsBuilder_ == null) {
                        if (!adTypeMetrics.auctions_.isEmpty()) {
                            if (this.auctions_.isEmpty()) {
                                this.auctions_ = adTypeMetrics.auctions_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureAuctionsIsMutable();
                                this.auctions_.addAll(adTypeMetrics.auctions_);
                            }
                            onChanged();
                        }
                    } else if (!adTypeMetrics.auctions_.isEmpty()) {
                        if (!this.auctionsBuilder_.isEmpty()) {
                            this.auctionsBuilder_.addAllMessages(adTypeMetrics.auctions_);
                        } else {
                            this.auctionsBuilder_.dispose();
                            this.auctionsBuilder_ = null;
                            this.auctions_ = adTypeMetrics.auctions_;
                            this.bitField0_ &= -2;
                            this.auctionsBuilder_ = k7.alwaysUseFieldBuilders ? getAuctionsFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((k7) adTypeMetrics).unknownFields);
                    onChanged();
                    return this;
                }

                public Builder addAuctions(Auction.Builder builder) {
                    pa paVar = this.auctionsBuilder_;
                    if (paVar == null) {
                        ensureAuctionsIsMutable();
                        this.auctions_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    paVar.addMessage(builder.build());
                    return this;
                }

                public Builder addAuctions(int i10, Auction.Builder builder) {
                    pa paVar = this.auctionsBuilder_;
                    if (paVar == null) {
                        ensureAuctionsIsMutable();
                        this.auctions_.add(i10, builder.build());
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
                public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetrics.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetrics.access$7500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserSession$AdTypeMetrics r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetrics) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserSession$AdTypeMetrics r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetrics) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetrics.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserSession$AdTypeMetrics$Builder");
                }
            }

            public static Builder newBuilder(AdTypeMetrics adTypeMetrics) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(adTypeMetrics);
            }

            public static AdTypeMetrics parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (AdTypeMetrics) PARSER.parseFrom(byteBuffer, m5Var);
            }

            private AdTypeMetrics(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static AdTypeMetrics parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (AdTypeMetrics) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static AdTypeMetrics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (AdTypeMetrics) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public AdTypeMetrics getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static AdTypeMetrics parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (AdTypeMetrics) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private AdTypeMetrics() {
                this.memoizedIsInitialized = (byte) -1;
                this.adType_ = 0;
                this.auctions_ = Collections.EMPTY_LIST;
            }

            public static AdTypeMetrics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (AdTypeMetrics) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static AdTypeMetrics parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (AdTypeMetrics) PARSER.parseFrom(bArr, m5Var);
            }

            public static AdTypeMetrics parseFrom(InputStream inputStream) throws IOException {
                return (AdTypeMetrics) k7.parseWithIOException(PARSER, inputStream);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private AdTypeMetrics(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                this();
                m5Var.getClass();
                cc ccVarNewBuilder = gc.newBuilder();
                boolean z10 = false;
                boolean z11 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = yVar.readTag();
                            switch (tag) {
                                case 0:
                                    z10 = true;
                                case 8:
                                    this.adType_ = yVar.readEnum();
                                case 16:
                                    this.impressions_ = yVar.readInt32();
                                case 24:
                                    this.adRequests_ = yVar.readInt32();
                                case 32:
                                    this.bids_ = yVar.readInt32();
                                case 40:
                                    this.wins_ = yVar.readInt32();
                                case 48:
                                    this.losses_ = yVar.readInt32();
                                case 56:
                                    this.lurls_ = yVar.readInt32();
                                case 64:
                                    this.nurls_ = yVar.readInt32();
                                case 77:
                                    this.cumulativeBidPrice_ = yVar.readFloat();
                                case 85:
                                    this.cumulativeLurlPrice_ = yVar.readFloat();
                                case 93:
                                    this.cumulativeNurlPrice_ = yVar.readFloat();
                                case 98:
                                    Ecpm ecpm = this.ecpm_;
                                    Ecpm.Builder builder = ecpm != null ? ecpm.toBuilder() : null;
                                    Ecpm ecpm2 = (Ecpm) yVar.readMessage(Ecpm.parser(), m5Var);
                                    this.ecpm_ = ecpm2;
                                    if (builder != null) {
                                        builder.mergeFrom(ecpm2);
                                        this.ecpm_ = builder.buildPartial();
                                    }
                                case 106:
                                    if (!z11) {
                                        this.auctions_ = new ArrayList();
                                        z11 = true;
                                    }
                                    this.auctions_.add(yVar.readMessage(Auction.parser(), m5Var));
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
                        if (z11) {
                            this.auctions_ = Collections.unmodifiableList(this.auctions_);
                        }
                        this.unknownFields = ccVarNewBuilder.build();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                if (z11) {
                    this.auctions_ = Collections.unmodifiableList(this.auctions_);
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
            }

            public static AdTypeMetrics parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (AdTypeMetrics) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            public static AdTypeMetrics parseFrom(y yVar) throws IOException {
                return (AdTypeMetrics) k7.parseWithIOException(PARSER, yVar);
            }

            public static AdTypeMetrics parseFrom(y yVar, m5 m5Var) throws IOException {
                return (AdTypeMetrics) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface AdTypeMetricsOrBuilder extends MessageOrBuilder {
            int getAdRequests();

            AdType getAdType();

            int getAdTypeValue();

            Auction getAuctions(int i10);

            int getAuctionsCount();

            List<Auction> getAuctionsList();

            AuctionOrBuilder getAuctionsOrBuilder(int i10);

            List<? extends AuctionOrBuilder> getAuctionsOrBuilderList();

            int getBids();

            float getCumulativeBidPrice();

            float getCumulativeLurlPrice();

            float getCumulativeNurlPrice();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            Ecpm getEcpm();

            EcpmOrBuilder getEcpmOrBuilder();

            int getImpressions();

            int getLosses();

            int getLurls();

            int getNurls();

            int getWins();

            boolean hasEcpm();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Auction extends k7 implements AuctionOrBuilder {
            public static final int LOSERS_BIDDER_ID_FIELD_NUMBER = 3;
            public static final int SOURCE_REQUEST_ID_FIELD_NUMBER = 1;
            public static final int WINNER_BIDDER_ID_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private int losersBidderIdMemoizedSerializedSize;
            private s7 losersBidderId_;
            private byte memoizedIsInitialized;
            private ByteString sourceRequestId_;
            private int winnerBidderId_;
            private static final Auction DEFAULT_INSTANCE = new Auction();
            private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.Auction.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public Auction parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new Auction(yVar, m5Var);
                }
            };

            public static Auction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_Auction_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Auction parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Auction) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Auction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Auction) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Auction)) {
                    return super.equals(obj);
                }
                Auction auction = (Auction) obj;
                return getSourceRequestId().equals(auction.getSourceRequestId()) && getWinnerBidderId() == auction.getWinnerBidderId() && getLosersBidderIdList().equals(auction.getLosersBidderIdList()) && this.unknownFields.equals(auction.unknownFields);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AuctionOrBuilder
            public int getLosersBidderId(int i10) {
                return ((l7) this.losersBidderId_).getInt(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AuctionOrBuilder
            public int getLosersBidderIdCount() {
                return this.losersBidderId_.size();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AuctionOrBuilder
            public List<Integer> getLosersBidderIdList() {
                return this.losersBidderId_;
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
                int iComputeBytesSize = !this.sourceRequestId_.isEmpty() ? h0.computeBytesSize(1, this.sourceRequestId_) : 0;
                int i11 = this.winnerBidderId_;
                if (i11 != 0) {
                    iComputeBytesSize += h0.computeUInt32Size(2, i11);
                }
                int iComputeUInt32SizeNoTag = 0;
                for (int i12 = 0; i12 < this.losersBidderId_.size(); i12++) {
                    iComputeUInt32SizeNoTag += h0.computeUInt32SizeNoTag(((l7) this.losersBidderId_).getInt(i12));
                }
                int iComputeInt32SizeNoTag = iComputeBytesSize + iComputeUInt32SizeNoTag;
                if (!getLosersBidderIdList().isEmpty()) {
                    iComputeInt32SizeNoTag = iComputeInt32SizeNoTag + 1 + h0.computeInt32SizeNoTag(iComputeUInt32SizeNoTag);
                }
                this.losersBidderIdMemoizedSerializedSize = iComputeUInt32SizeNoTag;
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt32SizeNoTag;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AuctionOrBuilder
            public ByteString getSourceRequestId() {
                return this.sourceRequestId_;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
            public final gc getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AuctionOrBuilder
            public int getWinnerBidderId() {
                return this.winnerBidderId_;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int winnerBidderId = getWinnerBidderId() + ((((getSourceRequestId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
                if (getLosersBidderIdCount() > 0) {
                    winnerBidderId = o2.B(winnerBidderId, 37, 3, 53) + getLosersBidderIdList().hashCode();
                }
                int iHashCode = this.unknownFields.hashCode() + (winnerBidderId * 29);
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.explorestack.protobuf.k7
            public i7 internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_Auction_fieldAccessorTable.ensureFieldAccessorsInitialized(Auction.class, Builder.class);
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
                return new Auction();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                getSerializedSize();
                if (!this.sourceRequestId_.isEmpty()) {
                    h0Var.writeBytes(1, this.sourceRequestId_);
                }
                int i10 = this.winnerBidderId_;
                if (i10 != 0) {
                    h0Var.writeUInt32(2, i10);
                }
                if (getLosersBidderIdList().size() > 0) {
                    h0Var.writeUInt32NoTag(26);
                    h0Var.writeUInt32NoTag(this.losersBidderIdMemoizedSerializedSize);
                }
                for (int i11 = 0; i11 < this.losersBidderId_.size(); i11++) {
                    h0Var.writeUInt32NoTag(((l7) this.losersBidderId_).getInt(i11));
                }
                this.unknownFields.writeTo(h0Var);
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends o6 implements AuctionOrBuilder {
                private int bitField0_;
                private s7 losersBidderId_;
                private ByteString sourceRequestId_;
                private int winnerBidderId_;

                private Builder() {
                    super(null);
                    this.sourceRequestId_ = ByteString.EMPTY;
                    this.losersBidderId_ = k7.emptyIntList();
                    maybeForceBuilderInitialization();
                }

                private void ensureLosersBidderIdIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.losersBidderId_ = k7.mutableCopy(this.losersBidderId_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_Auction_descriptor;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = k7.alwaysUseFieldBuilders;
                }

                public Builder addAllLosersBidderId(Iterable<? extends Integer> iterable) {
                    ensureLosersBidderIdIsMutable();
                    b.a.addAll((Iterable) iterable, (List) this.losersBidderId_);
                    onChanged();
                    return this;
                }

                public Builder addLosersBidderId(int i10) {
                    ensureLosersBidderIdIsMutable();
                    ((l7) this.losersBidderId_).addInt(i10);
                    onChanged();
                    return this;
                }

                public Builder clearLosersBidderId() {
                    this.losersBidderId_ = k7.emptyIntList();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearSourceRequestId() {
                    this.sourceRequestId_ = Auction.getDefaultInstance().getSourceRequestId();
                    onChanged();
                    return this;
                }

                public Builder clearWinnerBidderId() {
                    this.winnerBidderId_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_Auction_descriptor;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AuctionOrBuilder
                public int getLosersBidderId(int i10) {
                    return ((l7) this.losersBidderId_).getInt(i10);
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AuctionOrBuilder
                public int getLosersBidderIdCount() {
                    return this.losersBidderId_.size();
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AuctionOrBuilder
                public List<Integer> getLosersBidderIdList() {
                    return (this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.losersBidderId_) : this.losersBidderId_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AuctionOrBuilder
                public ByteString getSourceRequestId() {
                    return this.sourceRequestId_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AuctionOrBuilder
                public int getWinnerBidderId() {
                    return this.winnerBidderId_;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_Auction_fieldAccessorTable.ensureFieldAccessorsInitialized(Auction.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setLosersBidderId(int i10, int i11) {
                    ensureLosersBidderIdIsMutable();
                    ((l7) this.losersBidderId_).setInt(i10, i11);
                    onChanged();
                    return this;
                }

                public Builder setSourceRequestId(ByteString byteString) {
                    byteString.getClass();
                    this.sourceRequestId_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setWinnerBidderId(int i10) {
                    this.winnerBidderId_ = i10;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Auction build() {
                    Auction auctionBuildPartial = buildPartial();
                    if (auctionBuildPartial.isInitialized()) {
                        return auctionBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) auctionBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Auction buildPartial() {
                    Auction auction = new Auction(this);
                    auction.sourceRequestId_ = this.sourceRequestId_;
                    auction.winnerBidderId_ = this.winnerBidderId_;
                    if ((this.bitField0_ & 1) != 0) {
                        ((e) this.losersBidderId_).makeImmutable();
                        this.bitField0_ &= -2;
                    }
                    auction.losersBidderId_ = this.losersBidderId_;
                    onBuilt();
                    return auction;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public Auction getDefaultInstanceForType() {
                    return Auction.getDefaultInstance();
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
                    this.sourceRequestId_ = ByteString.EMPTY;
                    this.winnerBidderId_ = 0;
                    this.losersBidderId_ = k7.emptyIntList();
                    this.bitField0_ &= -2;
                    return this;
                }

                private Builder(p6 p6Var) {
                    super(p6Var);
                    this.sourceRequestId_ = ByteString.EMPTY;
                    this.losersBidderId_ = k7.emptyIntList();
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
                /* renamed from: clone */
                public Builder mo500clone() {
                    return (Builder) super.mo500clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof Auction) {
                        return mergeFrom((Auction) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(Auction auction) {
                    if (auction == Auction.getDefaultInstance()) {
                        return this;
                    }
                    if (auction.getSourceRequestId() != ByteString.EMPTY) {
                        setSourceRequestId(auction.getSourceRequestId());
                    }
                    if (auction.getWinnerBidderId() != 0) {
                        setWinnerBidderId(auction.getWinnerBidderId());
                    }
                    if (!auction.losersBidderId_.isEmpty()) {
                        if (this.losersBidderId_.isEmpty()) {
                            this.losersBidderId_ = auction.losersBidderId_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureLosersBidderIdIsMutable();
                            this.losersBidderId_.addAll(auction.losersBidderId_);
                        }
                        onChanged();
                    }
                    mergeUnknownFields(((k7) auction).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.Auction.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.Auction.access$4900()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserSession$Auction r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.Auction) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserSession$Auction r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.Auction) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.Auction.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserSession$Auction$Builder");
                }
            }

            public static Builder newBuilder(Auction auction) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(auction);
            }

            public static Auction parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (Auction) PARSER.parseFrom(byteBuffer, m5Var);
            }

            private Auction(o6 o6Var) {
                super(o6Var);
                this.losersBidderIdMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Auction parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Auction) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static Auction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Auction) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Auction getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Auction parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (Auction) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Auction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Auction) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            private Auction() {
                this.losersBidderIdMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
                this.sourceRequestId_ = ByteString.EMPTY;
                this.losersBidderId_ = k7.emptyIntList();
            }

            public static Auction parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (Auction) PARSER.parseFrom(bArr, m5Var);
            }

            public static Auction parseFrom(InputStream inputStream) throws IOException {
                return (Auction) k7.parseWithIOException(PARSER, inputStream);
            }

            public static Auction parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Auction) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            private Auction(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                    this.sourceRequestId_ = yVar.readBytes();
                                } else if (tag == 16) {
                                    this.winnerBidderId_ = yVar.readUInt32();
                                } else if (tag == 24) {
                                    if (!z11) {
                                        this.losersBidderId_ = k7.newIntList();
                                        z11 = true;
                                    }
                                    ((l7) this.losersBidderId_).addInt(yVar.readUInt32());
                                } else if (tag != 26) {
                                    if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                    }
                                } else {
                                    int iPushLimit = yVar.pushLimit(yVar.readRawVarint32());
                                    if (!z11 && yVar.getBytesUntilLimit() > 0) {
                                        this.losersBidderId_ = k7.newIntList();
                                        z11 = true;
                                    }
                                    while (yVar.getBytesUntilLimit() > 0) {
                                        ((l7) this.losersBidderId_).addInt(yVar.readUInt32());
                                    }
                                    yVar.popLimit(iPushLimit);
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
                            ((e) this.losersBidderId_).makeImmutable();
                        }
                        this.unknownFields = ccVarNewBuilder.build();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                if (z11) {
                    ((e) this.losersBidderId_).makeImmutable();
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
            }

            public static Auction parseFrom(y yVar) throws IOException {
                return (Auction) k7.parseWithIOException(PARSER, yVar);
            }

            public static Auction parseFrom(y yVar, m5 m5Var) throws IOException {
                return (Auction) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface AuctionOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            int getLosersBidderId(int i10);

            int getLosersBidderIdCount();

            List<Integer> getLosersBidderIdList();

            ByteString getSourceRequestId();

            int getWinnerBidderId();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Ecpm extends k7 implements EcpmOrBuilder {
            public static final int COUNT_FIELD_NUMBER = 3;
            public static final int FIRST_PRICES_FIELD_NUMBER = 1;
            public static final int LAST_PRICES_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private int count_;
            private int firstPricesMemoizedSerializedSize;
            private n7 firstPrices_;
            private int lastPricesMemoizedSerializedSize;
            private n7 lastPrices_;
            private byte memoizedIsInitialized;
            private static final Ecpm DEFAULT_INSTANCE = new Ecpm();
            private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.Ecpm.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public Ecpm parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new Ecpm(yVar, m5Var);
                }
            };

            public static Ecpm getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_Ecpm_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Ecpm parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Ecpm) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Ecpm parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Ecpm) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Ecpm)) {
                    return super.equals(obj);
                }
                Ecpm ecpm = (Ecpm) obj;
                return getFirstPricesList().equals(ecpm.getFirstPricesList()) && getLastPricesList().equals(ecpm.getLastPricesList()) && getCount() == ecpm.getCount() && this.unknownFields.equals(ecpm.unknownFields);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.EcpmOrBuilder
            public int getCount() {
                return this.count_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.EcpmOrBuilder
            public double getFirstPrices(int i10) {
                return ((y4) this.firstPrices_).getDouble(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.EcpmOrBuilder
            public int getFirstPricesCount() {
                return this.firstPrices_.size();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.EcpmOrBuilder
            public List<Double> getFirstPricesList() {
                return this.firstPrices_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.EcpmOrBuilder
            public double getLastPrices(int i10) {
                return ((y4) this.lastPrices_).getDouble(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.EcpmOrBuilder
            public int getLastPricesCount() {
                return this.lastPrices_.size();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.EcpmOrBuilder
            public List<Double> getLastPricesList() {
                return this.lastPrices_;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public fa getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int iComputeInt32SizeNoTag;
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int size = getFirstPricesList().size() * 8;
                if (getFirstPricesList().isEmpty()) {
                    iComputeInt32SizeNoTag = size;
                } else {
                    iComputeInt32SizeNoTag = h0.computeInt32SizeNoTag(size) + size + 1;
                }
                this.firstPricesMemoizedSerializedSize = size;
                int size2 = getLastPricesList().size() * 8;
                int iComputeInt32Size = iComputeInt32SizeNoTag + size2;
                if (!getLastPricesList().isEmpty()) {
                    iComputeInt32Size = iComputeInt32Size + 1 + h0.computeInt32SizeNoTag(size2);
                }
                this.lastPricesMemoizedSerializedSize = size2;
                int i11 = this.count_;
                if (i11 != 0) {
                    iComputeInt32Size += h0.computeInt32Size(3, i11);
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
                int iHashCode = getDescriptor().hashCode() + 779;
                if (getFirstPricesCount() > 0) {
                    iHashCode = o2.B(iHashCode, 37, 1, 53) + getFirstPricesList().hashCode();
                }
                if (getLastPricesCount() > 0) {
                    iHashCode = o2.B(iHashCode, 37, 2, 53) + getLastPricesList().hashCode();
                }
                int iHashCode2 = this.unknownFields.hashCode() + ((getCount() + o2.B(iHashCode, 37, 3, 53)) * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.k7
            public i7 internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_Ecpm_fieldAccessorTable.ensureFieldAccessorsInitialized(Ecpm.class, Builder.class);
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
                return new Ecpm();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                getSerializedSize();
                if (getFirstPricesList().size() > 0) {
                    h0Var.writeUInt32NoTag(10);
                    h0Var.writeUInt32NoTag(this.firstPricesMemoizedSerializedSize);
                }
                for (int i10 = 0; i10 < this.firstPrices_.size(); i10++) {
                    h0Var.writeDoubleNoTag(((y4) this.firstPrices_).getDouble(i10));
                }
                if (getLastPricesList().size() > 0) {
                    h0Var.writeUInt32NoTag(18);
                    h0Var.writeUInt32NoTag(this.lastPricesMemoizedSerializedSize);
                }
                for (int i11 = 0; i11 < this.lastPrices_.size(); i11++) {
                    h0Var.writeDoubleNoTag(((y4) this.lastPrices_).getDouble(i11));
                }
                int i12 = this.count_;
                if (i12 != 0) {
                    h0Var.writeInt32(3, i12);
                }
                this.unknownFields.writeTo(h0Var);
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends o6 implements EcpmOrBuilder {
                private int bitField0_;
                private int count_;
                private n7 firstPrices_;
                private n7 lastPrices_;

                private Builder() {
                    super(null);
                    this.firstPrices_ = k7.emptyDoubleList();
                    this.lastPrices_ = k7.emptyDoubleList();
                    maybeForceBuilderInitialization();
                }

                private void ensureFirstPricesIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.firstPrices_ = k7.mutableCopy(this.firstPrices_);
                        this.bitField0_ |= 1;
                    }
                }

                private void ensureLastPricesIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.lastPrices_ = k7.mutableCopy(this.lastPrices_);
                        this.bitField0_ |= 2;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_Ecpm_descriptor;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = k7.alwaysUseFieldBuilders;
                }

                public Builder addAllFirstPrices(Iterable<? extends Double> iterable) {
                    ensureFirstPricesIsMutable();
                    b.a.addAll((Iterable) iterable, (List) this.firstPrices_);
                    onChanged();
                    return this;
                }

                public Builder addAllLastPrices(Iterable<? extends Double> iterable) {
                    ensureLastPricesIsMutable();
                    b.a.addAll((Iterable) iterable, (List) this.lastPrices_);
                    onChanged();
                    return this;
                }

                public Builder addFirstPrices(double d10) {
                    ensureFirstPricesIsMutable();
                    ((y4) this.firstPrices_).addDouble(d10);
                    onChanged();
                    return this;
                }

                public Builder addLastPrices(double d10) {
                    ensureLastPricesIsMutable();
                    ((y4) this.lastPrices_).addDouble(d10);
                    onChanged();
                    return this;
                }

                public Builder clearCount() {
                    this.count_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearFirstPrices() {
                    this.firstPrices_ = k7.emptyDoubleList();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearLastPrices() {
                    this.lastPrices_ = k7.emptyDoubleList();
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.EcpmOrBuilder
                public int getCount() {
                    return this.count_;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_Ecpm_descriptor;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.EcpmOrBuilder
                public double getFirstPrices(int i10) {
                    return ((y4) this.firstPrices_).getDouble(i10);
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.EcpmOrBuilder
                public int getFirstPricesCount() {
                    return this.firstPrices_.size();
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.EcpmOrBuilder
                public List<Double> getFirstPricesList() {
                    return (this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.firstPrices_) : this.firstPrices_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.EcpmOrBuilder
                public double getLastPrices(int i10) {
                    return ((y4) this.lastPrices_).getDouble(i10);
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.EcpmOrBuilder
                public int getLastPricesCount() {
                    return this.lastPrices_.size();
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.EcpmOrBuilder
                public List<Double> getLastPricesList() {
                    return (this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.lastPrices_) : this.lastPrices_;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_Ecpm_fieldAccessorTable.ensureFieldAccessorsInitialized(Ecpm.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setCount(int i10) {
                    this.count_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setFirstPrices(int i10, double d10) {
                    ensureFirstPricesIsMutable();
                    ((y4) this.firstPrices_).setDouble(i10, d10);
                    onChanged();
                    return this;
                }

                public Builder setLastPrices(int i10, double d10) {
                    ensureLastPricesIsMutable();
                    ((y4) this.lastPrices_).setDouble(i10, d10);
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Ecpm build() {
                    Ecpm ecpmBuildPartial = buildPartial();
                    if (ecpmBuildPartial.isInitialized()) {
                        return ecpmBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) ecpmBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Ecpm buildPartial() {
                    Ecpm ecpm = new Ecpm(this);
                    if ((this.bitField0_ & 1) != 0) {
                        ((e) this.firstPrices_).makeImmutable();
                        this.bitField0_ &= -2;
                    }
                    ecpm.firstPrices_ = this.firstPrices_;
                    if ((this.bitField0_ & 2) != 0) {
                        ((e) this.lastPrices_).makeImmutable();
                        this.bitField0_ &= -3;
                    }
                    ecpm.lastPrices_ = this.lastPrices_;
                    ecpm.count_ = this.count_;
                    onBuilt();
                    return ecpm;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public Ecpm getDefaultInstanceForType() {
                    return Ecpm.getDefaultInstance();
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
                    this.firstPrices_ = k7.emptyDoubleList();
                    this.bitField0_ &= -2;
                    this.lastPrices_ = k7.emptyDoubleList();
                    this.bitField0_ &= -3;
                    this.count_ = 0;
                    return this;
                }

                private Builder(p6 p6Var) {
                    super(p6Var);
                    this.firstPrices_ = k7.emptyDoubleList();
                    this.lastPrices_ = k7.emptyDoubleList();
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
                /* renamed from: clone */
                public Builder mo500clone() {
                    return (Builder) super.mo500clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof Ecpm) {
                        return mergeFrom((Ecpm) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(Ecpm ecpm) {
                    if (ecpm == Ecpm.getDefaultInstance()) {
                        return this;
                    }
                    if (!ecpm.firstPrices_.isEmpty()) {
                        if (this.firstPrices_.isEmpty()) {
                            this.firstPrices_ = ecpm.firstPrices_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureFirstPricesIsMutable();
                            this.firstPrices_.addAll(ecpm.firstPrices_);
                        }
                        onChanged();
                    }
                    if (!ecpm.lastPrices_.isEmpty()) {
                        if (this.lastPrices_.isEmpty()) {
                            this.lastPrices_ = ecpm.lastPrices_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureLastPricesIsMutable();
                            this.lastPrices_.addAll(ecpm.lastPrices_);
                        }
                        onChanged();
                    }
                    if (ecpm.getCount() != 0) {
                        setCount(ecpm.getCount());
                    }
                    mergeUnknownFields(((k7) ecpm).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.Ecpm.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.Ecpm.access$3000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserSession$Ecpm r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.Ecpm) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserSession$Ecpm r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.Ecpm) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.Ecpm.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserSession$Ecpm$Builder");
                }
            }

            public static Builder newBuilder(Ecpm ecpm) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(ecpm);
            }

            public static Ecpm parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (Ecpm) PARSER.parseFrom(byteBuffer, m5Var);
            }

            private Ecpm(o6 o6Var) {
                super(o6Var);
                this.firstPricesMemoizedSerializedSize = -1;
                this.lastPricesMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Ecpm parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Ecpm) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static Ecpm parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Ecpm) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Ecpm getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Ecpm parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (Ecpm) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Ecpm parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Ecpm) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static Ecpm parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (Ecpm) PARSER.parseFrom(bArr, m5Var);
            }

            private Ecpm() {
                this.firstPricesMemoizedSerializedSize = -1;
                this.lastPricesMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
                this.firstPrices_ = k7.emptyDoubleList();
                this.lastPrices_ = k7.emptyDoubleList();
            }

            public static Ecpm parseFrom(InputStream inputStream) throws IOException {
                return (Ecpm) k7.parseWithIOException(PARSER, inputStream);
            }

            public static Ecpm parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Ecpm) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            public static Ecpm parseFrom(y yVar) throws IOException {
                return (Ecpm) k7.parseWithIOException(PARSER, yVar);
            }

            private Ecpm(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                this();
                m5Var.getClass();
                cc ccVarNewBuilder = gc.newBuilder();
                boolean z10 = false;
                int i10 = 0;
                while (!z10) {
                    try {
                        try {
                            int tag = yVar.readTag();
                            if (tag != 0) {
                                if (tag == 24) {
                                    this.count_ = yVar.readInt32();
                                } else if (tag == 9) {
                                    if ((i10 & 1) == 0) {
                                        this.firstPrices_ = k7.newDoubleList();
                                        i10 |= 1;
                                    }
                                    ((y4) this.firstPrices_).addDouble(yVar.readDouble());
                                } else if (tag == 10) {
                                    int iPushLimit = yVar.pushLimit(yVar.readRawVarint32());
                                    if ((i10 & 1) == 0 && yVar.getBytesUntilLimit() > 0) {
                                        this.firstPrices_ = k7.newDoubleList();
                                        i10 |= 1;
                                    }
                                    while (yVar.getBytesUntilLimit() > 0) {
                                        ((y4) this.firstPrices_).addDouble(yVar.readDouble());
                                    }
                                    yVar.popLimit(iPushLimit);
                                } else if (tag == 17) {
                                    if ((i10 & 2) == 0) {
                                        this.lastPrices_ = k7.newDoubleList();
                                        i10 |= 2;
                                    }
                                    ((y4) this.lastPrices_).addDouble(yVar.readDouble());
                                } else if (tag != 18) {
                                    if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                    }
                                } else {
                                    int iPushLimit2 = yVar.pushLimit(yVar.readRawVarint32());
                                    if ((i10 & 2) == 0 && yVar.getBytesUntilLimit() > 0) {
                                        this.lastPrices_ = k7.newDoubleList();
                                        i10 |= 2;
                                    }
                                    while (yVar.getBytesUntilLimit() > 0) {
                                        ((y4) this.lastPrices_).addDouble(yVar.readDouble());
                                    }
                                    yVar.popLimit(iPushLimit2);
                                }
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(this);
                        } catch (IOException e11) {
                            throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th2) {
                        if ((i10 & 1) != 0) {
                            ((e) this.firstPrices_).makeImmutable();
                        }
                        if ((i10 & 2) != 0) {
                            ((e) this.lastPrices_).makeImmutable();
                        }
                        this.unknownFields = ccVarNewBuilder.build();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                if ((i10 & 1) != 0) {
                    ((e) this.firstPrices_).makeImmutable();
                }
                if ((i10 & 2) != 0) {
                    ((e) this.lastPrices_).makeImmutable();
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
            }

            public static Ecpm parseFrom(y yVar, m5 m5Var) throws IOException {
                return (Ecpm) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface EcpmOrBuilder extends MessageOrBuilder {
            int getCount();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            double getFirstPrices(int i10);

            int getFirstPricesCount();

            List<Double> getFirstPricesList();

            double getLastPrices(int i10);

            int getLastPricesCount();

            List<Double> getLastPricesList();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static UserSession getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserSession parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserSession) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UserSession parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UserSession) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserSession)) {
                return super.equals(obj);
            }
            UserSession userSession = (UserSession) obj;
            return getLastActivity() == userSession.getLastActivity() && getMetricsByAdTypeList().equals(userSession.getMetricsByAdTypeList()) && getSessionStart() == userSession.getSessionStart() && this.unknownFields.equals(userSession.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
        public long getLastActivity() {
            return this.lastActivity_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
        public AdTypeMetrics getMetricsByAdType(int i10) {
            return this.metricsByAdType_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
        public int getMetricsByAdTypeCount() {
            return this.metricsByAdType_.size();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
        public List<AdTypeMetrics> getMetricsByAdTypeList() {
            return this.metricsByAdType_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
        public AdTypeMetricsOrBuilder getMetricsByAdTypeOrBuilder(int i10) {
            return this.metricsByAdType_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
        public List<? extends AdTypeMetricsOrBuilder> getMetricsByAdTypeOrBuilderList() {
            return this.metricsByAdType_;
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
            long j10 = this.lastActivity_;
            int iComputeInt64Size = j10 != 0 ? h0.computeInt64Size(1, j10) : 0;
            for (int i11 = 0; i11 < this.metricsByAdType_.size(); i11++) {
                iComputeInt64Size += h0.computeMessageSize(3, this.metricsByAdType_.get(i11));
            }
            long j11 = this.sessionStart_;
            if (j11 != 0) {
                iComputeInt64Size += h0.computeInt64Size(4, j11);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
        public long getSessionStart() {
            return this.sessionStart_;
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
            int iHashLong = x7.hashLong(getLastActivity()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
            if (getMetricsByAdTypeCount() > 0) {
                iHashLong = getMetricsByAdTypeList().hashCode() + o2.B(iHashLong, 37, 3, 53);
            }
            int iHashCode = this.unknownFields.hashCode() + ((x7.hashLong(getSessionStart()) + o2.B(iHashLong, 37, 4, 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_fieldAccessorTable.ensureFieldAccessorsInitialized(UserSession.class, Builder.class);
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
            return new UserSession();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            long j10 = this.lastActivity_;
            if (j10 != 0) {
                h0Var.writeInt64(1, j10);
            }
            for (int i10 = 0; i10 < this.metricsByAdType_.size(); i10++) {
                h0Var.writeMessage(3, this.metricsByAdType_.get(i10));
            }
            long j11 = this.sessionStart_;
            if (j11 != 0) {
                h0Var.writeInt64(4, j11);
            }
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements UserSessionOrBuilder {
            private int bitField0_;
            private long lastActivity_;
            private pa metricsByAdTypeBuilder_;
            private List<AdTypeMetrics> metricsByAdType_;
            private long sessionStart_;

            private Builder() {
                super(null);
                this.metricsByAdType_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private void ensureMetricsByAdTypeIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.metricsByAdType_ = new ArrayList(this.metricsByAdType_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_descriptor;
            }

            private pa getMetricsByAdTypeFieldBuilder() {
                if (this.metricsByAdTypeBuilder_ == null) {
                    this.metricsByAdTypeBuilder_ = new pa(this.metricsByAdType_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.metricsByAdType_ = null;
                }
                return this.metricsByAdTypeBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (k7.alwaysUseFieldBuilders) {
                    getMetricsByAdTypeFieldBuilder();
                }
            }

            public Builder addAllMetricsByAdType(Iterable<? extends AdTypeMetrics> iterable) {
                pa paVar = this.metricsByAdTypeBuilder_;
                if (paVar != null) {
                    paVar.addAllMessages(iterable);
                    return this;
                }
                ensureMetricsByAdTypeIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.metricsByAdType_);
                onChanged();
                return this;
            }

            public Builder addMetricsByAdType(AdTypeMetrics adTypeMetrics) {
                pa paVar = this.metricsByAdTypeBuilder_;
                if (paVar != null) {
                    paVar.addMessage(adTypeMetrics);
                    return this;
                }
                adTypeMetrics.getClass();
                ensureMetricsByAdTypeIsMutable();
                this.metricsByAdType_.add(adTypeMetrics);
                onChanged();
                return this;
            }

            public AdTypeMetrics.Builder addMetricsByAdTypeBuilder() {
                return (AdTypeMetrics.Builder) getMetricsByAdTypeFieldBuilder().addBuilder(AdTypeMetrics.getDefaultInstance());
            }

            public Builder clearLastActivity() {
                this.lastActivity_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearMetricsByAdType() {
                pa paVar = this.metricsByAdTypeBuilder_;
                if (paVar != null) {
                    paVar.clear();
                    return this;
                }
                this.metricsByAdType_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearSessionStart() {
                this.sessionStart_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_descriptor;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
            public long getLastActivity() {
                return this.lastActivity_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
            public AdTypeMetrics getMetricsByAdType(int i10) {
                pa paVar = this.metricsByAdTypeBuilder_;
                return paVar == null ? this.metricsByAdType_.get(i10) : (AdTypeMetrics) paVar.getMessage(i10);
            }

            public AdTypeMetrics.Builder getMetricsByAdTypeBuilder(int i10) {
                return (AdTypeMetrics.Builder) getMetricsByAdTypeFieldBuilder().getBuilder(i10);
            }

            public List<AdTypeMetrics.Builder> getMetricsByAdTypeBuilderList() {
                return getMetricsByAdTypeFieldBuilder().getBuilderList();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
            public int getMetricsByAdTypeCount() {
                pa paVar = this.metricsByAdTypeBuilder_;
                return paVar == null ? this.metricsByAdType_.size() : paVar.getCount();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
            public List<AdTypeMetrics> getMetricsByAdTypeList() {
                pa paVar = this.metricsByAdTypeBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.metricsByAdType_) : paVar.getMessageList();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
            public AdTypeMetricsOrBuilder getMetricsByAdTypeOrBuilder(int i10) {
                pa paVar = this.metricsByAdTypeBuilder_;
                return paVar == null ? this.metricsByAdType_.get(i10) : (AdTypeMetricsOrBuilder) paVar.getMessageOrBuilder(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
            public List<? extends AdTypeMetricsOrBuilder> getMetricsByAdTypeOrBuilderList() {
                pa paVar = this.metricsByAdTypeBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.metricsByAdType_);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
            public long getSessionStart() {
                return this.sessionStart_;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_fieldAccessorTable.ensureFieldAccessorsInitialized(UserSession.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder removeMetricsByAdType(int i10) {
                pa paVar = this.metricsByAdTypeBuilder_;
                if (paVar != null) {
                    paVar.remove(i10);
                    return this;
                }
                ensureMetricsByAdTypeIsMutable();
                this.metricsByAdType_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setLastActivity(long j10) {
                this.lastActivity_ = j10;
                onChanged();
                return this;
            }

            public Builder setMetricsByAdType(int i10, AdTypeMetrics adTypeMetrics) {
                pa paVar = this.metricsByAdTypeBuilder_;
                if (paVar != null) {
                    paVar.setMessage(i10, adTypeMetrics);
                    return this;
                }
                adTypeMetrics.getClass();
                ensureMetricsByAdTypeIsMutable();
                this.metricsByAdType_.set(i10, adTypeMetrics);
                onChanged();
                return this;
            }

            public Builder setSessionStart(long j10) {
                this.sessionStart_ = j10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public UserSession build() {
                UserSession userSessionBuildPartial = buildPartial();
                if (userSessionBuildPartial.isInitialized()) {
                    return userSessionBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) userSessionBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public UserSession buildPartial() {
                UserSession userSession = new UserSession(this);
                userSession.lastActivity_ = this.lastActivity_;
                pa paVar = this.metricsByAdTypeBuilder_;
                if (paVar != null) {
                    userSession.metricsByAdType_ = paVar.build();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.metricsByAdType_ = Collections.unmodifiableList(this.metricsByAdType_);
                        this.bitField0_ &= -2;
                    }
                    userSession.metricsByAdType_ = this.metricsByAdType_;
                }
                userSession.sessionStart_ = this.sessionStart_;
                onBuilt();
                return userSession;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public UserSession getDefaultInstanceForType() {
                return UserSession.getDefaultInstance();
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

            public AdTypeMetrics.Builder addMetricsByAdTypeBuilder(int i10) {
                return (AdTypeMetrics.Builder) getMetricsByAdTypeFieldBuilder().addBuilder(i10, AdTypeMetrics.getDefaultInstance());
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
                this.lastActivity_ = 0L;
                pa paVar = this.metricsByAdTypeBuilder_;
                if (paVar == null) {
                    this.metricsByAdType_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                } else {
                    paVar.clear();
                }
                this.sessionStart_ = 0L;
                return this;
            }

            private Builder(p6 p6Var) {
                super(p6Var);
                this.metricsByAdType_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder addMetricsByAdType(int i10, AdTypeMetrics adTypeMetrics) {
                pa paVar = this.metricsByAdTypeBuilder_;
                if (paVar == null) {
                    adTypeMetrics.getClass();
                    ensureMetricsByAdTypeIsMutable();
                    this.metricsByAdType_.add(i10, adTypeMetrics);
                    onChanged();
                    return this;
                }
                paVar.addMessage(i10, adTypeMetrics);
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
            /* renamed from: clone */
            public Builder mo500clone() {
                return (Builder) super.mo500clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UserSession) {
                    return mergeFrom((UserSession) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setMetricsByAdType(int i10, AdTypeMetrics.Builder builder) {
                pa paVar = this.metricsByAdTypeBuilder_;
                if (paVar == null) {
                    ensureMetricsByAdTypeIsMutable();
                    this.metricsByAdType_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                paVar.setMessage(i10, builder.build());
                return this;
            }

            public Builder mergeFrom(UserSession userSession) {
                if (userSession == UserSession.getDefaultInstance()) {
                    return this;
                }
                if (userSession.getLastActivity() != 0) {
                    setLastActivity(userSession.getLastActivity());
                }
                if (this.metricsByAdTypeBuilder_ == null) {
                    if (!userSession.metricsByAdType_.isEmpty()) {
                        if (this.metricsByAdType_.isEmpty()) {
                            this.metricsByAdType_ = userSession.metricsByAdType_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureMetricsByAdTypeIsMutable();
                            this.metricsByAdType_.addAll(userSession.metricsByAdType_);
                        }
                        onChanged();
                    }
                } else if (!userSession.metricsByAdType_.isEmpty()) {
                    if (!this.metricsByAdTypeBuilder_.isEmpty()) {
                        this.metricsByAdTypeBuilder_.addAllMessages(userSession.metricsByAdType_);
                    } else {
                        this.metricsByAdTypeBuilder_.dispose();
                        this.metricsByAdTypeBuilder_ = null;
                        this.metricsByAdType_ = userSession.metricsByAdType_;
                        this.bitField0_ &= -2;
                        this.metricsByAdTypeBuilder_ = k7.alwaysUseFieldBuilders ? getMetricsByAdTypeFieldBuilder() : null;
                    }
                }
                if (userSession.getSessionStart() != 0) {
                    setSessionStart(userSession.getSessionStart());
                }
                mergeUnknownFields(((k7) userSession).unknownFields);
                onChanged();
                return this;
            }

            public Builder addMetricsByAdType(AdTypeMetrics.Builder builder) {
                pa paVar = this.metricsByAdTypeBuilder_;
                if (paVar == null) {
                    ensureMetricsByAdTypeIsMutable();
                    this.metricsByAdType_.add(builder.build());
                    onChanged();
                    return this;
                }
                paVar.addMessage(builder.build());
                return this;
            }

            public Builder addMetricsByAdType(int i10, AdTypeMetrics.Builder builder) {
                pa paVar = this.metricsByAdTypeBuilder_;
                if (paVar == null) {
                    ensureMetricsByAdTypeIsMutable();
                    this.metricsByAdType_.add(i10, builder.build());
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
            public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.access$8600()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserSession r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserSession r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserSession$Builder");
            }
        }

        public static Builder newBuilder(UserSession userSession) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userSession);
        }

        public static UserSession parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (UserSession) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private UserSession(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UserSession parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (UserSession) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static UserSession parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UserSession) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public UserSession getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static UserSession parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (UserSession) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private UserSession() {
            this.memoizedIsInitialized = (byte) -1;
            this.metricsByAdType_ = Collections.EMPTY_LIST;
        }

        public static UserSession parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UserSession) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static UserSession parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (UserSession) PARSER.parseFrom(bArr, m5Var);
        }

        public static UserSession parseFrom(InputStream inputStream) throws IOException {
            return (UserSession) k7.parseWithIOException(PARSER, inputStream);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private UserSession(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                    this.lastActivity_ = yVar.readInt64();
                                } else if (tag == 26) {
                                    if (!z11) {
                                        this.metricsByAdType_ = new ArrayList();
                                        z11 = true;
                                    }
                                    this.metricsByAdType_.add(yVar.readMessage(AdTypeMetrics.parser(), m5Var));
                                } else if (tag != 32) {
                                    if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                    }
                                } else {
                                    this.sessionStart_ = yVar.readInt64();
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
                        this.metricsByAdType_ = Collections.unmodifiableList(this.metricsByAdType_);
                    }
                    this.unknownFields = ccVarNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z11) {
                this.metricsByAdType_ = Collections.unmodifiableList(this.metricsByAdType_);
            }
            this.unknownFields = ccVarNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static UserSession parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (UserSession) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static UserSession parseFrom(y yVar) throws IOException {
            return (UserSession) k7.parseWithIOException(PARSER, yVar);
        }

        public static UserSession parseFrom(y yVar, m5 m5Var) throws IOException {
            return (UserSession) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface UserSessionOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        long getLastActivity();

        UserSession.AdTypeMetrics getMetricsByAdType(int i10);

        int getMetricsByAdTypeCount();

        List<UserSession.AdTypeMetrics> getMetricsByAdTypeList();

        UserSession.AdTypeMetricsOrBuilder getMetricsByAdTypeOrBuilder(int i10);

        List<? extends UserSession.AdTypeMetricsOrBuilder> getMetricsByAdTypeOrBuilderList();

        long getSessionStart();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class UserState extends k7 implements UserStateOrBuilder {
        public static final int AD_REQUESTS_FIELD_NUMBER = 3;
        public static final int IMPRESSIONS_FIELD_NUMBER = 2;
        public static final int LAST_PROCESSED_TIMESTAMP_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private b9 adRequests_;
        private b9 impressions_;
        private long lastProcessedTimestamp_;
        private byte memoizedIsInitialized;
        private static final UserState DEFAULT_INSTANCE = new UserState();
        private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserState.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public UserState parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new UserState(yVar, m5Var);
            }
        };

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class AdRequestsDefaultEntryHolder {
            static final s8 defaultEntry = s8.newDefaultInstance(SessionMetricsOuterClass.internal_static_sessionmetrics_UserState_AdRequestsEntry_descriptor, bd.f21955e, 0, bd.f21958h, Timestamps.getDefaultInstance());

            private AdRequestsDefaultEntryHolder() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class ImpressionsDefaultEntryHolder {
            static final s8 defaultEntry = s8.newDefaultInstance(SessionMetricsOuterClass.internal_static_sessionmetrics_UserState_ImpressionsEntry_descriptor, bd.f21955e, 0, bd.f21958h, AdDomainTimestamps.getDefaultInstance());

            private ImpressionsDefaultEntryHolder() {
            }
        }

        public static UserState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_UserState_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b9 internalGetAdRequests() {
            b9 b9Var = this.adRequests_;
            return b9Var == null ? b9.emptyMapField(AdRequestsDefaultEntryHolder.defaultEntry) : b9Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b9 internalGetImpressions() {
            b9 b9Var = this.impressions_;
            return b9Var == null ? b9.emptyMapField(ImpressionsDefaultEntryHolder.defaultEntry) : b9Var;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserState parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserState) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UserState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UserState) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
        public boolean containsAdRequests(int i10) {
            return internalGetAdRequests().getMap().containsKey(Integer.valueOf(i10));
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
        public boolean containsImpressions(int i10) {
            return internalGetImpressions().getMap().containsKey(Integer.valueOf(i10));
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserState)) {
                return super.equals(obj);
            }
            UserState userState = (UserState) obj;
            return getLastProcessedTimestamp() == userState.getLastProcessedTimestamp() && internalGetImpressions().equals(userState.internalGetImpressions()) && internalGetAdRequests().equals(userState.internalGetAdRequests()) && this.unknownFields.equals(userState.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
        @Deprecated
        public Map<Integer, Timestamps> getAdRequests() {
            return getAdRequestsMap();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
        public int getAdRequestsCount() {
            return internalGetAdRequests().getMap().size();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
        public Map<Integer, Timestamps> getAdRequestsMap() {
            return internalGetAdRequests().getMap();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
        public Timestamps getAdRequestsOrDefault(int i10, Timestamps timestamps) {
            Map<Object, Object> map = internalGetAdRequests().getMap();
            return map.containsKey(Integer.valueOf(i10)) ? (Timestamps) map.get(Integer.valueOf(i10)) : timestamps;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
        public Timestamps getAdRequestsOrThrow(int i10) {
            Map<Object, Object> map = internalGetAdRequests().getMap();
            if (map.containsKey(Integer.valueOf(i10))) {
                return (Timestamps) map.get(Integer.valueOf(i10));
            }
            throw new IllegalArgumentException();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
        @Deprecated
        public Map<Integer, AdDomainTimestamps> getImpressions() {
            return getImpressionsMap();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
        public int getImpressionsCount() {
            return internalGetImpressions().getMap().size();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
        public Map<Integer, AdDomainTimestamps> getImpressionsMap() {
            return internalGetImpressions().getMap();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
        public AdDomainTimestamps getImpressionsOrDefault(int i10, AdDomainTimestamps adDomainTimestamps) {
            Map<Object, Object> map = internalGetImpressions().getMap();
            return map.containsKey(Integer.valueOf(i10)) ? (AdDomainTimestamps) map.get(Integer.valueOf(i10)) : adDomainTimestamps;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
        public AdDomainTimestamps getImpressionsOrThrow(int i10) {
            Map<Object, Object> map = internalGetImpressions().getMap();
            if (map.containsKey(Integer.valueOf(i10))) {
                return (AdDomainTimestamps) map.get(Integer.valueOf(i10));
            }
            throw new IllegalArgumentException();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
        public long getLastProcessedTimestamp() {
            return this.lastProcessedTimestamp_;
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
            long j10 = this.lastProcessedTimestamp_;
            int iComputeInt64Size = j10 != 0 ? h0.computeInt64Size(1, j10) : 0;
            Iterator itN = a.n(internalGetImpressions());
            while (itN.hasNext()) {
                Map.Entry entry = (Map.Entry) itN.next();
                iComputeInt64Size = a.g(entry, ImpressionsDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()), 2, iComputeInt64Size);
            }
            Iterator itN2 = a.n(internalGetAdRequests());
            while (itN2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itN2.next();
                iComputeInt64Size = a.g(entry2, AdRequestsDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry2.getKey()), 3, iComputeInt64Size);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt64Size;
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
            int iHashLong = x7.hashLong(getLastProcessedTimestamp()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
            if (!internalGetImpressions().getMap().isEmpty()) {
                iHashLong = internalGetImpressions().hashCode() + o2.B(iHashLong, 37, 2, 53);
            }
            if (!internalGetAdRequests().getMap().isEmpty()) {
                iHashLong = internalGetAdRequests().hashCode() + o2.B(iHashLong, 37, 3, 53);
            }
            int iHashCode = this.unknownFields.hashCode() + (iHashLong * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_UserState_fieldAccessorTable.ensureFieldAccessorsInitialized(UserState.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.k7
        public b9 internalGetMapField(int i10) {
            if (i10 == 2) {
                return internalGetImpressions();
            }
            if (i10 == 3) {
                return internalGetAdRequests();
            }
            throw new RuntimeException(a.b.e(i10, "Invalid map field number: "));
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
            return new UserState();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            long j10 = this.lastProcessedTimestamp_;
            if (j10 != 0) {
                h0Var.writeInt64(1, j10);
            }
            k7.serializeIntegerMapTo(h0Var, internalGetImpressions(), ImpressionsDefaultEntryHolder.defaultEntry, 2);
            k7.serializeIntegerMapTo(h0Var, internalGetAdRequests(), AdRequestsDefaultEntryHolder.defaultEntry, 3);
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements UserStateOrBuilder {
            private b9 adRequests_;
            private int bitField0_;
            private b9 impressions_;
            private long lastProcessedTimestamp_;

            private Builder() {
                super(null);
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserState_descriptor;
            }

            private b9 internalGetAdRequests() {
                b9 b9Var = this.adRequests_;
                return b9Var == null ? b9.emptyMapField(AdRequestsDefaultEntryHolder.defaultEntry) : b9Var;
            }

            private b9 internalGetImpressions() {
                b9 b9Var = this.impressions_;
                return b9Var == null ? b9.emptyMapField(ImpressionsDefaultEntryHolder.defaultEntry) : b9Var;
            }

            private b9 internalGetMutableAdRequests() {
                onChanged();
                if (this.adRequests_ == null) {
                    this.adRequests_ = b9.newMapField(AdRequestsDefaultEntryHolder.defaultEntry);
                }
                if (!this.adRequests_.isMutable()) {
                    this.adRequests_ = this.adRequests_.copy();
                }
                return this.adRequests_;
            }

            private b9 internalGetMutableImpressions() {
                onChanged();
                if (this.impressions_ == null) {
                    this.impressions_ = b9.newMapField(ImpressionsDefaultEntryHolder.defaultEntry);
                }
                if (!this.impressions_.isMutable()) {
                    this.impressions_ = this.impressions_.copy();
                }
                return this.impressions_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = k7.alwaysUseFieldBuilders;
            }

            public Builder clearAdRequests() {
                internalGetMutableAdRequests().getMutableMap().clear();
                return this;
            }

            public Builder clearImpressions() {
                internalGetMutableImpressions().getMutableMap().clear();
                return this;
            }

            public Builder clearLastProcessedTimestamp() {
                this.lastProcessedTimestamp_ = 0L;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
            public boolean containsAdRequests(int i10) {
                return internalGetAdRequests().getMap().containsKey(Integer.valueOf(i10));
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
            public boolean containsImpressions(int i10) {
                return internalGetImpressions().getMap().containsKey(Integer.valueOf(i10));
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
            @Deprecated
            public Map<Integer, Timestamps> getAdRequests() {
                return getAdRequestsMap();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
            public int getAdRequestsCount() {
                return internalGetAdRequests().getMap().size();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
            public Map<Integer, Timestamps> getAdRequestsMap() {
                return internalGetAdRequests().getMap();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
            public Timestamps getAdRequestsOrDefault(int i10, Timestamps timestamps) {
                Map<Object, Object> map = internalGetAdRequests().getMap();
                return map.containsKey(Integer.valueOf(i10)) ? (Timestamps) map.get(Integer.valueOf(i10)) : timestamps;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
            public Timestamps getAdRequestsOrThrow(int i10) {
                Map<Object, Object> map = internalGetAdRequests().getMap();
                if (map.containsKey(Integer.valueOf(i10))) {
                    return (Timestamps) map.get(Integer.valueOf(i10));
                }
                throw new IllegalArgumentException();
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserState_descriptor;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
            @Deprecated
            public Map<Integer, AdDomainTimestamps> getImpressions() {
                return getImpressionsMap();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
            public int getImpressionsCount() {
                return internalGetImpressions().getMap().size();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
            public Map<Integer, AdDomainTimestamps> getImpressionsMap() {
                return internalGetImpressions().getMap();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
            public AdDomainTimestamps getImpressionsOrDefault(int i10, AdDomainTimestamps adDomainTimestamps) {
                Map<Object, Object> map = internalGetImpressions().getMap();
                return map.containsKey(Integer.valueOf(i10)) ? (AdDomainTimestamps) map.get(Integer.valueOf(i10)) : adDomainTimestamps;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
            public AdDomainTimestamps getImpressionsOrThrow(int i10) {
                Map<Object, Object> map = internalGetImpressions().getMap();
                if (map.containsKey(Integer.valueOf(i10))) {
                    return (AdDomainTimestamps) map.get(Integer.valueOf(i10));
                }
                throw new IllegalArgumentException();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
            public long getLastProcessedTimestamp() {
                return this.lastProcessedTimestamp_;
            }

            @Deprecated
            public Map<Integer, Timestamps> getMutableAdRequests() {
                return internalGetMutableAdRequests().getMutableMap();
            }

            @Deprecated
            public Map<Integer, AdDomainTimestamps> getMutableImpressions() {
                return internalGetMutableImpressions().getMutableMap();
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserState_fieldAccessorTable.ensureFieldAccessorsInitialized(UserState.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.o6
            public b9 internalGetMapField(int i10) {
                if (i10 == 2) {
                    return internalGetImpressions();
                }
                if (i10 == 3) {
                    return internalGetAdRequests();
                }
                throw new RuntimeException(a.b.e(i10, "Invalid map field number: "));
            }

            @Override // com.explorestack.protobuf.o6
            public b9 internalGetMutableMapField(int i10) {
                if (i10 == 2) {
                    return internalGetMutableImpressions();
                }
                if (i10 == 3) {
                    return internalGetMutableAdRequests();
                }
                throw new RuntimeException(a.b.e(i10, "Invalid map field number: "));
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder putAdRequests(int i10, Timestamps timestamps) {
                timestamps.getClass();
                internalGetMutableAdRequests().getMutableMap().put(Integer.valueOf(i10), timestamps);
                return this;
            }

            public Builder putAllAdRequests(Map<Integer, Timestamps> map) {
                internalGetMutableAdRequests().getMutableMap().putAll(map);
                return this;
            }

            public Builder putAllImpressions(Map<Integer, AdDomainTimestamps> map) {
                internalGetMutableImpressions().getMutableMap().putAll(map);
                return this;
            }

            public Builder putImpressions(int i10, AdDomainTimestamps adDomainTimestamps) {
                adDomainTimestamps.getClass();
                internalGetMutableImpressions().getMutableMap().put(Integer.valueOf(i10), adDomainTimestamps);
                return this;
            }

            public Builder removeAdRequests(int i10) {
                internalGetMutableAdRequests().getMutableMap().remove(Integer.valueOf(i10));
                return this;
            }

            public Builder removeImpressions(int i10) {
                internalGetMutableImpressions().getMutableMap().remove(Integer.valueOf(i10));
                return this;
            }

            public Builder setLastProcessedTimestamp(long j10) {
                this.lastProcessedTimestamp_ = j10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public UserState build() {
                UserState userStateBuildPartial = buildPartial();
                if (userStateBuildPartial.isInitialized()) {
                    return userStateBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) userStateBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public UserState buildPartial() {
                UserState userState = new UserState(this);
                userState.lastProcessedTimestamp_ = this.lastProcessedTimestamp_;
                userState.impressions_ = internalGetImpressions();
                userState.impressions_.makeImmutable();
                userState.adRequests_ = internalGetAdRequests();
                userState.adRequests_.makeImmutable();
                onBuilt();
                return userState;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public UserState getDefaultInstanceForType() {
                return UserState.getDefaultInstance();
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
                this.lastProcessedTimestamp_ = 0L;
                internalGetMutableImpressions().clear();
                internalGetMutableAdRequests().clear();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
            /* renamed from: clone */
            public Builder mo500clone() {
                return (Builder) super.mo500clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UserState) {
                    return mergeFrom((UserState) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UserState userState) {
                if (userState == UserState.getDefaultInstance()) {
                    return this;
                }
                if (userState.getLastProcessedTimestamp() != 0) {
                    setLastProcessedTimestamp(userState.getLastProcessedTimestamp());
                }
                internalGetMutableImpressions().mergeFrom(userState.internalGetImpressions());
                internalGetMutableAdRequests().mergeFrom(userState.internalGetAdRequests());
                mergeUnknownFields(((k7) userState).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserState.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserState.access$1400()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserState r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserState) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserState r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserState) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserState.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserState$Builder");
            }
        }

        public static Builder newBuilder(UserState userState) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userState);
        }

        public static UserState parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (UserState) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private UserState(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UserState parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (UserState) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static UserState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UserState) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public UserState getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static UserState parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (UserState) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private UserState() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UserState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UserState) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static UserState parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (UserState) PARSER.parseFrom(bArr, m5Var);
        }

        private UserState(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                if (tag == 8) {
                                    this.lastProcessedTimestamp_ = yVar.readInt64();
                                } else if (tag == 18) {
                                    if ((i10 & 1) == 0) {
                                        this.impressions_ = b9.newMapField(ImpressionsDefaultEntryHolder.defaultEntry);
                                        i10 |= 1;
                                    }
                                    s8 s8Var = (s8) yVar.readMessage(ImpressionsDefaultEntryHolder.defaultEntry.getParserForType(), m5Var);
                                    this.impressions_.getMutableMap().put(s8Var.getKey(), s8Var.getValue());
                                } else if (tag != 26) {
                                    if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                    }
                                } else {
                                    if ((i10 & 2) == 0) {
                                        this.adRequests_ = b9.newMapField(AdRequestsDefaultEntryHolder.defaultEntry);
                                        i10 |= 2;
                                    }
                                    s8 s8Var2 = (s8) yVar.readMessage(AdRequestsDefaultEntryHolder.defaultEntry.getParserForType(), m5Var);
                                    this.adRequests_.getMutableMap().put(s8Var2.getKey(), s8Var2.getValue());
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

        public static UserState parseFrom(InputStream inputStream) throws IOException {
            return (UserState) k7.parseWithIOException(PARSER, inputStream);
        }

        public static UserState parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (UserState) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static UserState parseFrom(y yVar) throws IOException {
            return (UserState) k7.parseWithIOException(PARSER, yVar);
        }

        public static UserState parseFrom(y yVar, m5 m5Var) throws IOException {
            return (UserState) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface UserStateOrBuilder extends MessageOrBuilder {
        boolean containsAdRequests(int i10);

        boolean containsImpressions(int i10);

        @Deprecated
        Map<Integer, Timestamps> getAdRequests();

        int getAdRequestsCount();

        Map<Integer, Timestamps> getAdRequestsMap();

        Timestamps getAdRequestsOrDefault(int i10, Timestamps timestamps);

        Timestamps getAdRequestsOrThrow(int i10);

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        @Deprecated
        Map<Integer, AdDomainTimestamps> getImpressions();

        int getImpressionsCount();

        Map<Integer, AdDomainTimestamps> getImpressionsMap();

        AdDomainTimestamps getImpressionsOrDefault(int i10, AdDomainTimestamps adDomainTimestamps);

        AdDomainTimestamps getImpressionsOrThrow(int i10);

        long getLastProcessedTimestamp();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class WindowMetrics extends k7 implements WindowMetricsOrBuilder {
        public static final int LAST_1D_FIELD_NUMBER = 2;
        public static final int LAST_1H_FIELD_NUMBER = 1;
        public static final int LAST_7D_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int last1D_;
        private int last1H_;
        private int last7D_;
        private byte memoizedIsInitialized;
        private static final WindowMetrics DEFAULT_INSTANCE = new WindowMetrics();
        private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.WindowMetrics.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public WindowMetrics parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new WindowMetrics(yVar, m5Var);
            }
        };

        public static WindowMetrics getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_WindowMetrics_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WindowMetrics parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (WindowMetrics) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WindowMetrics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (WindowMetrics) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WindowMetrics)) {
                return super.equals(obj);
            }
            WindowMetrics windowMetrics = (WindowMetrics) obj;
            return getLast1H() == windowMetrics.getLast1H() && getLast1D() == windowMetrics.getLast1D() && getLast7D() == windowMetrics.getLast7D() && this.unknownFields.equals(windowMetrics.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.WindowMetricsOrBuilder
        public int getLast1D() {
            return this.last1D_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.WindowMetricsOrBuilder
        public int getLast1H() {
            return this.last1H_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.WindowMetricsOrBuilder
        public int getLast7D() {
            return this.last7D_;
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
            int i11 = this.last1H_;
            int iComputeInt32Size = i11 != 0 ? h0.computeInt32Size(1, i11) : 0;
            int i12 = this.last1D_;
            if (i12 != 0) {
                iComputeInt32Size += h0.computeInt32Size(2, i12);
            }
            int i13 = this.last7D_;
            if (i13 != 0) {
                iComputeInt32Size += h0.computeInt32Size(3, i13);
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
            int iHashCode = this.unknownFields.hashCode() + ((getLast7D() + ((((getLast1D() + ((((getLast1H() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_WindowMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(WindowMetrics.class, Builder.class);
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
            return new WindowMetrics();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            int i10 = this.last1H_;
            if (i10 != 0) {
                h0Var.writeInt32(1, i10);
            }
            int i11 = this.last1D_;
            if (i11 != 0) {
                h0Var.writeInt32(2, i11);
            }
            int i12 = this.last7D_;
            if (i12 != 0) {
                h0Var.writeInt32(3, i12);
            }
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements WindowMetricsOrBuilder {
            private int last1D_;
            private int last1H_;
            private int last7D_;

            private Builder() {
                super(null);
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_WindowMetrics_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = k7.alwaysUseFieldBuilders;
            }

            public Builder clearLast1D() {
                this.last1D_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLast1H() {
                this.last1H_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLast7D() {
                this.last7D_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_WindowMetrics_descriptor;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.WindowMetricsOrBuilder
            public int getLast1D() {
                return this.last1D_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.WindowMetricsOrBuilder
            public int getLast1H() {
                return this.last1H_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.WindowMetricsOrBuilder
            public int getLast7D() {
                return this.last7D_;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_WindowMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(WindowMetrics.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setLast1D(int i10) {
                this.last1D_ = i10;
                onChanged();
                return this;
            }

            public Builder setLast1H(int i10) {
                this.last1H_ = i10;
                onChanged();
                return this;
            }

            public Builder setLast7D(int i10) {
                this.last7D_ = i10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public WindowMetrics build() {
                WindowMetrics windowMetricsBuildPartial = buildPartial();
                if (windowMetricsBuildPartial.isInitialized()) {
                    return windowMetricsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) windowMetricsBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public WindowMetrics buildPartial() {
                WindowMetrics windowMetrics = new WindowMetrics(this);
                windowMetrics.last1H_ = this.last1H_;
                windowMetrics.last1D_ = this.last1D_;
                windowMetrics.last7D_ = this.last7D_;
                onBuilt();
                return windowMetrics;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public WindowMetrics getDefaultInstanceForType() {
                return WindowMetrics.getDefaultInstance();
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
                this.last1H_ = 0;
                this.last1D_ = 0;
                this.last7D_ = 0;
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
            /* renamed from: clone */
            public Builder mo500clone() {
                return (Builder) super.mo500clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WindowMetrics) {
                    return mergeFrom((WindowMetrics) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WindowMetrics windowMetrics) {
                if (windowMetrics == WindowMetrics.getDefaultInstance()) {
                    return this;
                }
                if (windowMetrics.getLast1H() != 0) {
                    setLast1H(windowMetrics.getLast1H());
                }
                if (windowMetrics.getLast1D() != 0) {
                    setLast1D(windowMetrics.getLast1D());
                }
                if (windowMetrics.getLast7D() != 0) {
                    setLast7D(windowMetrics.getLast7D());
                }
                mergeUnknownFields(((k7) windowMetrics).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.WindowMetrics.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.WindowMetrics.access$13800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$WindowMetrics r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.WindowMetrics) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$WindowMetrics r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.WindowMetrics) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.WindowMetrics.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$WindowMetrics$Builder");
            }
        }

        public static Builder newBuilder(WindowMetrics windowMetrics) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(windowMetrics);
        }

        public static WindowMetrics parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (WindowMetrics) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private WindowMetrics(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WindowMetrics parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (WindowMetrics) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static WindowMetrics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (WindowMetrics) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public WindowMetrics getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static WindowMetrics parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (WindowMetrics) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private WindowMetrics() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WindowMetrics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (WindowMetrics) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static WindowMetrics parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (WindowMetrics) PARSER.parseFrom(bArr, m5Var);
        }

        private WindowMetrics(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                this.last1H_ = yVar.readInt32();
                            } else if (tag == 16) {
                                this.last1D_ = yVar.readInt32();
                            } else if (tag != 24) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                this.last7D_ = yVar.readInt32();
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

        public static WindowMetrics parseFrom(InputStream inputStream) throws IOException {
            return (WindowMetrics) k7.parseWithIOException(PARSER, inputStream);
        }

        public static WindowMetrics parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (WindowMetrics) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static WindowMetrics parseFrom(y yVar) throws IOException {
            return (WindowMetrics) k7.parseWithIOException(PARSER, yVar);
        }

        public static WindowMetrics parseFrom(y yVar, m5 m5Var) throws IOException {
            return (WindowMetrics) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface WindowMetricsOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        int getLast1D();

        int getLast1H();

        int getLast7D();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    private SessionMetricsOuterClass() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(m5 m5Var) {
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_sessionmetrics_UserState_descriptor = descriptor2;
        internal_static_sessionmetrics_UserState_fieldAccessorTable = new i7(descriptor2, new String[]{"LastProcessedTimestamp", "Impressions", "AdRequests"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        internal_static_sessionmetrics_UserState_ImpressionsEntry_descriptor = descriptor3;
        internal_static_sessionmetrics_UserState_ImpressionsEntry_fieldAccessorTable = new i7(descriptor3, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor4 = descriptor2.getNestedTypes().get(1);
        internal_static_sessionmetrics_UserState_AdRequestsEntry_descriptor = descriptor4;
        internal_static_sessionmetrics_UserState_AdRequestsEntry_fieldAccessorTable = new i7(descriptor4, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(1);
        internal_static_sessionmetrics_UserSession_descriptor = descriptor5;
        internal_static_sessionmetrics_UserSession_fieldAccessorTable = new i7(descriptor5, new String[]{"LastActivity", "MetricsByAdType", "SessionStart"});
        Descriptors.Descriptor descriptor6 = descriptor5.getNestedTypes().get(0);
        internal_static_sessionmetrics_UserSession_Ecpm_descriptor = descriptor6;
        internal_static_sessionmetrics_UserSession_Ecpm_fieldAccessorTable = new i7(descriptor6, new String[]{"FirstPrices", "LastPrices", "Count"});
        Descriptors.Descriptor descriptor7 = descriptor5.getNestedTypes().get(1);
        internal_static_sessionmetrics_UserSession_Auction_descriptor = descriptor7;
        internal_static_sessionmetrics_UserSession_Auction_fieldAccessorTable = new i7(descriptor7, new String[]{"SourceRequestId", "WinnerBidderId", "LosersBidderId"});
        Descriptors.Descriptor descriptor8 = descriptor5.getNestedTypes().get(2);
        internal_static_sessionmetrics_UserSession_AdTypeMetrics_descriptor = descriptor8;
        internal_static_sessionmetrics_UserSession_AdTypeMetrics_fieldAccessorTable = new i7(descriptor8, new String[]{"AdType", "Impressions", "AdRequests", "Bids", "Wins", "Losses", "Lurls", "Nurls", "CumulativeBidPrice", "CumulativeLurlPrice", "CumulativeNurlPrice", "Ecpm", "Auctions"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(2);
        internal_static_sessionmetrics_Timestamps_descriptor = descriptor9;
        internal_static_sessionmetrics_Timestamps_fieldAccessorTable = new i7(descriptor9, new String[]{"LastTimestamp", "Deltas", "DayBuckets"});
        Descriptors.Descriptor descriptor10 = descriptor9.getNestedTypes().get(0);
        internal_static_sessionmetrics_Timestamps_DayBucket_descriptor = descriptor10;
        internal_static_sessionmetrics_Timestamps_DayBucket_fieldAccessorTable = new i7(descriptor10, new String[]{"StartTime", "Count"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(3);
        internal_static_sessionmetrics_AdDomainTimestamps_descriptor = descriptor11;
        internal_static_sessionmetrics_AdDomainTimestamps_fieldAccessorTable = new i7(descriptor11, new String[]{"AdDomains"});
        Descriptors.Descriptor descriptor12 = descriptor11.getNestedTypes().get(0);
        internal_static_sessionmetrics_AdDomainTimestamps_AdDomainsEntry_descriptor = descriptor12;
        internal_static_sessionmetrics_AdDomainTimestamps_AdDomainsEntry_fieldAccessorTable = new i7(descriptor12, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(4);
        internal_static_sessionmetrics_WindowMetrics_descriptor = descriptor13;
        internal_static_sessionmetrics_WindowMetrics_fieldAccessorTable = new i7(descriptor13, new String[]{"Last1H", "Last1D", "Last7D"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(5);
        internal_static_sessionmetrics_ImpressionMetrics_descriptor = descriptor14;
        internal_static_sessionmetrics_ImpressionMetrics_fieldAccessorTable = new i7(descriptor14, new String[]{"AdType", "Domains"});
        Descriptors.Descriptor descriptor15 = descriptor14.getNestedTypes().get(0);
        internal_static_sessionmetrics_ImpressionMetrics_DomainMetrics_descriptor = descriptor15;
        internal_static_sessionmetrics_ImpressionMetrics_DomainMetrics_fieldAccessorTable = new i7(descriptor15, new String[]{"Domain", "WindowMetrics"});
        Descriptors.Descriptor descriptor16 = getDescriptor().getMessageTypes().get(6);
        internal_static_sessionmetrics_AdRequestMetrics_descriptor = descriptor16;
        internal_static_sessionmetrics_AdRequestMetrics_fieldAccessorTable = new i7(descriptor16, new String[]{"AdType", "WindowMetrics", uQjDr.xIyPVInCUMNBV});
        Descriptors.Descriptor descriptor17 = getDescriptor().getMessageTypes().get(7);
        internal_static_sessionmetrics_SessionMetrics_descriptor = descriptor17;
        internal_static_sessionmetrics_SessionMetrics_fieldAccessorTable = new i7(descriptor17, new String[]{"Impressions", "AdRequests", "CurrentSession"});
        Descriptors.Descriptor descriptor18 = getDescriptor().getMessageTypes().get(8);
        internal_static_sessionmetrics_UserIdQuery_descriptor = descriptor18;
        internal_static_sessionmetrics_UserIdQuery_fieldAccessorTable = new i7(descriptor18, new String[]{"UserId", "Timestamp"});
        Descriptors.Descriptor descriptor19 = getDescriptor().getMessageTypes().get(9);
        internal_static_sessionmetrics_AdRequest_descriptor = descriptor19;
        internal_static_sessionmetrics_AdRequest_fieldAccessorTable = new i7(descriptor19, new String[]{"UserId", "AdType", "Timestamp"});
    }

    public static void registerAllExtensions(i5 i5Var) {
        registerAllExtensions((m5) i5Var);
    }
}
