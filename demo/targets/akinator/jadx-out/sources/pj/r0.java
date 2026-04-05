package pj;

import java.util.concurrent.Executor;
import o9.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class r0 implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f81466a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f81467b;

    /* renamed from: c, reason: collision with root package name */
    public final ru.a f81468c;

    /* renamed from: d, reason: collision with root package name */
    public final ru.a f81469d;

    /* renamed from: e, reason: collision with root package name */
    public final ru.a f81470e;

    /* renamed from: f, reason: collision with root package name */
    public final ru.a f81471f;

    /* renamed from: g, reason: collision with root package name */
    public final ru.a f81472g;

    public r0(ru.a aVar, ru.a aVar2, ru.a aVar3, ru.a aVar4, ru.a aVar5, ru.a aVar6, ru.a aVar7) {
        this.f81466a = aVar;
        this.f81467b = aVar2;
        this.f81468c = aVar3;
        this.f81469d = aVar4;
        this.f81470e = aVar5;
        this.f81471f = aVar6;
        this.f81472g = aVar7;
    }

    public static r0 create(ru.a aVar, ru.a aVar2, ru.a aVar3, ru.a aVar4, ru.a aVar5, ru.a aVar6, ru.a aVar7) {
        return new r0(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static nj.n0 providesMetricsLoggerClient(com.google.firebase.g gVar, jd.l lVar, yh.d dVar, tj.f fVar, qj.a aVar, nj.k kVar, Executor executor) {
        return (nj.n0) dj.d.checkNotNullFromProvides(new nj.n0(new b3(((md.e0) lVar).getTransport("FIREBASE_INAPPMESSAGING", byte[].class, new pe.a(3)), 7), dVar, gVar, fVar, aVar, kVar, executor));
    }

    @Override // dj.b, dj.e, ru.a
    public nj.n0 get() {
        return providesMetricsLoggerClient((com.google.firebase.g) this.f81466a.get(), (jd.l) this.f81467b.get(), (yh.d) this.f81468c.get(), (tj.f) this.f81469d.get(), (qj.a) this.f81470e.get(), (nj.k) this.f81471f.get(), (Executor) this.f81472g.get());
    }
}
