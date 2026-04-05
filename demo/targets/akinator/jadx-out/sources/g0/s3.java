package g0;

import p0.o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s3 implements v3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f56578a;

    /* renamed from: b, reason: collision with root package name */
    public final p0.j2 f56579b;

    public s3(b1 insets, String name) {
        kotlin.jvm.internal.e0.checkNotNullParameter(insets, "insets");
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        this.f56578a = name;
        this.f56579b = o5.mutableStateOf$default(insets, null, 2, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s3) {
            return kotlin.jvm.internal.e0.areEqual(getValue$foundation_layout_release(), ((s3) obj).getValue$foundation_layout_release());
        }
        return false;
    }

    @Override // g0.v3
    public int getBottom(s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        return getValue$foundation_layout_release().getBottom();
    }

    @Override // g0.v3
    public int getLeft(s2.e density, s2.x layoutDirection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        return getValue$foundation_layout_release().getLeft();
    }

    public final String getName() {
        return this.f56578a;
    }

    @Override // g0.v3
    public int getRight(s2.e density, s2.x layoutDirection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        return getValue$foundation_layout_release().getRight();
    }

    @Override // g0.v3
    public int getTop(s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        return getValue$foundation_layout_release().getTop();
    }

    public final b1 getValue$foundation_layout_release() {
        return (b1) this.f56579b.getValue();
    }

    public int hashCode() {
        return this.f56578a.hashCode();
    }

    public final void setValue$foundation_layout_release(b1 b1Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(b1Var, "<set-?>");
        this.f56579b.setValue(b1Var);
    }

    public String toString() {
        return this.f56578a + "(left=" + getValue$foundation_layout_release().getLeft() + ", top=" + getValue$foundation_layout_release().getTop() + ", right=" + getValue$foundation_layout_release().getRight() + ", bottom=" + getValue$foundation_layout_release().getBottom() + ')';
    }
}
