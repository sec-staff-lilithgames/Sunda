package com.facebook.ads.androidx.media3.exoplayer.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.common.StreamKey;
import com.facebook.ads.redexgen.core.AbstractC09264a;
import com.facebook.ads.redexgen.core.BV;
import com.facebook.ads.redexgen.core.C3M;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class DownloadRequest implements Parcelable {
    public static byte[] A07;
    public static final Parcelable.Creator<DownloadRequest> CREATOR;
    public final Uri A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List<StreamKey> A04;
    public final byte[] A05;
    public final byte[] A06;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 67);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-37, 36, 54, 52, 53, 48, 46, 4, 34, 36, 41, 38, 12, 38, 58, -31, 46, 54, 52, 53, -31, 35, 38, -31, 47, 54, 45, 45, -31, 39, 48, 51, -31, 53, 58, 49, 38, -5, -31};
    }

    static {
        A01();
        CREATOR = new BV();
    }

    public DownloadRequest(Parcel parcel) {
        this.A02 = (String) AbstractC09264a.A0f(parcel.readString());
        this.A00 = Uri.parse((String) AbstractC09264a.A0f(parcel.readString()));
        this.A03 = parcel.readString();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.A04 = Collections.unmodifiableList(arrayList);
        this.A06 = parcel.createByteArray();
        this.A01 = parcel.readString();
        this.A05 = (byte[]) AbstractC09264a.A0f(parcel.createByteArray());
    }

    public DownloadRequest(String str, Uri uri, String str2, List<StreamKey> list, byte[] bArr, String str3, byte[] bArr2) {
        byte[] bArrCopyOf;
        byte[] bArrCopyOf2;
        int iA0B = AbstractC09264a.A0B(uri, str2);
        if (iA0B == 0 || iA0B == 2 || iA0B == 1) {
            C3M.A09(str3 == null, A00(1, 38, 126) + iA0B);
        }
        this.A02 = str;
        this.A00 = uri;
        this.A03 = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.A04 = Collections.unmodifiableList(arrayList);
        if (bArr != null) {
            int contentType = bArr.length;
            bArrCopyOf = Arrays.copyOf(bArr, contentType);
        } else {
            bArrCopyOf = null;
        }
        this.A06 = bArrCopyOf;
        this.A01 = str3;
        if (bArr2 != null) {
            int contentType2 = bArr2.length;
            bArrCopyOf2 = Arrays.copyOf(bArr2, contentType2);
        } else {
            bArrCopyOf2 = AbstractC09264a.A07;
        }
        this.A05 = bArrCopyOf2;
    }

    public /* synthetic */ DownloadRequest(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2, BV bv2) {
        this(str, uri, str2, list, bArr, str3, bArr2);
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x003f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest A02(com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest r9) {
        /*
            r8 = this;
            java.lang.String r1 = r8.A02
            java.lang.String r0 = r9.A02
            boolean r0 = r1.equals(r0)
            com.facebook.ads.redexgen.core.C3M.A07(r0)
            java.util.List<com.facebook.ads.androidx.media3.common.StreamKey> r0 = r8.A04
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1b
            java.util.List<com.facebook.ads.androidx.media3.common.StreamKey> r0 = r9.A04
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L31
        L1b:
            java.util.List r4 = java.util.Collections.emptyList()
        L1f:
            com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest r0 = new com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest
            java.lang.String r1 = r8.A02
            android.net.Uri r2 = r9.A00
            java.lang.String r3 = r9.A03
            byte[] r5 = r9.A06
            java.lang.String r6 = r9.A01
            byte[] r7 = r9.A05
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        L31:
            java.util.List<com.facebook.ads.androidx.media3.common.StreamKey> r0 = r8.A04
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            r2 = 0
        L39:
            java.util.List<com.facebook.ads.androidx.media3.common.StreamKey> r0 = r9.A04
            int r0 = r0.size()
            if (r2 >= r0) goto L1f
            java.util.List<com.facebook.ads.androidx.media3.common.StreamKey> r0 = r9.A04
            java.lang.Object r1 = r0.get(r2)
            com.facebook.ads.androidx.media3.common.StreamKey r1 = (com.facebook.ads.androidx.media3.common.StreamKey) r1
            boolean r0 = r4.contains(r1)
            if (r0 != 0) goto L52
            r4.add(r1)
        L52:
            int r2 = r2 + 1
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest.A02(com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest):com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.A02.equals(downloadRequest.A02) && this.A00.equals(downloadRequest.A00) && AbstractC09264a.A1E(this.A03, downloadRequest.A03) && this.A04.equals(downloadRequest.A04) && Arrays.equals(this.A06, downloadRequest.A06) && AbstractC09264a.A1E(this.A01, downloadRequest.A01) && Arrays.equals(this.A05, downloadRequest.A05);
    }

    public final int hashCode() {
        int result = this.A02.hashCode() * 31;
        int i10 = result * 31;
        int result2 = this.A00.hashCode();
        int result3 = (i10 + result2) * 31;
        int result4 = this.A03 != null ? this.A03.hashCode() : 0;
        int result5 = (result3 + result4) * 31;
        int result6 = this.A04.hashCode();
        return ((((((result5 + result6) * 31) + Arrays.hashCode(this.A06)) * 31) + (this.A01 != null ? this.A01.hashCode() : 0)) * 31) + Arrays.hashCode(this.A05);
    }

    public final String toString() {
        return this.A03 + A00(0, 1, 94) + this.A02;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0023 */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(android.os.Parcel r4, int r5) {
        /*
            r3 = this;
            java.lang.String r0 = r3.A02
            r4.writeString(r0)
            android.net.Uri r0 = r3.A00
            java.lang.String r0 = r0.toString()
            r4.writeString(r0)
            java.lang.String r0 = r3.A03
            r4.writeString(r0)
            java.util.List<com.facebook.ads.androidx.media3.common.StreamKey> r0 = r3.A04
            int r0 = r0.size()
            r4.writeInt(r0)
            r2 = 0
        L1d:
            java.util.List<com.facebook.ads.androidx.media3.common.StreamKey> r0 = r3.A04
            int r0 = r0.size()
            if (r2 >= r0) goto L34
            java.util.List<com.facebook.ads.androidx.media3.common.StreamKey> r0 = r3.A04
            java.lang.Object r1 = r0.get(r2)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            r0 = 0
            r4.writeParcelable(r1, r0)
            int r2 = r2 + 1
            goto L1d
        L34:
            byte[] r0 = r3.A06
            r4.writeByteArray(r0)
            java.lang.String r0 = r3.A01
            r4.writeString(r0)
            byte[] r0 = r3.A05
            r4.writeByteArray(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest.writeToParcel(android.os.Parcel, int):void");
    }
}
