package ph;

import b0.e2;
import com.applovin.shadow.okio.Segment;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayDeque;
import java.util.Arrays;
import mh.p1;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f81295a = new a0();

    public static byte[] a(int i10, ArrayDeque arrayDeque) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i10) {
            return bArr;
        }
        int length = i10 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i10 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static long b(InputStream inputStream, long j10) throws IOException {
        byte[] bArr = null;
        long j11 = 0;
        while (j11 < j10) {
            long j12 = j10 - j11;
            int iAvailable = inputStream.available();
            long jSkip = iAvailable == 0 ? 0L : inputStream.skip(Math.min(iAvailable, j12));
            if (jSkip == 0) {
                int iMin = (int) Math.min(j12, 8192L);
                if (bArr == null) {
                    bArr = new byte[iMin];
                }
                jSkip = inputStream.read(bArr, 0, iMin);
                if (jSkip == -1) {
                    break;
                }
            }
            j11 += jSkip;
        }
        return j11;
    }

    public static byte[] c(InputStream inputStream, long j10) throws IOException {
        p1.checkArgument(j10 >= 0, "expectedSize (%s) must be non-negative", j10);
        if (j10 > 2147483639) {
            throw new OutOfMemoryError(j10 + " bytes is too large to fit in a byte array");
        }
        int i10 = (int) j10;
        byte[] bArr = new byte[i10];
        int i11 = i10;
        while (i11 > 0) {
            int i12 = i10 - i11;
            int i13 = inputStream.read(bArr, i12, i11);
            if (i13 == -1) {
                return Arrays.copyOf(bArr, i12);
            }
            i11 -= i13;
        }
        int i14 = inputStream.read();
        if (i14 == -1) {
            return bArr;
        }
        ArrayDeque arrayDeque = new ArrayDeque(22);
        arrayDeque.add(bArr);
        arrayDeque.add(new byte[]{(byte) i14});
        return d(inputStream, arrayDeque, i10 + 1);
    }

    public static long copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        p1.checkNotNull(inputStream);
        p1.checkNotNull(outputStream);
        byte[] bArr = new byte[Segment.SIZE];
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return j10;
            }
            outputStream.write(bArr, 0, i10);
            j10 += i10;
        }
    }

    public static byte[] d(InputStream inputStream, ArrayDeque arrayDeque, int i10) throws IOException {
        int iMin = Math.min(Segment.SIZE, Math.max(128, Integer.highestOneBit(i10) * 2));
        while (i10 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i10);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i11 = 0;
            while (i11 < iMin2) {
                int i12 = inputStream.read(bArr, i11, iMin2 - i11);
                if (i12 == -1) {
                    return a(i10, arrayDeque);
                }
                i11 += i12;
                i10 += i12;
            }
            iMin = qh.f.saturatedMultiply(iMin, iMin < 4096 ? 4 : 2);
        }
        if (inputStream.read() == -1) {
            return a(2147483639, arrayDeque);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static long exhaust(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[Segment.SIZE];
        long j10 = 0;
        while (true) {
            long j11 = inputStream.read(bArr);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
        }
    }

    public static InputStream limit(InputStream inputStream, long j10) {
        return new d0(inputStream, j10);
    }

    public static p newDataInput(byte[] bArr) {
        return newDataInput(new ByteArrayInputStream(bArr));
    }

    public static q newDataOutput() {
        return newDataOutput(new ByteArrayOutputStream());
    }

    public static OutputStream nullOutputStream() {
        return f81295a;
    }

    public static int read(InputStream inputStream, byte[] bArr, int i10, int i11) throws IOException {
        p1.checkNotNull(inputStream);
        p1.checkNotNull(bArr);
        if (i11 < 0) {
            throw new IndexOutOfBoundsException(o2.k(i11, "len (", ") cannot be negative"));
        }
        p1.checkPositionIndexes(i10, i10 + i11, bArr.length);
        int i12 = 0;
        while (i12 < i11) {
            int i13 = inputStream.read(bArr, i10 + i12, i11 - i12);
            if (i13 == -1) {
                break;
            }
            i12 += i13;
        }
        return i12;
    }

    public static <T> T readBytes(InputStream inputStream, r rVar) throws IOException {
        p1.checkNotNull(inputStream);
        p1.checkNotNull(rVar);
        byte[] bArr = new byte[Segment.SIZE];
        while (inputStream.read(bArr) != -1 && rVar.a()) {
        }
        return (T) rVar.getResult();
    }

    public static void readFully(InputStream inputStream, byte[] bArr) throws IOException {
        readFully(inputStream, bArr, 0, bArr.length);
    }

    public static void skipFully(InputStream inputStream, long j10) throws IOException {
        long jB = b(inputStream, j10);
        if (jB < j10) {
            throw new EOFException(a.b.g(j10, " bytes expected", e2.r(jB, "reached end of stream after skipping ", " bytes; ")));
        }
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        p1.checkNotNull(inputStream);
        return d(inputStream, new ArrayDeque(20), 0);
    }

    public static p newDataInput(byte[] bArr, int i10) {
        p1.checkPositionIndex(i10, bArr.length);
        return newDataInput(new ByteArrayInputStream(bArr, i10, bArr.length - i10));
    }

    public static q newDataOutput(int i10) {
        if (i10 >= 0) {
            return newDataOutput(new ByteArrayOutputStream(i10));
        }
        throw new IllegalArgumentException(a.b.e(i10, "Invalid size: "));
    }

    public static void readFully(InputStream inputStream, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = read(inputStream, bArr, i10, i11);
        if (i12 != i11) {
            throw new EOFException(o2.i(i12, i11, "reached end of stream after reading ", " bytes; ", " bytes expected"));
        }
    }

    public static p newDataInput(ByteArrayInputStream byteArrayInputStream) {
        return new b0((ByteArrayInputStream) p1.checkNotNull(byteArrayInputStream));
    }

    public static long copy(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel) throws IOException {
        p1.checkNotNull(readableByteChannel);
        p1.checkNotNull(writableByteChannel);
        long jWrite = 0;
        if (readableByteChannel instanceof FileChannel) {
            FileChannel fileChannel = (FileChannel) readableByteChannel;
            long jPosition = fileChannel.position();
            long j10 = jPosition;
            while (true) {
                WritableByteChannel writableByteChannel2 = writableByteChannel;
                long jTransferTo = fileChannel.transferTo(j10, 524288L, writableByteChannel2);
                j10 += jTransferTo;
                fileChannel.position(j10);
                if (jTransferTo <= 0 && j10 >= fileChannel.size()) {
                    return j10 - jPosition;
                }
                writableByteChannel = writableByteChannel2;
            }
        } else {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[Segment.SIZE]);
            while (readableByteChannel.read(byteBufferWrap) != -1) {
                byteBufferWrap.flip();
                while (byteBufferWrap.hasRemaining()) {
                    jWrite += writableByteChannel.write(byteBufferWrap);
                }
                byteBufferWrap.clear();
            }
            return jWrite;
        }
    }

    public static q newDataOutput(ByteArrayOutputStream byteArrayOutputStream) {
        return new c0((ByteArrayOutputStream) p1.checkNotNull(byteArrayOutputStream));
    }
}
