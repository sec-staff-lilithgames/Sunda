package io.ktor.utils.io.bits;

import e3.g;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class PrimitiveArraysJvmKt {
    /* renamed from: loadDoubleArray-9zorpBc, reason: not valid java name */
    public static final void m4419loadDoubleArray9zorpBc(ByteBuffer loadDoubleArray, long j10, double[] destination, int i10, int i11) {
        e0.checkNotNullParameter(loadDoubleArray, "$this$loadDoubleArray");
        e0.checkNotNullParameter(destination, "destination");
        if (j10 >= 2147483647L) {
            throw g.r(j10, "offset");
        }
        m4418loadDoubleArray9zorpBc(loadDoubleArray, (int) j10, destination, i10, i11);
    }

    /* renamed from: loadDoubleArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m4420loadDoubleArray9zorpBc$default(ByteBuffer byteBuffer, int i10, double[] dArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = dArr.length - i11;
        }
        m4418loadDoubleArray9zorpBc(byteBuffer, i10, dArr, i11, i12);
    }

    /* renamed from: loadFloatArray-9zorpBc, reason: not valid java name */
    public static final void m4423loadFloatArray9zorpBc(ByteBuffer loadFloatArray, long j10, float[] destination, int i10, int i11) {
        e0.checkNotNullParameter(loadFloatArray, "$this$loadFloatArray");
        e0.checkNotNullParameter(destination, "destination");
        if (j10 >= 2147483647L) {
            throw g.r(j10, "offset");
        }
        m4422loadFloatArray9zorpBc(loadFloatArray, (int) j10, destination, i10, i11);
    }

    /* renamed from: loadFloatArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m4424loadFloatArray9zorpBc$default(ByteBuffer byteBuffer, int i10, float[] fArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = fArr.length - i11;
        }
        m4422loadFloatArray9zorpBc(byteBuffer, i10, fArr, i11, i12);
    }

    /* renamed from: loadIntArray-9zorpBc, reason: not valid java name */
    public static final void m4427loadIntArray9zorpBc(ByteBuffer loadIntArray, long j10, int[] destination, int i10, int i11) {
        e0.checkNotNullParameter(loadIntArray, "$this$loadIntArray");
        e0.checkNotNullParameter(destination, "destination");
        if (j10 >= 2147483647L) {
            throw g.r(j10, "offset");
        }
        m4426loadIntArray9zorpBc(loadIntArray, (int) j10, destination, i10, i11);
    }

    /* renamed from: loadIntArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m4428loadIntArray9zorpBc$default(ByteBuffer byteBuffer, int i10, int[] iArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length - i11;
        }
        m4426loadIntArray9zorpBc(byteBuffer, i10, iArr, i11, i12);
    }

    /* renamed from: loadLongArray-9zorpBc, reason: not valid java name */
    public static final void m4431loadLongArray9zorpBc(ByteBuffer loadLongArray, long j10, long[] destination, int i10, int i11) {
        e0.checkNotNullParameter(loadLongArray, "$this$loadLongArray");
        e0.checkNotNullParameter(destination, "destination");
        if (j10 >= 2147483647L) {
            throw g.r(j10, "offset");
        }
        m4430loadLongArray9zorpBc(loadLongArray, (int) j10, destination, i10, i11);
    }

    /* renamed from: loadLongArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m4432loadLongArray9zorpBc$default(ByteBuffer byteBuffer, int i10, long[] jArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = jArr.length - i11;
        }
        m4430loadLongArray9zorpBc(byteBuffer, i10, jArr, i11, i12);
    }

    /* renamed from: loadShortArray-9zorpBc, reason: not valid java name */
    public static final void m4435loadShortArray9zorpBc(ByteBuffer loadShortArray, long j10, short[] destination, int i10, int i11) {
        e0.checkNotNullParameter(loadShortArray, "$this$loadShortArray");
        e0.checkNotNullParameter(destination, "destination");
        if (j10 >= 2147483647L) {
            throw g.r(j10, "offset");
        }
        m4434loadShortArray9zorpBc(loadShortArray, (int) j10, destination, i10, i11);
    }

    /* renamed from: loadShortArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m4436loadShortArray9zorpBc$default(ByteBuffer byteBuffer, int i10, short[] sArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = sArr.length - i11;
        }
        m4434loadShortArray9zorpBc(byteBuffer, i10, sArr, i11, i12);
    }

    /* renamed from: storeDoubleArray-9zorpBc, reason: not valid java name */
    public static final void m4439storeDoubleArray9zorpBc(ByteBuffer storeDoubleArray, long j10, double[] source, int i10, int i11) {
        e0.checkNotNullParameter(storeDoubleArray, "$this$storeDoubleArray");
        e0.checkNotNullParameter(source, "source");
        if (j10 >= 2147483647L) {
            throw g.r(j10, "offset");
        }
        m4438storeDoubleArray9zorpBc(storeDoubleArray, (int) j10, source, i10, i11);
    }

    /* renamed from: storeDoubleArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m4440storeDoubleArray9zorpBc$default(ByteBuffer byteBuffer, int i10, double[] dArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = dArr.length - i11;
        }
        m4438storeDoubleArray9zorpBc(byteBuffer, i10, dArr, i11, i12);
    }

    /* renamed from: storeFloatArray-9zorpBc, reason: not valid java name */
    public static final void m4443storeFloatArray9zorpBc(ByteBuffer storeFloatArray, long j10, float[] source, int i10, int i11) {
        e0.checkNotNullParameter(storeFloatArray, "$this$storeFloatArray");
        e0.checkNotNullParameter(source, "source");
        if (j10 >= 2147483647L) {
            throw g.r(j10, "offset");
        }
        m4442storeFloatArray9zorpBc(storeFloatArray, (int) j10, source, i10, i11);
    }

    /* renamed from: storeFloatArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m4444storeFloatArray9zorpBc$default(ByteBuffer byteBuffer, int i10, float[] fArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = fArr.length - i11;
        }
        m4442storeFloatArray9zorpBc(byteBuffer, i10, fArr, i11, i12);
    }

    /* renamed from: storeIntArray-9zorpBc, reason: not valid java name */
    public static final void m4447storeIntArray9zorpBc(ByteBuffer storeIntArray, long j10, int[] source, int i10, int i11) {
        e0.checkNotNullParameter(storeIntArray, "$this$storeIntArray");
        e0.checkNotNullParameter(source, "source");
        if (j10 >= 2147483647L) {
            throw g.r(j10, "offset");
        }
        m4446storeIntArray9zorpBc(storeIntArray, (int) j10, source, i10, i11);
    }

    /* renamed from: storeIntArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m4448storeIntArray9zorpBc$default(ByteBuffer byteBuffer, int i10, int[] iArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length - i11;
        }
        m4446storeIntArray9zorpBc(byteBuffer, i10, iArr, i11, i12);
    }

    /* renamed from: storeLongArray-9zorpBc, reason: not valid java name */
    public static final void m4451storeLongArray9zorpBc(ByteBuffer storeLongArray, long j10, long[] source, int i10, int i11) {
        e0.checkNotNullParameter(storeLongArray, "$this$storeLongArray");
        e0.checkNotNullParameter(source, "source");
        if (j10 >= 2147483647L) {
            throw g.r(j10, "offset");
        }
        m4450storeLongArray9zorpBc(storeLongArray, (int) j10, source, i10, i11);
    }

    /* renamed from: storeLongArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m4452storeLongArray9zorpBc$default(ByteBuffer byteBuffer, int i10, long[] jArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = jArr.length - i11;
        }
        m4450storeLongArray9zorpBc(byteBuffer, i10, jArr, i11, i12);
    }

    /* renamed from: storeShortArray-9zorpBc, reason: not valid java name */
    public static final void m4455storeShortArray9zorpBc(ByteBuffer storeShortArray, long j10, short[] source, int i10, int i11) {
        e0.checkNotNullParameter(storeShortArray, "$this$storeShortArray");
        e0.checkNotNullParameter(source, "source");
        if (j10 >= 2147483647L) {
            throw g.r(j10, "offset");
        }
        m4454storeShortArray9zorpBc(storeShortArray, (int) j10, source, i10, i11);
    }

    /* renamed from: storeShortArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m4456storeShortArray9zorpBc$default(ByteBuffer byteBuffer, int i10, short[] sArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = sArr.length - i11;
        }
        m4454storeShortArray9zorpBc(byteBuffer, i10, sArr, i11, i12);
    }

    private static final ByteBuffer withOffset(ByteBuffer byteBuffer, int i10) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        e0.checkNotNull(byteBufferDuplicate);
        byteBufferDuplicate.position(i10);
        return byteBufferDuplicate;
    }

    /* renamed from: loadDoubleArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m4421loadDoubleArray9zorpBc$default(ByteBuffer byteBuffer, long j10, double[] dArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = dArr.length - i13;
        }
        m4419loadDoubleArray9zorpBc(byteBuffer, j10, dArr, i13, i11);
    }

    /* renamed from: loadFloatArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m4425loadFloatArray9zorpBc$default(ByteBuffer byteBuffer, long j10, float[] fArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = fArr.length - i13;
        }
        m4423loadFloatArray9zorpBc(byteBuffer, j10, fArr, i13, i11);
    }

    /* renamed from: loadIntArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m4429loadIntArray9zorpBc$default(ByteBuffer byteBuffer, long j10, int[] iArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = iArr.length - i13;
        }
        m4427loadIntArray9zorpBc(byteBuffer, j10, iArr, i13, i11);
    }

    /* renamed from: loadLongArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m4433loadLongArray9zorpBc$default(ByteBuffer byteBuffer, long j10, long[] jArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = jArr.length - i13;
        }
        m4431loadLongArray9zorpBc(byteBuffer, j10, jArr, i13, i11);
    }

    /* renamed from: loadShortArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m4437loadShortArray9zorpBc$default(ByteBuffer byteBuffer, long j10, short[] sArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = sArr.length - i13;
        }
        m4435loadShortArray9zorpBc(byteBuffer, j10, sArr, i13, i11);
    }

    /* renamed from: storeDoubleArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m4441storeDoubleArray9zorpBc$default(ByteBuffer byteBuffer, long j10, double[] dArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = dArr.length - i13;
        }
        m4439storeDoubleArray9zorpBc(byteBuffer, j10, dArr, i13, i11);
    }

    /* renamed from: storeFloatArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m4445storeFloatArray9zorpBc$default(ByteBuffer byteBuffer, long j10, float[] fArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = fArr.length - i13;
        }
        m4443storeFloatArray9zorpBc(byteBuffer, j10, fArr, i13, i11);
    }

    /* renamed from: storeIntArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m4449storeIntArray9zorpBc$default(ByteBuffer byteBuffer, long j10, int[] iArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = iArr.length - i13;
        }
        m4447storeIntArray9zorpBc(byteBuffer, j10, iArr, i13, i11);
    }

    /* renamed from: storeLongArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m4453storeLongArray9zorpBc$default(ByteBuffer byteBuffer, long j10, long[] jArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = jArr.length - i13;
        }
        m4451storeLongArray9zorpBc(byteBuffer, j10, jArr, i13, i11);
    }

    /* renamed from: storeShortArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m4457storeShortArray9zorpBc$default(ByteBuffer byteBuffer, long j10, short[] sArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = sArr.length - i13;
        }
        m4455storeShortArray9zorpBc(byteBuffer, j10, sArr, i13, i11);
    }

    /* renamed from: loadDoubleArray-9zorpBc, reason: not valid java name */
    public static final void m4418loadDoubleArray9zorpBc(ByteBuffer loadDoubleArray, int i10, double[] destination, int i11, int i12) {
        e0.checkNotNullParameter(loadDoubleArray, "$this$loadDoubleArray");
        e0.checkNotNullParameter(destination, "destination");
        ByteBuffer byteBufferDuplicate = loadDoubleArray.duplicate();
        e0.checkNotNull(byteBufferDuplicate);
        byteBufferDuplicate.position(i10);
        byteBufferDuplicate.asDoubleBuffer().get(destination, i11, i12);
    }

    /* renamed from: loadFloatArray-9zorpBc, reason: not valid java name */
    public static final void m4422loadFloatArray9zorpBc(ByteBuffer loadFloatArray, int i10, float[] destination, int i11, int i12) {
        e0.checkNotNullParameter(loadFloatArray, "$this$loadFloatArray");
        e0.checkNotNullParameter(destination, "destination");
        ByteBuffer byteBufferDuplicate = loadFloatArray.duplicate();
        e0.checkNotNull(byteBufferDuplicate);
        byteBufferDuplicate.position(i10);
        byteBufferDuplicate.asFloatBuffer().get(destination, i11, i12);
    }

    /* renamed from: loadIntArray-9zorpBc, reason: not valid java name */
    public static final void m4426loadIntArray9zorpBc(ByteBuffer loadIntArray, int i10, int[] destination, int i11, int i12) {
        e0.checkNotNullParameter(loadIntArray, "$this$loadIntArray");
        e0.checkNotNullParameter(destination, "destination");
        ByteBuffer byteBufferDuplicate = loadIntArray.duplicate();
        e0.checkNotNull(byteBufferDuplicate);
        byteBufferDuplicate.position(i10);
        byteBufferDuplicate.asIntBuffer().get(destination, i11, i12);
    }

    /* renamed from: loadLongArray-9zorpBc, reason: not valid java name */
    public static final void m4430loadLongArray9zorpBc(ByteBuffer loadLongArray, int i10, long[] destination, int i11, int i12) {
        e0.checkNotNullParameter(loadLongArray, "$this$loadLongArray");
        e0.checkNotNullParameter(destination, "destination");
        ByteBuffer byteBufferDuplicate = loadLongArray.duplicate();
        e0.checkNotNull(byteBufferDuplicate);
        byteBufferDuplicate.position(i10);
        byteBufferDuplicate.asLongBuffer().get(destination, i11, i12);
    }

    /* renamed from: loadShortArray-9zorpBc, reason: not valid java name */
    public static final void m4434loadShortArray9zorpBc(ByteBuffer loadShortArray, int i10, short[] destination, int i11, int i12) {
        e0.checkNotNullParameter(loadShortArray, "$this$loadShortArray");
        e0.checkNotNullParameter(destination, "destination");
        ByteBuffer byteBufferDuplicate = loadShortArray.duplicate();
        e0.checkNotNull(byteBufferDuplicate);
        byteBufferDuplicate.position(i10);
        byteBufferDuplicate.asShortBuffer().get(destination, i11, i12);
    }

    /* renamed from: storeDoubleArray-9zorpBc, reason: not valid java name */
    public static final void m4438storeDoubleArray9zorpBc(ByteBuffer storeDoubleArray, int i10, double[] source, int i11, int i12) {
        e0.checkNotNullParameter(storeDoubleArray, "$this$storeDoubleArray");
        e0.checkNotNullParameter(source, "source");
        ByteBuffer byteBufferDuplicate = storeDoubleArray.duplicate();
        e0.checkNotNull(byteBufferDuplicate);
        byteBufferDuplicate.position(i10);
        byteBufferDuplicate.asDoubleBuffer().put(source, i11, i12);
    }

    /* renamed from: storeFloatArray-9zorpBc, reason: not valid java name */
    public static final void m4442storeFloatArray9zorpBc(ByteBuffer storeFloatArray, int i10, float[] source, int i11, int i12) {
        e0.checkNotNullParameter(storeFloatArray, "$this$storeFloatArray");
        e0.checkNotNullParameter(source, "source");
        ByteBuffer byteBufferDuplicate = storeFloatArray.duplicate();
        e0.checkNotNull(byteBufferDuplicate);
        byteBufferDuplicate.position(i10);
        byteBufferDuplicate.asFloatBuffer().put(source, i11, i12);
    }

    /* renamed from: storeIntArray-9zorpBc, reason: not valid java name */
    public static final void m4446storeIntArray9zorpBc(ByteBuffer storeIntArray, int i10, int[] source, int i11, int i12) {
        e0.checkNotNullParameter(storeIntArray, "$this$storeIntArray");
        e0.checkNotNullParameter(source, "source");
        ByteBuffer byteBufferDuplicate = storeIntArray.duplicate();
        e0.checkNotNull(byteBufferDuplicate);
        byteBufferDuplicate.position(i10);
        byteBufferDuplicate.asIntBuffer().put(source, i11, i12);
    }

    /* renamed from: storeLongArray-9zorpBc, reason: not valid java name */
    public static final void m4450storeLongArray9zorpBc(ByteBuffer storeLongArray, int i10, long[] source, int i11, int i12) {
        e0.checkNotNullParameter(storeLongArray, "$this$storeLongArray");
        e0.checkNotNullParameter(source, "source");
        ByteBuffer byteBufferDuplicate = storeLongArray.duplicate();
        e0.checkNotNull(byteBufferDuplicate);
        byteBufferDuplicate.position(i10);
        byteBufferDuplicate.asLongBuffer().put(source, i11, i12);
    }

    /* renamed from: storeShortArray-9zorpBc, reason: not valid java name */
    public static final void m4454storeShortArray9zorpBc(ByteBuffer storeShortArray, int i10, short[] source, int i11, int i12) {
        e0.checkNotNullParameter(storeShortArray, "$this$storeShortArray");
        e0.checkNotNullParameter(source, "source");
        ByteBuffer byteBufferDuplicate = storeShortArray.duplicate();
        e0.checkNotNull(byteBufferDuplicate);
        byteBufferDuplicate.position(i10);
        byteBufferDuplicate.asShortBuffer().put(source, i11, i12);
    }
}
