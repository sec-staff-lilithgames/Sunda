package zu;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class b implements l {
    private final kv.l safeCast;
    private final l topmostKey;

    public b(l baseKey, kv.l safeCast) {
        e0.checkNotNullParameter(baseKey, "baseKey");
        e0.checkNotNullParameter(safeCast, "safeCast");
        this.safeCast = safeCast;
        this.topmostKey = baseKey instanceof b ? ((b) baseKey).topmostKey : baseKey;
    }

    public final boolean isSubKey$kotlin_stdlib(l key) {
        e0.checkNotNullParameter(key, "key");
        return key == this || this.topmostKey == key;
    }

    public final Object tryCast$kotlin_stdlib(k element) {
        e0.checkNotNullParameter(element, "element");
        return (k) this.safeCast.invoke(element);
    }
}
