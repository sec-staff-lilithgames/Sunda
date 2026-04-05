package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class CharArrayPool extends CharArrayPoolBase {
    public static final CharArrayPool INSTANCE = new CharArrayPool();

    private CharArrayPool() {
    }

    public final void release(char[] array) {
        e0.checkNotNullParameter(array, "array");
        releaseImpl(array);
    }

    public final char[] take() {
        return take(128);
    }
}
