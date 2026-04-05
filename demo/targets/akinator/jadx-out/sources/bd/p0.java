package bd;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class p0 extends r0 {

    /* renamed from: g, reason: collision with root package name */
    public static final jc.o f9105g = s0.a(Long.TYPE);

    public p0(p0 p0Var, jc.g gVar, Boolean bool) {
        super(p0Var, gVar, bool);
    }

    @Override // bd.a
    public jc.w _withResolved(jc.g gVar, Boolean bool) {
        return new p0(this, gVar, bool);
    }

    @Override // bd.z0, jc.w, uc.e
    public void acceptJsonFormatVisitor(uc.h hVar, jc.o oVar) throws jc.r {
        HashMap map = uc.d.f88404b;
        hVar.expectArrayFormat(oVar);
    }

    @Override // zc.i
    public jc.w getContentSerializer() {
        return null;
    }

    @Override // zc.i
    public jc.o getContentType() {
        return f9105g;
    }

    @Override // bd.z0, vc.c
    @Deprecated
    public jc.t getSchema(jc.u0 u0Var, Type type) {
        return z0.a("array").set("items", z0.a("number"));
    }

    public p0() {
        super(long[].class);
    }

    @Override // zc.i
    public boolean hasSingleElement(long[] jArr) {
        return jArr.length == 1;
    }

    @Override // jc.w
    public boolean isEmpty(jc.u0 u0Var, long[] jArr) {
        return jArr.length == 0;
    }

    @Override // bd.a, bd.z0, jc.w
    public final void serialize(long[] jArr, ub.o oVar, jc.u0 u0Var) throws IOException {
        if (jArr.length == 1 && e(u0Var)) {
            serializeContents(jArr, oVar, u0Var);
        } else {
            oVar.writeArray(jArr, 0, jArr.length);
        }
    }

    @Override // bd.a
    public void serializeContents(long[] jArr, ub.o oVar, jc.u0 u0Var) throws IOException {
        for (long j10 : jArr) {
            oVar.writeNumber(j10);
        }
    }
}
