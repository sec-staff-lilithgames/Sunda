package m2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final g2.b f73996a;

    /* renamed from: b, reason: collision with root package name */
    public final z f73997b;

    public x0(g2.b text, z offsetMapping) {
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.e0.checkNotNullParameter(offsetMapping, "offsetMapping");
        this.f73996a = text;
        this.f73997b = offsetMapping;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f73996a, x0Var.f73996a) && kotlin.jvm.internal.e0.areEqual(this.f73997b, x0Var.f73997b);
    }

    public final z getOffsetMapping() {
        return this.f73997b;
    }

    public final g2.b getText() {
        return this.f73996a;
    }

    public int hashCode() {
        return this.f73997b.hashCode() + (this.f73996a.hashCode() * 31);
    }

    public String toString() {
        return "TransformedText(text=" + ((Object) this.f73996a) + ", offsetMapping=" + this.f73997b + ')';
    }
}
