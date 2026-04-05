package qe;

import android.media.MediaCodec;
import com.google.android.exoplayer2.util.i1;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class d0 implements m {
    public static MediaCodec a(l lVar) throws IOException {
        com.google.android.exoplayer2.util.a.checkNotNull(lVar.f82843a);
        String str = lVar.f82843a.f82850a;
        i1.beginSection("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        i1.endSection();
        return mediaCodecCreateByCodecName;
    }

    @Override // qe.m
    public o createAdapter(l lVar) throws IOException {
        MediaCodec mediaCodecA = null;
        try {
            mediaCodecA = a(lVar);
            i1.beginSection("configureCodec");
            mediaCodecA.configure(lVar.f82844b, lVar.f82846d, lVar.f82847e, 0);
            i1.endSection();
            i1.beginSection("startCodec");
            mediaCodecA.start();
            i1.endSection();
            return new e0(mediaCodecA);
        } catch (IOException | RuntimeException e10) {
            if (mediaCodecA != null) {
                mediaCodecA.release();
            }
            throw e10;
        }
    }
}
