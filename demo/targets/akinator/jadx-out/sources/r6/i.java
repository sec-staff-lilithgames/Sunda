package r6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f83822a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f83823b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f83824c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f83825d;

    public i(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f83822a = z10;
        this.f83823b = z11;
        this.f83824c = z12;
        this.f83825d = z13;
    }

    public static /* synthetic */ i copy$default(i iVar, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = iVar.f83822a;
        }
        if ((i10 & 2) != 0) {
            z11 = iVar.f83823b;
        }
        if ((i10 & 4) != 0) {
            z12 = iVar.f83824c;
        }
        if ((i10 & 8) != 0) {
            z13 = iVar.f83825d;
        }
        return iVar.copy(z10, z11, z12, z13);
    }

    public final boolean component1() {
        return this.f83822a;
    }

    public final boolean component2() {
        return this.f83823b;
    }

    public final boolean component3() {
        return this.f83824c;
    }

    public final boolean component4() {
        return this.f83825d;
    }

    public final i copy(boolean z10, boolean z11, boolean z12, boolean z13) {
        return new i(z10, z11, z12, z13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f83822a == iVar.f83822a && this.f83823b == iVar.f83823b && this.f83824c == iVar.f83824c && this.f83825d == iVar.f83825d;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f83825d) + com.google.android.gms.internal.play_billing.a.c(com.google.android.gms.internal.play_billing.a.c(Boolean.hashCode(this.f83822a) * 31, 31, this.f83823b), 31, this.f83824c);
    }

    public final boolean isConnected() {
        return this.f83822a;
    }

    public final boolean isMetered() {
        return this.f83824c;
    }

    public final boolean isNotRoaming() {
        return this.f83825d;
    }

    public final boolean isValidated() {
        return this.f83823b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkState(isConnected=");
        sb2.append(this.f83822a);
        sb2.append(", isValidated=");
        sb2.append(this.f83823b);
        sb2.append(", isMetered=");
        sb2.append(this.f83824c);
        sb2.append(", isNotRoaming=");
        return a.b.p(sb2, this.f83825d, ')');
    }
}
