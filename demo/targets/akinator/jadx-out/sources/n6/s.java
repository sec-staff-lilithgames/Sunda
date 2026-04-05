package n6;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final String f75780a;

    static {
        String strTagWithPrefix = c0.tagWithPrefix("InputMerger");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(...)");
        f75780a = strTagWithPrefix;
    }

    public static final q fromClassName(String className) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        kotlin.jvm.internal.e0.checkNotNullParameter(className, "className");
        try {
            Object objNewInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
            kotlin.jvm.internal.e0.checkNotNull(objNewInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
            return (q) objNewInstance;
        } catch (Exception e10) {
            c0.get().error(f75780a, "Trouble instantiating " + className, e10);
            return null;
        }
    }
}
