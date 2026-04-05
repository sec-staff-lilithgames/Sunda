package u8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class r0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f88116a;

    /* renamed from: b, reason: collision with root package name */
    public final w3.f f88117b;

    public r0(List list, w3.f fVar) {
        this.f88116a = list;
        this.f88117b = fVar;
    }

    @Override // u8.l0
    public k0 buildLoadData(Object obj, int i10, int i11, n8.v vVar) {
        k0 k0VarBuildLoadData;
        List list = this.f88116a;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        n8.q qVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            l0 l0Var = (l0) list.get(i12);
            if (l0Var.handles(obj) && (k0VarBuildLoadData = l0Var.buildLoadData(obj, i10, i11, vVar)) != null) {
                qVar = k0VarBuildLoadData.f88089a;
                arrayList.add(k0VarBuildLoadData.f88091c);
            }
        }
        if (arrayList.isEmpty() || qVar == null) {
            return null;
        }
        return new k0(qVar, new q0(arrayList, this.f88117b));
    }

    @Override // u8.l0
    public boolean handles(Object obj) {
        Iterator it = this.f88116a.iterator();
        while (it.hasNext()) {
            if (((l0) it.next()).handles(obj)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f88116a.toArray()) + AbstractJsonLexerKt.END_OBJ;
    }
}
