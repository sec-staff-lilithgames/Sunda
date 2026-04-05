package nj;

import com.google.firebase.inappmessaging.internal.RateLimitProto$Counter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class c1 implements st.q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76868b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e1 f76869c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rj.v f76870e;

    public /* synthetic */ c1(e1 e1Var, rj.v vVar, int i10) {
        this.f76868b = i10;
        this.f76869c = e1Var;
        this.f76870e = vVar;
    }

    @Override // st.q
    public final boolean test(Object obj) {
        RateLimitProto$Counter rateLimitProto$Counter = (RateLimitProto$Counter) obj;
        switch (this.f76868b) {
            case 0:
                long jNow = this.f76869c.f76886b.now() - rateLimitProto$Counter.getStartTimeEpoch();
                rj.v vVar = this.f76870e;
                return jNow > vVar.timeToLiveMillis() || rateLimitProto$Counter.getValue() < vVar.limit();
            default:
                return !(this.f76869c.f76886b.now() - rateLimitProto$Counter.getStartTimeEpoch() > this.f76870e.timeToLiveMillis());
        }
    }
}
