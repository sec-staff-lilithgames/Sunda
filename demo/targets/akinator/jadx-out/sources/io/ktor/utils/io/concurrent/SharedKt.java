package io.ktor.utils.io.concurrent;

import kotlin.jvm.internal.e0;
import kv.a;
import nv.b;
import nv.c;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class SharedKt {
    @f
    public static final <T> c shared(T t10) {
        throw new IllegalStateException("Obsolete in new memory model");
    }

    @f
    public static final <T> b sharedLazy(a function) {
        e0.checkNotNullParameter(function, "function");
        throw new IllegalStateException("Obsolete in new memory model");
    }

    @f
    public static final <T> b threadLocal(T value) {
        e0.checkNotNullParameter(value, "value");
        throw new IllegalStateException("Obsolete in new memory model");
    }
}
