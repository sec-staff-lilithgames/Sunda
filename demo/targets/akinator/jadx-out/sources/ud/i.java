package ud;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i implements pd.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f88436a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f88437b;

    /* renamed from: c, reason: collision with root package name */
    public final ru.a f88438c;

    /* renamed from: d, reason: collision with root package name */
    public final ru.a f88439d;

    /* renamed from: e, reason: collision with root package name */
    public final ru.a f88440e;

    /* renamed from: f, reason: collision with root package name */
    public final ru.a f88441f;

    /* renamed from: g, reason: collision with root package name */
    public final ru.a f88442g;

    /* renamed from: h, reason: collision with root package name */
    public final ru.a f88443h;

    /* renamed from: i, reason: collision with root package name */
    public final ru.a f88444i;

    public i(ru.a aVar, ru.a aVar2, ru.a aVar3, ru.a aVar4, ru.a aVar5, ru.a aVar6, ru.a aVar7, ru.a aVar8, ru.a aVar9) {
        this.f88436a = aVar;
        this.f88437b = aVar2;
        this.f88438c = aVar3;
        this.f88439d = aVar4;
        this.f88440e = aVar5;
        this.f88441f = aVar6;
        this.f88442g = aVar7;
        this.f88443h = aVar8;
        this.f88444i = aVar9;
    }

    public static i create(ru.a aVar, ru.a aVar2, ru.a aVar3, ru.a aVar4, ru.a aVar5, ru.a aVar6, ru.a aVar7, ru.a aVar8, ru.a aVar9) {
        return new i(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static h newInstance(Context context, nd.f fVar, vd.d dVar, l lVar, Executor executor, wd.c cVar, xd.a aVar, xd.a aVar2, vd.c cVar2) {
        return new h(context, fVar, dVar, lVar, executor, cVar, aVar, aVar2, cVar2);
    }

    @Override // pd.b, ru.a
    public h get() {
        return newInstance((Context) this.f88436a.get(), (nd.f) this.f88437b.get(), (vd.d) this.f88438c.get(), (l) this.f88439d.get(), (Executor) this.f88440e.get(), (wd.c) this.f88441f.get(), (xd.a) this.f88442g.get(), (xd.a) this.f88443h.get(), (vd.c) this.f88444i.get());
    }
}
