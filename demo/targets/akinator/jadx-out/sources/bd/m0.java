package bd;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class m0 extends a {

    /* renamed from: g, reason: collision with root package name */
    public static final jc.o f9101g = s0.a(Double.TYPE);

    public m0() {
        super(double[].class);
    }

    @Override // bd.a
    public jc.w _withResolved(jc.g gVar, Boolean bool) {
        return new m0(this, gVar, bool);
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
        return f9101g;
    }

    @Override // bd.z0, vc.c
    @Deprecated
    public jc.t getSchema(jc.u0 u0Var, Type type) {
        return z0.a("array").set("items", z0.a("number"));
    }

    @Override // zc.i
    public boolean hasSingleElement(double[] dArr) {
        return dArr.length == 1;
    }

    @Override // jc.w
    public boolean isEmpty(jc.u0 u0Var, double[] dArr) {
        return dArr.length == 0;
    }

    @Override // bd.a, bd.z0, jc.w
    public final void serialize(double[] dArr, ub.o oVar, jc.u0 u0Var) throws IOException {
        if (dArr.length == 1 && e(u0Var)) {
            serializeContents(dArr, oVar, u0Var);
        } else {
            oVar.writeArray(dArr, 0, dArr.length);
        }
    }

    @Override // bd.a
    public void serializeContents(double[] dArr, ub.o oVar, jc.u0 u0Var) throws IOException {
        for (double d10 : dArr) {
            oVar.writeNumber(d10);
        }
    }

    @Override // zc.i
    public zc.i _withValueTypeSerializer(wc.j jVar) {
        return this;
    }
}
