package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final z.u0 f80297a = r0.b.m5983constructorimpl$default(null, 1, null);

    /* renamed from: b, reason: collision with root package name */
    public final z.u0 f80298b = r0.b.m5983constructorimpl$default(null, 1, null);

    public final void add(f2 f2Var, l2 l2Var) {
        r0.b.m5979addimpl(this.f80297a, f2Var, l2Var);
        r0.b.m5979addimpl(this.f80298b, l2Var.getContainer(), f2Var);
    }

    public final void clear() {
        r0.b.m5981clearimpl(this.f80297a);
        r0.b.m5981clearimpl(this.f80298b);
    }

    public final boolean contains(f2 f2Var) {
        return r0.b.m5984containsimpl(this.f80297a, f2Var);
    }

    public final l2 removeLast(f2 f2Var) {
        z.u0 u0Var = this.f80297a;
        l2 l2Var = (l2) r0.b.m5993removeLastimpl(u0Var, f2Var);
        if (r0.b.m5990isEmptyimpl(u0Var)) {
            r0.b.m5981clearimpl(this.f80298b);
        }
        return l2Var;
    }

    public final void usedContainer(i2 i2Var) {
        Object obj = this.f80298b.get(i2Var);
        if (obj != null) {
            boolean z10 = obj instanceof z.t0;
            z.u0 u0Var = this.f80297a;
            if (!z10) {
                kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                r0.b.m5994removeValueIfimpl(u0Var, (f2) obj, new g2(i2Var, 1));
                return;
            }
            z.f1 f1Var = (z.f1) obj;
            Object[] objArr = f1Var.f96812a;
            int i10 = f1Var.f96813b;
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj2 = objArr[i11];
                kotlin.jvm.internal.e0.checkNotNull(obj2, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                r0.b.m5994removeValueIfimpl(u0Var, (f2) obj2, new g2(i2Var, 1));
            }
        }
    }
}
