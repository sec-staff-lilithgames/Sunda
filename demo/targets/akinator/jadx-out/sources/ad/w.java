package ad;

import java.io.Serializable;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class w extends y implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final w f4307c = new w(Collections.EMPTY_SET);

    /* renamed from: b, reason: collision with root package name */
    public final Set f4308b;

    public w(Set<String> set) {
        this.f4308b = set;
    }

    @Override // ad.y
    public final boolean a(zc.d dVar) {
        return this.f4308b.contains(dVar.getName());
    }

    @Override // ad.y
    public final boolean b(zc.p pVar) {
        return this.f4308b.contains(pVar.getName());
    }
}
