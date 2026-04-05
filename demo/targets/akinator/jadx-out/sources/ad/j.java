package ad;

import bd.z0;
import com.ironsource.C3191e4;
import java.io.IOException;
import java.util.Map;
import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j extends z0 {
    public static j create(u0 u0Var, jc.o oVar) {
        return new j(oVar);
    }

    @Override // bd.z0, jc.w
    public void serialize(Map.Entry<?, ?> entry, ub.o oVar, u0 u0Var) throws IOException {
        oVar.writeStartObject(entry);
        u0Var.defaultSerializeField(C3191e4.h.W, entry.getKey(), oVar);
        u0Var.defaultSerializeField("value", entry.getValue(), oVar);
        oVar.writeEndObject();
    }
}
