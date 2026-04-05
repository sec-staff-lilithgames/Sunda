package kotlinx.coroutines;

import kotlinx.coroutines.internal.Symbol;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class CancellableContinuationImplKt {
    private static final int DECISION_SHIFT = 29;
    private static final int INDEX_MASK = 536870911;
    private static final int NO_INDEX = 536870911;
    private static final int RESUMED = 2;
    public static final Symbol RESUME_TOKEN = new Symbol("RESUME_TOKEN");
    private static final int SUSPENDED = 1;
    private static final int UNDECIDED = 0;

    private static final int decisionAndIndex(int i10, int i11) {
        return (i10 << 29) + i11;
    }

    private static final int getDecision(int i10) {
        return i10 >> 29;
    }

    private static final int getIndex(int i10) {
        return i10 & 536870911;
    }
}
