package n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f75121a = new l();

    public static float a(float f10, float f11, p0.w wVar) {
        wVar.startReplaceableGroup(-1528360391);
        long jM4868unboximpl = ((j1.m0) wVar.consume(p.getLocalContentColor())).m4868unboximpl();
        if (!i0.f75090a.getColors(wVar, 6).isLight() ? j1.o0.m4892luminance8_81llA(jM4868unboximpl) >= 0.5d : j1.o0.m4892luminance8_81llA(jM4868unboximpl) <= 0.5d) {
            f10 = f11;
        }
        wVar.endReplaceableGroup();
        return f10;
    }

    public final float getDisabled(p0.w wVar, int i10) {
        wVar.startReplaceableGroup(621183615);
        float fA = a(0.38f, 0.38f, wVar);
        wVar.endReplaceableGroup();
        return fA;
    }

    public final float getHigh(p0.w wVar, int i10) {
        wVar.startReplaceableGroup(629162431);
        float fA = a(1.0f, 0.87f, wVar);
        wVar.endReplaceableGroup();
        return fA;
    }

    public final float getMedium(p0.w wVar, int i10) {
        wVar.startReplaceableGroup(1999054879);
        float fA = a(0.74f, 0.6f, wVar);
        wVar.endReplaceableGroup();
        return fA;
    }
}
