package u5;

import j1.o2;
import kotlin.jvm.internal.e0;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class l {
    public static final <T, C> T findAndInstantiateDatabaseImpl(Class<C> klass, String suffix) throws ClassNotFoundException {
        String name;
        String str;
        e0.checkNotNullParameter(klass, "klass");
        e0.checkNotNullParameter(suffix, "suffix");
        Package r02 = klass.getPackage();
        if (r02 == null || (name = r02.getName()) == null) {
            name = "";
        }
        String canonicalName = klass.getCanonicalName();
        e0.checkNotNull(canonicalName);
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            e0.checkNotNullExpressionValue(canonicalName, "substring(...)");
        }
        String strO = o2.o(new StringBuilder(), k0.replace$default(canonicalName, '.', '_', false, 4, (Object) null), suffix);
        try {
            if (name.length() == 0) {
                str = strO;
            } else {
                str = name + '.' + strO;
            }
            Class<?> cls = Class.forName(str, true, klass.getClassLoader());
            e0.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.util.KClassUtil.findAndInstantiateDatabaseImpl>");
            return (T) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + strO + " does not exist. Is Room annotation processor correctly configured?", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Cannot access the constructor " + klass.getCanonicalName(), e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException("Failed to create an instance of " + klass.getCanonicalName(), e12);
        }
    }

    public static /* synthetic */ Object findAndInstantiateDatabaseImpl$default(Class cls, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "_Impl";
        }
        return findAndInstantiateDatabaseImpl(cls, str);
    }
}
