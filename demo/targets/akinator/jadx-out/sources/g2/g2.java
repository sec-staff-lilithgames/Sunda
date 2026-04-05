package g2;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g2 extends f2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f56759a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(String verbatim) {
        super(null);
        kotlin.jvm.internal.e0.checkNotNullParameter(verbatim, "verbatim");
        this.f56759a = verbatim;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g2) {
            return kotlin.jvm.internal.e0.areEqual(this.f56759a, ((g2) obj).f56759a);
        }
        return false;
    }

    public final String getVerbatim() {
        return this.f56759a;
    }

    public int hashCode() {
        return this.f56759a.hashCode();
    }

    public String toString() {
        return o2.q(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f56759a, ')');
    }
}
