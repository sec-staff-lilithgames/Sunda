package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzas {
    public static final /* synthetic */ int zza = 0;
    private static final ArrayList zzb = new ArrayList();
    private static final Pattern zzc = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean zza(String str) {
        return "audio".equals(zzk(str));
    }

    public static boolean zzb(String str) {
        return "video".equals(zzk(str));
    }

    public static boolean zzc(String str) {
        return "image".equals(zzk(str)) || "application/x-image-uri".equals(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean zzd(String str, String str2) {
        zzar zzarVarZzj;
        int iZza;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                }
                break;
            case -432837260:
                if (str.equals(MimeTypes.AUDIO_MPEG_L1)) {
                }
                break;
            case -432837259:
                if (str.equals(MimeTypes.AUDIO_MPEG_L2)) {
                }
                break;
            case -53558318:
                if (!str.equals(MimeTypes.AUDIO_AAC) || str2 == null || (zzarVarZzj = zzj(str2)) == null || (iZza = zzarVarZzj.zza()) == 0 || iZza == 16) {
                }
                break;
            case 187078296:
                if (str.equals(MimeTypes.AUDIO_AC3)) {
                }
                break;
            case 187094639:
                if (str.equals(MimeTypes.AUDIO_RAW)) {
                }
                break;
            case 1504578661:
                if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                }
                break;
            case 1504619009:
                if (str.equals(MimeTypes.AUDIO_FLAC)) {
                }
                break;
            case 1504831518:
                if (str.equals(MimeTypes.AUDIO_MPEG)) {
                }
                break;
            case 1903231877:
                if (str.equals(MimeTypes.AUDIO_ALAW)) {
                }
                break;
            case 1903589369:
                if (str.equals(MimeTypes.AUDIO_MLAW)) {
                }
                break;
        }
        return false;
    }

    public static boolean zze(String str, String str2) {
        String strZzf;
        zzar zzarVarZzj;
        String string = null;
        if (str != null) {
            String str3 = zzep.zza;
            String[] strArrSplit = TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
            StringBuilder sb2 = new StringBuilder();
            for (String str4 : strArrSplit) {
                if (str4 == null) {
                    strZzf = null;
                } else {
                    String strZza = zzglm.zza(str4.trim());
                    if (strZza.startsWith("avc1") || strZza.startsWith("avc3")) {
                        strZzf = "video/avc";
                    } else if (strZza.startsWith("hev1") || strZza.startsWith("hvc1")) {
                        strZzf = "video/hevc";
                    } else if (strZza.startsWith("dvav") || strZza.startsWith("dva1") || strZza.startsWith("dvhe") || strZza.startsWith("dvh1")) {
                        strZzf = "video/dolby-vision";
                    } else if (strZza.startsWith("av01")) {
                        strZzf = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                    } else if (strZza.startsWith("vp9") || strZza.startsWith("vp09")) {
                        strZzf = MimeTypes.VIDEO_VP9;
                    } else if (strZza.startsWith("vp8") || strZza.startsWith("vp08")) {
                        strZzf = MimeTypes.VIDEO_VP8;
                    } else if (strZza.startsWith("mp4a")) {
                        strZzf = (!strZza.startsWith("mp4a.") || (zzarVarZzj = zzj(strZza)) == null) ? null : zzf(zzarVarZzj.zza);
                        if (strZzf == null) {
                            strZzf = MimeTypes.AUDIO_AAC;
                        }
                    } else if (strZza.startsWith("mha1")) {
                        strZzf = "audio/mha1";
                    } else if (strZza.startsWith("mhm1")) {
                        strZzf = "audio/mhm1";
                    } else if (strZza.startsWith("ac-3") || strZza.startsWith("dac3")) {
                        strZzf = MimeTypes.AUDIO_AC3;
                    } else if (strZza.startsWith("ec-3") || strZza.startsWith("dec3")) {
                        strZzf = MimeTypes.AUDIO_E_AC3;
                    } else if (strZza.startsWith("ec+3")) {
                        strZzf = MimeTypes.AUDIO_E_AC3_JOC;
                    } else if (strZza.startsWith("ac-4") || strZza.startsWith("dac4")) {
                        strZzf = "audio/ac4";
                    } else if (strZza.startsWith("dtsc")) {
                        strZzf = MimeTypes.AUDIO_DTS;
                    } else if (strZza.startsWith("dtse")) {
                        strZzf = MimeTypes.AUDIO_DTS_EXPRESS;
                    } else if (strZza.startsWith("dtsh") || strZza.startsWith("dtsl")) {
                        strZzf = MimeTypes.AUDIO_DTS_HD;
                    } else if (strZza.startsWith("dtsx")) {
                        strZzf = "audio/vnd.dts.uhd;profile=p2";
                    } else if (strZza.startsWith("opus")) {
                        strZzf = MimeTypes.AUDIO_OPUS;
                    } else if (strZza.startsWith("vorbis")) {
                        strZzf = MimeTypes.AUDIO_VORBIS;
                    } else if (strZza.startsWith("flac")) {
                        strZzf = MimeTypes.AUDIO_FLAC;
                    } else if (strZza.startsWith("stpp")) {
                        strZzf = MimeTypes.APPLICATION_TTML;
                    } else if (strZza.startsWith("wvtt")) {
                        strZzf = MimeTypes.TEXT_VTT;
                    } else if (strZza.contains("cea708")) {
                        strZzf = MimeTypes.APPLICATION_CEA708;
                    } else if (strZza.contains("eia608") || strZza.contains("cea608")) {
                        strZzf = MimeTypes.APPLICATION_CEA608;
                    } else {
                        ArrayList arrayList = zzb;
                        int size = arrayList.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            String str5 = ((zzaq) arrayList.get(i10)).zzb;
                            if (strZza.startsWith(null)) {
                                break;
                            }
                        }
                        strZzf = null;
                    }
                }
                if (str2.equals(strZzf)) {
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    sb2.append(str4);
                }
            }
            if (sb2.length() > 0) {
                string = sb2.toString();
            }
        }
        return string != null;
    }

    public static String zzf(int i10) {
        if (i10 == 32) {
            return MimeTypes.VIDEO_MP4V;
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return MimeTypes.AUDIO_AAC;
        }
        if (i10 == 163) {
            return MimeTypes.VIDEO_VC1;
        }
        if (i10 == 177) {
            return MimeTypes.VIDEO_VP9;
        }
        if (i10 == 221) {
            return MimeTypes.AUDIO_VORBIS;
        }
        if (i10 == 165) {
            return MimeTypes.AUDIO_AC3;
        }
        if (i10 == 166) {
            return MimeTypes.AUDIO_E_AC3;
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return MimeTypes.VIDEO_MPEG2;
            case 102:
            case 103:
            case 104:
                return MimeTypes.AUDIO_AAC;
            case 105:
            case 107:
                return MimeTypes.AUDIO_MPEG;
            case 106:
                return MimeTypes.VIDEO_MPEG;
            case 108:
                return "image/jpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return MimeTypes.AUDIO_DTS;
                    case 170:
                    case 171:
                        return MimeTypes.AUDIO_DTS_HD;
                    case 173:
                        return MimeTypes.AUDIO_OPUS;
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzh(java.lang.String r3, java.lang.String r4) {
        /*
            int r0 = r3.hashCode()
            r1 = 8
            r2 = 0
            switch(r0) {
                case -2123537834: goto L8a;
                case -1365340241: goto L81;
                case -1095064472: goto L77;
                case -53558318: goto L60;
                case 187078296: goto L56;
                case 187078297: goto L4b;
                case 550520934: goto L40;
                case 1504578661: goto L36;
                case 1504831518: goto L2b;
                case 1504891608: goto L20;
                case 1505942594: goto L17;
                case 1556697186: goto Lc;
                default: goto La;
            }
        La:
            goto L95
        Lc:
            java.lang.String r4 = "audio/true-hd"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 14
            return r3
        L17:
            java.lang.String r4 = "audio/vnd.dts.hd"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            return r1
        L20:
            java.lang.String r4 = "audio/opus"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 20
            return r3
        L2b:
            java.lang.String r4 = "audio/mpeg"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 9
            return r3
        L36:
            java.lang.String r4 = "audio/eac3"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 6
            return r3
        L40:
            java.lang.String r4 = "audio/vnd.dts.uhd;profile=p2"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 30
            return r3
        L4b:
            java.lang.String r4 = "audio/ac4"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 17
            return r3
        L56:
            java.lang.String r4 = "audio/ac3"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 5
            return r3
        L60:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L95
            if (r4 != 0) goto L6b
            return r2
        L6b:
            com.google.android.gms.internal.ads.zzar r3 = zzj(r4)
            if (r3 != 0) goto L72
            return r2
        L72:
            int r3 = r3.zza()
            return r3
        L77:
            java.lang.String r4 = "audio/vnd.dts"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 7
            return r3
        L81:
            java.lang.String r4 = "audio/vnd.dts.hd;profile=lbr"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            return r1
        L8a:
            java.lang.String r4 = "audio/eac3-joc"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 18
            return r3
        L95:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzas.zzh(java.lang.String, java.lang.String):int");
    }

    public static String zzi(String str) {
        if (str == null) {
            return null;
        }
        String strZza = zzglm.zza(str);
        switch (strZza.hashCode()) {
            case -1833600100:
                return strZza.equals("video/x-mvhevc") ? "video/mv-hevc" : strZza;
            case -1007807498:
                return strZza.equals("audio/x-flac") ? MimeTypes.AUDIO_FLAC : strZza;
            case -979095690:
                return strZza.equals("application/x-mpegurl") ? MimeTypes.APPLICATION_M3U8 : strZza;
            case -586683234:
                return strZza.equals("audio/x-wav") ? "audio/wav" : strZza;
            case -432836268:
                return strZza.equals("audio/mpeg-l1") ? MimeTypes.AUDIO_MPEG_L1 : strZza;
            case -432836267:
                return strZza.equals("audio/mpeg-l2") ? MimeTypes.AUDIO_MPEG_L2 : strZza;
            case 187090231:
                return strZza.equals("audio/mp3") ? MimeTypes.AUDIO_MPEG : strZza;
            default:
                return strZza;
        }
    }

    public static zzar zzj(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new zzar(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static String zzk(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int zzg(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (zza(str)) {
            return 1;
        }
        if (!zzb(str)) {
            if (!"text".equals(zzk(str)) && !"application/x-media3-cues".equals(str) && !MimeTypes.APPLICATION_CEA608.equals(str) && !MimeTypes.APPLICATION_CEA708.equals(str) && !MimeTypes.APPLICATION_MP4CEA608.equals(str) && !MimeTypes.APPLICATION_SUBRIP.equals(str) && !MimeTypes.APPLICATION_TTML.equals(str) && !MimeTypes.APPLICATION_TX3G.equals(str) && !MimeTypes.APPLICATION_MP4VTT.equals(str) && !MimeTypes.APPLICATION_RAWCC.equals(str) && !MimeTypes.APPLICATION_VOBSUB.equals(str) && !MimeTypes.APPLICATION_PGS.equals(str) && !wHkgq.fsGYQAUXEyXpiQb.equals(str)) {
                if (zzc(str)) {
                    return 4;
                }
                if (!MimeTypes.APPLICATION_ID3.equals(str) && !MimeTypes.APPLICATION_EMSG.equals(str) && !MimeTypes.APPLICATION_SCTE35.equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str) && !"application/meta".equals(str)) {
                    if (!MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) {
                        ArrayList arrayList = zzb;
                        int size = arrayList.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            String str2 = ((zzaq) arrayList.get(i10)).zza;
                            if (str.equals(null)) {
                                return 0;
                            }
                        }
                        return -1;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 2;
    }
}
