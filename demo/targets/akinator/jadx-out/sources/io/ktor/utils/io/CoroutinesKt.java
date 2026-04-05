package io.ktor.utils.io;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kv.l;
import kv.p;
import tu.f;
import tu.x0;
import zu.m;
import zu.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class CoroutinesKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.utils.io.CoroutinesKt$launchChannel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        final /* synthetic */ ByteChannel $channel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ByteChannel byteChannel) {
            super(1);
            this.$channel = byteChannel;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }

        public final void invoke(Throwable th2) {
            this.$channel.close(th2);
        }
    }

    private static final <S extends CoroutineScope> ChannelJob launchChannel(CoroutineScope coroutineScope, m mVar, ByteChannel byteChannel, boolean z10, p pVar) {
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, mVar, null, new CoroutinesKt$launchChannel$job$1(z10, byteChannel, pVar, (CoroutineDispatcher) coroutineScope.getCoroutineContext().get(CoroutineDispatcher.Key), null), 2, null);
        jobLaunch$default.invokeOnCompletion(new AnonymousClass1(byteChannel));
        return new ChannelJob(jobLaunch$default, byteChannel);
    }

    @f
    public static final ReaderJob reader(CoroutineScope coroutineScope, m coroutineContext, ByteChannel channel, p block) {
        e0.checkNotNullParameter(coroutineScope, "<this>");
        e0.checkNotNullParameter(coroutineContext, "coroutineContext");
        e0.checkNotNullParameter(channel, "channel");
        e0.checkNotNullParameter(block, "block");
        return launchChannel(coroutineScope, coroutineContext, channel, false, block);
    }

    public static /* synthetic */ ReaderJob reader$default(CoroutineScope coroutineScope, m mVar, ByteChannel byteChannel, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = n.f98854b;
        }
        return reader(coroutineScope, mVar, byteChannel, pVar);
    }

    @f
    public static final WriterJob writer(CoroutineScope coroutineScope, m coroutineContext, ByteChannel channel, p block) {
        e0.checkNotNullParameter(coroutineScope, "<this>");
        e0.checkNotNullParameter(coroutineContext, "coroutineContext");
        e0.checkNotNullParameter(channel, "channel");
        e0.checkNotNullParameter(block, "block");
        return launchChannel(coroutineScope, coroutineContext, channel, false, block);
    }

    public static /* synthetic */ WriterJob writer$default(CoroutineScope coroutineScope, m mVar, ByteChannel byteChannel, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = n.f98854b;
        }
        return writer(coroutineScope, mVar, byteChannel, pVar);
    }

    public static final ReaderJob reader(CoroutineScope coroutineScope, m coroutineContext, boolean z10, p block) {
        e0.checkNotNullParameter(coroutineScope, "<this>");
        e0.checkNotNullParameter(coroutineContext, "coroutineContext");
        e0.checkNotNullParameter(block, "block");
        return launchChannel(coroutineScope, coroutineContext, ByteChannelKt.ByteChannel(z10), true, block);
    }

    public static final WriterJob writer(CoroutineScope coroutineScope, m coroutineContext, boolean z10, p block) {
        e0.checkNotNullParameter(coroutineScope, "<this>");
        e0.checkNotNullParameter(coroutineContext, "coroutineContext");
        e0.checkNotNullParameter(block, "block");
        return launchChannel(coroutineScope, coroutineContext, ByteChannelKt.ByteChannel(z10), true, block);
    }

    @f
    public static final ReaderJob reader(m coroutineContext, ByteChannel channel, Job job, p block) {
        m mVarNewCoroutineContext;
        e0.checkNotNullParameter(coroutineContext, "coroutineContext");
        e0.checkNotNullParameter(channel, "channel");
        e0.checkNotNullParameter(block, "block");
        if (job != null) {
            mVarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(GlobalScope.INSTANCE, coroutineContext.plus(job));
        } else {
            mVarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(GlobalScope.INSTANCE, coroutineContext);
        }
        return reader(CoroutineScopeKt.CoroutineScope(mVarNewCoroutineContext), n.f98854b, channel, block);
    }

    public static /* synthetic */ ReaderJob reader$default(CoroutineScope coroutineScope, m mVar, boolean z10, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = n.f98854b;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return reader(coroutineScope, mVar, z10, pVar);
    }

    @f
    public static final WriterJob writer(m coroutineContext, ByteChannel channel, Job job, p block) {
        m mVarNewCoroutineContext;
        e0.checkNotNullParameter(coroutineContext, "coroutineContext");
        e0.checkNotNullParameter(channel, "channel");
        e0.checkNotNullParameter(block, "block");
        if (job != null) {
            mVarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(GlobalScope.INSTANCE, coroutineContext.plus(job));
        } else {
            mVarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(GlobalScope.INSTANCE, coroutineContext);
        }
        return writer(CoroutineScopeKt.CoroutineScope(mVarNewCoroutineContext), n.f98854b, channel, block);
    }

    public static /* synthetic */ WriterJob writer$default(CoroutineScope coroutineScope, m mVar, boolean z10, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = n.f98854b;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return writer(coroutineScope, mVar, z10, pVar);
    }

    public static /* synthetic */ ReaderJob reader$default(m mVar, ByteChannel byteChannel, Job job, p pVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            job = null;
        }
        return reader(mVar, byteChannel, job, pVar);
    }

    public static /* synthetic */ WriterJob writer$default(m mVar, ByteChannel byteChannel, Job job, p pVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            job = null;
        }
        return writer(mVar, byteChannel, job, pVar);
    }

    @f
    public static final ReaderJob reader(m coroutineContext, boolean z10, Job job, p block) {
        e0.checkNotNullParameter(coroutineContext, "coroutineContext");
        e0.checkNotNullParameter(block, "block");
        ByteChannel ByteChannel = ByteChannelKt.ByteChannel(z10);
        ReaderJob erVar = reader(coroutineContext, ByteChannel, job, block);
        ByteChannel.attachJob(erVar);
        return erVar;
    }

    public static /* synthetic */ ReaderJob reader$default(m mVar, boolean z10, Job job, p pVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            job = null;
        }
        return reader(mVar, z10, job, pVar);
    }

    @f
    public static final WriterJob writer(m coroutineContext, boolean z10, Job job, p block) {
        e0.checkNotNullParameter(coroutineContext, "coroutineContext");
        e0.checkNotNullParameter(block, "block");
        ByteChannel ByteChannel = ByteChannelKt.ByteChannel(z10);
        WriterJob writerJobWriter = writer(coroutineContext, ByteChannel, job, block);
        ByteChannel.attachJob(writerJobWriter);
        return writerJobWriter;
    }

    public static /* synthetic */ WriterJob writer$default(m mVar, boolean z10, Job job, p pVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            job = null;
        }
        return writer(mVar, z10, job, pVar);
    }
}
