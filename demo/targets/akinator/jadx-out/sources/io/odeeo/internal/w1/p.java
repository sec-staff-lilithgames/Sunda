package io.odeeo.internal.w1;

import android.view.View;
import com.unity3d.services.core.fid.Constants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static Object f67476d;

    /* renamed from: a, reason: collision with root package name */
    public static final p f67473a = new p();

    /* renamed from: b, reason: collision with root package name */
    public static final tu.o f67474b = q.lazy(d.f67482a);

    /* renamed from: c, reason: collision with root package name */
    public static final tu.o f67475c = q.lazy(a.f67479a);

    /* renamed from: e, reason: collision with root package name */
    public static final tu.o f67477e = q.lazy(c.f67481a);

    /* renamed from: f, reason: collision with root package name */
    public static final tu.o f67478f = q.lazy(b.f67480a);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f67479a = new a();

        public a() {
            super(0);
        }

        @Override // kv.a
        public final Method invoke() {
            return p.f67473a.getWmgClass().getMethod(Constants.GET_INSTANCE, null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f67480a = new b();

        public b() {
            super(0);
        }

        @Override // kv.a
        public final Method invoke() {
            return p.f67473a.getWmgClass().getMethod("getRootView", String.class);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f67481a = new c();

        public c() {
            super(0);
        }

        @Override // kv.a
        public final Method invoke() {
            return p.f67473a.getWmgClass().getMethod("getViewRootNames", null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f67482a = new d();

        public d() {
            super(0);
        }

        @Override // kv.a
        public final Class<?> invoke() {
            return Class.forName("android.view.WindowManagerGlobal");
        }
    }

    public final Method getGetInstanceMethod() {
        return (Method) f67475c.getValue();
    }

    public final Method getGetRootViewMethod() {
        return (Method) f67478f.getValue();
    }

    public final Method getGetViewRootNamesMethod() {
        return (Method) f67477e.getValue();
    }

    public final View getRootView(String rootViewName) {
        e0.checkNotNullParameter(rootViewName, "rootViewName");
        try {
            return (View) getGetRootViewMethod().invoke(getWmgInstance(), rootViewName);
        } catch (Exception e10) {
            io.odeeo.internal.b2.a.e(e0.stringPlus("Failed to get root view for ", rootViewName), e10);
            return null;
        }
    }

    public final String[] getRootViewNames() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = getGetViewRootNamesMethod().invoke(getWmgInstance(), null);
            if (objInvoke != null) {
                return (String[]) objInvoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        } catch (Exception e10) {
            io.odeeo.internal.b2.a.e("Failed to fetch root view names", e10);
            return new String[0];
        }
    }

    public final Class<?> getWmgClass() {
        return (Class) f67474b.getValue();
    }

    public final Object getWmgGlobalInstance() {
        return f67476d;
    }

    public final Object getWmgInstance() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object obj = f67476d;
        if (obj != null) {
            return obj;
        }
        Object objInvoke = getGetInstanceMethod().invoke(null, null);
        f67473a.setWmgGlobalInstance(objInvoke);
        e0.checkNotNullExpressionValue(objInvoke, "getInstanceMethod.invoke… wmgGlobalInstance = it }");
        return objInvoke;
    }

    public final void setWmgGlobalInstance(Object obj) {
        f67476d = obj;
    }
}
