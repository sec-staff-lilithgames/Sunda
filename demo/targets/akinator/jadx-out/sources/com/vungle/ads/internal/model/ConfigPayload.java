package com.vungle.ads.internal.model;

import androidx.core.app.NotificationCompat;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.play_billing.a;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.C3465td;
import com.mbridge.msdk.foundation.entity.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p0.o2;
import qv.v;
import tu.f;
import uu.o1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class ConfigPayload {
    public static final Companion Companion = new Companion(null);
    private AutoRedirect autoRedirect;
    private final CleverCache cleverCache;
    private final String configExtension;
    private Long configLastValidatedTimestamp;
    private final ConfigSettings configSettings;
    private final Boolean disableAdId;
    private Boolean enableOT;
    private final Endpoints endpoints;
    private final Boolean fpdEnabled;
    private final Boolean isReportIncentivizedEnabled;
    private final LogMetricsSettings logMetricsSettings;
    private final List<Placement> placements;
    private Boolean retryPriorityTPATs;
    private final Boolean rtaDebugging;
    private final Integer sessionTimeout;
    private final Integer signalSessionTimeout;
    private final Boolean signalsDisabled;
    private final UserPrivacy userPrivacy;
    private final Boolean waitForConnectivityForTPAT;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Serializable
    public static final class AutoRedirect {
        public static final Companion Companion = new Companion(null);
        private final Long afterClickDuration;
        private final Boolean allowAutoRedirect;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final KSerializer<AutoRedirect> serializer() {
                return ConfigPayload$AutoRedirect$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AutoRedirect() {
            this((Boolean) null, (Long) (0 == true ? 1 : 0), 3, (u) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ AutoRedirect copy$default(AutoRedirect autoRedirect, Boolean bool, Long l9, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = autoRedirect.allowAutoRedirect;
            }
            if ((i10 & 2) != 0) {
                l9 = autoRedirect.afterClickDuration;
            }
            return autoRedirect.copy(bool, l9);
        }

        public static final void write$Self(AutoRedirect self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Long l9;
            e0.checkNotNullParameter(self, "self");
            e0.checkNotNullParameter(output, "output");
            e0.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || !e0.areEqual(self.allowAutoRedirect, Boolean.FALSE)) {
                output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.allowAutoRedirect);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || (l9 = self.afterClickDuration) == null || l9.longValue() != Long.MAX_VALUE) {
                output.encodeNullableSerializableElement(serialDesc, 1, LongSerializer.INSTANCE, self.afterClickDuration);
            }
        }

        public final Boolean component1() {
            return this.allowAutoRedirect;
        }

        public final Long component2() {
            return this.afterClickDuration;
        }

        public final AutoRedirect copy(Boolean bool, Long l9) {
            return new AutoRedirect(bool, l9);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AutoRedirect)) {
                return false;
            }
            AutoRedirect autoRedirect = (AutoRedirect) obj;
            return e0.areEqual(this.allowAutoRedirect, autoRedirect.allowAutoRedirect) && e0.areEqual(this.afterClickDuration, autoRedirect.afterClickDuration);
        }

        public final Long getAfterClickDuration() {
            return this.afterClickDuration;
        }

        public final Boolean getAllowAutoRedirect() {
            return this.allowAutoRedirect;
        }

        public int hashCode() {
            Boolean bool = this.allowAutoRedirect;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Long l9 = this.afterClickDuration;
            return iHashCode + (l9 != null ? l9.hashCode() : 0);
        }

        public String toString() {
            return "AutoRedirect(allowAutoRedirect=" + this.allowAutoRedirect + ", afterClickDuration=" + this.afterClickDuration + ')';
        }

        @f
        public /* synthetic */ AutoRedirect(int i10, @SerialName("allow_auto_redirect") Boolean bool, @SerialName("after_click_ms") Long l9, SerializationConstructorMarker serializationConstructorMarker) {
            this.allowAutoRedirect = (i10 & 1) == 0 ? Boolean.FALSE : bool;
            if ((i10 & 2) == 0) {
                this.afterClickDuration = Long.MAX_VALUE;
            } else {
                this.afterClickDuration = l9;
            }
        }

        public AutoRedirect(Boolean bool, Long l9) {
            this.allowAutoRedirect = bool;
            this.afterClickDuration = l9;
        }

        public /* synthetic */ AutoRedirect(Boolean bool, Long l9, int i10, u uVar) {
            this((i10 & 1) != 0 ? Boolean.FALSE : bool, (i10 & 2) != 0 ? Long.MAX_VALUE : l9);
        }

        @SerialName("after_click_ms")
        public static /* synthetic */ void getAfterClickDuration$annotations() {
        }

        @SerialName("allow_auto_redirect")
        public static /* synthetic */ void getAllowAutoRedirect$annotations() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Serializable
    public static final class CleverCache {
        public static final Companion Companion = new Companion(null);
        private final Integer diskPercentage;
        private final Long diskSize;
        private final Boolean enabled;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final KSerializer<CleverCache> serializer() {
                return ConfigPayload$CleverCache$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public CleverCache() {
            this((Boolean) null, (Long) null, (Integer) null, 7, (u) null);
        }

        public static /* synthetic */ CleverCache copy$default(CleverCache cleverCache, Boolean bool, Long l9, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = cleverCache.enabled;
            }
            if ((i10 & 2) != 0) {
                l9 = cleverCache.diskSize;
            }
            if ((i10 & 4) != 0) {
                num = cleverCache.diskPercentage;
            }
            return cleverCache.copy(bool, l9, num);
        }

        public static final void write$Self(CleverCache self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Integer num;
            Long l9;
            e0.checkNotNullParameter(self, "self");
            e0.checkNotNullParameter(output, "output");
            e0.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || !e0.areEqual(self.enabled, Boolean.FALSE)) {
                output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.enabled);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || (l9 = self.diskSize) == null || l9.longValue() != 1000) {
                output.encodeNullableSerializableElement(serialDesc, 1, LongSerializer.INSTANCE, self.diskSize);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || (num = self.diskPercentage) == null || num.intValue() != 3) {
                output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.diskPercentage);
            }
        }

        public final Boolean component1() {
            return this.enabled;
        }

        public final Long component2() {
            return this.diskSize;
        }

        public final Integer component3() {
            return this.diskPercentage;
        }

        public final CleverCache copy(Boolean bool, Long l9, Integer num) {
            return new CleverCache(bool, l9, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CleverCache)) {
                return false;
            }
            CleverCache cleverCache = (CleverCache) obj;
            return e0.areEqual(this.enabled, cleverCache.enabled) && e0.areEqual(this.diskSize, cleverCache.diskSize) && e0.areEqual(this.diskPercentage, cleverCache.diskPercentage);
        }

        public final Integer getDiskPercentage() {
            return this.diskPercentage;
        }

        public final Long getDiskSize() {
            return this.diskSize;
        }

        public final Boolean getEnabled() {
            return this.enabled;
        }

        public int hashCode() {
            Boolean bool = this.enabled;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Long l9 = this.diskSize;
            int iHashCode2 = (iHashCode + (l9 == null ? 0 : l9.hashCode())) * 31;
            Integer num = this.diskPercentage;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("CleverCache(enabled=");
            sb2.append(this.enabled);
            sb2.append(", diskSize=");
            sb2.append(this.diskSize);
            sb2.append(", diskPercentage=");
            return a.j(sb2, this.diskPercentage, ')');
        }

        @f
        public /* synthetic */ CleverCache(int i10, @SerialName("enabled") Boolean bool, @SerialName("disk_size") Long l9, @SerialName("disk_percentage") Integer num, SerializationConstructorMarker serializationConstructorMarker) {
            this.enabled = (i10 & 1) == 0 ? Boolean.FALSE : bool;
            if ((i10 & 2) == 0) {
                this.diskSize = 1000L;
            } else {
                this.diskSize = l9;
            }
            if ((i10 & 4) == 0) {
                this.diskPercentage = 3;
            } else {
                this.diskPercentage = num;
            }
        }

        public CleverCache(Boolean bool, Long l9, Integer num) {
            this.enabled = bool;
            this.diskSize = l9;
            this.diskPercentage = num;
        }

        public /* synthetic */ CleverCache(Boolean bool, Long l9, Integer num, int i10, u uVar) {
            this((i10 & 1) != 0 ? Boolean.FALSE : bool, (i10 & 2) != 0 ? 1000L : l9, (i10 & 4) != 0 ? 3 : num);
        }

        @SerialName("disk_percentage")
        public static /* synthetic */ void getDiskPercentage$annotations() {
        }

        @SerialName("disk_size")
        public static /* synthetic */ void getDiskSize$annotations() {
        }

        @SerialName("enabled")
        public static /* synthetic */ void getEnabled$annotations() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<ConfigPayload> serializer() {
            return ConfigPayload$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Serializable
    public static final class ConfigSettings {
        public static final Companion Companion = new Companion(null);
        private final Long refreshTime;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final KSerializer<ConfigSettings> serializer() {
                return ConfigPayload$ConfigSettings$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ConfigSettings() {
            this((Long) null, 1, (u) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ ConfigSettings copy$default(ConfigSettings configSettings, Long l9, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                l9 = configSettings.refreshTime;
            }
            return configSettings.copy(l9);
        }

        public static final void write$Self(ConfigSettings self, CompositeEncoder output, SerialDescriptor serialDesc) {
            e0.checkNotNullParameter(self, "self");
            e0.checkNotNullParameter(output, "output");
            e0.checkNotNullParameter(serialDesc, "serialDesc");
            if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.refreshTime == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 0, LongSerializer.INSTANCE, self.refreshTime);
        }

        public final Long component1() {
            return this.refreshTime;
        }

        public final ConfigSettings copy(Long l9) {
            return new ConfigSettings(l9);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfigSettings) && e0.areEqual(this.refreshTime, ((ConfigSettings) obj).refreshTime);
        }

        public final Long getRefreshTime() {
            return this.refreshTime;
        }

        public int hashCode() {
            Long l9 = this.refreshTime;
            if (l9 == null) {
                return 0;
            }
            return l9.hashCode();
        }

        public String toString() {
            return "ConfigSettings(refreshTime=" + this.refreshTime + ')';
        }

        @f
        public /* synthetic */ ConfigSettings(int i10, @SerialName("refresh_interval") Long l9, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i10 & 1) == 0) {
                this.refreshTime = null;
            } else {
                this.refreshTime = l9;
            }
        }

        public ConfigSettings(Long l9) {
            this.refreshTime = l9;
        }

        public /* synthetic */ ConfigSettings(Long l9, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : l9);
        }

        @SerialName("refresh_interval")
        public static /* synthetic */ void getRefreshTime$annotations() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Serializable
    public static final class Endpoints {
        public static final Companion Companion = new Companion(null);
        private final String adsEndpoint;
        private final String errorLogsEndpoint;
        private final String metricsEndpoint;
        private final String riEndpoint;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final KSerializer<Endpoints> serializer() {
                return ConfigPayload$Endpoints$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Endpoints() {
            this((String) null, (String) null, (String) null, (String) null, 15, (u) null);
        }

        public static /* synthetic */ Endpoints copy$default(Endpoints endpoints, String str, String str2, String str3, String str4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = endpoints.adsEndpoint;
            }
            if ((i10 & 2) != 0) {
                str2 = endpoints.riEndpoint;
            }
            if ((i10 & 4) != 0) {
                str3 = endpoints.errorLogsEndpoint;
            }
            if ((i10 & 8) != 0) {
                str4 = endpoints.metricsEndpoint;
            }
            return endpoints.copy(str, str2, str3, str4);
        }

        public static final void write$Self(Endpoints self, CompositeEncoder output, SerialDescriptor serialDesc) {
            e0.checkNotNullParameter(self, "self");
            e0.checkNotNullParameter(output, "output");
            e0.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.adsEndpoint != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.adsEndpoint);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.riEndpoint != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.riEndpoint);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.errorLogsEndpoint != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.errorLogsEndpoint);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.metricsEndpoint == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.metricsEndpoint);
        }

        public final String component1() {
            return this.adsEndpoint;
        }

        public final String component2() {
            return this.riEndpoint;
        }

        public final String component3() {
            return this.errorLogsEndpoint;
        }

        public final String component4() {
            return this.metricsEndpoint;
        }

        public final Endpoints copy(String str, String str2, String str3, String str4) {
            return new Endpoints(str, str2, str3, str4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Endpoints)) {
                return false;
            }
            Endpoints endpoints = (Endpoints) obj;
            return e0.areEqual(this.adsEndpoint, endpoints.adsEndpoint) && e0.areEqual(this.riEndpoint, endpoints.riEndpoint) && e0.areEqual(this.errorLogsEndpoint, endpoints.errorLogsEndpoint) && e0.areEqual(this.metricsEndpoint, endpoints.metricsEndpoint);
        }

        public final String getAdsEndpoint() {
            return this.adsEndpoint;
        }

        public final String getErrorLogsEndpoint() {
            return this.errorLogsEndpoint;
        }

        public final String getMetricsEndpoint() {
            return this.metricsEndpoint;
        }

        public final String getRiEndpoint() {
            return this.riEndpoint;
        }

        public int hashCode() {
            String str = this.adsEndpoint;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.riEndpoint;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.errorLogsEndpoint;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.metricsEndpoint;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Endpoints(adsEndpoint=");
            sb2.append(this.adsEndpoint);
            sb2.append(", riEndpoint=");
            sb2.append(this.riEndpoint);
            sb2.append(", errorLogsEndpoint=");
            sb2.append(this.errorLogsEndpoint);
            sb2.append(", metricsEndpoint=");
            return o2.q(sb2, this.metricsEndpoint, ')');
        }

        @f
        public /* synthetic */ Endpoints(int i10, @SerialName(b.JSON_KEY_ADS) String str, @SerialName("ri") String str2, @SerialName("error_logs") String str3, @SerialName("metrics") String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i10 & 1) == 0) {
                this.adsEndpoint = null;
            } else {
                this.adsEndpoint = str;
            }
            if ((i10 & 2) == 0) {
                this.riEndpoint = null;
            } else {
                this.riEndpoint = str2;
            }
            if ((i10 & 4) == 0) {
                this.errorLogsEndpoint = null;
            } else {
                this.errorLogsEndpoint = str3;
            }
            if ((i10 & 8) == 0) {
                this.metricsEndpoint = null;
            } else {
                this.metricsEndpoint = str4;
            }
        }

        public Endpoints(String str, String str2, String str3, String str4) {
            this.adsEndpoint = str;
            this.riEndpoint = str2;
            this.errorLogsEndpoint = str3;
            this.metricsEndpoint = str4;
        }

        public /* synthetic */ Endpoints(String str, String str2, String str3, String str4, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
        }

        @SerialName(b.JSON_KEY_ADS)
        public static /* synthetic */ void getAdsEndpoint$annotations() {
        }

        @SerialName("error_logs")
        public static /* synthetic */ void getErrorLogsEndpoint$annotations() {
        }

        @SerialName("metrics")
        public static /* synthetic */ void getMetricsEndpoint$annotations() {
        }

        @SerialName("ri")
        public static /* synthetic */ void getRiEndpoint$annotations() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Serializable
    public static final class GDPRSettings {
        public static final Companion Companion = new Companion(null);
        private final String buttonAccept;
        private final String buttonDeny;
        private final String consentMessage;
        private final String consentMessageVersion;
        private final String consentTitle;
        private final Boolean isCountryDataProtected;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final KSerializer<GDPRSettings> serializer() {
                return ConfigPayload$GDPRSettings$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public GDPRSettings() {
            this((Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (u) null);
        }

        public static /* synthetic */ GDPRSettings copy$default(GDPRSettings gDPRSettings, Boolean bool, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = gDPRSettings.isCountryDataProtected;
            }
            if ((i10 & 2) != 0) {
                str = gDPRSettings.consentTitle;
            }
            if ((i10 & 4) != 0) {
                str2 = gDPRSettings.consentMessage;
            }
            if ((i10 & 8) != 0) {
                str3 = gDPRSettings.consentMessageVersion;
            }
            if ((i10 & 16) != 0) {
                str4 = gDPRSettings.buttonAccept;
            }
            if ((i10 & 32) != 0) {
                str5 = gDPRSettings.buttonDeny;
            }
            String str6 = str4;
            String str7 = str5;
            return gDPRSettings.copy(bool, str, str2, str3, str6, str7);
        }

        public static final void write$Self(GDPRSettings self, CompositeEncoder output, SerialDescriptor serialDesc) {
            e0.checkNotNullParameter(self, "self");
            e0.checkNotNullParameter(output, "output");
            e0.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.isCountryDataProtected != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.isCountryDataProtected);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.consentTitle != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.consentTitle);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.consentMessage != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.consentMessage);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.consentMessageVersion != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.consentMessageVersion);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.buttonAccept != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.buttonAccept);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.buttonDeny == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.buttonDeny);
        }

        public final Boolean component1() {
            return this.isCountryDataProtected;
        }

        public final String component2() {
            return this.consentTitle;
        }

        public final String component3() {
            return this.consentMessage;
        }

        public final String component4() {
            return this.consentMessageVersion;
        }

        public final String component5() {
            return this.buttonAccept;
        }

        public final String component6() {
            return this.buttonDeny;
        }

        public final GDPRSettings copy(Boolean bool, String str, String str2, String str3, String str4, String str5) {
            return new GDPRSettings(bool, str, str2, str3, str4, str5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GDPRSettings)) {
                return false;
            }
            GDPRSettings gDPRSettings = (GDPRSettings) obj;
            return e0.areEqual(this.isCountryDataProtected, gDPRSettings.isCountryDataProtected) && e0.areEqual(this.consentTitle, gDPRSettings.consentTitle) && e0.areEqual(this.consentMessage, gDPRSettings.consentMessage) && e0.areEqual(this.consentMessageVersion, gDPRSettings.consentMessageVersion) && e0.areEqual(this.buttonAccept, gDPRSettings.buttonAccept) && e0.areEqual(this.buttonDeny, gDPRSettings.buttonDeny);
        }

        public final String getButtonAccept() {
            return this.buttonAccept;
        }

        public final String getButtonDeny() {
            return this.buttonDeny;
        }

        public final String getConsentMessage() {
            return this.consentMessage;
        }

        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        public final String getConsentTitle() {
            return this.consentTitle;
        }

        public int hashCode() {
            Boolean bool = this.isCountryDataProtected;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.consentTitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.consentMessage;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.consentMessageVersion;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.buttonAccept;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.buttonDeny;
            return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        }

        public final Boolean isCountryDataProtected() {
            return this.isCountryDataProtected;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("GDPRSettings(isCountryDataProtected=");
            sb2.append(this.isCountryDataProtected);
            sb2.append(", consentTitle=");
            sb2.append(this.consentTitle);
            sb2.append(", consentMessage=");
            sb2.append(this.consentMessage);
            sb2.append(", consentMessageVersion=");
            sb2.append(this.consentMessageVersion);
            sb2.append(", buttonAccept=");
            sb2.append(this.buttonAccept);
            sb2.append(", buttonDeny=");
            return o2.q(sb2, this.buttonDeny, ')');
        }

        @f
        public /* synthetic */ GDPRSettings(int i10, @SerialName("is_country_data_protected") Boolean bool, @SerialName("consent_title") String str, @SerialName("consent_message") String str2, @SerialName("consent_message_version") String str3, @SerialName("button_accept") String str4, @SerialName("button_deny") String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i10 & 1) == 0) {
                this.isCountryDataProtected = null;
            } else {
                this.isCountryDataProtected = bool;
            }
            if ((i10 & 2) == 0) {
                this.consentTitle = null;
            } else {
                this.consentTitle = str;
            }
            if ((i10 & 4) == 0) {
                this.consentMessage = null;
            } else {
                this.consentMessage = str2;
            }
            if ((i10 & 8) == 0) {
                this.consentMessageVersion = null;
            } else {
                this.consentMessageVersion = str3;
            }
            if ((i10 & 16) == 0) {
                this.buttonAccept = null;
            } else {
                this.buttonAccept = str4;
            }
            if ((i10 & 32) == 0) {
                this.buttonDeny = null;
            } else {
                this.buttonDeny = str5;
            }
        }

        public GDPRSettings(Boolean bool, String str, String str2, String str3, String str4, String str5) {
            this.isCountryDataProtected = bool;
            this.consentTitle = str;
            this.consentMessage = str2;
            this.consentMessageVersion = str3;
            this.buttonAccept = str4;
            this.buttonDeny = str5;
        }

        public /* synthetic */ GDPRSettings(Boolean bool, String str, String str2, String str3, String str4, String str5, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5);
        }

        @SerialName("button_accept")
        public static /* synthetic */ void getButtonAccept$annotations() {
        }

        @SerialName("button_deny")
        public static /* synthetic */ void getButtonDeny$annotations() {
        }

        @SerialName("consent_message")
        public static /* synthetic */ void getConsentMessage$annotations() {
        }

        @SerialName("consent_message_version")
        public static /* synthetic */ void getConsentMessageVersion$annotations() {
        }

        @SerialName("consent_title")
        public static /* synthetic */ void getConsentTitle$annotations() {
        }

        @SerialName("is_country_data_protected")
        public static /* synthetic */ void isCountryDataProtected$annotations() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Serializable
    public static final class IABSettings {
        public static final Companion Companion = new Companion(null);
        private final Integer tcfStatus;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final KSerializer<IABSettings> serializer() {
                return ConfigPayload$IABSettings$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public enum TcfStatus {
            ALLOW_ID(0),
            DISABLE_ID(1),
            LEGACY(2);

            public static final Companion Companion = new Companion(null);
            private static final Map<Integer, TcfStatus> rawValueMap;
            private final int rawValue;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Companion {
                public /* synthetic */ Companion(u uVar) {
                    this();
                }

                public final TcfStatus fromRawValue(Integer num) {
                    return (TcfStatus) TcfStatus.rawValueMap.get(num);
                }

                private Companion() {
                }
            }

            static {
                TcfStatus[] tcfStatusArrValues = values();
                LinkedHashMap linkedHashMap = new LinkedHashMap(v.coerceAtLeast(o1.mapCapacity(tcfStatusArrValues.length), 16));
                for (TcfStatus tcfStatus : tcfStatusArrValues) {
                    linkedHashMap.put(Integer.valueOf(tcfStatus.rawValue), tcfStatus);
                }
                rawValueMap = linkedHashMap;
            }

            TcfStatus(int i10) {
                this.rawValue = i10;
            }

            public final int getRawValue() {
                return this.rawValue;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public IABSettings() {
            this((Integer) null, 1, (u) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ IABSettings copy$default(IABSettings iABSettings, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = iABSettings.tcfStatus;
            }
            return iABSettings.copy(num);
        }

        public static final void write$Self(IABSettings self, CompositeEncoder output, SerialDescriptor serialDesc) {
            e0.checkNotNullParameter(self, "self");
            e0.checkNotNullParameter(output, "output");
            e0.checkNotNullParameter(serialDesc, "serialDesc");
            if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.tcfStatus == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.tcfStatus);
        }

        public final Integer component1() {
            return this.tcfStatus;
        }

        public final IABSettings copy(Integer num) {
            return new IABSettings(num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IABSettings) && e0.areEqual(this.tcfStatus, ((IABSettings) obj).tcfStatus);
        }

        public final Integer getTcfStatus() {
            return this.tcfStatus;
        }

        public int hashCode() {
            Integer num = this.tcfStatus;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public String toString() {
            return a.j(new StringBuilder("IABSettings(tcfStatus="), this.tcfStatus, ')');
        }

        @f
        public /* synthetic */ IABSettings(int i10, @SerialName("tcf_status") Integer num, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i10 & 1) == 0) {
                this.tcfStatus = null;
            } else {
                this.tcfStatus = num;
            }
        }

        public IABSettings(Integer num) {
            this.tcfStatus = num;
        }

        public /* synthetic */ IABSettings(Integer num, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : num);
        }

        @SerialName("tcf_status")
        public static /* synthetic */ void getTcfStatus$annotations() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Serializable
    public static final class LogMetricsSettings {
        public static final Companion Companion = new Companion(null);
        private final Integer errorLogLevel;
        private final Boolean metricsEnabled;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final KSerializer<LogMetricsSettings> serializer() {
                return ConfigPayload$LogMetricsSettings$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LogMetricsSettings() {
            this((Integer) null, (Boolean) (0 == true ? 1 : 0), 3, (u) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ LogMetricsSettings copy$default(LogMetricsSettings logMetricsSettings, Integer num, Boolean bool, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = logMetricsSettings.errorLogLevel;
            }
            if ((i10 & 2) != 0) {
                bool = logMetricsSettings.metricsEnabled;
            }
            return logMetricsSettings.copy(num, bool);
        }

        public static final void write$Self(LogMetricsSettings self, CompositeEncoder output, SerialDescriptor serialDesc) {
            e0.checkNotNullParameter(self, "self");
            e0.checkNotNullParameter(output, "output");
            e0.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.errorLogLevel != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.errorLogLevel);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.metricsEnabled == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, self.metricsEnabled);
        }

        public final Integer component1() {
            return this.errorLogLevel;
        }

        public final Boolean component2() {
            return this.metricsEnabled;
        }

        public final LogMetricsSettings copy(Integer num, Boolean bool) {
            return new LogMetricsSettings(num, bool);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LogMetricsSettings)) {
                return false;
            }
            LogMetricsSettings logMetricsSettings = (LogMetricsSettings) obj;
            return e0.areEqual(this.errorLogLevel, logMetricsSettings.errorLogLevel) && e0.areEqual(this.metricsEnabled, logMetricsSettings.metricsEnabled);
        }

        public final Integer getErrorLogLevel() {
            return this.errorLogLevel;
        }

        public final Boolean getMetricsEnabled() {
            return this.metricsEnabled;
        }

        public int hashCode() {
            Integer num = this.errorLogLevel;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Boolean bool = this.metricsEnabled;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "LogMetricsSettings(errorLogLevel=" + this.errorLogLevel + ", metricsEnabled=" + this.metricsEnabled + ')';
        }

        @f
        public /* synthetic */ LogMetricsSettings(int i10, @SerialName("error_log_level") Integer num, @SerialName("metrics_is_enabled") Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i10 & 1) == 0) {
                this.errorLogLevel = null;
            } else {
                this.errorLogLevel = num;
            }
            if ((i10 & 2) == 0) {
                this.metricsEnabled = null;
            } else {
                this.metricsEnabled = bool;
            }
        }

        public LogMetricsSettings(Integer num, Boolean bool) {
            this.errorLogLevel = num;
            this.metricsEnabled = bool;
        }

        public /* synthetic */ LogMetricsSettings(Integer num, Boolean bool, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : bool);
        }

        @SerialName("error_log_level")
        public static /* synthetic */ void getErrorLogLevel$annotations() {
        }

        @SerialName("metrics_is_enabled")
        public static /* synthetic */ void getMetricsEnabled$annotations() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Serializable
    public static final class UserPrivacy {
        public static final Companion Companion = new Companion(null);
        private final GDPRSettings gdpr;
        private final IABSettings iab;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final KSerializer<UserPrivacy> serializer() {
                return ConfigPayload$UserPrivacy$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UserPrivacy() {
            this((GDPRSettings) null, (IABSettings) (0 == true ? 1 : 0), 3, (u) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ UserPrivacy copy$default(UserPrivacy userPrivacy, GDPRSettings gDPRSettings, IABSettings iABSettings, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                gDPRSettings = userPrivacy.gdpr;
            }
            if ((i10 & 2) != 0) {
                iABSettings = userPrivacy.iab;
            }
            return userPrivacy.copy(gDPRSettings, iABSettings);
        }

        public static final void write$Self(UserPrivacy self, CompositeEncoder output, SerialDescriptor serialDesc) {
            e0.checkNotNullParameter(self, "self");
            e0.checkNotNullParameter(output, "output");
            e0.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.gdpr != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, ConfigPayload$GDPRSettings$$serializer.INSTANCE, self.gdpr);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.iab == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 1, ConfigPayload$IABSettings$$serializer.INSTANCE, self.iab);
        }

        public final GDPRSettings component1() {
            return this.gdpr;
        }

        public final IABSettings component2() {
            return this.iab;
        }

        public final UserPrivacy copy(GDPRSettings gDPRSettings, IABSettings iABSettings) {
            return new UserPrivacy(gDPRSettings, iABSettings);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserPrivacy)) {
                return false;
            }
            UserPrivacy userPrivacy = (UserPrivacy) obj;
            return e0.areEqual(this.gdpr, userPrivacy.gdpr) && e0.areEqual(this.iab, userPrivacy.iab);
        }

        public final GDPRSettings getGdpr() {
            return this.gdpr;
        }

        public final IABSettings getIab() {
            return this.iab;
        }

        public int hashCode() {
            GDPRSettings gDPRSettings = this.gdpr;
            int iHashCode = (gDPRSettings == null ? 0 : gDPRSettings.hashCode()) * 31;
            IABSettings iABSettings = this.iab;
            return iHashCode + (iABSettings != null ? iABSettings.hashCode() : 0);
        }

        public String toString() {
            return "UserPrivacy(gdpr=" + this.gdpr + ", iab=" + this.iab + ')';
        }

        @f
        public /* synthetic */ UserPrivacy(int i10, @SerialName(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES) GDPRSettings gDPRSettings, @SerialName("iab") IABSettings iABSettings, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i10 & 1) == 0) {
                this.gdpr = null;
            } else {
                this.gdpr = gDPRSettings;
            }
            if ((i10 & 2) == 0) {
                this.iab = null;
            } else {
                this.iab = iABSettings;
            }
        }

        public UserPrivacy(GDPRSettings gDPRSettings, IABSettings iABSettings) {
            this.gdpr = gDPRSettings;
            this.iab = iABSettings;
        }

        public /* synthetic */ UserPrivacy(GDPRSettings gDPRSettings, IABSettings iABSettings, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : gDPRSettings, (i10 & 2) != 0 ? null : iABSettings);
        }

        @SerialName(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES)
        public static /* synthetic */ void getGdpr$annotations() {
        }

        @SerialName("iab")
        public static /* synthetic */ void getIab$annotations() {
        }
    }

    public ConfigPayload() {
        this((CleverCache) null, (ConfigSettings) null, (Endpoints) null, (LogMetricsSettings) null, (List) null, (UserPrivacy) null, (String) null, (Boolean) null, (Boolean) null, (Integer) null, (Boolean) null, (Integer) null, (Boolean) null, (Boolean) null, (Boolean) null, (Long) null, (AutoRedirect) null, (Boolean) null, (Boolean) null, 524287, (u) null);
    }

    public static /* synthetic */ ConfigPayload copy$default(ConfigPayload configPayload, CleverCache cleverCache, ConfigSettings configSettings, Endpoints endpoints, LogMetricsSettings logMetricsSettings, List list, UserPrivacy userPrivacy, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Long l9, AutoRedirect autoRedirect, Boolean bool7, Boolean bool8, int i10, Object obj) {
        Boolean bool9;
        Boolean bool10;
        CleverCache cleverCache2 = (i10 & 1) != 0 ? configPayload.cleverCache : cleverCache;
        ConfigSettings configSettings2 = (i10 & 2) != 0 ? configPayload.configSettings : configSettings;
        Endpoints endpoints2 = (i10 & 4) != 0 ? configPayload.endpoints : endpoints;
        LogMetricsSettings logMetricsSettings2 = (i10 & 8) != 0 ? configPayload.logMetricsSettings : logMetricsSettings;
        List list2 = (i10 & 16) != 0 ? configPayload.placements : list;
        UserPrivacy userPrivacy2 = (i10 & 32) != 0 ? configPayload.userPrivacy : userPrivacy;
        String str2 = (i10 & 64) != 0 ? configPayload.configExtension : str;
        Boolean bool11 = (i10 & 128) != 0 ? configPayload.disableAdId : bool;
        Boolean bool12 = (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? configPayload.isReportIncentivizedEnabled : bool2;
        Integer num3 = (i10 & 512) != 0 ? configPayload.sessionTimeout : num;
        Boolean bool13 = (i10 & 1024) != 0 ? configPayload.waitForConnectivityForTPAT : bool3;
        Integer num4 = (i10 & 2048) != 0 ? configPayload.signalSessionTimeout : num2;
        Boolean bool14 = (i10 & 4096) != 0 ? configPayload.signalsDisabled : bool4;
        Boolean bool15 = (i10 & Segment.SIZE) != 0 ? configPayload.fpdEnabled : bool5;
        CleverCache cleverCache3 = cleverCache2;
        Boolean bool16 = (i10 & 16384) != 0 ? configPayload.rtaDebugging : bool6;
        Long l10 = (i10 & 32768) != 0 ? configPayload.configLastValidatedTimestamp : l9;
        AutoRedirect autoRedirect2 = (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? configPayload.autoRedirect : autoRedirect;
        Boolean bool17 = (i10 & 131072) != 0 ? configPayload.retryPriorityTPATs : bool7;
        if ((i10 & 262144) != 0) {
            bool10 = bool17;
            bool9 = configPayload.enableOT;
        } else {
            bool9 = bool8;
            bool10 = bool17;
        }
        return configPayload.copy(cleverCache3, configSettings2, endpoints2, logMetricsSettings2, list2, userPrivacy2, str2, bool11, bool12, num3, bool13, num4, bool14, bool15, bool16, l10, autoRedirect2, bool10, bool9);
    }

    public static final void write$Self(ConfigPayload self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.cleverCache != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, ConfigPayload$CleverCache$$serializer.INSTANCE, self.cleverCache);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.configSettings != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, ConfigPayload$ConfigSettings$$serializer.INSTANCE, self.configSettings);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.endpoints != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, ConfigPayload$Endpoints$$serializer.INSTANCE, self.endpoints);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.logMetricsSettings != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, self.logMetricsSettings);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.placements != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, new ArrayListSerializer(Placement$$serializer.INSTANCE), self.placements);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.userPrivacy != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, ConfigPayload$UserPrivacy$$serializer.INSTANCE, self.userPrivacy);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.configExtension != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.configExtension);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || !e0.areEqual(self.disableAdId, Boolean.TRUE)) {
            output.encodeNullableSerializableElement(serialDesc, 7, BooleanSerializer.INSTANCE, self.disableAdId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.isReportIncentivizedEnabled != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, BooleanSerializer.INSTANCE, self.isReportIncentivizedEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.sessionTimeout != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, IntSerializer.INSTANCE, self.sessionTimeout);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.waitForConnectivityForTPAT != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, BooleanSerializer.INSTANCE, self.waitForConnectivityForTPAT);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.signalSessionTimeout != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, IntSerializer.INSTANCE, self.signalSessionTimeout);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.signalsDisabled != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, BooleanSerializer.INSTANCE, self.signalsDisabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.fpdEnabled != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, BooleanSerializer.INSTANCE, self.fpdEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.rtaDebugging != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, BooleanSerializer.INSTANCE, self.rtaDebugging);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.configLastValidatedTimestamp != null) {
            output.encodeNullableSerializableElement(serialDesc, 15, LongSerializer.INSTANCE, self.configLastValidatedTimestamp);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.autoRedirect != null) {
            output.encodeNullableSerializableElement(serialDesc, 16, ConfigPayload$AutoRedirect$$serializer.INSTANCE, self.autoRedirect);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17) || self.retryPriorityTPATs != null) {
            output.encodeNullableSerializableElement(serialDesc, 17, BooleanSerializer.INSTANCE, self.retryPriorityTPATs);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 18) && self.enableOT == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 18, BooleanSerializer.INSTANCE, self.enableOT);
    }

    public final CleverCache component1() {
        return this.cleverCache;
    }

    public final Integer component10() {
        return this.sessionTimeout;
    }

    public final Boolean component11() {
        return this.waitForConnectivityForTPAT;
    }

    public final Integer component12() {
        return this.signalSessionTimeout;
    }

    public final Boolean component13() {
        return this.signalsDisabled;
    }

    public final Boolean component14() {
        return this.fpdEnabled;
    }

    public final Boolean component15() {
        return this.rtaDebugging;
    }

    public final Long component16() {
        return this.configLastValidatedTimestamp;
    }

    public final AutoRedirect component17() {
        return this.autoRedirect;
    }

    public final Boolean component18() {
        return this.retryPriorityTPATs;
    }

    public final Boolean component19() {
        return this.enableOT;
    }

    public final ConfigSettings component2() {
        return this.configSettings;
    }

    public final Endpoints component3() {
        return this.endpoints;
    }

    public final LogMetricsSettings component4() {
        return this.logMetricsSettings;
    }

    public final List<Placement> component5() {
        return this.placements;
    }

    public final UserPrivacy component6() {
        return this.userPrivacy;
    }

    public final String component7() {
        return this.configExtension;
    }

    public final Boolean component8() {
        return this.disableAdId;
    }

    public final Boolean component9() {
        return this.isReportIncentivizedEnabled;
    }

    public final ConfigPayload copy(CleverCache cleverCache, ConfigSettings configSettings, Endpoints endpoints, LogMetricsSettings logMetricsSettings, List<Placement> list, UserPrivacy userPrivacy, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Long l9, AutoRedirect autoRedirect, Boolean bool7, Boolean bool8) {
        return new ConfigPayload(cleverCache, configSettings, endpoints, logMetricsSettings, list, userPrivacy, str, bool, bool2, num, bool3, num2, bool4, bool5, bool6, l9, autoRedirect, bool7, bool8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigPayload)) {
            return false;
        }
        ConfigPayload configPayload = (ConfigPayload) obj;
        return e0.areEqual(this.cleverCache, configPayload.cleverCache) && e0.areEqual(this.configSettings, configPayload.configSettings) && e0.areEqual(this.endpoints, configPayload.endpoints) && e0.areEqual(this.logMetricsSettings, configPayload.logMetricsSettings) && e0.areEqual(this.placements, configPayload.placements) && e0.areEqual(this.userPrivacy, configPayload.userPrivacy) && e0.areEqual(this.configExtension, configPayload.configExtension) && e0.areEqual(this.disableAdId, configPayload.disableAdId) && e0.areEqual(this.isReportIncentivizedEnabled, configPayload.isReportIncentivizedEnabled) && e0.areEqual(this.sessionTimeout, configPayload.sessionTimeout) && e0.areEqual(this.waitForConnectivityForTPAT, configPayload.waitForConnectivityForTPAT) && e0.areEqual(this.signalSessionTimeout, configPayload.signalSessionTimeout) && e0.areEqual(this.signalsDisabled, configPayload.signalsDisabled) && e0.areEqual(this.fpdEnabled, configPayload.fpdEnabled) && e0.areEqual(this.rtaDebugging, configPayload.rtaDebugging) && e0.areEqual(this.configLastValidatedTimestamp, configPayload.configLastValidatedTimestamp) && e0.areEqual(this.autoRedirect, configPayload.autoRedirect) && e0.areEqual(this.retryPriorityTPATs, configPayload.retryPriorityTPATs) && e0.areEqual(this.enableOT, configPayload.enableOT);
    }

    public final AutoRedirect getAutoRedirect() {
        return this.autoRedirect;
    }

    public final CleverCache getCleverCache() {
        return this.cleverCache;
    }

    public final String getConfigExtension() {
        return this.configExtension;
    }

    public final Long getConfigLastValidatedTimestamp() {
        return this.configLastValidatedTimestamp;
    }

    public final ConfigSettings getConfigSettings() {
        return this.configSettings;
    }

    public final Boolean getDisableAdId() {
        return this.disableAdId;
    }

    public final Boolean getEnableOT() {
        return this.enableOT;
    }

    public final Endpoints getEndpoints() {
        return this.endpoints;
    }

    public final Boolean getFpdEnabled() {
        return this.fpdEnabled;
    }

    public final LogMetricsSettings getLogMetricsSettings() {
        return this.logMetricsSettings;
    }

    public final List<Placement> getPlacements() {
        return this.placements;
    }

    public final Boolean getRetryPriorityTPATs() {
        return this.retryPriorityTPATs;
    }

    public final Boolean getRtaDebugging() {
        return this.rtaDebugging;
    }

    public final Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    public final Integer getSignalSessionTimeout() {
        return this.signalSessionTimeout;
    }

    public final Boolean getSignalsDisabled() {
        return this.signalsDisabled;
    }

    public final UserPrivacy getUserPrivacy() {
        return this.userPrivacy;
    }

    public final Boolean getWaitForConnectivityForTPAT() {
        return this.waitForConnectivityForTPAT;
    }

    public int hashCode() {
        CleverCache cleverCache = this.cleverCache;
        int iHashCode = (cleverCache == null ? 0 : cleverCache.hashCode()) * 31;
        ConfigSettings configSettings = this.configSettings;
        int iHashCode2 = (iHashCode + (configSettings == null ? 0 : configSettings.hashCode())) * 31;
        Endpoints endpoints = this.endpoints;
        int iHashCode3 = (iHashCode2 + (endpoints == null ? 0 : endpoints.hashCode())) * 31;
        LogMetricsSettings logMetricsSettings = this.logMetricsSettings;
        int iHashCode4 = (iHashCode3 + (logMetricsSettings == null ? 0 : logMetricsSettings.hashCode())) * 31;
        List<Placement> list = this.placements;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        UserPrivacy userPrivacy = this.userPrivacy;
        int iHashCode6 = (iHashCode5 + (userPrivacy == null ? 0 : userPrivacy.hashCode())) * 31;
        String str = this.configExtension;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.disableAdId;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isReportIncentivizedEnabled;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.sessionTimeout;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.waitForConnectivityForTPAT;
        int iHashCode11 = (iHashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.signalSessionTimeout;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.signalsDisabled;
        int iHashCode13 = (iHashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.fpdEnabled;
        int iHashCode14 = (iHashCode13 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.rtaDebugging;
        int iHashCode15 = (iHashCode14 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Long l9 = this.configLastValidatedTimestamp;
        int iHashCode16 = (iHashCode15 + (l9 == null ? 0 : l9.hashCode())) * 31;
        AutoRedirect autoRedirect = this.autoRedirect;
        int iHashCode17 = (iHashCode16 + (autoRedirect == null ? 0 : autoRedirect.hashCode())) * 31;
        Boolean bool7 = this.retryPriorityTPATs;
        int iHashCode18 = (iHashCode17 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.enableOT;
        return iHashCode18 + (bool8 != null ? bool8.hashCode() : 0);
    }

    public final Boolean isReportIncentivizedEnabled() {
        return this.isReportIncentivizedEnabled;
    }

    public final void setAutoRedirect(AutoRedirect autoRedirect) {
        this.autoRedirect = autoRedirect;
    }

    public final void setConfigLastValidatedTimestamp(Long l9) {
        this.configLastValidatedTimestamp = l9;
    }

    public final void setEnableOT(Boolean bool) {
        this.enableOT = bool;
    }

    public final void setRetryPriorityTPATs(Boolean bool) {
        this.retryPriorityTPATs = bool;
    }

    public String toString() {
        return "ConfigPayload(cleverCache=" + this.cleverCache + ", configSettings=" + this.configSettings + ", endpoints=" + this.endpoints + ", logMetricsSettings=" + this.logMetricsSettings + ", placements=" + this.placements + ", userPrivacy=" + this.userPrivacy + ", configExtension=" + this.configExtension + ", disableAdId=" + this.disableAdId + ", isReportIncentivizedEnabled=" + this.isReportIncentivizedEnabled + ", sessionTimeout=" + this.sessionTimeout + ", waitForConnectivityForTPAT=" + this.waitForConnectivityForTPAT + ", signalSessionTimeout=" + this.signalSessionTimeout + ", signalsDisabled=" + this.signalsDisabled + ", fpdEnabled=" + this.fpdEnabled + ", rtaDebugging=" + this.rtaDebugging + ", configLastValidatedTimestamp=" + this.configLastValidatedTimestamp + ", autoRedirect=" + this.autoRedirect + ", retryPriorityTPATs=" + this.retryPriorityTPATs + ", enableOT=" + this.enableOT + ')';
    }

    @f
    public /* synthetic */ ConfigPayload(int i10, @SerialName("reuse_assets") CleverCache cleverCache, @SerialName(DTBMetricsConfiguration.CONFIG_DIR) ConfigSettings configSettings, @SerialName("endpoints") Endpoints endpoints, @SerialName("log_metrics") LogMetricsSettings logMetricsSettings, @SerialName(C3465td.f38951c) List list, @SerialName("user") UserPrivacy userPrivacy, @SerialName(Cookie.CONFIG_EXTENSION) String str, @SerialName(Cookie.COPPA_DISABLE_AD_ID) Boolean bool, @SerialName("ri_enabled") Boolean bool2, @SerialName("session_timeout") Integer num, @SerialName("wait_for_connectivity_for_tpat") Boolean bool3, @SerialName("sdk_session_timeout") Integer num2, @SerialName("signals_disabled") Boolean bool4, @SerialName("fpd_enabled") Boolean bool5, @SerialName("rta_debugging") Boolean bool6, @SerialName("config_last_validated_ts") Long l9, @SerialName("auto_redirect") AutoRedirect autoRedirect, @SerialName("retry_prioritized_tpat") Boolean bool7, @SerialName("enable_ot") Boolean bool8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.cleverCache = null;
        } else {
            this.cleverCache = cleverCache;
        }
        if ((i10 & 2) == 0) {
            this.configSettings = null;
        } else {
            this.configSettings = configSettings;
        }
        if ((i10 & 4) == 0) {
            this.endpoints = null;
        } else {
            this.endpoints = endpoints;
        }
        if ((i10 & 8) == 0) {
            this.logMetricsSettings = null;
        } else {
            this.logMetricsSettings = logMetricsSettings;
        }
        if ((i10 & 16) == 0) {
            this.placements = null;
        } else {
            this.placements = list;
        }
        if ((i10 & 32) == 0) {
            this.userPrivacy = null;
        } else {
            this.userPrivacy = userPrivacy;
        }
        if ((i10 & 64) == 0) {
            this.configExtension = null;
        } else {
            this.configExtension = str;
        }
        if ((i10 & 128) == 0) {
            this.disableAdId = Boolean.TRUE;
        } else {
            this.disableAdId = bool;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.isReportIncentivizedEnabled = null;
        } else {
            this.isReportIncentivizedEnabled = bool2;
        }
        if ((i10 & 512) == 0) {
            this.sessionTimeout = null;
        } else {
            this.sessionTimeout = num;
        }
        if ((i10 & 1024) == 0) {
            this.waitForConnectivityForTPAT = null;
        } else {
            this.waitForConnectivityForTPAT = bool3;
        }
        if ((i10 & 2048) == 0) {
            this.signalSessionTimeout = null;
        } else {
            this.signalSessionTimeout = num2;
        }
        if ((i10 & 4096) == 0) {
            this.signalsDisabled = null;
        } else {
            this.signalsDisabled = bool4;
        }
        if ((i10 & Segment.SIZE) == 0) {
            this.fpdEnabled = null;
        } else {
            this.fpdEnabled = bool5;
        }
        if ((i10 & 16384) == 0) {
            this.rtaDebugging = null;
        } else {
            this.rtaDebugging = bool6;
        }
        if ((32768 & i10) == 0) {
            this.configLastValidatedTimestamp = null;
        } else {
            this.configLastValidatedTimestamp = l9;
        }
        if ((65536 & i10) == 0) {
            this.autoRedirect = null;
        } else {
            this.autoRedirect = autoRedirect;
        }
        if ((131072 & i10) == 0) {
            this.retryPriorityTPATs = null;
        } else {
            this.retryPriorityTPATs = bool7;
        }
        if ((i10 & 262144) == 0) {
            this.enableOT = null;
        } else {
            this.enableOT = bool8;
        }
    }

    public ConfigPayload(CleverCache cleverCache, ConfigSettings configSettings, Endpoints endpoints, LogMetricsSettings logMetricsSettings, List<Placement> list, UserPrivacy userPrivacy, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Long l9, AutoRedirect autoRedirect, Boolean bool7, Boolean bool8) {
        this.cleverCache = cleverCache;
        this.configSettings = configSettings;
        this.endpoints = endpoints;
        this.logMetricsSettings = logMetricsSettings;
        this.placements = list;
        this.userPrivacy = userPrivacy;
        this.configExtension = str;
        this.disableAdId = bool;
        this.isReportIncentivizedEnabled = bool2;
        this.sessionTimeout = num;
        this.waitForConnectivityForTPAT = bool3;
        this.signalSessionTimeout = num2;
        this.signalsDisabled = bool4;
        this.fpdEnabled = bool5;
        this.rtaDebugging = bool6;
        this.configLastValidatedTimestamp = l9;
        this.autoRedirect = autoRedirect;
        this.retryPriorityTPATs = bool7;
        this.enableOT = bool8;
    }

    @SerialName("auto_redirect")
    public static /* synthetic */ void getAutoRedirect$annotations() {
    }

    @SerialName("reuse_assets")
    public static /* synthetic */ void getCleverCache$annotations() {
    }

    @SerialName(Cookie.CONFIG_EXTENSION)
    public static /* synthetic */ void getConfigExtension$annotations() {
    }

    @SerialName("config_last_validated_ts")
    public static /* synthetic */ void getConfigLastValidatedTimestamp$annotations() {
    }

    @SerialName(DTBMetricsConfiguration.CONFIG_DIR)
    public static /* synthetic */ void getConfigSettings$annotations() {
    }

    @SerialName(Cookie.COPPA_DISABLE_AD_ID)
    public static /* synthetic */ void getDisableAdId$annotations() {
    }

    @SerialName("enable_ot")
    public static /* synthetic */ void getEnableOT$annotations() {
    }

    @SerialName("endpoints")
    public static /* synthetic */ void getEndpoints$annotations() {
    }

    @SerialName("fpd_enabled")
    public static /* synthetic */ void getFpdEnabled$annotations() {
    }

    @SerialName("log_metrics")
    public static /* synthetic */ void getLogMetricsSettings$annotations() {
    }

    @SerialName(C3465td.f38951c)
    public static /* synthetic */ void getPlacements$annotations() {
    }

    @SerialName("retry_prioritized_tpat")
    public static /* synthetic */ void getRetryPriorityTPATs$annotations() {
    }

    @SerialName("rta_debugging")
    public static /* synthetic */ void getRtaDebugging$annotations() {
    }

    @SerialName("session_timeout")
    public static /* synthetic */ void getSessionTimeout$annotations() {
    }

    @SerialName("sdk_session_timeout")
    public static /* synthetic */ void getSignalSessionTimeout$annotations() {
    }

    @SerialName("signals_disabled")
    public static /* synthetic */ void getSignalsDisabled$annotations() {
    }

    @SerialName("user")
    public static /* synthetic */ void getUserPrivacy$annotations() {
    }

    @SerialName("wait_for_connectivity_for_tpat")
    public static /* synthetic */ void getWaitForConnectivityForTPAT$annotations() {
    }

    @SerialName("ri_enabled")
    public static /* synthetic */ void isReportIncentivizedEnabled$annotations() {
    }

    public /* synthetic */ ConfigPayload(CleverCache cleverCache, ConfigSettings configSettings, Endpoints endpoints, LogMetricsSettings logMetricsSettings, List list, UserPrivacy userPrivacy, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Long l9, AutoRedirect autoRedirect, Boolean bool7, Boolean bool8, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : cleverCache, (i10 & 2) != 0 ? null : configSettings, (i10 & 4) != 0 ? null : endpoints, (i10 & 8) != 0 ? null : logMetricsSettings, (i10 & 16) != 0 ? null : list, (i10 & 32) != 0 ? null : userPrivacy, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? Boolean.TRUE : bool, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : bool2, (i10 & 512) != 0 ? null : num, (i10 & 1024) != 0 ? null : bool3, (i10 & 2048) != 0 ? null : num2, (i10 & 4096) != 0 ? null : bool4, (i10 & Segment.SIZE) != 0 ? null : bool5, (i10 & 16384) != 0 ? null : bool6, (i10 & 32768) != 0 ? null : l9, (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : autoRedirect, (i10 & 131072) != 0 ? null : bool7, (i10 & 262144) != 0 ? null : bool8);
    }
}
