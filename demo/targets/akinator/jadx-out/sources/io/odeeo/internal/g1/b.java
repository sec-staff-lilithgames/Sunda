package io.odeeo.internal.g1;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b {
    public final AudioManager provideAudioManager(Context context) {
        e0.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("audio");
        if (systemService != null) {
            return (AudioManager) systemService;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.media.AudioManager");
    }

    public final CoroutineScope provideIoCoroutineScope() {
        return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
    }

    public final Executor provideMainThreadExecutor(Context context) {
        e0.checkNotNullParameter(context, "context");
        Executor mainExecutor = m3.a.getMainExecutor(context);
        e0.checkNotNullExpressionValue(mainExecutor, "getMainExecutor(context)");
        return mainExecutor;
    }

    public final SharedPreferences providePopUpImageControllerSharedPreferences(Context context) {
        e0.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("io.odeeo.sdk.cached_image", 0);
        e0.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…GE, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }
}
