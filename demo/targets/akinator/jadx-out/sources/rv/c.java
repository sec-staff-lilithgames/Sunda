package rv;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final t f84987a;

    /* renamed from: b, reason: collision with root package name */
    public final kv.l f84988b;

    public c(t source, kv.l keySelector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(keySelector, "keySelector");
        this.f84987a = source;
        this.f84988b = keySelector;
    }

    @Override // rv.t
    public Iterator<Object> iterator() {
        return new b(this.f84987a.iterator(), this.f84988b);
    }
}
