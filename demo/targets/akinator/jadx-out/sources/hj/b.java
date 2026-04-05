package hj;

import android.app.Application;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b implements gj.c {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f58931a;

    public b(ru.a aVar) {
        this.f58931a = aVar;
    }

    public static b create(ru.a aVar) {
        return new b(aVar);
    }

    public static a newInstance(Application application) {
        return new a(application);
    }

    @Override // gj.c, gj.f, ru.a
    public a get() {
        return newInstance((Application) this.f58931a.get());
    }
}
