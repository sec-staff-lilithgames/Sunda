package xc;

import java.io.IOException;
import tb.v0;
import ub.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class v extends wc.j {

    /* renamed from: a, reason: collision with root package name */
    public final wc.h f91939a;

    /* renamed from: b, reason: collision with root package name */
    public final jc.g f91940b;

    public v(wc.h hVar, jc.g gVar) {
        this.f91939a = hVar;
        this.f91940b = gVar;
    }

    @Override // wc.j
    public String getPropertyName() {
        return null;
    }

    @Override // wc.j
    public wc.h getTypeIdResolver() {
        return this.f91939a;
    }

    @Override // wc.j
    public abstract v0 getTypeInclusion();

    @Override // wc.j
    public hc.c writeTypePrefix(ub.o oVar, hc.c cVar) throws IOException {
        if (cVar.f58729c == null) {
            Object obj = cVar.f58727a;
            Class<?> cls = cVar.f58728b;
            wc.h hVar = this.f91939a;
            cVar.f58729c = cls == null ? hVar.idFromValue(obj) : hVar.idFromValueAndType(obj, cls);
        }
        if (cVar.f58729c != null) {
            return oVar.writeTypePrefix(cVar);
        }
        z zVar = cVar.f58732f;
        cVar.f58733g = false;
        if (zVar == z.START_OBJECT) {
            oVar.writeStartObject(cVar.f58727a);
            return cVar;
        }
        if (zVar == z.START_ARRAY) {
            oVar.writeStartArray(cVar.f58727a);
        }
        return cVar;
    }

    @Override // wc.j
    public hc.c writeTypeSuffix(ub.o oVar, hc.c cVar) throws IOException {
        if (cVar != null) {
            return oVar.writeTypeSuffix(cVar);
        }
        z zVar = cVar.f58732f;
        if (zVar == z.START_OBJECT) {
            oVar.writeEndObject();
            return cVar;
        }
        if (zVar == z.START_ARRAY) {
            oVar.writeEndArray();
        }
        return cVar;
    }
}
