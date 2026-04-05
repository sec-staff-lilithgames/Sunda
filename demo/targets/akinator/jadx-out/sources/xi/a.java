package xi;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final int f91998a;

    /* renamed from: b, reason: collision with root package name */
    public final e f91999b;

    public a(int i10, e eVar) {
        this.f91998a = i10;
        this.f91999b = eVar;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return f.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        a aVar = (a) ((f) obj);
        return this.f91998a == aVar.tag() && this.f91999b.equals(aVar.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return (14552422 ^ this.f91998a) + (this.f91999b.hashCode() ^ 2041407134);
    }

    @Override // xi.f
    public e intEncoding() {
        return this.f91999b;
    }

    @Override // xi.f
    public int tag() {
        return this.f91998a;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f91998a + "intEncoding=" + this.f91999b + ')';
    }
}
