package io.ktor.http;

import com.ironsource.C3271ic;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpMethod {
    public static final Companion Companion = new Companion(null);
    private static final List<HttpMethod> DefaultMethods;
    private static final HttpMethod Delete;
    private static final HttpMethod Get;
    private static final HttpMethod Head;
    private static final HttpMethod Options;
    private static final HttpMethod Patch;
    private static final HttpMethod Post;
    private static final HttpMethod Put;
    private final String value;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final List<HttpMethod> getDefaultMethods() {
            return HttpMethod.DefaultMethods;
        }

        public final HttpMethod getDelete() {
            return HttpMethod.Delete;
        }

        public final HttpMethod getGet() {
            return HttpMethod.Get;
        }

        public final HttpMethod getHead() {
            return HttpMethod.Head;
        }

        public final HttpMethod getOptions() {
            return HttpMethod.Options;
        }

        public final HttpMethod getPatch() {
            return HttpMethod.Patch;
        }

        public final HttpMethod getPost() {
            return HttpMethod.Post;
        }

        public final HttpMethod getPut() {
            return HttpMethod.Put;
        }

        public final HttpMethod parse(String method) {
            e0.checkNotNullParameter(method, "method");
            return e0.areEqual(method, getGet().getValue()) ? getGet() : e0.areEqual(method, getPost().getValue()) ? getPost() : e0.areEqual(method, getPut().getValue()) ? getPut() : e0.areEqual(method, getPatch().getValue()) ? getPatch() : e0.areEqual(method, getDelete().getValue()) ? getDelete() : e0.areEqual(method, getHead().getValue()) ? getHead() : e0.areEqual(method, getOptions().getValue()) ? getOptions() : new HttpMethod(method);
        }

        private Companion() {
        }
    }

    static {
        HttpMethod httpMethod = new HttpMethod(C3271ic.f36943a);
        Get = httpMethod;
        HttpMethod httpMethod2 = new HttpMethod(C3271ic.f36944b);
        Post = httpMethod2;
        HttpMethod httpMethod3 = new HttpMethod("PUT");
        Put = httpMethod3;
        HttpMethod httpMethod4 = new HttpMethod("PATCH");
        Patch = httpMethod4;
        HttpMethod httpMethod5 = new HttpMethod("DELETE");
        Delete = httpMethod5;
        HttpMethod httpMethod6 = new HttpMethod("HEAD");
        Head = httpMethod6;
        HttpMethod httpMethod7 = new HttpMethod("OPTIONS");
        Options = httpMethod7;
        DefaultMethods = p0.listOf((Object[]) new HttpMethod[]{httpMethod, httpMethod2, httpMethod3, httpMethod4, httpMethod5, httpMethod6, httpMethod7});
    }

    public HttpMethod(String value) {
        e0.checkNotNullParameter(value, "value");
        this.value = value;
    }

    public static /* synthetic */ HttpMethod copy$default(HttpMethod httpMethod, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = httpMethod.value;
        }
        return httpMethod.copy(str);
    }

    public final String component1() {
        return this.value;
    }

    public final HttpMethod copy(String value) {
        e0.checkNotNullParameter(value, "value");
        return new HttpMethod(value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HttpMethod) && e0.areEqual(this.value, ((HttpMethod) obj).value);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return o2.q(new StringBuilder("HttpMethod(value="), this.value, ')');
    }
}
