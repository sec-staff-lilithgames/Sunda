package v8;

import com.bumptech.glide.load.data.p;
import n8.u;
import n8.v;
import u8.j0;
import u8.k0;
import u8.l0;
import u8.m0;
import u8.t0;
import u8.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a implements l0 {

    /* renamed from: b, reason: collision with root package name */
    public static final u f89169b = u.memory("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a, reason: collision with root package name */
    public final j0 f89170a;

    public a() {
        this(null);
    }

    public a(j0 j0Var) {
        this.f89170a = j0Var;
    }

    @Override // u8.l0
    public k0 buildLoadData(z zVar, int i10, int i11, v vVar) {
        j0 j0Var = this.f89170a;
        if (j0Var != null) {
            z zVar2 = (z) j0Var.get(zVar, 0, 0);
            if (zVar2 == null) {
                j0Var.put(zVar, 0, 0, zVar);
            } else {
                zVar = zVar2;
            }
        }
        return new k0(zVar, new p(zVar, ((Integer) vVar.get(f89169b)).intValue()));
    }

    @Override // u8.l0
    public boolean handles(z zVar) {
        return true;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: v8.a$a, reason: collision with other inner class name */
    public static class C0800a implements m0 {

        /* renamed from: a, reason: collision with root package name */
        public final j0 f89171a = new j0(500);

        @Override // u8.m0
        public l0 build(t0 t0Var) {
            return new a(this.f89171a);
        }

        @Override // u8.m0
        public void teardown() {
        }
    }
}
