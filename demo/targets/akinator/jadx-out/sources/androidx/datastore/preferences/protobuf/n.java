package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n extends s {

    /* renamed from: h, reason: collision with root package name */
    public final int f5959h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5960i;

    public n(byte[] bArr, int i10, int i11) {
        super(bArr);
        x.c(i10, i10 + i11, bArr.length);
        this.f5959h = i10;
        this.f5960i = i11;
    }

    @Override // androidx.datastore.preferences.protobuf.s, androidx.datastore.preferences.protobuf.x
    public byte byteAt(int i10) {
        x.b(i10, size());
        return this.f5986g[this.f5959h + i10];
    }

    @Override // androidx.datastore.preferences.protobuf.s, androidx.datastore.preferences.protobuf.x
    public final void d(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f5986g, this.f5959h + i10, bArr, i11, i12);
    }

    @Override // androidx.datastore.preferences.protobuf.s, androidx.datastore.preferences.protobuf.x
    public final byte internalByteAt(int i10) {
        return this.f5986g[this.f5959h + i10];
    }

    @Override // androidx.datastore.preferences.protobuf.s
    public final int p() {
        return this.f5959h;
    }

    @Override // androidx.datastore.preferences.protobuf.s, androidx.datastore.preferences.protobuf.x
    public int size() {
        return this.f5960i;
    }
}
