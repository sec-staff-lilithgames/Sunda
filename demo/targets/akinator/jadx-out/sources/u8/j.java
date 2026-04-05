package u8;

import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class j implements l0 {
    @Override // u8.l0
    public k0 buildLoadData(File file, int i10, int i11, n8.v vVar) {
        return new k0(new i9.d(file), new i(file));
    }

    @Override // u8.l0
    public boolean handles(File file) {
        return true;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements m0 {
        @Override // u8.m0
        public l0 build(t0 t0Var) {
            return new j();
        }

        @Override // u8.m0
        public void teardown() {
        }
    }
}
