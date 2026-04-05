package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedCallback;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.utils.dt;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class TTBaseActivity extends Activity {
    private OnBackInvokedCallback jpo;
    protected boolean xyk = false;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo implements OnBackInvokedCallback {
        private final WeakReference<TTBaseActivity> jpo;

        public jpo(TTBaseActivity tTBaseActivity) {
            this.jpo = new WeakReference<>(tTBaseActivity);
        }

        public void onBackInvoked() {
            TTBaseActivity tTBaseActivity = this.jpo.get();
            if (tTBaseActivity != null) {
                tTBaseActivity.jd();
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception unused) {
        }
    }

    public void jd() {
        onBackPressed();
    }

    public boolean jpo() {
        return false;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (jpo() && dt.jpo()) {
            this.jpo = new jpo(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.jpo);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!dt.jpo() || this.jpo == null) {
            return;
        }
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.jpo);
        this.jpo = null;
    }

    @Override // android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT < 33) {
            super.onPause();
            return;
        }
        try {
            try {
                super.onPause();
            } catch (Exception unused) {
            }
        } catch (IllegalArgumentException unused2) {
            Field declaredField = Activity.class.getDeclaredField("mCalled");
            declaredField.setAccessible(true);
            declaredField.set(this, Boolean.TRUE);
        }
    }

    @Override // android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT > 28) {
            super.onResume();
            return;
        }
        try {
            super.onResume();
        } catch (IllegalArgumentException e10) {
            nmd.jpo("TTBaseActivity", "super.onResume() run fail", e10);
            try {
                Field declaredField = Activity.class.getDeclaredField("mCalled");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.TRUE);
            } catch (Exception e11) {
                nmd.jpo("TTBaseActivity", "onResume set mCalled fail", e11);
            }
        }
    }

    public void wqx(boolean z10) {
        this.xyk = z10;
    }
}
