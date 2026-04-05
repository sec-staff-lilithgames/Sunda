package com.facebook.ads.androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.redexgen.core.AbstractC08782c;
import com.facebook.ads.redexgen.core.C2614or;
import com.facebook.ads.redexgen.core.C3M;
import com.facebook.ads.redexgen.core.HU;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class IcyInfo implements Metadata.Entry {
    public static byte[] A03;
    public static String[] A04 = {"nnP96OK6t36Mr", "fp9gNvfCMNXuQgLWlYB5lEjFUO4QWdNh", "hZObmpkmCubUhQPk0sNPC7HLyRXYLs4E", "Wb5maXdS5cbTZNKyQcb5C4QnLONrxe0h", "nHFX7Df", "5CI6e8SpgqKAx4NAP8Yv6TwtqqCApbcl", "OJNC", "2nin"};
    public static final Parcelable.Creator<IcyInfo> CREATOR;
    public final String A00;
    public final String A01;
    public final byte[] A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A04;
            if (strArr[7].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[3] = "qKUW1KH6CuSTGDfvrO6Qdp683VdyVHth";
            strArr2[1] = "LPZYmu17yBTH9DPNueNU7kcuuOoRtJJh";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 30);
            i13++;
        }
    }

    public static void A01() {
        A03 = new byte[]{-128, 122, -112, 113, 87, -85, -96, -85, -93, -100, 116, 89, 92, -86, 89, 99, 87, -84, -87, -93, 116, 89, 92, -86, 89, 99, 87, -87, -104, -82, -124, -100, -85, -104, -101, -104, -85, -104, 101, -93, -100, -91, -98, -85, -97, 116, 89, 92, -86, 89};
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] A9S() {
        return AbstractC08782c.A01(this);
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ C2614or A9T() {
        return AbstractC08782c.A00(this);
    }

    static {
        A01();
        CREATOR = new HU();
    }

    public IcyInfo(Parcel parcel) {
        this.A02 = (byte[]) C3M.A01(parcel.createByteArray());
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public IcyInfo(byte[] bArr, String str, String str2) {
        this.A02 = bArr;
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A02, ((IcyInfo) obj).A02);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A02);
    }

    public final String toString() {
        return String.format(A00(0, 50, 25), this.A00, this.A01, Integer.valueOf(this.A02.length));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
