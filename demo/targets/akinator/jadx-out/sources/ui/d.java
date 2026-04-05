package ui;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f88506a;

    /* renamed from: b, reason: collision with root package name */
    public HashMap f88507b = null;

    public d(String str) {
        this.f88506a = str;
    }

    public e build() {
        return new e(this.f88506a, this.f88507b == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(this.f88507b)));
    }

    public <T extends Annotation> d withProperty(T t10) {
        if (this.f88507b == null) {
            this.f88507b = new HashMap();
        }
        this.f88507b.put(t10.annotationType(), t10);
        return this;
    }
}
