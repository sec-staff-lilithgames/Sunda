package n6;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.work.b f75815a;

    public z(androidx.work.b bVar) {
        this.f75815a = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        return this.f75815a.equals(((z) obj).f75815a);
    }

    @Override // n6.a0
    public androidx.work.b getOutputData() {
        return this.f75815a;
    }

    public int hashCode() {
        return this.f75815a.hashCode() + (z.class.getName().hashCode() * 31);
    }

    public String toString() {
        return "Success {mOutputData=" + this.f75815a + AbstractJsonLexerKt.END_OBJ;
    }

    public z() {
        this(androidx.work.b.f7481c);
    }
}
