package yt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c6 implements st.g {

    /* renamed from: b, reason: collision with root package name */
    public static final c6 f95256b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ c6[] f95257c;

    static {
        c6 c6Var = new c6("INSTANCE", 0);
        f95256b = c6Var;
        f95257c = new c6[]{c6Var};
    }

    public static c6 valueOf(String str) {
        return (c6) Enum.valueOf(c6.class, str);
    }

    public static c6[] values() {
        return (c6[]) f95257c.clone();
    }

    @Override // st.g
    public void accept(tw.d dVar) throws Exception {
        dVar.request(Long.MAX_VALUE);
    }
}
