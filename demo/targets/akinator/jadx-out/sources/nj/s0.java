package nj;

import android.app.Application;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class s0 implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f77009a;

    public s0(ru.a aVar) {
        this.f77009a = aVar;
    }

    public static s0 create(ru.a aVar) {
        return new s0(aVar);
    }

    public static r0 newInstance(Application application) {
        return new r0(application);
    }

    @Override // dj.b, dj.e, ru.a
    public r0 get() {
        return newInstance((Application) this.f77009a.get());
    }
}
