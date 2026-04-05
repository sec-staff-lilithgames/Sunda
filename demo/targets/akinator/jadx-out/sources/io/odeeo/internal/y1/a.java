package io.odeeo.internal.y1;

import io.odeeo.internal.y1.f;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import tu.x0;
import xv.u0;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends f.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f67548a = true;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.y1.a$a, reason: collision with other inner class name */
    public static final class C0689a implements io.odeeo.internal.y1.f<w0, w0> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0689a f67549a = new C0689a();

        @Override // io.odeeo.internal.y1.f
        public w0 convert(w0 w0Var) throws IOException {
            try {
                return w.a(w0Var);
            } finally {
                w0Var.close();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements io.odeeo.internal.y1.f<u0, u0> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f67550a = new b();

        @Override // io.odeeo.internal.y1.f
        public u0 convert(u0 u0Var) {
            return u0Var;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements io.odeeo.internal.y1.f<w0, w0> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f67551a = new c();

        @Override // io.odeeo.internal.y1.f
        public w0 convert(w0 w0Var) {
            return w0Var;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d implements io.odeeo.internal.y1.f<Object, String> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f67552a = new d();

        @Override // io.odeeo.internal.y1.f
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e implements io.odeeo.internal.y1.f<w0, x0> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f67553a = new e();

        @Override // io.odeeo.internal.y1.f
        public x0 convert(w0 w0Var) {
            w0Var.close();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f implements io.odeeo.internal.y1.f<w0, Void> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f67554a = new f();

        @Override // io.odeeo.internal.y1.f
        public Void convert(w0 w0Var) {
            w0Var.close();
            return null;
        }
    }

    @Override // io.odeeo.internal.y1.f.a
    public io.odeeo.internal.y1.f<?, u0> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, s sVar) {
        if (u0.class.isAssignableFrom(w.b(type))) {
            return b.f67550a;
        }
        return null;
    }

    @Override // io.odeeo.internal.y1.f.a
    public io.odeeo.internal.y1.f<w0, ?> responseBodyConverter(Type type, Annotation[] annotationArr, s sVar) {
        if (type == w0.class) {
            return w.a(annotationArr, (Class<? extends Annotation>) io.odeeo.internal.a2.w.class) ? c.f67551a : C0689a.f67549a;
        }
        if (type == Void.class) {
            return f.f67554a;
        }
        if (!this.f67548a || type != x0.class) {
            return null;
        }
        try {
            return e.f67553a;
        } catch (NoClassDefFoundError unused) {
            this.f67548a = false;
            return null;
        }
    }
}
