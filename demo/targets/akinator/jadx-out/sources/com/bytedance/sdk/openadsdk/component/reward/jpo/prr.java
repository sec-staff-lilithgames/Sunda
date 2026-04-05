package com.bytedance.sdk.openadsdk.component.reward.jpo;

import android.app.Activity;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import b0.e2;
import com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.cm.my.jd.prr;
import com.bytedance.sdk.openadsdk.core.au.cm.jpo;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.utils.tic;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class prr {

    /* renamed from: au, reason: collision with root package name */
    private boolean f19947au;

    /* renamed from: cm, reason: collision with root package name */
    final boolean f19948cm;

    /* renamed from: dt, reason: collision with root package name */
    private boolean f19949dt;

    /* renamed from: if, reason: not valid java name */
    private long f108if;

    /* renamed from: jj, reason: collision with root package name */
    com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx f19952jj;

    /* renamed from: jr, reason: collision with root package name */
    private String f19953jr;

    /* renamed from: ju, reason: collision with root package name */
    private long f19954ju;
    private long opi;
    private boolean oya;
    private jpo.InterfaceC0111jpo pdm;

    /* renamed from: qk, reason: collision with root package name */
    private final Activity f19956qk;

    /* renamed from: rq, reason: collision with root package name */
    private boolean f19957rq;

    /* renamed from: rv, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.cm.qk f19958rv;

    /* renamed from: sq, reason: collision with root package name */
    private long f19960sq;

    /* renamed from: tu, reason: collision with root package name */
    private final jpo f19961tu;
    boolean wqx;
    private final dt xyk;

    /* renamed from: yd, reason: collision with root package name */
    private final String f19962yd;
    private FrameLayout zz;
    protected boolean jpo = false;

    /* renamed from: jd, reason: collision with root package name */
    boolean f19951jd = false;
    protected boolean my = false;
    private long prr = -1;
    private int hna = -1;
    private boolean hmu = false;

    /* renamed from: nq, reason: collision with root package name */
    private int f19955nq = 0;

    /* renamed from: se, reason: collision with root package name */
    private float f19959se = 1.0f;

    /* renamed from: hx, reason: collision with root package name */
    private boolean f19950hx = false;
    private HashSet<String> nmd = new HashSet<>();

    public prr(jpo jpoVar) {
        this.f19961tu = jpoVar;
        this.f19956qk = jpoVar.vrc;
        this.xyk = jpoVar.f19914jd;
        this.f19948cm = jpoVar.f19905cm;
        this.f19962yd = jpoVar.my;
    }

    private void ic() {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        if (wqxVar == null || wqxVar.ju() == null) {
            return;
        }
        this.f19954ju = this.f19952jj.jj();
        if (this.f19952jj.ju().wqx() || !this.f19952jj.ju().jd()) {
            this.f19952jj.jd();
            this.f19952jj.cm();
            this.jpo = true;
        }
    }

    public long au() {
        return this.f108if;
    }

    public boolean cm() {
        int i10;
        return this.f19950hx ? this.hmu && this.f19955nq == 1 : this.hmu && ((i10 = this.f19955nq) == 2 || i10 == 1);
    }

    public void dm() {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        if (wqxVar instanceof com.bytedance.sdk.openadsdk.core.au.cm.jpo) {
            ((com.bytedance.sdk.openadsdk.core.au.cm.jpo) wqxVar).duq();
        }
    }

    public int dt() {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        if (wqxVar != null) {
            return wqxVar.yd();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double duq() {
        /*
            r5 = this;
            com.bytedance.sdk.openadsdk.core.model.dt r0 = r5.xyk
            com.bytedance.sdk.openadsdk.core.model.rq r0 = r0.nmd()
            com.bytedance.sdk.openadsdk.core.model.dt r1 = r5.xyk
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.nmd.cm(r1)
            if (r1 == 0) goto L16
            if (r0 == 0) goto L16
            long r0 = r0.jd()
        L14:
            double r0 = (double) r0
            goto L3b
        L16:
            com.bytedance.sdk.openadsdk.core.model.dt r1 = r5.xyk
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.nmd.qk(r1)
            if (r1 == 0) goto L25
            if (r0 == 0) goto L25
            long r0 = r0.cm()
            goto L14
        L25:
            com.bytedance.sdk.openadsdk.core.model.dt r0 = r5.xyk
            com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd r0 = r0.ww()
            if (r0 == 0) goto L39
            double r1 = r0.jj()
            int r0 = r0.tu()
            double r3 = (double) r0
            double r0 = r1 * r3
            goto L3b
        L39:
            r0 = 0
        L3b:
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r2 = r5.f19961tu
            com.bytedance.sdk.openadsdk.component.reward.ju r2 = r2.f19932wu
            if (r2 == 0) goto L45
            long r3 = (long) r0
            r2.jpo(r3)
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.jpo.prr.duq():double");
    }

    public void ef() {
        try {
            if (jj()) {
                this.my = true;
                rq();
            }
        } catch (Exception e10) {
            nmd.wqx("TTAD.RFVideoPlayerMag", "onPause throw Exception :" + e10.getMessage());
        }
    }

    public int hmu() {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        if (wqxVar != null) {
            return wqxVar.xyk();
        }
        return 0;
    }

    public long hna() {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        if (wqxVar != null) {
            return wqxVar.qk();
        }
        return 0L;
    }

    public boolean hx() {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        if (wqxVar != null) {
            if (wqxVar.ju() != null) {
                com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVarJu = this.f19952jj.ju();
                if (jpoVarJu.qk() || jpoVarJu.xyk()) {
                    com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar2 = this.f19952jj;
                    if (wqxVar2 instanceof com.bytedance.sdk.openadsdk.core.au.cm.jpo) {
                        ((com.bytedance.sdk.openadsdk.core.au.cm.jpo) wqxVar2).dm();
                    }
                    return true;
                }
            } else if (ju()) {
                jpo(false);
                com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar3 = this.f19952jj;
                if (wqxVar3 instanceof com.bytedance.sdk.openadsdk.core.au.cm.jpo) {
                    ((com.bytedance.sdk.openadsdk.core.au.cm.jpo) wqxVar3).dm();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: if, reason: not valid java name */
    public long m442if() {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        return wqxVar != null ? wqxVar.jj() : this.f19954ju;
    }

    public boolean jj() {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        return (wqxVar == null || wqxVar.ju() == null || !this.f19952jj.ju().jj()) ? false : true;
    }

    public void jr() {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        if (wqxVar != null) {
            wqxVar.my();
        }
    }

    public boolean ju() {
        return this.jpo;
    }

    public void kln() {
        this.hmu = false;
        opi();
    }

    public com.bytedance.sdk.openadsdk.cm.qk my() {
        return this.f19958rv;
    }

    public void nmd() {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        if (wqxVar != null) {
            wqxVar.wqx();
        }
    }

    public long nq() {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        if (wqxVar == null) {
            return 0L;
        }
        return this.f19952jj.qk() + wqxVar.zz();
    }

    public boolean nzb() {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        if (wqxVar == null || wqxVar.ju() == null) {
            return false;
        }
        return this.f19952jj.ju().jpo();
    }

    public void opi() {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        if (wqxVar == null) {
            return;
        }
        wqxVar.cm();
        this.f19952jj = null;
    }

    public long oya() {
        return this.f19954ju;
    }

    public boolean pdm() {
        return this.f19952jj != null;
    }

    public void pe() {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        if (wqxVar == null || wqxVar.ju() == null) {
            return;
        }
        this.f19954ju = this.f19952jj.jj();
        jr();
        jpo(true);
        this.f19947au = true;
    }

    public void prr() {
        try {
            if (jj()) {
                this.f19952jj.jd();
            }
        } catch (Throwable th2) {
            nmd.wqx(e2.o(th2, new StringBuilder("RewardFullVideoPlayerManager onPause throw Exception :")), new Object[0]);
        }
    }

    public boolean qk() {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        return wqxVar != null && wqxVar.au();
    }

    public void roc() {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        if (wqxVar != null) {
            wqxVar.jpo();
        }
    }

    public void rq() {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        if (wqxVar != null) {
            wqxVar.jd();
        }
    }

    public boolean rv() {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        return wqxVar != null && wqxVar.ju() == null;
    }

    public long se() {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        if (wqxVar != null) {
            return wqxVar.zz();
        }
        return 0L;
    }

    public com.bykv.vk.openvk.jpo.jpo.jpo.jpo sq() {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        if (wqxVar != null) {
            return wqxVar.ju();
        }
        return null;
    }

    public boolean sz() {
        return this.wqx;
    }

    public View tic() {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        if (wqxVar instanceof com.bytedance.sdk.openadsdk.core.au.cm.jpo) {
            return (View) ((com.bytedance.sdk.openadsdk.core.au.cm.jpo) wqxVar).tic();
        }
        return null;
    }

    public long tu() {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        if (wqxVar != null) {
            return wqxVar.zz();
        }
        return 0L;
    }

    public void uu() {
        int i10 = this.f19955nq;
        if (i10 == 1 || i10 == 2) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("switch", 0);
                jpo(jSONObject);
            } catch (Throwable th2) {
                nmd.jpo("TTAD.RFVideoPlayerMag", "onStopPlaySpeed: ", th2);
            }
        }
    }

    public void va() {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        if (wqxVar instanceof com.bytedance.sdk.openadsdk.core.au.cm.jpo) {
            ((com.bytedance.sdk.openadsdk.core.au.cm.jpo) wqxVar).va();
        }
    }

    public void vrc() {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        if (wqxVar instanceof com.bytedance.sdk.openadsdk.core.au.cm.jpo) {
            ((com.bytedance.sdk.openadsdk.core.au.cm.jpo) wqxVar).vrc();
        }
    }

    public boolean xk() {
        return this.f19947au;
    }

    public com.bykv.vk.openvk.jpo.jpo.jpo.jd.jpo xyk() {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        if (wqxVar != null) {
            return wqxVar instanceof com.bytedance.sdk.openadsdk.component.reward.wqx ? ((com.bytedance.sdk.openadsdk.component.reward.wqx) wqxVar).sq() : wqxVar.mo374if();
        }
        return null;
    }

    public boolean yd() {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        return wqxVar != null && wqxVar.oya();
    }

    public boolean zz() {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        return (wqxVar == null || wqxVar.ju() == null || !this.f19952jj.ju().qk()) ? false : true;
    }

    public long jd() {
        return this.f19960sq;
    }

    public long jpo() {
        return this.prr;
    }

    public boolean wqx() {
        return this.hmu;
    }

    private void jd(long j10, long j11) throws JSONException {
        int iAbs = (int) Math.abs(this.hna - j10);
        int i10 = this.hna;
        if (i10 < 0 || iAbs > 500 || i10 > j11 || iAbs >= 500 || this.nmd.contains(this.f19953jr)) {
            return;
        }
        if (this.hna > j10) {
            com.bytedance.sdk.openadsdk.core.oya.wqx().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.prr.1
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    prr.this.ef();
                    prr.this.f19961tu.f19911hx.jpo(prr.this.hna, prr.this.f19953jr);
                }
            }, iAbs);
        } else {
            ef();
            this.f19961tu.f19911hx.jpo(this.hna, this.f19953jr);
        }
        this.nmd.add(this.f19953jr);
    }

    public void jpo(long j10) {
        this.prr = j10;
    }

    public void wqx(boolean z10) {
        this.wqx = z10;
    }

    public void cm(boolean z10) {
        this.f19949dt = z10;
        if (this.f19952jj instanceof com.bytedance.sdk.openadsdk.core.au.cm.jpo) {
            if (z10) {
                ((com.bytedance.sdk.openadsdk.core.au.cm.jpo) this.f19952jj).jd(this.xyk.ww().tu());
            } else {
                this.xyk.ww().yd(1);
                ((com.bytedance.sdk.openadsdk.core.au.cm.jpo) this.f19952jj).jd(1);
            }
        }
    }

    public void jpo(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.cm.qk qkVar) {
        if (this.f19957rq) {
            return;
        }
        this.f19957rq = true;
        this.zz = frameLayout;
        if (this.xyk.fmg() != null) {
            this.f19955nq = this.xyk.fmg().jd();
            this.f19959se = this.xyk.fmg().jpo();
        }
        this.f19958rv = qkVar;
        if (dt.my(this.xyk)) {
            this.f19950hx = true;
            this.f19952jj = new com.bytedance.sdk.openadsdk.core.au.cm.jpo(this.f19956qk, this.zz, this.xyk, qkVar);
            cm(this.f19949dt);
            jpo.InterfaceC0111jpo interfaceC0111jpo = this.pdm;
            if (interfaceC0111jpo != null) {
                ((com.bytedance.sdk.openadsdk.core.au.cm.jpo) this.f19952jj).jpo(interfaceC0111jpo);
                return;
            }
            return;
        }
        this.f19950hx = false;
        com.bytedance.sdk.openadsdk.component.reward.wqx wqxVar = new com.bytedance.sdk.openadsdk.component.reward.wqx(this.xyk, qkVar);
        this.f19952jj = wqxVar;
        jpo.InterfaceC0111jpo interfaceC0111jpo2 = this.pdm;
        if (interfaceC0111jpo2 != null) {
            wqxVar.jpo(interfaceC0111jpo2);
        }
    }

    public void jd(long j10) {
        this.f19954ju = j10;
    }

    public void jd(boolean z10) {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        if (wqxVar != null) {
            wqxVar.jd();
            this.oya = z10;
        }
    }

    public void jd(com.bytedance.sdk.openadsdk.core.au.cm.jd jdVar) {
        if (!hx() || jdVar == null) {
            return;
        }
        jdVar.jpo(oya(), true);
    }

    public void jpo(com.bytedance.sdk.openadsdk.cm.qk qkVar) {
        this.f19958rv = qkVar;
    }

    public void jpo(long j10, long j11) {
        this.f108if = j10;
        jd(j10, j11);
    }

    public void jpo(int i10, String str) {
        this.hna = i10;
        this.f19953jr = str;
    }

    public void jpo(boolean z10) {
        this.jpo = z10;
    }

    public void jpo(int i10, int i11) {
        if (this.f19952jj != null) {
            prr.jpo jpoVar = new prr.jpo();
            jpoVar.wqx(hna());
            jpoVar.cm(nq());
            jpoVar.jd(m442if());
            jpoVar.jpo(i10);
            jpoVar.jd(i11);
            com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.cm(this.f19952jj.mo374if(), jpoVar);
        }
    }

    public void jpo(wqx.jpo jpoVar) {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        if (wqxVar != null) {
            wqxVar.jpo(jpoVar);
        }
    }

    public void jpo(boolean z10, String str) {
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
        if (wqxVar != null) {
            wqxVar.jpo(z10, str);
        }
    }

    public void jpo(String str, boolean z10) {
        if (this.f19952jj != null) {
            long jM442if = m442if();
            if (this.xyk.ic()) {
                jM442if = this.f19961tu.wqx();
            }
            long j10 = jM442if;
            JSONObject jSONObjectJpo = tic.jpo(this.xyk, this.f19952jj.qk(), this.f19952jj.ju());
            try {
                jSONObjectJpo.put("auto_click", z10);
                if (!z10) {
                    jpo jpoVar = this.f19961tu;
                    com.bytedance.sdk.openadsdk.cm.wqx.jpo(jSONObjectJpo, jpoVar.f19905cm ? jpoVar.f19914jd.hf() : jpoVar.f19914jd.rc(), (int) j10);
                }
            } catch (Exception unused) {
            }
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(this.xyk, this.f19962yd, str, j10, dt(), jSONObjectJpo, this.f19958rv);
            nq();
            dt();
        }
        va();
    }

    public boolean jpo(long j10, boolean z10, Map<String, Object> map, com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar) {
        boolean zJpo;
        boolean z11 = false;
        if (!pdm()) {
            return false;
        }
        if (com.bytedance.sdk.openadsdk.core.model.nmd.cm(this.f19961tu.f19914jd) || com.bytedance.sdk.openadsdk.core.model.nmd.qk(this.f19961tu.f19914jd)) {
            return true;
        }
        if (!z10 || !rv()) {
            jpo(jdVar);
        }
        try {
            zJpo = jpo(j10, this.f19961tu.huv);
        } catch (Exception e10) {
            e = e10;
        }
        try {
            this.f19947au = false;
        } catch (Exception e11) {
            e = e11;
            z11 = zJpo;
            Log.e("TTAD.RFVideoPlayerMag", "playVideo: ", e);
            zJpo = z11;
            if (zJpo) {
                this.f19961tu.f19923rv.jpo(map);
            }
            return zJpo;
        }
        if (zJpo && !z10) {
            this.f19961tu.f19923rv.jpo(map);
        }
        return zJpo;
    }

    public void jpo(com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar) {
        if (this.f19961tu.f19934yd.get()) {
            return;
        }
        jpo jpoVar = this.f19961tu;
        if (!jpoVar.f19933ya || rv.wqx(jpoVar.f19914jd)) {
            return;
        }
        if ((!dt.my(this.f19961tu.f19914jd) && com.bytedance.sdk.openadsdk.core.sq.cm().mo479if(String.valueOf(this.f19961tu.f19915jj)) == 1 && this.f19961tu.f19911hx.cm()) || com.bytedance.sdk.openadsdk.core.model.nmd.cm(this.f19961tu.f19914jd) || com.bytedance.sdk.openadsdk.core.model.nmd.qk(this.f19961tu.f19914jd) || this.my || !jdVar.jj()) {
            return;
        }
        this.f19961tu.xk.removeMessages(300);
        Message messageObtain = Message.obtain();
        messageObtain.what = 300;
        this.f19961tu.xk.sendMessageDelayed(messageObtain, 5000L);
    }

    public boolean jpo(JSONObject jSONObject) {
        int i10;
        if (this.f19952jj != null && jSONObject != null && ((i10 = this.f19955nq) == 1 || i10 == 2)) {
            int iOptInt = jSONObject.optInt("switch", 0);
            float fOptDouble = (float) jSONObject.optDouble("speed", 0.0d);
            this.f19959se = fOptDouble;
            if (fOptDouble <= 0.0f && this.f19961tu.f19914jd.fmg() != null) {
                this.f19959se = this.f19961tu.f19914jd.fmg().jpo();
            }
            if (iOptInt == 0) {
                this.f19959se = 1.0f;
                if (this.hmu) {
                    long jCurrentTimeMillis = (System.currentTimeMillis() - this.opi) + this.f19960sq;
                    this.f19960sq = jCurrentTimeMillis;
                    com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.f19952jj;
                    if (wqxVar != null) {
                        wqxVar.jpo(jCurrentTimeMillis);
                    }
                    com.bytedance.sdk.openadsdk.core.au.cm.jd jdVar = this.f19961tu.roc;
                    if (jdVar != null) {
                        jdVar.cm(false);
                    }
                }
            } else if (iOptInt == 1 && !this.hmu) {
                this.opi = System.currentTimeMillis();
                com.bytedance.sdk.openadsdk.core.au.cm.jd jdVar2 = this.f19961tu.roc;
                if (jdVar2 != null) {
                    jdVar2.cm(true);
                }
            }
            this.hmu = iOptInt == 1;
            if (this.f19955nq == 1) {
                return true;
            }
            com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar2 = this.f19952jj;
            if (wqxVar2 == null) {
                return false;
            }
            return wqxVar2.jpo(this.f19959se);
        }
        this.hmu = false;
        return false;
    }

    private boolean jpo(long j10, boolean z10) {
        if (this.f19952jj == null || this.xyk.ww() == null) {
            return false;
        }
        String strJpo = CacheDirFactory.getICacheDir(this.xyk.ew()).jpo();
        File file = new File(strJpo, this.xyk.ww().oya());
        if (file.exists() && file.length() > 0) {
            this.f19951jd = true;
        }
        com.bytedance.sdk.openadsdk.core.au.jpo.jd jdVarJpo = dt.jpo(strJpo, this.xyk);
        jdVarJpo.jd(this.xyk.fc());
        jdVarJpo.jd(this.zz.getWidth());
        jdVarJpo.wqx(this.zz.getHeight());
        jdVarJpo.wqx(this.xyk.fxd());
        jdVarJpo.jpo(j10);
        jdVarJpo.jpo(z10);
        return this.f19952jj.jpo(jdVarJpo);
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.au.cm.jd jdVar) {
        try {
            this.my = false;
            if (ju()) {
                ic();
                jd(jdVar);
            } else if (zz()) {
                nmd();
            }
        } catch (Throwable th2) {
            nmd.wqx("TTAD.RFVideoPlayerMag", "onContinue throw Exception :" + th2.getMessage());
        }
    }

    public void jpo(boolean z10, com.bytedance.sdk.openadsdk.core.au.cm.jd jdVar, boolean z11) {
        if (this.oya || !(!z11 || z10 || this.my)) {
            if (zz()) {
                nmd();
                Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: continue play");
            } else {
                ic();
                jd(jdVar);
                Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: recreate video player & exec play");
            }
            this.oya = false;
        }
    }

    public void jpo(jpo.InterfaceC0111jpo interfaceC0111jpo) {
        this.pdm = interfaceC0111jpo;
    }
}
