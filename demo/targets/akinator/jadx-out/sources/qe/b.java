package qe;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.HandlerThread;
import android.view.Surface;
import com.google.android.exoplayer2.util.i1;
import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements m {

    /* renamed from: b, reason: collision with root package name */
    public final a f82787b;

    /* renamed from: c, reason: collision with root package name */
    public final a f82788c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f82789d;

    public b(int i10, boolean z10) {
        a aVar = new a(i10, 0);
        a aVar2 = new a(i10, 1);
        this.f82787b = aVar;
        this.f82788c = aVar2;
        this.f82789d = z10;
    }

    @Override // qe.m
    public c createAdapter(l lVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        c cVar;
        String str = PcrIk.qGobabk;
        String str2 = lVar.f82843a.f82850a;
        c cVar2 = null;
        try {
            i1.beginSection(str + str2);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str2);
            try {
                cVar = new c(mediaCodecCreateByCodecName, (HandlerThread) this.f82787b.get(), (HandlerThread) this.f82788c.get(), this.f82789d);
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
            mediaCodecCreateByCodecName = null;
        }
        try {
            i1.endSection();
            MediaFormat mediaFormat = lVar.f82844b;
            Surface surface = lVar.f82846d;
            MediaCrypto mediaCrypto = lVar.f82847e;
            cVar.f82791b.initialize(mediaCodecCreateByCodecName);
            i1.beginSection("configureCodec");
            mediaCodecCreateByCodecName.configure(mediaFormat, surface, mediaCrypto, 0);
            i1.endSection();
            cVar.f82792c.start();
            i1.beginSection("startCodec");
            mediaCodecCreateByCodecName.start();
            i1.endSection();
            cVar.f82795f = 1;
            return cVar;
        } catch (Exception e12) {
            e = e12;
            cVar2 = cVar;
            if (cVar2 != null) {
                cVar2.release();
            } else if (mediaCodecCreateByCodecName != null) {
                mediaCodecCreateByCodecName.release();
            }
            throw e;
        }
    }
}
