package xt;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i[] f93374b;

    /* renamed from: c, reason: collision with root package name */
    public final Iterable f93375c;

    public b(mt.i[] iVarArr, Iterable<? extends mt.i> iterable) {
        this.f93374b = iVarArr;
        this.f93375c = iterable;
    }

    @Override // mt.c
    public void subscribeActual(mt.f fVar) {
        int length;
        mt.i[] iVarArr = this.f93374b;
        if (iVarArr == null) {
            iVarArr = new mt.i[8];
            try {
                length = 0;
                for (mt.i iVar : this.f93375c) {
                    if (iVar == null) {
                        tt.e.error(new NullPointerException("One of the sources is null"), fVar);
                        return;
                    }
                    if (length == iVarArr.length) {
                        mt.i[] iVarArr2 = new mt.i[(length >> 2) + length];
                        System.arraycopy(iVarArr, 0, iVarArr2, 0, length);
                        iVarArr = iVarArr2;
                    }
                    int i10 = length + 1;
                    iVarArr[length] = iVar;
                    length = i10;
                }
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                tt.e.error(th2, fVar);
                return;
            }
        } else {
            length = iVarArr.length;
        }
        pt.b bVar = new pt.b();
        fVar.onSubscribe(bVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        for (int i11 = 0; i11 < length; i11++) {
            mt.i iVar2 = iVarArr[i11];
            if (bVar.isDisposed()) {
                return;
            }
            if (iVar2 == null) {
                Throwable nullPointerException = new NullPointerException("One of the sources is null");
                if (!atomicBoolean.compareAndSet(false, true)) {
                    mu.a.onError(nullPointerException);
                    return;
                } else {
                    bVar.dispose();
                    fVar.onError(nullPointerException);
                    return;
                }
            }
            iVar2.subscribe(new a(atomicBoolean, fVar, bVar));
        }
        if (length == 0) {
            fVar.onComplete();
        }
    }
}
