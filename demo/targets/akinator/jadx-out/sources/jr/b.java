package jr;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b extends a {
    @Override // jr.a
    public Object to(Object value) {
        e0.checkNotNullParameter(value, "value");
        if (value instanceof Boolean) {
            return (Boolean) value;
        }
        if (!(value instanceof String)) {
            return null;
        }
        String value2 = (String) value;
        e0.checkNotNullParameter(value2, "value");
        return Boolean.valueOf(Boolean.parseBoolean(value2));
    }

    @Override // jr.a
    public Object to(String value) {
        e0.checkNotNullParameter(value, "value");
        return Boolean.valueOf(Boolean.parseBoolean(value));
    }
}
