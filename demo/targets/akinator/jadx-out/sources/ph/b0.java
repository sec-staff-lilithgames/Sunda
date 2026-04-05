package ph;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b0 implements p {

    /* renamed from: b, reason: collision with root package name */
    public final DataInputStream f81282b;

    public b0(ByteArrayInputStream byteArrayInputStream) {
        this.f81282b = new DataInputStream(byteArrayInputStream);
    }

    @Override // ph.p, java.io.DataInput
    public boolean readBoolean() {
        try {
            return this.f81282b.readBoolean();
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // ph.p, java.io.DataInput
    public byte readByte() {
        try {
            return this.f81282b.readByte();
        } catch (EOFException e10) {
            throw new IllegalStateException(e10);
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }

    @Override // ph.p, java.io.DataInput
    public char readChar() {
        try {
            return this.f81282b.readChar();
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // ph.p, java.io.DataInput
    public double readDouble() {
        try {
            return this.f81282b.readDouble();
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // ph.p, java.io.DataInput
    public float readFloat() {
        try {
            return this.f81282b.readFloat();
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // ph.p, java.io.DataInput
    public void readFully(byte[] bArr) throws IOException {
        try {
            this.f81282b.readFully(bArr);
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // ph.p, java.io.DataInput
    public int readInt() {
        try {
            return this.f81282b.readInt();
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // ph.p, java.io.DataInput
    public String readLine() {
        try {
            return this.f81282b.readLine();
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // ph.p, java.io.DataInput
    public long readLong() {
        try {
            return this.f81282b.readLong();
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // ph.p, java.io.DataInput
    public short readShort() {
        try {
            return this.f81282b.readShort();
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // ph.p, java.io.DataInput
    public String readUTF() {
        try {
            return this.f81282b.readUTF();
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // ph.p, java.io.DataInput
    public int readUnsignedByte() {
        try {
            return this.f81282b.readUnsignedByte();
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // ph.p, java.io.DataInput
    public int readUnsignedShort() {
        try {
            return this.f81282b.readUnsignedShort();
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // ph.p, java.io.DataInput
    public int skipBytes(int i10) {
        try {
            return this.f81282b.skipBytes(i10);
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // ph.p, java.io.DataInput
    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        try {
            this.f81282b.readFully(bArr, i10, i11);
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
