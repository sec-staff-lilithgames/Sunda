package com.bytedance.sdk.openadsdk.core.ju.jj;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.bytedance.adsdk.ugeno.cm.jj;
import com.bytedance.adsdk.ugeno.core.Cif;
import com.bytedance.adsdk.ugeno.core.hna;
import com.bytedance.adsdk.ugeno.core.prr;
import com.bytedance.sdk.component.adexpress.jd.oya;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.hna;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.core.settings.au;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.wqx.wqx;
import com.bytedance.sdk.openadsdk.core.zz.nmd;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.va;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm implements hna, prr, com.bytedance.sdk.component.adexpress.dynamic.cm, com.bytedance.sdk.component.adexpress.jd.cm<View> {

    /* renamed from: hx, reason: collision with root package name */
    private static long f20496hx = 0;
    private static float pdm = 0.0f;

    /* renamed from: rq, reason: collision with root package name */
    protected static int f20497rq = 24;

    /* renamed from: rv, reason: collision with root package name */
    private static float f20498rv;
    private static float sz;

    /* renamed from: uu, reason: collision with root package name */
    private static float f20499uu;

    /* renamed from: au, reason: collision with root package name */
    protected com.bytedance.adsdk.ugeno.jd.wqx f20500au;

    /* renamed from: cm, reason: collision with root package name */
    protected JSONObject f20501cm;

    /* renamed from: ef, reason: collision with root package name */
    private nmd f20504ef;
    protected JSONObject hmu;
    protected float hna;

    /* renamed from: if, reason: not valid java name */
    protected com.bytedance.adsdk.ugeno.jd.wqx f123if;

    /* renamed from: jd, reason: collision with root package name */
    protected Context f20505jd;

    /* renamed from: jj, reason: collision with root package name */
    protected jpo f20506jj;
    protected Cif jpo;

    /* renamed from: jr, reason: collision with root package name */
    protected long f20507jr;
    private my kln;
    protected dt my;

    /* renamed from: nq, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.jd.qk f20509nq;
    protected long opi;
    protected float oya;
    protected float prr;

    /* renamed from: qk, reason: collision with root package name */
    protected FrameLayout f20510qk;

    /* renamed from: se, reason: collision with root package name */
    private boolean f20511se;

    /* renamed from: sq, reason: collision with root package name */
    protected float f20512sq;

    /* renamed from: tu, reason: collision with root package name */
    protected String f20513tu;
    protected com.bytedance.adsdk.ugeno.jd.wqx<View> wqx;
    protected com.bytedance.sdk.component.adexpress.jd.xyk xyk;

    /* renamed from: yd, reason: collision with root package name */
    protected oya f20514yd;
    protected com.bytedance.sdk.openadsdk.core.zz.prr zz;
    protected boolean nmd = true;

    /* renamed from: dt, reason: collision with root package name */
    public SparseArray<wqx.jpo> f20503dt = new SparseArray<>();
    private String nzb = "";
    private final com.bytedance.sdk.component.xyk.xyk duq = new com.bytedance.sdk.component.xyk.xyk("ugen_render_template") { // from class: com.bytedance.sdk.openadsdk.core.ju.jj.cm.1
        @Override // java.lang.Runnable
        public void run() {
            cm cmVar = cm.this;
            cmVar.f20501cm = cmVar.jpo();
            if (cm.this.f20504ef != null) {
                cm cmVar2 = cm.this;
                cmVar2.nzb = cmVar2.f20504ef.getUgenTemplateErrorReason();
            } else {
                cm.this.nzb = "expressView is null";
            }
            com.bytedance.sdk.openadsdk.core.oya.wqx().post(cm.this.f20502dm);
        }
    };

    /* renamed from: dm, reason: collision with root package name */
    private final Runnable f20502dm = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ju.jj.cm.2
        @Override // java.lang.Runnable
        public void run() throws JSONException {
            if (cm.this.f20509nq != null) {
                cm cmVar = cm.this;
                cmVar.jd(cmVar.f20509nq);
            }
        }
    };
    private boolean tic = false;

    /* renamed from: ju, reason: collision with root package name */
    protected AtomicBoolean f20508ju = new AtomicBoolean(false);

    static {
        if (sq.jpo() != null) {
            f20497rq = sq.jd();
        }
    }

    public cm(Context context, dt dtVar, boolean z10, jpo jpoVar, ViewGroup viewGroup) {
        this.f20505jd = context;
        this.f20511se = z10;
        this.jpo = new Cif(context);
        this.my = dtVar;
        this.f20506jj = jpoVar;
        this.f20510qk = new FrameLayout(context);
        if (viewGroup instanceof nmd) {
            this.f20504ef = (nmd) viewGroup;
        }
        this.f20513tu = jpoVar.cm();
        JSONObject jSONObjectJd = jd();
        this.hmu = jSONObjectJd;
        this.kln = new my(this.f20505jd, this.my, this.f20513tu, jSONObjectJd);
    }

    private void zz() throws JSONException {
        com.bytedance.adsdk.ugeno.jd.wqx<T> wqxVarCm;
        if (this.wqx == null) {
            return;
        }
        if (this.my.aaf() && (wqxVarCm = this.wqx.cm("tvskip")) != 0) {
            wqxVarCm.wqx(8);
        }
        com.bytedance.adsdk.ugeno.jd.wqx<T> wqxVarCm2 = this.wqx.cm("skip");
        if (wqxVarCm2 != 0 && (wqxVarCm2 instanceof com.bytedance.adsdk.ugeno.zz.cm.wqx)) {
            if (!au.jrx().au(String.valueOf(this.my.jl())) || this.my.jkt() == 5 || this.my.jkt() == 6 || this.my.jp() == 3) {
                ((com.bytedance.adsdk.ugeno.zz.cm.wqx) wqxVarCm2).m398if("local://tt_close_btn");
                wqxVarCm2.jd();
            }
        }
    }

    public int cm() throws JSONException {
        this.jpo.jpo((prr) this);
        this.jpo.jpo((hna) this);
        com.bytedance.adsdk.ugeno.jd.wqx<View> wqxVarJpo = this.jpo.jpo(this.f20501cm);
        this.wqx = wqxVarJpo;
        my myVar = this.kln;
        if (myVar != null && wqxVarJpo != null) {
            myVar.jpo(wqxVarJpo);
        }
        this.f20506jj.kln().jd();
        this.f20506jj.kln().wqx();
        this.jpo.jd(this.hmu);
        return 0;
    }

    public com.bytedance.adsdk.ugeno.jd.wqx jj() {
        com.bytedance.adsdk.ugeno.jd.wqx<View> wqxVar = this.wqx;
        if (wqxVar == null) {
            return null;
        }
        return wqxVar.my("PlayableComponent");
    }

    public void jpo(long j10, long j11) {
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.cm
    public View my() {
        return this.f20510qk;
    }

    public com.bytedance.adsdk.ugeno.jd.wqx qk() {
        return null;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.cm
    public void setSoundMute(boolean z10) throws JSONException {
        com.bytedance.adsdk.ugeno.jd.wqx<T> wqxVarCm;
        com.bytedance.adsdk.ugeno.jd.wqx<View> wqxVar = this.wqx;
        if (wqxVar == null || (wqxVarCm = wqxVar.cm(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) == 0) {
            return;
        }
        if (z10) {
            ((com.bytedance.adsdk.ugeno.zz.cm.wqx) wqxVarCm).m398if("local://tt_reward_full_mute");
        } else {
            ((com.bytedance.adsdk.ugeno.zz.cm.wqx) wqxVarCm).m398if("local://tt_reward_full_unmute");
        }
        wqxVarCm.jd();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.cm
    public void setTime(CharSequence charSequence, int i10, int i11, boolean z10) {
        if (this.wqx == null) {
            return;
        }
        boolean z11 = i10 == 1;
        jpo(charSequence, z11, i11, z10);
        jd(charSequence, z11, i11, z10);
    }

    public com.bytedance.adsdk.ugeno.jd.wqx xyk() {
        com.bytedance.adsdk.ugeno.jd.wqx<View> wqxVar = this.wqx;
        if (wqxVar == null) {
            return null;
        }
        return wqxVar.cm("video");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(com.bytedance.sdk.component.adexpress.jd.qk qkVar) throws JSONException {
        this.f20506jj.kln().jpo();
        if (this.f20501cm == null) {
            qkVar.jpo(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "ugen template is null real reason is " + this.nzb);
            return;
        }
        if (this.hmu == null) {
            qkVar.jpo(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "ugen data is null");
            return;
        }
        int iCm = cm();
        if (this.jpo.jpo()) {
            List<String> listJd = this.jpo.jd();
            if (listJd == null) {
                qkVar.jpo(138, "unknow widget");
                return;
            }
            qkVar.jpo(138, "unknow widget;" + listJd.toString());
            return;
        }
        if (iCm != 0) {
            qkVar.jpo(iCm, "ugen render fail");
            return;
        }
        if (this.wqx == null) {
            qkVar.jpo(138, "ugen render error");
            return;
        }
        jd jdVar = new jd();
        this.f20514yd = jdVar;
        jdVar.jpo(true);
        this.f20514yd.jpo(wqx());
        setSoundMute(this.f20511se);
        zz();
        com.bytedance.adsdk.ugeno.jd.wqx wqxVarXyk = xyk();
        this.f123if = wqxVarXyk;
        if (wqxVarXyk != null && (wqxVarXyk instanceof com.bytedance.sdk.openadsdk.core.ju.jd.cm.jd)) {
            ((jd) this.f20514yd).jpo((FrameLayout) ((com.bytedance.sdk.openadsdk.core.ju.jd.cm.jd) wqxVarXyk).cm());
        }
        my myVar = this.kln;
        if (myVar != null) {
            myVar.jpo();
        }
        com.bytedance.adsdk.ugeno.jd.wqx wqxVarJj = jj();
        this.f20500au = wqxVarJj;
        if (wqxVarJj != null && (wqxVarJj instanceof com.bytedance.adsdk.ugeno.zz.jd.jd)) {
            ((jd) this.f20514yd).jd((FrameLayout) wqxVarJj.ju());
        }
        if (rv.wqx(this.my)) {
            com.bytedance.adsdk.ugeno.jd.wqx wqxVarQk = qk();
            if (wqxVarQk instanceof com.bytedance.sdk.openadsdk.core.ju.jd.jd.jd) {
                ((jd) this.f20514yd).wqx(((com.bytedance.sdk.openadsdk.core.ju.jd.jd.jd) wqxVarQk).cm());
            }
        }
        int iDuq = this.wqx.duq();
        int iDm = this.wqx.dm();
        this.f20510qk.removeAllViews();
        this.f20510qk.addView(this.wqx.ju(), new FrameLayout.LayoutParams(iDuq, iDm));
        float fRv = this.f20506jj.rv();
        float fUu = this.f20506jj.uu();
        float fJd = va.jd(this.f20505jd, fRv);
        float fJd2 = va.jd(this.f20505jd, fUu);
        if (wqx() != 7) {
            this.f20510qk.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        } else if (fUu <= 0.0f) {
            this.f20510qk.setLayoutParams(new FrameLayout.LayoutParams((int) fJd, -2));
        } else {
            this.f20510qk.setLayoutParams(new FrameLayout.LayoutParams((int) fJd, (int) fJd2));
        }
        if (fUu <= 0.0f || fRv <= 0.0f) {
            this.f20510qk.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int iWqx = va.wqx(this.f20505jd, this.f20510qk.getMeasuredWidth());
            int iWqx2 = va.wqx(this.f20505jd, this.f20510qk.getMeasuredHeight());
            this.f20514yd.jpo(iWqx);
            this.f20514yd.jd(iWqx2);
        } else {
            this.f20514yd.jpo(fRv);
            this.f20514yd.jd(fUu);
        }
        if (this.f20508ju.get()) {
            qkVar.jpo(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "ugen render timeout");
        } else {
            this.jpo.jpo(this.wqx, "renderDidFinish", new Object[0]);
            qkVar.jpo(this.f20510qk, this.f20514yd);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.prr
    public void jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, String str, jj.jpo jpoVar) {
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.cm
    public int wqx() {
        return this.my.tl();
    }

    public void jpo(dt dtVar, boolean z10, jpo jpoVar, ViewGroup viewGroup) {
        this.my = dtVar;
        this.f20506jj = jpoVar;
        this.f20513tu = jpoVar.cm();
        this.hmu = jd();
        if (viewGroup instanceof nmd) {
            this.f20504ef = (nmd) viewGroup;
        }
        this.f20511se = z10;
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.cm
    public void jpo(com.bytedance.sdk.component.adexpress.jd.qk qkVar) {
        this.f20509nq = qkVar;
        duq.jd(this.duq);
    }

    public JSONObject jpo() {
        return this.f20506jj.wqx();
    }

    public void jpo(boolean z10) {
        this.f20508ju.set(z10);
    }

    public void jpo(com.bytedance.sdk.component.adexpress.jd.xyk xykVar) {
        this.xyk = xykVar;
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.zz.prr prrVar) {
        this.zz = prrVar;
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.widget.my myVar) {
        my myVar2 = this.kln;
        if (myVar2 != null) {
            myVar2.jpo(myVar);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.cm
    public void onvideoComplate() {
    }

    @Override // com.bytedance.adsdk.ugeno.core.prr
    public void jpo(com.bytedance.adsdk.ugeno.core.au auVar, prr.jd jdVar, prr.jpo jpoVar) {
        if (auVar == null) {
            return;
        }
        if (auVar.jd() == 1 || auVar.jd() == 4) {
            jpo(auVar);
        }
        if (auVar.jd() == 10) {
            jpo(auVar.wqx());
        }
        if (jdVar == null || auVar.cm() == null) {
            return;
        }
        jdVar.jpo(auVar.cm());
    }

    private void jpo(JSONObject jSONObject) {
        com.bytedance.adsdk.ugeno.jd.wqx<T> wqxVarCm;
        if (this.wqx == null || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString("nodeId");
        if (TextUtils.isEmpty(strOptString2) || (wqxVarCm = this.wqx.cm(strOptString2)) == 0) {
            return;
        }
        if (TextUtils.equals(strOptString, "onShow")) {
            wqxVarCm.wqx(0);
        } else if (TextUtils.equals(strOptString, "onDismiss")) {
            wqxVarCm.wqx(8);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.cm
    public void setTimeUpdate(int i10) {
    }

    private void jpo(com.bytedance.adsdk.ugeno.core.au auVar) {
        int i10;
        JSONObject jSONObjectCm;
        boolean zJpo;
        int i11;
        String str;
        my myVar;
        my myVar2;
        my myVar3;
        if (this.xyk == null) {
            return;
        }
        String strOptString = auVar.wqx().optString("type");
        if ("swiperLeft".equals(strOptString) && (myVar3 = this.kln) != null) {
            myVar3.jd();
            return;
        }
        if ("swiperRight".equals(strOptString) && (myVar2 = this.kln) != null) {
            myVar2.wqx();
            return;
        }
        i10 = 2;
        if (!"swiperClick".equals(strOptString) || (myVar = this.kln) == null) {
            jSONObjectCm = null;
            zJpo = false;
            i11 = 0;
        } else {
            zJpo = myVar.jpo(auVar);
            jSONObjectCm = this.kln.cm();
            i11 = 2;
        }
        strOptString.getClass();
        switch (strOptString) {
            case "privacy":
                i10 = 7;
                break;
            case "feedback":
                i10 = 3;
                break;
            case "mute":
                i10 = 5;
                break;
            case "skip":
                i10 = 6;
                break;
            case "video":
                i10 = 4;
                break;
            case "creative":
                break;
            default:
                i10 = i11;
                break;
        }
        com.bytedance.adsdk.ugeno.jd.wqx wqxVarJpo = auVar.jpo();
        hna.jpo jpoVarJpo = new hna.jpo().cm(this.oya).wqx(this.prr).jd(this.hna).jpo(this.f20512sq).jd(this.opi).jpo(this.f20507jr).jpo(this.f20503dt).jpo(auVar.jd() != 1 || this.nmd);
        if (wqxVarJpo == null) {
            str = "";
        } else {
            str = wqxVarJpo.nzb() + "_" + wqxVarJpo.ef();
        }
        this.xyk.jpo(auVar.jpo().ju(), i10, jpoVarJpo.jpo(str).jd(zJpo).jd(jSONObjectCm).jpo());
    }

    public JSONObject jd() {
        return this.f20506jj.sz();
    }

    private void jd(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        com.bytedance.adsdk.ugeno.jd.wqx<T> wqxVarCm;
        View viewJu;
        com.bytedance.adsdk.ugeno.jd.wqx<View> wqxVar = this.wqx;
        if (wqxVar == null || (wqxVarCm = wqxVar.cm("skip")) == 0 || (viewJu = wqxVarCm.ju()) == null) {
            return;
        }
        int i11 = 0;
        if (!z10 && !z11) {
            i11 = 8;
        }
        viewJu.setVisibility(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    @Override // com.bytedance.adsdk.ugeno.core.hna
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void jpo(com.bytedance.adsdk.ugeno.jd.wqx r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ju.jj.cm.jpo(com.bytedance.adsdk.ugeno.jd.wqx, android.view.MotionEvent):void");
    }

    private void jpo(CharSequence charSequence, boolean z10, int i10, boolean z11) throws NumberFormatException {
        com.bytedance.adsdk.ugeno.jd.wqx<T> wqxVarCm;
        int i11;
        com.bytedance.adsdk.ugeno.jd.wqx<View> wqxVar = this.wqx;
        if (wqxVar == null || (wqxVarCm = wqxVar.cm("countdown")) == 0) {
            return;
        }
        View viewJu = wqxVarCm.ju();
        if (viewJu instanceof TextView) {
            try {
                i11 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                com.bytedance.sdk.component.utils.nmd.wqx("UGenRender", "parse duration exception", charSequence);
                i11 = 0;
            }
            if (!z11 && i11 > 0 && !this.tic) {
                viewJu.setVisibility(0);
                if (!z10 && this.f20506jj.jpo() && com.bytedance.sdk.component.adexpress.cm.jj.jd(this.f20506jj.cm())) {
                    ((TextView) viewJu).setText(String.format(com.bytedance.sdk.component.utils.dt.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), "tt_reward_full_skip"), Integer.valueOf(i10)));
                    return;
                }
                if (!"open_ad".equals(this.f20506jj.cm()) && this.f20506jj.jpo()) {
                    this.tic = true;
                    viewJu.setVisibility(8);
                    return;
                } else {
                    ((TextView) viewJu).setText(((Object) charSequence) + ApsMetricsDataMap.APSMETRICS_FIELD_SDK);
                    return;
                }
            }
            viewJu.setVisibility(8);
        }
    }
}
