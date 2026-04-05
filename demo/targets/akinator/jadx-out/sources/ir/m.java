package ir;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f68356a;

    /* renamed from: b, reason: collision with root package name */
    public final tu.o f68357b;

    public m(String name) {
        e0.checkNotNullParameter(name, "name");
        this.f68356a = name;
        this.f68357b = tu.q.lazy(new l(this));
    }

    public String toString() {
        return (String) this.f68357b.getValue();
    }
}
