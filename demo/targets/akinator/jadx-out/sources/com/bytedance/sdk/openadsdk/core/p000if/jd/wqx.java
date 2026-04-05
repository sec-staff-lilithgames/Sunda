package com.bytedance.sdk.openadsdk.core.p000if.jd;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.se;
import com.bytedance.sdk.component.xyk.xyk;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.p000if.jd.jd;
import com.bytedance.sdk.openadsdk.core.p000if.jd.jpo;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.utils.tic;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {

    /* renamed from: cm, reason: collision with root package name */
    private final boolean f20378cm;

    /* renamed from: jj, reason: collision with root package name */
    private boolean f20379jj;
    private EnumC0117wqx my;
    private final String wqx;
    private static final Map<String, jd> jpo = new ConcurrentHashMap();

    /* renamed from: jd, reason: collision with root package name */
    private static final AtomicBoolean f20377jd = new AtomicBoolean(false);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jd {

        /* renamed from: jd, reason: collision with root package name */
        String f20386jd;
        final dt jpo;
        float wqx;

        public jd(String str, dt dtVar) {
            this(str, dtVar, -1.0f);
        }

        public String toString() {
            return super.toString();
        }

        public jd(String str, dt dtVar, float f10) {
            this.f20386jd = str;
            this.jpo = dtVar;
            this.wqx = f10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {
        private final String jpo;

        /* renamed from: jd, reason: collision with root package name */
        private EnumC0117wqx f20387jd = EnumC0117wqx.TRACKING_URL;
        private boolean wqx = false;

        public jpo(String str) {
            this.jpo = str;
        }

        public jpo jpo(boolean z10) {
            this.wqx = z10;
            return this;
        }

        public wqx jpo() {
            return new wqx(this.jpo, this.f20387jd, Boolean.valueOf(this.wqx));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.core.if.jd.wqx$wqx, reason: collision with other inner class name */
    public enum EnumC0117wqx {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    static {
        se.jpo(new se.jpo() { // from class: com.bytedance.sdk.openadsdk.core.if.jd.wqx.1
            @Override // com.bytedance.sdk.component.utils.se.jpo
            public void jpo(Context context, Intent intent, boolean z10, int i10) {
                if (i10 == 0 || wqx.jpo.size() <= 0) {
                    return;
                }
                wqx.jd();
            }
        }, sq.jpo());
    }

    public wqx(String str, EnumC0117wqx enumC0117wqx, Boolean bool) {
        this.wqx = str;
        this.my = enumC0117wqx;
        this.f20378cm = bool.booleanValue();
    }

    public static void jd(dt dtVar, List<wqx> list, com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo jpoVar, long j10, String str, String str2) {
        jpo(dtVar, list, jpoVar, j10, str, null, str2);
    }

    public static List<com.bytedance.sdk.openadsdk.core.p000if.jd.jpo> wqx(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new jpo.C0116jpo(jSONObjectOptJSONObject.optString("content"), jSONObjectOptJSONObject.optLong("trackingMilliseconds", 0L)).jpo());
                }
            }
        }
        return arrayList;
    }

    public boolean cm() {
        return this.f20378cm;
    }

    public void j_() {
        this.f20379jj = true;
    }

    public boolean my() {
        return this.f20379jj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void jd() {
        if (f20377jd.compareAndSet(false, true)) {
            Map<String, jd> map = jpo;
            HashSet hashSet = new HashSet(map.entrySet());
            map.clear();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry != null) {
                    jpo((String) entry.getKey(), (jd) entry.getValue(), true);
                }
            }
            f20377jd.set(false);
        }
    }

    public static List<String> jpo(dt dtVar, List<wqx> list, com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo jpoVar, long j10, String str, String str2) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (wqx wqxVar : list) {
            if (wqxVar != null && (!wqxVar.my() || wqxVar.cm())) {
                arrayList.add(wqxVar.wqx());
                wqxVar.j_();
            }
        }
        return arrayList.isEmpty() ? arrayList : new com.bytedance.sdk.openadsdk.core.p000if.wqx.wqx(arrayList, dtVar).jpo(jpoVar).jpo(j10).jd(str).jpo(str2).jpo();
    }

    public String wqx() {
        return this.wqx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void jd(final boolean z10, final String str, final String str2, final jd jdVar, final String str3, final boolean z11) {
        dt dtVar;
        if (jdVar == null || (dtVar = jdVar.jpo) == null) {
            return;
        }
        final boolean zIg = dtVar.ig();
        final String str4 = zIg ? "dsp_track_link_result" : "track_link_result";
        com.bytedance.sdk.openadsdk.cm.wqx.jpo(new xyk(str4) { // from class: com.bytedance.sdk.openadsdk.core.if.jd.wqx.3
            @Override // java.lang.Runnable
            public void run() {
                final JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", jdVar.f20386jd);
                    jSONObject.put("success", z10);
                    jSONObject.put("url", str3);
                    if (zIg) {
                        if (!TextUtils.isEmpty(str)) {
                            jSONObject.put("description", str);
                        }
                        if (jdVar.wqx >= 0.0f) {
                            jSONObject.put(NotificationCompat.CATEGORY_PROGRESS, Math.round(r1 * 100.0f) / 100.0d);
                        }
                    }
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(System.currentTimeMillis(), jdVar.jpo, str2, str4, new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.core.if.jd.wqx.3.1
                    @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                    public JSONObject jpo() {
                        if (!z11) {
                            return null;
                        }
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("retry", true);
                            return jSONObject2;
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                    public JSONObject wqx() {
                        return jSONObject;
                    }
                });
            }
        });
    }

    public static List<com.bytedance.sdk.openadsdk.core.p000if.jd.jd> jd(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new jd.jpo(jSONObjectOptJSONObject.optString("content"), (float) jSONObjectOptJSONObject.optDouble("trackingFraction", 0.0d)).jpo());
                }
            }
        }
        return arrayList;
    }

    public static boolean jpo(dt dtVar, List<wqx> list, com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo jpoVar, long j10, String str, jd jdVar, String str2) {
        List<String> listJpo = jpo(dtVar, list, jpoVar, j10, str, str2);
        jpo(listJpo, jdVar);
        return !listJpo.isEmpty();
    }

    public static void jpo(List<String> list, jd jdVar) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            if (!TextUtils.isEmpty(str)) {
                jpo(str, jdVar, false);
            }
        }
    }

    private static void jpo(final String str, final jd jdVar, final boolean z10) {
        com.bytedance.sdk.component.qk.jd.jd jdVarWqx = com.bytedance.sdk.openadsdk.opi.jd.jd().wqx().wqx();
        if (jdVarWqx == null) {
            return;
        }
        jdVarWqx.jpo(true);
        jdVarWqx.jd(str);
        jdVarWqx.jpo(new com.bytedance.sdk.component.qk.jpo.jpo() { // from class: com.bytedance.sdk.openadsdk.core.if.jd.wqx.2
            @Override // com.bytedance.sdk.component.qk.jpo.jpo
            public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar, com.bytedance.sdk.component.qk.jd jdVar2) {
                String str2;
                boolean z11;
                jd jdVar3 = jdVar;
                if (jdVar3 == null || jdVar3.jpo == null) {
                    return;
                }
                String str3 = null;
                if (jdVar2 == null || !jdVar2.jj()) {
                    if (jdVar2 != null) {
                        str3 = jdVar2.jpo() + ":" + jdVar2.jd();
                        if (!z10 && (jdVar2.jpo() <= 300 || jdVar2.jpo() >= 400)) {
                            wqx.jpo.put(str, jdVar);
                        }
                    }
                    str2 = str3;
                    z11 = false;
                } else {
                    str2 = null;
                    z11 = true;
                }
                wqx.jd(z11, str2, tic.wqx(jdVar.jpo.cxb()), jdVar, str, z10);
                if (!z11 || wqx.jpo.isEmpty()) {
                    return;
                }
                wqx.jd();
            }

            @Override // com.bytedance.sdk.component.qk.jpo.jpo
            public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar, IOException iOException) {
                dt dtVar;
                jd jdVar2 = jdVar;
                if (jdVar2 != null && (dtVar = jdVar2.jpo) != null) {
                    wqx.jd(false, iOException != null ? iOException.getMessage() : null, tic.wqx(dtVar.cxb()), jdVar, str, z10);
                }
                if (z10 || jdVar == null) {
                    return;
                }
                wqx.jpo.put(str, jdVar);
            }
        });
    }

    public static JSONArray jpo(List<wqx> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            jSONArray.put(list.get(i10).wqx());
        }
        return jSONArray;
    }

    public static List<wqx> jpo(JSONArray jSONArray) {
        return jpo(jSONArray, false);
    }

    public static List<wqx> jpo(JSONArray jSONArray, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String strOptString = jSONArray.optString(i10);
                if (!TextUtils.isEmpty(strOptString)) {
                    arrayList.add(new jpo(strOptString).jpo(z10).jpo());
                }
            }
        }
        return arrayList;
    }
}
