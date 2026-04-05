package tb;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f0 implements a, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f86711c = new f0(null);

    /* renamed from: b, reason: collision with root package name */
    public final Set f86712b;

    public f0(Set set) {
        this.f86712b = set;
    }

    public static f0 all() {
        return f86711c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.HashSet] */
    public static f0 from(g0 g0Var) {
        ?? hashSet;
        if (g0Var == null) {
            return f86711c;
        }
        String[] strArrValue = g0Var.value();
        if (strArrValue == null || strArrValue.length == 0) {
            hashSet = Collections.EMPTY_SET;
        } else {
            hashSet = new HashSet(strArrValue.length);
            for (String str : strArrValue) {
                hashSet.add(str);
            }
        }
        return new f0(hashSet);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == f0.class) {
            Set set = ((f0) obj).f86712b;
            Set set2 = this.f86712b;
            if (set2 == null ? set == null : set2.equals(set)) {
                return true;
            }
        }
        return false;
    }

    public Set<String> getIncluded() {
        return this.f86712b;
    }

    public int hashCode() {
        Set set = this.f86712b;
        if (set == null) {
            return 0;
        }
        return set.size();
    }

    public String toString() {
        return String.format("JsonIncludeProperties.Value(included=%s)", this.f86712b);
    }

    @Override // tb.a
    public Class<g0> valueFor() {
        return g0.class;
    }

    public f0 withOverrides(f0 f0Var) {
        Set<String> included;
        if (f0Var == null || (included = f0Var.getIncluded()) == null) {
            return this;
        }
        Set set = this.f86712b;
        if (set == null) {
            return f0Var;
        }
        HashSet hashSet = new HashSet();
        for (String str : included) {
            if (set.contains(str)) {
                hashSet.add(str);
            }
        }
        return new f0(hashSet);
    }
}
