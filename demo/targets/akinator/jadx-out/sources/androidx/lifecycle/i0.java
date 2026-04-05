package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i0 {
    private static final /* synthetic */ cv.a $ENTRIES;
    private static final /* synthetic */ i0[] $VALUES;
    public static final g0 Companion;
    public static final i0 ON_ANY;
    public static final i0 ON_CREATE;
    public static final i0 ON_DESTROY;
    public static final i0 ON_PAUSE;
    public static final i0 ON_RESUME;
    public static final i0 ON_START;
    public static final i0 ON_STOP;

    static {
        i0 i0Var = new i0("ON_CREATE", 0);
        ON_CREATE = i0Var;
        i0 i0Var2 = new i0("ON_START", 1);
        ON_START = i0Var2;
        i0 i0Var3 = new i0("ON_RESUME", 2);
        ON_RESUME = i0Var3;
        i0 i0Var4 = new i0("ON_PAUSE", 3);
        ON_PAUSE = i0Var4;
        i0 i0Var5 = new i0("ON_STOP", 4);
        ON_STOP = i0Var5;
        i0 i0Var6 = new i0("ON_DESTROY", 5);
        ON_DESTROY = i0Var6;
        i0 i0Var7 = new i0("ON_ANY", 6);
        ON_ANY = i0Var7;
        i0[] i0VarArr = {i0Var, i0Var2, i0Var3, i0Var4, i0Var5, i0Var6, i0Var7};
        $VALUES = i0VarArr;
        $ENTRIES = cv.b.enumEntries(i0VarArr);
        Companion = new g0(null);
    }

    public static final i0 downFrom(j0 j0Var) {
        return Companion.downFrom(j0Var);
    }

    public static final i0 downTo(j0 j0Var) {
        return Companion.downTo(j0Var);
    }

    public static cv.a getEntries() {
        return $ENTRIES;
    }

    public static final i0 upFrom(j0 j0Var) {
        return Companion.upFrom(j0Var);
    }

    public static final i0 upTo(j0 j0Var) {
        return Companion.upTo(j0Var);
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) $VALUES.clone();
    }

    public final j0 getTargetState() {
        switch (h0.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
                return j0.f6616e;
            case 3:
            case 4:
                return j0.f6617f;
            case 5:
                return j0.f6618g;
            case 6:
                return j0.f6614b;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new tu.t();
        }
    }
}
