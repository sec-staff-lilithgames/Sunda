package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f5 implements wr.o2 {
    @Override // wr.o2, wr.d4
    public Integer parseAsciiString(byte[] bArr) {
        if (bArr.length < 3) {
            throw new NumberFormatException("Malformed status code ".concat(new String(bArr, wr.p2.f91090a)));
        }
        return Integer.valueOf((bArr[2] - 48) + j1.o2.b(bArr[1], 48, 10, (bArr[0] - 48) * 100));
    }

    @Override // wr.o2, wr.d4
    public byte[] toAsciiString(Integer num) {
        throw new UnsupportedOperationException();
    }
}
