package ad;

import java.io.Serializable;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class x extends y implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final x f4309c = new x(Collections.EMPTY_SET);

    /* renamed from: b, reason: collision with root package name */
    public final Set f4310b;

    public x(Set<String> set) {
        this.f4310b = set;
    }

    @Override // ad.y
    public final boolean a(zc.d dVar) {
        return !this.f4310b.contains(dVar.getName());
    }

    @Override // ad.y
    public final boolean b(zc.p pVar) {
        return !this.f4310b.contains(pVar.getName());
    }
}
