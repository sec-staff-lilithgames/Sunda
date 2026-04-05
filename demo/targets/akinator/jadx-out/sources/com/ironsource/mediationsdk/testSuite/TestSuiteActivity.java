package com.ironsource.mediationsdk.testSuite;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import com.ironsource.Cf;
import com.ironsource.Lf;
import com.ironsource.Qf;
import com.ironsource.V8;
import el.a;
import kotlin.jvm.internal.e0;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class TestSuiteActivity extends Activity implements V8 {

    /* renamed from: a, reason: collision with root package name */
    private RelativeLayout f37750a;

    /* renamed from: b, reason: collision with root package name */
    private Qf f37751b;

    /* renamed from: c, reason: collision with root package name */
    private Lf f37752c;

    private final String a() {
        Bundle extras;
        if (getIntent() == null || getIntent().getExtras() == null || (extras = getIntent().getExtras()) == null) {
            return null;
        }
        return extras.getString("controllerUrl");
    }

    private final JSONObject b() {
        String strB = new Cf().b(this);
        if (strB != null) {
            try {
                if (strB.length() != 0) {
                    return new JSONObject(strB);
                }
            } catch (Exception unused) {
                return new JSONObject();
            }
        }
        return new JSONObject();
    }

    public final RelativeLayout getContainer() {
        RelativeLayout relativeLayout = this.f37750a;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        e0.throwUninitializedPropertyAccessException("mContainer");
        return null;
    }

    @Override // com.ironsource.V8
    public void onClosed() {
        runOnUiThread(new a(this, 0));
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.f37750a = relativeLayout;
        setContentView(relativeLayout, c());
        Qf qf2 = new Qf(this, this, b(), a());
        this.f37751b = qf2;
        Lf lf2 = new Lf(qf2);
        this.f37752c = lf2;
        lf2.d();
        RelativeLayout relativeLayout2 = this.f37750a;
        Qf qf3 = null;
        if (relativeLayout2 == null) {
            e0.throwUninitializedPropertyAccessException("mContainer");
            relativeLayout2 = null;
        }
        Qf qf4 = this.f37751b;
        if (qf4 == null) {
            e0.throwUninitializedPropertyAccessException("mWebViewWrapper");
        } else {
            qf3 = qf4;
        }
        relativeLayout2.addView(qf3.d(), c());
    }

    @Override // android.app.Activity
    public void onDestroy() {
        Lf lf2 = this.f37752c;
        Qf qf2 = null;
        if (lf2 == null) {
            e0.throwUninitializedPropertyAccessException("mNativeBridge");
            lf2 = null;
        }
        lf2.a();
        RelativeLayout relativeLayout = this.f37750a;
        if (relativeLayout == null) {
            e0.throwUninitializedPropertyAccessException("mContainer");
            relativeLayout = null;
        }
        relativeLayout.removeAllViews();
        Qf qf3 = this.f37751b;
        if (qf3 == null) {
            e0.throwUninitializedPropertyAccessException("mWebViewWrapper");
        } else {
            qf2 = qf3;
        }
        qf2.a();
        super.onDestroy();
    }

    @Override // com.ironsource.V8
    public void onUIReady() {
        runOnUiThread(new a(this, 1));
    }

    private final RelativeLayout.LayoutParams c() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity this$0) {
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestSuiteActivity this$0) {
        e0.checkNotNullParameter(this$0, "this$0");
        Qf qf2 = this$0.f37751b;
        Qf qf3 = null;
        if (qf2 == null) {
            e0.throwUninitializedPropertyAccessException("mWebViewWrapper");
            qf2 = null;
        }
        if (qf2.c().getParent() == null) {
            RelativeLayout relativeLayout = this$0.f37750a;
            if (relativeLayout == null) {
                e0.throwUninitializedPropertyAccessException("mContainer");
                relativeLayout = null;
            }
            Qf qf4 = this$0.f37751b;
            if (qf4 == null) {
                e0.throwUninitializedPropertyAccessException("mWebViewWrapper");
                qf4 = null;
            }
            relativeLayout.removeView(qf4.d());
            RelativeLayout relativeLayout2 = this$0.f37750a;
            if (relativeLayout2 == null) {
                e0.throwUninitializedPropertyAccessException("mContainer");
                relativeLayout2 = null;
            }
            Qf qf5 = this$0.f37751b;
            if (qf5 == null) {
                e0.throwUninitializedPropertyAccessException("mWebViewWrapper");
                qf5 = null;
            }
            relativeLayout2.addView(qf5.c(), this$0.c());
            Qf qf6 = this$0.f37751b;
            if (qf6 == null) {
                e0.throwUninitializedPropertyAccessException("mWebViewWrapper");
            } else {
                qf3 = qf6;
            }
            qf3.b();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }
}
