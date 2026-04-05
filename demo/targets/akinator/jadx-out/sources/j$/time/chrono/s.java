package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class s implements n {
    public static final s AH;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ s[] f68511a;

    @Override // j$.time.chrono.n
    public final int getValue() {
        return 1;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f68511a.clone();
    }

    static {
        s sVar = new s("AH", 0);
        AH = sVar;
        f68511a = new s[]{sVar};
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.t i(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.ERA) {
            return j$.time.temporal.t.e(1L, 1L);
        }
        return super.i(pVar);
    }
}
