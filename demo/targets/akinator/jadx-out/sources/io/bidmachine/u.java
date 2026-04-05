package io.bidmachine;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public static final u f62021b;

    /* renamed from: c, reason: collision with root package name */
    public static final u f62022c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ u[] f62023e;

    static {
        u uVar = new u("Idle", 0);
        f62021b = uVar;
        u uVar2 = new u("Busy", 1);
        f62022c = uVar2;
        f62023e = new u[]{uVar, uVar2};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f62023e.clone();
    }
}
