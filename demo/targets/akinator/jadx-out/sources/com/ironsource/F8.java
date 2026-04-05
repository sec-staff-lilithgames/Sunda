package com.ironsource;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.sdk.utils.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class F8 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final String f34363a;

    /* renamed from: b, reason: collision with root package name */
    private a f34364b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void a(rg rgVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F8(Context context) {
        super(context);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f34363a = "ISNNativeAdContainer";
    }

    private final rg a() {
        return new rg(getVisibility() == 0, getWindowVisibility() == 0, isShown());
    }

    public final a getListener$mediationsdk_release() {
        return this.f34364b;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(changedView, "changedView");
        Logger.i(this.f34363a, "onVisibilityChanged: " + i10);
        a aVar = this.f34364b;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        Logger.i(this.f34363a, "onWindowVisibilityChanged: " + i10);
        a aVar = this.f34364b;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    public final void setListener$mediationsdk_release(a aVar) {
        this.f34364b = aVar;
    }
}
