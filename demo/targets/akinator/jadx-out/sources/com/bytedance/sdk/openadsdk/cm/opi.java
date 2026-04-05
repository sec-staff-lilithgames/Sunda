package com.bytedance.sdk.openadsdk.cm;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import hr.kNq.ikJMrW;
import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class opi implements com.bytedance.sdk.openadsdk.cm.cm.my {

    /* renamed from: cm, reason: collision with root package name */
    private Boolean f19609cm;

    /* renamed from: jd, reason: collision with root package name */
    private dt f19610jd;

    /* renamed from: jj, reason: collision with root package name */
    private JSONObject f19611jj;
    private String jpo;
    private Boolean my;

    /* renamed from: qk, reason: collision with root package name */
    private JSONArray f19612qk;
    private Boolean wqx;
    private JSONArray xyk;

    public opi(int i10, String str, dt dtVar) throws JSONException {
        Boolean bool = Boolean.FALSE;
        this.wqx = bool;
        this.f19609cm = bool;
        this.my = bool;
        this.jpo = str;
        this.f19610jd = dtVar;
        this.f19611jj = new JSONObject();
        this.f19612qk = new JSONArray();
        this.xyk = new JSONArray();
        jpo(this.f19611jj, "webview_source", Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean sq() {
        if (this.my.booleanValue()) {
            return true;
        }
        return this.f19609cm.booleanValue() && this.wqx.booleanValue();
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.jd
    public void au() {
        com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.14
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                opi.this.jpo(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                opi opiVar = opi.this;
                opiVar.jpo(opiVar.f19611jj, "native_render_end", jSONObject);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                opi.this.jpo(jSONObject2, "ts", Long.valueOf(jCurrentTimeMillis2));
                opi opiVar2 = opi.this;
                opiVar2.jpo(opiVar2.f19611jj, "render_success", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.cm
    public void hna() {
        try {
            com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.17
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    opi.this.jpo(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    opi opiVar = opi.this;
                    opiVar.jpo(opiVar.f19611jj, "render_did_finish", jSONObject);
                }
            });
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.my
    /* renamed from: if */
    public void mo435if() {
        com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.10
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                String str = ikJMrW.gNklCUah;
                if (opi.this.sq()) {
                    if (opi.this.f19612qk != null && opi.this.f19612qk.length() != 0) {
                        try {
                            opi.this.f19611jj.put("native_switchBackgroundAndForeground", opi.this.f19612qk);
                        } catch (Exception unused) {
                        }
                    }
                    if (opi.this.xyk != null && opi.this.xyk.length() != 0) {
                        try {
                            opi.this.f19611jj.put("intercept_source", opi.this.xyk);
                        } catch (Exception unused2) {
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(str, opi.this.f19611jj);
                    } catch (JSONException e10) {
                        nmd.jpo("WebviewTimeTrack", "trySendTrackInfo json error", e10);
                    }
                    if (com.bytedance.sdk.openadsdk.core.zz.jd().sq() && opi.this.f19611jj != null) {
                        JSONObject unused3 = opi.this.f19611jj;
                    }
                    wqx.jd(opi.this.f19610jd, opi.this.jpo, str, jSONObject);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.my
    public void ju() {
        this.wqx = Boolean.TRUE;
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.jd
    public void oya() {
        com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.15
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                opi.this.jpo(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                opi opiVar = opi.this;
                opiVar.jpo(opiVar.f19611jj, "no_native_render", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.cm
    public void prr() {
        com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.16
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                opi.this.jpo(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                opi opiVar = opi.this;
                opiVar.jpo(opiVar.f19611jj, "render_failed", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.wqx
    public void qk() {
        com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.31
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                opi.this.jpo(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                opi opiVar = opi.this;
                opiVar.jpo(opiVar.f19611jj, "native_endcard_show", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.wqx
    public void xyk() {
        com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.2
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                opi.this.jpo(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                opi opiVar = opi.this;
                opiVar.jpo(opiVar.f19611jj, "native_endcard_close", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.wqx
    public void yd() {
        com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.4
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                opi.this.jpo(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                opi.this.jpo(jSONObject, "type", "native_enterForeground");
                opi opiVar = opi.this;
                opiVar.jpo(opiVar.f19612qk, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.wqx
    public void zz() {
        com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.3
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                opi.this.jpo(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                opi.this.jpo(jSONObject, "type", "native_enterBackground");
                opi opiVar = opi.this;
                opiVar.jpo(opiVar.f19612qk, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.wqx
    public void cm() {
        com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.27
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                opi.this.jpo(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                opi opiVar = opi.this;
                opiVar.jpo(opiVar.f19611jj, "native_render_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.cm
    public void jd() {
        com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.12
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                opi.this.jpo(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                opi opiVar = opi.this;
                opiVar.jpo(opiVar.f19611jj, "render_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.jj
    public void jj() {
        com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.29
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                opi.this.jpo(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                opi opiVar = opi.this;
                opiVar.jpo(opiVar.f19611jj, "webview_load_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.jj
    public void my() {
        com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.28
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                opi.this.jpo(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                opi opiVar = opi.this;
                opiVar.jpo(opiVar.f19611jj, "webview_load_start", (Object) jSONObject, false);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.jpo
    public void qk(final String str) {
        com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.24
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                opi.this.jpo(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                opi opiVar = opi.this;
                opiVar.jpo(opiVar.f19611jj, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.jd
    public void wqx() {
        com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.26
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                opi.this.jpo(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                opi opiVar = opi.this;
                opiVar.jpo(opiVar.f19611jj, "native_render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.jpo
    public void cm(final String str) {
        com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.18
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                opi.this.jpo(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                opi opiVar = opi.this;
                opiVar.jpo(opiVar.f19611jj, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.jj
    public void jd(final String str, final long j10, final long j11, final int i10) {
        com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.6
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                if (TextUtils.isEmpty(str) || j11 < j10) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                opi.this.jpo(jSONObject, "start_ts", Long.valueOf(j10));
                opi.this.jpo(jSONObject, "end_ts", Long.valueOf(j11));
                opi.this.jpo(jSONObject, "intercept_type", Integer.valueOf(i10));
                opi.this.jpo(jSONObject, "type", "intercept_js");
                opi.this.jpo(jSONObject, "url", str);
                opi.this.jpo(jSONObject, IronSourceConstants.EVENTS_DURATION, Long.valueOf(j11 - j10));
                opi opiVar = opi.this;
                opiVar.jpo(opiVar.xyk, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.jpo
    public void jj(final String str) {
        try {
            com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.21
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    opi.this.jpo(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    opi opiVar = opi.this;
                    opiVar.jpo(opiVar.f19611jj, str, jSONObject);
                }
            });
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.jpo
    public void my(final String str) {
        try {
            com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.20
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    opi.this.jpo(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    opi opiVar = opi.this;
                    opiVar.jpo(opiVar.f19611jj, str, jSONObject);
                }
            });
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.jpo
    public void wqx(final String str) {
        com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.11
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                opi.this.jpo(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                opi opiVar = opi.this;
                opiVar.jpo(opiVar.f19611jj, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.jj
    public void jd(final String str) {
        com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.8
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                opi.this.jpo(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                opi.this.jpo(jSONObject, "jsb", str);
                opi opiVar = opi.this;
                opiVar.jpo(opiVar.f19611jj, "webview_jsb_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.jpo
    public void wqx(final int i10, final String str) {
        try {
            com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.22
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    opi.this.jpo(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    opi.this.jpo(jSONObject, "code", Integer.valueOf(i10));
                    opi opiVar = opi.this;
                    opiVar.jpo(opiVar.f19611jj, str, jSONObject);
                }
            });
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.jj
    public void jd(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.9
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                JSONObject jSONObject2;
                if (opi.this.f19611jj == null || (jSONObject2 = jSONObject) == null) {
                    return;
                }
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    opi opiVar = opi.this;
                    opiVar.jpo(opiVar.f19611jj, next, jSONObject.opt(next));
                }
                opi.this.f19609cm = Boolean.TRUE;
                opi.this.mo435if();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.jpo
    public void jd(final int i10, final String str) {
        com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.13
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                opi.this.jpo(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                opi.this.jpo(jSONObject, "code", Integer.valueOf(i10));
                opi opiVar = opi.this;
                opiVar.jpo(opiVar.f19611jj, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.cm
    public void jpo() {
        com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.1
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                opi.this.jpo(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                opi opiVar = opi.this;
                opiVar.jpo(jSONObject, "render_sequence", Integer.valueOf(opiVar.f19610jd.tl()));
                if (opi.this.f19610jd != null) {
                    if (opi.this.f19610jd.vzb() != null) {
                        if (opi.this.f19610jd.vzb().m469if()) {
                            opi.this.jpo(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.my.my.jpo().cm()));
                            opi.this.jpo(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.my.my.jpo().cm()));
                        } else {
                            opi.this.jpo(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.my.my.jpo().wqx()));
                            opi.this.jpo(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.my.my.jpo().wqx()));
                        }
                    } else if (opi.this.f19610jd.jrx() != null) {
                        opi.this.jpo(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.my.my.jpo().cm()));
                        opi.this.jpo(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.my.my.jpo().cm()));
                    }
                }
                opi opiVar2 = opi.this;
                opiVar2.jpo(opiVar2.f19611jj, "render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.cm
    public void jpo(final int i10, final String str) {
        com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.23
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                opi.this.jpo(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                opi.this.jpo(jSONObject, "code", Integer.valueOf(i10));
                String str2 = str;
                if (str2 != null) {
                    opi.this.jpo(jSONObject, "reason", str2);
                }
                opi opiVar = opi.this;
                opiVar.jpo(opiVar.f19611jj, "render_error", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.jj
    public void jpo(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.30
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                JSONObject jSONObject2 = jSONObject;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                opi.this.jpo(jSONObject2, "ts", Long.valueOf(System.currentTimeMillis()));
                opi opiVar = opi.this;
                opiVar.jpo(opiVar.f19611jj, "webview_load_error", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.jj
    public void jpo(final String str, final long j10, final long j11, final int i10) {
        com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.5
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                if (TextUtils.isEmpty(str) || j11 < j10) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                opi.this.jpo(jSONObject, "start_ts", Long.valueOf(j10));
                opi.this.jpo(jSONObject, "end_ts", Long.valueOf(j11));
                opi.this.jpo(jSONObject, "intercept_type", Integer.valueOf(i10));
                opi.this.jpo(jSONObject, "type", "intercept_html");
                opi.this.jpo(jSONObject, "url", str);
                opi.this.jpo(jSONObject, IronSourceConstants.EVENTS_DURATION, Long.valueOf(j11 - j10));
                opi opiVar = opi.this;
                opiVar.jpo(opiVar.xyk, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.jj
    public void jpo(final String str) {
        com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.7
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                opi.this.jpo(jSONObject, QGjYBESwAiCc.iqHwBZjsI, Long.valueOf(jCurrentTimeMillis));
                opi.this.jpo(jSONObject, "jsb", str);
                opi opiVar = opi.this;
                opiVar.jpo(opiVar.f19611jj, "webview_jsb_start", jSONObject);
            }
        });
    }

    public opi() {
        this.jpo = "embeded_ad";
        Boolean bool = Boolean.FALSE;
        this.wqx = bool;
        this.f19609cm = bool;
        this.my = bool;
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.my
    public void jpo(boolean z10) {
        this.my = Boolean.valueOf(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(JSONObject jSONObject, String str, Object obj, boolean z10) throws JSONException {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (!z10) {
            try {
                if (jSONObject.has(str)) {
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        jSONObject.put(str, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(JSONObject jSONObject, String str, Object obj) throws JSONException {
        jpo(jSONObject, str, obj, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(JSONArray jSONArray, Object obj) {
        if (jSONArray == null || jSONArray.length() >= 10) {
            return;
        }
        try {
            jSONArray.put(obj);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.jpo
    public void jpo(final String str, final boolean z10) {
        try {
            com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.19
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    opi.this.jpo(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    opi.this.jpo(jSONObject, "isReuse", Integer.valueOf(z10 ? 1 : 0));
                    opi opiVar = opi.this;
                    opiVar.jpo(opiVar.f19611jj, str, jSONObject);
                }
            });
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.cm.cm.jj
    public void jpo(final int i10) {
        com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.opi.25
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                opi.this.jpo(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                opi.this.jpo(jSONObject, "isWebViewCache", Integer.valueOf(i10));
                if (opi.this.f19610jd != null) {
                    if (opi.this.f19610jd.gf()) {
                        opi.this.jpo(jSONObject, "engine_version", "v3");
                    } else {
                        opi.this.jpo(jSONObject, "engine_version", "v1");
                    }
                }
                opi opiVar = opi.this;
                opiVar.jpo(opiVar.f19611jj, "before_webview_request", jSONObject);
            }
        });
    }
}
