package at;

import com.google.android.exoplayer2.audio.a0;
import com.google.android.exoplayer2.audio.b0;
import com.google.android.exoplayer2.p0;
import com.google.android.exoplayer2.util.n1;
import go.d;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.exoplayer.audio.n;
import io.bidmachine.media3.exoplayer.audio.o;
import io.bidmachine.media3.exoplayer.j0;
import io.odeeo.internal.d.g;
import io.odeeo.internal.p0.d;
import qf.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8000b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8001c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f8002e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f8003f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f8004g;

    public /* synthetic */ a(Object obj, long j10, long j11, int i10, int i11) {
        this.f8000b = i11;
        this.f8004g = obj;
        this.f8001c = i10;
        this.f8002e = j10;
        this.f8003f = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8000b) {
            case 0:
                d.a.C0634a.C0635a c0635a = (d.a.C0634a.C0635a) this.f8004g;
                c0635a.f65603b.onBandwidthSample(this.f8001c, this.f8002e, this.f8003f);
                break;
            case 1:
                ((p0) ((b0) n1.castNonNull(((a0) this.f8004g).f27047b))).onAudioUnderrun(this.f8001c, this.f8002e, this.f8003f);
                break;
            case 2:
                d.a aVar = (d.a) this.f8004g;
                aVar.f58303b.onBandwidthSample(this.f8001c, this.f8002e, this.f8003f);
                break;
            case 3:
                ((j0) ((o) a1.castNonNull(((n) this.f8004g).f60991b))).onAudioUnderrun(this.f8001c, this.f8002e, this.f8003f);
                break;
            case 4:
                ((g.a) this.f8004g).a(this.f8001c, this.f8002e, this.f8003f);
                break;
            default:
                e.a aVar2 = (e.a) this.f8004g;
                aVar2.f82938b.onBandwidthSample(this.f8001c, this.f8002e, this.f8003f);
                break;
        }
    }
}
