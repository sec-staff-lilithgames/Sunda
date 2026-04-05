package o4;

import java.util.Arrays;
import kotlin.jvm.internal.e0;
import o4.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class k {
    public static final j create(j.b... pairs) {
        e0.checkNotNullParameter(pairs, "pairs");
        return createMutable((j.b[]) Arrays.copyOf(pairs, pairs.length));
    }

    public static final j createEmpty() {
        return new d(null, true, 1, null);
    }

    public static final d createMutable(j.b... pairs) {
        e0.checkNotNullParameter(pairs, "pairs");
        d dVar = new d(null, false, 1, null);
        dVar.putAll((j.b[]) Arrays.copyOf(pairs, pairs.length));
        return dVar;
    }
}
