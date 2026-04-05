package n6;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.work.b f75805a;

    public x(androidx.work.b bVar) {
        this.f75805a = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        return this.f75805a.equals(((x) obj).f75805a);
    }

    @Override // n6.a0
    public androidx.work.b getOutputData() {
        return this.f75805a;
    }

    public int hashCode() {
        return this.f75805a.hashCode() + (x.class.getName().hashCode() * 31);
    }

    public String toString() {
        return "Failure {mOutputData=" + this.f75805a + AbstractJsonLexerKt.END_OBJ;
    }

    public x() {
        this(androidx.work.b.f7481c);
    }
}
