package j5;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import l5.i;
import l5.k;
import l5.m;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final b f69125a = new b(null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(u uVar) {
        }

        public final h from(Context context) {
            e0.checkNotNullParameter(context, "context");
            l5.c cVarObtain = l5.c.f72410a.obtain(context);
            if (cVarObtain != null) {
                return new a(cVarObtain);
            }
            return null;
        }
    }

    public static final h from(Context context) {
        return f69125a.from(context);
    }

    public abstract n1 deleteRegistrationsAsync(l5.a aVar);

    public abstract n1 getMeasurementApiStatusAsync();

    public abstract n1 registerSourceAsync(Uri uri, InputEvent inputEvent);

    public abstract n1 registerSourceAsync(i iVar);

    public abstract n1 registerTriggerAsync(Uri uri);

    public abstract n1 registerWebSourceAsync(k kVar);

    public abstract n1 registerWebTriggerAsync(m mVar);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends h {

        /* renamed from: b, reason: collision with root package name */
        public final l5.c f69126b;

        public a(l5.c mMeasurementManager) {
            e0.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
            this.f69126b = mMeasurementManager;
        }

        @Override // j5.h
        public n1 deleteRegistrationsAsync(l5.a deletionRequest) {
            e0.checkNotNullParameter(deletionRequest, "deletionRequest");
            return i5.b.asListenableFuture$default(BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new j5.a(this, deletionRequest, null), 3, null), null, 1, null);
        }

        @Override // j5.h
        public n1 getMeasurementApiStatusAsync() {
            return i5.b.asListenableFuture$default(BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new j5.b(this, null), 3, null), null, 1, null);
        }

        @Override // j5.h
        public n1 registerSourceAsync(Uri attributionSource, InputEvent inputEvent) {
            e0.checkNotNullParameter(attributionSource, "attributionSource");
            return i5.b.asListenableFuture$default(BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new c(this, attributionSource, inputEvent, null), 3, null), null, 1, null);
        }

        @Override // j5.h
        public n1 registerTriggerAsync(Uri trigger) {
            e0.checkNotNullParameter(trigger, "trigger");
            return i5.b.asListenableFuture$default(BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new e(this, trigger, null), 3, null), null, 1, null);
        }

        @Override // j5.h
        public n1 registerWebSourceAsync(k request) {
            e0.checkNotNullParameter(request, "request");
            return i5.b.asListenableFuture$default(BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new f(this, request, null), 3, null), null, 1, null);
        }

        @Override // j5.h
        public n1 registerWebTriggerAsync(m request) {
            e0.checkNotNullParameter(request, "request");
            return i5.b.asListenableFuture$default(BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new g(this, request, null), 3, null), null, 1, null);
        }

        @Override // j5.h
        public n1 registerSourceAsync(i request) {
            e0.checkNotNullParameter(request, "request");
            return i5.b.asListenableFuture$default(BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new d(this, request, null), 3, null), null, 1, null);
        }
    }
}
