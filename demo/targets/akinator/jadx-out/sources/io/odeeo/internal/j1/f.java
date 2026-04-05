package io.odeeo.internal.j1;

import io.odeeo.internal.y1.s;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final a f64381c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final h f64382a;

    /* renamed from: b, reason: collision with root package name */
    public final s f64383b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    public f(h odeeoSDKApi, s retrofitInitAndConfig) {
        e0.checkNotNullParameter(odeeoSDKApi, "odeeoSDKApi");
        e0.checkNotNullParameter(retrofitInitAndConfig, "retrofitInitAndConfig");
        this.f64382a = odeeoSDKApi;
        this.f64383b = retrofitInitAndConfig;
    }

    public static /* synthetic */ io.odeeo.internal.y1.f converter$default(f fVar, Class cls, Annotation[] annotationArr, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            annotationArr = new Annotation[0];
        }
        return fVar.converter(cls, annotationArr);
    }

    public final <T> io.odeeo.internal.y1.f<w0, T> converter(Class<T> clazz, Annotation[] annotations) {
        e0.checkNotNullParameter(clazz, "clazz");
        e0.checkNotNullParameter(annotations, "annotations");
        io.odeeo.internal.y1.f<w0, T> fVarResponseBodyConverter = this.f64383b.responseBodyConverter(clazz, annotations);
        e0.checkNotNullExpressionValue(fVarResponseBodyConverter, "retrofitInitAndConfig.re…erter(clazz, annotations)");
        return fVarResponseBodyConverter;
    }

    public final h getOdeeoSDKApi() {
        return this.f64382a;
    }

    public final s getRetrofitInitAndConfig() {
        return this.f64383b;
    }
}
