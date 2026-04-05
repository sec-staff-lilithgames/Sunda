package io.odeeo.internal.o;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.odeeo.internal.b.g0;
import io.odeeo.internal.b.t;
import io.odeeo.internal.g.a0;
import io.odeeo.internal.o.h;
import io.odeeo.internal.q0.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i extends h {

    /* renamed from: n, reason: collision with root package name */
    public a f65160n;

    /* renamed from: o, reason: collision with root package name */
    public int f65161o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f65162p;

    /* renamed from: q, reason: collision with root package name */
    public a0.d f65163q;

    /* renamed from: r, reason: collision with root package name */
    public a0.b f65164r;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final a0.d f65165a;

        /* renamed from: b, reason: collision with root package name */
        public final a0.b f65166b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f65167c;

        /* renamed from: d, reason: collision with root package name */
        public final a0.c[] f65168d;

        /* renamed from: e, reason: collision with root package name */
        public final int f65169e;

        public a(a0.d dVar, a0.b bVar, byte[] bArr, a0.c[] cVarArr, int i10) {
            this.f65165a = dVar;
            this.f65166b = bVar;
            this.f65167c = bArr;
            this.f65168d = cVarArr;
            this.f65169e = i10;
        }
    }

    public static int a(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static boolean verifyBitstreamType(x xVar) {
        try {
            return a0.verifyVorbisHeaderCapturePattern(1, xVar, true);
        } catch (g0 unused) {
            return false;
        }
    }

    public a b(x xVar) throws IOException {
        a0.d dVar = this.f65163q;
        if (dVar == null) {
            this.f65163q = a0.readVorbisIdentificationHeader(xVar);
            return null;
        }
        a0.b bVar = this.f65164r;
        if (bVar == null) {
            this.f65164r = a0.readVorbisCommentHeader(xVar);
            return null;
        }
        byte[] bArr = new byte[xVar.limit()];
        System.arraycopy(xVar.getData(), 0, bArr, 0, xVar.limit());
        return new a(dVar, bVar, bArr, a0.readVorbisModes(xVar, dVar.f64096b), a0.iLog(r4.length - 1));
    }

    @Override // io.odeeo.internal.o.h
    public void c(long j10) {
        super.c(j10);
        this.f65162p = j10 != 0;
        a0.d dVar = this.f65163q;
        this.f65161o = dVar != null ? dVar.f64101g : 0;
    }

    @Override // io.odeeo.internal.o.h
    public void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f65160n = null;
            this.f65163q = null;
            this.f65164r = null;
        }
        this.f65161o = 0;
        this.f65162p = false;
    }

    @Override // io.odeeo.internal.o.h
    public long a(x xVar) {
        if ((xVar.getData()[0] & 1) == 1) {
            return -1L;
        }
        int iA = a(xVar.getData()[0], (a) io.odeeo.internal.q0.a.checkStateNotNull(this.f65160n));
        long j10 = this.f65162p ? (this.f65161o + iA) / 4 : 0;
        a(xVar, j10);
        this.f65162p = true;
        this.f65161o = iA;
        return j10;
    }

    @Override // io.odeeo.internal.o.h
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public boolean a(x xVar, long j10, h.b bVar) throws IOException {
        if (this.f65160n != null) {
            io.odeeo.internal.q0.a.checkNotNull(bVar.f65158a);
            return false;
        }
        a aVarB = b(xVar);
        this.f65160n = aVarB;
        if (aVarB == null) {
            return true;
        }
        a0.d dVar = aVarB.f65165a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f64104j);
        arrayList.add(aVarB.f65167c);
        bVar.f65158a = new t.b().setSampleMimeType(MimeTypes.AUDIO_VORBIS).setAverageBitrate(dVar.f64099e).setPeakBitrate(dVar.f64098d).setChannelCount(dVar.f64096b).setSampleRate(dVar.f64097c).setInitializationData(arrayList).build();
        return true;
    }

    public static void a(x xVar, long j10) {
        if (xVar.capacity() < xVar.limit() + 4) {
            xVar.reset(Arrays.copyOf(xVar.getData(), xVar.limit() + 4));
        } else {
            xVar.setLimit(xVar.limit() + 4);
        }
        byte[] data = xVar.getData();
        data[xVar.limit() - 4] = (byte) (j10 & 255);
        data[xVar.limit() - 3] = (byte) ((j10 >>> 8) & 255);
        data[xVar.limit() - 2] = (byte) ((j10 >>> 16) & 255);
        data[xVar.limit() - 1] = (byte) ((j10 >>> 24) & 255);
    }

    public static int a(byte b10, a aVar) {
        if (!aVar.f65168d[a(b10, aVar.f65169e, 1)].f64091a) {
            return aVar.f65165a.f64101g;
        }
        return aVar.f65165a.f64102h;
    }
}
