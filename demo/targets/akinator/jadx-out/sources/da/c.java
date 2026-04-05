package da;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f51954b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f51955c;

    /* renamed from: e, reason: collision with root package name */
    public static final c f51956e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ c[] f51957f;

    static {
        c cVar = new c("START", 0);
        f51954b = cVar;
        c cVar2 = new c("END", 1);
        f51955c = cVar2;
        c cVar3 = new c("CANCEL", 2);
        f51956e = cVar3;
        f51957f = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f51957f.clone();
    }
}
