package j9;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public Class f69197a;

    /* renamed from: b, reason: collision with root package name */
    public Class f69198b;

    /* renamed from: c, reason: collision with root package name */
    public Class f69199c;

    public p() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return this.f69197a.equals(pVar.f69197a) && this.f69198b.equals(pVar.f69198b) && s.bothNullOrEqual(this.f69199c, pVar.f69199c);
    }

    public int hashCode() {
        int iHashCode = (this.f69198b.hashCode() + (this.f69197a.hashCode() * 31)) * 31;
        Class cls = this.f69199c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public void set(Class<?> cls, Class<?> cls2) {
        set(cls, cls2, null);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f69197a + ", second=" + this.f69198b + AbstractJsonLexerKt.END_OBJ;
    }

    public p(Class<?> cls, Class<?> cls2) {
        set(cls, cls2);
    }

    public void set(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f69197a = cls;
        this.f69198b = cls2;
        this.f69199c = cls3;
    }

    public p(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        set(cls, cls2, cls3);
    }
}
