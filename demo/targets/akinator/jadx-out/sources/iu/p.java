package iu;

import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p implements st.c {

    /* renamed from: b, reason: collision with root package name */
    public static final p f68418b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ p[] f68419c;

    static {
        p pVar = new p("INSTANCE", 0);
        f68418b = pVar;
        f68419c = new p[]{pVar};
    }

    public static <T> st.c instance() {
        return f68418b;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f68419c.clone();
    }

    @Override // st.c
    public List apply(List list, Object obj) throws Exception {
        list.add(obj);
        return list;
    }
}
