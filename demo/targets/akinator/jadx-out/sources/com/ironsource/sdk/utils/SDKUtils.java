package com.ironsource.sdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Environment;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import androidx.activity.result.HM.OIPXcgrVyyxoLF;
import com.ironsource.B7;
import com.ironsource.C3191e4;
import com.ironsource.C3237ge;
import com.ironsource.C3422r4;
import com.ironsource.C3460t8;
import com.ironsource.Mb;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class SDKUtils {

    /* renamed from: a, reason: collision with root package name */
    private static final String f38847a = "SDKUtils";

    /* renamed from: b, reason: collision with root package name */
    private static String f38848b = null;

    /* renamed from: c, reason: collision with root package name */
    private static String f38849c = null;

    /* renamed from: d, reason: collision with root package name */
    private static String f38850d = null;

    /* renamed from: e, reason: collision with root package name */
    private static String f38851e = null;

    /* renamed from: f, reason: collision with root package name */
    private static int f38852f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static String f38853g = null;

    /* renamed from: h, reason: collision with root package name */
    private static Map<String, String> f38854h = null;

    /* renamed from: i, reason: collision with root package name */
    private static String f38855i = "";

    /* renamed from: j, reason: collision with root package name */
    private static final AtomicInteger f38856j = new AtomicInteger(1);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    private static int a() {
        AtomicInteger atomicInteger;
        int i10;
        int i11;
        do {
            atomicInteger = f38856j;
            i10 = atomicInteger.get();
            i11 = i10 + 1;
            if (i11 > 16777215) {
                i11 = 1;
            }
        } while (!atomicInteger.compareAndSet(i10, i11));
        return i10;
    }

    public static int convertDpToPx(int i10) {
        return (int) TypedValue.applyDimension(0, i10, Resources.getSystem().getDisplayMetrics());
    }

    public static int convertPxToDp(int i10) {
        return (int) TypedValue.applyDimension(1, i10, Resources.getSystem().getDisplayMetrics());
    }

    public static int dpToPx(long j10) {
        return (int) ((j10 * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String encodeString(String str) {
        try {
            return URLEncoder.encode(str, C.UTF8_NAME).replace("+", "%20");
        } catch (UnsupportedEncodingException e10) {
            C3422r4.d().a(e10);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] encrypt(java.lang.String r3) throws java.security.NoSuchAlgorithmException {
        /*
            r0 = 0
            java.lang.String r1 = "SHA-1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.io.UnsupportedEncodingException -> L18 java.security.NoSuchAlgorithmException -> L1b
            r1.reset()     // Catch: java.io.UnsupportedEncodingException -> L14 java.security.NoSuchAlgorithmException -> L16
            java.lang.String r2 = "UTF-8"
            byte[] r3 = r3.getBytes(r2)     // Catch: java.io.UnsupportedEncodingException -> L14 java.security.NoSuchAlgorithmException -> L16
            r1.update(r3)     // Catch: java.io.UnsupportedEncodingException -> L14 java.security.NoSuchAlgorithmException -> L16
            goto L3f
        L14:
            r3 = move-exception
            goto L1e
        L16:
            r3 = move-exception
            goto L2f
        L18:
            r3 = move-exception
            r1 = r0
            goto L1e
        L1b:
            r3 = move-exception
            r1 = r0
            goto L2f
        L1e:
            com.ironsource.r4 r2 = com.ironsource.C3422r4.d()
            r2.a(r3)
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r3 = r3.toString()
            r2.error(r3)
            goto L3f
        L2f:
            com.ironsource.r4 r2 = com.ironsource.C3422r4.d()
            r2.a(r3)
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r3 = r3.toString()
            r2.error(r3)
        L3f:
            if (r1 == 0) goto L46
            byte[] r3 = r1.digest()
            return r3
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.utils.SDKUtils.encrypt(java.lang.String):byte[]");
    }

    public static String fetchDemandSourceId(C3237ge c3237ge) {
        return fetchDemandSourceId(c3237ge.a());
    }

    public static String flatMapToJsonAsString(Map<String, String> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                try {
                    jSONObject.putOpt(next.getKey(), encodeString(next.getValue()));
                } catch (JSONException e10) {
                    C3422r4.d().a(e10);
                    Logger.i(f38847a, "flatMapToJsonAsStringfailed " + e10.toString());
                }
                it.remove();
            }
        }
        return jSONObject.toString();
    }

    public static int generateViewId() {
        return View.generateViewId();
    }

    public static int getActivityUIFlags(boolean z10) {
        return z10 ? 5894 : 1798;
    }

    public static String getAdvertiserId() {
        return f38848b;
    }

    public static String getControllerConfig() {
        return f38853g;
    }

    public static JSONObject getControllerConfigAsJSONObject() {
        try {
            return new JSONObject(getControllerConfig());
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return new JSONObject();
        }
    }

    public static String getControllerUrl() {
        return !TextUtils.isEmpty(f38851e) ? f38851e : !TextUtils.isEmpty(f38850d) ? f38850d : "";
    }

    public static int getDebugMode() {
        return f38852f;
    }

    public static String getFileName(String str) {
        try {
            return URLEncoder.encode(str.split(File.separator)[r1.length - 1].split("\\?")[0], C.UTF8_NAME);
        } catch (UnsupportedEncodingException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return null;
        }
    }

    public static Map<String, String> getInitSDKParams() {
        return f38854h;
    }

    public static String getLimitAdTracking() {
        return f38849c;
    }

    public static String getMD5(String str) {
        try {
            String string = new BigInteger(1, MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes())).toString(16);
            while (string.length() < 32) {
                string = "0" + string;
            }
            return string;
        } catch (NoSuchAlgorithmException e10) {
            C3422r4.d().a(e10);
            throw new RuntimeException(e10);
        }
    }

    public static int getMinOSVersionSupport() {
        return getControllerConfigAsJSONObject().optInt(C3191e4.d.f36416b);
    }

    public static JSONObject getNetworkConfiguration() {
        JSONObject jSONObject = new JSONObject();
        try {
            return getControllerConfigAsJSONObject().getJSONObject(C3191e4.a.f36364b);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }

    public static JSONObject getOrientation(Context context) throws JSONException {
        B7 b7I = Mb.U().i();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", translateOrientation(b7I.z(context)));
            return jSONObject;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }

    public static C3460t8.e getProductType(String str) {
        C3460t8.e eVar = C3460t8.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        C3460t8.e eVar2 = C3460t8.e.Interstitial;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        return null;
    }

    public static String getSDKVersion() {
        return "9.0.0";
    }

    public static String getTesterParameters() {
        return f38855i;
    }

    public static String getValueFromJsonObject(String str, String str2) {
        try {
            return new JSONObject(str).getString(str2);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            return null;
        }
    }

    public static boolean isApplicationVisible(Context context) {
        String packageName = context.getPackageName();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.processName.equalsIgnoreCase(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    public static boolean isExternalStorageAvailable() {
        try {
            String externalStorageState = Environment.getExternalStorageState();
            if ("mounted".equals(externalStorageState)) {
                return true;
            }
            return "mounted_ro".equals(externalStorageState);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            return false;
        }
    }

    public static boolean isIronSourceActivity(Activity activity) {
        return (activity instanceof ControllerActivity) || (activity instanceof OpenUrlActivity);
    }

    public static void loadGoogleAdvertiserInfo(Context context) {
        B7 b7I = Mb.U().i();
        String strI = b7I.I(context);
        String strB = b7I.b(context);
        if (!TextUtils.isEmpty(strI)) {
            f38848b = strI;
        }
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        f38849c = strB;
    }

    public static Map<String, String> mergeHashMaps(Map<String, String>[] mapArr) {
        HashMap map = new HashMap();
        if (mapArr != null) {
            for (Map<String, String> map2 : mapArr) {
                if (map2 != null) {
                    map.putAll(map2);
                }
            }
        }
        return map;
    }

    public static JSONObject mergeJSONObjects(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            jSONObject3 = new JSONObject(jSONObject.toString());
        }
        if (jSONObject2 != null) {
            jSONArray = jSONObject2.names();
        }
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string = jSONArray.getString(i10);
                jSONObject3.putOpt(string, jSONObject2.opt(string));
            }
        }
        return jSONObject3;
    }

    public static int pxToDp(long j10) {
        return (int) ((j10 / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String requireNonEmptyOrNull(String str, String str2) {
        if (str != null) {
            return str;
        }
        throw new NullPointerException(str2);
    }

    public static <T> T requireNonNull(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static void setControllerConfig(String str) {
        f38853g = str;
        Mb.O().y().a(getControllerConfigAsJSONObject());
    }

    public static void setControllerUrl(String str) {
        f38850d = str;
    }

    public static void setCustomControllerUrl(String str) {
        f38851e = str;
    }

    public static void setDebugMode(int i10) {
        f38852f = i10;
    }

    public static void setInitSDKParams(Map<String, String> map) {
        f38854h = map;
    }

    public static void setTesterParameters(String str) {
        f38855i = str;
    }

    public static void showNoInternetDialog(Context context) {
        new AlertDialog.Builder(context).setMessage("No Internet Connection").setPositiveButton("Ok", new a()).show();
    }

    public static String translateDeviceOrientation(int i10) {
        return i10 != 1 ? i10 != 2 ? "none" : "landscape" : "portrait";
    }

    public static String translateOrientation(int i10) {
        return i10 != 1 ? i10 != 2 ? "none" : "landscape" : "portrait";
    }

    public static String translateRequestedOrientation(int i10) {
        if (i10 == 0) {
            return "landscape";
        }
        if (i10 == 1) {
            return "portrait";
        }
        if (i10 == 11) {
            return "landscape";
        }
        if (i10 == 12) {
            return "portrait";
        }
        switch (i10) {
            case 6:
            case 8:
                return "landscape";
            case 7:
            case 9:
                return "portrait";
            default:
                return "none";
        }
    }

    public static void updateControllerConfig(String str, JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObject2 = new JSONObject(f38853g);
            jSONObject2.put(str, jSONObject);
            f38853g = jSONObject2.toString();
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            Logger.i(f38847a, "Unable to update controllerConfigs: " + e10.toString());
        }
    }

    public static String decodeString(String str) {
        try {
            return URLDecoder.decode(str, OIPXcgrVyyxoLF.junysRce);
        } catch (UnsupportedEncodingException e10) {
            C3422r4.d().a(e10);
            Logger.d(f38847a, "Failed decoding string " + e10.getMessage());
            return "";
        }
    }

    public static String fetchDemandSourceId(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("demandSourceId");
        return !TextUtils.isEmpty(strOptString) ? strOptString : jSONObject.optString("demandSourceName");
    }
}
