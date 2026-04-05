package io.ktor.http.auth;

import com.ironsource.G5;
import io.ktor.http.HeaderValueParam;
import io.ktor.http.auth.HttpAuthHeader;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpAuthHeader$Parameterized$render$1 extends f0 implements l {
    final /* synthetic */ HeaderValueEncoding $encoding;
    final /* synthetic */ HttpAuthHeader.Parameterized this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpAuthHeader$Parameterized$render$1(HttpAuthHeader.Parameterized parameterized, HeaderValueEncoding headerValueEncoding) {
        super(1);
        this.this$0 = parameterized;
        this.$encoding = headerValueEncoding;
    }

    @Override // kv.l
    public final CharSequence invoke(HeaderValueParam it) {
        e0.checkNotNullParameter(it, "it");
        return it.getName() + G5.T + this.this$0.encode(it.getValue(), this.$encoding);
    }
}
