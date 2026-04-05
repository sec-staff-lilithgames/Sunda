package nh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class wa implements mh.v0 {

    /* renamed from: b, reason: collision with root package name */
    public static final ua f76739b;

    /* renamed from: c, reason: collision with root package name */
    public static final va f76740c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ wa[] f76741e;

    static {
        ua uaVar = new ua();
        f76739b = uaVar;
        va vaVar = new va();
        f76740c = vaVar;
        f76741e = new wa[]{uaVar, vaVar};
    }

    public static wa valueOf(String str) {
        return (wa) Enum.valueOf(wa.class, str);
    }

    public static wa[] values() {
        return (wa[]) f76741e.clone();
    }

    public abstract /* synthetic */ Object apply(Object obj);
}
