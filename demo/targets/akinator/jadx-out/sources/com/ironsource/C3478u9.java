package com.ironsource;

import android.app.Activity;
import com.ironsource.C3313l1;
import com.ironsource.InterfaceC3260i1;
import com.ironsource.P8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdInfo;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.u9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3478u9 implements InterfaceC3229g6 {

    /* renamed from: a, reason: collision with root package name */
    private M9 f39047a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC3115a0 f39048b;

    /* renamed from: c, reason: collision with root package name */
    private X1 f39049c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC3386p1 f39050d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC3342mc f39051e;

    /* renamed from: f, reason: collision with root package name */
    private Tf f39052f;

    /* renamed from: g, reason: collision with root package name */
    private P8 f39053g;

    /* renamed from: h, reason: collision with root package name */
    private P8.a f39054h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, C3478u9> f39055i;

    /* renamed from: j, reason: collision with root package name */
    private InterstitialAdInfo f39056j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC3495v9 f39057k;

    public C3478u9(M9 adInstance, InterfaceC3115a0 adNetworkShow, X1 auctionDataReporter, InterfaceC3386p1 analytics, InterfaceC3342mc networkDestroyAPI, Tf threadManager, P8 sessionDepthService, P8.a sessionDepthServiceEditor, Map<String, C3478u9> retainer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstance, "adInstance");
        kotlin.jvm.internal.e0.checkNotNullParameter(adNetworkShow, "adNetworkShow");
        kotlin.jvm.internal.e0.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        kotlin.jvm.internal.e0.checkNotNullParameter(analytics, "analytics");
        kotlin.jvm.internal.e0.checkNotNullParameter(networkDestroyAPI, "networkDestroyAPI");
        kotlin.jvm.internal.e0.checkNotNullParameter(threadManager, "threadManager");
        kotlin.jvm.internal.e0.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        kotlin.jvm.internal.e0.checkNotNullParameter(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        kotlin.jvm.internal.e0.checkNotNullParameter(retainer, "retainer");
        this.f39047a = adInstance;
        this.f39048b = adNetworkShow;
        this.f39049c = auctionDataReporter;
        this.f39050d = analytics;
        this.f39051e = networkDestroyAPI;
        this.f39052f = threadManager;
        this.f39053g = sessionDepthService;
        this.f39054h = sessionDepthServiceEditor;
        this.f39055i = retainer;
        String strF = adInstance.f();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strF, "adInstance.instanceId");
        String strE = this.f39047a.e();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "adInstance.id");
        this.f39056j = new InterstitialAdInfo(strF, strE);
        C3193e6 c3193e6 = new C3193e6();
        this.f39047a.a(c3193e6);
        c3193e6.a(this);
    }

    public final void a(InterstitialAdInfo interstitialAdInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(interstitialAdInfo, "<set-?>");
        this.f39056j = interstitialAdInfo;
    }

    public final InterstitialAdInfo b() {
        return this.f39056j;
    }

    public final InterfaceC3495v9 c() {
        return this.f39057k;
    }

    public final boolean d() {
        boolean zA = this.f39048b.a(this.f39047a);
        InterfaceC3260i1.a.f36886a.a(zA).a(this.f39050d);
        return zA;
    }

    public final void finalize() {
        a();
    }

    @Override // com.ironsource.InterfaceC3229g6
    public void onAdInstanceDidBecomeVisible() {
        InterfaceC3260i1.a.f36886a.f(new InterfaceC3331m1[0]).a(this.f39050d);
    }

    @Override // com.ironsource.InterfaceC3229g6
    public void onAdInstanceDidClick() {
        InterfaceC3260i1.a.f36886a.a().a(this.f39050d);
        this.f39052f.a(new hi(this, 1));
    }

    @Override // com.ironsource.InterfaceC3229g6
    public void onAdInstanceDidDismiss() {
        this.f39055i.remove(this.f39056j.getAdId());
        InterfaceC3260i1.a.f36886a.a(new InterfaceC3331m1[0]).a(this.f39050d);
        this.f39052f.a(new hi(this, 3));
    }

    @Override // com.ironsource.InterfaceC3229g6
    public void onAdInstanceDidShow() {
        P8 p82 = this.f39053g;
        IronSource.a aVar = IronSource.a.f37252c;
        InterfaceC3260i1.a.f36886a.b(new C3313l1.w(p82.a(aVar))).a(this.f39050d);
        this.f39054h.b(aVar);
        this.f39049c.b("onAdInstanceDidShow");
        this.f39052f.a(new hi(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3478u9 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        InterfaceC3495v9 interfaceC3495v9 = this$0.f39057k;
        if (interfaceC3495v9 != null) {
            interfaceC3495v9.onAdInstanceDidClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3478u9 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        InterfaceC3495v9 interfaceC3495v9 = this$0.f39057k;
        if (interfaceC3495v9 != null) {
            interfaceC3495v9.onAdInstanceDidDismiss();
        }
    }

    public final void a(InterfaceC3495v9 interfaceC3495v9) {
        this.f39057k = interfaceC3495v9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C3478u9 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        InterfaceC3495v9 interfaceC3495v9 = this$0.f39057k;
        if (interfaceC3495v9 != null) {
            interfaceC3495v9.onAdInstanceDidShow();
        }
    }

    public final void a(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        this.f39055i.put(this.f39056j.getAdId(), this);
        if (!this.f39048b.a(this.f39047a)) {
            a(C3559z5.f39348a.t());
        } else {
            InterfaceC3260i1.a.f36886a.d(new InterfaceC3331m1[0]).a(this.f39050d);
            this.f39048b.a(activity, this.f39047a);
        }
    }

    @Override // com.ironsource.InterfaceC3229g6
    public void a(String str) {
        a(C3559z5.f39348a.c(new IronSourceError(0, str)));
    }

    private final void a(IronSourceError ironSourceError) {
        this.f39055i.remove(this.f39056j.getAdId());
        InterfaceC3260i1.a.f36886a.a(new C3313l1.j(ironSourceError.getErrorCode()), new C3313l1.k(ironSourceError.getErrorMessage())).a(this.f39050d);
        this.f39052f.a(new gi(23, this, ironSourceError));
    }

    public /* synthetic */ C3478u9(M9 m9, InterfaceC3115a0 interfaceC3115a0, X1 x12, InterfaceC3386p1 interfaceC3386p1, InterfaceC3342mc interfaceC3342mc, Tf tf2, P8 p82, P8.a aVar, Map map, int i10, kotlin.jvm.internal.u uVar) {
        this(m9, interfaceC3115a0, x12, interfaceC3386p1, (i10 & 16) != 0 ? new C3362nc() : interfaceC3342mc, (i10 & 32) != 0 ? V7.f35633a : tf2, (i10 & 64) != 0 ? Mb.f34856s.d().s() : p82, (i10 & 128) != 0 ? Mb.f34856s.a().h() : aVar, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3478u9 this$0, IronSourceError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "$error");
        InterfaceC3495v9 interfaceC3495v9 = this$0.f39057k;
        if (interfaceC3495v9 != null) {
            interfaceC3495v9.onAdInstanceDidFailedToShow(error);
        }
    }

    public final void a() {
        Tf.a(this.f39052f, new hi(this, 0), 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3478u9 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        InterfaceC3260i1.d.f36909a.b().a(this$0.f39050d);
        this$0.f39051e.a(this$0.f39047a);
    }

    @Override // com.ironsource.InterfaceC3229g6
    public void onAdInstanceDidReward(String str, int i10) {
    }
}
