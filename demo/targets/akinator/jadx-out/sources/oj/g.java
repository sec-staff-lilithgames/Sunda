package oj;

import android.app.Application;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class g implements dj.e {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f79421a;

    public g(a0 a0Var) {
        this.f79421a = a0Var;
    }

    @Override // dj.e, ru.a
    public Application get() {
        return (Application) dj.d.checkNotNullFromComponent(((y) this.f79421a).application());
    }
}
