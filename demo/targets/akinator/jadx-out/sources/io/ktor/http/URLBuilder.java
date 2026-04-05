package io.ktor.http;

import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.ironsource.C3191e4;
import io.bidmachine.protobuf.EventTypeExtended;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class URLBuilder {
    public static final Companion Companion;
    private static final Url originUrl;
    private String encodedFragment;
    private ParametersBuilder encodedParameters;
    private String encodedPassword;
    private List<String> encodedPathSegments;
    private String encodedUser;
    private String host;
    private ParametersBuilder parameters;
    private int port;
    private URLProtocol protocol;
    private boolean trailingQuery;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        originUrl = URLUtilsKt.Url(URLBuilderJvmKt.getOrigin(companion));
    }

    public URLBuilder() {
        this(null, null, 0, null, null, null, null, null, false, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE, null);
    }

    private final void applyOrigin() {
        if (this.host.length() <= 0 && !e0.areEqual(this.protocol.getName(), C3191e4.h.f36473b)) {
            Url url = originUrl;
            this.host = url.getHost();
            if (e0.areEqual(this.protocol, URLProtocol.Companion.getHTTP())) {
                this.protocol = url.getProtocol();
            }
            if (this.port == 0) {
                this.port = url.getSpecifiedPort();
            }
        }
    }

    public final Url build() {
        applyOrigin();
        return new Url(this.protocol, this.host, this.port, getPathSegments(), this.parameters.build(), getFragment(), getUser(), getPassword(), this.trailingQuery, buildString());
    }

    public final String buildString() {
        applyOrigin();
        String string = ((StringBuilder) URLBuilderKt.appendTo(this, new StringBuilder(NotificationCompat.FLAG_LOCAL_ONLY))).toString();
        e0.checkNotNullExpressionValue(string, "appendTo(StringBuilder(256)).toString()");
        return string;
    }

    public final String getEncodedFragment() {
        return this.encodedFragment;
    }

    public final ParametersBuilder getEncodedParameters() {
        return this.encodedParameters;
    }

    public final String getEncodedPassword() {
        return this.encodedPassword;
    }

    public final List<String> getEncodedPathSegments() {
        return this.encodedPathSegments;
    }

    public final String getEncodedUser() {
        return this.encodedUser;
    }

    public final String getFragment() {
        return CodecsKt.decodeURLQueryComponent$default(this.encodedFragment, 0, 0, false, null, 15, null);
    }

    public final String getHost() {
        return this.host;
    }

    public final ParametersBuilder getParameters() {
        return this.parameters;
    }

    public final String getPassword() {
        String str = this.encodedPassword;
        if (str != null) {
            return CodecsKt.decodeURLPart$default(str, 0, 0, null, 7, null);
        }
        return null;
    }

    public final List<String> getPathSegments() {
        List<String> list = this.encodedPathSegments;
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(CodecsKt.decodeURLPart$default((String) it.next(), 0, 0, null, 7, null));
        }
        return arrayList;
    }

    public final int getPort() {
        return this.port;
    }

    public final URLProtocol getProtocol() {
        return this.protocol;
    }

    public final boolean getTrailingQuery() {
        return this.trailingQuery;
    }

    public final String getUser() {
        String str = this.encodedUser;
        if (str != null) {
            return CodecsKt.decodeURLPart$default(str, 0, 0, null, 7, null);
        }
        return null;
    }

    public final void setEncodedFragment(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.encodedFragment = str;
    }

    public final void setEncodedParameters(ParametersBuilder value) {
        e0.checkNotNullParameter(value, "value");
        this.encodedParameters = value;
        this.parameters = new UrlDecodedParametersBuilder(value);
    }

    public final void setEncodedPassword(String str) {
        this.encodedPassword = str;
    }

    public final void setEncodedPathSegments(List<String> list) {
        e0.checkNotNullParameter(list, "<set-?>");
        this.encodedPathSegments = list;
    }

    public final void setEncodedUser(String str) {
        this.encodedUser = str;
    }

    public final void setFragment(String value) {
        e0.checkNotNullParameter(value, "value");
        this.encodedFragment = CodecsKt.encodeURLQueryComponent$default(value, false, false, null, 7, null);
    }

    public final void setHost(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.host = str;
    }

    public final void setPassword(String str) {
        this.encodedPassword = str != null ? CodecsKt.encodeURLParameter$default(str, false, 1, null) : null;
    }

    public final void setPathSegments(List<String> value) {
        e0.checkNotNullParameter(value, "value");
        List<String> list = value;
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(CodecsKt.encodeURLPathPart((String) it.next()));
        }
        this.encodedPathSegments = arrayList;
    }

    public final void setPort(int i10) {
        this.port = i10;
    }

    public final void setProtocol(URLProtocol uRLProtocol) {
        e0.checkNotNullParameter(uRLProtocol, "<set-?>");
        this.protocol = uRLProtocol;
    }

    public final void setTrailingQuery(boolean z10) {
        this.trailingQuery = z10;
    }

    public final void setUser(String str) {
        this.encodedUser = str != null ? CodecsKt.encodeURLParameter$default(str, false, 1, null) : null;
    }

    public String toString() {
        String string = ((StringBuilder) URLBuilderKt.appendTo(this, new StringBuilder(NotificationCompat.FLAG_LOCAL_ONLY))).toString();
        e0.checkNotNullExpressionValue(string, "appendTo(StringBuilder(256)).toString()");
        return string;
    }

    public URLBuilder(URLProtocol protocol, String host, int i10, String str, String str2, List<String> list, Parameters parameters, String fragment, boolean z10) {
        e0.checkNotNullParameter(protocol, "protocol");
        e0.checkNotNullParameter(host, "host");
        e0.checkNotNullParameter(list, PtLatqAYjEFT.GpBVJEPnaThZaWB);
        e0.checkNotNullParameter(parameters, "parameters");
        e0.checkNotNullParameter(fragment, "fragment");
        this.protocol = protocol;
        this.host = host;
        this.port = i10;
        this.trailingQuery = z10;
        this.encodedUser = str != null ? CodecsKt.encodeURLParameter$default(str, false, 1, null) : null;
        this.encodedPassword = str2 != null ? CodecsKt.encodeURLParameter$default(str2, false, 1, null) : null;
        this.encodedFragment = CodecsKt.encodeURLQueryComponent$default(fragment, false, false, null, 7, null);
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(CodecsKt.encodeURLPathPart((String) it.next()));
        }
        this.encodedPathSegments = arrayList;
        ParametersBuilder parametersBuilderEncodeParameters = UrlDecodedParametersBuilderKt.encodeParameters(parameters);
        this.encodedParameters = parametersBuilderEncodeParameters;
        this.parameters = new UrlDecodedParametersBuilder(parametersBuilderEncodeParameters);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ URLBuilder(io.ktor.http.URLProtocol r4, java.lang.String r5, int r6, java.lang.String r7, java.lang.String r8, java.util.List r9, io.ktor.http.Parameters r10, java.lang.String r11, boolean r12, int r13, kotlin.jvm.internal.u r14) {
        /*
            r3 = this;
            r14 = r13 & 1
            if (r14 == 0) goto La
            io.ktor.http.URLProtocol$Companion r4 = io.ktor.http.URLProtocol.Companion
            io.ktor.http.URLProtocol r4 = r4.getHTTP()
        La:
            r14 = r13 & 2
            java.lang.String r0 = ""
            if (r14 == 0) goto L11
            r5 = r0
        L11:
            r14 = r13 & 4
            r1 = 0
            if (r14 == 0) goto L17
            r6 = r1
        L17:
            r14 = r13 & 8
            r2 = 0
            if (r14 == 0) goto L1d
            r7 = r2
        L1d:
            r14 = r13 & 16
            if (r14 == 0) goto L22
            r8 = r2
        L22:
            r14 = r13 & 32
            if (r14 == 0) goto L2a
            java.util.List r9 = uu.p0.emptyList()
        L2a:
            r14 = r13 & 64
            if (r14 == 0) goto L34
            io.ktor.http.Parameters$Companion r10 = io.ktor.http.Parameters.Companion
            io.ktor.http.Parameters r10 = r10.getEmpty()
        L34:
            r14 = r13 & 128(0x80, float:1.8E-43)
            if (r14 == 0) goto L39
            r11 = r0
        L39:
            r13 = r13 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L48
            r14 = r1
            r12 = r10
            r13 = r11
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r5 = r3
            goto L52
        L48:
            r14 = r12
            r13 = r11
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
        L52:
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.URLBuilder.<init>(io.ktor.http.URLProtocol, java.lang.String, int, java.lang.String, java.lang.String, java.util.List, io.ktor.http.Parameters, java.lang.String, boolean, int, kotlin.jvm.internal.u):void");
    }
}
