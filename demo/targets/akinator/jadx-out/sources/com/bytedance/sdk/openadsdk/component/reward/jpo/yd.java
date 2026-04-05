package com.bytedance.sdk.openadsdk.component.reward.jpo;

import android.R;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.component.reward.jpo.cm;
import com.bytedance.sdk.openadsdk.component.reward.view.Cif;
import com.bytedance.sdk.openadsdk.core.model.Cif;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.wqx.jpo;
import com.bytedance.sdk.openadsdk.core.wqx.wqx;
import com.bytedance.sdk.openadsdk.hmu.jd.my;
import com.bytedance.sdk.openadsdk.utils.va;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class yd {

    /* renamed from: jd, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.wqx.jd f19979jd;
    private final jpo jpo;
    private final com.bytedance.sdk.openadsdk.core.wqx.my wqx;

    public yd(jpo jpoVar) {
        this.jpo = jpoVar;
        this.wqx = jpo(jpoVar, jpoVar.f19914jd);
        this.f19979jd = new com.bytedance.sdk.openadsdk.core.wqx.jd(jpoVar.vrc, jpoVar.f19914jd, jpoVar.my, jpoVar.f19905cm ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.yd.1
            @Override // com.bytedance.sdk.openadsdk.core.wqx.jd, com.bytedance.sdk.openadsdk.core.wqx.wqx
            public void jpo(View view, float f10, float f11, float f12, float f13, SparseArray<wqx.jpo> sparseArray, boolean z10) {
                try {
                    yd.this.jpo(view, f10, f11, f12, f13, sparseArray, this.pdm, this.f21013se, this.f21008hx);
                } catch (Exception e10) {
                    nmd.wqx("TTAD.RFReportManager", "onClickReport error :" + e10.getMessage());
                }
                com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(yd.this.jpo.f19914jd, 9);
                yd.this.jpo.hmu.vrc();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject xyk() {
        com.bytedance.sdk.openadsdk.activity.xyk xykVar;
        jpo jpoVar = this.jpo;
        if (!jpoVar.f19927tl || (xykVar = jpoVar.ux) == null) {
            return null;
        }
        try {
            return com.bytedance.sdk.openadsdk.cm.wqx.jpo(xykVar.f19414ju + 1);
        } catch (Throwable unused) {
            return null;
        }
    }

    private JSONObject yd() {
        try {
            long jTu = this.jpo.hmu.tu();
            int iDt = this.jpo.hmu.dt();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, jTu);
                jSONObject.put("percent", iDt);
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private boolean zz() {
        dt dtVar = this.jpo.f19914jd;
        return dtVar != null && dtVar.uhu() == 1;
    }

    public com.bytedance.sdk.openadsdk.core.wqx.jd cm() {
        return this.f19979jd;
    }

    public void jj() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.jpo.f19934yd.get()) {
                jSONObject.put("endcard_content", this.jpo.f19909ef.wqx() ? 1 : this.jpo.nzb.cm() ? 3 : this.jpo.f19909ef.cm() ? 2 : 0);
            } else {
                jSONObject.put("endCardNotShow", 1);
            }
        } catch (JSONException unused) {
        }
        jpo jpoVar = this.jpo;
        com.bytedance.sdk.openadsdk.cm.wqx.jd(jpoVar.f19914jd, jpoVar.my, "click_close", jSONObject);
    }

    public com.bytedance.sdk.openadsdk.core.wqx.my my() {
        return this.wqx;
    }

    public void qk() {
        jpo jpoVar = this.jpo;
        com.bytedance.sdk.openadsdk.cm.wqx.jd(jpoVar.f19914jd, jpoVar.my, (JSONObject) null, xyk());
    }

    public com.bytedance.sdk.openadsdk.core.wqx.my wqx() {
        this.wqx.jpo(this.jpo.vrc.findViewById(R.id.content));
        if (this.jpo.f19919nq.wqx() != null) {
            this.wqx.jpo(this.jpo.f19919nq.wqx());
        }
        this.jpo.f19924se.jpo(this.wqx);
        this.wqx.jpo(new jpo.InterfaceC0135jpo() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.yd.3
            @Override // com.bytedance.sdk.openadsdk.core.wqx.jpo.InterfaceC0135jpo
            public long getVideoProgress() {
                return yd.this.jpo.hmu.m442if();
            }
        });
        Cif cif = this.jpo.tic;
        com.bytedance.sdk.openadsdk.core.wqx.my myVar = this.wqx;
        cif.jpo(myVar, myVar, this.f19979jd);
        this.jpo.f19906dm.jpo(this.wqx);
        return this.wqx;
    }

    public void jd() throws JSONException {
        boolean z10;
        com.bytedance.sdk.openadsdk.component.reward.view.yd ydVar;
        if (this.jpo.f19904au.get()) {
            return;
        }
        com.bytedance.sdk.openadsdk.activity.xyk xykVar = this.jpo.ux;
        if (xykVar != null && xykVar.xk().tu()) {
            jpo jpoVar = this.jpo;
            if (!jpoVar.f19933ya && !jpoVar.ux.cgn()) {
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (!this.jpo.f19914jd.jj() || (ydVar = this.jpo.f19911hx) == null) {
                z10 = false;
            } else {
                jSONObject.put("dynamic_show_type", ydVar.ju());
                this.jpo.f19911hx.jpo(jSONObject);
                z10 = true;
            }
            dt dtVar = this.jpo.f19914jd;
            JSONObject jSONObjectXyk = xyk();
            View viewFindViewById = this.jpo.vrc.findViewById(R.id.content);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("width", viewFindViewById.getWidth());
                jSONObject2.put("height", viewFindViewById.getHeight());
                jSONObject2.put("alpha", viewFindViewById.getAlpha());
            } catch (Throwable unused) {
            }
            jSONObject.put("root_view", jSONObject2.toString());
            if (this.jpo.f19904au.compareAndSet(false, true)) {
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, this.jpo.my, jSONObject, jSONObjectXyk);
                this.jpo.roc.ju();
                my.jpo jpoVar2 = new my.jpo(z10 ? this.jpo.f19911hx.ju() : -1);
                jpo(jpoVar2);
                com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(this.jpo.vrc.findViewById(R.id.content), dtVar, jpoVar2);
                com.bytedance.sdk.openadsdk.hmu.jpo.wqx.jpo(dtVar);
            }
        } catch (JSONException e10) {
            nmd.jpo("TTAD.RFReportManager", "reportShowWhenBindVideoAd error", e10);
        }
    }

    public void jpo() {
        com.bytedance.sdk.openadsdk.core.p000if.cm cmVarJpo;
        if (this.jpo.f19904au.get()) {
            return;
        }
        com.bytedance.sdk.openadsdk.activity.xyk xykVar = this.jpo.ux;
        if (xykVar != null && xykVar.xk().tu()) {
            jpo jpoVar = this.jpo;
            if (!jpoVar.f19933ya && !jpoVar.ux.cgn()) {
                return;
            }
        }
        JSONObject jSONObject = new JSONObject();
        dt dtVar = this.jpo.f19914jd;
        JSONObject jSONObjectXyk = xyk();
        if (this.jpo.f19904au.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, this.jpo.my, jSONObject, jSONObjectXyk);
            this.jpo.roc.ju();
            my.jpo jpoVar2 = new my.jpo(-1);
            jpo(jpoVar2);
            com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(this.jpo.vrc.findViewById(R.id.content), dtVar, jpoVar2);
            com.bytedance.sdk.openadsdk.hmu.jpo.wqx.jpo(dtVar);
            com.bytedance.sdk.openadsdk.core.model.cm cmVarKc = dtVar.kc();
            if (cmVarKc == null || (cmVarJpo = cmVarKc.jpo()) == null) {
                return;
            }
            cmVarJpo.jpo(0L);
        }
    }

    public void wqx(boolean z10) {
        jpo jpoVar = this.jpo;
        if (jpoVar != null && z10 && jpoVar.f19914jd.mc() && !this.jpo.f19914jd.dt()) {
            this.jpo.f19914jd.jj(true);
            jpo jpoVar2 = this.jpo;
            dt dtVar = jpoVar2.f19914jd;
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, jpoVar2.my, dtVar.sj());
        }
    }

    public void jpo(final Map<String, Object> map) {
        if (this.jpo.f19904au.get()) {
            return;
        }
        com.bytedance.sdk.openadsdk.activity.xyk xykVar = this.jpo.ux;
        if (xykVar != null && xykVar.xk().tu()) {
            jpo jpoVar = this.jpo;
            if (!jpoVar.f19933ya && !jpoVar.ux.cgn()) {
                return;
            }
        }
        this.jpo.f19904au.set(true);
        final View viewFindViewById = this.jpo.vrc.findViewById(R.id.content);
        if (viewFindViewById == null) {
            viewFindViewById = this.jpo.vrc.getWindow().getDecorView();
        }
        viewFindViewById.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.yd.2
            @Override // java.lang.Runnable
            public void run() {
                Map map2;
                dt dtVar = yd.this.jpo.f19914jd;
                JSONObject jSONObject = null;
                try {
                    jSONObject = map != null ? new JSONObject(map) : new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("width", viewFindViewById.getWidth());
                    jSONObject2.put("height", viewFindViewById.getHeight());
                    jSONObject2.put("alpha", viewFindViewById.getAlpha());
                    jSONObject.put("root_view", jSONObject2.toString());
                } catch (Throwable th2) {
                    nmd.jpo("TTAD.RFReportManager", "run: ", th2);
                }
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, yd.this.jpo.my, jSONObject, yd.this.xyk());
                yd.this.jpo.roc.ju();
                my.jpo jpoVar2 = new my.jpo(yd.this.jpo.f19911hx != null && (map2 = map) != null && map2.containsKey("dynamic_show_type") ? yd.this.jpo.f19911hx.ju() : -1);
                yd.this.jpo(jpoVar2);
                com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(yd.this.jpo.vrc.findViewById(R.id.content), dtVar, jpoVar2);
                com.bytedance.sdk.openadsdk.hmu.jpo.wqx.jpo(dtVar);
            }
        });
    }

    public void jd(boolean z10) {
        jpo jpoVar = this.jpo;
        if (jpoVar == null) {
            return;
        }
        if (!z10 && jpoVar.f19904au.get() && this.jpo.cql > 0) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.jpo.cql);
            jpo jpoVar2 = this.jpo;
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(strValueOf, jpoVar2.f19914jd, jpoVar2.my, jpoVar2.hmu.my());
            this.jpo.cql = 0L;
        } else {
            this.jpo.cql = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(this.jpo.f19914jd, z10 ? 4 : 8);
        com.bytedance.sdk.openadsdk.hmu.jpo.wqx.jpo(this.jpo.f19914jd, z10 ? 4 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(my.jpo jpoVar) {
        com.bytedance.sdk.openadsdk.activity.xyk xykVar;
        jpo jpoVar2 = this.jpo;
        if (!jpoVar2.f19927tl || (xykVar = jpoVar2.ux) == null) {
            return;
        }
        jpoVar.f21162jd = xykVar.f19414ju;
    }

    public void jpo(boolean z10) {
        dt dtVar = this.jpo.f19914jd;
        if (dtVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.prr.jpo.cm cmVarMy = com.bytedance.sdk.openadsdk.prr.jpo.cm.jd().jpo(z10 ? 7 : 8).wqx(String.valueOf(dtVar.jl())).my(this.jpo.f19914jd.hbg());
        cmVarMy.jd(this.jpo.f19909ef.opi()).jj(this.jpo.f19909ef.jr());
        cmVarMy.qk(this.jpo.f19914jd.fxd()).cm(this.jpo.f19914jd.fc());
        com.bytedance.sdk.openadsdk.prr.wqx.jpo().jd(cmVarMy);
    }

    private void jd(View view, float f10, float f11, float f12, float f13, SparseArray<wqx.jpo> sparseArray, int i10, int i11, int i12) {
        if (!zz() || this.jpo.f19914jd == null || view == null) {
            return;
        }
        int id2 = view.getId();
        if (id2 == com.bytedance.sdk.openadsdk.utils.hna.my || id2 == com.bytedance.sdk.openadsdk.utils.hna.f21515cm || id2 == com.bytedance.sdk.openadsdk.utils.hna.wqx || id2 == com.bytedance.sdk.openadsdk.utils.hna.f21530jd || id2 == com.bytedance.sdk.openadsdk.utils.hna.f164if || id2 == com.bytedance.sdk.openadsdk.utils.hna.umr || id2 == com.bytedance.sdk.openadsdk.utils.hna.hna || id2 == 520093705 || id2 == com.bytedance.sdk.openadsdk.utils.hna.f21533ju || id2 == 520093707 || id2 == com.bytedance.sdk.openadsdk.utils.hna.f21544qk) {
            int iYd = va.yd(com.bytedance.sdk.openadsdk.core.sq.jpo());
            com.bytedance.sdk.openadsdk.core.model.Cif cifJpo = new Cif.jpo().jj(f10).my(f11).cm(f12).wqx(f13).jd(System.currentTimeMillis()).jpo(0L).jpo(va.jpo(this.jpo.tic.ju())).jd(va.wqx(this.jpo.tic.ju())).cm(i11).my(i12).jj(i10).jpo(sparseArray).jd(com.bytedance.sdk.openadsdk.core.zz.jd().jpo() ? 1 : 2).wqx(iYd).jpo(va.xyk(com.bytedance.sdk.openadsdk.core.sq.jpo())).jd(va.zz(com.bytedance.sdk.openadsdk.core.sq.jpo())).jpo();
            HashMap map = new HashMap();
            map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(this.jpo.hmu.m442if()));
            jpo jpoVar = this.jpo;
            com.bytedance.sdk.openadsdk.cm.wqx.jpo("click_other", jpoVar.f19914jd, cifJpo, jpoVar.my, true, (Map<String, Object>) map, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(View view, float f10, float f11, float f12, float f13, SparseArray<wqx.jpo> sparseArray, int i10, int i11, int i12) {
        if (view == null) {
            return;
        }
        if (view.getId() == com.bytedance.sdk.openadsdk.utils.hna.my) {
            jpo("click_play_star_level", (JSONObject) null);
        } else if (view.getId() != com.bytedance.sdk.openadsdk.utils.hna.f21515cm && view.getId() != com.bytedance.sdk.openadsdk.utils.hna.f21544qk) {
            if (view.getId() == com.bytedance.sdk.openadsdk.utils.hna.wqx) {
                jpo("click_play_source", (JSONObject) null);
            } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.hna.f21530jd) {
                jpo("click_play_logo", (JSONObject) null);
            } else if (view.getId() != com.bytedance.sdk.openadsdk.utils.hna.f164if && view.getId() != com.bytedance.sdk.openadsdk.utils.hna.umr && view.getId() != com.bytedance.sdk.openadsdk.utils.hna.hna) {
                if (view.getId() == 520093705) {
                    jpo("click_start_play", yd());
                } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.hna.f21533ju) {
                    jpo("click_video", yd());
                } else if (view.getId() == 520093707 || view.getId() == com.bytedance.sdk.openadsdk.utils.hna.xyk) {
                    jpo("fallback_endcard_click", yd());
                }
            } else {
                jpo("click_start_play_bar", yd());
            }
        } else {
            jpo("click_play_star_nums", (JSONObject) null);
        }
        jd(view, f10, f11, f12, f13, sparseArray, i10, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(String str, JSONObject jSONObject) {
        jpo jpoVar = this.jpo;
        dt dtVar = jpoVar.f19914jd;
        String str2 = jpoVar.my;
        if (!jpoVar.f19905cm) {
            jSONObject = null;
        }
        com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, str2, str, jSONObject);
    }

    public com.bytedance.sdk.openadsdk.core.wqx.my jpo(final jpo jpoVar, final dt dtVar) {
        return new com.bytedance.sdk.openadsdk.core.wqx.my(jpoVar.vrc, dtVar, jpoVar.my, jpoVar.f19905cm ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.yd.4
            @Override // com.bytedance.sdk.openadsdk.core.wqx.my
            public void jpo(View view, float f10, float f11, float f12, float f13, SparseArray<wqx.jpo> sparseArray, int i10, int i11, int i12, boolean z10) {
                if (dtVar.ig() && view != null) {
                    Object tag = view.getTag(570425345);
                    if (tag instanceof String) {
                        jpo((String) tag);
                    }
                }
                HashMap map = new HashMap();
                map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(jpoVar.hmu.m442if()));
                if (jpoVar.f19934yd.get()) {
                    map.put("click_scence", 2);
                } else {
                    map.put("click_scence", 1);
                }
                com.bytedance.sdk.openadsdk.activity.xyk xykVar = jpoVar.ux;
                if (xykVar != null) {
                    xykVar.jpo(map, f10, f11);
                }
                jpo(map);
                jpoVar.roc.dm();
                jpoVar.f19919nq.jpo(view, f10, f11, f12, f13, sparseArray, i10, i11, i12, new cm.jpo() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.yd.4.1
                    @Override // com.bytedance.sdk.openadsdk.component.reward.jpo.cm.jpo
                    public void jpo(String str, JSONObject jSONObject) {
                        yd.this.jpo(str, jSONObject);
                    }

                    @Override // com.bytedance.sdk.openadsdk.component.reward.jpo.cm.jpo
                    public void jpo(View view2, float f14, float f15, float f16, float f17, SparseArray<wqx.jpo> sparseArray2, int i13, int i14, int i15) {
                        yd.this.jpo(view2, f14, f15, f16, f17, sparseArray2, i13, i14, i15);
                    }
                });
                com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(dtVar, 9);
                jpoVar.hmu.vrc();
            }
        };
    }
}
