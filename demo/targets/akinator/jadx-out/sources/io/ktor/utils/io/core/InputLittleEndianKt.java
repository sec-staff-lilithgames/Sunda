package io.ktor.utils.io.core;

import java.io.EOFException;
import kotlin.jvm.internal.e0;
import kv.a;
import kv.l;
import tu.m0;
import tu.q0;
import tu.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class InputLittleEndianKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ByteOrder.values().length];
            try {
                iArr[ByteOrder.BIG_ENDIAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int readAvailableLittleEndian(Input input, short[] dst, int i10, int i11) throws Throwable {
        int i12;
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        int available = InputArraysKt.readAvailable(input, dst, i10, i11);
        if (available > 0 && i10 <= (i10 + available) - 1) {
            while (true) {
                dst[i10] = Short.reverseBytes(dst[i10]);
                if (i10 == i12) {
                    break;
                }
                i10++;
            }
        }
        return available;
    }

    public static /* synthetic */ int readAvailableLittleEndian$default(Input input, short[] sArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = sArr.length - i10;
        }
        return readAvailableLittleEndian(input, sArr, i10, i11);
    }

    /* renamed from: readAvailableLittleEndian-Wt3Bwxc, reason: not valid java name */
    public static final int m4505readAvailableLittleEndianWt3Bwxc(Input readAvailableLittleEndian, short[] dst, int i10, int i11) {
        e0.checkNotNullParameter(readAvailableLittleEndian, "$this$readAvailableLittleEndian");
        e0.checkNotNullParameter(dst, "dst");
        return readAvailableLittleEndian(readAvailableLittleEndian, dst, i10, i11);
    }

    /* renamed from: readAvailableLittleEndian-Wt3Bwxc$default, reason: not valid java name */
    public static /* synthetic */ int m4507readAvailableLittleEndianWt3Bwxc$default(Input input, short[] sArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = v0.m7121getSizeimpl(sArr) - i10;
        }
        return m4505readAvailableLittleEndianWt3Bwxc(input, sArr, i10, i11);
    }

    /* renamed from: readAvailableLittleEndian-o2ZM2JE, reason: not valid java name */
    public static final int m4509readAvailableLittleEndiano2ZM2JE(Input readAvailableLittleEndian, int[] dst, int i10, int i11) {
        e0.checkNotNullParameter(readAvailableLittleEndian, "$this$readAvailableLittleEndian");
        e0.checkNotNullParameter(dst, "dst");
        return readAvailableLittleEndian(readAvailableLittleEndian, dst, i10, i11);
    }

    /* renamed from: readAvailableLittleEndian-o2ZM2JE$default, reason: not valid java name */
    public static /* synthetic */ int m4511readAvailableLittleEndiano2ZM2JE$default(Input input, int[] iArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = m0.m7071getSizeimpl(iArr) - i10;
        }
        return m4509readAvailableLittleEndiano2ZM2JE(input, iArr, i10, i11);
    }

    /* renamed from: readAvailableLittleEndian-pqYNikA, reason: not valid java name */
    public static final int m4513readAvailableLittleEndianpqYNikA(Input readAvailableLittleEndian, long[] dst, int i10, int i11) {
        e0.checkNotNullParameter(readAvailableLittleEndian, "$this$readAvailableLittleEndian");
        e0.checkNotNullParameter(dst, "dst");
        return readAvailableLittleEndian(readAvailableLittleEndian, dst, i10, i11);
    }

    /* renamed from: readAvailableLittleEndian-pqYNikA$default, reason: not valid java name */
    public static /* synthetic */ int m4515readAvailableLittleEndianpqYNikA$default(Input input, long[] jArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = q0.m7096getSizeimpl(jArr) - i10;
        }
        return m4513readAvailableLittleEndianpqYNikA(input, jArr, i10, i11);
    }

    public static final double readDouble(Input input, ByteOrder byteOrder) {
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(byteOrder, "byteOrder");
        return WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] == 1 ? InputPrimitivesKt.readDouble(input) : Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(InputPrimitivesKt.readDouble(input))));
    }

    public static final double readDoubleLittleEndian(Input input) {
        e0.checkNotNullParameter(input, "<this>");
        return Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(InputPrimitivesKt.readDouble(input))));
    }

    public static final float readFloat(Input input, ByteOrder byteOrder) {
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(byteOrder, "byteOrder");
        return WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] == 1 ? InputPrimitivesKt.readFloat(input) : Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(InputPrimitivesKt.readFloat(input))));
    }

    public static final float readFloatLittleEndian(Input input) {
        e0.checkNotNullParameter(input, "<this>");
        return Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(InputPrimitivesKt.readFloat(input))));
    }

    public static final void readFullyLittleEndian(Input input, short[] dst, int i10, int i11) throws Throwable {
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        InputArraysKt.readFully(input, dst, i10, i11);
        int i12 = (i11 + i10) - 1;
        if (i10 > i12) {
            return;
        }
        while (true) {
            dst[i10] = Short.reverseBytes(dst[i10]);
            if (i10 == i12) {
                return;
            } else {
                i10++;
            }
        }
    }

    public static /* synthetic */ void readFullyLittleEndian$default(Input input, short[] sArr, int i10, int i11, int i12, Object obj) throws Throwable {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = sArr.length - i10;
        }
        readFullyLittleEndian(input, sArr, i10, i11);
    }

    /* renamed from: readFullyLittleEndian-Wt3Bwxc, reason: not valid java name */
    public static final void m4517readFullyLittleEndianWt3Bwxc(Input readFullyLittleEndian, short[] dst, int i10, int i11) throws Throwable {
        e0.checkNotNullParameter(readFullyLittleEndian, "$this$readFullyLittleEndian");
        e0.checkNotNullParameter(dst, "dst");
        readFullyLittleEndian(readFullyLittleEndian, dst, i10, i11);
    }

    /* renamed from: readFullyLittleEndian-Wt3Bwxc$default, reason: not valid java name */
    public static /* synthetic */ void m4519readFullyLittleEndianWt3Bwxc$default(Input input, short[] sArr, int i10, int i11, int i12, Object obj) throws Throwable {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = v0.m7121getSizeimpl(sArr) - i10;
        }
        m4517readFullyLittleEndianWt3Bwxc(input, sArr, i10, i11);
    }

    /* renamed from: readFullyLittleEndian-o2ZM2JE, reason: not valid java name */
    public static final void m4521readFullyLittleEndiano2ZM2JE(Input readFullyLittleEndian, int[] dst, int i10, int i11) throws Throwable {
        e0.checkNotNullParameter(readFullyLittleEndian, "$this$readFullyLittleEndian");
        e0.checkNotNullParameter(dst, "dst");
        readFullyLittleEndian(readFullyLittleEndian, dst, i10, i11);
    }

    /* renamed from: readFullyLittleEndian-o2ZM2JE$default, reason: not valid java name */
    public static /* synthetic */ void m4523readFullyLittleEndiano2ZM2JE$default(Input input, int[] iArr, int i10, int i11, int i12, Object obj) throws Throwable {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = m0.m7071getSizeimpl(iArr) - i10;
        }
        m4521readFullyLittleEndiano2ZM2JE(input, iArr, i10, i11);
    }

    /* renamed from: readFullyLittleEndian-pqYNikA, reason: not valid java name */
    public static final void m4525readFullyLittleEndianpqYNikA(Input readFullyLittleEndian, long[] dst, int i10, int i11) throws Throwable {
        e0.checkNotNullParameter(readFullyLittleEndian, "$this$readFullyLittleEndian");
        e0.checkNotNullParameter(dst, "dst");
        readFullyLittleEndian(readFullyLittleEndian, dst, i10, i11);
    }

    /* renamed from: readFullyLittleEndian-pqYNikA$default, reason: not valid java name */
    public static /* synthetic */ void m4527readFullyLittleEndianpqYNikA$default(Input input, long[] jArr, int i10, int i11, int i12, Object obj) throws Throwable {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = q0.m7096getSizeimpl(jArr) - i10;
        }
        m4525readFullyLittleEndianpqYNikA(input, jArr, i10, i11);
    }

    public static final int readInt(Input input, ByteOrder byteOrder) {
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(byteOrder, "byteOrder");
        return WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] == 1 ? InputPrimitivesKt.readInt(input) : Integer.reverseBytes(InputPrimitivesKt.readInt(input));
    }

    public static final int readIntLittleEndian(Input input) {
        e0.checkNotNullParameter(input, "<this>");
        return Integer.reverseBytes(InputPrimitivesKt.readInt(input));
    }

    public static final long readLong(Input input, ByteOrder byteOrder) {
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(byteOrder, "byteOrder");
        return WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] == 1 ? InputPrimitivesKt.readLong(input) : Long.reverseBytes(InputPrimitivesKt.readLong(input));
    }

    public static final long readLongLittleEndian(Input input) {
        e0.checkNotNullParameter(input, "<this>");
        return Long.reverseBytes(InputPrimitivesKt.readLong(input));
    }

    private static final <T> T readPrimitiveTemplate(a aVar, l lVar) {
        return (T) lVar.invoke(aVar.invoke());
    }

    public static final short readShort(Input input, ByteOrder byteOrder) {
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(byteOrder, "byteOrder");
        return WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] == 1 ? InputPrimitivesKt.readShort(input) : Short.reverseBytes(InputPrimitivesKt.readShort(input));
    }

    public static final short readShortLittleEndian(Input input) {
        e0.checkNotNullParameter(input, "<this>");
        return Short.reverseBytes(InputPrimitivesKt.readShort(input));
    }

    public static /* synthetic */ int readAvailableLittleEndian$default(Input input, int[] iArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = iArr.length - i10;
        }
        return readAvailableLittleEndian(input, iArr, i10, i11);
    }

    /* renamed from: readAvailableLittleEndian-Wt3Bwxc, reason: not valid java name */
    public static final int m4504readAvailableLittleEndianWt3Bwxc(Buffer readAvailableLittleEndian, short[] dst, int i10, int i11) {
        e0.checkNotNullParameter(readAvailableLittleEndian, "$this$readAvailableLittleEndian");
        e0.checkNotNullParameter(dst, "dst");
        return readAvailableLittleEndian(readAvailableLittleEndian, dst, i10, i11);
    }

    /* renamed from: readAvailableLittleEndian-Wt3Bwxc$default, reason: not valid java name */
    public static /* synthetic */ int m4506readAvailableLittleEndianWt3Bwxc$default(Buffer buffer, short[] sArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = v0.m7121getSizeimpl(sArr) - i10;
        }
        return m4504readAvailableLittleEndianWt3Bwxc(buffer, sArr, i10, i11);
    }

    /* renamed from: readAvailableLittleEndian-o2ZM2JE, reason: not valid java name */
    public static final int m4508readAvailableLittleEndiano2ZM2JE(Buffer readAvailableLittleEndian, int[] dst, int i10, int i11) {
        e0.checkNotNullParameter(readAvailableLittleEndian, "$this$readAvailableLittleEndian");
        e0.checkNotNullParameter(dst, "dst");
        return readAvailableLittleEndian(readAvailableLittleEndian, dst, i10, i11);
    }

    /* renamed from: readAvailableLittleEndian-o2ZM2JE$default, reason: not valid java name */
    public static /* synthetic */ int m4510readAvailableLittleEndiano2ZM2JE$default(Buffer buffer, int[] iArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = m0.m7071getSizeimpl(iArr) - i10;
        }
        return m4508readAvailableLittleEndiano2ZM2JE(buffer, iArr, i10, i11);
    }

    /* renamed from: readAvailableLittleEndian-pqYNikA, reason: not valid java name */
    public static final int m4512readAvailableLittleEndianpqYNikA(Buffer readAvailableLittleEndian, long[] dst, int i10, int i11) {
        e0.checkNotNullParameter(readAvailableLittleEndian, "$this$readAvailableLittleEndian");
        e0.checkNotNullParameter(dst, "dst");
        return readAvailableLittleEndian(readAvailableLittleEndian, dst, i10, i11);
    }

    /* renamed from: readAvailableLittleEndian-pqYNikA$default, reason: not valid java name */
    public static /* synthetic */ int m4514readAvailableLittleEndianpqYNikA$default(Buffer buffer, long[] jArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = q0.m7096getSizeimpl(jArr) - i10;
        }
        return m4512readAvailableLittleEndianpqYNikA(buffer, jArr, i10, i11);
    }

    public static /* synthetic */ void readFullyLittleEndian$default(Input input, int[] iArr, int i10, int i11, int i12, Object obj) throws Throwable {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = iArr.length - i10;
        }
        readFullyLittleEndian(input, iArr, i10, i11);
    }

    /* renamed from: readFullyLittleEndian-Wt3Bwxc, reason: not valid java name */
    public static final void m4516readFullyLittleEndianWt3Bwxc(Buffer readFullyLittleEndian, short[] dst, int i10, int i11) throws EOFException {
        e0.checkNotNullParameter(readFullyLittleEndian, "$this$readFullyLittleEndian");
        e0.checkNotNullParameter(dst, "dst");
        readFullyLittleEndian(readFullyLittleEndian, dst, i10, i11);
    }

    /* renamed from: readFullyLittleEndian-Wt3Bwxc$default, reason: not valid java name */
    public static /* synthetic */ void m4518readFullyLittleEndianWt3Bwxc$default(Buffer buffer, short[] sArr, int i10, int i11, int i12, Object obj) throws EOFException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = v0.m7121getSizeimpl(sArr) - i10;
        }
        m4516readFullyLittleEndianWt3Bwxc(buffer, sArr, i10, i11);
    }

    /* renamed from: readFullyLittleEndian-o2ZM2JE, reason: not valid java name */
    public static final void m4520readFullyLittleEndiano2ZM2JE(Buffer readFullyLittleEndian, int[] dst, int i10, int i11) throws EOFException {
        e0.checkNotNullParameter(readFullyLittleEndian, "$this$readFullyLittleEndian");
        e0.checkNotNullParameter(dst, "dst");
        readFullyLittleEndian(readFullyLittleEndian, dst, i10, i11);
    }

    /* renamed from: readFullyLittleEndian-o2ZM2JE$default, reason: not valid java name */
    public static /* synthetic */ void m4522readFullyLittleEndiano2ZM2JE$default(Buffer buffer, int[] iArr, int i10, int i11, int i12, Object obj) throws EOFException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = m0.m7071getSizeimpl(iArr) - i10;
        }
        m4520readFullyLittleEndiano2ZM2JE(buffer, iArr, i10, i11);
    }

    /* renamed from: readFullyLittleEndian-pqYNikA, reason: not valid java name */
    public static final void m4524readFullyLittleEndianpqYNikA(Buffer readFullyLittleEndian, long[] dst, int i10, int i11) throws EOFException {
        e0.checkNotNullParameter(readFullyLittleEndian, "$this$readFullyLittleEndian");
        e0.checkNotNullParameter(dst, "dst");
        readFullyLittleEndian(readFullyLittleEndian, dst, i10, i11);
    }

    /* renamed from: readFullyLittleEndian-pqYNikA$default, reason: not valid java name */
    public static /* synthetic */ void m4526readFullyLittleEndianpqYNikA$default(Buffer buffer, long[] jArr, int i10, int i11, int i12, Object obj) throws EOFException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = q0.m7096getSizeimpl(jArr) - i10;
        }
        m4524readFullyLittleEndianpqYNikA(buffer, jArr, i10, i11);
    }

    private static final <T> T readPrimitiveTemplate(ByteOrder byteOrder, a aVar, l lVar) {
        return WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] == 1 ? (T) aVar.invoke() : (T) lVar.invoke(aVar.invoke());
    }

    public static /* synthetic */ int readAvailableLittleEndian$default(Input input, long[] jArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length - i10;
        }
        return readAvailableLittleEndian(input, jArr, i10, i11);
    }

    public static /* synthetic */ void readFullyLittleEndian$default(Input input, long[] jArr, int i10, int i11, int i12, Object obj) throws Throwable {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length - i10;
        }
        readFullyLittleEndian(input, jArr, i10, i11);
    }

    public static final int readIntLittleEndian(Buffer buffer) {
        e0.checkNotNullParameter(buffer, "<this>");
        return Integer.reverseBytes(BufferPrimitivesKt.readInt(buffer));
    }

    public static final long readLongLittleEndian(Buffer buffer) {
        e0.checkNotNullParameter(buffer, "<this>");
        return Long.reverseBytes(BufferPrimitivesKt.readLong(buffer));
    }

    public static final short readShortLittleEndian(Buffer buffer) {
        e0.checkNotNullParameter(buffer, "<this>");
        return Short.reverseBytes(BufferPrimitivesKt.readShort(buffer));
    }

    public static final int readAvailableLittleEndian(Input input, int[] dst, int i10, int i11) throws Throwable {
        int i12;
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        int available = InputArraysKt.readAvailable(input, dst, i10, i11);
        if (available > 0 && i10 <= (i10 + available) - 1) {
            while (true) {
                dst[i10] = Integer.reverseBytes(dst[i10]);
                if (i10 == i12) {
                    break;
                }
                i10++;
            }
        }
        return available;
    }

    public static /* synthetic */ int readAvailableLittleEndian$default(Input input, float[] fArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length - i10;
        }
        return readAvailableLittleEndian(input, fArr, i10, i11);
    }

    public static final void readFullyLittleEndian(Input input, int[] dst, int i10, int i11) throws Throwable {
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        InputArraysKt.readFully(input, dst, i10, i11);
        int i12 = (i11 + i10) - 1;
        if (i10 > i12) {
            return;
        }
        while (true) {
            dst[i10] = Integer.reverseBytes(dst[i10]);
            if (i10 == i12) {
                return;
            } else {
                i10++;
            }
        }
    }

    public static /* synthetic */ void readFullyLittleEndian$default(Input input, float[] fArr, int i10, int i11, int i12, Object obj) throws Throwable {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length - i10;
        }
        readFullyLittleEndian(input, fArr, i10, i11);
    }

    public static /* synthetic */ int readAvailableLittleEndian$default(Input input, double[] dArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = dArr.length - i10;
        }
        return readAvailableLittleEndian(input, dArr, i10, i11);
    }

    public static final double readDoubleLittleEndian(Buffer buffer) {
        e0.checkNotNullParameter(buffer, "<this>");
        return Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(BufferPrimitivesKt.readDouble(buffer))));
    }

    public static final float readFloatLittleEndian(Buffer buffer) {
        e0.checkNotNullParameter(buffer, "<this>");
        return Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(BufferPrimitivesKt.readFloat(buffer))));
    }

    public static /* synthetic */ void readFullyLittleEndian$default(Input input, double[] dArr, int i10, int i11, int i12, Object obj) throws Throwable {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = dArr.length - i10;
        }
        readFullyLittleEndian(input, dArr, i10, i11);
    }

    public static /* synthetic */ int readAvailableLittleEndian$default(Buffer buffer, short[] sArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = sArr.length - i10;
        }
        return readAvailableLittleEndian(buffer, sArr, i10, i11);
    }

    public static /* synthetic */ void readFullyLittleEndian$default(Buffer buffer, short[] sArr, int i10, int i11, int i12, Object obj) throws EOFException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = sArr.length - i10;
        }
        readFullyLittleEndian(buffer, sArr, i10, i11);
    }

    public static final int readAvailableLittleEndian(Input input, long[] dst, int i10, int i11) throws Throwable {
        int i12;
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        int available = InputArraysKt.readAvailable(input, dst, i10, i11);
        if (available > 0 && i10 <= (i10 + available) - 1) {
            while (true) {
                dst[i10] = Long.reverseBytes(dst[i10]);
                if (i10 == i12) {
                    break;
                }
                i10++;
            }
        }
        return available;
    }

    public static /* synthetic */ int readAvailableLittleEndian$default(Buffer buffer, int[] iArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = iArr.length - i10;
        }
        return readAvailableLittleEndian(buffer, iArr, i10, i11);
    }

    public static final void readFullyLittleEndian(Input input, long[] dst, int i10, int i11) throws Throwable {
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        InputArraysKt.readFully(input, dst, i10, i11);
        int i12 = (i11 + i10) - 1;
        if (i10 > i12) {
            return;
        }
        while (true) {
            dst[i10] = Long.reverseBytes(dst[i10]);
            if (i10 == i12) {
                return;
            } else {
                i10++;
            }
        }
    }

    public static /* synthetic */ void readFullyLittleEndian$default(Buffer buffer, int[] iArr, int i10, int i11, int i12, Object obj) throws EOFException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = iArr.length - i10;
        }
        readFullyLittleEndian(buffer, iArr, i10, i11);
    }

    public static /* synthetic */ int readAvailableLittleEndian$default(Buffer buffer, long[] jArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length - i10;
        }
        return readAvailableLittleEndian(buffer, jArr, i10, i11);
    }

    public static /* synthetic */ void readFullyLittleEndian$default(Buffer buffer, long[] jArr, int i10, int i11, int i12, Object obj) throws EOFException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length - i10;
        }
        readFullyLittleEndian(buffer, jArr, i10, i11);
    }

    public static /* synthetic */ int readAvailableLittleEndian$default(Buffer buffer, float[] fArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length - i10;
        }
        return readAvailableLittleEndian(buffer, fArr, i10, i11);
    }

    public static /* synthetic */ void readFullyLittleEndian$default(Buffer buffer, float[] fArr, int i10, int i11, int i12, Object obj) throws EOFException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length - i10;
        }
        readFullyLittleEndian(buffer, fArr, i10, i11);
    }

    public static final int readAvailableLittleEndian(Input input, float[] dst, int i10, int i11) throws Throwable {
        int i12;
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        int available = InputArraysKt.readAvailable(input, dst, i10, i11);
        if (available > 0 && i10 <= (i10 + available) - 1) {
            while (true) {
                dst[i10] = Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(dst[i10])));
                if (i10 == i12) {
                    break;
                }
                i10++;
            }
        }
        return available;
    }

    public static /* synthetic */ int readAvailableLittleEndian$default(Buffer buffer, double[] dArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = dArr.length - i10;
        }
        return readAvailableLittleEndian(buffer, dArr, i10, i11);
    }

    public static final void readFullyLittleEndian(Input input, float[] dst, int i10, int i11) throws Throwable {
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        InputArraysKt.readFully(input, dst, i10, i11);
        int i12 = (i11 + i10) - 1;
        if (i10 > i12) {
            return;
        }
        while (true) {
            dst[i10] = Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(dst[i10])));
            if (i10 == i12) {
                return;
            } else {
                i10++;
            }
        }
    }

    public static /* synthetic */ void readFullyLittleEndian$default(Buffer buffer, double[] dArr, int i10, int i11, int i12, Object obj) throws EOFException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = dArr.length - i10;
        }
        readFullyLittleEndian(buffer, dArr, i10, i11);
    }

    public static final int readAvailableLittleEndian(Input input, double[] dst, int i10, int i11) throws Throwable {
        int i12;
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        int available = InputArraysKt.readAvailable(input, dst, i10, i11);
        if (available > 0 && i10 <= (i10 + available) - 1) {
            while (true) {
                dst[i10] = Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(dst[i10])));
                if (i10 == i12) {
                    break;
                }
                i10++;
            }
        }
        return available;
    }

    public static final void readFullyLittleEndian(Input input, double[] dst, int i10, int i11) throws Throwable {
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        InputArraysKt.readFully(input, dst, i10, i11);
        int i12 = (i11 + i10) - 1;
        if (i10 > i12) {
            return;
        }
        while (true) {
            dst[i10] = Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(dst[i10])));
            if (i10 == i12) {
                return;
            } else {
                i10++;
            }
        }
    }

    public static final int readAvailableLittleEndian(Buffer buffer, short[] dst, int i10, int i11) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        int available = BufferPrimitivesKt.readAvailable(buffer, dst, i10, i11);
        int i12 = (i10 + available) - 1;
        if (i10 <= i12) {
            while (true) {
                dst[i10] = Short.reverseBytes(dst[i10]);
                if (i10 == i12) {
                    break;
                }
                i10++;
            }
        }
        return available;
    }

    public static final void readFullyLittleEndian(Buffer buffer, short[] dst, int i10, int i11) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        BufferPrimitivesKt.readFully(buffer, dst, i10, i11);
        int i12 = (i11 + i10) - 1;
        if (i10 > i12) {
            return;
        }
        while (true) {
            dst[i10] = Short.reverseBytes(dst[i10]);
            if (i10 == i12) {
                return;
            } else {
                i10++;
            }
        }
    }

    public static final int readAvailableLittleEndian(Buffer buffer, int[] dst, int i10, int i11) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        int available = BufferPrimitivesKt.readAvailable(buffer, dst, i10, i11);
        int i12 = (i10 + available) - 1;
        if (i10 <= i12) {
            while (true) {
                dst[i10] = Integer.reverseBytes(dst[i10]);
                if (i10 == i12) {
                    break;
                }
                i10++;
            }
        }
        return available;
    }

    public static final void readFullyLittleEndian(Buffer buffer, int[] dst, int i10, int i11) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        BufferPrimitivesKt.readFully(buffer, dst, i10, i11);
        int i12 = (i11 + i10) - 1;
        if (i10 > i12) {
            return;
        }
        while (true) {
            dst[i10] = Integer.reverseBytes(dst[i10]);
            if (i10 == i12) {
                return;
            } else {
                i10++;
            }
        }
    }

    public static final int readAvailableLittleEndian(Buffer buffer, long[] dst, int i10, int i11) throws EOFException {
        int i12;
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        int available = BufferPrimitivesKt.readAvailable(buffer, dst, i10, i11);
        if (available > 0 && i10 <= (i10 + available) - 1) {
            while (true) {
                dst[i10] = Long.reverseBytes(dst[i10]);
                if (i10 == i12) {
                    break;
                }
                i10++;
            }
        }
        return available;
    }

    public static final void readFullyLittleEndian(Buffer buffer, long[] dst, int i10, int i11) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        BufferPrimitivesKt.readFully(buffer, dst, i10, i11);
        int i12 = (i11 + i10) - 1;
        if (i10 > i12) {
            return;
        }
        while (true) {
            dst[i10] = Long.reverseBytes(dst[i10]);
            if (i10 == i12) {
                return;
            } else {
                i10++;
            }
        }
    }

    public static final int readAvailableLittleEndian(Buffer buffer, float[] dst, int i10, int i11) throws EOFException {
        int i12;
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        int available = BufferPrimitivesKt.readAvailable(buffer, dst, i10, i11);
        if (available > 0 && i10 <= (i10 + available) - 1) {
            while (true) {
                dst[i10] = Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(dst[i10])));
                if (i10 == i12) {
                    break;
                }
                i10++;
            }
        }
        return available;
    }

    public static final void readFullyLittleEndian(Buffer buffer, float[] dst, int i10, int i11) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        BufferPrimitivesKt.readFully(buffer, dst, i10, i11);
        int i12 = (i11 + i10) - 1;
        if (i10 > i12) {
            return;
        }
        while (true) {
            dst[i10] = Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(dst[i10])));
            if (i10 == i12) {
                return;
            } else {
                i10++;
            }
        }
    }

    public static final int readAvailableLittleEndian(Buffer buffer, double[] dst, int i10, int i11) throws EOFException {
        int i12;
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        int available = BufferPrimitivesKt.readAvailable(buffer, dst, i10, i11);
        if (available > 0 && i10 <= (i10 + available) - 1) {
            while (true) {
                dst[i10] = Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(dst[i10])));
                if (i10 == i12) {
                    break;
                }
                i10++;
            }
        }
        return available;
    }

    public static final void readFullyLittleEndian(Buffer buffer, double[] dst, int i10, int i11) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        BufferPrimitivesKt.readFully(buffer, dst, i10, i11);
        int i12 = (i11 + i10) - 1;
        if (i10 > i12) {
            return;
        }
        while (true) {
            dst[i10] = Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(dst[i10])));
            if (i10 == i12) {
                return;
            } else {
                i10++;
            }
        }
    }
}
