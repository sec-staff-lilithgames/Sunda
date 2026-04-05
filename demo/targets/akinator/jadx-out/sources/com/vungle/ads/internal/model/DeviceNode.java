package com.vungle.ads.internal.model;

import androidx.core.app.NotificationCompat;
import b0.e2;
import com.amazon.device.ads.DtbDeviceData;
import com.applovin.shadow.okio.Segment;
import com.ironsource.Q6;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vungle.ads.internal.protos.Sdk;
import e3.g;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p0.o2;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class DeviceNode {
    public static final Companion Companion = new Companion(null);
    private final String carrier;
    private VungleExt ext;

    /* renamed from: h, reason: collision with root package name */
    private int f50768h;
    private String ifa;
    private Integer lmt;
    private final String make;
    private final String model;

    /* renamed from: os, reason: collision with root package name */
    private final String f50769os;
    private final String osv;

    /* renamed from: ua, reason: collision with root package name */
    private String f50770ua;

    /* renamed from: w, reason: collision with root package name */
    private int f50771w;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<DeviceNode> serializer() {
            return DeviceNode$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Serializable
    public static final class VungleExt {
        public static final Companion Companion = new Companion(null);
        private String amazonAdvertisingId;
        private String appSetId;
        private Integer appSetIdScope;
        private float batteryLevel;
        private int batterySaverEnabled;
        private String batteryState;
        private String connectionType;
        private String connectionTypeDetail;
        private String gaid;
        private boolean isGooglePlayServicesAvailable;
        private boolean isSideloadEnabled;
        private boolean isTv;
        private String language;
        private String locale;
        private Long obt;
        private Long oit;
        private Long ort;
        private int sdCardAvailable;
        private Long sit;
        private int soundEnabled;
        private String timeZone;
        private float volumeLevel;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final KSerializer<VungleExt> serializer() {
                return DeviceNode$VungleExt$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public VungleExt() {
            this(false, (String) null, (Integer) null, 0.0f, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, false, 0, false, (String) null, (String) null, (Long) null, (Long) null, (Long) null, (Long) null, 4194303, (u) null);
        }

        public static /* synthetic */ VungleExt copy$default(VungleExt vungleExt, boolean z10, String str, Integer num, float f10, String str2, int i10, String str3, String str4, String str5, String str6, String str7, float f11, int i11, boolean z11, int i12, boolean z12, String str8, String str9, Long l9, Long l10, Long l11, Long l12, int i13, Object obj) {
            Long l13;
            Long l14;
            boolean z13 = (i13 & 1) != 0 ? vungleExt.isGooglePlayServicesAvailable : z10;
            String str10 = (i13 & 2) != 0 ? vungleExt.appSetId : str;
            Integer num2 = (i13 & 4) != 0 ? vungleExt.appSetIdScope : num;
            float f12 = (i13 & 8) != 0 ? vungleExt.batteryLevel : f10;
            String str11 = (i13 & 16) != 0 ? vungleExt.batteryState : str2;
            int i14 = (i13 & 32) != 0 ? vungleExt.batterySaverEnabled : i10;
            String str12 = (i13 & 64) != 0 ? vungleExt.connectionType : str3;
            String str13 = (i13 & 128) != 0 ? vungleExt.connectionTypeDetail : str4;
            String str14 = (i13 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? vungleExt.locale : str5;
            String str15 = (i13 & 512) != 0 ? vungleExt.language : str6;
            String str16 = (i13 & 1024) != 0 ? vungleExt.timeZone : str7;
            float f13 = (i13 & 2048) != 0 ? vungleExt.volumeLevel : f11;
            int i15 = (i13 & 4096) != 0 ? vungleExt.soundEnabled : i11;
            boolean z14 = (i13 & Segment.SIZE) != 0 ? vungleExt.isTv : z11;
            boolean z15 = z13;
            int i16 = (i13 & 16384) != 0 ? vungleExt.sdCardAvailable : i12;
            boolean z16 = (i13 & 32768) != 0 ? vungleExt.isSideloadEnabled : z12;
            String str17 = (i13 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? vungleExt.gaid : str8;
            String str18 = (i13 & 131072) != 0 ? vungleExt.amazonAdvertisingId : str9;
            Long l15 = (i13 & 262144) != 0 ? vungleExt.sit : l9;
            Long l16 = (i13 & 524288) != 0 ? vungleExt.oit : l10;
            Long l17 = (i13 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? vungleExt.ort : l11;
            if ((i13 & 2097152) != 0) {
                l14 = l17;
                l13 = vungleExt.obt;
            } else {
                l13 = l12;
                l14 = l17;
            }
            return vungleExt.copy(z15, str10, num2, f12, str11, i14, str12, str13, str14, str15, str16, f13, i15, z14, i16, z16, str17, str18, l15, l16, l14, l13);
        }

        public static final void write$Self(VungleExt self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Float fValueOf = Float.valueOf(0.0f);
            e0.checkNotNullParameter(self, "self");
            e0.checkNotNullParameter(output, "output");
            e0.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.isGooglePlayServicesAvailable) {
                output.encodeBooleanElement(serialDesc, 0, self.isGooglePlayServicesAvailable);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.appSetId != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.appSetId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.appSetIdScope != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.appSetIdScope);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || !e0.areEqual((Object) Float.valueOf(self.batteryLevel), (Object) fValueOf)) {
                output.encodeFloatElement(serialDesc, 3, self.batteryLevel);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.batteryState != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.batteryState);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.batterySaverEnabled != 0) {
                output.encodeIntElement(serialDesc, 5, self.batterySaverEnabled);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 6) || self.connectionType != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.connectionType);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 7) || self.connectionTypeDetail != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.connectionTypeDetail);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 8) || self.locale != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.locale);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 9) || self.language != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.language);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 10) || self.timeZone != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.timeZone);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 11) || !e0.areEqual((Object) Float.valueOf(self.volumeLevel), (Object) fValueOf)) {
                output.encodeFloatElement(serialDesc, 11, self.volumeLevel);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 12) || self.soundEnabled != 1) {
                output.encodeIntElement(serialDesc, 12, self.soundEnabled);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 13) || self.isTv) {
                output.encodeBooleanElement(serialDesc, 13, self.isTv);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 14) || self.sdCardAvailable != 1) {
                output.encodeIntElement(serialDesc, 14, self.sdCardAvailable);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 15) || self.isSideloadEnabled) {
                output.encodeBooleanElement(serialDesc, 15, self.isSideloadEnabled);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 16) || self.gaid != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, StringSerializer.INSTANCE, self.gaid);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 17) || self.amazonAdvertisingId != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, StringSerializer.INSTANCE, self.amazonAdvertisingId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 18) || self.sit != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, LongSerializer.INSTANCE, self.sit);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 19) || self.oit != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, LongSerializer.INSTANCE, self.oit);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 20) || self.ort != null) {
                output.encodeNullableSerializableElement(serialDesc, 20, LongSerializer.INSTANCE, self.ort);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 21) && self.obt == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 21, LongSerializer.INSTANCE, self.obt);
        }

        public final boolean component1() {
            return this.isGooglePlayServicesAvailable;
        }

        public final String component10() {
            return this.language;
        }

        public final String component11() {
            return this.timeZone;
        }

        public final float component12() {
            return this.volumeLevel;
        }

        public final int component13() {
            return this.soundEnabled;
        }

        public final boolean component14() {
            return this.isTv;
        }

        public final int component15() {
            return this.sdCardAvailable;
        }

        public final boolean component16() {
            return this.isSideloadEnabled;
        }

        public final String component17() {
            return this.gaid;
        }

        public final String component18() {
            return this.amazonAdvertisingId;
        }

        public final Long component19() {
            return this.sit;
        }

        public final String component2() {
            return this.appSetId;
        }

        public final Long component20() {
            return this.oit;
        }

        public final Long component21() {
            return this.ort;
        }

        public final Long component22() {
            return this.obt;
        }

        public final Integer component3() {
            return this.appSetIdScope;
        }

        public final float component4() {
            return this.batteryLevel;
        }

        public final String component5() {
            return this.batteryState;
        }

        public final int component6() {
            return this.batterySaverEnabled;
        }

        public final String component7() {
            return this.connectionType;
        }

        public final String component8() {
            return this.connectionTypeDetail;
        }

        public final String component9() {
            return this.locale;
        }

        public final VungleExt copy(boolean z10, String str, Integer num, float f10, String str2, int i10, String str3, String str4, String str5, String str6, String str7, float f11, int i11, boolean z11, int i12, boolean z12, String str8, String str9, Long l9, Long l10, Long l11, Long l12) {
            return new VungleExt(z10, str, num, f10, str2, i10, str3, str4, str5, str6, str7, f11, i11, z11, i12, z12, str8, str9, l9, l10, l11, l12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VungleExt)) {
                return false;
            }
            VungleExt vungleExt = (VungleExt) obj;
            return this.isGooglePlayServicesAvailable == vungleExt.isGooglePlayServicesAvailable && e0.areEqual(this.appSetId, vungleExt.appSetId) && e0.areEqual(this.appSetIdScope, vungleExt.appSetIdScope) && e0.areEqual((Object) Float.valueOf(this.batteryLevel), (Object) Float.valueOf(vungleExt.batteryLevel)) && e0.areEqual(this.batteryState, vungleExt.batteryState) && this.batterySaverEnabled == vungleExt.batterySaverEnabled && e0.areEqual(this.connectionType, vungleExt.connectionType) && e0.areEqual(this.connectionTypeDetail, vungleExt.connectionTypeDetail) && e0.areEqual(this.locale, vungleExt.locale) && e0.areEqual(this.language, vungleExt.language) && e0.areEqual(this.timeZone, vungleExt.timeZone) && e0.areEqual((Object) Float.valueOf(this.volumeLevel), (Object) Float.valueOf(vungleExt.volumeLevel)) && this.soundEnabled == vungleExt.soundEnabled && this.isTv == vungleExt.isTv && this.sdCardAvailable == vungleExt.sdCardAvailable && this.isSideloadEnabled == vungleExt.isSideloadEnabled && e0.areEqual(this.gaid, vungleExt.gaid) && e0.areEqual(this.amazonAdvertisingId, vungleExt.amazonAdvertisingId) && e0.areEqual(this.sit, vungleExt.sit) && e0.areEqual(this.oit, vungleExt.oit) && e0.areEqual(this.ort, vungleExt.ort) && e0.areEqual(this.obt, vungleExt.obt);
        }

        public final String getAmazonAdvertisingId() {
            return this.amazonAdvertisingId;
        }

        public final String getAppSetId() {
            return this.appSetId;
        }

        public final Integer getAppSetIdScope() {
            return this.appSetIdScope;
        }

        public final float getBatteryLevel() {
            return this.batteryLevel;
        }

        public final int getBatterySaverEnabled() {
            return this.batterySaverEnabled;
        }

        public final String getBatteryState() {
            return this.batteryState;
        }

        public final String getConnectionType() {
            return this.connectionType;
        }

        public final String getConnectionTypeDetail() {
            return this.connectionTypeDetail;
        }

        public final String getGaid() {
            return this.gaid;
        }

        public final String getLanguage() {
            return this.language;
        }

        public final String getLocale() {
            return this.locale;
        }

        public final Long getObt() {
            return this.obt;
        }

        public final Long getOit() {
            return this.oit;
        }

        public final Long getOrt() {
            return this.ort;
        }

        public final int getSdCardAvailable() {
            return this.sdCardAvailable;
        }

        public final Long getSit() {
            return this.sit;
        }

        public final int getSoundEnabled() {
            return this.soundEnabled;
        }

        public final String getTimeZone() {
            return this.timeZone;
        }

        public final float getVolumeLevel() {
            return this.volumeLevel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v39 */
        /* JADX WARN: Type inference failed for: r0v40 */
        /* JADX WARN: Type inference failed for: r3v28, types: [boolean] */
        public int hashCode() {
            boolean z10 = this.isGooglePlayServicesAvailable;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            int i10 = r02 * 31;
            String str = this.appSetId;
            int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.appSetIdScope;
            int iB = e2.b(this.batteryLevel, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
            String str2 = this.batteryState;
            int iD = g.d(this.batterySaverEnabled, (iB + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
            String str3 = this.connectionType;
            int iHashCode2 = (iD + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.connectionTypeDetail;
            int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.locale;
            int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.language;
            int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.timeZone;
            int iD2 = g.d(this.soundEnabled, e2.b(this.volumeLevel, (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31, 31), 31);
            ?? r32 = this.isTv;
            int i11 = r32;
            if (r32 != 0) {
                i11 = 1;
            }
            int iD3 = g.d(this.sdCardAvailable, (iD2 + i11) * 31, 31);
            boolean z11 = this.isSideloadEnabled;
            int i12 = (iD3 + (z11 ? 1 : z11 ? 1 : 0)) * 31;
            String str8 = this.gaid;
            int iHashCode6 = (i12 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.amazonAdvertisingId;
            int iHashCode7 = (iHashCode6 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Long l9 = this.sit;
            int iHashCode8 = (iHashCode7 + (l9 == null ? 0 : l9.hashCode())) * 31;
            Long l10 = this.oit;
            int iHashCode9 = (iHashCode8 + (l10 == null ? 0 : l10.hashCode())) * 31;
            Long l11 = this.ort;
            int iHashCode10 = (iHashCode9 + (l11 == null ? 0 : l11.hashCode())) * 31;
            Long l12 = this.obt;
            return iHashCode10 + (l12 != null ? l12.hashCode() : 0);
        }

        public final boolean isGooglePlayServicesAvailable() {
            return this.isGooglePlayServicesAvailable;
        }

        public final boolean isSideloadEnabled() {
            return this.isSideloadEnabled;
        }

        public final boolean isTv() {
            return this.isTv;
        }

        public final void setAmazonAdvertisingId(String str) {
            this.amazonAdvertisingId = str;
        }

        public final void setAppSetId(String str) {
            this.appSetId = str;
        }

        public final void setAppSetIdScope(Integer num) {
            this.appSetIdScope = num;
        }

        public final void setBatteryLevel(float f10) {
            this.batteryLevel = f10;
        }

        public final void setBatterySaverEnabled(int i10) {
            this.batterySaverEnabled = i10;
        }

        public final void setBatteryState(String str) {
            this.batteryState = str;
        }

        public final void setConnectionType(String str) {
            this.connectionType = str;
        }

        public final void setConnectionTypeDetail(String str) {
            this.connectionTypeDetail = str;
        }

        public final void setGaid(String str) {
            this.gaid = str;
        }

        public final void setGooglePlayServicesAvailable(boolean z10) {
            this.isGooglePlayServicesAvailable = z10;
        }

        public final void setLanguage(String str) {
            this.language = str;
        }

        public final void setLocale(String str) {
            this.locale = str;
        }

        public final void setObt(Long l9) {
            this.obt = l9;
        }

        public final void setOit(Long l9) {
            this.oit = l9;
        }

        public final void setOrt(Long l9) {
            this.ort = l9;
        }

        public final void setSdCardAvailable(int i10) {
            this.sdCardAvailable = i10;
        }

        public final void setSideloadEnabled(boolean z10) {
            this.isSideloadEnabled = z10;
        }

        public final void setSit(Long l9) {
            this.sit = l9;
        }

        public final void setSoundEnabled(int i10) {
            this.soundEnabled = i10;
        }

        public final void setTimeZone(String str) {
            this.timeZone = str;
        }

        public final void setTv(boolean z10) {
            this.isTv = z10;
        }

        public final void setVolumeLevel(float f10) {
            this.volumeLevel = f10;
        }

        public String toString() {
            return "VungleExt(isGooglePlayServicesAvailable=" + this.isGooglePlayServicesAvailable + ", appSetId=" + this.appSetId + ", appSetIdScope=" + this.appSetIdScope + ", batteryLevel=" + this.batteryLevel + ", batteryState=" + this.batteryState + ", batterySaverEnabled=" + this.batterySaverEnabled + ", connectionType=" + this.connectionType + ", connectionTypeDetail=" + this.connectionTypeDetail + ", locale=" + this.locale + ", language=" + this.language + ", timeZone=" + this.timeZone + ", volumeLevel=" + this.volumeLevel + ", soundEnabled=" + this.soundEnabled + ", isTv=" + this.isTv + ", sdCardAvailable=" + this.sdCardAvailable + ", isSideloadEnabled=" + this.isSideloadEnabled + ", gaid=" + this.gaid + ", amazonAdvertisingId=" + this.amazonAdvertisingId + ", sit=" + this.sit + ", oit=" + this.oit + ", ort=" + this.ort + ", obt=" + this.obt + ')';
        }

        @f
        public /* synthetic */ VungleExt(int i10, @SerialName("is_google_play_services_available") boolean z10, @SerialName("app_set_id") String str, @SerialName("app_set_id_scope") Integer num, @SerialName("battery_level") float f10, @SerialName("battery_state") String str2, @SerialName("battery_saver_enabled") int i11, @SerialName("connection_type") String str3, @SerialName("connection_type_detail") String str4, @SerialName("locale") String str5, @SerialName(DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY) String str6, @SerialName("time_zone") String str7, @SerialName("volume_level") float f11, @SerialName("sound_enabled") int i12, @SerialName("is_tv") boolean z11, @SerialName("sd_card_available") int i13, @SerialName("is_sideload_enabled") boolean z12, @SerialName(Q6.U0) String str8, @SerialName("amazon_advertising_id") String str9, @SerialName("sit") Long l9, @SerialName("oit") Long l10, @SerialName("ort") Long l11, @SerialName("obt") Long l12, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i10 & 1) == 0) {
                this.isGooglePlayServicesAvailable = false;
            } else {
                this.isGooglePlayServicesAvailable = z10;
            }
            if ((i10 & 2) == 0) {
                this.appSetId = null;
            } else {
                this.appSetId = str;
            }
            if ((i10 & 4) == 0) {
                this.appSetIdScope = null;
            } else {
                this.appSetIdScope = num;
            }
            if ((i10 & 8) == 0) {
                this.batteryLevel = 0.0f;
            } else {
                this.batteryLevel = f10;
            }
            if ((i10 & 16) == 0) {
                this.batteryState = null;
            } else {
                this.batteryState = str2;
            }
            if ((i10 & 32) == 0) {
                this.batterySaverEnabled = 0;
            } else {
                this.batterySaverEnabled = i11;
            }
            if ((i10 & 64) == 0) {
                this.connectionType = null;
            } else {
                this.connectionType = str3;
            }
            if ((i10 & 128) == 0) {
                this.connectionTypeDetail = null;
            } else {
                this.connectionTypeDetail = str4;
            }
            if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
                this.locale = null;
            } else {
                this.locale = str5;
            }
            if ((i10 & 512) == 0) {
                this.language = null;
            } else {
                this.language = str6;
            }
            if ((i10 & 1024) == 0) {
                this.timeZone = null;
            } else {
                this.timeZone = str7;
            }
            if ((i10 & 2048) == 0) {
                this.volumeLevel = 0.0f;
            } else {
                this.volumeLevel = f11;
            }
            if ((i10 & 4096) == 0) {
                this.soundEnabled = 1;
            } else {
                this.soundEnabled = i12;
            }
            if ((i10 & Segment.SIZE) == 0) {
                this.isTv = false;
            } else {
                this.isTv = z11;
            }
            if ((i10 & 16384) == 0) {
                this.sdCardAvailable = 1;
            } else {
                this.sdCardAvailable = i13;
            }
            if ((32768 & i10) == 0) {
                this.isSideloadEnabled = false;
            } else {
                this.isSideloadEnabled = z12;
            }
            if ((65536 & i10) == 0) {
                this.gaid = null;
            } else {
                this.gaid = str8;
            }
            if ((131072 & i10) == 0) {
                this.amazonAdvertisingId = null;
            } else {
                this.amazonAdvertisingId = str9;
            }
            if ((262144 & i10) == 0) {
                this.sit = null;
            } else {
                this.sit = l9;
            }
            if ((524288 & i10) == 0) {
                this.oit = null;
            } else {
                this.oit = l10;
            }
            if ((1048576 & i10) == 0) {
                this.ort = null;
            } else {
                this.ort = l11;
            }
            if ((i10 & 2097152) == 0) {
                this.obt = null;
            } else {
                this.obt = l12;
            }
        }

        public VungleExt(boolean z10, String str, Integer num, float f10, String str2, int i10, String str3, String str4, String str5, String str6, String str7, float f11, int i11, boolean z11, int i12, boolean z12, String str8, String str9, Long l9, Long l10, Long l11, Long l12) {
            this.isGooglePlayServicesAvailable = z10;
            this.appSetId = str;
            this.appSetIdScope = num;
            this.batteryLevel = f10;
            this.batteryState = str2;
            this.batterySaverEnabled = i10;
            this.connectionType = str3;
            this.connectionTypeDetail = str4;
            this.locale = str5;
            this.language = str6;
            this.timeZone = str7;
            this.volumeLevel = f11;
            this.soundEnabled = i11;
            this.isTv = z11;
            this.sdCardAvailable = i12;
            this.isSideloadEnabled = z12;
            this.gaid = str8;
            this.amazonAdvertisingId = str9;
            this.sit = l9;
            this.oit = l10;
            this.ort = l11;
            this.obt = l12;
        }

        @SerialName("amazon_advertising_id")
        public static /* synthetic */ void getAmazonAdvertisingId$annotations() {
        }

        @SerialName("app_set_id")
        public static /* synthetic */ void getAppSetId$annotations() {
        }

        @SerialName("app_set_id_scope")
        public static /* synthetic */ void getAppSetIdScope$annotations() {
        }

        @SerialName("battery_level")
        public static /* synthetic */ void getBatteryLevel$annotations() {
        }

        @SerialName("battery_saver_enabled")
        public static /* synthetic */ void getBatterySaverEnabled$annotations() {
        }

        @SerialName("battery_state")
        public static /* synthetic */ void getBatteryState$annotations() {
        }

        @SerialName("connection_type")
        public static /* synthetic */ void getConnectionType$annotations() {
        }

        @SerialName("connection_type_detail")
        public static /* synthetic */ void getConnectionTypeDetail$annotations() {
        }

        @SerialName(Q6.U0)
        public static /* synthetic */ void getGaid$annotations() {
        }

        @SerialName(DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY)
        public static /* synthetic */ void getLanguage$annotations() {
        }

        @SerialName("locale")
        public static /* synthetic */ void getLocale$annotations() {
        }

        @SerialName("obt")
        public static /* synthetic */ void getObt$annotations() {
        }

        @SerialName("oit")
        public static /* synthetic */ void getOit$annotations() {
        }

        @SerialName("ort")
        public static /* synthetic */ void getOrt$annotations() {
        }

        @SerialName("sd_card_available")
        public static /* synthetic */ void getSdCardAvailable$annotations() {
        }

        @SerialName("sit")
        public static /* synthetic */ void getSit$annotations() {
        }

        @SerialName("sound_enabled")
        public static /* synthetic */ void getSoundEnabled$annotations() {
        }

        @SerialName("time_zone")
        public static /* synthetic */ void getTimeZone$annotations() {
        }

        @SerialName("volume_level")
        public static /* synthetic */ void getVolumeLevel$annotations() {
        }

        @SerialName("is_google_play_services_available")
        public static /* synthetic */ void isGooglePlayServicesAvailable$annotations() {
        }

        @SerialName("is_sideload_enabled")
        public static /* synthetic */ void isSideloadEnabled$annotations() {
        }

        @SerialName("is_tv")
        public static /* synthetic */ void isTv$annotations() {
        }

        public /* synthetic */ VungleExt(boolean z10, String str, Integer num, float f10, String str2, int i10, String str3, String str4, String str5, String str6, String str7, float f11, int i11, boolean z11, int i12, boolean z12, String str8, String str9, Long l9, Long l10, Long l11, Long l12, int i13, u uVar) {
            this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : num, (i13 & 8) != 0 ? 0.0f : f10, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? 0 : i10, (i13 & 64) != 0 ? null : str3, (i13 & 128) != 0 ? null : str4, (i13 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : str5, (i13 & 512) != 0 ? null : str6, (i13 & 1024) != 0 ? null : str7, (i13 & 2048) == 0 ? f11 : 0.0f, (i13 & 4096) != 0 ? 1 : i11, (i13 & Segment.SIZE) != 0 ? false : z11, (i13 & 16384) == 0 ? i12 : 1, (32768 & i13) != 0 ? false : z12, (i13 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : str8, (i13 & 131072) != 0 ? null : str9, (i13 & 262144) != 0 ? null : l9, (i13 & 524288) != 0 ? null : l10, (i13 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : l11, (i13 & 2097152) != 0 ? null : l12);
        }
    }

    @f
    public /* synthetic */ DeviceNode(int i10, String str, String str2, String str3, String str4, String str5, int i11, int i12, String str6, String str7, Integer num, VungleExt vungleExt, SerializationConstructorMarker serializationConstructorMarker) {
        if (119 != (i10 & Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE)) {
            PluginExceptionsKt.throwMissingFieldException(i10, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, DeviceNode$$serializer.INSTANCE.getDescriptor());
        }
        this.make = str;
        this.model = str2;
        this.osv = str3;
        if ((i10 & 8) == 0) {
            this.carrier = null;
        } else {
            this.carrier = str4;
        }
        this.f50769os = str5;
        this.f50771w = i11;
        this.f50768h = i12;
        if ((i10 & 128) == 0) {
            this.f50770ua = null;
        } else {
            this.f50770ua = str6;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.ifa = null;
        } else {
            this.ifa = str7;
        }
        if ((i10 & 512) == 0) {
            this.lmt = null;
        } else {
            this.lmt = num;
        }
        if ((i10 & 1024) == 0) {
            this.ext = null;
        } else {
            this.ext = vungleExt;
        }
    }

    public static /* synthetic */ DeviceNode copy$default(DeviceNode deviceNode, String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6, String str7, Integer num, VungleExt vungleExt, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = deviceNode.make;
        }
        if ((i12 & 2) != 0) {
            str2 = deviceNode.model;
        }
        if ((i12 & 4) != 0) {
            str3 = deviceNode.osv;
        }
        if ((i12 & 8) != 0) {
            str4 = deviceNode.carrier;
        }
        if ((i12 & 16) != 0) {
            str5 = deviceNode.f50769os;
        }
        if ((i12 & 32) != 0) {
            i10 = deviceNode.f50771w;
        }
        if ((i12 & 64) != 0) {
            i11 = deviceNode.f50768h;
        }
        if ((i12 & 128) != 0) {
            str6 = deviceNode.f50770ua;
        }
        if ((i12 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            str7 = deviceNode.ifa;
        }
        if ((i12 & 512) != 0) {
            num = deviceNode.lmt;
        }
        if ((i12 & 1024) != 0) {
            vungleExt = deviceNode.ext;
        }
        Integer num2 = num;
        VungleExt vungleExt2 = vungleExt;
        String str8 = str6;
        String str9 = str7;
        int i13 = i10;
        int i14 = i11;
        String str10 = str5;
        String str11 = str3;
        return deviceNode.copy(str, str2, str11, str4, str10, i13, i14, str8, str9, num2, vungleExt2);
    }

    public static final void write$Self(DeviceNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.make);
        output.encodeStringElement(serialDesc, 1, self.model);
        output.encodeStringElement(serialDesc, 2, self.osv);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.carrier != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.carrier);
        }
        output.encodeStringElement(serialDesc, 4, self.f50769os);
        output.encodeIntElement(serialDesc, 5, self.f50771w);
        output.encodeIntElement(serialDesc, 6, self.f50768h);
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.f50770ua != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.f50770ua);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.ifa != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.ifa);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.lmt != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, IntSerializer.INSTANCE, self.lmt);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 10) && self.ext == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 10, DeviceNode$VungleExt$$serializer.INSTANCE, self.ext);
    }

    public final String component1() {
        return this.make;
    }

    public final Integer component10() {
        return this.lmt;
    }

    public final VungleExt component11() {
        return this.ext;
    }

    public final String component2() {
        return this.model;
    }

    public final String component3() {
        return this.osv;
    }

    public final String component4() {
        return this.carrier;
    }

    public final String component5() {
        return this.f50769os;
    }

    public final int component6() {
        return this.f50771w;
    }

    public final int component7() {
        return this.f50768h;
    }

    public final String component8() {
        return this.f50770ua;
    }

    public final String component9() {
        return this.ifa;
    }

    public final DeviceNode copy(String make, String model, String osv, String str, String os2, int i10, int i11, String str2, String str3, Integer num, VungleExt vungleExt) {
        e0.checkNotNullParameter(make, "make");
        e0.checkNotNullParameter(model, "model");
        e0.checkNotNullParameter(osv, "osv");
        e0.checkNotNullParameter(os2, "os");
        return new DeviceNode(make, model, osv, str, os2, i10, i11, str2, str3, num, vungleExt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceNode)) {
            return false;
        }
        DeviceNode deviceNode = (DeviceNode) obj;
        return e0.areEqual(this.make, deviceNode.make) && e0.areEqual(this.model, deviceNode.model) && e0.areEqual(this.osv, deviceNode.osv) && e0.areEqual(this.carrier, deviceNode.carrier) && e0.areEqual(this.f50769os, deviceNode.f50769os) && this.f50771w == deviceNode.f50771w && this.f50768h == deviceNode.f50768h && e0.areEqual(this.f50770ua, deviceNode.f50770ua) && e0.areEqual(this.ifa, deviceNode.ifa) && e0.areEqual(this.lmt, deviceNode.lmt) && e0.areEqual(this.ext, deviceNode.ext);
    }

    public final String getCarrier() {
        return this.carrier;
    }

    public final VungleExt getExt() {
        return this.ext;
    }

    public final int getH() {
        return this.f50768h;
    }

    public final String getIfa() {
        return this.ifa;
    }

    public final Integer getLmt() {
        return this.lmt;
    }

    public final String getMake() {
        return this.make;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOs() {
        return this.f50769os;
    }

    public final String getOsv() {
        return this.osv;
    }

    public final String getUa() {
        return this.f50770ua;
    }

    public final int getW() {
        return this.f50771w;
    }

    public int hashCode() {
        int iE = o2.e(o2.e(this.make.hashCode() * 31, 31, this.model), 31, this.osv);
        String str = this.carrier;
        int iD = g.d(this.f50768h, g.d(this.f50771w, o2.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.f50769os), 31), 31);
        String str2 = this.f50770ua;
        int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ifa;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.lmt;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        VungleExt vungleExt = this.ext;
        return iHashCode3 + (vungleExt != null ? vungleExt.hashCode() : 0);
    }

    public final void setExt(VungleExt vungleExt) {
        this.ext = vungleExt;
    }

    public final void setH(int i10) {
        this.f50768h = i10;
    }

    public final void setIfa(String str) {
        this.ifa = str;
    }

    public final void setLmt(Integer num) {
        this.lmt = num;
    }

    public final void setUa(String str) {
        this.f50770ua = str;
    }

    public final void setW(int i10) {
        this.f50771w = i10;
    }

    public String toString() {
        return "DeviceNode(make=" + this.make + ", model=" + this.model + ", osv=" + this.osv + ", carrier=" + this.carrier + ", os=" + this.f50769os + ", w=" + this.f50771w + ", h=" + this.f50768h + ", ua=" + this.f50770ua + ", ifa=" + this.ifa + ", lmt=" + this.lmt + ", ext=" + this.ext + ')';
    }

    public DeviceNode(String make, String model, String osv, String str, String os2, int i10, int i11, String str2, String str3, Integer num, VungleExt vungleExt) {
        e0.checkNotNullParameter(make, "make");
        e0.checkNotNullParameter(model, "model");
        e0.checkNotNullParameter(osv, "osv");
        e0.checkNotNullParameter(os2, "os");
        this.make = make;
        this.model = model;
        this.osv = osv;
        this.carrier = str;
        this.f50769os = os2;
        this.f50771w = i10;
        this.f50768h = i11;
        this.f50770ua = str2;
        this.ifa = str3;
        this.lmt = num;
        this.ext = vungleExt;
    }

    public /* synthetic */ DeviceNode(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6, String str7, Integer num, VungleExt vungleExt, int i12, u uVar) {
        this(str, str2, str3, (i12 & 8) != 0 ? null : str4, str5, i10, i11, (i12 & 128) != 0 ? null : str6, (i12 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : str7, (i12 & 512) != 0 ? null : num, (i12 & 1024) != 0 ? null : vungleExt);
    }
}
