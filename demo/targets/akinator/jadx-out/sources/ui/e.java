package ui;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f88508a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f88509b;

    public e(String str, Map map) {
        this.f88508a = str;
        this.f88509b = map;
    }

    public static d builder(String str) {
        return new d(str);
    }

    public static e of(String str) {
        return new e(str, Collections.EMPTY_MAP);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f88508a.equals(eVar.f88508a) && this.f88509b.equals(eVar.f88509b);
    }

    public String getName() {
        return this.f88508a;
    }

    public <T extends Annotation> T getProperty(Class<T> cls) {
        return (T) this.f88509b.get(cls);
    }

    public int hashCode() {
        return this.f88509b.hashCode() + (this.f88508a.hashCode() * 31);
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f88508a + ", properties=" + this.f88509b.values() + "}";
    }
}
