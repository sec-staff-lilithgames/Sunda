package nj;

import android.app.Application;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class i implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f76940a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f76941b;

    /* renamed from: c, reason: collision with root package name */
    public final ru.a f76942c;

    public i(ru.a aVar, ru.a aVar2, ru.a aVar3) {
        this.f76940a = aVar;
        this.f76941b = aVar2;
        this.f76942c = aVar3;
    }

    public static i create(ru.a aVar, ru.a aVar2, ru.a aVar3) {
        return new i(aVar, aVar2, aVar3);
    }

    public static h newInstance(q0 q0Var, Application application, qj.a aVar) {
        return new h(q0Var, application, aVar);
    }

    @Override // dj.b, dj.e, ru.a
    public h get() {
        return newInstance((q0) this.f76940a.get(), (Application) this.f76941b.get(), (qj.a) this.f76942c.get());
    }
}
