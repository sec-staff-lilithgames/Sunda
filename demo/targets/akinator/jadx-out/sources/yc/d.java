package yc;

import java.io.IOException;
import java.util.Arrays;
import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class d extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public static final d f94305c = new d(new byte[0]);

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f94306b;

    public d(byte[] bArr) {
        this.f94306b = bArr;
    }

    public static d valueOf(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return bArr.length == 0 ? f94305c : new d(bArr);
    }

    @Override // jc.t
    public String asText() {
        return ub.c.getDefaultVariant().encode(this.f94306b, false);
    }

    @Override // yc.a0, yc.b, jc.t, ub.o0
    public ub.z asToken() {
        return ub.z.VALUE_EMBEDDED_OBJECT;
    }

    @Override // jc.t
    public byte[] binaryValue() {
        return this.f94306b;
    }

    @Override // jc.t
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof d)) {
            byte[] bArr = ((d) obj).f94306b;
            byte[] bArr2 = this.f94306b;
            if (bArr2 == bArr) {
                return true;
            }
            if (bArr2 != null && bArr != null) {
                return Arrays.equals(bArr2, bArr);
            }
        }
        return false;
    }

    @Override // jc.t
    public p getNodeType() {
        return p.f94332c;
    }

    @Override // yc.b
    public int hashCode() {
        byte[] bArr = this.f94306b;
        if (bArr == null) {
            return -1;
        }
        return bArr.length;
    }

    @Override // yc.b, jc.t, jc.u, jc.v
    public final void serialize(ub.o oVar, u0 u0Var) throws IOException {
        byte[] bArr = this.f94306b;
        if (bArr == null) {
            oVar.writeNull();
        } else {
            oVar.writeBinary(u0Var.getConfig().getBase64Variant(), bArr, 0, bArr.length);
        }
    }

    public d(byte[] bArr, int i10, int i11) {
        if (i10 == 0 && i11 == bArr.length) {
            this.f94306b = bArr;
            return;
        }
        byte[] bArr2 = new byte[i11];
        this.f94306b = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }

    public static d valueOf(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            return null;
        }
        if (i11 == 0) {
            return f94305c;
        }
        return new d(bArr, i10, i11);
    }
}
