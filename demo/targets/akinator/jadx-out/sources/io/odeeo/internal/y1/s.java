package io.odeeo.internal.y1;

import io.odeeo.internal.y1.a;
import io.odeeo.internal.y1.c;
import io.odeeo.internal.y1.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import xv.g0;
import xv.l0;
import xv.u0;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Method, t<?>> f67720a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final xv.i f67721b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f67722c;

    /* renamed from: d, reason: collision with root package name */
    public final List<f.a> f67723d;

    /* renamed from: e, reason: collision with root package name */
    public final List<c.a> f67724e;

    /* renamed from: f, reason: collision with root package name */
    public final Executor f67725f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f67726g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public final o f67727a = o.e();

        /* renamed from: b, reason: collision with root package name */
        public final Object[] f67728b = new Object[0];

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Class f67729c;

        public a(Class cls) {
            this.f67729c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (this.f67727a.a(method)) {
                return this.f67727a.a(method, this.f67729c, obj, objArr);
            }
            t<?> tVarA = s.this.a(method);
            if (objArr == null) {
                objArr = this.f67728b;
            }
            return tVarA.a(objArr);
        }
    }

    public s(xv.i iVar, g0 g0Var, List<f.a> list, List<c.a> list2, Executor executor, boolean z10) {
        this.f67721b = iVar;
        this.f67722c = g0Var;
        this.f67723d = list;
        this.f67724e = list2;
        this.f67725f = executor;
        this.f67726g = z10;
    }

    public final void a(Class<?> cls) throws SecurityException {
        o oVarE = o.e();
        for (Method method : cls.getDeclaredMethods()) {
            if (!oVarE.a(method) && !Modifier.isStatic(method.getModifiers())) {
                a(method);
            }
        }
    }

    public g0 baseUrl() {
        return this.f67722c;
    }

    public c<?, ?> callAdapter(Type type, Annotation[] annotationArr) {
        return nextCallAdapter(null, type, annotationArr);
    }

    public List<c.a> callAdapterFactories() {
        return this.f67724e;
    }

    public xv.i callFactory() {
        return this.f67721b;
    }

    public Executor callbackExecutor() {
        return this.f67725f;
    }

    public List<f.a> converterFactories() {
        return this.f67723d;
    }

    public <T> T create(Class<T> cls) throws SecurityException {
        w.a((Class) cls);
        if (this.f67726g) {
            a((Class<?>) cls);
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    public b newBuilder() {
        return new b(this);
    }

    public c<?, ?> nextCallAdapter(c.a aVar, Type type, Annotation[] annotationArr) {
        w.a(type, "returnType == null");
        w.a(annotationArr, "annotations == null");
        int iIndexOf = this.f67724e.indexOf(aVar) + 1;
        int size = this.f67724e.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            c<?, ?> cVar = this.f67724e.get(i10).get(type, annotationArr, this);
            if (cVar != null) {
                return cVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f67724e.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f67724e.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f67724e.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> f<T, u0> nextRequestBodyConverter(f.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        w.a(type, "type == null");
        w.a(annotationArr, "parameterAnnotations == null");
        w.a(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f67723d.indexOf(aVar) + 1;
        int size = this.f67723d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            f<T, u0> fVar = (f<T, u0>) this.f67723d.get(i10).requestBodyConverter(type, annotationArr, annotationArr2, this);
            if (fVar != null) {
                return fVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f67723d.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f67723d.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f67723d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> f<w0, T> nextResponseBodyConverter(f.a aVar, Type type, Annotation[] annotationArr) {
        w.a(type, "type == null");
        w.a(annotationArr, "annotations == null");
        int iIndexOf = this.f67723d.indexOf(aVar) + 1;
        int size = this.f67723d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            f<w0, T> fVar = (f<w0, T>) this.f67723d.get(i10).responseBodyConverter(type, annotationArr, this);
            if (fVar != null) {
                return fVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f67723d.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f67723d.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f67723d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> f<T, u0> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return nextRequestBodyConverter(null, type, annotationArr, annotationArr2);
    }

    public <T> f<w0, T> responseBodyConverter(Type type, Annotation[] annotationArr) {
        return nextResponseBodyConverter(null, type, annotationArr);
    }

    public <T> f<T, String> stringConverter(Type type, Annotation[] annotationArr) {
        w.a(type, "type == null");
        w.a(annotationArr, "annotations == null");
        int size = this.f67723d.size();
        for (int i10 = 0; i10 < size; i10++) {
            f<T, String> fVar = (f<T, String>) this.f67723d.get(i10).stringConverter(type, annotationArr, this);
            if (fVar != null) {
                return fVar;
            }
        }
        return a.d.f67552a;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final o f67731a;

        /* renamed from: b, reason: collision with root package name */
        public xv.i f67732b;

        /* renamed from: c, reason: collision with root package name */
        public g0 f67733c;

        /* renamed from: d, reason: collision with root package name */
        public final List<f.a> f67734d;

        /* renamed from: e, reason: collision with root package name */
        public final List<c.a> f67735e;

        /* renamed from: f, reason: collision with root package name */
        public Executor f67736f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f67737g;

        public b(o oVar) {
            this.f67734d = new ArrayList();
            this.f67735e = new ArrayList();
            this.f67731a = oVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b addCallAdapterFactory(c.a aVar) {
            this.f67735e.add(w.a(aVar, "factory == null"));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b addConverterFactory(f.a aVar) {
            this.f67734d.add(w.a(aVar, "factory == null"));
            return this;
        }

        public b baseUrl(URL url) {
            w.a(url, "baseUrl == null");
            return baseUrl(g0.get(url.toString()));
        }

        public s build() {
            if (this.f67733c == null) {
                throw new IllegalStateException("Base URL required.");
            }
            xv.i l0Var = this.f67732b;
            if (l0Var == null) {
                l0Var = new l0();
            }
            xv.i iVar = l0Var;
            Executor executorDefaultCallbackExecutor = this.f67736f;
            if (executorDefaultCallbackExecutor == null) {
                executorDefaultCallbackExecutor = this.f67731a.defaultCallbackExecutor();
            }
            Executor executor = executorDefaultCallbackExecutor;
            ArrayList arrayList = new ArrayList(this.f67735e);
            arrayList.addAll(this.f67731a.a(executor));
            ArrayList arrayList2 = new ArrayList(this.f67731a.c() + this.f67734d.size() + 1);
            arrayList2.add(new io.odeeo.internal.y1.a());
            arrayList2.addAll(this.f67734d);
            arrayList2.addAll(this.f67731a.b());
            return new s(iVar, this.f67733c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor, this.f67737g);
        }

        public List<c.a> callAdapterFactories() {
            return this.f67735e;
        }

        public b callFactory(xv.i iVar) {
            this.f67732b = (xv.i) w.a(iVar, "factory == null");
            return this;
        }

        public b callbackExecutor(Executor executor) {
            this.f67736f = (Executor) w.a(executor, "executor == null");
            return this;
        }

        public b client(l0 l0Var) {
            return callFactory((xv.i) w.a(l0Var, "client == null"));
        }

        public List<f.a> converterFactories() {
            return this.f67734d;
        }

        public b validateEagerly(boolean z10) {
            this.f67737g = z10;
            return this;
        }

        public b baseUrl(String str) {
            w.a(str, "baseUrl == null");
            return baseUrl(g0.get(str));
        }

        public b() {
            this(o.e());
        }

        public b baseUrl(g0 g0Var) {
            w.a(g0Var, "baseUrl == null");
            if ("".equals(g0Var.pathSegments().get(r0.size() - 1))) {
                this.f67733c = g0Var;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + g0Var);
        }

        public b(s sVar) {
            this.f67734d = new ArrayList();
            this.f67735e = new ArrayList();
            o oVarE = o.e();
            this.f67731a = oVarE;
            this.f67732b = sVar.f67721b;
            this.f67733c = sVar.f67722c;
            int size = sVar.f67723d.size() - oVarE.c();
            for (int i10 = 1; i10 < size; i10++) {
                this.f67734d.add(sVar.f67723d.get(i10));
            }
            int size2 = sVar.f67724e.size() - this.f67731a.a();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f67735e.add(sVar.f67724e.get(i11));
            }
            this.f67736f = sVar.f67725f;
            this.f67737g = sVar.f67726g;
        }
    }

    public t<?> a(Method method) {
        t<?> tVarA;
        t<?> tVar = this.f67720a.get(method);
        if (tVar != null) {
            return tVar;
        }
        synchronized (this.f67720a) {
            try {
                tVarA = this.f67720a.get(method);
                if (tVarA == null) {
                    tVarA = t.a(this, method);
                    this.f67720a.put(method, tVarA);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVarA;
    }
}
