package bf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class j implements d1 {

    /* renamed from: b, reason: collision with root package name */
    public final d1[] f9294b;

    public j(d1[] d1VarArr) {
        this.f9294b = d1VarArr;
    }

    @Override // bf.d1
    public boolean continueLoading(long j10) {
        boolean zContinueLoading;
        boolean z10 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return z10;
            }
            zContinueLoading = false;
            for (d1 d1Var : this.f9294b) {
                long nextLoadPositionUs2 = d1Var.getNextLoadPositionUs();
                boolean z11 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= j10;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z11) {
                    zContinueLoading |= d1Var.continueLoading(j10);
                }
            }
            z10 |= zContinueLoading;
        } while (zContinueLoading);
        return z10;
    }

    @Override // bf.d1
    public final long getBufferedPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (d1 d1Var : this.f9294b) {
            long bufferedPositionUs = d1Var.getBufferedPositionUs();
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, bufferedPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // bf.d1
    public final long getNextLoadPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (d1 d1Var : this.f9294b) {
            long nextLoadPositionUs = d1Var.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, nextLoadPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // bf.d1
    public boolean isLoading() {
        for (d1 d1Var : this.f9294b) {
            if (d1Var.isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // bf.d1
    public final void reevaluateBuffer(long j10) {
        for (d1 d1Var : this.f9294b) {
            d1Var.reevaluateBuffer(j10);
        }
    }
}
