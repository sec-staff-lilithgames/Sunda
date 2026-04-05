package u8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final k f88095a;

    public n(k kVar) {
        this.f88095a = kVar;
    }

    @Override // u8.l0
    public k0 buildLoadData(Object obj, int i10, int i11, n8.v vVar) {
        return new k0(new i9.d(obj), new l(obj.toString(), this.f88095a));
    }

    @Override // u8.l0
    public boolean handles(Object obj) {
        return obj.toString().startsWith("data:image");
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements m0 {

        /* renamed from: a, reason: collision with root package name */
        public final m f88096a = new m();

        @Override // u8.m0
        public l0 build(t0 t0Var) {
            return new n(this.f88096a);
        }

        @Override // u8.m0
        public void teardown() {
        }
    }
}
