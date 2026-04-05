package com.unity3d.ads.core.configuration;

import com.google.android.gms.ads.RequestConfiguration;
import com.unity3d.services.core.misc.JsonStorage;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class MetadataReader<T> {
    private final JsonStorage jsonStorage;
    private final String key;

    public MetadataReader(JsonStorage jsonStorage, String key) {
        e0.checkNotNullParameter(jsonStorage, "jsonStorage");
        e0.checkNotNullParameter(key, "key");
        this.jsonStorage = jsonStorage;
        this.key = key;
    }

    public static /* synthetic */ Object read$default(MetadataReader metadataReader, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: read");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        Object obj3 = metadataReader.getJsonStorage().get(metadataReader.getKey());
        if (obj3 == null) {
            return obj;
        }
        e0.reifiedOperationMarker(3, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return obj3;
    }

    public static /* synthetic */ Object readAndDelete$default(MetadataReader metadataReader, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readAndDelete");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        Object obj3 = metadataReader.getJsonStorage().get(metadataReader.getKey());
        if (obj3 != null) {
            e0.checkNotNullExpressionValue(obj3, "get(key)");
            e0.reifiedOperationMarker(3, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            obj = obj3;
        }
        Object obj4 = metadataReader.getJsonStorage().get(metadataReader.getKey());
        if (obj4 != null) {
            e0.checkNotNullExpressionValue(obj4, "get(key)");
            metadataReader.getJsonStorage().delete(metadataReader.getKey());
        }
        return obj;
    }

    public final JsonStorage getJsonStorage() {
        return this.jsonStorage;
    }

    public final String getKey() {
        return this.key;
    }

    public final /* synthetic */ <T> T read(T t10) {
        T t11 = (T) getJsonStorage().get(getKey());
        if (t11 == null) {
            return t10;
        }
        e0.reifiedOperationMarker(3, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return t11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <T> T readAndDelete(T t10) {
        Object obj = getJsonStorage().get(getKey());
        if (obj != 0) {
            e0.checkNotNullExpressionValue(obj, "get(key)");
            e0.reifiedOperationMarker(3, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            t10 = obj;
        }
        Object obj2 = getJsonStorage().get(getKey());
        if (obj2 != null) {
            e0.checkNotNullExpressionValue(obj2, "get(key)");
            getJsonStorage().delete(getKey());
        }
        return t10;
    }
}
