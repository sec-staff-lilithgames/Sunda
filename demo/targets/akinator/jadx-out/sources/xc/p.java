package xc;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import lc.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class p extends wc.f implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public LinkedHashSet f91915b;

    public static void a(rc.e eVar, wc.c cVar, z zVar, jc.c cVar2, HashMap map) {
        String strFindTypeName;
        if (!cVar.hasName() && (strFindTypeName = cVar2.findTypeName(eVar)) != null) {
            cVar = new wc.c(cVar.getType(), strFindTypeName);
        }
        wc.c cVar3 = new wc.c(cVar.getType());
        if (map.containsKey(cVar3)) {
            if (!cVar.hasName() || ((wc.c) map.get(cVar3)).hasName()) {
                return;
            }
            map.put(cVar3, cVar);
            return;
        }
        map.put(cVar3, cVar);
        List<wc.c> listFindSubtypes = cVar2.findSubtypes(eVar);
        if (listFindSubtypes == null || listFindSubtypes.isEmpty()) {
            return;
        }
        for (wc.c cVar4 : listFindSubtypes) {
            a(rc.f.resolveWithoutSuperTypes(zVar, cVar4.getType()), cVar4, zVar, cVar2, map);
        }
    }

    public static void b(rc.e eVar, wc.c cVar, z zVar, LinkedHashSet linkedHashSet, LinkedHashMap linkedHashMap) {
        List<wc.c> listFindSubtypes;
        String strFindTypeName;
        jc.c annotationIntrospector = zVar.getAnnotationIntrospector();
        if (!cVar.hasName() && (strFindTypeName = annotationIntrospector.findTypeName(eVar)) != null) {
            cVar = new wc.c(cVar.getType(), strFindTypeName);
        }
        if (cVar.hasName()) {
            linkedHashMap.put(cVar.getName(), cVar);
        }
        if (!linkedHashSet.add(cVar.getType()) || (listFindSubtypes = annotationIntrospector.findSubtypes(eVar)) == null || listFindSubtypes.isEmpty()) {
            return;
        }
        for (wc.c cVar2 : listFindSubtypes) {
            b(rc.f.resolveWithoutSuperTypes(zVar, cVar2.getType()), cVar2, zVar, linkedHashSet, linkedHashMap);
        }
    }

    public static ArrayList c(Class cls, LinkedHashSet linkedHashSet, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList(linkedHashMap.values());
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            linkedHashSet.remove(((wc.c) it.next()).getType());
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            Class cls2 = (Class) it2.next();
            if (cls2 != cls || !Modifier.isAbstract(cls2.getModifiers())) {
                arrayList.add(new wc.c(cls2));
            }
        }
        return arrayList;
    }

    @Override // wc.f
    public Collection<wc.c> collectAndResolveSubtypesByClass(z zVar, rc.l lVar, jc.o oVar) {
        Class<?> rawType;
        List<wc.c> listFindSubtypes;
        jc.c annotationIntrospector = zVar.getAnnotationIntrospector();
        if (oVar != null) {
            rawType = oVar.getRawClass();
        } else {
            if (lVar == null) {
                throw new IllegalArgumentException("Both property and base type are nulls");
            }
            rawType = lVar.getRawType();
        }
        HashMap map = new HashMap();
        LinkedHashSet linkedHashSet = this.f91915b;
        if (linkedHashSet != null) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                wc.c cVar = (wc.c) it.next();
                if (rawType.isAssignableFrom(cVar.getType())) {
                    a(rc.f.resolveWithoutSuperTypes(zVar, cVar.getType()), cVar, zVar, annotationIntrospector, map);
                }
            }
        }
        if (lVar != null && (listFindSubtypes = annotationIntrospector.findSubtypes(lVar)) != null) {
            for (wc.c cVar2 : listFindSubtypes) {
                a(rc.f.resolveWithoutSuperTypes(zVar, cVar2.getType()), cVar2, zVar, annotationIntrospector, map);
            }
        }
        a(rc.f.resolveWithoutSuperTypes(zVar, rawType), new wc.c(rawType, null), zVar, annotationIntrospector, map);
        return new ArrayList(map.values());
    }

    @Override // wc.f
    public Collection<wc.c> collectAndResolveSubtypesByTypeId(z zVar, rc.l lVar, jc.o oVar) {
        List<wc.c> listFindSubtypes;
        jc.c annotationIntrospector = zVar.getAnnotationIntrospector();
        Class<?> rawClass = oVar.getRawClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b(rc.f.resolveWithoutSuperTypes(zVar, rawClass), new wc.c(rawClass, null), zVar, linkedHashSet, linkedHashMap);
        if (lVar != null && (listFindSubtypes = annotationIntrospector.findSubtypes(lVar)) != null) {
            for (wc.c cVar : listFindSubtypes) {
                b(rc.f.resolveWithoutSuperTypes(zVar, cVar.getType()), cVar, zVar, linkedHashSet, linkedHashMap);
            }
        }
        LinkedHashSet linkedHashSet2 = this.f91915b;
        if (linkedHashSet2 != null) {
            Iterator it = linkedHashSet2.iterator();
            while (it.hasNext()) {
                wc.c cVar2 = (wc.c) it.next();
                if (rawClass.isAssignableFrom(cVar2.getType())) {
                    b(rc.f.resolveWithoutSuperTypes(zVar, cVar2.getType()), cVar2, zVar, linkedHashSet, linkedHashMap);
                }
            }
        }
        return c(rawClass, linkedHashSet, linkedHashMap);
    }

    @Override // wc.f
    public wc.f copy() {
        p pVar = new p();
        LinkedHashSet linkedHashSet = this.f91915b;
        pVar.f91915b = linkedHashSet == null ? null : new LinkedHashSet(linkedHashSet);
        return pVar;
    }

    @Override // wc.f
    public void registerSubtypes(wc.c... cVarArr) {
        if (this.f91915b == null) {
            this.f91915b = new LinkedHashSet();
        }
        for (wc.c cVar : cVarArr) {
            this.f91915b.add(cVar);
        }
    }

    @Override // wc.f
    public void registerSubtypes(Class<?>... clsArr) {
        wc.c[] cVarArr = new wc.c[clsArr.length];
        int length = clsArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            cVarArr[i10] = new wc.c(clsArr[i10]);
        }
        registerSubtypes(cVarArr);
    }

    @Override // wc.f
    public void registerSubtypes(Collection<Class<?>> collection) {
        wc.c[] cVarArr = new wc.c[collection.size()];
        Iterator<Class<?>> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            cVarArr[i10] = new wc.c(it.next());
            i10++;
        }
        registerSubtypes(cVarArr);
    }

    @Override // wc.f
    public Collection<wc.c> collectAndResolveSubtypesByTypeId(z zVar, rc.e eVar) {
        Class<?> rawType = eVar.getRawType();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b(eVar, new wc.c(rawType, null), zVar, linkedHashSet, linkedHashMap);
        LinkedHashSet linkedHashSet2 = this.f91915b;
        if (linkedHashSet2 != null) {
            Iterator it = linkedHashSet2.iterator();
            while (it.hasNext()) {
                wc.c cVar = (wc.c) it.next();
                if (rawType.isAssignableFrom(cVar.getType())) {
                    b(rc.f.resolveWithoutSuperTypes(zVar, cVar.getType()), cVar, zVar, linkedHashSet, linkedHashMap);
                }
            }
        }
        return c(rawType, linkedHashSet, linkedHashMap);
    }

    @Override // wc.f
    public Collection<wc.c> collectAndResolveSubtypesByClass(z zVar, rc.e eVar) {
        jc.c annotationIntrospector = zVar.getAnnotationIntrospector();
        HashMap map = new HashMap();
        if (this.f91915b != null) {
            Class<?> rawType = eVar.getRawType();
            Iterator it = this.f91915b.iterator();
            while (it.hasNext()) {
                wc.c cVar = (wc.c) it.next();
                if (rawType.isAssignableFrom(cVar.getType())) {
                    a(rc.f.resolveWithoutSuperTypes(zVar, cVar.getType()), cVar, zVar, annotationIntrospector, map);
                }
            }
        }
        a(eVar, new wc.c(eVar.getRawType(), null), zVar, annotationIntrospector, map);
        return new ArrayList(map.values());
    }
}
