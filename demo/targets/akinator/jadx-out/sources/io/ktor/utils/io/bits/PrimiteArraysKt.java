package io.ktor.utils.io.bits;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.e0;
import tu.i0;
import tu.m0;
import tu.q0;
import tu.v0;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class PrimiteArraysKt {
    /* renamed from: loadByteArray-9zorpBc, reason: not valid java name */
    public static final void m4378loadByteArray9zorpBc(ByteBuffer loadByteArray, int i10, byte[] destination, int i11, int i12) {
        e0.checkNotNullParameter(loadByteArray, "$this$loadByteArray");
        e0.checkNotNullParameter(destination, "destination");
        MemoryJvmKt.m4333copyTo9zorpBc(loadByteArray, destination, i10, i12, i11);
    }

    /* renamed from: loadByteArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m4380loadByteArray9zorpBc$default(ByteBuffer loadByteArray, int i10, byte[] destination, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = destination.length - i11;
        }
        e0.checkNotNullParameter(loadByteArray, "$this$loadByteArray");
        e0.checkNotNullParameter(destination, "destination");
        MemoryJvmKt.m4333copyTo9zorpBc(loadByteArray, destination, i10, i12, i11);
    }

    /* renamed from: loadUByteArray-KqtU1YU, reason: not valid java name */
    public static final void m4382loadUByteArrayKqtU1YU(ByteBuffer loadUByteArray, int i10, byte[] destination, int i11, int i12) {
        e0.checkNotNullParameter(loadUByteArray, "$this$loadUByteArray");
        e0.checkNotNullParameter(destination, "destination");
        MemoryJvmKt.m4333copyTo9zorpBc(loadUByteArray, destination, i10, i12, i11);
    }

    /* renamed from: loadUByteArray-KqtU1YU$default, reason: not valid java name */
    public static /* synthetic */ void m4384loadUByteArrayKqtU1YU$default(ByteBuffer loadUByteArray, int i10, byte[] destination, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = i0.m7046getSizeimpl(destination) - i11;
        }
        e0.checkNotNullParameter(loadUByteArray, "$this$loadUByteArray");
        e0.checkNotNullParameter(destination, "destination");
        MemoryJvmKt.m4333copyTo9zorpBc(loadUByteArray, destination, i10, i12, i11);
    }

    /* renamed from: loadUIntArray-EM3dPTA, reason: not valid java name */
    public static final void m4386loadUIntArrayEM3dPTA(ByteBuffer loadUIntArray, int i10, int[] destination, int i11, int i12) {
        e0.checkNotNullParameter(loadUIntArray, "$this$loadUIntArray");
        e0.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m4426loadIntArray9zorpBc(loadUIntArray, i10, destination, i11, i12);
    }

    /* renamed from: loadUIntArray-EM3dPTA$default, reason: not valid java name */
    public static /* synthetic */ void m4388loadUIntArrayEM3dPTA$default(ByteBuffer loadUIntArray, int i10, int[] destination, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = m0.m7071getSizeimpl(destination) - i11;
        }
        e0.checkNotNullParameter(loadUIntArray, "$this$loadUIntArray");
        e0.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m4426loadIntArray9zorpBc(loadUIntArray, i10, destination, i11, i12);
    }

    /* renamed from: loadULongArray-bNlDJKc, reason: not valid java name */
    public static final void m4390loadULongArraybNlDJKc(ByteBuffer loadULongArray, int i10, long[] destination, int i11, int i12) {
        e0.checkNotNullParameter(loadULongArray, "$this$loadULongArray");
        e0.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m4430loadLongArray9zorpBc(loadULongArray, i10, destination, i11, i12);
    }

    /* renamed from: loadULongArray-bNlDJKc$default, reason: not valid java name */
    public static /* synthetic */ void m4392loadULongArraybNlDJKc$default(ByteBuffer loadULongArray, int i10, long[] destination, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = q0.m7096getSizeimpl(destination) - i11;
        }
        e0.checkNotNullParameter(loadULongArray, "$this$loadULongArray");
        e0.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m4430loadLongArray9zorpBc(loadULongArray, i10, destination, i11, i12);
    }

    /* renamed from: loadUShortArray-m8CCUi4, reason: not valid java name */
    public static final void m4394loadUShortArraym8CCUi4(ByteBuffer loadUShortArray, int i10, short[] destination, int i11, int i12) {
        e0.checkNotNullParameter(loadUShortArray, "$this$loadUShortArray");
        e0.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m4434loadShortArray9zorpBc(loadUShortArray, i10, destination, i11, i12);
    }

    /* renamed from: loadUShortArray-m8CCUi4$default, reason: not valid java name */
    public static /* synthetic */ void m4396loadUShortArraym8CCUi4$default(ByteBuffer loadUShortArray, int i10, short[] destination, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = v0.m7121getSizeimpl(destination) - i11;
        }
        e0.checkNotNullParameter(loadUShortArray, "$this$loadUShortArray");
        e0.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m4434loadShortArray9zorpBc(loadUShortArray, i10, destination, i11, i12);
    }

    /* renamed from: storeByteArray-9zorpBc, reason: not valid java name */
    public static final void m4398storeByteArray9zorpBc(ByteBuffer storeByteArray, int i10, byte[] source, int i11, int i12) {
        e0.checkNotNullParameter(storeByteArray, "$this$storeByteArray");
        e0.checkNotNullParameter(source, "source");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(source, i11, i12).slice().order(ByteOrder.BIG_ENDIAN);
        e0.checkNotNullExpressionValue(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        Memory.m4315copyToJT6ljtQ(Memory.m4314constructorimpl(byteBufferOrder), storeByteArray, 0, i12, i10);
    }

    /* renamed from: storeByteArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m4400storeByteArray9zorpBc$default(ByteBuffer storeByteArray, int i10, byte[] source, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = source.length - i11;
        }
        e0.checkNotNullParameter(storeByteArray, "$this$storeByteArray");
        e0.checkNotNullParameter(source, "source");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(source, i11, i12).slice().order(ByteOrder.BIG_ENDIAN);
        e0.checkNotNullExpressionValue(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        Memory.m4315copyToJT6ljtQ(Memory.m4314constructorimpl(byteBufferOrder), storeByteArray, 0, i12, i10);
    }

    /* renamed from: storeUByteArray-KqtU1YU, reason: not valid java name */
    public static final void m4402storeUByteArrayKqtU1YU(ByteBuffer storeUByteArray, int i10, byte[] source, int i11, int i12) {
        e0.checkNotNullParameter(storeUByteArray, "$this$storeUByteArray");
        e0.checkNotNullParameter(source, "source");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(source, i11, i12).slice().order(ByteOrder.BIG_ENDIAN);
        e0.checkNotNullExpressionValue(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        Memory.m4315copyToJT6ljtQ(Memory.m4314constructorimpl(byteBufferOrder), storeUByteArray, 0, i12, i10);
    }

    /* renamed from: storeUByteArray-KqtU1YU$default, reason: not valid java name */
    public static /* synthetic */ void m4404storeUByteArrayKqtU1YU$default(ByteBuffer storeUByteArray, int i10, byte[] source, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = i0.m7046getSizeimpl(source) - i11;
        }
        e0.checkNotNullParameter(storeUByteArray, "$this$storeUByteArray");
        e0.checkNotNullParameter(source, "source");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(source, i11, i12).slice().order(ByteOrder.BIG_ENDIAN);
        e0.checkNotNullExpressionValue(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        Memory.m4315copyToJT6ljtQ(Memory.m4314constructorimpl(byteBufferOrder), storeUByteArray, 0, i12, i10);
    }

    /* renamed from: storeUIntArray-EM3dPTA, reason: not valid java name */
    public static final void m4406storeUIntArrayEM3dPTA(ByteBuffer storeUIntArray, int i10, int[] source, int i11, int i12) {
        e0.checkNotNullParameter(storeUIntArray, "$this$storeUIntArray");
        e0.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m4446storeIntArray9zorpBc(storeUIntArray, i10, source, i11, i12);
    }

    /* renamed from: storeUIntArray-EM3dPTA$default, reason: not valid java name */
    public static /* synthetic */ void m4408storeUIntArrayEM3dPTA$default(ByteBuffer storeUIntArray, int i10, int[] source, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = m0.m7071getSizeimpl(source) - i11;
        }
        e0.checkNotNullParameter(storeUIntArray, "$this$storeUIntArray");
        e0.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m4446storeIntArray9zorpBc(storeUIntArray, i10, source, i11, i12);
    }

    /* renamed from: storeULongArray-bNlDJKc, reason: not valid java name */
    public static final void m4410storeULongArraybNlDJKc(ByteBuffer storeULongArray, int i10, long[] source, int i11, int i12) {
        e0.checkNotNullParameter(storeULongArray, "$this$storeULongArray");
        e0.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m4450storeLongArray9zorpBc(storeULongArray, i10, source, i11, i12);
    }

    /* renamed from: storeULongArray-bNlDJKc$default, reason: not valid java name */
    public static /* synthetic */ void m4412storeULongArraybNlDJKc$default(ByteBuffer storeULongArray, int i10, long[] source, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = q0.m7096getSizeimpl(source) - i11;
        }
        e0.checkNotNullParameter(storeULongArray, "$this$storeULongArray");
        e0.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m4450storeLongArray9zorpBc(storeULongArray, i10, source, i11, i12);
    }

    /* renamed from: storeUShortArray-m8CCUi4, reason: not valid java name */
    public static final void m4414storeUShortArraym8CCUi4(ByteBuffer storeUShortArray, int i10, short[] source, int i11, int i12) {
        e0.checkNotNullParameter(storeUShortArray, "$this$storeUShortArray");
        e0.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m4454storeShortArray9zorpBc(storeUShortArray, i10, source, i11, i12);
    }

    /* renamed from: storeUShortArray-m8CCUi4$default, reason: not valid java name */
    public static /* synthetic */ void m4416storeUShortArraym8CCUi4$default(ByteBuffer storeUShortArray, int i10, short[] source, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = v0.m7121getSizeimpl(source) - i11;
        }
        e0.checkNotNullParameter(storeUShortArray, "$this$storeUShortArray");
        e0.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m4454storeShortArray9zorpBc(storeUShortArray, i10, source, i11, i12);
    }

    /* renamed from: loadByteArray-9zorpBc, reason: not valid java name */
    public static final void m4379loadByteArray9zorpBc(ByteBuffer loadByteArray, long j10, byte[] destination, int i10, int i11) {
        e0.checkNotNullParameter(loadByteArray, "$this$loadByteArray");
        e0.checkNotNullParameter(destination, "destination");
        MemoryJvmKt.m4334copyTo9zorpBc(loadByteArray, destination, j10, i11, i10);
    }

    /* renamed from: loadUByteArray-KqtU1YU, reason: not valid java name */
    public static final void m4383loadUByteArrayKqtU1YU(ByteBuffer loadUByteArray, long j10, byte[] destination, int i10, int i11) {
        e0.checkNotNullParameter(loadUByteArray, "$this$loadUByteArray");
        e0.checkNotNullParameter(destination, "destination");
        MemoryJvmKt.m4334copyTo9zorpBc(loadUByteArray, destination, j10, i11, i10);
    }

    /* renamed from: loadUIntArray-EM3dPTA, reason: not valid java name */
    public static final void m4387loadUIntArrayEM3dPTA(ByteBuffer loadUIntArray, long j10, int[] destination, int i10, int i11) {
        e0.checkNotNullParameter(loadUIntArray, "$this$loadUIntArray");
        e0.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m4427loadIntArray9zorpBc(loadUIntArray, j10, destination, i10, i11);
    }

    /* renamed from: loadULongArray-bNlDJKc, reason: not valid java name */
    public static final void m4391loadULongArraybNlDJKc(ByteBuffer loadULongArray, long j10, long[] destination, int i10, int i11) {
        e0.checkNotNullParameter(loadULongArray, "$this$loadULongArray");
        e0.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m4431loadLongArray9zorpBc(loadULongArray, j10, destination, i10, i11);
    }

    /* renamed from: loadUShortArray-m8CCUi4, reason: not valid java name */
    public static final void m4395loadUShortArraym8CCUi4(ByteBuffer loadUShortArray, long j10, short[] destination, int i10, int i11) {
        e0.checkNotNullParameter(loadUShortArray, "$this$loadUShortArray");
        e0.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m4435loadShortArray9zorpBc(loadUShortArray, j10, destination, i10, i11);
    }

    /* renamed from: storeUIntArray-EM3dPTA, reason: not valid java name */
    public static final void m4407storeUIntArrayEM3dPTA(ByteBuffer storeUIntArray, long j10, int[] source, int i10, int i11) {
        e0.checkNotNullParameter(storeUIntArray, "$this$storeUIntArray");
        e0.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m4447storeIntArray9zorpBc(storeUIntArray, j10, source, i10, i11);
    }

    /* renamed from: storeULongArray-bNlDJKc, reason: not valid java name */
    public static final void m4411storeULongArraybNlDJKc(ByteBuffer storeULongArray, long j10, long[] source, int i10, int i11) {
        e0.checkNotNullParameter(storeULongArray, "$this$storeULongArray");
        e0.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m4451storeLongArray9zorpBc(storeULongArray, j10, source, i10, i11);
    }

    /* renamed from: storeUShortArray-m8CCUi4, reason: not valid java name */
    public static final void m4415storeUShortArraym8CCUi4(ByteBuffer storeUShortArray, long j10, short[] source, int i10, int i11) {
        e0.checkNotNullParameter(storeUShortArray, "$this$storeUShortArray");
        e0.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m4455storeShortArray9zorpBc(storeUShortArray, j10, source, i10, i11);
    }

    /* renamed from: storeByteArray-9zorpBc, reason: not valid java name */
    public static final void m4399storeByteArray9zorpBc(ByteBuffer storeByteArray, long j10, byte[] source, int i10, int i11) {
        e0.checkNotNullParameter(storeByteArray, "$this$storeByteArray");
        e0.checkNotNullParameter(source, "source");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(source, i10, i11).slice().order(ByteOrder.BIG_ENDIAN);
        e0.checkNotNullExpressionValue(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        Memory.m4316copyToJT6ljtQ(Memory.m4314constructorimpl(byteBufferOrder), storeByteArray, 0L, i11, j10);
    }

    /* renamed from: storeUByteArray-KqtU1YU, reason: not valid java name */
    public static final void m4403storeUByteArrayKqtU1YU(ByteBuffer storeUByteArray, long j10, byte[] source, int i10, int i11) {
        e0.checkNotNullParameter(storeUByteArray, "$this$storeUByteArray");
        e0.checkNotNullParameter(source, "source");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(source, i10, i11).slice().order(ByteOrder.BIG_ENDIAN);
        e0.checkNotNullExpressionValue(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        Memory.m4316copyToJT6ljtQ(Memory.m4314constructorimpl(byteBufferOrder), storeUByteArray, 0L, i11, j10);
    }

    /* renamed from: loadByteArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m4381loadByteArray9zorpBc$default(ByteBuffer loadByteArray, long j10, byte[] destination, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = destination.length - i13;
        }
        e0.checkNotNullParameter(loadByteArray, "$this$loadByteArray");
        e0.checkNotNullParameter(destination, "destination");
        MemoryJvmKt.m4334copyTo9zorpBc(loadByteArray, destination, j10, i11, i13);
    }

    /* renamed from: loadUByteArray-KqtU1YU$default, reason: not valid java name */
    public static /* synthetic */ void m4385loadUByteArrayKqtU1YU$default(ByteBuffer loadUByteArray, long j10, byte[] destination, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = i0.m7046getSizeimpl(destination) - i13;
        }
        e0.checkNotNullParameter(loadUByteArray, "$this$loadUByteArray");
        e0.checkNotNullParameter(destination, "destination");
        MemoryJvmKt.m4334copyTo9zorpBc(loadUByteArray, destination, j10, i11, i13);
    }

    /* renamed from: loadUIntArray-EM3dPTA$default, reason: not valid java name */
    public static /* synthetic */ void m4389loadUIntArrayEM3dPTA$default(ByteBuffer loadUIntArray, long j10, int[] destination, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = m0.m7071getSizeimpl(destination) - i13;
        }
        e0.checkNotNullParameter(loadUIntArray, "$this$loadUIntArray");
        e0.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m4427loadIntArray9zorpBc(loadUIntArray, j10, destination, i13, i11);
    }

    /* renamed from: loadULongArray-bNlDJKc$default, reason: not valid java name */
    public static /* synthetic */ void m4393loadULongArraybNlDJKc$default(ByteBuffer loadULongArray, long j10, long[] jArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = q0.m7096getSizeimpl(jArr) - i13;
        }
        e0.checkNotNullParameter(loadULongArray, "$this$loadULongArray");
        e0.checkNotNullParameter(jArr, VPCjETNfjxu.VFsryxilOEXV);
        PrimitiveArraysJvmKt.m4431loadLongArray9zorpBc(loadULongArray, j10, jArr, i13, i11);
    }

    /* renamed from: loadUShortArray-m8CCUi4$default, reason: not valid java name */
    public static /* synthetic */ void m4397loadUShortArraym8CCUi4$default(ByteBuffer loadUShortArray, long j10, short[] destination, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = v0.m7121getSizeimpl(destination) - i13;
        }
        e0.checkNotNullParameter(loadUShortArray, "$this$loadUShortArray");
        e0.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m4435loadShortArray9zorpBc(loadUShortArray, j10, destination, i13, i11);
    }

    /* renamed from: storeUIntArray-EM3dPTA$default, reason: not valid java name */
    public static /* synthetic */ void m4409storeUIntArrayEM3dPTA$default(ByteBuffer storeUIntArray, long j10, int[] source, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = m0.m7071getSizeimpl(source) - i13;
        }
        e0.checkNotNullParameter(storeUIntArray, "$this$storeUIntArray");
        e0.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m4447storeIntArray9zorpBc(storeUIntArray, j10, source, i13, i11);
    }

    /* renamed from: storeULongArray-bNlDJKc$default, reason: not valid java name */
    public static /* synthetic */ void m4413storeULongArraybNlDJKc$default(ByteBuffer storeULongArray, long j10, long[] source, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = q0.m7096getSizeimpl(source) - i13;
        }
        e0.checkNotNullParameter(storeULongArray, "$this$storeULongArray");
        e0.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m4451storeLongArray9zorpBc(storeULongArray, j10, source, i13, i11);
    }

    /* renamed from: storeUShortArray-m8CCUi4$default, reason: not valid java name */
    public static /* synthetic */ void m4417storeUShortArraym8CCUi4$default(ByteBuffer storeUShortArray, long j10, short[] source, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = v0.m7121getSizeimpl(source) - i13;
        }
        e0.checkNotNullParameter(storeUShortArray, "$this$storeUShortArray");
        e0.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m4455storeShortArray9zorpBc(storeUShortArray, j10, source, i13, i11);
    }

    /* renamed from: storeByteArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m4401storeByteArray9zorpBc$default(ByteBuffer storeByteArray, long j10, byte[] source, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = source.length - i10;
        }
        e0.checkNotNullParameter(storeByteArray, "$this$storeByteArray");
        e0.checkNotNullParameter(source, "source");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(source, i10, i11).slice().order(ByteOrder.BIG_ENDIAN);
        e0.checkNotNullExpressionValue(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        Memory.m4316copyToJT6ljtQ(Memory.m4314constructorimpl(byteBufferOrder), storeByteArray, 0L, i11, j10);
    }

    /* renamed from: storeUByteArray-KqtU1YU$default, reason: not valid java name */
    public static /* synthetic */ void m4405storeUByteArrayKqtU1YU$default(ByteBuffer storeUByteArray, long j10, byte[] source, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = i0.m7046getSizeimpl(source) - i10;
        }
        e0.checkNotNullParameter(storeUByteArray, "$this$storeUByteArray");
        e0.checkNotNullParameter(source, "source");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(source, i10, i11).slice().order(ByteOrder.BIG_ENDIAN);
        e0.checkNotNullExpressionValue(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        Memory.m4316copyToJT6ljtQ(Memory.m4314constructorimpl(byteBufferOrder), storeUByteArray, 0L, i11, j10);
    }
}
