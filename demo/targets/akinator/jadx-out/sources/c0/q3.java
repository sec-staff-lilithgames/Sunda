package c0;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q3 implements o3 {

    /* renamed from: a, reason: collision with root package name */
    public final x f11580a;

    /* renamed from: b, reason: collision with root package name */
    public v f11581b;

    /* renamed from: c, reason: collision with root package name */
    public v f11582c;

    /* renamed from: d, reason: collision with root package name */
    public v f11583d;

    public q3(x anims) {
        kotlin.jvm.internal.e0.checkNotNullParameter(anims, "anims");
        this.f11580a = anims;
    }

    @Override // c0.o3, c0.i3
    public long getDurationNanos(v initialValue, v targetValue, v initialVelocity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetValue, "targetValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocity, "initialVelocity");
        Iterator it = qv.v.until(0, initialValue.getSize$animation_core_release()).iterator();
        long jMax = 0;
        while (it.hasNext()) {
            int iNextInt = ((uu.j1) it).nextInt();
            jMax = Math.max(jMax, this.f11580a.get(iNextInt).getDurationNanos(initialValue.get$animation_core_release(iNextInt), targetValue.get$animation_core_release(iNextInt), initialVelocity.get$animation_core_release(iNextInt)));
        }
        return jMax;
    }

    @Override // c0.o3, c0.i3
    public v getEndVelocity(v initialValue, v targetValue, v initialVelocity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetValue, "targetValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f11583d == null) {
            this.f11583d = w.newInstance(initialVelocity);
        }
        v vVar = this.f11583d;
        if (vVar == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("endVelocityVector");
            vVar = null;
        }
        int size$animation_core_release = vVar.getSize$animation_core_release();
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            v vVar2 = this.f11583d;
            if (vVar2 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("endVelocityVector");
                vVar2 = null;
            }
            vVar2.set$animation_core_release(i10, this.f11580a.get(i10).getEndVelocity(initialValue.get$animation_core_release(i10), targetValue.get$animation_core_release(i10), initialVelocity.get$animation_core_release(i10)));
        }
        v vVar3 = this.f11583d;
        if (vVar3 != null) {
            return vVar3;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("endVelocityVector");
        return null;
    }

    @Override // c0.o3, c0.i3
    public v getValueFromNanos(long j10, v initialValue, v targetValue, v initialVelocity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetValue, "targetValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f11581b == null) {
            this.f11581b = w.newInstance(initialValue);
        }
        v vVar = this.f11581b;
        if (vVar == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("valueVector");
            vVar = null;
        }
        int size$animation_core_release = vVar.getSize$animation_core_release();
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            v vVar2 = this.f11581b;
            if (vVar2 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("valueVector");
                vVar2 = null;
            }
            vVar2.set$animation_core_release(i10, this.f11580a.get(i10).getValueFromNanos(j10, initialValue.get$animation_core_release(i10), targetValue.get$animation_core_release(i10), initialVelocity.get$animation_core_release(i10)));
        }
        v vVar3 = this.f11581b;
        if (vVar3 != null) {
            return vVar3;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    @Override // c0.o3, c0.i3
    public v getVelocityFromNanos(long j10, v initialValue, v targetValue, v initialVelocity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetValue, "targetValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f11582c == null) {
            this.f11582c = w.newInstance(initialVelocity);
        }
        v vVar = this.f11582c;
        if (vVar == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("velocityVector");
            vVar = null;
        }
        int size$animation_core_release = vVar.getSize$animation_core_release();
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            v vVar2 = this.f11582c;
            if (vVar2 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("velocityVector");
                vVar2 = null;
            }
            vVar2.set$animation_core_release(i10, this.f11580a.get(i10).getVelocityFromNanos(j10, initialValue.get$animation_core_release(i10), targetValue.get$animation_core_release(i10), initialVelocity.get$animation_core_release(i10)));
        }
        v vVar3 = this.f11582c;
        if (vVar3 != null) {
            return vVar3;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }

    @Override // c0.o3, c0.i3
    public /* bridge */ /* synthetic */ boolean isInfinite() {
        return super.isInfinite();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q3(k0 anim) {
        this(new p3(anim));
        kotlin.jvm.internal.e0.checkNotNullParameter(anim, "anim");
    }
}
