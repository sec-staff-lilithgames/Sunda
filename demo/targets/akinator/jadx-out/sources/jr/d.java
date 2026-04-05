package jr;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d extends a {
    @Override // jr.a
    public Object to(Object value) {
        e0.checkNotNullParameter(value, "value");
        if (value instanceof Integer) {
            return Float.valueOf(((Number) value).intValue());
        }
        if (value instanceof Long) {
            return Float.valueOf(((Number) value).longValue());
        }
        if (value instanceof String) {
            return (Float) h.toOrDefault$default((h) this, (String) value, (Object) null, 2, (Object) null);
        }
        String value2 = value.toString();
        e0.checkNotNullParameter(value2, "value");
        try {
            return Float.valueOf(Float.parseFloat(value2));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // jr.a
    public Object to(String value) {
        e0.checkNotNullParameter(value, "value");
        try {
            return Float.valueOf(Float.parseFloat(value));
        } catch (Throwable unused) {
            return null;
        }
    }
}
