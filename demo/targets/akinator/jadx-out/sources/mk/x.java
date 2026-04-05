package mk;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class x extends z {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f74800b;

    public x(Method method) {
        this.f74800b = method;
    }

    @Override // mk.z
    public boolean canAccess(AccessibleObject accessibleObject, Object obj) {
        try {
            return ((Boolean) this.f74800b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e10) {
            throw new RuntimeException("Failed invoking canAccess", e10);
        }
    }
}
