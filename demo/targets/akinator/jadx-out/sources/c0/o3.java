package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface o3 extends i3 {
    @Override // c0.i3
    /* synthetic */ long getDurationNanos(v vVar, v vVar2, v vVar3);

    @Override // c0.i3
    /* bridge */ /* synthetic */ default v getEndVelocity(v vVar, v vVar2, v vVar3) {
        return super.getEndVelocity(vVar, vVar2, vVar3);
    }

    @Override // c0.i3
    /* synthetic */ v getValueFromNanos(long j10, v vVar, v vVar2, v vVar3);

    @Override // c0.i3
    /* synthetic */ v getVelocityFromNanos(long j10, v vVar, v vVar2, v vVar3);

    @Override // c0.i3
    default boolean isInfinite() {
        return false;
    }
}
