package ad;

import bd.j0;
import bd.z0;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import jc.t0;
import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a0 extends j0 {

    /* renamed from: f, reason: collision with root package name */
    public static final a0 f4251f = new a0(Collection.class);

    @Override // bd.j0
    public jc.w _withResolved(jc.g gVar, Boolean bool) {
        return new a0(this, bool);
    }

    @Override // bd.j0
    public final yc.v e() {
        return z0.a("string");
    }

    public final void f(Collection collection, ub.o oVar, u0 u0Var) throws IOException {
        int i10 = 0;
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str == null) {
                    u0Var.defaultSerializeNull(oVar);
                } else {
                    oVar.writeString(str);
                }
                i10++;
            }
        } catch (Exception e10) {
            wrapAndThrow(u0Var, e10, collection, i10);
        }
    }

    @Override // bd.z0, jc.w
    public void serialize(Collection<String> collection, ub.o oVar, u0 u0Var) throws IOException {
        Boolean bool;
        int size = collection.size();
        if (size == 1 && (((bool = this.f9091e) == null && u0Var.isEnabled(t0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || bool == Boolean.TRUE)) {
            f(collection, oVar, u0Var);
            return;
        }
        oVar.writeStartArray(collection, size);
        f(collection, oVar, u0Var);
        oVar.writeEndArray();
    }

    @Override // bd.j0, jc.w
    public void serializeWithType(Collection<String> collection, ub.o oVar, u0 u0Var, wc.j jVar) throws IOException {
        hc.c cVarWriteTypePrefix = jVar.writeTypePrefix(oVar, jVar.typeId(collection, ub.z.START_ARRAY));
        oVar.assignCurrentValue(collection);
        f(collection, oVar, u0Var);
        jVar.writeTypeSuffix(oVar, cVarWriteTypePrefix);
    }
}
