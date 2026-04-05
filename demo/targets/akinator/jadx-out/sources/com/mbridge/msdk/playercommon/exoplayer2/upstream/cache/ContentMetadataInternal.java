package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import android.net.Uri;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class ContentMetadataInternal {
    private static final String METADATA_NAME_CONTENT_LENGTH = "exo_len";
    private static final String METADATA_NAME_REDIRECTED_URI = "exo_redir";
    private static final String PREFIX = "exo_";

    private ContentMetadataInternal() {
    }

    public static long getContentLength(ContentMetadata contentMetadata) {
        return contentMetadata.get(METADATA_NAME_CONTENT_LENGTH, -1L);
    }

    public static Uri getRedirectedUri(ContentMetadata contentMetadata) {
        String str = contentMetadata.get(METADATA_NAME_REDIRECTED_URI, (String) null);
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    public static void removeContentLength(ContentMetadataMutations contentMetadataMutations) {
        contentMetadataMutations.remove(METADATA_NAME_CONTENT_LENGTH);
    }

    public static void removeRedirectedUri(ContentMetadataMutations contentMetadataMutations) {
        contentMetadataMutations.remove(METADATA_NAME_REDIRECTED_URI);
    }

    public static void setContentLength(ContentMetadataMutations contentMetadataMutations, long j10) {
        contentMetadataMutations.set(METADATA_NAME_CONTENT_LENGTH, j10);
    }

    public static void setRedirectedUri(ContentMetadataMutations contentMetadataMutations, Uri uri) {
        contentMetadataMutations.set(METADATA_NAME_REDIRECTED_URI, uri.toString());
    }
}
