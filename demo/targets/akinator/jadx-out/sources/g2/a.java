package g2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a {
    public static final f0 createPlatformTextStyle(d0 d0Var, c0 c0Var) {
        return new f0(d0Var, c0Var);
    }

    public static final d0 lerp(d0 start, d0 stop, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(start, "start");
        kotlin.jvm.internal.e0.checkNotNullParameter(stop, "stop");
        return start;
    }

    public static final c0 lerp(c0 start, c0 stop, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(start, "start");
        kotlin.jvm.internal.e0.checkNotNullParameter(stop, "stop");
        return start.getIncludeFontPadding() == stop.getIncludeFontPadding() ? start : new c0(((Boolean) t1.lerpDiscrete(Boolean.valueOf(start.getIncludeFontPadding()), Boolean.valueOf(stop.getIncludeFontPadding()), f10)).booleanValue());
    }
}
