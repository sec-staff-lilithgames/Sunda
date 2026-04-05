package ud;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k implements pd.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f88449a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f88450b;

    /* renamed from: c, reason: collision with root package name */
    public final ru.a f88451c;

    /* renamed from: d, reason: collision with root package name */
    public final ru.a f88452d;

    public k(ru.a aVar, ru.a aVar2, ru.a aVar3, ru.a aVar4) {
        this.f88449a = aVar;
        this.f88450b = aVar2;
        this.f88451c = aVar3;
        this.f88452d = aVar4;
    }

    public static k create(ru.a aVar, ru.a aVar2, ru.a aVar3, ru.a aVar4) {
        return new k(aVar, aVar2, aVar3, aVar4);
    }

    public static j newInstance(Executor executor, vd.d dVar, l lVar, wd.c cVar) {
        return new j(executor, dVar, lVar, cVar);
    }

    @Override // pd.b, ru.a
    public j get() {
        return newInstance((Executor) this.f88449a.get(), (vd.d) this.f88450b.get(), (l) this.f88451c.get(), (wd.c) this.f88452d.get());
    }
}
