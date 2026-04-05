package bd;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class q0 extends r0 {

    /* renamed from: g, reason: collision with root package name */
    public static final jc.o f9106g = s0.a(Short.TYPE);

    public q0(q0 q0Var, jc.g gVar, Boolean bool) {
        super(q0Var, gVar, bool);
    }

    @Override // bd.a
    public jc.w _withResolved(jc.g gVar, Boolean bool) {
        return new q0(this, gVar, bool);
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
        return f9106g;
    }

    @Override // bd.z0, vc.c
    @Deprecated
    public jc.t getSchema(jc.u0 u0Var, Type type) {
        return z0.a("array").set("items", z0.a("integer"));
    }

    public q0() {
        super(short[].class);
    }

    @Override // zc.i
    public boolean hasSingleElement(short[] sArr) {
        return sArr.length == 1;
    }

    @Override // jc.w
    public boolean isEmpty(jc.u0 u0Var, short[] sArr) {
        return sArr.length == 0;
    }

    @Override // bd.a, bd.z0, jc.w
    public final void serialize(short[] sArr, ub.o oVar, jc.u0 u0Var) throws IOException {
        int length = sArr.length;
        if (length == 1 && e(u0Var)) {
            serializeContents(sArr, oVar, u0Var);
            return;
        }
        oVar.writeStartArray(sArr, length);
        serializeContents(sArr, oVar, u0Var);
        oVar.writeEndArray();
    }

    @Override // bd.a
    public void serializeContents(short[] sArr, ub.o oVar, jc.u0 u0Var) throws IOException {
        for (short s10 : sArr) {
            oVar.writeNumber((int) s10);
        }
    }
}
