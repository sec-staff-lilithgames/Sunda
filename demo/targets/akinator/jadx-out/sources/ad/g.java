package ad;

import java.io.IOException;
import java.util.List;
import jc.t0;
import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g extends bd.b {
    public g(jc.o oVar, boolean z10, wc.j jVar, jc.w wVar) {
        super(List.class, oVar, z10, jVar, wVar);
    }

    @Override // zc.i
    public zc.i _withValueTypeSerializer(wc.j jVar) {
        return new g(this, this.f9055f, jVar, this.f9059j, this.f9057h);
    }

    public void serializeContentsUsing(List<?> list, ub.o oVar, u0 u0Var, jc.w wVar) throws IOException {
        int size = list.size();
        if (size == 0) {
            return;
        }
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj == null) {
                try {
                    u0Var.defaultSerializeNull(oVar);
                } catch (Exception e10) {
                    wrapAndThrow(u0Var, e10, list, i10);
                }
            } else {
                wc.j jVar = this.f9058i;
                if (jVar == null) {
                    wVar.serialize(obj, oVar, u0Var);
                } else {
                    wVar.serializeWithType(obj, oVar, u0Var, jVar);
                }
            }
        }
    }

    public void serializeTypedContents(List<?> list, ub.o oVar, u0 u0Var) throws IOException {
        jc.o oVar2 = this.f9054e;
        int size = list.size();
        if (size == 0) {
            return;
        }
        int i10 = 0;
        try {
            wc.j jVar = this.f9058i;
            t tVar = this.f9060k;
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj == null) {
                    u0Var.defaultSerializeNull(oVar);
                } else {
                    Class<?> cls = obj.getClass();
                    jc.w wVarSerializerFor = tVar.serializerFor(cls);
                    if (wVarSerializerFor == null) {
                        wVarSerializerFor = oVar2.hasGenericTypes() ? f(tVar, u0Var.constructSpecializedType(oVar2, cls), u0Var) : e(tVar, cls, u0Var);
                        tVar = this.f9060k;
                    }
                    wVarSerializerFor.serializeWithType(obj, oVar, u0Var, jVar);
                }
                i10++;
            }
        } catch (Exception e10) {
            wrapAndThrow(u0Var, e10, list, i10);
        }
    }

    public g(g gVar, jc.g gVar2, wc.j jVar, jc.w wVar, Boolean bool) {
        super(gVar, gVar2, jVar, wVar, bool);
    }

    @Override // zc.i
    public boolean hasSingleElement(List<?> list) {
        return list.size() == 1;
    }

    @Override // jc.w
    public boolean isEmpty(u0 u0Var, List<?> list) {
        return list.isEmpty();
    }

    @Override // bd.b, bd.z0, jc.w
    public final void serialize(List<?> list, ub.o oVar, u0 u0Var) throws IOException {
        Boolean bool;
        int size = list.size();
        if (size == 1 && (((bool = this.f9057h) == null && u0Var.isEnabled(t0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || bool == Boolean.TRUE)) {
            serializeContents(list, oVar, u0Var);
            return;
        }
        oVar.writeStartArray(list, size);
        serializeContents(list, oVar, u0Var);
        oVar.writeEndArray();
    }

    @Override // bd.b
    public void serializeContents(List<?> list, ub.o oVar, u0 u0Var) throws IOException {
        jc.o oVar2 = this.f9054e;
        jc.w wVar = this.f9059j;
        if (wVar != null) {
            serializeContentsUsing(list, oVar, u0Var, wVar);
            return;
        }
        if (this.f9058i != null) {
            serializeTypedContents(list, oVar, u0Var);
            return;
        }
        int size = list.size();
        if (size == 0) {
            return;
        }
        int i10 = 0;
        try {
            t tVar = this.f9060k;
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj == null) {
                    u0Var.defaultSerializeNull(oVar);
                } else {
                    Class<?> cls = obj.getClass();
                    jc.w wVarSerializerFor = tVar.serializerFor(cls);
                    if (wVarSerializerFor == null) {
                        wVarSerializerFor = oVar2.hasGenericTypes() ? f(tVar, u0Var.constructSpecializedType(oVar2, cls), u0Var) : e(tVar, cls, u0Var);
                        tVar = this.f9060k;
                    }
                    wVarSerializerFor.serialize(obj, oVar, u0Var);
                }
                i10++;
            }
        } catch (Exception e10) {
            wrapAndThrow(u0Var, e10, list, i10);
        }
    }

    @Override // bd.b
    public g withResolved(jc.g gVar, wc.j jVar, jc.w wVar, Boolean bool) {
        return new g(this, gVar, jVar, wVar, bool);
    }
}
