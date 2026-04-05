package ds;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import wr.o6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayBlockingQueue f52609b = new ArrayBlockingQueue(3);

    /* renamed from: c, reason: collision with root package name */
    public final h f52610c = new h(this);

    /* renamed from: e, reason: collision with root package name */
    public final wr.p f52611e;

    /* renamed from: f, reason: collision with root package name */
    public Object f52612f;

    public i(wr.p pVar) {
        this.f52611e = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean hasNext() throws java.lang.Throwable {
        /*
            r4 = this;
        L0:
            java.lang.Object r0 = r4.f52612f
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L30
        L6:
            java.util.concurrent.ArrayBlockingQueue r0 = r4.f52609b     // Catch: java.lang.Throwable -> L18 java.lang.InterruptedException -> L1b
            java.lang.Object r0 = r0.take()     // Catch: java.lang.Throwable -> L18 java.lang.InterruptedException -> L1b
            if (r2 == 0) goto L15
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L15:
            r4.f52612f = r0
            goto L0
        L18:
            r0 = move-exception
            r1 = r2
            goto L26
        L1b:
            r0 = move-exception
            wr.p r2 = r4.f52611e     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "Thread interrupted"
            r2.cancel(r3, r0)     // Catch: java.lang.Throwable -> L25
            r2 = r1
            goto L6
        L25:
            r0 = move-exception
        L26:
            if (r1 == 0) goto L2f
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L2f:
            throw r0
        L30:
            boolean r3 = r0 instanceof wr.o6
            if (r3 != 0) goto L39
            if (r0 == r4) goto L37
            goto L38
        L37:
            r1 = r2
        L38:
            return r1
        L39:
            wr.o6 r0 = (wr.o6) r0
            wr.m6 r1 = r0.getStatus()
            wr.e4 r0 = r0.getTrailers()
            wr.o6 r0 = r1.asRuntimeException(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ds.i.hasNext():boolean");
    }

    @Override // java.util.Iterator
    public Object next() {
        Object obj = this.f52612f;
        if (!(obj instanceof o6) && obj != this) {
            this.f52611e.request(1);
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj2 = this.f52612f;
        this.f52612f = null;
        return obj2;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
