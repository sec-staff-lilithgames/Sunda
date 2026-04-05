package j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e2 {
    public static final d2 lerp(d2 start, d2 stop, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(start, "start");
        kotlin.jvm.internal.e0.checkNotNullParameter(stop, "stop");
        return new d2(o0.m4891lerpjxsXWHM(start.m4720getColor0d7_KjU(), stop.m4720getColor0d7_KjU(), f10), i1.i.m4202lerpWko1d7g(start.m4721getOffsetF1C5BW0(), stop.m4721getOffsetF1C5BW0(), f10), t2.a.lerp(start.getBlurRadius(), stop.getBlurRadius(), f10), null);
    }
}
