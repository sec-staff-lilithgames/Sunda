package o6;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x implements w {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f77980a = new LinkedHashMap();

    @Override // o6.w
    public boolean contains(v6.s id2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        return this.f77980a.containsKey(id2);
    }

    @Override // o6.w
    public /* bridge */ /* synthetic */ u remove(v6.b0 b0Var) {
        return super.remove(b0Var);
    }

    @Override // o6.w
    public /* bridge */ /* synthetic */ u tokenFor(v6.b0 b0Var) {
        return super.tokenFor(b0Var);
    }

    @Override // o6.w
    public u remove(v6.s id2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        return (u) this.f77980a.remove(id2);
    }

    @Override // o6.w
    public u tokenFor(v6.s id2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        LinkedHashMap linkedHashMap = this.f77980a;
        Object uVar = linkedHashMap.get(id2);
        if (uVar == null) {
            uVar = new u(id2);
            linkedHashMap.put(id2, uVar);
        }
        return (u) uVar;
    }

    @Override // o6.w
    public List<u> remove(String workSpecId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workSpecId, "workSpecId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.f77980a;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (kotlin.jvm.internal.e0.areEqual(((v6.s) entry.getKey()).getWorkSpecId(), workSpecId)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.remove((v6.s) it.next());
        }
        return uu.y0.toList(linkedHashMap.values());
    }
}
