package io.odeeo.internal.y1;

import io.odeeo.internal.y1.f;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m extends f.a {

    /* renamed from: a, reason: collision with root package name */
    public static final f.a f67617a = new m();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a<T> implements f<w0, Optional<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final f<w0, T> f67618a;

        public a(f<w0, T> fVar) {
            this.f67618a = fVar;
        }

        @Override // io.odeeo.internal.y1.f
        public Optional<T> convert(w0 w0Var) throws IOException {
            return Optional.ofNullable(this.f67618a.convert(w0Var));
        }
    }

    @Override // io.odeeo.internal.y1.f.a
    public f<w0, ?> responseBodyConverter(Type type, Annotation[] annotationArr, s sVar) {
        if (f.a.a(type) != Optional.class) {
            return null;
        }
        return new a(sVar.responseBodyConverter(f.a.a(0, (ParameterizedType) type), annotationArr));
    }
}
