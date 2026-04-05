package io.bidmachine.media3.exoplayer.scheduler;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f61546b;

    public Requirements(int i10) {
        this.f61546b = (i10 & 2) != 0 ? i10 | 1 : i10;
    }

    public boolean checkRequirements(Context context) {
        return getNotMetRequirements(context) == 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Requirements.class == obj.getClass()) {
            if (this.f61546b == ((Requirements) obj).f61546b) {
                return true;
            }
        }
        return false;
    }

    public Requirements filterRequirements(int i10) {
        int i11 = this.f61546b;
        int i12 = i10 & i11;
        return i12 == i11 ? this : new Requirements(i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0008  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getNotMetRequirements(android.content.Context r8) {
        /*
            r7 = this;
            boolean r0 = r7.isNetworkRequired()
            r1 = 2
            r2 = 0
            if (r0 != 0) goto La
        L8:
            r0 = r2
            goto L50
        La:
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r8.getSystemService(r0)
            java.lang.Object r0 = io.bidmachine.media3.common.util.a.checkNotNull(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r3 = r0.getActiveNetworkInfo()
            if (r3 == 0) goto L4c
            boolean r3 = r3.isConnected()
            if (r3 == 0) goto L4c
            int r3 = io.bidmachine.media3.common.util.a1.f60679a
            r4 = 24
            if (r3 >= r4) goto L29
            goto L3e
        L29:
            android.net.Network r3 = r0.getActiveNetwork()
            if (r3 != 0) goto L30
            goto L4c
        L30:
            android.net.NetworkCapabilities r3 = r0.getNetworkCapabilities(r3)     // Catch: java.lang.SecurityException -> L3e
            if (r3 == 0) goto L4c
            r4 = 16
            boolean r3 = r3.hasCapability(r4)     // Catch: java.lang.SecurityException -> L3e
            if (r3 == 0) goto L4c
        L3e:
            boolean r3 = r7.isUnmeteredNetworkRequired()
            if (r3 == 0) goto L8
            boolean r0 = r0.isActiveNetworkMetered()
            if (r0 == 0) goto L8
            r0 = r1
            goto L50
        L4c:
            int r0 = r7.f61546b
            r0 = r0 & 3
        L50:
            boolean r3 = r7.isChargingRequired()
            r4 = 0
            if (r3 == 0) goto L74
            android.content.IntentFilter r3 = new android.content.IntentFilter
            java.lang.String r5 = "android.intent.action.BATTERY_CHANGED"
            r3.<init>(r5)
            android.content.Intent r3 = r8.registerReceiver(r4, r3)
            if (r3 != 0) goto L65
            goto L72
        L65:
            java.lang.String r5 = "status"
            r6 = -1
            int r3 = r3.getIntExtra(r5, r6)
            if (r3 == r1) goto L74
            r1 = 5
            if (r3 != r1) goto L72
            goto L74
        L72:
            r0 = r0 | 8
        L74:
            boolean r1 = r7.isIdleRequired()
            r3 = 1
            if (r1 == 0) goto L9f
            java.lang.String r1 = "power"
            java.lang.Object r1 = r8.getSystemService(r1)
            java.lang.Object r1 = io.bidmachine.media3.common.util.a.checkNotNull(r1)
            android.os.PowerManager r1 = (android.os.PowerManager) r1
            int r5 = io.bidmachine.media3.common.util.a1.f60679a
            r6 = 23
            if (r5 < r6) goto L92
            boolean r1 = r1.isDeviceIdleMode()
            goto L9b
        L92:
            boolean r1 = r1.isInteractive()
            if (r1 != 0) goto L9a
            r1 = r3
            goto L9b
        L9a:
            r1 = r2
        L9b:
            if (r1 != 0) goto L9f
            r0 = r0 | 4
        L9f:
            boolean r1 = r7.isStorageNotLowRequired()
            if (r1 == 0) goto Lb7
            android.content.IntentFilter r1 = new android.content.IntentFilter
            java.lang.String r5 = "android.intent.action.DEVICE_STORAGE_LOW"
            r1.<init>(r5)
            android.content.Intent r8 = r8.registerReceiver(r4, r1)
            if (r8 != 0) goto Lb3
            r2 = r3
        Lb3:
            if (r2 != 0) goto Lb7
            r0 = r0 | 16
        Lb7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.scheduler.Requirements.getNotMetRequirements(android.content.Context):int");
    }

    public int getRequirements() {
        return this.f61546b;
    }

    public int hashCode() {
        return this.f61546b;
    }

    public boolean isChargingRequired() {
        return (this.f61546b & 8) != 0;
    }

    public boolean isIdleRequired() {
        return (this.f61546b & 4) != 0;
    }

    public boolean isNetworkRequired() {
        return (this.f61546b & 1) != 0;
    }

    public boolean isStorageNotLowRequired() {
        return (this.f61546b & 16) != 0;
    }

    public boolean isUnmeteredNetworkRequired() {
        return (this.f61546b & 2) != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f61546b);
    }
}
