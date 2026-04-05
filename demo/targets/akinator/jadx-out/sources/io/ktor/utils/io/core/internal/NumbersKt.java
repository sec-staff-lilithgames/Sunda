package io.ktor.utils.io.core.internal;

import e3.g;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class NumbersKt {
    public static final Void failLongToIntConversion(long j10, String name) {
        e0.checkNotNullParameter(name, "name");
        throw new IllegalArgumentException("Long value " + j10 + " of " + name + " doesn't fit into 32-bit integer");
    }

    public static final int toIntOrFail(long j10, String name) {
        e0.checkNotNullParameter(name, "name");
        if (j10 < 2147483647L) {
            return (int) j10;
        }
        throw g.r(j10, name);
    }
}
