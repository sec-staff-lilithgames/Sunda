package rv;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a implements t {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f84970a;

    public a(t sequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sequence, "sequence");
        this.f84970a = new AtomicReference(sequence);
    }

    @Override // rv.t
    public Iterator<Object> iterator() {
        t tVar = (t) this.f84970a.getAndSet(null);
        if (tVar != null) {
            return tVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
