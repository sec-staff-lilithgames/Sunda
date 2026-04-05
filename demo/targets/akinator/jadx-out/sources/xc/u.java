package xc;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import jc.y;
import lc.z;
import tb.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u extends t implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final z f91935e;

    /* renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f91936f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f91937g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f91938h;

    public u(z zVar, jc.o oVar, ConcurrentHashMap concurrentHashMap, HashMap map) {
        super(oVar, zVar.getTypeFactory());
        this.f91935e = zVar;
        this.f91936f = concurrentHashMap;
        this.f91937g = map;
        this.f91938h = zVar.isEnabled(y.ACCEPT_CASE_INSENSITIVE_VALUES);
    }

    public static u construct(z zVar, jc.o oVar, Collection<wc.c> collection, boolean z10, boolean z11) {
        HashMap map;
        ConcurrentHashMap concurrentHashMap;
        String name;
        if (z10 == z11) {
            throw new IllegalArgumentException();
        }
        if (z10) {
            concurrentHashMap = new ConcurrentHashMap();
            map = null;
        } else {
            map = new HashMap();
            concurrentHashMap = new ConcurrentHashMap(4);
        }
        boolean zIsEnabled = zVar.isEnabled(y.ACCEPT_CASE_INSENSITIVE_VALUES);
        if (collection != null) {
            for (wc.c cVar : collection) {
                Class<?> type = cVar.getType();
                if (cVar.hasName()) {
                    name = cVar.getName();
                } else {
                    name = type.getName();
                    int iLastIndexOf = name.lastIndexOf(46);
                    if (iLastIndexOf >= 0) {
                        name = name.substring(iLastIndexOf + 1);
                    }
                }
                if (z10) {
                    concurrentHashMap.put(type.getName(), name);
                }
                if (z11) {
                    if (zIsEnabled) {
                        name = name.toLowerCase();
                    }
                    jc.o oVar2 = (jc.o) map.get(name);
                    if (oVar2 == null || !type.isAssignableFrom(oVar2.getRawClass())) {
                        map.put(name, zVar.constructType(type));
                    }
                }
            }
        }
        return new u(zVar, oVar, concurrentHashMap, map);
    }

    public final String b(Class cls) {
        if (cls == null) {
            return null;
        }
        Class clsA = t.a(cls);
        String name = clsA.getName();
        ConcurrentHashMap concurrentHashMap = this.f91936f;
        String strFindTypeName = (String) concurrentHashMap.get(name);
        if (strFindTypeName == null) {
            Class<?> rawClass = this.f91933b.constructType(clsA).getRawClass();
            z zVar = this.f91935e;
            if (zVar.isAnnotationProcessingEnabled()) {
                strFindTypeName = zVar.getAnnotationIntrospector().findTypeName(zVar.introspectClassAnnotations(rawClass).getClassInfo());
            }
            if (strFindTypeName == null) {
                String name2 = rawClass.getName();
                int iLastIndexOf = name2.lastIndexOf(46);
                if (iLastIndexOf >= 0) {
                    name2 = name2.substring(iLastIndexOf + 1);
                }
                strFindTypeName = name2;
            }
            concurrentHashMap.put(name, strFindTypeName);
        }
        return strFindTypeName;
    }

    @Override // xc.t, wc.h
    public String getDescForKnownTypeIds() {
        TreeSet treeSet = new TreeSet();
        for (Map.Entry entry : this.f91937g.entrySet()) {
            if (((jc.o) entry.getValue()).isConcrete()) {
                treeSet.add(entry.getKey());
            }
        }
        return treeSet.toString();
    }

    @Override // xc.t, wc.h
    public w0 getMechanism() {
        return w0.f86796g;
    }

    @Override // xc.t, wc.h
    public String idFromValue(Object obj) {
        return b(obj.getClass());
    }

    @Override // xc.t, wc.h
    public String idFromValueAndType(Object obj, Class<?> cls) {
        return obj == null ? b(cls) : idFromValue(obj);
    }

    public String toString() {
        return String.format("[%s; id-to-type=%s]", u.class.getName(), this.f91937g);
    }

    @Override // xc.t, wc.h
    public jc.o typeFromId(jc.h hVar, String str) {
        if (this.f91938h) {
            str = str.toLowerCase();
        }
        return (jc.o) this.f91937g.get(str);
    }
}
