package ek;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.firebase.g f54641a;

    /* renamed from: b, reason: collision with root package name */
    public final ik.o f54642b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final u getInstance() {
            Object obj = com.google.firebase.j.getApp(com.google.firebase.c.f29664a).get(u.class);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(obj, "get(...)");
            return (u) obj;
        }
    }

    static {
        new a(null);
    }

    public u(com.google.firebase.g firebaseApp, ik.o settings, @ai.a zu.m backgroundDispatcher, i1 sessionsActivityLifecycleCallbacks) {
        kotlin.jvm.internal.e0.checkNotNullParameter(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.e0.checkNotNullParameter(settings, "settings");
        kotlin.jvm.internal.e0.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.e0.checkNotNullParameter(sessionsActivityLifecycleCallbacks, "sessionsActivityLifecycleCallbacks");
        this.f54641a = firebaseApp;
        this.f54642b = settings;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.3.");
        Context applicationContext = firebaseApp.getApplicationContext().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(sessionsActivityLifecycleCallbacks);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(backgroundDispatcher), null, null, new t(this, sessionsActivityLifecycleCallbacks, null), 3, null);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
