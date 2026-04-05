package bd;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class r extends b {
    public r(jc.o oVar, boolean z10, wc.j jVar) {
        super(Iterable.class, oVar, z10, jVar, (jc.w) null);
    }

    @Override // zc.i
    public zc.i _withValueTypeSerializer(wc.j jVar) {
        return new r(this, this.f9055f, jVar, this.f9059j, this.f9057h);
    }

    public r(r rVar, jc.g gVar, wc.j jVar, jc.w wVar, Boolean bool) {
        super(rVar, gVar, jVar, wVar, bool);
    }

    @Override // zc.i
    public boolean hasSingleElement(Iterable<?> iterable) {
        if (iterable == null) {
            return false;
        }
        Iterator<?> it = iterable.iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next();
        return !it.hasNext();
    }

    @Override // jc.w
    public boolean isEmpty(jc.u0 u0Var, Iterable<?> iterable) {
        return !iterable.iterator().hasNext();
    }

    @Override // bd.b, bd.z0, jc.w
    public final void serialize(Iterable<?> iterable, ub.o oVar, jc.u0 u0Var) throws IOException {
        Boolean bool = this.f9057h;
        if (((bool == null && u0Var.isEnabled(jc.t0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || bool == Boolean.TRUE) && hasSingleElement(iterable)) {
            serializeContents(iterable, oVar, u0Var);
            return;
        }
        oVar.writeStartArray(iterable);
        serializeContents(iterable, oVar, u0Var);
        oVar.writeEndArray();
    }

    @Override // bd.b
    public void serializeContents(Iterable<?> iterable, ub.o oVar, jc.u0 u0Var) throws IOException {
        jc.w wVar;
        Iterator<?> it = iterable.iterator();
        if (it.hasNext()) {
            Class<?> cls = null;
            jc.w wVarFindValueSerializer = null;
            do {
                Object next = it.next();
                if (next == null) {
                    u0Var.defaultSerializeNull(oVar);
                } else {
                    jc.w wVar2 = this.f9059j;
                    if (wVar2 == null) {
                        Class<?> cls2 = next.getClass();
                        if (cls2 != cls) {
                            wVarFindValueSerializer = u0Var.findValueSerializer(cls2, this.f9055f);
                            cls = cls2;
                        }
                        wVar = wVarFindValueSerializer;
                    } else {
                        wVar = wVarFindValueSerializer;
                        wVarFindValueSerializer = wVar2;
                    }
                    wc.j jVar = this.f9058i;
                    if (jVar == null) {
                        wVarFindValueSerializer.serialize(next, oVar, u0Var);
                    } else {
                        wVarFindValueSerializer.serializeWithType(next, oVar, u0Var, jVar);
                    }
                    wVarFindValueSerializer = wVar;
                }
            } while (it.hasNext());
        }
    }

    @Override // bd.b
    public r withResolved(jc.g gVar, wc.j jVar, jc.w wVar, Boolean bool) {
        return new r(this, gVar, jVar, wVar, bool);
    }
}
