package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.http.ContentType;
import io.ktor.http.ContentTypesKt;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.content.TextContent;
import io.ktor.util.AttributeKey;
import io.ktor.util.KtorDsl;
import io.ktor.utils.io.charsets.CharsetJVMKt;
import io.ktor.utils.io.core.Input;
import io.ktor.utils.io.core.StringsKt;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.l;
import sv.g;
import tu.v;
import uu.r1;
import uu.y0;
import xu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpPlainText {
    public static final Plugin Plugin = new Plugin(null);
    private static final AttributeKey<HttpPlainText> key = new AttributeKey<>("HttpPlainText");
    private final String acceptCharsetHeader;
    private final Charset requestCharset;
    private final Charset responseCharsetFallback;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @KtorDsl
    public static final class Config {
        private Charset sendCharset;
        private final Set<Charset> charsets = new LinkedHashSet();
        private final Map<Charset, Float> charsetQuality = new LinkedHashMap();
        private Charset responseCharsetFallback = g.f86134b;

        public static /* synthetic */ void register$default(Config config, Charset charset, Float f10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                f10 = null;
            }
            config.register(charset, f10);
        }

        public final Map<Charset, Float> getCharsetQuality$ktor_client_core() {
            return this.charsetQuality;
        }

        public final Set<Charset> getCharsets$ktor_client_core() {
            return this.charsets;
        }

        public final Charset getResponseCharsetFallback() {
            return this.responseCharsetFallback;
        }

        public final Charset getSendCharset() {
            return this.sendCharset;
        }

        public final void register(Charset charset, Float f10) {
            e0.checkNotNullParameter(charset, "charset");
            if (f10 != null) {
                double dFloatValue = f10.floatValue();
                if (0.0d > dFloatValue || dFloatValue > 1.0d) {
                    throw new IllegalStateException("Check failed.");
                }
            }
            this.charsets.add(charset);
            if (f10 == null) {
                this.charsetQuality.remove(charset);
            } else {
                this.charsetQuality.put(charset, f10);
            }
        }

        public final void setResponseCharsetFallback(Charset charset) {
            e0.checkNotNullParameter(charset, "<set-?>");
            this.responseCharsetFallback = charset;
        }

        public final void setSendCharset(Charset charset) {
            this.sendCharset = charset;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Plugin implements HttpClientPlugin<Config, HttpPlainText> {
        public /* synthetic */ Plugin(u uVar) {
            this();
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public AttributeKey<HttpPlainText> getKey() {
            return HttpPlainText.key;
        }

        private Plugin() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(HttpPlainText plugin, HttpClient scope) {
            e0.checkNotNullParameter(plugin, "plugin");
            e0.checkNotNullParameter(scope, "scope");
            scope.getRequestPipeline().intercept(HttpRequestPipeline.Phases.getRender(), new HttpPlainText$Plugin$install$1(plugin, null));
            scope.getResponsePipeline().intercept(HttpResponsePipeline.Phases.getTransform(), new HttpPlainText$Plugin$install$2(plugin, null));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public HttpPlainText prepare(l block) {
            e0.checkNotNullParameter(block, "block");
            Config config = new Config();
            block.invoke(config);
            return new HttpPlainText(config.getCharsets$ktor_client_core(), config.getCharsetQuality$ktor_client_core(), config.getSendCharset(), config.getResponseCharsetFallback());
        }
    }

    public HttpPlainText(Set<? extends Charset> charsets, Map<Charset, Float> charsetQuality, Charset charset, Charset responseCharsetFallback) {
        e0.checkNotNullParameter(charsets, "charsets");
        e0.checkNotNullParameter(charsetQuality, "charsetQuality");
        e0.checkNotNullParameter(responseCharsetFallback, "responseCharsetFallback");
        this.responseCharsetFallback = responseCharsetFallback;
        List<v> listSortedWith = y0.sortedWith(r1.toList(charsetQuality), new Comparator() { // from class: io.ktor.client.plugins.HttpPlainText$special$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return d.compareValues((Float) ((v) t11).getSecond(), (Float) ((v) t10).getSecond());
            }
        });
        ArrayList arrayList = new ArrayList();
        for (Object obj : charsets) {
            if (!charsetQuality.containsKey((Charset) obj)) {
                arrayList.add(obj);
            }
        }
        List<Charset> listSortedWith2 = y0.sortedWith(arrayList, new Comparator() { // from class: io.ktor.client.plugins.HttpPlainText$special$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return d.compareValues(CharsetJVMKt.getName((Charset) t10), CharsetJVMKt.getName((Charset) t11));
            }
        });
        StringBuilder sb2 = new StringBuilder();
        for (Charset charset2 : listSortedWith2) {
            if (sb2.length() > 0) {
                sb2.append(",");
            }
            sb2.append(CharsetJVMKt.getName(charset2));
        }
        for (v vVar : listSortedWith) {
            Charset charset3 = (Charset) vVar.component1();
            float fFloatValue = ((Number) vVar.component2()).floatValue();
            if (sb2.length() > 0) {
                sb2.append(",");
            }
            double d10 = fFloatValue;
            if (0.0d > d10 || d10 > 1.0d) {
                throw new IllegalStateException("Check failed.");
            }
            sb2.append(CharsetJVMKt.getName(charset3) + ";q=" + (mv.d.roundToInt(100 * fFloatValue) / 100.0d));
        }
        if (sb2.length() == 0) {
            sb2.append(CharsetJVMKt.getName(this.responseCharsetFallback));
        }
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        this.acceptCharsetHeader = string;
        if (charset == null && (charset = (Charset) y0.firstOrNull(listSortedWith2)) == null) {
            v vVar2 = (v) y0.firstOrNull(listSortedWith);
            charset = vVar2 != null ? (Charset) vVar2.getFirst() : null;
            if (charset == null) {
                charset = g.f86134b;
            }
        }
        this.requestCharset = charset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object wrapContent(HttpRequestBuilder httpRequestBuilder, String str, ContentType contentType) {
        Charset charset;
        ContentType plain = contentType == null ? ContentType.Text.INSTANCE.getPlain() : contentType;
        if (contentType == null || (charset = ContentTypesKt.charset(contentType)) == null) {
            charset = this.requestCharset;
        }
        HttpPlainTextKt.LOGGER.trace("Sending request body to " + httpRequestBuilder.getUrl() + " as text/plain with charset " + charset);
        return new TextContent(str, ContentTypesKt.withCharset(plain, charset), null, 4, null);
    }

    public final void addCharsetHeaders$ktor_client_core(HttpRequestBuilder context) {
        e0.checkNotNullParameter(context, "context");
        HeadersBuilder headers = context.getHeaders();
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        if (headers.get(httpHeaders.getAcceptCharset()) != null) {
            return;
        }
        HttpPlainTextKt.LOGGER.trace("Adding Accept-Charset=" + this.acceptCharsetHeader + " to " + context.getUrl());
        context.getHeaders().set(httpHeaders.getAcceptCharset(), this.acceptCharsetHeader);
    }

    public final String read$ktor_client_core(HttpClientCall call, Input body) {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(body, "body");
        Charset charset = HttpMessagePropertiesKt.charset(call.getResponse());
        if (charset == null) {
            charset = this.responseCharsetFallback;
        }
        HttpPlainTextKt.LOGGER.trace("Reading response body for " + call.getRequest().getUrl() + " as String with charset " + charset);
        return StringsKt.readText$default(body, charset, 0, 2, (Object) null);
    }
}
