package io.odeeo.internal.o1;

import androidx.core.app.NotificationCompat;
import com.ironsource.Q6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h {

    @lk.c("device_timestamp")
    private Long deviceTimestamp;

    @lk.c("device_volume")
    private Float deviceVolume;

    @lk.c("engine_name")
    private String engineName;

    @lk.c("event_id")
    private String eventId;

    @lk.c("odeeo_id")
    private String odeeoId;

    @lk.c("package_id")
    private String packageId;

    @lk.c(Q6.H)
    private String platform;

    @lk.c("sdk_version")
    private String sdkVersion;

    @lk.c("session_id")
    private String sessionID;

    @lk.c("session_length")
    private Integer sessionLength;

    public h() {
        this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    public static /* synthetic */ h copy$default(h hVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l9, Integer num, Float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = hVar.eventId;
        }
        if ((i10 & 2) != 0) {
            str2 = hVar.sessionID;
        }
        if ((i10 & 4) != 0) {
            str3 = hVar.odeeoId;
        }
        if ((i10 & 8) != 0) {
            str4 = hVar.packageId;
        }
        if ((i10 & 16) != 0) {
            str5 = hVar.sdkVersion;
        }
        if ((i10 & 32) != 0) {
            str6 = hVar.engineName;
        }
        if ((i10 & 64) != 0) {
            str7 = hVar.platform;
        }
        if ((i10 & 128) != 0) {
            l9 = hVar.deviceTimestamp;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            num = hVar.sessionLength;
        }
        if ((i10 & 512) != 0) {
            f10 = hVar.deviceVolume;
        }
        Integer num2 = num;
        Float f11 = f10;
        String str8 = str7;
        Long l10 = l9;
        String str9 = str5;
        String str10 = str6;
        return hVar.copy(str, str2, str3, str4, str9, str10, str8, l10, num2, f11);
    }

    public final String component1() {
        return this.eventId;
    }

    public final Float component10() {
        return this.deviceVolume;
    }

    public final String component2() {
        return this.sessionID;
    }

    public final String component3() {
        return this.odeeoId;
    }

    public final String component4() {
        return this.packageId;
    }

    public final String component5() {
        return this.sdkVersion;
    }

    public final String component6() {
        return this.engineName;
    }

    public final String component7() {
        return this.platform;
    }

    public final Long component8() {
        return this.deviceTimestamp;
    }

    public final Integer component9() {
        return this.sessionLength;
    }

    public final h copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l9, Integer num, Float f10) {
        return new h(str, str2, str3, str4, str5, str6, str7, l9, num, f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return e0.areEqual(this.eventId, hVar.eventId) && e0.areEqual(this.sessionID, hVar.sessionID) && e0.areEqual(this.odeeoId, hVar.odeeoId) && e0.areEqual(this.packageId, hVar.packageId) && e0.areEqual(this.sdkVersion, hVar.sdkVersion) && e0.areEqual(this.engineName, hVar.engineName) && e0.areEqual(this.platform, hVar.platform) && e0.areEqual(this.deviceTimestamp, hVar.deviceTimestamp) && e0.areEqual(this.sessionLength, hVar.sessionLength) && e0.areEqual((Object) this.deviceVolume, (Object) hVar.deviceVolume);
    }

    public final Long getDeviceTimestamp() {
        return this.deviceTimestamp;
    }

    public final Float getDeviceVolume() {
        return this.deviceVolume;
    }

    public final String getEngineName() {
        return this.engineName;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getOdeeoId() {
        return this.odeeoId;
    }

    public final String getPackageId() {
        return this.packageId;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getSessionID() {
        return this.sessionID;
    }

    public final Integer getSessionLength() {
        return this.sessionLength;
    }

    public int hashCode() {
        String str = this.eventId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sessionID;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.odeeoId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.packageId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sdkVersion;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.engineName;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.platform;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l9 = this.deviceTimestamp;
        int iHashCode8 = (iHashCode7 + (l9 == null ? 0 : l9.hashCode())) * 31;
        Integer num = this.sessionLength;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Float f10 = this.deviceVolume;
        return iHashCode9 + (f10 != null ? f10.hashCode() : 0);
    }

    public final void setDeviceTimestamp(Long l9) {
        this.deviceTimestamp = l9;
    }

    public final void setDeviceVolume(Float f10) {
        this.deviceVolume = f10;
    }

    public final void setEngineName(String str) {
        this.engineName = str;
    }

    public final void setEventId(String str) {
        this.eventId = str;
    }

    public final void setOdeeoId(String str) {
        this.odeeoId = str;
    }

    public final void setPackageId(String str) {
        this.packageId = str;
    }

    public final void setPlatform(String str) {
        this.platform = str;
    }

    public final void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public final void setSessionID(String str) {
        this.sessionID = str;
    }

    public final void setSessionLength(Integer num) {
        this.sessionLength = num;
    }

    public String toString() {
        return "SessionEvent(eventId=" + ((Object) this.eventId) + ", sessionID=" + ((Object) this.sessionID) + ", odeeoId=" + ((Object) this.odeeoId) + ", packageId=" + ((Object) this.packageId) + ", sdkVersion=" + ((Object) this.sdkVersion) + ", engineName=" + ((Object) this.engineName) + ", platform=" + ((Object) this.platform) + ", deviceTimestamp=" + this.deviceTimestamp + ", sessionLength=" + this.sessionLength + ", deviceVolume=" + this.deviceVolume + ')';
    }

    public h(String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l9, Integer num, Float f10) {
        this.eventId = str;
        this.sessionID = str2;
        this.odeeoId = str3;
        this.packageId = str4;
        this.sdkVersion = str5;
        this.engineName = str6;
        this.platform = str7;
        this.deviceTimestamp = l9;
        this.sessionLength = num;
        this.deviceVolume = f10;
    }

    public /* synthetic */ h(String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l9, Integer num, Float f10, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : l9, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : num, (i10 & 512) != 0 ? null : f10);
    }
}
