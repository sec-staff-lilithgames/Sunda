package ld;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v1 ld.s0, still in use, count: 1, list:
  (r2v1 ld.s0) from 0x0103: INVOKE (r0v17 android.util.SparseArray), (1 int), (r2v1 ld.s0) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:260)
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
public final class s0 {
    UNKNOWN_MOBILE_SUBTYPE(0),
    /* JADX INFO: Fake field, exist only in values array */
    TD_SCDMA(1),
    /* JADX INFO: Fake field, exist only in values array */
    EDGE(2),
    /* JADX INFO: Fake field, exist only in values array */
    UMTS(3),
    /* JADX INFO: Fake field, exist only in values array */
    CDMA(4),
    /* JADX INFO: Fake field, exist only in values array */
    EVDO_0(5),
    /* JADX INFO: Fake field, exist only in values array */
    EVDO_A(6),
    /* JADX INFO: Fake field, exist only in values array */
    RTT(7),
    /* JADX INFO: Fake field, exist only in values array */
    HSDPA(8),
    /* JADX INFO: Fake field, exist only in values array */
    HSUPA(9),
    /* JADX INFO: Fake field, exist only in values array */
    HSPA(10),
    /* JADX INFO: Fake field, exist only in values array */
    IDEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    EVDO_B(12),
    /* JADX INFO: Fake field, exist only in values array */
    LTE(13),
    /* JADX INFO: Fake field, exist only in values array */
    EHRPD(14),
    /* JADX INFO: Fake field, exist only in values array */
    IWLAN(15),
    /* JADX INFO: Fake field, exist only in values array */
    LTE_CA(16),
    /* JADX INFO: Fake field, exist only in values array */
    TD_SCDMA(17),
    /* JADX INFO: Fake field, exist only in values array */
    IWLAN(18),
    /* JADX INFO: Fake field, exist only in values array */
    LTE_CA(19),
    COMBINED(100);


    /* renamed from: f, reason: collision with root package name */
    public static final SparseArray f73296f;

    /* renamed from: b, reason: collision with root package name */
    public final int f73298b;

    static {
        s0 s0Var = UNKNOWN_MOBILE_SUBTYPE;
        SparseArray sparseArray = new SparseArray();
        f73296f = sparseArray;
        sparseArray.put(0, s0Var);
        sparseArray.put(1, s0Var);
        sparseArray.put(2, s0Var);
        sparseArray.put(3, s0Var);
        sparseArray.put(4, s0Var);
        sparseArray.put(5, s0Var);
        sparseArray.put(6, s0Var);
        sparseArray.put(7, s0Var);
        sparseArray.put(8, s0Var);
        sparseArray.put(9, s0Var);
        sparseArray.put(10, s0Var);
        sparseArray.put(11, s0Var);
        sparseArray.put(12, s0Var);
        sparseArray.put(13, s0Var);
        sparseArray.put(14, s0Var);
        sparseArray.put(15, s0Var);
        sparseArray.put(16, s0Var);
        sparseArray.put(17, s0Var);
        sparseArray.put(18, s0Var);
        sparseArray.put(19, s0Var);
    }

    public s0(int i10) {
        this.f73298b = i10;
    }

    public static s0 forNumber(int i10) {
        return (s0) f73296f.get(i10);
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) f73297g.clone();
    }

    public int getValue() {
        return this.f73298b;
    }
}
