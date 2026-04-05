package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhwi;
import com.google.android.gms.internal.ads.zzhwo;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzhwi<MessageType extends zzhwo<MessageType, BuilderType>, BuilderType extends zzhwi<MessageType, BuilderType>> extends zzhuq<MessageType, BuilderType> {
    protected MessageType zza;
    private final MessageType zzb;

    public zzhwi(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzaX()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = (MessageType) zza();
    }

    private MessageType zza() {
        return (MessageType) this.zzb.zzbg();
    }

    private static <MessageType> void zzb(MessageType messagetype, MessageType messagetype2) {
        zzhyj.zza().zzb(messagetype.getClass()).zzd(messagetype, messagetype2);
    }

    @Override // com.google.android.gms.internal.ads.zzhuq
    /* renamed from: zzaE */
    public /* bridge */ /* synthetic */ zzhuq zzbd(zzhvn zzhvnVar, zzhvy zzhvyVar) throws IOException {
        zzbr(zzhvnVar, zzhvyVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhuq
    /* renamed from: zzaI */
    public /* bridge */ /* synthetic */ zzhuq zzaZ(byte[] bArr, int i10, int i11) throws zzhxd {
        zzbq(bArr, i10, i11);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhuq
    /* renamed from: zzaK */
    public /* bridge */ /* synthetic */ zzhuq zzaX(byte[] bArr, int i10, int i11, zzhvy zzhvyVar) throws zzhxd {
        zzbp(bArr, i10, i11, zzhvyVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhuq
    public /* bridge */ /* synthetic */ zzhuq zzaQ(zzhur zzhurVar) {
        zzbn((zzhwo) zzhurVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhuq
    public /* bridge */ /* synthetic */ zzhxy zzaX(byte[] bArr, int i10, int i11, zzhvy zzhvyVar) throws zzhxd {
        zzbp(bArr, i10, i11, zzhvyVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhuq
    public /* bridge */ /* synthetic */ zzhxy zzaZ(byte[] bArr, int i10, int i11) throws zzhxd {
        zzbq(bArr, i10, i11);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhuq
    public /* bridge */ /* synthetic */ zzhxy zzbd(zzhvn zzhvnVar, zzhvy zzhvyVar) throws IOException {
        zzbr(zzhvnVar, zzhvyVar);
        return this;
    }

    public final void zzbg() {
        if (this.zza.zzaX()) {
            return;
        }
        zzbh();
    }

    public void zzbh() {
        MessageType messagetype = (MessageType) zza();
        zzb(messagetype, this.zza);
        this.zza = messagetype;
    }

    @Override // com.google.android.gms.internal.ads.zzhya
    public final boolean zzbi() {
        return zzhwo.zzg(this.zza, false);
    }

    public final BuilderType zzbj() {
        if (this.zzb.zzaX()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = (MessageType) zza();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhuq
    /* renamed from: zzbk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BuilderType zzbf() {
        BuilderType buildertype = (BuilderType) zzbw().zzdd();
        buildertype.zza = (MessageType) zzbt();
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzhxy
    /* renamed from: zzbl, reason: merged with bridge method [inline-methods] */
    public MessageType zzbt() {
        if (!this.zza.zzaX()) {
            return this.zza;
        }
        this.zza.zzbm();
        return this.zza;
    }

    /* renamed from: zzbm, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbu() {
        MessageType messagetype = (MessageType) zzbt();
        if (messagetype.zzbi()) {
            return messagetype;
        }
        throw zzhuq.zzaR(messagetype);
    }

    public BuilderType zzbn(MessageType messagetype) {
        zzbo(messagetype);
        return this;
    }

    public BuilderType zzbo(MessageType messagetype) {
        if (zzbw().equals(messagetype)) {
            return this;
        }
        zzbg();
        zzb(this.zza, messagetype);
        return this;
    }

    public BuilderType zzbp(byte[] bArr, int i10, int i11, zzhvy zzhvyVar) throws zzhxd {
        zzbg();
        try {
            zzhyj.zza().zzb(this.zza.getClass()).zzj(this.zza, bArr, i10, i10 + i11, new zzhuw(zzhvyVar));
            return this;
        } catch (zzhxd e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzhxd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public BuilderType zzbq(byte[] bArr, int i10, int i11) throws zzhxd {
        int i12 = zzhvy.zzb;
        int i13 = zzhuv.zza;
        zzbp(bArr, i10, i11, zzhvy.zza);
        return this;
    }

    public BuilderType zzbr(zzhvn zzhvnVar, zzhvy zzhvyVar) throws IOException {
        zzbg();
        try {
            zzhyj.zza().zzb(this.zza.getClass()).zzg(this.zza, zzhvo.zza(zzhvnVar), zzhvyVar);
            return this;
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof IOException) {
                throw ((IOException) e10.getCause());
            }
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhya
    /* renamed from: zzbs, reason: merged with bridge method [inline-methods] */
    public MessageType zzbw() {
        return this.zzb;
    }

    public /* bridge */ /* synthetic */ zzhxy zzbv() {
        zzbj();
        return this;
    }
}
