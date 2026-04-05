package io.bidmachine.media3.common.util;

import android.media.MediaFormat;
import com.amazon.device.ads.DtbDeviceData;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.Scopes;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class e0 {
    public static io.bidmachine.media3.common.b createFormatFromMediaFormat(MediaFormat mediaFormat) {
        float integer;
        gn.w codecs = new gn.w().setSampleMimeType(mediaFormat.getString("mime")).setLanguage(mediaFormat.getString(DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY)).setPeakBitrate(getInteger(mediaFormat, "max-bitrate", -1)).setAverageBitrate(getInteger(mediaFormat, "bitrate", -1)).setCodecs((Objects.equals(mediaFormat.getString("mime"), MimeTypes.VIDEO_H263) && mediaFormat.containsKey(Scopes.PROFILE) && mediaFormat.containsKey(AppLovinEventTypes.USER_COMPLETED_LEVEL)) ? h.buildH263CodecString(mediaFormat.getInteger(Scopes.PROFILE), mediaFormat.getInteger(AppLovinEventTypes.USER_COMPLETED_LEVEL)) : getString(mediaFormat, "codecs-string", null));
        if (mediaFormat.containsKey("frame-rate")) {
            try {
                integer = mediaFormat.getFloat("frame-rate");
            } catch (ClassCastException unused) {
                integer = mediaFormat.getInteger("frame-rate");
            }
        } else {
            integer = -1.0f;
        }
        int i10 = 0;
        gn.w pcmEncoding = codecs.setFrameRate(integer).setWidth(getInteger(mediaFormat, "width", -1)).setHeight(getInteger(mediaFormat, "height", -1)).setPixelWidthHeightRatio((mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) ? mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height") : 1.0f).setMaxInputSize(getInteger(mediaFormat, "max-input-size", -1)).setRotationDegrees(getInteger(mediaFormat, "rotation-degrees", 0)).setColorInfo(getColorInfo(mediaFormat)).setSampleRate(getInteger(mediaFormat, "sample-rate", -1)).setChannelCount(getInteger(mediaFormat, "channel-count", -1)).setPcmEncoding(getInteger(mediaFormat, "pcm-encoding", -1));
        x4 x4Var = new x4();
        while (true) {
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-" + i10);
            if (byteBuffer == null) {
                break;
            }
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            byteBuffer.rewind();
            x4Var.add((Object) bArr);
            i10++;
        }
        pcmEncoding.setInitializationData(x4Var.build());
        if (mediaFormat.containsKey("track-id")) {
            pcmEncoding.setId(mediaFormat.getInteger("track-id"));
        }
        return pcmEncoding.build();
    }

    public static MediaFormat createMediaFormatFromFormat(io.bidmachine.media3.common.b bVar) {
        int i10;
        MediaFormat mediaFormat = new MediaFormat();
        maybeSetInteger(mediaFormat, "bitrate", bVar.f60660j);
        maybeSetInteger(mediaFormat, "max-bitrate", bVar.f60659i);
        maybeSetInteger(mediaFormat, "channel-count", bVar.E);
        maybeSetColorInfo(mediaFormat, bVar.C);
        maybeSetString(mediaFormat, "mime", bVar.f60665o);
        maybeSetString(mediaFormat, "codecs-string", bVar.f60661k);
        maybeSetFloat(mediaFormat, "frame-rate", bVar.f60674x);
        maybeSetInteger(mediaFormat, "width", bVar.f60672v);
        maybeSetInteger(mediaFormat, "height", bVar.f60673w);
        setCsdBuffers(mediaFormat, bVar.f60668r);
        int i11 = bVar.G;
        if (i11 != -1) {
            maybeSetInteger(mediaFormat, "exo-pcm-encoding-int", i11);
            if (i11 == 0) {
                i10 = 0;
            } else if (i11 != 2) {
                i10 = 3;
                if (i11 != 3) {
                    i10 = 4;
                    if (i11 != 4) {
                        i10 = 21;
                        if (i11 != 21) {
                            i10 = 22;
                            if (i11 == 22) {
                            }
                        }
                    }
                }
            } else {
                i10 = 2;
            }
            mediaFormat.setInteger("pcm-encoding", i10);
        }
        maybeSetString(mediaFormat, DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY, bVar.f60654d);
        maybeSetInteger(mediaFormat, "max-input-size", bVar.f60666p);
        maybeSetInteger(mediaFormat, "sample-rate", bVar.F);
        maybeSetInteger(mediaFormat, "caption-service-number", bVar.J);
        mediaFormat.setInteger("rotation-degrees", bVar.f60675y);
        int i12 = bVar.f60655e;
        int i13 = 1;
        mediaFormat.setInteger("is-autoselect", (i12 & 4) != 0 ? 1 : 0);
        mediaFormat.setInteger("is-default", (i12 & 1) != 0 ? 1 : 0);
        mediaFormat.setInteger("is-forced-subtitle", (i12 & 2) != 0 ? 1 : 0);
        mediaFormat.setInteger("encoder-delay", bVar.H);
        mediaFormat.setInteger("encoder-padding", bVar.I);
        float f10 = bVar.f60676z;
        mediaFormat.setFloat("exo-pixel-width-height-ratio-float", f10);
        int i14 = 1073741824;
        if (f10 < 1.0f) {
            i13 = (int) (f10 * 1073741824);
        } else if (f10 > 1.0f) {
            i13 = 1073741824;
            i14 = (int) (1073741824 / f10);
        } else {
            i14 = 1;
        }
        mediaFormat.setInteger("sar-width", i13);
        mediaFormat.setInteger("sar-height", i14);
        String str = bVar.f60651a;
        if (str != null) {
            mediaFormat.setInteger("track-id", Integer.parseInt(str));
        }
        return mediaFormat;
    }

    public static byte[] getArray(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static gn.n getColorInfo(MediaFormat mediaFormat) {
        if (a1.f60679a < 24) {
            return null;
        }
        int integer = getInteger(mediaFormat, "color-standard", -1);
        int integer2 = getInteger(mediaFormat, "color-range", -1);
        int integer3 = getInteger(mediaFormat, "color-transfer", -1);
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
        byte[] array = byteBuffer != null ? getArray(byteBuffer) : null;
        if (integer != 2 && integer != 1 && integer != 6 && integer != -1) {
            integer = -1;
        }
        if (integer2 != 2 && integer2 != 1 && integer2 != -1) {
            integer2 = -1;
        }
        if (integer3 != 1 && integer3 != 3 && integer3 != 6 && integer3 != 7 && integer3 != -1) {
            integer3 = -1;
        }
        if (integer == -1 && integer2 == -1 && integer3 == -1 && array == null) {
            return null;
        }
        return new gn.m().setColorSpace(integer).setColorRange(integer2).setColorTransfer(integer3).setHdrStaticInfo(array).build();
    }

    public static float getFloat(MediaFormat mediaFormat, String str, float f10) {
        return mediaFormat.containsKey(str) ? mediaFormat.getFloat(str) : f10;
    }

    public static int getInteger(MediaFormat mediaFormat, String str, int i10) {
        return mediaFormat.containsKey(str) ? mediaFormat.getInteger(str) : i10;
    }

    public static String getString(MediaFormat mediaFormat, String str, String str2) {
        return mediaFormat.containsKey(str) ? mediaFormat.getString(str) : str2;
    }

    public static Integer getTimeLapseFrameRate(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("time-lapse-enable") && mediaFormat.getInteger("time-lapse-enable") > 0 && mediaFormat.containsKey("time-lapse-fps")) {
            return Integer.valueOf(mediaFormat.getInteger("time-lapse-fps"));
        }
        return null;
    }

    public static boolean isAudioFormat(MediaFormat mediaFormat) {
        return gn.x0.isAudio(mediaFormat.getString("mime"));
    }

    public static boolean isVideoFormat(MediaFormat mediaFormat) {
        return gn.x0.isVideo(mediaFormat.getString("mime"));
    }

    public static void maybeSetByteBuffer(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void maybeSetColorInfo(MediaFormat mediaFormat, gn.n nVar) {
        if (nVar != null) {
            maybeSetInteger(mediaFormat, "color-transfer", nVar.f58015c);
            maybeSetInteger(mediaFormat, "color-standard", nVar.f58013a);
            maybeSetInteger(mediaFormat, "color-range", nVar.f58014b);
            maybeSetByteBuffer(mediaFormat, "hdr-static-info", nVar.f58016d);
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
            mediaFormat.setByteBuffer(a.b.e(i10, "csd-"), ByteBuffer.wrap(list.get(i10)));
        }
    }
}
