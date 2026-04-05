package com.mbridge.msdk.foundation.download;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum DownloadResourceType {
    DOWNLOAD_RESOURCE_TYPE_VIDEO(0),
    DOWNLOAD_RESOURCE_TYPE_ZIP(1),
    DOWNLOAD_RESOURCE_TYPE_IMAGE(2),
    DOWNLOAD_RESOURCE_TYPE_HTML(3),
    DOWNLOAD_RESOURCE_TYPE_OTHER(4),
    DOWNLOAD_RESOURCE_TYPE_APK(5);

    public int resourceType;

    DownloadResourceType(int i10) {
        this.resourceType = i10;
    }

    public static DownloadResourceType getDownloadResourceType(int i10) {
        if (i10 == 0) {
            return DOWNLOAD_RESOURCE_TYPE_VIDEO;
        }
        if (i10 == 1) {
            return DOWNLOAD_RESOURCE_TYPE_ZIP;
        }
        if (i10 == 2) {
            return DOWNLOAD_RESOURCE_TYPE_IMAGE;
        }
        if (i10 == 3) {
            return DOWNLOAD_RESOURCE_TYPE_HTML;
        }
        if (i10 == 4) {
            return DOWNLOAD_RESOURCE_TYPE_OTHER;
        }
        if (i10 != 5) {
            return null;
        }
        return DOWNLOAD_RESOURCE_TYPE_APK;
    }
}
