package xf;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.badge.BadgeState$State;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public BadgeState$State createFromParcel(Parcel parcel) {
        BadgeState$State badgeState$State = new BadgeState$State();
        badgeState$State.f28897k = 255;
        badgeState$State.f28899m = -2;
        badgeState$State.f28900n = -2;
        badgeState$State.f28901o = -2;
        badgeState$State.f28908v = Boolean.TRUE;
        badgeState$State.f28889b = parcel.readInt();
        badgeState$State.f28890c = (Integer) parcel.readSerializable();
        badgeState$State.f28891e = (Integer) parcel.readSerializable();
        badgeState$State.f28892f = (Integer) parcel.readSerializable();
        badgeState$State.f28893g = (Integer) parcel.readSerializable();
        badgeState$State.f28894h = (Integer) parcel.readSerializable();
        badgeState$State.f28895i = (Integer) parcel.readSerializable();
        badgeState$State.f28896j = (Integer) parcel.readSerializable();
        badgeState$State.f28897k = parcel.readInt();
        badgeState$State.f28898l = parcel.readString();
        badgeState$State.f28899m = parcel.readInt();
        badgeState$State.f28900n = parcel.readInt();
        badgeState$State.f28901o = parcel.readInt();
        badgeState$State.f28903q = parcel.readString();
        badgeState$State.f28904r = parcel.readString();
        badgeState$State.f28905s = parcel.readInt();
        badgeState$State.f28907u = (Integer) parcel.readSerializable();
        badgeState$State.f28909w = (Integer) parcel.readSerializable();
        badgeState$State.f28910x = (Integer) parcel.readSerializable();
        badgeState$State.f28911y = (Integer) parcel.readSerializable();
        badgeState$State.f28912z = (Integer) parcel.readSerializable();
        badgeState$State.A = (Integer) parcel.readSerializable();
        badgeState$State.B = (Integer) parcel.readSerializable();
        badgeState$State.E = (Integer) parcel.readSerializable();
        badgeState$State.C = (Integer) parcel.readSerializable();
        badgeState$State.D = (Integer) parcel.readSerializable();
        badgeState$State.f28908v = (Boolean) parcel.readSerializable();
        badgeState$State.f28902p = (Locale) parcel.readSerializable();
        badgeState$State.F = (Boolean) parcel.readSerializable();
        badgeState$State.G = (Integer) parcel.readSerializable();
        return badgeState$State;
    }

    @Override // android.os.Parcelable.Creator
    public BadgeState$State[] newArray(int i10) {
        return new BadgeState$State[i10];
    }
}
