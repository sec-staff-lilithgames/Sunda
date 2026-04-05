package ed;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class j {

    /* renamed from: b, reason: collision with root package name */
    public static final g f54101b;

    /* renamed from: c, reason: collision with root package name */
    public static final h f54102c;

    /* renamed from: e, reason: collision with root package name */
    public static final i f54103e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ j[] f54104f;

    static {
        g gVar = new g();
        f54101b = gVar;
        h hVar = new h();
        f54102c = hVar;
        i iVar = new i();
        f54103e = iVar;
        f54104f = new j[]{gVar, hVar, iVar};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f54104f.clone();
    }

    public abstract boolean a(boolean z10);
}
