package gc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f57513a;

    /* renamed from: b, reason: collision with root package name */
    public final int f57514b;

    /* renamed from: c, reason: collision with root package name */
    public final int f57515c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f57516d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f57517e;

    /* renamed from: f, reason: collision with root package name */
    public final int f57518f;

    /* renamed from: g, reason: collision with root package name */
    public final int f57519g;

    public a(int i10, int i11, int i12, int[] iArr, String[] strArr, int i13, int i14) {
        this.f57513a = i10;
        this.f57514b = i11;
        this.f57515c = i12;
        this.f57516d = iArr;
        this.f57517e = strArr;
        this.f57518f = i13;
        this.f57519g = i14;
    }

    public static a createInitial(int i10) {
        int i11 = i10 << 3;
        int i12 = i10 >> 2;
        return new a(i10, 0, i12 < 64 ? 4 : i12 <= 256 ? 5 : i12 <= 1024 ? 6 : 7, new int[i11], new String[i10 << 1], i11 - i10, i11);
    }

    public a(b bVar) {
        this.f57513a = bVar.f57526g;
        this.f57514b = bVar.f57530k;
        this.f57515c = bVar.f57529j;
        this.f57516d = bVar.f57525f;
        this.f57517e = bVar.f57531l;
        this.f57518f = bVar.f57532m;
        this.f57519g = bVar.f57533n;
    }
}
