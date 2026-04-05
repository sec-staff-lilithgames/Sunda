package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.ironsource.C3191e4;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfqo {
    private static WindowManager zzb;
    private static final String[] zzc = {"x", "y", "width", "height"};
    static float zza = Resources.getSystem().getDisplayMetrics().density;

    public static void zza(Context context) {
        if (context != null) {
            zza = context.getResources().getDisplayMetrics().density;
            zzb = (WindowManager) context.getSystemService("window");
        }
    }

    public static JSONObject zzb(int i10, int i11, int i12, int i13) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i10 / zza);
            jSONObject.put("y", i11 / zza);
            jSONObject.put("width", i12 / zza);
            jSONObject.put("height", i13 / zza);
            return jSONObject;
        } catch (JSONException e10) {
            zzfqp.zza("Error with creating viewStateObject", e10);
            return jSONObject;
        }
    }

    public static void zzc(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e10) {
            StringBuilder sb2 = new StringBuilder(str.length() + 47);
            sb2.append("JSONException during JSONObject.put for name [");
            sb2.append(str);
            sb2.append(C3191e4.i.f36531e);
            zzfqp.zza(sb2.toString(), e10);
        }
    }

    public static void zzd(JSONObject jSONObject, String str) throws JSONException {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e10) {
            zzfqp.zza("Error with setting ad session id", e10);
        }
    }

    public static void zze(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static void zzf(JSONObject jSONObject) throws JSONException {
        float f10;
        float f11;
        if (zzb != null) {
            Point point = new Point(0, 0);
            zzb.getDefaultDisplay().getRealSize(point);
            float f12 = point.x;
            float f13 = zza;
            f10 = f12 / f13;
            f11 = point.y / f13;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        try {
            jSONObject.put("width", f10);
            jSONObject.put("height", f11);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zzg(org.json.JSONObject r9, org.json.JSONObject r10) {
        /*
            r0 = 1
            if (r9 != 0) goto L7
            if (r10 == 0) goto L6
            goto L7
        L6:
            return r0
        L7:
            r1 = 0
            if (r9 == 0) goto Lb3
            if (r10 != 0) goto Le
            goto Lb3
        Le:
            java.lang.String[] r2 = com.google.android.gms.internal.ads.zzfqo.zzc
            r3 = r1
        L11:
            r4 = 4
            if (r3 >= r4) goto L27
            r4 = r2[r3]
            double r5 = r9.optDouble(r4)
            double r7 = r10.optDouble(r4)
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 == 0) goto L24
            goto Lb3
        L24:
            int r3 = r3 + 1
            goto L11
        L27:
            java.lang.String r2 = "adSessionId"
            java.lang.String r3 = ""
            java.lang.String r4 = r9.optString(r2, r3)
            java.lang.String r2 = r10.optString(r2, r3)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Lb3
            java.lang.String r2 = "noOutputDevice"
            boolean r4 = r9.optBoolean(r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r2 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.w(r10, r2, r4)
            if (r2 == 0) goto Lb3
            java.lang.String r2 = "hasWindowFocus"
            boolean r4 = r9.optBoolean(r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r2 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.w(r10, r2, r4)
            if (r2 == 0) goto Lb3
            java.lang.String r2 = "isFriendlyObstructionFor"
            org.json.JSONArray r4 = r9.optJSONArray(r2)
            org.json.JSONArray r2 = r10.optJSONArray(r2)
            if (r4 != 0) goto L68
            if (r2 != 0) goto L68
            goto L86
        L68:
            boolean r5 = zzh(r4, r2)
            if (r5 == 0) goto Lb3
            r5 = r1
        L6f:
            int r6 = r4.length()
            if (r5 >= r6) goto L86
            java.lang.String r6 = r4.optString(r5, r3)
            java.lang.String r7 = r2.optString(r5, r3)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto Lb3
            int r5 = r5 + 1
            goto L6f
        L86:
            java.lang.String r2 = "childViews"
            org.json.JSONArray r9 = r9.optJSONArray(r2)
            org.json.JSONArray r10 = r10.optJSONArray(r2)
            if (r9 != 0) goto L94
            if (r10 == 0) goto Lb2
        L94:
            boolean r2 = zzh(r9, r10)
            if (r2 == 0) goto Lb3
            r2 = r1
        L9b:
            int r3 = r9.length()
            if (r2 >= r3) goto Lb2
            org.json.JSONObject r3 = r9.optJSONObject(r2)
            org.json.JSONObject r4 = r10.optJSONObject(r2)
            boolean r3 = zzg(r3, r4)
            if (r3 == 0) goto Lb3
            int r2 = r2 + 1
            goto L9b
        Lb2:
            return r0
        Lb3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfqo.zzg(org.json.JSONObject, org.json.JSONObject):boolean");
    }

    private static boolean zzh(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
