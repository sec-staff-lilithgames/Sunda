package kotlinx.coroutines.debug.internal;

import kotlin.jvm.internal.e0;
import kotlinx.coroutines.internal.Symbol;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ConcurrentWeakMapKt {
    private static final int MAGIC = -1640531527;
    private static final int MIN_CAPACITY = 16;
    private static final Symbol REHASH = new Symbol("REHASH");
    private static final Marked MARKED_NULL = new Marked(null);
    private static final Marked MARKED_TRUE = new Marked(Boolean.TRUE);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Marked mark(Object obj) {
        return obj == null ? MARKED_NULL : e0.areEqual(obj, Boolean.TRUE) ? MARKED_TRUE : new Marked(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void noImpl() {
        throw new UnsupportedOperationException("not implemented");
    }
}
