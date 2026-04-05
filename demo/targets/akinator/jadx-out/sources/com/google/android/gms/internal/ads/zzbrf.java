package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbrf extends zzbri {
    @Override // com.google.android.gms.internal.ads.zzbrj
    public final zzbrm zzb(String str) throws RemoteException {
        try {
            try {
                Class<?> cls = Class.forName(str, false, zzbrf.class.getClassLoader());
                if (MediationAdapter.class.isAssignableFrom(cls)) {
                    return new zzbsk((MediationAdapter) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (Adapter.class.isAssignableFrom(cls)) {
                    return new zzbsk((Adapter) cls.getDeclaredConstructor(null).newInstance(null));
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 64);
                sb2.append("Could not instantiate mediation adapter: ");
                sb2.append(str);
                sb2.append(" (not a valid adapter).");
                com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
                throw new RemoteException();
            } catch (Throwable unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Reflection failed, retrying using direct instantiation");
                if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    return new zzbsk(new AdMobAdapter());
                }
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    return new zzbsk(new CustomEventAdapter());
                }
                throw new RemoteException();
            }
        } catch (Throwable th2) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
            sb3.append("Could not instantiate mediation adapter: ");
            sb3.append(str);
            sb3.append(". ");
            com.google.android.gms.ads.internal.util.client.zzo.zzj(sb3.toString(), th2);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrj
    public final boolean zzc(String str) throws RemoteException {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, zzbrf.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 88);
            sb2.append("Could not load custom event implementation class: ");
            sb2.append(str);
            sb2.append(", trying Adapter implementation class.");
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrj
    public final boolean zzd(String str) throws RemoteException {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, zzbrf.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 104);
            sb2.append("Could not load custom event implementation class as Adapter: ");
            sb2.append(str);
            sb2.append(", assuming old custom event implementation.");
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrj
    public final zzbti zze(String str) throws RemoteException {
        return new zzbtv((RtbAdapter) Class.forName(str, false, zzbtm.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
    }
}
