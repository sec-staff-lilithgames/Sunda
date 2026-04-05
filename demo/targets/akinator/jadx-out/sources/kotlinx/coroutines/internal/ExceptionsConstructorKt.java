package kotlinx.coroutines.internal;

import b1.x;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.CopyableThrowable;
import kv.l;
import tu.a0;
import tu.e0;
import tu.v;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ExceptionsConstructorKt {
    private static final CtorCache ctorCache;
    private static final int throwableFields = fieldsCountOrDefault(Throwable.class, -1);

    static {
        CtorCache ctorCache2;
        try {
            ctorCache2 = FastServiceLoaderKt.getANDROID_DETECTED() ? WeakMapCtorCache.INSTANCE : ClassValueCtorCache.INSTANCE;
        } catch (Throwable unused) {
            ctorCache2 = WeakMapCtorCache.INSTANCE;
        }
        ctorCache = ctorCache2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> l createConstructor(Class<E> cls) throws SecurityException {
        Object next;
        l lVar;
        v vVar;
        ExceptionsConstructorKt$createConstructor$nullResult$1 exceptionsConstructorKt$createConstructor$nullResult$1 = new l() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1
            @Override // kv.l
            public final Void invoke(Throwable th2) {
                return null;
            }
        };
        if (throwableFields == fieldsCountOrDefault(cls, 0)) {
            Constructor<?>[] constructors = cls.getConstructors();
            ArrayList arrayList = new ArrayList(constructors.length);
            int length = constructors.length;
            int i10 = 0;
            while (true) {
                next = null;
                if (i10 >= length) {
                    break;
                }
                final Constructor<?> constructor = constructors[i10];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length2 = parameterTypes.length;
                if (length2 == 0) {
                    final int i11 = 3;
                    vVar = e0.to(safeCtor(new l() { // from class: kotlinx.coroutines.internal.a
                        @Override // kv.l
                        public final Object invoke(Object obj) {
                            switch (i11) {
                                case 0:
                                    return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$1(constructor, (Throwable) obj);
                                case 1:
                                    return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$3(constructor, (Throwable) obj);
                                case 2:
                                    return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$4(constructor, (Throwable) obj);
                                default:
                                    return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$6(constructor, (Throwable) obj);
                            }
                        }
                    }), 0);
                } else if (length2 == 1) {
                    Class<?> cls2 = parameterTypes[0];
                    if (kotlin.jvm.internal.e0.areEqual(cls2, String.class)) {
                        final int i12 = 1;
                        vVar = e0.to(safeCtor(new l() { // from class: kotlinx.coroutines.internal.a
                            @Override // kv.l
                            public final Object invoke(Object obj) {
                                switch (i12) {
                                    case 0:
                                        return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$1(constructor, (Throwable) obj);
                                    case 1:
                                        return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$3(constructor, (Throwable) obj);
                                    case 2:
                                        return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$4(constructor, (Throwable) obj);
                                    default:
                                        return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$6(constructor, (Throwable) obj);
                                }
                            }
                        }), 2);
                    } else if (kotlin.jvm.internal.e0.areEqual(cls2, Throwable.class)) {
                        final int i13 = 2;
                        vVar = e0.to(safeCtor(new l() { // from class: kotlinx.coroutines.internal.a
                            @Override // kv.l
                            public final Object invoke(Object obj) {
                                switch (i13) {
                                    case 0:
                                        return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$1(constructor, (Throwable) obj);
                                    case 1:
                                        return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$3(constructor, (Throwable) obj);
                                    case 2:
                                        return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$4(constructor, (Throwable) obj);
                                    default:
                                        return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$6(constructor, (Throwable) obj);
                                }
                            }
                        }), 1);
                    } else {
                        vVar = e0.to(null, -1);
                    }
                } else if (length2 != 2) {
                    vVar = e0.to(null, -1);
                } else if (kotlin.jvm.internal.e0.areEqual(parameterTypes[0], String.class) && kotlin.jvm.internal.e0.areEqual(parameterTypes[1], Throwable.class)) {
                    final int i14 = 0;
                    vVar = e0.to(safeCtor(new l() { // from class: kotlinx.coroutines.internal.a
                        @Override // kv.l
                        public final Object invoke(Object obj) {
                            switch (i14) {
                                case 0:
                                    return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$1(constructor, (Throwable) obj);
                                case 1:
                                    return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$3(constructor, (Throwable) obj);
                                case 2:
                                    return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$4(constructor, (Throwable) obj);
                                default:
                                    return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$6(constructor, (Throwable) obj);
                            }
                        }
                    }), 3);
                } else {
                    vVar = e0.to(null, -1);
                }
                arrayList.add(vVar);
                i10++;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iIntValue = ((Number) ((v) next).getSecond()).intValue();
                    do {
                        Object next2 = it.next();
                        int iIntValue2 = ((Number) ((v) next2).getSecond()).intValue();
                        if (iIntValue < iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it.hasNext());
                }
            }
            v vVar2 = (v) next;
            if (vVar2 != null && (lVar = (l) vVar2.getFirst()) != null) {
                return lVar;
            }
        }
        return exceptionsConstructorKt$createConstructor$nullResult$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$1(Constructor constructor, Throwable th2) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th2.getMessage(), th2);
        kotlin.jvm.internal.e0.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
        return (Throwable) objNewInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$3(Constructor constructor, Throwable th2) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th2.getMessage());
        kotlin.jvm.internal.e0.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
        Throwable th3 = (Throwable) objNewInstance;
        th3.initCause(th2);
        return th3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$4(Constructor constructor, Throwable th2) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th2);
        kotlin.jvm.internal.e0.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
        return (Throwable) objNewInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$6(Constructor constructor, Throwable th2) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(null);
        kotlin.jvm.internal.e0.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
        Throwable th3 = (Throwable) objNewInstance;
        th3.initCause(th2);
        return th3;
    }

    private static final int fieldsCount(Class<?> cls, int i10) {
        do {
            int i11 = 0;
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    i11++;
                }
            }
            i10 += i11;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i10;
    }

    public static /* synthetic */ int fieldsCount$default(Class cls, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return fieldsCount(cls, i10);
    }

    private static final int fieldsCountOrDefault(Class<?> cls, int i10) {
        Object objM7131constructorimpl;
        jv.a.getKotlinClass(cls);
        try {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(Integer.valueOf(fieldsCount$default(cls, 0, 1, null)));
        } catch (Throwable th2) {
            int i12 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        Integer numValueOf = Integer.valueOf(i10);
        if (z.m7136isFailureimpl(objM7131constructorimpl)) {
            objM7131constructorimpl = numValueOf;
        }
        return ((Number) objM7131constructorimpl).intValue();
    }

    private static final l safeCtor(l lVar) {
        return new x(1, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable safeCtor$lambda$9(l lVar, Throwable th2) {
        Object objM7131constructorimpl;
        try {
            int i10 = z.f87419c;
            Throwable th3 = (Throwable) lVar.invoke(th2);
            if (!kotlin.jvm.internal.e0.areEqual(th2.getMessage(), th3.getMessage()) && !kotlin.jvm.internal.e0.areEqual(th3.getMessage(), th2.toString())) {
                th3 = null;
            }
            objM7131constructorimpl = z.m7131constructorimpl(th3);
        } catch (Throwable th4) {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th4));
        }
        return (Throwable) (z.m7136isFailureimpl(objM7131constructorimpl) ? null : objM7131constructorimpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends Throwable> E tryCopyException(E e10) {
        Object objM7131constructorimpl;
        if (!(e10 instanceof CopyableThrowable)) {
            return (E) ctorCache.get(e10.getClass()).invoke(e10);
        }
        try {
            int i10 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(((CopyableThrowable) e10).createCopy());
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        if (z.m7136isFailureimpl(objM7131constructorimpl)) {
            objM7131constructorimpl = null;
        }
        return (E) objM7131constructorimpl;
    }
}
