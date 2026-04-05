package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface n3 extends o3 {
    int getDelayMillis();

    int getDurationMillis();

    @Override // c0.o3, c0.i3
    default long getDurationNanos(v initialValue, v targetValue, v initialVelocity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetValue, "targetValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocity, "initialVelocity");
        return (getDurationMillis() + getDelayMillis()) * 1000000;
    }

    @Override // c0.o3, c0.i3
    /* bridge */ /* synthetic */ default v getEndVelocity(v vVar, v vVar2, v vVar3) {
        return super.getEndVelocity(vVar, vVar2, vVar3);
    }

    @Override // c0.o3, c0.i3
    /* synthetic */ v getValueFromNanos(long j10, v vVar, v vVar2, v vVar3);

    @Override // c0.o3, c0.i3
    /* synthetic */ v getVelocityFromNanos(long j10, v vVar, v vVar2, v vVar3);

    @Override // c0.o3, c0.i3
    /* bridge */ /* synthetic */ default boolean isInfinite() {
        return super.isInfinite();
    }
}
