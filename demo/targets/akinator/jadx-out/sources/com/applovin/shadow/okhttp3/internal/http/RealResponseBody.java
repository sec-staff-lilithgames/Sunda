package com.applovin.shadow.okhttp3.internal.http;

import com.applovin.shadow.okhttp3.MediaType;
import com.applovin.shadow.okhttp3.ResponseBody;
import com.applovin.shadow.okio.BufferedSource;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final BufferedSource source;

    public RealResponseBody(String str, long j10, BufferedSource source) {
        e0.checkNotNullParameter(source, "source");
        this.contentTypeString = str;
        this.contentLength = j10;
        this.source = source;
    }

    @Override // com.applovin.shadow.okhttp3.ResponseBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // com.applovin.shadow.okhttp3.ResponseBody
    public MediaType contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.Companion.parse(str);
        }
        return null;
    }

    @Override // com.applovin.shadow.okhttp3.ResponseBody
    public BufferedSource source() {
        return this.source;
    }
}
