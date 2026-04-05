package vv;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import kotlin.jvm.internal.e0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class c {
    public static final void formatBytesInto(long j10, byte[] dst, int i10, int i11, int i12) {
        e0.checkNotNullParameter(dst, "dst");
        d.formatBytesIntoCommonImpl(j10, dst, i10, i11, i12);
    }

    public static final long getLongAt(byte[] bArr, int i10) {
        e0.checkNotNullParameter(bArr, "<this>");
        return d.getLongAtCommonImpl(bArr, i10);
    }

    public static final b getUuid(ByteBuffer byteBuffer) {
        e0.checkNotNullParameter(byteBuffer, "<this>");
        if (byteBuffer.position() + 15 >= byteBuffer.limit()) {
            throw new BufferUnderflowException();
        }
        long jReverseBytes = byteBuffer.getLong();
        long jReverseBytes2 = byteBuffer.getLong();
        if (e0.areEqual(byteBuffer.order(), ByteOrder.LITTLE_ENDIAN)) {
            jReverseBytes = Long.reverseBytes(jReverseBytes);
            jReverseBytes2 = Long.reverseBytes(jReverseBytes2);
        }
        return b.f89658e.fromLongs(jReverseBytes, jReverseBytes2);
    }

    public static final ByteBuffer putUuid(ByteBuffer byteBuffer, b uuid) {
        ByteBuffer byteBufferPutLong;
        e0.checkNotNullParameter(byteBuffer, "<this>");
        e0.checkNotNullParameter(uuid, "uuid");
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        if (byteBuffer.position() + 15 >= byteBuffer.limit()) {
            throw new BufferOverflowException();
        }
        if (e0.areEqual(byteBuffer.order(), ByteOrder.BIG_ENDIAN)) {
            byteBuffer.putLong(mostSignificantBits);
            byteBufferPutLong = byteBuffer.putLong(leastSignificantBits);
        } else {
            byteBuffer.putLong(Long.reverseBytes(mostSignificantBits));
            byteBufferPutLong = byteBuffer.putLong(Long.reverseBytes(leastSignificantBits));
        }
        e0.checkNotNullExpressionValue(byteBufferPutLong, "toLongs(...)");
        return byteBufferPutLong;
    }

    public static final long reverseBytes(long j10) {
        return Long.reverseBytes(j10);
    }

    public static final b secureRandomUuid() {
        byte[] bArr = new byte[16];
        a.f89656a.getInstance().nextBytes(bArr);
        return d.uuidFromRandomBytes(bArr);
    }

    public static final Object serializedUuid(b uuid) {
        e0.checkNotNullParameter(uuid, "uuid");
        return new e(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    public static final void setLongAt(byte[] bArr, int i10, long j10) {
        e0.checkNotNullParameter(bArr, "<this>");
        d.setLongAtCommonImpl(bArr, i10, j10);
    }

    public static final UUID toJavaUuid(b bVar) {
        e0.checkNotNullParameter(bVar, "<this>");
        return new UUID(bVar.getMostSignificantBits(), bVar.getLeastSignificantBits());
    }

    public static final b toKotlinUuid(UUID uuid) {
        e0.checkNotNullParameter(uuid, "<this>");
        return b.f89658e.fromLongs(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    public static final b uuidParseHex(String hexString) {
        e0.checkNotNullParameter(hexString, "hexString");
        return d.uuidParseHexCommonImpl(hexString);
    }

    public static final b uuidParseHexDash(String hexDashString) {
        e0.checkNotNullParameter(hexDashString, "hexDashString");
        return d.uuidParseHexDashCommonImpl(hexDashString);
    }

    public static final b getUuid(ByteBuffer byteBuffer, int i10) {
        e0.checkNotNullParameter(byteBuffer, "<this>");
        if (i10 >= 0) {
            if (i10 + 15 < byteBuffer.limit()) {
                long jReverseBytes = byteBuffer.getLong(i10);
                long jReverseBytes2 = byteBuffer.getLong(i10 + 8);
                if (e0.areEqual(byteBuffer.order(), ByteOrder.LITTLE_ENDIAN)) {
                    jReverseBytes = Long.reverseBytes(jReverseBytes);
                    jReverseBytes2 = Long.reverseBytes(jReverseBytes2);
                }
                return b.f89658e.fromLongs(jReverseBytes, jReverseBytes2);
            }
            StringBuilder sbT = o2.t(i10, "Not enough bytes to read a uuid at index: ", ", with limit: ");
            sbT.append(byteBuffer.limit());
            sbT.append(' ');
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        throw new IndexOutOfBoundsException(a.b.e(i10, "Negative index: "));
    }

    public static final ByteBuffer putUuid(ByteBuffer byteBuffer, int i10, b uuid) {
        ByteBuffer byteBufferPutLong;
        e0.checkNotNullParameter(byteBuffer, "<this>");
        e0.checkNotNullParameter(uuid, "uuid");
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        if (i10 >= 0) {
            if (i10 + 15 < byteBuffer.limit()) {
                if (e0.areEqual(byteBuffer.order(), ByteOrder.BIG_ENDIAN)) {
                    byteBuffer.putLong(i10, mostSignificantBits);
                    byteBufferPutLong = byteBuffer.putLong(i10 + 8, leastSignificantBits);
                } else {
                    byteBuffer.putLong(i10, Long.reverseBytes(mostSignificantBits));
                    byteBufferPutLong = byteBuffer.putLong(i10 + 8, Long.reverseBytes(leastSignificantBits));
                }
                e0.checkNotNullExpressionValue(byteBufferPutLong, "toLongs(...)");
                return byteBufferPutLong;
            }
            StringBuilder sbT = o2.t(i10, "Not enough capacity to write a uuid at index: ", ", with limit: ");
            sbT.append(byteBuffer.limit());
            sbT.append(' ');
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        throw new IndexOutOfBoundsException(a.b.e(i10, "Negative index: "));
    }
}
