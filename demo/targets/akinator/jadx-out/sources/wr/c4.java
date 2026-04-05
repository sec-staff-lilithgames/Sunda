package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c4 extends z3 {

    /* renamed from: f, reason: collision with root package name */
    public final d4 f90859f;

    public c4(String str, boolean z10, d4 d4Var) {
        super(d4Var, str, z10);
        mh.p1.checkArgument(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        this.f90859f = (d4) mh.p1.checkNotNull(d4Var, "marshaller");
    }

    @Override // wr.z3
    public final Object a(byte[] bArr) {
        return this.f90859f.parseAsciiString(bArr);
    }

    @Override // wr.z3
    public final byte[] b(Object obj) {
        return (byte[]) mh.p1.checkNotNull(this.f90859f.toAsciiString(obj), "null marshaller.toAsciiString()");
    }
}
