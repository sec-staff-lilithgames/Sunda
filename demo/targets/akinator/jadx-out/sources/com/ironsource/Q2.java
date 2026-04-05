package com.ironsource;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.C3313l1;
import com.ironsource.InterfaceC3260i1;
import com.ironsource.P8;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.ironsourceads.banner.BannerAdInfo;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Q2 implements D2 {

    /* renamed from: a, reason: collision with root package name */
    private final M9 f35224a;

    /* renamed from: b, reason: collision with root package name */
    private final C3302k8 f35225b;

    /* renamed from: c, reason: collision with root package name */
    private final W1 f35226c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3386p1 f35227d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3342mc f35228e;

    /* renamed from: f, reason: collision with root package name */
    private final Tf f35229f;

    /* renamed from: g, reason: collision with root package name */
    private final P8 f35230g;

    /* renamed from: h, reason: collision with root package name */
    private final P8.a f35231h;

    /* renamed from: i, reason: collision with root package name */
    private BannerAdInfo f35232i;

    /* renamed from: j, reason: collision with root package name */
    private WeakReference<R2> f35233j;

    /* renamed from: k, reason: collision with root package name */
    private WeakReference<FrameLayout> f35234k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(v10, "v");
            C3267i8 size = Q2.this.d().getSize();
            ((FrameLayout) v10).addView(Q2.this.d(), 0, new FrameLayout.LayoutParams(size.c(), size.a(), 17));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(v10, "v");
            ((FrameLayout) v10).removeAllViews();
        }
    }

    public Q2(M9 adInstance, C3302k8 container, W1 auctionDataReporter, InterfaceC3386p1 analytics, InterfaceC3342mc networkDestroyAPI, Tf threadManager, P8 sessionDepthService, P8.a sessionDepthServiceEditor) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstance, "adInstance");
        kotlin.jvm.internal.e0.checkNotNullParameter(container, "container");
        kotlin.jvm.internal.e0.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        kotlin.jvm.internal.e0.checkNotNullParameter(analytics, "analytics");
        kotlin.jvm.internal.e0.checkNotNullParameter(networkDestroyAPI, "networkDestroyAPI");
        kotlin.jvm.internal.e0.checkNotNullParameter(threadManager, "threadManager");
        kotlin.jvm.internal.e0.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        kotlin.jvm.internal.e0.checkNotNullParameter(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        this.f35224a = adInstance;
        this.f35225b = container;
        this.f35226c = auctionDataReporter;
        this.f35227d = analytics;
        this.f35228e = networkDestroyAPI;
        this.f35229f = threadManager;
        this.f35230g = sessionDepthService;
        this.f35231h = sessionDepthServiceEditor;
        String strF = adInstance.f();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strF, "adInstance.instanceId");
        String strE = adInstance.e();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "adInstance.id");
        this.f35232i = new BannerAdInfo(strF, strE);
        this.f35233j = new WeakReference<>(null);
        this.f35234k = new WeakReference<>(null);
        Kc kc2 = new Kc();
        adInstance.a(kc2);
        kc2.a(this);
    }

    public final void a(BannerAdInfo bannerAdInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bannerAdInfo, "<set-?>");
        this.f35232i = bannerAdInfo;
    }

    public final void b(WeakReference<FrameLayout> value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        this.f35234k = value;
        FrameLayout frameLayout = value.get();
        if (frameLayout != null) {
            frameLayout.addOnAttachStateChangeListener(a());
        }
    }

    public final BannerAdInfo c() {
        return this.f35232i;
    }

    public final void finalize() {
        b();
    }

    @Override // com.ironsource.D2
    public void onBannerClick() {
        InterfaceC3260i1.a.f36886a.a().a(this.f35227d);
        this.f35229f.a(new nh(this, 1));
    }

    @Override // com.ironsource.D2
    public void onBannerShowSuccess() {
        P8 p82 = this.f35230g;
        IronSource.a aVar = IronSource.a.BANNER;
        InterfaceC3260i1.a.f36886a.f(new C3313l1.w(p82.a(aVar))).a(this.f35227d);
        this.f35231h.b(aVar);
        this.f35226c.b("onBannerShowSuccess");
        this.f35229f.a(new nh(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Q2 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        R2 r22 = this$0.f35233j.get();
        if (r22 != null) {
            r22.onBannerAdShown();
        }
    }

    public final void a(WeakReference<R2> weakReference) {
        kotlin.jvm.internal.e0.checkNotNullParameter(weakReference, "<set-?>");
        this.f35233j = weakReference;
    }

    public final C3302k8 d() {
        return this.f35225b;
    }

    public final WeakReference<R2> e() {
        return this.f35233j;
    }

    public final WeakReference<FrameLayout> f() {
        return this.f35234k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Q2 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        InterfaceC3260i1.d.f36909a.b().a(this$0.f35227d);
        this$0.f35228e.a(this$0.f35224a);
    }

    public final void b() {
        Tf.a(this.f35229f, new nh(this, 0), 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Q2 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        R2 r22 = this$0.f35233j.get();
        if (r22 != null) {
            r22.onBannerAdClicked();
        }
    }

    private final a a() {
        return new a();
    }

    public /* synthetic */ Q2(M9 m9, C3302k8 c3302k8, W1 w12, InterfaceC3386p1 interfaceC3386p1, InterfaceC3342mc interfaceC3342mc, Tf tf2, P8 p82, P8.a aVar, int i10, kotlin.jvm.internal.u uVar) {
        this(m9, c3302k8, w12, interfaceC3386p1, (i10 & 16) != 0 ? new C3362nc() : interfaceC3342mc, (i10 & 32) != 0 ? V7.f35633a : tf2, (i10 & 64) != 0 ? Mb.f34856s.d().s() : p82, (i10 & 128) != 0 ? Mb.f34856s.a().h() : aVar);
    }
}
