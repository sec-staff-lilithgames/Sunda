package bd;

import java.io.IOException;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class t0 extends z0 implements zc.j, zc.q {

    /* renamed from: e, reason: collision with root package name */
    public final dd.m f9125e;

    /* renamed from: f, reason: collision with root package name */
    public final jc.o f9126f;

    /* renamed from: g, reason: collision with root package name */
    public final jc.w f9127g;

    public t0(dd.m mVar) {
        super(Object.class);
        this.f9125e = mVar;
        this.f9126f = null;
        this.f9127g = null;
    }

    @Override // bd.z0, jc.w, uc.e
    public void acceptJsonFormatVisitor(uc.h hVar, jc.o oVar) throws jc.r {
        jc.w wVar = this.f9127g;
        if (wVar != null) {
            wVar.acceptJsonFormatVisitor(hVar, oVar);
        }
    }

    @Override // zc.j
    public jc.w createContextual(jc.u0 u0Var, jc.g gVar) throws jc.r {
        jc.w wVarHandleSecondaryContextualization;
        jc.o outputType;
        dd.m mVar = this.f9125e;
        jc.w wVar = this.f9127g;
        jc.o oVar = this.f9126f;
        if (wVar == null) {
            outputType = oVar == null ? ((nc.o) mVar).getOutputType(u0Var.getTypeFactory()) : oVar;
            wVarHandleSecondaryContextualization = !outputType.isJavaLangObject() ? u0Var.findValueSerializer(outputType) : wVar;
        } else {
            wVarHandleSecondaryContextualization = wVar;
            outputType = oVar;
        }
        if (wVarHandleSecondaryContextualization instanceof zc.j) {
            wVarHandleSecondaryContextualization = u0Var.handleSecondaryContextualization(wVarHandleSecondaryContextualization, gVar);
        }
        if (wVarHandleSecondaryContextualization == wVar && outputType == oVar) {
            return this;
        }
        dd.i.verifyMustOverride(t0.class, this, "withDelegate");
        return new t0(mVar, outputType, wVarHandleSecondaryContextualization);
    }

    @Override // jc.w
    public jc.w getDelegatee() {
        return this.f9127g;
    }

    @Override // bd.z0, vc.c
    @Deprecated
    public jc.t getSchema(jc.u0 u0Var, Type type) throws jc.r {
        uc.e eVar = this.f9127g;
        return eVar instanceof vc.c ? ((vc.c) eVar).getSchema(u0Var, type) : super.getSchema(u0Var, type);
    }

    @Override // jc.w
    public boolean isEmpty(jc.u0 u0Var, Object obj) {
        Object objConvert = ((nc.o) this.f9125e).convert(u0Var, obj);
        if (objConvert == null) {
            return true;
        }
        jc.w wVar = this.f9127g;
        return wVar == null ? obj == null : wVar.isEmpty(u0Var, objConvert);
    }

    @Override // zc.q
    public void resolve(jc.u0 u0Var) throws jc.r {
        uc.e eVar = this.f9127g;
        if (eVar == null || !(eVar instanceof zc.q)) {
            return;
        }
        ((zc.q) eVar).resolve(u0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bd.z0, jc.w
    public void serialize(Object obj, ub.o oVar, jc.u0 u0Var) throws IOException {
        Object objConvert = ((nc.o) this.f9125e).convert(u0Var, obj);
        if (objConvert == null) {
            u0Var.defaultSerializeNull(oVar);
            return;
        }
        jc.w wVar = this.f9127g;
        jc.w wVarCreateContextual = wVar;
        if (wVar == null) {
            jc.w wVarFindValueSerializer = u0Var.findValueSerializer(objConvert.getClass());
            boolean z10 = wVarFindValueSerializer instanceof zc.j;
            wVarCreateContextual = wVarFindValueSerializer;
            if (z10) {
                wVarCreateContextual = ((zc.j) wVarFindValueSerializer).createContextual(u0Var, null);
            }
        }
        wVarCreateContextual.serialize(objConvert, oVar, u0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jc.w
    public void serializeWithType(Object obj, ub.o oVar, jc.u0 u0Var, wc.j jVar) throws IOException {
        Object objConvert = ((nc.o) this.f9125e).convert(u0Var, obj);
        if (objConvert == null) {
            u0Var.defaultSerializeNull(oVar);
            return;
        }
        jc.w wVar = this.f9127g;
        jc.w wVarCreateContextual = wVar;
        if (wVar == null) {
            jc.w wVarFindValueSerializer = u0Var.findValueSerializer(objConvert.getClass());
            boolean z10 = wVarFindValueSerializer instanceof zc.j;
            wVarCreateContextual = wVarFindValueSerializer;
            if (z10) {
                wVarCreateContextual = ((zc.j) wVarFindValueSerializer).createContextual(u0Var, null);
            }
        }
        wVarCreateContextual.serializeWithType(objConvert, oVar, u0Var, jVar);
    }

    public <T> t0(Class<T> cls, dd.m mVar) {
        super(cls, 0);
        this.f9125e = mVar;
        this.f9126f = null;
        this.f9127g = null;
    }

    @Override // bd.z0, vc.c
    @Deprecated
    public jc.t getSchema(jc.u0 u0Var, Type type, boolean z10) throws jc.r {
        uc.e eVar = this.f9127g;
        if (eVar instanceof vc.c) {
            return ((vc.c) eVar).getSchema(u0Var, type, z10);
        }
        return super.getSchema(u0Var, type);
    }

    public t0(dd.m mVar, jc.o oVar, jc.w wVar) {
        super(oVar);
        this.f9125e = mVar;
        this.f9126f = oVar;
        this.f9127g = wVar;
    }
}
