package jj;

import android.app.Application;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class e implements gj.f {

    /* renamed from: a, reason: collision with root package name */
    public final p f69632a;

    public e(p pVar) {
        this.f69632a = pVar;
    }

    @Override // gj.f, ru.a
    public Application get() {
        return (Application) gj.e.checkNotNullFromComponent(((m) this.f69632a).providesApplication());
    }
}
