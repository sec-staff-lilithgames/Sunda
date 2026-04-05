package io.odeeo.internal.y1;

import io.odeeo.internal.y1.w;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import xv.v0;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class i<ResponseT, ReturnT> extends t<ReturnT> {

    /* renamed from: a, reason: collision with root package name */
    public final q f67581a;

    /* renamed from: b, reason: collision with root package name */
    public final xv.i f67582b;

    /* renamed from: c, reason: collision with root package name */
    public final f<w0, ResponseT> f67583c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a<ResponseT, ReturnT> extends i<ResponseT, ReturnT> {

        /* renamed from: d, reason: collision with root package name */
        public final io.odeeo.internal.y1.c<ResponseT, ReturnT> f67584d;

        public a(q qVar, xv.i iVar, f<w0, ResponseT> fVar, io.odeeo.internal.y1.c<ResponseT, ReturnT> cVar) {
            super(qVar, iVar, fVar);
            this.f67584d = cVar;
        }

        @Override // io.odeeo.internal.y1.i
        public ReturnT a(io.odeeo.internal.y1.b<ResponseT> bVar, Object[] objArr) {
            return this.f67584d.adapt2(bVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b<ResponseT> extends i<ResponseT, Object> {

        /* renamed from: d, reason: collision with root package name */
        public final io.odeeo.internal.y1.c<ResponseT, io.odeeo.internal.y1.b<ResponseT>> f67585d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f67586e;

        public b(q qVar, xv.i iVar, f<w0, ResponseT> fVar, io.odeeo.internal.y1.c<ResponseT, io.odeeo.internal.y1.b<ResponseT>> cVar, boolean z10) {
            super(qVar, iVar, fVar);
            this.f67585d = cVar;
            this.f67586e = z10;
        }

        @Override // io.odeeo.internal.y1.i
        public Object a(io.odeeo.internal.y1.b<ResponseT> bVar, Object[] objArr) {
            io.odeeo.internal.y1.b<ResponseT> bVarAdapt2 = this.f67585d.adapt2(bVar);
            zu.d dVar = (zu.d) objArr[objArr.length - 1];
            try {
                return this.f67586e ? k.awaitNullable(bVarAdapt2, dVar) : k.await(bVarAdapt2, dVar);
            } catch (Exception e10) {
                return k.suspendAndThrow(e10, dVar);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c<ResponseT> extends i<ResponseT, Object> {

        /* renamed from: d, reason: collision with root package name */
        public final io.odeeo.internal.y1.c<ResponseT, io.odeeo.internal.y1.b<ResponseT>> f67587d;

        public c(q qVar, xv.i iVar, f<w0, ResponseT> fVar, io.odeeo.internal.y1.c<ResponseT, io.odeeo.internal.y1.b<ResponseT>> cVar) {
            super(qVar, iVar, fVar);
            this.f67587d = cVar;
        }

        @Override // io.odeeo.internal.y1.i
        public Object a(io.odeeo.internal.y1.b<ResponseT> bVar, Object[] objArr) {
            io.odeeo.internal.y1.b<ResponseT> bVarAdapt2 = this.f67587d.adapt2(bVar);
            zu.d dVar = (zu.d) objArr[objArr.length - 1];
            try {
                return k.awaitResponse(bVarAdapt2, dVar);
            } catch (Exception e10) {
                return k.suspendAndThrow(e10, dVar);
            }
        }
    }

    public i(q qVar, xv.i iVar, f<w0, ResponseT> fVar) {
        this.f67581a = qVar;
        this.f67582b = iVar;
        this.f67583c = fVar;
    }

    public static <ResponseT, ReturnT> i<ResponseT, ReturnT> a(s sVar, Method method, q qVar) {
        Type genericReturnType;
        boolean z10;
        boolean z11 = qVar.f67691k;
        Annotation[] annotations = method.getAnnotations();
        if (z11) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type typeA = w.a(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (w.b(typeA) == r.class && (typeA instanceof ParameterizedType)) {
                typeA = w.b(0, (ParameterizedType) typeA);
                z10 = true;
            } else {
                z10 = false;
            }
            genericReturnType = new w.b(null, io.odeeo.internal.y1.b.class, typeA);
            annotations = v.a(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z10 = false;
        }
        io.odeeo.internal.y1.c cVarA = a(sVar, method, genericReturnType, annotations);
        Type typeResponseType = cVarA.responseType();
        if (typeResponseType == v0.class) {
            throw w.a(method, "'" + w.b(typeResponseType).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (typeResponseType == r.class) {
            throw w.a(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (qVar.f67683c.equals("HEAD") && !Void.class.equals(typeResponseType)) {
            throw w.a(method, "HEAD method must use Void as response type.", new Object[0]);
        }
        f fVarA = a(sVar, method, typeResponseType);
        xv.i iVar = sVar.f67721b;
        return !z11 ? new a(qVar, iVar, fVarA, cVarA) : z10 ? new c(qVar, iVar, fVarA, cVarA) : new b(qVar, iVar, fVarA, cVarA, false);
    }

    public abstract ReturnT a(io.odeeo.internal.y1.b<ResponseT> bVar, Object[] objArr);

    public static <ResponseT, ReturnT> io.odeeo.internal.y1.c<ResponseT, ReturnT> a(s sVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (io.odeeo.internal.y1.c<ResponseT, ReturnT>) sVar.callAdapter(type, annotationArr);
        } catch (RuntimeException e10) {
            throw w.a(method, e10, "Unable to create call adapter for %s", type);
        }
    }

    public static <ResponseT> f<w0, ResponseT> a(s sVar, Method method, Type type) {
        try {
            return sVar.responseBodyConverter(type, method.getAnnotations());
        } catch (RuntimeException e10) {
            throw w.a(method, e10, "Unable to create converter for %s", type);
        }
    }

    @Override // io.odeeo.internal.y1.t
    public final ReturnT a(Object[] objArr) {
        return a(new l(this.f67581a, objArr, this.f67582b, this.f67583c), objArr);
    }
}
