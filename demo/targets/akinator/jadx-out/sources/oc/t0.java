package oc;

import java.io.IOException;
import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t0 extends jc.x implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Class f78947b;

    /* renamed from: c, reason: collision with root package name */
    public final jc.q f78948c;

    public t0(Class cls, jc.q qVar) {
        this.f78947b = cls;
        this.f78948c = qVar;
    }

    @Override // jc.x
    public final Object deserializeKey(String str, jc.k kVar) throws IOException {
        Class<?> cls = this.f78947b;
        if (str == null) {
            return null;
        }
        dd.k0 k0VarBufferForInputBuffering = kVar.bufferForInputBuffering();
        k0VarBufferForInputBuffering.writeString(str);
        try {
            ub.u uVarAsParser = k0VarBufferForInputBuffering.asParser();
            uVarAsParser.nextToken();
            Object objDeserialize = this.f78948c.deserialize(uVarAsParser, kVar);
            return objDeserialize != null ? objDeserialize : kVar.handleWeirdKey(cls, str, "not a valid representation", new Object[0]);
        } catch (Exception e10) {
            return kVar.handleWeirdKey(cls, str, "not a valid representation: %s", e10.getMessage());
        }
    }

    public Class<?> getKeyClass() {
        return this.f78947b;
    }
}
