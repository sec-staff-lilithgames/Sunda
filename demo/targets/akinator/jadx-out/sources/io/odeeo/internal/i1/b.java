package io.odeeo.internal.i1;

import android.content.Context;
import io.odeeo.internal.v1.i;
import io.odeeo.sdk.common.SdkInitializationListener;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends a {

    /* renamed from: c, reason: collision with root package name */
    public final SdkInitializationListener f64339c;

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void a(Context context) {
        i.f67277a.prefetchNetworkLocation(context);
    }

    @Override // io.odeeo.internal.i1.a
    public void onBeforeInit(Context context) {
        e0.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        e0.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        a(applicationContext);
    }

    @Override // io.odeeo.internal.i1.a
    public void onInitializationFailed(int i10, String errorMessage) {
        e0.checkNotNullParameter(errorMessage, "errorMessage");
        io.odeeo.internal.b2.a.w("onInitializationFailed " + i10 + ' ' + errorMessage, new Object[0]);
        SdkInitializationListener sdkInitializationListener = this.f64339c;
        if (sdkInitializationListener == null) {
            return;
        }
        sdkInitializationListener.onInitializationFailed(i10, errorMessage);
    }

    @Override // io.odeeo.internal.i1.a
    public void onInitializationSucceed() {
        SdkInitializationListener sdkInitializationListener = this.f64339c;
        if (sdkInitializationListener == null) {
            return;
        }
        sdkInitializationListener.onInitializationSucceed();
    }

    public /* synthetic */ b(SdkInitializationListener sdkInitializationListener, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : sdkInitializationListener);
    }

    public b(SdkInitializationListener sdkInitializationListener) {
        this.f64339c = sdkInitializationListener;
    }
}
