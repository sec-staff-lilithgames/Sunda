package ld;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u extends l0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f73305a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f73306b;

    public u(byte[] bArr, byte[] bArr2) {
        this.f73305a = bArr;
        this.f73306b = bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l0) {
            l0 l0Var = (l0) obj;
            boolean z10 = l0Var instanceof u;
            if (Arrays.equals(this.f73305a, z10 ? ((u) l0Var).f73305a : l0Var.getClearBlob())) {
                if (Arrays.equals(this.f73306b, z10 ? ((u) l0Var).f73306b : l0Var.getEncryptedBlob())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ld.l0
    public byte[] getClearBlob() {
        return this.f73305a;
    }

    @Override // ld.l0
    public byte[] getEncryptedBlob() {
        return this.f73306b;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.f73305a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f73306b);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f73305a) + ", encryptedBlob=" + Arrays.toString(this.f73306b) + "}";
    }
}
