package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzafc implements zzaev {
    public final zzgpe zza;
    private final int zzb;

    private zzafc(int i10, zzgpe zzgpeVar) {
        this.zzb = i10;
        this.zza = zzgpeVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzafc zzb(int i10, zzeg zzegVar) {
        zzaev zzafdVar;
        String str;
        zzgpb zzgpbVar = new zzgpb();
        int iZze = zzegVar.zze();
        int iZzc = -2;
        while (zzegVar.zzd() > 8) {
            int iZzC = zzegVar.zzC();
            int iZzg = zzegVar.zzg() + zzegVar.zzC();
            zzegVar.zzf(iZzg);
            if (iZzC != 1414744396) {
                zzafd zzafdVar2 = null;
                switch (iZzC) {
                    case 1718776947:
                        if (iZzc == 2) {
                            zzegVar.zzk(4);
                            int iZzC2 = zzegVar.zzC();
                            int iZzC3 = zzegVar.zzC();
                            zzegVar.zzk(4);
                            int iZzC4 = zzegVar.zzC();
                            switch (iZzC4) {
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
                                com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.s(new StringBuilder(String.valueOf(iZzC4).length() + 44), "Ignoring track with unsupported compression ", iZzC4, "StreamFormatChunk");
                            } else {
                                zzt zztVar = new zzt();
                                zztVar.zzt(iZzC2);
                                zztVar.zzu(iZzC3);
                                zztVar.zzm(str);
                                zzafdVar2 = new zzafd(zztVar.zzM());
                            }
                        } else if (iZzc == 1) {
                            int iZzu = zzegVar.zzu();
                            String str2 = iZzu != 1 ? iZzu != 85 ? iZzu != 255 ? iZzu != 8192 ? iZzu != 8193 ? null : MimeTypes.AUDIO_DTS : MimeTypes.AUDIO_AC3 : MimeTypes.AUDIO_AAC : MimeTypes.AUDIO_MPEG : MimeTypes.AUDIO_RAW;
                            if (str2 != null) {
                                int iZzu2 = zzegVar.zzu();
                                int iZzC5 = zzegVar.zzC();
                                zzegVar.zzk(6);
                                int iZzz = zzep.zzz(zzegVar.zzu(), ByteOrder.LITTLE_ENDIAN);
                                int iZzu3 = zzegVar.zzd() > 0 ? zzegVar.zzu() : 0;
                                zzt zztVar2 = new zzt();
                                zztVar2.zzm(str2);
                                zztVar2.zzE(iZzu2);
                                zztVar2.zzF(iZzC5);
                                if (str2.equals(MimeTypes.AUDIO_RAW) && iZzz != 0) {
                                    zztVar2.zzG(iZzz);
                                }
                                if (str2.equals(MimeTypes.AUDIO_AAC) && iZzu3 > 0) {
                                    byte[] bArr = new byte[iZzu3];
                                    zzegVar.zzm(bArr, 0, iZzu3);
                                    zztVar2.zzp(zzgpe.zzj(bArr));
                                }
                                zzafdVar = new zzafd(zztVar2.zzM());
                                break;
                            } else {
                                com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.s(new StringBuilder(String.valueOf(iZzu).length() + 43), "Ignoring track with unsupported format tag ", iZzu, "StreamFormatChunk");
                            }
                        } else {
                            zzdt.zzc("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzep.zzQ(iZzc)));
                        }
                        zzafdVar = zzafdVar2;
                        break;
                    case 1751742049:
                        zzafdVar = zzaez.zzb(zzegVar);
                        break;
                    case 1752331379:
                        zzafdVar = zzafa.zzb(zzegVar);
                        break;
                    case 1852994675:
                        zzafdVar = zzafe.zzb(zzegVar);
                        break;
                    default:
                        zzafdVar = zzafdVar2;
                        break;
                }
            } else {
                zzafdVar = zzb(zzegVar.zzC(), zzegVar);
            }
            if (zzafdVar != null) {
                if (zzafdVar.zza() == 1752331379) {
                    iZzc = ((zzafa) zzafdVar).zzc();
                }
                zzgpbVar.zzf(zzafdVar);
            }
            zzegVar.zzh(iZzg);
            zzegVar.zzf(iZze);
        }
        return new zzafc(i10, zzgpbVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final int zza() {
        return this.zzb;
    }

    public final zzaev zzc(Class cls) {
        zzgpe zzgpeVar = this.zza;
        int size = zzgpeVar.size();
        int i10 = 0;
        while (i10 < size) {
            zzaev zzaevVar = (zzaev) zzgpeVar.get(i10);
            i10++;
            if (zzaevVar.getClass() == cls) {
                return zzaevVar;
            }
        }
        return null;
    }
}
