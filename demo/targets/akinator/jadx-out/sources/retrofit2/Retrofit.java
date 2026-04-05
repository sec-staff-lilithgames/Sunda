package retrofit2;

import ao.kwoC.zAQQWzBxnS;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import retrofit2.BuiltInConverters;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import xv.g0;
import xv.i;
import xv.l0;
import xv.u0;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Retrofit {
    final g0 baseUrl;
    final List<CallAdapter.Factory> callAdapterFactories;
    final i callFactory;
    final Executor callbackExecutor;
    final List<Converter.Factory> converterFactories;
    final int defaultCallAdapterFactoriesSize;
    final int defaultConverterFactoriesSize;
    private final ConcurrentHashMap<Method, Object> serviceMethodCache = new ConcurrentHashMap<>();
    final boolean validateEagerly;

    public Retrofit(i iVar, g0 g0Var, List<Converter.Factory> list, int i10, List<CallAdapter.Factory> list2, int i11, Executor executor, boolean z10) {
        this.callFactory = iVar;
        this.baseUrl = g0Var;
        this.converterFactories = list;
        this.defaultConverterFactoriesSize = i10;
        this.callAdapterFactories = list2;
        this.defaultCallAdapterFactoriesSize = i11;
        this.callbackExecutor = executor;
        this.validateEagerly = z10;
    }

    private void validateServiceInterface(Class<?> cls) throws SecurityException {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<?> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                sb2.append(cls2.getName());
                if (cls2 != cls) {
                    sb2.append(" which is an interface of ");
                    sb2.append(cls.getName());
                }
                throw new IllegalArgumentException(sb2.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.validateEagerly) {
            Reflection reflection = Platform.reflection;
            for (Method method : cls.getDeclaredMethods()) {
                if (!reflection.isDefaultMethod(method) && !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
                    loadServiceMethod(cls, method);
                }
            }
        }
    }

    public g0 baseUrl() {
        return this.baseUrl;
    }

    public CallAdapter<?, ?> callAdapter(Type type, Annotation[] annotationArr) {
        return nextCallAdapter(null, type, annotationArr);
    }

    public List<CallAdapter.Factory> callAdapterFactories() {
        return this.callAdapterFactories;
    }

    public i callFactory() {
        return this.callFactory;
    }

    public Executor callbackExecutor() {
        return this.callbackExecutor;
    }

    public List<Converter.Factory> converterFactories() {
        return this.converterFactories;
    }

    public <T> T create(final Class<T> cls) throws SecurityException {
        validateServiceInterface(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: retrofit2.Retrofit.1
            private final Object[] emptyArgs = new Object[0];

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                if (objArr == null) {
                    objArr = this.emptyArgs;
                }
                Reflection reflection = Platform.reflection;
                return reflection.isDefaultMethod(method) ? reflection.invokeDefaultMethod(method, cls, obj, objArr) : Retrofit.this.loadServiceMethod(cls, method).invoke(obj, objArr);
            }
        });
    }

    public ServiceMethod<?> loadServiceMethod(Class<?> cls, Method method) {
        while (true) {
            Object objPutIfAbsent = this.serviceMethodCache.get(method);
            if (objPutIfAbsent instanceof ServiceMethod) {
                return (ServiceMethod) objPutIfAbsent;
            }
            if (objPutIfAbsent == null) {
                Object obj = new Object();
                synchronized (obj) {
                    try {
                        objPutIfAbsent = this.serviceMethodCache.putIfAbsent(method, obj);
                        if (objPutIfAbsent == null) {
                            try {
                                ServiceMethod<?> annotations = ServiceMethod.parseAnnotations(this, cls, method);
                                this.serviceMethodCache.put(method, annotations);
                                return annotations;
                            } catch (Throwable th2) {
                                this.serviceMethodCache.remove(method);
                                throw th2;
                            }
                        }
                    } finally {
                    }
                }
            }
            synchronized (objPutIfAbsent) {
                try {
                    Object obj2 = this.serviceMethodCache.get(method);
                    if (obj2 != null) {
                        return (ServiceMethod) obj2;
                    }
                } finally {
                }
            }
        }
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public <T> Converter<T, u0> nextRequestBodyConverter(Converter.Factory factory, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.converterFactories.indexOf(factory) + 1;
        int size = this.converterFactories.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            Converter<T, u0> converter = (Converter<T, u0>) this.converterFactories.get(i10).requestBodyConverter(type, annotationArr, annotationArr2, this);
            if (converter != null) {
                return converter;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (factory != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.converterFactories.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.converterFactories.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.converterFactories.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> Converter<w0, T> nextResponseBodyConverter(Converter.Factory factory, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.converterFactories.indexOf(factory) + 1;
        int size = this.converterFactories.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            Converter<w0, T> converter = (Converter<w0, T>) this.converterFactories.get(i10).responseBodyConverter(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (factory != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.converterFactories.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.converterFactories.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.converterFactories.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> Converter<T, u0> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return nextRequestBodyConverter(null, type, annotationArr, annotationArr2);
    }

    public <T> Converter<w0, T> responseBodyConverter(Type type, Annotation[] annotationArr) {
        return nextResponseBodyConverter(null, type, annotationArr);
    }

    public <T> Converter<T, String> stringConverter(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.converterFactories.size();
        for (int i10 = 0; i10 < size; i10++) {
            Converter<T, String> converter = (Converter<T, String>) this.converterFactories.get(i10).stringConverter(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
        }
        return BuiltInConverters.ToStringConverter.INSTANCE;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {
        private g0 baseUrl;
        private i callFactory;
        private Executor callbackExecutor;
        private boolean validateEagerly;
        private final List<Converter.Factory> converterFactories = new ArrayList();
        private final List<CallAdapter.Factory> callAdapterFactories = new ArrayList();

        public Builder() {
        }

        public Builder addCallAdapterFactory(CallAdapter.Factory factory) {
            List<CallAdapter.Factory> list = this.callAdapterFactories;
            Objects.requireNonNull(factory, "factory == null");
            list.add(factory);
            return this;
        }

        public Builder addConverterFactory(Converter.Factory factory) {
            List<Converter.Factory> list = this.converterFactories;
            Objects.requireNonNull(factory, "factory == null");
            list.add(factory);
            return this;
        }

        public Builder baseUrl(URL url) {
            Objects.requireNonNull(url, "baseUrl == null");
            return baseUrl(g0.get(url.toString()));
        }

        public Retrofit build() {
            if (this.baseUrl == null) {
                throw new IllegalStateException("Base URL required.");
            }
            i l0Var = this.callFactory;
            if (l0Var == null) {
                l0Var = new l0();
            }
            i iVar = l0Var;
            Executor executor = this.callbackExecutor;
            if (executor == null) {
                executor = Platform.callbackExecutor;
            }
            Executor executor2 = executor;
            BuiltInFactories builtInFactories = Platform.builtInFactories;
            ArrayList arrayList = new ArrayList(this.callAdapterFactories);
            List<? extends CallAdapter.Factory> listCreateDefaultCallAdapterFactories = builtInFactories.createDefaultCallAdapterFactories(executor2);
            arrayList.addAll(listCreateDefaultCallAdapterFactories);
            List<? extends Converter.Factory> listCreateDefaultConverterFactories = builtInFactories.createDefaultConverterFactories();
            int size = listCreateDefaultConverterFactories.size();
            ArrayList arrayList2 = new ArrayList(this.converterFactories.size() + 1 + size);
            arrayList2.add(new BuiltInConverters());
            arrayList2.addAll(this.converterFactories);
            arrayList2.addAll(listCreateDefaultConverterFactories);
            return new Retrofit(iVar, this.baseUrl, Collections.unmodifiableList(arrayList2), size, Collections.unmodifiableList(arrayList), listCreateDefaultCallAdapterFactories.size(), executor2, this.validateEagerly);
        }

        public List<CallAdapter.Factory> callAdapterFactories() {
            return this.callAdapterFactories;
        }

        public Builder callFactory(i iVar) {
            Objects.requireNonNull(iVar, "factory == null");
            this.callFactory = iVar;
            return this;
        }

        public Builder callbackExecutor(Executor executor) {
            Objects.requireNonNull(executor, "executor == null");
            this.callbackExecutor = executor;
            return this;
        }

        public Builder client(l0 l0Var) {
            Objects.requireNonNull(l0Var, "client == null");
            return callFactory(l0Var);
        }

        public List<Converter.Factory> converterFactories() {
            return this.converterFactories;
        }

        public Builder validateEagerly(boolean z10) {
            this.validateEagerly = z10;
            return this;
        }

        public Builder baseUrl(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return baseUrl(g0.get(str));
        }

        public Builder(Retrofit retrofit) {
            this.callFactory = retrofit.callFactory;
            this.baseUrl = retrofit.baseUrl;
            int size = retrofit.converterFactories.size() - retrofit.defaultConverterFactoriesSize;
            for (int i10 = 1; i10 < size; i10++) {
                this.converterFactories.add(retrofit.converterFactories.get(i10));
            }
            int size2 = retrofit.callAdapterFactories.size() - retrofit.defaultCallAdapterFactoriesSize;
            for (int i11 = 0; i11 < size2; i11++) {
                this.callAdapterFactories.add(retrofit.callAdapterFactories.get(i11));
            }
            this.callbackExecutor = retrofit.callbackExecutor;
            this.validateEagerly = retrofit.validateEagerly;
        }

        public Builder baseUrl(g0 g0Var) {
            Objects.requireNonNull(g0Var, "baseUrl == null");
            if ("".equals(g0Var.pathSegments().get(r0.size() - 1))) {
                this.baseUrl = g0Var;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + g0Var);
        }
    }

    public CallAdapter<?, ?> nextCallAdapter(CallAdapter.Factory factory, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.callAdapterFactories.indexOf(factory) + 1;
        int size = this.callAdapterFactories.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            CallAdapter<?, ?> callAdapter = this.callAdapterFactories.get(i10).get(type, annotationArr, this);
            if (callAdapter != null) {
                return callAdapter;
            }
        }
        StringBuilder sb2 = new StringBuilder(zAQQWzBxnS.rNyCgQWpHvItXCw);
        sb2.append(type);
        sb2.append(".\n");
        if (factory != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.callAdapterFactories.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.callAdapterFactories.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.callAdapterFactories.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }
}
