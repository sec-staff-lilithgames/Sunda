package com.ironsource;

import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.ironsource.C3191e4;
import com.ironsource.C3313l1;
import com.ironsource.InterfaceC3260i1;
import com.ironsource.Vf;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.d3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3172d3 implements Cb, B2 {

    /* renamed from: a, reason: collision with root package name */
    private final BannerAdRequest f36214a;

    /* renamed from: b, reason: collision with root package name */
    private final AdSize f36215b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3332m2 f36216c;

    /* renamed from: d, reason: collision with root package name */
    private final Db f36217d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3498vc f36218e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3386p1 f36219f;

    /* renamed from: g, reason: collision with root package name */
    private final T<BannerAdView> f36220g;

    /* renamed from: h, reason: collision with root package name */
    private final E2 f36221h;

    /* renamed from: i, reason: collision with root package name */
    private final Vf.c f36222i;

    /* renamed from: j, reason: collision with root package name */
    private final Executor f36223j;

    /* renamed from: k, reason: collision with root package name */
    private C3317l5 f36224k;

    /* renamed from: l, reason: collision with root package name */
    private Vf f36225l;

    /* renamed from: m, reason: collision with root package name */
    private W1 f36226m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f36227n;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.d3$a */
    public static final class a implements Vf.a {
        public a() {
        }

        @Override // com.ironsource.Vf.a
        public void a() {
            C3172d3.this.a(C3559z5.f39348a.s());
        }
    }

    public C3172d3(BannerAdRequest adRequest, AdSize size, InterfaceC3332m2 auctionResponseFetcher, Db loadTaskConfig, InterfaceC3498vc networkLoadApi, InterfaceC3386p1 analytics, T<BannerAdView> adLoadTaskListener, E2 adLayoutFactory, Vf.c timerFactory, Executor taskFinishedExecutor) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adRequest, "adRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(size, "size");
        kotlin.jvm.internal.e0.checkNotNullParameter(auctionResponseFetcher, "auctionResponseFetcher");
        kotlin.jvm.internal.e0.checkNotNullParameter(loadTaskConfig, "loadTaskConfig");
        kotlin.jvm.internal.e0.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        kotlin.jvm.internal.e0.checkNotNullParameter(analytics, "analytics");
        kotlin.jvm.internal.e0.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        kotlin.jvm.internal.e0.checkNotNullParameter(adLayoutFactory, "adLayoutFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(timerFactory, "timerFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(taskFinishedExecutor, "taskFinishedExecutor");
        this.f36214a = adRequest;
        this.f36215b = size;
        this.f36216c = auctionResponseFetcher;
        this.f36217d = loadTaskConfig;
        this.f36218e = networkLoadApi;
        this.f36219f = analytics;
        this.f36220g = adLoadTaskListener;
        this.f36221h = adLayoutFactory;
        this.f36222i = timerFactory;
        this.f36223j = taskFinishedExecutor;
    }

    private final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Map<String, String> mapA = U5.f35546a.a(bundle);
        for (String str : mapA.keySet()) {
            InterfaceC3260i1.c.f36900a.a(new C3313l1.l(w0.i.d(str, C3191e4.i.f36525b, String.valueOf(mapA.get(str))))).a(this.f36219f);
        }
    }

    @Override // com.ironsource.B2
    public void onBannerLoadFail(String description) {
        kotlin.jvm.internal.e0.checkNotNullParameter(description, "description");
        a(C3559z5.f39348a.c(description));
    }

    @Override // com.ironsource.B2
    public void onBannerLoadSuccess(M9 adInstance, C3302k8 adContainer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstance, "adInstance");
        kotlin.jvm.internal.e0.checkNotNullParameter(adContainer, "adContainer");
        this.f36223j.execute(new lh(this, 5, adInstance, adContainer));
    }

    @Override // com.ironsource.Cb
    public void start() {
        this.f36224k = new C3317l5();
        this.f36219f.a(new C3313l1.s(this.f36217d.f()), new C3313l1.n(this.f36217d.g().b()), new C3313l1.c(this.f36215b), new C3313l1.b(this.f36214a.getAdId$mediationsdk_release()));
        InterfaceC3260i1.c.f36900a.a().a(this.f36219f);
        a(this.f36214a.getExtraParams());
        long jH = this.f36217d.h();
        Vf.c cVar = this.f36222i;
        Vf.b bVar = new Vf.b();
        bVar.b(jH);
        Vf vfA = cVar.a(bVar);
        this.f36225l = vfA;
        if (vfA != null) {
            vfA.a(new a());
        }
        Object objA = this.f36216c.a();
        Throwable thM7134exceptionOrNullimpl = tu.z.m7134exceptionOrNullimpl(objA);
        if (thM7134exceptionOrNullimpl != null) {
            kotlin.jvm.internal.e0.checkNotNull(thM7134exceptionOrNullimpl, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.error.ISException");
            a(((C3213f8) thM7134exceptionOrNullimpl).a());
            objA = null;
        }
        C3278j2 c3278j2 = (C3278j2) objA;
        if (c3278j2 == null) {
            return;
        }
        InterfaceC3386p1 interfaceC3386p1 = this.f36219f;
        String strB = c3278j2.b();
        if (strB != null) {
            interfaceC3386p1.a(new C3313l1.d(strB));
        }
        JSONObject jSONObjectF = c3278j2.f();
        if (jSONObjectF != null) {
            interfaceC3386p1.a(new C3313l1.m(jSONObjectF));
        }
        String strA = c3278j2.a();
        if (strA != null) {
            interfaceC3386p1.a(new C3313l1.g(strA));
        }
        EnumC3359n9 enumC3359n9G = this.f36217d.g();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        C3267i8 c3267i8 = new C3267i8(AdapterUtils.dpToPixels(applicationContext, this.f36215b.getWidth()), AdapterUtils.dpToPixels(applicationContext, this.f36215b.getHeight()), this.f36215b.getSizeDescription());
        Kc kc2 = new Kc();
        kc2.a(this);
        M9 adInstance = new N9(this.f36214a.getProviderName$mediationsdk_release().value(), kc2).a(enumC3359n9G.b(EnumC3359n9.Bidder)).a(c3267i8).b(this.f36217d.i()).a(this.f36214a.getAdId$mediationsdk_release()).a(uu.p1.plus(new C3380oc().a(), U5.f35546a.a(this.f36214a.getExtraParams()))).a();
        C3532xc c3532xc = new C3532xc(c3278j2, this.f36217d.j());
        this.f36226m = new W1(new C3339m9(this.f36214a.getInstanceId(), enumC3359n9G.b(), c3278j2.a()), new com.ironsource.mediationsdk.d(), c3278j2.c());
        InterfaceC3260i1.d.f36909a.c().a(this.f36219f);
        InterfaceC3498vc interfaceC3498vc = this.f36218e;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(adInstance, "adInstance");
        interfaceC3498vc.a(adInstance, c3532xc);
    }

    public /* synthetic */ C3172d3(BannerAdRequest bannerAdRequest, AdSize adSize, InterfaceC3332m2 interfaceC3332m2, Db db2, InterfaceC3498vc interfaceC3498vc, InterfaceC3386p1 interfaceC3386p1, T t10, E2 e22, Vf.c cVar, Executor executor, int i10, kotlin.jvm.internal.u uVar) {
        this(bannerAdRequest, adSize, interfaceC3332m2, db2, interfaceC3498vc, interfaceC3386p1, t10, e22, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? new Vf.d() : cVar, (i10 & 512) != 0 ? V7.f35633a.c() : executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3172d3 this$0, M9 adInstance, C3302k8 adContainer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstance, "$adInstance");
        kotlin.jvm.internal.e0.checkNotNullParameter(adContainer, "$adContainer");
        if (this$0.f36227n) {
            return;
        }
        this$0.f36227n = true;
        Vf vf2 = this$0.f36225l;
        if (vf2 != null) {
            vf2.cancel();
        }
        C3317l5 c3317l5 = this$0.f36224k;
        if (c3317l5 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("taskStartedTime");
            c3317l5 = null;
        }
        InterfaceC3260i1.c.f36900a.a(new C3313l1.f(C3317l5.a(c3317l5))).a(this$0.f36219f);
        W1 w12 = this$0.f36226m;
        if (w12 != null) {
            w12.c("onBannerLoadSuccess");
        }
        E2 e22 = this$0.f36221h;
        W1 w13 = this$0.f36226m;
        kotlin.jvm.internal.e0.checkNotNull(w13);
        this$0.f36220g.a(e22.a(adInstance, adContainer, w13));
    }

    public final void a(IronSourceError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        this.f36223j.execute(new gi(14, this, error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3172d3 this$0, IronSourceError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "$error");
        if (this$0.f36227n) {
            return;
        }
        this$0.f36227n = true;
        Vf vf2 = this$0.f36225l;
        if (vf2 != null) {
            vf2.cancel();
        }
        InterfaceC3260i1.c.a aVar = InterfaceC3260i1.c.f36900a;
        C3313l1.j jVar = new C3313l1.j(error.getErrorCode());
        C3313l1.k kVar = new C3313l1.k(error.getErrorMessage());
        C3317l5 c3317l5 = this$0.f36224k;
        if (c3317l5 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("taskStartedTime");
            c3317l5 = null;
        }
        aVar.a(jVar, kVar, new C3313l1.f(C3317l5.a(c3317l5))).a(this$0.f36219f);
        W1 w12 = this$0.f36226m;
        if (w12 != null) {
            w12.a("onBannerLoadFail");
        }
        this$0.f36220g.b(error);
    }
}
