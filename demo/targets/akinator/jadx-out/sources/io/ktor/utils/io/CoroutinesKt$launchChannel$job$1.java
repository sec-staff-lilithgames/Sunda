package io.ktor.utils.io;

import av.e;
import bv.f;
import bv.n;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;
import zu.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.utils.io.CoroutinesKt$launchChannel$job$1", f = "Coroutines.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class CoroutinesKt$launchChannel$job$1 extends n implements p {
    final /* synthetic */ boolean $attachJob;
    final /* synthetic */ p $block;
    final /* synthetic */ ByteChannel $channel;
    final /* synthetic */ CoroutineDispatcher $dispatcher;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesKt$launchChannel$job$1(boolean z10, ByteChannel byteChannel, p pVar, CoroutineDispatcher coroutineDispatcher, d<? super CoroutinesKt$launchChannel$job$1> dVar) {
        super(2, dVar);
        this.$attachJob = z10;
        this.$channel = byteChannel;
        this.$block = pVar;
        this.$dispatcher = coroutineDispatcher;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        CoroutinesKt$launchChannel$job$1 coroutinesKt$launchChannel$job$1 = new CoroutinesKt$launchChannel$job$1(this.$attachJob, this.$channel, this.$block, this.$dispatcher, dVar);
        coroutinesKt$launchChannel$job$1.L$0 = obj;
        return coroutinesKt$launchChannel$job$1;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                if (this.$attachJob) {
                    ByteChannel byteChannel = this.$channel;
                    k kVar = coroutineScope.getCoroutineContext().get(Job.Key);
                    e0.checkNotNull(kVar);
                    byteChannel.attachJob((Job) kVar);
                }
                ChannelScope channelScope = new ChannelScope(coroutineScope, this.$channel);
                p pVar = this.$block;
                this.label = 1;
                if (pVar.invoke(channelScope, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
        } catch (Throwable th2) {
            if (!e0.areEqual(this.$dispatcher, Dispatchers.getUnconfined()) && this.$dispatcher != null) {
                throw th2;
            }
            this.$channel.cancel(th2);
        }
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
        return ((CoroutinesKt$launchChannel$job$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
