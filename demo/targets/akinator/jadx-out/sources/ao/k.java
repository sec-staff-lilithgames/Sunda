package ao;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import nh.b5;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k implements q1 {

    /* renamed from: b, reason: collision with root package name */
    public final b5 f7714b;

    /* renamed from: c, reason: collision with root package name */
    public long f7715c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements q1 {

        /* renamed from: b, reason: collision with root package name */
        public final q1 f7716b;

        /* renamed from: c, reason: collision with root package name */
        public final b5 f7717c;

        public a(q1 q1Var, List<Integer> list) {
            this.f7716b = q1Var;
            this.f7717c = b5.copyOf((Collection) list);
        }

        @Override // ao.q1
        public boolean continueLoading(io.bidmachine.media3.exoplayer.w0 w0Var) {
            return this.f7716b.continueLoading(w0Var);
        }

        @Override // ao.q1
        public long getBufferedPositionUs() {
            return this.f7716b.getBufferedPositionUs();
        }

        @Override // ao.q1
        public long getNextLoadPositionUs() {
            return this.f7716b.getNextLoadPositionUs();
        }

        public b5 getTrackTypes() {
            return this.f7717c;
        }

        @Override // ao.q1
        public boolean isLoading() {
            return this.f7716b.isLoading();
        }

        @Override // ao.q1
        public void reevaluateBuffer(long j10) {
            this.f7716b.reevaluateBuffer(j10);
        }
    }

    @Deprecated
    public k(q1[] q1VarArr) {
        this(b5.copyOf(q1VarArr), Collections.nCopies(q1VarArr.length, b5.of(-1)));
    }

    @Override // ao.q1
    public boolean continueLoading(io.bidmachine.media3.exoplayer.w0 w0Var) {
        boolean zContinueLoading;
        boolean z10 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return z10;
            }
            int i10 = 0;
            zContinueLoading = false;
            while (true) {
                b5 b5Var = this.f7714b;
                if (i10 >= b5Var.size()) {
                    break;
                }
                long nextLoadPositionUs2 = ((a) b5Var.get(i10)).getNextLoadPositionUs();
                boolean z11 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= w0Var.f61589a;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z11) {
                    zContinueLoading |= ((a) b5Var.get(i10)).continueLoading(w0Var);
                }
                i10++;
            }
            z10 |= zContinueLoading;
        } while (zContinueLoading);
        return z10;
    }

    @Override // ao.q1
    public long getBufferedPositionUs() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            b5 b5Var = this.f7714b;
            if (i10 >= b5Var.size()) {
                break;
            }
            a aVar = (a) b5Var.get(i10);
            long bufferedPositionUs = aVar.getBufferedPositionUs();
            if ((aVar.getTrackTypes().contains(1) || aVar.getTrackTypes().contains(2) || aVar.getTrackTypes().contains(4)) && bufferedPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, bufferedPositionUs);
            }
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, bufferedPositionUs);
            }
            i10++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f7715c = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f7715c;
        return j10 != C.TIME_UNSET ? j10 : jMin2;
    }

    @Override // ao.q1
    public long getNextLoadPositionUs() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            b5 b5Var = this.f7714b;
            if (i10 >= b5Var.size()) {
                break;
            }
            long nextLoadPositionUs = ((a) b5Var.get(i10)).getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, nextLoadPositionUs);
            }
            i10++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // ao.q1
    public boolean isLoading() {
        int i10 = 0;
        while (true) {
            b5 b5Var = this.f7714b;
            if (i10 >= b5Var.size()) {
                return false;
            }
            if (((a) b5Var.get(i10)).isLoading()) {
                return true;
            }
            i10++;
        }
    }

    @Override // ao.q1
    public void reevaluateBuffer(long j10) {
        int i10 = 0;
        while (true) {
            b5 b5Var = this.f7714b;
            if (i10 >= b5Var.size()) {
                return;
            }
            ((a) b5Var.get(i10)).reevaluateBuffer(j10);
            i10++;
        }
    }

    public k(List<? extends q1> list, List<List<Integer>> list2) {
        x4 x4VarBuilder = b5.builder();
        io.bidmachine.media3.common.util.a.checkArgument(list.size() == list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            x4VarBuilder.add((Object) new a(list.get(i10), list2.get(i10)));
        }
        this.f7714b = x4VarBuilder.build();
        this.f7715c = C.TIME_UNSET;
    }
}
