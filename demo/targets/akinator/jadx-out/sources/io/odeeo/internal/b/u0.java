package io.odeeo.internal.b;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.odeeo.internal.b.b;
import io.odeeo.internal.b.c;
import io.odeeo.internal.b.l0;
import io.odeeo.internal.b.m0;
import io.odeeo.internal.b.o;
import io.odeeo.internal.b.w0;
import io.odeeo.internal.s0.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes10.dex */
public class u0 extends d implements o, o.a, o.f, o.e, o.d {
    public int A;
    public int B;
    public io.odeeo.internal.e.e C;
    public io.odeeo.internal.e.e D;
    public int E;
    public io.odeeo.internal.d.d F;
    public float G;
    public boolean H;
    public List<io.odeeo.internal.d0.a> I;
    public io.odeeo.internal.r0.j J;
    public io.odeeo.internal.s0.a K;
    public boolean L;
    public boolean M;
    public io.odeeo.internal.q0.z N;
    public boolean O;
    public boolean P;
    public m Q;
    public io.odeeo.internal.r0.m R;

    /* renamed from: b, reason: collision with root package name */
    public final p0[] f63021b;

    /* renamed from: c, reason: collision with root package name */
    public final io.odeeo.internal.q0.g f63022c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f63023d;

    /* renamed from: e, reason: collision with root package name */
    public final p f63024e;

    /* renamed from: f, reason: collision with root package name */
    public final b f63025f;

    /* renamed from: g, reason: collision with root package name */
    public final c f63026g;

    /* renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArraySet<l0.e> f63027h;

    /* renamed from: i, reason: collision with root package name */
    public final io.odeeo.internal.c.a f63028i;

    /* renamed from: j, reason: collision with root package name */
    public final io.odeeo.internal.b.b f63029j;

    /* renamed from: k, reason: collision with root package name */
    public final io.odeeo.internal.b.c f63030k;

    /* renamed from: l, reason: collision with root package name */
    public final w0 f63031l;

    /* renamed from: m, reason: collision with root package name */
    public final a1 f63032m;

    /* renamed from: n, reason: collision with root package name */
    public final b1 f63033n;

    /* renamed from: o, reason: collision with root package name */
    public final long f63034o;

    /* renamed from: p, reason: collision with root package name */
    public t f63035p;

    /* renamed from: q, reason: collision with root package name */
    public t f63036q;

    /* renamed from: r, reason: collision with root package name */
    public AudioTrack f63037r;

    /* renamed from: s, reason: collision with root package name */
    public Object f63038s;

    /* renamed from: t, reason: collision with root package name */
    public Surface f63039t;

    /* renamed from: u, reason: collision with root package name */
    public SurfaceHolder f63040u;

    /* renamed from: v, reason: collision with root package name */
    public io.odeeo.internal.s0.i f63041v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f63042w;

    /* renamed from: x, reason: collision with root package name */
    public TextureView f63043x;

    /* renamed from: y, reason: collision with root package name */
    public int f63044y;

    /* renamed from: z, reason: collision with root package name */
    public int f63045z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b implements io.odeeo.internal.r0.l, io.odeeo.internal.d.g, io.odeeo.internal.d0.m, io.odeeo.internal.s.e, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, i.b, c.b, b.InterfaceC0590b, w0.b, l0.c, o.b {
        public b() {
        }

        @Override // io.odeeo.internal.b.c.b
        public void executePlayerCommand(int i10) {
            boolean playWhenReady = u0.this.getPlayWhenReady();
            u0.this.a(playWhenReady, i10, u0.b(playWhenReady, i10));
        }

        @Override // io.odeeo.internal.b.b.InterfaceC0590b
        public void onAudioBecomingNoisy() {
            u0.this.a(false, -1, 3);
        }

        @Override // io.odeeo.internal.d.g
        public void onAudioCodecError(Exception exc) {
            u0.this.f63028i.onAudioCodecError(exc);
        }

        @Override // io.odeeo.internal.d.g
        public void onAudioDecoderInitialized(String str, long j10, long j11) {
            u0.this.f63028i.onAudioDecoderInitialized(str, j10, j11);
        }

        @Override // io.odeeo.internal.d.g
        public void onAudioDecoderReleased(String str) {
            u0.this.f63028i.onAudioDecoderReleased(str);
        }

        @Override // io.odeeo.internal.d.g
        public void onAudioDisabled(io.odeeo.internal.e.e eVar) {
            u0.this.f63028i.onAudioDisabled(eVar);
            u0.this.f63036q = null;
            u0.this.D = null;
        }

        @Override // io.odeeo.internal.d.g
        public void onAudioEnabled(io.odeeo.internal.e.e eVar) {
            u0.this.D = eVar;
            u0.this.f63028i.onAudioEnabled(eVar);
        }

        @Override // io.odeeo.internal.d.g
        @Deprecated
        public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(t tVar) {
            super.onAudioInputFormatChanged(tVar);
        }

        @Override // io.odeeo.internal.d.g
        public void onAudioPositionAdvancing(long j10) {
            u0.this.f63028i.onAudioPositionAdvancing(j10);
        }

        @Override // io.odeeo.internal.d.g
        public void onAudioSinkError(Exception exc) {
            u0.this.f63028i.onAudioSinkError(exc);
        }

        @Override // io.odeeo.internal.d.g
        public void onAudioUnderrun(int i10, long j10, long j11) {
            u0.this.f63028i.onAudioUnderrun(i10, j10, j11);
        }

        @Override // io.odeeo.internal.b.l0.c
        public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(l0.b bVar) {
            super.onAvailableCommandsChanged(bVar);
        }

        @Override // io.odeeo.internal.d0.m
        public void onCues(List<io.odeeo.internal.d0.a> list) {
            u0.this.I = list;
            Iterator it = u0.this.f63027h.iterator();
            while (it.hasNext()) {
                ((l0.e) it.next()).onCues(list);
            }
        }

        @Override // io.odeeo.internal.r0.l
        public void onDroppedFrames(int i10, long j10) {
            u0.this.f63028i.onDroppedFrames(i10, j10);
        }

        @Override // io.odeeo.internal.b.l0.c
        public /* bridge */ /* synthetic */ void onEvents(l0 l0Var, l0.d dVar) {
            super.onEvents(l0Var, dVar);
        }

        @Override // io.odeeo.internal.b.o.b
        public /* bridge */ /* synthetic */ void onExperimentalOffloadSchedulingEnabledChanged(boolean z10) {
            super.onExperimentalOffloadSchedulingEnabledChanged(z10);
        }

        @Override // io.odeeo.internal.b.o.b
        public void onExperimentalSleepingForOffloadChanged(boolean z10) {
            u0.this.e();
        }

        @Override // io.odeeo.internal.b.l0.c
        public void onIsLoadingChanged(boolean z10) {
            if (u0.this.N != null) {
                if (z10 && !u0.this.O) {
                    u0.this.N.add(0);
                    u0.this.O = true;
                } else {
                    if (z10 || !u0.this.O) {
                        return;
                    }
                    u0.this.N.remove(0);
                    u0.this.O = false;
                }
            }
        }

        @Override // io.odeeo.internal.b.l0.c
        public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z10) {
            super.onIsPlayingChanged(z10);
        }

        @Override // io.odeeo.internal.b.l0.c
        @Deprecated
        public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z10) {
            super.onLoadingChanged(z10);
        }

        @Override // io.odeeo.internal.b.l0.c
        public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j10) {
            super.onMaxSeekToPreviousPositionChanged(j10);
        }

        @Override // io.odeeo.internal.b.l0.c
        public /* bridge */ /* synthetic */ void onMediaItemTransition(z zVar, int i10) {
            super.onMediaItemTransition(zVar, i10);
        }

        @Override // io.odeeo.internal.b.l0.c
        public /* bridge */ /* synthetic */ void onMediaMetadataChanged(a0 a0Var) {
            super.onMediaMetadataChanged(a0Var);
        }

        @Override // io.odeeo.internal.s.e
        public void onMetadata(io.odeeo.internal.s.a aVar) {
            u0.this.f63028i.onMetadata(aVar);
            u0.this.f63024e.onMetadata(aVar);
            Iterator it = u0.this.f63027h.iterator();
            while (it.hasNext()) {
                ((l0.e) it.next()).onMetadata(aVar);
            }
        }

        @Override // io.odeeo.internal.b.l0.c
        public void onPlayWhenReadyChanged(boolean z10, int i10) {
            u0.this.e();
        }

        @Override // io.odeeo.internal.b.l0.c
        public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(k0 k0Var) {
            super.onPlaybackParametersChanged(k0Var);
        }

        @Override // io.odeeo.internal.b.l0.c
        public void onPlaybackStateChanged(int i10) {
            u0.this.e();
        }

        @Override // io.odeeo.internal.b.l0.c
        public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
            super.onPlaybackSuppressionReasonChanged(i10);
        }

        @Override // io.odeeo.internal.b.l0.c
        public /* bridge */ /* synthetic */ void onPlayerError(i0 i0Var) {
            super.onPlayerError(i0Var);
        }

        @Override // io.odeeo.internal.b.l0.c
        public /* bridge */ /* synthetic */ void onPlayerErrorChanged(i0 i0Var) {
            super.onPlayerErrorChanged(i0Var);
        }

        @Override // io.odeeo.internal.b.l0.c
        @Deprecated
        public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
            super.onPlayerStateChanged(z10, i10);
        }

        @Override // io.odeeo.internal.b.l0.c
        public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(a0 a0Var) {
            super.onPlaylistMetadataChanged(a0Var);
        }

        @Override // io.odeeo.internal.b.l0.c
        @Deprecated
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i10) {
            super.onPositionDiscontinuity(i10);
        }

        @Override // io.odeeo.internal.r0.l
        public void onRenderedFirstFrame(Object obj, long j10) {
            u0.this.f63028i.onRenderedFirstFrame(obj, j10);
            if (u0.this.f63038s == obj) {
                Iterator it = u0.this.f63027h.iterator();
                while (it.hasNext()) {
                    ((l0.e) it.next()).onRenderedFirstFrame();
                }
            }
        }

        @Override // io.odeeo.internal.b.l0.c
        public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i10) {
            super.onRepeatModeChanged(i10);
        }

        @Override // io.odeeo.internal.b.l0.c
        public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j10) {
            super.onSeekBackIncrementChanged(j10);
        }

        @Override // io.odeeo.internal.b.l0.c
        public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j10) {
            super.onSeekForwardIncrementChanged(j10);
        }

        @Override // io.odeeo.internal.b.l0.c
        @Deprecated
        public /* bridge */ /* synthetic */ void onSeekProcessed() {
            super.onSeekProcessed();
        }

        @Override // io.odeeo.internal.b.l0.c
        public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
            super.onShuffleModeEnabledChanged(z10);
        }

        @Override // io.odeeo.internal.d.g
        public void onSkipSilenceEnabledChanged(boolean z10) {
            if (u0.this.H == z10) {
                return;
            }
            u0.this.H = z10;
            u0.this.b();
        }

        @Override // io.odeeo.internal.b.w0.b
        public void onStreamTypeChanged(int i10) {
            m mVarB = u0.b(u0.this.f63031l);
            if (mVarB.equals(u0.this.Q)) {
                return;
            }
            u0.this.Q = mVarB;
            Iterator it = u0.this.f63027h.iterator();
            while (it.hasNext()) {
                ((l0.e) it.next()).onDeviceInfoChanged(mVarB);
            }
        }

        @Override // io.odeeo.internal.b.w0.b
        public void onStreamVolumeChanged(int i10, boolean z10) {
            Iterator it = u0.this.f63027h.iterator();
            while (it.hasNext()) {
                ((l0.e) it.next()).onDeviceVolumeChanged(i10, z10);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            u0.this.a(surfaceTexture);
            u0.this.a(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            u0.this.a((Object) null);
            u0.this.a(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            u0.this.a(i10, i11);
        }

        @Override // io.odeeo.internal.b.l0.c
        public /* bridge */ /* synthetic */ void onTimelineChanged(y0 y0Var, int i10) {
            super.onTimelineChanged(y0Var, i10);
        }

        @Override // io.odeeo.internal.b.l0.c
        public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(io.odeeo.internal.n0.j jVar) {
            super.onTrackSelectionParametersChanged(jVar);
        }

        @Override // io.odeeo.internal.b.l0.c
        @Deprecated
        public /* bridge */ /* synthetic */ void onTracksChanged(io.odeeo.internal.a0.l0 l0Var, io.odeeo.internal.n0.h hVar) {
            super.onTracksChanged(l0Var, hVar);
        }

        @Override // io.odeeo.internal.b.l0.c
        public /* bridge */ /* synthetic */ void onTracksInfoChanged(z0 z0Var) {
            super.onTracksInfoChanged(z0Var);
        }

        @Override // io.odeeo.internal.r0.l
        public void onVideoCodecError(Exception exc) {
            u0.this.f63028i.onVideoCodecError(exc);
        }

        @Override // io.odeeo.internal.r0.l
        public void onVideoDecoderInitialized(String str, long j10, long j11) {
            u0.this.f63028i.onVideoDecoderInitialized(str, j10, j11);
        }

        @Override // io.odeeo.internal.r0.l
        public void onVideoDecoderReleased(String str) {
            u0.this.f63028i.onVideoDecoderReleased(str);
        }

        @Override // io.odeeo.internal.r0.l
        public void onVideoDisabled(io.odeeo.internal.e.e eVar) {
            u0.this.f63028i.onVideoDisabled(eVar);
            u0.this.f63035p = null;
            u0.this.C = null;
        }

        @Override // io.odeeo.internal.r0.l
        public void onVideoEnabled(io.odeeo.internal.e.e eVar) {
            u0.this.C = eVar;
            u0.this.f63028i.onVideoEnabled(eVar);
        }

        @Override // io.odeeo.internal.r0.l
        public void onVideoFrameProcessingOffset(long j10, int i10) {
            u0.this.f63028i.onVideoFrameProcessingOffset(j10, i10);
        }

        @Override // io.odeeo.internal.r0.l
        @Deprecated
        public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(t tVar) {
            super.onVideoInputFormatChanged(tVar);
        }

        @Override // io.odeeo.internal.r0.l
        public void onVideoSizeChanged(io.odeeo.internal.r0.m mVar) {
            u0.this.R = mVar;
            u0.this.f63028i.onVideoSizeChanged(mVar);
            Iterator it = u0.this.f63027h.iterator();
            while (it.hasNext()) {
                ((l0.e) it.next()).onVideoSizeChanged(mVar);
            }
        }

        @Override // io.odeeo.internal.s0.i.b
        public void onVideoSurfaceCreated(Surface surface) {
            u0.this.a(surface);
        }

        @Override // io.odeeo.internal.s0.i.b
        public void onVideoSurfaceDestroyed(Surface surface) {
            u0.this.a((Object) null);
        }

        @Override // io.odeeo.internal.b.c.b
        public void setVolumeMultiplier(float f10) {
            u0.this.d();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            u0.this.a(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (u0.this.f63042w) {
                u0.this.a(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (u0.this.f63042w) {
                u0.this.a((Object) null);
            }
            u0.this.a(0, 0);
        }

        @Override // io.odeeo.internal.d.g
        public void onAudioInputFormatChanged(t tVar, io.odeeo.internal.e.i iVar) {
            u0.this.f63036q = tVar;
            u0.this.f63028i.onAudioInputFormatChanged(tVar, iVar);
        }

        @Override // io.odeeo.internal.b.l0.c
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(l0.f fVar, l0.f fVar2, int i10) {
            super.onPositionDiscontinuity(fVar, fVar2, i10);
        }

        @Override // io.odeeo.internal.r0.l
        public void onVideoInputFormatChanged(t tVar, io.odeeo.internal.e.i iVar) {
            u0.this.f63035p = tVar;
            u0.this.f63028i.onVideoInputFormatChanged(tVar, iVar);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements io.odeeo.internal.r0.j, io.odeeo.internal.s0.a, m0.b {

        /* renamed from: a, reason: collision with root package name */
        public io.odeeo.internal.r0.j f63047a;

        /* renamed from: b, reason: collision with root package name */
        public io.odeeo.internal.s0.a f63048b;

        /* renamed from: c, reason: collision with root package name */
        public io.odeeo.internal.r0.j f63049c;

        /* renamed from: e, reason: collision with root package name */
        public io.odeeo.internal.s0.a f63050e;

        public c() {
        }

        @Override // io.odeeo.internal.b.m0.b
        public void handleMessage(int i10, Object obj) {
            if (i10 == 7) {
                this.f63047a = (io.odeeo.internal.r0.j) obj;
                return;
            }
            if (i10 == 8) {
                this.f63048b = (io.odeeo.internal.s0.a) obj;
                return;
            }
            if (i10 != 10000) {
                return;
            }
            io.odeeo.internal.s0.i iVar = (io.odeeo.internal.s0.i) obj;
            if (iVar == null) {
                this.f63049c = null;
                this.f63050e = null;
            } else {
                this.f63049c = iVar.getVideoFrameMetadataListener();
                this.f63050e = iVar.getCameraMotionListener();
            }
        }

        @Override // io.odeeo.internal.s0.a
        public void onCameraMotion(long j10, float[] fArr) {
            io.odeeo.internal.s0.a aVar = this.f63050e;
            if (aVar != null) {
                aVar.onCameraMotion(j10, fArr);
            }
            io.odeeo.internal.s0.a aVar2 = this.f63048b;
            if (aVar2 != null) {
                aVar2.onCameraMotion(j10, fArr);
            }
        }

        @Override // io.odeeo.internal.s0.a
        public void onCameraMotionReset() {
            io.odeeo.internal.s0.a aVar = this.f63050e;
            if (aVar != null) {
                aVar.onCameraMotionReset();
            }
            io.odeeo.internal.s0.a aVar2 = this.f63048b;
            if (aVar2 != null) {
                aVar2.onCameraMotionReset();
            }
        }

        @Override // io.odeeo.internal.r0.j
        public void onVideoFrameAboutToBeRendered(long j10, long j11, t tVar, MediaFormat mediaFormat) {
            long j12;
            long j13;
            t tVar2;
            MediaFormat mediaFormat2;
            io.odeeo.internal.r0.j jVar = this.f63049c;
            if (jVar != null) {
                jVar.onVideoFrameAboutToBeRendered(j10, j11, tVar, mediaFormat);
                mediaFormat2 = mediaFormat;
                tVar2 = tVar;
                j13 = j11;
                j12 = j10;
            } else {
                j12 = j10;
                j13 = j11;
                tVar2 = tVar;
                mediaFormat2 = mediaFormat;
            }
            io.odeeo.internal.r0.j jVar2 = this.f63047a;
            if (jVar2 != null) {
                jVar2.onVideoFrameAboutToBeRendered(j12, j13, tVar2, mediaFormat2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [io.odeeo.internal.b.d, io.odeeo.internal.b.u0] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [io.odeeo.internal.b.u0] */
    public u0(o.c cVar) throws Throwable {
        u0 u0Var;
        ?? dVar = new d();
        io.odeeo.internal.q0.g gVar = new io.odeeo.internal.q0.g();
        dVar.f63022c = gVar;
        try {
            Context applicationContext = cVar.f62847a.getApplicationContext();
            dVar.f63023d = applicationContext;
            io.odeeo.internal.c.a aVar = cVar.f62855i.get();
            dVar.f63028i = aVar;
            dVar.N = cVar.f62857k;
            dVar.F = cVar.f62858l;
            dVar.f63044y = cVar.f62863q;
            dVar.f63045z = cVar.f62864r;
            dVar.H = cVar.f62862p;
            dVar.f63034o = cVar.f62871y;
            b bVar = new b();
            dVar.f63025f = bVar;
            c cVar2 = new c();
            dVar.f63026g = cVar2;
            dVar.f63027h = new CopyOnWriteArraySet<>();
            Handler handler = new Handler(cVar.f62856j);
            p0[] p0VarArrCreateRenderers = cVar.f62850d.get().createRenderers(handler, bVar, bVar, bVar, bVar);
            dVar.f63021b = p0VarArrCreateRenderers;
            dVar.G = 1.0f;
            if (io.odeeo.internal.q0.g0.f65861a < 21) {
                dVar.E = dVar.a(0);
            } else {
                dVar.E = io.odeeo.internal.q0.g0.generateAudioSessionIdV21(applicationContext);
            }
            dVar.I = Collections.EMPTY_LIST;
            dVar.L = true;
            try {
                try {
                    p pVar = new p(p0VarArrCreateRenderers, cVar.f62852f.get(), cVar.f62851e.get(), cVar.f62853g.get(), cVar.f62854h.get(), aVar, cVar.f62865s, cVar.f62866t, cVar.f62867u, cVar.f62868v, cVar.f62869w, cVar.f62870x, cVar.f62872z, cVar.f62848b, cVar.f62856j, this, new l0.b.a().addAll(21, 22, 23, 24, 25, 26, 27, 28).build());
                    dVar = this;
                    dVar.f63024e = pVar;
                    pVar.addEventListener(bVar);
                    pVar.addAudioOffloadListener(bVar);
                    long j10 = cVar.f62849c;
                    if (j10 > 0) {
                        pVar.experimentalSetForegroundModeTimeoutMs(j10);
                    }
                    io.odeeo.internal.b.b bVar2 = new io.odeeo.internal.b.b(cVar.f62847a, handler, bVar);
                    dVar.f63029j = bVar2;
                    bVar2.setEnabled(cVar.f62861o);
                    io.odeeo.internal.b.c cVar3 = new io.odeeo.internal.b.c(cVar.f62847a, handler, bVar);
                    dVar.f63030k = cVar3;
                    cVar3.setAudioAttributes(cVar.f62859m ? dVar.F : null);
                    w0 w0Var = new w0(cVar.f62847a, handler, bVar);
                    dVar.f63031l = w0Var;
                    w0Var.setStreamType(io.odeeo.internal.q0.g0.getStreamTypeForAudioUsage(dVar.F.f63338c));
                    a1 a1Var = new a1(cVar.f62847a);
                    dVar.f63032m = a1Var;
                    a1Var.setEnabled(cVar.f62860n != 0);
                    b1 b1Var = new b1(cVar.f62847a);
                    dVar.f63033n = b1Var;
                    b1Var.setEnabled(cVar.f62860n == 2);
                    dVar.Q = b(w0Var);
                    dVar.R = io.odeeo.internal.r0.m.f66222e;
                    dVar.a(1, 10, Integer.valueOf(dVar.E));
                    dVar.a(2, 10, Integer.valueOf(dVar.E));
                    dVar.a(1, 3, dVar.F);
                    dVar.a(2, 4, Integer.valueOf(dVar.f63044y));
                    dVar.a(2, 5, Integer.valueOf(dVar.f63045z));
                    dVar.a(1, 9, Boolean.valueOf(dVar.H));
                    dVar.a(2, 7, cVar2);
                    dVar.a(6, 8, cVar2);
                    gVar.open();
                } catch (Throwable th2) {
                    th = th2;
                    u0Var = this;
                    u0Var.f63022c.open();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                u0Var = this;
            }
        } catch (Throwable th4) {
            th = th4;
            u0Var = dVar;
        }
    }

    public static int b(boolean z10, int i10) {
        return (!z10 || i10 == 1) ? 1 : 2;
    }

    @Override // io.odeeo.internal.b.o
    public void addAnalyticsListener(io.odeeo.internal.c.b bVar) {
        io.odeeo.internal.q0.a.checkNotNull(bVar);
        this.f63028i.addListener(bVar);
    }

    @Override // io.odeeo.internal.b.o
    public void addAudioOffloadListener(o.b bVar) {
        this.f63024e.addAudioOffloadListener(bVar);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void addListener(l0.e eVar) {
        io.odeeo.internal.q0.a.checkNotNull(eVar);
        this.f63027h.add(eVar);
        addListener((l0.c) eVar);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void addMediaItems(int i10, List<z> list) {
        f();
        this.f63024e.addMediaItems(i10, list);
    }

    @Override // io.odeeo.internal.b.o
    public void addMediaSource(io.odeeo.internal.a0.t tVar) {
        f();
        this.f63024e.addMediaSource(tVar);
    }

    @Override // io.odeeo.internal.b.o
    public void addMediaSources(List<io.odeeo.internal.a0.t> list) {
        f();
        this.f63024e.addMediaSources(list);
    }

    @Override // io.odeeo.internal.b.o, io.odeeo.internal.b.o.a
    public void clearAuxEffectInfo() {
        setAuxEffectInfo(new io.odeeo.internal.d.k(0, 0.0f));
    }

    @Override // io.odeeo.internal.b.o, io.odeeo.internal.b.o.f
    public void clearCameraMotionListener(io.odeeo.internal.s0.a aVar) {
        f();
        if (this.K != aVar) {
            return;
        }
        this.f63024e.createMessage(this.f63026g).setType(8).setPayload(null).send();
    }

    @Override // io.odeeo.internal.b.o, io.odeeo.internal.b.o.f
    public void clearVideoFrameMetadataListener(io.odeeo.internal.r0.j jVar) {
        f();
        if (this.J != jVar) {
            return;
        }
        this.f63024e.createMessage(this.f63026g).setType(7).setPayload(null).send();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void clearVideoSurface() {
        f();
        c();
        a((Object) null);
        a(0, 0);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        f();
        if (surfaceHolder == null || surfaceHolder != this.f63040u) {
            return;
        }
        clearVideoSurface();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void clearVideoSurfaceView(SurfaceView surfaceView) {
        f();
        clearVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void clearVideoTextureView(TextureView textureView) {
        f();
        if (textureView == null || textureView != this.f63043x) {
            return;
        }
        clearVideoSurface();
    }

    @Override // io.odeeo.internal.b.o
    public m0 createMessage(m0.b bVar) {
        f();
        return this.f63024e.createMessage(bVar);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void decreaseDeviceVolume() {
        f();
        this.f63031l.decreaseVolume();
    }

    @Override // io.odeeo.internal.b.o
    public boolean experimentalIsSleepingForOffload() {
        f();
        return this.f63024e.experimentalIsSleepingForOffload();
    }

    @Override // io.odeeo.internal.b.o
    public void experimentalSetOffloadSchedulingEnabled(boolean z10) {
        f();
        this.f63024e.experimentalSetOffloadSchedulingEnabled(z10);
    }

    @Override // io.odeeo.internal.b.o
    public io.odeeo.internal.c.a getAnalyticsCollector() {
        return this.f63028i;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public Looper getApplicationLooper() {
        return this.f63024e.getApplicationLooper();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public io.odeeo.internal.d.d getAudioAttributes() {
        return this.F;
    }

    @Override // io.odeeo.internal.b.o
    public io.odeeo.internal.e.e getAudioDecoderCounters() {
        return this.D;
    }

    @Override // io.odeeo.internal.b.o
    public t getAudioFormat() {
        return this.f63036q;
    }

    @Override // io.odeeo.internal.b.o, io.odeeo.internal.b.o.a
    public int getAudioSessionId() {
        return this.E;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public l0.b getAvailableCommands() {
        f();
        return this.f63024e.getAvailableCommands();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public long getBufferedPosition() {
        f();
        return this.f63024e.getBufferedPosition();
    }

    @Override // io.odeeo.internal.b.o
    public io.odeeo.internal.q0.d getClock() {
        return this.f63024e.getClock();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public long getContentBufferedPosition() {
        f();
        return this.f63024e.getContentBufferedPosition();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public long getContentPosition() {
        f();
        return this.f63024e.getContentPosition();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public int getCurrentAdGroupIndex() {
        f();
        return this.f63024e.getCurrentAdGroupIndex();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public int getCurrentAdIndexInAdGroup() {
        f();
        return this.f63024e.getCurrentAdIndexInAdGroup();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public List<io.odeeo.internal.d0.a> getCurrentCues() {
        f();
        return this.I;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public int getCurrentMediaItemIndex() {
        f();
        return this.f63024e.getCurrentMediaItemIndex();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public int getCurrentPeriodIndex() {
        f();
        return this.f63024e.getCurrentPeriodIndex();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public long getCurrentPosition() {
        f();
        return this.f63024e.getCurrentPosition();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public y0 getCurrentTimeline() {
        f();
        return this.f63024e.getCurrentTimeline();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public io.odeeo.internal.a0.l0 getCurrentTrackGroups() {
        f();
        return this.f63024e.getCurrentTrackGroups();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public io.odeeo.internal.n0.h getCurrentTrackSelections() {
        f();
        return this.f63024e.getCurrentTrackSelections();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public z0 getCurrentTracksInfo() {
        f();
        return this.f63024e.getCurrentTracksInfo();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public m getDeviceInfo() {
        f();
        return this.Q;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public int getDeviceVolume() {
        f();
        return this.f63031l.getVolume();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public long getDuration() {
        f();
        return this.f63024e.getDuration();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public long getMaxSeekToPreviousPosition() {
        f();
        return this.f63024e.getMaxSeekToPreviousPosition();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public a0 getMediaMetadata() {
        return this.f63024e.getMediaMetadata();
    }

    @Override // io.odeeo.internal.b.o
    public boolean getPauseAtEndOfMediaItems() {
        f();
        return this.f63024e.getPauseAtEndOfMediaItems();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public boolean getPlayWhenReady() {
        f();
        return this.f63024e.getPlayWhenReady();
    }

    @Override // io.odeeo.internal.b.o
    public Looper getPlaybackLooper() {
        return this.f63024e.getPlaybackLooper();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public k0 getPlaybackParameters() {
        f();
        return this.f63024e.getPlaybackParameters();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public int getPlaybackState() {
        f();
        return this.f63024e.getPlaybackState();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public int getPlaybackSuppressionReason() {
        f();
        return this.f63024e.getPlaybackSuppressionReason();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public a0 getPlaylistMetadata() {
        return this.f63024e.getPlaylistMetadata();
    }

    @Override // io.odeeo.internal.b.o
    public int getRendererCount() {
        f();
        return this.f63024e.getRendererCount();
    }

    @Override // io.odeeo.internal.b.o
    public int getRendererType(int i10) {
        f();
        return this.f63024e.getRendererType(i10);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public int getRepeatMode() {
        f();
        return this.f63024e.getRepeatMode();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public long getSeekBackIncrement() {
        f();
        return this.f63024e.getSeekBackIncrement();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public long getSeekForwardIncrement() {
        f();
        return this.f63024e.getSeekForwardIncrement();
    }

    @Override // io.odeeo.internal.b.o
    public t0 getSeekParameters() {
        f();
        return this.f63024e.getSeekParameters();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public boolean getShuffleModeEnabled() {
        f();
        return this.f63024e.getShuffleModeEnabled();
    }

    @Override // io.odeeo.internal.b.o, io.odeeo.internal.b.o.a
    public boolean getSkipSilenceEnabled() {
        return this.H;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public long getTotalBufferedDuration() {
        f();
        return this.f63024e.getTotalBufferedDuration();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public io.odeeo.internal.n0.j getTrackSelectionParameters() {
        f();
        return this.f63024e.getTrackSelectionParameters();
    }

    @Override // io.odeeo.internal.b.o
    public io.odeeo.internal.n0.k getTrackSelector() {
        f();
        return this.f63024e.getTrackSelector();
    }

    @Override // io.odeeo.internal.b.o, io.odeeo.internal.b.o.f
    public int getVideoChangeFrameRateStrategy() {
        return this.f63045z;
    }

    @Override // io.odeeo.internal.b.o
    public io.odeeo.internal.e.e getVideoDecoderCounters() {
        return this.C;
    }

    @Override // io.odeeo.internal.b.o
    public t getVideoFormat() {
        return this.f63035p;
    }

    @Override // io.odeeo.internal.b.o, io.odeeo.internal.b.o.f
    public int getVideoScalingMode() {
        return this.f63044y;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public io.odeeo.internal.r0.m getVideoSize() {
        return this.R;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public float getVolume() {
        return this.G;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void increaseDeviceVolume() {
        f();
        this.f63031l.increaseVolume();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public boolean isDeviceMuted() {
        f();
        return this.f63031l.isMuted();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public boolean isLoading() {
        f();
        return this.f63024e.isLoading();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public boolean isPlayingAd() {
        f();
        return this.f63024e.isPlayingAd();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void moveMediaItems(int i10, int i11, int i12) {
        f();
        this.f63024e.moveMediaItems(i10, i11, i12);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void prepare() {
        f();
        boolean playWhenReady = getPlayWhenReady();
        int iUpdateAudioFocus = this.f63030k.updateAudioFocus(playWhenReady, 2);
        a(playWhenReady, iUpdateAudioFocus, b(playWhenReady, iUpdateAudioFocus));
        this.f63024e.prepare();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void release() {
        AudioTrack audioTrack;
        f();
        if (io.odeeo.internal.q0.g0.f65861a < 21 && (audioTrack = this.f63037r) != null) {
            audioTrack.release();
            this.f63037r = null;
        }
        this.f63029j.setEnabled(false);
        this.f63031l.release();
        this.f63032m.setStayAwake(false);
        this.f63033n.setStayAwake(false);
        this.f63030k.release();
        this.f63024e.release();
        this.f63028i.release();
        c();
        Surface surface = this.f63039t;
        if (surface != null) {
            surface.release();
            this.f63039t = null;
        }
        if (this.O) {
            ((io.odeeo.internal.q0.z) io.odeeo.internal.q0.a.checkNotNull(this.N)).remove(0);
            this.O = false;
        }
        this.I = Collections.EMPTY_LIST;
        this.P = true;
    }

    @Override // io.odeeo.internal.b.o
    public void removeAnalyticsListener(io.odeeo.internal.c.b bVar) {
        this.f63028i.removeListener(bVar);
    }

    @Override // io.odeeo.internal.b.o
    public void removeAudioOffloadListener(o.b bVar) {
        this.f63024e.removeAudioOffloadListener(bVar);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void removeListener(l0.e eVar) {
        io.odeeo.internal.q0.a.checkNotNull(eVar);
        this.f63027h.remove(eVar);
        removeListener((l0.c) eVar);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void removeMediaItems(int i10, int i11) {
        f();
        this.f63024e.removeMediaItems(i10, i11);
    }

    @Override // io.odeeo.internal.b.o
    @Deprecated
    public void retry() {
        f();
        prepare();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void seekTo(int i10, long j10) {
        f();
        this.f63028i.notifySeekStarted();
        this.f63024e.seekTo(i10, j10);
    }

    @Override // io.odeeo.internal.b.o, io.odeeo.internal.b.o.a
    public void setAudioAttributes(io.odeeo.internal.d.d dVar, boolean z10) {
        f();
        if (this.P) {
            return;
        }
        if (!io.odeeo.internal.q0.g0.areEqual(this.F, dVar)) {
            this.F = dVar;
            a(1, 3, dVar);
            this.f63031l.setStreamType(io.odeeo.internal.q0.g0.getStreamTypeForAudioUsage(dVar.f63338c));
            this.f63028i.onAudioAttributesChanged(dVar);
            Iterator<l0.e> it = this.f63027h.iterator();
            while (it.hasNext()) {
                it.next().onAudioAttributesChanged(dVar);
            }
        }
        io.odeeo.internal.b.c cVar = this.f63030k;
        if (!z10) {
            dVar = null;
        }
        cVar.setAudioAttributes(dVar);
        boolean playWhenReady = getPlayWhenReady();
        int iUpdateAudioFocus = this.f63030k.updateAudioFocus(playWhenReady, getPlaybackState());
        a(playWhenReady, iUpdateAudioFocus, b(playWhenReady, iUpdateAudioFocus));
    }

    @Override // io.odeeo.internal.b.o, io.odeeo.internal.b.o.a
    public void setAudioSessionId(int i10) {
        f();
        if (this.E == i10) {
            return;
        }
        if (i10 == 0) {
            i10 = io.odeeo.internal.q0.g0.f65861a < 21 ? a(0) : io.odeeo.internal.q0.g0.generateAudioSessionIdV21(this.f63023d);
        } else if (io.odeeo.internal.q0.g0.f65861a < 21) {
            a(i10);
        }
        this.E = i10;
        a(1, 10, Integer.valueOf(i10));
        a(2, 10, Integer.valueOf(i10));
        this.f63028i.onAudioSessionIdChanged(i10);
        Iterator<l0.e> it = this.f63027h.iterator();
        while (it.hasNext()) {
            it.next().onAudioSessionIdChanged(i10);
        }
    }

    @Override // io.odeeo.internal.b.o, io.odeeo.internal.b.o.a
    public void setAuxEffectInfo(io.odeeo.internal.d.k kVar) {
        f();
        a(1, 6, kVar);
    }

    @Override // io.odeeo.internal.b.o, io.odeeo.internal.b.o.f
    public void setCameraMotionListener(io.odeeo.internal.s0.a aVar) {
        f();
        this.K = aVar;
        this.f63024e.createMessage(this.f63026g).setType(8).setPayload(aVar).send();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setDeviceMuted(boolean z10) {
        f();
        this.f63031l.setMuted(z10);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setDeviceVolume(int i10) {
        f();
        this.f63031l.setVolume(i10);
    }

    @Override // io.odeeo.internal.b.o
    public void setForegroundMode(boolean z10) {
        f();
        this.f63024e.setForegroundMode(z10);
    }

    @Override // io.odeeo.internal.b.o
    public void setHandleAudioBecomingNoisy(boolean z10) {
        f();
        if (this.P) {
            return;
        }
        this.f63029j.setEnabled(z10);
    }

    @Override // io.odeeo.internal.b.o
    @Deprecated
    public void setHandleWakeLock(boolean z10) {
        setWakeMode(z10 ? 1 : 0);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setMediaItems(List<z> list, boolean z10) {
        f();
        this.f63024e.setMediaItems(list, z10);
    }

    @Override // io.odeeo.internal.b.o
    public void setMediaSource(io.odeeo.internal.a0.t tVar) {
        f();
        this.f63024e.setMediaSource(tVar);
    }

    @Override // io.odeeo.internal.b.o
    public void setMediaSources(List<io.odeeo.internal.a0.t> list) {
        f();
        this.f63024e.setMediaSources(list);
    }

    @Override // io.odeeo.internal.b.o
    public void setPauseAtEndOfMediaItems(boolean z10) {
        f();
        this.f63024e.setPauseAtEndOfMediaItems(z10);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setPlayWhenReady(boolean z10) {
        f();
        int iUpdateAudioFocus = this.f63030k.updateAudioFocus(z10, getPlaybackState());
        a(z10, iUpdateAudioFocus, b(z10, iUpdateAudioFocus));
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setPlaybackParameters(k0 k0Var) {
        f();
        this.f63024e.setPlaybackParameters(k0Var);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setPlaylistMetadata(a0 a0Var) {
        this.f63024e.setPlaylistMetadata(a0Var);
    }

    @Override // io.odeeo.internal.b.o
    public void setPriorityTaskManager(io.odeeo.internal.q0.z zVar) {
        f();
        if (io.odeeo.internal.q0.g0.areEqual(this.N, zVar)) {
            return;
        }
        if (this.O) {
            ((io.odeeo.internal.q0.z) io.odeeo.internal.q0.a.checkNotNull(this.N)).remove(0);
        }
        if (zVar == null || !isLoading()) {
            this.O = false;
        } else {
            zVar.add(0);
            this.O = true;
        }
        this.N = zVar;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setRepeatMode(int i10) {
        f();
        this.f63024e.setRepeatMode(i10);
    }

    @Override // io.odeeo.internal.b.o
    public void setSeekParameters(t0 t0Var) {
        f();
        this.f63024e.setSeekParameters(t0Var);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setShuffleModeEnabled(boolean z10) {
        f();
        this.f63024e.setShuffleModeEnabled(z10);
    }

    @Override // io.odeeo.internal.b.o
    public void setShuffleOrder(io.odeeo.internal.a0.f0 f0Var) {
        f();
        this.f63024e.setShuffleOrder(f0Var);
    }

    @Override // io.odeeo.internal.b.o, io.odeeo.internal.b.o.a
    public void setSkipSilenceEnabled(boolean z10) {
        f();
        if (this.H == z10) {
            return;
        }
        this.H = z10;
        a(1, 9, Boolean.valueOf(z10));
        b();
    }

    @Override // io.odeeo.internal.b.o
    @Deprecated
    public void setThrowsWhenUsingWrongThread(boolean z10) {
        this.L = z10;
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setTrackSelectionParameters(io.odeeo.internal.n0.j jVar) {
        f();
        this.f63024e.setTrackSelectionParameters(jVar);
    }

    @Override // io.odeeo.internal.b.o, io.odeeo.internal.b.o.f
    public void setVideoChangeFrameRateStrategy(int i10) {
        f();
        if (this.f63045z == i10) {
            return;
        }
        this.f63045z = i10;
        a(2, 5, Integer.valueOf(i10));
    }

    @Override // io.odeeo.internal.b.o, io.odeeo.internal.b.o.f
    public void setVideoFrameMetadataListener(io.odeeo.internal.r0.j jVar) {
        f();
        this.J = jVar;
        this.f63024e.createMessage(this.f63026g).setType(7).setPayload(jVar).send();
    }

    @Override // io.odeeo.internal.b.o, io.odeeo.internal.b.o.f
    public void setVideoScalingMode(int i10) {
        f();
        this.f63044y = i10;
        a(2, 4, Integer.valueOf(i10));
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setVideoSurface(Surface surface) {
        f();
        c();
        a(surface);
        int i10 = surface == null ? 0 : -1;
        a(i10, i10);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        f();
        if (surfaceHolder == null) {
            clearVideoSurface();
            return;
        }
        c();
        this.f63042w = true;
        this.f63040u = surfaceHolder;
        surfaceHolder.addCallback(this.f63025f);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            a((Object) null);
            a(0, 0);
        } else {
            a(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            a(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setVideoSurfaceView(SurfaceView surfaceView) {
        f();
        if (surfaceView instanceof io.odeeo.internal.r0.i) {
            c();
            a(surfaceView);
            a(surfaceView.getHolder());
        } else {
            if (!(surfaceView instanceof io.odeeo.internal.s0.i)) {
                setVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            c();
            this.f63041v = (io.odeeo.internal.s0.i) surfaceView;
            this.f63024e.createMessage(this.f63026g).setType(10000).setPayload(this.f63041v).send();
            this.f63041v.addVideoSurfaceListener(this.f63025f);
            a(this.f63041v.getVideoSurface());
            a(surfaceView.getHolder());
        }
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setVideoTextureView(TextureView textureView) {
        f();
        if (textureView == null) {
            clearVideoSurface();
            return;
        }
        c();
        this.f63043x = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            io.odeeo.internal.q0.p.w("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f63025f);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            a((Object) null);
            a(0, 0);
        } else {
            a(surfaceTexture);
            a(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setVolume(float f10) {
        f();
        float fConstrainValue = io.odeeo.internal.q0.g0.constrainValue(f10, 0.0f, 1.0f);
        if (this.G == fConstrainValue) {
            return;
        }
        this.G = fConstrainValue;
        d();
        this.f63028i.onVolumeChanged(fConstrainValue);
        Iterator<l0.e> it = this.f63027h.iterator();
        while (it.hasNext()) {
            it.next().onVolumeChanged(fConstrainValue);
        }
    }

    @Override // io.odeeo.internal.b.o
    public void setWakeMode(int i10) {
        f();
        if (i10 == 0) {
            this.f63032m.setEnabled(false);
            this.f63033n.setEnabled(false);
        } else if (i10 == 1) {
            this.f63032m.setEnabled(true);
            this.f63033n.setEnabled(false);
        } else {
            if (i10 != 2) {
                return;
            }
            this.f63032m.setEnabled(true);
            this.f63033n.setEnabled(true);
        }
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void stop() {
        stop(false);
    }

    public final void c() {
        if (this.f63041v != null) {
            this.f63024e.createMessage(this.f63026g).setType(10000).setPayload(null).send();
            this.f63041v.removeVideoSurfaceListener(this.f63025f);
            this.f63041v = null;
        }
        TextureView textureView = this.f63043x;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f63025f) {
                io.odeeo.internal.q0.p.w("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f63043x.setSurfaceTextureListener(null);
            }
            this.f63043x = null;
        }
        SurfaceHolder surfaceHolder = this.f63040u;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f63025f);
            this.f63040u = null;
        }
    }

    public final void d() {
        a(1, 2, Float.valueOf(this.f63030k.getVolumeMultiplier() * this.G));
    }

    public final void e() {
        int playbackState = getPlaybackState();
        boolean z10 = false;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                boolean zExperimentalIsSleepingForOffload = experimentalIsSleepingForOffload();
                a1 a1Var = this.f63032m;
                if (getPlayWhenReady() && !zExperimentalIsSleepingForOffload) {
                    z10 = true;
                }
                a1Var.setStayAwake(z10);
                this.f63033n.setStayAwake(getPlayWhenReady());
                return;
            }
            if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        this.f63032m.setStayAwake(false);
        this.f63033n.setStayAwake(false);
    }

    public final void f() {
        this.f63022c.blockUninterruptible();
        if (Thread.currentThread() != getApplicationLooper().getThread()) {
            String invariant = io.odeeo.internal.q0.g0.formatInvariant("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), getApplicationLooper().getThread().getName());
            if (this.L) {
                throw new IllegalStateException(invariant);
            }
            io.odeeo.internal.q0.p.w("SimpleExoPlayer", invariant, this.M ? null : new IllegalStateException());
            this.M = true;
        }
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public n getPlayerError() {
        f();
        return this.f63024e.getPlayerError();
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    @Deprecated
    public void stop(boolean z10) {
        f();
        this.f63030k.updateAudioFocus(getPlayWhenReady(), 1);
        this.f63024e.stop(z10);
        this.I = Collections.EMPTY_LIST;
    }

    @Override // io.odeeo.internal.b.o
    public void addMediaSource(int i10, io.odeeo.internal.a0.t tVar) {
        f();
        this.f63024e.addMediaSource(i10, tVar);
    }

    @Override // io.odeeo.internal.b.o
    public void addMediaSources(int i10, List<io.odeeo.internal.a0.t> list) {
        f();
        this.f63024e.addMediaSources(i10, list);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void setMediaItems(List<z> list, int i10, long j10) {
        f();
        this.f63024e.setMediaItems(list, i10, j10);
    }

    @Override // io.odeeo.internal.b.o
    public void setMediaSource(io.odeeo.internal.a0.t tVar, boolean z10) {
        f();
        this.f63024e.setMediaSource(tVar, z10);
    }

    @Override // io.odeeo.internal.b.o
    public void setMediaSources(List<io.odeeo.internal.a0.t> list, boolean z10) {
        f();
        this.f63024e.setMediaSources(list, z10);
    }

    @Override // io.odeeo.internal.b.o
    @Deprecated
    public void addListener(l0.c cVar) {
        io.odeeo.internal.q0.a.checkNotNull(cVar);
        this.f63024e.addEventListener(cVar);
    }

    @Override // io.odeeo.internal.b.o
    @Deprecated
    public void removeListener(l0.c cVar) {
        this.f63024e.removeEventListener(cVar);
    }

    @Override // io.odeeo.internal.b.d, io.odeeo.internal.b.l0
    public void clearVideoSurface(Surface surface) {
        f();
        if (surface == null || surface != this.f63038s) {
            return;
        }
        clearVideoSurface();
    }

    @Override // io.odeeo.internal.b.o
    public void setMediaSource(io.odeeo.internal.a0.t tVar, long j10) {
        f();
        this.f63024e.setMediaSource(tVar, j10);
    }

    @Override // io.odeeo.internal.b.o
    public void setMediaSources(List<io.odeeo.internal.a0.t> list, int i10, long j10) {
        f();
        this.f63024e.setMediaSources(list, i10, j10);
    }

    public final void b() {
        this.f63028i.onSkipSilenceEnabledChanged(this.H);
        Iterator<l0.e> it = this.f63027h.iterator();
        while (it.hasNext()) {
            it.next().onSkipSilenceEnabledChanged(this.H);
        }
    }

    @Override // io.odeeo.internal.b.o
    @Deprecated
    public void prepare(io.odeeo.internal.a0.t tVar) {
        prepare(tVar, true, true);
    }

    @Override // io.odeeo.internal.b.o
    @Deprecated
    public void prepare(io.odeeo.internal.a0.t tVar, boolean z10, boolean z11) {
        f();
        setMediaSources(Collections.singletonList(tVar), z10);
        prepare();
    }

    public static m b(w0 w0Var) {
        return new m(0, w0Var.getMinVolume(), w0Var.getMaxVolume());
    }

    public final void a(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        a(surface);
        this.f63039t = surface;
    }

    public final void a(Object obj) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        p0[] p0VarArr = this.f63021b;
        int length = p0VarArr.length;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= length) {
                break;
            }
            p0 p0Var = p0VarArr[i10];
            if (p0Var.getTrackType() == 2) {
                arrayList.add(this.f63024e.createMessage(p0Var).setType(1).setPayload(obj).send());
            }
            i10++;
        }
        Object obj2 = this.f63038s;
        if (obj2 == null || obj2 == obj) {
            z10 = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((m0) it.next()).blockUntilDelivered(this.f63034o);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z10 = false;
            Object obj3 = this.f63038s;
            Surface surface = this.f63039t;
            if (obj3 == surface) {
                surface.release();
                this.f63039t = null;
            }
        }
        this.f63038s = obj;
        if (z10) {
            this.f63024e.stop(false, n.createForUnexpected(new s(3), IronSourceError.AUCTION_ERROR_DECRYPTION));
        }
    }

    @Override // io.odeeo.internal.b.o
    public o.a getAudioComponent() {
        return this;
    }

    @Override // io.odeeo.internal.b.o
    public o.d getDeviceComponent() {
        return this;
    }

    @Override // io.odeeo.internal.b.o
    public o.e getTextComponent() {
        return this;
    }

    @Override // io.odeeo.internal.b.o
    public o.f getVideoComponent() {
        return this;
    }

    public final void a(SurfaceHolder surfaceHolder) {
        this.f63042w = false;
        this.f63040u = surfaceHolder;
        surfaceHolder.addCallback(this.f63025f);
        Surface surface = this.f63040u.getSurface();
        if (surface != null && surface.isValid()) {
            Rect surfaceFrame = this.f63040u.getSurfaceFrame();
            a(surfaceFrame.width(), surfaceFrame.height());
        } else {
            a(0, 0);
        }
    }

    public final void a(int i10, int i11) {
        if (i10 == this.A && i11 == this.B) {
            return;
        }
        this.A = i10;
        this.B = i11;
        this.f63028i.onSurfaceSizeChanged(i10, i11);
        Iterator<l0.e> it = this.f63027h.iterator();
        while (it.hasNext()) {
            it.next().onSurfaceSizeChanged(i10, i11);
        }
    }

    public final void a(boolean z10, int i10, int i11) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        this.f63024e.setPlayWhenReady(z11, i12, i11);
    }

    public final void a(int i10, int i11, Object obj) {
        for (p0 p0Var : this.f63021b) {
            if (p0Var.getTrackType() == i10) {
                this.f63024e.createMessage(p0Var).setType(i11).setPayload(obj).send();
            }
        }
    }

    public final int a(int i10) {
        AudioTrack audioTrack = this.f63037r;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i10) {
            this.f63037r.release();
            this.f63037r = null;
        }
        if (this.f63037r == null) {
            this.f63037r = new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
        }
        return this.f63037r.getAudioSessionId();
    }
}
