package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s3 extends z3 {

    /* renamed from: f, reason: collision with root package name */
    public final t3 f91125f;

    public s3(String str, boolean z10, t3 t3Var) {
        super(t3Var, str, z10);
        mh.p1.checkArgument(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        this.f91125f = (t3) mh.p1.checkNotNull(t3Var, "marshaller");
    }

    @Override // wr.z3
    public final Object a(byte[] bArr) {
        return this.f91125f.parseAsciiString(new String(bArr, mh.h0.f74626a));
    }

    @Override // wr.z3
    public final byte[] b(Object obj) {
        return ((String) mh.p1.checkNotNull(this.f91125f.toAsciiString(obj), "null marshaller.toAsciiString()")).getBytes(mh.h0.f74626a);
    }
}
