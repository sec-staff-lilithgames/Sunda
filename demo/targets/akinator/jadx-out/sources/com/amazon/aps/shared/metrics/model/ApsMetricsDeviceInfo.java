package com.amazon.aps.shared.metrics.model;

import android.os.Build;
import b3.h;
import com.google.android.gms.internal.play_billing.a;
import com.mbridge.msdk.MBridgeConstans;
import j1.o2;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ApsMetricsDeviceInfo {
    private String connectionType;
    private String deviceType;

    /* renamed from: os, reason: collision with root package name */
    private String f12507os;
    private String platform;
    private String platformCategory;
    private String platformCategoryVersion;
    private String screenSize;

    public ApsMetricsDeviceInfo() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ ApsMetricsDeviceInfo copy$default(ApsMetricsDeviceInfo apsMetricsDeviceInfo, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = apsMetricsDeviceInfo.platformCategory;
        }
        if ((i10 & 2) != 0) {
            str2 = apsMetricsDeviceInfo.screenSize;
        }
        if ((i10 & 4) != 0) {
            str3 = apsMetricsDeviceInfo.deviceType;
        }
        if ((i10 & 8) != 0) {
            str4 = apsMetricsDeviceInfo.connectionType;
        }
        if ((i10 & 16) != 0) {
            str5 = apsMetricsDeviceInfo.platformCategoryVersion;
        }
        String str6 = str5;
        String str7 = str3;
        return apsMetricsDeviceInfo.copy(str, str2, str7, str4, str6);
    }

    public final String component1() {
        return this.platformCategory;
    }

    public final String component2() {
        return this.screenSize;
    }

    public final String component3() {
        return this.deviceType;
    }

    public final String component4() {
        return this.connectionType;
    }

    public final String component5() {
        return this.platformCategoryVersion;
    }

    public final ApsMetricsDeviceInfo copy(String str, String str2, String str3, String str4, String str5) {
        return new ApsMetricsDeviceInfo(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApsMetricsDeviceInfo)) {
            return false;
        }
        ApsMetricsDeviceInfo apsMetricsDeviceInfo = (ApsMetricsDeviceInfo) obj;
        return e0.areEqual(this.platformCategory, apsMetricsDeviceInfo.platformCategory) && e0.areEqual(this.screenSize, apsMetricsDeviceInfo.screenSize) && e0.areEqual(this.deviceType, apsMetricsDeviceInfo.deviceType) && e0.areEqual(this.connectionType, apsMetricsDeviceInfo.connectionType) && e0.areEqual(this.platformCategoryVersion, apsMetricsDeviceInfo.platformCategoryVersion);
    }

    public final String getConnectionType() {
        return this.connectionType;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final String getOs() {
        return this.f12507os;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getPlatformCategory() {
        return this.platformCategory;
    }

    public final String getPlatformCategoryVersion() {
        return this.platformCategoryVersion;
    }

    public final String getScreenSize() {
        return this.screenSize;
    }

    public int hashCode() {
        String str = this.platformCategory;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.screenSize;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.connectionType;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.platformCategoryVersion;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setConnectionType(String str) {
        this.connectionType = str;
    }

    public final void setDeviceType(String str) {
        this.deviceType = str;
    }

    public final void setOs(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.f12507os = str;
    }

    public final void setPlatform(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.platform = str;
    }

    public final void setPlatformCategory(String str) {
        this.platformCategory = str;
    }

    public final void setPlatformCategoryVersion(String str) {
        this.platformCategoryVersion = str;
    }

    public final void setScreenSize(String str) {
        this.screenSize = str;
    }

    public final JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("os", this.f12507os);
        jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_PLATFORM, this.platform);
        jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_OSVERSION, String.valueOf(Build.VERSION.SDK_INT));
        jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_MANUFACTURER, Build.MANUFACTURER);
        jSONObject.put("md", Build.MODEL);
        String str = this.platformCategoryVersion;
        if (str != null) {
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_PLATFORMCATEGORYVERSION, str);
        }
        String str2 = this.platformCategory;
        if (str2 != null) {
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_PLATFORMCATEGORY, str2);
        }
        String str3 = this.screenSize;
        if (str3 != null) {
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_SCREENSIZE, str3);
        }
        String str4 = this.deviceType;
        if (str4 != null) {
            jSONObject.put("dt", str4);
        }
        String str5 = this.connectionType;
        if (str5 != null) {
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_CONNECTIONTYPE, str5);
        }
        return jSONObject;
    }

    public String toString() {
        String str = this.platformCategory;
        String str2 = this.screenSize;
        String str3 = this.deviceType;
        String str4 = this.connectionType;
        String str5 = this.platformCategoryVersion;
        StringBuilder sbB = h.b("ApsMetricsDeviceInfo(platformCategory=", str, ", screenSize=", str2, ", deviceType=");
        a.B(sbB, str3, ", connectionType=", str4, ", platformCategoryVersion=");
        return o2.o(sbB, str5, ")");
    }

    public ApsMetricsDeviceInfo(String str, String str2, String str3, String str4, String str5) {
        this.platformCategory = str;
        this.screenSize = str2;
        this.deviceType = str3;
        this.connectionType = str4;
        this.platformCategoryVersion = str5;
        this.f12507os = "android";
        this.platform = MBridgeConstans.DYNAMIC_VIEW_WX_APP;
    }

    public /* synthetic */ ApsMetricsDeviceInfo(String str, String str2, String str3, String str4, String str5, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5);
    }
}
