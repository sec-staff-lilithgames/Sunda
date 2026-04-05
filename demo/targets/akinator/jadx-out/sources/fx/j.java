package fx;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import mt.b0;
import mt.l;
import mt.m0;
import mt.n0;
import mt.s;
import retrofit2.CallAdapter;
import retrofit2.Response;
import retrofit2.Retrofit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j extends CallAdapter.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f56318a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f56319b;

    public j(m0 m0Var, boolean z10) {
        this.f56318a = m0Var;
        this.f56319b = z10;
    }

    public static j create() {
        return new j(null, false);
    }

    public static j createAsync() {
        return new j(null, true);
    }

    public static j createWithScheduler(m0 m0Var) {
        if (m0Var != null) {
            return new j(m0Var, false);
        }
        throw new NullPointerException("scheduler == null");
    }

    @Override // retrofit2.CallAdapter.Factory
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        Type parameterUpperBound;
        boolean z10;
        boolean z11;
        Class<?> rawType = CallAdapter.Factory.getRawType(type);
        if (rawType == mt.c.class) {
            return new i(Void.class, this.f56318a, this.f56319b, false, true, false, false, false, true);
        }
        boolean z12 = rawType == l.class;
        boolean z13 = rawType == n0.class;
        boolean z14 = rawType == s.class;
        if (rawType != b0.class && !z12 && !z13 && !z14) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            String str = !z12 ? !z13 ? z14 ? "Maybe" : "Observable" : "Single" : "Flowable";
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type parameterUpperBound2 = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) type);
        Class<?> rawType2 = CallAdapter.Factory.getRawType(parameterUpperBound2);
        if (rawType2 == Response.class) {
            if (!(parameterUpperBound2 instanceof ParameterizedType)) {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
            parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound2);
            z11 = false;
            z10 = false;
        } else if (rawType2 != g.class) {
            parameterUpperBound = parameterUpperBound2;
            z10 = true;
            z11 = false;
        } else {
            if (!(parameterUpperBound2 instanceof ParameterizedType)) {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
            parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound2);
            z11 = true;
            z10 = false;
        }
        return new i(parameterUpperBound, this.f56318a, this.f56319b, z11, z10, z12, z13, z14, false);
    }
}
