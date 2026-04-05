package o6;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface w {
    static w create() {
        return v.f77975a.create();
    }

    boolean contains(v6.s sVar);

    List<u> remove(String str);

    default u remove(v6.b0 spec) {
        kotlin.jvm.internal.e0.checkNotNullParameter(spec, "spec");
        return remove(v6.n0.generationalId(spec));
    }

    u remove(v6.s sVar);

    default u tokenFor(v6.b0 spec) {
        kotlin.jvm.internal.e0.checkNotNullParameter(spec, "spec");
        return tokenFor(v6.n0.generationalId(spec));
    }

    u tokenFor(v6.s sVar);

    static w create(boolean z10) {
        return v.f77975a.create(z10);
    }
}
