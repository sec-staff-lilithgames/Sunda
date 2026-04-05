package r2;

import g2.t1;
import j1.o0;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class u {
    public static final t lerp(t start, t stop, float f10) {
        e0.checkNotNullParameter(start, "start");
        e0.checkNotNullParameter(stop, "stop");
        if ((start instanceof d) || (stop instanceof d)) {
            return (t) t1.lerpDiscrete(start, stop, f10);
        }
        return q.f83721a.m6091from8_81llA(o0.m4891lerpjxsXWHM(start.mo6039getColor0d7_KjU(), stop.mo6039getColor0d7_KjU(), f10));
    }
}
