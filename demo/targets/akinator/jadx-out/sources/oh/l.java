package oh;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l extends m implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public final long f79396c;

    public l(long j10) {
        this.f79396c = j10;
    }

    @Override // oh.m
    public byte[] asBytes() {
        return new byte[]{(byte) this.f79396c, (byte) (r0 >> 8), (byte) (r0 >> 16), (byte) (r0 >> 24), (byte) (r0 >> 32), (byte) (r0 >> 40), (byte) (r0 >> 48), (byte) (r0 >> 56)};
    }

    @Override // oh.m
    public int asInt() {
        return (int) this.f79396c;
    }

    @Override // oh.m
    public long asLong() {
        return this.f79396c;
    }

    @Override // oh.m
    public final boolean b(m mVar) {
        return this.f79396c == mVar.asLong();
    }

    @Override // oh.m
    public int bits() {
        return 64;
    }

    @Override // oh.m
    public final void d(int i10, int i11, byte[] bArr) {
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i10 + i12] = (byte) (this.f79396c >> (i12 * 8));
        }
    }

    @Override // oh.m
    public long padToLong() {
        return this.f79396c;
    }
}
