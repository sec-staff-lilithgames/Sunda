package oc;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class q0 extends c1 {

    /* renamed from: f, reason: collision with root package name */
    public final jc.q f78940f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
    }

    @Deprecated
    public q0() {
        this(null);
    }

    public static jc.q construct(jc.k kVar) throws jc.r {
        return kVar == null ? new q0() : new q0(kVar.findNonContextualValueDeserializer(kVar.constructType(a.class)));
    }

    public q0(jc.q qVar) {
        super(StackTraceElement.class);
        this.f78940f = qVar;
    }

    @Override // jc.q
    public StackTraceElement deserialize(ub.u uVar, jc.k kVar) throws IOException {
        ub.z zVarCurrentToken = uVar.currentToken();
        if (zVarCurrentToken == ub.z.START_OBJECT || zVarCurrentToken == ub.z.FIELD_NAME) {
            jc.q qVar = this.f78940f;
            (qVar == null ? (a) kVar.readValue(uVar, a.class) : (a) qVar.deserialize(uVar, kVar)).getClass();
            return new StackTraceElement("", "", "", -1);
        }
        if (zVarCurrentToken != ub.z.START_ARRAY || !kVar.isEnabled(jc.l.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            return (StackTraceElement) kVar.handleUnexpectedToken(this.f78945b, uVar);
        }
        uVar.nextToken();
        StackTraceElement stackTraceElementDeserialize = deserialize(uVar, kVar);
        if (uVar.nextToken() != ub.z.END_ARRAY) {
            T(kVar);
        }
        return stackTraceElementDeserialize;
    }
}
