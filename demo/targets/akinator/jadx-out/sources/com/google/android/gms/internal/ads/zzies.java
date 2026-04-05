package com.google.android.gms.internal.ads;

import com.ironsource.C3191e4;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzies implements Iterator, Closeable, zzarg {
    private static final zzarf zza = new zzier("eof ");
    protected zzarc zzb;
    protected zziet zzc;
    zzarf zzd = null;
    long zze = 0;
    long zzf = 0;
    private final List zzg = new ArrayList();

    static {
        zziez.zzb(zzies.class);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzarf zzarfVar = this.zzd;
        if (zzarfVar == zza) {
            return false;
        }
        if (zzarfVar != null) {
            return true;
        }
        try {
            this.zzd = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zzd = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append(C3191e4.i.f36529d);
        int i10 = 0;
        while (true) {
            List list = this.zzg;
            if (i10 >= list.size()) {
                sb2.append(C3191e4.i.f36531e);
                return sb2.toString();
            }
            if (i10 > 0) {
                sb2.append(";");
            }
            sb2.append(((zzarf) list.get(i10)).toString());
            i10++;
        }
    }

    public final List zzc() {
        return (this.zzc == null || this.zzd == zza) ? this.zzg : new zziey(this.zzg, this);
    }

    public final void zzd(zziet zzietVar, long j10, zzarc zzarcVar) throws IOException {
        this.zzc = zzietVar;
        this.zze = zzietVar.zzc();
        zzietVar.zzd(zzietVar.zzc() + j10);
        this.zzf = zzietVar.zzc();
        this.zzb = zzarcVar;
    }

    @Override // java.util.Iterator
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzarf next() {
        zzarf zzarfVarZzb;
        zzarf zzarfVar = this.zzd;
        if (zzarfVar != null && zzarfVar != zza) {
            this.zzd = null;
            return zzarfVar;
        }
        zziet zzietVar = this.zzc;
        if (zzietVar == null || this.zze >= this.zzf) {
            this.zzd = zza;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zzietVar) {
                this.zzc.zzd(this.zze);
                zzarfVarZzb = this.zzb.zzb(this.zzc, this);
                this.zze = this.zzc.zzc();
            }
            return zzarfVarZzb;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public void close() throws IOException {
    }
}
