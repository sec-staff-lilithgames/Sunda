package com.facebook.ads.androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.redexgen.core.AbstractC09264a;
import com.facebook.ads.redexgen.core.HY;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ChapterFrame extends Id3Frame {
    public static byte[] A06;
    public static String[] A07 = {"fLRqmQpZ4kY0i8vTWEGOnpMV91ymSlfn", "8zOo15ITF94z8ATPK9WKDS", "U2m4A5dMOqyxzJZNInAoZQNrCqvEIF5h", "0utQ64kMrCSPNyzTtjtqMzChb3", "CvOd0LhZgWbGMd6rhkG6LB2Ont", "e86XCnP3M0yNUM5RfG9bdJbB6V7ObyMi", "fMKUD6KL8xgqbKtIywVViKyqmpaHvM6m", "cPxhgBJDfYBGNL1SVStSmk4ZWA"};
    public static final Parcelable.Creator<ChapterFrame> CREATOR;
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final String A04;
    public final Id3Frame[] A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{61, 54, Utf8.REPLACEMENT_BYTE, 46};
        String[] strArr = A07;
        if (strArr[0].charAt(9) == strArr[6].charAt(9)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[4] = "THHQSJFvR7rYAiXI8hhxNOhOsk";
        strArr2[7] = "DYa1Z8H6Y5FjGQTiVzX1rEZp9S";
    }

    static {
        A01();
        CREATOR = new HY();
    }

    public ChapterFrame(Parcel parcel) {
        super(A00(0, 4, 29));
        this.A04 = (String) AbstractC09264a.A0f(parcel.readString());
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A03 = parcel.readLong();
        this.A02 = parcel.readLong();
        int i10 = parcel.readInt();
        this.A05 = new Id3Frame[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.A05[i11] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterFrame(String str, int i10, int i11, long j10, long j11, Id3Frame[] id3FrameArr) {
        super(A00(0, 4, 29));
        this.A04 = str;
        this.A01 = i10;
        this.A00 = i11;
        this.A03 = j10;
        this.A02 = j11;
        this.A05 = id3FrameArr;
    }

    @Override // com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r6 = 1
            if (r7 != r8) goto L4
            return r6
        L4:
            r5 = 0
            if (r8 == 0) goto L31
            java.lang.Class r4 = r7.getClass()
            java.lang.Class r3 = r8.getClass()
            java.lang.String[] r2 = com.facebook.ads.androidx.media3.extractor.metadata.id3.ChapterFrame.A07
            r0 = 0
            r1 = r2[r0]
            r0 = 6
            r2 = r2[r0]
            r0 = 9
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L98
            java.lang.String[] r2 = com.facebook.ads.androidx.media3.extractor.metadata.id3.ChapterFrame.A07
            java.lang.String r1 = "s8Y6al5xLmwNCTuxrrlilvhunCZyPKQu"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "F4gClNwWGLEb8yuG5kUUO5qerkap3WyM"
            r0 = 6
            r2[r0] = r1
            if (r4 == r3) goto L32
        L31:
            return r5
        L32:
            com.facebook.ads.androidx.media3.extractor.metadata.id3.ChapterFrame r8 = (com.facebook.ads.androidx.media3.extractor.metadata.id3.ChapterFrame) r8
            int r1 = r7.A01
            int r0 = r8.A01
            if (r1 != r0) goto L96
            int r1 = r7.A00
            int r0 = r8.A00
            if (r1 != r0) goto L96
            long r3 = r7.A03
            java.lang.String[] r2 = com.facebook.ads.androidx.media3.extractor.metadata.id3.ChapterFrame.A07
            r0 = 3
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L83
            java.lang.String[] r2 = com.facebook.ads.androidx.media3.extractor.metadata.id3.ChapterFrame.A07
            java.lang.String r1 = "YA00N3sF1UOtj77WS52yNrONrVf9FOsb"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "phjHurmqkrzRpPO24UEXTTCj8ILagfx7"
            r0 = 6
            r2[r0] = r1
            long r1 = r8.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L96
        L66:
            long r3 = r7.A02
            long r1 = r8.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L96
            java.lang.String r1 = r7.A04
            java.lang.String r0 = r8.A04
            boolean r0 = com.facebook.ads.redexgen.core.AbstractC09264a.A1E(r1, r0)
            if (r0 == 0) goto L96
            com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame[] r1 = r7.A05
            com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame[] r0 = r8.A05
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L96
        L82:
            return r6
        L83:
            java.lang.String[] r2 = com.facebook.ads.androidx.media3.extractor.metadata.id3.ChapterFrame.A07
            java.lang.String r1 = "1cJSCMaKjmRDGa6IqnZMgyepuwbb5Zyk"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "77QMpsyCXr9jCYPeO8IlygJc3WcEupIe"
            r0 = 6
            r2[r0] = r1
            long r1 = r8.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L96
            goto L66
        L96:
            r6 = 0
            goto L82
        L98:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.androidx.media3.extractor.metadata.id3.ChapterFrame.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int result = this.A01;
        int i10 = ((((17 * 31) + result) * 31) + this.A00) * 31;
        int result2 = (int) this.A03;
        int result3 = (((i10 + result2) * 31) + ((int) this.A02)) * 31;
        int result4 = this.A04 != null ? this.A04.hashCode() : 0;
        return result3 + result4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A03);
        parcel.writeLong(this.A02);
        parcel.writeInt(this.A05.length);
        for (Id3Frame id3Frame : this.A05) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }
}
