package m2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b0 implements z0 {

    /* renamed from: b, reason: collision with root package name */
    public final char f73896b;

    public b0() {
        this((char) 0, 1, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            return this.f73896b == ((b0) obj).f73896b;
        }
        return false;
    }

    @Override // m2.z0
    public x0 filter(g2.b text) {
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
        return new x0(new g2.b(sv.k0.repeat(String.valueOf(this.f73896b), text.getText().length()), null, null, 6, null), y.f73998a.getIdentity());
    }

    public final char getMask() {
        return this.f73896b;
    }

    public int hashCode() {
        return Character.hashCode(this.f73896b);
    }

    public b0(char c10) {
        this.f73896b = c10;
    }

    public /* synthetic */ b0(char c10, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? (char) 8226 : c10);
    }
}
