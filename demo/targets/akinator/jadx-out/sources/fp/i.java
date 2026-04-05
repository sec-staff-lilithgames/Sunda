package fp;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gn.w;
import io.bidmachine.media3.common.util.m0;
import java.util.Arrays;
import java.util.List;
import ko.k1;
import ko.u0;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i extends k {

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f55964o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f55965p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    public boolean f55966n;

    public static boolean e(m0 m0Var, byte[] bArr) {
        if (m0Var.bytesLeft() < bArr.length) {
            return false;
        }
        int position = m0Var.getPosition();
        byte[] bArr2 = new byte[bArr.length];
        m0Var.readBytes(bArr2, 0, bArr.length);
        m0Var.setPosition(position);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean verifyBitstreamType(m0 m0Var) {
        return e(m0Var, f55964o);
    }

    @Override // fp.k
    public final long b(m0 m0Var) {
        return (this.f55975i * u0.getPacketDurationUs(m0Var.getData())) / 1000000;
    }

    @Override // fp.k
    public final boolean c(m0 m0Var, long j10, androidx.localbroadcastmanager.content.b bVar) {
        if (e(m0Var, f55964o)) {
            byte[] bArrCopyOf = Arrays.copyOf(m0Var.getData(), m0Var.limit());
            int channelCount = u0.getChannelCount(bArrCopyOf);
            List<byte[]> listBuildInitializationData = u0.buildInitializationData(bArrCopyOf);
            if (((io.bidmachine.media3.common.b) bVar.f6756a) == null) {
                bVar.f6756a = new w().setContainerMimeType("audio/ogg").setSampleMimeType(MimeTypes.AUDIO_OPUS).setChannelCount(channelCount).setSampleRate(48000).setInitializationData(listBuildInitializationData).build();
                return true;
            }
        } else {
            if (!e(m0Var, f55965p)) {
                io.bidmachine.media3.common.util.a.checkStateNotNull((io.bidmachine.media3.common.b) bVar.f6756a);
                return false;
            }
            io.bidmachine.media3.common.util.a.checkStateNotNull((io.bidmachine.media3.common.b) bVar.f6756a);
            if (!this.f55966n) {
                this.f55966n = true;
                m0Var.skipBytes(8);
                gn.u0 vorbisComments = k1.parseVorbisComments(b5.copyOf(k1.readVorbisCommentHeader(m0Var, false, false).f71663a));
                if (vorbisComments != null) {
                    bVar.f6756a = ((io.bidmachine.media3.common.b) bVar.f6756a).buildUpon().setMetadata(vorbisComments.copyWithAppendedEntriesFrom(((io.bidmachine.media3.common.b) bVar.f6756a).f60662l)).build();
                    return true;
                }
            }
        }
        return true;
    }

    @Override // fp.k
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f55966n = false;
        }
    }
}
