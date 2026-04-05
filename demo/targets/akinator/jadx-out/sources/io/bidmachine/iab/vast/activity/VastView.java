package io.bidmachine.iab.vast.activity;

import android.content.Context;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.ironsource.G5;
import io.bidmachine.iab.vast.VastHelper;
import io.bidmachine.iab.vast.a0;
import io.bidmachine.iab.vast.b0;
import io.bidmachine.iab.vast.processor.VastAd;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tm.q;
import um.h0;
import um.k;
import um.l;
import um.m;
import um.n;
import um.p;
import um.s;
import um.t;
import um.u;
import um.w;
import vm.j;
import vm.o;
import vm.r;
import vm.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class VastView extends RelativeLayout implements k {

    /* renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ int f60422k0 = 0;
    public a A;
    public v B;
    public int C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public final ArrayList P;
    public final ArrayList Q;
    public final vm.c R;
    public final vm.d S;
    public final b T;
    public final c U;
    public final LinkedList V;
    public int W;

    /* renamed from: a0, reason: collision with root package name */
    public float f60423a0;

    /* renamed from: b, reason: collision with root package name */
    public final String f60424b;

    /* renamed from: b0, reason: collision with root package name */
    public final vm.e f60425b0;

    /* renamed from: c, reason: collision with root package name */
    public final zm.c f60426c;

    /* renamed from: c0, reason: collision with root package name */
    public final vm.g f60427c0;

    /* renamed from: d0, reason: collision with root package name */
    public final vm.h f60428d0;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f60429e;

    /* renamed from: e0, reason: collision with root package name */
    public final d f60430e0;

    /* renamed from: f, reason: collision with root package name */
    public Surface f60431f;

    /* renamed from: f0, reason: collision with root package name */
    public final vm.i f60432f0;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout f60433g;

    /* renamed from: g0, reason: collision with root package name */
    public final j f60434g0;

    /* renamed from: h, reason: collision with root package name */
    public final an.e f60435h;

    /* renamed from: h0, reason: collision with root package name */
    public final vm.k f60436h0;

    /* renamed from: i, reason: collision with root package name */
    public l f60437i;

    /* renamed from: i0, reason: collision with root package name */
    public final vm.l f60438i0;

    /* renamed from: j, reason: collision with root package name */
    public m f60439j;

    /* renamed from: j0, reason: collision with root package name */
    public final vm.m f60440j0;

    /* renamed from: k, reason: collision with root package name */
    public w f60441k;

    /* renamed from: l, reason: collision with root package name */
    public u f60442l;

    /* renamed from: m, reason: collision with root package name */
    public t f60443m;

    /* renamed from: n, reason: collision with root package name */
    public um.v f60444n;

    /* renamed from: o, reason: collision with root package name */
    public n f60445o;

    /* renamed from: p, reason: collision with root package name */
    public MediaPlayer f60446p;

    /* renamed from: q, reason: collision with root package name */
    public FrameLayout f60447q;

    /* renamed from: r, reason: collision with root package name */
    public ym.g f60448r;

    /* renamed from: s, reason: collision with root package name */
    public ym.g f60449s;

    /* renamed from: t, reason: collision with root package name */
    public ImageView f60450t;

    /* renamed from: u, reason: collision with root package name */
    public q f60451u;

    /* renamed from: v, reason: collision with root package name */
    public io.bidmachine.iab.vast.t f60452v;

    /* renamed from: w, reason: collision with root package name */
    public B f60453w;

    /* renamed from: x, reason: collision with root package name */
    public a0 f60454x;

    /* renamed from: y, reason: collision with root package name */
    public io.bidmachine.iab.vast.f f60455y;

    /* renamed from: z, reason: collision with root package name */
    public sm.c f60456z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class B implements Parcelable {
        public static final Parcelable.Creator<B> CREATOR = new io.bidmachine.iab.vast.activity.a();

        /* renamed from: b, reason: collision with root package name */
        public String f60457b = null;

        /* renamed from: c, reason: collision with root package name */
        public float f60458c = 5.0f;

        /* renamed from: e, reason: collision with root package name */
        public int f60459e = 0;

        /* renamed from: f, reason: collision with root package name */
        public int f60460f = 0;

        /* renamed from: g, reason: collision with root package name */
        public boolean f60461g = true;

        /* renamed from: h, reason: collision with root package name */
        public boolean f60462h = false;

        /* renamed from: i, reason: collision with root package name */
        public boolean f60463i = false;

        /* renamed from: j, reason: collision with root package name */
        public boolean f60464j = false;

        /* renamed from: k, reason: collision with root package name */
        public boolean f60465k = false;

        /* renamed from: l, reason: collision with root package name */
        public boolean f60466l = false;

        /* renamed from: m, reason: collision with root package name */
        public boolean f60467m = false;

        /* renamed from: n, reason: collision with root package name */
        public boolean f60468n = false;

        /* renamed from: o, reason: collision with root package name */
        public boolean f60469o = true;

        /* renamed from: p, reason: collision with root package name */
        public boolean f60470p = false;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f60457b);
            parcel.writeFloat(this.f60458c);
            parcel.writeInt(this.f60459e);
            parcel.writeInt(this.f60460f);
            parcel.writeByte(this.f60461g ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f60462h ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f60463i ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f60464j ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f60465k ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f60466l ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f60467m ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f60468n ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f60469o ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f60470p ? (byte) 1 : (byte) 0);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements sm.b {

        /* renamed from: b, reason: collision with root package name */
        public final VastView f60471b;

        /* renamed from: c, reason: collision with root package name */
        public final sm.b f60472c;

        public a(VastView vastView, sm.b bVar) {
            this.f60471b = vastView;
            this.f60472c = bVar;
        }

        @Override // sm.b, sm.a
        public void onAdClicked() {
            this.f60472c.onAdClicked();
        }

        @Override // sm.b, sm.a
        public void onAdShown() {
            this.f60472c.onAdShown();
        }

        @Override // sm.b, sm.a
        public void onError(qm.b bVar) {
            this.f60472c.onError(bVar);
        }

        @Override // sm.b
        public String prepareCreativeForMeasure(String str) {
            return this.f60472c.prepareCreativeForMeasure(str);
        }

        @Override // sm.b, sm.a
        public void registerAdContainer(ViewGroup viewGroup) {
            this.f60472c.registerAdContainer(this.f60471b);
        }

        @Override // sm.b
        public void onAdViewReady(WebView webView) {
            this.f60472c.onAdViewReady(webView);
        }

        @Override // sm.b, sm.a
        public void registerAdView(WebView webView) {
            this.f60472c.registerAdView(webView);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class z extends View.BaseSavedState {
        public static final Parcelable.Creator<z> CREATOR = new i();

        /* renamed from: b, reason: collision with root package name */
        public B f60473b;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f60473b, 0);
        }
    }

    public VastView(Context context) {
        this(context, null);
    }

    public static void a(VastView vastView) {
        vastView.setMute(!vastView.f60453w.f60462h);
    }

    public static p b(io.bidmachine.iab.vast.c cVar, p pVar) {
        if (cVar == null) {
            return null;
        }
        if (pVar == null) {
            p pVar2 = new p();
            ym.e eVar = (ym.e) cVar;
            pVar2.setStrokeColor(eVar.getAssetsColor());
            pVar2.setFillColor(eVar.getAssetsBackgroundColor());
            return pVar2;
        }
        if (!pVar.hasStrokeColor()) {
            pVar.setStrokeColor(((ym.e) cVar).getAssetsColor());
        }
        if (!pVar.hasFillColor()) {
            pVar.setFillColor(((ym.e) cVar).getAssetsBackgroundColor());
        }
        return pVar;
    }

    public static void f(VastView vastView, ym.g gVar, String str) throws IllegalStateException {
        io.bidmachine.iab.vast.t tVar = vastView.f60452v;
        ArrayList arrayList = null;
        VastAd vastAd = tVar != null ? tVar.getVastAd() : null;
        ArrayList<String> wrapperCompanionClickTrackingUrlList = vastAd != null ? vastAd.getWrapperCompanionClickTrackingUrlList() : null;
        List<String> companionClickTrackingList = gVar != null ? gVar.getCompanionClickTrackingList() : null;
        if (wrapperCompanionClickTrackingUrlList != null || companionClickTrackingList != null) {
            arrayList = new ArrayList();
            if (companionClickTrackingList != null) {
                arrayList.addAll(companionClickTrackingList);
            }
            if (wrapperCompanionClickTrackingUrlList != null) {
                arrayList.addAll(wrapperCompanionClickTrackingUrlList);
            }
        }
        vastView.j(arrayList, str);
    }

    private int getAvailableHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private int getAvailableWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCloseControlsVisible(boolean z10) {
        boolean z11;
        boolean z12;
        if (z10) {
            z11 = true;
            if (isSkipEnabled() || this.K) {
                z12 = false;
            } else {
                z12 = true;
                z11 = false;
            }
        } else {
            z12 = false;
            z11 = false;
        }
        l lVar = this.f60437i;
        if (lVar != null) {
            lVar.setVisibility(z11 ? 0 : 8);
        }
        m mVar = this.f60439j;
        if (mVar != null) {
            mVar.setVisibility(z12 ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoadingViewVisibility(boolean z10) {
        t tVar = this.f60443m;
        if (tVar == null) {
            return;
        }
        if (!z10) {
            tVar.setVisibility(8);
        } else {
            tVar.setVisibility(0);
            this.f60443m.bringToFront();
        }
    }

    private void setMute(boolean z10) {
        this.f60453w.f60462h = z10;
        C();
        o(this.f60453w.f60462h ? io.bidmachine.iab.vast.a.f60396i : io.bidmachine.iab.vast.a.f60397j);
    }

    private void setPlaceholderViewVisible(boolean z10) {
        io.bidmachine.iab.vast.t tVar = this.f60452v;
        this.f60435h.setCloseVisibility(z10, tVar != null ? tVar.getPlaceholderTimeoutSec() : 3.0f);
    }

    public static void v(VastView vastView) throws IllegalStateException {
        io.bidmachine.iab.vast.e.d(vastView.f60424b, "handleComplete", new Object[0]);
        B b10 = vastView.f60453w;
        b10.f60465k = true;
        if (!vastView.M && !b10.f60464j) {
            b10.f60464j = true;
            io.bidmachine.iab.vast.f fVar = vastView.f60455y;
            if (fVar != null) {
                fVar.onVideoCompleted();
            }
            a0 a0Var = vastView.f60454x;
            if (a0Var != null) {
                ((vm.a) a0Var).onComplete(vastView, vastView.f60452v);
            }
            io.bidmachine.iab.vast.t tVar = vastView.f60452v;
            if (tVar != null && tVar.isR2() && !vastView.f60453w.f60468n) {
                vastView.x();
            }
            vastView.o(io.bidmachine.iab.vast.a.f60395h);
        }
        if (vastView.f60453w.f60464j) {
            vastView.y();
        }
    }

    public final void A() throws IllegalStateException {
        if (!isPlaybackStarted() || this.f60453w.f60463i) {
            return;
        }
        io.bidmachine.iab.vast.e.d(this.f60424b, "pausePlayback", new Object[0]);
        B b10 = this.f60453w;
        b10.f60463i = true;
        b10.f60460f = this.f60446p.getCurrentPosition();
        this.f60446p.pause();
        removeCallbacks(this.S);
        Iterator it = this.Q.iterator();
        while (it.hasNext()) {
            ((s) it.next()).cancelHide();
        }
        o(io.bidmachine.iab.vast.a.f60399l);
        io.bidmachine.iab.vast.f fVar = this.f60455y;
        if (fVar != null) {
            fVar.onVideoPaused();
        }
    }

    public final void B() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        B b10 = this.f60453w;
        if (!b10.f60469o) {
            if (isPlaybackStarted()) {
                this.f60446p.start();
                this.f60446p.pause();
                setLoadingViewVisibility(false);
                return;
            } else {
                if (this.f60453w.f60466l) {
                    return;
                }
                startPlayback("resumePlayback (canAutoResume: false)");
                return;
            }
        }
        if (b10.f60463i && this.G) {
            io.bidmachine.iab.vast.e.d(this.f60424b, "resumePlayback", new Object[0]);
            this.f60453w.f60463i = false;
            if (!isPlaybackStarted()) {
                if (this.f60453w.f60466l) {
                    return;
                }
                startPlayback("resumePlayback");
                return;
            }
            this.f60446p.start();
            if (isLoaded()) {
                Iterator it = this.Q.iterator();
                while (it.hasNext()) {
                    ((s) it.next()).toggleShow();
                }
            }
            this.V.clear();
            this.W = 0;
            this.f60423a0 = 0.0f;
            vm.d dVar = this.S;
            removeCallbacks(dVar);
            dVar.run();
            setLoadingViewVisibility(false);
            o(io.bidmachine.iab.vast.a.f60400m);
            io.bidmachine.iab.vast.f fVar = this.f60455y;
            if (fVar != null) {
                fVar.onVideoResumed();
            }
        }
    }

    public final void C() {
        u uVar;
        if (!isPlaybackStarted() || (uVar = this.f60442l) == null) {
            return;
        }
        uVar.setMuted(this.f60453w.f60462h);
        if (this.f60453w.f60462h) {
            this.f60446p.setVolume(0.0f, 0.0f);
            io.bidmachine.iab.vast.f fVar = this.f60455y;
            if (fVar != null) {
                fVar.onVideoVolumeChanged(0.0f);
                return;
            }
            return;
        }
        this.f60446p.setVolume(1.0f, 1.0f);
        io.bidmachine.iab.vast.f fVar2 = this.f60455y;
        if (fVar2 != null) {
            fVar2.onVideoVolumeChanged(1.0f);
        }
    }

    public final void D() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        if (!this.G || !VastHelper.isScreenOn(getContext())) {
            A();
            return;
        }
        if (this.H) {
            this.H = false;
            startPlayback("onWindowFocusChanged");
        } else if (this.f60453w.f60466l) {
            setLoadingViewVisibility(false);
        } else {
            B();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
        this.f60433g.bringToFront();
    }

    public final void c(io.bidmachine.iab.vast.t tVar, VastAd vastAd, qm.a aVar, boolean z10) {
        tVar.setVastVideoLoadedListener(new vm.n(this, z10, aVar));
        ym.e appodealExtension = vastAd.getAppodealExtension();
        p pVarB = b(appodealExtension, appodealExtension != null ? appodealExtension.getCountDownStyle() : null);
        an.e eVar = this.f60435h;
        eVar.setCountDownStyle(pVarB);
        if (isFullscreen()) {
            eVar.setCloseStyle(b(appodealExtension, appodealExtension != null ? appodealExtension.getCloseStyle() : null));
            eVar.setCloseClickListener(new o(this));
        }
        r(appodealExtension);
        setPlaceholderViewVisible(true);
        setLoadingViewVisibility(true);
    }

    @Override // um.k
    public void clickHandleCanceled() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        if (isCompanionShown()) {
            setLoadingViewVisibility(false);
        } else {
            B();
        }
    }

    @Override // um.k
    public void clickHandleError() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        if (isPlaybackStarted()) {
            B();
        } else if (isCompanionShown()) {
            u();
        } else {
            m(false);
        }
    }

    @Override // um.k
    public void clickHandled() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        if (isCompanionShown()) {
            setLoadingViewVisibility(false);
        } else if (this.G) {
            B();
        } else {
            A();
        }
    }

    public final void d(io.bidmachine.iab.vast.t tVar, VastAd vastAd, boolean z10) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        ym.e appodealExtension = vastAd.getAppodealExtension();
        this.C = tVar.getPreferredVideoOrientation();
        if (appodealExtension == null || !appodealExtension.getCtaStyle().isVisible().booleanValue()) {
            this.f60448r = null;
        } else {
            this.f60448r = appodealExtension.getCompanionTag();
        }
        if (this.f60448r == null) {
            this.f60448r = vastAd.getBanner(getContext());
        }
        w(appodealExtension);
        FrameLayout frameLayout = this.f60447q;
        FrameLayout frameLayout2 = this.f60433g;
        ArrayList arrayList = this.Q;
        if (frameLayout == null && (appodealExtension == null || appodealExtension.getCtaStyle().isVisible().booleanValue())) {
            if (this.f60445o == null) {
                n nVar = new n(new vm.p(this));
                this.f60445o = nVar;
                arrayList.add(nVar);
            }
            this.f60445o.attach(getContext(), frameLayout2, b(appodealExtension, appodealExtension != null ? appodealExtension.getCtaStyle() : null));
        } else {
            n nVar2 = this.f60445o;
            if (nVar2 != null) {
                nVar2.detach();
            }
        }
        if (appodealExtension == null || appodealExtension.getCloseStyle().isVisible().booleanValue()) {
            if (this.f60437i == null) {
                l lVar = new l(new f(this));
                this.f60437i = lVar;
                arrayList.add(lVar);
            }
            this.f60437i.attach(getContext(), frameLayout2, b(appodealExtension, appodealExtension != null ? appodealExtension.getCloseStyle() : null));
        } else {
            l lVar2 = this.f60437i;
            if (lVar2 != null) {
                lVar2.detach();
            }
        }
        if (appodealExtension == null || appodealExtension.getCountDownStyle().isVisible().booleanValue()) {
            if (this.f60439j == null) {
                m mVar = new m(null);
                this.f60439j = mVar;
                arrayList.add(mVar);
            }
            this.f60439j.attach(getContext(), frameLayout2, b(appodealExtension, appodealExtension != null ? appodealExtension.getCountDownStyle() : null));
        } else {
            m mVar2 = this.f60439j;
            if (mVar2 != null) {
                mVar2.detach();
            }
        }
        if (appodealExtension == null || appodealExtension.getMuteStyle().isVisible().booleanValue()) {
            if (this.f60442l == null) {
                u uVar = new u(new vm.q(this));
                this.f60442l = uVar;
                arrayList.add(uVar);
            }
            this.f60442l.attach(getContext(), frameLayout2, b(appodealExtension, appodealExtension != null ? appodealExtension.getMuteStyle() : null));
        } else {
            u uVar2 = this.f60442l;
            if (uVar2 != null) {
                uVar2.detach();
            }
        }
        if (appodealExtension == null || !appodealExtension.getRepeatStyle().isVisible().booleanValue()) {
            w wVar = this.f60441k;
            if (wVar != null) {
                wVar.detach();
            }
        } else {
            if (this.f60441k == null) {
                w wVar2 = new w(new g(this));
                this.f60441k = wVar2;
                arrayList.add(wVar2);
            }
            this.f60441k.attach(getContext(), frameLayout2, b(appodealExtension, appodealExtension.getRepeatStyle()));
        }
        if (appodealExtension == null || appodealExtension.getProgressStyle().isVisible().booleanValue()) {
            if (this.f60444n == null) {
                um.v vVar = new um.v(null);
                this.f60444n = vVar;
                arrayList.add(vVar);
            }
            this.f60444n.attach(getContext(), frameLayout2, b(appodealExtension, appodealExtension != null ? appodealExtension.getProgressStyle() : null));
            this.f60444n.changePercentage(0.0f, 0, 0);
        } else {
            um.v vVar2 = this.f60444n;
            if (vVar2 != null) {
                vVar2.detach();
            }
        }
        r(appodealExtension);
        if (appodealExtension != null && appodealExtension.isVideoClickable()) {
            arrayList.clear();
        }
        setLoadingViewVisibility(false);
        sm.c cVar = this.f60456z;
        zm.c cVar2 = this.f60426c;
        if (cVar != null) {
            cVar.registerAdContainer(this);
            this.f60456z.registerAdView(cVar2);
        }
        a0 a0Var = this.f60454x;
        if (a0Var != null) {
            ((vm.a) a0Var).onOrientationRequested(this, tVar, this.f60453w.f60466l ? this.D : this.C);
        }
        if (!z10) {
            this.f60453w.f60457b = tVar.getId();
            B b10 = this.f60453w;
            b10.f60469o = this.N;
            b10.f60470p = this.O;
            if (appodealExtension != null) {
                b10.f60462h = appodealExtension.isMuted();
            }
            this.f60453w.f60458c = tVar.getFusedVideoCloseTimeSec();
            sm.c cVar3 = this.f60456z;
            if (cVar3 != null) {
                cVar3.onAdViewReady(cVar2);
                this.f60456z.onAdShown();
            }
            a0 a0Var2 = this.f60454x;
            if (a0Var2 != null) {
                ((vm.a) a0Var2).onShown(this, tVar);
            }
        }
        setCloseControlsVisible(tVar.getVideoType() != b0.f60482c || tVar.getMaxDurationMillis() <= 0);
        startPlayback("load (restoring: " + z10 + ")");
    }

    public void destroy() {
        q qVar = this.f60451u;
        if (qVar != null) {
            qVar.destroy();
            this.f60451u = null;
            this.f60449s = null;
        }
        this.f60454x = null;
        this.f60455y = null;
        this.f60456z = null;
        this.A = null;
        v vVar = this.B;
        if (vVar != null) {
            vVar.f89334g = true;
            this.B = null;
        }
    }

    public boolean display(io.bidmachine.iab.vast.t tVar, Boolean bool) {
        return i(tVar, bool, false);
    }

    public final void g(List list) {
        if (isLoaded()) {
            if (list != null && !list.isEmpty()) {
                this.f60452v.fireUrls(list, null);
            } else {
                io.bidmachine.iab.vast.e.d(this.f60424b, "\turl list is null", new Object[0]);
            }
        }
    }

    public a0 getListener() {
        return this.f60454x;
    }

    public final void h(Map map, io.bidmachine.iab.vast.a aVar) {
        if (map != null && !map.isEmpty()) {
            g((List) map.get(aVar));
        } else {
            io.bidmachine.iab.vast.e.d(this.f60424b, "Processing Event - fail: %s (tracking event map is null or empty)", aVar);
        }
    }

    public void handleBackPress() throws IllegalStateException {
        an.e eVar = this.f60435h;
        if (eVar.isVisible() && eVar.canBeClosed()) {
            l(this.f60454x, this.f60452v, qm.b.placeholder("OnBackPress event fired"));
            return;
        }
        if (isSkipEnabled()) {
            if (isCompanionShown()) {
                io.bidmachine.iab.vast.t tVar = this.f60452v;
                if (tVar == null || tVar.getVideoType() != b0.f60481b) {
                    return;
                }
                if (this.f60449s == null) {
                    t();
                    return;
                }
                q qVar = this.f60451u;
                if (qVar != null) {
                    qVar.dispatchClose();
                    return;
                } else {
                    u();
                    return;
                }
            }
            io.bidmachine.iab.vast.e.e(this.f60424b, "performVideoCloseClick", new Object[0]);
            stopPlayback();
            if (this.M) {
                t();
                return;
            }
            if (!this.f60453w.f60464j) {
                o(io.bidmachine.iab.vast.a.f60398k);
                io.bidmachine.iab.vast.f fVar = this.f60455y;
                if (fVar != null) {
                    fVar.onVideoSkipped();
                }
            }
            io.bidmachine.iab.vast.t tVar2 = this.f60452v;
            if (tVar2 != null && tVar2.getVideoType() == b0.f60482c) {
                io.bidmachine.iab.vast.f fVar2 = this.f60455y;
                if (fVar2 != null) {
                    fVar2.onVideoCompleted();
                }
                a0 a0Var = this.f60454x;
                if (a0Var != null) {
                    ((vm.a) a0Var).onComplete(this, this.f60452v);
                }
            }
            y();
        }
    }

    public final boolean i(io.bidmachine.iab.vast.t tVar, Boolean bool, boolean z10) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        stopPlayback();
        if (!z10) {
            this.f60453w = new B();
        }
        if (bool != null) {
            this.f60453w.f60461g = bool.booleanValue();
        }
        this.f60452v = tVar;
        String str = this.f60424b;
        if (tVar == null) {
            t();
            io.bidmachine.iab.vast.e.e(str, "VastRequest is null. Stop playing...", new Object[0]);
            return false;
        }
        VastAd vastAd = tVar.getVastAd();
        if (vastAd == null) {
            t();
            io.bidmachine.iab.vast.e.e(str, "VastAd is null. Stop playing...", new Object[0]);
            return false;
        }
        qm.a cacheControl = tVar.getCacheControl();
        if (cacheControl == qm.a.f83290e && !isVideoFileLoaded()) {
            c(tVar, vastAd, cacheControl, z10);
            return true;
        }
        if (cacheControl != qm.a.f83289c || isVideoFileLoaded()) {
            d(tVar, vastAd, z10);
            return true;
        }
        c(tVar, vastAd, cacheControl, z10);
        tVar.performCache(getContext().getApplicationContext(), null);
        return true;
    }

    public boolean isCompanionShown() {
        return this.f60453w.f60466l;
    }

    public boolean isFinished() {
        io.bidmachine.iab.vast.t tVar = this.f60452v;
        if (tVar == null) {
            return false;
        }
        if (tVar.getCompanionCloseTime() == 0.0f && this.f60453w.f60464j) {
            return true;
        }
        return this.f60452v.getCompanionCloseTime() > 0.0f && this.f60453w.f60466l;
    }

    public boolean isFullscreen() {
        return this.f60453w.f60461g;
    }

    public boolean isLoaded() {
        io.bidmachine.iab.vast.t tVar = this.f60452v;
        return (tVar == null || tVar.getVastAd() == null) ? false : true;
    }

    public boolean isPlaybackStarted() {
        return this.f60446p != null && this.L;
    }

    public boolean isSkipEnabled() {
        B b10 = this.f60453w;
        return b10.f60465k || b10.f60458c == 0.0f;
    }

    public boolean isVideoFileLoaded() {
        io.bidmachine.iab.vast.t tVar = this.f60452v;
        return tVar != null && tVar.checkFile();
    }

    public final boolean j(List list, String str) throws IllegalStateException {
        io.bidmachine.iab.vast.e.d(this.f60424b, "processClickThroughEvent: %s", str);
        this.f60453w.f60468n = true;
        if (str == null) {
            return false;
        }
        g(list);
        sm.c cVar = this.f60456z;
        if (cVar != null) {
            cVar.onAdClicked();
        }
        if (this.f60454x != null && this.f60452v != null) {
            A();
            setLoadingViewVisibility(true);
            ((vm.a) this.f60454x).onClick(this, this.f60452v, this, str);
        }
        return true;
    }

    public final void k(boolean z10) {
        if (isLoaded()) {
            if (!z10) {
                ym.g companion = this.f60452v.getVastAd().getCompanion(getAvailableWidth(), getAvailableHeight());
                if (this.f60449s != companion) {
                    if (companion == null || !this.f60452v.shouldUseScreenSizeForCompanionOrientation()) {
                        this.D = this.C;
                    } else {
                        this.D = h0.orientationBySize(companion.getWidth(), companion.getHeight());
                    }
                    this.f60449s = companion;
                    q qVar = this.f60451u;
                    if (qVar != null) {
                        qVar.destroy();
                        this.f60451u = null;
                    }
                }
            }
            if (this.f60449s == null) {
                if (this.f60450t == null) {
                    ImageView imageView = new ImageView(getContext());
                    imageView.setAdjustViewBounds(true);
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    this.f60450t = imageView;
                    return;
                }
                return;
            }
            if (this.f60451u == null) {
                ImageView imageView2 = this.f60450t;
                if (imageView2 != null) {
                    v vVar = this.B;
                    if (vVar != null) {
                        vVar.f89334g = true;
                        this.B = null;
                    }
                    removeView(imageView2);
                    this.f60450t = null;
                }
                String htmlForMraid = this.f60449s.getHtmlForMraid();
                if (htmlForMraid == null) {
                    n(qm.b.badContent("Companion creative is null"));
                    return;
                }
                ym.e appodealExtension = this.f60452v.getVastAd().getAppodealExtension();
                ym.o postBannerTag = appodealExtension != null ? appodealExtension.getPostBannerTag() : null;
                tm.o listener = q.newBuilder().setBaseUrl(null).setCacheControl(qm.a.f83288b).setCloseTime(this.f60452v.getCompanionCloseTime()).forceUseNativeCloseButton(this.f60452v.isForceUseNativeCloseTime()).setIsTag(false).setAdMeasurer(this.A).setListener(new h(this));
                if (postBannerTag != null) {
                    listener.setCloseStyle(postBannerTag.getCloseStyle());
                    listener.setCountDownStyle(postBannerTag.getCountDownStyle());
                    listener.setLoadingStyle(postBannerTag.getLoadingStyle());
                    listener.setProgressStyle(postBannerTag.getProgressStyle());
                    listener.setDurationSec(postBannerTag.getDurationSec());
                    listener.setProductLink(postBannerTag.getProductLink());
                    if (postBannerTag.isForceUseNativeClose()) {
                        listener.forceUseNativeCloseButton(true);
                    }
                    listener.setR1(postBannerTag.isR1());
                    listener.setR2(postBannerTag.isR2());
                }
                try {
                    q qVarBuild = listener.build(getContext());
                    this.f60451u = qVarBuild;
                    qVarBuild.load(htmlForMraid);
                } catch (Throwable th2) {
                    n(qm.b.throwable("Exception during companion creation", th2));
                }
            }
        }
    }

    public final void l(a0 a0Var, io.bidmachine.iab.vast.t tVar, qm.b bVar) {
        if (a0Var != null && tVar != null) {
            ((vm.a) a0Var).onShowFailed(this, tVar, bVar);
        }
        if (a0Var == null || tVar == null) {
            return;
        }
        ((vm.a) a0Var).onFinish(this, tVar, false);
    }

    public final void m(boolean z10) throws IllegalStateException {
        VastView vastView;
        a0 a0Var;
        if (!isLoaded() || this.K) {
            return;
        }
        this.K = true;
        this.f60453w.f60466l = true;
        int i10 = getResources().getConfiguration().orientation;
        int i11 = this.D;
        if (i10 != i11 && (a0Var = this.f60454x) != null) {
            ((vm.a) a0Var).onOrientationRequested(this, this.f60452v, i11);
        }
        um.v vVar = this.f60444n;
        if (vVar != null) {
            vVar.detach();
        }
        u uVar = this.f60442l;
        if (uVar != null) {
            uVar.detach();
        }
        w wVar = this.f60441k;
        if (wVar != null) {
            wVar.detach();
        }
        Iterator it = this.Q.iterator();
        while (it.hasNext()) {
            ((s) it.next()).cancelHide();
        }
        boolean z11 = this.f60453w.f60470p;
        FrameLayout frameLayout = this.f60433g;
        if (z11) {
            if (this.f60450t == null) {
                ImageView imageView = new ImageView(getContext());
                imageView.setAdjustViewBounds(true);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f60450t = imageView;
            }
            this.f60450t.setImageBitmap(this.f60426c.getBitmap());
            addView(this.f60450t, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringToFront();
            return;
        }
        k(z10);
        if (this.f60449s == null) {
            setCloseControlsVisible(true);
            if (this.f60450t != null) {
                vastView = this;
                vastView.B = new v(vastView, getContext(), this.f60452v.getFileUri(), this.f60452v.getVastAd().getPickedMediaFileTag().getText(), new WeakReference(this.f60450t));
            } else {
                vastView = this;
            }
            addView(vastView.f60450t, new FrameLayout.LayoutParams(-1, -1));
        } else {
            vastView = this;
            setCloseControlsVisible(false);
            vastView.f60429e.setVisibility(8);
            FrameLayout frameLayout2 = vastView.f60447q;
            if (frameLayout2 != null) {
                h0.removeFromParent(frameLayout2);
                vastView.f60447q = null;
            }
            n nVar = vastView.f60445o;
            if (nVar != null) {
                nVar.setVisibility(8);
            }
            q qVar = vastView.f60451u;
            if (qVar == null) {
                setLoadingViewVisibility(false);
                n(qm.b.internal("CompanionInterstitial is null"));
            } else if (qVar.isReady()) {
                setLoadingViewVisibility(false);
                vastView.f60451u.showInView(this, false);
            } else {
                setLoadingViewVisibility(true);
            }
        }
        stopPlayback();
        frameLayout.bringToFront();
        io.bidmachine.iab.vast.a aVar = io.bidmachine.iab.vast.a.f60390b;
        io.bidmachine.iab.vast.e.d(vastView.f60424b, "Track Companion Event: %s", aVar);
        ym.g gVar = vastView.f60449s;
        if (gVar != null) {
            h(gVar.getTrackingEventListMap(), aVar);
        }
    }

    public void mute() {
        setMute(true);
    }

    public final void n(qm.b bVar) {
        io.bidmachine.iab.vast.t tVar;
        io.bidmachine.iab.vast.e.e(this.f60424b, "handleCompanionShowError - %s", bVar);
        io.bidmachine.iab.vast.t tVar2 = this.f60452v;
        if (tVar2 != null) {
            tVar2.sendVastSpecError(io.bidmachine.iab.vast.w.f60563k);
        }
        a0 a0Var = this.f60454x;
        io.bidmachine.iab.vast.t tVar3 = this.f60452v;
        if (a0Var != null && tVar3 != null) {
            ((vm.a) a0Var).onShowFailed(this, tVar3, bVar);
        }
        if (this.f60449s != null) {
            z();
            m(true);
            return;
        }
        a0 a0Var2 = this.f60454x;
        if (a0Var2 == null || (tVar = this.f60452v) == null) {
            return;
        }
        ((vm.a) a0Var2).onFinish(this, tVar, isFinished());
    }

    public final void o(io.bidmachine.iab.vast.a aVar) {
        io.bidmachine.iab.vast.e.d(this.f60424b, "Track Event: %s", aVar);
        io.bidmachine.iab.vast.t tVar = this.f60452v;
        VastAd vastAd = tVar != null ? tVar.getVastAd() : null;
        if (vastAd != null) {
            h(vastAd.getTrackingEventListMap(), aVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        super.onAttachedToWindow();
        if (this.G) {
            startPlayback("onAttachedToWindow");
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (isLoaded()) {
            w(this.f60452v.getVastAd().getAppodealExtension());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() throws IllegalStateException {
        super.onDetachedFromWindow();
        stopPlayback();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        super.onRestoreInstanceState(zVar.getSuperState());
        B b10 = zVar.f60473b;
        if (b10 != null) {
            this.f60453w = b10;
        }
        io.bidmachine.iab.vast.t tVar = io.bidmachine.iab.vast.v.get(this.f60453w.f60457b);
        if (tVar != null) {
            i(tVar, null, true);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        if (isPlaybackStarted()) {
            this.f60453w.f60460f = this.f60446p.getCurrentPosition();
        }
        z zVar = new z(super.onSaveInstanceState());
        zVar.f60473b = this.f60453w;
        return zVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        vm.c cVar = this.R;
        removeCallbacks(cVar);
        post(cVar);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        super.onWindowFocusChanged(z10);
        io.bidmachine.iab.vast.e.d(this.f60424b, "onWindowFocusChanged: %s", Boolean.valueOf(z10));
        this.G = z10;
        D();
    }

    public final void p(qm.b bVar) throws IllegalStateException {
        io.bidmachine.iab.vast.e.e(this.f60424b, "handlePlaybackError - %s", bVar);
        this.M = true;
        io.bidmachine.iab.vast.t tVar = this.f60452v;
        if (tVar != null) {
            tVar.sendVastSpecError(io.bidmachine.iab.vast.w.f60562j);
        }
        a0 a0Var = this.f60454x;
        io.bidmachine.iab.vast.t tVar2 = this.f60452v;
        if (a0Var != null && tVar2 != null) {
            ((vm.a) a0Var).onShowFailed(this, tVar2, bVar);
        }
        y();
    }

    public void pause() throws IllegalStateException {
        setCanAutoResume(false);
        A();
    }

    public final void r(ym.e eVar) {
        if (eVar == null || eVar.getLoadingStyle().isVisible().booleanValue()) {
            if (this.f60443m == null) {
                this.f60443m = new t(null);
            }
            this.f60443m.attach(getContext(), this, b(eVar, eVar != null ? eVar.getLoadingStyle() : null));
        } else {
            t tVar = this.f60443m;
            if (tVar != null) {
                tVar.detach();
            }
        }
    }

    public void resume() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        setCanAutoResume(true);
        B();
    }

    public final void s() {
        int i10;
        int i11 = this.E;
        if (i11 == 0 || (i10 = this.F) == 0) {
            io.bidmachine.iab.vast.e.d(this.f60424b, "configureVideoSurface - skip: videoWidth or videoHeight is 0", new Object[0]);
        } else {
            this.f60426c.setVideoSize(i11, i10);
        }
    }

    public void setAdMeasurer(sm.c cVar) {
        this.f60456z = cVar;
    }

    public void setCanAutoResume(boolean z10) {
        this.N = z10;
        this.f60453w.f60469o = z10;
    }

    public void setCanIgnorePostBanner(boolean z10) {
        this.O = z10;
        this.f60453w.f60470p = z10;
    }

    public void setListener(a0 a0Var) {
        this.f60454x = a0Var;
    }

    public void setPlaybackListener(io.bidmachine.iab.vast.f fVar) {
        this.f60455y = fVar;
    }

    public void setPostBannerAdMeasurer(sm.b bVar) {
        this.A = bVar != null ? new a(this, bVar) : null;
    }

    public void startPlayback(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        String str2 = this.f60424b;
        io.bidmachine.iab.vast.e.d(str2, "startPlayback: %s", str);
        if (isLoaded()) {
            setPlaceholderViewVisible(false);
            if (this.f60453w.f60466l) {
                m(false);
                return;
            }
            if (!this.G) {
                this.H = true;
                return;
            }
            if (this.I) {
                stopPlayback();
                z();
                s();
                try {
                    if (isLoaded() && !this.f60453w.f60466l) {
                        if (this.f60446p == null) {
                            MediaPlayer mediaPlayer = new MediaPlayer();
                            this.f60446p = mediaPlayer;
                            mediaPlayer.setLooping(false);
                            this.f60446p.setAudioStreamType(3);
                            this.f60446p.setOnCompletionListener(this.f60427c0);
                            this.f60446p.setOnErrorListener(this.f60428d0);
                            this.f60446p.setOnPreparedListener(this.f60430e0);
                            this.f60446p.setOnVideoSizeChangedListener(this.f60432f0);
                        }
                        this.f60446p.setSurface(this.f60431f);
                        Uri fileUri = isVideoFileLoaded() ? this.f60452v.getFileUri() : null;
                        if (fileUri == null) {
                            setLoadingViewVisibility(true);
                            this.f60446p.setDataSource(this.f60452v.getVastAd().getPickedMediaFileTag().getText());
                        } else {
                            setLoadingViewVisibility(false);
                            this.f60446p.setDataSource(getContext(), fileUri);
                        }
                        this.f60446p.prepareAsync();
                    }
                } catch (Exception e10) {
                    io.bidmachine.iab.vast.e.e(str2, e10);
                    p(qm.b.throwable("Exception during preparing MediaPlayer", e10));
                }
                VastHelper.addScreenStateChangeListener(this, this.f60434g0);
            } else {
                this.J = true;
            }
            FrameLayout frameLayout = this.f60429e;
            if (frameLayout.getVisibility() != 0) {
                frameLayout.setVisibility(0);
            }
        }
    }

    public void stopPlayback() throws IllegalStateException {
        this.f60453w.f60463i = false;
        if (this.f60446p != null) {
            String str = this.f60424b;
            io.bidmachine.iab.vast.e.d(str, "stopPlayback", new Object[0]);
            try {
                if (this.f60446p.isPlaying()) {
                    this.f60446p.stop();
                }
                this.f60446p.setSurface(null);
                this.f60446p.release();
            } catch (Exception e10) {
                io.bidmachine.iab.vast.e.e(str, e10);
            }
            this.f60446p = null;
            this.L = false;
            this.M = false;
            removeCallbacks(this.S);
            VastHelper.removeScreenStateChangeListener(this);
        }
    }

    public final void t() {
        io.bidmachine.iab.vast.t tVar;
        io.bidmachine.iab.vast.e.e(this.f60424b, "handleClose", new Object[0]);
        o(io.bidmachine.iab.vast.a.f60402o);
        a0 a0Var = this.f60454x;
        if (a0Var == null || (tVar = this.f60452v) == null) {
            return;
        }
        ((vm.a) a0Var).onFinish(this, tVar, isFinished());
    }

    public final void u() {
        io.bidmachine.iab.vast.t tVar;
        String str = this.f60424b;
        io.bidmachine.iab.vast.e.e(str, "handleCompanionClose", new Object[0]);
        io.bidmachine.iab.vast.a aVar = io.bidmachine.iab.vast.a.f60402o;
        io.bidmachine.iab.vast.e.d(str, "Track Companion Event: %s", aVar);
        ym.g gVar = this.f60449s;
        if (gVar != null) {
            h(gVar.getTrackingEventListMap(), aVar);
        }
        a0 a0Var = this.f60454x;
        if (a0Var == null || (tVar = this.f60452v) == null) {
            return;
        }
        ((vm.a) a0Var).onFinish(this, tVar, isFinished());
    }

    public void unmute() {
        setMute(false);
    }

    public final void w(ym.e eVar) {
        p pVarCopyWith;
        p pVarCopyWith2 = eVar != null ? um.a.f88536o.copyWith(eVar.getVideoStyle()) : um.a.f88536o;
        View view = this.f60429e;
        if (eVar == null || !eVar.isVideoClickable()) {
            view.setOnClickListener(null);
            view.setClickable(false);
        } else {
            view.setOnClickListener(new r(this));
        }
        view.setBackgroundColor(pVarCopyWith2.getFillColor().intValue());
        FrameLayout frameLayout = this.f60447q;
        if (frameLayout != null) {
            h0.removeFromParent(frameLayout);
            this.f60447q = null;
        }
        if (this.f60448r == null || this.f60453w.f60466l) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            view.setLayoutParams(layoutParams);
            return;
        }
        Context context = getContext();
        ym.g gVar = this.f60448r;
        boolean zIsTablet = h0.isTablet(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(h0.dpToPx(context, gVar.getWidth() > 0 ? gVar.getWidth() : zIsTablet ? 728.0f : 320.0f), h0.dpToPx(context, gVar.getHeight() > 0 ? gVar.getHeight() : zIsTablet ? 90.0f : 50.0f));
        WebView webView = new WebView(context);
        webView.setId(h0.generateViewId());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollContainer(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setScrollBarStyle(33554432);
        webView.setFocusableInTouchMode(false);
        webView.setBackgroundColor(0);
        webView.setOnTouchListener(this.f60436h0);
        webView.setWebViewClient(this.f60440j0);
        webView.setWebChromeClient(this.f60438i0);
        String html = gVar.getHtml();
        if (html != null) {
            webView.loadDataWithBaseURL("", html, "text/html", G5.N, null);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(h0.generateViewId());
        frameLayout2.setLayoutParams(layoutParams2);
        frameLayout2.addView(webView, new FrameLayout.LayoutParams(-1, -1));
        this.f60447q = frameLayout2;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(this.f60447q.getLayoutParams());
        if ("inline".equals(pVarCopyWith2.getStyle())) {
            pVarCopyWith = um.a.f88531j;
            if (getResources().getConfiguration().orientation == 2) {
                layoutParams3.addRule(15);
                layoutParams4.height = -1;
                layoutParams4.addRule(10);
                layoutParams4.addRule(12);
                if (pVarCopyWith2.getHorizontalPosition().intValue() == 3) {
                    layoutParams3.addRule(9);
                    layoutParams3.addRule(0, this.f60447q.getId());
                    layoutParams4.addRule(11);
                } else {
                    layoutParams3.addRule(11);
                    layoutParams3.addRule(1, this.f60447q.getId());
                    layoutParams4.addRule(9);
                }
            } else {
                layoutParams3.addRule(14);
                layoutParams4.width = -1;
                layoutParams4.addRule(9);
                layoutParams4.addRule(11);
                if (pVarCopyWith2.getVerticalPosition().intValue() == 48) {
                    layoutParams3.addRule(10);
                    layoutParams3.addRule(2, this.f60447q.getId());
                    layoutParams4.addRule(12);
                } else {
                    layoutParams3.addRule(12);
                    layoutParams3.addRule(3, this.f60447q.getId());
                    layoutParams4.addRule(10);
                }
            }
        } else {
            p pVar = um.a.f88530i;
            layoutParams3.addRule(13);
            pVarCopyWith = pVar;
        }
        if (eVar != null) {
            pVarCopyWith = pVarCopyWith.copyWith(eVar.getCtaStyle());
        }
        pVarCopyWith.applyPadding(getContext(), this.f60447q);
        pVarCopyWith.applyMargin(getContext(), layoutParams4);
        pVarCopyWith.applyRelativeAlignment(layoutParams4);
        this.f60447q.setBackgroundColor(pVarCopyWith.getFillColor().intValue());
        pVarCopyWith2.applyPadding(getContext(), view);
        pVarCopyWith2.applyMargin(getContext(), layoutParams3);
        view.setLayoutParams(layoutParams3);
        addView(this.f60447q, layoutParams4);
        io.bidmachine.iab.vast.a aVar = io.bidmachine.iab.vast.a.f60390b;
        io.bidmachine.iab.vast.e.d(this.f60424b, "Track Banner Event: %s", aVar);
        ym.g gVar2 = this.f60448r;
        if (gVar2 != null) {
            h(gVar2.getTrackingEventListMap(), aVar);
        }
    }

    public final boolean x() {
        io.bidmachine.iab.vast.e.e(this.f60424b, "handleInfoClicked", new Object[0]);
        io.bidmachine.iab.vast.t tVar = this.f60452v;
        if (tVar != null) {
            return j(tVar.getVastAd().getClickTrackingUrlList(), this.f60452v.getVastAd().getClickThroughUrl());
        }
        return false;
    }

    public final void y() throws IllegalStateException {
        io.bidmachine.iab.vast.e.d(this.f60424b, "finishVideoPlaying", new Object[0]);
        stopPlayback();
        io.bidmachine.iab.vast.t tVar = this.f60452v;
        if (tVar == null || tVar.isAutoClose() || !(this.f60452v.getVastAd().getAppodealExtension() == null || this.f60452v.getVastAd().getAppodealExtension().getPostBannerTag().isVisible())) {
            t();
            return;
        }
        if (isSkipEnabled()) {
            o(io.bidmachine.iab.vast.a.f60402o);
        }
        setLoadingViewVisibility(false);
        FrameLayout frameLayout = this.f60447q;
        if (frameLayout != null) {
            h0.removeFromParent(frameLayout);
            this.f60447q = null;
        }
        m(false);
    }

    public final void z() {
        ImageView imageView = this.f60450t;
        if (imageView == null) {
            q qVar = this.f60451u;
            if (qVar != null) {
                qVar.destroy();
                this.f60451u = null;
                this.f60449s = null;
            }
        } else if (imageView != null) {
            v vVar = this.B;
            if (vVar != null) {
                vVar.f89334g = true;
                this.B = null;
            }
            removeView(imageView);
            this.f60450t = null;
        }
        this.K = false;
    }

    public VastView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VastView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f60424b = "VastView-" + Integer.toHexString(hashCode());
        this.f60453w = new B();
        this.C = 0;
        this.D = 0;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = true;
        this.O = false;
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = new vm.c(this);
        this.S = new vm.d(this);
        this.T = new b(this);
        this.U = new c(this);
        this.V = new LinkedList();
        this.W = 0;
        this.f60423a0 = 0.0f;
        this.f60425b0 = new vm.e(this);
        vm.f fVar = new vm.f(this);
        this.f60427c0 = new vm.g(this);
        this.f60428d0 = new vm.h(this);
        this.f60430e0 = new d(this);
        this.f60432f0 = new vm.i(this);
        this.f60434g0 = new j(this);
        this.f60436h0 = new vm.k(this);
        this.f60438i0 = new vm.l();
        this.f60440j0 = new vm.m(this);
        setBackgroundColor(-16777216);
        setOnClickListener(new e(this));
        zm.c cVar = new zm.c(context);
        this.f60426c = cVar;
        cVar.setSurfaceTextureListener(fVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f60429e = frameLayout;
        frameLayout.addView(cVar, new FrameLayout.LayoutParams(-1, -1, 17));
        addView(frameLayout, new RelativeLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f60433g = frameLayout2;
        frameLayout2.setBackgroundColor(0);
        addView(frameLayout2, new ViewGroup.LayoutParams(-1, -1));
        an.e eVar = new an.e(getContext());
        this.f60435h = eVar;
        eVar.setBackgroundColor(0);
        addView(eVar, new ViewGroup.LayoutParams(-1, -1));
    }
}
