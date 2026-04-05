package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.L7;
import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class L7 {

    /* renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3093yc f32001a;

    /* renamed from: b, reason: collision with root package name */
    public final F5 f32002b;

    /* renamed from: c, reason: collision with root package name */
    public B7 f32003c;

    /* renamed from: d, reason: collision with root package name */
    public C3088y7 f32004d;

    /* renamed from: e, reason: collision with root package name */
    public C3088y7 f32005e;

    /* renamed from: f, reason: collision with root package name */
    public C3088y7 f32006f;

    public L7(GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc, F5 f52) {
        this.f32001a = gestureDetectorOnGestureListenerC3093yc;
        this.f32002b = f52;
    }

    public static final boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean b() {
        Context contextD = C2925od.d();
        if (contextD == null) {
            return false;
        }
        Object systemService = contextD.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        return audioManager != null && audioManager.isWiredHeadsetOn();
    }

    public final void a(String url, Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        F5 f52 = this.f32002b;
        if (f52 != null) {
            ((G5) f52).c("MraidMediaProcessor", "doPlayMedia");
        }
        B7 b72 = new B7(activity, this.f32002b);
        this.f32003c = b72;
        b72.setPlaybackData(url);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        RelativeLayout.LayoutParams layoutParamsE = b0.e2.e(-1, -1, 13);
        B7 b73 = this.f32003c;
        if (b73 != null) {
            b73.setLayoutParams(layoutParamsE);
        }
        C7 c72 = new C7(activity);
        c72.setOnTouchListener(new com.applovin.impl.adview.r(3));
        c72.setBackgroundColor(-16777216);
        c72.addView(this.f32003c);
        F5 f53 = this.f32002b;
        if (f53 != null) {
            ((G5) f53).a("MraidMediaProcessor", "adding media view on top");
        }
        viewGroup.addView(c72, new ViewGroup.LayoutParams(-1, -1));
        B7 b74 = this.f32003c;
        if (b74 != null) {
            b74.setViewContainer(c72);
        }
        B7 b75 = this.f32003c;
        if (b75 != null) {
            b75.requestFocus();
        }
        B7 b76 = this.f32003c;
        if (b76 != null) {
            b76.setOnKeyListener(new View.OnKeyListener() { // from class: zk.q
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                    return L7.a(this.f98170b, view, i10, keyEvent);
                }
            });
        }
        B7 b77 = this.f32003c;
        if (b77 != null) {
            b77.setListener(new K7(this));
        }
        B7 b78 = this.f32003c;
        if (b78 != null) {
            b78.a();
        }
    }

    public static final boolean a(L7 this$0, View view, int i10, KeyEvent keyEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        if (4 != i10 || keyEvent.getAction() != 0) {
            return false;
        }
        B7 b72 = this$0.f32003c;
        if (b72 == null) {
            return true;
        }
        b72.b();
        return true;
    }

    public final int a() {
        AdConfig.RenderingConfig renderingConfig;
        F5 f52 = this.f32002b;
        if (f52 != null) {
            ((G5) f52).c("MraidMediaProcessor", C3191e4.i.P);
        }
        Context contextD = C2925od.d();
        if (contextD == null) {
            return -1;
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f32001a;
        if (((gestureDetectorOnGestureListenerC3093yc == null || (renderingConfig = gestureDetectorOnGestureListenerC3093yc.getRenderingConfig()) == null) ? false : renderingConfig.getEnablePubMuteControl()) && C2925od.o()) {
            return 0;
        }
        Object systemService = contextD.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return -1;
    }
}
