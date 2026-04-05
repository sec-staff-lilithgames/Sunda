package com.vungle.ads.internal.session;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.executor.FutureResult;
import com.vungle.ads.internal.model.UnclosedAd;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.modules.SerializersModule;
import tu.a0;
import tu.z;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class UnclosedAdDetector {
    private static final String FILENAME = "unclosed_ad";
    private final Context context;
    private final Executors executors;
    private File file;
    private final PathProvider pathProvider;
    private boolean ready;
    private final String sessionId;
    private final CopyOnWriteArrayList<UnclosedAd> unclosedAdList;
    public static final Companion Companion = new Companion(null);
    private static final Json json = JsonKt.Json$default(null, UnclosedAdDetector$Companion$json$1.INSTANCE, 1, null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public UnclosedAdDetector(Context context, String sessionId, Executors executors, PathProvider pathProvider) {
        Object objM7131constructorimpl;
        boolean zM7137isSuccessimpl;
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(sessionId, "sessionId");
        e0.checkNotNullParameter(executors, "executors");
        e0.checkNotNullParameter(pathProvider, "pathProvider");
        this.context = context;
        this.sessionId = sessionId;
        this.executors = executors;
        this.pathProvider = pathProvider;
        this.file = pathProvider.getUnclosedAdFile(FILENAME);
        this.unclosedAdList = new CopyOnWriteArrayList<>();
        if (this.file.exists()) {
            zM7137isSuccessimpl = true;
        } else {
            try {
                int i10 = z.f87419c;
                objM7131constructorimpl = z.m7131constructorimpl(Boolean.valueOf(this.file.createNewFile()));
            } catch (Throwable th2) {
                int i11 = z.f87419c;
                objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
            }
            Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(objM7131constructorimpl);
            if (thM7134exceptionOrNullimpl != null) {
                Logger.Companion.e("UnclosedAdDetector", "Fail to create unclosed ad file: " + thM7134exceptionOrNullimpl.getMessage());
            }
            zM7137isSuccessimpl = z.m7137isSuccessimpl(objM7131constructorimpl);
        }
        this.ready = zM7137isSuccessimpl;
    }

    private final /* synthetic */ <T> T decodeJson(String str) {
        Json json2 = json;
        SerializersModule serializersModule = json2.getSerializersModule();
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(serializersModule, (KType) null);
        e0.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return (T) json2.decodeFromString(kSerializerSerializer, str);
    }

    private final List<UnclosedAd> readUnclosedAdFromFile() {
        return !this.ready ? p0.emptyList() : (List) new FutureResult(this.executors.getIoExecutor().submit(new a(this, 0))).get(1000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: readUnclosedAdFromFile$lambda-4, reason: not valid java name */
    public static final List m3641readUnclosedAdFromFile$lambda4(UnclosedAdDetector this$0) {
        e0.checkNotNullParameter(this$0, "this$0");
        try {
            String string = FileUtility.INSTANCE.readString(this$0.file);
            if (string != null && string.length() != 0) {
                Json json2 = json;
                KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(json2.getSerializersModule(), c1.typeOf(List.class, KTypeProjection.Companion.invariant(c1.typeOf(UnclosedAd.class))));
                e0.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                return (List) json2.decodeFromString(kSerializerSerializer, string);
            }
            return new ArrayList();
        } catch (Exception e10) {
            Logger.Companion.e("UnclosedAdDetector", "Fail to read unclosed ad file " + e10.getMessage());
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: retrieveUnclosedAd$lambda-3, reason: not valid java name */
    public static final void m3642retrieveUnclosedAd$lambda3(UnclosedAdDetector this$0) {
        e0.checkNotNullParameter(this$0, "this$0");
        try {
            FileUtility.deleteAndLogIfFailed(this$0.file);
        } catch (Exception e10) {
            Logger.Companion.e("UnclosedAdDetector", "Fail to delete file " + e10.getMessage());
        }
    }

    private final void writeUnclosedAdToFile(List<UnclosedAd> list) {
        if (this.ready) {
            try {
                Json json2 = json;
                KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(json2.getSerializersModule(), c1.typeOf(List.class, KTypeProjection.Companion.invariant(c1.typeOf(UnclosedAd.class))));
                e0.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                this.executors.getIoExecutor().execute(new com.ironsource.environment.thread.a(14, this, json2.encodeToString(kSerializerSerializer, list)));
            } catch (Throwable th2) {
                Logger.Companion.e("UnclosedAdDetector", "Fail to write unclosed ad file " + th2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: writeUnclosedAdToFile$lambda-5, reason: not valid java name */
    public static final void m3643writeUnclosedAdToFile$lambda5(UnclosedAdDetector this$0, String jsonContent) {
        e0.checkNotNullParameter(this$0, "this$0");
        e0.checkNotNullParameter(jsonContent, "$jsonContent");
        FileUtility.INSTANCE.writeString(this$0.file, jsonContent);
    }

    public final void addUnclosedAd(UnclosedAd ad2) {
        e0.checkNotNullParameter(ad2, "ad");
        if (this.ready) {
            ad2.setSessionId(this.sessionId);
            this.unclosedAdList.add(ad2);
            writeUnclosedAdToFile(this.unclosedAdList);
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final Executors getExecutors() {
        return this.executors;
    }

    public final PathProvider getPathProvider() {
        return this.pathProvider;
    }

    public final void removeUnclosedAd(UnclosedAd ad2) {
        e0.checkNotNullParameter(ad2, "ad");
        if (this.ready && this.unclosedAdList.contains(ad2)) {
            this.unclosedAdList.remove(ad2);
            writeUnclosedAdToFile(this.unclosedAdList);
        }
    }

    public final List<UnclosedAd> retrieveUnclosedAd() {
        ArrayList arrayList = new ArrayList();
        if (!this.ready) {
            return arrayList;
        }
        List<UnclosedAd> unclosedAdFromFile = readUnclosedAdFromFile();
        if (unclosedAdFromFile != null) {
            arrayList.addAll(unclosedAdFromFile);
        }
        this.executors.getIoExecutor().execute(new com.unity3d.services.banners.view.a(this, 4));
        return arrayList;
    }
}
