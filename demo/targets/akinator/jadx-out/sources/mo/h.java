package mo;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gn.w;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.b0;
import io.bidmachine.media3.common.util.m0;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h implements a {

    /* renamed from: a, reason: collision with root package name */
    public final io.bidmachine.media3.common.b f74897a;

    public h(io.bidmachine.media3.common.b bVar) {
        this.f74897a = bVar;
    }

    public static a parseFrom(int i10, m0 m0Var) {
        String str;
        if (i10 == 2) {
            m0Var.skipBytes(4);
            int littleEndianInt = m0Var.readLittleEndianInt();
            int littleEndianInt2 = m0Var.readLittleEndianInt();
            m0Var.skipBytes(4);
            int littleEndianInt3 = m0Var.readLittleEndianInt();
            switch (littleEndianInt3) {
                case 808802372:
                case 877677894:
                case 1145656883:
                case 1145656920:
                case 1482049860:
                case 1684633208:
                case 2021026148:
                    str = MimeTypes.VIDEO_MP4V;
                    break;
                case 826496577:
                case 828601953:
                case 875967048:
                    str = "video/avc";
                    break;
                case 842289229:
                    str = "video/mp42";
                    break;
                case 859066445:
                    str = "video/mp43";
                    break;
                case 1196444237:
                case 1735420525:
                    str = "video/mjpeg";
                    break;
                default:
                    str = null;
                    break;
            }
            if (str == null) {
                e3.g.t(littleEndianInt3, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                return null;
            }
            w wVar = new w();
            wVar.setWidth(littleEndianInt).setHeight(littleEndianInt2).setSampleMimeType(str);
            return new h(wVar.build());
        }
        if (i10 != 1) {
            b0.w("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + a1.getTrackTypeString(i10));
            return null;
        }
        int littleEndianUnsignedShort = m0Var.readLittleEndianUnsignedShort();
        String str2 = littleEndianUnsignedShort != 1 ? littleEndianUnsignedShort != 85 ? littleEndianUnsignedShort != 255 ? littleEndianUnsignedShort != 8192 ? littleEndianUnsignedShort != 8193 ? null : MimeTypes.AUDIO_DTS : MimeTypes.AUDIO_AC3 : MimeTypes.AUDIO_AAC : MimeTypes.AUDIO_MPEG : MimeTypes.AUDIO_RAW;
        if (str2 == null) {
            e3.g.t(littleEndianUnsignedShort, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
            return null;
        }
        int littleEndianUnsignedShort2 = m0Var.readLittleEndianUnsignedShort();
        int littleEndianInt4 = m0Var.readLittleEndianInt();
        m0Var.skipBytes(6);
        int pcmEncoding = a1.getPcmEncoding(m0Var.readLittleEndianUnsignedShort());
        int littleEndianUnsignedShort3 = m0Var.bytesLeft() > 0 ? m0Var.readLittleEndianUnsignedShort() : 0;
        w wVar2 = new w();
        wVar2.setSampleMimeType(str2).setChannelCount(littleEndianUnsignedShort2).setSampleRate(littleEndianInt4);
        if (str2.equals(MimeTypes.AUDIO_RAW) && pcmEncoding != 0) {
            wVar2.setPcmEncoding(pcmEncoding);
        }
        if (str2.equals(MimeTypes.AUDIO_AAC) && littleEndianUnsignedShort3 > 0) {
            byte[] bArr = new byte[littleEndianUnsignedShort3];
            m0Var.readBytes(bArr, 0, littleEndianUnsignedShort3);
            wVar2.setInitializationData(b5.of(bArr));
        }
        return new h(wVar2.build());
    }

    @Override // mo.a
    public int getType() {
        return 1718776947;
    }
}
