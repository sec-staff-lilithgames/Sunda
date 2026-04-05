package com.facebook.ads.androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.AbstractC09264a;
import com.facebook.ads.redexgen.core.HX;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class BinaryFrame extends Id3Frame {
    public static String[] A01 = {"mO2v2I8nIlxBj", "qTeiOagQgmfIePZq", "", "yu", "e92", "94hbfjGXx", "JfA8eazzapC4ELerSklcK4", "O"};
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new HX();
    public final byte[] A00;

    public BinaryFrame(Parcel parcel) {
        super((String) AbstractC09264a.A0f(parcel.readString()));
        this.A00 = (byte[]) AbstractC09264a.A0f(parcel.createByteArray());
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.A00 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            if (A01[2].length() != 0) {
                throw new RuntimeException();
            }
            A01[2] = "";
            if (cls == obj.getClass()) {
                BinaryFrame binaryFrame = (BinaryFrame) obj;
                return super.A00.equals(((Id3Frame) binaryFrame).A00) && Arrays.equals(this.A00, binaryFrame.A00);
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = super.A00.hashCode();
        return (((17 * 31) + result) * 31) + Arrays.hashCode(this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(super.A00);
        parcel.writeByteArray(this.A00);
    }
}
