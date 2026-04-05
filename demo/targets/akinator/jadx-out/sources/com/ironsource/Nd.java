package com.ironsource;

import android.app.Activity;
import com.ironsource.C3313l1;
import com.ironsource.InterfaceC3260i1;
import com.ironsource.P8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.moloco.sdk.BKC.KerkSviMAy;
import com.unity3d.ironsourceads.rewarded.RewardedAdInfo;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Nd implements InterfaceC3229g6 {

    /* renamed from: a, reason: collision with root package name */
    private M9 f35061a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC3115a0 f35062b;

    /* renamed from: c, reason: collision with root package name */
    private X1 f35063c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC3386p1 f35064d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC3342mc f35065e;

    /* renamed from: f, reason: collision with root package name */
    private Tf f35066f;

    /* renamed from: g, reason: collision with root package name */
    private P8 f35067g;

    /* renamed from: h, reason: collision with root package name */
    private P8.a f35068h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, Nd> f35069i;

    /* renamed from: j, reason: collision with root package name */
    private RewardedAdInfo f35070j;

    /* renamed from: k, reason: collision with root package name */
    private Od f35071k;

    public Nd(M9 adInstance, InterfaceC3115a0 adNetworkShow, X1 auctionDataReporter, InterfaceC3386p1 analytics, InterfaceC3342mc networkDestroyAPI, Tf threadManager, P8 sessionDepthService, P8.a sessionDepthServiceEditor, Map<String, Nd> retainer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstance, "adInstance");
        kotlin.jvm.internal.e0.checkNotNullParameter(adNetworkShow, "adNetworkShow");
        kotlin.jvm.internal.e0.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        kotlin.jvm.internal.e0.checkNotNullParameter(analytics, "analytics");
        kotlin.jvm.internal.e0.checkNotNullParameter(networkDestroyAPI, "networkDestroyAPI");
        kotlin.jvm.internal.e0.checkNotNullParameter(threadManager, "threadManager");
        kotlin.jvm.internal.e0.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        kotlin.jvm.internal.e0.checkNotNullParameter(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        kotlin.jvm.internal.e0.checkNotNullParameter(retainer, "retainer");
        this.f35061a = adInstance;
        this.f35062b = adNetworkShow;
        this.f35063c = auctionDataReporter;
        this.f35064d = analytics;
        this.f35065e = networkDestroyAPI;
        this.f35066f = threadManager;
        this.f35067g = sessionDepthService;
        this.f35068h = sessionDepthServiceEditor;
        this.f35069i = retainer;
        String strF = adInstance.f();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strF, "adInstance.instanceId");
        String strE = this.f35061a.e();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "adInstance.id");
        this.f35070j = new RewardedAdInfo(strF, strE);
        C3193e6 c3193e6 = new C3193e6();
        this.f35061a.a(c3193e6);
        c3193e6.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Nd this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        Od od2 = this$0.f35071k;
        if (od2 != null) {
            od2.onRewardedAdShown();
        }
    }

    public final void a(RewardedAdInfo rewardedAdInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rewardedAdInfo, "<set-?>");
        this.f35070j = rewardedAdInfo;
    }

    public final RewardedAdInfo b() {
        return this.f35070j;
    }

    public final Od c() {
        return this.f35071k;
    }

    public final boolean d() {
        boolean zA = this.f35062b.a(this.f35061a);
        InterfaceC3260i1.a.f36886a.a(zA).a(this.f35064d);
        return zA;
    }

    public final void finalize() {
        a();
    }

    @Override // com.ironsource.InterfaceC3229g6
    public void onAdInstanceDidBecomeVisible() {
        InterfaceC3260i1.a.f36886a.f(new InterfaceC3331m1[0]).a(this.f35064d);
    }

    @Override // com.ironsource.InterfaceC3229g6
    public void onAdInstanceDidClick() {
        InterfaceC3260i1.a.f36886a.a().a(this.f35064d);
        this.f35066f.a(new kh(this, 1));
    }

    @Override // com.ironsource.InterfaceC3229g6
    public void onAdInstanceDidDismiss() {
        this.f35069i.remove(this.f35070j.getAdId());
        InterfaceC3260i1.a.f36886a.a(new InterfaceC3331m1[0]).a(this.f35064d);
        this.f35066f.a(new kh(this, 0));
    }

    @Override // com.ironsource.InterfaceC3229g6
    public void onAdInstanceDidShow() {
        P8 p82 = this.f35067g;
        IronSource.a aVar = IronSource.a.REWARDED_VIDEO;
        InterfaceC3260i1.a.f36886a.b(new C3313l1.w(p82.a(aVar))).a(this.f35064d);
        this.f35068h.b(aVar);
        this.f35063c.b("onAdInstanceDidShow");
        this.f35066f.a(new kh(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Nd this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        Od od2 = this$0.f35071k;
        if (od2 != null) {
            od2.onRewardedAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Nd this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        Od od2 = this$0.f35071k;
        if (od2 != null) {
            od2.onRewardedAdDismissed();
        }
    }

    public final void a(Od od2) {
        this.f35071k = od2;
    }

    @Override // com.ironsource.InterfaceC3229g6
    public void onAdInstanceDidReward(String str, int i10) {
        C3313l1.u uVar = new C3313l1.u(KerkSviMAy.yWCZZ);
        C3313l1.t tVar = new C3313l1.t(1);
        C3313l1.q qVar = new C3313l1.q("DefaultRewardedVideo");
        String strA = IronSourceUtils.a(System.currentTimeMillis(), this.f35061a.g());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strA, "getTransId(System.curren…illis(), adInstance.name)");
        InterfaceC3260i1.a.f36886a.c(uVar, tVar, qVar, new C3313l1.y(strA)).a(this.f35064d);
        this.f35066f.a(new kh(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Nd this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        Od od2 = this$0.f35071k;
        if (od2 != null) {
            od2.onUserEarnedReward();
        }
    }

    public final void a(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        this.f35069i.put(this.f35070j.getAdId(), this);
        if (!this.f35062b.a(this.f35061a)) {
            a(C3559z5.f39348a.t());
        } else {
            InterfaceC3260i1.a.f36886a.d(new InterfaceC3331m1[0]).a(this.f35064d);
            this.f35062b.a(activity, this.f35061a);
        }
    }

    @Override // com.ironsource.InterfaceC3229g6
    public void a(String str) {
        a(C3559z5.f39348a.c(new IronSourceError(0, str)));
    }

    private final void a(IronSourceError ironSourceError) {
        this.f35069i.remove(this.f35070j.getAdId());
        InterfaceC3260i1.a.f36886a.a(new C3313l1.j(ironSourceError.getErrorCode()), new C3313l1.k(ironSourceError.getErrorMessage())).a(this.f35064d);
        this.f35066f.a(new gi(5, this, ironSourceError));
    }

    public /* synthetic */ Nd(M9 m9, InterfaceC3115a0 interfaceC3115a0, X1 x12, InterfaceC3386p1 interfaceC3386p1, InterfaceC3342mc interfaceC3342mc, Tf tf2, P8 p82, P8.a aVar, Map map, int i10, kotlin.jvm.internal.u uVar) {
        this(m9, interfaceC3115a0, x12, interfaceC3386p1, (i10 & 16) != 0 ? new C3362nc() : interfaceC3342mc, (i10 & 32) != 0 ? V7.f35633a : tf2, (i10 & 64) != 0 ? Mb.f34856s.d().s() : p82, (i10 & 128) != 0 ? Mb.f34856s.a().h() : aVar, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Nd this$0, IronSourceError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "$error");
        Od od2 = this$0.f35071k;
        if (od2 != null) {
            od2.onRewardedAdFailedToShow(error);
        }
    }

    public final void a() {
        Tf.a(this.f35066f, new kh(this, 3), 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Nd this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        InterfaceC3260i1.d.f36909a.b().a(this$0.f35064d);
        this$0.f35065e.a(this$0.f35061a);
    }
}
