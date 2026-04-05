package com.amazon.device.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DtbPackageNativeData {
    public static DtbPackageNativeData packageNativeDataInstance;
    public String applicationLabel;
    public JSONObject json = new JSONObject();
    public String packageName;
    public String versionCode;
    public String versionName;

    public DtbPackageNativeData(Context context) throws JSONException, PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        this.packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        this.applicationLabel = (String) packageManager.getApplicationLabel(context.getApplicationInfo());
        try {
            packageInfo = packageManager.getPackageInfo(this.packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            DtbLog.error("Package " + this.packageName + " not found");
            packageInfo = null;
        }
        this.versionName = packageInfo != null ? packageInfo.versionName : "";
        this.versionCode = packageInfo != null ? Integer.toString(packageInfo.versionCode) : "";
        try {
            this.json.put("lbl", this.applicationLabel);
            this.json.put("pn", this.packageName);
            if (!DtbCommonUtils.isNullOrEmpty(this.versionCode)) {
                this.json.put(ApsMetricsDataMap.APSMETRICS_FIELD_VERSION, this.versionCode);
            }
            if (DtbCommonUtils.isNullOrEmpty(this.versionName)) {
                return;
            }
            this.json.put("vn", this.versionName);
        } catch (JSONException unused2) {
            DtbLog.error("JSON exception while buildinf package native data");
        }
    }

    public static synchronized DtbPackageNativeData getPackageNativeDataInstance(Context context) {
        try {
            if (packageNativeDataInstance == null) {
                packageNativeDataInstance = new DtbPackageNativeData(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return packageNativeDataInstance;
    }

    public JSONObject getParamsJson() {
        return this.json;
    }
}
