package zt;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c extends mt.s {

    /* renamed from: b, reason: collision with root package name */
    public final mt.y[] f98551b;

    /* renamed from: c, reason: collision with root package name */
    public final Iterable f98552c;

    public c(mt.y[] yVarArr, Iterable<? extends mt.y> iterable) {
        this.f98551b = yVarArr;
        this.f98552c = iterable;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        int length;
        mt.y[] yVarArr = this.f98551b;
        if (yVarArr == null) {
            yVarArr = new mt.y[8];
            try {
                length = 0;
                for (mt.y yVar : this.f98552c) {
                    if (yVar == null) {
                        tt.e.error(new NullPointerException("One of the sources is null"), vVar);
                        return;
                    }
                    if (length == yVarArr.length) {
                        mt.y[] yVarArr2 = new mt.y[(length >> 2) + length];
                        System.arraycopy(yVarArr, 0, yVarArr2, 0, length);
                        yVarArr = yVarArr2;
                    }
                    int i10 = length + 1;
                    yVarArr[length] = yVar;
                    length = i10;
                }
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                tt.e.error(th2, vVar);
                return;
            }
        } else {
            length = yVarArr.length;
        }
        pt.b bVar = new pt.b();
        vVar.onSubscribe(bVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        for (int i11 = 0; i11 < length; i11++) {
            mt.y yVar2 = yVarArr[i11];
            if (bVar.isDisposed()) {
                return;
            }
            if (yVar2 == null) {
                bVar.dispose();
                Throwable nullPointerException = new NullPointerException("One of the MaybeSources is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    vVar.onError(nullPointerException);
                    return;
                } else {
                    mu.a.onError(nullPointerException);
                    return;
                }
            }
            yVar2.subscribe(new b(vVar, bVar, atomicBoolean));
        }
        if (length == 0) {
            vVar.onComplete();
        }
    }
}
