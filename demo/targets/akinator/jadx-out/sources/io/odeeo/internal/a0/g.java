package io.odeeo.internal.a0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class g implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final e0[] f62317a;

    public g(e0[] e0VarArr) {
        this.f62317a = e0VarArr;
    }

    @Override // io.odeeo.internal.a0.e0
    public boolean continueLoading(long j10) {
        boolean zContinueLoading;
        boolean z10 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return z10;
            }
            zContinueLoading = false;
            for (e0 e0Var : this.f62317a) {
                long nextLoadPositionUs2 = e0Var.getNextLoadPositionUs();
                boolean z11 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= j10;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z11) {
                    zContinueLoading |= e0Var.continueLoading(j10);
                }
            }
            z10 |= zContinueLoading;
        } while (zContinueLoading);
        return z10;
    }

    @Override // io.odeeo.internal.a0.e0
    public final long getBufferedPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (e0 e0Var : this.f62317a) {
            long bufferedPositionUs = e0Var.getBufferedPositionUs();
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, bufferedPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // io.odeeo.internal.a0.e0
    public final long getNextLoadPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (e0 e0Var : this.f62317a) {
            long nextLoadPositionUs = e0Var.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, nextLoadPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // io.odeeo.internal.a0.e0
    public boolean isLoading() {
        for (e0 e0Var : this.f62317a) {
            if (e0Var.isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // io.odeeo.internal.a0.e0
    public final void reevaluateBuffer(long j10) {
        for (e0 e0Var : this.f62317a) {
            e0Var.reevaluateBuffer(j10);
        }
    }
}
