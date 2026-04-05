package p8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public static final q f80844b;

    /* renamed from: c, reason: collision with root package name */
    public static final q f80845c;

    /* renamed from: e, reason: collision with root package name */
    public static final q f80846e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ q[] f80847f;

    static {
        q qVar = new q("INITIALIZE", 0);
        f80844b = qVar;
        q qVar2 = new q("SWITCH_TO_SOURCE_SERVICE", 1);
        f80845c = qVar2;
        q qVar3 = new q("DECODE_DATA", 2);
        f80846e = qVar3;
        f80847f = new q[]{qVar, qVar2, qVar3};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f80847f.clone();
    }
}
