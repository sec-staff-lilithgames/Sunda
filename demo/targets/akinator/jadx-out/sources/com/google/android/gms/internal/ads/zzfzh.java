package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfzh extends zzfyz {
    private final ExecutorService zzb;
    private final zzfzg zzc;
    private final Function zzd;

    public zzfzh(File file, ExecutorService executorService, zzfzg zzfzgVar, Function function) {
        super(file);
        this.zzb = executorService;
        this.zzc = zzfzgVar;
        this.zzd = function;
    }

    @Override // com.google.android.gms.internal.ads.zzfyz
    public final n1 zzb() {
        return zzgui.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzfze
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzd();
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfyz
    public final n1 zzc(final Object obj) {
        return zzgui.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzfzd
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.zza.zze(obj);
                return null;
            }
        }, this.zzb);
    }

    public final /* synthetic */ Object zzd() {
        Object objZzc;
        Object objZzb;
        synchronized (this) {
            try {
                try {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(this.zza);
                        try {
                            objZzb = this.zzc.zzb(fileInputStream);
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (IOException e10) {
                        objZzc = this.zzd.apply(new zzfzc(e10));
                        return objZzc;
                    }
                } catch (zzfzc e11) {
                    objZzc = this.zzd.apply(e11);
                    return objZzc;
                }
            } catch (FileNotFoundException unused) {
                objZzc = this.zzc.zzc();
                return objZzc;
            }
        }
        return objZzb;
    }

    public final /* synthetic */ Void zze(Object obj) {
        synchronized (this) {
            File file = this.zza;
            zzgsg.zzb(file);
            String parent = file.getParent();
            String name = file.getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 5);
            sb2.append(name);
            sb2.append(".temp");
            File file2 = new File(parent, sb2.toString());
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    this.zzc.zza(obj, fileOutputStream);
                    fileOutputStream.close();
                    if (!file2.renameTo(this.zza)) {
                        throw new IOException("Failed to rename file.");
                    }
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                file2.delete();
                throw e10;
            }
        }
        return null;
    }
}
