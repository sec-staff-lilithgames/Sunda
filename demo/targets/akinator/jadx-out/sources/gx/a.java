package gx;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import retrofit2.Converter;
import retrofit2.Retrofit;
import uw.p;
import vw.q3;
import xv.u0;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends Converter.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final p f58518a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f58519b;

    public a(p pVar, boolean z10) {
        this.f58518a = pVar;
        this.f58519b = z10;
    }

    public static a create() {
        return create(new q3());
    }

    public static a createNonStrict() {
        return createNonStrict(new q3());
    }

    public boolean isStrict() {
        return this.f58519b;
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, u0> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (type instanceof Class) {
            return new b(this.f58518a);
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    public Converter<w0, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type instanceof Class) {
            return new c((Class) type, this.f58518a, this.f58519b);
        }
        return null;
    }

    public static a create(p pVar) {
        return new a(pVar, true);
    }

    public static a createNonStrict(p pVar) {
        if (pVar != null) {
            return new a(pVar, false);
        }
        throw new NullPointerException("serializer == null");
    }
}
