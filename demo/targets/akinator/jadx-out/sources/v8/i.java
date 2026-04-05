package v8;

import java.io.InputStream;
import java.net.URL;
import n8.v;
import u8.k0;
import u8.l0;
import u8.m0;
import u8.t0;
import u8.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class i implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f89193a;

    public i(l0 l0Var) {
        this.f89193a = l0Var;
    }

    @Override // u8.l0
    public k0 buildLoadData(URL url, int i10, int i11, v vVar) {
        return this.f89193a.buildLoadData(new z(url), i10, i11, vVar);
    }

    @Override // u8.l0
    public boolean handles(URL url) {
        return true;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements m0 {
        @Override // u8.m0
        public l0 build(t0 t0Var) {
            return new i(t0Var.build(z.class, InputStream.class));
        }

        @Override // u8.m0
        public void teardown() {
        }
    }
}
