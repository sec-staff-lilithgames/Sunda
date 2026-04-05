package g0;

import p0.o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c implements v3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f56368a;

    /* renamed from: b, reason: collision with root package name */
    public final String f56369b;

    /* renamed from: c, reason: collision with root package name */
    public final p0.j2 f56370c;

    /* renamed from: d, reason: collision with root package name */
    public final p0.j2 f56371d;

    public c(int i10, String name) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        this.f56368a = i10;
        this.f56369b = name;
        this.f56370c = o5.mutableStateOf$default(o3.c.f77431e, null, 2, null);
        this.f56371d = o5.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f56368a == ((c) obj).f56368a;
        }
        return false;
    }

    @Override // g0.v3
    public int getBottom(s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        return getInsets$foundation_layout_release().f77435d;
    }

    public final o3.c getInsets$foundation_layout_release() {
        return (o3.c) this.f56370c.getValue();
    }

    @Override // g0.v3
    public int getLeft(s2.e density, s2.x layoutDirection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        return getInsets$foundation_layout_release().f77432a;
    }

    @Override // g0.v3
    public int getRight(s2.e density, s2.x layoutDirection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        return getInsets$foundation_layout_release().f77434c;
    }

    @Override // g0.v3
    public int getTop(s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        return getInsets$foundation_layout_release().f77433b;
    }

    public final int getType$foundation_layout_release() {
        return this.f56368a;
    }

    public int hashCode() {
        return this.f56368a;
    }

    public final boolean isVisible() {
        return ((Boolean) this.f56371d.getValue()).booleanValue();
    }

    public final void setInsets$foundation_layout_release(o3.c cVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cVar, "<set-?>");
        this.f56370c.setValue(cVar);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f56369b);
        sb2.append('(');
        sb2.append(getInsets$foundation_layout_release().f77432a);
        sb2.append(", ");
        sb2.append(getInsets$foundation_layout_release().f77433b);
        sb2.append(", ");
        sb2.append(getInsets$foundation_layout_release().f77434c);
        sb2.append(", ");
        return e3.g.m(sb2, getInsets$foundation_layout_release().f77435d, ')');
    }

    public final void update$foundation_layout_release(x3.e3 windowInsetsCompat, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(windowInsetsCompat, "windowInsetsCompat");
        int i11 = this.f56368a;
        if (i10 == 0 || (i10 & i11) != 0) {
            setInsets$foundation_layout_release(windowInsetsCompat.getInsets(i11));
            this.f56371d.setValue(Boolean.valueOf(windowInsetsCompat.isVisible(i11)));
        }
    }
}
