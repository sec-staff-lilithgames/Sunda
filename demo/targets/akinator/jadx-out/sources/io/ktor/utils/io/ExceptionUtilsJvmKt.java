package io.ktor.utils.io;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import jv.a;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.CopyableThrowable;
import kv.l;
import tu.a0;
import tu.z;
import uu.k0;
import xu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ExceptionUtilsJvmKt {
    private static final int throwableFields = fieldsCountOrDefault(Throwable.class, -1);
    private static final ReentrantReadWriteLock cacheLock = new ReentrantReadWriteLock();
    private static final WeakHashMap<Class<? extends Throwable>, l> exceptionCtors = new WeakHashMap<>();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.utils.io.ExceptionUtilsJvmKt$safeCtor$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        final /* synthetic */ l $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l lVar) {
            super(1);
            this.$block = lVar;
        }

        @Override // kv.l
        public final Throwable invoke(Throwable e10) {
            Object objM7131constructorimpl;
            e0.checkNotNullParameter(e10, "e");
            l lVar = this.$block;
            try {
                int i10 = z.f87419c;
                objM7131constructorimpl = z.m7131constructorimpl((Throwable) lVar.invoke(e10));
            } catch (Throwable th2) {
                int i11 = z.f87419c;
                objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
            }
            if (z.m7136isFailureimpl(objM7131constructorimpl)) {
                objM7131constructorimpl = null;
            }
            return (Throwable) objM7131constructorimpl;
        }
    }

    private static final l createConstructor(Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new ExceptionUtilsJvmKt$createConstructor$$inlined$safeCtor$4(constructor);
        }
        if (length != 1) {
            if (length == 2 && e0.areEqual(parameterTypes[0], String.class) && e0.areEqual(parameterTypes[1], Throwable.class)) {
                return new ExceptionUtilsJvmKt$createConstructor$$inlined$safeCtor$1(constructor);
            }
            return null;
        }
        Class<?> cls = parameterTypes[0];
        if (e0.areEqual(cls, Throwable.class)) {
            return new ExceptionUtilsJvmKt$createConstructor$$inlined$safeCtor$2(constructor);
        }
        if (e0.areEqual(cls, String.class)) {
            return new ExceptionUtilsJvmKt$createConstructor$$inlined$safeCtor$3(constructor);
        }
        return null;
    }

    private static final int fieldsCount(Class<?> cls, int i10) {
        do {
            Field[] declaredFields = cls.getDeclaredFields();
            e0.checkNotNullExpressionValue(declaredFields, "declaredFields");
            int i11 = 0;
            for (Field field : declaredFields) {
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
        a.getKotlinClass(cls);
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

    public static final void printStack(Throwable th2) {
        e0.checkNotNullParameter(th2, "<this>");
        th2.printStackTrace();
    }

    private static final l safeCtor(l lVar) {
        return new AnonymousClass1(lVar);
    }

    public static final <E extends Throwable> E tryCopyException(E exception, Throwable cause) throws SecurityException {
        Object objM7131constructorimpl;
        e0.checkNotNullParameter(exception, "exception");
        e0.checkNotNullParameter(cause, "cause");
        if (exception instanceof CopyableThrowable) {
            try {
                int i10 = z.f87419c;
                objM7131constructorimpl = z.m7131constructorimpl(((CopyableThrowable) exception).createCopy());
            } catch (Throwable th2) {
                int i11 = z.f87419c;
                objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
            }
            return (E) (z.m7136isFailureimpl(objM7131constructorimpl) ? null : objM7131constructorimpl);
        }
        ReentrantReadWriteLock reentrantReadWriteLock = cacheLock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            l lVar = exceptionCtors.get(exception.getClass());
            if (lVar != null) {
                return (E) lVar.invoke(exception);
            }
            int i12 = 0;
            if (throwableFields != fieldsCountOrDefault(exception.getClass(), 0)) {
                ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i13 = 0; i13 < readHoldCount; i13++) {
                    lock2.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    exceptionCtors.put(exception.getClass(), ExceptionUtilsJvmKt$tryCopyException$4$1.INSTANCE);
                    return null;
                } finally {
                    while (i12 < readHoldCount) {
                        lock2.lock();
                        i12++;
                    }
                    writeLock.unlock();
                }
            }
            Constructor<?>[] constructors = exception.getClass().getConstructors();
            e0.checkNotNullExpressionValue(constructors, "exception.javaClass.constructors");
            l lVarCreateConstructor = null;
            for (Constructor constructor : k0.sortedWith(constructors, new Comparator() { // from class: io.ktor.utils.io.ExceptionUtilsJvmKt$tryCopyException$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return d.compareValues(Integer.valueOf(((Constructor) t11).getParameterTypes().length), Integer.valueOf(((Constructor) t10).getParameterTypes().length));
                }
            })) {
                e0.checkNotNullExpressionValue(constructor, "constructor");
                lVarCreateConstructor = createConstructor(constructor);
                if (lVarCreateConstructor != null) {
                    break;
                }
            }
            ReentrantReadWriteLock reentrantReadWriteLock2 = cacheLock;
            ReentrantReadWriteLock.ReadLock lock3 = reentrantReadWriteLock2.readLock();
            int readHoldCount2 = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
            for (int i14 = 0; i14 < readHoldCount2; i14++) {
                lock3.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock2.writeLock();
            writeLock2.lock();
            try {
                exceptionCtors.put(exception.getClass(), lVarCreateConstructor == null ? ExceptionUtilsJvmKt$tryCopyException$5$1.INSTANCE : lVarCreateConstructor);
                while (i12 < readHoldCount2) {
                    lock3.lock();
                    i12++;
                }
                writeLock2.unlock();
                if (lVarCreateConstructor != null) {
                    return (E) lVarCreateConstructor.invoke(cause);
                }
                return null;
            } catch (Throwable th3) {
                while (i12 < readHoldCount2) {
                    lock3.lock();
                    i12++;
                }
                writeLock2.unlock();
                throw th3;
            }
        } finally {
            lock.unlock();
        }
    }
}
