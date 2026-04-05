package com.applovin.shadow.okio;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kv.a;
import sv.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class _JvmPlatformKt {
    public static final byte[] asUtf8ToByteArray(String str) {
        e0.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(g.f86134b);
        e0.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final ReentrantLock newLock() {
        return new ReentrantLock();
    }

    public static final String toUtf8String(byte[] bArr) {
        e0.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, g.f86134b);
    }

    public static final <T> T withLock(ReentrantLock reentrantLock, a action) {
        e0.checkNotNullParameter(reentrantLock, "<this>");
        e0.checkNotNullParameter(action, "action");
        reentrantLock.lock();
        try {
            return (T) action.invoke();
        } finally {
            b0.finallyStart(1);
            reentrantLock.unlock();
            b0.finallyEnd(1);
        }
    }
}
