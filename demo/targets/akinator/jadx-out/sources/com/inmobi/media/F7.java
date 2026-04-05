package com.inmobi.media;

import android.view.MotionEvent;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class F7 {

    /* renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3093yc f31779a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31780b;

    /* renamed from: c, reason: collision with root package name */
    public float f31781c;

    /* renamed from: d, reason: collision with root package name */
    public float f31782d;

    /* renamed from: e, reason: collision with root package name */
    public float f31783e;

    /* renamed from: f, reason: collision with root package name */
    public float f31784f;

    /* renamed from: g, reason: collision with root package name */
    public int f31785g;

    /* renamed from: h, reason: collision with root package name */
    public int f31786h;

    /* renamed from: i, reason: collision with root package name */
    public float f31787i;

    /* renamed from: j, reason: collision with root package name */
    public JSONArray f31788j;

    /* renamed from: k, reason: collision with root package name */
    public MotionEvent f31789k;

    /* renamed from: l, reason: collision with root package name */
    public int f31790l;

    public F7(GestureDetectorOnGestureListenerC3093yc mListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mListener, "mListener");
        this.f31779a = mListener;
        this.f31780b = "F7";
        this.f31790l = Integer.MAX_VALUE;
        this.f31785g = -1;
        this.f31786h = -1;
    }

    public final void a(MotionEvent endEvent) {
        float y10;
        float x10;
        float f10;
        kotlin.jvm.internal.e0.checkNotNullParameter(endEvent, "event");
        int actionMasked = endEvent.getActionMasked();
        if (actionMasked == 0) {
            String TAG = this.f31780b;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            endEvent.toString();
            this.f31785g = endEvent.getPointerId(endEvent.getActionIndex());
            this.f31788j = new JSONArray();
            JSONArray jSONArray = new JSONArray((Collection) uu.p0.listOf((Object[]) new Integer[]{Integer.valueOf(D2.c(endEvent.getX())), Integer.valueOf(D2.c(endEvent.getY()))}));
            JSONArray jSONArray2 = this.f31788j;
            if (jSONArray2 != null) {
                jSONArray2.put(jSONArray);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            String TAG2 = this.f31780b;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            endEvent.toString();
            this.f31785g = -1;
            JSONArray jSONArray3 = this.f31788j;
            if (jSONArray3 == null || jSONArray3.length() <= 5) {
                return;
            }
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f31779a;
            kotlin.jvm.internal.e0.checkNotNullParameter(this, "movementGestureDetector");
            if (gestureDetectorOnGestureListenerC3093yc.f33620e || !gestureDetectorOnGestureListenerC3093yc.getRenderingConfig().getSupportedGestures().contains(2)) {
                F5 f52 = gestureDetectorOnGestureListenerC3093yc.f33628i;
                if (f52 != null) {
                    String TAG3 = GestureDetectorOnGestureListenerC3093yc.f33611b1;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG3, "TAG");
                    ((G5) f52).c(TAG3, "Pan gesture is disabled from config");
                }
            } else {
                F5 f53 = gestureDetectorOnGestureListenerC3093yc.f33628i;
                if (f53 != null) {
                    String str = GestureDetectorOnGestureListenerC3093yc.f33611b1;
                    StringBuilder sbA = N6.a(str, "TAG", "onPanDetected\n ");
                    JSONArray jSONArray4 = this.f31788j;
                    sbA.append(jSONArray4 != null ? Integer.valueOf(jSONArray4.length()) : null);
                    sbA.append(" \n ");
                    sbA.append(this.f31788j);
                    ((G5) f53).a(str, sv.d0.trimIndent(sbA.toString()));
                }
                gestureDetectorOnGestureListenerC3093yc.c("window.imraidview.onGestureDetected('2', '" + this.f31788j + "');");
            }
            this.f31788j = new JSONArray();
            return;
        }
        float y11 = 0.0f;
        if (actionMasked == 2) {
            JSONArray jSONArray5 = this.f31788j;
            int i10 = this.f31785g;
            if (i10 == -1 || this.f31786h == -1) {
                if (i10 == -1 || jSONArray5 == null || jSONArray5.length() <= 0 || jSONArray5.length() >= 50) {
                    return;
                }
                try {
                    int iC = D2.c(endEvent.getX());
                    int iC2 = D2.c(endEvent.getY());
                    JSONArray jSONArray6 = jSONArray5.getJSONArray(jSONArray5.length() - 1);
                    JSONArray jSONArray7 = new JSONArray((Collection) uu.p0.listOf((Object[]) new Integer[]{Integer.valueOf(iC), Integer.valueOf(iC2)}));
                    float f11 = jSONArray6.getInt(0) - jSONArray7.getInt(0);
                    float f12 = jSONArray6.getInt(1) - jSONArray7.getInt(1);
                    if (((int) Math.sqrt((f12 * f12) + (f11 * f11))) > 100) {
                        jSONArray5.put(jSONArray7);
                        return;
                    }
                    return;
                } catch (JSONException unused) {
                    return;
                }
            }
            int iFindPointerIndex = endEvent.findPointerIndex(i10);
            int iFindPointerIndex2 = endEvent.findPointerIndex(this.f31786h);
            if (iFindPointerIndex >= 0) {
                x10 = endEvent.getX(iFindPointerIndex);
                y10 = endEvent.getY(iFindPointerIndex);
            } else {
                Y5 y52 = Y5.f32563a;
                StringBuilder sb2 = new StringBuilder("Index for mPtrID1=");
                a.b.x(this.f31785g, iFindPointerIndex, " is ", " | Pointer count=", sb2);
                sb2.append(endEvent.getPointerCount());
                C2796h2 event = new C2796h2(new IllegalArgumentException(sb2.toString()));
                kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
                Y5.f32566d.a(event);
                y10 = 0.0f;
                x10 = 0.0f;
            }
            if (iFindPointerIndex2 >= 0) {
                float x11 = endEvent.getX(iFindPointerIndex2);
                y11 = endEvent.getY(iFindPointerIndex2);
                f10 = x11;
            } else {
                Y5 y53 = Y5.f32563a;
                StringBuilder sb3 = new StringBuilder("Index for mPtrID1=");
                a.b.x(this.f31786h, iFindPointerIndex2, " is ", " | Pointer count=", sb3);
                sb3.append(endEvent.getPointerCount());
                C2796h2 event2 = new C2796h2(new IllegalArgumentException(sb3.toString()));
                kotlin.jvm.internal.e0.checkNotNullParameter(event2, "event");
                Y5.f32566d.a(event2);
                f10 = 0.0f;
            }
            float degrees = ((float) Math.toDegrees(((float) Math.atan2(this.f31782d - this.f31784f, this.f31781c - this.f31783e)) - ((float) Math.atan2(y11 - y10, f10 - x10)))) % 360;
            if (degrees < -180.0f) {
                degrees += 360.0f;
            }
            if (degrees > 180.0f) {
                degrees -= 360.0f;
            }
            this.f31787i = Math.abs(degrees);
            return;
        }
        if (actionMasked == 3) {
            String TAG4 = this.f31780b;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG4, "TAG");
            endEvent.toString();
            this.f31785g = -1;
            this.f31786h = -1;
            return;
        }
        if (actionMasked == 5) {
            String TAG5 = this.f31780b;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG5, "TAG");
            endEvent.toString();
            this.f31786h = endEvent.getPointerId(endEvent.getActionIndex());
            this.f31789k = MotionEvent.obtain(endEvent);
            int iFindPointerIndex3 = endEvent.findPointerIndex(this.f31785g);
            int iFindPointerIndex4 = endEvent.findPointerIndex(this.f31786h);
            if (iFindPointerIndex3 >= 0) {
                this.f31783e = endEvent.getX(iFindPointerIndex3);
                this.f31784f = endEvent.getY(iFindPointerIndex3);
            } else {
                Y5 y54 = Y5.f32563a;
                StringBuilder sb4 = new StringBuilder("Index for mPtrID1=");
                a.b.x(this.f31785g, iFindPointerIndex3, " is ", " | Pointer count=", sb4);
                sb4.append(endEvent.getPointerCount());
                C2796h2 event3 = new C2796h2(new IllegalArgumentException(sb4.toString()));
                kotlin.jvm.internal.e0.checkNotNullParameter(event3, "event");
                Y5.f32566d.a(event3);
            }
            if (iFindPointerIndex4 >= 0) {
                this.f31781c = endEvent.getX(iFindPointerIndex4);
                this.f31782d = endEvent.getY(iFindPointerIndex4);
            } else {
                Y5 y55 = Y5.f32563a;
                StringBuilder sb5 = new StringBuilder("Index for mPtrID2=");
                a.b.x(this.f31786h, iFindPointerIndex4, " is ", " | Pointer count=", sb5);
                sb5.append(endEvent.getPointerCount());
                C2796h2 event4 = new C2796h2(new IllegalArgumentException(sb5.toString()));
                kotlin.jvm.internal.e0.checkNotNullParameter(event4, "event");
                Y5.f32566d.a(event4);
            }
            float f13 = this.f31783e - this.f31781c;
            float f14 = this.f31784f - this.f31782d;
            this.f31790l = (int) Math.sqrt((f14 * f14) + (f13 * f13));
            return;
        }
        if (actionMasked != 6) {
            return;
        }
        String TAG6 = this.f31780b;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG6, "TAG");
        endEvent.toString();
        this.f31786h = -1;
        if (this.f31787i > 30.0f) {
            MotionEvent initialEvent = this.f31789k;
            if (initialEvent != null) {
                GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc2 = this.f31779a;
                kotlin.jvm.internal.e0.checkNotNullParameter(this, "movementGestureDetector");
                kotlin.jvm.internal.e0.checkNotNullParameter(initialEvent, "initialEvent");
                kotlin.jvm.internal.e0.checkNotNullParameter(endEvent, "endEvent");
                if (gestureDetectorOnGestureListenerC3093yc2.f33620e || !gestureDetectorOnGestureListenerC3093yc2.getRenderingConfig().getSupportedGestures().contains(3)) {
                    F5 f54 = gestureDetectorOnGestureListenerC3093yc2.f33628i;
                    if (f54 != null) {
                        String TAG7 = GestureDetectorOnGestureListenerC3093yc.f33611b1;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG7, "TAG");
                        ((G5) f54).c(TAG7, "Rotation gesture is disabled from config");
                    }
                } else {
                    F5 f55 = gestureDetectorOnGestureListenerC3093yc2.f33628i;
                    if (f55 != null) {
                        String str2 = GestureDetectorOnGestureListenerC3093yc.f33611b1;
                        StringBuilder sbA2 = N6.a(str2, "TAG", " Rotation detected ");
                        sbA2.append(this.f31787i);
                        sbA2.append(" \n ");
                        sbA2.append(initialEvent);
                        sbA2.append(" \n ");
                        sbA2.append(endEvent);
                        ((G5) f55).a(str2, sv.d0.trimIndent(sbA2.toString()));
                    }
                    JSONArray jSONArray8 = new JSONArray();
                    jSONArray8.put(new JSONArray((Collection) uu.p0.listOf((Object[]) new Integer[]{Integer.valueOf(D2.c(initialEvent.getX())), Integer.valueOf(D2.c(initialEvent.getY()))})));
                    jSONArray8.put(new JSONArray((Collection) uu.p0.listOf((Object[]) new Integer[]{Integer.valueOf(D2.c(initialEvent.getX(1))), Integer.valueOf(D2.c(initialEvent.getY(1)))})));
                    jSONArray8.put(new JSONArray((Collection) uu.p0.listOf((Object[]) new Integer[]{Integer.valueOf(D2.c(endEvent.getX())), Integer.valueOf(D2.c(endEvent.getY()))})));
                    jSONArray8.put(new JSONArray((Collection) uu.p0.listOf((Object[]) new Integer[]{Integer.valueOf(D2.c(endEvent.getX(1))), Integer.valueOf(D2.c(endEvent.getY(1)))})));
                    gestureDetectorOnGestureListenerC3093yc2.c("window.imraidview.onGestureDetected('3', '" + jSONArray8 + "');");
                }
            }
            this.f31787i = 0.0f;
        }
        float x12 = endEvent.getX() - endEvent.getX(1);
        float y12 = endEvent.getY() - endEvent.getY(1);
        if (Math.abs(((int) Math.sqrt((y12 * y12) + (x12 * x12))) - this.f31790l) > 500) {
            MotionEvent initialEvent2 = this.f31789k;
            if (initialEvent2 != null) {
                GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc3 = this.f31779a;
                kotlin.jvm.internal.e0.checkNotNullParameter(this, "movementGestureDetector");
                kotlin.jvm.internal.e0.checkNotNullParameter(initialEvent2, "initialEvent");
                kotlin.jvm.internal.e0.checkNotNullParameter(endEvent, "endEvent");
                if (gestureDetectorOnGestureListenerC3093yc3.f33620e || !gestureDetectorOnGestureListenerC3093yc3.getRenderingConfig().getSupportedGestures().contains(4)) {
                    F5 f56 = gestureDetectorOnGestureListenerC3093yc3.f33628i;
                    if (f56 != null) {
                        String TAG8 = GestureDetectorOnGestureListenerC3093yc.f33611b1;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG8, "TAG");
                        ((G5) f56).c(TAG8, "Pinch gesture is disabled from config");
                    }
                } else {
                    F5 f57 = gestureDetectorOnGestureListenerC3093yc3.f33628i;
                    if (f57 != null) {
                        String TAG9 = GestureDetectorOnGestureListenerC3093yc.f33611b1;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG9, "TAG");
                        ((G5) f57).a(TAG9, sv.d0.trimIndent(" onScaleDetected\n " + initialEvent2 + " \n " + endEvent));
                    }
                    JSONArray jSONArray9 = new JSONArray();
                    float f15 = 2;
                    jSONArray9.put(new JSONArray((Collection) uu.p0.listOf((Object[]) new Integer[]{Integer.valueOf(D2.c((endEvent.getX(1) + endEvent.getX()) / f15)), Integer.valueOf(D2.c((endEvent.getY(1) + endEvent.getY()) / f15))})));
                    gestureDetectorOnGestureListenerC3093yc3.c("window.imraidview.onGestureDetected('4', '" + jSONArray9 + "');");
                }
            }
            this.f31790l = Integer.MAX_VALUE;
        }
    }
}
