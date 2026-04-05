package com.facebook.ads.androidx.media3.extractor.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.redexgen.core.AbstractC09264a;
import com.facebook.ads.redexgen.core.C2614or;
import com.facebook.ads.redexgen.core.C2D;
import com.facebook.ads.redexgen.core.HN;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: assets/audience_network.dex */
public final class EventMessage implements Metadata.Entry {
    public static byte[] A06;
    public static final C2614or A07;
    public static final C2614or A08;
    public static final Parcelable.Creator<EventMessage> CREATOR;
    public int A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final byte[] A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{35, 47, 107, 122, 125, 110, 123, 102, 96, 97, 66, 124, 50, 6, 10, 67, 78, 23, 7, 11, 93, 74, 71, 94, 78, 22, 119, AbstractJsonLexerKt.TC_INVALID, 97, 117, 8, 18, 65, 81, 90, 87, 95, 87, 15, 56, 41, 41, 53, 48, 58, 56, 45, 48, 54, 55, 118, 48, 61, 106, 101, 116, 116, 104, 109, 103, 101, 112, 109, 107, 106, 43, 124, 41, 119, 103, 112, 97, 55, 49, 35, Utf8.REPLACEMENT_BYTE, Utf8.REPLACEMENT_BYTE, 59, 56, 113, 100, 100, 42, 36, 38, 46, 47, 34, 42, 101, 36, 57, 44, 100, 46, 38, 56, 44, 100, 2, 15, 120, 99, AbstractJsonLexerKt.TC_INVALID, AbstractJsonLexerKt.TC_INVALID, 123, 120, 49, 36, 36, 111, 110, 125, 110, 103, 100, 123, 110, 121, 37, 106, 123, 123, 103, 110, 37, 104, 100, 102, 36, 120, AbstractJsonLexerKt.TC_INVALID, 121, 110, 106, 102, 98, 101, 108, 36, 110, 102, 120, 108, 38, 98, 111, 56, 75, 76, 80, 4, 77, 93, 74, 91, 4, 77, 93, 74, 91, 13, 11, 4, 12, 14, 15, 10, 4, 92, 87, 80};
    }

    static {
        A01();
        A07 = new C2D().A11(A00(39, 15, 32)).A14();
        A08 = new C2D().A11(A00(54, 20, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE)).A14();
        CREATOR = new HN();
    }

    public EventMessage(Parcel parcel) {
        this.A03 = (String) AbstractC09264a.A0f(parcel.readString());
        this.A04 = (String) AbstractC09264a.A0f(parcel.readString());
        this.A01 = parcel.readLong();
        this.A02 = parcel.readLong();
        this.A05 = (byte[]) AbstractC09264a.A0f(parcel.createByteArray());
    }

    public EventMessage(String str, String str2, long j10, long j11, byte[] bArr) {
        this.A03 = str;
        this.A04 = str2;
        this.A01 = j10;
        this.A02 = j11;
        this.A05 = bArr;
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final byte[] A9S() {
        if (A9T() != null) {
            return this.A05;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0009  */
    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.core.C2614or A9T() {
        /*
            r4 = this;
            java.lang.String r3 = r4.A03
            int r0 = r3.hashCode()
            switch(r0) {
                case -1468477611: goto L33;
                case -795945609: goto L21;
                case 1303648457: goto Lf;
                default: goto L9;
            }
        L9:
            r0 = -1
        La:
            switch(r0) {
                case 0: goto L48;
                case 1: goto L48;
                case 2: goto L45;
                default: goto Ld;
            }
        Ld:
            r0 = 0
            return r0
        Lf:
            r2 = 102(0x66, float:1.43E-43)
            r1 = 46
            r0 = 114(0x72, float:1.6E-43)
            java.lang.String r0 = A00(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L9
            r0 = 1
            goto La
        L21:
            r2 = 74
            r1 = 28
            r0 = 50
            java.lang.String r0 = A00(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L9
            r0 = 0
            goto La
        L33:
            r2 = 148(0x94, float:2.07E-43)
            r1 = 24
            r0 = 71
            java.lang.String r0 = A00(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L9
            r0 = 2
            goto La
        L45:
            com.facebook.ads.redexgen.X.or r0 = com.facebook.ads.androidx.media3.extractor.metadata.emsg.EventMessage.A08
            return r0
        L48:
            com.facebook.ads.redexgen.X.or r0 = com.facebook.ads.androidx.media3.extractor.metadata.emsg.EventMessage.A07
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.androidx.media3.extractor.metadata.emsg.EventMessage.A9T():com.facebook.ads.redexgen.X.or");
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
        EventMessage eventMessage = (EventMessage) obj;
        if (this.A01 == eventMessage.A01 && this.A02 == eventMessage.A02 && AbstractC09264a.A1E(this.A03, eventMessage.A03) && AbstractC09264a.A1E(this.A04, eventMessage.A04) && Arrays.equals(this.A05, eventMessage.A05)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int i10 = 17 * 31;
            int result = this.A03 != null ? this.A03.hashCode() : 0;
            int iHashCode = (((i10 + result) * 31) + (this.A04 != null ? this.A04.hashCode() : 0)) * 31;
            int result2 = (int) (this.A01 ^ (this.A01 >>> 32));
            int result3 = (((iHashCode + result2) * 31) + ((int) (this.A02 ^ (this.A02 >>> 32)))) * 31;
            int result4 = Arrays.hashCode(this.A05);
            this.A00 = result3 + result4;
        }
        return this.A00;
    }

    public final String toString() {
        return A00(26, 13, 75) + this.A03 + A00(13, 5, 83) + this.A02 + A00(0, 13, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE) + this.A01 + A00(18, 8, 82) + this.A04;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A02);
        parcel.writeByteArray(this.A05);
    }
}
