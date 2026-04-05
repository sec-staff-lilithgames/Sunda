package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new zzm();
    private final int zza;
    private final int zzb;
    private final long zzc;

    public ActivityTransitionEvent(int i10, int i11, long j10) {
        ActivityTransition.zza(i11);
        this.zza = i10;
        this.zzb = i11;
        this.zzc = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return this.zza == activityTransitionEvent.zza && this.zzb == activityTransitionEvent.zzb && this.zzc == activityTransitionEvent.zzc;
    }

    public int getActivityType() {
        return this.zza;
    }

    public long getElapsedRealTimeNanos() {
        return this.zzc;
    }

    public int getTransitionType() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Long.valueOf(this.zzc));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.zza;
        StringBuilder sb3 = new StringBuilder(24);
        sb3.append("ActivityType ");
        sb3.append(i10);
        sb2.append(sb3.toString());
        sb2.append(" ");
        int i11 = this.zzb;
        StringBuilder sb4 = new StringBuilder(26);
        sb4.append("TransitionType ");
        sb4.append(i11);
        sb2.append(sb4.toString());
        sb2.append(" ");
        long j10 = this.zzc;
        StringBuilder sb5 = new StringBuilder(41);
        sb5.append("ElapsedRealTimeNanos ");
        sb5.append(j10);
        sb2.append(sb5.toString());
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getActivityType());
        SafeParcelWriter.writeInt(parcel, 2, getTransitionType());
        SafeParcelWriter.writeLong(parcel, 3, getElapsedRealTimeNanos());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
