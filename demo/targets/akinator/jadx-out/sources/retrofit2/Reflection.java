package retrofit2;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
class Reflection {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Android24 extends Reflection {
        @Override // retrofit2.Reflection
        public Object invokeDefaultMethod(Method method, Class<?> cls, Object obj, Object[] objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return DefaultMethodSupport.invoke(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }

        @Override // retrofit2.Reflection
        public boolean isDefaultMethod(Method method) {
            return method.isDefault();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Java8 extends Reflection {
        @Override // retrofit2.Reflection
        public String describeMethodParameter(Method method, int i10) {
            Parameter parameter = method.getParameters()[i10];
            if (!parameter.isNamePresent()) {
                return super.describeMethodParameter(method, i10);
            }
            return "parameter '" + parameter.getName() + '\'';
        }

        @Override // retrofit2.Reflection
        public Object invokeDefaultMethod(Method method, Class<?> cls, Object obj, Object[] objArr) throws Throwable {
            return DefaultMethodSupport.invoke(method, cls, obj, objArr);
        }

        @Override // retrofit2.Reflection
        public boolean isDefaultMethod(Method method) {
            return method.isDefault();
        }
    }

    public String describeMethodParameter(Method method, int i10) {
        return "parameter #" + (i10 + 1);
    }

    public Object invokeDefaultMethod(Method method, Class<?> cls, Object obj, Object[] objArr) throws Throwable {
        throw new AssertionError();
    }

    public boolean isDefaultMethod(Method method) {
        return false;
    }
}
