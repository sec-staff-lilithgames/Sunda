package com.facebook.ads.androidx.media3.common;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.androidx.media3.common.ColorInfo;
import com.facebook.ads.redexgen.core.AbstractC09264a;
import com.facebook.ads.redexgen.core.C08741y;
import com.facebook.ads.redexgen.core.C1R;
import com.facebook.ads.redexgen.core.C1S;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: assets/audience_network.dex */
public final class ColorInfo implements C1S, Parcelable {
    public static byte[] A05;
    public static String[] A06 = {"fwssHt7wmjS4irtBHVgHRy1kfHVI1fy3", "Eontljbnef3w1ZNyXpqY7w", "WqOEcdnYiI", "OC7aOsM7dG7kZGpbfVwzqO", "jKxxMaD7lr6ZikoqJ8VvarFUhz7fi6dh", "IxIxrmcLCYn92mmubnPuZ", "k8ZHYUrndjPkyYjbitUMWCOJyy2ruKg", "BYcVzsGm3P4KW5EWFDHzj0wXk7JiqRGv"};
    public static final Parcelable.Creator<ColorInfo> A07;
    public static final C1R<ColorInfo> A08;
    public static final ColorInfo A09;
    public static final ColorInfo A0A;
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final byte[] A04;

    public static String A07(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A06[7].charAt(5) != 's') {
                throw new RuntimeException();
            }
            A06[2] = "3J0fS2w4pJ";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            byte b10 = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 90);
            if (A06[2].length() != 10) {
                A06[4] = "NZQ27YGgzUvTQnYJbnO7KrKPnOKajcu0";
                bArrCopyOfRange[i13] = b10;
                i13 += 0;
            } else {
                String[] strArr = A06;
                strArr[3] = "apS4Da1AN2CX9NcLFevAWz";
                strArr[1] = "J8xda0JkxA2JO9OskXZrhx";
                bArrCopyOfRange[i13] = b10;
                i13++;
            }
        }
    }

    public static void A08() {
        A05 = new byte[]{49, 97, 109, 59, 45, 75, 73, 75, 73, 59, 45, 79, 73, 72, 62, 40, 75, 76, 69, 32, 12, 15, 12, 17, 42, 13, 5, 12, 75, 13, 62, 39, 39, 107, 57, 42, 37, 44, 46, 71, 97, 109, 109, 97, 32, 50, 46, 50, 42, 46, 37, 122, 95, 91, 95, 66, 83, 82, 22, 68, 87, 88, 81, 83, 92, 121, 126, 117, 113, 98, 83, 68, 82, 32, 83, 77, 80, 84, 69, 32, 49, 55, 48, 77, 39, 32, 70, 68, 76, 64, 84, 36, 37, 74, 113, 123, 122, 121, 118, 113, 122, 123, Utf8.REPLACEMENT_BYTE, 124, 112, 115, 112, 109, Utf8.REPLACEMENT_BYTE, 109, 126, 113, 120, 122, 121, 66, 72, 73, 74, 69, 66, 73, 72, 12, 79, 67, 64, 67, 94, 12, 95, 92, 77, 79, 73, 47, 20, 30, 31, 28, 19, 20, 31, 30, 90, 25, 21, 22, 21, 8, 90, 14, 8, 27, 20, 9, 28, 31, 8, 9, 50, 47, 57, 40, 124, Utf8.REPLACEMENT_BYTE, 51, 48, 51, 46, 124, 46, 61, 50, 59, 57, 90, 97, 124, 106, 123, 47, 108, 96, 99, 96, 125, 47, 124, AbstractJsonLexerKt.TC_INVALID, 110, 108, 106, 58, 1, 28, 10, 27, 79, 12, 0, 3, 0, 29, 79, 27, 29, 14, 1, 28, 9, 10, 29, 1, 32, 53, 48};
    }

    static {
        A08();
        A09 = new ColorInfo(1, 2, 3, null);
        A0A = new C08741y().A01(1).A00(1).A02(2).A03();
        A07 = new Parcelable.Creator<ColorInfo>() { // from class: com.facebook.ads.redexgen.X.1x
            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final ColorInfo createFromParcel(Parcel parcel) {
                return new ColorInfo(parcel);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* renamed from: A01, reason: merged with bridge method [inline-methods] */
            public final ColorInfo[] newArray(int i10) {
                return new ColorInfo[i10];
            }
        };
        A08 = new C1R() { // from class: com.facebook.ads.redexgen.X.ow
            @Override // com.facebook.ads.redexgen.core.C1R
            public final C1S A6X(Bundle bundle) {
                return ColorInfo.A02(bundle);
            }
        };
    }

    public ColorInfo(int i10, int i11, int i12, byte[] bArr) {
        this.A02 = i10;
        this.A01 = i11;
        this.A03 = i12;
        this.A04 = bArr;
    }

    public ColorInfo(Parcel parcel) {
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A03 = parcel.readInt();
        boolean hasHdrStaticInfo = AbstractC09264a.A1C(parcel);
        this.A04 = hasHdrStaticInfo ? parcel.createByteArray() : null;
    }

    @Pure
    public static int A00(int i10) {
        switch (i10) {
            case 1:
                return 1;
            case 2:
            case 3:
            case 8:
            default:
                return -1;
            case 4:
            case 5:
            case 6:
            case 7:
                return 2;
            case 9:
                return 6;
        }
    }

    @Pure
    public static int A01(int i10) {
        switch (i10) {
            case 1:
            case 6:
            case 7:
                return 3;
            case 4:
                return 10;
            case 13:
                String[] strArr = A06;
                if (strArr[3].length() != strArr[1].length()) {
                    throw new RuntimeException();
                }
                A06[4] = "iITQwSOY6G69yL4zBCgmbr9Ezk0yNeSE";
                return 2;
            case 16:
                return 6;
            case 18:
                return 7;
            default:
                return -1;
        }
    }

    public static /* synthetic */ ColorInfo A02(Bundle bundle) {
        return new ColorInfo(bundle.getInt(A06(0), -1), bundle.getInt(A06(1), -1), bundle.getInt(A06(2), -1), bundle.getByteArray(A06(3)));
    }

    public static String A03(int i10) {
        switch (i10) {
            case -1:
                return A07(159, 17, 6);
            case 0:
            default:
                if (A06[7].charAt(5) != 's') {
                    throw new RuntimeException();
                }
                String[] strArr = A06;
                strArr[6] = "vjIO54OW5kLbXJOIktKSO2lZwe9uVoS";
                strArr[5] = "lPZMw6sIoJTf8tamb5XBd";
                return A07(93, 21, 69);
            case 1:
                return A07(29, 10, 17);
            case 2:
                return A07(51, 13, 108);
        }
    }

    public static String A04(int i10) {
        switch (i10) {
            case -1:
                return A07(176, 17, 85);
            case 0:
            case 3:
            case 4:
            case 5:
            default:
                return A07(114, 21, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
            case 1:
                return A07(14, 5, 38);
            case 2:
                return A07(9, 5, 35);
            case 6:
                return A07(3, 6, 35);
        }
    }

    public static String A05(int i10) {
        switch (i10) {
            case -1:
                return A07(193, 20, 53);
            case 0:
            case 4:
            case 5:
            case 8:
            case 9:
            default:
                return A07(135, 24, 32);
            case 1:
                return A07(64, 6, 74);
            case 2:
                if (A06[4].charAt(21) != 'r') {
                    throw new RuntimeException();
                }
                String[] strArr = A06;
                strArr[6] = "Bpd0ZivgAzgpSLL99gZnlOGn3AZ7ySo";
                strArr[5] = "Ie1ERw9CGiz8VQ2Le8mIF";
                return A07(Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 4, 40);
            case 3:
                return A07(70, 14, 90);
            case 6:
                return A07(84, 9, 46);
            case 7:
                return A07(48, 3, 56);
            case 10:
                return A07(39, 9, 90);
        }
    }

    public static String A06(int i10) {
        return Integer.toString(i10, 36);
    }

    public static boolean A09(ColorInfo colorInfo) {
        return colorInfo != null && (colorInfo.A03 == 7 || colorInfo.A03 == 6);
    }

    public final C08741y A0A() {
        return new C08741y(this);
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
        ColorInfo colorInfo = (ColorInfo) obj;
        if (this.A02 == colorInfo.A02 && this.A01 == colorInfo.A01 && this.A03 == colorInfo.A03 && Arrays.equals(this.A04, colorInfo.A04)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int result = this.A02;
            int result2 = ((((17 * 31) + result) * 31) + this.A01) * 31;
            int result3 = this.A03;
            this.A00 = ((result2 + result3) * 31) + Arrays.hashCode(this.A04);
        }
        int result4 = this.A00;
        return result4;
    }

    public final String toString() {
        StringBuilder sbAppend = new StringBuilder().append(A07(19, 10, 57)).append(A04(this.A02));
        String strA07 = A07(1, 2, 23);
        return sbAppend.append(strA07).append(A03(this.A01)).append(strA07).append(A05(this.A03)).append(strA07).append(this.A04 != null).append(A07(0, 1, 66)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        AbstractC09264a.A0w(parcel, this.A04 != null);
        if (this.A04 != null) {
            parcel.writeByteArray(this.A04);
        }
    }
}
