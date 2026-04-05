package io.ktor.client.engine;

import io.ktor.client.utils.HeadersKt;
import io.ktor.http.ContentType;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.InternalAPI;
import io.ktor.util.PlatformUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kv.l;
import kv.p;
import tu.x0;
import uu.c2;
import uu.y0;
import zu.d;
import zu.k;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class UtilsKt {
    private static final Set<String> DATE_HEADERS;
    private static final String KTOR_DEFAULT_USER_AGENT = "Ktor client";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.engine.UtilsKt$attachToUserJob$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f0 implements l {
        final /* synthetic */ DisposableHandle $cleanupHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DisposableHandle disposableHandle) {
            super(1);
            this.$cleanupHandler = disposableHandle;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }

        public final void invoke(Throwable th2) {
            this.$cleanupHandler.dispose();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.engine.UtilsKt$mergeHeaders$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        final /* synthetic */ OutgoingContent $content;
        final /* synthetic */ Headers $requestHeaders;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Headers headers, OutgoingContent outgoingContent) {
            super(1);
            this.$requestHeaders = headers;
            this.$content = outgoingContent;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HeadersBuilder) obj);
            return x0.f87415a;
        }

        public final void invoke(HeadersBuilder buildHeaders) {
            e0.checkNotNullParameter(buildHeaders, "$this$buildHeaders");
            buildHeaders.appendAll(this.$requestHeaders);
            buildHeaders.appendAll(this.$content.getHeaders());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.engine.UtilsKt$mergeHeaders$2, reason: invalid class name and case insensitive filesystem */
    public static final class C38952 extends f0 implements p {
        final /* synthetic */ p $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38952(p pVar) {
            super(2);
            this.$block = pVar;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((String) obj, (List<String>) obj2);
            return x0.f87415a;
        }

        public final void invoke(String key, List<String> values) {
            e0.checkNotNullParameter(key, "key");
            e0.checkNotNullParameter(values, "values");
            HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
            if (e0.areEqual(httpHeaders.getContentLength(), key) || e0.areEqual(httpHeaders.getContentType(), key)) {
                return;
            }
            if (!UtilsKt.DATE_HEADERS.contains(key)) {
                this.$block.invoke(key, y0.joinToString$default(values, e0.areEqual(httpHeaders.getCookie(), key) ? "; " : ",", null, null, 0, null, null, 62, null));
                return;
            }
            p pVar = this.$block;
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                pVar.invoke(key, (String) it.next());
            }
        }
    }

    static {
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        DATE_HEADERS = c2.setOf((Object[]) new String[]{httpHeaders.getDate(), httpHeaders.getExpires(), httpHeaders.getLastModified(), httpHeaders.getIfModifiedSince(), httpHeaders.getIfUnmodifiedSince()});
    }

    public static final Object attachToUserJob(Job job, d<? super x0> dVar) {
        Job job2 = (Job) dVar.getContext().get(Job.Key);
        x0 x0Var = x0.f87415a;
        if (job2 == null) {
            return x0Var;
        }
        job.invokeOnCompletion(new AnonymousClass2(Job.DefaultImpls.invokeOnCompletion$default(job2, true, false, new UtilsKt$attachToUserJob$cleanupHandler$1(job), 2, null)));
        return x0Var;
    }

    private static final Object attachToUserJob$$forInline(Job job, d<? super x0> dVar) {
        b0.mark(3);
        throw null;
    }

    @InternalAPI
    public static final Object callContext(d<? super m> dVar) {
        k kVar = dVar.getContext().get(KtorCallContextElement.Companion);
        e0.checkNotNull(kVar);
        return ((KtorCallContextElement) kVar).getCallContext();
    }

    public static final String getKTOR_DEFAULT_USER_AGENT() {
        return KTOR_DEFAULT_USER_AGENT;
    }

    @InternalAPI
    public static final void mergeHeaders(Headers requestHeaders, OutgoingContent content, p block) {
        String string;
        String string2;
        e0.checkNotNullParameter(requestHeaders, "requestHeaders");
        e0.checkNotNullParameter(content, "content");
        e0.checkNotNullParameter(block, "block");
        HeadersKt.buildHeaders(new AnonymousClass1(requestHeaders, content)).forEach(new C38952(block));
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        if (requestHeaders.get(httpHeaders.getUserAgent()) == null && content.getHeaders().get(httpHeaders.getUserAgent()) == null && needUserAgent()) {
            block.invoke(httpHeaders.getUserAgent(), KTOR_DEFAULT_USER_AGENT);
        }
        ContentType contentType = content.getContentType();
        if ((contentType == null || (string = contentType.toString()) == null) && (string = content.getHeaders().get(httpHeaders.getContentType())) == null) {
            string = requestHeaders.get(httpHeaders.getContentType());
        }
        Long contentLength = content.getContentLength();
        if ((contentLength == null || (string2 = contentLength.toString()) == null) && (string2 = content.getHeaders().get(httpHeaders.getContentLength())) == null) {
            string2 = requestHeaders.get(httpHeaders.getContentLength());
        }
        if (string != null) {
            block.invoke(httpHeaders.getContentType(), string);
        }
        if (string2 != null) {
            block.invoke(httpHeaders.getContentLength(), string2);
        }
    }

    private static final boolean needUserAgent() {
        return !PlatformUtils.INSTANCE.getIS_BROWSER();
    }

    @InternalAPI
    public static /* synthetic */ void getKTOR_DEFAULT_USER_AGENT$annotations() {
    }
}
