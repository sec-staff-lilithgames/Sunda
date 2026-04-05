package r2;

import g2.t1;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class y {
    public static final x lerp(x start, x stop, float f10) {
        e0.checkNotNullParameter(start, "start");
        e0.checkNotNullParameter(stop, "stop");
        return new x(t1.m4023lerpTextUnitInheritableC3pnCVY(start.m6094getFirstLineXSAIIZE(), stop.m6094getFirstLineXSAIIZE(), f10), t1.m4023lerpTextUnitInheritableC3pnCVY(start.m6095getRestLineXSAIIZE(), stop.m6095getRestLineXSAIIZE(), f10), null);
    }
}
