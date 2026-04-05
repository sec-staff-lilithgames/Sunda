package com.inmobi.media;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.widget.ImageView;
import com.inmobi.ads.R;
import com.inmobi.media.A3;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class A3 extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public final byte f31616a;

    /* renamed from: b, reason: collision with root package name */
    public final F5 f31617b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public A3(android.content.Context r10, byte r11, com.inmobi.media.F5 r12) {
        /*
            r9 = this;
            java.lang.String r1 = "CustomView"
            java.lang.String r0 = "null drawable id while creating button - "
            java.lang.String r2 = "new customView - "
            java.lang.String r3 = "context"
            kotlin.jvm.internal.e0.checkNotNullParameter(r10, r3)
            r9.<init>(r10)
            r9.f31616a = r11
            r9.f31617b = r12
            if (r11 != 0) goto L15
            goto L42
        L15:
            r10 = 1
            if (r11 != r10) goto L19
            goto L45
        L19:
            r10 = 2
            if (r11 != r10) goto L1d
            goto L2c
        L1d:
            r10 = 3
            if (r11 != r10) goto L21
            goto L2c
        L21:
            r10 = 4
            if (r11 != r10) goto L25
            goto L2c
        L25:
            r10 = 5
            if (r11 != r10) goto L29
            goto L2c
        L29:
            r10 = 6
            if (r11 != r10) goto L30
        L2c:
            r10 = 30
        L2e:
            r5 = r10
            goto L47
        L30:
            r10 = 9
            if (r11 != r10) goto L35
            goto L42
        L35:
            r10 = 10
            if (r11 != r10) goto L3a
            goto L42
        L3a:
            r10 = 7
            if (r11 != r10) goto L3e
            goto L42
        L3e:
            r10 = 8
            if (r11 != r10) goto L45
        L42:
            r10 = 15
            goto L2e
        L45:
            r10 = 0
            goto L2e
        L47:
            java.lang.Integer r10 = a(r11)     // Catch: java.lang.Exception -> L74
            if (r10 == 0) goto L77
            int r4 = r10.intValue()     // Catch: java.lang.Exception -> L74
            r6 = r5
            r7 = r5
            r8 = r5
            r3 = r9
            r3.a(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L71
            if (r12 == 0) goto L8b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L71
            r10.<init>(r2)     // Catch: java.lang.Exception -> L71
            r10.append(r11)     // Catch: java.lang.Exception -> L71
            java.lang.String r11 = " created"
            r10.append(r11)     // Catch: java.lang.Exception -> L71
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> L71
            com.inmobi.media.G5 r12 = (com.inmobi.media.G5) r12     // Catch: java.lang.Exception -> L71
            r12.c(r1, r10)     // Catch: java.lang.Exception -> L71
            return
        L71:
            r0 = move-exception
        L72:
            r10 = r0
            goto L8c
        L74:
            r0 = move-exception
            r3 = r9
            goto L72
        L77:
            r3 = r9
            if (r12 == 0) goto L8b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L71
            r10.<init>(r0)     // Catch: java.lang.Exception -> L71
            r10.append(r11)     // Catch: java.lang.Exception -> L71
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> L71
            com.inmobi.media.G5 r12 = (com.inmobi.media.G5) r12     // Catch: java.lang.Exception -> L71
            r12.b(r1, r10)     // Catch: java.lang.Exception -> L71
        L8b:
            return
        L8c:
            com.inmobi.media.F5 r11 = r3.f31617b
            if (r11 == 0) goto L97
            com.inmobi.media.G5 r11 = (com.inmobi.media.G5) r11
            java.lang.String r12 = "exception while building customView"
            r11.a(r1, r12, r10)
        L97:
            com.inmobi.media.Y5 r11 = com.inmobi.media.Y5.f32563a
            java.lang.String r11 = "event"
            com.inmobi.media.h2 r10 = com.inmobi.media.C5.a(r10, r11)
            com.inmobi.media.K6 r11 = com.inmobi.media.Y5.f32566d
            r11.a(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.A3.<init>(android.content.Context, byte, com.inmobi.media.F5):void");
    }

    public static Integer a(byte b10) {
        if (b10 == 0) {
            return Integer.valueOf(R.drawable.im_close_button);
        }
        if (b10 == 1) {
            return Integer.valueOf(R.drawable.im_close_transparent);
        }
        if (b10 == 2) {
            return Integer.valueOf(R.drawable.im_close_icon);
        }
        if (b10 == 3) {
            return Integer.valueOf(R.drawable.im_refresh);
        }
        if (b10 == 4) {
            return Integer.valueOf(R.drawable.im_back);
        }
        if (b10 == 5) {
            return Integer.valueOf(R.drawable.im_forward_active);
        }
        if (b10 == 6) {
            return Integer.valueOf(R.drawable.im_forward_inactive);
        }
        if (b10 == 9) {
            return Integer.valueOf(R.drawable.im_mute);
        }
        if (b10 == 10) {
            return Integer.valueOf(R.drawable.im_unmute);
        }
        if (b10 == 7) {
            return Integer.valueOf(R.drawable.im_play);
        }
        if (b10 == 8) {
            return Integer.valueOf(R.drawable.im_pause);
        }
        return null;
    }

    public final void a(final int i10, final int i11, final int i12, final int i13, final int i14) {
        if (R3.f32183a.R()) {
            Icon.createWithResource(getContext(), i10).loadDrawableAsync(getContext(), new Icon.OnDrawableLoadedListener() { // from class: zk.b
                @Override // android.graphics.drawable.Icon.OnDrawableLoadedListener
                public final void onDrawableLoaded(Drawable drawable) {
                    A3.a(this.f98057a, i11, i12, i13, i14, drawable);
                }
            }, ((ExecutorC3020u7) F4.f31772d.getValue()).f33447a);
        } else {
            ((ScheduledThreadPoolExecutor) F4.f31771c.getValue()).execute(new Runnable() { // from class: zk.c
                @Override // java.lang.Runnable
                public final void run() {
                    A3.a(this.f98066b, i10, i11, i12, i13, i14);
                }
            });
        }
    }

    public static final void a(A3 this$0, int i10, int i11, int i12, int i13, Drawable drawable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        if (drawable == null) {
            F5 f52 = this$0.f31617b;
            if (f52 != null) {
                G5 g52 = (G5) f52;
                g52.b("CustomView", a.b.f(this$0.f31616a, " is null", new StringBuilder("drawable for ")));
                return;
            }
            return;
        }
        this$0.setImageDrawable(drawable);
        this$0.setPadding(i10, i11, i12, i13);
    }

    public static final void a(A3 this$0, int i10, int i11, int i12, int i13, int i14) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        Drawable drawable = m3.a.getDrawable(this$0.getContext(), i10);
        if (drawable == null) {
            F5 f52 = this$0.f31617b;
            if (f52 != null) {
                G5 g52 = (G5) f52;
                g52.b("CustomView", a.b.f(this$0.f31616a, " cannot be created", new StringBuilder("CustomView drawable for ")));
                return;
            }
            return;
        }
        this$0.a(drawable, i11, i12, i13, i14);
    }

    public final void a(final Drawable drawable, final int i10, final int i11, final int i12, final int i13) {
        post(new Runnable() { // from class: zk.a
            @Override // java.lang.Runnable
            public final void run() {
                A3.a(this.f98046b, drawable, i10, i11, i12, i13);
            }
        });
    }

    public static final void a(A3 this$0, Drawable drawable, int i10, int i11, int i12, int i13) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(drawable, "$drawable");
        this$0.setImageDrawable(drawable);
        this$0.setPadding(i10, i11, i12, i13);
    }
}
