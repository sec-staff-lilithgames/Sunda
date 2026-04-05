package vw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class t2 {

    /* renamed from: a, reason: collision with root package name */
    public final a f90102a;

    public t2(t0 t0Var, v4 v4Var) {
        this.f90102a = new a(t0Var, v4Var);
    }

    public static w2 a(Method method) {
        String name = method.getName();
        return name.startsWith("get") ? w2.GET : name.startsWith("is") ? w2.IS : name.startsWith("set") ? w2.SET : w2.NONE;
    }

    public static r2 b(Method method, w2 w2Var) throws q2 {
        Class<?>[] parameterTypes = method.getParameterTypes();
        String name = method.getName();
        if (parameterTypes.length != 0) {
            throw new q2("Get method %s is not a valid property", method);
        }
        int prefix = w2Var.getPrefix();
        int length = name.length();
        if (length > prefix) {
            name = name.substring(prefix, length);
        }
        String name2 = b4.getName(name);
        if (name2 != null) {
            return new r2(method, w2Var, name2);
        }
        throw new q2("Could not get name for %s", method);
    }

    public s2 getInstance(Method method, Annotation annotation, Annotation[] annotationArr) throws Exception {
        r2 r2Var;
        w2 w2VarA = a(method);
        w2 w2Var = w2.GET;
        w2 w2Var2 = w2.SET;
        if (w2VarA == w2Var || w2VarA == w2.IS) {
            r2Var = b(method, w2VarA);
        } else {
            if (w2VarA != w2Var2) {
                throw new q2("Annotation %s must mark a set or get method", annotation);
            }
            Class<?>[] parameterTypes = method.getParameterTypes();
            String name = method.getName();
            if (parameterTypes.length != 1) {
                throw new q2("Set method %s is not a valid property", method);
            }
            int prefix = w2VarA.getPrefix();
            int length = name.length();
            if (length > prefix) {
                name = name.substring(prefix, length);
            }
            String name2 = b4.getName(name);
            if (name2 == null) {
                throw new q2("Could not get name for %s", method);
            }
            r2Var = new r2(method, w2VarA, name2);
        }
        return r2Var.getType() == w2Var2 ? new n4(r2Var, annotation, annotationArr) : new x1(r2Var, annotation, annotationArr);
    }

    public Class getType(Method method) throws Exception {
        w2 w2VarA = a(method);
        if (w2VarA == w2.SET) {
            if (method.getParameterTypes().length == 1) {
                return method.getParameterTypes()[0];
            }
        } else {
            if (w2VarA == w2.GET) {
                if (method.getParameterTypes().length == 0) {
                    return method.getReturnType();
                }
                return null;
            }
            if (w2VarA == w2.IS && method.getParameterTypes().length == 0) {
                return method.getReturnType();
            }
        }
        return null;
    }

    public s2 getInstance(Method method, Annotation[] annotationArr) throws Exception {
        Class[] returnDependents;
        w2 w2VarA = a(method);
        if (w2VarA == w2.SET) {
            returnDependents = b4.getParameterDependents(method, 0);
        } else {
            returnDependents = (w2VarA == w2.GET || w2VarA == w2.IS) ? b4.getReturnDependents(method) : null;
        }
        Class type = getType(method);
        Annotation aVar = type != null ? this.f90102a.getInstance(type, returnDependents) : null;
        if (aVar != null) {
            return getInstance(method, aVar, annotationArr);
        }
        return null;
    }
}
