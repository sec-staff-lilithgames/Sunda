package rc;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k extends g0 {

    /* renamed from: d, reason: collision with root package name */
    public final cd.s f84212d;

    /* renamed from: e, reason: collision with root package name */
    public final e0 f84213e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f84214f;

    public k(jc.c cVar, cd.s sVar, e0 e0Var, boolean z10) {
        super(cVar);
        this.f84212d = sVar;
        this.f84213e = cVar == null ? null : e0Var;
        this.f84214f = z10;
    }

    public static List<i> collectFields(jc.c cVar, g1 g1Var, e0 e0Var, cd.s sVar, jc.o oVar, boolean z10) {
        Map mapE = new k(cVar, sVar, e0Var, z10).e(g1Var, oVar);
        if (mapE == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(mapE.size());
        Iterator it = mapE.values().iterator();
        while (it.hasNext()) {
            arrayList.add(((j) it.next()).build());
        }
        return arrayList;
    }

    public final Map e(g1 g1Var, jc.o oVar) {
        e0 e0Var;
        Class<?> clsFindMixInClassFor;
        j jVar;
        jc.o superClass = oVar.getSuperClass();
        if (superClass == null) {
            return null;
        }
        Class<?> rawClass = oVar.getRawClass();
        Map mapE = e(new f1(this.f84212d, superClass.getBindings()), superClass);
        for (Field field : rawClass.getDeclaredFields()) {
            if (field.isEnumConstant() || (!field.isSynthetic() && !Modifier.isStatic(field.getModifiers()))) {
                if (mapE == null) {
                    mapE = new LinkedHashMap();
                }
                j jVar2 = new j(g1Var, field);
                if (this.f84214f) {
                    jVar2.f84209c = a(jVar2.f84209c, field.getDeclaredAnnotations());
                }
                mapE.put(field.getName(), jVar2);
            }
        }
        if (mapE != null && (e0Var = this.f84213e) != null && (clsFindMixInClassFor = e0Var.findMixInClassFor(rawClass)) != null) {
            Iterator<Class<?>> it = dd.i.findSuperClasses(clsFindMixInClassFor, rawClass, true).iterator();
            while (it.hasNext()) {
                for (Field field2 : it.next().getDeclaredFields()) {
                    if ((field2.isEnumConstant() || (!field2.isSynthetic() && !Modifier.isStatic(field2.getModifiers()))) && (jVar = (j) mapE.get(field2.getName())) != null) {
                        jVar.f84209c = a(jVar.f84209c, field2.getDeclaredAnnotations());
                    }
                }
            }
        }
        return mapE;
    }
}
