package r6;

import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import n6.c0;
import v6.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final String f83843a;

    static {
        String strTagWithPrefix = c0.tagWithPrefix("WorkConstraintsTracker");
        e0.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(...)");
        f83843a = strTagWithPrefix;
    }

    public static final h NetworkRequestConstraintController(Context context) {
        e0.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        e0.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return new h((ConnectivityManager) systemService, 0L, 2, null);
    }

    public static final Job listen(l lVar, b0 spec, CoroutineDispatcher dispatcher, j listener) {
        e0.checkNotNullParameter(lVar, "<this>");
        e0.checkNotNullParameter(spec, "spec");
        e0.checkNotNullParameter(dispatcher, "dispatcher");
        e0.checkNotNullParameter(listener, "listener");
        return BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(dispatcher), null, null, new n(lVar, spec, listener, null), 3, null);
    }
}
