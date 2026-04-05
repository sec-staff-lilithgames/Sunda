package com.ironsource;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.AbstractC3438s3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class L2 extends AbstractC3438s3<InterfaceC3418r0> implements BannerAdListener, C0 {

    /* renamed from: t, reason: collision with root package name */
    public static final String f34791t = "bannerLayout";

    /* renamed from: u, reason: collision with root package name */
    public static final String f34792u = "bannerSize";

    /* renamed from: r, reason: collision with root package name */
    private final com.ironsource.mediationsdk.q f34793r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f34794s;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends AbstractRunnableC3273ie {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f34795b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FrameLayout.LayoutParams f34796c;

        public a(View view, FrameLayout.LayoutParams layoutParams) {
            this.f34795b = view;
            this.f34796c = layoutParams;
        }

        @Override // com.ironsource.AbstractRunnableC3273ie
        public void a() {
            L2.this.a(this.f34795b, this.f34796c);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends AbstractRunnableC3273ie {
        public b() {
        }

        @Override // com.ironsource.AbstractRunnableC3273ie
        public void a() {
            L2.this.J();
        }
    }

    public L2(InterfaceC3482ud interfaceC3482ud, C3312l0 c3312l0, BaseAdAdapter<?, AdapterAdViewListener> baseAdAdapter, com.ironsource.mediationsdk.q qVar, C3325ld c3325ld, boolean z10, C3352n2 c3352n2, InterfaceC3418r0 interfaceC3418r0) {
        super(interfaceC3482ud, c3312l0, baseAdAdapter, new C3134b1(c3312l0.g(), c3312l0.g().getBannerSettings(), IronSource.a.BANNER), c3352n2, interfaceC3418r0);
        this.f34793r = qVar;
        this.f38336g = c3325ld;
        this.f34794s = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        if (y()) {
            super.onAdOpened();
            return;
        }
        if (this.f38334e == AbstractC3438s3.h.FAILED) {
            return;
        }
        ironLog.error("unexpected onAdOpened for " + k() + ", state - " + this.f38334e);
        if (this.f38333d != null) {
            this.f38333d.f33941j.q("unexpected onAdOpened, state - " + this.f38334e);
        }
    }

    @Override // com.ironsource.AbstractC3438s3
    public void G() {
        Object obj = this.f38332c;
        if (obj instanceof AdapterBannerInterface) {
            ((AdapterBannerInterface) obj).loadAd(this.f38340k, ContextProvider.getInstance().getCurrentActiveActivity(), this.f34793r.getSize(), this);
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
        }
    }

    @Override // com.ironsource.AbstractC3438s3
    public boolean O() {
        return false;
    }

    public void R() {
        Object obj = this.f38332c;
        if (obj instanceof AdapterBindAdViewInterface) {
            ((AdapterBindAdViewInterface) obj).onAdViewWillBind(this.f38340k);
        }
    }

    @Override // com.ironsource.AbstractC3438s3
    public AdData a(String str, Map<String, Object> map) {
        return new AdData(str, q(), a(map));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        D0 d02;
        C3325ld c3325ld = this.f38336g;
        if (c3325ld != null && (d02 = this.f38333d) != null) {
            d02.f33940i.f(c3325ld.c());
        }
        Listener listener = this.f38331b;
        if (listener != 0) {
            ((InterfaceC3418r0) listener).c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams) {
        if (u().e()) {
            u().a(new a(view, layoutParams));
        } else {
            a(view, layoutParams);
        }
    }

    @Override // com.ironsource.AbstractC3438s3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (u().e()) {
            u().a(new b());
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        D0 d02;
        C3325ld c3325ld = this.f38336g;
        if (c3325ld != null && (d02 = this.f38333d) != null) {
            d02.f33940i.c(c3325ld.c());
        }
        Listener listener = this.f38331b;
        if (listener != 0) {
            ((InterfaceC3418r0) listener).b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        D0 d02;
        C3325ld c3325ld = this.f38336g;
        if (c3325ld != null && (d02 = this.f38333d) != null) {
            d02.f33940i.h(c3325ld.c());
        }
        Listener listener = this.f38331b;
        if (listener != 0) {
            ((InterfaceC3418r0) listener).f(this);
        }
    }

    @Override // com.ironsource.AbstractC3438s3
    public boolean v() {
        return this.f34794s;
    }

    public void P() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(k());
        a(AbstractC3438s3.h.NONE);
        Object obj = this.f38332c;
        if (obj == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (obj instanceof AdapterBannerInterface) {
                ((AdapterBannerInterface) obj).destroyAd(this.f38340k);
            } else {
                ironLog.error(a("adapter not instance of AdapterBannerInterface"));
            }
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            String str = "destroyBanner - exception = " + th2.getLocalizedMessage() + " state = " + this.f38334e;
            IronLog.INTERNAL.error(a(str));
            D0 d02 = this.f38333d;
            if (d02 != null) {
                d02.f33941j.g(str);
            }
        }
        D0 d03 = this.f38333d;
        if (d03 != null) {
            d03.f33937f.a(r().intValue());
        }
    }

    public void Q() {
        Object obj = this.f38332c;
        if (obj instanceof AdapterBindAdViewInterface) {
            ((AdapterBindAdViewInterface) obj).onAdViewBound(this.f38340k);
        }
    }

    @Override // com.ironsource.AbstractC3438s3
    public Map<String, Object> a(Map<String, Object> map) {
        Map<String, Object> mapA = super.a(map);
        C3312l0 c3312l0 = this.f38330a;
        if (c3312l0 != null && this.f34793r != null && TextUtils.isEmpty(c3312l0.g().getCustomNetwork())) {
            mapA.put(f34791t, this.f34793r);
        }
        return mapA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, FrameLayout.LayoutParams layoutParams) {
        Listener listener;
        super.onAdLoadSuccess();
        if (!y() || (listener = this.f38331b) == 0) {
            return;
        }
        ((InterfaceC3418r0) listener).a(this, view, layoutParams);
    }

    @Override // com.ironsource.AbstractC3438s3, com.ironsource.C0
    public Map<String, Object> a(A0 a02) {
        Map<String, Object> mapA = super.a(a02);
        com.ironsource.mediationsdk.q qVar = this.f34793r;
        if (qVar != null && !qVar.b()) {
            com.ironsource.mediationsdk.l.a(mapA, this.f34793r.getSize());
        }
        if (this.f38336g != null) {
            mapA.put("placement", j());
        }
        return mapA;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(int i10, String str) {
    }
}
