package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import android.content.Context;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.w;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f47924a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47925b;

    public f(Context appContext, String cacheDir) {
        e0.checkNotNullParameter(appContext, "appContext");
        e0.checkNotNullParameter(cacheDir, "cacheDir");
        this.f47924a = appContext;
        this.f47925b = cacheDir;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.e
    public w a() {
        try {
            File externalCacheDir = this.f47924a.getExternalCacheDir();
            if (externalCacheDir != null) {
                File file = new File(externalCacheDir, this.f47925b);
                file.mkdir();
                if (file.exists()) {
                    return new w.b(file);
                }
            }
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "MediaCacheLocationProviderImpl", "Failed to create cache directory in external storage", null, false, 12, null);
            return new w.a(new com.moloco.sdk.internal.n("Failed to create cache directory in external storage", 102));
        } catch (IOException e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MediaCacheLocationProviderImpl", "Failed to create cache directory in external storage", e10, false, 8, null);
            return new w.a(new com.moloco.sdk.internal.n("Failed to create cache directory in external storage", 101));
        } catch (SecurityException e11) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MediaCacheLocationProviderImpl", "Failed to create cache directory in external storage", e11, false, 8, null);
            return new w.a(new com.moloco.sdk.internal.n("Failed to create cache directory in external storage", 100));
        } catch (Exception e12) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MediaCacheLocationProviderImpl", "Failed to create cache directory in external storage", e12, false, 8, null);
            return new w.a(new com.moloco.sdk.internal.n("Failed to create cache directory in external storage", 200));
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.e
    public w b() {
        Context context = this.f47924a;
        try {
            if (context.getCacheDir() != null) {
                File file = new File(context.getCacheDir(), this.f47925b);
                file.mkdir();
                if (file.exists()) {
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, "MediaCacheLocationProviderImpl", "Able to write to internal storage cache directory", false, 4, null);
                    return new w.b(file);
                }
            }
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MediaCacheLocationProviderImpl", "Failed to create cache directory in internal storage", null, false, 12, null);
            return new w.a(new com.moloco.sdk.internal.n("Failed to create cache directory in internal storage", 102));
        } catch (IOException e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MediaCacheLocationProviderImpl", "Failed to create cache directory in external storage", e10, false, 8, null);
            return new w.a(new com.moloco.sdk.internal.n("Failed to create cache directory in internal storage", 101));
        } catch (SecurityException e11) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MediaCacheLocationProviderImpl", "Failed to create cache directory in external storage", e11, false, 8, null);
            return new w.a(new com.moloco.sdk.internal.n("Failed to create cache directory in internal storage", 100));
        } catch (Exception e12) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MediaCacheLocationProviderImpl", "Failed to create cache directory in external storage", e12, false, 8, null);
            return new w.a(new com.moloco.sdk.internal.n("Failed to create cache directory in internal storage", 200));
        }
    }

    public final Context c() {
        return this.f47924a;
    }

    public final String d() {
        return this.f47925b;
    }
}
