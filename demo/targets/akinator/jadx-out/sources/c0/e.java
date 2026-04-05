package c0;

import p0.o5;
import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final n2 f11440a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11441b;

    /* renamed from: c, reason: collision with root package name */
    public final p f11442c;

    /* renamed from: d, reason: collision with root package name */
    public final p0.j2 f11443d;

    /* renamed from: e, reason: collision with root package name */
    public final p0.j2 f11444e;

    /* renamed from: f, reason: collision with root package name */
    public Object f11445f;

    /* renamed from: g, reason: collision with root package name */
    public Object f11446g;

    /* renamed from: h, reason: collision with root package name */
    public final v0 f11447h;

    /* renamed from: i, reason: collision with root package name */
    public final i1 f11448i;

    /* renamed from: j, reason: collision with root package name */
    public final v f11449j;

    /* renamed from: k, reason: collision with root package name */
    public final v f11450k;

    /* renamed from: l, reason: collision with root package name */
    public v f11451l;

    /* renamed from: m, reason: collision with root package name */
    public v f11452m;

    public e(Object obj, n2 typeConverter, Object obj2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(typeConverter, "typeConverter");
        this.f11440a = typeConverter;
        this.f11441b = obj2;
        this.f11442c = new p(typeConverter, obj, null, 0L, 0L, false, 60, null);
        this.f11443d = o5.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.f11444e = o5.mutableStateOf$default(obj, null, 2, null);
        this.f11447h = new v0();
        this.f11448i = new i1(0.0f, 0.0f, obj2, 3, null);
        v vVar = (v) typeConverter.getConvertToVector().invoke(obj);
        int size$animation_core_release = vVar.getSize$animation_core_release();
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            vVar.set$animation_core_release(i10, Float.NEGATIVE_INFINITY);
        }
        this.f11449j = vVar;
        v vVar2 = (v) this.f11440a.getConvertToVector().invoke(obj);
        int size$animation_core_release2 = vVar2.getSize$animation_core_release();
        for (int i11 = 0; i11 < size$animation_core_release2; i11++) {
            vVar2.set$animation_core_release(i11, Float.POSITIVE_INFINITY);
        }
        this.f11450k = vVar2;
        this.f11451l = vVar;
        this.f11452m = vVar2;
    }

    public static final void access$endAnimation(e eVar) {
        p pVar = eVar.f11442c;
        pVar.getVelocityVector().reset$animation_core_release();
        pVar.setLastFrameTimeNanos$animation_core_release(Long.MIN_VALUE);
        eVar.f11443d.setValue(Boolean.FALSE);
    }

    public static /* synthetic */ Object animateDecay$default(e eVar, Object obj, c0 c0Var, kv.l lVar, zu.d dVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        return eVar.animateDecay(obj, c0Var, lVar, dVar);
    }

    public static /* synthetic */ Object animateTo$default(e eVar, Object obj, n nVar, Object obj2, kv.l lVar, zu.d dVar, int i10, Object obj3) {
        if ((i10 & 2) != 0) {
            nVar = eVar.f11448i;
        }
        n nVar2 = nVar;
        if ((i10 & 4) != 0) {
            obj2 = eVar.getVelocity();
        }
        Object obj4 = obj2;
        if ((i10 & 8) != 0) {
            lVar = null;
        }
        return eVar.animateTo(obj, nVar2, obj4, lVar, dVar);
    }

    public static /* synthetic */ void updateBounds$default(e eVar, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = eVar.f11445f;
        }
        if ((i10 & 2) != 0) {
            obj2 = eVar.f11446g;
        }
        eVar.updateBounds(obj, obj2);
    }

    public final Object a(Object obj) {
        if (kotlin.jvm.internal.e0.areEqual(this.f11451l, this.f11449j) && kotlin.jvm.internal.e0.areEqual(this.f11452m, this.f11450k)) {
            return obj;
        }
        n2 n2Var = this.f11440a;
        v vVar = (v) n2Var.getConvertToVector().invoke(obj);
        int size$animation_core_release = vVar.getSize$animation_core_release();
        boolean z10 = false;
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            if (vVar.get$animation_core_release(i10) < this.f11451l.get$animation_core_release(i10) || vVar.get$animation_core_release(i10) > this.f11452m.get$animation_core_release(i10)) {
                vVar.set$animation_core_release(i10, qv.v.coerceIn(vVar.get$animation_core_release(i10), this.f11451l.get$animation_core_release(i10), this.f11452m.get$animation_core_release(i10)));
                z10 = true;
            }
        }
        return z10 ? n2Var.getConvertFromVector().invoke(vVar) : obj;
    }

    public final Object animateDecay(Object obj, c0 c0Var, kv.l lVar, zu.d<? super l> dVar) {
        Object value = getValue();
        n2 n2Var = this.f11440a;
        return b(new b0(c0Var, n2Var, value, (v) n2Var.getConvertToVector().invoke(obj)), obj, lVar, dVar);
    }

    public final Object animateTo(Object obj, n nVar, Object obj2, kv.l lVar, zu.d<? super l> dVar) {
        return b(k.TargetBasedAnimation(nVar, this.f11440a, getValue(), obj, obj2), obj2, lVar, dVar);
    }

    public final v5 asState() {
        return this.f11442c;
    }

    public final Object b(g gVar, Object obj, kv.l lVar, zu.d dVar) {
        return v0.mutate$default(this.f11447h, null, new b(this, obj, gVar, this.f11442c.getLastFrameTimeNanos(), lVar, null), dVar, 1, null);
    }

    public final i1 getDefaultSpringSpec$animation_core_release() {
        return this.f11448i;
    }

    public final p getInternalState$animation_core_release() {
        return this.f11442c;
    }

    public final Object getLowerBound() {
        return this.f11445f;
    }

    public final Object getTargetValue() {
        return this.f11444e.getValue();
    }

    public final n2 getTypeConverter() {
        return this.f11440a;
    }

    public final Object getUpperBound() {
        return this.f11446g;
    }

    public final Object getValue() {
        return this.f11442c.getValue();
    }

    public final Object getVelocity() {
        return this.f11440a.getConvertFromVector().invoke(getVelocityVector());
    }

    public final v getVelocityVector() {
        return this.f11442c.getVelocityVector();
    }

    public final boolean isRunning() {
        return ((Boolean) this.f11443d.getValue()).booleanValue();
    }

    public final Object snapTo(Object obj, zu.d<? super tu.x0> dVar) {
        Object objMutate$default = v0.mutate$default(this.f11447h, null, new c(this, obj, null), dVar, 1, null);
        return objMutate$default == av.e.getCOROUTINE_SUSPENDED() ? objMutate$default : tu.x0.f87415a;
    }

    public final Object stop(zu.d<? super tu.x0> dVar) {
        Object objMutate$default = v0.mutate$default(this.f11447h, null, new d(this, null), dVar, 1, null);
        return objMutate$default == av.e.getCOROUTINE_SUSPENDED() ? objMutate$default : tu.x0.f87415a;
    }

    public final void updateBounds(Object obj, Object obj2) {
        v vVar;
        v vVar2;
        n2 n2Var = this.f11440a;
        if (obj == null || (vVar = (v) n2Var.getConvertToVector().invoke(obj)) == null) {
            vVar = this.f11449j;
        }
        if (obj2 == null || (vVar2 = (v) n2Var.getConvertToVector().invoke(obj2)) == null) {
            vVar2 = this.f11450k;
        }
        int size$animation_core_release = vVar.getSize$animation_core_release();
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            if (vVar.get$animation_core_release(i10) > vVar2.get$animation_core_release(i10)) {
                throw new IllegalStateException(("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + vVar + " is greater than upper bound " + vVar2 + " on index " + i10).toString());
            }
        }
        this.f11451l = vVar;
        this.f11452m = vVar2;
        this.f11446g = obj2;
        this.f11445f = obj;
        if (isRunning()) {
            return;
        }
        Object objA = a(getValue());
        if (kotlin.jvm.internal.e0.areEqual(objA, getValue())) {
            return;
        }
        this.f11442c.setValue$animation_core_release(objA);
    }

    public /* synthetic */ e(Object obj, n2 n2Var, Object obj2, int i10, kotlin.jvm.internal.u uVar) {
        this(obj, n2Var, (i10 & 4) != 0 ? null : obj2);
    }
}
