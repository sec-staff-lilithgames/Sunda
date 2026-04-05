package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzbf();
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_NO_POWER = 105;
    int zza;
    long zzb;
    long zzc;
    boolean zzd;
    long zze;
    int zzf;
    float zzg;
    long zzh;
    boolean zzi;

    @Deprecated
    public LocationRequest() {
        this.zza = 102;
        this.zzb = 3600000L;
        this.zzc = TTAdConstant.AD_MAX_EVENT_TIME;
        this.zzd = false;
        this.zze = Long.MAX_VALUE;
        this.zzf = Integer.MAX_VALUE;
        this.zzg = 0.0f;
        this.zzh = 0L;
        this.zzi = false;
    }

    public static LocationRequest create() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.setWaitForAccurateLocation(true);
        return locationRequest;
    }

    private static void zza(long j10) {
        if (j10 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("invalid interval: ");
        sb2.append(j10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.zza == locationRequest.zza && this.zzb == locationRequest.zzb && this.zzc == locationRequest.zzc && this.zzd == locationRequest.zzd && this.zze == locationRequest.zze && this.zzf == locationRequest.zzf && this.zzg == locationRequest.zzg && getMaxWaitTime() == locationRequest.getMaxWaitTime() && this.zzi == locationRequest.zzi) {
                return true;
            }
        }
        return false;
    }

    public long getExpirationTime() {
        return this.zze;
    }

    public long getFastestInterval() {
        return this.zzc;
    }

    public long getInterval() {
        return this.zzb;
    }

    public long getMaxWaitTime() {
        long j10 = this.zzh;
        long j11 = this.zzb;
        return j10 < j11 ? j11 : j10;
    }

    public int getNumUpdates() {
        return this.zzf;
    }

    public int getPriority() {
        return this.zza;
    }

    public float getSmallestDisplacement() {
        return this.zzg;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), Float.valueOf(this.zzg), Long.valueOf(this.zzh));
    }

    public boolean isFastestIntervalExplicitlySet() {
        return this.zzd;
    }

    public boolean isWaitForAccurateLocation() {
        return this.zzi;
    }

    public LocationRequest setExpirationDuration(long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = j10 <= Long.MAX_VALUE - jElapsedRealtime ? j10 + jElapsedRealtime : Long.MAX_VALUE;
        this.zze = j11;
        if (j11 < 0) {
            this.zze = 0L;
        }
        return this;
    }

    public LocationRequest setExpirationTime(long j10) {
        this.zze = j10;
        if (j10 < 0) {
            this.zze = 0L;
        }
        return this;
    }

    public LocationRequest setFastestInterval(long j10) {
        zza(j10);
        this.zzd = true;
        this.zzc = j10;
        return this;
    }

    public LocationRequest setInterval(long j10) {
        zza(j10);
        this.zzb = j10;
        if (!this.zzd) {
            this.zzc = (long) (j10 / 6.0d);
        }
        return this;
    }

    public LocationRequest setMaxWaitTime(long j10) {
        zza(j10);
        this.zzh = j10;
        return this;
    }

    public LocationRequest setNumUpdates(int i10) {
        if (i10 > 0) {
            this.zzf = i10;
            return this;
        }
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append("invalid numUpdates: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public LocationRequest setPriority(int i10) {
        if (i10 == 100 || i10 == 102 || i10 == 104 || i10 == 105) {
            this.zza = i10;
            return this;
        }
        StringBuilder sb2 = new StringBuilder(28);
        sb2.append("invalid quality: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public LocationRequest setSmallestDisplacement(float f10) {
        if (f10 >= 0.0f) {
            this.zzg = f10;
            return this;
        }
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("invalid displacement: ");
        sb2.append(f10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public LocationRequest setWaitForAccurateLocation(boolean z10) {
        this.zzi = z10;
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Request[");
        int i10 = this.zza;
        sb2.append(i10 != 100 ? i10 != 102 ? i10 != 104 ? i10 != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.zza != 105) {
            sb2.append(" requested=");
            sb2.append(this.zzb);
            sb2.append("ms");
        }
        sb2.append(" fastest=");
        sb2.append(this.zzc);
        sb2.append("ms");
        if (this.zzh > this.zzb) {
            sb2.append(" maxWait=");
            sb2.append(this.zzh);
            sb2.append("ms");
        }
        if (this.zzg > 0.0f) {
            sb2.append(" smallestDisplacement=");
            sb2.append(this.zzg);
            sb2.append("m");
        }
        long j10 = this.zze;
        if (j10 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j10 - jElapsedRealtime);
            sb2.append("ms");
        }
        if (this.zzf != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(this.zzf);
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeLong(parcel, 5, this.zze);
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeFloat(parcel, 7, this.zzg);
        SafeParcelWriter.writeLong(parcel, 8, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public LocationRequest(int i10, long j10, long j11, boolean z10, long j12, int i11, float f10, long j13, boolean z11) {
        this.zza = i10;
        this.zzb = j10;
        this.zzc = j11;
        this.zzd = z10;
        this.zze = j12;
        this.zzf = i11;
        this.zzg = f10;
        this.zzh = j13;
        this.zzi = z11;
    }
}
