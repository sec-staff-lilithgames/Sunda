package ld;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v1 ld.u0, still in use, count: 1, list:
  (r5v1 ld.u0) from 0x0055: INVOKE (r11v2 android.util.SparseArray), (-1 int), (r5v1 ld.u0) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:86)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u0 {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    /* JADX INFO: Fake field, exist only in values array */
    UNRECOGNIZED(-1);


    /* renamed from: b, reason: collision with root package name */
    public final int f73313b;

    static {
        u0 u0Var = DEFAULT;
        u0 u0Var2 = UNMETERED_ONLY;
        u0 u0Var3 = UNMETERED_OR_DAILY;
        u0 u0Var4 = FAST_IF_RADIO_AWAKE;
        u0 u0Var5 = NEVER;
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, u0Var);
        sparseArray.put(1, u0Var2);
        sparseArray.put(2, u0Var3);
        sparseArray.put(3, u0Var4);
        sparseArray.put(4, u0Var5);
        sparseArray.put(-1, u0Var);
    }

    public u0(int i10) {
        this.f73313b = i10;
    }

    public static u0 forNumber(int i10) {
        if (i10 == 0) {
            return DEFAULT;
        }
        if (i10 == 1) {
            return UNMETERED_ONLY;
        }
        if (i10 == 2) {
            return UNMETERED_OR_DAILY;
        }
        if (i10 == 3) {
            return FAST_IF_RADIO_AWAKE;
        }
        if (i10 != 4) {
            return null;
        }
        return NEVER;
    }

    public static u0 valueOf(String str) {
        return (u0) Enum.valueOf(u0.class, str);
    }

    public static u0[] values() {
        return (u0[]) f73312i.clone();
    }

    public final int getNumber() {
        return this.f73313b;
    }
}
