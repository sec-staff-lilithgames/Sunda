package co;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class a extends p {

    /* renamed from: k, reason: collision with root package name */
    public final long f12388k;

    /* renamed from: l, reason: collision with root package name */
    public final long f12389l;

    /* renamed from: m, reason: collision with root package name */
    public c f12390m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f12391n;

    public a(ln.i iVar, ln.m mVar, io.bidmachine.media3.common.b bVar, int i10, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(iVar, mVar, bVar, i10, obj, j10, j11, j14);
        this.f12388k = j12;
        this.f12389l = j13;
    }

    @Override // co.p, co.e, go.x
    public abstract /* synthetic */ void cancelLoad();

    public final int getFirstSampleIndex(int i10) {
        return ((int[]) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f12391n))[i10];
    }

    public void init(c cVar) {
        this.f12390m = cVar;
        this.f12391n = cVar.getWriteIndices();
    }

    @Override // co.p, co.e, go.x
    public abstract /* synthetic */ void load() throws IOException;
}
