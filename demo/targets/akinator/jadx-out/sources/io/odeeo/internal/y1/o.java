package io.odeeo.internal.y1;

import android.os.Handler;
import android.os.Looper;
import io.odeeo.internal.y1.c;
import io.odeeo.internal.y1.f;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f67664a = d();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends o {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.y1.o$a$a, reason: collision with other inner class name */
        public static class ExecutorC0695a implements Executor {

            /* renamed from: a, reason: collision with root package name */
            public final Handler f67665a = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f67665a.post(runnable);
            }
        }

        @Override // io.odeeo.internal.y1.o
        public int a() {
            return 2;
        }

        @Override // io.odeeo.internal.y1.o
        public List<? extends f.a> b() {
            return Collections.singletonList(m.f67617a);
        }

        @Override // io.odeeo.internal.y1.o
        public int c() {
            return 1;
        }

        @Override // io.odeeo.internal.y1.o
        public Executor defaultCallbackExecutor() {
            return new ExecutorC0695a();
        }

        @Override // io.odeeo.internal.y1.o
        public boolean a(Method method) {
            return method.isDefault();
        }

        @Override // io.odeeo.internal.y1.o
        public List<? extends c.a> a(Executor executor) {
            if (executor != null) {
                return Arrays.asList(e.f67555a, new g(executor));
            }
            throw new AssertionError();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends o {
        @Override // io.odeeo.internal.y1.o
        public int a() {
            return 2;
        }

        @Override // io.odeeo.internal.y1.o
        public List<? extends f.a> b() {
            return Collections.singletonList(m.f67617a);
        }

        @Override // io.odeeo.internal.y1.o
        public int c() {
            return 1;
        }

        @Override // io.odeeo.internal.y1.o
        public boolean a(Method method) {
            return method.isDefault();
        }

        @Override // io.odeeo.internal.y1.o
        public Object a(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            Constructor declaredConstructor = j1.u.j().getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            return j1.u.g(declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }

        @Override // io.odeeo.internal.y1.o
        public List<? extends c.a> a(Executor executor) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(e.f67555a);
            arrayList.add(new g(executor));
            return Collections.unmodifiableList(arrayList);
        }
    }

    public static o d() throws ClassNotFoundException {
        try {
            try {
                Class.forName("android.os.Build");
                return new a();
            } catch (ClassNotFoundException unused) {
                return new o();
            }
        } catch (ClassNotFoundException unused2) {
            Class.forName("java.util.Optional");
            return new b();
        }
    }

    public static o e() {
        return f67664a;
    }

    public int a() {
        return 1;
    }

    public List<? extends f.a> b() {
        return Collections.EMPTY_LIST;
    }

    public int c() {
        return 0;
    }

    public Executor defaultCallbackExecutor() {
        return null;
    }

    public boolean a(Method method) {
        return false;
    }

    public List<? extends c.a> a(Executor executor) {
        return Collections.singletonList(new g(executor));
    }

    public Object a(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        throw new UnsupportedOperationException();
    }
}
