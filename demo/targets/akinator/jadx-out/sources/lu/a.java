package lu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a implements st.c {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f73624b = {new a("STOP", 0), new a("ERROR", 1), new a("SKIP", 2), new a("RETRY", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    a EF5;

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f73624b.clone();
    }

    @Override // st.c
    public a apply(Long l9, Throwable th2) {
        return this;
    }
}
