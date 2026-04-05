package com.facebook.ads.androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.AbstractC09264a;
import com.facebook.ads.redexgen.core.C1252He;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: assets/audience_network.dex */
public final class InternalFrame extends Id3Frame {
    public static byte[] A03;
    public static String[] A04 = {"bh5qox0UH", "89qWhU54NayHc8fpkuIC", "mxiDDsG8W", "MZNrWcAF8nDVd0pvETTqmBiIClJ2tebz", "S0BNh2MYPMBLZaGUzictbU3", "akavPcpCZaXV4BCg0NoMCSRp4weYG0Nb", "IjvMVSLxmO4DFFxW0QpqXFC26", "ljqIR0LyySHMAW8jRLUwJIZQ0It"};
    public static final Parcelable.Creator<InternalFrame> CREATOR;
    public final String A00;
    public final String A01;
    public final String A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{33, 45, 105, 104, 126, 110, AbstractJsonLexerKt.TC_INVALID, 100, 125, 121, 100, 98, 99, 48, 75, 75, 75, 75, 95, 69, 1, 10, 8, 4, 12, 11, 88};
    }

    static {
        A01();
        CREATOR = new C1252He();
    }

    public InternalFrame(Parcel parcel) {
        super(A00(14, 4, 110));
        this.A01 = (String) AbstractC09264a.A0f(parcel.readString());
        this.A00 = (String) AbstractC09264a.A0f(parcel.readString());
        this.A02 = (String) AbstractC09264a.A0f(parcel.readString());
    }

    public InternalFrame(String str, String str2, String str3) {
        super(A00(14, 4, 110));
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            if (A04[7].length() == 15) {
                throw new RuntimeException();
            }
            A04[6] = "zohAyU4uyJRKihpCm3V8eg4UF";
            if (cls == obj.getClass()) {
                InternalFrame internalFrame = (InternalFrame) obj;
                if (AbstractC09264a.A1E(this.A00, internalFrame.A00) && AbstractC09264a.A1E(this.A01, internalFrame.A01) && AbstractC09264a.A1E(this.A02, internalFrame.A02)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result;
        int i10 = 17 * 31;
        if (this.A01 != null) {
            String str = this.A01;
            String[] strArr = A04;
            String str2 = strArr[3];
            String str3 = strArr[5];
            int iCharAt = str2.charAt(11);
            int result2 = str3.charAt(11);
            if (iCharAt != result2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[2] = "spAelKLfI";
            strArr2[0] = "W2t9hTJyD";
            result = str.hashCode();
        } else {
            result = 0;
        }
        return ((((i10 + result) * 31) + (this.A00 != null ? this.A00.hashCode() : 0)) * 31) + (this.A02 != null ? this.A02.hashCode() : 0);
    }

    @Override // com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return super.A00 + A00(18, 9, 109) + this.A01 + A00(0, 14, 5) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
