package nj;

import com.google.android.gms.tasks.Task;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpressionList;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse;
import java.util.concurrent.Executor;
import nh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class c0 implements st.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76866b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f76867c;

    public /* synthetic */ c0(g0 g0Var, int i10) {
        this.f76866b = i10;
        this.f76867c = g0Var;
    }

    @Override // st.o
    public final Object apply(Object obj) {
        switch (this.f76866b) {
            case 0:
                final String str = (String) obj;
                final g0 g0Var = this.f76867c;
                mt.s sVarOnErrorResumeNext = g0Var.f76902c.get().doOnSuccess(new ca.b(9)).doOnError(new ca.b(10)).onErrorResumeNext(mt.s.empty());
                int i10 = 1;
                b0 b0Var = new b0(g0Var, i10);
                final c0 c0Var = new c0(g0Var, i10);
                final d0 d0Var = new d0(g0Var, str, i10);
                final x xVar = new x(4);
                st.o oVar = new st.o() { // from class: nj.f0
                    @Override // st.o
                    public final Object apply(Object obj2) {
                        mt.l lVarFromIterable = mt.l.fromIterable(((FetchEligibleCampaignsResponse) obj2).getMessagesList());
                        g0 g0Var2 = g0Var;
                        mt.l lVarFilter = lVarFromIterable.filter(new ha.a(g0Var2, 23));
                        String str2 = str;
                        return lVarFilter.filter(new c3.c(str2, 17)).flatMapMaybe(c0Var).flatMapMaybe(d0Var).flatMapMaybe(xVar).sorted(new ni.a(1)).firstElement().flatMap(new d0(g0Var2, str2, 0));
                    }
                };
                mt.s sVarOnErrorResumeNext2 = g0Var.f76906g.getAllImpressions().doOnError(new ca.b(11)).defaultIfEmpty(CampaignImpressionList.getDefaultInstance()).onErrorResumeNext(mt.s.just(CampaignImpressionList.getDefaultInstance()));
                tj.e eVar = (tj.e) g0Var.f76912m;
                Task<String> id2 = eVar.getId();
                Executor executor = g0Var.f76914o;
                int i11 = 3;
                v vVar = new v(2, g0Var, mt.s.zip(mt.s.create(new ks.s(i11, id2, executor)), mt.s.create(new ks.s(i11, eVar.getToken(false), executor)), new n1(3)).observeOn(g0Var.f76905f.io()));
                j1 j1Var = g0Var.f76910k;
                if (!(j1Var.isAppInstallFresh() ? g0.isAppForegroundEvent(str) : j1Var.isDeviceInTestMode())) {
                    j0.logd("Attempting to fetch campaigns using cache");
                    return sVarOnErrorResumeNext.switchIfEmpty(sVarOnErrorResumeNext2.flatMap(vVar).doOnSuccess(b0Var)).flatMap(oVar).toFlowable();
                }
                j0.logi("Forcing fetch from service rather than cache. Test Device: " + j1Var.isDeviceInTestMode() + " | App Fresh Install: " + j1Var.isAppInstallFresh());
                return sVarOnErrorResumeNext2.flatMap(vVar).flatMap(oVar).toFlowable();
            default:
                CampaignProto$ThickContent campaignProto$ThickContent = (CampaignProto$ThickContent) obj;
                return campaignProto$ThickContent.getIsTestCampaign() ? mt.s.just(campaignProto$ThickContent) : this.f76867c.f76906g.isImpressed(campaignProto$ThickContent).doOnError(new ca.b(8)).onErrorResumeNext(mt.n0.just(Boolean.FALSE)).doOnSuccess(new bj.v0(campaignProto$ThickContent, 4)).filter(new n1(6)).map(new n(campaignProto$ThickContent, 1));
        }
    }
}
