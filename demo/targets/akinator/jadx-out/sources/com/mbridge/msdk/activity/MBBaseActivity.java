package com.mbridge.msdk.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.OrientationEventListener;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.e1;
import com.mbridge.msdk.foundation.tools.p0;
import io.ktor.util.cio.ByteBufferPoolKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class MBBaseActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private Display f39403a;

    /* renamed from: b, reason: collision with root package name */
    private OrientationEventListener f39404b;

    /* renamed from: c, reason: collision with root package name */
    private int f39405c = -1;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f39406d = false;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f39407e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MBBaseActivity.this.b();
            } catch (Exception e10) {
                p0.b("MBBaseActivity", e10.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends OrientationEventListener {
        public b(Context context, int i10) {
            super(context, i10);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            int rotation = MBBaseActivity.this.f39403a != null ? MBBaseActivity.this.f39403a.getRotation() : 0;
            if (rotation == 1 && MBBaseActivity.this.f39405c != 1) {
                MBBaseActivity.this.f39405c = 1;
                MBBaseActivity.this.getNotchParams();
                p0.b("MBBaseActivity", "Orientation Left");
                return;
            }
            if (rotation == 3 && MBBaseActivity.this.f39405c != 2) {
                MBBaseActivity.this.f39405c = 2;
                MBBaseActivity.this.getNotchParams();
                p0.b("MBBaseActivity", "Orientation Right");
            } else if (rotation == 0 && MBBaseActivity.this.f39405c != 3) {
                MBBaseActivity.this.f39405c = 3;
                MBBaseActivity.this.getNotchParams();
                p0.b("MBBaseActivity", "Orientation Top");
            } else {
                if (rotation != 2 || MBBaseActivity.this.f39405c == 4) {
                    return;
                }
                MBBaseActivity.this.f39405c = 4;
                MBBaseActivity.this.getNotchParams();
                p0.b("MBBaseActivity", "Orientation Bottom");
            }
        }
    }

    private void d() {
        b bVar = new b(this, 1);
        this.f39404b = bVar;
        if (bVar.canDetectOrientation()) {
            this.f39404b.enable();
        } else {
            this.f39404b.disable();
            this.f39404b = null;
        }
    }

    public void getNotchParams() {
        if (this.f39406d) {
            return;
        }
        this.f39407e = new a();
        getWindow().getDecorView().postDelayed(this.f39407e, 500L);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f39406d = false;
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().addFlags(512);
            c();
            a();
            e1.a(getWindow());
        } catch (Exception e10) {
            p0.b("MBBaseActivity", e10.getMessage());
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.f39406d = true;
        super.onDestroy();
        try {
            OrientationEventListener orientationEventListener = this.f39404b;
            if (orientationEventListener != null) {
                orientationEventListener.disable();
                this.f39404b = null;
            }
            if (this.f39407e != null) {
                getWindow().getDecorView().removeCallbacks(this.f39407e);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("MBBaseActivity", e10.getMessage());
            }
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (com.mbridge.msdk.foundation.feedback.b.f40664f) {
            return;
        }
        getNotchParams();
        c();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        c();
    }

    public abstract void setTopControllerPadding(int i10, int i11, int i12, int i13, int i14);

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        MBBaseActivity mBBaseActivity;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        DisplayCutout displayCutout;
        int i15 = Build.VERSION.SDK_INT;
        if (this.f39406d) {
            return;
        }
        WindowInsets rootWindowInsets = getWindow().getDecorView().getRootWindowInsets();
        int i16 = -1;
        if (rootWindowInsets == null || i15 < 28 || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
            mBBaseActivity = this;
            i10 = -1;
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
        } else {
            int safeInsetLeft = displayCutout.getSafeInsetLeft();
            int safeInsetRight = displayCutout.getSafeInsetRight();
            int safeInsetTop = displayCutout.getSafeInsetTop();
            int safeInsetBottom = displayCutout.getSafeInsetBottom();
            Display display = this.f39403a;
            int rotation = display != null ? display.getRotation() : a();
            if (this.f39405c == -1) {
                this.f39405c = rotation == 0 ? 3 : rotation == 1 ? 1 : rotation == 2 ? 4 : rotation == 3 ? 2 : -1;
                p0.b("MBBaseActivity", this.f39405c + "");
            }
            if (rotation != 0) {
                if (rotation == 1) {
                    i16 = 90;
                } else if (rotation == 2) {
                    i16 = 180;
                } else if (rotation == 3) {
                    i16 = 270;
                }
                mBBaseActivity = this;
                i14 = safeInsetBottom;
                i11 = safeInsetLeft;
                i10 = i16;
            } else {
                mBBaseActivity = this;
                i14 = safeInsetBottom;
                i11 = safeInsetLeft;
                i10 = 0;
            }
            i12 = safeInsetRight;
            i13 = safeInsetTop;
        }
        mBBaseActivity.setTopControllerPadding(i10, i11, i12, i13, i14);
        if (mBBaseActivity.f39404b == null) {
            d();
        }
    }

    private void c() {
        try {
            getWindow().addFlags(67108864);
            getWindow().getDecorView().setSystemUiVisibility(ByteBufferPoolKt.DEFAULT_BUFFER_SIZE);
        } catch (Throwable th2) {
            p0.b("MBBaseActivity", th2.getMessage());
        }
    }

    private int a() {
        if (this.f39403a == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f39403a = getDisplay();
            } else {
                this.f39403a = ((WindowManager) getSystemService("window")).getDefaultDisplay();
            }
        }
        Display display = this.f39403a;
        if (display != null) {
            return display.getRotation();
        }
        return -1;
    }
}
