package rc;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final g1 f84207a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f84208b;

    /* renamed from: c, reason: collision with root package name */
    public y f84209c = y.emptyCollector();

    public j(g1 g1Var, Field field) {
        this.f84207a = g1Var;
        this.f84208b = field;
    }

    public i build() {
        return new i(this.f84207a, this.f84208b, this.f84209c.asAnnotationMap());
    }
}
