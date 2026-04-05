package e1;

import a2.t3;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final k f53483a = k.f53479e;

    /* renamed from: b, reason: collision with root package name */
    public static final l f53484b = l.f53480e;

    public static final v composed(v vVar, kv.l inspectorInfo, kv.q factory) {
        e0.checkNotNullParameter(vVar, "<this>");
        e0.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        e0.checkNotNullParameter(factory, "factory");
        return vVar.then(new h(inspectorInfo, factory));
    }

    public static /* synthetic */ v composed$default(v vVar, kv.l lVar, kv.q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = t3.getNoInspectorInfo();
        }
        return composed(vVar, lVar, qVar);
    }

    public static final v materialize(p0.w wVar, v modifier) {
        e0.checkNotNullParameter(wVar, "<this>");
        e0.checkNotNullParameter(modifier, "modifier");
        if (modifier.all(m.f53481e)) {
            return modifier;
        }
        wVar.startReplaceableGroup(1219399079);
        v vVar = (v) modifier.foldIn(t.f53496b, new n(wVar));
        wVar.endReplaceableGroup();
        return vVar;
    }

    public static final v composed(v vVar, String fullyQualifiedName, Object obj, kv.l inspectorInfo, kv.q factory) {
        e0.checkNotNullParameter(vVar, "<this>");
        e0.checkNotNullParameter(fullyQualifiedName, "fullyQualifiedName");
        e0.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        e0.checkNotNullParameter(factory, "factory");
        return vVar.then(new p(fullyQualifiedName, obj, inspectorInfo, factory));
    }

    public static /* synthetic */ v composed$default(v vVar, String str, Object obj, kv.l lVar, kv.q qVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            lVar = t3.getNoInspectorInfo();
        }
        return composed(vVar, str, obj, lVar, qVar);
    }

    public static final v composed(v vVar, String fullyQualifiedName, Object obj, Object obj2, kv.l inspectorInfo, kv.q factory) {
        e0.checkNotNullParameter(vVar, "<this>");
        e0.checkNotNullParameter(fullyQualifiedName, "fullyQualifiedName");
        e0.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        e0.checkNotNullParameter(factory, "factory");
        return vVar.then(new q(fullyQualifiedName, obj, obj2, inspectorInfo, factory));
    }

    public static /* synthetic */ v composed$default(v vVar, String str, Object obj, Object obj2, kv.l lVar, kv.q qVar, int i10, Object obj3) {
        if ((i10 & 8) != 0) {
            lVar = t3.getNoInspectorInfo();
        }
        return composed(vVar, str, obj, obj2, lVar, qVar);
    }

    public static final v composed(v vVar, String fullyQualifiedName, Object obj, Object obj2, Object obj3, kv.l inspectorInfo, kv.q factory) {
        e0.checkNotNullParameter(vVar, "<this>");
        e0.checkNotNullParameter(fullyQualifiedName, "fullyQualifiedName");
        e0.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        e0.checkNotNullParameter(factory, "factory");
        return vVar.then(new r(fullyQualifiedName, obj, obj2, obj3, inspectorInfo, factory));
    }

    public static /* synthetic */ v composed$default(v vVar, String str, Object obj, Object obj2, Object obj3, kv.l lVar, kv.q qVar, int i10, Object obj4) {
        if ((i10 & 16) != 0) {
            lVar = t3.getNoInspectorInfo();
        }
        return composed(vVar, str, obj, obj2, obj3, lVar, qVar);
    }

    public static final v composed(v vVar, String fullyQualifiedName, Object[] keys, kv.l inspectorInfo, kv.q factory) {
        e0.checkNotNullParameter(vVar, "<this>");
        e0.checkNotNullParameter(fullyQualifiedName, "fullyQualifiedName");
        e0.checkNotNullParameter(keys, "keys");
        e0.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        e0.checkNotNullParameter(factory, "factory");
        return vVar.then(new s(fullyQualifiedName, keys, inspectorInfo, factory));
    }

    public static /* synthetic */ v composed$default(v vVar, String str, Object[] objArr, kv.l lVar, kv.q qVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            lVar = t3.getNoInspectorInfo();
        }
        return composed(vVar, str, objArr, lVar, qVar);
    }
}
