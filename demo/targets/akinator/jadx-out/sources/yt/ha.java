package yt;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ha extends ArrayList implements aa {

    /* renamed from: b, reason: collision with root package name */
    public volatile int f95597b;

    @Override // yt.aa
    public void complete() {
        add(iu.u.complete());
        this.f95597b++;
    }

    @Override // yt.aa
    public void error(Throwable th2) {
        add(iu.u.error(th2));
        this.f95597b++;
    }

    @Override // yt.aa
    public void next(Object obj) {
        add(iu.u.next(obj));
        this.f95597b++;
    }

    @Override // yt.aa
    public void replay(w9 w9Var) {
        synchronized (w9Var) {
            try {
                if (w9Var.f96499g) {
                    w9Var.f96500h = true;
                    return;
                }
                w9Var.f96499g = true;
                tw.c cVar = w9Var.f96496c;
                while (!w9Var.isDisposed()) {
                    int i10 = this.f95597b;
                    Integer num = (Integer) w9Var.f96497e;
                    int iIntValue = num != null ? num.intValue() : 0;
                    long j10 = w9Var.get();
                    long j11 = j10;
                    long j12 = 0;
                    while (j11 != 0 && iIntValue < i10) {
                        E e10 = get(iIntValue);
                        try {
                            if (iu.u.accept(e10, cVar) || w9Var.isDisposed()) {
                                return;
                            }
                            iIntValue++;
                            j11--;
                            j12++;
                        } catch (Throwable th2) {
                            qt.d.throwIfFatal(th2);
                            w9Var.dispose();
                            if (iu.u.isError(e10) || iu.u.isComplete(e10)) {
                                return;
                            }
                            cVar.onError(th2);
                            return;
                        }
                    }
                    if (j12 != 0) {
                        w9Var.f96497e = Integer.valueOf(iIntValue);
                        if (j10 != Long.MAX_VALUE) {
                            w9Var.produced(j12);
                        }
                    }
                    synchronized (w9Var) {
                        try {
                            if (!w9Var.f96500h) {
                                w9Var.f96499g = false;
                                return;
                            }
                            w9Var.f96500h = false;
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }
}
