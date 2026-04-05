package l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final g2.z f72166a;

    /* renamed from: b, reason: collision with root package name */
    public final kv.q f72167b;

    public s(g2.z placeholder, kv.q children) {
        kotlin.jvm.internal.e0.checkNotNullParameter(placeholder, "placeholder");
        kotlin.jvm.internal.e0.checkNotNullParameter(children, "children");
        this.f72166a = placeholder;
        this.f72167b = children;
    }

    public final kv.q getChildren() {
        return this.f72167b;
    }

    public final g2.z getPlaceholder() {
        return this.f72166a;
    }
}
