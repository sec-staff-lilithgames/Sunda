package t4;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends a {
    public d __assign(int i10, ByteBuffer byteBuffer) {
        a(i10, 4, byteBuffer);
        return this;
    }

    public int get(int i10) {
        return this.f86303d.getInt((i10 * this.f86302c) + this.f86300a);
    }

    public long getAsUnsigned(int i10) {
        return get(i10) & 4294967295L;
    }
}
