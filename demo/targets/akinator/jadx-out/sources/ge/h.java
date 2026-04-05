package ge;

import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.y0;
import com.google.android.exoplayer2.z0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h implements a {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f57597a;

    public h(z0 z0Var) {
        this.f57597a = z0Var;
    }

    public static a parseFrom(int i10, v0 v0Var) {
        String str;
        if (i10 == 2) {
            v0Var.skipBytes(4);
            int littleEndianInt = v0Var.readLittleEndianInt();
            int littleEndianInt2 = v0Var.readLittleEndianInt();
            v0Var.skipBytes(4);
            int littleEndianInt3 = v0Var.readLittleEndianInt();
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
                com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.p(littleEndianInt3, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                return null;
            }
            y0 y0Var = new y0();
            y0Var.setWidth(littleEndianInt).setHeight(littleEndianInt2).setSampleMimeType(str);
            return new h(y0Var.build());
        }
        if (i10 != 1) {
            f0.w("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + n1.getTrackTypeString(i10));
            return null;
        }
        int littleEndianUnsignedShort = v0Var.readLittleEndianUnsignedShort();
        String str2 = littleEndianUnsignedShort != 1 ? littleEndianUnsignedShort != 85 ? littleEndianUnsignedShort != 255 ? littleEndianUnsignedShort != 8192 ? littleEndianUnsignedShort != 8193 ? null : MimeTypes.AUDIO_DTS : MimeTypes.AUDIO_AC3 : MimeTypes.AUDIO_AAC : MimeTypes.AUDIO_MPEG : MimeTypes.AUDIO_RAW;
        if (str2 == null) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.p(littleEndianUnsignedShort, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
            return null;
        }
        int littleEndianUnsignedShort2 = v0Var.readLittleEndianUnsignedShort();
        int littleEndianInt4 = v0Var.readLittleEndianInt();
        v0Var.skipBytes(6);
        int pcmEncoding = n1.getPcmEncoding(v0Var.readUnsignedShort());
        int littleEndianUnsignedShort3 = v0Var.readLittleEndianUnsignedShort();
        byte[] bArr = new byte[littleEndianUnsignedShort3];
        v0Var.readBytes(bArr, 0, littleEndianUnsignedShort3);
        y0 y0Var2 = new y0();
        y0Var2.setSampleMimeType(str2).setChannelCount(littleEndianUnsignedShort2).setSampleRate(littleEndianInt4);
        if (MimeTypes.AUDIO_RAW.equals(str2) && pcmEncoding != 0) {
            y0Var2.setPcmEncoding(pcmEncoding);
        }
        if (MimeTypes.AUDIO_AAC.equals(str2) && littleEndianUnsignedShort3 > 0) {
            y0Var2.setInitializationData(b5.of(bArr));
        }
        return new h(y0Var2.build());
    }

    @Override // ge.a
    public int getType() {
        return 1718776947;
    }
}
