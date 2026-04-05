package u8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class b1 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b1 f88058a = new b1();

    @Deprecated
    public b1() {
    }

    public static <T> b1 getInstance() {
        return f88058a;
    }

    @Override // u8.l0
    public k0 buildLoadData(Object obj, int i10, int i11, n8.v vVar) {
        return new k0(new i9.d(obj), new c1(obj));
    }

    @Override // u8.l0
    public boolean handles(Object obj) {
        return true;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements m0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f88059a = new a();

        @Deprecated
        public a() {
        }

        public static <T> a getInstance() {
            return f88059a;
        }

        @Override // u8.m0
        public l0 build(t0 t0Var) {
            return b1.getInstance();
        }

        @Override // u8.m0
        public void teardown() {
        }
    }
}
