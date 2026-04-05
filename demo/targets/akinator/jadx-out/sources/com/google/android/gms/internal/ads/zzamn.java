package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzamn implements zzaod {
    private final List zza;

    public zzamn(int i10, List list) {
        this.zza = list;
    }

    private final zzant zzc(zzaoc zzaocVar) {
        return new zzant(zze(zzaocVar), "video/mp2t");
    }

    private final zzaoi zzd(zzaoc zzaocVar) {
        return new zzaoi(zze(zzaocVar), "video/mp2t");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    private final List zze(zzaoc zzaocVar) {
        String str;
        int i10;
        List listSingletonList;
        zzeg zzegVar = new zzeg(zzaocVar.zze);
        ArrayList arrayList = this.zza;
        while (zzegVar.zzd() > 0) {
            int iZzs = zzegVar.zzs();
            int iZzg = zzegVar.zzg() + zzegVar.zzs();
            if (iZzs == 134) {
                arrayList = new ArrayList();
                int iZzs2 = zzegVar.zzs() & 31;
                for (int i11 = 0; i11 < iZzs2; i11++) {
                    String strZzK = zzegVar.zzK(3, StandardCharsets.UTF_8);
                    int iZzs3 = zzegVar.zzs();
                    boolean z10 = (iZzs3 & 128) != 0;
                    if (z10) {
                        i10 = iZzs3 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i10 = 1;
                    }
                    byte bZzs = (byte) zzegVar.zzs();
                    zzegVar.zzk(1);
                    if (z10) {
                        int i12 = bZzs & 64;
                        int i13 = zzdd.zza;
                        listSingletonList = Collections.singletonList(i12 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    zzt zztVar = new zzt();
                    zztVar.zzm(str);
                    zztVar.zze(strZzK);
                    zztVar.zzJ(i10);
                    zztVar.zzp(listSingletonList);
                    arrayList.add(zztVar.zzM());
                }
            }
            zzegVar.zzh(iZzg);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzaod
    public final SparseArray zza() {
        return new SparseArray();
    }

    @Override // com.google.android.gms.internal.ads.zzaod
    public final zzaof zzb(int i10, zzaoc zzaocVar) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new zzanj(new zzanc(zzaocVar.zzb, zzaocVar.zza(), "video/mp2t"));
            }
            if (i10 == 21) {
                return new zzanj(new zzana("video/mp2t"));
            }
            if (i10 == 27) {
                return new zzanj(new zzamx(zzc(zzaocVar), false, false, "video/mp2t"));
            }
            if (i10 == 36) {
                return new zzanj(new zzamz(zzc(zzaocVar), "video/mp2t"));
            }
            if (i10 == 45) {
                return new zzanj(new zzand("video/mp2t"));
            }
            if (i10 == 89) {
                return new zzanj(new zzamp(zzaocVar.zzd, "video/mp2t"));
            }
            if (i10 == 172) {
                return new zzanj(new zzamj(zzaocVar.zzb, zzaocVar.zza(), "video/mp2t"));
            }
            if (i10 == 257) {
                return new zzanr(new zzani("application/vnd.dvb.ait", "video/mp2t"));
            }
            if (i10 != 128) {
                if (i10 != 129) {
                    if (i10 != 138) {
                        if (i10 == 139) {
                            return new zzanj(new zzamo(zzaocVar.zzb, zzaocVar.zza(), 5408, "video/mp2t"));
                        }
                        switch (i10) {
                            case 15:
                                return new zzanj(new zzamm(false, zzaocVar.zzb, zzaocVar.zza(), "video/mp2t"));
                            case 16:
                                return new zzanj(new zzamv(zzd(zzaocVar), "video/mp2t"));
                            case 17:
                                return new zzanj(new zzanb(zzaocVar.zzb, zzaocVar.zza(), "video/mp2t"));
                            default:
                                switch (i10) {
                                    case 134:
                                        return new zzanr(new zzani(MimeTypes.APPLICATION_SCTE35, "video/mp2t"));
                                    case 135:
                                        break;
                                    case PRIVACY_URL_ERROR_VALUE:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                    }
                    return new zzanj(new zzamo(zzaocVar.zzb, zzaocVar.zza(), 4096, "video/mp2t"));
                }
                return new zzanj(new zzamg(zzaocVar.zzb, zzaocVar.zza(), "video/mp2t"));
            }
        }
        return new zzanj(new zzams(zzd(zzaocVar), "video/mp2t"));
    }

    public zzamn() {
        this(0);
    }

    public zzamn(int i10) {
        this.zza = zzgpe.zzi();
    }
}
