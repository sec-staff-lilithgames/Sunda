package yc;

import com.ironsource.C3191e4;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class l extends jc.u {

    /* renamed from: b, reason: collision with root package name */
    public final b f94323b;

    /* renamed from: c, reason: collision with root package name */
    public u0 f94324c;

    public l(b bVar) {
        this.f94323b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ub.o oVar, k kVar, Iterator it) throws IOException {
        jc.t tVar;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (next instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) next;
                    oVar.writeFieldName((String) entry.getKey());
                    tVar = (jc.t) entry.getValue();
                } else {
                    tVar = (jc.t) next;
                }
                if (tVar instanceof v) {
                    kVar.push(it);
                    it = tVar.properties().iterator();
                    oVar.writeStartObject(tVar, tVar.size());
                } else if (tVar instanceof a) {
                    kVar.push(it);
                    it = tVar.elements();
                    oVar.writeStartArray(tVar, tVar.size());
                } else if (tVar instanceof w) {
                    try {
                        tVar.serialize(oVar, this.f94324c);
                    } catch (IOException | RuntimeException e10) {
                        oVar.writeString(e3.g.l("[ERROR: (", e10.getClass().getName(), ") ", e10.getMessage(), C3191e4.i.f36531e));
                    }
                } else {
                    tVar.serialize(oVar, this.f94324c);
                }
            } else {
                if (oVar.getOutputContext().inArray()) {
                    oVar.writeEndArray();
                } else {
                    oVar.writeEndObject();
                }
                it = kVar.popOrNull();
                if (it == null) {
                    return;
                }
            }
        }
    }

    @Override // jc.u, jc.v
    public void serialize(ub.o oVar, u0 u0Var) throws IOException {
        this.f94324c = u0Var;
        b bVar = this.f94323b;
        if (bVar instanceof v) {
            oVar.writeStartObject(this, bVar.size());
            a(oVar, new k(), bVar.properties().iterator());
        } else if (!(bVar instanceof a)) {
            bVar.serialize(oVar, u0Var);
        } else {
            oVar.writeStartArray(this, bVar.size());
            a(oVar, new k(), bVar.elements());
        }
    }

    @Override // jc.u, jc.v
    public void serializeWithType(ub.o oVar, u0 u0Var, wc.j jVar) throws IOException {
        serialize(oVar, u0Var);
    }
}
