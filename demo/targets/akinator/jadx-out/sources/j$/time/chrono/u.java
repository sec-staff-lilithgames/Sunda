package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class u implements n {
    public static final u BCE;
    public static final u CE;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ u[] f68513a;

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f68513a.clone();
    }

    static {
        u uVar = new u("BCE", 0);
        BCE = uVar;
        u uVar2 = new u("CE", 1);
        CE = uVar2;
        f68513a = new u[]{uVar, uVar2};
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return ordinal();
    }
}
