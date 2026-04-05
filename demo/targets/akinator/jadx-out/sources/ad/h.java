package ad;

import bd.j0;
import bd.z0;
import java.io.IOException;
import java.util.List;
import jc.t0;
import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h extends j0 {

    /* renamed from: f, reason: collision with root package name */
    public static final h f4264f = new h(List.class);

    public h(h hVar, Boolean bool) {
        super(hVar, bool);
    }

    @Override // bd.j0
    public jc.w _withResolved(jc.g gVar, Boolean bool) {
        return new h(this, bool);
    }

    @Override // bd.j0
    public final yc.v e() {
        return z0.a("string");
    }

    public final void f(List list, ub.o oVar, u0 u0Var, int i10) throws IOException {
        for (int i11 = 0; i11 < i10; i11++) {
            try {
                String str = (String) list.get(i11);
                if (str == null) {
                    u0Var.defaultSerializeNull(oVar);
                } else {
                    oVar.writeString(str);
                }
            } catch (Exception e10) {
                wrapAndThrow(u0Var, e10, list, i11);
                return;
            }
        }
    }

    @Override // bd.z0, jc.w
    public void serialize(List<String> list, ub.o oVar, u0 u0Var) throws IOException {
        Boolean bool;
        int size = list.size();
        if (size == 1 && (((bool = this.f9091e) == null && u0Var.isEnabled(t0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || bool == Boolean.TRUE)) {
            f(list, oVar, u0Var, 1);
            return;
        }
        oVar.writeStartArray(list, size);
        f(list, oVar, u0Var, size);
        oVar.writeEndArray();
    }

    @Override // bd.j0
    public void serializeWithType(List<String> list, ub.o oVar, u0 u0Var, wc.j jVar) throws IOException {
        hc.c cVarWriteTypePrefix = jVar.writeTypePrefix(oVar, jVar.typeId(list, ub.z.START_ARRAY));
        oVar.assignCurrentValue(list);
        f(list, oVar, u0Var, list.size());
        jVar.writeTypeSuffix(oVar, cVarWriteTypePrefix);
    }
}
