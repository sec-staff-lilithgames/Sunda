package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.ironsource.C3191e4;
import java.util.Comparator;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class DetectedActivity extends AbstractSafeParcelable {
    public static final int IN_VEHICLE = 0;
    public static final int ON_BICYCLE = 1;
    public static final int ON_FOOT = 2;
    public static final int RUNNING = 8;
    public static final int STILL = 3;
    public static final int TILTING = 5;
    public static final int UNKNOWN = 4;
    public static final int WALKING = 7;
    int zzb;
    int zzc;
    public static final Comparator<DetectedActivity> zza = new zzq();
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new zzr();

    public DetectedActivity(int i10, int i11) {
        this.zzb = i10;
        this.zzc = i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DetectedActivity) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            if (this.zzb == detectedActivity.zzb && this.zzc == detectedActivity.zzc) {
                return true;
            }
        }
        return false;
    }

    public int getConfidence() {
        return this.zzc;
    }

    public int getType() {
        int i10 = this.zzb;
        if (i10 > 22 || i10 < 0) {
            return 4;
        }
        return i10;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    public String toString() {
        int type = getType();
        String string = type != 0 ? type != 1 ? type != 2 ? type != 3 ? type != 4 ? type != 5 ? type != 7 ? type != 8 ? type != 16 ? type != 17 ? Integer.toString(type) : "IN_RAIL_VEHICLE" : "IN_ROAD_VEHICLE" : DebugCoroutineInfoImplKt.RUNNING : "WALKING" : "TILTING" : "UNKNOWN" : "STILL" : "ON_FOOT" : "ON_BICYCLE" : "IN_VEHICLE";
        int i10 = this.zzc;
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 48);
        sb2.append("DetectedActivity [type=");
        sb2.append(string);
        sb2.append(", confidence=");
        sb2.append(i10);
        sb2.append(C3191e4.i.f36531e);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzb);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
