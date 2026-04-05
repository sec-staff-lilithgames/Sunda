package io.ktor.client.engine.android;

import bv.d;
import bv.f;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.http.HttpMethod;
import java.util.List;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class AndroidClientEngineKt {
    private static final List<HttpMethod> METHODS_WITHOUT_BODY;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.engine.android.AndroidClientEngineKt", f = "AndroidClientEngine.kt", i = {}, l = {116, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE}, m = "writeTo", n = {}, s = {})
    /* renamed from: io.ktor.client.engine.android.AndroidClientEngineKt$writeTo$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidClientEngineKt.writeTo(null, null, null, this);
        }
    }

    static {
        HttpMethod.Companion companion = HttpMethod.Companion;
        METHODS_WITHOUT_BODY = p0.listOf((Object[]) new HttpMethod[]{companion.getGet(), companion.getHead()});
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
    
        if (io.ktor.utils.io.jvm.javaio.WritingKt.copyTo$default(r0, r1, 0, r4, 2, null) == r7) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.OutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object writeTo(io.ktor.http.content.OutgoingContent r15, java.io.OutputStream r16, zu.m r17, zu.d<? super tu.x0> r18) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.android.AndroidClientEngineKt.writeTo(io.ktor.http.content.OutgoingContent, java.io.OutputStream, zu.m, zu.d):java.lang.Object");
    }
}
