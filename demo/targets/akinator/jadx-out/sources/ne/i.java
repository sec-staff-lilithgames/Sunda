package ne;

import com.google.android.exoplayer2.audio.m1;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.y0;
import com.google.android.exoplayer2.z0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import ee.r0;
import java.util.Arrays;
import java.util.List;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i extends k {

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f76037o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f76038p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    public boolean f76039n;

    public static boolean e(v0 v0Var, byte[] bArr) {
        if (v0Var.bytesLeft() < bArr.length) {
            return false;
        }
        int position = v0Var.getPosition();
        byte[] bArr2 = new byte[bArr.length];
        v0Var.readBytes(bArr2, 0, bArr.length);
        v0Var.setPosition(position);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean verifyBitstreamType(v0 v0Var) {
        return e(v0Var, f76037o);
    }

    @Override // ne.k
    public final long b(v0 v0Var) {
        return (this.f76048i * m1.getPacketDurationUs(v0Var.getData())) / 1000000;
    }

    @Override // ne.k
    public final boolean c(v0 v0Var, long j10, androidx.localbroadcastmanager.content.b bVar) {
        if (e(v0Var, f76037o)) {
            byte[] bArrCopyOf = Arrays.copyOf(v0Var.getData(), v0Var.limit());
            int channelCount = m1.getChannelCount(bArrCopyOf);
            List<byte[]> listBuildInitializationData = m1.buildInitializationData(bArrCopyOf);
            if (((z0) bVar.f6756a) == null) {
                bVar.f6756a = new y0().setSampleMimeType(MimeTypes.AUDIO_OPUS).setChannelCount(channelCount).setSampleRate(48000).setInitializationData(listBuildInitializationData).build();
                return true;
            }
        } else {
            if (!e(v0Var, f76038p)) {
                com.google.android.exoplayer2.util.a.checkStateNotNull((z0) bVar.f6756a);
                return false;
            }
            com.google.android.exoplayer2.util.a.checkStateNotNull((z0) bVar.f6756a);
            if (!this.f76039n) {
                this.f76039n = true;
                v0Var.skipBytes(8);
                Metadata vorbisComments = r0.parseVorbisComments(b5.copyOf(r0.readVorbisCommentHeader(v0Var, false, false).f54254a));
                if (vorbisComments != null) {
                    bVar.f6756a = ((z0) bVar.f6756a).buildUpon().setMetadata(vorbisComments.copyWithAppendedEntriesFrom(((z0) bVar.f6756a).f28800l)).build();
                    return true;
                }
            }
        }
        return true;
    }

    @Override // ne.k
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f76039n = false;
        }
    }
}
