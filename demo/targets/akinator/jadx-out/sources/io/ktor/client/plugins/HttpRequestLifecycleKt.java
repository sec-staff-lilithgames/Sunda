package io.ktor.client.plugins;

import bx.a;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpRequestLifecycleKt {
    private static final a LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpRequestLifecycle");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.HttpRequestLifecycleKt$attachToClientEngineJob$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        final /* synthetic */ DisposableHandle $handler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DisposableHandle disposableHandle) {
            super(1);
            this.$handler = disposableHandle;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }

        public final void invoke(Throwable th2) {
            this.$handler.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachToClientEngineJob(CompletableJob completableJob, Job job) {
        completableJob.invokeOnCompletion(new AnonymousClass1(job.invokeOnCompletion(new HttpRequestLifecycleKt$attachToClientEngineJob$handler$1(completableJob))));
    }
}
