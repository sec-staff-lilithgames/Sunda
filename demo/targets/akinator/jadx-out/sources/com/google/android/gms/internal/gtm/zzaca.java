package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzaca;
import com.google.android.gms.internal.gtm.zzacf;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzaca<MessageType extends zzacf<MessageType, BuilderType>, BuilderType extends zzaca<MessageType, BuilderType>> extends zzyg<MessageType, BuilderType> {
    protected zzacf zza;
    private final zzacf zzb;

    public zzaca(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzar()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzae();
    }

    private static void zza(Object obj, Object obj2) {
        zzadt.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    public final zzaca zzA(zzacf zzacfVar) {
        if (!this.zzb.equals(zzacfVar)) {
            if (!this.zza.zzar()) {
                zzH();
            }
            zza(this.zza, zzacfVar);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.gtm.zzadk
    /* renamed from: zzB, reason: merged with bridge method [inline-methods] */
    public final MessageType zzD() {
        MessageType messagetype = (MessageType) zzE();
        if (zzacf.zzaq(messagetype, true)) {
            return messagetype;
        }
        throw new zzael(messagetype);
    }

    @Override // com.google.android.gms.internal.gtm.zzadk
    /* renamed from: zzC */
    public MessageType zzE() {
        if (!this.zza.zzar()) {
            return (MessageType) this.zza;
        }
        this.zza.zzam();
        return (MessageType) this.zza;
    }

    public final void zzG() {
        if (this.zza.zzar()) {
            return;
        }
        zzH();
    }

    public void zzH() {
        zzacf zzacfVarZzae = this.zzb.zzae();
        zza(zzacfVarZzae, this.zza);
        this.zza = zzacfVarZzae;
    }

    @Override // com.google.android.gms.internal.gtm.zzadm
    public final /* synthetic */ zzadl zzay() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzadm
    public final boolean zzaz() {
        return zzacf.zzaq(this.zza, false);
    }

    @Override // com.google.android.gms.internal.gtm.zzyg
    public final /* synthetic */ zzyg zzw(zzyh zzyhVar) {
        zzA((zzacf) zzyhVar);
        return this;
    }

    @Override // com.google.android.gms.internal.gtm.zzyg, com.google.android.gms.internal.gtm.zzadk
    public final /* bridge */ /* synthetic */ zzadk zzy(zzzb zzzbVar, zzabq zzabqVar) throws IOException {
        if (!this.zza.zzar()) {
            zzH();
        }
        try {
            zzadt.zza().zzb(this.zza.getClass()).zzh(this.zza, zzzc.zzq(zzzbVar), zzabqVar);
            return this;
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof IOException) {
                throw ((IOException) e10.getCause());
            }
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzyg
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzaca zzv() {
        zzaca zzacaVar = (zzaca) this.zzb.zzb(5, null, null);
        zzacaVar.zza = zzE();
        return zzacaVar;
    }
}
