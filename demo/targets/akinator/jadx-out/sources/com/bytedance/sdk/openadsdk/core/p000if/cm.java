package com.bytedance.sdk.openadsdk.core.p000if;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.zz;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.p000if.jd.jd;
import com.bytedance.sdk.openadsdk.core.p000if.jd.jpo;
import com.bytedance.sdk.openadsdk.core.p000if.jd.wqx;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm {
    private long hna;

    /* renamed from: jr, reason: collision with root package name */
    private boolean f20364jr;
    private boolean nmd;
    private boolean opi;
    private boolean prr;

    /* renamed from: rq, reason: collision with root package name */
    private String f20367rq;

    /* renamed from: sq, reason: collision with root package name */
    private dt f20368sq;

    /* renamed from: tu, reason: collision with root package name */
    private String f20369tu;

    /* renamed from: au, reason: collision with root package name */
    private final AtomicBoolean f20360au = new AtomicBoolean(false);
    private final AtomicBoolean oya = new AtomicBoolean(false);
    public List<wqx> jpo = new ArrayList();

    /* renamed from: jd, reason: collision with root package name */
    public List<wqx> f20362jd = new ArrayList();
    public List<wqx> wqx = new ArrayList();

    /* renamed from: cm, reason: collision with root package name */
    public List<wqx> f20361cm = new ArrayList();
    public List<wqx> my = new ArrayList();

    /* renamed from: jj, reason: collision with root package name */
    public List<wqx> f20363jj = new ArrayList();

    /* renamed from: qk, reason: collision with root package name */
    public List<wqx> f20366qk = new ArrayList();
    public List<wqx> xyk = new ArrayList();
    public List<wqx> zz = new ArrayList();

    /* renamed from: yd, reason: collision with root package name */
    public List<wqx> f20370yd = new ArrayList();

    /* renamed from: ju, reason: collision with root package name */
    public List<jd> f20365ju = new ArrayList();

    /* renamed from: if, reason: not valid java name */
    public List<jpo> f119if = new ArrayList();

    public void cm(long j10) {
        if (!jpo(j10, this.my, null, new wqx.jd(this.prr ? "video_progress" : CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, this.f20368sq, 1.0f)) || this.prr) {
            return;
        }
        com.bytedance.sdk.openadsdk.cm.wqx.jd(this.f20368sq, this.f20367rq, "track_complete", (JSONObject) null);
    }

    /* renamed from: if, reason: not valid java name */
    public void m459if(List<wqx> list) {
        this.f20370yd.addAll(list);
    }

    public void jd(long j10) {
        if (!jpo(j10, this.wqx, null, this.prr ? null : new wqx.jd(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, this.f20368sq, j10)) || this.prr) {
            return;
        }
        com.bytedance.sdk.openadsdk.cm.wqx.jd(this.f20368sq, this.f20367rq, "track_pause", (JSONObject) null);
    }

    public void jj(long j10) {
        if (!jpo(j10, this.f20366qk, null, this.prr ? null : new wqx.jd("skip", this.f20368sq)) || this.prr) {
            return;
        }
        com.bytedance.sdk.openadsdk.cm.wqx.jd(this.f20368sq, this.f20367rq, "track_skip", (JSONObject) null);
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo jpoVar) {
        if (!jpo(-1L, this.jpo, jpoVar, this.prr ? null : new wqx.jd("error", this.f20368sq, 0.0f)) || this.prr) {
            return;
        }
        com.bytedance.sdk.openadsdk.cm.wqx.jd(this.f20368sq, this.f20367rq, "track_error", (JSONObject) null);
    }

    public void ju(List<wqx> list) {
        this.zz.addAll(list);
    }

    public void my(long j10) {
        if (this.oya.compareAndSet(false, true)) {
            jpo(j10, this.f20363jj, (com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo) null);
        }
    }

    public void qk(long j10) {
        if (!jpo(j10, this.xyk, null, new wqx.jd(this.prr ? "click" : "clickTracking", this.f20368sq)) || this.prr) {
            return;
        }
        com.bytedance.sdk.openadsdk.cm.wqx.jd(this.f20368sq, this.f20367rq, "track_video_click", (JSONObject) null);
    }

    public void wqx(long j10) {
        if (!jpo(j10, this.f20361cm, null, this.prr ? null : new wqx.jd(CampaignEx.JSON_NATIVE_VIDEO_RESUME, this.f20368sq, j10)) || this.prr) {
            return;
        }
        com.bytedance.sdk.openadsdk.cm.wqx.jd(this.f20368sq, this.f20367rq, "track_resume", (JSONObject) null);
    }

    public void xyk(long j10) {
        if (!jpo(j10, this.zz, null, this.prr ? null : new wqx.jd(CampaignEx.JSON_NATIVE_VIDEO_MUTE, this.f20368sq, j10)) || this.prr) {
            return;
        }
        com.bytedance.sdk.openadsdk.cm.wqx.jd(this.f20368sq, this.f20367rq, "track_mute", (JSONObject) null);
    }

    public void yd(List<wqx> list) {
        this.jpo.addAll(list);
    }

    public void zz(long j10) {
        if (!jpo(j10, this.f20370yd, null, this.prr ? null : new wqx.jd(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE, this.f20368sq, j10)) || this.prr) {
            return;
        }
        com.bytedance.sdk.openadsdk.cm.wqx.jd(this.f20368sq, this.f20367rq, "track_unmute", (JSONObject) null);
    }

    public void my(List<wqx> list) {
        this.f20363jj.addAll(list);
    }

    private String jd() {
        if (this.f20369tu == null) {
            this.f20369tu = UUID.randomUUID().toString();
        }
        return this.f20369tu;
    }

    public void cm(List<wqx> list) {
        this.my.addAll(list);
    }

    public void jj(List<wqx> list) {
        this.f20366qk.addAll(list);
    }

    public void jpo(long j10) {
        if (this.f20360au.compareAndSet(false, true)) {
            if (!jpo(j10, this.f20362jd, null, new wqx.jd(this.prr ? "show_impression" : "impression", this.f20368sq)) || this.prr) {
                return;
            }
            com.bytedance.sdk.openadsdk.cm.wqx.jd(this.f20368sq, this.f20367rq, "track_impression", (JSONObject) null);
        }
    }

    public void qk(List<wqx> list) {
        this.xyk.addAll(list);
    }

    public void wqx(List<wqx> list) {
        this.f20361cm.addAll(list);
    }

    public void xyk(List<jd> list) {
        this.f20365ju.addAll(list);
        Collections.sort(this.f20365ju);
    }

    public void zz(List<jpo> list) {
        this.f119if.addAll(list);
        Collections.sort(this.f119if);
    }

    private JSONArray cm() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<jpo> it = this.f119if.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().jd());
        }
        return jSONArray;
    }

    private JSONArray wqx() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<jd> it = this.f20365ju.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().jd());
        }
        return jSONArray;
    }

    public void jd(List<wqx> list) {
        this.wqx.addAll(list);
    }

    public void jpo(long j10, long j11, jj jjVar) {
        wqx.jd jdVar;
        if (System.currentTimeMillis() - this.hna >= 1000 && j10 >= 0 && j11 > 0) {
            this.hna = System.currentTimeMillis();
            float f10 = j10 / j11;
            List<wqx> listJpo = jpo(j10, f10);
            float f11 = 0.25f;
            if (f10 >= 0.25f && !this.opi) {
                jpo("firstQuartile");
                this.opi = true;
                if (jjVar != null) {
                    jpo(jjVar, 6);
                }
                if (!this.prr) {
                    jdVar = new wqx.jd("firstQuartile", this.f20368sq, 0.25f);
                    f10 = f11;
                }
                f10 = f11;
                jdVar = null;
            } else {
                f11 = 0.5f;
                if (f10 >= 0.5f && !this.f20364jr) {
                    jpo(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
                    this.f20364jr = true;
                    if (jjVar != null) {
                        jpo(jjVar, 7);
                    }
                    if (!this.prr) {
                        jdVar = new wqx.jd(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT, this.f20368sq, 0.5f);
                        f10 = f11;
                    }
                    f10 = f11;
                    jdVar = null;
                } else {
                    f11 = 0.75f;
                    if (f10 >= 0.75f && !this.nmd) {
                        jpo("thirdQuartile");
                        this.nmd = true;
                        if (jjVar != null) {
                            jpo(jjVar, 8);
                        }
                        if (!this.prr) {
                            jdVar = new wqx.jd("thirdQuartile", this.f20368sq, 0.75f);
                            f10 = f11;
                        }
                        f10 = f11;
                    }
                    jdVar = null;
                }
            }
            if (f10 < 0.03f) {
                f10 = 0.0f;
            }
            if (!this.prr && !listJpo.isEmpty()) {
                wqx wqxVar = listJpo.get(0);
                if ((wqxVar instanceof jpo) && ((jpo) wqxVar).jpo() == 0) {
                    com.bytedance.sdk.openadsdk.cm.wqx.jd(this.f20368sq, this.f20367rq, "track_start", (JSONObject) null);
                    jdVar = new wqx.jd("start", this.f20368sq, f10);
                }
            }
            if (listJpo.isEmpty()) {
                return;
            }
            if (jdVar == null) {
                jdVar = new wqx.jd("video_progress", this.f20368sq, f10);
            }
            jpo(j10, listJpo, null, jdVar);
        }
    }

    private void jpo(final jj jjVar, final int i10) {
        zz.jd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.if.cm.1
            @Override // java.lang.Runnable
            public void run() {
                jj jjVar2 = jjVar;
                if (jjVar2 != null) {
                    jjVar2.jpo(i10);
                }
            }
        });
    }

    private void jpo(String str) {
        try {
            if (this.prr) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(NotificationCompat.CATEGORY_EVENT, str);
                com.bytedance.sdk.openadsdk.cm.wqx.jd(this.f20368sq, this.f20367rq, "vast_play_track", jSONObject);
            } else if ("firstQuartile".equals(str)) {
                com.bytedance.sdk.openadsdk.cm.wqx.jd(this.f20368sq, this.f20367rq, "track_first_quartile", (JSONObject) null);
            } else if (CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT.equals(str)) {
                com.bytedance.sdk.openadsdk.cm.wqx.jd(this.f20368sq, this.f20367rq, "track_midpoint", (JSONObject) null);
            } else if ("thirdQuartile".equals(str)) {
                com.bytedance.sdk.openadsdk.cm.wqx.jd(this.f20368sq, this.f20367rq, "track_third_quartile", (JSONObject) null);
            }
        } catch (Throwable unused) {
        }
    }

    private boolean jpo(long j10, List<wqx> list, com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo jpoVar, wqx.jd jdVar) {
        com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd jdVarWw;
        dt dtVar = this.f20368sq;
        String strJu = null;
        if (dtVar != null && (jdVarWw = dtVar.ww()) != null) {
            strJu = jdVarWw.ju();
        }
        return wqx.jpo(this.f20368sq, list, jpoVar, j10, strJu, jdVar, jd());
    }

    private boolean jpo(long j10, List<wqx> list, com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo jpoVar) {
        return jpo(j10, list, jpoVar, null);
    }

    public List<wqx> jpo(long j10, float f10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f20365ju.size(); i10++) {
            jd jdVar = this.f20365ju.get(i10);
            if (jdVar.jpo(f10)) {
                arrayList.add(jdVar);
            }
        }
        for (int i11 = 0; i11 < this.f119if.size(); i11++) {
            jpo jpoVar = this.f119if.get(i11);
            if (jpoVar.jpo(j10)) {
                arrayList.add(jpoVar);
            }
        }
        return arrayList;
    }

    public void jpo(List<wqx> list) {
        this.f20362jd.addAll(list);
    }

    public JSONObject jpo() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorTrackers", wqx.jpo(this.jpo));
        jSONObject.put("impressionTrackers", wqx.jpo(this.f20362jd));
        jSONObject.put("pauseTrackers", wqx.jpo(this.wqx));
        jSONObject.put("resumeTrackers", wqx.jpo(this.f20361cm));
        jSONObject.put("completeTrackers", wqx.jpo(this.my));
        jSONObject.put("closeTrackers", wqx.jpo(this.f20363jj));
        jSONObject.put("skipTrackers", wqx.jpo(this.f20366qk));
        jSONObject.put("clickTrackers", wqx.jpo(this.xyk));
        jSONObject.put("muteTrackers", wqx.jpo(this.zz));
        jSONObject.put("unMuteTrackers", wqx.jpo(this.f20370yd));
        jSONObject.put("fractionalTrackers", wqx());
        jSONObject.put("absoluteTrackers", cm());
        return jSONObject;
    }

    public void jpo(JSONObject jSONObject) {
        yd(wqx.jpo(jSONObject.optJSONArray("errorTrackers")));
        jpo(wqx.jpo(jSONObject.optJSONArray("impressionTrackers")));
        jd(wqx.jpo(jSONObject.optJSONArray("pauseTrackers"), true));
        wqx(wqx.jpo(jSONObject.optJSONArray("resumeTrackers"), true));
        cm(wqx.jpo(jSONObject.optJSONArray("completeTrackers")));
        my(wqx.jpo(jSONObject.optJSONArray("closeTrackers")));
        jj(wqx.jpo(jSONObject.optJSONArray("skipTrackers")));
        qk(wqx.jpo(jSONObject.optJSONArray("clickTrackers")));
        ju(wqx.jpo(jSONObject.optJSONArray("muteTrackers"), true));
        m459if(wqx.jpo(jSONObject.optJSONArray("unMuteTrackers"), true));
        xyk(wqx.jd(jSONObject.optJSONArray("fractionalTrackers")));
        zz(wqx.wqx(jSONObject.optJSONArray("absoluteTrackers")));
    }

    public void jpo(dt dtVar) {
        this.f20368sq = dtVar;
        this.f20367rq = dtVar.my();
        this.prr = dtVar.ig();
    }

    public void jpo(String str, long j10) {
        if (TextUtils.isEmpty(str) || j10 < 0) {
            return;
        }
        zz(Collections.singletonList(new jpo.C0116jpo(str, j10).jpo()));
    }

    public void jpo(String str, float f10) {
        if (TextUtils.isEmpty(str) || f10 < 0.0f) {
            return;
        }
        xyk(Collections.singletonList(new jd.jpo(str, f10).jpo()));
    }

    public void jpo(cm cmVar) {
        yd(cmVar.jpo);
        jpo(cmVar.f20362jd);
        jd(cmVar.wqx);
        wqx(cmVar.f20361cm);
        cm(cmVar.my);
        my(cmVar.f20363jj);
        jj(cmVar.f20366qk);
        qk(cmVar.xyk);
        ju(cmVar.zz);
        m459if(cmVar.f20370yd);
        xyk(cmVar.f20365ju);
        zz(cmVar.f119if);
    }
}
