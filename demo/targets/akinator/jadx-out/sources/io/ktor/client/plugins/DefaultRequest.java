package io.ktor.client.plugins;

import io.bidmachine.protobuf.EventTypeExtended;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpMessageBuilder;
import io.ktor.http.ParametersBuilder;
import io.ktor.http.ParametersKt;
import io.ktor.http.URLBuilder;
import io.ktor.http.URLBuilderKt;
import io.ktor.http.URLParserKt;
import io.ktor.http.URLProtocol;
import io.ktor.http.URLUtilsKt;
import io.ktor.http.Url;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.AttributesJvmKt;
import io.ktor.util.KtorDsl;
import io.ktor.util.StringValuesKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.l;
import uu.o0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class DefaultRequest {
    public static final Plugin Plugin = new Plugin(null);
    private static final AttributeKey<DefaultRequest> key = new AttributeKey<>("DefaultRequest");
    private final l block;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @KtorDsl
    public static final class DefaultRequestBuilder implements HttpMessageBuilder {
        private final HeadersBuilder headers = new HeadersBuilder(0, 1, null);
        private final URLBuilder url = new URLBuilder(null, null, 0, null, null, null, null, null, false, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE, null);
        private final Attributes attributes = AttributesJvmKt.Attributes(true);

        public static /* synthetic */ void url$default(DefaultRequestBuilder defaultRequestBuilder, String str, String str2, Integer num, String str3, l lVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            if ((i10 & 4) != 0) {
                num = null;
            }
            if ((i10 & 8) != 0) {
                str3 = null;
            }
            if ((i10 & 16) != 0) {
                lVar = DefaultRequest$DefaultRequestBuilder$url$1.INSTANCE;
            }
            defaultRequestBuilder.url(str, str2, num, str3, lVar);
        }

        public final Attributes getAttributes() {
            return this.attributes;
        }

        @Override // io.ktor.http.HttpMessageBuilder
        public HeadersBuilder getHeaders() {
            return this.headers;
        }

        public final String getHost() {
            return this.url.getHost();
        }

        public final int getPort() {
            return this.url.getPort();
        }

        public final URLBuilder getUrl() {
            return this.url;
        }

        public final void setAttributes(l block) {
            e0.checkNotNullParameter(block, "block");
            block.invoke(this.attributes);
        }

        public final void setHost(String value) {
            e0.checkNotNullParameter(value, "value");
            this.url.setHost(value);
        }

        public final void setPort(int i10) {
            this.url.setPort(i10);
        }

        public final void url(l block) {
            e0.checkNotNullParameter(block, "block");
            block.invoke(this.url);
        }

        public final void url(String str, String str2, Integer num, String str3, l block) {
            e0.checkNotNullParameter(block, "block");
            URLBuilderKt.set(this.url, str, str2, num, str3, block);
        }

        public final void url(String urlString) {
            e0.checkNotNullParameter(urlString, "urlString");
            URLParserKt.takeFrom(this.url, urlString);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Plugin implements HttpClientPlugin<DefaultRequestBuilder, DefaultRequest> {
        public /* synthetic */ Plugin(u uVar) {
            this();
        }

        private final List<String> concatenatePath(List<String> list, List<String> list2) {
            if (list2.isEmpty()) {
                return list;
            }
            if (list.isEmpty() || ((CharSequence) y0.first((List) list2)).length() == 0) {
                return list2;
            }
            List listCreateListBuilder = o0.createListBuilder((list2.size() + list.size()) - 1);
            int size = list.size() - 1;
            for (int i10 = 0; i10 < size; i10++) {
                listCreateListBuilder.add(list.get(i10));
            }
            listCreateListBuilder.addAll(list2);
            return o0.build(listCreateListBuilder);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void mergeUrls(Url url, URLBuilder uRLBuilder) {
            if (e0.areEqual(uRLBuilder.getProtocol(), URLProtocol.Companion.getHTTP())) {
                uRLBuilder.setProtocol(url.getProtocol());
            }
            if (uRLBuilder.getHost().length() > 0) {
                return;
            }
            URLBuilder URLBuilder = URLUtilsKt.URLBuilder(url);
            URLBuilder.setProtocol(uRLBuilder.getProtocol());
            if (uRLBuilder.getPort() != 0) {
                URLBuilder.setPort(uRLBuilder.getPort());
            }
            URLBuilder.setEncodedPathSegments(DefaultRequest.Plugin.concatenatePath(URLBuilder.getEncodedPathSegments(), uRLBuilder.getEncodedPathSegments()));
            if (uRLBuilder.getEncodedFragment().length() > 0) {
                URLBuilder.setEncodedFragment(uRLBuilder.getEncodedFragment());
            }
            ParametersBuilder parametersBuilderParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
            StringValuesKt.appendAll(parametersBuilderParametersBuilder$default, URLBuilder.getEncodedParameters());
            URLBuilder.setEncodedParameters(uRLBuilder.getEncodedParameters());
            Iterator<T> it = parametersBuilderParametersBuilder$default.entries().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (!URLBuilder.getEncodedParameters().contains(str)) {
                    URLBuilder.getEncodedParameters().appendAll(str, list);
                }
            }
            URLUtilsKt.takeFrom(uRLBuilder, URLBuilder);
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public AttributeKey<DefaultRequest> getKey() {
            return DefaultRequest.key;
        }

        private Plugin() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(DefaultRequest plugin, HttpClient scope) {
            e0.checkNotNullParameter(plugin, "plugin");
            e0.checkNotNullParameter(scope, "scope");
            scope.getRequestPipeline().intercept(HttpRequestPipeline.Phases.getBefore(), new DefaultRequest$Plugin$install$1(plugin, null));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public DefaultRequest prepare(l block) {
            e0.checkNotNullParameter(block, "block");
            return new DefaultRequest(block, null);
        }
    }

    public /* synthetic */ DefaultRequest(l lVar, u uVar) {
        this(lVar);
    }

    private DefaultRequest(l lVar) {
        this.block = lVar;
    }
}
