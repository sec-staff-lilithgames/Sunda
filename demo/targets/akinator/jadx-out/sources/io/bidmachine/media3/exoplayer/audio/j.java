package io.bidmachine.media3.exoplayer.audio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final j f60951d = new i().build();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f60952a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f60953b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f60954c;

    public j(i iVar) {
        this.f60952a = iVar.f60947a;
        this.f60953b = iVar.f60948b;
        this.f60954c = iVar.f60949c;
    }

    public i buildUpon() {
        return new i(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f60952a == jVar.f60952a && this.f60953b == jVar.f60953b && this.f60954c == jVar.f60954c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f60952a ? 1 : 0) << 2) + ((this.f60953b ? 1 : 0) << 1) + (this.f60954c ? 1 : 0);
    }
}
