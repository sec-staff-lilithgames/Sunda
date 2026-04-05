package nj;

import com.google.firebase.inappmessaging.internal.RateLimitProto$RateLimit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class b1 implements st.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76860b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e1 f76861c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rj.v f76862e;

    public /* synthetic */ b1(e1 e1Var, rj.v vVar, int i10) {
        this.f76860b = i10;
        this.f76861c = e1Var;
        this.f76862e = vVar;
    }

    @Override // st.o
    public final Object apply(Object obj) {
        RateLimitProto$RateLimit rateLimitProto$RateLimit = (RateLimitProto$RateLimit) obj;
        switch (this.f76860b) {
            case 0:
                rj.v vVar = this.f76862e;
                String strLimiterKey = vVar.limiterKey();
                e1 e1Var = this.f76861c;
                return mt.b0.just(rateLimitProto$RateLimit.getLimitsOrDefault(strLimiterKey, e1Var.b())).filter(new c1(e1Var, vVar, 1)).switchIfEmpty(mt.b0.just(e1Var.b())).map(new v(4, rateLimitProto$RateLimit, vVar)).flatMapCompletable(new n(e1Var, 2));
            default:
                e1 e1Var2 = this.f76861c;
                e1Var2.getClass();
                return rateLimitProto$RateLimit.getLimitsOrDefault(this.f76862e.limiterKey(), e1Var2.b());
        }
    }
}
