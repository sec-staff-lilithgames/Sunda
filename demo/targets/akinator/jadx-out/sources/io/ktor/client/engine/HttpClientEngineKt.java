package io.ktor.client.engine;

import io.ktor.client.HttpClientConfig;
import io.ktor.client.engine.UtilsKt;
import io.ktor.client.request.HttpRequestData;
import io.ktor.http.HttpHeaders;
import io.ktor.http.UnsafeHeaderException;
import io.ktor.util.AttributeKey;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kv.l;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class HttpClientEngineKt {
    private static final CoroutineName CALL_COROUTINE = new CoroutineName("call-context");
    private static final AttributeKey<HttpClientConfig<?>> CLIENT_CONFIG = new AttributeKey<>("client-config");

    public static final <T extends HttpClientEngineConfig> HttpClientEngineFactory<T> config(final HttpClientEngineFactory<? extends T> httpClientEngineFactory, final l nested) {
        e0.checkNotNullParameter(httpClientEngineFactory, "<this>");
        e0.checkNotNullParameter(nested, "nested");
        return (HttpClientEngineFactory<T>) new HttpClientEngineFactory<T>() { // from class: io.ktor.client.engine.HttpClientEngineKt.config.1
            @Override // io.ktor.client.engine.HttpClientEngineFactory
            public HttpClientEngine create(l block) {
                e0.checkNotNullParameter(block, "block");
                return httpClientEngineFactory.create(new HttpClientEngineKt$config$1$create$1(nested, block));
            }
        };
    }

    public static final Object createCallContext(HttpClientEngine httpClientEngine, Job job, d<? super m> dVar) {
        CompletableJob completableJobJob = JobKt.Job(job);
        m mVarPlus = httpClientEngine.getCoroutineContext().plus(completableJobJob).plus(CALL_COROUTINE);
        Job job2 = (Job) dVar.getContext().get(Job.Key);
        if (job2 == null) {
            return mVarPlus;
        }
        completableJobJob.invokeOnCompletion(new UtilsKt.AnonymousClass2(Job.DefaultImpls.invokeOnCompletion$default(job2, true, false, new UtilsKt$attachToUserJob$cleanupHandler$1(completableJobJob), 2, null)));
        return mVarPlus;
    }

    public static final CoroutineName getCALL_COROUTINE() {
        return CALL_COROUTINE;
    }

    public static final AttributeKey<HttpClientConfig<?>> getCLIENT_CONFIG() {
        return CLIENT_CONFIG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateHeaders(HttpRequestData httpRequestData) {
        Set<String> setNames = httpRequestData.getHeaders().names();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setNames) {
            if (HttpHeaders.INSTANCE.getUnsafeHeadersList().contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new UnsafeHeaderException(arrayList.toString());
        }
    }
}
