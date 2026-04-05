package yi;

import bi.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final Class f94582a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f94583b;

    public a(Class<Object> cls, Object obj) {
        this.f94582a = (Class) z.checkNotNull(cls);
        this.f94583b = z.checkNotNull(obj);
    }

    public Object getPayload() {
        return this.f94583b;
    }

    public Class<Object> getType() {
        return this.f94582a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f94582a, this.f94583b);
    }
}
