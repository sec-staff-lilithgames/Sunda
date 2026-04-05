package io.odeeo.internal.q0;

import android.media.MediaFormat;
import com.amazon.device.ads.DtbDeviceData;
import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;
import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s {
    public static void a(MediaFormat mediaFormat, String str, int i10) {
        mediaFormat.setInteger(str, i10 != 0 ? 1 : 0);
    }

    public static void maybeSetByteBuffer(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void maybeSetColorInfo(MediaFormat mediaFormat, io.odeeo.internal.r0.b bVar) {
        if (bVar != null) {
            maybeSetInteger(mediaFormat, "color-transfer", bVar.f66133c);
            maybeSetInteger(mediaFormat, "color-standard", bVar.f66131a);
            maybeSetInteger(mediaFormat, "color-range", bVar.f66132b);
            maybeSetByteBuffer(mediaFormat, "hdr-static-info", bVar.f66134d);
        }
    }

    public static void maybeSetFloat(MediaFormat mediaFormat, String str, float f10) {
        if (f10 != -1.0f) {
            mediaFormat.setFloat(str, f10);
        }
    }

    public static void maybeSetInteger(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static void maybeSetString(MediaFormat mediaFormat, String str, String str2) {
        if (str2 != null) {
            mediaFormat.setString(str, str2);
        }
    }

    public static void setCsdBuffers(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer(a.b.e(i10, LJjmO.NOMxPoe), ByteBuffer.wrap(list.get(i10)));
        }
    }

    public static void a(MediaFormat mediaFormat, float f10) {
        int i10;
        mediaFormat.setFloat("exo-pixel-width-height-ratio-float", f10);
        int i11 = 1073741824;
        if (f10 < 1.0f) {
            i11 = (int) (f10 * 1073741824);
            i10 = 1073741824;
        } else if (f10 > 1.0f) {
            i10 = (int) (1073741824 / f10);
        } else {
            i11 = 1;
            i10 = 1;
        }
        mediaFormat.setInteger("sar-width", i11);
        mediaFormat.setInteger("sar-height", i10);
    }

    public static MediaFormat createMediaFormatFromFormat(io.odeeo.internal.b.t tVar) {
        MediaFormat mediaFormat = new MediaFormat();
        maybeSetInteger(mediaFormat, "bitrate", tVar.f62967h);
        maybeSetInteger(mediaFormat, "channel-count", tVar.f62984y);
        maybeSetColorInfo(mediaFormat, tVar.f62983x);
        maybeSetString(mediaFormat, "mime", tVar.f62971l);
        maybeSetString(mediaFormat, "codecs-string", tVar.f62968i);
        maybeSetFloat(mediaFormat, "frame-rate", tVar.f62978s);
        maybeSetInteger(mediaFormat, "width", tVar.f62976q);
        maybeSetInteger(mediaFormat, "height", tVar.f62977r);
        setCsdBuffers(mediaFormat, tVar.f62973n);
        a(mediaFormat, tVar.A);
        maybeSetString(mediaFormat, DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY, tVar.f62962c);
        maybeSetInteger(mediaFormat, "max-input-size", tVar.f62972m);
        maybeSetInteger(mediaFormat, "sample-rate", tVar.f62985z);
        maybeSetInteger(mediaFormat, "caption-service-number", tVar.D);
        mediaFormat.setInteger("rotation-degrees", tVar.f62979t);
        int i10 = tVar.f62963d;
        a(mediaFormat, TJzY.KsShmyebYsPMRSe, i10 & 4);
        a(mediaFormat, "is-default", i10 & 1);
        a(mediaFormat, "is-forced-subtitle", i10 & 2);
        mediaFormat.setInteger("encoder-delay", tVar.B);
        mediaFormat.setInteger("encoder-padding", tVar.C);
        a(mediaFormat, tVar.f62980u);
        return mediaFormat;
    }

    public static void a(MediaFormat mediaFormat, int i10) {
        if (i10 == -1) {
            return;
        }
        maybeSetInteger(mediaFormat, "exo-pcm-encoding-int", i10);
        int i11 = 2;
        if (i10 != 2) {
            i11 = 3;
            if (i10 != 3) {
                i11 = 4;
                if (i10 != 4) {
                    return;
                }
            }
        }
        mediaFormat.setInteger("pcm-encoding", i11);
    }
}
