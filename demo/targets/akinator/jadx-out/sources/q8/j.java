package q8;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j implements q {

    /* renamed from: a, reason: collision with root package name */
    public final k f82577a;

    /* renamed from: b, reason: collision with root package name */
    public int f82578b;

    /* renamed from: c, reason: collision with root package name */
    public Class f82579c;

    public j(k kVar) {
        this.f82577a = kVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f82578b == jVar.f82578b && this.f82579c == jVar.f82579c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f82578b * 31;
        Class cls = this.f82579c;
        return i10 + (cls != null ? cls.hashCode() : 0);
    }

    @Override // q8.q
    public void offer() {
        this.f82577a.offer(this);
    }

    public String toString() {
        return "Key{size=" + this.f82578b + "array=" + this.f82579c + AbstractJsonLexerKt.END_OBJ;
    }
}
