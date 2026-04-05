package rc;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s extends y {

    /* renamed from: c, reason: collision with root package name */
    public static final s f84249c = new s(null);

    @Override // rc.y
    public y addOrOverride(Annotation annotation) {
        return new w(this.f84293a, annotation.annotationType(), annotation);
    }

    @Override // rc.y
    public a0 asAnnotationMap() {
        return new a0();
    }

    @Override // rc.y
    public dd.b asAnnotations() {
        return y.f84292b;
    }

    @Override // rc.y
    public boolean isPresent(Annotation annotation) {
        return false;
    }
}
