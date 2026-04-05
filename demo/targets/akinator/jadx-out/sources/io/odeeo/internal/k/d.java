package io.odeeo.internal.k;

import io.odeeo.internal.g.j;
import io.odeeo.internal.g.v;
import io.odeeo.internal.g.w;
import io.odeeo.internal.g.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements j {

    /* renamed from: a, reason: collision with root package name */
    public final long f64423a;

    /* renamed from: b, reason: collision with root package name */
    public final j f64424b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements v {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v f64425a;

        public a(v vVar) {
            this.f64425a = vVar;
        }

        @Override // io.odeeo.internal.g.v
        public long getDurationUs() {
            return this.f64425a.getDurationUs();
        }

        @Override // io.odeeo.internal.g.v
        public v.a getSeekPoints(long j10) {
            v.a seekPoints = this.f64425a.getSeekPoints(j10);
            w wVar = seekPoints.f64172a;
            w wVar2 = new w(wVar.f64177a, d.this.f64423a + wVar.f64178b);
            w wVar3 = seekPoints.f64173b;
            return new v.a(wVar2, new w(wVar3.f64177a, d.this.f64423a + wVar3.f64178b));
        }

        @Override // io.odeeo.internal.g.v
        public boolean isSeekable() {
            return this.f64425a.isSeekable();
        }
    }

    public d(long j10, j jVar) {
        this.f64423a = j10;
        this.f64424b = jVar;
    }

    @Override // io.odeeo.internal.g.j
    public void endTracks() {
        this.f64424b.endTracks();
    }

    @Override // io.odeeo.internal.g.j
    public void seekMap(v vVar) {
        this.f64424b.seekMap(new a(vVar));
    }

    @Override // io.odeeo.internal.g.j
    public x track(int i10, int i11) {
        return this.f64424b.track(i10, i11);
    }
}
