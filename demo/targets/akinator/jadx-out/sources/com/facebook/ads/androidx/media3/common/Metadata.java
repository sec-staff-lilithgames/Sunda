package com.facebook.ads.androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.redexgen.core.AbstractC09264a;
import com.facebook.ads.redexgen.core.AbstractC2670q7;
import com.facebook.ads.redexgen.core.C2614or;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class Metadata implements Parcelable {
    public static byte[] A02;
    public static String[] A03 = {"mhtWLLrhhof2c3oNGAikQ02zY04FWWhb", "D7PA5y5JB7lzm0w5G", "zJXPfo0gMr3Jucw9cJGyuGk1ctIsyJh8", "Rs3TDnOYdqPS5YfXoagNS3YNrnFCycs6", "xjaJofD0dPUcmVvb8BJkqUvajzMbPe01", "BOBSub5c7lfBtbfZCMGuub2gKHyTzLoC", "LM9W6", "jYsNszMUFrPRtUIi9AiskAAH1nkqNQHo"};
    public static final Parcelable.Creator<Metadata> CREATOR;
    public final long A00;
    public final Entry[] A01;

    public interface Entry extends Parcelable {
        byte[] A9S();

        C2614or A9T();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A03;
            if (strArr[0].charAt(19) != strArr[4].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[2] = "jJYb5XESnreQmnafz5VJdwPxqQSxn5xg";
            strArr2[7] = "kTpneR3tTrjWo9SwHImypXlm89YhFqkJ";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 102);
            i13++;
        }
    }

    public static void A01() {
        String[] strArr = A03;
        if (strArr[6].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[0] = "FHzPVNHLMxLnXBjwMdKkWWwrPs5hsjYz";
        strArr2[4] = "XDjvnqVH9aBEFffbIwnkls2Q80ahFTsl";
        A02 = new byte[]{56, 52, 100, 102, 113, 103, 113, 122, 96, 117, 96, 125, 123, 122, 64, 125, 121, 113, 65, 103, 41, 92, 87, 77, 75, 80, 92, 74, 4};
    }

    static {
        A01();
        CREATOR = new Parcelable.Creator<Metadata>() { // from class: com.facebook.ads.redexgen.X.2b
            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final Metadata createFromParcel(Parcel parcel) {
                return new Metadata(parcel);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* renamed from: A01, reason: merged with bridge method [inline-methods] */
            public final Metadata[] newArray(int i10) {
                return new Metadata[i10];
            }
        };
    }

    public Metadata(long j10, Entry... entryArr) {
        this.A00 = j10;
        this.A01 = entryArr;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Metadata(android.os.Parcel r4) {
        /*
            r3 = this;
            r3.<init>()
            int r0 = r4.readInt()
            com.facebook.ads.androidx.media3.common.Metadata$Entry[] r0 = new com.facebook.ads.androidx.media3.common.Metadata.Entry[r0]
            r3.A01 = r0
            r2 = 0
        Lc:
            com.facebook.ads.androidx.media3.common.Metadata$Entry[] r0 = r3.A01
            int r0 = r0.length
            if (r2 >= r0) goto L24
            com.facebook.ads.androidx.media3.common.Metadata$Entry[] r1 = r3.A01
            java.lang.Class<com.facebook.ads.androidx.media3.common.Metadata$Entry> r0 = com.facebook.ads.androidx.media3.common.Metadata.Entry.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            com.facebook.ads.androidx.media3.common.Metadata$Entry r0 = (com.facebook.ads.androidx.media3.common.Metadata.Entry) r0
            r1[r2] = r0
            int r2 = r2 + 1
            goto Lc
        L24:
            long r0 = r4.readLong()
            r3.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.androidx.media3.common.Metadata.<init>(android.os.Parcel):void");
    }

    public Metadata(List<? extends Entry> entries) {
        this((Entry[]) entries.toArray(new Entry[0]));
    }

    public Metadata(Entry... entryArr) {
        this(C.TIME_UNSET, entryArr);
    }

    public final int A02() {
        return this.A01.length;
    }

    public final Entry A03(int i10) {
        return this.A01[i10];
    }

    public final Metadata A04(Metadata metadata) {
        if (metadata == null) {
            return this;
        }
        return A05(metadata.A01);
    }

    public final Metadata A05(Entry... entryArr) {
        if (entryArr.length == 0) {
            return this;
        }
        return new Metadata(this.A00, (Entry[]) AbstractC09264a.A1K(this.A01, entryArr));
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
        Metadata metadata = (Metadata) obj;
        return Arrays.equals(this.A01, metadata.A01) && this.A00 == metadata.A00;
    }

    public final int hashCode() {
        int result = Arrays.hashCode(this.A01);
        int i10 = result * 31;
        int result2 = AbstractC2670q7.A00(this.A00);
        return i10 + result2;
    }

    public final String toString() {
        return A00(21, 8, 95) + Arrays.toString(this.A01) + (this.A00 == C.TIME_UNSET ? A00(0, 0, 66) : A00(0, 21, 114) + this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.A01.length);
        for (Entry entry : this.A01) {
            String[] strArr = A03;
            if (strArr[6].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[0] = "Y2eKphX3uEoYAY6qefSk2brdpzOum5mA";
            strArr2[4] = "2ZL0aXTB42gyCwKS7w8k2h86pmsl1x45";
            parcel.writeParcelable(entry, 0);
        }
        parcel.writeLong(this.A00);
    }
}
