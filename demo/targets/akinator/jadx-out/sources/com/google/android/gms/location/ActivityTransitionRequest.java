package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.internal.play_billing.a;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new zzo();
    public static final Comparator<ActivityTransition> IS_SAME_TRANSITION = new zzn();
    private final List<ActivityTransition> zza;
    private final String zzb;
    private final List<ClientIdentity> zzc;
    private String zzd;

    public ActivityTransitionRequest(List<ActivityTransition> list) {
        this(list, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            if (Objects.equal(this.zza, activityTransitionRequest.zza) && Objects.equal(this.zzb, activityTransitionRequest.zzb) && Objects.equal(this.zzd, activityTransitionRequest.zzd) && Objects.equal(this.zzc, activityTransitionRequest.zzc)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.zza.hashCode() * 31;
        String str = this.zzb;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<ClientIdentity> list = this.zzc;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.zzd;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public void serializeToIntentExtra(Intent intent) {
        Preconditions.checkNotNull(intent);
        SafeParcelableSerializer.serializeToIntentExtra(this, intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST");
    }

    public String toString() {
        String strValueOf = String.valueOf(this.zza);
        String str = this.zzb;
        String strValueOf2 = String.valueOf(this.zzc);
        String str2 = this.zzd;
        int length = strValueOf.length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 79 + length2 + strValueOf2.length() + String.valueOf(str2).length());
        a.B(sb2, "ActivityTransitionRequest [mTransitions=", strValueOf, ", mTag='", str);
        a.B(sb2, "', mClients=", strValueOf2, ", mAttributionTag=", str2);
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final ActivityTransitionRequest zza(String str) {
        this.zzd = str;
        return this;
    }

    public ActivityTransitionRequest(List<ActivityTransition> list, String str, List<ClientIdentity> list2, String str2) {
        Preconditions.checkNotNull(list, "transitions can't be null");
        Preconditions.checkArgument(list.size() > 0, "transitions can't be empty.");
        Preconditions.checkNotNull(list);
        TreeSet treeSet = new TreeSet(IS_SAME_TRANSITION);
        for (ActivityTransition activityTransition : list) {
            Preconditions.checkArgument(treeSet.add(activityTransition), String.format("Found duplicated transition: %s.", activityTransition));
        }
        this.zza = Collections.unmodifiableList(list);
        this.zzb = str;
        this.zzc = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.zzd = str2;
    }
}
