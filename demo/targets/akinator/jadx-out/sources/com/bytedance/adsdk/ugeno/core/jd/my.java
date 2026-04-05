package com.bytedance.adsdk.ugeno.core.jd;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.bytedance.adsdk.ugeno.core.au;
import com.bytedance.adsdk.ugeno.core.prr;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my {

    /* renamed from: au, reason: collision with root package name */
    private jpo f17724au;

    /* renamed from: if, reason: not valid java name */
    private boolean f33if;

    /* renamed from: ju, reason: collision with root package name */
    private boolean f17728ju;

    /* renamed from: qk, reason: collision with root package name */
    private au f17729qk;
    private au xyk;

    /* renamed from: yd, reason: collision with root package name */
    private Context f17730yd;
    private String zz;
    private float jpo = Float.MIN_VALUE;

    /* renamed from: jd, reason: collision with root package name */
    private float f17726jd = Float.MIN_VALUE;
    private int wqx = 0;

    /* renamed from: cm, reason: collision with root package name */
    private int f17725cm = Integer.MAX_VALUE;
    private int my = Integer.MAX_VALUE;

    /* renamed from: jj, reason: collision with root package name */
    private AtomicBoolean f17727jj = new AtomicBoolean(true);

    public my(Context context, au auVar, boolean z10, boolean z11) {
        this.f17730yd = context;
        this.f17729qk = auVar;
        this.f17728ju = z10;
        this.f33if = z11;
        wqx();
    }

    private void wqx() {
        if (this.f33if) {
            this.f17724au = new jpo();
        }
        au auVar = this.f17729qk;
        if (auVar == null) {
            return;
        }
        this.wqx = auVar.wqx().optInt("slideThreshold");
        this.zz = this.f17729qk.wqx().optString("slideDirection");
        this.f17725cm = this.f17729qk.wqx().optInt("frequency", Integer.MAX_VALUE);
        this.my = this.f17729qk.wqx().optInt("effectiveDuration", Integer.MAX_VALUE);
        Log.d("GesThrough_UGSREvent", "mFrequency: " + this.f17725cm + ", mEffectiveDuration: " + this.my + ", inEffectiveDuation: " + this.f17727jj.get());
    }

    public void jd() {
        this.jpo = Float.MIN_VALUE;
        this.f17726jd = Float.MIN_VALUE;
    }

    public void jpo() {
        if (this.my == Integer.MAX_VALUE) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.jd.my.1
            @Override // java.lang.Runnable
            public void run() {
                my.this.f17727jj.set(false);
                Log.d("GesThrough_UGSREvent", "inEffectiveDuation -> false");
            }
        }, this.my);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean jpo(com.bytedance.adsdk.ugeno.core.prr r8, com.bytedance.adsdk.ugeno.jd.wqx r9, android.view.MotionEvent r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.core.jd.my.jpo(com.bytedance.adsdk.ugeno.core.prr, com.bytedance.adsdk.ugeno.jd.wqx, android.view.MotionEvent, boolean):boolean");
    }

    public my(Context context, au auVar, au auVar2, boolean z10, boolean z11) {
        this.f17730yd = context;
        this.f17729qk = auVar;
        this.xyk = auVar2;
        this.f17728ju = z10;
        this.f33if = z11;
        wqx();
    }

    private void jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar) {
        if (this.f17724au != null) {
            Log.d("GesThrough_UGSREvent", "need gesture through, replayGestureMotions");
            this.f17724au.jpo(wqxVar);
        }
    }

    private void jpo(prr prrVar, au auVar, com.bytedance.adsdk.ugeno.jd.wqx wqxVar) {
        if (this.f17725cm <= 0) {
            Log.d("GesThrough_UGSREvent", "frequency <= 0, no trigger slide");
            jpo(wqxVar);
        } else {
            if (!this.f17727jj.get()) {
                Log.d("GesThrough_UGSREvent", "not in effective duration, no trigger slide");
                jpo(wqxVar);
                return;
            }
            prrVar.jpo(auVar, wqxVar, wqxVar);
            int i10 = this.f17725cm;
            if (i10 != Integer.MAX_VALUE) {
                this.f17725cm = i10 - 1;
            }
        }
    }
}
