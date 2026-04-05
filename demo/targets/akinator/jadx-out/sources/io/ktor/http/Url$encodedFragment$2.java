package io.ktor.http;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.a;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Url$encodedFragment$2 extends f0 implements a {
    final /* synthetic */ Url this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Url$encodedFragment$2(Url url) {
        super(0);
        this.this$0 = url;
    }

    @Override // kv.a
    public final String invoke() {
        int iIndexOf$default = n0.indexOf$default((CharSequence) this.this$0.urlString, '#', 0, false, 6, (Object) null) + 1;
        if (iIndexOf$default == 0) {
            return "";
        }
        String strSubstring = this.this$0.urlString.substring(iIndexOf$default);
        e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }
}
