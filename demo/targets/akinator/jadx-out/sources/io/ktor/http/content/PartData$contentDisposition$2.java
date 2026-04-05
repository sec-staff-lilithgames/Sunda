package io.ktor.http.content;

import io.ktor.http.ContentDisposition;
import io.ktor.http.HttpHeaders;
import kotlin.jvm.internal.f0;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class PartData$contentDisposition$2 extends f0 implements a {
    final /* synthetic */ PartData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartData$contentDisposition$2(PartData partData) {
        super(0);
        this.this$0 = partData;
    }

    @Override // kv.a
    public final ContentDisposition invoke() {
        String str = this.this$0.getHeaders().get(HttpHeaders.INSTANCE.getContentDisposition());
        if (str != null) {
            return ContentDisposition.Companion.parse(str);
        }
        return null;
    }
}
