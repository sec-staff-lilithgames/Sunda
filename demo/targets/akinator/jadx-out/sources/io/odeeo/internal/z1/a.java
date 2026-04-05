package io.odeeo.internal.z1;

import com.google.gson.Gson;
import io.odeeo.internal.y1.f;
import io.odeeo.internal.y1.s;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import xv.u0;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends f.a {

    /* renamed from: a, reason: collision with root package name */
    public final Gson f67811a;

    public a(Gson gson) {
        this.f67811a = gson;
    }

    public static a create() {
        return create(new Gson());
    }

    @Override // io.odeeo.internal.y1.f.a
    public f<?, u0> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, s sVar) {
        return new b(this.f67811a, this.f67811a.getAdapter(pk.a.get(type)));
    }

    @Override // io.odeeo.internal.y1.f.a
    public f<w0, ?> responseBodyConverter(Type type, Annotation[] annotationArr, s sVar) {
        return new c(this.f67811a, this.f67811a.getAdapter(pk.a.get(type)));
    }

    public static a create(Gson gson) {
        if (gson != null) {
            return new a(gson);
        }
        throw new NullPointerException("gson == null");
    }
}
