package a2;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class z3 {
    public static final Object nativeClass(Object obj) {
        kotlin.jvm.internal.e0.checkNotNullParameter(obj, "<this>");
        return obj.getClass();
    }

    public static final String simpleIdentityToString(Object obj, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(obj, "obj");
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        StringBuilder sbS = a.b.s(str, '@');
        String str2 = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "format(format, *args)");
        sbS.append(str2);
        return sbS.toString();
    }

    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m65synchronized(Object lock, kv.a block) {
        R r10;
        kotlin.jvm.internal.e0.checkNotNullParameter(lock, "lock");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        synchronized (lock) {
            try {
                r10 = (R) block.invoke();
                kotlin.jvm.internal.b0.finallyStart(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.b0.finallyStart(1);
                kotlin.jvm.internal.b0.finallyEnd(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.b0.finallyEnd(1);
        return r10;
    }
}
