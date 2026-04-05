package com.google.android.gms.internal.play_billing;

import a.b;
import com.google.android.gms.internal.play_billing.zzfu;
import com.google.android.gms.internal.play_billing.zzfv;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzfv<MessageType extends zzfv<MessageType, BuilderType>, BuilderType extends zzfu<MessageType, BuilderType>> implements zzim {
    protected int zza = 0;

    public static void zzg(Iterable iterable, List list) {
        zzfu.zzc(iterable, list);
    }

    public int zze(zzix zzixVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzim
    public final zzgk zzf() {
        try {
            int iZzk = zzk();
            zzgk zzgkVar = zzgk.zzb;
            byte[] bArr = new byte[iZzk];
            zzgo zzgoVar = new zzgo(bArr, 0, iZzk);
            zzJ(zzgoVar);
            zzgoVar.zzB();
            return new zzgi(bArr);
        } catch (IOException e10) {
            throw new RuntimeException(b.l("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }

    public final byte[] zzh() {
        try {
            int iZzk = zzk();
            byte[] bArr = new byte[iZzk];
            zzgo zzgoVar = new zzgo(bArr, 0, iZzk);
            zzJ(zzgoVar);
            zzgoVar.zzB();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(b.l("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }
}
