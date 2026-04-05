package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class t0 extends v0 implements KProperty2 {
    public t0() {
    }

    @Override // kotlin.jvm.internal.p
    public final KCallable computeReflected() {
        return c1.property2(this);
    }

    @Override // kotlin.reflect.KProperty2
    public Object getDelegate(Object obj, Object obj2) {
        return ((KProperty2) getReflected()).getDelegate(obj, obj2);
    }

    @Override // kotlin.reflect.KProperty2, kv.p
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    public t0(Class cls, String str, String str2, int i10) {
        super(p.NO_RECEIVER, cls, str, str2, i10);
    }

    @Override // kotlin.reflect.KProperty
    public KProperty2.Getter getGetter() {
        return ((KProperty2) getReflected()).getGetter();
    }
}
