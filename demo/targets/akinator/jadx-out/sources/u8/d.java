package u8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class d implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final e f88065a;

    public d(e eVar) {
        this.f88065a = eVar;
    }

    @Override // u8.l0
    public k0 buildLoadData(byte[] bArr, int i10, int i11, n8.v vVar) {
        return new k0(new i9.d(bArr), new f(bArr, this.f88065a));
    }

    @Override // u8.l0
    public boolean handles(byte[] bArr) {
        return true;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements m0 {
        @Override // u8.m0
        public l0 build(t0 t0Var) {
            return new d(new c());
        }

        @Override // u8.m0
        public void teardown() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b implements m0 {
        @Override // u8.m0
        public l0 build(t0 t0Var) {
            return new d(new g());
        }

        @Override // u8.m0
        public void teardown() {
        }
    }
}
