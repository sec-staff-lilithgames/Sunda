package a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface g5 {
    long getDoubleTapMinTimeMillis();

    long getDoubleTapTimeoutMillis();

    long getLongPressTimeoutMillis();

    /* renamed from: getMinimumTouchTargetSize-MYxV2XQ, reason: not valid java name */
    default long mo36getMinimumTouchTargetSizeMYxV2XQ() {
        float f10 = 48;
        return s2.j.m6833DpSizeYgX7TsA(s2.i.m6817constructorimpl(f10), s2.i.m6817constructorimpl(f10));
    }

    float getTouchSlop();
}
