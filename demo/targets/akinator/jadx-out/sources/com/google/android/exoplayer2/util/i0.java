package com.google.android.exoplayer2.util;

import android.media.MediaFormat;
import com.amazon.device.ads.DtbDeviceData;
import java.nio.ByteBuffer;
import java.util.List;
import nh.x4;
import sf.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class i0 {
    public static sf.b a(MediaFormat mediaFormat, boolean z10) {
        if (n1.f28506a >= 24) {
            int integer = getInteger(mediaFormat, "color-standard", -1);
            int integer2 = getInteger(mediaFormat, "color-range", -1);
            int integer3 = getInteger(mediaFormat, "color-transfer", -1);
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byte[] array = byteBuffer != null ? getArray(byteBuffer) : null;
            if (!z10) {
                if (integer != 2 && integer != 1 && integer != 6 && integer != -1) {
                    integer = -1;
                }
                if (integer2 != 2 && integer2 != 1 && integer2 != -1) {
                    integer2 = -1;
                }
                if (integer3 != 1 && integer3 != 3 && integer3 != 6 && integer3 != 7 && integer3 != -1) {
                    integer3 = -1;
                }
            }
            if (integer != -1 || integer2 != -1 || integer3 != -1 || array != null) {
                return new b.a().setColorSpace(integer).setColorRange(integer2).setColorTransfer(integer3).setHdrStaticInfo(array).build();
            }
        }
        return null;
    }

    public static com.google.android.exoplayer2.z0 createFormatFromMediaFormat(MediaFormat mediaFormat) {
        float integer;
        com.google.android.exoplayer2.y0 codecs = new com.google.android.exoplayer2.y0().setSampleMimeType(mediaFormat.getString("mime")).setLanguage(mediaFormat.getString(DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY)).setPeakBitrate(getInteger(mediaFormat, "max-bitrate", -1)).setAverageBitrate(getInteger(mediaFormat, "bitrate", -1)).setCodecs(mediaFormat.getString("codecs-string"));
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
        com.google.android.exoplayer2.y0 pcmEncoding = codecs.setFrameRate(integer).setWidth(getInteger(mediaFormat, "width", -1)).setHeight(getInteger(mediaFormat, "height", -1)).setPixelWidthHeightRatio((mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) ? mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height") : 1.0f).setMaxInputSize(getInteger(mediaFormat, "max-input-size", -1)).setRotationDegrees(getInteger(mediaFormat, "rotation-degrees", 0)).setColorInfo(a(mediaFormat, true)).setSampleRate(getInteger(mediaFormat, "sample-rate", -1)).setChannelCount(getInteger(mediaFormat, "channel-count", -1)).setPcmEncoding(getInteger(mediaFormat, "pcm-encoding", -1));
        x4 x4Var = new x4();
        while (true) {
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-" + i10);
            if (byteBuffer == null) {
                pcmEncoding.setInitializationData(x4Var.build());
                return pcmEncoding.build();
            }
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            byteBuffer.rewind();
            x4Var.add((Object) bArr);
            i10++;
        }
    }

    public static MediaFormat createMediaFormatFromFormat(com.google.android.exoplayer2.z0 z0Var) {
        int i10;
        MediaFormat mediaFormat = new MediaFormat();
        maybeSetInteger(mediaFormat, "bitrate", z0Var.f28798j);
        maybeSetInteger(mediaFormat, "max-bitrate", z0Var.f28797i);
        maybeSetInteger(mediaFormat, "channel-count", z0Var.A);
        maybeSetColorInfo(mediaFormat, z0Var.f28814z);
        maybeSetString(mediaFormat, "mime", z0Var.f28802n);
        maybeSetString(mediaFormat, "codecs-string", z0Var.f28799k);
        maybeSetFloat(mediaFormat, "frame-rate", z0Var.f28809u);
        maybeSetInteger(mediaFormat, "width", z0Var.f28807s);
        maybeSetInteger(mediaFormat, "height", z0Var.f28808t);
        setCsdBuffers(mediaFormat, z0Var.f28804p);
        int i11 = z0Var.C;
        if (i11 != -1) {
            maybeSetInteger(mediaFormat, "exo-pcm-encoding-int", i11);
            if (i11 == 0) {
                i10 = 0;
            } else if (i11 == 536870912) {
                i10 = 21;
            } else if (i11 == 805306368) {
                i10 = 22;
            } else if (i11 != 2) {
                i10 = 3;
                if (i11 != 3) {
                    i10 = 4;
                    if (i11 == 4) {
                    }
                }
            } else {
                i10 = 2;
            }
            mediaFormat.setInteger("pcm-encoding", i10);
        }
        maybeSetString(mediaFormat, DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY, z0Var.f28793e);
        maybeSetInteger(mediaFormat, "max-input-size", z0Var.f28803o);
        maybeSetInteger(mediaFormat, "sample-rate", z0Var.B);
        maybeSetInteger(mediaFormat, "caption-service-number", z0Var.F);
        mediaFormat.setInteger("rotation-degrees", z0Var.f28810v);
        int i12 = z0Var.f28794f;
        int i13 = 1;
        mediaFormat.setInteger("is-autoselect", (i12 & 4) != 0 ? 1 : 0);
        mediaFormat.setInteger("is-default", (i12 & 1) != 0 ? 1 : 0);
        mediaFormat.setInteger("is-forced-subtitle", (i12 & 2) != 0 ? 1 : 0);
        mediaFormat.setInteger("encoder-delay", z0Var.D);
        mediaFormat.setInteger("encoder-padding", z0Var.E);
        float f10 = z0Var.f28811w;
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
        return mediaFormat;
    }

    public static byte[] getArray(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static sf.b getColorInfo(MediaFormat mediaFormat) {
        return a(mediaFormat, false);
    }

    public static float getFloat(MediaFormat mediaFormat, String str, float f10) {
        return mediaFormat.containsKey(str) ? mediaFormat.getFloat(str) : f10;
    }

    public static int getInteger(MediaFormat mediaFormat, String str, int i10) {
        return mediaFormat.containsKey(str) ? mediaFormat.getInteger(str) : i10;
    }

    public static Integer getTimeLapseFrameRate(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("time-lapse-enable") && mediaFormat.getInteger("time-lapse-enable") > 0 && mediaFormat.containsKey("time-lapse-fps")) {
            return Integer.valueOf(mediaFormat.getInteger("time-lapse-fps"));
        }
        return null;
    }

    public static boolean isAudioFormat(MediaFormat mediaFormat) {
        return l0.isAudio(mediaFormat.getString("mime"));
    }

    public static boolean isVideoFormat(MediaFormat mediaFormat) {
        return l0.isVideo(mediaFormat.getString("mime"));
    }

    public static void maybeSetByteBuffer(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void maybeSetColorInfo(MediaFormat mediaFormat, sf.b bVar) {
        if (bVar != null) {
            maybeSetInteger(mediaFormat, "color-transfer", bVar.f85614e);
            maybeSetInteger(mediaFormat, "color-standard", bVar.f85612b);
            maybeSetInteger(mediaFormat, "color-range", bVar.f85613c);
            maybeSetByteBuffer(mediaFormat, "hdr-static-info", bVar.f85615f);
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
