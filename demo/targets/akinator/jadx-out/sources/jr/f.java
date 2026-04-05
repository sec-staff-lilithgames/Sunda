package jr;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f extends a {
    @Override // jr.a
    public Object to(Object value) {
        e0.checkNotNullParameter(value, "value");
        if (value instanceof Number) {
            return Long.valueOf(((Number) value).longValue());
        }
        if (value instanceof String) {
            return (Long) h.toOrDefault$default((h) this, (String) value, (Object) null, 2, (Object) null);
        }
        return null;
    }

    @Override // jr.a
    public Object to(String value) {
        e0.checkNotNullParameter(value, "value");
        try {
            return Long.valueOf(Long.parseLong(value));
        } catch (Throwable unused) {
            return null;
        }
    }
}
