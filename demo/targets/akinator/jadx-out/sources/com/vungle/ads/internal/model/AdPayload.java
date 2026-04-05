package com.vungle.ads.internal.model;

import androidx.core.app.NotificationCompat;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.play_billing.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vungle.ads.AdConfig;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import j1.o2;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.u;
import kotlin.reflect.KClass;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import kotlinx.serialization.json.JsonTransformingSerializer;
import sv.n0;
import sv.x;
import tu.a0;
import tu.f;
import tu.v;
import tu.z;
import uu.q0;
import uu.u0;
import uu.y0;
import xu.d;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class AdPayload {
    public static final Companion Companion = new Companion(null);
    public static final String FILE_SCHEME = "file://";
    public static final String INCENTIVIZED_BODY_TEXT = "INCENTIVIZED_BODY_TEXT";
    public static final String INCENTIVIZED_CLOSE_TEXT = "INCENTIVIZED_CLOSE_TEXT";
    public static final String INCENTIVIZED_CONTINUE_TEXT = "INCENTIVIZED_CONTINUE_TEXT";
    public static final String INCENTIVIZED_TITLE_TEXT = "INCENTIVIZED_TITLE_TEXT";
    public static final String KEY_VM = "vmURL";
    private static final String TAG = "AdPayload";
    public static final String TPAT_CLICK_COORDINATES_URLS = "video.clickCoordinates";
    private static final String UNKNOWN = "unknown";
    private AdConfig adConfig;
    private final List<PlacementAdUnit> ads;
    private boolean assetsFullyDownloaded;
    private final ConfigPayload config;
    private Map<String, String> incentivizedTextSettings;
    private String indexFilePath;
    private LogEntry logEntry;
    private ConcurrentHashMap<String, String> mraidFiles;
    private final Map<String, AdAsset> partialDownloadAssets;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Serializable
    public static final class AdSizeInfo {
        public static final Companion Companion = new Companion(null);
        private final Integer height;
        private final Integer width;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final KSerializer<AdSizeInfo> serializer() {
                return AdPayload$AdSizeInfo$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AdSizeInfo() {
            this((Integer) null, (Integer) (0 == true ? 1 : 0), 3, (u) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ AdSizeInfo copy$default(AdSizeInfo adSizeInfo, Integer num, Integer num2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = adSizeInfo.width;
            }
            if ((i10 & 2) != 0) {
                num2 = adSizeInfo.height;
            }
            return adSizeInfo.copy(num, num2);
        }

        public static final void write$Self(AdSizeInfo self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Integer num;
            Integer num2;
            e0.checkNotNullParameter(self, "self");
            e0.checkNotNullParameter(output, "output");
            e0.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || (num2 = self.width) == null || num2.intValue() != 0) {
                output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.width);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || (num = self.height) == null || num.intValue() != 0) {
                output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.height);
            }
        }

        public final Integer component1() {
            return this.width;
        }

        public final Integer component2() {
            return this.height;
        }

        public final AdSizeInfo copy(Integer num, Integer num2) {
            return new AdSizeInfo(num, num2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdSizeInfo)) {
                return false;
            }
            AdSizeInfo adSizeInfo = (AdSizeInfo) obj;
            return e0.areEqual(this.width, adSizeInfo.width) && e0.areEqual(this.height, adSizeInfo.height);
        }

        public final Integer getHeight() {
            return this.height;
        }

        public final Integer getWidth() {
            return this.width;
        }

        public int hashCode() {
            Integer num = this.width;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.height;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("AdSizeInfo(width=");
            sb2.append(this.width);
            sb2.append(", height=");
            return a.j(sb2, this.height, ')');
        }

        public AdSizeInfo(Integer num, Integer num2) {
            this.width = num;
            this.height = num2;
        }

        @f
        public /* synthetic */ AdSizeInfo(int i10, @SerialName("w") Integer num, @SerialName(ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME) Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i10 & 1) == 0) {
                this.width = 0;
            } else {
                this.width = num;
            }
            if ((i10 & 2) == 0) {
                this.height = 0;
            } else {
                this.height = num2;
            }
        }

        public /* synthetic */ AdSizeInfo(Integer num, Integer num2, int i10, u uVar) {
            this((i10 & 1) != 0 ? 0 : num, (i10 & 2) != 0 ? 0 : num2);
        }

        @SerialName(ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME)
        public static /* synthetic */ void getHeight$annotations() {
        }

        @SerialName("w")
        public static /* synthetic */ void getWidth$annotations() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Serializable
    public static final class AdUnit {
        public static final Companion Companion = new Companion(null);
        private final Boolean adLoadOptimizationEnabled;
        private final String adMarketId;
        private final AdSizeInfo adSizeInfo;
        private final String adSource;
        private final String adType;
        private final String advAppId;
        private final Boolean clickCoordinatesEnabled;
        private final String creativeId;
        private final String deeplinkUrl;
        private final Integer errorCode;
        private final Integer expiry;

        /* renamed from: id, reason: collision with root package name */
        private final String f50765id;
        private final String info;
        private final List<String> loadAdUrls;
        private final String mediationName;
        private final List<String> notification;
        private final Boolean partialDownloadEnabled;
        private final Integer showClose;
        private final Integer showCloseIncentivized;
        private final Integer sleep;
        private final Boolean templateHeartbeatCheck;
        private final TemplateSettings templateSettings;
        private final String templateType;
        private final Map<String, List<String>> tpat;
        private final Boolean usePreloading;
        private final ViewAbility viewAbility;
        private final String vmURL;
        private final String vmVersion;
        private final WebViewSettings webViewSettings;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final KSerializer<AdUnit> serializer() {
                return AdPayload$AdUnit$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public AdUnit() {
            this((String) null, (String) null, (String) null, (Integer) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, (Integer) null, (Map) null, (String) null, (String) null, (String) null, (List) null, (List) null, (ViewAbility) null, (String) null, (TemplateSettings) null, (String) null, (String) null, (Integer) null, (Integer) null, (AdSizeInfo) null, (WebViewSettings) null, (Boolean) null, (Boolean) null, 536870911, (u) null);
        }

        public static /* synthetic */ AdUnit copy$default(AdUnit adUnit, String str, String str2, String str3, Integer num, String str4, Boolean bool, Boolean bool2, Boolean bool3, String str5, String str6, Integer num2, Integer num3, Map map, String str7, String str8, String str9, List list, List list2, ViewAbility viewAbility, String str10, TemplateSettings templateSettings, String str11, String str12, Integer num4, Integer num5, AdSizeInfo adSizeInfo, WebViewSettings webViewSettings, Boolean bool4, Boolean bool5, int i10, Object obj) {
            Boolean bool6;
            Boolean bool7;
            String str13 = (i10 & 1) != 0 ? adUnit.f50765id : str;
            String str14 = (i10 & 2) != 0 ? adUnit.adType : str2;
            String str15 = (i10 & 4) != 0 ? adUnit.adSource : str3;
            Integer num6 = (i10 & 8) != 0 ? adUnit.expiry : num;
            String str16 = (i10 & 16) != 0 ? adUnit.deeplinkUrl : str4;
            Boolean bool8 = (i10 & 32) != 0 ? adUnit.clickCoordinatesEnabled : bool;
            Boolean bool9 = (i10 & 64) != 0 ? adUnit.adLoadOptimizationEnabled : bool2;
            Boolean bool10 = (i10 & 128) != 0 ? adUnit.templateHeartbeatCheck : bool3;
            String str17 = (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? adUnit.mediationName : str5;
            String str18 = (i10 & 512) != 0 ? adUnit.info : str6;
            Integer num7 = (i10 & 1024) != 0 ? adUnit.sleep : num2;
            Integer num8 = (i10 & 2048) != 0 ? adUnit.errorCode : num3;
            Map map2 = (i10 & 4096) != 0 ? adUnit.tpat : map;
            String str19 = (i10 & Segment.SIZE) != 0 ? adUnit.vmURL : str7;
            String str20 = str13;
            String str21 = (i10 & 16384) != 0 ? adUnit.vmVersion : str8;
            String str22 = (i10 & 32768) != 0 ? adUnit.adMarketId : str9;
            List list3 = (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? adUnit.notification : list;
            List list4 = (i10 & 131072) != 0 ? adUnit.loadAdUrls : list2;
            ViewAbility viewAbility2 = (i10 & 262144) != 0 ? adUnit.viewAbility : viewAbility;
            String str23 = (i10 & 524288) != 0 ? adUnit.templateType : str10;
            TemplateSettings templateSettings2 = (i10 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? adUnit.templateSettings : templateSettings;
            String str24 = (i10 & 2097152) != 0 ? adUnit.creativeId : str11;
            String str25 = (i10 & 4194304) != 0 ? adUnit.advAppId : str12;
            Integer num9 = (i10 & 8388608) != 0 ? adUnit.showClose : num4;
            Integer num10 = (i10 & 16777216) != 0 ? adUnit.showCloseIncentivized : num5;
            AdSizeInfo adSizeInfo2 = (i10 & 33554432) != 0 ? adUnit.adSizeInfo : adSizeInfo;
            WebViewSettings webViewSettings2 = (i10 & 67108864) != 0 ? adUnit.webViewSettings : webViewSettings;
            Boolean bool11 = (i10 & 134217728) != 0 ? adUnit.usePreloading : bool4;
            if ((i10 & 268435456) != 0) {
                bool7 = bool11;
                bool6 = adUnit.partialDownloadEnabled;
            } else {
                bool6 = bool5;
                bool7 = bool11;
            }
            return adUnit.copy(str20, str14, str15, num6, str16, bool8, bool9, bool10, str17, str18, num7, num8, map2, str19, str21, str22, list3, list4, viewAbility2, str23, templateSettings2, str24, str25, num9, num10, adSizeInfo2, webViewSettings2, bool7, bool6);
        }

        public static final void write$Self(AdUnit self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Integer num;
            Integer num2;
            e0.checkNotNullParameter(self, "self");
            e0.checkNotNullParameter(output, "output");
            e0.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.f50765id != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.f50765id);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.adType != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.adType);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.adSource != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.adSource);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.expiry != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, IntSerializer.INSTANCE, self.expiry);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.deeplinkUrl != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.deeplinkUrl);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.clickCoordinatesEnabled != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, BooleanSerializer.INSTANCE, self.clickCoordinatesEnabled);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 6) || self.adLoadOptimizationEnabled != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, BooleanSerializer.INSTANCE, self.adLoadOptimizationEnabled);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 7) || self.templateHeartbeatCheck != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, BooleanSerializer.INSTANCE, self.templateHeartbeatCheck);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 8) || self.mediationName != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.mediationName);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 9) || self.info != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.info);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 10) || self.sleep != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, IntSerializer.INSTANCE, self.sleep);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 11) || self.errorCode != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, IntSerializer.INSTANCE, self.errorCode);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 12) || self.tpat != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, TpatSerializer.INSTANCE, self.tpat);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 13) || self.vmURL != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, self.vmURL);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 14) || self.vmVersion != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, StringSerializer.INSTANCE, self.vmVersion);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 15) || self.adMarketId != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, StringSerializer.INSTANCE, self.adMarketId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 16) || self.notification != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, new ArrayListSerializer(StringSerializer.INSTANCE), self.notification);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 17) || self.loadAdUrls != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, new ArrayListSerializer(StringSerializer.INSTANCE), self.loadAdUrls);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 18) || self.viewAbility != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, AdPayload$ViewAbility$$serializer.INSTANCE, self.viewAbility);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 19) || self.templateType != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, StringSerializer.INSTANCE, self.templateType);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 20) || self.templateSettings != null) {
                output.encodeNullableSerializableElement(serialDesc, 20, AdPayload$TemplateSettings$$serializer.INSTANCE, self.templateSettings);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 21) || self.creativeId != null) {
                output.encodeNullableSerializableElement(serialDesc, 21, StringSerializer.INSTANCE, self.creativeId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 22) || self.advAppId != null) {
                output.encodeNullableSerializableElement(serialDesc, 22, StringSerializer.INSTANCE, self.advAppId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 23) || (num2 = self.showClose) == null || num2.intValue() != 0) {
                output.encodeNullableSerializableElement(serialDesc, 23, IntSerializer.INSTANCE, self.showClose);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 24) || (num = self.showCloseIncentivized) == null || num.intValue() != 0) {
                output.encodeNullableSerializableElement(serialDesc, 24, IntSerializer.INSTANCE, self.showCloseIncentivized);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 25) || self.adSizeInfo != null) {
                output.encodeNullableSerializableElement(serialDesc, 25, AdPayload$AdSizeInfo$$serializer.INSTANCE, self.adSizeInfo);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 26) || self.webViewSettings != null) {
                output.encodeNullableSerializableElement(serialDesc, 26, AdPayload$WebViewSettings$$serializer.INSTANCE, self.webViewSettings);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 27) || !e0.areEqual(self.usePreloading, Boolean.FALSE)) {
                output.encodeNullableSerializableElement(serialDesc, 27, BooleanSerializer.INSTANCE, self.usePreloading);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 28) && self.partialDownloadEnabled == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 28, BooleanSerializer.INSTANCE, self.partialDownloadEnabled);
        }

        public final String component1() {
            return this.f50765id;
        }

        public final String component10() {
            return this.info;
        }

        public final Integer component11() {
            return this.sleep;
        }

        public final Integer component12() {
            return this.errorCode;
        }

        public final Map<String, List<String>> component13() {
            return this.tpat;
        }

        public final String component14() {
            return this.vmURL;
        }

        public final String component15() {
            return this.vmVersion;
        }

        public final String component16() {
            return this.adMarketId;
        }

        public final List<String> component17() {
            return this.notification;
        }

        public final List<String> component18() {
            return this.loadAdUrls;
        }

        public final ViewAbility component19() {
            return this.viewAbility;
        }

        public final String component2() {
            return this.adType;
        }

        public final String component20() {
            return this.templateType;
        }

        public final TemplateSettings component21() {
            return this.templateSettings;
        }

        public final String component22() {
            return this.creativeId;
        }

        public final String component23() {
            return this.advAppId;
        }

        public final Integer component24() {
            return this.showClose;
        }

        public final Integer component25() {
            return this.showCloseIncentivized;
        }

        public final AdSizeInfo component26() {
            return this.adSizeInfo;
        }

        public final WebViewSettings component27() {
            return this.webViewSettings;
        }

        public final Boolean component28() {
            return this.usePreloading;
        }

        public final Boolean component29() {
            return this.partialDownloadEnabled;
        }

        public final String component3() {
            return this.adSource;
        }

        public final Integer component4() {
            return this.expiry;
        }

        public final String component5() {
            return this.deeplinkUrl;
        }

        public final Boolean component6() {
            return this.clickCoordinatesEnabled;
        }

        public final Boolean component7() {
            return this.adLoadOptimizationEnabled;
        }

        public final Boolean component8() {
            return this.templateHeartbeatCheck;
        }

        public final String component9() {
            return this.mediationName;
        }

        public final AdUnit copy(String str, String str2, String str3, Integer num, String str4, Boolean bool, Boolean bool2, Boolean bool3, String str5, String str6, Integer num2, Integer num3, Map<String, ? extends List<String>> map, String str7, String str8, String str9, List<String> list, List<String> list2, ViewAbility viewAbility, String str10, TemplateSettings templateSettings, String str11, String str12, Integer num4, Integer num5, AdSizeInfo adSizeInfo, WebViewSettings webViewSettings, Boolean bool4, Boolean bool5) {
            return new AdUnit(str, str2, str3, num, str4, bool, bool2, bool3, str5, str6, num2, num3, map, str7, str8, str9, list, list2, viewAbility, str10, templateSettings, str11, str12, num4, num5, adSizeInfo, webViewSettings, bool4, bool5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdUnit)) {
                return false;
            }
            AdUnit adUnit = (AdUnit) obj;
            return e0.areEqual(this.f50765id, adUnit.f50765id) && e0.areEqual(this.adType, adUnit.adType) && e0.areEqual(this.adSource, adUnit.adSource) && e0.areEqual(this.expiry, adUnit.expiry) && e0.areEqual(this.deeplinkUrl, adUnit.deeplinkUrl) && e0.areEqual(this.clickCoordinatesEnabled, adUnit.clickCoordinatesEnabled) && e0.areEqual(this.adLoadOptimizationEnabled, adUnit.adLoadOptimizationEnabled) && e0.areEqual(this.templateHeartbeatCheck, adUnit.templateHeartbeatCheck) && e0.areEqual(this.mediationName, adUnit.mediationName) && e0.areEqual(this.info, adUnit.info) && e0.areEqual(this.sleep, adUnit.sleep) && e0.areEqual(this.errorCode, adUnit.errorCode) && e0.areEqual(this.tpat, adUnit.tpat) && e0.areEqual(this.vmURL, adUnit.vmURL) && e0.areEqual(this.vmVersion, adUnit.vmVersion) && e0.areEqual(this.adMarketId, adUnit.adMarketId) && e0.areEqual(this.notification, adUnit.notification) && e0.areEqual(this.loadAdUrls, adUnit.loadAdUrls) && e0.areEqual(this.viewAbility, adUnit.viewAbility) && e0.areEqual(this.templateType, adUnit.templateType) && e0.areEqual(this.templateSettings, adUnit.templateSettings) && e0.areEqual(this.creativeId, adUnit.creativeId) && e0.areEqual(this.advAppId, adUnit.advAppId) && e0.areEqual(this.showClose, adUnit.showClose) && e0.areEqual(this.showCloseIncentivized, adUnit.showCloseIncentivized) && e0.areEqual(this.adSizeInfo, adUnit.adSizeInfo) && e0.areEqual(this.webViewSettings, adUnit.webViewSettings) && e0.areEqual(this.usePreloading, adUnit.usePreloading) && e0.areEqual(this.partialDownloadEnabled, adUnit.partialDownloadEnabled);
        }

        public final Boolean getAdLoadOptimizationEnabled() {
            return this.adLoadOptimizationEnabled;
        }

        public final String getAdMarketId() {
            return this.adMarketId;
        }

        public final AdSizeInfo getAdSizeInfo() {
            return this.adSizeInfo;
        }

        public final String getAdSource() {
            return this.adSource;
        }

        public final String getAdType() {
            return this.adType;
        }

        public final String getAdvAppId() {
            return this.advAppId;
        }

        public final Boolean getClickCoordinatesEnabled() {
            return this.clickCoordinatesEnabled;
        }

        public final String getCreativeId() {
            return this.creativeId;
        }

        public final String getDeeplinkUrl() {
            return this.deeplinkUrl;
        }

        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public final Integer getExpiry() {
            return this.expiry;
        }

        public final String getId() {
            return this.f50765id;
        }

        public final String getInfo() {
            return this.info;
        }

        public final List<String> getLoadAdUrls() {
            return this.loadAdUrls;
        }

        public final String getMediationName() {
            return this.mediationName;
        }

        public final List<String> getNotification() {
            return this.notification;
        }

        public final Boolean getPartialDownloadEnabled() {
            return this.partialDownloadEnabled;
        }

        public final Integer getShowClose() {
            return this.showClose;
        }

        public final Integer getShowCloseIncentivized() {
            return this.showCloseIncentivized;
        }

        public final Integer getSleep() {
            return this.sleep;
        }

        public final Boolean getTemplateHeartbeatCheck() {
            return this.templateHeartbeatCheck;
        }

        public final TemplateSettings getTemplateSettings() {
            return this.templateSettings;
        }

        public final String getTemplateType() {
            return this.templateType;
        }

        public final Map<String, List<String>> getTpat() {
            return this.tpat;
        }

        public final Boolean getUsePreloading() {
            return this.usePreloading;
        }

        public final ViewAbility getViewAbility() {
            return this.viewAbility;
        }

        public final String getVmURL() {
            return this.vmURL;
        }

        public final String getVmVersion() {
            return this.vmVersion;
        }

        public final WebViewSettings getWebViewSettings() {
            return this.webViewSettings;
        }

        public int hashCode() {
            String str = this.f50765id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.adType;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.adSource;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.expiry;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            String str4 = this.deeplinkUrl;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.clickCoordinatesEnabled;
            int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.adLoadOptimizationEnabled;
            int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.templateHeartbeatCheck;
            int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str5 = this.mediationName;
            int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.info;
            int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num2 = this.sleep;
            int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.errorCode;
            int iHashCode12 = (iHashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Map<String, List<String>> map = this.tpat;
            int iHashCode13 = (iHashCode12 + (map == null ? 0 : map.hashCode())) * 31;
            String str7 = this.vmURL;
            int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.vmVersion;
            int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.adMarketId;
            int iHashCode16 = (iHashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
            List<String> list = this.notification;
            int iHashCode17 = (iHashCode16 + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.loadAdUrls;
            int iHashCode18 = (iHashCode17 + (list2 == null ? 0 : list2.hashCode())) * 31;
            ViewAbility viewAbility = this.viewAbility;
            int iHashCode19 = (iHashCode18 + (viewAbility == null ? 0 : viewAbility.hashCode())) * 31;
            String str10 = this.templateType;
            int iHashCode20 = (iHashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
            TemplateSettings templateSettings = this.templateSettings;
            int iHashCode21 = (iHashCode20 + (templateSettings == null ? 0 : templateSettings.hashCode())) * 31;
            String str11 = this.creativeId;
            int iHashCode22 = (iHashCode21 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.advAppId;
            int iHashCode23 = (iHashCode22 + (str12 == null ? 0 : str12.hashCode())) * 31;
            Integer num4 = this.showClose;
            int iHashCode24 = (iHashCode23 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.showCloseIncentivized;
            int iHashCode25 = (iHashCode24 + (num5 == null ? 0 : num5.hashCode())) * 31;
            AdSizeInfo adSizeInfo = this.adSizeInfo;
            int iHashCode26 = (iHashCode25 + (adSizeInfo == null ? 0 : adSizeInfo.hashCode())) * 31;
            WebViewSettings webViewSettings = this.webViewSettings;
            int iHashCode27 = (iHashCode26 + (webViewSettings == null ? 0 : webViewSettings.hashCode())) * 31;
            Boolean bool4 = this.usePreloading;
            int iHashCode28 = (iHashCode27 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.partialDownloadEnabled;
            return iHashCode28 + (bool5 != null ? bool5.hashCode() : 0);
        }

        public String toString() {
            return "AdUnit(id=" + this.f50765id + ", adType=" + this.adType + ", adSource=" + this.adSource + ", expiry=" + this.expiry + ", deeplinkUrl=" + this.deeplinkUrl + ", clickCoordinatesEnabled=" + this.clickCoordinatesEnabled + ", adLoadOptimizationEnabled=" + this.adLoadOptimizationEnabled + ", templateHeartbeatCheck=" + this.templateHeartbeatCheck + ", mediationName=" + this.mediationName + ", info=" + this.info + ", sleep=" + this.sleep + ", errorCode=" + this.errorCode + ", tpat=" + this.tpat + ", vmURL=" + this.vmURL + ", vmVersion=" + this.vmVersion + ", adMarketId=" + this.adMarketId + ", notification=" + this.notification + ", loadAdUrls=" + this.loadAdUrls + ", viewAbility=" + this.viewAbility + ", templateType=" + this.templateType + ", templateSettings=" + this.templateSettings + ", creativeId=" + this.creativeId + ", advAppId=" + this.advAppId + ", showClose=" + this.showClose + ", showCloseIncentivized=" + this.showCloseIncentivized + ", adSizeInfo=" + this.adSizeInfo + ", webViewSettings=" + this.webViewSettings + ", usePreloading=" + this.usePreloading + ", partialDownloadEnabled=" + this.partialDownloadEnabled + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AdUnit(String str, String str2, String str3, Integer num, String str4, Boolean bool, Boolean bool2, Boolean bool3, String str5, String str6, Integer num2, Integer num3, Map<String, ? extends List<String>> map, String str7, String str8, String str9, List<String> list, List<String> list2, ViewAbility viewAbility, String str10, TemplateSettings templateSettings, String str11, String str12, Integer num4, Integer num5, AdSizeInfo adSizeInfo, WebViewSettings webViewSettings, Boolean bool4, Boolean bool5) {
            this.f50765id = str;
            this.adType = str2;
            this.adSource = str3;
            this.expiry = num;
            this.deeplinkUrl = str4;
            this.clickCoordinatesEnabled = bool;
            this.adLoadOptimizationEnabled = bool2;
            this.templateHeartbeatCheck = bool3;
            this.mediationName = str5;
            this.info = str6;
            this.sleep = num2;
            this.errorCode = num3;
            this.tpat = map;
            this.vmURL = str7;
            this.vmVersion = str8;
            this.adMarketId = str9;
            this.notification = list;
            this.loadAdUrls = list2;
            this.viewAbility = viewAbility;
            this.templateType = str10;
            this.templateSettings = templateSettings;
            this.creativeId = str11;
            this.advAppId = str12;
            this.showClose = num4;
            this.showCloseIncentivized = num5;
            this.adSizeInfo = adSizeInfo;
            this.webViewSettings = webViewSettings;
            this.usePreloading = bool4;
            this.partialDownloadEnabled = bool5;
        }

        @SerialName("ad_load_optimization")
        public static /* synthetic */ void getAdLoadOptimizationEnabled$annotations() {
        }

        @SerialName("ad_market_id")
        public static /* synthetic */ void getAdMarketId$annotations() {
        }

        @SerialName("ad_size")
        public static /* synthetic */ void getAdSizeInfo$annotations() {
        }

        @SerialName("ad_source")
        public static /* synthetic */ void getAdSource$annotations() {
        }

        @SerialName("ad_type")
        public static /* synthetic */ void getAdType$annotations() {
        }

        @SerialName("app_id")
        public static /* synthetic */ void getAdvAppId$annotations() {
        }

        @SerialName("click_coordinates_enabled")
        public static /* synthetic */ void getClickCoordinatesEnabled$annotations() {
        }

        @SerialName(CampaignEx.JSON_KEY_CREATIVE_ID)
        public static /* synthetic */ void getCreativeId$annotations() {
        }

        @SerialName("deeplink_url")
        public static /* synthetic */ void getDeeplinkUrl$annotations() {
        }

        @SerialName("error_code")
        public static /* synthetic */ void getErrorCode$annotations() {
        }

        @SerialName("expiry")
        public static /* synthetic */ void getExpiry$annotations() {
        }

        @SerialName("id")
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("info")
        public static /* synthetic */ void getInfo$annotations() {
        }

        @SerialName(Constants.LOAD_AD)
        public static /* synthetic */ void getLoadAdUrls$annotations() {
        }

        @SerialName("mediation_name")
        public static /* synthetic */ void getMediationName$annotations() {
        }

        @SerialName("notification")
        public static /* synthetic */ void getNotification$annotations() {
        }

        @SerialName("ad_partial_download_enabled")
        public static /* synthetic */ void getPartialDownloadEnabled$annotations() {
        }

        @SerialName("show_close")
        public static /* synthetic */ void getShowClose$annotations() {
        }

        @SerialName("show_close_incentivized")
        public static /* synthetic */ void getShowCloseIncentivized$annotations() {
        }

        @SerialName("sleep")
        public static /* synthetic */ void getSleep$annotations() {
        }

        @SerialName("template_heartbeat_check")
        public static /* synthetic */ void getTemplateHeartbeatCheck$annotations() {
        }

        @SerialName("template_settings")
        public static /* synthetic */ void getTemplateSettings$annotations() {
        }

        @SerialName("template_type")
        public static /* synthetic */ void getTemplateType$annotations() {
        }

        @Serializable(with = TpatSerializer.class)
        public static /* synthetic */ void getTpat$annotations() {
        }

        @SerialName("use_preloading")
        public static /* synthetic */ void getUsePreloading$annotations() {
        }

        @SerialName("viewability")
        public static /* synthetic */ void getViewAbility$annotations() {
        }

        @SerialName("vm_url")
        public static /* synthetic */ void getVmURL$annotations() {
        }

        @SerialName("vm_version")
        public static /* synthetic */ void getVmVersion$annotations() {
        }

        @SerialName("webview_settings")
        public static /* synthetic */ void getWebViewSettings$annotations() {
        }

        @f
        public /* synthetic */ AdUnit(int i10, @SerialName("id") String str, @SerialName("ad_type") String str2, @SerialName("ad_source") String str3, @SerialName("expiry") Integer num, @SerialName("deeplink_url") String str4, @SerialName("click_coordinates_enabled") Boolean bool, @SerialName("ad_load_optimization") Boolean bool2, @SerialName("template_heartbeat_check") Boolean bool3, @SerialName("mediation_name") String str5, @SerialName("info") String str6, @SerialName("sleep") Integer num2, @SerialName("error_code") Integer num3, @Serializable(with = TpatSerializer.class) Map map, @SerialName("vm_url") String str7, @SerialName("vm_version") String str8, @SerialName("ad_market_id") String str9, @SerialName("notification") List list, @SerialName(Constants.LOAD_AD) List list2, @SerialName("viewability") ViewAbility viewAbility, @SerialName("template_type") String str10, @SerialName("template_settings") TemplateSettings templateSettings, @SerialName(CampaignEx.JSON_KEY_CREATIVE_ID) String str11, @SerialName("app_id") String str12, @SerialName("show_close") Integer num4, @SerialName("show_close_incentivized") Integer num5, @SerialName("ad_size") AdSizeInfo adSizeInfo, @SerialName("webview_settings") WebViewSettings webViewSettings, @SerialName("use_preloading") Boolean bool4, @SerialName("ad_partial_download_enabled") Boolean bool5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i10 & 1) == 0) {
                this.f50765id = null;
            } else {
                this.f50765id = str;
            }
            if ((i10 & 2) == 0) {
                this.adType = null;
            } else {
                this.adType = str2;
            }
            if ((i10 & 4) == 0) {
                this.adSource = null;
            } else {
                this.adSource = str3;
            }
            if ((i10 & 8) == 0) {
                this.expiry = null;
            } else {
                this.expiry = num;
            }
            if ((i10 & 16) == 0) {
                this.deeplinkUrl = null;
            } else {
                this.deeplinkUrl = str4;
            }
            if ((i10 & 32) == 0) {
                this.clickCoordinatesEnabled = null;
            } else {
                this.clickCoordinatesEnabled = bool;
            }
            if ((i10 & 64) == 0) {
                this.adLoadOptimizationEnabled = null;
            } else {
                this.adLoadOptimizationEnabled = bool2;
            }
            if ((i10 & 128) == 0) {
                this.templateHeartbeatCheck = null;
            } else {
                this.templateHeartbeatCheck = bool3;
            }
            if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
                this.mediationName = null;
            } else {
                this.mediationName = str5;
            }
            if ((i10 & 512) == 0) {
                this.info = null;
            } else {
                this.info = str6;
            }
            if ((i10 & 1024) == 0) {
                this.sleep = null;
            } else {
                this.sleep = num2;
            }
            if ((i10 & 2048) == 0) {
                this.errorCode = null;
            } else {
                this.errorCode = num3;
            }
            if ((i10 & 4096) == 0) {
                this.tpat = null;
            } else {
                this.tpat = map;
            }
            if ((i10 & Segment.SIZE) == 0) {
                this.vmURL = null;
            } else {
                this.vmURL = str7;
            }
            if ((i10 & 16384) == 0) {
                this.vmVersion = null;
            } else {
                this.vmVersion = str8;
            }
            if ((32768 & i10) == 0) {
                this.adMarketId = null;
            } else {
                this.adMarketId = str9;
            }
            if ((65536 & i10) == 0) {
                this.notification = null;
            } else {
                this.notification = list;
            }
            if ((131072 & i10) == 0) {
                this.loadAdUrls = null;
            } else {
                this.loadAdUrls = list2;
            }
            if ((262144 & i10) == 0) {
                this.viewAbility = null;
            } else {
                this.viewAbility = viewAbility;
            }
            if ((524288 & i10) == 0) {
                this.templateType = null;
            } else {
                this.templateType = str10;
            }
            if ((1048576 & i10) == 0) {
                this.templateSettings = null;
            } else {
                this.templateSettings = templateSettings;
            }
            if ((2097152 & i10) == 0) {
                this.creativeId = null;
            } else {
                this.creativeId = str11;
            }
            if ((4194304 & i10) == 0) {
                this.advAppId = null;
            } else {
                this.advAppId = str12;
            }
            if ((8388608 & i10) == 0) {
                this.showClose = 0;
            } else {
                this.showClose = num4;
            }
            if ((16777216 & i10) == 0) {
                this.showCloseIncentivized = 0;
            } else {
                this.showCloseIncentivized = num5;
            }
            if ((33554432 & i10) == 0) {
                this.adSizeInfo = null;
            } else {
                this.adSizeInfo = adSizeInfo;
            }
            if ((67108864 & i10) == 0) {
                this.webViewSettings = null;
            } else {
                this.webViewSettings = webViewSettings;
            }
            this.usePreloading = (134217728 & i10) == 0 ? Boolean.FALSE : bool4;
            if ((i10 & 268435456) == 0) {
                this.partialDownloadEnabled = null;
            } else {
                this.partialDownloadEnabled = bool5;
            }
        }

        public /* synthetic */ AdUnit(String str, String str2, String str3, Integer num, String str4, Boolean bool, Boolean bool2, Boolean bool3, String str5, String str6, Integer num2, Integer num3, Map map, String str7, String str8, String str9, List list, List list2, ViewAbility viewAbility, String str10, TemplateSettings templateSettings, String str11, String str12, Integer num4, Integer num5, AdSizeInfo adSizeInfo, WebViewSettings webViewSettings, Boolean bool4, Boolean bool5, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : bool, (i10 & 64) != 0 ? null : bool2, (i10 & 128) != 0 ? null : bool3, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : str5, (i10 & 512) != 0 ? null : str6, (i10 & 1024) != 0 ? null : num2, (i10 & 2048) != 0 ? null : num3, (i10 & 4096) != 0 ? null : map, (i10 & Segment.SIZE) != 0 ? null : str7, (i10 & 16384) != 0 ? null : str8, (i10 & 32768) != 0 ? null : str9, (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : list, (i10 & 131072) != 0 ? null : list2, (i10 & 262144) != 0 ? null : viewAbility, (i10 & 524288) != 0 ? null : str10, (i10 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : templateSettings, (i10 & 2097152) != 0 ? null : str11, (i10 & 4194304) != 0 ? null : str12, (i10 & 8388608) != 0 ? null : num4, (i10 & 16777216) == 0 ? num5 : 0, (i10 & 33554432) != 0 ? null : adSizeInfo, (i10 & 67108864) != 0 ? null : webViewSettings, (i10 & 134217728) != 0 ? Boolean.FALSE : bool4, (i10 & 268435456) != 0 ? null : bool5);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Serializable
    public static final class CacheableReplacement {
        public static final Companion Companion = new Companion(null);
        private final Integer downloadPercent;
        private final String extension;
        private final String url;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final KSerializer<CacheableReplacement> serializer() {
                return AdPayload$CacheableReplacement$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public CacheableReplacement() {
            this((String) null, (String) null, (Integer) null, 7, (u) null);
        }

        public static /* synthetic */ CacheableReplacement copy$default(CacheableReplacement cacheableReplacement, String str, String str2, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = cacheableReplacement.url;
            }
            if ((i10 & 2) != 0) {
                str2 = cacheableReplacement.extension;
            }
            if ((i10 & 4) != 0) {
                num = cacheableReplacement.downloadPercent;
            }
            return cacheableReplacement.copy(str, str2, num);
        }

        public static final void write$Self(CacheableReplacement self, CompositeEncoder output, SerialDescriptor serialDesc) {
            e0.checkNotNullParameter(self, "self");
            e0.checkNotNullParameter(output, "output");
            e0.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.url != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.url);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.extension != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.extension);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.downloadPercent == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.downloadPercent);
        }

        public final String component1() {
            return this.url;
        }

        public final String component2() {
            return this.extension;
        }

        public final Integer component3() {
            return this.downloadPercent;
        }

        public final CacheableReplacement copy(String str, String str2, Integer num) {
            return new CacheableReplacement(str, str2, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CacheableReplacement)) {
                return false;
            }
            CacheableReplacement cacheableReplacement = (CacheableReplacement) obj;
            return e0.areEqual(this.url, cacheableReplacement.url) && e0.areEqual(this.extension, cacheableReplacement.extension) && e0.areEqual(this.downloadPercent, cacheableReplacement.downloadPercent);
        }

        public final Integer getDownloadPercent() {
            return this.downloadPercent;
        }

        public final String getExtension() {
            return this.extension;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.url;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.extension;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.downloadPercent;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("CacheableReplacement(url=");
            sb2.append(this.url);
            sb2.append(", extension=");
            sb2.append(this.extension);
            sb2.append(", downloadPercent=");
            return a.j(sb2, this.downloadPercent, ')');
        }

        @f
        public /* synthetic */ CacheableReplacement(int i10, String str, String str2, @SerialName("download_percent") Integer num, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i10 & 1) == 0) {
                this.url = null;
            } else {
                this.url = str;
            }
            if ((i10 & 2) == 0) {
                this.extension = null;
            } else {
                this.extension = str2;
            }
            if ((i10 & 4) == 0) {
                this.downloadPercent = null;
            } else {
                this.downloadPercent = num;
            }
        }

        public CacheableReplacement(String str, String str2, Integer num) {
            this.url = str;
            this.extension = str2;
            this.downloadPercent = num;
        }

        public /* synthetic */ CacheableReplacement(String str, String str2, Integer num, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : num);
        }

        @SerialName("download_percent")
        public static /* synthetic */ void getDownloadPercent$annotations() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<AdPayload> serializer() {
            return AdPayload$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Serializable
    public static final class PlacementAdUnit {
        public static final Companion Companion = new Companion(null);
        private final AdUnit adMarkup;
        private final String placementReferenceId;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final KSerializer<PlacementAdUnit> serializer() {
                return AdPayload$PlacementAdUnit$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PlacementAdUnit() {
            this((String) null, (AdUnit) (0 == true ? 1 : 0), 3, (u) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ PlacementAdUnit copy$default(PlacementAdUnit placementAdUnit, String str, AdUnit adUnit, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = placementAdUnit.placementReferenceId;
            }
            if ((i10 & 2) != 0) {
                adUnit = placementAdUnit.adMarkup;
            }
            return placementAdUnit.copy(str, adUnit);
        }

        public static final void write$Self(PlacementAdUnit self, CompositeEncoder output, SerialDescriptor serialDesc) {
            e0.checkNotNullParameter(self, "self");
            e0.checkNotNullParameter(output, "output");
            e0.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.placementReferenceId != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.placementReferenceId);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.adMarkup == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 1, AdPayload$AdUnit$$serializer.INSTANCE, self.adMarkup);
        }

        public final String component1() {
            return this.placementReferenceId;
        }

        public final AdUnit component2() {
            return this.adMarkup;
        }

        public final PlacementAdUnit copy(String str, AdUnit adUnit) {
            return new PlacementAdUnit(str, adUnit);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlacementAdUnit)) {
                return false;
            }
            PlacementAdUnit placementAdUnit = (PlacementAdUnit) obj;
            return e0.areEqual(this.placementReferenceId, placementAdUnit.placementReferenceId) && e0.areEqual(this.adMarkup, placementAdUnit.adMarkup);
        }

        public final AdUnit getAdMarkup() {
            return this.adMarkup;
        }

        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        public int hashCode() {
            String str = this.placementReferenceId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AdUnit adUnit = this.adMarkup;
            return iHashCode + (adUnit != null ? adUnit.hashCode() : 0);
        }

        public String toString() {
            return "PlacementAdUnit(placementReferenceId=" + this.placementReferenceId + ", adMarkup=" + this.adMarkup + ')';
        }

        @f
        public /* synthetic */ PlacementAdUnit(int i10, @SerialName("placement_reference_id") String str, @SerialName("ad_markup") AdUnit adUnit, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i10 & 1) == 0) {
                this.placementReferenceId = null;
            } else {
                this.placementReferenceId = str;
            }
            if ((i10 & 2) == 0) {
                this.adMarkup = null;
            } else {
                this.adMarkup = adUnit;
            }
        }

        public PlacementAdUnit(String str, AdUnit adUnit) {
            this.placementReferenceId = str;
            this.adMarkup = adUnit;
        }

        public /* synthetic */ PlacementAdUnit(String str, AdUnit adUnit, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : adUnit);
        }

        @SerialName("ad_markup")
        public static /* synthetic */ void getAdMarkup$annotations() {
        }

        @SerialName("placement_reference_id")
        public static /* synthetic */ void getPlacementReferenceId$annotations() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Serializable
    public static final class TemplateSettings {
        public static final Companion Companion = new Companion(null);
        private final Map<String, CacheableReplacement> cacheableReplacements;
        private final Map<String, String> normalReplacements;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final KSerializer<TemplateSettings> serializer() {
                return AdPayload$TemplateSettings$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TemplateSettings() {
            this((Map) null, (Map) (0 == true ? 1 : 0), 3, (u) (0 == true ? 1 : 0));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TemplateSettings copy$default(TemplateSettings templateSettings, Map map, Map map2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                map = templateSettings.normalReplacements;
            }
            if ((i10 & 2) != 0) {
                map2 = templateSettings.cacheableReplacements;
            }
            return templateSettings.copy(map, map2);
        }

        public static final void write$Self(TemplateSettings self, CompositeEncoder output, SerialDescriptor serialDesc) {
            e0.checkNotNullParameter(self, "self");
            e0.checkNotNullParameter(output, "output");
            e0.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.normalReplacements != null) {
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                output.encodeNullableSerializableElement(serialDesc, 0, new LinkedHashMapSerializer(stringSerializer, stringSerializer), self.normalReplacements);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.cacheableReplacements == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 1, new LinkedHashMapSerializer(StringSerializer.INSTANCE, AdPayload$CacheableReplacement$$serializer.INSTANCE), self.cacheableReplacements);
        }

        public final Map<String, String> component1() {
            return this.normalReplacements;
        }

        public final Map<String, CacheableReplacement> component2() {
            return this.cacheableReplacements;
        }

        public final TemplateSettings copy(Map<String, String> map, Map<String, CacheableReplacement> map2) {
            return new TemplateSettings(map, map2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TemplateSettings)) {
                return false;
            }
            TemplateSettings templateSettings = (TemplateSettings) obj;
            return e0.areEqual(this.normalReplacements, templateSettings.normalReplacements) && e0.areEqual(this.cacheableReplacements, templateSettings.cacheableReplacements);
        }

        public final Map<String, CacheableReplacement> getCacheableReplacements() {
            return this.cacheableReplacements;
        }

        public final Map<String, String> getNormalReplacements() {
            return this.normalReplacements;
        }

        public int hashCode() {
            Map<String, String> map = this.normalReplacements;
            int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
            Map<String, CacheableReplacement> map2 = this.cacheableReplacements;
            return iHashCode + (map2 != null ? map2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("TemplateSettings(normalReplacements=");
            sb2.append(this.normalReplacements);
            sb2.append(", cacheableReplacements=");
            return o2.q(sb2, this.cacheableReplacements, ')');
        }

        @f
        public /* synthetic */ TemplateSettings(int i10, @SerialName("normal_replacements") Map map, @SerialName("cacheable_replacements") Map map2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i10 & 1) == 0) {
                this.normalReplacements = null;
            } else {
                this.normalReplacements = map;
            }
            if ((i10 & 2) == 0) {
                this.cacheableReplacements = null;
            } else {
                this.cacheableReplacements = map2;
            }
        }

        public TemplateSettings(Map<String, String> map, Map<String, CacheableReplacement> map2) {
            this.normalReplacements = map;
            this.cacheableReplacements = map2;
        }

        public /* synthetic */ TemplateSettings(Map map, Map map2, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : map, (i10 & 2) != 0 ? null : map2);
        }

        @SerialName("cacheable_replacements")
        public static /* synthetic */ void getCacheableReplacements$annotations() {
        }

        @SerialName("normal_replacements")
        public static /* synthetic */ void getNormalReplacements$annotations() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class TpatSerializer extends JsonTransformingSerializer<Map<String, ? extends List<? extends String>>> {
        public static final TpatSerializer INSTANCE = new TpatSerializer();

        /* JADX WARN: Illegal instructions before constructor call */
        private TpatSerializer() {
            g1 g1Var = g1.f71834a;
            super(BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(g1Var), BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(g1Var))));
        }

        @Override // kotlinx.serialization.json.JsonTransformingSerializer
        public JsonElement transformDeserialize(JsonElement element) {
            e0.checkNotNullParameter(element, "element");
            JsonObject jsonObject = JsonElementKt.getJsonObject(element);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                if (!e0.areEqual(entry.getKey(), "moat")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return new JsonObject(linkedHashMap);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Serializable
    public static final class ViewAbility {
        public static final Companion Companion = new Companion(null);

        /* renamed from: om, reason: collision with root package name */
        private final ViewAbilityInfo f50766om;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final KSerializer<ViewAbility> serializer() {
                return AdPayload$ViewAbility$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ViewAbility() {
            this((ViewAbilityInfo) null, 1, (u) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ ViewAbility copy$default(ViewAbility viewAbility, ViewAbilityInfo viewAbilityInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                viewAbilityInfo = viewAbility.f50766om;
            }
            return viewAbility.copy(viewAbilityInfo);
        }

        public static final void write$Self(ViewAbility self, CompositeEncoder output, SerialDescriptor serialDesc) {
            e0.checkNotNullParameter(self, "self");
            e0.checkNotNullParameter(output, "output");
            e0.checkNotNullParameter(serialDesc, "serialDesc");
            if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.f50766om == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 0, AdPayload$ViewAbilityInfo$$serializer.INSTANCE, self.f50766om);
        }

        public final ViewAbilityInfo component1() {
            return this.f50766om;
        }

        public final ViewAbility copy(ViewAbilityInfo viewAbilityInfo) {
            return new ViewAbility(viewAbilityInfo);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewAbility) && e0.areEqual(this.f50766om, ((ViewAbility) obj).f50766om);
        }

        public final ViewAbilityInfo getOm() {
            return this.f50766om;
        }

        public int hashCode() {
            ViewAbilityInfo viewAbilityInfo = this.f50766om;
            if (viewAbilityInfo == null) {
                return 0;
            }
            return viewAbilityInfo.hashCode();
        }

        public String toString() {
            return "ViewAbility(om=" + this.f50766om + ')';
        }

        @f
        public /* synthetic */ ViewAbility(int i10, ViewAbilityInfo viewAbilityInfo, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i10 & 1) == 0) {
                this.f50766om = null;
            } else {
                this.f50766om = viewAbilityInfo;
            }
        }

        public ViewAbility(ViewAbilityInfo viewAbilityInfo) {
            this.f50766om = viewAbilityInfo;
        }

        public /* synthetic */ ViewAbility(ViewAbilityInfo viewAbilityInfo, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : viewAbilityInfo);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Serializable
    public static final class ViewAbilityInfo {
        public static final Companion Companion = new Companion(null);
        private final String extraVast;
        private final Boolean isEnabled;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final KSerializer<ViewAbilityInfo> serializer() {
                return AdPayload$ViewAbilityInfo$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ViewAbilityInfo() {
            this((Boolean) null, (String) (0 == true ? 1 : 0), 3, (u) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ ViewAbilityInfo copy$default(ViewAbilityInfo viewAbilityInfo, Boolean bool, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = viewAbilityInfo.isEnabled;
            }
            if ((i10 & 2) != 0) {
                str = viewAbilityInfo.extraVast;
            }
            return viewAbilityInfo.copy(bool, str);
        }

        public static final void write$Self(ViewAbilityInfo self, CompositeEncoder output, SerialDescriptor serialDesc) {
            e0.checkNotNullParameter(self, "self");
            e0.checkNotNullParameter(output, "output");
            e0.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.isEnabled != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.isEnabled);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.extraVast == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.extraVast);
        }

        public final Boolean component1() {
            return this.isEnabled;
        }

        public final String component2() {
            return this.extraVast;
        }

        public final ViewAbilityInfo copy(Boolean bool, String str) {
            return new ViewAbilityInfo(bool, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewAbilityInfo)) {
                return false;
            }
            ViewAbilityInfo viewAbilityInfo = (ViewAbilityInfo) obj;
            return e0.areEqual(this.isEnabled, viewAbilityInfo.isEnabled) && e0.areEqual(this.extraVast, viewAbilityInfo.extraVast);
        }

        public final String getExtraVast() {
            return this.extraVast;
        }

        public int hashCode() {
            Boolean bool = this.isEnabled;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.extraVast;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final Boolean isEnabled() {
            return this.isEnabled;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ViewAbilityInfo(isEnabled=");
            sb2.append(this.isEnabled);
            sb2.append(", extraVast=");
            return p0.o2.q(sb2, this.extraVast, ')');
        }

        @f
        public /* synthetic */ ViewAbilityInfo(int i10, @SerialName("is_enabled") Boolean bool, @SerialName("extra_vast") String str, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i10 & 1) == 0) {
                this.isEnabled = null;
            } else {
                this.isEnabled = bool;
            }
            if ((i10 & 2) == 0) {
                this.extraVast = null;
            } else {
                this.extraVast = str;
            }
        }

        public ViewAbilityInfo(Boolean bool, String str) {
            this.isEnabled = bool;
            this.extraVast = str;
        }

        public /* synthetic */ ViewAbilityInfo(Boolean bool, String str, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : str);
        }

        @SerialName("extra_vast")
        public static /* synthetic */ void getExtraVast$annotations() {
        }

        @SerialName("is_enabled")
        public static /* synthetic */ void isEnabled$annotations() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Serializable
    public static final class WebViewSettings {
        public static final Companion Companion = new Companion(null);
        private final Boolean allowFileAccessFromFileUrls;
        private final Boolean allowUniversalAccessFromFileUrls;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final KSerializer<WebViewSettings> serializer() {
                return AdPayload$WebViewSettings$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public WebViewSettings() {
            this((Boolean) null, (Boolean) (0 == true ? 1 : 0), 3, (u) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ WebViewSettings copy$default(WebViewSettings webViewSettings, Boolean bool, Boolean bool2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = webViewSettings.allowFileAccessFromFileUrls;
            }
            if ((i10 & 2) != 0) {
                bool2 = webViewSettings.allowUniversalAccessFromFileUrls;
            }
            return webViewSettings.copy(bool, bool2);
        }

        public static final void write$Self(WebViewSettings self, CompositeEncoder output, SerialDescriptor serialDesc) {
            e0.checkNotNullParameter(self, "self");
            e0.checkNotNullParameter(output, "output");
            e0.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.allowFileAccessFromFileUrls != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.allowFileAccessFromFileUrls);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.allowUniversalAccessFromFileUrls == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, self.allowUniversalAccessFromFileUrls);
        }

        public final Boolean component1() {
            return this.allowFileAccessFromFileUrls;
        }

        public final Boolean component2() {
            return this.allowUniversalAccessFromFileUrls;
        }

        public final WebViewSettings copy(Boolean bool, Boolean bool2) {
            return new WebViewSettings(bool, bool2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebViewSettings)) {
                return false;
            }
            WebViewSettings webViewSettings = (WebViewSettings) obj;
            return e0.areEqual(this.allowFileAccessFromFileUrls, webViewSettings.allowFileAccessFromFileUrls) && e0.areEqual(this.allowUniversalAccessFromFileUrls, webViewSettings.allowUniversalAccessFromFileUrls);
        }

        public final Boolean getAllowFileAccessFromFileUrls() {
            return this.allowFileAccessFromFileUrls;
        }

        public final Boolean getAllowUniversalAccessFromFileUrls() {
            return this.allowUniversalAccessFromFileUrls;
        }

        public int hashCode() {
            Boolean bool = this.allowFileAccessFromFileUrls;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.allowUniversalAccessFromFileUrls;
            return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
        }

        public String toString() {
            return "WebViewSettings(allowFileAccessFromFileUrls=" + this.allowFileAccessFromFileUrls + ", allowUniversalAccessFromFileUrls=" + this.allowUniversalAccessFromFileUrls + ')';
        }

        @f
        public /* synthetic */ WebViewSettings(int i10, @SerialName("allow_file_access_from_file_urls") Boolean bool, @SerialName("allow_universal_access_from_file_urls") Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i10 & 1) == 0) {
                this.allowFileAccessFromFileUrls = null;
            } else {
                this.allowFileAccessFromFileUrls = bool;
            }
            if ((i10 & 2) == 0) {
                this.allowUniversalAccessFromFileUrls = null;
            } else {
                this.allowUniversalAccessFromFileUrls = bool2;
            }
        }

        public WebViewSettings(Boolean bool, Boolean bool2) {
            this.allowFileAccessFromFileUrls = bool;
            this.allowUniversalAccessFromFileUrls = bool2;
        }

        public /* synthetic */ WebViewSettings(Boolean bool, Boolean bool2, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : bool2);
        }

        @SerialName("allow_file_access_from_file_urls")
        public static /* synthetic */ void getAllowFileAccessFromFileUrls$annotations() {
        }

        @SerialName("allow_universal_access_from_file_urls")
        public static /* synthetic */ void getAllowUniversalAccessFromFileUrls$annotations() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdPayload() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final String complexReplace(String str, String str2, String str3) {
        String strQuote = Pattern.quote(str2);
        e0.checkNotNullExpressionValue(strQuote, "quote(oldValue)");
        return new x(strQuote).replace(str, valueOrEmpty(str3));
    }

    private final v computeAssetRequirement(Integer num) {
        return (isNativeTemplateType() || !adLoadOptimizationEnabled()) ? tu.e0.to(Boolean.TRUE, null) : !isPartialDownloadEnabled() ? tu.e0.to(Boolean.FALSE, null) : (num == null || num.intValue() <= 0) ? tu.e0.to(Boolean.FALSE, null) : tu.e0.to(Boolean.TRUE, num);
    }

    private final PlacementAdUnit getAd() {
        List<PlacementAdUnit> list = this.ads;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Transient
    public static /* synthetic */ void getAdConfig$annotations() {
    }

    private final AdUnit getAdMarkup() {
        PlacementAdUnit ad2 = getAd();
        if (ad2 != null) {
            return ad2.getAdMarkup();
        }
        return null;
    }

    @SerialName(b.JSON_KEY_ADS)
    private static /* synthetic */ void getAds$annotations() {
    }

    @SerialName(DTBMetricsConfiguration.CONFIG_DIR)
    private static /* synthetic */ void getConfig$annotations() {
    }

    public static /* synthetic */ void getIncentivizedTextSettings$annotations() {
    }

    private final v getIndexHtmlFile(File file) {
        AdUnit adMarkup;
        String vmURL;
        Object objM7131constructorimpl;
        File parentFile;
        if (isNativeTemplateType() || (adMarkup = getAdMarkup()) == null || (vmURL = adMarkup.getVmURL()) == null) {
            return null;
        }
        String str = FileUtility.INSTANCE.isValidUrl(vmURL) ? vmURL : null;
        if (str == null) {
            return null;
        }
        try {
            int i10 = z.f87419c;
            String path = new URI(str).getPath();
            e0.checkNotNullExpressionValue(path, "URI(url).path");
            List listSplit$default = n0.split$default((CharSequence) n0.trim(path, '/'), new char[]{'/'}, false, 0, 6, (Object) null);
            objM7131constructorimpl = z.m7131constructorimpl(listSplit$default.size() >= 2 ? y0.joinToString$default(y0.takeLast(listSplit$default, 2), "_", null, null, 0, null, null, 62, null) : "index.html");
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        if (z.m7136isFailureimpl(objM7131constructorimpl)) {
            objM7131constructorimpl = null;
        }
        String str2 = (String) objM7131constructorimpl;
        if (str2 == null || (parentFile = file.getParentFile()) == null) {
            return null;
        }
        return new v(str, new File(parentFile, str2));
    }

    @Transient
    public static /* synthetic */ void getLogEntry$vungle_ads_release$annotations() {
    }

    private static /* synthetic */ void getMraidFiles$annotations() {
    }

    @Transient
    public static /* synthetic */ void getPartialDownloadAssets$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ List getTpatUrls$default(AdPayload adPayload, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        return adPayload.getTpatUrls(str, str2, str3);
    }

    private final String valueOrEmpty(String str) {
        return str == null ? "" : str;
    }

    public static final void write$Self(AdPayload self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.ads != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, new ArrayListSerializer(AdPayload$PlacementAdUnit$$serializer.INSTANCE), self.ads);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.config != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, ConfigPayload$$serializer.INSTANCE, self.config);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !e0.areEqual(self.mraidFiles, new ConcurrentHashMap())) {
            KClass orCreateKotlinClass = c1.getOrCreateKotlinClass(ConcurrentHashMap.class);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            output.encodeSerializableElement(serialDesc, 2, new ContextualSerializer(orCreateKotlinClass, null, new KSerializer[]{stringSerializer, stringSerializer}), self.mraidFiles);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !e0.areEqual(self.incentivizedTextSettings, new HashMap())) {
            StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
            output.encodeSerializableElement(serialDesc, 3, new LinkedHashMapSerializer(stringSerializer2, stringSerializer2), self.incentivizedTextSettings);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.assetsFullyDownloaded) {
            output.encodeBooleanElement(serialDesc, 4, self.assetsFullyDownloaded);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.indexFilePath == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.indexFilePath);
    }

    public final int adHeight() {
        AdSizeInfo adSizeInfo;
        Integer height;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (adSizeInfo = adMarkup.getAdSizeInfo()) == null || (height = adSizeInfo.getHeight()) == null) {
            return 0;
        }
        return height.intValue();
    }

    public final boolean adLoadOptimizationEnabled() {
        Boolean adLoadOptimizationEnabled;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (adLoadOptimizationEnabled = adMarkup.getAdLoadOptimizationEnabled()) == null) {
            return true;
        }
        return adLoadOptimizationEnabled.booleanValue();
    }

    public final AdUnit adUnit() {
        return getAdMarkup();
    }

    public final int adWidth() {
        AdSizeInfo adSizeInfo;
        Integer width;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (adSizeInfo = adMarkup.getAdSizeInfo()) == null || (width = adSizeInfo.getWidth()) == null) {
            return 0;
        }
        return width.intValue();
    }

    public final String advAppId() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getAdvAppId();
        }
        return null;
    }

    public final ConfigPayload config() {
        return this.config;
    }

    public final JsonObject createMRAIDArgs() {
        Map<String, String> mRAIDArgsInMap = getMRAIDArgsInMap();
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        for (Map.Entry<String, String> entry : mRAIDArgsInMap.entrySet()) {
            JsonElementBuildersKt.put(jsonObjectBuilder, entry.getKey(), entry.getValue());
        }
        return jsonObjectBuilder.build();
    }

    public final String eventId() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getId();
        }
        return null;
    }

    public final AdConfig getAdConfig() {
        return this.adConfig;
    }

    public final String getAdSource() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getAdSource();
        }
        return null;
    }

    public final boolean getAssetsFullyDownloaded() {
        return this.assetsFullyDownloaded;
    }

    public final String getCreativeId() {
        String creativeId;
        AdUnit adMarkup = getAdMarkup();
        return (adMarkup == null || (creativeId = adMarkup.getCreativeId()) == null) ? "unknown" : creativeId;
    }

    public final List<AdAsset> getDownloadableAssets(File dir) {
        TemplateSettings templateSettings;
        Map<String, CacheableReplacement> cacheableReplacements;
        e0.checkNotNullParameter(dir, "dir");
        ArrayList arrayList = new ArrayList();
        v indexHtmlFile = getIndexHtmlFile(dir);
        if (indexHtmlFile != null) {
            String str = (String) indexHtmlFile.component1();
            File file = (File) indexHtmlFile.component2();
            this.indexFilePath = file.getAbsolutePath();
            if (!file.exists()) {
                Logger.Companion.d(TAG, "No cacheable index file found, creating new one: " + file);
                String absolutePath = file.getAbsolutePath();
                e0.checkNotNullExpressionValue(absolutePath, "indexFile.absolutePath");
                arrayList.add(new AdAsset(KEY_VM, str, absolutePath, true, null, 16, null));
            }
        }
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null && (templateSettings = adMarkup.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
            for (Map.Entry<String, CacheableReplacement> entry : cacheableReplacements.entrySet()) {
                String key = entry.getKey();
                CacheableReplacement value = entry.getValue();
                String url = value.getUrl();
                if (url != null) {
                    FileUtility fileUtility = FileUtility.INSTANCE;
                    if (fileUtility.isValidUrl(url)) {
                        String filePath = new File(dir, fileUtility.guessFileName(url, value.getExtension())).getAbsolutePath();
                        v vVarComputeAssetRequirement = computeAssetRequirement(value.getDownloadPercent());
                        boolean zBooleanValue = ((Boolean) vVarComputeAssetRequirement.component1()).booleanValue();
                        Integer num = (Integer) vVarComputeAssetRequirement.component2();
                        e0.checkNotNullExpressionValue(filePath, "filePath");
                        AdAsset adAsset = new AdAsset(key, url, filePath, zBooleanValue, num);
                        arrayList.add(adAsset);
                        if (zBooleanValue && num != null) {
                            this.partialDownloadAssets.put(url, adAsset);
                        }
                    }
                }
            }
        }
        if (arrayList.size() > 1) {
            u0.sortWith(arrayList, new Comparator() { // from class: com.vungle.ads.internal.model.AdPayload$getDownloadableAssets$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return d.compareValues(Boolean.valueOf(((AdAsset) t11).isRequired()), Boolean.valueOf(((AdAsset) t10).isRequired()));
                }
            });
        }
        return arrayList;
    }

    public final Map<String, String> getIncentivizedTextSettings() {
        return this.incentivizedTextSettings;
    }

    public final String getIndexFilePath() {
        return this.indexFilePath;
    }

    public final AdAsset getLocalPartialDownloadAssets(String remoteUrl) {
        e0.checkNotNullParameter(remoteUrl, "remoteUrl");
        return this.partialDownloadAssets.get(remoteUrl);
    }

    public final LogEntry getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    public final Map<String, String> getMRAIDArgsInMap() {
        TemplateSettings templateSettings;
        Map<String, CacheableReplacement> cacheableReplacements;
        TemplateSettings templateSettings2;
        Map<String, String> normalReplacements;
        AdUnit adMarkup = getAdMarkup();
        if ((adMarkup != null ? adMarkup.getTemplateSettings() : null) == null) {
            throw new IllegalArgumentException("Advertisement does not have MRAID Arguments!");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AdUnit adMarkup2 = getAdMarkup();
        if (adMarkup2 != null && (templateSettings2 = adMarkup2.getTemplateSettings()) != null && (normalReplacements = templateSettings2.getNormalReplacements()) != null) {
            linkedHashMap.putAll(normalReplacements);
        }
        AdUnit adMarkup3 = getAdMarkup();
        if (adMarkup3 != null && (templateSettings = adMarkup3.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
            for (Map.Entry<String, CacheableReplacement> entry : cacheableReplacements.entrySet()) {
                String url = entry.getValue().getUrl();
                if (url != null) {
                    linkedHashMap.put(entry.getKey(), url);
                }
            }
        }
        if (!this.mraidFiles.isEmpty()) {
            linkedHashMap.putAll(this.mraidFiles);
        }
        if (!this.incentivizedTextSettings.isEmpty()) {
            linkedHashMap.putAll(this.incentivizedTextSettings);
        }
        return linkedHashMap;
    }

    public final String getMediationName() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getMediationName();
        }
        return null;
    }

    public final Map<String, AdAsset> getPartialDownloadAssets$vungle_ads_release() {
        return this.partialDownloadAssets;
    }

    public final int getShowCloseDelay(Boolean bool) {
        Integer showClose;
        int iIntValue;
        Integer showCloseIncentivized;
        if (e0.areEqual(bool, Boolean.TRUE)) {
            AdUnit adMarkup = getAdMarkup();
            if (adMarkup == null || (showCloseIncentivized = adMarkup.getShowCloseIncentivized()) == null) {
                return 0;
            }
            iIntValue = showCloseIncentivized.intValue();
        } else {
            AdUnit adMarkup2 = getAdMarkup();
            if (adMarkup2 == null || (showClose = adMarkup2.getShowClose()) == null) {
                return 0;
            }
            iIntValue = showClose.intValue();
        }
        return iIntValue * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final List<String> getTpatUrls(String event, String str, String str2) {
        Map<String, List<String>> tpat;
        Map<String, List<String>> tpat2;
        e0.checkNotNullParameter(event, "event");
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null && (tpat2 = adMarkup.getTpat()) != null && !tpat2.containsKey(event)) {
            new TpatError(Sdk.SDKError.Reason.INVALID_TPAT_KEY, a.b.k("Arbitrary tpat key: ", event)).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            return null;
        }
        AdUnit adMarkup2 = getAdMarkup();
        List<String> list = (adMarkup2 == null || (tpat = adMarkup2.getTpat()) == null) ? null : tpat.get(event);
        List<String> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, a.b.k("Empty tpat key: ", event)).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            return null;
        }
        switch (event.hashCode()) {
            case -2125915830:
                if (event.equals(Constants.CHECKPOINT_0)) {
                    List<String> list3 = list;
                    ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list3, 10));
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(complexReplace(complexReplace(complexReplace((String) it.next(), Constants.REMOTE_PLAY_KEY, String.valueOf(!this.assetsFullyDownloaded)), Constants.NETWORK_OPERATOR_KEY, str), Constants.DEVICE_VOLUME_KEY, str2));
                    }
                    return arrayList;
                }
                return list;
            case -747709511:
                if (event.equals(Constants.VIDEO_LENGTH_TPAT)) {
                    List<String> list4 = list;
                    ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(list4, 10));
                    Iterator<T> it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(complexReplace((String) it2.next(), Constants.VIDEO_LENGTH_KEY, str));
                    }
                    return arrayList2;
                }
                return list;
            case -132489083:
                if (event.equals(Constants.AD_LOAD_DURATION)) {
                    List<String> list5 = list;
                    ArrayList arrayList3 = new ArrayList(q0.collectionSizeOrDefault(list5, 10));
                    Iterator<T> it3 = list5.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(complexReplace((String) it3.next(), Constants.AD_LOAD_DURATION_KEY, str));
                    }
                    return arrayList3;
                }
                return list;
            case 1516630125:
                if (event.equals(Constants.AD_CLOSE)) {
                    List<String> list6 = list;
                    ArrayList arrayList4 = new ArrayList(q0.collectionSizeOrDefault(list6, 10));
                    Iterator<T> it4 = list6.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(complexReplace(complexReplace((String) it4.next(), Constants.AD_DURATION_KEY, str), Constants.DEVICE_VOLUME_KEY, str2));
                    }
                    return arrayList4;
                }
                return list;
            case 1940309120:
                if (event.equals(Constants.DEEPLINK_CLICK)) {
                    List<String> list7 = list;
                    ArrayList arrayList5 = new ArrayList(q0.collectionSizeOrDefault(list7, 10));
                    Iterator<T> it5 = list7.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add(complexReplace((String) it5.next(), Constants.DEEPLINK_SUCCESS_KEY, str));
                    }
                    return arrayList5;
                }
                return list;
            default:
                return list;
        }
    }

    public final String getViewMasterVersion() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getVmVersion();
        }
        return null;
    }

    public final WebViewSettings getWebViewSettings() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getWebViewSettings();
        }
        return null;
    }

    public final List<String> getWinNotifications() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getNotification();
        }
        return null;
    }

    public final boolean hasExpired() {
        Integer expiry;
        AdUnit adMarkup = getAdMarkup();
        return (adMarkup == null || (expiry = adMarkup.getExpiry()) == null || ((long) expiry.intValue()) >= System.currentTimeMillis() / 1000) ? false : true;
    }

    public final boolean heartbeatEnabled() {
        Boolean templateHeartbeatCheck;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (templateHeartbeatCheck = adMarkup.getTemplateHeartbeatCheck()) == null) {
            return false;
        }
        return templateHeartbeatCheck.booleanValue();
    }

    public final boolean isClickCoordinatesTrackingEnabled() {
        Boolean clickCoordinatesEnabled;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (clickCoordinatesEnabled = adMarkup.getClickCoordinatesEnabled()) == null) {
            return false;
        }
        return clickCoordinatesEnabled.booleanValue();
    }

    public final boolean isCriticalAsset(String failingUrl) {
        TemplateSettings templateSettings;
        Map<String, CacheableReplacement> cacheableReplacements;
        e0.checkNotNullParameter(failingUrl, "failingUrl");
        if (!isNativeTemplateType()) {
            AdUnit adMarkup = getAdMarkup();
            if (e0.areEqual(adMarkup != null ? adMarkup.getVmURL() : null, failingUrl)) {
                return true;
            }
        }
        AdUnit adMarkup2 = getAdMarkup();
        if (adMarkup2 == null || (templateSettings = adMarkup2.getTemplateSettings()) == null || (cacheableReplacements = templateSettings.getCacheableReplacements()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, CacheableReplacement> entry : cacheableReplacements.entrySet()) {
            if (e0.areEqual(entry.getValue().getUrl(), failingUrl)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return !linkedHashMap.isEmpty();
    }

    public final boolean isNativeTemplateType() {
        return e0.areEqual(templateType(), "native");
    }

    public final boolean isPartialDownloadEnabled() {
        Boolean partialDownloadEnabled;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (partialDownloadEnabled = adMarkup.getPartialDownloadEnabled()) == null) {
            return false;
        }
        return partialDownloadEnabled.booleanValue();
    }

    public final boolean omEnabled() {
        ViewAbility viewAbility;
        ViewAbilityInfo om2;
        Boolean boolIsEnabled;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (viewAbility = adMarkup.getViewAbility()) == null || (om2 = viewAbility.getOm()) == null || (boolIsEnabled = om2.isEnabled()) == null) {
            return false;
        }
        return boolIsEnabled.booleanValue();
    }

    public final String placementId() {
        PlacementAdUnit ad2 = getAd();
        if (ad2 != null) {
            return ad2.getPlacementReferenceId();
        }
        return null;
    }

    public final void setAdConfig(AdConfig adConfig) {
        this.adConfig = adConfig;
    }

    public final void setAssetFullyDownloaded() {
        this.assetsFullyDownloaded = true;
    }

    public final void setAssetsFullyDownloaded(boolean z10) {
        this.assetsFullyDownloaded = z10;
    }

    public final void setIncentivizedTextSettings(Map<String, String> map) {
        e0.checkNotNullParameter(map, "<set-?>");
        this.incentivizedTextSettings = map;
    }

    public final void setLogEntry$vungle_ads_release(LogEntry logEntry) {
        this.logEntry = logEntry;
    }

    public final String templateType() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getTemplateType();
        }
        return null;
    }

    public final synchronized void updateAdAssetPath(String adIdentifier, File localFile) {
        e0.checkNotNullParameter(adIdentifier, "adIdentifier");
        e0.checkNotNullParameter(localFile, "localFile");
        if (localFile.exists()) {
            this.mraidFiles.put(adIdentifier, FILE_SCHEME + localFile.getAbsolutePath());
        }
    }

    public final boolean usePreloading() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return e0.areEqual(adMarkup.getUsePreloading(), Boolean.TRUE);
        }
        return false;
    }

    @f
    public /* synthetic */ AdPayload(int i10, @SerialName(b.JSON_KEY_ADS) List list, @SerialName(DTBMetricsConfiguration.CONFIG_DIR) ConfigPayload configPayload, ConcurrentHashMap concurrentHashMap, Map map, boolean z10, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.ads = null;
        } else {
            this.ads = list;
        }
        if ((i10 & 2) == 0) {
            this.config = null;
        } else {
            this.config = configPayload;
        }
        if ((i10 & 4) == 0) {
            this.mraidFiles = new ConcurrentHashMap<>();
        } else {
            this.mraidFiles = concurrentHashMap;
        }
        if ((i10 & 8) == 0) {
            this.incentivizedTextSettings = new HashMap();
        } else {
            this.incentivizedTextSettings = map;
        }
        if ((i10 & 16) == 0) {
            this.assetsFullyDownloaded = false;
        } else {
            this.assetsFullyDownloaded = z10;
        }
        this.adConfig = null;
        this.logEntry = null;
        if ((i10 & 32) == 0) {
            this.indexFilePath = null;
        } else {
            this.indexFilePath = str;
        }
        this.partialDownloadAssets = new LinkedHashMap();
    }

    public final void setIncentivizedText(String title, String body, String str, String close) {
        e0.checkNotNullParameter(title, "title");
        e0.checkNotNullParameter(body, "body");
        e0.checkNotNullParameter(str, VPCjETNfjxu.RjoBhZsxEs);
        e0.checkNotNullParameter(close, "close");
        if (title.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_TITLE_TEXT, title);
        }
        if (body.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_BODY_TEXT, body);
        }
        if (str.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CONTINUE_TEXT, str);
        }
        if (close.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CLOSE_TEXT, close);
        }
    }

    public AdPayload(List<PlacementAdUnit> list, ConfigPayload configPayload) {
        this.ads = list;
        this.config = configPayload;
        this.mraidFiles = new ConcurrentHashMap<>();
        this.incentivizedTextSettings = new HashMap();
        this.partialDownloadAssets = new LinkedHashMap();
    }

    public /* synthetic */ AdPayload(List list, ConfigPayload configPayload, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : configPayload);
    }
}
