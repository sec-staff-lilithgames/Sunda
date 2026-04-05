package io.ktor.utils.io.charsets;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class StringsKt {
    public static final int decodeASCII(ByteBuffer byteBuffer, char[] out, int i10, int i11, l predicate) {
        int i12;
        int i13;
        e0.checkNotNullParameter(byteBuffer, "<this>");
        e0.checkNotNullParameter(out, "out");
        e0.checkNotNullParameter(predicate, "predicate");
        if (!byteBuffer.hasArray()) {
            int i14 = i11 + i10;
            boolean z10 = false;
            if (i14 <= out.length) {
                i12 = i10;
                while (byteBuffer.hasRemaining()) {
                    byte b10 = byteBuffer.get();
                    if (b10 >= 0 && i12 < i14) {
                        char c10 = (char) b10;
                        if (((Boolean) predicate.invoke(Character.valueOf(c10))).booleanValue()) {
                            out[i12] = c10;
                            i12++;
                        }
                    }
                    z10 = true;
                }
            } else {
                i12 = i10;
            }
            if (z10) {
                byteBuffer.position(byteBuffer.position() - 1);
            }
            return i12 - i10;
        }
        int i15 = i11 + i10;
        byte[] bArrArray = byteBuffer.array();
        int iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
        int iRemaining = byteBuffer.remaining() + iPosition;
        if (i15 > out.length || iRemaining > bArrArray.length) {
            i13 = i10;
        } else {
            i13 = i10;
            while (true) {
                if (iPosition < iRemaining && i13 < i15) {
                    byte b11 = bArrArray[iPosition];
                    if (b11 < 0) {
                        break;
                    }
                    char c11 = (char) b11;
                    if (!((Boolean) predicate.invoke(Character.valueOf(c11))).booleanValue()) {
                        iPosition--;
                        break;
                    }
                    out[i13] = c11;
                    i13++;
                    iPosition++;
                } else {
                    break;
                }
            }
            byteBuffer.position(iPosition - byteBuffer.arrayOffset());
        }
        return i13 - i10;
    }

    public static /* synthetic */ int decodeASCII$default(ByteBuffer byteBuffer, char[] out, int i10, int i11, l predicate, int i12, Object obj) {
        int i13;
        int i14;
        boolean z10 = false;
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = out.length;
        }
        e0.checkNotNullParameter(byteBuffer, "<this>");
        e0.checkNotNullParameter(out, "out");
        e0.checkNotNullParameter(predicate, "predicate");
        if (!byteBuffer.hasArray()) {
            int i15 = i11 + i10;
            if (i15 <= out.length) {
                i13 = i10;
                while (byteBuffer.hasRemaining()) {
                    byte b10 = byteBuffer.get();
                    if (b10 >= 0 && i13 < i15) {
                        char c10 = (char) b10;
                        if (((Boolean) predicate.invoke(Character.valueOf(c10))).booleanValue()) {
                            out[i13] = c10;
                            i13++;
                        }
                    }
                    z10 = true;
                }
            } else {
                i13 = i10;
            }
            if (z10) {
                byteBuffer.position(byteBuffer.position() - 1);
            }
            return i13 - i10;
        }
        int i16 = i11 + i10;
        byte[] bArrArray = byteBuffer.array();
        int iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
        int iRemaining = byteBuffer.remaining() + iPosition;
        if (i16 > out.length || iRemaining > bArrArray.length) {
            i14 = i10;
        } else {
            i14 = i10;
            while (true) {
                if (iPosition < iRemaining && i14 < i16) {
                    byte b11 = bArrArray[iPosition];
                    if (b11 < 0) {
                        break;
                    }
                    char c11 = (char) b11;
                    if (!((Boolean) predicate.invoke(Character.valueOf(c11))).booleanValue()) {
                        iPosition--;
                        break;
                    }
                    out[i14] = c11;
                    i14++;
                    iPosition++;
                } else {
                    break;
                }
            }
            byteBuffer.position(iPosition - byteBuffer.arrayOffset());
        }
        return i14 - i10;
    }

    private static final int decodeASCII3_array(ByteBuffer byteBuffer, char[] cArr, int i10, int i11) {
        int i12;
        int i13 = i11 + i10;
        byte[] bArrArray = byteBuffer.array();
        int iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
        int iRemaining = byteBuffer.remaining() + iPosition;
        if (i13 > cArr.length || iRemaining > bArrArray.length) {
            i12 = i10;
        } else {
            i12 = i10;
            while (iPosition < iRemaining && i12 < i13) {
                byte b10 = bArrArray[iPosition];
                if (b10 < 0) {
                    break;
                }
                cArr[i12] = (char) b10;
                i12++;
                iPosition++;
            }
            byteBuffer.position(iPosition - byteBuffer.arrayOffset());
        }
        return i12 - i10;
    }

    private static final int decodeASCII3_buffer(ByteBuffer byteBuffer, char[] cArr, int i10, int i11) {
        int i12;
        int i13 = i11 + i10;
        boolean z10 = false;
        if (i13 <= cArr.length) {
            i12 = i10;
            while (byteBuffer.hasRemaining()) {
                byte b10 = byteBuffer.get();
                if (b10 < 0 || i12 >= i13) {
                    z10 = true;
                    break;
                }
                cArr[i12] = (char) b10;
                i12++;
            }
        } else {
            i12 = i10;
        }
        if (z10) {
            byteBuffer.position(byteBuffer.position() - 1);
        }
        return i12 - i10;
    }

    private static final int decodeASCII3_buffer(ByteBuffer byteBuffer, char[] cArr, int i10, int i11, l lVar) {
        int i12;
        int i13 = i11 + i10;
        boolean z10 = false;
        if (i13 <= cArr.length) {
            i12 = i10;
            while (byteBuffer.hasRemaining()) {
                byte b10 = byteBuffer.get();
                if (b10 >= 0 && i12 < i13) {
                    char c10 = (char) b10;
                    if (((Boolean) lVar.invoke(Character.valueOf(c10))).booleanValue()) {
                        cArr[i12] = c10;
                        i12++;
                    }
                }
                z10 = true;
            }
        } else {
            i12 = i10;
        }
        if (z10) {
            byteBuffer.position(byteBuffer.position() - 1);
        }
        return i12 - i10;
    }

    private static final int decodeASCII3_array(ByteBuffer byteBuffer, char[] cArr, int i10, int i11, l lVar) {
        int i12;
        int i13 = i11 + i10;
        byte[] bArrArray = byteBuffer.array();
        int iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
        int iRemaining = byteBuffer.remaining() + iPosition;
        if (i13 > cArr.length || iRemaining > bArrArray.length) {
            i12 = i10;
        } else {
            i12 = i10;
            while (true) {
                if (iPosition < iRemaining && i12 < i13) {
                    byte b10 = bArrArray[iPosition];
                    if (b10 < 0) {
                        break;
                    }
                    char c10 = (char) b10;
                    if (!((Boolean) lVar.invoke(Character.valueOf(c10))).booleanValue()) {
                        iPosition--;
                        break;
                    }
                    cArr[i12] = c10;
                    i12++;
                    iPosition++;
                } else {
                    break;
                }
            }
            byteBuffer.position(iPosition - byteBuffer.arrayOffset());
        }
        return i12 - i10;
    }

    public static final int decodeASCII(ByteBuffer byteBuffer, char[] out, int i10, int i11) {
        e0.checkNotNullParameter(byteBuffer, "<this>");
        e0.checkNotNullParameter(out, "out");
        if (byteBuffer.hasArray()) {
            return decodeASCII3_array(byteBuffer, out, i10, i11);
        }
        return decodeASCII3_buffer(byteBuffer, out, i10, i11);
    }

    public static /* synthetic */ int decodeASCII$default(ByteBuffer byteBuffer, char[] cArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = cArr.length;
        }
        return decodeASCII(byteBuffer, cArr, i10, i11);
    }
}
