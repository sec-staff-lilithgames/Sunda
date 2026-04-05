package ep;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f54817a;

    /* renamed from: b, reason: collision with root package name */
    public final int f54818b;

    /* renamed from: c, reason: collision with root package name */
    public final long f54819c;

    /* renamed from: d, reason: collision with root package name */
    public final long f54820d;

    /* renamed from: e, reason: collision with root package name */
    public final long f54821e;

    /* renamed from: f, reason: collision with root package name */
    public final long f54822f;

    /* renamed from: g, reason: collision with root package name */
    public final io.bidmachine.media3.common.b f54823g;

    /* renamed from: h, reason: collision with root package name */
    public final int f54824h;

    /* renamed from: i, reason: collision with root package name */
    public final long[] f54825i;

    /* renamed from: j, reason: collision with root package name */
    public final long[] f54826j;

    /* renamed from: k, reason: collision with root package name */
    public final int f54827k;

    /* renamed from: l, reason: collision with root package name */
    public final d0[] f54828l;

    public c0(int i10, int i11, long j10, long j11, long j12, long j13, io.bidmachine.media3.common.b bVar, int i12, d0[] d0VarArr, int i13, long[] jArr, long[] jArr2) {
        this.f54817a = i10;
        this.f54818b = i11;
        this.f54819c = j10;
        this.f54820d = j11;
        this.f54821e = j12;
        this.f54822f = j13;
        this.f54823g = bVar;
        this.f54824h = i12;
        this.f54828l = d0VarArr;
        this.f54827k = i13;
        this.f54825i = jArr;
        this.f54826j = jArr2;
    }

    public c0 copyWithFormat(io.bidmachine.media3.common.b bVar) {
        return new c0(this.f54817a, this.f54818b, this.f54819c, this.f54820d, this.f54821e, this.f54822f, bVar, this.f54824h, this.f54828l, this.f54827k, this.f54825i, this.f54826j);
    }

    public c0 copyWithoutEditLists() {
        return new c0(this.f54817a, this.f54818b, this.f54819c, this.f54820d, this.f54821e, this.f54822f, this.f54823g, this.f54824h, this.f54828l, this.f54827k, null, null);
    }

    public d0 getSampleDescriptionEncryptionBox(int i10) {
        d0[] d0VarArr = this.f54828l;
        if (d0VarArr == null) {
            return null;
        }
        return d0VarArr[i10];
    }
}
