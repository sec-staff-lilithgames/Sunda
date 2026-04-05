package com.bytedance.sdk.openadsdk.core.model;

import android.content.Intent;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class pdm {

    /* renamed from: cm, reason: collision with root package name */
    private int f20766cm;

    /* renamed from: jd, reason: collision with root package name */
    private String f20767jd;

    /* renamed from: jj, reason: collision with root package name */
    private String f20768jj;
    private String jpo;

    /* renamed from: ju, reason: collision with root package name */
    private int f20769ju;
    private String my;

    /* renamed from: qk, reason: collision with root package name */
    private String f20770qk;
    private int wqx;
    private int xyk;

    /* renamed from: yd, reason: collision with root package name */
    private String f20771yd;
    private String zz;

    public String cm() {
        return this.my;
    }

    public int jd() {
        return this.xyk;
    }

    public void jj(String str) {
        this.jpo = str;
    }

    public String jpo() {
        return this.f20770qk;
    }

    public String my() {
        return this.f20768jj;
    }

    public void qk(String str) {
        this.f20767jd = str;
    }

    public String wqx() {
        return this.zz;
    }

    public boolean xyk() {
        return this.f20769ju == 1;
    }

    public JSONObject yd() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.jpo)) {
                jSONObject.put("market_dpl", this.jpo);
            }
            if (!TextUtils.isEmpty(this.f20767jd)) {
                jSONObject.put("market_dpl_auto", this.f20767jd);
            }
            if (!TextUtils.isEmpty(this.my)) {
                jSONObject.put("market_pkg", this.my);
            }
            if (!TextUtils.isEmpty(this.f20770qk)) {
                jSONObject.put("app_pkg", this.f20770qk);
            }
            if (!TextUtils.isEmpty(this.f20768jj)) {
                jSONObject.put("regex", this.f20768jj);
            }
            jSONObject.put("exec_type", this.wqx);
            jSONObject.put("oem_vendor_type", this.f20766cm);
            jSONObject.put("overlay", this.xyk);
            jSONObject.put("gp_card", this.f20769ju);
            if (!TextUtils.isEmpty(this.zz)) {
                jSONObject.put("caller_id", this.zz);
            }
            if (!TextUtils.isEmpty(this.f20771yd)) {
                jSONObject.put("ext_map", this.f20771yd);
            }
            return jSONObject;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx("OemModel", th2.getMessage());
            return null;
        }
    }

    public String zz() {
        return this.wqx == 2 ? this.f20767jd : this.jpo;
    }

    public void cm(String str) {
        this.my = str;
    }

    public void jd(int i10) {
        this.xyk = i10;
    }

    public int jj() {
        return this.f20766cm;
    }

    public void jpo(String str) {
        this.f20770qk = str;
    }

    public void my(String str) {
        this.f20768jj = str;
    }

    public boolean qk() {
        return this.f20766cm == 1;
    }

    public void wqx(String str) {
        this.f20771yd = str;
    }

    public void cm(int i10) {
        this.f20766cm = i10;
    }

    public void jd(String str) {
        this.zz = str;
    }

    public void jpo(int i10) {
        this.f20769ju = i10;
    }

    public void wqx(int i10) {
        this.wqx = i10;
    }

    public static pdm jpo(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        pdm pdmVar = new pdm();
        try {
            pdmVar.jj(jSONObject.optString("market_dpl", ""));
            pdmVar.qk(jSONObject.optString("market_dpl_auto", ""));
            pdmVar.wqx(jSONObject.optInt("exec_type", 0));
            pdmVar.cm(jSONObject.optInt("oem_vendor_type", 0));
            pdmVar.cm(jSONObject.optString("market_pkg", ""));
            pdmVar.my(jSONObject.optString("regex", ""));
            pdmVar.jd(jSONObject.optInt("overlay", 1));
            pdmVar.jd(jSONObject.optString("caller_id", ""));
            pdmVar.wqx(jSONObject.optString("ext_map", null));
            pdmVar.jpo(jSONObject.optInt("gp_card", 0));
            pdmVar.jpo(jSONObject.optString("app_pkg", ""));
            return pdmVar;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx("OemModel", th2.getMessage());
            return pdmVar;
        }
    }

    public void jpo(Intent intent) {
        if (TextUtils.isEmpty(this.f20771yd)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.f20771yd);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    intent.putExtra(next, (String) obj);
                } else if (obj instanceof Integer) {
                    intent.putExtra(next, (Integer) obj);
                } else if (obj instanceof Boolean) {
                    intent.putExtra(next, (Boolean) obj);
                } else if (obj instanceof Long) {
                    intent.putExtra(next, (Long) obj);
                } else if (obj instanceof Double) {
                    intent.putExtra(next, (Double) obj);
                } else if (obj instanceof Float) {
                    intent.putExtra(next, (Float) obj);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
