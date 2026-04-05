package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class VersionInfoParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VersionInfoParcel> CREATOR = new zzy();
    public String afmaVersion;
    public int buddyApkVersion;
    public int clientJarVersion;
    public boolean isClientJar;
    public boolean isLiteSdk;

    public VersionInfoParcel(int i10, int i11, boolean z10) {
        this(i10, i11, z10, false, false);
    }

    public static VersionInfoParcel forPackage() {
        return new VersionInfoParcel(12451000, 12451000, true);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.afmaVersion, false);
        SafeParcelWriter.writeInt(parcel, 3, this.buddyApkVersion);
        SafeParcelWriter.writeInt(parcel, 4, this.clientJarVersion);
        SafeParcelWriter.writeBoolean(parcel, 5, this.isClientJar);
        SafeParcelWriter.writeBoolean(parcel, 6, this.isLiteSdk);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public VersionInfoParcel(int i10, int i11, boolean z10, boolean z11) {
        this(i10, i11, z10, false, z11);
    }

    public VersionInfoParcel(int i10, int i11, boolean z10, boolean z11, boolean z12) {
        String str;
        if (z10) {
            str = "0";
        } else {
            str = z11 ? "2" : "1";
        }
        int length = String.valueOf(i10).length();
        StringBuilder sb2 = new StringBuilder(str.length() + String.valueOf(i11).length() + length + 13 + 1);
        a.o(i10, i11, "afma-sdk-a-v", ".", sb2);
        this(o2.o(sb2, ".", str), i10, i11, z10, z12);
    }

    public VersionInfoParcel(String str, int i10, int i11, boolean z10, boolean z11) {
        this.afmaVersion = str;
        this.buddyApkVersion = i10;
        this.clientJarVersion = i11;
        this.isClientJar = z10;
        this.isLiteSdk = z11;
    }
}
