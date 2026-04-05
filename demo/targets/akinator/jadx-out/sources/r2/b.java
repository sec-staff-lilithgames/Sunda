package r2;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final a f83677b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final float f83678c = m6032constructorimpl(0.5f);

    /* renamed from: d, reason: collision with root package name */
    public static final float f83679d = m6032constructorimpl(-0.5f);

    /* renamed from: e, reason: collision with root package name */
    public static final float f83680e = m6032constructorimpl(0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f83681a;

    public /* synthetic */ b(float f10) {
        this.f83681a = f10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ b m6031boximpl(float f10) {
        return new b(f10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6033equalsimpl(float f10, Object obj) {
        if (obj instanceof b) {
            return e0.areEqual((Object) Float.valueOf(f10), (Object) Float.valueOf(((b) obj).m6037unboximpl()));
        }
        return false;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6034equalsimpl0(float f10, float f11) {
        return e0.areEqual((Object) Float.valueOf(f10), (Object) Float.valueOf(f11));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6035hashCodeimpl(float f10) {
        return Float.hashCode(f10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6036toStringimpl(float f10) {
        return "BaselineShift(multiplier=" + f10 + ')';
    }

    public boolean equals(Object obj) {
        return m6033equalsimpl(this.f83681a, obj);
    }

    public final float getMultiplier() {
        return this.f83681a;
    }

    public int hashCode() {
        return m6035hashCodeimpl(this.f83681a);
    }

    public String toString() {
        return m6036toStringimpl(this.f83681a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m6037unboximpl() {
        return this.f83681a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m6032constructorimpl(float f10) {
        return f10;
    }
}
