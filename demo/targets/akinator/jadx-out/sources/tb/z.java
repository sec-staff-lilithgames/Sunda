package tb;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z implements a, Serializable {

    /* renamed from: h, reason: collision with root package name */
    public static final z f86807h = new z(Collections.EMPTY_SET, false, false, false, true);

    /* renamed from: b, reason: collision with root package name */
    public final Set f86808b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f86809c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f86810e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f86811f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f86812g;

    public z(Set set, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (set == null) {
            this.f86808b = Collections.EMPTY_SET;
        } else {
            this.f86808b = set;
        }
        this.f86809c = z10;
        this.f86810e = z11;
        this.f86811f = z12;
        this.f86812g = z13;
    }

    public static Set a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(strArr.length);
        for (String str : strArr) {
            hashSet.add(str);
        }
        return hashSet;
    }

    public static boolean b(z zVar, z zVar2) {
        return zVar.f86809c == zVar2.f86809c && zVar.f86812g == zVar2.f86812g && zVar.f86810e == zVar2.f86810e && zVar.f86811f == zVar2.f86811f && zVar.f86808b.equals(zVar2.f86808b);
    }

    public static z construct(Set<String> set, boolean z10, boolean z11, boolean z12, boolean z13) {
        z zVar = f86807h;
        return (z10 == zVar.f86809c && z11 == zVar.f86810e && z12 == zVar.f86811f && z13 == zVar.f86812g && (set == null || set.size() == 0)) ? zVar : new z(set, z10, z11, z12, z13);
    }

    public static z empty() {
        return f86807h;
    }

    public static z forIgnoreUnknown(boolean z10) {
        z zVar = f86807h;
        return z10 ? zVar.withIgnoreUnknown() : zVar.withoutIgnoreUnknown();
    }

    public static z forIgnoredProperties(Set<String> set) {
        return f86807h.withIgnored(set);
    }

    public static z from(a0 a0Var) {
        return a0Var == null ? f86807h : construct(a(a0Var.value()), a0Var.ignoreUnknown(), a0Var.allowGetters(), a0Var.allowSetters(), false);
    }

    public static z merge(z zVar, z zVar2) {
        return zVar == null ? zVar2 : zVar.withOverrides(zVar2);
    }

    public static z mergeAll(z... zVarArr) {
        z zVar = null;
        for (z zVarWithOverrides : zVarArr) {
            if (zVarWithOverrides != null) {
                if (zVar != null) {
                    zVarWithOverrides = zVar.withOverrides(zVarWithOverrides);
                }
                zVar = zVarWithOverrides;
            }
        }
        return zVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass() == z.class && b(this, (z) obj);
    }

    public Set<String> findIgnoredForDeserialization() {
        return this.f86811f ? Collections.EMPTY_SET : this.f86808b;
    }

    public Set<String> findIgnoredForSerialization() {
        return this.f86810e ? Collections.EMPTY_SET : this.f86808b;
    }

    public boolean getAllowGetters() {
        return this.f86810e;
    }

    public boolean getAllowSetters() {
        return this.f86811f;
    }

    public boolean getIgnoreUnknown() {
        return this.f86809c;
    }

    public Set<String> getIgnored() {
        return this.f86808b;
    }

    public boolean getMerge() {
        return this.f86812g;
    }

    public int hashCode() {
        return this.f86808b.size() + (this.f86809c ? 1 : -3) + (this.f86810e ? 3 : -7) + (this.f86811f ? 7 : -11) + (this.f86812g ? 11 : -13);
    }

    public String toString() {
        return String.format("JsonIgnoreProperties.Value(ignored=%s,ignoreUnknown=%s,allowGetters=%s,allowSetters=%s,merge=%s)", this.f86808b, Boolean.valueOf(this.f86809c), Boolean.valueOf(this.f86810e), Boolean.valueOf(this.f86811f), Boolean.valueOf(this.f86812g));
    }

    @Override // tb.a
    public Class<a0> valueFor() {
        return a0.class;
    }

    public z withAllowGetters() {
        if (this.f86810e) {
            return this;
        }
        return construct(this.f86808b, this.f86809c, true, this.f86811f, this.f86812g);
    }

    public z withAllowSetters() {
        if (this.f86811f) {
            return this;
        }
        return construct(this.f86808b, this.f86809c, this.f86810e, true, this.f86812g);
    }

    public z withIgnoreUnknown() {
        if (this.f86809c) {
            return this;
        }
        return construct(this.f86808b, true, this.f86810e, this.f86811f, this.f86812g);
    }

    public z withIgnored(Set<String> set) {
        return construct(set, this.f86809c, this.f86810e, this.f86811f, this.f86812g);
    }

    public z withMerge() {
        if (this.f86812g) {
            return this;
        }
        return construct(this.f86808b, this.f86809c, this.f86810e, this.f86811f, true);
    }

    public z withOverrides(z zVar) {
        if (zVar != null && zVar != f86807h) {
            if (!zVar.f86812g) {
                return zVar;
            }
            if (!b(this, zVar)) {
                Set set = zVar.f86808b;
                Set set2 = this.f86808b;
                if (!set2.isEmpty()) {
                    if (set.isEmpty()) {
                        set = set2;
                    } else {
                        HashSet hashSet = new HashSet(set.size() + set2.size());
                        hashSet.addAll(set2);
                        hashSet.addAll(set);
                        set = hashSet;
                    }
                }
                return construct(set, this.f86809c || zVar.f86809c, this.f86810e || zVar.f86810e, this.f86811f || zVar.f86811f, true);
            }
        }
        return this;
    }

    public z withoutAllowGetters() {
        if (!this.f86810e) {
            return this;
        }
        return construct(this.f86808b, this.f86809c, false, this.f86811f, this.f86812g);
    }

    public z withoutAllowSetters() {
        if (!this.f86811f) {
            return this;
        }
        return construct(this.f86808b, this.f86809c, this.f86810e, false, this.f86812g);
    }

    public z withoutIgnoreUnknown() {
        if (!this.f86809c) {
            return this;
        }
        return construct(this.f86808b, false, this.f86810e, this.f86811f, this.f86812g);
    }

    public z withoutIgnored() {
        return construct(null, this.f86809c, this.f86810e, this.f86811f, this.f86812g);
    }

    public z withoutMerge() {
        if (!this.f86812g) {
            return this;
        }
        return construct(this.f86808b, this.f86809c, this.f86810e, this.f86811f, false);
    }

    public static z forIgnoredProperties(String... strArr) {
        int length = strArr.length;
        z zVar = f86807h;
        return length == 0 ? zVar : zVar.withIgnored(a(strArr));
    }

    public z withIgnored(String... strArr) {
        return construct(a(strArr), this.f86809c, this.f86810e, this.f86811f, this.f86812g);
    }
}
