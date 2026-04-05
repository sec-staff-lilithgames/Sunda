package com.bytedance.sdk.openadsdk.core.au.jd;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx;
import com.bytedance.sdk.component.utils.hx;
import com.bytedance.sdk.component.utils.opi;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.cm.my.jd.prr;
import com.bytedance.sdk.openadsdk.cm.qk;
import com.bytedance.sdk.openadsdk.core.au.jd.wqx;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.nzb;
import com.bytedance.sdk.openadsdk.core.oya;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.zz;
import com.bytedance.sdk.openadsdk.core.zz.hmu;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.bytedance.sdk.openadsdk.utils.va;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj extends com.bytedance.sdk.openadsdk.core.jj.wqx implements wqx.jpo, hx.jpo, wqx.jpo {

    /* renamed from: au, reason: collision with root package name */
    protected int f20152au;

    /* renamed from: cm, reason: collision with root package name */
    protected boolean f20153cm;

    /* renamed from: dm, reason: collision with root package name */
    private View f20154dm;
    private final String duq;

    /* renamed from: ef, reason: collision with root package name */
    private long f20155ef;
    private String hmu;
    public jd hna;

    /* renamed from: hx, reason: collision with root package name */
    private boolean f20156hx;

    /* renamed from: if, reason: not valid java name */
    protected String f113if;

    /* renamed from: jd, reason: collision with root package name */
    protected wqx f20157jd;

    /* renamed from: jj, reason: collision with root package name */
    public qk f20158jj;
    protected final dt jpo;

    /* renamed from: jr, reason: collision with root package name */
    private boolean f20159jr;

    /* renamed from: ju, reason: collision with root package name */
    protected boolean f20160ju;
    private boolean kln;
    public boolean my;
    private boolean nmd;

    /* renamed from: nq, reason: collision with root package name */
    private boolean f20161nq;
    private boolean nzb;
    private ViewGroup opi;
    boolean oya;
    private boolean pdm;

    /* renamed from: pe, reason: collision with root package name */
    private final AtomicBoolean f20162pe;
    protected boolean prr;

    /* renamed from: qk, reason: collision with root package name */
    protected RelativeLayout f20163qk;
    private final Runnable roc;

    /* renamed from: rq, reason: collision with root package name */
    private String f20164rq;

    /* renamed from: rv, reason: collision with root package name */
    private long f20165rv;

    /* renamed from: se, reason: collision with root package name */
    private boolean f20166se;

    /* renamed from: sq, reason: collision with root package name */
    private final Context f20167sq;
    private final Handler sz;
    private wqx.InterfaceC0052wqx tic;

    /* renamed from: uu, reason: collision with root package name */
    private final boolean f20168uu;

    /* renamed from: va, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f20169va;
    private final AtomicBoolean vrc;
    protected FrameLayout wqx;
    private final ViewTreeObserver.OnScrollChangedListener xk;
    protected ImageView xyk;

    /* renamed from: yd, reason: collision with root package name */
    protected ImageView f20170yd;
    protected ImageView zz;

    /* renamed from: tu, reason: collision with root package name */
    private static final Integer f20151tu = 0;

    /* renamed from: dt, reason: collision with root package name */
    private static final Integer f20150dt = 1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jd {
        void jpo(boolean z10, long j10, long j11, long j12, boolean z11);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        void jpo(View view, int i10);
    }

    public jj(Context context, dt dtVar, boolean z10, qk qkVar) {
        this(context, dtVar, z10, "embeded_ad", false, false, qkVar);
    }

    private void cm() {
        jpo(0L, 0);
        this.tic = null;
    }

    private void dt() {
        if (!this.vrc.get()) {
            this.vrc.set(true);
            wqx wqxVar = this.f20157jd;
            if (wqxVar != null) {
                wqxVar.jpo(true, 3);
            }
        }
        this.f20162pe.set(false);
    }

    private void ef() {
        va.my(this.zz);
        va.my(this.f20163qk);
    }

    private void hmu() {
        this.kln = m452if();
        duq.jpo(this.roc);
    }

    private void hx() {
        if (kln() || !nq()) {
            return;
        }
        Boolean bool = Boolean.FALSE;
        com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
        com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("sp_multi_native_video_data", "key_video_is_from_detail_page", bool);
    }

    private void jr() {
        this.f20157jd = new wqx(this.f20167sq, this.wqx, this.jpo, this.f113if, !kln(), this.f20166se, this.f20156hx, this.f20158jj);
        nmd();
        if (this.f20169va == null) {
            this.f20169va = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.jj.3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    jj jjVar;
                    wqx wqxVar;
                    if (jj.this.opi == null || jj.this.opi.getViewTreeObserver() == null || (wqxVar = (jjVar = jj.this).f20157jd) == null) {
                        return;
                    }
                    wqxVar.jpo(jjVar.opi.getWidth(), jj.this.opi.getHeight());
                    jj.this.opi.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    jj.this.f20169va = null;
                }
            };
            this.opi.getViewTreeObserver().addOnGlobalLayoutListener(this.f20169va);
        }
    }

    private boolean kln() {
        return this.nmd;
    }

    private void my() {
        addView(jpo(this.f20167sq));
        jr();
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.jj.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                jj.this.opi();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                jj.this.opi();
            }
        });
    }

    private void nmd() {
        wqx wqxVar = this.f20157jd;
        if (wqxVar == null) {
            return;
        }
        wqxVar.cm(this.f20159jr);
        this.f20157jd.jpo((wqx.jpo) this);
        this.f20157jd.jpo((wqx.jpo) this);
    }

    private boolean nq() {
        dt dtVar = this.jpo;
        if (dtVar == null) {
            return false;
        }
        return dtVar.co();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void opi() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Handler handler = this.sz;
        if (handler == null || jElapsedRealtime - this.f20155ef <= 500) {
            return;
        }
        this.f20155ef = jElapsedRealtime;
        handler.sendEmptyMessageDelayed(1, 500L);
    }

    private void pdm() {
        this.sz.removeMessages(1);
        oya.wqx().removeCallbacks(this.roc);
    }

    private void rq() {
        wqx wqxVar = this.f20157jd;
        if (wqxVar == null) {
            jr();
        } else if (wqxVar != null && !kln()) {
            this.f20157jd.hna();
        }
        if (this.f20157jd == null || !this.vrc.get()) {
            return;
        }
        this.vrc.set(false);
        jd();
        if (!xyk()) {
            if (this.f20157jd.au()) {
                this.f20157jd.au();
                jd(true);
                return;
            } else {
                qk();
                va.jpo((View) this.f20163qk, 0);
                return;
            }
        }
        va.jpo((View) this.f20163qk, 8);
        ImageView imageView = this.zz;
        if (imageView != null) {
            va.jpo((View) imageView, 8);
        }
        dt dtVar = this.jpo;
        if (dtVar == null || dtVar.ww() == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.au.jpo.jd jdVarJpo = dt.jpo(CacheDirFactory.getICacheDir(this.jpo.ew()).wqx(), this.jpo);
        jdVarJpo.jd(this.jpo.fc());
        jdVarJpo.jd(this.opi.getWidth());
        jdVarJpo.wqx(this.opi.getHeight());
        jdVarJpo.wqx(this.jpo.fxd());
        jdVarJpo.jpo(0L);
        jdVarJpo.jpo(zz());
        jpo(jdVarJpo);
        this.f20157jd.jpo(jdVarJpo);
        this.f20157jd.jd(false);
    }

    private void rv() {
        if (this.f20157jd == null || kln()) {
            return;
        }
        if ((!nq() || com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("sp_multi_native_video_data", "key_video_is_update_flag", false)) && nq()) {
            long jZz = this.f20157jd.zz();
            long jQk = this.f20157jd.qk() + jZz;
            boolean zJpo = com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("sp_multi_native_video_data", "key_native_video_complete", false);
            long jJpo = com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("sp_multi_native_video_data", "key_video_current_play_position", 0L);
            long jJpo2 = com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("sp_multi_native_video_data", "key_video_total_play_duration", jQk);
            long jJpo3 = com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("sp_multi_native_video_data", "key_video_duration", jZz);
            com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("sp_multi_native_video_data", "key_video_is_update_flag", Boolean.FALSE);
            this.f20157jd.jd(zJpo);
            this.f20157jd.jd(jJpo);
            this.f20157jd.wqx(jJpo2);
            this.f20157jd.cm(jJpo3);
        }
    }

    private boolean se() {
        if (kln() || !nq()) {
            return false;
        }
        return com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("sp_multi_native_video_data", "key_video_is_from_detail_page", false) || com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("sp_multi_native_video_data", "key_video_isfromvideodetailpage", false);
    }

    private boolean sz() {
        return 5 == sq.cm().jd(this.jpo.jl());
    }

    private void tu() {
        this.hna = null;
        if (this.f20157jd != null && !kln()) {
            this.f20157jd.duq();
        }
        ju();
        jpo(false);
        dt();
    }

    private boolean uu() {
        return 2 == sq.cm().jd(this.jpo.jl());
    }

    public boolean au() {
        boolean z10 = false;
        if (opi.wqx(sq.jpo()) == 0) {
            return false;
        }
        if (this.f20157jd.ju() != null && this.f20157jd.ju().jj()) {
            jpo(false, f20151tu.intValue());
            Handler handler = this.sz;
            z10 = true;
            if (handler != null) {
                handler.removeMessages(1);
            }
        }
        return z10;
    }

    public double getCurrentPlayTime() {
        if (this.f20157jd != null) {
            return (r0.jj() * 1.0d) / 1000.0d;
        }
        return 0.0d;
    }

    public wqx getNativeVideoController() {
        return this.f20157jd;
    }

    public void hna() {
        com.bytedance.sdk.openadsdk.core.model.cm cmVarKc;
        com.bytedance.sdk.openadsdk.core.p000if.cm cmVarJpo;
        dt dtVar = this.jpo;
        if (dtVar == null || (cmVarKc = dtVar.kc()) == null || (cmVarJpo = cmVarKc.jpo()) == null) {
            return;
        }
        cmVarJpo.my(this.f20165rv);
    }

    /* renamed from: if, reason: not valid java name */
    public boolean m452if() {
        return nzb.jpo(this, 50, hmu.jd(this.f113if) ? 1 : 5, false);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.jpo
    public void jd(long j10, int i10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.wqx.jpo
    public void jj() {
        wqx.InterfaceC0052wqx interfaceC0052wqx = this.tic;
        if (interfaceC0052wqx != null) {
            interfaceC0052wqx.e_();
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.jpo
    public void jpo() {
    }

    public void ju() {
        my myVarRq;
        wqx wqxVar = this.f20157jd;
        if (wqxVar == null || (myVarRq = wqxVar.mo374if()) == null) {
            return;
        }
        myVarRq.jpo();
        View viewWqx = myVarRq.wqx();
        if (viewWqx != null) {
            viewWqx.setVisibility(8);
            if (viewWqx.getParent() != null) {
                ((ViewGroup) viewWqx.getParent()).removeView(viewWqx);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        rq();
        if (this.prr) {
            getViewTreeObserver().addOnScrollChangedListener(this.xk);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tu();
        if (this.prr) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnScrollChangedListener(this.xk);
            }
            ViewGroup viewGroup = this.opi;
            if (viewGroup == null || this.f20169va == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver2 = viewGroup.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnGlobalLayoutListener(this.f20169va);
                this.f20169va = null;
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        rq();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        jd jdVar;
        wqx wqxVar;
        if (!this.nmd && (jdVar = this.hna) != null && (wqxVar = this.f20157jd) != null) {
            jdVar.jpo(wqxVar.au(), this.f20157jd.zz(), this.f20157jd.ef(), this.f20157jd.jj(), this.f20159jr);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        tu();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        wqx wqxVar;
        wqx wqxVar2;
        wqx wqxVar3;
        wqx wqxVar4;
        if ("open_ad".equals(this.f113if)) {
            pdm();
            return;
        }
        this.f20161nq = z10;
        super.onWindowFocusChanged(z10);
        com.bytedance.sdk.openadsdk.hmu.jpo.wqx.jpo(this.jpo, z10);
        rv();
        if (this.prr) {
            if (se() && (wqxVar4 = this.f20157jd) != null && wqxVar4.au()) {
                hx();
                va.jpo((View) this.f20163qk, 8);
                jd(true);
                cm();
                return;
            }
            jd();
            if (!kln() && xyk() && (wqxVar2 = this.f20157jd) != null && !wqxVar2.dt()) {
                if (this.sz != null) {
                    if (z10 && (wqxVar3 = this.f20157jd) != null && !wqxVar3.au()) {
                        this.sz.obtainMessage(1).sendToTarget();
                        return;
                    } else {
                        pdm();
                        jpo(false, f20151tu.intValue());
                        return;
                    }
                }
                return;
            }
            if (xyk()) {
                return;
            }
            if (!z10 && (wqxVar = this.f20157jd) != null && wqxVar.ju() != null && this.f20157jd.ju().jj()) {
                pdm();
                jpo(false, f20151tu.intValue());
            } else if (z10) {
                this.sz.obtainMessage(1).sendToTarget();
            }
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        wqx wqxVar;
        dt dtVar;
        wqx wqxVar2;
        wqx wqxVar3;
        super.onWindowVisibilityChanged(i10);
        rv();
        if (se() && (wqxVar3 = this.f20157jd) != null && wqxVar3.au()) {
            hx();
            va.jpo((View) this.f20163qk, 8);
            jd(true);
            cm();
            return;
        }
        jd();
        if (kln() || !xyk() || (wqxVar = this.f20157jd) == null || wqxVar.dt() || (dtVar = this.jpo) == null) {
            return;
        }
        if (this.pdm && dtVar.ww() != null) {
            this.jpo.ww();
            com.bytedance.sdk.openadsdk.core.au.jpo.jd jdVarJpo = dt.jpo(CacheDirFactory.getICacheDir(this.jpo.ew()).wqx(), this.jpo);
            jdVarJpo.jd(this.jpo.fc());
            jdVarJpo.jd(this.opi.getWidth());
            jdVarJpo.wqx(this.opi.getHeight());
            jdVarJpo.wqx(this.jpo.fxd());
            jdVarJpo.jpo(this.f20165rv);
            jdVarJpo.jpo(zz());
            jpo(jdVarJpo);
            this.f20157jd.jpo(jdVarJpo);
            this.pdm = false;
            va.jpo((View) this.f20163qk, 8);
        }
        if (i10 != 0 || !this.prr || this.sz == null || (wqxVar2 = this.f20157jd) == null || wqxVar2.au()) {
            return;
        }
        this.sz.obtainMessage(1).sendToTarget();
    }

    public void oya() {
        if (getNativeVideoController() == null || getNativeVideoController() == null) {
            return;
        }
        wqx nativeVideoController = getNativeVideoController();
        nativeVideoController.jpo(nativeVideoController.mo374if(), this);
    }

    public void prr() {
        if (opi.wqx(sq.jpo()) != 0 && m452if()) {
            if (this.f20157jd.ju() != null) {
                if (this.f20157jd.ju().qk()) {
                    jpo(true, f20150dt.intValue());
                    jd();
                    Handler handler = this.sz;
                    if (handler != null) {
                        handler.sendEmptyMessageDelayed(1, 500L);
                        return;
                    }
                    return;
                }
                if (this.f20157jd.ju().jd() && !this.prr) {
                    yd();
                    if (this.f20157jd != null) {
                        this.f20157jd.tic();
                        return;
                    }
                    return;
                }
            }
            if (xyk() || this.f20162pe.get()) {
                return;
            }
            this.f20162pe.set(true);
            ef();
            dt dtVar = this.jpo;
            if (dtVar != null && dtVar.ww() != null) {
                ef();
                this.jpo.ww();
                com.bytedance.sdk.openadsdk.core.au.jpo.jd jdVarJpo = dt.jpo(CacheDirFactory.getICacheDir(this.jpo.ew()).wqx(), this.jpo);
                jdVarJpo.jd(this.jpo.fc());
                jdVarJpo.jd(this.opi.getWidth());
                jdVarJpo.wqx(this.opi.getHeight());
                jdVarJpo.wqx(this.jpo.fxd());
                jdVarJpo.jpo(this.f20165rv);
                jdVarJpo.jpo(zz());
                jdVarJpo.jpo(CacheDirFactory.getICacheDir(this.jpo.ew()).wqx());
                jpo(jdVarJpo);
                this.f20157jd.jpo(jdVarJpo);
            }
            Handler handler2 = this.sz;
            if (handler2 != null) {
                handler2.sendEmptyMessageDelayed(1, 500L);
            }
            jpo(false);
        }
    }

    public void qk() {
        View view;
        if (this.f20167sq == null || (view = this.f20154dm) == null || view.getParent() == null || this.jpo == null || this.f20163qk != null) {
            return;
        }
        ViewParent parent = this.f20154dm.getParent();
        RelativeLayout relativeLayoutJd = jd(this.f20167sq);
        if (parent != null && (parent instanceof ViewGroup)) {
            jpo(relativeLayoutJd, (ViewGroup) parent, this.f20154dm);
        }
        this.f20163qk = relativeLayoutJd;
        if (this.f20160ju) {
            va.jpo((View) this.f20170yd, 0);
        }
        if (this.jpo.ww() != null && this.jpo.ww().yd() != null) {
            com.bytedance.sdk.openadsdk.opi.jd.jd().jpo(this.jpo.ww().yd(), this.jpo.ww().wqx(), this.jpo.ww().jd(), this.xyk, this.jpo);
        }
        ImageView imageView = this.f20170yd;
        if (imageView != null) {
            imageView.setClickable(true);
            this.f20170yd.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.jj.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    jj.this.wqx();
                }
            });
        }
    }

    public void setAdCreativeClickListener(jpo jpoVar) {
        wqx wqxVar = this.f20157jd;
        if (wqxVar != null) {
            wqxVar.jpo(jpoVar);
        }
    }

    public void setControllerStatusCallBack(jd jdVar) {
        this.hna = jdVar;
    }

    public void setIsAutoPlay(boolean z10) {
        if (this.nzb) {
            return;
        }
        int iJd = sq.cm().jd(this.jpo.jl());
        if (z10 && iJd != 4 && (!opi.my(this.f20167sq) ? !(!opi.jj(this.f20167sq) ? opi.cm(this.f20167sq) : uu() || sz()) : !uu())) {
            z10 = false;
        }
        this.f20159jr = z10;
        wqx wqxVar = this.f20157jd;
        if (wqxVar != null) {
            wqxVar.cm(z10);
        }
        if (this.f20159jr) {
            va.jpo((View) this.f20163qk, 8);
        } else {
            qk();
            RelativeLayout relativeLayout = this.f20163qk;
            if (relativeLayout != null) {
                va.jpo((View) relativeLayout, 0);
                dt dtVar = this.jpo;
                if (dtVar != null && dtVar.ww() != null) {
                    com.bytedance.sdk.openadsdk.opi.jd.jd().jpo(this.jpo.ww().yd(), this.jpo.ww().wqx(), this.jpo.ww().jd(), this.xyk, this.jpo);
                }
            }
        }
        this.nzb = true;
    }

    public void setNeedNativeVideoPlayBtnVisible(boolean z10) {
        this.f20160ju = z10;
    }

    public void setNeedSelfManagerVideo(boolean z10) {
        this.prr = z10;
    }

    public void setVideoAdClickListenerTTNativeAd(PAGNativeAd pAGNativeAd) {
        wqx wqxVar = this.f20157jd;
        if (wqxVar != null) {
            wqxVar.jpo(pAGNativeAd);
        }
    }

    public void setVideoAdInteractionListener(wqx.InterfaceC0052wqx interfaceC0052wqx) {
        this.tic = interfaceC0052wqx;
    }

    public void setVideoAdLoadListener(wqx.cm cmVar) {
        wqx wqxVar = this.f20157jd;
        if (wqxVar != null) {
            wqxVar.jpo(cmVar);
        }
    }

    public void setVideoCacheUrl(String str) {
        this.f20164rq = str;
    }

    public void setVideoPlayCallback(com.bytedance.sdk.openadsdk.core.au.jd.jd jdVar) {
        wqx wqxVar = this.f20157jd;
        if (wqxVar != null) {
            wqxVar.jpo(jdVar);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 4 || i10 == 8) {
            dt();
        }
    }

    public boolean xyk() {
        return this.f20159jr;
    }

    public void yd() {
        wqx wqxVar = this.f20157jd;
        if (wqxVar != null) {
            my myVarRq = wqxVar.mo374if();
            if (myVarRq != null) {
                myVarRq.jpo();
            }
            ef();
        }
    }

    public boolean zz() {
        return this.f20153cm;
    }

    public jj(Context context, dt dtVar, String str, boolean z10, boolean z11, qk qkVar) {
        this(context, dtVar, false, str, z10, z11, qkVar);
    }

    public void wqx() {
        if (au()) {
            return;
        }
        prr();
    }

    public jj(Context context, dt dtVar, qk qkVar) {
        this(context, dtVar, false, qkVar);
    }

    public void jd() {
        dt dtVar = this.jpo;
        if (dtVar == null) {
            return;
        }
        int iJl = dtVar.jl();
        int iJd = sq.cm().jd(iJl);
        int iWqx = opi.wqx(sq.jpo());
        if (iJd == 1) {
            this.f20159jr = tic.cm(iWqx);
        } else if (iJd == 2) {
            this.f20159jr = tic.my(iWqx) || tic.cm(iWqx) || tic.jj(iWqx);
        } else if (iJd == 3) {
            this.f20159jr = false;
        } else if (iJd == 4) {
            this.oya = true;
        } else if (iJd == 5) {
            this.f20159jr = tic.cm(iWqx) || tic.jj(iWqx);
        }
        if (!this.nmd) {
            if (!this.my || !hmu.jd(this.f113if)) {
                this.f20153cm = sq.cm().jd(String.valueOf(iJl));
            }
        } else {
            this.f20153cm = false;
        }
        if ("open_ad".equals(this.f113if)) {
            this.f20159jr = true;
            this.f20153cm = true;
        }
        if (hmu.jd(this.f113if)) {
            this.f20153cm = true;
        }
        wqx wqxVar = this.f20157jd;
        if (wqxVar != null) {
            wqxVar.cm(this.f20159jr);
        }
        this.my = true;
    }

    public jj(Context context, dt dtVar, boolean z10, String str, boolean z11, boolean z12, qk qkVar) {
        super(context);
        this.f20159jr = true;
        this.f20153cm = true;
        this.nmd = false;
        this.my = false;
        this.f20161nq = true;
        this.f20166se = false;
        this.f20156hx = true;
        this.f20160ju = true;
        this.f113if = "embeded_ad";
        this.f20152au = 50;
        this.pdm = true;
        this.f20168uu = false;
        this.sz = new hx(oya.jd().getLooper(), this);
        this.nzb = false;
        this.duq = Build.MODEL;
        this.oya = false;
        this.prr = true;
        this.vrc = new AtomicBoolean(false);
        this.roc = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.jj.4
            @Override // java.lang.Runnable
            public void run() {
                jj jjVar = jj.this;
                jjVar.jpo(jjVar.kln, jj.f20151tu.intValue());
            }
        };
        this.f20162pe = new AtomicBoolean(false);
        this.xk = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.jj.6
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                jj.this.opi();
            }
        };
        try {
            if (dtVar.aaf()) {
                this.hmu = CacheDirFactory.getICacheDir(0).jd();
            }
        } catch (Throwable unused) {
        }
        if (qkVar != null) {
            this.f20158jj = qkVar;
        }
        this.f113if = str;
        this.f20167sq = context;
        this.jpo = dtVar;
        this.nmd = z10;
        setContentDescription("NativeVideoTsView");
        this.f20166se = z11;
        this.f20156hx = z12;
        jd();
        my();
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.jpo
    public void jpo(long j10, int i10) {
        wqx.InterfaceC0052wqx interfaceC0052wqx = this.tic;
        if (interfaceC0052wqx != null) {
            interfaceC0052wqx.h_();
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.jpo
    public void jpo(long j10, long j11) {
        wqx.InterfaceC0052wqx interfaceC0052wqx = this.tic;
        if (interfaceC0052wqx != null) {
            interfaceC0052wqx.jpo(j10, j11);
        }
    }

    private View jpo(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        new FrameLayout.LayoutParams(-1, -1).gravity = 17;
        frameLayout.setVisibility(8);
        this.opi = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout.addView(frameLayout2);
        this.wqx = frameLayout2;
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(view);
        this.f20154dm = view;
        return frameLayout;
    }

    private RelativeLayout jd(Context context) {
        com.bytedance.sdk.openadsdk.core.jj.qk qkVar = new com.bytedance.sdk.openadsdk.core.jj.qk(context);
        qkVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        qkVar.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        cmVar.setLayoutParams(layoutParams);
        cmVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.xyk = cmVar;
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar2 = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        cmVar2.setLayoutParams(layoutParams2);
        cmVar2.setVisibility(8);
        cmVar2.setBackground(com.bytedance.sdk.component.utils.dt.wqx(context, "tt_new_play_video"));
        this.f20170yd = cmVar2;
        qkVar.addView(cmVar);
        qkVar.addView(cmVar2);
        return qkVar;
    }

    private void jpo(View view, ViewGroup viewGroup, View view2) {
        int iIndexOfChild = viewGroup.indexOfChild(view2);
        viewGroup.removeViewInLayout(view2);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
    }

    public boolean jpo(long j10, boolean z10, boolean z11) {
        boolean zJpo = false;
        this.opi.setVisibility(0);
        this.f20165rv = j10;
        if (!kln()) {
            return true;
        }
        this.f20157jd.jpo(false);
        dt dtVar = this.jpo;
        if (dtVar != null && dtVar.ww() != null) {
            com.bytedance.sdk.openadsdk.core.au.jpo.jd jdVarJpo = dt.jpo(CacheDirFactory.getICacheDir(this.jpo.ew()).wqx(), this.jpo);
            jdVarJpo.jd(this.jpo.fc());
            jdVarJpo.jd(this.opi.getWidth());
            jdVarJpo.wqx(this.opi.getHeight());
            jdVarJpo.wqx(this.jpo.fxd());
            jdVarJpo.jpo(j10);
            jdVarJpo.jpo(zz());
            jpo(jdVarJpo);
            if (z11) {
                this.f20157jd.jd(jdVarJpo);
                return true;
            }
            zJpo = this.f20157jd.jpo(jdVarJpo);
        }
        if (((j10 > 0 && !z10 && !z11) || (j10 > 0 && z10)) && this.f20157jd != null) {
            prr.jpo jpoVar = new prr.jpo();
            jpoVar.jd(this.f20157jd.jj());
            jpoVar.cm(this.f20157jd.zz());
            jpoVar.wqx(this.f20157jd.qk());
            com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.jd(this.f20157jd.mo374if(), jpoVar);
        }
        return zJpo;
    }

    public void jd(boolean z10) {
        wqx wqxVar = this.f20157jd;
        if (wqxVar != null) {
            wqxVar.jd(z10);
            my myVarRq = this.f20157jd.mo374if();
            if (myVarRq != null) {
                myVarRq.jd();
                View viewWqx = myVarRq.wqx();
                if (viewWqx != null) {
                    if (viewWqx.getParent() != null) {
                        ((ViewGroup) viewWqx.getParent()).removeView(viewWqx);
                    }
                    viewWqx.setVisibility(0);
                    addView(viewWqx);
                    myVarRq.jpo((my) this.jpo, new WeakReference<>(this.f20167sq), false);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.hx.jpo
    public void jpo(Message message) {
        if (message.what == 1) {
            hmu();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(boolean z10, int i10) {
        if (this.jpo == null || this.f20157jd == null) {
            return;
        }
        boolean zSe = se();
        hx();
        if (zSe && this.f20157jd.au()) {
            this.f20157jd.au();
            jd(true);
            cm();
            return;
        }
        if (z10 && this.f20161nq && !this.f20157jd.au() && !this.f20157jd.dt()) {
            if (this.f20157jd.ju() != null && this.f20157jd.ju().qk()) {
                if (this.f20159jr || i10 == 1) {
                    wqx wqxVar = this.f20157jd;
                    if (wqxVar != null) {
                        jpo(wqxVar.hmu(), "changeVideoStatus");
                    }
                    if ("ALP-AL00".equals(this.duq)) {
                        this.f20157jd.wqx();
                    } else {
                        if (!zz.jd().prr()) {
                            zSe = true;
                        }
                        this.f20157jd.qk(zSe);
                    }
                    jpo(false);
                    wqx.InterfaceC0052wqx interfaceC0052wqx = this.tic;
                    if (interfaceC0052wqx != null) {
                        interfaceC0052wqx.g_();
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.f20159jr && this.f20157jd.ju() == null) {
                if (!this.vrc.get()) {
                    this.vrc.set(true);
                }
                this.f20162pe.set(false);
                rq();
                return;
            }
            return;
        }
        if (this.f20157jd.ju() == null || !this.f20157jd.ju().jj()) {
            return;
        }
        this.f20157jd.jd();
        jpo(true);
        wqx.InterfaceC0052wqx interfaceC0052wqx2 = this.tic;
        if (interfaceC0052wqx2 != null) {
            interfaceC0052wqx2.f_();
        }
    }

    public void jpo(boolean z10, String str) {
        if (hmu.jd(this.f113if)) {
            z10 = true;
        }
        this.f20153cm = z10;
        wqx wqxVar = this.f20157jd;
        if (wqxVar != null) {
            wqxVar.jpo(z10, str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.wqx.jpo
    public void jpo(int i10) {
        jd();
    }

    public void jpo(boolean z10) {
        if (this.zz == null) {
            this.zz = new ImageView(getContext());
            if (zz.jd().hna() != null) {
                this.zz.setImageBitmap(zz.jd().hna());
            } else {
                this.zz.setImageResource(com.bytedance.sdk.component.utils.dt.cm(sq.jpo(), "tt_new_play_video"));
            }
            this.zz.setScaleType(ImageView.ScaleType.FIT_XY);
            int iJd = va.jd(getContext(), this.f20152au);
            int iJd2 = va.jd(getContext(), 10.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iJd, iJd);
            layoutParams.gravity = 17;
            layoutParams.rightMargin = iJd2;
            layoutParams.bottomMargin = iJd2;
            this.opi.addView(this.zz, layoutParams);
            this.zz.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.jj.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    jj.this.prr();
                }
            });
        }
        if (z10) {
            this.zz.setVisibility(0);
        } else {
            this.zz.setVisibility(8);
        }
    }

    public com.bytedance.sdk.openadsdk.core.p000if.jj jpo(List<Pair<View, FriendlyObstructionPurpose>> list) {
        if (this.f20157jd != null) {
            return this.f20157jd.jpo(this, list);
        }
        return null;
    }

    private void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar) {
        try {
            if (this.jpo.aaf()) {
                wqxVar.jpo(this.hmu);
            }
        } catch (Throwable unused) {
        }
    }
}
