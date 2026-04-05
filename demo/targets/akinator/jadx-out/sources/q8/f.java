package q8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f implements a {
    @Override // q8.a
    public int getElementSizeInBytes() {
        return 1;
    }

    @Override // q8.a
    public String getTag() {
        return "ByteArrayPool";
    }

    @Override // q8.a
    public int getArrayLength(byte[] bArr) {
        return bArr.length;
    }

    @Override // q8.a
    public byte[] newArray(int i10) {
        return new byte[i10];
    }
}
