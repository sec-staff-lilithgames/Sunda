package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.amazon.device.ads.DTBMetricReport;
import com.bytedance.sdk.openadsdk.core.cm.qk;
import com.bytedance.sdk.openadsdk.utils.Cif;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz {

    /* renamed from: au, reason: collision with root package name */
    private static boolean f21035au = false;

    /* renamed from: jd, reason: collision with root package name */
    public static final Set<String> f21036jd = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.zz.1
        {
            add("8025677");
            add("5001121");
        }
    };
    public static au jpo;

    /* renamed from: cm, reason: collision with root package name */
    private String f21037cm;
    private String hna;

    /* renamed from: if, reason: not valid java name */
    private int f146if;

    /* renamed from: jj, reason: collision with root package name */
    private String f21038jj;

    /* renamed from: ju, reason: collision with root package name */
    private Integer f21039ju;
    private String my;
    private volatile ConcurrentHashMap<String, qk.jpo> opi;
    private String oya;
    private boolean prr;

    /* renamed from: qk, reason: collision with root package name */
    private int f21040qk;

    /* renamed from: sq, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.au.wqx.wqx f21041sq;
    private boolean wqx;
    private String xyk;

    /* renamed from: yd, reason: collision with root package name */
    private Bitmap f21042yd;
    private int zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {
        private static final zz jpo = new zz();
    }

    public static void dt() {
        if (Build.VERSION.SDK_INT == 26 && "MI 6".equals(Build.MODEL)) {
            f21035au = true;
        }
    }

    public static zz jd() {
        return jpo.jpo;
    }

    public static int jj() {
        try {
            String strJpo = jpo("config_fail_times", Long.MAX_VALUE);
            if (TextUtils.isEmpty(strJpo)) {
                return 0;
            }
            return Integer.valueOf(strJpo).intValue();
        } catch (Throwable th2) {
            th2.getMessage();
            return 0;
        }
    }

    public static int my() {
        try {
            String strJpo = jpo("domain_index", Long.MAX_VALUE);
            if (TextUtils.isEmpty(strJpo)) {
                return 0;
            }
            return Integer.valueOf(strJpo).intValue();
        } catch (Throwable th2) {
            th2.getMessage();
            return 0;
        }
    }

    public static boolean tu() {
        return f21035au;
    }

    public String au() {
        return com.bytedance.sdk.openadsdk.multipro.jd.wqx() ? com.bytedance.sdk.openadsdk.multipro.cm.cm.jd("sp_global_file", "extra_data", null) : this.xyk;
    }

    public String cm() {
        if (TextUtils.isEmpty(this.f21037cm)) {
            String strJpo = jpo("app_id", Long.MAX_VALUE);
            if (!TextUtils.isEmpty(strJpo)) {
                this.f21037cm = strJpo;
            }
        }
        return this.f21037cm;
    }

    public String hmu() {
        return com.bytedance.sdk.openadsdk.multipro.jd.wqx() ? com.bytedance.sdk.openadsdk.multipro.cm.cm.jd("sp_global_file", "adx_id", "") : this.oya;
    }

    public Bitmap hna() {
        return com.bytedance.sdk.openadsdk.multipro.jd.wqx() ? com.bytedance.sdk.component.utils.cm.jpo(com.bytedance.sdk.openadsdk.multipro.cm.cm.jd("sp_global_file", "pause_icon", null)) : this.f21042yd;
    }

    /* renamed from: if, reason: not valid java name */
    public boolean m482if() {
        int i10 = this.f146if;
        return i10 < -1 || i10 > 1;
    }

    public boolean jr() {
        return "com.union_test.internationad".equals(com.bytedance.sdk.openadsdk.utils.tic.jj());
    }

    public int ju() {
        return this.f146if;
    }

    public String nmd() {
        if (!TextUtils.isEmpty(this.hna)) {
            return this.hna;
        }
        String strJpo = Cif.jpo();
        this.hna = strJpo;
        if (!TextUtils.isEmpty(strJpo)) {
            return this.hna;
        }
        String strValueOf = String.valueOf(System.currentTimeMillis());
        Cif.jpo(strValueOf);
        this.hna = strValueOf;
        return strValueOf;
    }

    public boolean opi() {
        return "5001121".contains(this.f21037cm);
    }

    public com.bytedance.sdk.openadsdk.core.au.wqx.wqx oya() {
        if (this.f21041sq == null) {
            this.f21041sq = new com.bytedance.sdk.openadsdk.core.au.wqx.wqx(10, 8);
        }
        return this.f21041sq;
    }

    public boolean prr() {
        return true;
    }

    public String qk() {
        String str = this.my;
        if (str != null) {
            return str;
        }
        String strJpo = jpo("mediation_info", Long.MAX_VALUE);
        this.my = strJpo;
        if (strJpo == null) {
            this.my = "";
        }
        return this.my;
    }

    public void rq() {
        try {
            if (this.opi == null || this.opi.size() != 0) {
                return;
            }
            this.opi = null;
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public boolean sq() {
        return f21036jd.contains(this.f21037cm);
    }

    public boolean wqx() {
        return com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("sp_global_file", "sdk_activate_init", true);
    }

    public String xyk() {
        if (TextUtils.isEmpty(this.f21038jj)) {
            this.f21038jj = jpo(sq.jpo());
        }
        return this.f21038jj;
    }

    public int yd() {
        Integer num = this.f21039ju;
        return num != null ? num.intValue() : com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("sp_global_privacy", "tt_gdpr", -1);
    }

    public int zz() {
        return com.bytedance.sdk.openadsdk.multipro.jd.wqx() ? com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("sp_global_icon_id", "icon_id", 0) : this.f21040qk;
    }

    private zz() {
        this.wqx = false;
        this.zz = 0;
        this.f21042yd = null;
        this.f21039ju = null;
        this.f146if = -1;
        this.opi = null;
    }

    /* renamed from: if, reason: not valid java name */
    private static JSONObject m481if(String str) {
        String strJd = com.bytedance.sdk.openadsdk.multipro.cm.cm.jd("sp_global_file", str, null);
        if (TextUtils.isEmpty(strJd)) {
            return null;
        }
        try {
            return new JSONObject(strJd);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.nmd.wqx("TTAD.GlobalInfo", e10.getMessage());
            return null;
        }
    }

    private static void ju(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 1000) {
            return;
        }
        au auVar = jpo;
        if (auVar != null) {
            auVar.fail(4000, "Data is very long, the longest is 1000");
        }
        com.bytedance.sdk.component.utils.nmd.wqx("TTAD.GlobalInfo", "Data is very long, the longest is 1000");
    }

    public void jd(boolean z10) {
        com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("sp_global_file", "sdk_activate_init", Boolean.valueOf(z10));
    }

    public void wqx(int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("sp_global_icon_id", "icon_id", Integer.valueOf(i10));
        }
        this.f21040qk = i10;
    }

    public static void jd(int i10) throws JSONException {
        if (i10 >= 0) {
            jpo("config_fail_times", String.valueOf(i10));
        }
    }

    public static void jpo(au auVar) {
        jpo = auVar;
    }

    private static void yd(String str) {
        au auVar;
        if (TextUtils.isEmpty(str) && (auVar = jpo) != null) {
            auVar.fail(4000, "appid cannot be empty");
        }
        com.bytedance.sdk.component.utils.nmd.wqx("TTAD.GlobalInfo", "appid cannot be empty");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zz(String str) {
        if (!TextUtils.isEmpty(this.xyk)) {
            try {
                HashMap map = new HashMap();
                JSONArray jSONArray = new JSONArray(this.xyk);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("name");
                        if (!TextUtils.isEmpty(strOptString)) {
                            map.put(strOptString, jSONObjectOptJSONObject);
                        }
                    }
                }
                JSONArray jSONArray2 = new JSONArray(str);
                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArray2.optJSONObject(i11);
                    if (jSONObjectOptJSONObject2 != null) {
                        String strOptString2 = jSONObjectOptJSONObject2.optString("name");
                        String strOptString3 = jSONObjectOptJSONObject2.optString("value");
                        if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3)) {
                            map.put(strOptString2, jSONObjectOptJSONObject2);
                        }
                    }
                }
                Collection collectionValues = map.values();
                JSONArray jSONArray3 = new JSONArray();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    jSONArray3.put((JSONObject) it.next());
                }
                this.xyk = jSONArray3.toString();
            } catch (Throwable th2) {
                th2.getMessage();
            }
        } else {
            this.xyk = str;
        }
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("sp_global_file", "extra_data", this.xyk);
        }
    }

    public void jd(String str) throws JSONException {
        this.my = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        jpo("mediation_info", str);
    }

    public boolean jpo() {
        return this.prr;
    }

    public void xyk(String str) {
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("sp_global_file", "adx_id", str);
        }
        this.oya = str;
    }

    public static boolean qk(String str) {
        return (TextUtils.isEmpty(str) || !com.bytedance.sdk.openadsdk.utils.se.jpo || str.contains("sp_full_screen_video") || str.contains("sp_reward_video") || str.contains("tt_openad") || str.contains("pag_sp_bad_par")) ? false : true;
    }

    public void jj(int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("sp_global_file", "title_bar_theme", Integer.valueOf(i10));
        }
        this.zz = i10;
    }

    public void jpo(boolean z10) {
        this.prr = z10;
    }

    public void my(int i10) {
        this.f146if = i10;
    }

    public void wqx(final String str) {
        ju(str);
        if (com.bytedance.sdk.openadsdk.utils.duq.jj()) {
            oya.jd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.3
                @Override // java.lang.Runnable
                public void run() {
                    zz.this.zz(str);
                }
            });
        } else {
            zz(str);
        }
    }

    public static void jpo(int i10) throws JSONException {
        if (i10 >= 0) {
            jpo("domain_index", String.valueOf(i10));
        }
    }

    public void cm(final int i10) {
        if (i10 == 1) {
            i10 = 0;
        } else if (i10 == 0) {
            i10 = 1;
        }
        if (i10 == 0 || i10 == 1 || i10 == -1) {
            final Integer num = this.f21039ju;
            if (num == null || num.intValue() != i10) {
                this.f21039ju = Integer.valueOf(i10);
                if (!com.bytedance.sdk.openadsdk.utils.duq.jj()) {
                    jpo(num, i10);
                } else {
                    oya.jd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.2
                        @Override // java.lang.Runnable
                        public void run() {
                            zz.this.jpo(num, i10);
                        }
                    });
                }
            }
        }
    }

    public qk.jpo my(String str) {
        try {
            if (this.opi == null || str == null) {
                return null;
            }
            return this.opi.get(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void jpo(String str) throws JSONException {
        yd(str);
        this.f21037cm = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        jpo("app_id", str);
        com.bytedance.sdk.openadsdk.core.settings.au.jrx().cm(7);
    }

    public void jj(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                com.bytedance.sdk.openadsdk.wqx.yd.jpo(6, str);
            } else if (this.opi != null) {
                this.opi.remove(str);
            }
        } catch (Throwable unused) {
        }
    }

    public void wqx(boolean z10) {
        this.wqx = z10;
    }

    public static Pair<String, Long> cm(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectM481if = m481if(str);
            if (jSONObjectM481if == null) {
                return null;
            }
            return new Pair<>(jSONObjectM481if.getString("value"), Long.valueOf(jSONObjectM481if.getLong(DTBMetricReport.TIME)));
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.nmd.wqx("TTAD.GlobalInfo", e10.getMessage());
            return null;
        }
    }

    private String jpo(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(Integer num, int i10) {
        if (num != null) {
            com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("sp_global_privacy", "tt_gdpr", Integer.valueOf(i10));
            com.bytedance.sdk.openadsdk.core.settings.au.jrx().jpo(4, true);
        } else if (com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("sp_global_privacy", "tt_gdpr", -1) != i10) {
            com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("sp_global_privacy", "tt_gdpr", Integer.valueOf(i10));
            com.bytedance.sdk.openadsdk.core.settings.au.jrx().jpo(4, true);
        }
    }

    public static void jpo(String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", str2);
            jSONObject.put(DTBMetricReport.TIME, System.currentTimeMillis());
            com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("sp_global_file", str, jSONObject.toString());
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.nmd.wqx("TTAD.GlobalInfo", e10.getMessage());
        }
    }

    public static String jpo(String str, long j10) {
        JSONObject jSONObjectM481if;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            jSONObjectM481if = m481if(str);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.nmd.wqx("TTAD.GlobalInfo", e10.getMessage());
        }
        if (jSONObjectM481if == null) {
            return null;
        }
        if (System.currentTimeMillis() - jSONObjectM481if.getLong(DTBMetricReport.TIME) <= j10) {
            return jSONObjectM481if.getString("value");
        }
        return null;
    }

    public void jpo(String str, qk.jpo jpoVar) {
        try {
            if (TextUtils.isEmpty(str) || jpoVar == null) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                com.bytedance.sdk.openadsdk.wqx.yd.jpo(6, str, jpoVar);
                return;
            }
            if (this.opi == null) {
                synchronized (zz.class) {
                    try {
                        if (this.opi == null) {
                            this.opi = new ConcurrentHashMap<>();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (this.opi != null) {
                this.opi.put(str, jpoVar);
            }
        } catch (Throwable unused) {
        }
    }
}
