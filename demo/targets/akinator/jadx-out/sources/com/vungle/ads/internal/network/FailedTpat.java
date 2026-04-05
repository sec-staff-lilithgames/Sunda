package com.vungle.ads.internal.network;

import e3.g;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p0.o2;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class FailedTpat {
    public static final Companion Companion = new Companion(null);
    private final String body;
    private final Map<String, String> headers;
    private final HttpMethod method;
    private int retryAttempt;
    private int retryCount;
    private String tpatKey;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<FailedTpat> serializer() {
            return FailedTpat$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @f
    public /* synthetic */ FailedTpat(int i10, HttpMethod httpMethod, Map map, String str, int i11, int i12, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (16 != (i10 & 16)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 16, FailedTpat$$serializer.INSTANCE.getDescriptor());
        }
        this.method = (i10 & 1) == 0 ? HttpMethod.GET : httpMethod;
        if ((i10 & 2) == 0) {
            this.headers = null;
        } else {
            this.headers = map;
        }
        if ((i10 & 4) == 0) {
            this.body = null;
        } else {
            this.body = str;
        }
        if ((i10 & 8) == 0) {
            this.retryAttempt = 0;
        } else {
            this.retryAttempt = i11;
        }
        this.retryCount = i12;
        if ((i10 & 32) == 0) {
            this.tpatKey = null;
        } else {
            this.tpatKey = str2;
        }
    }

    public static /* synthetic */ FailedTpat copy$default(FailedTpat failedTpat, HttpMethod httpMethod, Map map, String str, int i10, int i11, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            httpMethod = failedTpat.method;
        }
        if ((i12 & 2) != 0) {
            map = failedTpat.headers;
        }
        if ((i12 & 4) != 0) {
            str = failedTpat.body;
        }
        if ((i12 & 8) != 0) {
            i10 = failedTpat.retryAttempt;
        }
        if ((i12 & 16) != 0) {
            i11 = failedTpat.retryCount;
        }
        if ((i12 & 32) != 0) {
            str2 = failedTpat.tpatKey;
        }
        int i13 = i11;
        String str3 = str2;
        return failedTpat.copy(httpMethod, map, str, i10, i13, str3);
    }

    public static final void write$Self(FailedTpat self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.method != HttpMethod.GET) {
            output.encodeSerializableElement(serialDesc, 0, HttpMethod$$serializer.INSTANCE, self.method);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.headers != null) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            output.encodeNullableSerializableElement(serialDesc, 1, new LinkedHashMapSerializer(stringSerializer, stringSerializer), self.headers);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.body != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.body);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.retryAttempt != 0) {
            output.encodeIntElement(serialDesc, 3, self.retryAttempt);
        }
        output.encodeIntElement(serialDesc, 4, self.retryCount);
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.tpatKey == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.tpatKey);
    }

    public final HttpMethod component1() {
        return this.method;
    }

    public final Map<String, String> component2() {
        return this.headers;
    }

    public final String component3() {
        return this.body;
    }

    public final int component4() {
        return this.retryAttempt;
    }

    public final int component5() {
        return this.retryCount;
    }

    public final String component6() {
        return this.tpatKey;
    }

    public final FailedTpat copy(HttpMethod method, Map<String, String> map, String str, int i10, int i11, String str2) {
        e0.checkNotNullParameter(method, "method");
        return new FailedTpat(method, map, str, i10, i11, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FailedTpat)) {
            return false;
        }
        FailedTpat failedTpat = (FailedTpat) obj;
        return this.method == failedTpat.method && e0.areEqual(this.headers, failedTpat.headers) && e0.areEqual(this.body, failedTpat.body) && this.retryAttempt == failedTpat.retryAttempt && this.retryCount == failedTpat.retryCount && e0.areEqual(this.tpatKey, failedTpat.tpatKey);
    }

    public final String getBody() {
        return this.body;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final HttpMethod getMethod() {
        return this.method;
    }

    public final int getRetryAttempt() {
        return this.retryAttempt;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    public final String getTpatKey() {
        return this.tpatKey;
    }

    public int hashCode() {
        int iHashCode = this.method.hashCode() * 31;
        Map<String, String> map = this.headers;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.body;
        int iD = g.d(this.retryCount, g.d(this.retryAttempt, (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        String str2 = this.tpatKey;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setRetryAttempt(int i10) {
        this.retryAttempt = i10;
    }

    public final void setRetryCount(int i10) {
        this.retryCount = i10;
    }

    public final void setTpatKey(String str) {
        this.tpatKey = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FailedTpat(method=");
        sb2.append(this.method);
        sb2.append(", headers=");
        sb2.append(this.headers);
        sb2.append(", body=");
        sb2.append(this.body);
        sb2.append(", retryAttempt=");
        sb2.append(this.retryAttempt);
        sb2.append(", retryCount=");
        sb2.append(this.retryCount);
        sb2.append(", tpatKey=");
        return o2.q(sb2, this.tpatKey, ')');
    }

    public FailedTpat(HttpMethod method, Map<String, String> map, String str, int i10, int i11, String str2) {
        e0.checkNotNullParameter(method, "method");
        this.method = method;
        this.headers = map;
        this.body = str;
        this.retryAttempt = i10;
        this.retryCount = i11;
        this.tpatKey = str2;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ FailedTpat(com.vungle.ads.internal.network.HttpMethod r2, java.util.Map r3, java.lang.String r4, int r5, int r6, java.lang.String r7, int r8, kotlin.jvm.internal.u r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            com.vungle.ads.internal.network.HttpMethod r2 = com.vungle.ads.internal.network.HttpMethod.GET
        L6:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Lc
            r3 = r0
        Lc:
            r9 = r8 & 4
            if (r9 == 0) goto L11
            r4 = r0
        L11:
            r9 = r8 & 8
            if (r9 == 0) goto L16
            r5 = 0
        L16:
            r8 = r8 & 32
            if (r8 == 0) goto L22
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L29
        L22:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L29:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.network.FailedTpat.<init>(com.vungle.ads.internal.network.HttpMethod, java.util.Map, java.lang.String, int, int, java.lang.String, int, kotlin.jvm.internal.u):void");
    }
}
