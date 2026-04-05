package io.ktor.utils.io.core;

import java.io.Closeable;
import java.io.IOException;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class CloseableKt {
    public static final <C extends Closeable, R> R use(C c10, l block) throws IOException {
        e0.checkNotNullParameter(c10, "<this>");
        e0.checkNotNullParameter(block, "block");
        try {
            R r10 = (R) block.invoke(c10);
            b0.finallyStart(1);
            c10.close();
            b0.finallyEnd(1);
            return r10;
        } finally {
        }
    }
}
