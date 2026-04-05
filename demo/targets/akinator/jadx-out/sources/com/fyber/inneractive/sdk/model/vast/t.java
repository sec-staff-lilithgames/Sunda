package com.fyber.inneractive.sdk.model.vast;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum t {
    MEDIA_TYPE_MP4(MimeTypes.VIDEO_MP4),
    MEDIA_TYPE_3GPP(MimeTypes.VIDEO_H263),
    MEDIA_TYPE_WEBM("video/webm"),
    MEDIA_TYPE_X_MPEG(MimeTypes.APPLICATION_M3U8),
    UNKNOWN("unknown");

    private static final Map<String, t> sMediaTypeMap = new HashMap();
    final String mimeType;

    static {
        for (t tVar : values()) {
            sMediaTypeMap.put(tVar.mimeType, tVar);
        }
    }

    t(String str) {
        this.mimeType = str;
    }

    public static t a(String str) {
        Map<String, t> map = sMediaTypeMap;
        return map.containsKey(str) ? map.get(str) : UNKNOWN;
    }
}
