package nj;

import com.google.firebase.inappmessaging.CommonTypesProto$TriggeringCondition;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final rt.a f76900a;

    /* renamed from: b, reason: collision with root package name */
    public final rt.a f76901b;

    /* renamed from: c, reason: collision with root package name */
    public final h f76902c;

    /* renamed from: d, reason: collision with root package name */
    public final qj.a f76903d;

    /* renamed from: e, reason: collision with root package name */
    public final d f76904e;

    /* renamed from: f, reason: collision with root package name */
    public final g1 f76905f;

    /* renamed from: g, reason: collision with root package name */
    public final z f76906g;

    /* renamed from: h, reason: collision with root package name */
    public final e1 f76907h;

    /* renamed from: i, reason: collision with root package name */
    public final rj.v f76908i;

    /* renamed from: j, reason: collision with root package name */
    public final c f76909j;

    /* renamed from: k, reason: collision with root package name */
    public final j1 f76910k;

    /* renamed from: l, reason: collision with root package name */
    public final a f76911l;

    /* renamed from: m, reason: collision with root package name */
    public final tj.f f76912m;

    /* renamed from: n, reason: collision with root package name */
    public final j f76913n;

    /* renamed from: o, reason: collision with root package name */
    public final Executor f76914o;

    public g0(rt.a aVar, rt.a aVar2, h hVar, qj.a aVar3, d dVar, c cVar, g1 g1Var, z zVar, e1 e1Var, rj.v vVar, j1 j1Var, tj.f fVar, j jVar, a aVar4, Executor executor) {
        this.f76900a = aVar;
        this.f76901b = aVar2;
        this.f76902c = hVar;
        this.f76903d = aVar3;
        this.f76904e = dVar;
        this.f76909j = cVar;
        this.f76905f = g1Var;
        this.f76906g = zVar;
        this.f76907h = e1Var;
        this.f76908i = vVar;
        this.f76910k = j1Var;
        this.f76913n = jVar;
        this.f76912m = fVar;
        this.f76911l = aVar4;
        this.f76914o = executor;
    }

    public static boolean isAppForegroundEvent(CommonTypesProto$TriggeringCondition commonTypesProto$TriggeringCondition) {
        return commonTypesProto$TriggeringCondition.getFiamTrigger().toString().equals("ON_FOREGROUND");
    }

    public mt.l createFirebaseInAppMessageStream() {
        mt.l lVarDoOnNext = mt.l.merge(this.f76900a, this.f76909j.getAnalyticsEventsFlowable(), this.f76901b).doOnNext(new ca.b(3));
        g1 g1Var = this.f76905f;
        return lVarDoOnNext.observeOn(g1Var.io()).concatMap(new c0(this, 0)).observeOn(g1Var.mainThread());
    }

    public static boolean isAppForegroundEvent(String str) {
        return str.equals("ON_FOREGROUND");
    }
}
