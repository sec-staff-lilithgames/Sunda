package i1;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class k {
    /* renamed from: Rect-0a9Yr6o, reason: not valid java name */
    public static final j m4217Rect0a9Yr6o(long j10, long j11) {
        return new j(h.m4185getXimpl(j10), h.m4186getYimpl(j10), h.m4185getXimpl(j11), h.m4186getYimpl(j11));
    }

    /* renamed from: Rect-3MmeM6k, reason: not valid java name */
    public static final j m4218Rect3MmeM6k(long j10, float f10) {
        return new j(h.m4185getXimpl(j10) - f10, h.m4186getYimpl(j10) - f10, h.m4185getXimpl(j10) + f10, h.m4186getYimpl(j10) + f10);
    }

    /* renamed from: Rect-tz77jQw, reason: not valid java name */
    public static final j m4219Recttz77jQw(long j10, long j11) {
        return new j(h.m4185getXimpl(j10), h.m4186getYimpl(j10), o.m4252getWidthimpl(j11) + h.m4185getXimpl(j10), o.m4249getHeightimpl(j11) + h.m4186getYimpl(j10));
    }

    public static final j lerp(j start, j stop, float f10) {
        e0.checkNotNullParameter(start, "start");
        e0.checkNotNullParameter(stop, "stop");
        return new j(t2.a.lerp(start.getLeft(), stop.getLeft(), f10), t2.a.lerp(start.getTop(), stop.getTop(), f10), t2.a.lerp(start.getRight(), stop.getRight(), f10), t2.a.lerp(start.getBottom(), stop.getBottom(), f10));
    }
}
