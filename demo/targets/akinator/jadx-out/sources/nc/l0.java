package nc;

import java.io.IOException;
import oc.s0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class l0 extends s0 {

    /* renamed from: f, reason: collision with root package name */
    public final jc.o f75939f;

    /* renamed from: g, reason: collision with root package name */
    public final String f75940g;

    public l0(jc.o oVar, String str) {
        super(oVar);
        this.f75939f = oVar;
        this.f75940g = str;
    }

    @Override // jc.q
    public Object deserialize(ub.u uVar, jc.k kVar) throws IOException {
        Object embeddedObject;
        ub.z zVarCurrentToken = uVar.currentToken();
        ub.z zVar = ub.z.VALUE_EMBEDDED_OBJECT;
        jc.o oVar = this.f75939f;
        if (zVarCurrentToken == zVar && ((embeddedObject = uVar.getEmbeddedObject()) == null || oVar.getRawClass().isAssignableFrom(embeddedObject.getClass()))) {
            return embeddedObject;
        }
        kVar.reportBadDefinition(oVar, this.f75940g);
        return null;
    }
}
