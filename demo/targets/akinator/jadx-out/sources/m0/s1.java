package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class s1 {

    /* renamed from: b, reason: collision with root package name */
    public static final r1 f73823b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ s1[] f73824c;

    static {
        r1 r1Var = new r1("Vertical", 0, null);
        f73823b = r1Var;
        f73824c = new s1[]{r1Var, new q1("Horizontal", 1, null)};
    }

    public s1(String str, int i10, kotlin.jvm.internal.u uVar) {
    }

    public static s1 valueOf(String str) {
        return (s1) Enum.valueOf(s1.class, str);
    }

    public static s1[] values() {
        return (s1[]) f73824c.clone();
    }

    /* renamed from: compare-3MmeM6k$foundation_release */
    public abstract int mo5560compare3MmeM6k$foundation_release(long j10, i1.j jVar);

    /* renamed from: isSelected-2x9bVx0$foundation_release, reason: not valid java name */
    public final boolean m5567isSelected2x9bVx0$foundation_release(i1.j bounds, long j10, long j11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bounds, "bounds");
        if (bounds.m4205containsk4lQ0M(j10) || bounds.m4205containsk4lQ0M(j11)) {
            return true;
        }
        return (mo5560compare3MmeM6k$foundation_release(j10, bounds) > 0) ^ (mo5560compare3MmeM6k$foundation_release(j11, bounds) > 0);
    }
}
