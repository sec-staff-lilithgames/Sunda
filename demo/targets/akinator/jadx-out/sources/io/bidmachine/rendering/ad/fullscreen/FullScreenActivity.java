package io.bidmachine.rendering.ad.fullscreen;

import android.os.Bundle;
import bq.e;
import io.bidmachine.rendering.internal.a;
import ir.o;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class FullScreenActivity extends a {

    /* renamed from: c, reason: collision with root package name */
    public e f61996c;

    @Override // io.bidmachine.rendering.internal.a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e eVar = bq.a.f9724a;
        this.f61996c = eVar;
        if (eVar != null) {
            eVar.showInActivity(this);
            return;
        }
        o.finishActivityWithoutAnimationSafely(this);
        e eVar2 = this.f61996c;
        if (eVar2 != null) {
            eVar2.processAdClosed();
        }
        this.f61996c = null;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isChangingConfigurations()) {
            return;
        }
        if (e0.areEqual(bq.a.f9724a, this.f61996c)) {
            bq.a.f9724a = null;
        }
        o.finishActivityWithoutAnimationSafely(this);
        e eVar = this.f61996c;
        if (eVar != null) {
            eVar.processAdClosed();
        }
        this.f61996c = null;
    }
}
