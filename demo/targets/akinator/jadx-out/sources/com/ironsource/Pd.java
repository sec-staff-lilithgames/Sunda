package com.ironsource;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.ironsource.C3191e4;
import com.ironsource.C3313l1;
import com.ironsource.InterfaceC3260i1;
import com.ironsource.Vf;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Pd implements Cb, InterfaceC3211f6 {

    /* renamed from: a, reason: collision with root package name */
    private final RewardedAdRequest f35190a;

    /* renamed from: b, reason: collision with root package name */
    private final Db f35191b;

    /* renamed from: c, reason: collision with root package name */
    private final T<RewardedAd> f35192c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3332m2 f35193d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3498vc f35194e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3386p1 f35195f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3151c0<RewardedAd> f35196g;

    /* renamed from: h, reason: collision with root package name */
    private final Vf.c f35197h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f35198i;

    /* renamed from: j, reason: collision with root package name */
    private C3317l5 f35199j;

    /* renamed from: k, reason: collision with root package name */
    private Vf f35200k;

    /* renamed from: l, reason: collision with root package name */
    private W1 f35201l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f35202m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements Vf.a {
        public a() {
        }

        @Override // com.ironsource.Vf.a
        public void a() {
            Pd.this.a(C3559z5.f39348a.s());
        }
    }

    public Pd(RewardedAdRequest adRequest, Db loadTaskConfig, T<RewardedAd> adLoadTaskListener, InterfaceC3332m2 auctionResponseFetcher, InterfaceC3498vc networkLoadApi, InterfaceC3386p1 analytics, InterfaceC3151c0<RewardedAd> adObjectFactory, Vf.c timerFactory, Executor taskFinishedExecutor) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adRequest, "adRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(loadTaskConfig, "loadTaskConfig");
        kotlin.jvm.internal.e0.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        kotlin.jvm.internal.e0.checkNotNullParameter(auctionResponseFetcher, "auctionResponseFetcher");
        kotlin.jvm.internal.e0.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        kotlin.jvm.internal.e0.checkNotNullParameter(analytics, "analytics");
        kotlin.jvm.internal.e0.checkNotNullParameter(adObjectFactory, "adObjectFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(timerFactory, "timerFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(taskFinishedExecutor, "taskFinishedExecutor");
        this.f35190a = adRequest;
        this.f35191b = loadTaskConfig;
        this.f35192c = adLoadTaskListener;
        this.f35193d = auctionResponseFetcher;
        this.f35194e = networkLoadApi;
        this.f35195f = analytics;
        this.f35196g = adObjectFactory;
        this.f35197h = timerFactory;
        this.f35198i = taskFinishedExecutor;
    }

    @Override // com.ironsource.InterfaceC3211f6
    public void a(M9 adInstance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstance, "adInstance");
        this.f35198i.execute(new gi(7, this, adInstance));
    }

    @Override // com.ironsource.Cb
    public void start() {
        this.f35199j = new C3317l5();
        this.f35195f.a(new C3313l1.s(this.f35191b.f()), new C3313l1.n(this.f35191b.g().b()), new C3313l1.b(this.f35190a.getAdId$mediationsdk_release()));
        InterfaceC3260i1.c.f36900a.a().a(this.f35195f);
        a(this.f35190a.getExtraParams());
        long jH = this.f35191b.h();
        Vf.c cVar = this.f35197h;
        Vf.b bVar = new Vf.b();
        bVar.b(jH);
        Vf vfA = cVar.a(bVar);
        this.f35200k = vfA;
        if (vfA != null) {
            vfA.a(new a());
        }
        Object objA = this.f35193d.a();
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
        InterfaceC3386p1 interfaceC3386p1 = this.f35195f;
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
        EnumC3359n9 enumC3359n9G = this.f35191b.g();
        C3193e6 c3193e6 = new C3193e6();
        c3193e6.a(this);
        M9 adInstance = new N9(this.f35190a.getProviderName$mediationsdk_release().value(), c3193e6).a(enumC3359n9G.b(EnumC3359n9.Bidder)).b(this.f35191b.i()).c().a(this.f35190a.getAdId$mediationsdk_release()).a(uu.p1.plus(new C3380oc().a(), U5.f35546a.a(this.f35190a.getExtraParams()))).a();
        InterfaceC3386p1 interfaceC3386p12 = this.f35195f;
        String strE = adInstance.e();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "adInstance.id");
        interfaceC3386p12.a(new C3313l1.b(strE));
        C3532xc c3532xc = new C3532xc(c3278j2, this.f35191b.j());
        this.f35201l = new W1(new C3339m9(this.f35190a.getInstanceId(), enumC3359n9G.b(), c3278j2.a()), new com.ironsource.mediationsdk.d(), c3278j2.c());
        InterfaceC3260i1.d.f36909a.c().a(this.f35195f);
        InterfaceC3498vc interfaceC3498vc = this.f35194e;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(adInstance, "adInstance");
        interfaceC3498vc.a(adInstance, c3532xc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Pd this$0, M9 adInstance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstance, "$adInstance");
        if (this$0.f35202m) {
            return;
        }
        this$0.f35202m = true;
        Vf vf2 = this$0.f35200k;
        if (vf2 != null) {
            vf2.cancel();
        }
        C3317l5 c3317l5 = this$0.f35199j;
        if (c3317l5 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("taskStartedTime");
            c3317l5 = null;
        }
        InterfaceC3260i1.c.f36900a.a(new C3313l1.f(C3317l5.a(c3317l5))).a(this$0.f35195f);
        W1 w12 = this$0.f35201l;
        if (w12 != null) {
            w12.c("onAdInstanceLoadSuccess");
        }
        InterfaceC3151c0<RewardedAd> interfaceC3151c0 = this$0.f35196g;
        W1 w13 = this$0.f35201l;
        kotlin.jvm.internal.e0.checkNotNull(w13);
        this$0.f35192c.a(interfaceC3151c0.a(adInstance, w13));
    }

    private final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Map<String, String> mapA = U5.f35546a.a(bundle);
        for (String str : mapA.keySet()) {
            InterfaceC3260i1.c.f36900a.a(new C3313l1.l(w0.i.d(str, C3191e4.i.f36525b, String.valueOf(mapA.get(str))))).a(this.f35195f);
        }
    }

    public /* synthetic */ Pd(RewardedAdRequest rewardedAdRequest, Db db2, T t10, InterfaceC3332m2 interfaceC3332m2, InterfaceC3498vc interfaceC3498vc, InterfaceC3386p1 interfaceC3386p1, InterfaceC3151c0 interfaceC3151c0, Vf.c cVar, Executor executor, int i10, kotlin.jvm.internal.u uVar) {
        this(rewardedAdRequest, db2, t10, interfaceC3332m2, interfaceC3498vc, interfaceC3386p1, interfaceC3151c0, (i10 & 128) != 0 ? new Vf.d() : cVar, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? V7.f35633a.c() : executor);
    }

    @Override // com.ironsource.InterfaceC3211f6
    public void a(String description) {
        kotlin.jvm.internal.e0.checkNotNullParameter(description, "description");
        a(C3559z5.f39348a.c(description));
    }

    public final void a(IronSourceError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        this.f35198i.execute(new gi(8, this, error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Pd this$0, IronSourceError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "$error");
        if (this$0.f35202m) {
            return;
        }
        this$0.f35202m = true;
        Vf vf2 = this$0.f35200k;
        if (vf2 != null) {
            vf2.cancel();
        }
        InterfaceC3260i1.c.a aVar = InterfaceC3260i1.c.f36900a;
        C3313l1.j jVar = new C3313l1.j(error.getErrorCode());
        C3313l1.k kVar = new C3313l1.k(error.getErrorMessage());
        C3317l5 c3317l5 = this$0.f35199j;
        if (c3317l5 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("taskStartedTime");
            c3317l5 = null;
        }
        aVar.a(jVar, kVar, new C3313l1.f(C3317l5.a(c3317l5))).a(this$0.f35195f);
        W1 w12 = this$0.f35201l;
        if (w12 != null) {
            w12.a("onAdInstanceLoadFail");
        }
        this$0.f35192c.b(error);
    }
}
