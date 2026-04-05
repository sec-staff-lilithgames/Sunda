package com.unity3d.ads.adplayer.model;

import com.google.android.gms.internal.play_billing.a;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class WebViewClientError {
    private final ErrorReason reason;
    private final Integer statusCode;
    private final String url;

    public WebViewClientError(String str, ErrorReason reason, Integer num) {
        e0.checkNotNullParameter(reason, "reason");
        this.url = str;
        this.reason = reason;
        this.statusCode = num;
    }

    public static /* synthetic */ WebViewClientError copy$default(WebViewClientError webViewClientError, String str, ErrorReason errorReason, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = webViewClientError.url;
        }
        if ((i10 & 2) != 0) {
            errorReason = webViewClientError.reason;
        }
        if ((i10 & 4) != 0) {
            num = webViewClientError.statusCode;
        }
        return webViewClientError.copy(str, errorReason, num);
    }

    public final String component1() {
        return this.url;
    }

    public final ErrorReason component2() {
        return this.reason;
    }

    public final Integer component3() {
        return this.statusCode;
    }

    public final WebViewClientError copy(String str, ErrorReason reason, Integer num) {
        e0.checkNotNullParameter(reason, "reason");
        return new WebViewClientError(str, reason, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewClientError)) {
            return false;
        }
        WebViewClientError webViewClientError = (WebViewClientError) obj;
        return e0.areEqual(this.url, webViewClientError.url) && this.reason == webViewClientError.reason && e0.areEqual(this.statusCode, webViewClientError.statusCode);
    }

    public final ErrorReason getReason() {
        return this.reason;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = (this.reason.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        Integer num = this.statusCode;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("WebViewClientError(url=");
        sb2.append(this.url);
        sb2.append(", reason=");
        sb2.append(this.reason);
        sb2.append(", statusCode=");
        return a.j(sb2, this.statusCode, ')');
    }

    public /* synthetic */ WebViewClientError(String str, ErrorReason errorReason, Integer num, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : str, errorReason, (i10 & 4) != 0 ? null : num);
    }
}
