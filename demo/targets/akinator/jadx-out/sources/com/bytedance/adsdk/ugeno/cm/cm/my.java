package com.bytedance.adsdk.ugeno.cm.cm;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my extends wqx {

    /* renamed from: au, reason: collision with root package name */
    private int f17676au;
    private AtomicBoolean hna;

    /* renamed from: if, reason: not valid java name */
    private float f28if;

    /* renamed from: jr, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.core.jd.jpo f17677jr;

    /* renamed from: ju, reason: collision with root package name */
    private float f17678ju;
    private String opi;
    private int oya;
    private int prr;

    /* renamed from: sq, reason: collision with root package name */
    private int f17679sq;

    public my(Context context) {
        super(context);
        this.f17676au = 0;
        this.oya = Integer.MAX_VALUE;
        this.prr = Integer.MAX_VALUE;
        this.hna = new AtomicBoolean(true);
        this.f17679sq = 0;
        this.opi = "up";
    }

    private void jd(com.bytedance.adsdk.ugeno.jd.wqx wqxVar) {
        if (this.f17677jr != null) {
            Log.d("GesThrough_UGSlideEvent", "need gesture through, replayGestureMotions");
            this.f17677jr.jpo(wqxVar);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.cm.cm.wqx
    public boolean jpo(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        Map<String, String> map = this.my;
        if (map != null) {
            this.opi = TextUtils.isEmpty(map.get("direction")) ? "all" : this.my.get("direction");
            this.f17676au = com.bytedance.adsdk.ugeno.qk.wqx.jpo(this.my.get("distance"), 0);
            if (this.oya == Integer.MAX_VALUE) {
                this.oya = com.bytedance.adsdk.ugeno.qk.wqx.jpo(this.my.get("frequency"), Integer.MAX_VALUE);
            }
            if (this.prr == Integer.MAX_VALUE) {
                this.prr = com.bytedance.adsdk.ugeno.qk.wqx.jpo(this.my.get("effectiveDuration"), Integer.MAX_VALUE);
            }
            this.f17679sq = com.bytedance.adsdk.ugeno.qk.wqx.jpo(this.my.get("inView"), 0);
            Log.d("GesThrough_UGSlideEvent", "mFrequency: " + this.oya + ", mEffectiveDuration: " + this.prr + ", inEffectiveDuation: " + this.hna.get());
        }
        com.bytedance.adsdk.ugeno.jd.wqx wqxVar = this.f17681jd;
        if (wqxVar != null && wqxVar.dn() && this.f17677jr == null) {
            this.f17677jr = new com.bytedance.adsdk.ugeno.core.jd.jpo();
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        jpo();
        return jpo(this.f17681jd, motionEvent);
    }

    private void jpo() {
        if (this.prr == Integer.MAX_VALUE || this.f17681jd == null || System.currentTimeMillis() - this.f17681jd.nq() < this.prr) {
            return;
        }
        this.hna.set(false);
        Log.d("GesThrough_UGSlideEvent", "inEffectiveDuation -> false");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean jpo(com.bytedance.adsdk.ugeno.jd.wqx r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            com.bytedance.adsdk.ugeno.core.jd.jpo r0 = r10.f17677jr
            r1 = 0
            java.lang.String r2 = "GesThrough_UGSlideEvent"
            if (r0 == 0) goto L18
            boolean r0 = r0.jpo(r12)
            if (r0 == 0) goto L13
            java.lang.String r11 = "mockEvent，skip"
            android.util.Log.d(r2, r11)
            return r1
        L13:
            com.bytedance.adsdk.ugeno.core.jd.jpo r0 = r10.f17677jr
            r0.jpo(r11, r12)
        L18:
            int r0 = r12.getAction()
            r3 = 1
            if (r0 == 0) goto Lbb
            if (r0 == r3) goto L26
            r4 = 3
            if (r0 == r4) goto L26
            goto Lc7
        L26:
            float r0 = r12.getX()
            float r12 = r12.getY()
            int r4 = r10.f17676au
            if (r4 != 0) goto L3a
            com.bytedance.adsdk.ugeno.cm.ju r4 = r10.jpo
            if (r4 == 0) goto L3a
            r10.jpo(r11, r0, r12)
            return r3
        L3a:
            android.content.Context r4 = r10.f17684yd
            float r5 = r10.f17678ju
            float r5 = r0 - r5
            int r4 = com.bytedance.adsdk.ugeno.qk.xyk.jd(r4, r5)
            android.content.Context r5 = r10.f17684yd
            float r6 = r10.f28if
            float r6 = r12 - r6
            int r5 = com.bytedance.adsdk.ugeno.qk.xyk.jd(r5, r6)
            java.lang.String r6 = r10.opi
            int r7 = r6.hashCode()
            switch(r7) {
                case 3739: goto L7c;
                case 96673: goto L75;
                case 3089570: goto L6b;
                case 3317767: goto L61;
                case 108511772: goto L58;
                default: goto L57;
            }
        L57:
            goto L86
        L58:
            java.lang.String r7 = "right"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L86
            goto L9c
        L61:
            java.lang.String r7 = "left"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L86
            int r4 = -r4
            goto L9c
        L6b:
            java.lang.String r7 = "down"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L86
            r4 = r5
            goto L9c
        L75:
            java.lang.String r7 = "all"
            boolean r6 = r6.equals(r7)
            goto L86
        L7c:
            java.lang.String r7 = "up"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L86
            int r4 = -r5
            goto L9c
        L86:
            double r6 = (double) r4
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r6 = java.lang.Math.pow(r6, r8)
            double r4 = (double) r5
            double r4 = java.lang.Math.pow(r4, r8)
            double r4 = r4 + r6
            double r4 = java.lang.Math.sqrt(r4)
            double r4 = java.lang.Math.abs(r4)
            int r4 = (int) r4
        L9c:
            int r5 = r10.f17676au
            if (r4 < r5) goto Lb2
            java.lang.String r1 = "Slide event, direct handling"
            android.util.Log.d(r2, r1)
            com.bytedance.adsdk.ugeno.cm.ju r1 = r10.jpo
            if (r1 == 0) goto Lc7
            r1 = 0
            r10.f17678ju = r1
            r10.f28if = r1
            r10.jpo(r11, r0, r12)
            return r3
        Lb2:
            java.lang.String r12 = "Non-slide event"
            android.util.Log.d(r2, r12)
            r10.jd(r11)
            return r1
        Lbb:
            float r11 = r12.getX()
            r10.f17678ju = r11
            float r11 = r12.getY()
            r10.f28if = r11
        Lc7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.cm.cm.my.jpo(com.bytedance.adsdk.ugeno.jd.wqx, android.view.MotionEvent):boolean");
    }

    private void jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, float f10, float f11) {
        if (this.oya <= 0) {
            Log.d("GesThrough_UGSlideEvent", "frequency <= 0, no trigger slide");
            jd(wqxVar);
            return;
        }
        if (!this.hna.get()) {
            Log.d("GesThrough_UGSlideEvent", "not in effective duration, no trigger slide");
            jd(wqxVar);
        } else {
            if (this.f17679sq == 1 && !jpo(wqxVar.ju(), f10, f11)) {
                Log.d("GesThrough_UGSlideEvent", "not in view, no trigger slide");
                jd(wqxVar);
                return;
            }
            this.jpo.jpo(wqxVar, this.f17682jj, this.wqx.jd());
            int i10 = this.oya;
            if (i10 != Integer.MAX_VALUE) {
                this.oya = i10 - 1;
            }
        }
    }

    private boolean jpo(View view, float f10, float f11) {
        return f10 >= 0.0f && f10 < ((float) view.getWidth()) && f11 >= 0.0f && f11 < ((float) view.getHeight());
    }
}
