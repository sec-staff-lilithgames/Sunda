package ph;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import mh.g3;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s0 implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final q0 f81345f = new q0();

    /* renamed from: e, reason: collision with root package name */
    public Throwable f81348e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f81347c = new ArrayDeque(4);

    /* renamed from: b, reason: collision with root package name */
    public final r0 f81346b = (r0) p1.checkNotNull(f81345f);

    public static s0 create() {
        return new s0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        Throwable th2 = this.f81348e;
        while (true) {
            ArrayDeque arrayDeque = this.f81347c;
            if (arrayDeque.isEmpty()) {
                break;
            }
            Closeable closeable = (Closeable) arrayDeque.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else {
                    ((q0) this.f81346b).suppress(closeable, th2, th3);
                }
            }
        }
        if (this.f81348e != null || th2 == null) {
            return;
        }
        g3.throwIfInstanceOf(th2, IOException.class);
        g3.throwIfUnchecked(th2);
        throw new AssertionError(th2);
    }

    public <C extends Closeable> C register(C c10) {
        if (c10 != null) {
            this.f81347c.addFirst(c10);
        }
        return c10;
    }

    public RuntimeException rethrow(Throwable th2) throws Throwable {
        p1.checkNotNull(th2);
        this.f81348e = th2;
        g3.throwIfInstanceOf(th2, IOException.class);
        g3.throwIfUnchecked(th2);
        throw new RuntimeException(th2);
    }

    public <X extends Exception> RuntimeException rethrow(Throwable th2, Class<X> cls) throws Exception {
        p1.checkNotNull(th2);
        this.f81348e = th2;
        g3.throwIfInstanceOf(th2, IOException.class);
        g3.throwIfInstanceOf(th2, cls);
        g3.throwIfUnchecked(th2);
        throw new RuntimeException(th2);
    }

    public <X1 extends Exception, X2 extends Exception> RuntimeException rethrow(Throwable th2, Class<X1> cls, Class<X2> cls2) throws Exception {
        p1.checkNotNull(th2);
        this.f81348e = th2;
        g3.throwIfInstanceOf(th2, IOException.class);
        g3.throwIfInstanceOf(th2, cls);
        g3.throwIfInstanceOf(th2, cls2);
        g3.throwIfUnchecked(th2);
        throw new RuntimeException(th2);
    }
}
