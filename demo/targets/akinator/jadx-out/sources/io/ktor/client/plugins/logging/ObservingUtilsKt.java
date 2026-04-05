package io.ktor.client.plugins.logging;

import av.e;
import bv.d;
import bv.f;
import bv.n;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.CoroutinesKt;
import io.ktor.utils.io.WriterScope;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kv.p;
import tu.a0;
import tu.x0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ObservingUtilsKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.logging.ObservingUtilsKt", f = "ObservingUtils.kt", i = {0, 0}, l = {14}, m = "observe", n = {"$this$observe", "log"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.client.plugins.logging.ObservingUtilsKt$observe$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ObservingUtilsKt.observe(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.logging.ObservingUtilsKt$toReadChannel$1", f = "ObservingUtils.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.client.plugins.logging.ObservingUtilsKt$toReadChannel$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39161 extends n implements p {
        final /* synthetic */ OutgoingContent.WriteChannelContent $this_toReadChannel;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39161(OutgoingContent.WriteChannelContent writeChannelContent, zu.d<? super C39161> dVar) {
            super(2, dVar);
            this.$this_toReadChannel = writeChannelContent;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C39161 c39161 = new C39161(this.$this_toReadChannel, dVar);
            c39161.L$0 = obj;
            return c39161;
        }

        @Override // kv.p
        public final Object invoke(WriterScope writerScope, zu.d<? super x0> dVar) {
            return ((C39161) create(writerScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                WriterScope writerScope = (WriterScope) this.L$0;
                OutgoingContent.WriteChannelContent writeChannelContent = this.$this_toReadChannel;
                ByteWriteChannel channel = writerScope.getChannel();
                this.label = 1;
                if (writeChannelContent.writeTo(channel, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object observe(io.ktor.http.content.OutgoingContent r4, io.ktor.utils.io.ByteWriteChannel r5, zu.d<? super io.ktor.http.content.OutgoingContent> r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.client.plugins.logging.ObservingUtilsKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.plugins.logging.ObservingUtilsKt$observe$1 r0 = (io.ktor.client.plugins.logging.ObservingUtilsKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.logging.ObservingUtilsKt$observe$1 r0 = new io.ktor.client.plugins.logging.ObservingUtilsKt$observe$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.L$1
            r5 = r4
            io.ktor.utils.io.ByteWriteChannel r5 = (io.ktor.utils.io.ByteWriteChannel) r5
            java.lang.Object r4 = r0.L$0
            io.ktor.http.content.OutgoingContent r4 = (io.ktor.http.content.OutgoingContent) r4
            tu.a0.throwOnFailure(r6)
            goto L55
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            tu.a0.throwOnFailure(r6)
            boolean r6 = r4 instanceof io.ktor.http.content.OutgoingContent.ByteArrayContent
            if (r6 == 0) goto L59
            r6 = r4
            io.ktor.http.content.OutgoingContent$ByteArrayContent r6 = (io.ktor.http.content.OutgoingContent.ByteArrayContent) r6
            byte[] r6 = r6.bytes()
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = io.ktor.utils.io.ByteWriteChannelKt.writeFully(r5, r6, r0)
            if (r6 != r1) goto L55
            return r1
        L55:
            io.ktor.utils.io.ByteWriteChannelKt.close(r5)
            return r4
        L59:
            boolean r6 = r4 instanceof io.ktor.http.content.OutgoingContent.ReadChannelContent
            r0 = 0
            r1 = 0
            if (r6 == 0) goto L73
            io.ktor.utils.io.ByteChannel r6 = io.ktor.utils.io.ByteChannelKt.ByteChannel$default(r1, r3, r0)
            r0 = r4
            io.ktor.http.content.OutgoingContent$ReadChannelContent r0 = (io.ktor.http.content.OutgoingContent.ReadChannelContent) r0
            io.ktor.utils.io.ByteReadChannel r0 = r0.readFrom()
            io.ktor.util.ByteChannelsKt.copyToBoth(r0, r5, r6)
            io.ktor.client.plugins.logging.LoggedContent r5 = new io.ktor.client.plugins.logging.LoggedContent
            r5.<init>(r4, r6)
            return r5
        L73:
            boolean r6 = r4 instanceof io.ktor.http.content.OutgoingContent.WriteChannelContent
            if (r6 == 0) goto L8b
            io.ktor.utils.io.ByteChannel r6 = io.ktor.utils.io.ByteChannelKt.ByteChannel$default(r1, r3, r0)
            r0 = r4
            io.ktor.http.content.OutgoingContent$WriteChannelContent r0 = (io.ktor.http.content.OutgoingContent.WriteChannelContent) r0
            io.ktor.utils.io.ByteReadChannel r0 = toReadChannel(r0)
            io.ktor.util.ByteChannelsKt.copyToBoth(r0, r5, r6)
            io.ktor.client.plugins.logging.LoggedContent r5 = new io.ktor.client.plugins.logging.LoggedContent
            r5.<init>(r4, r6)
            return r5
        L8b:
            io.ktor.utils.io.ByteWriteChannelKt.close(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.logging.ObservingUtilsKt.observe(io.ktor.http.content.OutgoingContent, io.ktor.utils.io.ByteWriteChannel, zu.d):java.lang.Object");
    }

    private static final ByteReadChannel toReadChannel(OutgoingContent.WriteChannelContent writeChannelContent) {
        return CoroutinesKt.writer$default((CoroutineScope) GlobalScope.INSTANCE, (m) Dispatchers.getDefault(), false, (p) new C39161(writeChannelContent, null), 2, (Object) null).getChannel();
    }
}
