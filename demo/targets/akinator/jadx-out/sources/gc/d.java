package gc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f57538a;

    /* renamed from: b, reason: collision with root package name */
    public final int f57539b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f57540c;

    /* renamed from: d, reason: collision with root package name */
    public final c[] f57541d;

    public d(int i10, int i11, String[] strArr, c[] cVarArr) {
        this.f57538a = i10;
        this.f57539b = i11;
        this.f57540c = strArr;
        this.f57541d = cVarArr;
    }

    public static d createInitial(int i10) {
        return new d(0, 0, new String[i10], new c[i10 >> 1]);
    }

    public d(e eVar) {
        this.f57538a = eVar.f57550i;
        this.f57539b = eVar.f57553l;
        this.f57540c = eVar.f57548g;
        this.f57541d = eVar.f57549h;
    }
}
