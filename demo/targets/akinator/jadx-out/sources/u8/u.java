package u8;

import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class u implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final x f88129a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends a {
        public b() {
            super(new v());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c extends a {
        public c() {
            super(new y());
        }
    }

    public u(x xVar) {
        this.f88129a = xVar;
    }

    @Override // u8.l0
    public k0 buildLoadData(File file, int i10, int i11, n8.v vVar) {
        return new k0(new i9.d(file), new w(file, this.f88129a));
    }

    @Override // u8.l0
    public boolean handles(File file) {
        return true;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements m0 {

        /* renamed from: a, reason: collision with root package name */
        public final x f88130a;

        public a(x xVar) {
            this.f88130a = xVar;
        }

        @Override // u8.m0
        public final l0 build(t0 t0Var) {
            return new u(this.f88130a);
        }

        @Override // u8.m0
        public final void teardown() {
        }
    }
}
