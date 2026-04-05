package x8;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class r0 implements n8.x {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f91865a;

    /* renamed from: b, reason: collision with root package name */
    public final q8.b f91866b;

    public r0(a0 a0Var, q8.b bVar) {
        this.f91865a = a0Var;
        this.f91866b = bVar;
    }

    @Override // n8.x
    public p8.v0 decode(InputStream inputStream, int i10, int i11, n8.v vVar) throws IOException {
        boolean z10;
        o0 o0Var;
        if (inputStream instanceof o0) {
            o0Var = (o0) inputStream;
            z10 = false;
        } else {
            z10 = true;
            o0Var = new o0(inputStream, this.f91866b);
        }
        j9.e eVarObtain = j9.e.obtain(o0Var);
        try {
            p8.v0 v0VarDecode = this.f91865a.decode(new j9.o(eVarObtain), i10, i11, vVar, new q0(o0Var, eVarObtain));
            eVarObtain.release();
            if (z10) {
                o0Var.release();
            }
            return v0VarDecode;
        } finally {
        }
    }

    @Override // n8.x
    public boolean handles(InputStream inputStream, n8.v vVar) {
        return this.f91865a.handles(inputStream);
    }
}
