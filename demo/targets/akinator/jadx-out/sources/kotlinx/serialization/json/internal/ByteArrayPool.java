package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ByteArrayPool extends ByteArrayPoolBase {
    public static final ByteArrayPool INSTANCE = new ByteArrayPool();

    private ByteArrayPool() {
    }

    public final void release(byte[] array) {
        e0.checkNotNullParameter(array, "array");
        releaseImpl(array);
    }

    public final byte[] take() {
        return take(512);
    }
}
