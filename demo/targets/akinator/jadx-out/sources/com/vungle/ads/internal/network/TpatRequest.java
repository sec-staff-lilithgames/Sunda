package com.vungle.ads.internal.network;

import com.vungle.ads.internal.util.LogEntry;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class TpatRequest {
    public static final Companion Companion = new Companion(null);
    private static final int PRIORITY_MAX_RETRY_COUNT = 3;
    private static final int REGULAR_MAX_RETRY_COUNT = 5;
    private final String body;
    private final Map<String, String> headers;
    private final LogEntry logEntry;
    private final HttpMethod method;
    private final Boolean priorityRetry;
    private final int priorityRetryCount;
    private final boolean regularRetry;
    private final int regularRetryCount;
    private final String tpatKey;
    private final String url;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {
        private String body;
        private Map<String, String> headers;
        private LogEntry logEntry;
        private HttpMethod method;
        private Boolean priorityRetry;
        private int priorityRetryCount;
        private boolean regularRetry;
        private int regularRetryCount;
        private String tpatKey;
        private final String url;

        public Builder(String url) {
            e0.checkNotNullParameter(url, "url");
            this.url = url;
            this.method = HttpMethod.GET;
            this.priorityRetryCount = 3;
            this.regularRetry = true;
            this.regularRetryCount = 5;
        }

        public final Builder body(String str) {
            this.body = str;
            return this;
        }

        public final TpatRequest build() {
            return new TpatRequest(this.url, this.method, this.headers, this.body, this.priorityRetry, this.priorityRetryCount, this.regularRetry, this.regularRetryCount, this.tpatKey, this.logEntry, null);
        }

        public final Builder get() {
            this.method = HttpMethod.GET;
            return this;
        }

        public final String getUrl() {
            return this.url;
        }

        public final Builder headers(Map<String, String> map) {
            this.headers = map;
            return this;
        }

        public final Builder method(HttpMethod method) {
            e0.checkNotNullParameter(method, "method");
            this.method = method;
            return this;
        }

        public final Builder post() {
            this.method = HttpMethod.POST;
            return this;
        }

        public final Builder priorityRetry(boolean z10) {
            this.priorityRetry = Boolean.valueOf(z10);
            return this;
        }

        public final Builder priorityRetryCount(int i10) {
            this.priorityRetryCount = i10;
            return this;
        }

        public final Builder regularRetry(boolean z10) {
            this.regularRetry = z10;
            return this;
        }

        public final Builder regularRetryCount(int i10) {
            this.regularRetryCount = i10;
            return this;
        }

        public final Builder tpatKey(String str) {
            this.tpatKey = str;
            return this;
        }

        public final Builder withLogEntry(LogEntry logEntry) {
            this.logEntry = logEntry;
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ TpatRequest(String str, HttpMethod httpMethod, Map map, String str2, Boolean bool, int i10, boolean z10, int i11, String str3, LogEntry logEntry, u uVar) {
        this(str, httpMethod, map, str2, bool, i10, z10, i11, str3, logEntry);
    }

    public final String getBody() {
        return this.body;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final LogEntry getLogEntry() {
        return this.logEntry;
    }

    public final HttpMethod getMethod() {
        return this.method;
    }

    public final Boolean getPriorityRetry() {
        return this.priorityRetry;
    }

    public final int getPriorityRetryCount() {
        return this.priorityRetryCount;
    }

    public final boolean getRegularRetry() {
        return this.regularRetry;
    }

    public final int getRegularRetryCount() {
        return this.regularRetryCount;
    }

    public final String getTpatKey() {
        return this.tpatKey;
    }

    public final String getUrl() {
        return this.url;
    }

    private TpatRequest(String str, HttpMethod httpMethod, Map<String, String> map, String str2, Boolean bool, int i10, boolean z10, int i11, String str3, LogEntry logEntry) {
        this.url = str;
        this.method = httpMethod;
        this.headers = map;
        this.body = str2;
        this.priorityRetry = bool;
        this.priorityRetryCount = i10;
        this.regularRetry = z10;
        this.regularRetryCount = i11;
        this.tpatKey = str3;
        this.logEntry = logEntry;
    }
}
