package com.facebook.ads.androidx.media3.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.redexgen.core.AbstractC08782c;
import com.facebook.ads.redexgen.core.AbstractC09264a;
import com.facebook.ads.redexgen.core.AbstractC2246ia;
import com.facebook.ads.redexgen.core.C2614or;
import com.facebook.ads.redexgen.core.C4J;
import com.facebook.ads.redexgen.core.HQ;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class PictureFrame implements Metadata.Entry {
    public static byte[] A08;
    public static String[] A09 = {"rI5TEheYOJp05VNApergGrEEHCWaES4C", "o6wWfrjUdw4LevlhwfZASZQrY", "UWoyLLtEqu034Q80pJxgHqQ3TFbt", "jnvUxVCjnhOQIYYcwBh2GPR5wbhVDTOy", "29XTtQExfztCGetR3Cqmh5L0E52wuoLu", "Hd1JIMrPWoRu", "ETzUd0wMReQVTdTsGtn8YYwfqZIUbVPg", "sLyN"};
    public static final Parcelable.Creator<PictureFrame> CREATOR;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final byte[] A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static PictureFrame A00(C4J c4j) {
        int iA0C = c4j.A0C();
        String strA0X = c4j.A0X(c4j.A0C(), AbstractC2246ia.A02);
        String strA0W = c4j.A0W(c4j.A0C());
        int iA0C2 = c4j.A0C();
        int iA0C3 = c4j.A0C();
        int iA0C4 = c4j.A0C();
        int iA0C5 = c4j.A0C();
        int iA0C6 = c4j.A0C();
        byte[] bArr = new byte[iA0C6];
        c4j.A0k(bArr, 0, iA0C6);
        return new PictureFrame(iA0C, strA0X, strA0W, iA0C2, iA0C3, iA0C4, iA0C5, bArr);
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 23);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A08 = new byte[]{76, 64, 4, 5, 19, 3, 18, 9, 16, 20, 9, 15, 14, 93, 61, 4, 14, 25, 24, 31, 8, 87, 77, 0, 4, 0, 8, 57, 20, 29, 8, 80};
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
        A02();
        CREATOR = new HQ();
    }

    public PictureFrame(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.A03 = i10;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = i11;
        this.A02 = i12;
        this.A01 = i13;
        this.A00 = i14;
        this.A07 = bArr;
    }

    public PictureFrame(Parcel parcel) {
        this.A03 = parcel.readInt();
        this.A06 = (String) AbstractC09264a.A0f(parcel.readString());
        this.A05 = (String) AbstractC09264a.A0f(parcel.readString());
        this.A04 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A07 = (byte[]) AbstractC09264a.A0f(parcel.createByteArray());
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
        PictureFrame pictureFrame = (PictureFrame) obj;
        if (this.A03 == pictureFrame.A03) {
            String str = this.A06;
            if (A09[2].length() != 28) {
                throw new RuntimeException();
            }
            A09[2] = "EI2VBd4ee1IoRa9rBnnoAwg1aEDf";
            if (str.equals(pictureFrame.A06) && this.A05.equals(pictureFrame.A05) && this.A04 == pictureFrame.A04 && this.A02 == pictureFrame.A02 && this.A01 == pictureFrame.A01 && this.A00 == pictureFrame.A00 && Arrays.equals(this.A07, pictureFrame.A07)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A03;
        int result2 = ((((17 * 31) + result) * 31) + this.A06.hashCode()) * 31;
        int result3 = this.A05.hashCode();
        int result4 = (((result2 + result3) * 31) + this.A04) * 31;
        int result5 = this.A02;
        int result6 = (((result4 + result5) * 31) + this.A01) * 31;
        int result7 = this.A00;
        return ((result6 + result7) * 31) + Arrays.hashCode(this.A07);
    }

    public final String toString() {
        return A01(14, 18, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE) + this.A06 + A01(0, 14, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) + this.A05;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByteArray(this.A07);
    }
}
