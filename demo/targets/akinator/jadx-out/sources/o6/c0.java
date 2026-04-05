package o6;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f77871a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f77872b;

    static {
        String strTagWithPrefix = n6.c0.tagWithPrefix("UnfinishedWorkListener");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(...)");
        f77871a = strTagWithPrefix;
        f77872b = TimeUnit.HOURS.toMillis(1L);
    }

    public static final void maybeLaunchUnfinishedWorkListener(CoroutineScope coroutineScope, Context appContext, androidx.work.a configuration, WorkDatabase db2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(coroutineScope, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(appContext, "appContext");
        kotlin.jvm.internal.e0.checkNotNullParameter(configuration, "configuration");
        kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
        if (w6.v.isDefaultProcess(appContext, configuration)) {
            FlowKt.launchIn(FlowKt.onEach(FlowKt.distinctUntilChanged(FlowKt.conflate(FlowKt.retryWhen(db2.workSpecDao().hasUnfinishedWorkFlow(), new a0(4, null)))), new b0(appContext, null)), coroutineScope);
        }
    }
}
