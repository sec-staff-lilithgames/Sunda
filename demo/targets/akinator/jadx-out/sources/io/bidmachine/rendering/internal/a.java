package io.bidmachine.rendering.internal;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.k0;
import ir.o;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class a extends Activity {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f61997b = 0;

    @Override // android.app.Activity
    @f
    public void onBackPressed() {
        a();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        o.setActivityBackgroundColor(this, -16777216);
        o.setNoActivityTransition(this);
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, new k0(this, 1));
        }
    }

    public void a() {
    }
}
