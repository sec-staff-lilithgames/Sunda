package io.ktor.client.plugins.cache;

import bx.a;
import com.unity3d.services.core.network.model.HttpRequest;
import io.ktor.client.engine.UtilsKt;
import io.ktor.http.ContentType;
import io.ktor.http.HttpHeaders;
import io.ktor.http.URLProtocol;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import uu.p0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpCacheKt {
    private static final a LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpCache");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.cache.HttpCacheKt$mergedHeadersLookup$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        final /* synthetic */ l $allHeadersExtractor;
        final /* synthetic */ OutgoingContent $content;
        final /* synthetic */ l $headerExtractor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OutgoingContent outgoingContent, l lVar, l lVar2) {
            super(1);
            this.$content = outgoingContent;
            this.$headerExtractor = lVar;
            this.$allHeadersExtractor = lVar2;
        }

        @Override // kv.l
        public final String invoke(String header) {
            String string;
            String string2;
            e0.checkNotNullParameter(header, "header");
            HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
            if (e0.areEqual(header, httpHeaders.getContentLength())) {
                Long contentLength = this.$content.getContentLength();
                return (contentLength == null || (string2 = contentLength.toString()) == null) ? "" : string2;
            }
            if (e0.areEqual(header, httpHeaders.getContentType())) {
                ContentType contentType = this.$content.getContentType();
                return (contentType == null || (string = contentType.toString()) == null) ? "" : string;
            }
            if (e0.areEqual(header, httpHeaders.getUserAgent())) {
                String str = this.$content.getHeaders().get(httpHeaders.getUserAgent());
                if (str != null) {
                    return str;
                }
                String str2 = (String) this.$headerExtractor.invoke(httpHeaders.getUserAgent());
                return str2 == null ? UtilsKt.getKTOR_DEFAULT_USER_AGENT() : str2;
            }
            List<String> all = this.$content.getHeaders().getAll(header);
            if (all == null && (all = (List) this.$allHeadersExtractor.invoke(header)) == null) {
                all = p0.emptyList();
            }
            return y0.joinToString$default(all, ";", null, null, 0, null, null, 62, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean canStore(URLProtocol uRLProtocol) {
        return e0.areEqual(uRLProtocol.getName(), "http") || e0.areEqual(uRLProtocol.getName(), HttpRequest.DEFAULT_SCHEME);
    }

    public static final a getLOGGER() {
        return LOGGER;
    }

    public static final l mergedHeadersLookup(OutgoingContent content, l headerExtractor, l allHeadersExtractor) {
        e0.checkNotNullParameter(content, "content");
        e0.checkNotNullParameter(headerExtractor, "headerExtractor");
        e0.checkNotNullParameter(allHeadersExtractor, "allHeadersExtractor");
        return new AnonymousClass1(content, headerExtractor, allHeadersExtractor);
    }
}
