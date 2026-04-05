package io.bidmachine;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum MediaAssetType {
    Icon,
    Image,
    Video,
    All;

    public static boolean isAll(List<MediaAssetType> list) {
        if (list.contains(All)) {
            return true;
        }
        return list.contains(Icon) && list.contains(Image) && list.contains(Video);
    }
}
