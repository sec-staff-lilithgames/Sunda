package qe;

import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.l0;
import com.google.android.exoplayer2.util.n1;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j implements m {

    /* renamed from: b, reason: collision with root package name */
    public int f82836b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f82837c;

    @Override // qe.m
    public o createAdapter(l lVar) throws IOException {
        int i10;
        int i11 = n1.f28506a;
        if (i11 < 23 || ((i10 = this.f82836b) != 1 && (i10 != 0 || i11 < 31))) {
            return new d0().createAdapter(lVar);
        }
        int trackType = l0.getTrackType(lVar.f82845c.f28802n);
        f0.i("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + n1.getTrackTypeString(trackType));
        return new b(trackType, this.f82837c).createAdapter(lVar);
    }

    public void experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled(boolean z10) {
        this.f82837c = z10;
    }

    public j forceDisableAsynchronous() {
        this.f82836b = 2;
        return this;
    }

    public j forceEnableAsynchronous() {
        this.f82836b = 1;
        return this;
    }
}
