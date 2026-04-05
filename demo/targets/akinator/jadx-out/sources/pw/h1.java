package pw;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class h1 {
    public static final byte[] asUtf8ToByteArray(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(sv.g.f86134b);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    public static final ReentrantLock newLock() {
        return new ReentrantLock();
    }

    public static final String toUtf8String(byte[] bArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, sv.g.f86134b);
    }

    public static final <T> T withLock(ReentrantLock reentrantLock, kv.a action) {
        kotlin.jvm.internal.e0.checkNotNullParameter(reentrantLock, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        reentrantLock.lock();
        try {
            return (T) action.invoke();
        } finally {
            kotlin.jvm.internal.b0.finallyStart(1);
            reentrantLock.unlock();
            kotlin.jvm.internal.b0.finallyEnd(1);
        }
    }
}
