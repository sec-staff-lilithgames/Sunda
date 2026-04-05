package bd;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class n0 extends r0 {

    /* renamed from: g, reason: collision with root package name */
    public static final jc.o f9102g = s0.a(Float.TYPE);

    public n0(n0 n0Var, jc.g gVar, Boolean bool) {
        super(n0Var, gVar, bool);
    }

    @Override // bd.a
    public jc.w _withResolved(jc.g gVar, Boolean bool) {
        return new n0(this, gVar, bool);
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
        return f9102g;
    }

    @Override // bd.z0, vc.c
    @Deprecated
    public jc.t getSchema(jc.u0 u0Var, Type type) {
        return z0.a("array").set("items", z0.a("number"));
    }

    public n0() {
        super(float[].class);
    }

    @Override // zc.i
    public boolean hasSingleElement(float[] fArr) {
        return fArr.length == 1;
    }

    @Override // jc.w
    public boolean isEmpty(jc.u0 u0Var, float[] fArr) {
        return fArr.length == 0;
    }

    @Override // bd.a, bd.z0, jc.w
    public final void serialize(float[] fArr, ub.o oVar, jc.u0 u0Var) throws IOException {
        int length = fArr.length;
        if (length == 1 && e(u0Var)) {
            serializeContents(fArr, oVar, u0Var);
            return;
        }
        oVar.writeStartArray(fArr, length);
        serializeContents(fArr, oVar, u0Var);
        oVar.writeEndArray();
    }

    @Override // bd.a
    public void serializeContents(float[] fArr, ub.o oVar, jc.u0 u0Var) throws IOException {
        for (float f10 : fArr) {
            oVar.writeNumber(f10);
        }
    }
}
