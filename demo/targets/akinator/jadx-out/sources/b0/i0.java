package b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final e1.d f8381a;

    /* renamed from: b, reason: collision with root package name */
    public final kv.l f8382b;

    /* renamed from: c, reason: collision with root package name */
    public final c0.j0 f8383c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8384d;

    public i0(e1.d alignment, kv.l size, c0.j0 animationSpec, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(alignment, "alignment");
        kotlin.jvm.internal.e0.checkNotNullParameter(size, "size");
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        this.f8381a = alignment;
        this.f8382b = size;
        this.f8383c = animationSpec;
        this.f8384d = z10;
    }

    public static /* synthetic */ i0 copy$default(i0 i0Var, e1.d dVar, kv.l lVar, c0.j0 j0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = i0Var.f8381a;
        }
        if ((i10 & 2) != 0) {
            lVar = i0Var.f8382b;
        }
        if ((i10 & 4) != 0) {
            j0Var = i0Var.f8383c;
        }
        if ((i10 & 8) != 0) {
            z10 = i0Var.f8384d;
        }
        return i0Var.copy(dVar, lVar, j0Var, z10);
    }

    public final e1.d component1() {
        return this.f8381a;
    }

    public final kv.l component2() {
        return this.f8382b;
    }

    public final c0.j0 component3() {
        return this.f8383c;
    }

    public final boolean component4() {
        return this.f8384d;
    }

    public final i0 copy(e1.d alignment, kv.l size, c0.j0 animationSpec, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(alignment, "alignment");
        kotlin.jvm.internal.e0.checkNotNullParameter(size, "size");
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        return new i0(alignment, size, animationSpec, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f8381a, i0Var.f8381a) && kotlin.jvm.internal.e0.areEqual(this.f8382b, i0Var.f8382b) && kotlin.jvm.internal.e0.areEqual(this.f8383c, i0Var.f8383c) && this.f8384d == i0Var.f8384d;
    }

    public final e1.d getAlignment() {
        return this.f8381a;
    }

    public final c0.j0 getAnimationSpec() {
        return this.f8383c;
    }

    public final boolean getClip() {
        return this.f8384d;
    }

    public final kv.l getSize() {
        return this.f8382b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = (this.f8383c.hashCode() + ((this.f8382b.hashCode() + (this.f8381a.hashCode() * 31)) * 31)) * 31;
        boolean z10 = this.f8384d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return iHashCode + i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChangeSize(alignment=");
        sb2.append(this.f8381a);
        sb2.append(", size=");
        sb2.append(this.f8382b);
        sb2.append(", animationSpec=");
        sb2.append(this.f8383c);
        sb2.append(", clip=");
        return a.b.p(sb2, this.f8384d, ')');
    }

    public /* synthetic */ i0(e1.d dVar, kv.l lVar, c0.j0 j0Var, boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this(dVar, (i10 & 2) != 0 ? h0.f8378e : lVar, j0Var, (i10 & 8) != 0 ? true : z10);
    }
}
