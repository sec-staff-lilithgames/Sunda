package io.bidmachine.iab.mraid;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ViewGroup;
import dq.g;
import io.bidmachine.rendering.internal.a;
import ir.n;
import qm.b;
import tm.b0;
import tm.q;
import tm.r;
import tm.t;
import um.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class MraidActivity extends a {

    /* renamed from: g, reason: collision with root package name */
    public static final SparseArray f60381g = new SparseArray();

    /* renamed from: c, reason: collision with root package name */
    public Integer f60382c;

    /* renamed from: e, reason: collision with root package name */
    public q f60383e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f60384f = false;

    public static void show(Context context, q qVar, b0 b0Var) {
        SparseArray sparseArray = f60381g;
        if (qVar == null) {
            t.e("MraidActivity", "MraidInterstitial is null during showing MraidActivity", new Object[0]);
            return;
        }
        int i10 = qVar.f87112a;
        if (context == null) {
            t.e("MraidActivity", "Context is null during showing MraidActivity", new Object[0]);
            qVar.c(b.noRequiredArguments("Context is null during showing MraidActivity"));
            return;
        }
        if (b0Var == null) {
            t.e("MraidActivity", "MraidType is null during showing MraidActivity", new Object[0]);
            qVar.c(b.noRequiredArguments("MraidType is null during showing MraidActivity"));
            return;
        }
        try {
            sparseArray.put(i10, qVar);
            Intent intentA = g.a(context, MraidActivity.class);
            intentA.putExtra("InterstitialId", i10);
            intentA.putExtra("InterstitialType", b0Var);
            context.startActivity(intentA);
        } catch (Throwable th2) {
            t.e("Exception during showing MraidActivity", th2);
            qVar.c(b.throwable("Exception during showing MraidActivity", th2));
            sparseArray.remove(i10);
        }
    }

    @Override // io.bidmachine.rendering.internal.a
    public final void a() {
        if (this.f60384f) {
            q qVar = this.f60383e;
            if (qVar != null) {
                qVar.dispatchClose();
            } else {
                n.finishActivityWithoutAnimation(this);
            }
        }
    }

    @Override // io.bidmachine.rendering.internal.a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!getIntent().hasExtra("InterstitialId")) {
            t.e("MraidActivity", "Mraid display cache id not provided", new Object[0]);
            n.finishActivityWithoutAnimation(this);
            return;
        }
        int intExtra = getIntent().getIntExtra("InterstitialId", 0);
        this.f60382c = Integer.valueOf(intExtra);
        SparseArray sparseArray = f60381g;
        q qVar = (q) sparseArray.get(intExtra);
        this.f60383e = qVar;
        if (qVar == null) {
            t.e("MraidActivity", "Mraid interstitial not found in display cache, id=%s", this.f60382c);
            n.finishActivityWithoutAnimation(this);
            return;
        }
        b0 b0Var = (b0) getIntent().getSerializableExtra("InterstitialType");
        if (b0Var == null) {
            t.e("MraidActivity", "MraidType is null", new Object[0]);
            n.finishActivityWithoutAnimation(this);
            this.f60383e.c(b.internal("MraidType is null"));
            return;
        }
        h0.applyFullscreenActivityFlags(this);
        int i10 = tm.a.f86972a[b0Var.ordinal()];
        if (i10 == 1 || i10 == 2) {
            this.f60384f = true;
        } else if (i10 == 3) {
            this.f60384f = false;
        }
        try {
            q qVar2 = this.f60383e;
            qVar2.getClass();
            qVar2.a(this, (ViewGroup) findViewById(R.id.content), true, false);
        } catch (Exception e10) {
            t.e("Exception during showing MraidInterstial in MraidActivity", e10);
            n.finishActivityWithoutAnimation(this);
            this.f60383e.c(b.throwable("Exception during showing MraidInterstial in MraidActivity", e10));
            Integer num = this.f60382c;
            if (num != null) {
                sparseArray.remove(num.intValue());
            }
        }
        h0.applyWindowInsets(this);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.f60383e == null || isChangingConfigurations()) {
            return;
        }
        q qVar = this.f60383e;
        if (!qVar.isClosed()) {
            qVar.f87118g = true;
            r rVar = qVar.f87116e;
            if (rVar != null) {
                rVar.onClose(qVar);
            }
            if (qVar.f87120i) {
                qVar.destroy();
            }
        }
        Integer num = this.f60382c;
        if (num == null) {
            return;
        }
        f60381g.remove(num.intValue());
    }
}
