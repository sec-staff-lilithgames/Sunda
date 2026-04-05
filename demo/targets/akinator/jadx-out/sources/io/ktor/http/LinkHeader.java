package io.ktor.http;

import java.util.List;
import kotlin.jvm.internal.e0;
import kv.l;
import p0.o2;
import sv.n0;
import uu.k0;
import uu.o0;
import uu.p0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class LinkHeader extends HeaderValueWithParameters {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Parameters {
        public static final String Anchor = "anchor";
        public static final String HrefLang = "hreflang";
        public static final Parameters INSTANCE = new Parameters();
        public static final String Media = "media";
        public static final String Rel = "rel";
        public static final String Rev = "Rev";
        public static final String Title = "title";
        public static final String Type = "type";

        private Parameters() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Rel {
        public static final String DnsPrefetch = "dns-prefetch";
        public static final Rel INSTANCE = new Rel();
        public static final String Next = "next";
        public static final String PreConnect = "preconnect";
        public static final String PreLoad = "preload";
        public static final String PreRender = "prerender";
        public static final String Prefetch = "prefetch";
        public static final String Stylesheet = "stylesheet";

        private Rel() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkHeader(String uri, List<HeaderValueParam> params) {
        super(o2.q(new StringBuilder("<"), uri, '>'), params);
        e0.checkNotNullParameter(uri, "uri");
        e0.checkNotNullParameter(params, "params");
    }

    public final String getUri() {
        return n0.removeSuffix(n0.removePrefix(getContent(), (CharSequence) "<"), (CharSequence) ">");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkHeader(String uri, String rel) {
        this(uri, (List<HeaderValueParam>) o0.listOf(new HeaderValueParam(Parameters.Rel, rel)));
        e0.checkNotNullParameter(uri, "uri");
        e0.checkNotNullParameter(rel, "rel");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkHeader(String uri, String... rel) {
        this(uri, (List<HeaderValueParam>) o0.listOf(new HeaderValueParam(Parameters.Rel, k0.joinToString$default(rel, " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null))));
        e0.checkNotNullParameter(uri, "uri");
        e0.checkNotNullParameter(rel, "rel");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkHeader(String uri, List<String> rel, ContentType type) {
        this(uri, (List<HeaderValueParam>) p0.listOf((Object[]) new HeaderValueParam[]{new HeaderValueParam(Parameters.Rel, y0.joinToString$default(rel, " ", null, null, 0, null, null, 62, null)), new HeaderValueParam("type", type.toString())}));
        e0.checkNotNullParameter(uri, "uri");
        e0.checkNotNullParameter(rel, "rel");
        e0.checkNotNullParameter(type, "type");
    }
}
