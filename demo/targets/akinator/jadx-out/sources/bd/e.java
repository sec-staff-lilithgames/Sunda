package bd;

import java.io.IOException;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e extends y0 implements zc.j {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9071e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends y0 implements zc.j {

        /* renamed from: e, reason: collision with root package name */
        public final boolean f9072e;

        public a(boolean z10) {
            super(z10 ? Boolean.TYPE : Boolean.class);
            this.f9072e = z10;
        }

        @Override // bd.y0, bd.z0, jc.w, uc.e
        public void acceptJsonFormatVisitor(uc.h hVar, jc.o oVar) throws jc.r {
            hVar.expectIntegerFormat(oVar);
        }

        @Override // zc.j
        public jc.w createContextual(jc.u0 u0Var, jc.g gVar) throws jc.r {
            tb.t tVarC = z0.c(Boolean.class, u0Var, gVar);
            return (tVarC == null || tVarC.getShape().isNumeric()) ? this : new e(this.f9072e);
        }

        @Override // bd.z0, jc.w
        public void serialize(Object obj, ub.o oVar, jc.u0 u0Var) throws IOException {
            oVar.writeNumber(!Boolean.FALSE.equals(obj) ? 1 : 0);
        }

        @Override // bd.y0, jc.w
        public final void serializeWithType(Object obj, ub.o oVar, jc.u0 u0Var, wc.j jVar) throws IOException {
            oVar.writeBoolean(Boolean.TRUE.equals(obj));
        }
    }

    public e(boolean z10) {
        super(z10 ? Boolean.TYPE : Boolean.class);
        this.f9071e = z10;
    }

    @Override // bd.y0, bd.z0, jc.w, uc.e
    public void acceptJsonFormatVisitor(uc.h hVar, jc.o oVar) throws jc.r {
        hVar.expectBooleanFormat(oVar);
    }

    @Override // zc.j
    public jc.w createContextual(jc.u0 u0Var, jc.g gVar) throws jc.r {
        tb.t tVarC = z0.c(handledType(), u0Var, gVar);
        if (tVarC != null) {
            tb.s shape = tVarC.getShape();
            if (shape.isNumeric()) {
                return new a(this.f9071e);
            }
            if (shape == tb.s.f86771g) {
                return new d1(this.f9159b);
            }
        }
        return this;
    }

    @Override // bd.y0, bd.z0, vc.c
    @Deprecated
    public jc.t getSchema(jc.u0 u0Var, Type type) {
        yc.v vVarA = z0.a("boolean");
        if (this.f9071e) {
            vVarA.put("required", true);
        }
        return vVarA;
    }

    @Override // bd.z0, jc.w
    public void serialize(Object obj, ub.o oVar, jc.u0 u0Var) throws IOException {
        oVar.writeBoolean(Boolean.TRUE.equals(obj));
    }

    @Override // bd.y0, jc.w
    public final void serializeWithType(Object obj, ub.o oVar, jc.u0 u0Var, wc.j jVar) throws IOException {
        oVar.writeBoolean(Boolean.TRUE.equals(obj));
    }
}
