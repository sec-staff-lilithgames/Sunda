package com.bytedance.sdk.openadsdk.core.au.jd;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b0.e2;
import com.bytedance.sdk.component.utils.hx;
import com.bytedance.sdk.component.xyk.xyk;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.au.jd.jj;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.settings.au;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.widget.jr;
import com.bytedance.sdk.openadsdk.core.widget.nmd;
import com.bytedance.sdk.openadsdk.core.wqx.jpo;
import com.bytedance.sdk.openadsdk.utils.hna;
import com.bytedance.sdk.openadsdk.utils.ju;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.bytedance.sdk.openadsdk.utils.va;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my implements com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd<dt>, com.bykv.vk.openvk.jpo.jpo.jpo.jj.jpo, hx.jpo, jr.jpo, nmd.jd, jpo.InterfaceC0135jpo {

    /* renamed from: au, reason: collision with root package name */
    com.bytedance.sdk.openadsdk.core.widget.jpo f20171au;

    /* renamed from: cm, reason: collision with root package name */
    com.bykv.vk.openvk.jpo.jpo.jpo.jj.jd f20172cm;

    /* renamed from: dm, reason: collision with root package name */
    private long f20173dm;

    /* renamed from: dt, reason: collision with root package name */
    int f20174dt;
    private jj.jpo duq;

    /* renamed from: ef, reason: collision with root package name */
    com.bytedance.sdk.openadsdk.core.wqx.jpo f20175ef;
    int hmu;
    TextView hna;

    /* renamed from: hx, reason: collision with root package name */
    nmd f20176hx;

    /* renamed from: if, reason: not valid java name */
    View f114if;

    /* renamed from: jd, reason: collision with root package name */
    protected final int f20177jd;

    /* renamed from: jj, reason: collision with root package name */
    View f20178jj;
    protected final int jpo;

    /* renamed from: jr, reason: collision with root package name */
    int f20179jr;

    /* renamed from: ju, reason: collision with root package name */
    ImageView f20180ju;
    com.bytedance.sdk.openadsdk.core.wqx.jpo kln;
    ImageView my;
    int nmd;

    /* renamed from: nq, reason: collision with root package name */
    dt f20181nq;
    boolean nzb;
    int opi;
    TextView oya;
    jpo pdm;
    TextView prr;

    /* renamed from: qk, reason: collision with root package name */
    View f20182qk;

    /* renamed from: rq, reason: collision with root package name */
    boolean f20183rq;

    /* renamed from: rv, reason: collision with root package name */
    boolean f20184rv;

    /* renamed from: se, reason: collision with root package name */
    Context f20185se;

    /* renamed from: sq, reason: collision with root package name */
    int f20186sq;
    com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx sz;
    private final String tic;

    /* renamed from: tu, reason: collision with root package name */
    boolean f20187tu;

    /* renamed from: uu, reason: collision with root package name */
    com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj f20188uu;
    ViewGroup wqx;
    ImageView xyk;

    /* renamed from: yd, reason: collision with root package name */
    View f20189yd;
    View zz;

    public my(Context context, ViewGroup viewGroup, boolean z10, int i10, dt dtVar, com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar, boolean z11) {
        this.jpo = 228;
        this.f20177jd = 160;
        this.f20183rq = true;
        this.f20184rv = true;
        this.nzb = true;
        this.tic = Build.MODEL;
        if (this instanceof cm) {
            return;
        }
        this.f20185se = sq.jpo().getApplicationContext();
        cm(z11);
        this.wqx = viewGroup;
        this.f20183rq = z10;
        this.hmu = i10;
        this.sz = wqxVar;
        this.f20181nq = dtVar;
        cm(8);
        jpo(context, this.wqx);
        cm();
        m453if();
    }

    private boolean nq() {
        return dt.my(this.f20181nq) && (!com.bytedance.sdk.openadsdk.core.ju.cm.jpo(this.f20181nq.tl()) ? this.f20181nq.vzb() == null : this.f20181nq.jrx() == null) && this.f20181nq.aix() == 1;
    }

    public com.bykv.vk.openvk.jpo.jpo.jpo.jj.jd au() {
        return this.f20172cm;
    }

    public void cm() {
        this.f20172cm.jpo(this);
        this.my.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.my.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (my.this.hna()) {
                    TextView textView = my.this.hna;
                    if (textView == null || textView.getVisibility() != 0) {
                        my myVar = my.this;
                        myVar.pdm.jpo(myVar, view);
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.jr.jpo
    public boolean dt() {
        nmd nmdVar = this.f20176hx;
        return nmdVar != null && nmdVar.jpo();
    }

    @Override // com.bytedance.sdk.openadsdk.core.wqx.jpo.InterfaceC0135jpo
    public long getVideoProgress() {
        if (this.f20173dm <= 0) {
            dt dtVar = this.f20181nq;
            if (dtVar != null && dtVar.ww() != null) {
                this.f20173dm = (long) (this.f20181nq.ww().jj() * 1000.0d);
            }
            com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar = this.sz;
            if (wqxVar != null) {
                this.f20173dm = wqxVar.zz();
            }
        }
        return this.f20173dm;
    }

    public boolean hmu() {
        return (this.hmu & 4) != 4 || this.f20183rq;
    }

    public boolean hna() {
        return this.pdm != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* renamed from: if, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m453if() {
        /*
            r9 = this;
            boolean r0 = r9.f20184rv
            if (r0 == 0) goto L7
            java.lang.String r0 = "embeded_ad"
            goto L9
        L7:
            java.lang.String r0 = "embeded_ad_landingpage"
        L9:
            com.bytedance.sdk.openadsdk.core.model.dt r1 = r9.f20181nq
            boolean r1 = r1.jw()
            r2 = 1
            if (r1 == 0) goto L18
            java.lang.String r0 = "rewarded_video"
            r1 = 7
        L15:
            r7 = r0
            r8 = r1
            goto L32
        L18:
            com.bytedance.sdk.openadsdk.core.model.dt r1 = r9.f20181nq
            boolean r1 = r1.zhp()
            if (r1 == 0) goto L24
            java.lang.String r0 = "fullscreen_interstitial_ad"
            r1 = 5
            goto L15
        L24:
            com.bytedance.sdk.openadsdk.core.model.dt r1 = r9.f20181nq
            boolean r1 = r1.zc()
            if (r1 == 0) goto L30
            java.lang.String r0 = "banner_ad"
            r1 = 2
            goto L15
        L30:
            r7 = r0
            r8 = r2
        L32:
            com.bytedance.sdk.openadsdk.core.model.dt r0 = r9.f20181nq
            int r0 = r0.pzk()
            r1 = 4
            if (r0 != r1) goto L43
            android.content.Context r0 = r9.f20185se
            com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj r0 = com.bytedance.sdk.openadsdk.jr.jpo.jpo.qk.jpo(r0, r7)
            r9.f20188uu = r0
        L43:
            com.bytedance.sdk.openadsdk.core.wqx.jpo r0 = new com.bytedance.sdk.openadsdk.core.wqx.jpo
            android.content.Context r1 = r9.f20185se
            com.bytedance.sdk.openadsdk.core.model.dt r3 = r9.f20181nq
            r0.<init>(r1, r3, r7, r8)
            r9.kln = r0
            r0.jpo(r9)
            com.bytedance.sdk.openadsdk.core.wqx.jpo r0 = r9.kln
            r0.jd(r2)
            boolean r0 = r9.f20184rv
            if (r0 == 0) goto L60
            com.bytedance.sdk.openadsdk.core.wqx.jpo r0 = r9.kln
            r0.jpo(r2)
            goto L6b
        L60:
            com.bytedance.sdk.openadsdk.core.wqx.jpo r0 = r9.kln
            r1 = 0
            r0.jpo(r1)
            com.bytedance.sdk.openadsdk.core.wqx.jpo r0 = r9.kln
            r0.wqx(r2)
        L6b:
            com.bytedance.sdk.openadsdk.core.wqx.jpo r0 = r9.kln
            com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx r1 = r9.sz
            r0.jpo(r1)
            com.bytedance.sdk.openadsdk.core.wqx.jpo r0 = r9.kln
            r0.my(r2)
            com.bytedance.sdk.openadsdk.core.wqx.jpo r0 = r9.kln
            com.bytedance.sdk.openadsdk.core.au.jd.my$1 r1 = new com.bytedance.sdk.openadsdk.core.au.jd.my$1
            r1.<init>()
            r0.jpo(r1)
            com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj r0 = r9.f20188uu
            if (r0 == 0) goto L8c
            com.bytedance.sdk.openadsdk.core.wqx.jpo r1 = r9.kln
            if (r1 == 0) goto L8c
            r1.jpo(r0)
        L8c:
            boolean r0 = r9.nq()
            if (r0 == 0) goto Lcd
            com.bytedance.sdk.openadsdk.core.au.jd.my$2 r3 = new com.bytedance.sdk.openadsdk.core.au.jd.my$2
            android.content.Context r5 = r9.f20185se
            com.bytedance.sdk.openadsdk.core.model.dt r6 = r9.f20181nq
            r4 = r9
            r3.<init>(r5, r6, r7, r8)
            r4.f20175ef = r3
            com.bytedance.sdk.openadsdk.core.au.jd.my$3 r0 = new com.bytedance.sdk.openadsdk.core.au.jd.my$3
            r0.<init>()
            r3.jpo(r0)
            com.bytedance.sdk.openadsdk.core.wqx.jpo r0 = r4.f20175ef
            r0.jd(r2)
            com.bytedance.sdk.openadsdk.core.wqx.jpo r0 = r4.f20175ef
            boolean r1 = r4.f20184rv
            r0.jpo(r1)
            com.bytedance.sdk.openadsdk.core.wqx.jpo r0 = r4.f20175ef
            com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx r1 = r4.sz
            r0.jpo(r1)
            com.bytedance.sdk.openadsdk.core.wqx.jpo r0 = r4.f20175ef
            r0.my(r2)
            com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj r0 = r4.f20188uu
            if (r0 == 0) goto Lc7
            com.bytedance.sdk.openadsdk.core.wqx.jpo r1 = r4.f20175ef
            r1.jpo(r0)
        Lc7:
            com.bytedance.sdk.openadsdk.core.wqx.jpo r0 = r4.f20175ef
            r0.jpo(r9)
            return
        Lcd:
            r4 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.au.jd.my.m453if():void");
    }

    public void jd(ViewGroup viewGroup) {
    }

    public void jj() {
    }

    public void jpo(int i10) {
    }

    public void jr() {
        try {
            va.jpo(this.f20189yd, 8);
            va.jpo((View) this.f20180ju, 8);
            va.jpo(this.f114if, 8);
            va.jpo((View) this.f20171au, 8);
            va.jpo((View) this.oya, 8);
            va.jpo((View) this.prr, 8);
            va.jpo((View) this.hna, 8);
        } catch (Exception unused) {
        }
    }

    public void ju() {
        jpo(true, false);
    }

    public void my() {
    }

    public void nmd() {
        ImageView imageView = this.f20180ju;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        com.bytedance.sdk.openadsdk.core.widget.jpo jpoVar = this.f20171au;
        if (jpoVar != null) {
            jpoVar.setImageBitmap(null);
        }
    }

    public void opi() {
        va.jpo((View) this.wqx, 0);
        com.bykv.vk.openvk.jpo.jpo.jpo.jj.jd jdVar = this.f20172cm;
        if (jdVar != null) {
            va.jpo(jdVar.getView(), 0);
        }
    }

    public void oya() {
        if (this.pdm == null || this.f20176hx != null) {
            return;
        }
        System.currentTimeMillis();
        nmd nmdVar = new nmd();
        this.f20176hx = nmdVar;
        nmdVar.jpo(this.f20185se, this.wqx);
        this.f20176hx.jpo(this.pdm, this);
        System.currentTimeMillis();
    }

    public void prr() {
        nmd nmdVar = this.f20176hx;
        if (nmdVar != null) {
            nmdVar.jpo(false);
        }
    }

    public void qk() {
        dt dtVar;
        va.jj(this.f20178jj);
        va.jj(this.f20182qk);
        if (this.xyk != null && (dtVar = this.f20181nq) != null && dtVar.ww() != null && this.f20181nq.ww().yd() != null) {
            va.jj(this.xyk);
            com.bytedance.sdk.openadsdk.opi.jd.jd().jpo(this.f20181nq.ww().yd(), this.f20181nq.ww().wqx(), this.f20181nq.ww().jd(), this.xyk, this.f20181nq);
        }
        if (this.my.getVisibility() == 0) {
            va.jpo((View) this.my, 8);
        }
    }

    public boolean rq() {
        return this.f20183rq;
    }

    public void sq() {
        va.jj(this.f20178jj);
        va.jj(this.f20182qk);
        if (this.my.getVisibility() == 0) {
            va.jpo((View) this.my, 8);
        }
    }

    public boolean tu() {
        return this.f20187tu;
    }

    public void wqx(boolean z10) {
    }

    public void xyk() {
        va.my(this.f20178jj);
    }

    public boolean yd() {
        return false;
    }

    public void zz() {
        cm(8);
        if (hmu()) {
            this.f20172cm.setVisibility(8);
        }
        ImageView imageView = this.xyk;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        cm(8);
        va.jpo(this.f20189yd, 8);
        va.jpo((View) this.f20180ju, 8);
        va.jpo(this.f114if, 8);
        va.jpo((View) this.f20171au, 8);
        va.jpo((View) this.oya, 8);
        va.jpo((View) this.prr, 8);
        nmd nmdVar = this.f20176hx;
        if (nmdVar != null) {
            nmdVar.jpo(true);
        }
    }

    private void jj(int i10) {
        va.jpo(this.f114if, i10);
    }

    private int my(int i10) {
        if (this.f20179jr <= 0 || this.nmd <= 0) {
            return 0;
        }
        int iJd = va.jd(this.f20185se, 228.0f);
        int iJd2 = va.jd(this.f20185se, 160.0f);
        int i11 = (int) (this.nmd * ((i10 * 1.0f) / this.f20179jr));
        return i11 > iJd ? iJd : i11 < iJd2 ? iJd2 : i11;
    }

    public void jd(boolean z10) {
    }

    public void jpo(long j10) {
    }

    public void wqx(int i10) {
        va.jpo((View) this.wqx, 0);
        com.bykv.vk.openvk.jpo.jpo.jpo.jj.jd jdVar = this.f20172cm;
        if (jdVar != null) {
            jdVar.setVisibility(i10);
        }
    }

    public void cm(boolean z10) {
        this.f20184rv = z10;
        if (z10) {
            com.bytedance.sdk.openadsdk.core.wqx.jpo jpoVar = this.kln;
            if (jpoVar != null) {
                jpoVar.jpo(true);
            }
            com.bytedance.sdk.openadsdk.core.wqx.jpo jpoVar2 = this.f20175ef;
            if (jpoVar2 != null) {
                jpoVar2.jpo(true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.wqx.jpo jpoVar3 = this.kln;
        if (jpoVar3 != null) {
            jpoVar3.jpo(false);
        }
        com.bytedance.sdk.openadsdk.core.wqx.jpo jpoVar4 = this.f20175ef;
        if (jpoVar4 != null) {
            jpoVar4.jpo(false);
        }
    }

    public boolean jd(int i10) {
        return false;
    }

    public void jpo(long j10, long j11) {
    }

    public void jd(boolean z10, boolean z11) {
        ImageView imageView = this.my;
        if (imageView != null) {
            if (z10) {
                imageView.setImageDrawable(ju.jpo(this.f20185se, "tt_play_movebar_textpage"));
            } else {
                imageView.setImageDrawable(ju.jpo(this.f20185se, "tt_stop_movebar_textpage"));
            }
        }
    }

    public void jpo(Message message) {
    }

    public void jpo(View view, boolean z10) {
    }

    public void wqx(int i10, int i11) {
        this.f20179jr = i10;
        this.nmd = i11;
    }

    public void jpo(ViewGroup viewGroup) {
    }

    public void jd(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = this.wqx.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (i10 == -1 || i10 == -2 || i10 > 0) {
            layoutParams.width = i10;
        }
        if (i11 == -1 || i11 == -2 || i11 > 0) {
            layoutParams.height = i11;
        }
        this.wqx.setLayoutParams(layoutParams);
    }

    public void jpo(String str) {
    }

    public void wqx(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        if (this.wqx.getParent() == null) {
            viewGroup.addView(this.wqx);
        }
        cm(0);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd
    public /* bridge */ /* synthetic */ void jpo(dt dtVar, WeakReference weakReference, boolean z10) {
        jpo(dtVar, (WeakReference<Context>) weakReference, z10);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd
    public View wqx() {
        return this.wqx;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd
    public void jd() {
        va.my(this.f20178jj);
        va.my(this.f20182qk);
        ImageView imageView = this.xyk;
        if (imageView != null) {
            va.my(imageView);
        }
    }

    public void jpo(jj.jpo jpoVar) {
        this.duq = jpoVar;
    }

    public void cm(int i10) {
        this.f20174dt = i10;
        va.jpo((View) this.wqx, i10);
    }

    public void jpo(PAGNativeAd pAGNativeAd) {
        com.bytedance.sdk.openadsdk.core.wqx.jpo jpoVar = this.kln;
        if (jpoVar != null) {
            jpoVar.jpo(pAGNativeAd);
        }
        com.bytedance.sdk.openadsdk.core.wqx.jpo jpoVar2 = this.f20175ef;
        if (jpoVar2 != null) {
            jpoVar2.jpo(pAGNativeAd);
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jj.jpo
    public void jd(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.f20172cm.getHolder()) {
            return;
        }
        this.f20187tu = false;
        if (hna()) {
            this.pdm.jd(this, surfaceHolder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v19, types: [com.bykv.vk.openvk.jpo.jpo.jpo.jj.cm] */
    public void jpo(Context context, View view) {
        com.bykv.vk.openvk.jpo.jpo.jpo.jj.wqx wqxVar;
        System.currentTimeMillis();
        dt dtVar = this.f20181nq;
        if ((dtVar == null || ((!dtVar.hrt() && !this.f20181nq.zc()) || au.jrx().rzi())) && view != null) {
            view.setKeepScreenOn(true);
        }
        com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar2 = this.sz;
        if (wqxVar2 != null && wqxVar2.prr()) {
            wqxVar = new com.bykv.vk.openvk.jpo.jpo.jpo.jj.cm(this.f20185se);
        } else {
            wqxVar = new com.bykv.vk.openvk.jpo.jpo.jpo.jj.wqx(this.f20185se);
        }
        if (view instanceof RelativeLayout) {
            ((RelativeLayout) view).addView(wqxVar, 0, e2.e(-2, -2, 13));
        }
        va.jpo((View) wqxVar, 8);
        this.f20172cm = wqxVar;
        this.my = (ImageView) view.findViewById(hna.fgt);
        this.f20178jj = view.findViewById(hna.czp);
        this.f20182qk = view.findViewById(hna.f21550sn);
        this.xyk = (ImageView) view.findViewById(hna.pzk);
        this.zz = view.findViewById(hna.uhu);
        System.currentTimeMillis();
    }

    public my(Context context, ViewGroup viewGroup, boolean z10, int i10, dt dtVar, com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar) {
        this(context, viewGroup, z10, i10, dtVar, wqxVar, true);
    }

    public void jpo(View view, Context context) {
        View view2;
        if (view == null || context == null || (view2 = this.zz) == null || view2.getParent() == null || this.f20189yd != null) {
            return;
        }
        this.f20189yd = this.zz;
        this.f20180ju = (ImageView) view.findViewById(hna.f21513as);
        this.f114if = view.findViewById(hna.f21559ww);
        this.f20171au = (com.bytedance.sdk.openadsdk.core.widget.jpo) view.findViewById(hna.f21555va);
        this.oya = (TextView) view.findViewById(hna.vrc);
        this.prr = (TextView) view.findViewById(hna.roc);
        this.hna = (TextView) view.findViewById(hna.f21543pe);
    }

    public boolean jpo(int i10, com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd jdVar, boolean z10) {
        nmd nmdVar = this.f20176hx;
        return nmdVar == null || nmdVar.jpo(i10, jdVar, z10);
    }

    public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.cm.jpo jpoVar) {
        if (jpoVar instanceof jpo) {
            this.pdm = (jpo) jpoVar;
            oya();
        }
    }

    public void jpo(int i10, int i11) {
        if (i10 == -1) {
            i10 = va.wqx(this.f20185se);
        }
        if (i10 <= 0) {
            return;
        }
        this.f20186sq = i10;
        if (!rq() && !yd() && (this.hmu & 8) != 8) {
            this.opi = my(i10);
        } else {
            this.opi = i11;
        }
        jd(this.f20186sq, this.opi);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd
    public void jpo() {
        jpo(false, this.f20183rq);
        jr();
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd
    public void jpo(boolean z10) {
        this.nzb = z10;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void jpo(com.bytedance.sdk.openadsdk.core.model.dt r7, java.lang.ref.WeakReference<android.content.Context> r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.au.jd.my.jpo(com.bytedance.sdk.openadsdk.core.model.dt, java.lang.ref.WeakReference, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(final int i10, final String str, final dt dtVar) {
        com.bytedance.sdk.openadsdk.cm.wqx.jpo(new xyk("load_vast_icon_fail") { // from class: com.bytedance.sdk.openadsdk.core.au.jd.my.7
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i10);
                    jSONObject.put("description", i10 + ":" + str);
                    jSONObject.put("url", my.this.f20181nq.ou().jpo());
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.cm.wqx.jd(my.this.f20181nq, my.this.f20181nq != null ? tic.wqx(dtVar.cxb()) : null, "load_vast_icon_fail", jSONObject);
            }
        });
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jj.jpo
    public void jpo(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.f20172cm.getHolder()) {
            return;
        }
        this.f20187tu = true;
        if (hna()) {
            this.pdm.jpo(this, surfaceHolder);
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jj.jpo
    public void jpo(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        if (surfaceHolder != this.f20172cm.getHolder()) {
            return;
        }
        hna();
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jj.jpo
    public void jpo(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f20187tu = true;
        if (hna()) {
            this.pdm.jpo(this, surfaceTexture);
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jj.jpo
    public boolean jpo(SurfaceTexture surfaceTexture) {
        this.f20187tu = false;
        if (!hna()) {
            return true;
        }
        this.pdm.jd(this, surfaceTexture);
        return true;
    }

    public void jpo(boolean z10, boolean z11, boolean z12) {
        va.jpo((View) this.my, (!z10 || this.f20178jj.getVisibility() == 0) ? 8 : 0);
    }

    public void jpo(boolean z10, boolean z11) {
        va.jpo((View) this.my, 8);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd
    public void jpo(Drawable drawable) {
        ViewGroup viewGroup = this.wqx;
        if (viewGroup != null) {
            viewGroup.setBackgroundDrawable(drawable);
        }
    }
}
