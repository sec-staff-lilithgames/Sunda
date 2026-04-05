package com.facebook.ads.androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.common.StreamKey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static byte[] A04;
    public static String[] A05 = {"dWL5NZus448HlVN1g2vI4u5EATU39hAo", "Ig00thAwydWR5sbVXvrRGjlFjIN2O8J7", "jkNUubNrA3kuMGxf9Z6EfVeaas9OM69U", "EYKJogzwz3XUzBJ6M5pIp4", "kAMXbaxHTcvtkNk6pT6NuIpsMq0wtAm5", "DETMEqXpM2RL9RfuWccguPA2eDkJCyIw", "l4lmv0vVbQT1UVlO08Ifu3RnFv4eezi8", "GuIdMvOGKOFBnnXM1bTmuQpg4J0thJGn"};
    public static final Parcelable.Creator<StreamKey> CREATOR;
    public final int A00;
    public final int A01;
    public final int A02;

    @Deprecated
    public final int A03;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{102};
    }

    static {
        A02();
        CREATOR = new Parcelable.Creator<StreamKey>() { // from class: com.facebook.ads.redexgen.X.33
            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final StreamKey createFromParcel(Parcel parcel) {
                return new StreamKey(parcel);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* renamed from: A01, reason: merged with bridge method [inline-methods] */
            public final StreamKey[] newArray(int i10) {
                return new StreamKey[i10];
            }
        };
    }

    public StreamKey(int i10, int i11, int i12) {
        this.A01 = i10;
        this.A00 = i11;
        this.A02 = i12;
        this.A03 = i12;
    }

    public StreamKey(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A03 = this.A02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(StreamKey streamKey) {
        int i10 = this.A01 - streamKey.A01;
        if (i10 == 0) {
            int i11 = this.A00;
            int result = streamKey.A00;
            int i12 = i11 - result;
            if (A05[3].length() == 16) {
                throw new RuntimeException();
            }
            A05[4] = "BMcfT7wTTEuICUupPfiGugxRU9d1aBTy";
            if (i12 == 0) {
                int i13 = this.A02;
                int result2 = streamKey.A02;
                return i13 - result2;
            }
            return i12;
        }
        return i10;
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
        StreamKey streamKey = (StreamKey) obj;
        return this.A01 == streamKey.A01 && this.A00 == streamKey.A00 && this.A02 == streamKey.A02;
    }

    public final int hashCode() {
        int result = this.A01;
        int i10 = result * 31;
        int result2 = this.A00;
        return ((i10 + result2) * 31) + this.A02;
    }

    public final String toString() {
        StringBuilder sbAppend = new StringBuilder().append(this.A01);
        String strA01 = A01(0, 1, 6);
        return sbAppend.append(strA01).append(this.A00).append(strA01).append(this.A02).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
    }
}
