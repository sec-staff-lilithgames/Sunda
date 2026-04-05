package com.unity3d.ads.injection;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Map;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kv.a;
import tu.o;
import tu.q;
import uu.o1;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class Registry {
    private final MutableStateFlow<Map<EntryKey, o>> _services = StateFlowKt.MutableStateFlow(p1.emptyMap());

    public static /* synthetic */ EntryKey factory$default(Registry registry, String named, a instance, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        e0.checkNotNullParameter(named, "named");
        e0.checkNotNullParameter(instance, "instance");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        EntryKey entryKey = new EntryKey(named, c1.getOrCreateKotlinClass(Object.class));
        registry.add(entryKey, new Factory(instance));
        return entryKey;
    }

    public static /* synthetic */ Object get$default(Registry registry, String named, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        e0.checkNotNullParameter(named, "named");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        EntryKey entryKey = new EntryKey(named, c1.getOrCreateKotlinClass(Object.class));
        o oVar = registry.getServices().get(entryKey);
        if (oVar != null) {
            Object value = oVar.getValue();
            e0.reifiedOperationMarker(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            return value;
        }
        throw new IllegalStateException("No entry found for " + entryKey);
    }

    public static /* synthetic */ Object getOrNull$default(Registry registry, String named, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        e0.checkNotNullParameter(named, "named");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        o oVar = registry.getServices().get(new EntryKey(named, c1.getOrCreateKotlinClass(Object.class)));
        if (oVar == null) {
            return null;
        }
        Object value = oVar.getValue();
        e0.reifiedOperationMarker(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return value;
    }

    public static /* synthetic */ EntryKey single$default(Registry registry, String named, a instance, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        e0.checkNotNullParameter(named, "named");
        e0.checkNotNullParameter(instance, "instance");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        EntryKey entryKey = new EntryKey(named, c1.getOrCreateKotlinClass(Object.class));
        registry.add(entryKey, q.lazy(instance));
        return entryKey;
    }

    public final <T> void add(EntryKey key, o instance) {
        Map<EntryKey, o> value;
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(instance, "instance");
        if (getServices().containsKey(key)) {
            throw new IllegalStateException("Cannot have identical entries.");
        }
        MutableStateFlow<Map<EntryKey, o>> mutableStateFlow = this._services;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, p1.plus(value, o1.mapOf(tu.e0.to(key, instance)))));
    }

    public final /* synthetic */ <T> EntryKey factory(String named, a instance) {
        e0.checkNotNullParameter(named, "named");
        e0.checkNotNullParameter(instance, "instance");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        EntryKey entryKey = new EntryKey(named, c1.getOrCreateKotlinClass(Object.class));
        add(entryKey, new Factory(instance));
        return entryKey;
    }

    public final /* synthetic */ <T> T get(String named) {
        e0.checkNotNullParameter(named, "named");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        EntryKey entryKey = new EntryKey(named, c1.getOrCreateKotlinClass(Object.class));
        o oVar = getServices().get(entryKey);
        if (oVar != null) {
            T t10 = (T) oVar.getValue();
            e0.reifiedOperationMarker(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            return t10;
        }
        throw new IllegalStateException("No entry found for " + entryKey);
    }

    public final /* synthetic */ <T> T getOrNull(String named) {
        e0.checkNotNullParameter(named, "named");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        o oVar = getServices().get(new EntryKey(named, c1.getOrCreateKotlinClass(Object.class)));
        if (oVar == null) {
            return null;
        }
        T t10 = (T) oVar.getValue();
        e0.reifiedOperationMarker(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return t10;
    }

    public final Map<EntryKey, o> getServices() {
        return this._services.getValue();
    }

    public final /* synthetic */ <T> EntryKey single(String named, a instance) {
        e0.checkNotNullParameter(named, "named");
        e0.checkNotNullParameter(instance, "instance");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        EntryKey entryKey = new EntryKey(named, c1.getOrCreateKotlinClass(Object.class));
        add(entryKey, q.lazy(instance));
        return entryKey;
    }
}
