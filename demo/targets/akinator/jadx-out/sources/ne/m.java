package ne;

import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.y0;
import com.google.android.exoplayer2.z0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import ee.o0;
import ee.p0;
import ee.q0;
import ee.r0;
import java.util.ArrayList;
import java.util.Arrays;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m extends k {

    /* renamed from: n, reason: collision with root package name */
    public l f76058n;

    /* renamed from: o, reason: collision with root package name */
    public int f76059o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f76060p;

    /* renamed from: q, reason: collision with root package name */
    public q0 f76061q;

    /* renamed from: r, reason: collision with root package name */
    public o0 f76062r;

    public static boolean verifyBitstreamType(v0 v0Var) {
        try {
            return r0.verifyVorbisHeaderCapturePattern(1, v0Var, true);
        } catch (h2 unused) {
            return false;
        }
    }

    @Override // ne.k
    public final void a(long j10) {
        this.f76046g = j10;
        this.f76060p = j10 != 0;
        q0 q0Var = this.f76061q;
        this.f76059o = q0Var != null ? q0Var.f54260e : 0;
    }

    @Override // ne.k
    public final long b(v0 v0Var) {
        if ((v0Var.getData()[0] & 1) == 1) {
            return -1L;
        }
        byte b10 = v0Var.getData()[0];
        l lVar = (l) com.google.android.exoplayer2.util.a.checkStateNotNull(this.f76058n);
        int i10 = lVar.f76057e;
        q0 q0Var = lVar.f76053a;
        int i11 = !lVar.f76056d[(b10 >> 1) & (255 >>> (8 - i10))].f54255a ? q0Var.f54260e : q0Var.f54261f;
        long j10 = this.f76060p ? (this.f76059o + i11) / 4 : 0;
        if (v0Var.capacity() < v0Var.limit() + 4) {
            v0Var.reset(Arrays.copyOf(v0Var.getData(), v0Var.limit() + 4));
        } else {
            v0Var.setLimit(v0Var.limit() + 4);
        }
        byte[] data = v0Var.getData();
        data[v0Var.limit() - 4] = (byte) (j10 & 255);
        data[v0Var.limit() - 3] = (byte) ((j10 >>> 8) & 255);
        data[v0Var.limit() - 2] = (byte) ((j10 >>> 16) & 255);
        data[v0Var.limit() - 1] = (byte) ((j10 >>> 24) & 255);
        this.f76060p = true;
        this.f76059o = i11;
        return j10;
    }

    @Override // ne.k
    public final boolean c(v0 v0Var, long j10, androidx.localbroadcastmanager.content.b bVar) throws h2 {
        if (this.f76058n != null) {
            com.google.android.exoplayer2.util.a.checkNotNull((z0) bVar.f6756a);
            return false;
        }
        q0 q0Var = this.f76061q;
        l lVar = null;
        if (q0Var == null) {
            this.f76061q = r0.readVorbisIdentificationHeader(v0Var);
        } else {
            o0 o0Var = this.f76062r;
            if (o0Var == null) {
                this.f76062r = r0.readVorbisCommentHeader(v0Var);
            } else {
                byte[] bArr = new byte[v0Var.limit()];
                System.arraycopy(v0Var.getData(), 0, bArr, 0, v0Var.limit());
                p0[] vorbisModes = r0.readVorbisModes(v0Var, q0Var.f54256a);
                lVar = new l(q0Var, o0Var, bArr, vorbisModes, r0.iLog(vorbisModes.length - 1));
            }
        }
        this.f76058n = lVar;
        if (lVar == null) {
            return true;
        }
        q0 q0Var2 = lVar.f76053a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(q0Var2.f54262g);
        arrayList.add(lVar.f76055c);
        bVar.f6756a = new y0().setSampleMimeType(MimeTypes.AUDIO_VORBIS).setAverageBitrate(q0Var2.f54259d).setPeakBitrate(q0Var2.f54258c).setChannelCount(q0Var2.f54256a).setSampleRate(q0Var2.f54257b).setInitializationData(arrayList).setMetadata(r0.parseVorbisComments(b5.copyOf(lVar.f76054b.f54254a))).build();
        return true;
    }

    @Override // ne.k
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f76058n = null;
            this.f76061q = null;
            this.f76062r = null;
        }
        this.f76059o = 0;
        this.f76060p = false;
    }
}
