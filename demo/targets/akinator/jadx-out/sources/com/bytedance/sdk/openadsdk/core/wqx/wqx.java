package com.bytedance.sdk.openadsdk.core.wqx;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.settings.zz;
import com.bytedance.sdk.openadsdk.core.sq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class wqx implements View.OnClickListener, View.OnTouchListener {

    /* renamed from: cm, reason: collision with root package name */
    private static float f21004cm = 0.0f;

    /* renamed from: jd, reason: collision with root package name */
    private static float f21005jd = 0.0f;
    private static float jpo = 0.0f;
    private static long my = 0;

    /* renamed from: rv, reason: collision with root package name */
    protected static int f21006rv = 8;
    private static float wqx;
    protected View sz;
    protected float nmd = -1.0f;

    /* renamed from: rq, reason: collision with root package name */
    protected float f21012rq = -1.0f;

    /* renamed from: tu, reason: collision with root package name */
    protected float f21014tu = -1.0f;

    /* renamed from: dt, reason: collision with root package name */
    protected float f21007dt = -1.0f;
    protected long hmu = -1;

    /* renamed from: nq, reason: collision with root package name */
    protected long f21010nq = -1;

    /* renamed from: se, reason: collision with root package name */
    protected int f21013se = -1;

    /* renamed from: hx, reason: collision with root package name */
    protected int f21008hx = -1024;
    protected int pdm = -1;

    /* renamed from: uu, reason: collision with root package name */
    protected boolean f21015uu = true;
    public SparseArray<jpo> kln = new SparseArray<>();

    /* renamed from: jj, reason: collision with root package name */
    private int f21009jj = 0;

    /* renamed from: qk, reason: collision with root package name */
    private int f21011qk = 0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: cm, reason: collision with root package name */
        public long f21016cm;

        /* renamed from: jd, reason: collision with root package name */
        public double f21017jd;
        public int jpo;
        public double wqx;

        public jpo(int i10, double d10, double d11, long j10) {
            this.jpo = i10;
            this.f21017jd = d10;
            this.wqx = d11;
            this.f21016cm = j10;
        }
    }

    static {
        if (sq.jpo() != null) {
            f21006rv = sq.jd();
        }
        jpo = 0.0f;
        f21005jd = 0.0f;
        wqx = 0.0f;
        f21004cm = 0.0f;
        my = 0L;
    }

    private boolean jpo(View view, Point point) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                View childAt = viewGroup.getChildAt(i14);
                if (jd.jd(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    return view.isShown() && (i10 = point.x) >= (i11 = iArr[0]) && i10 <= childAt.getWidth() + i11 && (i12 = point.y) >= (i13 = iArr[1]) && i12 <= childAt.getHeight() + i13;
                }
                if (jpo(childAt, point)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean jj() {
        return this.f21015uu;
    }

    public abstract void jpo(View view, float f10, float f11, float f12, float f13, SparseArray<jpo> sparseArray, boolean z10);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (zz.jpo()) {
            jpo(view, this.nmd, this.f21012rq, this.f21014tu, this.f21007dt, this.kln, this.f21015uu);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.wqx.wqx.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
