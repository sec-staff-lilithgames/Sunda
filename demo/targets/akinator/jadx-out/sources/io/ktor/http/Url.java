package io.ktor.http;

import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Url {
    public static final Companion Companion = new Companion(null);
    private final o encodedFragment$delegate;
    private final o encodedPassword$delegate;
    private final o encodedPath$delegate;
    private final o encodedPathAndQuery$delegate;
    private final o encodedQuery$delegate;
    private final o encodedUser$delegate;
    private final String fragment;
    private final String host;
    private final Parameters parameters;
    private final String password;
    private final List<String> pathSegments;
    private final URLProtocol protocol;
    private final int specifiedPort;
    private final boolean trailingQuery;
    private final String urlString;
    private final String user;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public Url(URLProtocol protocol, String host, int i10, List<String> pathSegments, Parameters parameters, String fragment, String str, String str2, boolean z10, String urlString) {
        e0.checkNotNullParameter(protocol, "protocol");
        e0.checkNotNullParameter(host, "host");
        e0.checkNotNullParameter(pathSegments, "pathSegments");
        e0.checkNotNullParameter(parameters, "parameters");
        e0.checkNotNullParameter(fragment, "fragment");
        e0.checkNotNullParameter(urlString, "urlString");
        this.protocol = protocol;
        this.host = host;
        this.specifiedPort = i10;
        this.pathSegments = pathSegments;
        this.parameters = parameters;
        this.fragment = fragment;
        this.user = str;
        this.password = str2;
        this.trailingQuery = z10;
        this.urlString = urlString;
        if ((i10 < 0 || i10 >= 65536) && i10 != 0) {
            throw new IllegalArgumentException("port must be between 0 and 65535, or 0 if not set");
        }
        this.encodedPath$delegate = q.lazy(new Url$encodedPath$2(this));
        this.encodedQuery$delegate = q.lazy(new Url$encodedQuery$2(this));
        this.encodedPathAndQuery$delegate = q.lazy(new Url$encodedPathAndQuery$2(this));
        this.encodedUser$delegate = q.lazy(new Url$encodedUser$2(this));
        this.encodedPassword$delegate = q.lazy(new Url$encodedPassword$2(this));
        this.encodedFragment$delegate = q.lazy(new Url$encodedFragment$2(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Url.class == obj.getClass() && e0.areEqual(this.urlString, ((Url) obj).urlString);
    }

    public final String getEncodedFragment() {
        return (String) this.encodedFragment$delegate.getValue();
    }

    public final String getEncodedPassword() {
        return (String) this.encodedPassword$delegate.getValue();
    }

    public final String getEncodedPath() {
        return (String) this.encodedPath$delegate.getValue();
    }

    public final String getEncodedPathAndQuery() {
        return (String) this.encodedPathAndQuery$delegate.getValue();
    }

    public final String getEncodedQuery() {
        return (String) this.encodedQuery$delegate.getValue();
    }

    public final String getEncodedUser() {
        return (String) this.encodedUser$delegate.getValue();
    }

    public final String getFragment() {
        return this.fragment;
    }

    public final String getHost() {
        return this.host;
    }

    public final Parameters getParameters() {
        return this.parameters;
    }

    public final String getPassword() {
        return this.password;
    }

    public final List<String> getPathSegments() {
        return this.pathSegments;
    }

    public final int getPort() {
        Integer numValueOf = Integer.valueOf(this.specifiedPort);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : this.protocol.getDefaultPort();
    }

    public final URLProtocol getProtocol() {
        return this.protocol;
    }

    public final int getSpecifiedPort() {
        return this.specifiedPort;
    }

    public final boolean getTrailingQuery() {
        return this.trailingQuery;
    }

    public final String getUser() {
        return this.user;
    }

    public int hashCode() {
        return this.urlString.hashCode();
    }

    public String toString() {
        return this.urlString;
    }
}
