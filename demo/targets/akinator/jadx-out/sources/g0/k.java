package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k implements h {

    /* renamed from: a, reason: collision with root package name */
    public final float f56493a = s2.i.m6817constructorimpl(0);

    @Override // g0.h, g0.g
    public void arrange(s2.e eVar, int i10, int[] sizes, s2.x layoutDirection, int[] outPositions) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(sizes, "sizes");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.e0.checkNotNullParameter(outPositions, "outPositions");
        if (layoutDirection == s2.x.f85363b) {
            u.f56588a.placeSpaceEvenly$foundation_layout_release(i10, sizes, outPositions, false);
        } else {
            u.f56588a.placeSpaceEvenly$foundation_layout_release(i10, sizes, outPositions, true);
        }
    }

    @Override // g0.h, g0.g, g0.o
    /* renamed from: getSpacing-D9Ej5fM */
    public float mo3858getSpacingD9Ej5fM() {
        return this.f56493a;
    }

    public String toString() {
        return "Arrangement#SpaceEvenly";
    }

    @Override // g0.h, g0.o
    public void arrange(s2.e eVar, int i10, int[] sizes, int[] outPositions) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(sizes, "sizes");
        kotlin.jvm.internal.e0.checkNotNullParameter(outPositions, "outPositions");
        u.f56588a.placeSpaceEvenly$foundation_layout_release(i10, sizes, outPositions, false);
    }
}
