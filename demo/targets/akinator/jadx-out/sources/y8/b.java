package y8;

import j9.q;
import p8.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class b implements v0 {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f94144b;

    public b(byte[] bArr) {
        this.f94144b = (byte[]) q.checkNotNull(bArr);
    }

    @Override // p8.v0
    public Class<byte[]> getResourceClass() {
        return byte[].class;
    }

    @Override // p8.v0
    public int getSize() {
        return this.f94144b.length;
    }

    @Override // p8.v0
    public byte[] get() {
        return this.f94144b;
    }

    @Override // p8.v0
    public void recycle() {
    }
}
