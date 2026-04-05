package wc;

import java.util.Collection;
import jc.o;
import lc.z;
import rc.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class f {
    @Deprecated
    public Collection<c> collectAndResolveSubtypes(l lVar, z zVar, jc.c cVar, o oVar) {
        return collectAndResolveSubtypesByClass(zVar, lVar, oVar);
    }

    public Collection<c> collectAndResolveSubtypesByClass(z zVar, l lVar, o oVar) {
        return collectAndResolveSubtypes(lVar, zVar, zVar.getAnnotationIntrospector(), oVar);
    }

    public Collection<c> collectAndResolveSubtypesByTypeId(z zVar, l lVar, o oVar) {
        return collectAndResolveSubtypes(lVar, zVar, zVar.getAnnotationIntrospector(), oVar);
    }

    public abstract void registerSubtypes(Collection<Class<?>> collection);

    public abstract void registerSubtypes(Class<?>... clsArr);

    public abstract void registerSubtypes(c... cVarArr);

    @Deprecated
    public Collection<c> collectAndResolveSubtypes(rc.e eVar, z zVar, jc.c cVar) {
        return collectAndResolveSubtypesByClass(zVar, eVar);
    }

    public Collection<c> collectAndResolveSubtypesByClass(z zVar, rc.e eVar) {
        return collectAndResolveSubtypes(eVar, zVar, zVar.getAnnotationIntrospector());
    }

    public Collection<c> collectAndResolveSubtypesByTypeId(z zVar, rc.e eVar) {
        return collectAndResolveSubtypes(eVar, zVar, zVar.getAnnotationIntrospector());
    }

    public f copy() {
        return this;
    }
}
