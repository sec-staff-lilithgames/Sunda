package n8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f75833b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f75834c;

    /* renamed from: e, reason: collision with root package name */
    public static final c f75835e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ c[] f75836f;

    static {
        c cVar = new c("SOURCE", 0);
        f75833b = cVar;
        c cVar2 = new c("TRANSFORMED", 1);
        f75834c = cVar2;
        c cVar3 = new c("NONE", 2);
        f75835e = cVar3;
        f75836f = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f75836f.clone();
    }
}
