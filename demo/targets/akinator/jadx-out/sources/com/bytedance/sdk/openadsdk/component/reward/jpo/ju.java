package com.bytedance.sdk.openadsdk.component.reward.jpo;

import android.R;
import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.component.utils.hx;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ju {

    /* renamed from: jd, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.reward.jpo.jpo f19936jd;
    protected int jpo;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class jpo implements View.OnLayoutChangeListener {

        /* renamed from: jd, reason: collision with root package name */
        private int f19941jd;
        private int jpo;

        private jpo() {
        }

        public abstract void jpo(int i10, int i11);

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int i18 = i12 - i10;
            int i19 = i13 - i11;
            if (i18 == this.jpo && i19 == this.f19941jd) {
                return;
            }
            this.jpo = i18;
            this.f19941jd = i19;
            jpo(i18, i19);
        }
    }

    public ju(com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar) {
        this.jpo = 0;
        this.f19936jd = jpoVar;
        jd();
        try {
            this.jpo = va.wqx(jpoVar.vrc, va.jpo());
            if (!jpoVar.vrc.getWindow().hasFeature(1)) {
                jpoVar.vrc.requestWindowFeature(1);
            }
            jpoVar.vrc.getWindow().addFlags(16777344);
            if (jpoVar.sbx != 2 && va.wqx(jpoVar.vrc)) {
                return;
            }
            jpoVar.vrc.getWindow().addFlags(1024);
        } catch (Throwable th2) {
            Log.e("TTAD.RFSM", "init: ", th2);
        }
    }

    private float cm() {
        return va.wqx(this.f19936jd.vrc, va.au(this.f19936jd.vrc));
    }

    private void jd() {
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.f19936jd;
        jpoVar.jkt = jpoVar.f19914jd.sy();
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = this.f19936jd;
        jpoVar2.sbx = jpo(jpoVar2.vrc, jpoVar2.f19914jd);
    }

    private float my() {
        return va.wqx(this.f19936jd.vrc, va.m499if(this.f19936jd.vrc));
    }

    private void wqx() {
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.f19936jd;
        if (jpoVar.sbx != 2) {
            jpo(jpoVar.vrc, 1);
        } else if (jpoVar.rxq) {
            jpo(jpoVar.vrc, 8);
        } else {
            jpo(jpoVar.vrc, 0);
        }
    }

    public void jpo(hx hxVar) {
        if (hxVar == null) {
            return;
        }
        hxVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.ju.1
            @Override // java.lang.Runnable
            public void run() {
                View viewFindViewById;
                try {
                    View decorView = ju.this.f19936jd.vrc.getWindow().getDecorView();
                    if (decorView == null || (viewFindViewById = decorView.findViewById(R.id.statusBarBackground)) == null) {
                        return;
                    }
                    viewFindViewById.setVisibility(8);
                } catch (Exception unused) {
                }
            }
        }, 300L);
    }

    private float[] jd(int i10) {
        float fMy = my();
        float fCm = cm();
        int i11 = this.f19936jd.sbx;
        if ((i11 == 1) != (fMy > fCm)) {
            float f10 = fMy + fCm;
            fCm = f10 - fCm;
            fMy = f10 - fCm;
        }
        if (i11 == 1) {
            fMy -= i10;
        } else {
            fCm -= i10;
        }
        return new float[]{fCm, fMy};
    }

    public static int jpo(Activity activity, dt dtVar) {
        if (26 == Build.VERSION.SDK_INT) {
            return activity.getResources().getConfiguration().orientation == 1 ? 1 : 2;
        }
        return dtVar.ll();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jd {
        private jpo jpo;

        public void jpo(Activity activity) {
            Window window;
            if (this.jpo == null || activity == null || (window = activity.getWindow()) == null) {
                return;
            }
            window.getDecorView().removeOnLayoutChangeListener(this.jpo);
            this.jpo = null;
        }

        public void jpo(final Activity activity, final int i10, final float f10) {
            if (this.jpo == null) {
                try {
                    final boolean z10 = com.bytedance.sdk.openadsdk.core.sq.cm().sz() == 1;
                    final boolean zWqx = va.wqx(activity);
                    if (zWqx || z10) {
                        try {
                            this.jpo = new jpo() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.ju.jd.1
                                boolean jpo;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super();
                                }

                                /* JADX WARN: Removed duplicated region for block: B:28:0x00a7 A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0013, B:8:0x0046, B:10:0x005e, B:12:0x0067, B:14:0x0075, B:15:0x0079, B:26:0x00a1, B:28:0x00a7, B:29:0x00ac, B:31:0x00b4, B:16:0x007c, B:18:0x0080, B:20:0x008e, B:22:0x0092, B:23:0x0098, B:25:0x009c, B:33:0x00ba, B:35:0x00be, B:7:0x002d), top: B:38:0x0000 }] */
                                /* JADX WARN: Removed duplicated region for block: B:31:0x00b4 A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0013, B:8:0x0046, B:10:0x005e, B:12:0x0067, B:14:0x0075, B:15:0x0079, B:26:0x00a1, B:28:0x00a7, B:29:0x00ac, B:31:0x00b4, B:16:0x007c, B:18:0x0080, B:20:0x008e, B:22:0x0092, B:23:0x0098, B:25:0x009c, B:33:0x00ba, B:35:0x00be, B:7:0x002d), top: B:38:0x0000 }] */
                                /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
                                @Override // com.bytedance.sdk.openadsdk.component.reward.jpo.ju.jpo
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public void jpo(int r7, int r8) {
                                    /*
                                        r6 = this;
                                        int r7 = r2     // Catch: java.lang.Throwable -> Lc4
                                        r8 = 2
                                        if (r7 != r8) goto L2d
                                        android.app.Activity r7 = r3     // Catch: java.lang.Throwable -> Lc4
                                        android.content.res.Resources r7 = r7.getResources()     // Catch: java.lang.Throwable -> Lc4
                                        android.content.res.Configuration r7 = r7.getConfiguration()     // Catch: java.lang.Throwable -> Lc4
                                        int r7 = r7.orientation     // Catch: java.lang.Throwable -> Lc4
                                        if (r7 != r8) goto L2d
                                        android.app.Activity r7 = r3     // Catch: java.lang.Throwable -> Lc4
                                        android.view.Window r7 = r7.getWindow()     // Catch: java.lang.Throwable -> Lc4
                                        android.view.View r7 = r7.getDecorView()     // Catch: java.lang.Throwable -> Lc4
                                        int r7 = r7.getWidth()     // Catch: java.lang.Throwable -> Lc4
                                        android.app.Activity r0 = r3     // Catch: java.lang.Throwable -> Lc4
                                        int r0 = com.bytedance.sdk.openadsdk.utils.va.au(r0)     // Catch: java.lang.Throwable -> Lc4
                                        int r0 = r0 - r7
                                        int r7 = java.lang.Math.abs(r0)     // Catch: java.lang.Throwable -> Lc4
                                        goto L46
                                    L2d:
                                        android.app.Activity r7 = r3     // Catch: java.lang.Throwable -> Lc4
                                        android.view.Window r7 = r7.getWindow()     // Catch: java.lang.Throwable -> Lc4
                                        android.view.View r7 = r7.getDecorView()     // Catch: java.lang.Throwable -> Lc4
                                        int r7 = r7.getHeight()     // Catch: java.lang.Throwable -> Lc4
                                        android.app.Activity r0 = r3     // Catch: java.lang.Throwable -> Lc4
                                        int r0 = com.bytedance.sdk.openadsdk.utils.va.m499if(r0)     // Catch: java.lang.Throwable -> Lc4
                                        int r0 = r0 - r7
                                        int r7 = java.lang.Math.abs(r0)     // Catch: java.lang.Throwable -> Lc4
                                    L46:
                                        android.app.Activity r0 = r3     // Catch: java.lang.Throwable -> Lc4
                                        android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Throwable -> Lc4
                                        android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Throwable -> Lc4
                                        int r1 = r0.getPaddingLeft()     // Catch: java.lang.Throwable -> Lc4
                                        int r2 = r0.getPaddingRight()     // Catch: java.lang.Throwable -> Lc4
                                        int r3 = r0.getPaddingBottom()     // Catch: java.lang.Throwable -> Lc4
                                        if (r7 != 0) goto Lba
                                        int r7 = r0.getPaddingTop()     // Catch: java.lang.Throwable -> Lc4
                                        int r4 = r2     // Catch: java.lang.Throwable -> Lc4
                                        r5 = 1
                                        if (r4 != r5) goto L7c
                                        android.app.Activity r4 = r3     // Catch: java.lang.Throwable -> Lc4
                                        android.content.res.Resources r4 = r4.getResources()     // Catch: java.lang.Throwable -> Lc4
                                        android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> Lc4
                                        int r4 = r4.orientation     // Catch: java.lang.Throwable -> Lc4
                                        if (r4 != r5) goto L7c
                                        float r8 = com.bytedance.sdk.openadsdk.utils.va.jpo()     // Catch: java.lang.Throwable -> Lc4
                                    L79:
                                        int r8 = (int) r8     // Catch: java.lang.Throwable -> Lc4
                                        int r7 = r7 + r8
                                        goto La1
                                    L7c:
                                        int r4 = r2     // Catch: java.lang.Throwable -> Lc4
                                        if (r4 != r8) goto La1
                                        android.app.Activity r4 = r3     // Catch: java.lang.Throwable -> Lc4
                                        android.content.res.Resources r4 = r4.getResources()     // Catch: java.lang.Throwable -> Lc4
                                        android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> Lc4
                                        int r4 = r4.orientation     // Catch: java.lang.Throwable -> Lc4
                                        if (r4 != r8) goto La1
                                        boolean r8 = r4     // Catch: java.lang.Throwable -> Lc4
                                        if (r8 == 0) goto L98
                                        float r8 = com.bytedance.sdk.openadsdk.utils.va.jpo()     // Catch: java.lang.Throwable -> Lc4
                                        int r8 = (int) r8     // Catch: java.lang.Throwable -> Lc4
                                        int r1 = r1 + r8
                                    L98:
                                        boolean r8 = r5     // Catch: java.lang.Throwable -> Lc4
                                        if (r8 == 0) goto La1
                                        float r8 = com.bytedance.sdk.openadsdk.utils.va.jpo()     // Catch: java.lang.Throwable -> Lc4
                                        goto L79
                                    La1:
                                        boolean r8 = r0.isAttachedToWindow()     // Catch: java.lang.Throwable -> Lc4
                                        if (r8 == 0) goto Lac
                                        r0.setPadding(r1, r7, r2, r3)     // Catch: java.lang.Throwable -> Lc4
                                        r6.jpo = r5     // Catch: java.lang.Throwable -> Lc4
                                    Lac:
                                        float r7 = r6     // Catch: java.lang.Throwable -> Lc4
                                        r8 = 1120403456(0x42c80000, float:100.0)
                                        int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
                                        if (r7 != 0) goto Lc4
                                        r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                                        r0.setBackgroundColor(r7)     // Catch: java.lang.Throwable -> Lc4
                                        return
                                    Lba:
                                        boolean r7 = r6.jpo     // Catch: java.lang.Throwable -> Lc4
                                        if (r7 == 0) goto Lc4
                                        r7 = 0
                                        r0.setPadding(r1, r7, r2, r3)     // Catch: java.lang.Throwable -> Lc4
                                        r6.jpo = r7     // Catch: java.lang.Throwable -> Lc4
                                    Lc4:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.jpo.ju.jd.AnonymousClass1.jpo(int, int):void");
                                }
                            };
                            activity.getWindow().getDecorView().addOnLayoutChangeListener(this.jpo);
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void jpo(boolean r11) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.jpo.ju.jpo(boolean):void");
    }

    public float[] jpo(int i10) {
        float[] fArrJd = new float[2];
        Activity activity = this.f19936jd.vrc;
        View decorView = activity.getWindow().getDecorView();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 35 && this.f19936jd.f19914jd.sy() == 100.0f) {
            fArrJd[0] = decorView.getWidth() - decorView.getPaddingLeft();
            fArrJd[1] = decorView.getHeight() - decorView.getPaddingTop();
        } else {
            fArrJd[0] = decorView.getWidth() - (decorView.getPaddingLeft() * 2);
            fArrJd[1] = decorView.getHeight() - (decorView.getPaddingTop() * 2);
        }
        fArrJd[0] = va.wqx(activity, fArrJd[0]);
        float fWqx = va.wqx(activity, fArrJd[1]);
        fArrJd[1] = fWqx;
        if (fArrJd[0] < 10.0f || fWqx < 10.0f) {
            fArrJd = jd(this.jpo);
        }
        if (i11 != 26 && i11 != 27 && activity.getResources() != null && activity.getResources().getConfiguration() != null) {
            if ((activity.getResources().getConfiguration().orientation == 2 ? 2 : 1) != i10) {
                if (i10 == 2) {
                    float f10 = fArrJd[0];
                    float f11 = fArrJd[1];
                    if (f10 < f11) {
                        fArrJd[1] = f10;
                        fArrJd[0] = f11;
                        return fArrJd;
                    }
                } else {
                    float f12 = fArrJd[0];
                    float f13 = fArrJd[1];
                    if (f12 > f13) {
                        fArrJd[1] = f12;
                        fArrJd[0] = f13;
                    }
                }
            }
        }
        return fArrJd;
    }

    public void jpo() {
        va.jpo(this.f19936jd.vrc);
        this.f19936jd.vrc.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.ju.2
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i10) {
                if (i10 == 0) {
                    try {
                        if (ju.this.f19936jd.vrc.isFinishing()) {
                            return;
                        }
                        ju.this.f19936jd.vrc.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.ju.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                va.jpo(ju.this.f19936jd.vrc);
                            }
                        }, 2500L);
                    } catch (Exception e10) {
                        nmd.wqx("TTAD.RFSM", e10.getMessage());
                    }
                }
            }
        });
    }

    private static void jpo(Activity activity, int i10) {
        if (activity.getRequestedOrientation() == i10) {
            return;
        }
        activity.setRequestedOrientation(i10);
    }
}
