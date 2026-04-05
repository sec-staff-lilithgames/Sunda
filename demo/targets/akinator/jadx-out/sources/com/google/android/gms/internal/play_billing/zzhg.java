package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzhg;
import com.google.android.gms.internal.play_billing.zzhk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzhg<MessageType extends zzhk<MessageType, BuilderType>, BuilderType extends zzhg<MessageType, BuilderType>> extends zzfu<MessageType, BuilderType> {
    protected zzhk zza;
    private final zzhk zzb;

    public zzhg(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzA()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzp();
    }

    private static void zza(Object obj, Object obj2) {
        zziu.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzhg zzb() {
        zzhg zzhgVar = (zzhg) this.zzb.zzd(5, null, null);
        zzhgVar.zza = zzh();
        return zzhgVar;
    }

    public final zzhg zze(zzhk zzhkVar) {
        if (!this.zzb.equals(zzhkVar)) {
            if (!this.zza.zzA()) {
                zzk();
            }
            zza(this.zza, zzhkVar);
        }
        return this;
    }

    public final MessageType zzf() {
        MessageType messagetype = (MessageType) zzh();
        if (zzhk.zzz(messagetype, true)) {
            return messagetype;
        }
        throw new zzji(messagetype);
    }

    @Override // com.google.android.gms.internal.play_billing.zzil
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public MessageType zzh() {
        if (!this.zza.zzA()) {
            return (MessageType) this.zza;
        }
        this.zza.zzv();
        return (MessageType) this.zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzin
    public final /* bridge */ /* synthetic */ zzim zzi() {
        throw null;
    }

    public final void zzj() {
        if (this.zza.zzA()) {
            return;
        }
        zzk();
    }

    public void zzk() {
        zzhk zzhkVarZzp = this.zzb.zzp();
        zza(zzhkVarZzp, this.zza);
        this.zza = zzhkVarZzp;
    }

    @Override // com.google.android.gms.internal.play_billing.zzin
    public final boolean zzl() {
        return zzhk.zzz(this.zza, false);
    }
}
