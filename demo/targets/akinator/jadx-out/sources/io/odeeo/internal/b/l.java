package io.odeeo.internal.b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import io.odeeo.internal.d.n;
import io.odeeo.internal.r.h;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class l implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f62787a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.r.f f62788b;

    /* renamed from: c, reason: collision with root package name */
    public int f62789c;

    /* renamed from: d, reason: collision with root package name */
    public long f62790d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f62791e;

    /* renamed from: f, reason: collision with root package name */
    public io.odeeo.internal.r.l f62792f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f62793g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f62794h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f62795i;

    public l(Context context) {
        this.f62787a = context;
        this.f62788b = new io.odeeo.internal.r.f();
        this.f62789c = 0;
        this.f62790d = 5000L;
        this.f62792f = io.odeeo.internal.r.l.f66111a;
    }

    public void a(Context context, Handler handler, int i10, ArrayList<p0> arrayList) {
    }

    @Override // io.odeeo.internal.b.s0
    public p0[] createRenderers(Handler handler, io.odeeo.internal.r0.l lVar, io.odeeo.internal.d.g gVar, io.odeeo.internal.d0.m mVar, io.odeeo.internal.s.e eVar) throws NoSuchMethodException, SecurityException {
        Handler handler2;
        ArrayList<p0> arrayList = new ArrayList<>();
        a(this.f62787a, this.f62789c, this.f62792f, this.f62791e, handler, lVar, this.f62790d, arrayList);
        io.odeeo.internal.d.h hVarA = a(this.f62787a, this.f62793g, this.f62794h, this.f62795i);
        if (hVarA != null) {
            handler2 = handler;
            a(this.f62787a, this.f62789c, this.f62792f, this.f62791e, hVarA, handler2, gVar, arrayList);
        } else {
            handler2 = handler;
        }
        a(this.f62787a, mVar, handler2.getLooper(), this.f62789c, arrayList);
        a(this.f62787a, eVar, handler2.getLooper(), this.f62789c, arrayList);
        a(this.f62787a, this.f62789c, arrayList);
        a(this.f62787a, handler2, this.f62789c, arrayList);
        return (p0[]) arrayList.toArray(new p0[0]);
    }

    public l experimentalSetImmediateCodecStartAfterFlushEnabled(boolean z10) {
        this.f62788b.experimentalSetImmediateCodecStartAfterFlushEnabled(z10);
        return this;
    }

    public l experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled(boolean z10) {
        this.f62788b.experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled(z10);
        return this;
    }

    public l forceDisableMediaCodecAsynchronousQueueing() {
        this.f62788b.forceDisableAsynchronous();
        return this;
    }

    public l forceEnableMediaCodecAsynchronousQueueing() {
        this.f62788b.forceEnableAsynchronous();
        return this;
    }

    public l setAllowedVideoJoiningTimeMs(long j10) {
        this.f62790d = j10;
        return this;
    }

    public l setEnableAudioFloatOutput(boolean z10) {
        this.f62793g = z10;
        return this;
    }

    public l setEnableAudioOffload(boolean z10) {
        this.f62795i = z10;
        return this;
    }

    public l setEnableAudioTrackPlaybackParams(boolean z10) {
        this.f62794h = z10;
        return this;
    }

    public l setEnableDecoderFallback(boolean z10) {
        this.f62791e = z10;
        return this;
    }

    public l setExtensionRendererMode(int i10) {
        this.f62789c = i10;
        return this;
    }

    public l setMediaCodecSelector(io.odeeo.internal.r.l lVar) {
        this.f62792f = lVar;
        return this;
    }

    public void a(Context context, int i10, io.odeeo.internal.r.l lVar, boolean z10, Handler handler, io.odeeo.internal.r0.l lVar2, long j10, ArrayList<p0> arrayList) throws NoSuchMethodException, SecurityException {
        String str;
        Integer num;
        int i11;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        arrayList.add(new io.odeeo.internal.r0.h(context, a(), lVar, j10, z10, handler, lVar2, 50));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                Constructor<?> constructor = Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, io.odeeo.internal.r0.l.class, cls);
                num = 50;
                try {
                    i11 = size + 1;
                    try {
                        arrayList.add(size, (p0) constructor.newInstance(Long.valueOf(j10), handler, lVar2, 50));
                        str = "DefaultRenderersFactory";
                        try {
                            io.odeeo.internal.q0.p.i(str, "Loaded LibvpxVideoRenderer.");
                        } catch (ClassNotFoundException unused) {
                            size = i11;
                            i11 = size;
                            arrayList.add(i11, (p0) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, io.odeeo.internal.r0.l.class, cls).newInstance(Long.valueOf(j10), handler, lVar2, num));
                            io.odeeo.internal.q0.p.i(str, "Loaded Libgav1VideoRenderer.");
                        }
                    } catch (ClassNotFoundException unused2) {
                        str = "DefaultRenderersFactory";
                    }
                } catch (ClassNotFoundException unused3) {
                    str = "DefaultRenderersFactory";
                }
            } catch (ClassNotFoundException unused4) {
                str = "DefaultRenderersFactory";
                num = 50;
            }
            try {
                arrayList.add(i11, (p0) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, io.odeeo.internal.r0.l.class, cls).newInstance(Long.valueOf(j10), handler, lVar2, num));
                io.odeeo.internal.q0.p.i(str, "Loaded Libgav1VideoRenderer.");
            } catch (ClassNotFoundException unused5) {
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating AV1 extension", e10);
            }
        } catch (Exception e11) {
            throw new RuntimeException("Error instantiating VP9 extension", e11);
        }
    }

    @Deprecated
    public l(Context context, int i10) {
        this(context, i10, 5000L);
    }

    @Deprecated
    public l(Context context, int i10, long j10) {
        this.f62787a = context;
        this.f62789c = i10;
        this.f62790d = j10;
        this.f62792f = io.odeeo.internal.r.l.f66111a;
        this.f62788b = new io.odeeo.internal.r.f();
    }

    public void a(Context context, int i10, io.odeeo.internal.r.l lVar, boolean z10, io.odeeo.internal.d.h hVar, Handler handler, io.odeeo.internal.d.g gVar, ArrayList<p0> arrayList) {
        int i11;
        int i12;
        arrayList.add(new io.odeeo.internal.d.q(context, a(), lVar, z10, handler, gVar, hVar));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
                try {
                    arrayList.add(size, (p0) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, io.odeeo.internal.d.g.class, io.odeeo.internal.d.h.class).newInstance(handler, gVar, hVar));
                    io.odeeo.internal.q0.p.i("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i11;
                    i11 = size;
                    try {
                        i12 = i11 + 1;
                        try {
                            arrayList.add(i11, (p0) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, io.odeeo.internal.d.g.class, io.odeeo.internal.d.h.class).newInstance(handler, gVar, hVar));
                            io.odeeo.internal.q0.p.i("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                        } catch (ClassNotFoundException unused2) {
                            i11 = i12;
                            i12 = i11;
                            arrayList.add(i12, (p0) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, io.odeeo.internal.d.g.class, io.odeeo.internal.d.h.class).newInstance(handler, gVar, hVar));
                            io.odeeo.internal.q0.p.i("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                        }
                    } catch (ClassNotFoundException unused3) {
                    }
                    arrayList.add(i12, (p0) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, io.odeeo.internal.d.g.class, io.odeeo.internal.d.h.class).newInstance(handler, gVar, hVar));
                    io.odeeo.internal.q0.p.i("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                }
            } catch (ClassNotFoundException unused4) {
            }
            try {
                i12 = i11 + 1;
                arrayList.add(i11, (p0) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, io.odeeo.internal.d.g.class, io.odeeo.internal.d.h.class).newInstance(handler, gVar, hVar));
                io.odeeo.internal.q0.p.i("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                try {
                    arrayList.add(i12, (p0) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, io.odeeo.internal.d.g.class, io.odeeo.internal.d.h.class).newInstance(handler, gVar, hVar));
                    io.odeeo.internal.q0.p.i("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                } catch (ClassNotFoundException unused5) {
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating FFmpeg extension", e10);
                }
            } catch (Exception e11) {
                throw new RuntimeException("Error instantiating FLAC extension", e11);
            }
        } catch (Exception e12) {
            throw new RuntimeException("Error instantiating Opus extension", e12);
        }
    }

    public void a(Context context, io.odeeo.internal.d0.m mVar, Looper looper, int i10, ArrayList<p0> arrayList) {
        arrayList.add(new io.odeeo.internal.d0.n(mVar, looper));
    }

    public void a(Context context, io.odeeo.internal.s.e eVar, Looper looper, int i10, ArrayList<p0> arrayList) {
        arrayList.add(new io.odeeo.internal.s.f(eVar, looper));
    }

    public void a(Context context, int i10, ArrayList<p0> arrayList) {
        arrayList.add(new io.odeeo.internal.s0.b());
    }

    public io.odeeo.internal.d.h a(Context context, boolean z10, boolean z11, boolean z12) {
        return new io.odeeo.internal.d.n(io.odeeo.internal.d.e.getCapabilities(context), new n.d(new io.odeeo.internal.d.f[0]), z10, z11, z12 ? 1 : 0);
    }

    public h.b a() {
        return this.f62788b;
    }
}
