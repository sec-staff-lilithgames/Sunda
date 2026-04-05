package io.ktor.utils.io.internal;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;
import sv.j0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class UtilsKt {
    public static final int getIOIntProperty(String name, int i10) {
        String property;
        Integer intOrNull;
        e0.checkNotNullParameter(name, "name");
        try {
            property = System.getProperty("io.ktor.utils.io." + name);
        } catch (SecurityException unused) {
            property = null;
        }
        return (property == null || (intOrNull = j0.toIntOrNull(property)) == null) ? i10 : intOrNull.intValue();
    }

    public static final int indexOfPartial(ByteBuffer byteBuffer, ByteBuffer sub) {
        int i10;
        e0.checkNotNullParameter(byteBuffer, "<this>");
        e0.checkNotNullParameter(sub, "sub");
        int iPosition = sub.position();
        int iRemaining = sub.remaining();
        byte b10 = sub.get(iPosition);
        int iLimit = byteBuffer.limit();
        loop0: for (int iPosition2 = byteBuffer.position(); iPosition2 < iLimit; iPosition2++) {
            if (byteBuffer.get(iPosition2) == b10) {
                while (i10 < iRemaining) {
                    int i11 = iPosition2 + i10;
                    if (i11 == iLimit) {
                        break loop0;
                    }
                    i10 = byteBuffer.get(i11) == sub.get(iPosition + i10) ? i10 + 1 : 1;
                }
                return iPosition2 - byteBuffer.position();
            }
        }
        return -1;
    }

    public static final boolean isEmpty(ByteBuffer byteBuffer) {
        e0.checkNotNullParameter(byteBuffer, "<this>");
        return !byteBuffer.hasRemaining();
    }

    public static final int putAtMost(ByteBuffer byteBuffer, ByteBuffer src, int i10) {
        e0.checkNotNullParameter(byteBuffer, "<this>");
        e0.checkNotNullParameter(src, "src");
        int iRemaining = byteBuffer.remaining();
        int iRemaining2 = src.remaining();
        if (iRemaining2 <= iRemaining && iRemaining2 <= i10) {
            byteBuffer.put(src);
            return iRemaining2;
        }
        int iMin = Math.min(iRemaining, Math.min(iRemaining2, i10));
        int i11 = 1;
        if (1 <= iMin) {
            while (true) {
                byteBuffer.put(src.get());
                if (i11 == iMin) {
                    break;
                }
                i11++;
            }
        }
        return iMin;
    }

    public static /* synthetic */ int putAtMost$default(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = byteBuffer2.remaining();
        }
        return putAtMost(byteBuffer, byteBuffer2, i10);
    }

    public static final int putLimited(ByteBuffer byteBuffer, ByteBuffer src, int i10) {
        e0.checkNotNullParameter(byteBuffer, "<this>");
        e0.checkNotNullParameter(src, "src");
        return putAtMost(byteBuffer, src, i10 - src.position());
    }

    public static /* synthetic */ int putLimited$default(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = byteBuffer.limit();
        }
        return putLimited(byteBuffer, byteBuffer2, i10);
    }

    public static final boolean startsWith(ByteBuffer byteBuffer, ByteBuffer prefix, int i10) {
        e0.checkNotNullParameter(byteBuffer, "<this>");
        e0.checkNotNullParameter(prefix, "prefix");
        int iMin = Math.min(byteBuffer.remaining(), prefix.remaining() - i10);
        if (iMin <= 0) {
            return false;
        }
        int iPosition = byteBuffer.position();
        int iPosition2 = prefix.position() + i10;
        for (int i11 = 0; i11 < iMin; i11++) {
            if (byteBuffer.get(iPosition + i11) != prefix.get(iPosition2 + i11)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean startsWith$default(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return startsWith(byteBuffer, byteBuffer2, i10);
    }
}
