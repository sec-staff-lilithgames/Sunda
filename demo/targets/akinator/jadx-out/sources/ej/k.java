package ej;

import android.app.Application;
import bj.w0;
import hj.n;
import hj.w;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class k implements gj.c {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f54437a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f54438b;

    /* renamed from: c, reason: collision with root package name */
    public final ru.a f54439c;

    /* renamed from: d, reason: collision with root package name */
    public final ru.a f54440d;

    /* renamed from: e, reason: collision with root package name */
    public final ru.a f54441e;

    /* renamed from: f, reason: collision with root package name */
    public final ru.a f54442f;

    /* renamed from: g, reason: collision with root package name */
    public final ru.a f54443g;

    /* renamed from: h, reason: collision with root package name */
    public final ru.a f54444h;

    /* renamed from: i, reason: collision with root package name */
    public final ru.a f54445i;

    public k(ru.a aVar, ru.a aVar2, ru.a aVar3, ru.a aVar4, ru.a aVar5, ru.a aVar6, ru.a aVar7, ru.a aVar8, ru.a aVar9) {
        this.f54437a = aVar;
        this.f54438b = aVar2;
        this.f54439c = aVar3;
        this.f54440d = aVar4;
        this.f54441e = aVar5;
        this.f54442f = aVar6;
        this.f54443g = aVar7;
        this.f54444h = aVar8;
        this.f54445i = aVar9;
    }

    public static k create(ru.a aVar, ru.a aVar2, ru.a aVar3, ru.a aVar4, ru.a aVar5, ru.a aVar6, ru.a aVar7, ru.a aVar8, ru.a aVar9) {
        return new k(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static j newInstance(w0 w0Var, Map<String, ru.a> map, hj.j jVar, w wVar, w wVar2, n nVar, Application application, hj.a aVar, hj.g gVar) {
        return new j(w0Var, map, jVar, wVar, wVar2, nVar, application, aVar, gVar);
    }

    @Override // gj.c, gj.f, ru.a
    public j get() {
        return newInstance((w0) this.f54437a.get(), (Map) this.f54438b.get(), (hj.j) this.f54439c.get(), (w) this.f54440d.get(), (w) this.f54441e.get(), (n) this.f54442f.get(), (Application) this.f54443g.get(), (hj.a) this.f54444h.get(), (hj.g) this.f54445i.get());
    }
}
