package io.ktor.util;

import kotlin.jvm.internal.e0;
import uu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class Hash {
    public static final Hash INSTANCE = new Hash();

    private Hash() {
    }

    public final int combine(Object... objects) {
        e0.checkNotNullParameter(objects, "objects");
        return k0.toList(objects).hashCode();
    }
}
