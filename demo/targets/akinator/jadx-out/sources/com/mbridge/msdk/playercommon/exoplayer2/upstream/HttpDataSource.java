package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import a.b;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.Predicate;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface HttpDataSource extends DataSource {
    public static final Predicate<String> REJECT_PAYWALL_TYPES = new Predicate<String>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.util.Predicate
        public boolean evaluate(String str) {
            String lowerInvariant = Util.toLowerInvariant(str);
            if (TextUtils.isEmpty(lowerInvariant)) {
                return false;
            }
            return ((lowerInvariant.contains("text") && !lowerInvariant.contains(MimeTypes.TEXT_VTT)) || lowerInvariant.contains("html") || lowerInvariant.contains("xml")) ? false : true;
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class BaseFactory implements Factory {
        private final RequestProperties defaultRequestProperties = new RequestProperties();

        @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource.Factory
        @Deprecated
        public final void clearAllDefaultRequestProperties() {
            this.defaultRequestProperties.clear();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource.Factory
        @Deprecated
        public final void clearDefaultRequestProperty(String str) {
            this.defaultRequestProperties.remove(str);
        }

        public abstract HttpDataSource createDataSourceInternal(RequestProperties requestProperties);

        @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource.Factory
        public final RequestProperties getDefaultRequestProperties() {
            return this.defaultRequestProperties;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource.Factory
        @Deprecated
        public final void setDefaultRequestProperty(String str, String str2) {
            this.defaultRequestProperties.set(str, str2);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource.Factory, com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource.Factory
        public final HttpDataSource createDataSource() {
            return createDataSourceInternal(this.defaultRequestProperties);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Factory extends DataSource.Factory {
        @Deprecated
        void clearAllDefaultRequestProperties();

        @Deprecated
        void clearDefaultRequestProperty(String str);

        @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource.Factory
        HttpDataSource createDataSource();

        RequestProperties getDefaultRequestProperties();

        @Deprecated
        void setDefaultRequestProperty(String str, String str2);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class InvalidContentTypeException extends HttpDataSourceException {
        public final String contentType;

        public InvalidContentTypeException(String str, DataSpec dataSpec) {
            super(b.k("Invalid content type: ", str), dataSpec, 1);
            this.contentType = str;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class InvalidResponseCodeException extends HttpDataSourceException {
        public final Map<String, List<String>> headerFields;
        public final int responseCode;

        public InvalidResponseCodeException(int i10, Map<String, List<String>> map, DataSpec dataSpec) {
            super(b.e(i10, "Response code: "), dataSpec, 1);
            this.responseCode = i10;
            this.headerFields = map;
        }
    }

    void clearAllRequestProperties();

    void clearRequestProperty(String str);

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    void close() throws HttpDataSourceException;

    Map<String, List<String>> getResponseHeaders();

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    long open(DataSpec dataSpec) throws HttpDataSourceException;

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    int read(byte[] bArr, int i10, int i11) throws HttpDataSourceException;

    void setRequestProperty(String str, String str2);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class RequestProperties {
        private final Map<String, String> requestProperties = new HashMap();
        private Map<String, String> requestPropertiesSnapshot;

        public synchronized void clear() {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.clear();
        }

        public synchronized void clearAndSet(Map<String, String> map) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.clear();
            this.requestProperties.putAll(map);
        }

        public synchronized Map<String, String> getSnapshot() {
            try {
                if (this.requestPropertiesSnapshot == null) {
                    this.requestPropertiesSnapshot = Collections.unmodifiableMap(new HashMap(this.requestProperties));
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.requestPropertiesSnapshot;
        }

        public synchronized void remove(String str) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.remove(str);
        }

        public synchronized void set(String str, String str2) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.put(str, str2);
        }

        public synchronized void set(Map<String, String> map) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.putAll(map);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class HttpDataSourceException extends IOException {
        public static final int TYPE_CLOSE = 3;
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_READ = 2;
        public final DataSpec dataSpec;
        public final int type;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }

        public HttpDataSourceException(DataSpec dataSpec, int i10) {
            this.dataSpec = dataSpec;
            this.type = i10;
        }

        public HttpDataSourceException(String str, DataSpec dataSpec, int i10) {
            super(str);
            this.dataSpec = dataSpec;
            this.type = i10;
        }

        public HttpDataSourceException(IOException iOException, DataSpec dataSpec, int i10) {
            super(iOException);
            this.dataSpec = dataSpec;
            this.type = i10;
        }

        public HttpDataSourceException(String str, IOException iOException, DataSpec dataSpec, int i10) {
            super(str, iOException);
            this.dataSpec = dataSpec;
            this.type = i10;
        }
    }
}
