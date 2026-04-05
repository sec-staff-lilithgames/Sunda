package com.fyber.inneractive.sdk.player.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements Comparator, Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final c[] f24637a;

    /* renamed from: b, reason: collision with root package name */
    public int f24638b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24639c;

    public d(boolean z10, c... cVarArr) {
        cVarArr = z10 ? (c[]) cVarArr.clone() : cVarArr;
        Arrays.sort(cVarArr, this);
        for (int i10 = 1; i10 < cVarArr.length; i10++) {
            if (cVarArr[i10 - 1].f24633b.equals(cVarArr[i10].f24633b)) {
                throw new IllegalArgumentException("Duplicate data for uuid: " + cVarArr[i10].f24633b);
            }
        }
        this.f24637a = cVarArr;
        this.f24639c = cVarArr.length;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        c cVar = (c) obj;
        c cVar2 = (c) obj2;
        UUID uuid = com.fyber.inneractive.sdk.player.exoplayer2.b.f24612b;
        return uuid.equals(cVar.f24633b) ? uuid.equals(cVar2.f24633b) ? 0 : 1 : cVar.f24633b.compareTo(cVar2.f24633b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f24637a, ((d) obj).f24637a);
    }

    public final int hashCode() {
        if (this.f24638b == 0) {
            this.f24638b = Arrays.hashCode(this.f24637a);
        }
        return this.f24638b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedArray(this.f24637a, 0);
    }

    public d(Parcel parcel) {
        c[] cVarArr = (c[]) parcel.createTypedArray(c.CREATOR);
        this.f24637a = cVarArr;
        this.f24639c = cVarArr.length;
    }
}
