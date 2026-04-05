package tt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h extends AtomicReference implements pt.c {
    public h() {
    }

    @Override // pt.c
    public void dispose() {
        d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return d.isDisposed((pt.c) get());
    }

    public boolean replace(pt.c cVar) {
        return d.replace(this, cVar);
    }

    public boolean update(pt.c cVar) {
        return d.set(this, cVar);
    }

    public h(pt.c cVar) {
        lazySet(cVar);
    }
}
