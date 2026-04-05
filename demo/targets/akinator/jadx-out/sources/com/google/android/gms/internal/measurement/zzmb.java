package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzmb;
import com.google.android.gms.internal.measurement.zzmf;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzmb<MessageType extends zzmf<MessageType, BuilderType>, BuilderType extends zzmb<MessageType, BuilderType>> extends zzkr<MessageType, BuilderType> {
    protected zzmf zza;
    private final zzmf zzb;

    public zzmb(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzcf()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzch();
    }

    private static void zza(Object obj, Object obj2) {
        zznu.zza().zzb(obj.getClass()).zzd(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.zzkr
    public final /* bridge */ /* synthetic */ zzkr zzaS(byte[] bArr, int i10, int i11) throws zzmr {
        int i12 = zzlr.zzb;
        int i13 = zznu.zza;
        zzbe(bArr, 0, i11, zzlr.zza);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzkr
    public final /* bridge */ /* synthetic */ zzkr zzaT(byte[] bArr, int i10, int i11, zzlr zzlrVar) throws zzmr {
        zzbe(bArr, 0, i11, zzlrVar);
        return this;
    }

    public final void zzaX() {
        if (this.zza.zzcf()) {
            return;
        }
        zzaY();
    }

    public void zzaY() {
        zzmf zzmfVarZzch = this.zzb.zzch();
        zza(zzmfVarZzch, this.zza);
        this.zza = zzmfVarZzch;
    }

    @Override // com.google.android.gms.internal.measurement.zzkr
    /* renamed from: zzba, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzmb zzaR() {
        zzmb zzmbVar = (zzmb) this.zzb.zzl(5, null, null);
        zzmbVar.zza = zzbf();
        return zzmbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    /* renamed from: zzbb, reason: merged with bridge method [inline-methods] */
    public MessageType zzbf() {
        if (!this.zza.zzcf()) {
            return (MessageType) this.zza;
        }
        this.zza.zzcj();
        return (MessageType) this.zza;
    }

    public final MessageType zzbc() {
        MessageType messagetype = (MessageType) zzbf();
        if (messagetype.zzcD()) {
            return messagetype;
        }
        throw new zzoh(messagetype);
    }

    public final zzmb zzbd(zzmf zzmfVar) {
        if (!this.zzb.equals(zzmfVar)) {
            if (!this.zza.zzcf()) {
                zzaY();
            }
            zza(this.zza, zzmfVar);
        }
        return this;
    }

    public final zzmb zzbe(byte[] bArr, int i10, int i11, zzlr zzlrVar) throws zzmr {
        if (!this.zza.zzcf()) {
            zzaY();
        }
        try {
            zznu.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, 0, i11, new zzkw(zzlrVar));
            return this;
        } catch (zzmr e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznn
    public final boolean zzcD() {
        return zzmf.zzd(this.zza, false);
    }

    @Override // com.google.android.gms.internal.measurement.zznn
    public final /* bridge */ /* synthetic */ zznm zzcE() {
        throw null;
    }
}
