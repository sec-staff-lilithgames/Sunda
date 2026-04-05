package ph;

import java.io.DataInput;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface p extends DataInput {
    @Override // java.io.DataInput
    boolean readBoolean();

    @Override // java.io.DataInput
    byte readByte();

    @Override // java.io.DataInput
    char readChar();

    @Override // java.io.DataInput
    double readDouble();

    @Override // java.io.DataInput
    float readFloat();

    @Override // java.io.DataInput
    void readFully(byte[] bArr);

    @Override // java.io.DataInput
    void readFully(byte[] bArr, int i10, int i11);

    @Override // java.io.DataInput
    int readInt();

    @Override // java.io.DataInput
    String readLine();

    @Override // java.io.DataInput
    long readLong();

    @Override // java.io.DataInput
    short readShort();

    @Override // java.io.DataInput
    String readUTF();

    @Override // java.io.DataInput
    int readUnsignedByte();

    @Override // java.io.DataInput
    int readUnsignedShort();

    @Override // java.io.DataInput
    int skipBytes(int i10);
}
