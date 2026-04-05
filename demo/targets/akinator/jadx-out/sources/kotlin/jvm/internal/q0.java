package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class q0 extends p0 {
    public q0(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(p.NO_RECEIVER, ((r) kDeclarationContainer).getJClass(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    @Override // kotlin.reflect.KProperty0
    public Object get() {
        return getGetter().call(new Object[0]);
    }

    public q0(Class cls, String str, String str2, int i10) {
        super(p.NO_RECEIVER, cls, str, str2, i10);
    }

    public q0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
