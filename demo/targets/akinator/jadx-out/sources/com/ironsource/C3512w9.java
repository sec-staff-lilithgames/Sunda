package com.ironsource;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.ironsource.C3191e4;
import com.ironsource.C3313l1;
import com.ironsource.InterfaceC3260i1;
import com.ironsource.Vf;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.w9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3512w9 implements Cb, InterfaceC3211f6 {

    /* renamed from: a, reason: collision with root package name */
    private final InterstitialAdRequest f39166a;

    /* renamed from: b, reason: collision with root package name */
    private final Db f39167b;

    /* renamed from: c, reason: collision with root package name */
    private final T<InterstitialAd> f39168c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3332m2 f39169d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3498vc f39170e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3386p1 f39171f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3151c0<InterstitialAd> f39172g;

    /* renamed from: h, reason: collision with root package name */
    private final Vf.c f39173h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f39174i;

    /* renamed from: j, reason: collision with root package name */
    private C3317l5 f39175j;

    /* renamed from: k, reason: collision with root package name */
    private Vf f39176k;

    /* renamed from: l, reason: collision with root package name */
    private W1 f39177l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f39178m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.w9$a */
    public static final class a implements Vf.a {
        public a() {
        }

        @Override // com.ironsource.Vf.a
        public void a() {
            C3512w9.this.a(C3559z5.f39348a.s());
        }
    }

    public C3512w9(InterstitialAdRequest adRequest, Db loadTaskConfig, T<InterstitialAd> adLoadTaskListener, InterfaceC3332m2 auctionResponseFetcher, InterfaceC3498vc networkLoadApi, InterfaceC3386p1 analytics, InterfaceC3151c0<InterstitialAd> adObjectFactory, Vf.c timerFactory, Executor taskFinishedExecutor) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adRequest, "adRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(loadTaskConfig, "loadTaskConfig");
        kotlin.jvm.internal.e0.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        kotlin.jvm.internal.e0.checkNotNullParameter(auctionResponseFetcher, "auctionResponseFetcher");
        kotlin.jvm.internal.e0.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        kotlin.jvm.internal.e0.checkNotNullParameter(analytics, "analytics");
        kotlin.jvm.internal.e0.checkNotNullParameter(adObjectFactory, "adObjectFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(timerFactory, "timerFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(taskFinishedExecutor, "taskFinishedExecutor");
        this.f39166a = adRequest;
        this.f39167b = loadTaskConfig;
        this.f39168c = adLoadTaskListener;
        this.f39169d = auctionResponseFetcher;
        this.f39170e = networkLoadApi;
        this.f39171f = analytics;
        this.f39172g = adObjectFactory;
        this.f39173h = timerFactory;
        this.f39174i = taskFinishedExecutor;
    }

    private final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Map<String, String> mapA = U5.f35546a.a(bundle);
        for (String str : mapA.keySet()) {
            InterfaceC3260i1.c.f36900a.a(new C3313l1.l(w0.i.d(str, C3191e4.i.f36525b, String.valueOf(mapA.get(str))))).a(this.f39171f);
        }
    }

    @Override // com.ironsource.Cb
    public void start() {
        this.f39175j = new C3317l5();
        this.f39171f.a(new C3313l1.s(this.f39167b.f()), new C3313l1.n(this.f39167b.g().b()), new C3313l1.b(this.f39166a.getAdId$mediationsdk_release()));
        InterfaceC3260i1.c.f36900a.a().a(this.f39171f);
        a(this.f39166a.getExtraParams());
        long jH = this.f39167b.h();
        Vf.c cVar = this.f39173h;
        Vf.b bVar = new Vf.b();
        bVar.b(jH);
        Vf vfA = cVar.a(bVar);
        this.f39176k = vfA;
        if (vfA != null) {
            vfA.a(new a());
        }
        Object objA = this.f39169d.a();
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
        InterfaceC3386p1 interfaceC3386p1 = this.f39171f;
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
        EnumC3359n9 enumC3359n9G = this.f39167b.g();
        C3193e6 c3193e6 = new C3193e6();
        c3193e6.a(this);
        M9 adInstance = new N9(this.f39166a.getProviderName$mediationsdk_release().value(), c3193e6).a(enumC3359n9G.b(EnumC3359n9.Bidder)).b(this.f39167b.i()).a(this.f39166a.getAdId$mediationsdk_release()).a(uu.p1.plus(new C3380oc().a(), U5.f35546a.a(this.f39166a.getExtraParams()))).a();
        InterfaceC3386p1 interfaceC3386p12 = this.f39171f;
        String strE = adInstance.e();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "adInstance.id");
        interfaceC3386p12.a(new C3313l1.b(strE));
        C3532xc c3532xc = new C3532xc(c3278j2, this.f39167b.j());
        this.f39177l = new W1(new C3339m9(this.f39166a.getInstanceId(), enumC3359n9G.b(), c3278j2.a()), new com.ironsource.mediationsdk.d(), c3278j2.c());
        InterfaceC3260i1.d.f36909a.c().a(this.f39171f);
        InterfaceC3498vc interfaceC3498vc = this.f39170e;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(adInstance, "adInstance");
        interfaceC3498vc.a(adInstance, c3532xc);
    }

    public /* synthetic */ C3512w9(InterstitialAdRequest interstitialAdRequest, Db db2, T t10, InterfaceC3332m2 interfaceC3332m2, InterfaceC3498vc interfaceC3498vc, InterfaceC3386p1 interfaceC3386p1, InterfaceC3151c0 interfaceC3151c0, Vf.c cVar, Executor executor, int i10, kotlin.jvm.internal.u uVar) {
        this(interstitialAdRequest, db2, t10, interfaceC3332m2, interfaceC3498vc, interfaceC3386p1, interfaceC3151c0, (i10 & 128) != 0 ? new Vf.d() : cVar, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? V7.f35633a.c() : executor);
    }

    @Override // com.ironsource.InterfaceC3211f6
    public void a(M9 adInstance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstance, "adInstance");
        this.f39174i.execute(new gi(26, this, adInstance));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3512w9 this$0, M9 adInstance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstance, "$adInstance");
        if (this$0.f39178m) {
            return;
        }
        this$0.f39178m = true;
        Vf vf2 = this$0.f39176k;
        if (vf2 != null) {
            vf2.cancel();
        }
        C3317l5 c3317l5 = this$0.f39175j;
        if (c3317l5 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("taskStartedTime");
            c3317l5 = null;
        }
        InterfaceC3260i1.c.f36900a.a(new C3313l1.f(C3317l5.a(c3317l5))).a(this$0.f39171f);
        W1 w12 = this$0.f39177l;
        if (w12 != null) {
            w12.c("onAdInstanceDidLoad");
        }
        InterfaceC3151c0<InterstitialAd> interfaceC3151c0 = this$0.f39172g;
        W1 w13 = this$0.f39177l;
        kotlin.jvm.internal.e0.checkNotNull(w13);
        this$0.f39168c.a(interfaceC3151c0.a(adInstance, w13));
    }

    @Override // com.ironsource.InterfaceC3211f6
    public void a(String description) {
        kotlin.jvm.internal.e0.checkNotNullParameter(description, "description");
        a(C3559z5.f39348a.c(description));
    }

    public final void a(IronSourceError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        this.f39174i.execute(new gi(27, this, error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3512w9 this$0, IronSourceError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "$error");
        if (this$0.f39178m) {
            return;
        }
        this$0.f39178m = true;
        Vf vf2 = this$0.f39176k;
        if (vf2 != null) {
            vf2.cancel();
        }
        InterfaceC3260i1.c.a aVar = InterfaceC3260i1.c.f36900a;
        C3313l1.j jVar = new C3313l1.j(error.getErrorCode());
        C3313l1.k kVar = new C3313l1.k(error.getErrorMessage());
        C3317l5 c3317l5 = this$0.f39175j;
        if (c3317l5 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("taskStartedTime");
            c3317l5 = null;
        }
        aVar.a(jVar, kVar, new C3313l1.f(C3317l5.a(c3317l5))).a(this$0.f39171f);
        W1 w12 = this$0.f39177l;
        if (w12 != null) {
            w12.a("onAdInstanceDidFailToLoad");
        }
        this$0.f39168c.b(error);
    }
}
