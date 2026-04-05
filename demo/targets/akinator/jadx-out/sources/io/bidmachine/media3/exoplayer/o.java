package io.bidmachine.media3.exoplayer;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class o implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final go.l f61426a;

    /* renamed from: b, reason: collision with root package name */
    public final long f61427b;

    /* renamed from: c, reason: collision with root package name */
    public final long f61428c;

    /* renamed from: d, reason: collision with root package name */
    public final long f61429d;

    /* renamed from: e, reason: collision with root package name */
    public final long f61430e;

    /* renamed from: f, reason: collision with root package name */
    public final int f61431f;

    /* renamed from: g, reason: collision with root package name */
    public final long f61432g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f61433h;

    /* renamed from: i, reason: collision with root package name */
    public long f61434i;

    public o() {
        go.l lVar = new go.l(true, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        a(1000, 0, "bufferForPlaybackMs", "0");
        a(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        a(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f61426a = lVar;
        long j10 = 50000;
        this.f61427b = io.bidmachine.media3.common.util.a1.msToUs(j10);
        this.f61428c = io.bidmachine.media3.common.util.a1.msToUs(j10);
        this.f61429d = io.bidmachine.media3.common.util.a1.msToUs(1000);
        this.f61430e = io.bidmachine.media3.common.util.a1.msToUs(2000);
        this.f61431f = -1;
        this.f61432g = io.bidmachine.media3.common.util.a1.msToUs(0);
        this.f61433h = new HashMap();
        this.f61434i = -1L;
    }

    public static void a(int i10, int i11, String str, String str2) {
        io.bidmachine.media3.common.util.a.checkArgument(i10 >= i11, str + " cannot be less than " + str2);
    }

    public final int b() {
        Iterator it = this.f61433h.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((n) it.next()).f61421b;
        }
        return i10;
    }

    @Override // io.bidmachine.media3.exoplayer.u0
    public go.c getAllocator() {
        return this.f61426a;
    }

    @Override // io.bidmachine.media3.exoplayer.u0
    @Deprecated
    public /* bridge */ /* synthetic */ long getBackBufferDurationUs() {
        return super.getBackBufferDurationUs();
    }

    @Override // io.bidmachine.media3.exoplayer.u0
    @Deprecated
    public /* bridge */ /* synthetic */ void onPrepared() {
        super.onPrepared();
    }

    @Override // io.bidmachine.media3.exoplayer.u0
    @Deprecated
    public /* bridge */ /* synthetic */ void onReleased() {
        super.onReleased();
    }

    @Override // io.bidmachine.media3.exoplayer.u0
    @Deprecated
    public /* bridge */ /* synthetic */ void onStopped() {
        super.onStopped();
    }

    @Override // io.bidmachine.media3.exoplayer.u0
    @Deprecated
    public /* bridge */ /* synthetic */ void onTracksSelected(gn.u1 u1Var, ao.k0 k0Var, s1[] s1VarArr, ao.b2 b2Var, fo.l[] lVarArr) {
        super.onTracksSelected(u1Var, k0Var, s1VarArr, b2Var, lVarArr);
    }

    @Override // io.bidmachine.media3.exoplayer.u0
    @Deprecated
    public /* bridge */ /* synthetic */ boolean retainBackBufferFromKeyframe() {
        return super.retainBackBufferFromKeyframe();
    }

    @Override // io.bidmachine.media3.exoplayer.u0
    @Deprecated
    public /* bridge */ /* synthetic */ boolean shouldContinueLoading(long j10, long j11, float f10) {
        return super.shouldContinueLoading(j10, j11, f10);
    }

    @Override // io.bidmachine.media3.exoplayer.u0
    public boolean shouldContinuePreloading(gn.u1 u1Var, ao.k0 k0Var, long j10) {
        Iterator it = this.f61433h.values().iterator();
        while (it.hasNext()) {
            if (((n) it.next()).f61420a) {
                return false;
            }
        }
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.u0
    @Deprecated
    public /* bridge */ /* synthetic */ boolean shouldStartPlayback(long j10, float f10, boolean z10, long j11) {
        return super.shouldStartPlayback(j10, f10, z10, j11);
    }

    @Override // io.bidmachine.media3.exoplayer.u0
    public long getBackBufferDurationUs(on.f0 f0Var) {
        return this.f61432g;
    }

    @Override // io.bidmachine.media3.exoplayer.u0
    public void onPrepared(on.f0 f0Var) {
        long id2 = Thread.currentThread().getId();
        long j10 = this.f61434i;
        io.bidmachine.media3.common.util.a.checkState(j10 == -1 || j10 == id2, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f61434i = id2;
        HashMap map = this.f61433h;
        if (!map.containsKey(f0Var)) {
            map.put(f0Var, new n());
        }
        n nVar = (n) io.bidmachine.media3.common.util.a.checkNotNull((n) map.get(f0Var));
        int i10 = this.f61431f;
        if (i10 == -1) {
            i10 = C.DEFAULT_VIDEO_BUFFER_SIZE;
        }
        nVar.f61421b = i10;
        nVar.f61420a = false;
    }

    @Override // io.bidmachine.media3.exoplayer.u0
    public void onReleased(on.f0 f0Var) {
        HashMap map = this.f61433h;
        if (map.remove(f0Var) != null) {
            boolean zIsEmpty = map.isEmpty();
            go.l lVar = this.f61426a;
            if (zIsEmpty) {
                lVar.reset();
            } else {
                lVar.setTargetBufferSize(b());
            }
        }
        if (map.isEmpty()) {
            this.f61434i = -1L;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.u0
    public void onStopped(on.f0 f0Var) {
        HashMap map = this.f61433h;
        if (map.remove(f0Var) != null) {
            boolean zIsEmpty = map.isEmpty();
            go.l lVar = this.f61426a;
            if (zIsEmpty) {
                lVar.reset();
            } else {
                lVar.setTargetBufferSize(b());
            }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.u0
    @Deprecated
    public /* bridge */ /* synthetic */ void onTracksSelected(on.f0 f0Var, gn.u1 u1Var, ao.k0 k0Var, s1[] s1VarArr, ao.b2 b2Var, fo.l[] lVarArr) {
        super.onTracksSelected(f0Var, u1Var, k0Var, s1VarArr, b2Var, lVarArr);
    }

    @Override // io.bidmachine.media3.exoplayer.u0
    public boolean retainBackBufferFromKeyframe(on.f0 f0Var) {
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.u0
    public boolean shouldContinueLoading(t0 t0Var) {
        n nVar = (n) io.bidmachine.media3.common.util.a.checkNotNull((n) this.f61433h.get(t0Var.f61561a));
        boolean z10 = this.f61426a.getTotalBytesAllocated() >= b();
        float f10 = t0Var.f61566f;
        long j10 = this.f61428c;
        long jMin = this.f61427b;
        if (f10 > 1.0f) {
            jMin = Math.min(io.bidmachine.media3.common.util.a1.getMediaDurationForPlayoutDuration(jMin, f10), j10);
        }
        long jMax = Math.max(jMin, 500000L);
        long j11 = t0Var.f61565e;
        if (j11 < jMax) {
            nVar.f61420a = !z10;
            if (z10 && j11 < 500000) {
                io.bidmachine.media3.common.util.b0.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= j10 || z10) {
            nVar.f61420a = false;
        }
        return nVar.f61420a;
    }

    @Override // io.bidmachine.media3.exoplayer.u0
    @Deprecated
    public /* bridge */ /* synthetic */ boolean shouldStartPlayback(gn.u1 u1Var, ao.k0 k0Var, long j10, float f10, boolean z10, long j11) {
        return super.shouldStartPlayback(u1Var, k0Var, j10, f10, z10, j11);
    }

    @Override // io.bidmachine.media3.exoplayer.u0
    @Deprecated
    public /* bridge */ /* synthetic */ void onTracksSelected(s1[] s1VarArr, ao.b2 b2Var, fo.l[] lVarArr) {
        super.onTracksSelected(s1VarArr, b2Var, lVarArr);
    }

    @Override // io.bidmachine.media3.exoplayer.u0
    public boolean shouldStartPlayback(t0 t0Var) {
        long playoutDurationForMediaDuration = io.bidmachine.media3.common.util.a1.getPlayoutDurationForMediaDuration(t0Var.f61565e, t0Var.f61566f);
        long jMin = t0Var.f61567g ? this.f61430e : this.f61429d;
        long j10 = t0Var.f61568h;
        if (j10 != C.TIME_UNSET) {
            jMin = Math.min(j10 / 2, jMin);
        }
        return jMin <= 0 || playoutDurationForMediaDuration >= jMin || this.f61426a.getTotalBytesAllocated() >= b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // io.bidmachine.media3.exoplayer.u0
    public void onTracksSelected(t0 t0Var, ao.b2 b2Var, fo.l[] lVarArr) {
        on.f0 f0Var = t0Var.f61561a;
        HashMap map = this.f61433h;
        n nVar = (n) io.bidmachine.media3.common.util.a.checkNotNull((n) map.get(f0Var));
        int iMax = this.f61431f;
        if (iMax == -1) {
            int length = lVarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = C.DEFAULT_VIDEO_BUFFER_SIZE;
                if (i10 < length) {
                    fo.l lVar = lVarArr[i10];
                    if (lVar != null) {
                        switch (lVar.getTrackGroup().f58207c) {
                            case -2:
                                i12 = 0;
                                i11 += i12;
                                break;
                            case -1:
                            case 1:
                                i11 += i12;
                                break;
                            case 0:
                                i12 = 144310272;
                                i11 += i12;
                                break;
                            case 2:
                                i12 = 131072000;
                                i11 += i12;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i12 = 131072;
                                i11 += i12;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i10++;
                } else {
                    iMax = Math.max(C.DEFAULT_VIDEO_BUFFER_SIZE, i11);
                }
            }
        }
        nVar.f61421b = iMax;
        boolean zIsEmpty = map.isEmpty();
        go.l lVar2 = this.f61426a;
        if (zIsEmpty) {
            lVar2.reset();
        } else {
            lVar2.setTargetBufferSize(b());
        }
    }
}
