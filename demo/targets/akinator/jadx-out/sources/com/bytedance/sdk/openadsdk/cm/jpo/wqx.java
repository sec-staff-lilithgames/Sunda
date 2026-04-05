package com.bytedance.sdk.openadsdk.cm.jpo;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.amazon.device.ads.DtbDeviceData;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.Cif;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.hmu;
import com.bytedance.sdk.openadsdk.utils.hx;
import com.bytedance.sdk.openadsdk.utils.rv;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.bytedance.sdk.openadsdk.utils.va;
import com.ironsource.Q6;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {

    /* renamed from: cm, reason: collision with root package name */
    private final boolean f19568cm;

    /* renamed from: jd, reason: collision with root package name */
    private int f19569jd;
    private long jpo;
    private final String my;
    private final Context wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {
        private static final wqx jpo = new wqx();
    }

    private int cm() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    private String jj() {
        StringBuilder sb2 = new StringBuilder();
        try {
            if (hx.my()) {
                sb2.append("MIUI-");
            } else if (hx.jd()) {
                sb2.append("FLYME-");
            } else {
                String strOya = hx.oya();
                if (hx.jpo(strOya)) {
                    sb2.append("EMUI-");
                }
                if (!TextUtils.isEmpty(strOya)) {
                    sb2.append(strOya);
                    sb2.append("-");
                }
            }
            sb2.append(Build.VERSION.INCREMENTAL);
        } catch (Throwable unused) {
        }
        return sb2.toString();
    }

    public static wqx jpo() {
        return jpo.jpo;
    }

    private String my() {
        return DeviceUtils.wqx(this.wqx) ? "tv" : DeviceUtils.jd(this.wqx) ? "android_pad" : "android";
    }

    private boolean wqx() {
        try {
            if (!new File("/system/bin/su").exists()) {
                if (!new File("/system/xbin/su").exists()) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public List<com.bytedance.sdk.openadsdk.cm.jpo> jd(List<com.bytedance.sdk.openadsdk.cm.jpo> list) {
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.cm.jpo jpoVar : list) {
            try {
                JSONObject jSONObjectWqx = jpoVar.wqx();
                jSONObjectWqx.putOpt("_ad_staging_flag", 1);
                arrayList.add(new com.bytedance.sdk.openadsdk.cm.jpo(jpoVar.jpo, jSONObjectWqx));
            } catch (Exception e10) {
                nmd.wqx("AdLogParamsGenerate", e10.getMessage());
            }
        }
        return arrayList;
    }

    private wqx() {
        this.f19568cm = wqx();
        this.wqx = sq.jpo().getApplicationContext();
        this.my = my();
    }

    public String jpo(List<com.bytedance.sdk.openadsdk.cm.jpo> list) {
        return tic.my((list.size() <= 0 || list.get(0) == null || list.get(0).wqx() == null) ? "" : list.get(0).wqx().optString("app_log_url"));
    }

    private void jpo(com.bytedance.sdk.openadsdk.cm.jpo jpoVar, boolean z10) {
        if (jpoVar == null) {
            return;
        }
        try {
            String strOptString = z10 ? jpoVar.wqx().optJSONObject("params").optString("log_extra", "") : jpoVar.wqx().optString("log_extra", "");
            long jJpo = dt.jpo(strOptString);
            int iCm = dt.cm(strOptString);
            if (jJpo == 0) {
                jJpo = this.jpo;
            }
            this.jpo = jJpo;
            if (iCm == 0) {
                iCm = this.f19569jd;
            }
            this.f19569jd = iCm;
        } catch (Exception e10) {
            nmd.wqx("AdLogParamsGenerate", "getInfoFromLogExtra exception", e10.getMessage());
        }
    }

    public JSONObject jd() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Q6.f35252d0, tic.cm());
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("app_version", tic.xyk());
            jSONObject.put("sim_op", jpo(this.wqx));
            jSONObject.put("root", this.f19568cm ? 1 : 0);
            jSONObject.put("timezone", cm());
            jSONObject.put("access", hmu.jpo(this.wqx));
            jSONObject.put("os", "Android");
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            jSONObject.put("device_type", this.my);
            jSONObject.put("device_model", Build.MODEL);
            jSONObject.put("device_brand", Build.BRAND);
            jSONObject.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject.put(DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY, Locale.getDefault().getLanguage());
            jSONObject.put("resolution", va.my(this.wqx) + "x" + va.wqx(this.wqx));
            jSONObject.put("display_density", jpo(va.yd(this.wqx)));
            jSONObject.put("density_dpi", va.yd(this.wqx));
            jSONObject.put("aid", "1371");
            jSONObject.put("device_id", Cif.jpo(this.wqx));
            jSONObject.put("rom", jj());
            jSONObject.put("cpu_abi", Build.CPU_ABI);
            jSONObject.put("ut", this.f19569jd);
            jSONObject.put("uid", this.jpo);
            jSONObject.put("google_aid", com.bytedance.sdk.openadsdk.jr.jpo.jd.jpo.jpo().jd());
            jSONObject.put("locale_language", DeviceUtils.cm());
            jSONObject.put("screen_bright", Math.ceil(DeviceUtils.my() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", !DeviceUtils.jd() ? 1 : 0);
            com.bytedance.sdk.openadsdk.core.settings.jj jjVarCm = sq.cm();
            jSONObject.put("force_language", com.bytedance.sdk.component.utils.dt.jpo(this.wqx, "tt_choose_language"));
            if (jjVarCm.se("mnc")) {
                jSONObject.put("mnc", rv.wqx());
            }
            if (jjVarCm.se("mcc")) {
                jSONObject.put("mcc", rv.jd());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public JSONObject jpo(List<com.bytedance.sdk.openadsdk.cm.jpo> list, long j10, JSONObject jSONObject, boolean z10) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jpo(list.get(0), z10);
            jSONObject2.put("header", jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator<com.bytedance.sdk.openadsdk.cm.jpo> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().jpo(z10));
            }
            if (z10) {
                jSONObject2.put("event_v3", jSONArray);
                jSONObject2.put("magic_tag", "ss_app_log");
            } else {
                jSONObject2.put(NotificationCompat.CATEGORY_EVENT, jSONArray);
            }
            jSONObject2.put("_gen_time", j10);
            jSONObject2.put("local_time", j10 / 1000);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public List<com.bytedance.sdk.openadsdk.cm.jpo> jpo(List<com.bytedance.sdk.openadsdk.cm.jpo> list, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.cm.jpo jpoVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObjectWqx = jpoVar.wqx();
                jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, jSONObjectWqx.optString("label"));
                long jOptLong = jSONObjectWqx.optLong("event_ts", System.currentTimeMillis());
                jSONObject.putOpt("local_time_ms", Long.valueOf(jOptLong));
                jSONObject.putOpt("datetime", com.bytedance.sdk.openadsdk.cm.jj.wqx.format(new Date(jOptLong)));
                JSONObject jSONObject2 = new JSONObject();
                Iterator<String> itKeys = jSONObjectWqx.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!TextUtils.equals(next, "label")) {
                        jSONObject2.putOpt(next, jSONObjectWqx.opt(next));
                    }
                }
                if (z10) {
                    jSONObject2.putOpt("_ad_staging_flag", 3);
                }
                jSONObject.putOpt("params", jSONObject2);
                arrayList.add(new com.bytedance.sdk.openadsdk.cm.jj(jpoVar.jpo, jSONObject));
            } catch (Exception e10) {
                nmd.wqx("AdLogParamsGenerate", e10.getMessage());
            }
        }
        return arrayList;
    }

    private String jpo(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return "";
            }
            return telephonyManager.getSimOperator();
        } catch (Throwable unused) {
            return "";
        }
    }

    private String jpo(int i10) {
        if (i10 == 120) {
            return "ldpi";
        }
        if (i10 == 160) {
            return "mdpi";
        }
        if (i10 == 240) {
            return "hdpi";
        }
        if (i10 == 320) {
            return "xhdpi";
        }
        if (i10 == 480) {
            return "xxhdpi";
        }
        if (i10 != 640) {
            return "mdpi";
        }
        return "xxxhdpi";
    }
}
