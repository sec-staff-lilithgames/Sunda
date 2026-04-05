package bd;

import java.io.IOException;
import java.util.EnumSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class n extends b {
    public n(jc.o oVar) {
        super(EnumSet.class, oVar, true, (wc.j) null, (jc.w) null);
    }

    public n(n nVar, jc.g gVar, wc.j jVar, jc.w wVar, Boolean bool) {
        super(nVar, gVar, jVar, wVar, bool);
    }

    @Override // zc.i
    public n _withValueTypeSerializer(wc.j jVar) {
        return this;
    }

    @Override // zc.i
    public boolean hasSingleElement(EnumSet<? extends Enum<?>> enumSet) {
        return enumSet.size() == 1;
    }

    @Override // jc.w
    public boolean isEmpty(jc.u0 u0Var, EnumSet<? extends Enum<?>> enumSet) {
        return enumSet.isEmpty();
    }

    @Override // bd.b, bd.z0, jc.w
    public void serialize(EnumSet<? extends Enum<?>> enumSet, ub.o oVar, jc.u0 u0Var) throws IOException {
        Boolean bool;
        int size = enumSet.size();
        if (size == 1 && (((bool = this.f9057h) == null && u0Var.isEnabled(jc.t0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || bool == Boolean.TRUE)) {
            serializeContents(enumSet, oVar, u0Var);
            return;
        }
        oVar.writeStartArray(enumSet, size);
        serializeContents(enumSet, oVar, u0Var);
        oVar.writeEndArray();
    }

    @Override // bd.b
    public void serializeContents(EnumSet<? extends Enum<?>> enumSet, ub.o oVar, jc.u0 u0Var) throws IOException {
        oVar.assignCurrentValue(enumSet);
        Iterator<? extends Enum<?>> it = enumSet.iterator();
        jc.w wVarFindContentValueSerializer = this.f9059j;
        while (it.hasNext()) {
            Enum<?> next = it.next();
            if (wVarFindContentValueSerializer == null) {
                wVarFindContentValueSerializer = u0Var.findContentValueSerializer(next.getDeclaringClass(), this.f9055f);
            }
            wVarFindContentValueSerializer.serialize(next, oVar, u0Var);
        }
    }

    @Override // bd.b
    public n withResolved(jc.g gVar, wc.j jVar, jc.w wVar, Boolean bool) {
        return new n(this, gVar, jVar, wVar, bool);
    }
}
