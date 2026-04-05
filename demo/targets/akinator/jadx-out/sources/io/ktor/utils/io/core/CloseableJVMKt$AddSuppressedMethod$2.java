package io.ktor.utils.io.core;

import java.lang.reflect.Method;
import kotlin.jvm.internal.f0;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class CloseableJVMKt$AddSuppressedMethod$2 extends f0 implements a {
    public static final CloseableJVMKt$AddSuppressedMethod$2 INSTANCE = new CloseableJVMKt$AddSuppressedMethod$2();

    public CloseableJVMKt$AddSuppressedMethod$2() {
        super(0);
    }

    @Override // kv.a
    public final Method invoke() {
        try {
            return Throwable.class.getMethod("addSuppressed", Throwable.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
