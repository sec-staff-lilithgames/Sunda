package nc;

import java.io.IOException;
import oc.s0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class k extends s0 {

    /* renamed from: f, reason: collision with root package name */
    public final String f75933f;

    public k(String str) {
        this(Object.class, str);
    }

    @Override // jc.q
    public Object deserialize(ub.u uVar, jc.k kVar) throws IOException {
        kVar.reportInputMismatch(this, this.f75933f, new Object[0]);
        return null;
    }

    public k(Class<?> cls, String str) {
        super(cls);
        this.f75933f = str;
    }
}
