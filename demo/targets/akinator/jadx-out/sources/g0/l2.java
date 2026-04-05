package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l2 implements v3 {

    /* renamed from: a, reason: collision with root package name */
    public final i2 f56522a;

    public l2(i2 paddingValues) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paddingValues, "paddingValues");
        this.f56522a = paddingValues;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l2) {
            return kotlin.jvm.internal.e0.areEqual(((l2) obj).f56522a, this.f56522a);
        }
        return false;
    }

    @Override // g0.v3
    public int getBottom(s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        return density.mo3419roundToPx0680j_4(this.f56522a.mo3841calculateBottomPaddingD9Ej5fM());
    }

    @Override // g0.v3
    public int getLeft(s2.e density, s2.x layoutDirection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        return density.mo3419roundToPx0680j_4(this.f56522a.mo3842calculateLeftPaddingu2uoSUM(layoutDirection));
    }

    @Override // g0.v3
    public int getRight(s2.e density, s2.x layoutDirection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        return density.mo3419roundToPx0680j_4(this.f56522a.mo3843calculateRightPaddingu2uoSUM(layoutDirection));
    }

    @Override // g0.v3
    public int getTop(s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        return density.mo3419roundToPx0680j_4(this.f56522a.mo3844calculateTopPaddingD9Ej5fM());
    }

    public int hashCode() {
        return this.f56522a.hashCode();
    }

    public String toString() {
        i2 i2Var = this.f56522a;
        s2.x xVar = s2.x.f85363b;
        return "PaddingValues(" + ((Object) s2.i.m6828toStringimpl(i2Var.mo3842calculateLeftPaddingu2uoSUM(xVar))) + ", " + ((Object) s2.i.m6828toStringimpl(i2Var.mo3844calculateTopPaddingD9Ej5fM())) + ", " + ((Object) s2.i.m6828toStringimpl(i2Var.mo3843calculateRightPaddingu2uoSUM(xVar))) + ", " + ((Object) s2.i.m6828toStringimpl(i2Var.mo3841calculateBottomPaddingD9Ej5fM())) + ')';
    }
}
