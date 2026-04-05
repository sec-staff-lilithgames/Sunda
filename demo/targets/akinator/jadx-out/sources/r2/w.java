package r2;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class w {
    public static final v lerp(v start, v stop, float f10) {
        e0.checkNotNullParameter(start, "start");
        e0.checkNotNullParameter(stop, "stop");
        return new v(t2.a.lerp(start.getScaleX(), stop.getScaleX(), f10), t2.a.lerp(start.getSkewX(), stop.getSkewX(), f10));
    }
}
