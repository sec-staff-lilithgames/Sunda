package io.ktor.client.plugins.cache;

import bv.f;
import bv.n;
import com.ironsource.Me;
import io.ktor.client.HttpClient;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.pipeline.PipelineContext;
import kv.q;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.plugins.cache.HttpCache$Companion$install$2", f = "HttpCache.kt", i = {1, 1, 3, 3}, l = {188, 194, 198, 206, 210}, m = "invokeSuspend", n = {"$this$intercept", Me.f34938n, "$this$intercept", Me.f34938n}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes7.dex */
public final class HttpCache$Companion$install$2 extends n implements q {
    final /* synthetic */ HttpCache $plugin;
    final /* synthetic */ HttpClient $scope;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCache$Companion$install$2(HttpCache httpCache, HttpClient httpClient, d<? super HttpCache$Companion$install$2> dVar) {
        super(3, dVar);
        this.$plugin = httpCache;
        this.$scope = httpClient;
    }

    @Override // kv.q
    public final Object invoke(PipelineContext<HttpResponse, x0> pipelineContext, HttpResponse httpResponse, d<? super x0> dVar) {
        HttpCache$Companion$install$2 httpCache$Companion$install$2 = new HttpCache$Companion$install$2(this.$plugin, this.$scope, dVar);
        httpCache$Companion$install$2.L$0 = pipelineContext;
        httpCache$Companion$install$2.L$1 = httpResponse;
        return httpCache$Companion$install$2.invokeSuspend(x0.f87415a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0159 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015a  */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.HttpCache$Companion$install$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
