package a1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import z.m1;
import z.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: a, reason: collision with root package name */
    public final kv.l f3407a;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f3408b;

    /* renamed from: c, reason: collision with root package name */
    public u0 f3409c;

    public j(Map<String, ? extends List<? extends Object>> map, kv.l lVar) {
        this.f3407a = lVar;
        this.f3408b = (map == null || map.isEmpty()) ? null : l.access$toMutableScatterMap(map);
    }

    @Override // a1.h
    public boolean canBeSaved(Object obj) {
        return ((Boolean) this.f3407a.invoke(obj)).booleanValue();
    }

    @Override // a1.h
    public Object consumeRestored(String str) {
        u0 u0Var = this.f3408b;
        List list = u0Var != null ? (List) u0Var.remove(str) : null;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && u0Var != null) {
        }
        return list.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
    @Override // a1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.util.List<java.lang.Object>> performSave() {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.j.performSave():java.util.Map");
    }

    @Override // a1.h
    public g registerProvider(String str, kv.a aVar) {
        if (l.access$fastIsBlank(str)) {
            throw new IllegalArgumentException("Registered key is empty or blank");
        }
        u0 u0VarMutableScatterMapOf = this.f3409c;
        if (u0VarMutableScatterMapOf == null) {
            u0VarMutableScatterMapOf = m1.mutableScatterMapOf();
            this.f3409c = u0VarMutableScatterMapOf;
        }
        Object arrayList = u0VarMutableScatterMapOf.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            u0VarMutableScatterMapOf.set(str, arrayList);
        }
        ((List) arrayList).add(aVar);
        return new i(u0VarMutableScatterMapOf, str, aVar);
    }
}
