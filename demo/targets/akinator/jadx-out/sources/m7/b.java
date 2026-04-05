package m7;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b {
    public static final j Size(int i10, c cVar) {
        return new j(a.Dimension(i10), cVar);
    }

    public static final j getOriginalSize() {
        return j.f74065c;
    }

    public static final boolean isOriginal(j jVar) {
        return e0.areEqual(jVar, j.f74065c);
    }

    public static final j Size(c cVar, int i10) {
        return new j(cVar, a.Dimension(i10));
    }

    public static final j Size(int i10, int i11) {
        return new j(a.Dimension(i10), a.Dimension(i11));
    }

    @tu.f
    public static /* synthetic */ void getOriginalSize$annotations() {
    }
}
