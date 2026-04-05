package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzayr extends zzazr {
    private static final zzazs zzh = new zzazs();
    private final zzatv zzi;
    private final Context zzj;
    private final zzavx zzk;

    public zzayr(zzayd zzaydVar, String str, String str2, zzauc zzaucVar, int i10, int i11, Context context, zzato zzatoVar, zzatv zzatvVar, zzavx zzavxVar) {
        super(zzaydVar, "yYlfo3JOLIfvdgBq3U3deu0pC6YiXdEdqGnVULE/KCllAkaO/XSsVQU+sKDN/uG0", "5ZNtOO3srzHnbl5PLlxEIuHlg0l+6HDun864hT7P5ko=", zzaucVar, i10, 27);
        this.zzj = context;
        this.zzi = zzatvVar;
        this.zzk = zzavxVar;
    }

    private final zzavu zzc() throws IllegalAccessException, InvocationTargetException {
        int iZzb;
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzdc)).booleanValue()) {
            iZzb = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzdi)).intValue();
        } else {
            iZzb = this.zzi.zzb();
        }
        zzavu zzavuVar = new zzavu((String) this.zze.invoke(null, this.zzj, Boolean.FALSE, ""));
        zzavx zzavxVar = this.zzk;
        if (zzavxVar == null || zzavxVar.zza() == null) {
            str = "E";
        } else {
            try {
                str = (String) zzavxVar.zza().get(iZzb, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
        }
        zzavuVar.zza = str;
        return zzavuVar;
    }

    private final String zzd() throws ExecutionException, InterruptedException {
        try {
            zzayd zzaydVar = this.zza;
            if (zzaydVar.zzm() != null) {
                zzaydVar.zzm().get();
            }
            zzauz zzauzVarZzl = zzaydVar.zzl();
            if (zzauzVarZzl == null || !zzauzVarZzl.zza()) {
                return null;
            }
            return zzauzVarZzl.zzb();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazr
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        int i10;
        zzavu zzavuVarZzc;
        zzavu zzavuVar;
        zzazs zzazsVar = zzh;
        Context context = this.zzj;
        AtomicReference atomicReferenceZza = zzazsVar.zza(context.getPackageName());
        synchronized (atomicReferenceZza) {
            try {
                zzavu zzavuVar2 = (zzavu) atomicReferenceZza.get();
                if (zzavuVar2 == null || zzayg.zzc(zzavuVar2.zza) || zzavuVar2.zza.equals("E") || zzavuVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                    if (zzayg.zzc(null)) {
                        zzayg.zzc(null);
                        i10 = 3;
                    } else {
                        i10 = 5;
                    }
                    if (this.zzk != null) {
                        zzavuVarZzc = zzc();
                    } else {
                        boolean z10 = false;
                        if (i10 == 3 && !this.zzi.zza()) {
                            z10 = true;
                        }
                        Boolean boolValueOf = Boolean.valueOf(z10);
                        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcQ);
                        String strZzb = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcP)).booleanValue() ? zzb() : null;
                        if (bool.booleanValue() && this.zza.zzi() && zzayg.zzc(strZzb)) {
                            strZzb = zzd();
                        }
                        zzavu zzavuVar3 = new zzavu((String) this.zze.invoke(null, context, boolValueOf, strZzb));
                        if (zzayg.zzc(zzavuVar3.zza) || zzavuVar3.zza.equals("E")) {
                            int i11 = i10 - 1;
                            if (i11 == 3) {
                                String strZzd = zzd();
                                if (!zzayg.zzc(strZzd)) {
                                    zzavuVar3.zza = strZzd;
                                }
                            } else if (i11 == 4) {
                                throw null;
                            }
                        }
                        zzavuVarZzc = zzavuVar3;
                    }
                    atomicReferenceZza.set(zzavuVarZzc);
                }
                zzavuVar = (zzavu) atomicReferenceZza.get();
            } finally {
            }
        }
        zzauc zzaucVar = this.zzd;
        synchronized (zzaucVar) {
            if (zzavuVar != null) {
                try {
                    zzaucVar.zzo(zzavuVar.zza);
                    zzaucVar.zzu(zzavuVar.zzb);
                    zzaucVar.zzt(zzavuVar.zzc);
                    zzaucVar.zzD(zzavuVar.zzd);
                    zzaucVar.zzE(zzavuVar.zze);
                } finally {
                }
            }
        }
    }

    public final String zzb() throws CertificateException {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            byte[] bArrZzb = zzayg.zzb((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcR));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzb)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzayg.zzb((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcS)))));
            }
            Context context = this.zzj;
            return zzazu.zza(context, context.getPackageName(), arrayList, this.zza.zzd());
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
