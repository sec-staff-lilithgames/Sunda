package l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f72084a = s2.i.m6817constructorimpl(2);

    public static final e1.v cursor(e1.v vVar, i1 state, m2.j0 value, m2.z offsetMapping, j1.b0 cursorBrush, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.e0.checkNotNullParameter(offsetMapping, "offsetMapping");
        kotlin.jvm.internal.e0.checkNotNullParameter(cursorBrush, "cursorBrush");
        return z10 ? e1.o.composed$default(vVar, null, new c1(cursorBrush, state, value, offsetMapping), 1, null) : vVar;
    }

    public static final float getDefaultCursorThickness() {
        return f72084a;
    }
}
