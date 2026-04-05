package n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final k0.a f75168a;

    /* renamed from: b, reason: collision with root package name */
    public final k0.a f75169b;

    /* renamed from: c, reason: collision with root package name */
    public final k0.a f75170c;

    public r0() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ r0 copy$default(r0 r0Var, k0.a aVar, k0.a aVar2, k0.a aVar3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = r0Var.f75168a;
        }
        if ((i10 & 2) != 0) {
            aVar2 = r0Var.f75169b;
        }
        if ((i10 & 4) != 0) {
            aVar3 = r0Var.f75170c;
        }
        return r0Var.copy(aVar, aVar2, aVar3);
    }

    public final r0 copy(k0.a small, k0.a medium, k0.a large) {
        kotlin.jvm.internal.e0.checkNotNullParameter(small, "small");
        kotlin.jvm.internal.e0.checkNotNullParameter(medium, "medium");
        kotlin.jvm.internal.e0.checkNotNullParameter(large, "large");
        return new r0(small, medium, large);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f75168a, r0Var.f75168a) && kotlin.jvm.internal.e0.areEqual(this.f75169b, r0Var.f75169b) && kotlin.jvm.internal.e0.areEqual(this.f75170c, r0Var.f75170c);
    }

    public final k0.a getLarge() {
        return this.f75170c;
    }

    public final k0.a getMedium() {
        return this.f75169b;
    }

    public final k0.a getSmall() {
        return this.f75168a;
    }

    public int hashCode() {
        return this.f75170c.hashCode() + ((this.f75169b.hashCode() + (this.f75168a.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "Shapes(small=" + this.f75168a + ", medium=" + this.f75169b + ", large=" + this.f75170c + ')';
    }

    public r0(k0.a small, k0.a medium, k0.a large) {
        kotlin.jvm.internal.e0.checkNotNullParameter(small, "small");
        kotlin.jvm.internal.e0.checkNotNullParameter(medium, "medium");
        kotlin.jvm.internal.e0.checkNotNullParameter(large, "large");
        this.f75168a = small;
        this.f75169b = medium;
        this.f75170c = large;
    }

    public /* synthetic */ r0(k0.a aVar, k0.a aVar2, k0.a aVar3, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? k0.i.m5094RoundedCornerShape0680j_4(s2.i.m6817constructorimpl(4)) : aVar, (i10 & 2) != 0 ? k0.i.m5094RoundedCornerShape0680j_4(s2.i.m6817constructorimpl(4)) : aVar2, (i10 & 4) != 0 ? k0.i.m5094RoundedCornerShape0680j_4(s2.i.m6817constructorimpl(0)) : aVar3);
    }
}
