package c0;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t3 implements n3 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f11622a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11623b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11624c;

    /* renamed from: d, reason: collision with root package name */
    public v f11625d;

    /* renamed from: e, reason: collision with root package name */
    public v f11626e;

    public t3(Map<Integer, ? extends tu.v> keyframes, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(keyframes, "keyframes");
        this.f11622a = keyframes;
        this.f11623b = i10;
        this.f11624c = i11;
    }

    @Override // c0.n3
    public int getDelayMillis() {
        return this.f11624c;
    }

    @Override // c0.n3
    public int getDurationMillis() {
        return this.f11623b;
    }

    @Override // c0.n3, c0.o3, c0.i3
    public /* bridge */ /* synthetic */ long getDurationNanos(v vVar, v vVar2, v vVar3) {
        return super.getDurationNanos(vVar, vVar2, vVar3);
    }

    @Override // c0.n3, c0.o3, c0.i3
    public /* bridge */ /* synthetic */ v getEndVelocity(v vVar, v vVar2, v vVar3) {
        return super.getEndVelocity(vVar, vVar2, vVar3);
    }

    @Override // c0.n3, c0.o3, c0.i3
    public v getValueFromNanos(long j10, v initialValue, v targetValue, v initialVelocity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetValue, "targetValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocity, "initialVelocity");
        int iCoerceIn = (int) qv.v.coerceIn((j10 / 1000000) - getDelayMillis(), 0L, (long) getDurationMillis());
        Integer numValueOf = Integer.valueOf(iCoerceIn);
        Map map = this.f11622a;
        if (map.containsKey(numValueOf)) {
            return (v) ((tu.v) uu.p1.getValue(map, Integer.valueOf(iCoerceIn))).getFirst();
        }
        if (iCoerceIn >= getDurationMillis()) {
            return targetValue;
        }
        if (iCoerceIn <= 0) {
            return initialValue;
        }
        int durationMillis = getDurationMillis();
        g0 linearEasing = i0.getLinearEasing();
        int i10 = 0;
        v vVar = initialValue;
        int i11 = 0;
        for (Map.Entry entry : map.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            tu.v vVar2 = (tu.v) entry.getValue();
            if (iCoerceIn > iIntValue && iIntValue >= i11) {
                vVar = (v) vVar2.getFirst();
                linearEasing = (g0) vVar2.getSecond();
                i11 = iIntValue;
            } else if (iCoerceIn < iIntValue && iIntValue <= durationMillis) {
                targetValue = (v) vVar2.getFirst();
                durationMillis = iIntValue;
            }
        }
        float fTransform = linearEasing.transform((iCoerceIn - i11) / (durationMillis - i11));
        if (this.f11625d == null) {
            this.f11625d = w.newInstance(initialValue);
            this.f11626e = w.newInstance(initialValue);
        }
        int size$animation_core_release = vVar.getSize$animation_core_release();
        while (true) {
            v vVar3 = null;
            if (i10 >= size$animation_core_release) {
                break;
            }
            v vVar4 = this.f11625d;
            if (vVar4 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("valueVector");
            } else {
                vVar3 = vVar4;
            }
            vVar3.set$animation_core_release(i10, h3.lerp(vVar.get$animation_core_release(i10), targetValue.get$animation_core_release(i10), fTransform));
            i10++;
        }
        v vVar5 = this.f11625d;
        if (vVar5 != null) {
            return vVar5;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    @Override // c0.n3, c0.o3, c0.i3
    public v getVelocityFromNanos(long j10, v initialValue, v targetValue, v initialVelocity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetValue, "targetValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocity, "initialVelocity");
        long jCoerceIn = qv.v.coerceIn((j10 / 1000000) - getDelayMillis(), 0L, (long) getDurationMillis());
        if (jCoerceIn <= 0) {
            return initialVelocity;
        }
        v valueFromMillis = l3.getValueFromMillis(this, jCoerceIn - 1, initialValue, targetValue, initialVelocity);
        v valueFromMillis2 = l3.getValueFromMillis(this, jCoerceIn, initialValue, targetValue, initialVelocity);
        if (this.f11625d == null) {
            this.f11625d = w.newInstance(initialValue);
            this.f11626e = w.newInstance(initialValue);
        }
        int size$animation_core_release = valueFromMillis.getSize$animation_core_release();
        int i10 = 0;
        while (true) {
            v vVar = null;
            if (i10 >= size$animation_core_release) {
                break;
            }
            v vVar2 = this.f11626e;
            if (vVar2 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("velocityVector");
            } else {
                vVar = vVar2;
            }
            vVar.set$animation_core_release(i10, (valueFromMillis.get$animation_core_release(i10) - valueFromMillis2.get$animation_core_release(i10)) * 1000.0f);
            i10++;
        }
        v vVar3 = this.f11626e;
        if (vVar3 != null) {
            return vVar3;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }

    @Override // c0.n3, c0.o3, c0.i3
    public /* bridge */ /* synthetic */ boolean isInfinite() {
        return super.isInfinite();
    }

    public /* synthetic */ t3(Map map, int i10, int i11, int i12, kotlin.jvm.internal.u uVar) {
        this(map, i10, (i12 & 4) != 0 ? 0 : i11);
    }
}
