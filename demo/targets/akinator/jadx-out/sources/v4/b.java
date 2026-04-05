package v4;

import android.util.Log;
import com.applovin.shadow.okio.Segment;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* renamed from: g, reason: collision with root package name */
    public static final ByteOrder f88982g = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: h, reason: collision with root package name */
    public static final ByteOrder f88983h = ByteOrder.BIG_ENDIAN;

    /* renamed from: b, reason: collision with root package name */
    public final DataInputStream f88984b;

    /* renamed from: c, reason: collision with root package name */
    public ByteOrder f88985c;

    /* renamed from: e, reason: collision with root package name */
    public int f88986e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f88987f;

    public b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f88984b.available();
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    public int position() {
        return this.f88986e;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        this.f88986e++;
        return this.f88984b.read();
    }

    @Override // java.io.DataInput
    public boolean readBoolean() throws IOException {
        this.f88986e++;
        return this.f88984b.readBoolean();
    }

    @Override // java.io.DataInput
    public byte readByte() throws IOException {
        this.f88986e++;
        int i10 = this.f88984b.read();
        if (i10 >= 0) {
            return (byte) i10;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public char readChar() throws IOException {
        this.f88986e += 2;
        return this.f88984b.readChar();
    }

    @Override // java.io.DataInput
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        this.f88986e += i11;
        this.f88984b.readFully(bArr, i10, i11);
    }

    @Override // java.io.DataInput
    public int readInt() throws IOException {
        this.f88986e += 4;
        DataInputStream dataInputStream = this.f88984b;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        if ((i10 | i11 | i12 | i13) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f88985c;
        if (byteOrder == f88982g) {
            return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
        }
        if (byteOrder == f88983h) {
            return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
        }
        throw new IOException("Invalid byte order: " + this.f88985c);
    }

    @Override // java.io.DataInput
    public String readLine() throws IOException {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public long readLong() throws IOException {
        long j10;
        long j11;
        this.f88986e += 8;
        DataInputStream dataInputStream = this.f88984b;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        int i14 = dataInputStream.read();
        int i15 = dataInputStream.read();
        int i16 = dataInputStream.read();
        int i17 = dataInputStream.read();
        if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f88985c;
        if (byteOrder == f88982g) {
            j10 = (i17 << 56) + (i16 << 48) + (i15 << 40) + (i14 << 32) + (i13 << 24) + (i12 << 16) + (i11 << 8);
            j11 = i10;
        } else {
            if (byteOrder != f88983h) {
                throw new IOException("Invalid byte order: " + this.f88985c);
            }
            j10 = (i10 << 56) + (i11 << 48) + (i12 << 40) + (i13 << 32) + (i14 << 24) + (i15 << 16) + (i16 << 8);
            j11 = i17;
        }
        return j10 + j11;
    }

    @Override // java.io.DataInput
    public short readShort() throws IOException {
        this.f88986e += 2;
        DataInputStream dataInputStream = this.f88984b;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        if ((i10 | i11) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f88985c;
        if (byteOrder == f88982g) {
            return (short) ((i11 << 8) + i10);
        }
        if (byteOrder == f88983h) {
            return (short) ((i10 << 8) + i11);
        }
        throw new IOException("Invalid byte order: " + this.f88985c);
    }

    @Override // java.io.DataInput
    public String readUTF() throws IOException {
        this.f88986e += 2;
        return this.f88984b.readUTF();
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() throws IOException {
        this.f88986e++;
        return this.f88984b.readUnsignedByte();
    }

    public long readUnsignedInt() throws IOException {
        return readInt() & 4294967295L;
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() throws IOException {
        this.f88986e += 2;
        DataInputStream dataInputStream = this.f88984b;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        if ((i10 | i11) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f88985c;
        if (byteOrder == f88982g) {
            return (i11 << 8) + i10;
        }
        if (byteOrder == f88983h) {
            return (i10 << 8) + i11;
        }
        throw new IOException("Invalid byte order: " + this.f88985c);
    }

    @Override // java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    public void setByteOrder(ByteOrder byteOrder) {
        this.f88985c = byteOrder;
    }

    @Override // java.io.DataInput
    public int skipBytes(int i10) throws IOException {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public void skipFully(int i10) throws IOException {
        int i11 = 0;
        while (i11 < i10) {
            int i12 = i10 - i11;
            DataInputStream dataInputStream = this.f88984b;
            int iSkip = (int) dataInputStream.skip(i12);
            if (iSkip <= 0) {
                if (this.f88987f == null) {
                    this.f88987f = new byte[Segment.SIZE];
                }
                iSkip = dataInputStream.read(this.f88987f, 0, Math.min(Segment.SIZE, i12));
                if (iSkip == -1) {
                    throw new EOFException(o2.k(i10, "Reached EOF while skipping ", " bytes."));
                }
            }
            i11 += iSkip;
        }
        this.f88986e += i11;
    }

    public b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public b(InputStream inputStream, ByteOrder byteOrder) {
        this.f88985c = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f88984b = dataInputStream;
        dataInputStream.mark(0);
        this.f88986e = 0;
        this.f88985c = byteOrder;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f88984b.read(bArr, i10, i11);
        this.f88986e += i12;
        return i12;
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws IOException {
        this.f88986e += bArr.length;
        this.f88984b.readFully(bArr);
    }
}
