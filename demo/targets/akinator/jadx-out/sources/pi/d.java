package pi;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final b f81381a;

    /* renamed from: b, reason: collision with root package name */
    public final a f81382b;

    /* renamed from: c, reason: collision with root package name */
    public final long f81383c;

    /* renamed from: d, reason: collision with root package name */
    public final double f81384d;

    /* renamed from: e, reason: collision with root package name */
    public final double f81385e;

    /* renamed from: f, reason: collision with root package name */
    public final int f81386f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f81387a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f81388b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f81389c;

        public a(boolean z10, boolean z11, boolean z12) {
            this.f81387a = z10;
            this.f81388b = z11;
            this.f81389c = z12;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f81390a;

        /* renamed from: b, reason: collision with root package name */
        public final int f81391b;

        public b(int i10, int i11) {
            this.f81390a = i10;
            this.f81391b = i11;
        }
    }

    public d(long j10, b bVar, a aVar, int i10, int i11, double d10, double d11, int i12) {
        this.f81383c = j10;
        this.f81381a = bVar;
        this.f81382b = aVar;
        this.f81384d = d10;
        this.f81385e = d11;
        this.f81386f = i12;
    }

    public boolean isExpired(long j10) {
        return this.f81383c < j10;
    }
}
