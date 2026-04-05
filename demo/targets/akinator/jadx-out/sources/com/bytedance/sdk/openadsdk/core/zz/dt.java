package com.bytedance.sdk.openadsdk.core.zz;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.Cif;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class dt extends GestureDetector {

    /* renamed from: jd, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.wqx.jj f21050jd;
    private final jpo jpo;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo extends GestureDetector.SimpleOnGestureListener {
        boolean jpo = false;

        public boolean jd() {
            return this.jpo;
        }

        public void jpo() {
            this.jpo = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.jpo = true;
            return super.onSingleTapUp(motionEvent);
        }
    }

    public dt(Context context) {
        this(context, new jpo());
    }

    public boolean jd() {
        return this.jpo.jd();
    }

    public void jpo() {
        this.jpo.jpo();
    }

    @Override // android.view.GestureDetector
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f21050jd.jpo(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public dt(Context context, jpo jpoVar) {
        super(context, jpoVar);
        this.jpo = jpoVar;
        this.f21050jd = new com.bytedance.sdk.openadsdk.core.wqx.jj();
        setIsLongpressEnabled(false);
    }

    public Cif jpo(Context context, View view) {
        if (this.f21050jd == null) {
            return new Cif.jpo().jpo();
        }
        return new Cif.jpo().jj(this.f21050jd.jpo).my(this.f21050jd.f20996jd).cm(this.f21050jd.wqx).wqx(this.f21050jd.f20995cm).jd(this.f21050jd.my).jpo(this.f21050jd.f20997jj).jpo(va.jpo(view)).jd(va.wqx(view)).cm(this.f21050jd.f21000qk).my(this.f21050jd.xyk).jj(this.f21050jd.zz).jpo(this.f21050jd.f145if).jd(com.bytedance.sdk.openadsdk.core.zz.jd().jpo() ? 1 : 2).jpo("vessel").jpo(va.xyk(context)).wqx(va.yd(context)).jd(va.zz(context)).jpo();
    }
}
