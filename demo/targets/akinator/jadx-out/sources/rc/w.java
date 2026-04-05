package rc;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class w extends y {

    /* renamed from: c, reason: collision with root package name */
    public final Class f84284c;

    /* renamed from: d, reason: collision with root package name */
    public Annotation f84285d;

    public w(Object obj, Class<?> cls, Annotation annotation) {
        super(obj);
        this.f84284c = cls;
        this.f84285d = annotation;
    }

    @Override // rc.y
    public y addOrOverride(Annotation annotation) {
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        Class<? extends Annotation> cls = this.f84284c;
        if (cls != clsAnnotationType) {
            return new t(this.f84293a, cls, this.f84285d, clsAnnotationType, annotation);
        }
        this.f84285d = annotation;
        return this;
    }

    @Override // rc.y
    public a0 asAnnotationMap() {
        return a0.of(this.f84284c, this.f84285d);
    }

    @Override // rc.y
    public dd.b asAnnotations() {
        return new v(this.f84284c, this.f84285d);
    }

    @Override // rc.y
    public boolean isPresent(Annotation annotation) {
        return annotation.annotationType() == this.f84284c;
    }
}
