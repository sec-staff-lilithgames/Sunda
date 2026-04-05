package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface g {
    long getDurationNanos();

    Object getTargetValue();

    n2 getTypeConverter();

    Object getValueFromNanos(long j10);

    v getVelocityVectorFromNanos(long j10);

    default boolean isFinishedFromNanos(long j10) {
        return j10 >= getDurationNanos();
    }

    boolean isInfinite();
}
