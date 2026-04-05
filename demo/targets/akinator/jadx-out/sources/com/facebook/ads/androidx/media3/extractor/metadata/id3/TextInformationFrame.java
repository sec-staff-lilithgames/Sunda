package com.facebook.ads.androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.AbstractC09264a;
import com.facebook.ads.redexgen.core.C1255Hh;
import com.facebook.ads.redexgen.core.C3M;
import com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class TextInformationFrame extends Id3Frame {
    public static byte[] A03;
    public static String[] A04 = {"PRzzvuBjwgRBlybrfgCXUu0h8kRE0BYl", "wpvJm9E3j", "XMJYjWJhpM05jCuEk8g1dCDyUY0olBpf", "Qsgwd6eZwkpqny4yz6zyMy2XfivsvALV", "clQMjNTRp", "2j6tBuGV", "VJB8QHv", "YZxxVdDySmA2nPcuTgf4p"};
    public static final Parcelable.Creator<TextInformationFrame> CREATOR;
    public final String A00;

    @Deprecated
    public final String A01;

    @MetaExoPlayerCustomization("Replaces ImmutableList with MetaExoPlayerCustomizedCollections")
    public final List<String> A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-99, -125, -57, -56, -42, -58, -43, -52, -45, -41, -52, -46, -47, -96, -33, -59, 27, 6, 17, 26, 10, 24, -30};
        String[] strArr = A04;
        if (strArr[2].charAt(18) == strArr[3].charAt(18)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[2] = "yRSPqh3aRsAylVpe1hOBm5YLh5Sq4zVd";
        strArr2[3] = "7kqk0liQnwbAMo7HBLnU1F6wmq1Tne5o";
        A03 = bArr;
    }

    static {
        A01();
        CREATOR = new C1255Hh();
    }

    @MetaExoPlayerCustomization("Replaces ImmutableList.copyOf with MetaExoPlayerCustomizedCollections")
    public TextInformationFrame(Parcel parcel) {
        this((String) C3M.A01(parcel.readString()), parcel.readString(), MetaExoPlayerCustomizedCollections.A02((String[]) C3M.A01(parcel.createStringArray())));
    }

    public /* synthetic */ TextInformationFrame(Parcel parcel, C1255Hh c1255Hh) {
        this(parcel);
    }

    @MetaExoPlayerCustomization("Replaces ImmutableList.copyOf with MetaExoPlayerCustomizedCollections")
    public TextInformationFrame(String str, String str2, List<String> values) {
        super(str);
        C3M.A07(!values.isEmpty());
        this.A00 = str2;
        this.A02 = MetaExoPlayerCustomizedCollections.A02((String[]) values.toArray(new String[0]));
        this.A01 = this.A02.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            Class<?> cls2 = obj.getClass();
            String[] strArr = A04;
            if (strArr[1].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[2] = "8D2Ula8sxyLo2Sqvwa2MzZhuaia5hg34";
            strArr2[3] = "0hDX4qrnX3efe3zY5D7tm747s1qsajWd";
            if (cls == cls2) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
                if (AbstractC09264a.A1E(super.A00, ((Id3Frame) textInformationFrame).A00)) {
                    boolean zA1E = AbstractC09264a.A1E(this.A00, textInformationFrame.A00);
                    if (A04[5].length() == 10) {
                        throw new RuntimeException();
                    }
                    A04[7] = "aAA9QqK2VvJ";
                    if (zA1E && this.A02.equals(textInformationFrame.A02)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = super.A00.hashCode();
        int result2 = ((((17 * 31) + result) * 31) + (this.A00 != null ? this.A00.hashCode() : 0)) * 31;
        int result3 = this.A02.hashCode();
        return result2 + result3;
    }

    @Override // com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return super.A00 + A00(0, 14, 39) + this.A00 + A00(14, 9, 105) + this.A02;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A00);
        parcel.writeStringArray((String[]) this.A02.toArray(new String[0]));
    }
}
