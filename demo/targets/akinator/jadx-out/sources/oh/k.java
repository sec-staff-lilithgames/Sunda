package oh;

import java.io.Serializable;
import rh.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k extends m implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public final int f79395c;

    public k(int i10) {
        this.f79395c = i10;
    }

    @Override // oh.m
    public byte[] asBytes() {
        int i10 = this.f79395c;
        return new byte[]{(byte) i10, (byte) (i10 >> 8), (byte) (i10 >> 16), (byte) (i10 >> 24)};
    }

    @Override // oh.m
    public int asInt() {
        return this.f79395c;
    }

    @Override // oh.m
    public long asLong() {
        throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
    }

    @Override // oh.m
    public final boolean b(m mVar) {
        return this.f79395c == mVar.asInt();
    }

    @Override // oh.m
    public int bits() {
        return 32;
    }

    @Override // oh.m
    public final void d(int i10, int i11, byte[] bArr) {
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i10 + i12] = (byte) (this.f79395c >> (i12 * 8));
        }
    }

    @Override // oh.m
    public long padToLong() {
        return g0.toLong(this.f79395c);
    }
}
