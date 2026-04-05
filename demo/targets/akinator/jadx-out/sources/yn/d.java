package yn;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ao.k0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.u0;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.exoplayer.a0;
import io.bidmachine.media3.exoplayer.i;
import io.bidmachine.media3.exoplayer.j0;
import io.bidmachine.media3.exoplayer.r0;
import io.bidmachine.media3.exoplayer.u1;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d extends i implements Handler.Callback {
    public boolean A;
    public long B;
    public u0 C;
    public long D;

    /* renamed from: t, reason: collision with root package name */
    public final b f94701t;

    /* renamed from: u, reason: collision with root package name */
    public final c f94702u;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f94703v;

    /* renamed from: w, reason: collision with root package name */
    public final to.b f94704w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f94705x;

    /* renamed from: y, reason: collision with root package name */
    public to.a f94706y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f94707z;

    public d(c cVar, Looper looper) {
        this(cVar, looper, b.f94700a);
    }

    @Override // io.bidmachine.media3.exoplayer.i
    public final void d() {
        this.C = null;
        this.f94706y = null;
        this.D = C.TIME_UNSET;
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public /* bridge */ /* synthetic */ void enableMayRenderStartOfStream() {
        super.enableMayRenderStartOfStream();
    }

    @Override // io.bidmachine.media3.exoplayer.i
    public final void f(long j10, boolean z10) {
        this.C = null;
        this.f94707z = false;
        this.A = false;
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public /* bridge */ /* synthetic */ long getDurationToProgressUs(long j10, long j11) {
        return super.getDurationToProgressUs(j10, j11);
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1, io.bidmachine.media3.exoplayer.u1
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        ((j0) this.f94702u).onMetadata((u0) message.obj);
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public boolean isEnded() {
        return this.A;
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public boolean isReady() {
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.i
    public final void k(io.bidmachine.media3.common.b[] bVarArr, long j10, long j11, k0 k0Var) {
        this.f94706y = ((a) this.f94701t).createDecoder(bVarArr[0]);
        u0 u0Var = this.C;
        if (u0Var != null) {
            this.C = u0Var.copyWithPresentationTimeUs((u0Var.f58194b + this.D) - j11);
        }
        this.D = j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(gn.u0 r6, java.util.ArrayList r7) {
        /*
            r5 = this;
            r0 = 0
        L1:
            int r1 = r6.length()
            if (r0 >= r1) goto L58
            gn.t0 r1 = r6.get(r0)
            io.bidmachine.media3.common.b r1 = r1.getWrappedMetadataFormat()
            if (r1 == 0) goto L4e
            yn.b r2 = r5.f94701t
            yn.a r2 = (yn.a) r2
            boolean r3 = r2.supportsFormat(r1)
            if (r3 == 0) goto L4e
            to.a r1 = r2.createDecoder(r1)
            gn.t0 r2 = r6.get(r0)
            byte[] r2 = r2.getWrappedMetadataBytes()
            java.lang.Object r2 = io.bidmachine.media3.common.util.a.checkNotNull(r2)
            byte[] r2 = (byte[]) r2
            to.b r3 = r5.f94704w
            r3.clear()
            int r4 = r2.length
            r3.ensureSpaceForWrite(r4)
            java.nio.ByteBuffer r4 = r3.f77080f
            java.lang.Object r4 = io.bidmachine.media3.common.util.a1.castNonNull(r4)
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            r4.put(r2)
            r3.flip()
            gn.u0 r1 = r1.decode(r3)
            if (r1 == 0) goto L55
            r5.m(r1, r7)
            goto L55
        L4e:
            gn.t0 r1 = r6.get(r0)
            r7.add(r1)
        L55:
            int r0 = r0 + 1
            goto L1
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yn.d.m(gn.u0, java.util.ArrayList):void");
    }

    public final long n(long j10) {
        io.bidmachine.media3.common.util.a.checkState(j10 != C.TIME_UNSET);
        io.bidmachine.media3.common.util.a.checkState(this.D != C.TIME_UNSET);
        return j10 - this.D;
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public void render(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            if (!this.f94707z && this.C == null) {
                to.b bVar = this.f94704w;
                bVar.clear();
                r0 r0Var = this.f61238e;
                r0Var.clear();
                int iL = l(r0Var, bVar, 0);
                if (iL == -4) {
                    if (bVar.isEndOfStream()) {
                        this.f94707z = true;
                    } else if (bVar.f77082h >= this.f61247n) {
                        bVar.f87331l = this.B;
                        bVar.flip();
                        u0 u0VarDecode = ((to.a) a1.castNonNull(this.f94706y)).decode(bVar);
                        if (u0VarDecode != null) {
                            ArrayList arrayList = new ArrayList(u0VarDecode.length());
                            m(u0VarDecode, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.C = new u0(n(bVar.f77082h), arrayList);
                            }
                        }
                    }
                } else if (iL == -5) {
                    this.B = ((io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkNotNull(r0Var.f61543b)).f60670t;
                }
            }
            u0 u0Var = this.C;
            if (u0Var == null || (!this.f94705x && u0Var.f58194b > n(j10))) {
                z10 = false;
            } else {
                u0 u0Var2 = this.C;
                Handler handler = this.f94703v;
                if (handler != null) {
                    handler.obtainMessage(1, u0Var2).sendToTarget();
                } else {
                    ((j0) this.f94702u).onMetadata(u0Var2);
                }
                this.C = null;
                z10 = true;
            }
            if (this.f94707z && this.C == null) {
                this.A = true;
            }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public /* bridge */ /* synthetic */ void setPlaybackSpeed(float f10, float f11) throws a0 {
        super.setPlaybackSpeed(f10, f11);
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.u1
    public int supportsFormat(io.bidmachine.media3.common.b bVar) {
        if (((a) this.f94701t).supportsFormat(bVar)) {
            return u1.create(bVar.N == 0 ? 4 : 2);
        }
        return u1.create(0);
    }

    public d(c cVar, Looper looper, b bVar) {
        this(cVar, looper, bVar, false);
    }

    public d(c cVar, Looper looper, b bVar, boolean z10) {
        super(5);
        this.f94702u = (c) io.bidmachine.media3.common.util.a.checkNotNull(cVar);
        this.f94703v = looper == null ? null : a1.createHandler(looper, this);
        this.f94701t = (b) io.bidmachine.media3.common.util.a.checkNotNull(bVar);
        this.f94705x = z10;
        this.f94704w = new to.b();
        this.D = C.TIME_UNSET;
    }
}
