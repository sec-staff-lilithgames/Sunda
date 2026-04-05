package sq;

import br.u;
import kotlin.jvm.internal.e0;
import tu.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f86113a = new c();

    public final a a(u algorithmParams) {
        e0.checkNotNullParameter(algorithmParams, "algorithmParams");
        int i10 = b.f86112a[algorithmParams.getType().ordinal()];
        if (i10 == 1) {
            return new e(algorithmParams);
        }
        if (i10 == 2) {
            return new d(algorithmParams);
        }
        if (i10 == 3) {
            return new f(algorithmParams);
        }
        throw new t();
    }
}
