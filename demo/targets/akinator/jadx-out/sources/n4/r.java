package n4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import o4.j;
import tu.a0;
import tu.x0;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r extends bv.n implements kv.q {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ m4.h f75629i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ o4.j f75630j;

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        a0.throwOnFailure(obj);
        m4.h hVar = this.f75629i;
        o4.j jVar = this.f75630j;
        Set<j.a> setKeySet = jVar.asMap().keySet();
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((j.a) it.next()).getName());
        }
        Map<String, Object> all = hVar.getAll();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : all.entrySet()) {
            if (!arrayList.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        o4.d mutablePreferences = jVar.toMutablePreferences();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Boolean) {
                mutablePreferences.set(o4.n.booleanKey(str), value);
            } else if (value instanceof Float) {
                mutablePreferences.set(o4.n.floatKey(str), value);
            } else if (value instanceof Integer) {
                mutablePreferences.set(o4.n.intKey(str), value);
            } else if (value instanceof Long) {
                mutablePreferences.set(o4.n.longKey(str), value);
            } else if (value instanceof String) {
                mutablePreferences.set(o4.n.stringKey(str), value);
            } else if (value instanceof Set) {
                j.a aVarStringSetKey = o4.n.stringSetKey(str);
                e0.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                mutablePreferences.set(aVarStringSetKey, (Set) value);
            }
        }
        return mutablePreferences.toPreferences();
    }

    @Override // kv.q
    public final Object invoke(m4.h hVar, o4.j jVar, zu.d<? super o4.j> dVar) {
        r rVar = new r(3, dVar);
        rVar.f75629i = hVar;
        rVar.f75630j = jVar;
        return rVar.invokeSuspend(x0.f87415a);
    }
}
