package tt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends AtomicReference implements pt.c {
    public b(st.f fVar) {
        super(fVar);
    }

    @Override // pt.c
    public void dispose() {
        if (get() != null && getAndSet(null) != null) {
            throw new ClassCastException();
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get() == null;
    }
}
