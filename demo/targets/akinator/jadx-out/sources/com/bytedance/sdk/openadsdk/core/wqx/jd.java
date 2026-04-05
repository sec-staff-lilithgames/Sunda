package com.bytedance.sdk.openadsdk.core.wqx;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.duq;
import com.bytedance.sdk.openadsdk.core.model.Cif;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.hna;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.wqx.wqx;
import com.bytedance.sdk.openadsdk.core.zz;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.bytedance.sdk.openadsdk.utils.va;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends wqx {

    /* renamed from: ef, reason: collision with root package name */
    private static int f20982ef = Integer.MIN_VALUE;

    /* renamed from: au, reason: collision with root package name */
    protected com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx f20983au;

    /* renamed from: cm, reason: collision with root package name */
    protected Context f20984cm;
    protected Map<String, Object> hna;

    /* renamed from: if, reason: not valid java name */
    protected PAGNativeAd f144if;

    /* renamed from: jd, reason: collision with root package name */
    private WeakReference<Activity> f20985jd;

    /* renamed from: jj, reason: collision with root package name */
    protected final dt f20986jj;
    private String jpo;

    /* renamed from: jr, reason: collision with root package name */
    protected int f20987jr;

    /* renamed from: ju, reason: collision with root package name */
    protected jpo f20988ju;
    public hna my;
    protected com.bytedance.sdk.openadsdk.core.zz.jd opi;
    protected boolean oya;
    protected com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj prr;

    /* renamed from: qk, reason: collision with root package name */
    protected final String f20989qk;

    /* renamed from: sq, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.cm.jpo f20990sq;
    private boolean wqx;
    protected final int xyk;

    /* renamed from: yd, reason: collision with root package name */
    protected Cif f20991yd;
    protected WeakReference<View> zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        void jpo(View view, int i10);
    }

    public jd(Context context, dt dtVar, String str, int i10) {
        this.oya = false;
        this.f20987jr = 0;
        this.wqx = false;
        this.f20984cm = context;
        this.f20986jj = dtVar;
        this.f20989qk = str;
        this.xyk = i10;
    }

    public View cm() {
        WeakReference<Activity> weakReference = this.f20985jd;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.f20985jd.get().findViewById(R.id.content);
    }

    public void jd(int i10) {
        this.f21008hx = i10;
    }

    public boolean jpo(Cif cif, Map<String, Object> map) {
        return false;
    }

    public void my(boolean z10) {
        this.oya = z10;
    }

    public void wqx(int i10) {
        this.f21013se = i10;
    }

    public static boolean jd(View view) {
        return 520093705 == view.getId() || 520093707 == view.getId() || 520093703 == view.getId() || jpo(view.getContext()) == view.getId() || com.bytedance.sdk.openadsdk.utils.hna.rzi == view.getId() || com.bytedance.sdk.openadsdk.utils.hna.iqh == view.getId();
    }

    public void jpo(com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj jjVar) {
        this.prr = jjVar;
    }

    public String my() {
        return this.jpo;
    }

    public void cm(int i10) {
        this.f20987jr = i10;
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.zz.jd jdVar) {
        this.opi = jdVar;
    }

    public void jpo(PAGNativeAd pAGNativeAd) {
        this.f144if = pAGNativeAd;
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.cm.jpo jpoVar) {
        this.f20990sq = jpoVar;
    }

    public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar) {
        this.f20983au = wqxVar;
    }

    public void jpo(jpo jpoVar) {
        this.f20988ju = jpoVar;
    }

    public void jpo(Activity activity) {
        if (activity == null) {
            return;
        }
        this.f20985jd = new WeakReference<>(activity);
    }

    public jd(Context context, dt dtVar, String str, int i10, boolean z10) {
        this(context, dtVar, str, i10);
        this.wqx = z10;
    }

    public void jpo(View view) {
        if (view == null) {
            return;
        }
        this.zz = new WeakReference<>(view);
    }

    public void jpo(Map<String, Object> map) {
        Map<String, Object> map2 = this.hna;
        if (map2 != null) {
            map2.putAll(map);
            map.putAll(this.hna);
        }
        this.hna = map;
    }

    public void jpo(int i10) {
        this.pdm = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.content.Context] */
    @Override // com.bytedance.sdk.openadsdk.core.wqx.wqx
    public void jpo(View view, float f10, float f11, float f12, float f13, SparseArray<wqx.jpo> sparseArray, boolean z10) {
        int i10;
        boolean z11;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        com.bytedance.sdk.openadsdk.core.p000if.cm cmVarJpo;
        if (this.f20984cm == null) {
            this.f20984cm = sq.jpo();
        }
        if ((this.wqx || !jpo(view, 1, f10, f11, f12, f13, sparseArray, z10)) && this.f20984cm != null) {
            hna hnaVar = this.my;
            if (hnaVar != null) {
                int i11 = hnaVar.xyk;
                JSONObject jSONObject3 = hnaVar.zz;
                JSONObject jSONObject4 = hnaVar.f20650au;
                z11 = hnaVar.oya;
                i10 = i11;
                jSONObject = jSONObject3;
                jSONObject2 = jSONObject4;
            } else {
                i10 = -1;
                z11 = false;
                jSONObject = null;
                jSONObject2 = null;
            }
            long j10 = this.hmu;
            long j11 = this.f21010nq;
            WeakReference<View> weakReference = this.zz;
            Cif cifJpo = jpo(f10, f11, f12, f13, sparseArray, j10, j11, weakReference == null ? null : weakReference.get(), my(), va.xyk(this.f20984cm), va.yd(this.f20984cm), va.zz(this.f20984cm), i10, jSONObject, jSONObject2);
            this.f20991yd = cifJpo;
            if (jpo(cifJpo, this.hna)) {
                return;
            }
            if (this.f20983au != null) {
                if (this.hna == null) {
                    this.hna = new HashMap();
                }
                this.hna.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(this.f20983au.jj()));
            }
            dt dtVar = this.f20986jj;
            if (!this.wqx && !z11) {
                jpo jpoVar = this.f20988ju;
                if (jpoVar != null) {
                    jpoVar.jpo(view, -1);
                }
                if (jpo(view, z10)) {
                    boolean zJd = rv.jd(dtVar);
                    String strJpo = zJd ? this.f20989qk : tic.jpo(this.xyk);
                    if (view != null) {
                        try {
                            if (((Boolean) view.getTag(520093762)).booleanValue()) {
                                duq.jpo(true);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    Activity activityJpo = view != null ? com.bytedance.sdk.component.utils.jd.jpo(view) : null;
                    boolean zJpo = duq.jpo(activityJpo == null ? this.f20984cm : activityJpo, dtVar, this.xyk, this.f144if, this.f20990sq, strJpo, this.prr, zJd, 0);
                    duq.jpo(false);
                    if (zJpo || dtVar == null || dtVar.cnl() == null || dtVar.cnl().wqx() != 2) {
                        if (dtVar != null && !zJpo && TextUtils.isEmpty(dtVar.iwg()) && com.bytedance.sdk.openadsdk.cm.jd.jpo(this.f20989qk)) {
                            com.bytedance.sdk.openadsdk.jr.jpo.jpo.qk.jpo(this.f20984cm, this.f20989qk).wqx(dtVar);
                        }
                        com.bytedance.sdk.openadsdk.cm.wqx.jpo("click", dtVar, this.f20991yd, this.f20989qk, zJpo, this.hna, z10 ? 1 : 2);
                        return;
                    }
                    return;
                }
                return;
            }
            com.bytedance.sdk.openadsdk.cm.wqx.jpo("click", dtVar, this.f20991yd, this.f20989qk, true, this.hna, z10 ? 1 : 2);
            com.bytedance.sdk.openadsdk.core.model.cm cmVarKc = dtVar.kc();
            if (cmVarKc == null || dtVar.ig() || (cmVarJpo = cmVarKc.jpo()) == null) {
                return;
            }
            com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f20983au;
            cmVarJpo.qk(wqxVar != null ? wqxVar.jj() : 0L);
        }
    }

    public boolean jpo(View view, boolean z10) {
        return jpo(view, this.f20986jj, z10);
    }

    public static boolean jpo(View view, dt dtVar, boolean z10) {
        if (view != null && dtVar != null) {
            try {
                int i10 = com.bytedance.sdk.component.adexpress.dynamic.jpo.nmd;
                String strValueOf = String.valueOf(view.getTag(i10));
                if (view.getTag(i10) != null && !TextUtils.isEmpty(strValueOf)) {
                    if ("click".equals(strValueOf)) {
                        return z10;
                    }
                    return true;
                }
            } catch (Exception unused) {
            }
            if (jd(view)) {
                return dtVar.rxq() != 1 || z10;
            }
            if (dtVar.hks() == 1 && !z10) {
                return false;
            }
        }
        return true;
    }

    public Cif jpo(float f10, float f11, float f12, float f13, SparseArray<wqx.jpo> sparseArray, long j10, long j11, View view, String str, float f14, int i10, float f15, int i11, JSONObject jSONObject, JSONObject jSONObject2) {
        return new Cif.jpo().jj(f10).my(f11).cm(f12).wqx(f13).jd(j10).jpo(j11).jpo(va.jpo(view)).jd(va.wqx(view)).cm(this.f21013se).my(this.f21008hx).jj(this.pdm).jpo(sparseArray).jd(zz.jd().jpo() ? 1 : 2).jpo(str).jpo(f14).wqx(i10).jd(f15).jpo(i11).jpo(jSONObject).jd(jSONObject2).jpo();
    }

    public boolean jpo(View view, int i10, float f10, float f11, float f12, float f13, SparseArray<wqx.jpo> sparseArray, boolean z10) {
        if (this.opi == null) {
            return false;
        }
        this.opi.jpo(view, i10, new hna.jpo().cm(f10).wqx(f11).jd(f12).jpo(f13).jd(this.hmu).jpo(this.f21010nq).jpo(sparseArray).jpo(z10).jpo());
        return true;
    }

    private static int jpo(Context context) {
        if (f20982ef == Integer.MIN_VALUE) {
            f20982ef = com.bytedance.sdk.component.utils.dt.my(context, "btn_native_creative");
        }
        return f20982ef;
    }

    public void jpo(String str) {
        this.jpo = str;
    }
}
