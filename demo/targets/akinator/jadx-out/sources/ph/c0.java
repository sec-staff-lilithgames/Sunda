package ph;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c0 implements q {

    /* renamed from: b, reason: collision with root package name */
    public final DataOutputStream f81285b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteArrayOutputStream f81286c;

    public c0(ByteArrayOutputStream byteArrayOutputStream) {
        this.f81286c = byteArrayOutputStream;
        this.f81285b = new DataOutputStream(byteArrayOutputStream);
    }

    @Override // ph.q
    public byte[] toByteArray() {
        return this.f81286c.toByteArray();
    }

    @Override // ph.q, java.io.DataOutput
    public void write(int i10) throws IOException {
        try {
            this.f81285b.write(i10);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // ph.q, java.io.DataOutput
    public void writeBoolean(boolean z10) throws IOException {
        try {
            this.f81285b.writeBoolean(z10);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // ph.q, java.io.DataOutput
    public void writeByte(int i10) throws IOException {
        try {
            this.f81285b.writeByte(i10);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // ph.q, java.io.DataOutput
    public void writeBytes(String str) throws IOException {
        try {
            this.f81285b.writeBytes(str);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // ph.q, java.io.DataOutput
    public void writeChar(int i10) throws IOException {
        try {
            this.f81285b.writeChar(i10);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // ph.q, java.io.DataOutput
    public void writeChars(String str) throws IOException {
        try {
            this.f81285b.writeChars(str);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // ph.q, java.io.DataOutput
    public void writeDouble(double d10) throws IOException {
        try {
            this.f81285b.writeDouble(d10);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // ph.q, java.io.DataOutput
    public void writeFloat(float f10) throws IOException {
        try {
            this.f81285b.writeFloat(f10);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // ph.q, java.io.DataOutput
    public void writeInt(int i10) throws IOException {
        try {
            this.f81285b.writeInt(i10);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // ph.q, java.io.DataOutput
    public void writeLong(long j10) throws IOException {
        try {
            this.f81285b.writeLong(j10);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // ph.q, java.io.DataOutput
    public void writeShort(int i10) throws IOException {
        try {
            this.f81285b.writeShort(i10);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // ph.q, java.io.DataOutput
    public void writeUTF(String str) throws IOException {
        try {
            this.f81285b.writeUTF(str);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // ph.q, java.io.DataOutput
    public void write(byte[] bArr) throws IOException {
        try {
            this.f81285b.write(bArr);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // ph.q, java.io.DataOutput
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        try {
            this.f81285b.write(bArr, i10, i11);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
