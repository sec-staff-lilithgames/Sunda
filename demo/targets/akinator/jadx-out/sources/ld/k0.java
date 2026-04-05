package ld;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ld.k0, still in use, count: 1, list:
  (r0v0 ld.k0) from 0x0020: INVOKE (r3v2 android.util.SparseArray), (0 int), (r0v0 ld.k0) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:33)
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
public final class k0 {
    /* JADX INFO: Fake field, exist only in values array */
    NOT_SET(0),
    EVENT_OVERRIDE(5);


    /* renamed from: e, reason: collision with root package name */
    public static final SparseArray f73257e;

    /* renamed from: b, reason: collision with root package name */
    public final int f73259b;

    static {
        k0 k0Var = EVENT_OVERRIDE;
        SparseArray sparseArray = new SparseArray();
        f73257e = sparseArray;
        sparseArray.put(0, k0Var);
        sparseArray.put(5, k0Var);
    }

    public k0(int i10) {
        this.f73259b = i10;
    }

    public static k0 forNumber(int i10) {
        return (k0) f73257e.get(i10);
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) f73258f.clone();
    }

    public int getValue() {
        return this.f73259b;
    }
}
