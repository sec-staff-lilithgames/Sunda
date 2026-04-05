package tt;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends AtomicReferenceArray implements pt.c {
    public a(int i10) {
        super(i10);
    }

    @Override // pt.c
    public void dispose() {
        pt.c cVar;
        Object obj = get(0);
        d dVar = d.f87352b;
        if (obj != dVar) {
            int length = length();
            for (int i10 = 0; i10 < length; i10++) {
                if (((pt.c) get(i10)) != dVar && (cVar = (pt.c) getAndSet(i10, dVar)) != dVar && cVar != null) {
                    cVar.dispose();
                }
            }
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get(0) == d.f87352b;
    }

    public pt.c replaceResource(int i10, pt.c cVar) {
        pt.c cVar2;
        do {
            cVar2 = (pt.c) get(i10);
            if (cVar2 == d.f87352b) {
                cVar.dispose();
                return null;
            }
        } while (!compareAndSet(i10, cVar2, cVar));
        return cVar2;
    }

    public boolean setResource(int i10, pt.c cVar) {
        pt.c cVar2;
        do {
            cVar2 = (pt.c) get(i10);
            if (cVar2 == d.f87352b) {
                cVar.dispose();
                return false;
            }
        } while (!compareAndSet(i10, cVar2, cVar));
        if (cVar2 == null) {
            return true;
        }
        cVar2.dispose();
        return true;
    }
}
