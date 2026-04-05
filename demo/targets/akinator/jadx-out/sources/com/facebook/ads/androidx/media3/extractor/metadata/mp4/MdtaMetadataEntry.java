package com.facebook.ads.androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.redexgen.core.AbstractC08782c;
import com.facebook.ads.redexgen.core.AbstractC09264a;
import com.facebook.ads.redexgen.core.C1258Hk;
import com.facebook.ads.redexgen.core.C2614or;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static byte[] A04;
    public static String[] A05 = {"vi1I9CRdusR9OaQ73IhU0VuYAQE3JPGL", "aaPaOTNU2UwB2EPxZU6V6pdLQfW3q2ZN", "cNMGidnwzPmYHHMcqjEgA9zyn89XSS4i", "P", "P9rZmlchwJyRaPgTXoQm1OTIZlc4jW3D", "Srm5cyc3D2Bvnp8lTnaaETMhNrvRWpkC", "soHBe5cubenrEdU4cSgBG01poHSX3ae1", "VauPfgPsA5JB7q1Lz1RQs26dxgaS0pLj"};
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR;
    public final int A00;
    public final int A01;
    public final String A02;
    public final byte[] A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{7, -2, 14, -5, -44, -70, 5, -1, 19, -41};
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
        CREATOR = new C1258Hk();
    }

    public MdtaMetadataEntry(Parcel parcel) {
        this.A02 = (String) AbstractC09264a.A0f(parcel.readString());
        this.A03 = (byte[]) AbstractC09264a.A0f(parcel.createByteArray());
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public /* synthetic */ MdtaMetadataEntry(Parcel parcel, C1258Hk c1258Hk) {
        this(parcel);
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i10, int i11) {
        this.A02 = str;
        this.A03 = bArr;
        this.A00 = i10;
        this.A01 = i11;
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
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        boolean zEquals = this.A02.equals(mdtaMetadataEntry.A02);
        String[] strArr = A05;
        if (strArr[0].charAt(3) == strArr[7].charAt(3)) {
            throw new RuntimeException();
        }
        A05[4] = "ER0xmSd6UN1zW0bdX1OFC0qdco0m4mUZ";
        if (zEquals && Arrays.equals(this.A03, mdtaMetadataEntry.A03)) {
            int i10 = this.A00;
            int i11 = mdtaMetadataEntry.A00;
            String[] strArr2 = A05;
            if (strArr2[5].charAt(6) == strArr2[2].charAt(6)) {
                throw new RuntimeException();
            }
            A05[1] = "F56Xno7FqUwIc5sxnGwPweIkgWLWP8mz";
            if (i10 == i11 && this.A01 == mdtaMetadataEntry.A01) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A02.hashCode();
        int result2 = ((((17 * 31) + result) * 31) + Arrays.hashCode(this.A03)) * 31;
        int result3 = this.A00;
        return ((result2 + result3) * 31) + this.A01;
    }

    public final String toString() {
        return A00(0, 10, 99) + this.A02;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.A02);
        parcel.writeByteArray(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
