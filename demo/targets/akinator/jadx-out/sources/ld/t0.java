package ld;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 ld.t0, still in use, count: 1, list:
  (r1v0 ld.t0) from 0x00e0: INVOKE (r0v15 android.util.SparseArray), (0 int), (r1v0 ld.t0) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:225)
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
public final class t0 {
    /* JADX INFO: Fake field, exist only in values array */
    PROXY(0),
    /* JADX INFO: Fake field, exist only in values array */
    VPN(1),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_MMS(2),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_SUPL(3),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_DUN(4),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_HIPRI(5),
    /* JADX INFO: Fake field, exist only in values array */
    WIMAX(6),
    /* JADX INFO: Fake field, exist only in values array */
    BLUETOOTH(7),
    /* JADX INFO: Fake field, exist only in values array */
    DUMMY(8),
    /* JADX INFO: Fake field, exist only in values array */
    ETHERNET(9),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_FOTA(10),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_IMS(11),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_CBS(12),
    /* JADX INFO: Fake field, exist only in values array */
    WIFI_P2P(13),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_IA(14),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_EMERGENCY(15),
    /* JADX INFO: Fake field, exist only in values array */
    PROXY(16),
    /* JADX INFO: Fake field, exist only in values array */
    VPN(17),
    NONE(-1);


    /* renamed from: e, reason: collision with root package name */
    public static final SparseArray f73302e;

    /* renamed from: b, reason: collision with root package name */
    public final int f73304b;

    static {
        t0 t0Var = NONE;
        SparseArray sparseArray = new SparseArray();
        f73302e = sparseArray;
        sparseArray.put(0, t0Var);
        sparseArray.put(1, t0Var);
        sparseArray.put(2, t0Var);
        sparseArray.put(3, t0Var);
        sparseArray.put(4, t0Var);
        sparseArray.put(5, t0Var);
        sparseArray.put(6, t0Var);
        sparseArray.put(7, t0Var);
        sparseArray.put(8, t0Var);
        sparseArray.put(9, t0Var);
        sparseArray.put(10, t0Var);
        sparseArray.put(11, t0Var);
        sparseArray.put(12, t0Var);
        sparseArray.put(13, t0Var);
        sparseArray.put(14, t0Var);
        sparseArray.put(15, t0Var);
        sparseArray.put(16, t0Var);
        sparseArray.put(17, t0Var);
        sparseArray.put(-1, t0Var);
    }

    public t0(int i10) {
        this.f73304b = i10;
    }

    public static t0 forNumber(int i10) {
        return (t0) f73302e.get(i10);
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) f73303f.clone();
    }

    public int getValue() {
        return this.f73304b;
    }
}
