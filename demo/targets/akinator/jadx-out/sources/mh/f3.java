package mh;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f3 extends AbstractList {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f74620b;

    public f3(Throwable th2) {
        this.f74620b = th2;
    }

    @Override // java.util.AbstractList, java.util.List
    public StackTraceElement get(int i10) {
        Method method = g3.f74623b;
        Objects.requireNonNull(method);
        Object obj = g3.f74622a;
        Objects.requireNonNull(obj);
        try {
            return (StackTraceElement) method.invoke(obj, this.f74620b, Integer.valueOf(i10));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw g3.propagate(e11.getCause());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        Method method = g3.f74624c;
        Objects.requireNonNull(method);
        Object obj = g3.f74622a;
        Objects.requireNonNull(obj);
        try {
            return ((Integer) method.invoke(obj, this.f74620b)).intValue();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw g3.propagate(e11.getCause());
        }
    }
}
