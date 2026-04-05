package bd;

import java.io.IOException;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class j extends b {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f9090l;

    public j(jc.o oVar, boolean z10, wc.j jVar, jc.w wVar) {
        super(Collection.class, oVar, z10, jVar, wVar);
        this.f9090l = oVar.isEnumType() || oVar.isJavaLangObject();
    }

    @Override // zc.i
    public zc.i _withValueTypeSerializer(wc.j jVar) {
        return new j(this, this.f9055f, jVar, this.f9059j, this.f9057h);
    }

    public void serializeContentsUsing(Collection<?> collection, ub.o oVar, jc.u0 u0Var, jc.w wVar) throws IOException {
        Iterator<?> it = collection.iterator();
        if (it.hasNext()) {
            wc.j jVar = (this.f9090l && (collection instanceof EnumSet)) ? null : this.f9058i;
            int i10 = 0;
            do {
                Object next = it.next();
                if (next == null) {
                    try {
                        u0Var.defaultSerializeNull(oVar);
                    } catch (Exception e10) {
                        wrapAndThrow(u0Var, e10, collection, i10);
                    }
                } else if (jVar == null) {
                    wVar.serialize(next, oVar, u0Var);
                } else {
                    wVar.serializeWithType(next, oVar, u0Var, jVar);
                }
                i10++;
            } while (it.hasNext());
        }
    }

    @Override // zc.i
    public boolean hasSingleElement(Collection<?> collection) {
        return collection.size() == 1;
    }

    @Override // jc.w
    public boolean isEmpty(jc.u0 u0Var, Collection<?> collection) {
        return collection.isEmpty();
    }

    @Override // bd.b, bd.z0, jc.w
    public final void serialize(Collection<?> collection, ub.o oVar, jc.u0 u0Var) throws IOException {
        Boolean bool;
        int size = collection.size();
        if (size == 1 && (((bool = this.f9057h) == null && u0Var.isEnabled(jc.t0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || bool == Boolean.TRUE)) {
            serializeContents(collection, oVar, u0Var);
            return;
        }
        oVar.writeStartArray(collection, size);
        serializeContents(collection, oVar, u0Var);
        oVar.writeEndArray();
    }

    @Override // bd.b
    public void serializeContents(Collection<?> collection, ub.o oVar, jc.u0 u0Var) throws IOException {
        jc.o oVar2 = this.f9054e;
        oVar.assignCurrentValue(collection);
        jc.w wVar = this.f9059j;
        if (wVar != null) {
            serializeContentsUsing(collection, oVar, u0Var, wVar);
            return;
        }
        Iterator<?> it = collection.iterator();
        if (it.hasNext()) {
            ad.t tVar = this.f9060k;
            wc.j jVar = (this.f9090l && (collection instanceof EnumSet)) ? null : this.f9058i;
            int i10 = 0;
            do {
                try {
                    Object next = it.next();
                    if (next == null) {
                        u0Var.defaultSerializeNull(oVar);
                    } else {
                        Class<?> cls = next.getClass();
                        jc.w wVarSerializerFor = tVar.serializerFor(cls);
                        if (wVarSerializerFor == null) {
                            wVarSerializerFor = oVar2.hasGenericTypes() ? f(tVar, u0Var.constructSpecializedType(oVar2, cls), u0Var) : e(tVar, cls, u0Var);
                            tVar = this.f9060k;
                        }
                        if (jVar == null) {
                            wVarSerializerFor.serialize(next, oVar, u0Var);
                        } else {
                            wVarSerializerFor.serializeWithType(next, oVar, u0Var, jVar);
                        }
                    }
                    i10++;
                } catch (Exception e10) {
                    wrapAndThrow(u0Var, e10, collection, i10);
                    return;
                }
            } while (it.hasNext());
        }
    }

    @Override // bd.b
    public j withResolved(jc.g gVar, wc.j jVar, jc.w wVar, Boolean bool) {
        return new j(this, gVar, jVar, wVar, bool);
    }

    public j(j jVar, jc.g gVar, wc.j jVar2, jc.w wVar, Boolean bool) {
        super(jVar, gVar, jVar2, wVar, bool);
        this.f9090l = jVar.f9090l;
    }
}
