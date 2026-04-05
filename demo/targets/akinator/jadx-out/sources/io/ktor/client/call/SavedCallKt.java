package io.ktor.client.call;

import bv.d;
import bv.f;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class SavedCallKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.call.SavedCallKt", f = "SavedCall.kt", i = {0}, l = {TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER}, m = "save", n = {"$this$save"}, s = {"L$0"})
    /* renamed from: io.ktor.client.call.SavedCallKt$save$1, reason: invalid class name */
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
            return SavedCallKt.save(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object save(io.ktor.client.call.HttpClientCall r8, zu.d<? super io.ktor.client.call.HttpClientCall> r9) {
        /*
            boolean r0 = r9 instanceof io.ktor.client.call.SavedCallKt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r9
            io.ktor.client.call.SavedCallKt$save$1 r0 = (io.ktor.client.call.SavedCallKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            io.ktor.client.call.SavedCallKt$save$1 r0 = new io.ktor.client.call.SavedCallKt$save$1
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.result
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r7 = 1
            if (r1 == 0) goto L37
            if (r1 != r7) goto L2f
            java.lang.Object r8 = r4.L$0
            io.ktor.client.call.HttpClientCall r8 = (io.ktor.client.call.HttpClientCall) r8
            tu.a0.throwOnFailure(r9)
            goto L51
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            tu.a0.throwOnFailure(r9)
            io.ktor.client.statement.HttpResponse r9 = r8.getResponse()
            io.ktor.utils.io.ByteReadChannel r1 = r9.getContent()
            r4.L$0 = r8
            r4.label = r7
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r9 = io.ktor.utils.io.ByteReadChannel.DefaultImpls.readRemaining$default(r1, r2, r4, r5, r6)
            if (r9 != r0) goto L51
            return r0
        L51:
            io.ktor.utils.io.core.ByteReadPacket r9 = (io.ktor.utils.io.core.ByteReadPacket) r9
            r0 = 0
            r1 = 0
            byte[] r9 = io.ktor.utils.io.core.StringsKt.readBytes$default(r9, r0, r7, r1)
            io.ktor.client.call.SavedHttpCall r0 = new io.ktor.client.call.SavedHttpCall
            io.ktor.client.HttpClient r1 = r8.getClient()
            io.ktor.client.request.HttpRequest r2 = r8.getRequest()
            io.ktor.client.statement.HttpResponse r8 = r8.getResponse()
            r0.<init>(r1, r2, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.call.SavedCallKt.save(io.ktor.client.call.HttpClientCall, zu.d):java.lang.Object");
    }
}
