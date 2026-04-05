package wr;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k6 implements d4 {
    @Override // wr.d4
    public m6 parseAsciiString(byte[] bArr) {
        int i10;
        byte b10;
        char c10 = 0;
        if (bArr.length == 1 && bArr[0] == 48) {
            return m6.f91037e;
        }
        int length = bArr.length;
        if (length != 1) {
            if (length == 2 && (b10 = bArr[0]) >= 48 && b10 <= 57) {
                i10 = (b10 - 48) * 10;
                c10 = 1;
            }
            return m6.f91039g.withDescription("Unknown code ".concat(new String(bArr, mh.h0.f74626a)));
        }
        i10 = 0;
        byte b11 = bArr[c10];
        if (b11 >= 48 && b11 <= 57) {
            int i11 = (b11 - 48) + i10;
            List list = m6.f91036d;
            if (i11 < list.size()) {
                return (m6) list.get(i11);
            }
        }
        return m6.f91039g.withDescription("Unknown code ".concat(new String(bArr, mh.h0.f74626a)));
    }

    @Override // wr.d4
    public byte[] toAsciiString(m6 m6Var) {
        return m6Var.getCode().f91005c;
    }
}
