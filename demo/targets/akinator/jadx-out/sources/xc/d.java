package xc;

import java.io.IOException;
import tb.v0;
import ub.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d extends v {

    /* renamed from: c, reason: collision with root package name */
    public static final d f91900c = new d(null, null);

    public static d instance() {
        return f91900c;
    }

    @Override // xc.v, wc.j
    public v0 getTypeInclusion() {
        return v0.f86791g;
    }

    @Override // xc.v, wc.j
    public hc.c writeTypePrefix(ub.o oVar, hc.c cVar) throws IOException {
        if (!cVar.f58732f.isStructStart()) {
            return null;
        }
        if (!oVar.canWriteTypeId()) {
            return oVar.writeTypePrefix(cVar);
        }
        cVar.f58733g = false;
        z zVar = cVar.f58732f;
        if (zVar == z.START_OBJECT) {
            oVar.writeStartObject(cVar.f58727a);
            return cVar;
        }
        if (zVar == z.START_ARRAY) {
            oVar.writeStartArray(cVar.f58727a);
        }
        return cVar;
    }

    @Override // xc.v, wc.j
    public hc.c writeTypeSuffix(ub.o oVar, hc.c cVar) throws IOException {
        if (cVar == null) {
            return null;
        }
        return oVar.writeTypeSuffix(cVar);
    }

    @Override // wc.j
    public d forProperty(jc.g gVar) {
        return this;
    }
}
