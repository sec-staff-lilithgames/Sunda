package androidx.media;

import android.os.Bundle;
import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class e {
    public static boolean areSameOptions(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        return bundle == null ? bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1 : bundle2 == null ? bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1 : bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
    }

    public static boolean hasDuplicatedItems(Bundle bundle, Bundle bundle2) {
        int i10;
        int i11;
        int i12;
        String str = QGjYBESwAiCc.YlUCF;
        int i13 = bundle == null ? -1 : bundle.getInt(str, -1);
        int i14 = bundle2 == null ? -1 : bundle2.getInt(str, -1);
        int i15 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        int i16 = bundle2 == null ? -1 : bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        int i17 = Integer.MAX_VALUE;
        if (i13 == -1 || i15 == -1) {
            i10 = Integer.MAX_VALUE;
            i11 = 0;
        } else {
            i11 = i13 * i15;
            i10 = (i15 + i11) - 1;
        }
        if (i14 == -1 || i16 == -1) {
            i12 = 0;
        } else {
            i12 = i14 * i16;
            i17 = (i16 + i12) - 1;
        }
        return i10 >= i12 && i17 >= i11;
    }
}
