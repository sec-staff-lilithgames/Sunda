package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.utils.ef;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {
    private static final ConcurrentHashMap<String, jd> jpo = new ConcurrentHashMap<>();

    private static HashMap<String, jd> jd(JSONArray jSONArray) {
        HashMap<String, jd> map = new HashMap<>();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                jd jdVarJpo = jpo(jSONArray.getJSONObject(i10));
                if (jdVarJpo != null) {
                    map.put(jdVarJpo.jpo, jdVarJpo);
                }
            } catch (Exception unused) {
            }
        }
        return map;
    }

    public static void jpo(boolean z10) {
        File fileJd = jd();
        try {
            if (fileJd.exists()) {
                HashMap<String, jd> mapJd = jd(new JSONArray(new String(com.bytedance.sdk.component.utils.qk.cm(fileJd))));
                if (mapJd.isEmpty()) {
                    return;
                }
                for (Map.Entry<String, jd> entry : mapJd.entrySet()) {
                    jpo.put(entry.getKey(), entry.getValue());
                }
                return;
            }
            String strJd = com.bytedance.sdk.openadsdk.multipro.jd.wqx() ? com.bytedance.sdk.openadsdk.multipro.cm.jpo.jd("tt_sdk_settings", "ad_slot_conf", null) : ef.jpo("tt_sdk_settings", sq.jpo()).jpo("ad_slot_conf", (String) null);
            if (TextUtils.isEmpty(strJd)) {
                return;
            }
            HashMap<String, jd> mapJd2 = jd(new JSONArray(strJd));
            if (mapJd2.isEmpty()) {
                return;
            }
            ConcurrentHashMap<String, jd> concurrentHashMap = jpo;
            concurrentHashMap.clear();
            concurrentHashMap.putAll(mapJd2);
        } catch (Exception unused) {
        }
    }

    private static File jd() {
        return new File(sq.jpo().getFilesDir(), "tt_ads_conf_sr");
    }

    private static jd jd(String str) {
        return new jd(str, 1);
    }

    private static jd jpo(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new jd(jSONObject);
    }

    public static jd jpo(String str) {
        jd jdVar = jpo.get(str);
        return jdVar == null ? jd(str) : jdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void jpo(org.json.JSONArray r5) throws java.lang.Throwable {
        /*
            if (r5 != 0) goto L4
            goto La9
        L4:
            java.io.File r0 = jd()
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r0.getParent()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r0.getName()
            r3.append(r4)
            java.lang.String r4 = ".tmp"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            r2 = 0
            boolean r3 = r1.exists()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34
            if (r3 == 0) goto L36
            r1.delete()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34
            goto L36
        L31:
            r5 = move-exception
            goto Laa
        L34:
            r0 = move-exception
            goto L66
        L36:
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r3.write(r2)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r1.renameTo(r0)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r0 = "tt_sdk_settings"
            android.content.Context r2 = com.bytedance.sdk.openadsdk.core.sq.jpo()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            com.bytedance.sdk.openadsdk.utils.ef r0 = com.bytedance.sdk.openadsdk.utils.ef.jpo(r0, r2)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r2 = "ad_slot_conf"
            r0.jpo(r2)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            boolean r0 = r1.exists()
            if (r0 == 0) goto L5d
            r1.delete()
        L5d:
            com.bytedance.sdk.openadsdk.utils.au.jpo(r3)
            goto L79
        L61:
            r5 = move-exception
            r2 = r3
            goto Laa
        L64:
            r0 = move-exception
            r2 = r3
        L66:
            java.lang.String r3 = "SdkSettings.AdSlot"
            java.lang.String r4 = "saveAdSlotToLocal: "
            android.util.Log.e(r3, r4, r0)     // Catch: java.lang.Throwable -> L31
            boolean r0 = r1.exists()
            if (r0 == 0) goto L76
            r1.delete()
        L76:
            com.bytedance.sdk.openadsdk.utils.au.jpo(r2)
        L79:
            java.util.HashMap r5 = jd(r5)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto La9
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L8b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto La9
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            com.bytedance.sdk.openadsdk.core.settings.jd r0 = (com.bytedance.sdk.openadsdk.core.settings.jd) r0
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.sdk.openadsdk.core.settings.jd> r2 = com.bytedance.sdk.openadsdk.core.settings.wqx.jpo
            r2.put(r1, r0)
            goto L8b
        La9:
            return
        Laa:
            boolean r0 = r1.exists()
            if (r0 == 0) goto Lb3
            r1.delete()
        Lb3:
            com.bytedance.sdk.openadsdk.utils.au.jpo(r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.settings.wqx.jpo(org.json.JSONArray):void");
    }

    public static void jpo() {
        File fileJd = jd();
        if (fileJd.exists()) {
            fileJd.delete();
        }
    }
}
