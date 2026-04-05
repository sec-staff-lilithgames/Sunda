package io.bidmachine.media3.exoplayer;

import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final s1 f61592a;

    /* renamed from: b, reason: collision with root package name */
    public final int f61593b;

    /* renamed from: c, reason: collision with root package name */
    public final s1 f61594c;

    /* renamed from: d, reason: collision with root package name */
    public int f61595d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f61596e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f61597f = false;

    public w1(s1 s1Var, s1 s1Var2, int i10) {
        this.f61592a = s1Var;
        this.f61593b = i10;
        this.f61594c = s1Var2;
    }

    public static boolean d(s1 s1Var) {
        return s1Var.getState() != 0;
    }

    public static void g(s1 s1Var, long j10) {
        s1Var.setCurrentStreamFinal();
        if (s1Var instanceof eo.h) {
            ((eo.h) s1Var).setFinalStreamEndPositionUs(j10);
        }
    }

    public final void a(s1 s1Var, q qVar) {
        io.bidmachine.media3.common.util.a.checkState(this.f61592a == s1Var || this.f61594c == s1Var);
        if (d(s1Var)) {
            qVar.onRendererDisabled(s1Var);
            if (s1Var.getState() == 2) {
                s1Var.stop();
            }
            s1Var.disable();
        }
    }

    public boolean allowsPlayback(z0 z0Var) {
        s1 s1VarB = b(z0Var);
        return s1VarB == null || s1VarB.hasReadStreamToEnd() || s1VarB.isReady() || s1VarB.isEnded();
    }

    public final s1 b(z0 z0Var) {
        if (z0Var != null) {
            ao.o1[] o1VarArr = z0Var.f61610c;
            int i10 = this.f61593b;
            if (o1VarArr[i10] != null) {
                s1 s1Var = this.f61592a;
                if (s1Var.getStream() == o1VarArr[i10]) {
                    return s1Var;
                }
                s1 s1Var2 = this.f61594c;
                if (s1Var2 != null && s1Var2.getStream() == o1VarArr[i10]) {
                    return s1Var2;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(io.bidmachine.media3.exoplayer.z0 r8, io.bidmachine.media3.exoplayer.s1 r9) {
        /*
            r7 = this;
            r0 = 1
            if (r9 != 0) goto L4
            goto L57
        L4:
            ao.o1[] r1 = r8.f61610c
            int r2 = r7.f61593b
            r1 = r1[r2]
            ao.o1 r3 = r9.getStream()
            if (r3 == 0) goto L57
            ao.o1 r3 = r9.getStream()
            if (r3 != r1) goto L44
            if (r1 == 0) goto L57
            boolean r1 = r9.hasReadStreamToEnd()
            if (r1 != 0) goto L57
            io.bidmachine.media3.exoplayer.z0 r1 = r8.getNext()
            io.bidmachine.media3.exoplayer.a1 r3 = r8.f61615h
            boolean r3 = r3.f60886g
            if (r3 == 0) goto L44
            if (r1 == 0) goto L44
            boolean r3 = r1.f61613f
            if (r3 == 0) goto L44
            boolean r3 = r9 instanceof eo.h
            if (r3 != 0) goto L43
            boolean r3 = r9 instanceof yn.d
            if (r3 != 0) goto L43
            long r3 = r9.getReadingPositionUs()
            long r5 = r1.getStartPositionRendererTime()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L44
            goto L57
        L43:
            return r0
        L44:
            io.bidmachine.media3.exoplayer.z0 r8 = r8.getNext()
            if (r8 == 0) goto L55
            ao.o1[] r8 = r8.f61610c
            r8 = r8[r2]
            ao.o1 r9 = r9.getStream()
            if (r8 != r9) goto L55
            goto L57
        L55:
            r8 = 0
            return r8
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.w1.c(io.bidmachine.media3.exoplayer.z0, io.bidmachine.media3.exoplayer.s1):boolean");
    }

    public void disable(q qVar) throws a0 {
        s1 s1Var = this.f61592a;
        a(s1Var, qVar);
        s1 s1Var2 = this.f61594c;
        if (s1Var2 != null) {
            boolean z10 = (s1Var2.getState() == 0 || this.f61595d == 3) ? false : true;
            a(s1Var2, qVar);
            e(false);
            if (z10) {
                ((s1) io.bidmachine.media3.common.util.a.checkNotNull(s1Var2)).handleMessage(17, s1Var);
            }
        }
        this.f61595d = 0;
    }

    public void disablePrewarming(q qVar) {
        if (isPrewarming()) {
            int i10 = this.f61595d;
            boolean z10 = i10 == 4 || i10 == 2;
            int i11 = i10 != 4 ? 0 : 1;
            a(z10 ? this.f61592a : (s1) io.bidmachine.media3.common.util.a.checkNotNull(this.f61594c), qVar);
            e(z10);
            this.f61595d = i11;
        }
    }

    public final void e(boolean z10) {
        if (z10) {
            if (this.f61596e) {
                this.f61592a.reset();
                this.f61596e = false;
                return;
            }
            return;
        }
        if (this.f61597f) {
            ((s1) io.bidmachine.media3.common.util.a.checkNotNull(this.f61594c)).reset();
            this.f61597f = false;
        }
    }

    public void enable(v1 v1Var, fo.l lVar, ao.o1 o1Var, long j10, boolean z10, boolean z11, long j11, long j12, ao.k0 k0Var, q qVar) throws a0 {
        int length = lVar != null ? lVar.length() : 0;
        io.bidmachine.media3.common.b[] bVarArr = new io.bidmachine.media3.common.b[length];
        for (int i10 = 0; i10 < length; i10++) {
            bVarArr[i10] = ((fo.l) io.bidmachine.media3.common.util.a.checkNotNull(lVar)).getFormat(i10);
        }
        int i11 = this.f61595d;
        if (i11 == 0 || i11 == 2 || i11 == 4) {
            this.f61596e = true;
            this.f61592a.enable(v1Var, bVarArr, o1Var, j10, z10, z11, j11, j12, k0Var);
            qVar.onRendererEnabled(this.f61592a);
        } else {
            this.f61597f = true;
            s1 s1Var = this.f61594c;
            ((s1) io.bidmachine.media3.common.util.a.checkNotNull(s1Var)).enable(v1Var, bVarArr, o1Var, j10, z10, z11, j11, j12, k0Var);
            qVar.onRendererEnabled(s1Var);
        }
    }

    public void enableMayRenderStartOfStream() {
        s1 s1Var = this.f61592a;
        if (d(s1Var)) {
            s1Var.enableMayRenderStartOfStream();
            return;
        }
        s1 s1Var2 = this.f61594c;
        if (s1Var2 == null || !d(s1Var2)) {
            return;
        }
        s1Var2.enableMayRenderStartOfStream();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int f(s1 s1Var, z0 z0Var, fo.v vVar, q qVar) throws a0 {
        s1 s1Var2;
        int i10;
        if (s1Var == null || s1Var.getState() == 0 || (s1Var == (s1Var2 = this.f61592a) && ((i10 = this.f61595d) == 2 || i10 == 4))) {
            return 1;
        }
        if (s1Var == this.f61594c && this.f61595d == 3) {
            return 1;
        }
        ao.o1 stream = s1Var.getStream();
        ao.o1[] o1VarArr = z0Var.f61610c;
        int i11 = this.f61593b;
        Object[] objArr = stream != o1VarArr[i11];
        boolean zIsRendererEnabled = vVar.isRendererEnabled(i11);
        if (!zIsRendererEnabled || objArr != false) {
            if (!s1Var.isCurrentStreamFinal()) {
                fo.l lVar = vVar.f55927c[i11];
                int length = lVar != null ? lVar.length() : 0;
                io.bidmachine.media3.common.b[] bVarArr = new io.bidmachine.media3.common.b[length];
                for (int i12 = 0; i12 < length; i12++) {
                    bVarArr[i12] = ((fo.l) io.bidmachine.media3.common.util.a.checkNotNull(lVar)).getFormat(i12);
                }
                s1Var.replaceStream(bVarArr, (ao.o1) io.bidmachine.media3.common.util.a.checkNotNull(z0Var.f61610c[i11]), z0Var.getStartPositionRendererTime(), z0Var.getRendererOffset(), z0Var.f61615h.f60880a);
                return 3;
            }
            if (!s1Var.isEnded()) {
                return 0;
            }
            a(s1Var, qVar);
            if (!zIsRendererEnabled || isPrewarming()) {
                e(s1Var == s1Var2);
                return 1;
            }
        }
        return 1;
    }

    public int getEnabledRendererCount() {
        boolean zD = d(this.f61592a);
        s1 s1Var = this.f61594c;
        return (zD ? 1 : 0) + ((s1Var == null || !d(s1Var)) ? 0 : 1);
    }

    public long getMinDurationToProgressUs(long j10, long j11) {
        s1 s1Var = this.f61592a;
        long durationToProgressUs = d(s1Var) ? s1Var.getDurationToProgressUs(j10, j11) : Long.MAX_VALUE;
        s1 s1Var2 = this.f61594c;
        return (s1Var2 == null || !d(s1Var2)) ? durationToProgressUs : Math.min(durationToProgressUs, s1Var2.getDurationToProgressUs(j10, j11));
    }

    public long getReadingPositionUs(z0 z0Var) {
        s1 s1VarB = b(z0Var);
        Objects.requireNonNull(s1VarB);
        return s1VarB.getReadingPositionUs();
    }

    public int getTrackType() {
        return this.f61592a.getTrackType();
    }

    public void handleMessage(int i10, Object obj, z0 z0Var) throws a0 {
        ((s1) io.bidmachine.media3.common.util.a.checkNotNull(b(z0Var))).handleMessage(i10, obj);
    }

    public boolean hasFinishedReadingFromPeriod(z0 z0Var) {
        return c(z0Var, this.f61592a) && c(z0Var, this.f61594c);
    }

    public boolean hasReadPeriodToEnd(z0 z0Var) {
        return ((s1) io.bidmachine.media3.common.util.a.checkNotNull(b(z0Var))).hasReadStreamToEnd();
    }

    public boolean hasSecondary() {
        return this.f61594c != null;
    }

    public boolean isEnded() {
        s1 s1Var = this.f61592a;
        boolean zIsEnded = d(s1Var) ? s1Var.isEnded() : true;
        s1 s1Var2 = this.f61594c;
        return (s1Var2 == null || !d(s1Var2)) ? zIsEnded : zIsEnded & s1Var2.isEnded();
    }

    public boolean isPrewarming() {
        int i10 = this.f61595d;
        return i10 == 2 || i10 == 4 || i10 == 3;
    }

    public boolean isReadingFromPeriod(z0 z0Var) {
        return b(z0Var) != null;
    }

    public boolean isRendererEnabled() {
        int i10 = this.f61595d;
        return (i10 == 0 || i10 == 2 || i10 == 4) ? d(this.f61592a) : d((s1) io.bidmachine.media3.common.util.a.checkNotNull(this.f61594c));
    }

    public boolean isRendererPrewarming(int i10) {
        int i11 = this.f61595d;
        int i12 = this.f61593b;
        return ((i11 == 2 || i11 == 4) && i10 == i12) || (i11 == 3 && i10 != i12);
    }

    public void maybeDisableOrResetPosition(ao.o1 o1Var, q qVar, long j10, boolean z10) throws a0 {
        s1 s1Var = this.f61592a;
        if (d(s1Var)) {
            if (o1Var != s1Var.getStream()) {
                a(s1Var, qVar);
            } else if (z10) {
                s1Var.resetPosition(j10);
            }
        }
        s1 s1Var2 = this.f61594c;
        if (s1Var2 == null || !d(s1Var2)) {
            return;
        }
        if (o1Var != s1Var2.getStream()) {
            a(s1Var2, qVar);
        } else if (z10) {
            s1Var2.resetPosition(j10);
        }
    }

    public void maybeHandlePrewarmingTransition() throws a0 {
        int i10 = this.f61595d;
        if (i10 != 3 && i10 != 4) {
            if (i10 == 2) {
                this.f61595d = 0;
                return;
            }
            return;
        }
        boolean z10 = i10 == 4;
        s1 s1Var = this.f61592a;
        s1 s1Var2 = this.f61594c;
        if (z10) {
            ((s1) io.bidmachine.media3.common.util.a.checkNotNull(s1Var2)).handleMessage(17, s1Var);
        } else {
            s1Var.handleMessage(17, io.bidmachine.media3.common.util.a.checkNotNull(s1Var2));
        }
        this.f61595d = this.f61595d != 4 ? 1 : 0;
    }

    public void maybeSetOldStreamToFinal(fo.v vVar, fo.v vVar2, long j10) {
        int i10;
        int i11 = this.f61593b;
        boolean zIsRendererEnabled = vVar.isRendererEnabled(i11);
        boolean zIsRendererEnabled2 = vVar2.isRendererEnabled(i11);
        s1 s1Var = this.f61592a;
        s1 s1Var2 = this.f61594c;
        if (s1Var2 != null && (i10 = this.f61595d) != 3 && (i10 != 0 || !d(s1Var))) {
            s1Var = (s1) io.bidmachine.media3.common.util.a.checkNotNull(s1Var2);
        }
        if (!zIsRendererEnabled || s1Var.isCurrentStreamFinal()) {
            return;
        }
        boolean z10 = getTrackType() == -2;
        v1 v1Var = vVar.f55926b[i11];
        v1 v1Var2 = vVar2.f55926b[i11];
        if (!zIsRendererEnabled2 || !Objects.equals(v1Var2, v1Var) || z10 || isPrewarming()) {
            g(s1Var, j10);
        }
    }

    public void maybeThrowStreamError(z0 z0Var) throws IOException {
        ((s1) io.bidmachine.media3.common.util.a.checkNotNull(b(z0Var))).maybeThrowStreamError();
    }

    public void release() {
        this.f61592a.release();
        this.f61596e = false;
        s1 s1Var = this.f61594c;
        if (s1Var != null) {
            s1Var.release();
            this.f61597f = false;
        }
    }

    public void render(long j10, long j11) throws a0 {
        s1 s1Var = this.f61592a;
        if (d(s1Var)) {
            s1Var.render(j10, j11);
        }
        s1 s1Var2 = this.f61594c;
        if (s1Var2 == null || !d(s1Var2)) {
            return;
        }
        s1Var2.render(j10, j11);
    }

    public int replaceStreamsOrDisableRendererForTransition(z0 z0Var, fo.v vVar, q qVar) throws a0 {
        int iF = f(this.f61592a, z0Var, vVar, qVar);
        return iF == 1 ? f(this.f61594c, z0Var, vVar, qVar) : iF;
    }

    public void reset() {
        if (!d(this.f61592a)) {
            e(true);
        }
        s1 s1Var = this.f61594c;
        if (s1Var == null || d(s1Var)) {
            return;
        }
        e(false);
    }

    public void resetPosition(z0 z0Var, long j10) throws a0 {
        s1 s1VarB = b(z0Var);
        if (s1VarB != null) {
            s1VarB.resetPosition(j10);
        }
    }

    public void setAllNonPrewarmingRendererStreamsFinal(long j10) {
        int i10;
        s1 s1Var = this.f61592a;
        if (d(s1Var) && (i10 = this.f61595d) != 4 && i10 != 2) {
            g(s1Var, j10);
        }
        s1 s1Var2 = this.f61594c;
        if (s1Var2 == null || s1Var2.getState() == 0 || this.f61595d == 3) {
            return;
        }
        g(s1Var2, j10);
    }

    public void setCurrentStreamFinal(z0 z0Var, long j10) {
        g((s1) io.bidmachine.media3.common.util.a.checkNotNull(b(z0Var)), j10);
    }

    public void setPlaybackSpeed(float f10, float f11) throws a0 {
        this.f61592a.setPlaybackSpeed(f10, f11);
        s1 s1Var = this.f61594c;
        if (s1Var != null) {
            s1Var.setPlaybackSpeed(f10, f11);
        }
    }

    public void setTimeline(gn.u1 u1Var) {
        this.f61592a.setTimeline(u1Var);
        s1 s1Var = this.f61594c;
        if (s1Var != null) {
            s1Var.setTimeline(u1Var);
        }
    }

    public void setVideoOutput(Object obj) throws a0 {
        if (getTrackType() != 2) {
            return;
        }
        int i10 = this.f61595d;
        if (i10 == 4 || i10 == 1) {
            ((s1) io.bidmachine.media3.common.util.a.checkNotNull(this.f61594c)).handleMessage(1, obj);
        } else {
            this.f61592a.handleMessage(1, obj);
        }
    }

    public void setVolume(float f10) throws a0 {
        if (getTrackType() != 1) {
            return;
        }
        this.f61592a.handleMessage(2, Float.valueOf(f10));
        s1 s1Var = this.f61594c;
        if (s1Var != null) {
            s1Var.handleMessage(2, Float.valueOf(f10));
        }
    }

    public void start() throws a0 {
        s1 s1Var = this.f61592a;
        if (s1Var.getState() == 1 && this.f61595d != 4) {
            s1Var.start();
            return;
        }
        s1 s1Var2 = this.f61594c;
        if (s1Var2 == null || s1Var2.getState() != 1 || this.f61595d == 3) {
            return;
        }
        s1Var2.start();
    }

    public void startPrewarming() {
        int i10;
        io.bidmachine.media3.common.util.a.checkState(!isPrewarming());
        if (d(this.f61592a)) {
            i10 = 3;
        } else {
            s1 s1Var = this.f61594c;
            i10 = (s1Var == null || !d(s1Var)) ? 2 : 4;
        }
        this.f61595d = i10;
    }

    public void stop() {
        s1 s1Var = this.f61592a;
        if (d(s1Var) && s1Var.getState() == 2) {
            s1Var.stop();
        }
        s1 s1Var2 = this.f61594c;
        if (s1Var2 == null || s1Var2.getState() == 0 || s1Var2.getState() != 2) {
            return;
        }
        s1Var2.stop();
    }
}
