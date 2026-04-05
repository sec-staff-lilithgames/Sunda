package io.odeeo.internal.o1;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c {

    @lk.c("ad_unit_size")
    private String adUnitSize;

    @lk.c("audibility_enforced")
    private Boolean audibilityEnforced;

    @lk.c("reward_callback_url")
    private String callbackUrl;

    @lk.c("device_timestamp")
    private long deviceTimestamp;

    @lk.c("device_volume")
    private Float deviceVolume;

    @lk.c("event_code")
    private Integer eventCode;

    @lk.c("event_id")
    private String eventId;

    @lk.c("payload")
    private String payload;

    @lk.c(CampaignEx.JSON_KEY_REWARD_AMOUNT)
    private Float rewardAmount;

    @lk.c("reward_type")
    private String rewardType;

    @lk.c("time_to_reward")
    private Integer timeToReward;

    public c() {
        this(null, null, null, null, null, null, null, null, null, 0L, null, 2047, null);
    }

    public static /* synthetic */ c copy$default(c cVar, String str, String str2, Integer num, String str3, Float f10, String str4, Float f11, Integer num2, String str5, long j10, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cVar.eventId;
        }
        if ((i10 & 2) != 0) {
            str2 = cVar.payload;
        }
        if ((i10 & 4) != 0) {
            num = cVar.eventCode;
        }
        if ((i10 & 8) != 0) {
            str3 = cVar.rewardType;
        }
        if ((i10 & 16) != 0) {
            f10 = cVar.rewardAmount;
        }
        if ((i10 & 32) != 0) {
            str4 = cVar.callbackUrl;
        }
        if ((i10 & 64) != 0) {
            f11 = cVar.deviceVolume;
        }
        if ((i10 & 128) != 0) {
            num2 = cVar.timeToReward;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            str5 = cVar.adUnitSize;
        }
        if ((i10 & 512) != 0) {
            j10 = cVar.deviceTimestamp;
        }
        if ((i10 & 1024) != 0) {
            bool = cVar.audibilityEnforced;
        }
        Boolean bool2 = bool;
        long j11 = j10;
        Integer num3 = num2;
        String str6 = str5;
        String str7 = str4;
        Float f12 = f11;
        Float f13 = f10;
        Integer num4 = num;
        return cVar.copy(str, str2, num4, str3, f13, str7, f12, num3, str6, j11, bool2);
    }

    public final String component1() {
        return this.eventId;
    }

    public final long component10() {
        return this.deviceTimestamp;
    }

    public final Boolean component11() {
        return this.audibilityEnforced;
    }

    public final String component2() {
        return this.payload;
    }

    public final Integer component3() {
        return this.eventCode;
    }

    public final String component4() {
        return this.rewardType;
    }

    public final Float component5() {
        return this.rewardAmount;
    }

    public final String component6() {
        return this.callbackUrl;
    }

    public final Float component7() {
        return this.deviceVolume;
    }

    public final Integer component8() {
        return this.timeToReward;
    }

    public final String component9() {
        return this.adUnitSize;
    }

    public final c copy(String str, String str2, Integer num, String str3, Float f10, String str4, Float f11, Integer num2, String str5, long j10, Boolean bool) {
        return new c(str, str2, num, str3, f10, str4, f11, num2, str5, j10, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return e0.areEqual(this.eventId, cVar.eventId) && e0.areEqual(this.payload, cVar.payload) && e0.areEqual(this.eventCode, cVar.eventCode) && e0.areEqual(this.rewardType, cVar.rewardType) && e0.areEqual((Object) this.rewardAmount, (Object) cVar.rewardAmount) && e0.areEqual(this.callbackUrl, cVar.callbackUrl) && e0.areEqual((Object) this.deviceVolume, (Object) cVar.deviceVolume) && e0.areEqual(this.timeToReward, cVar.timeToReward) && e0.areEqual(this.adUnitSize, cVar.adUnitSize) && this.deviceTimestamp == cVar.deviceTimestamp && e0.areEqual(this.audibilityEnforced, cVar.audibilityEnforced);
    }

    public final String getAdUnitSize() {
        return this.adUnitSize;
    }

    public final Boolean getAudibilityEnforced() {
        return this.audibilityEnforced;
    }

    public final String getCallbackUrl() {
        return this.callbackUrl;
    }

    public final long getDeviceTimestamp() {
        return this.deviceTimestamp;
    }

    public final Float getDeviceVolume() {
        return this.deviceVolume;
    }

    public final Integer getEventCode() {
        return this.eventCode;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final Float getRewardAmount() {
        return this.rewardAmount;
    }

    public final String getRewardType() {
        return this.rewardType;
    }

    public final Integer getTimeToReward() {
        return this.timeToReward;
    }

    public int hashCode() {
        String str = this.eventId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.payload;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.eventCode;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.rewardType;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f10 = this.rewardAmount;
        int iHashCode5 = (iHashCode4 + (f10 == null ? 0 : f10.hashCode())) * 31;
        String str4 = this.callbackUrl;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f11 = this.deviceVolume;
        int iHashCode7 = (iHashCode6 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Integer num2 = this.timeToReward;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.adUnitSize;
        int iD = o2.d((iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.deviceTimestamp);
        Boolean bool = this.audibilityEnforced;
        return iD + (bool != null ? bool.hashCode() : 0);
    }

    public final void setAdUnitSize(String str) {
        this.adUnitSize = str;
    }

    public final void setAudibilityEnforced(Boolean bool) {
        this.audibilityEnforced = bool;
    }

    public final void setCallbackUrl(String str) {
        this.callbackUrl = str;
    }

    public final void setDeviceTimestamp(long j10) {
        this.deviceTimestamp = j10;
    }

    public final void setDeviceVolume(Float f10) {
        this.deviceVolume = f10;
    }

    public final void setEventCode(Integer num) {
        this.eventCode = num;
    }

    public final void setEventId(String str) {
        this.eventId = str;
    }

    public final void setPayload(String str) {
        this.payload = str;
    }

    public final void setRewardAmount(Float f10) {
        this.rewardAmount = f10;
    }

    public final void setRewardType(String str) {
        this.rewardType = str;
    }

    public final void setTimeToReward(Integer num) {
        this.timeToReward = num;
    }

    public String toString() {
        return "CustomEventRequestParameters(eventId=" + ((Object) this.eventId) + ", payload=" + ((Object) this.payload) + ", eventCode=" + this.eventCode + ", rewardType=" + ((Object) this.rewardType) + ", rewardAmount=" + this.rewardAmount + ", callbackUrl=" + ((Object) this.callbackUrl) + ", deviceVolume=" + this.deviceVolume + ", timeToReward=" + this.timeToReward + ", adUnitSize=" + ((Object) this.adUnitSize) + ", deviceTimestamp=" + this.deviceTimestamp + ", audibilityEnforced=" + this.audibilityEnforced + ')';
    }

    public c(String str, String str2, Integer num, String str3, Float f10, String str4, Float f11, Integer num2, String str5, long j10, Boolean bool) {
        this.eventId = str;
        this.payload = str2;
        this.eventCode = num;
        this.rewardType = str3;
        this.rewardAmount = f10;
        this.callbackUrl = str4;
        this.deviceVolume = f11;
        this.timeToReward = num2;
        this.adUnitSize = str5;
        this.deviceTimestamp = j10;
        this.audibilityEnforced = bool;
    }

    public /* synthetic */ c(String str, String str2, Integer num, String str3, Float f10, String str4, Float f11, Integer num2, String str5, long j10, Boolean bool, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : f10, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : f11, (i10 & 128) != 0 ? null : num2, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : str5, (i10 & 512) != 0 ? io.odeeo.internal.v1.d.f67273a.getDeviceTime() : j10, (i10 & 1024) != 0 ? null : bool);
    }
}
