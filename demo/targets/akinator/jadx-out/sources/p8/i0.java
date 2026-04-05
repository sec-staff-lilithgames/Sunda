package p8;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final f9.j f80776a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f80777b;

    public i0(f9.j jVar, Executor executor) {
        this.f80776a = jVar;
        this.f80777b = executor;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i0) {
            return this.f80776a.equals(((i0) obj).f80776a);
        }
        return false;
    }

    public int hashCode() {
        return this.f80776a.hashCode();
    }
}
