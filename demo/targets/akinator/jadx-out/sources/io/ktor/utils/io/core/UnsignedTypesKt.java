package io.ktor.utils.io.core;

import kotlin.jvm.internal.e0;
import tu.g0;
import tu.i0;
import tu.k0;
import tu.m0;
import tu.o0;
import tu.q0;
import tu.t0;
import tu.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class UnsignedTypesKt {
    /* renamed from: readFully-Wt3Bwxc, reason: not valid java name */
    public static final void m4544readFullyWt3Bwxc(Input readFully, short[] dst, int i10, int i11) throws Throwable {
        e0.checkNotNullParameter(readFully, "$this$readFully");
        e0.checkNotNullParameter(dst, "dst");
        InputArraysKt.readFully(readFully, dst, i10, i11);
    }

    /* renamed from: readFully-Wt3Bwxc$default, reason: not valid java name */
    public static /* synthetic */ void m4545readFullyWt3Bwxc$default(Input readFully, short[] dst, int i10, int i11, int i12, Object obj) throws Throwable {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = v0.m7121getSizeimpl(dst) - i10;
        }
        e0.checkNotNullParameter(readFully, "$this$readFully");
        e0.checkNotNullParameter(dst, "dst");
        InputArraysKt.readFully(readFully, dst, i10, i11);
    }

    /* renamed from: readFully-o1GoV1E, reason: not valid java name */
    public static final void m4546readFullyo1GoV1E(Input readFully, byte[] dst, int i10, int i11) {
        e0.checkNotNullParameter(readFully, "$this$readFully");
        e0.checkNotNullParameter(dst, "dst");
        InputArraysKt.readFully(readFully, dst, i10, i11);
    }

    /* renamed from: readFully-o1GoV1E$default, reason: not valid java name */
    public static /* synthetic */ void m4547readFullyo1GoV1E$default(Input readFully, byte[] dst, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = i0.m7046getSizeimpl(dst) - i10;
        }
        e0.checkNotNullParameter(readFully, "$this$readFully");
        e0.checkNotNullParameter(dst, "dst");
        InputArraysKt.readFully(readFully, dst, i10, i11);
    }

    /* renamed from: readFully-o2ZM2JE, reason: not valid java name */
    public static final void m4548readFullyo2ZM2JE(Input readFully, int[] dst, int i10, int i11) throws Throwable {
        e0.checkNotNullParameter(readFully, "$this$readFully");
        e0.checkNotNullParameter(dst, "dst");
        InputArraysKt.readFully(readFully, dst, i10, i11);
    }

    /* renamed from: readFully-o2ZM2JE$default, reason: not valid java name */
    public static /* synthetic */ void m4549readFullyo2ZM2JE$default(Input readFully, int[] dst, int i10, int i11, int i12, Object obj) throws Throwable {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = m0.m7071getSizeimpl(dst) - i10;
        }
        e0.checkNotNullParameter(readFully, "$this$readFully");
        e0.checkNotNullParameter(dst, "dst");
        InputArraysKt.readFully(readFully, dst, i10, i11);
    }

    /* renamed from: readFully-pqYNikA, reason: not valid java name */
    public static final void m4550readFullypqYNikA(Input readFully, long[] dst, int i10, int i11) throws Throwable {
        e0.checkNotNullParameter(readFully, "$this$readFully");
        e0.checkNotNullParameter(dst, "dst");
        InputArraysKt.readFully(readFully, dst, i10, i11);
    }

    /* renamed from: readFully-pqYNikA$default, reason: not valid java name */
    public static /* synthetic */ void m4551readFullypqYNikA$default(Input readFully, long[] dst, int i10, int i11, int i12, Object obj) throws Throwable {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = q0.m7096getSizeimpl(dst) - i10;
        }
        e0.checkNotNullParameter(readFully, "$this$readFully");
        e0.checkNotNullParameter(dst, "dst");
        InputArraysKt.readFully(readFully, dst, i10, i11);
    }

    public static final byte readUByte(Input input) {
        e0.checkNotNullParameter(input, "<this>");
        return g0.m7031constructorimpl(input.readByte());
    }

    public static final int readUInt(Input input) {
        e0.checkNotNullParameter(input, "<this>");
        return k0.m7056constructorimpl(InputPrimitivesKt.readInt(input));
    }

    public static final long readULong(Input input) {
        e0.checkNotNullParameter(input, "<this>");
        return o0.m7081constructorimpl(InputPrimitivesKt.readLong(input));
    }

    public static final short readUShort(Input input) {
        e0.checkNotNullParameter(input, "<this>");
        return t0.m7106constructorimpl(InputPrimitivesKt.readShort(input));
    }

    /* renamed from: writeFully-Wt3Bwxc, reason: not valid java name */
    public static final void m4552writeFullyWt3Bwxc(Output writeFully, short[] array, int i10, int i11) {
        e0.checkNotNullParameter(writeFully, "$this$writeFully");
        e0.checkNotNullParameter(array, "array");
        OutputKt.writeFully(writeFully, array, i10, i11);
    }

    /* renamed from: writeFully-Wt3Bwxc$default, reason: not valid java name */
    public static /* synthetic */ void m4553writeFullyWt3Bwxc$default(Output writeFully, short[] array, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = v0.m7121getSizeimpl(array) - i10;
        }
        e0.checkNotNullParameter(writeFully, "$this$writeFully");
        e0.checkNotNullParameter(array, "array");
        OutputKt.writeFully(writeFully, array, i10, i11);
    }

    /* renamed from: writeFully-o1GoV1E, reason: not valid java name */
    public static final void m4554writeFullyo1GoV1E(Output writeFully, byte[] array, int i10, int i11) {
        e0.checkNotNullParameter(writeFully, "$this$writeFully");
        e0.checkNotNullParameter(array, "array");
        OutputKt.writeFully(writeFully, array, i10, i11);
    }

    /* renamed from: writeFully-o1GoV1E$default, reason: not valid java name */
    public static /* synthetic */ void m4555writeFullyo1GoV1E$default(Output writeFully, byte[] array, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = i0.m7046getSizeimpl(array) - i10;
        }
        e0.checkNotNullParameter(writeFully, "$this$writeFully");
        e0.checkNotNullParameter(array, "array");
        OutputKt.writeFully(writeFully, array, i10, i11);
    }

    /* renamed from: writeFully-o2ZM2JE, reason: not valid java name */
    public static final void m4556writeFullyo2ZM2JE(Output writeFully, int[] array, int i10, int i11) {
        e0.checkNotNullParameter(writeFully, "$this$writeFully");
        e0.checkNotNullParameter(array, "array");
        OutputKt.writeFully(writeFully, array, i10, i11);
    }

    /* renamed from: writeFully-o2ZM2JE$default, reason: not valid java name */
    public static /* synthetic */ void m4557writeFullyo2ZM2JE$default(Output writeFully, int[] array, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = m0.m7071getSizeimpl(array) - i10;
        }
        e0.checkNotNullParameter(writeFully, "$this$writeFully");
        e0.checkNotNullParameter(array, "array");
        OutputKt.writeFully(writeFully, array, i10, i11);
    }

    /* renamed from: writeFully-pqYNikA, reason: not valid java name */
    public static final void m4558writeFullypqYNikA(Output writeFully, long[] array, int i10, int i11) {
        e0.checkNotNullParameter(writeFully, "$this$writeFully");
        e0.checkNotNullParameter(array, "array");
        OutputKt.writeFully(writeFully, array, i10, i11);
    }

    /* renamed from: writeFully-pqYNikA$default, reason: not valid java name */
    public static /* synthetic */ void m4559writeFullypqYNikA$default(Output writeFully, long[] array, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = q0.m7096getSizeimpl(array) - i10;
        }
        e0.checkNotNullParameter(writeFully, "$this$writeFully");
        e0.checkNotNullParameter(array, "array");
        OutputKt.writeFully(writeFully, array, i10, i11);
    }

    /* renamed from: writeUByte-EK-6454, reason: not valid java name */
    public static final void m4560writeUByteEK6454(Output writeUByte, byte b10) throws InsufficientSpaceException {
        e0.checkNotNullParameter(writeUByte, "$this$writeUByte");
        writeUByte.writeByte(b10);
    }

    /* renamed from: writeUInt-Qn1smSk, reason: not valid java name */
    public static final void m4561writeUIntQn1smSk(Output writeUInt, int i10) {
        e0.checkNotNullParameter(writeUInt, "$this$writeUInt");
        OutputPrimitivesKt.writeInt(writeUInt, i10);
    }

    /* renamed from: writeULong-2TYgG_w, reason: not valid java name */
    public static final void m4562writeULong2TYgG_w(Output writeULong, long j10) {
        e0.checkNotNullParameter(writeULong, "$this$writeULong");
        OutputPrimitivesKt.writeLong(writeULong, j10);
    }

    /* renamed from: writeUShort-i8woANY, reason: not valid java name */
    public static final void m4563writeUShorti8woANY(Output writeUShort, short s10) {
        e0.checkNotNullParameter(writeUShort, "$this$writeUShort");
        OutputPrimitivesKt.writeShort(writeUShort, s10);
    }
}
