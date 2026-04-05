package fp;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gn.w;
import gn.z0;
import io.bidmachine.media3.common.util.m0;
import java.util.ArrayList;
import java.util.Arrays;
import ko.h1;
import ko.i1;
import ko.j1;
import ko.k1;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m extends k {

    /* renamed from: n, reason: collision with root package name */
    public l f55985n;

    /* renamed from: o, reason: collision with root package name */
    public int f55986o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f55987p;

    /* renamed from: q, reason: collision with root package name */
    public j1 f55988q;

    /* renamed from: r, reason: collision with root package name */
    public h1 f55989r;

    public static boolean verifyBitstreamType(m0 m0Var) {
        try {
            return k1.verifyVorbisHeaderCapturePattern(1, m0Var, true);
        } catch (z0 unused) {
            return false;
        }
    }

    @Override // fp.k
    public final void a(long j10) {
        this.f55973g = j10;
        this.f55987p = j10 != 0;
        j1 j1Var = this.f55988q;
        this.f55986o = j1Var != null ? j1Var.f71678e : 0;
    }

    @Override // fp.k
    public final long b(m0 m0Var) {
        if ((m0Var.getData()[0] & 1) == 1) {
            return -1L;
        }
        byte b10 = m0Var.getData()[0];
        l lVar = (l) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f55985n);
        int i10 = lVar.f55984e;
        j1 j1Var = lVar.f55980a;
        int i11 = !lVar.f55983d[(b10 >> 1) & (255 >>> (8 - i10))].f71671a ? j1Var.f71678e : j1Var.f71679f;
        long j10 = this.f55987p ? (this.f55986o + i11) / 4 : 0;
        if (m0Var.capacity() < m0Var.limit() + 4) {
            m0Var.reset(Arrays.copyOf(m0Var.getData(), m0Var.limit() + 4));
        } else {
            m0Var.setLimit(m0Var.limit() + 4);
        }
        byte[] data = m0Var.getData();
        data[m0Var.limit() - 4] = (byte) (j10 & 255);
        data[m0Var.limit() - 3] = (byte) ((j10 >>> 8) & 255);
        data[m0Var.limit() - 2] = (byte) ((j10 >>> 16) & 255);
        data[m0Var.limit() - 1] = (byte) ((j10 >>> 24) & 255);
        this.f55987p = true;
        this.f55986o = i11;
        return j10;
    }

    @Override // fp.k
    public final boolean c(m0 m0Var, long j10, androidx.localbroadcastmanager.content.b bVar) throws z0 {
        if (this.f55985n != null) {
            io.bidmachine.media3.common.util.a.checkNotNull((io.bidmachine.media3.common.b) bVar.f6756a);
            return false;
        }
        j1 j1Var = this.f55988q;
        l lVar = null;
        if (j1Var == null) {
            this.f55988q = k1.readVorbisIdentificationHeader(m0Var);
        } else {
            h1 h1Var = this.f55989r;
            if (h1Var == null) {
                this.f55989r = k1.readVorbisCommentHeader(m0Var);
            } else {
                byte[] bArr = new byte[m0Var.limit()];
                System.arraycopy(m0Var.getData(), 0, bArr, 0, m0Var.limit());
                i1[] vorbisModes = k1.readVorbisModes(m0Var, j1Var.f71674a);
                lVar = new l(j1Var, h1Var, bArr, vorbisModes, k1.iLog(vorbisModes.length - 1));
            }
        }
        this.f55985n = lVar;
        if (lVar == null) {
            return true;
        }
        j1 j1Var2 = lVar.f55980a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(j1Var2.f71680g);
        arrayList.add(lVar.f55982c);
        bVar.f6756a = new w().setContainerMimeType("audio/ogg").setSampleMimeType(MimeTypes.AUDIO_VORBIS).setAverageBitrate(j1Var2.f71677d).setPeakBitrate(j1Var2.f71676c).setChannelCount(j1Var2.f71674a).setSampleRate(j1Var2.f71675b).setInitializationData(arrayList).setMetadata(k1.parseVorbisComments(b5.copyOf(lVar.f55981b.f71663a))).build();
        return true;
    }

    @Override // fp.k
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f55985n = null;
            this.f55988q = null;
            this.f55989r = null;
        }
        this.f55986o = 0;
        this.f55987p = false;
    }
}
