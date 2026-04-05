package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f5970a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f5971b;

    public q(int i10) {
        byte[] bArr = new byte[i10];
        this.f5971b = bArr;
        this.f5970a = l0.newInstance(bArr);
    }

    public x build() {
        this.f5970a.checkNoSpaceLeft();
        return new s(this.f5971b);
    }

    public l0 getCodedOutput() {
        return this.f5970a;
    }
}
