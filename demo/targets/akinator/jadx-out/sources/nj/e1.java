package nj;

import com.google.firebase.inappmessaging.internal.RateLimitProto$Counter;
import com.google.firebase.inappmessaging.internal.RateLimitProto$RateLimit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class e1 {

    /* renamed from: d, reason: collision with root package name */
    public static final RateLimitProto$RateLimit f76884d = RateLimitProto$RateLimit.getDefaultInstance();

    /* renamed from: a, reason: collision with root package name */
    public final q0 f76885a;

    /* renamed from: b, reason: collision with root package name */
    public final qj.a f76886b;

    /* renamed from: c, reason: collision with root package name */
    public mt.s f76887c = mt.s.empty();

    public e1(q0 q0Var, qj.a aVar) {
        this.f76885a = q0Var;
        this.f76886b = aVar;
    }

    public final mt.s a() {
        final int i10 = 0;
        final int i11 = 1;
        return this.f76887c.switchIfEmpty(this.f76885a.read(RateLimitProto$RateLimit.parser()).doOnSuccess(new st.g(this) { // from class: nj.d1

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e1 f76880c;

            {
                this.f76880c = this;
            }

            @Override // st.g
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.f76880c.f76887c = mt.s.just((RateLimitProto$RateLimit) obj);
                        break;
                    default:
                        e1 e1Var = this.f76880c;
                        e1Var.getClass();
                        e1Var.f76887c = mt.s.empty();
                        break;
                }
            }
        })).doOnError(new st.g(this) { // from class: nj.d1

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e1 f76880c;

            {
                this.f76880c = this;
            }

            @Override // st.g
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        this.f76880c.f76887c = mt.s.just((RateLimitProto$RateLimit) obj);
                        break;
                    default:
                        e1 e1Var = this.f76880c;
                        e1Var.getClass();
                        e1Var.f76887c = mt.s.empty();
                        break;
                }
            }
        });
    }

    public final RateLimitProto$Counter b() {
        return (RateLimitProto$Counter) RateLimitProto$Counter.newBuilder().setValue(0L).setStartTimeEpoch(this.f76886b.now()).build();
    }

    public mt.c increment(rj.v vVar) {
        return a().defaultIfEmpty(f76884d).flatMapCompletable(new b1(this, vVar, 0));
    }

    public mt.n0<Boolean> isRateLimited(rj.v vVar) {
        return a().switchIfEmpty(mt.s.just(RateLimitProto$RateLimit.getDefaultInstance())).map(new b1(this, vVar, 1)).filter(new c1(this, vVar, 0)).isEmpty();
    }
}
