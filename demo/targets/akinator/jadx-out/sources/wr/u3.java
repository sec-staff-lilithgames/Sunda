package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class u3 extends z3 {

    /* renamed from: f, reason: collision with root package name */
    public final v3 f91152f;

    public u3(String str, v3 v3Var) {
        super(v3Var, str, false);
        mh.p1.checkArgument(str.endsWith("-bin"), "Binary header is named %s. It must end with %s", str, "-bin");
        mh.p1.checkArgument(str.length() > 4, "empty key name");
        this.f91152f = (v3) mh.p1.checkNotNull(v3Var, "marshaller is null");
    }

    @Override // wr.z3
    public final Object a(byte[] bArr) {
        return this.f91152f.parseBytes(bArr);
    }

    @Override // wr.z3
    public final byte[] b(Object obj) {
        return (byte[]) mh.p1.checkNotNull(this.f91152f.toBytes(obj), "null marshaller.toBytes()");
    }
}
