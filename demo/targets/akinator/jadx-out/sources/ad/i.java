package ad;

import java.io.IOException;
import java.util.Iterator;
import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class i extends bd.b {
    public i(jc.o oVar, boolean z10, wc.j jVar) {
        super(Iterator.class, oVar, z10, jVar, (jc.w) null);
    }

    @Override // zc.i
    public zc.i _withValueTypeSerializer(wc.j jVar) {
        return new i(this, this.f9055f, jVar, this.f9059j, this.f9057h);
    }

    public i(i iVar, jc.g gVar, wc.j jVar, jc.w wVar, Boolean bool) {
        super(iVar, gVar, jVar, wVar, bool);
    }

    @Override // zc.i
    public boolean hasSingleElement(Iterator<?> it) {
        return false;
    }

    @Override // jc.w
    public boolean isEmpty(u0 u0Var, Iterator<?> it) {
        return !it.hasNext();
    }

    @Override // bd.b, bd.z0, jc.w
    public final void serialize(Iterator<?> it, ub.o oVar, u0 u0Var) throws IOException {
        oVar.writeStartArray(it);
        serializeContents(it, oVar, u0Var);
        oVar.writeEndArray();
    }

    @Override // bd.b
    public void serializeContents(Iterator<?> it, ub.o oVar, u0 u0Var) throws IOException {
        if (it.hasNext()) {
            wc.j jVar = this.f9058i;
            jc.w wVar = this.f9059j;
            if (wVar != null) {
                do {
                    Object next = it.next();
                    if (next == null) {
                        u0Var.defaultSerializeNull(oVar);
                    } else if (jVar == null) {
                        wVar.serialize(next, oVar, u0Var);
                    } else {
                        wVar.serializeWithType(next, oVar, u0Var, jVar);
                    }
                } while (it.hasNext());
                return;
            }
            t tVar = this.f9060k;
            do {
                Object next2 = it.next();
                if (next2 == null) {
                    u0Var.defaultSerializeNull(oVar);
                } else {
                    Class<?> cls = next2.getClass();
                    jc.w wVarSerializerFor = tVar.serializerFor(cls);
                    if (wVarSerializerFor == null) {
                        jc.o oVar2 = this.f9054e;
                        wVarSerializerFor = oVar2.hasGenericTypes() ? f(tVar, u0Var.constructSpecializedType(oVar2, cls), u0Var) : e(tVar, cls, u0Var);
                        tVar = this.f9060k;
                    }
                    if (jVar == null) {
                        wVarSerializerFor.serialize(next2, oVar, u0Var);
                    } else {
                        wVarSerializerFor.serializeWithType(next2, oVar, u0Var, jVar);
                    }
                }
            } while (it.hasNext());
        }
    }

    @Override // bd.b
    public i withResolved(jc.g gVar, wc.j jVar, jc.w wVar, Boolean bool) {
        return new i(this, gVar, jVar, wVar, bool);
    }
}
