package cu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s extends lu.b {

    /* renamed from: a, reason: collision with root package name */
    public final tw.b f51069a;

    /* renamed from: b, reason: collision with root package name */
    public final int f51070b;

    /* renamed from: c, reason: collision with root package name */
    public final int f51071c;

    public s(tw.b bVar, int i10, int i11) {
        this.f51069a = bVar;
        this.f51070b = i10;
        this.f51071c = i11;
    }

    @Override // lu.b
    public int parallelism() {
        return this.f51070b;
    }

    @Override // lu.b
    public void subscribe(tw.c[] cVarArr) {
        if (a(cVarArr)) {
            this.f51069a.subscribe(new r(cVarArr, this.f51071c));
        }
    }
}
