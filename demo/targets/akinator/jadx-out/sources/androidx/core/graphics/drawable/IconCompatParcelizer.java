package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import g6.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(d dVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f5750a = dVar.readInt(iconCompat.f5750a, 1);
        iconCompat.f5752c = dVar.readByteArray(iconCompat.f5752c, 2);
        iconCompat.f5753d = dVar.readParcelable(iconCompat.f5753d, 3);
        iconCompat.f5754e = dVar.readInt(iconCompat.f5754e, 4);
        iconCompat.f5755f = dVar.readInt(iconCompat.f5755f, 5);
        iconCompat.f5756g = (ColorStateList) dVar.readParcelable(iconCompat.f5756g, 6);
        iconCompat.f5758i = dVar.readString(iconCompat.f5758i, 7);
        iconCompat.f5759j = dVar.readString(iconCompat.f5759j, 8);
        iconCompat.onPostParceling();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, d dVar) {
        dVar.setSerializationFlags(true, true);
        iconCompat.onPreParceling(dVar.isStream());
        int i10 = iconCompat.f5750a;
        if (-1 != i10) {
            dVar.writeInt(i10, 1);
        }
        byte[] bArr = iconCompat.f5752c;
        if (bArr != null) {
            dVar.writeByteArray(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f5753d;
        if (parcelable != null) {
            dVar.writeParcelable(parcelable, 3);
        }
        int i11 = iconCompat.f5754e;
        if (i11 != 0) {
            dVar.writeInt(i11, 4);
        }
        int i12 = iconCompat.f5755f;
        if (i12 != 0) {
            dVar.writeInt(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f5756g;
        if (colorStateList != null) {
            dVar.writeParcelable(colorStateList, 6);
        }
        String str = iconCompat.f5758i;
        if (str != null) {
            dVar.writeString(str, 7);
        }
        String str2 = iconCompat.f5759j;
        if (str2 != null) {
            dVar.writeString(str2, 8);
        }
    }
}
