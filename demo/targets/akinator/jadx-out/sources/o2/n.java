package o2;

import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class n {
    public static final o createSynchronizedObject() {
        return new o();
    }

    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m5776synchronized(o lock, kv.a block) {
        R r10;
        e0.checkNotNullParameter(lock, "lock");
        e0.checkNotNullParameter(block, "block");
        synchronized (lock) {
            try {
                r10 = (R) block.invoke();
                b0.finallyStart(1);
            } catch (Throwable th2) {
                b0.finallyStart(1);
                b0.finallyEnd(1);
                throw th2;
            }
        }
        b0.finallyEnd(1);
        return r10;
    }
}
