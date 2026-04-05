package fu;

import java.util.concurrent.atomic.AtomicReference;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class m0 extends AtomicReference implements pt.c {
    public m0() {
        super(o0.f56064h);
    }

    public abstract pt.c a(m0.a aVar, mt.f fVar);

    @Override // pt.c
    public void dispose() {
        pt.c cVar;
        pt.c cVar2 = o0.f56065i;
        do {
            cVar = (pt.c) get();
            if (cVar == o0.f56065i) {
                return;
            }
        } while (!compareAndSet(cVar, cVar2));
        if (cVar != o0.f56064h) {
            cVar.dispose();
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return ((pt.c) get()).isDisposed();
    }
}
