package oh;

import be.nVUQ.UupKET;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h implements a {

    /* renamed from: b, reason: collision with root package name */
    public static final h f79392b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ h[] f79393c;

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f79393c.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "Funnels.unencodedCharsFunnel()";
    }

    static {
        h hVar = new h(UupKET.JHpQOwNJoeaBDk, 0);
        f79392b = hVar;
        f79393c = new h[]{hVar};
    }

    @Override // oh.a
    public void funnel(CharSequence charSequence, p pVar) {
        pVar.d();
    }
}
