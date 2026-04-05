package bd;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class k0 extends a {

    /* renamed from: g, reason: collision with root package name */
    public static final jc.o f9093g = s0.a(Boolean.TYPE);

    public k0() {
        super(boolean[].class);
    }

    @Override // bd.a
    public jc.w _withResolved(jc.g gVar, Boolean bool) {
        return new k0(this, gVar, bool);
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
        return f9093g;
    }

    @Override // bd.z0, vc.c
    @Deprecated
    public jc.t getSchema(jc.u0 u0Var, Type type) {
        yc.v vVarA = z0.a("array");
        vVarA.set("items", z0.a("boolean"));
        return vVarA;
    }

    @Override // zc.i
    public boolean hasSingleElement(boolean[] zArr) {
        return zArr.length == 1;
    }

    @Override // jc.w
    public boolean isEmpty(jc.u0 u0Var, boolean[] zArr) {
        return zArr.length == 0;
    }

    @Override // bd.a, bd.z0, jc.w
    public final void serialize(boolean[] zArr, ub.o oVar, jc.u0 u0Var) throws IOException {
        int length = zArr.length;
        if (length == 1 && e(u0Var)) {
            serializeContents(zArr, oVar, u0Var);
            return;
        }
        oVar.writeStartArray(zArr, length);
        serializeContents(zArr, oVar, u0Var);
        oVar.writeEndArray();
    }

    @Override // bd.a
    public void serializeContents(boolean[] zArr, ub.o oVar, jc.u0 u0Var) throws IOException {
        for (boolean z10 : zArr) {
            oVar.writeBoolean(z10);
        }
    }

    @Override // zc.i
    public zc.i _withValueTypeSerializer(wc.j jVar) {
        return this;
    }
}
