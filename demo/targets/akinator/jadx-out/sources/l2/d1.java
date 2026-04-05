package l2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d1 {
    public static final c1 lerp(c1 start, c1 stop, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(start, "start");
        kotlin.jvm.internal.e0.checkNotNullParameter(stop, "stop");
        return new c1(qv.v.coerceIn(t2.a.lerp(start.getWeight(), stop.getWeight(), f10), 1, 1000));
    }
}
