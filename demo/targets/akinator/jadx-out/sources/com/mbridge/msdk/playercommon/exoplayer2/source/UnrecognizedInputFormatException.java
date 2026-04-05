package com.mbridge.msdk.playercommon.exoplayer2.source;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class UnrecognizedInputFormatException extends ParserException {
    public final Uri uri;

    public UnrecognizedInputFormatException(String str, Uri uri) {
        super(str);
        this.uri = uri;
    }
}
