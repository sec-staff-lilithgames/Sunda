package bv;

import java.lang.reflect.Method;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f11346a = new j();

    /* renamed from: b, reason: collision with root package name */
    public static final i f11347b = new i(null, null, null);

    /* renamed from: c, reason: collision with root package name */
    public static i f11348c;

    public final String getModuleName(a continuation) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        e0.checkNotNullParameter(continuation, "continuation");
        i iVar = f11348c;
        i iVar2 = f11347b;
        if (iVar == null) {
            try {
                i iVar3 = new i(Class.class.getDeclaredMethod("getModule", null), continuation.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), continuation.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f11348c = iVar3;
                iVar = iVar3;
            } catch (Exception unused) {
                f11348c = iVar2;
                iVar = iVar2;
            }
        }
        if (iVar == iVar2 || (method = iVar.f11343a) == null || (objInvoke = method.invoke(continuation.getClass(), null)) == null || (method2 = iVar.f11344b) == null || (objInvoke2 = method2.invoke(objInvoke, null)) == null) {
            return null;
        }
        Method method3 = iVar.f11345c;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
