package rc;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class y {

    /* renamed from: b, reason: collision with root package name */
    public static final u f84292b = new u();

    /* renamed from: a, reason: collision with root package name */
    public final Object f84293a;

    public y(Object obj) {
        this.f84293a = obj;
    }

    public static dd.b emptyAnnotations() {
        return f84292b;
    }

    public static y emptyCollector() {
        return s.f84249c;
    }

    public abstract y addOrOverride(Annotation annotation);

    public abstract a0 asAnnotationMap();

    public abstract dd.b asAnnotations();

    public Object getData() {
        return this.f84293a;
    }

    public abstract boolean isPresent(Annotation annotation);

    public static y emptyCollector(Object obj) {
        return new s(obj);
    }
}
