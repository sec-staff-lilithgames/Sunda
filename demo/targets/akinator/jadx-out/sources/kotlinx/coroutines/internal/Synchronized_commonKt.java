package kotlinx.coroutines.internal;

import kotlin.jvm.internal.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Synchronized_commonKt {
    /* renamed from: synchronized, reason: not valid java name */
    public static final <T> T m5208synchronized(Object obj, kv.a aVar) {
        T t10;
        synchronized (obj) {
            try {
                t10 = (T) aVar.invoke();
                b0.finallyStart(1);
            } catch (Throwable th2) {
                b0.finallyStart(1);
                b0.finallyEnd(1);
                throw th2;
            }
        }
        b0.finallyEnd(1);
        return t10;
    }
}
