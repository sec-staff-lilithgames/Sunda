package dd;

import java.io.Serializable;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Set f52098b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f52099c;

    public q(Set set, Set set2) {
        this.f52098b = set == null ? Collections.EMPTY_SET : set;
        this.f52099c = set2;
    }

    public static q construct(Set<String> set, Set<String> set2) {
        return new q(set, set2);
    }

    public boolean shouldIgnore(Object obj) {
        Set set = this.f52099c;
        return !(set == null || set.contains(obj)) || this.f52098b.contains(obj);
    }
}
