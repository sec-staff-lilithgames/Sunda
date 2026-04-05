package m7;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g implements k {

    /* renamed from: b, reason: collision with root package name */
    public final j f74059b;

    public g(j jVar) {
        this.f74059b = jVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return e0.areEqual(this.f74059b, ((g) obj).f74059b);
        }
        return false;
    }

    public int hashCode() {
        return this.f74059b.hashCode();
    }

    @Override // m7.k
    public Object size(zu.d<? super j> dVar) {
        return this.f74059b;
    }
}
