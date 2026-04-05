package td;

import java.util.concurrent.Executor;
import nd.f;
import ud.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements pd.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f86819a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f86820b;

    /* renamed from: c, reason: collision with root package name */
    public final ru.a f86821c;

    /* renamed from: d, reason: collision with root package name */
    public final ru.a f86822d;

    /* renamed from: e, reason: collision with root package name */
    public final ru.a f86823e;

    public b(ru.a aVar, ru.a aVar2, ru.a aVar3, ru.a aVar4, ru.a aVar5) {
        this.f86819a = aVar;
        this.f86820b = aVar2;
        this.f86821c = aVar3;
        this.f86822d = aVar4;
        this.f86823e = aVar5;
    }

    public static b create(ru.a aVar, ru.a aVar2, ru.a aVar3, ru.a aVar4, ru.a aVar5) {
        return new b(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static a newInstance(Executor executor, f fVar, l lVar, vd.d dVar, wd.c cVar) {
        return new a(executor, fVar, lVar, dVar, cVar);
    }

    @Override // pd.b, ru.a
    public a get() {
        return newInstance((Executor) this.f86819a.get(), (f) this.f86820b.get(), (l) this.f86821c.get(), (vd.d) this.f86822d.get(), (wd.c) this.f86823e.get());
    }
}
