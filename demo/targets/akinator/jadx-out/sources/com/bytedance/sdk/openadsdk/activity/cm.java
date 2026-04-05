package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q1;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.activity.jd;
import com.bytedance.sdk.openadsdk.component.reward.jpo.ju;
import com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.hx;
import com.bytedance.sdk.openadsdk.core.model.kln;
import com.bytedance.sdk.openadsdk.core.model.nq;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.core.nmd;
import com.bytedance.sdk.openadsdk.core.oya;
import com.bytedance.sdk.openadsdk.core.rq;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.tu;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.va;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class cm extends com.bytedance.sdk.openadsdk.activity.wqx implements Handler.Callback {

    /* renamed from: au, reason: collision with root package name */
    private final AtomicBoolean f19293au;
    private boolean cgn;

    /* renamed from: dm, reason: collision with root package name */
    private nq.jpo f19294dm;

    /* renamed from: dn, reason: collision with root package name */
    private boolean f19295dn;

    /* renamed from: dt, reason: collision with root package name */
    private int f19296dt;
    private boolean duq;

    /* renamed from: ef, reason: collision with root package name */
    private int f19297ef;

    /* renamed from: et, reason: collision with root package name */
    private long f19298et;
    private long fy;
    private View hks;
    private boolean hmu;
    private final boolean hna;
    private long huv;

    /* renamed from: hx, reason: collision with root package name */
    private int f19299hx;

    /* renamed from: ic, reason: collision with root package name */
    private JSONObject f19300ic;

    /* renamed from: if, reason: not valid java name */
    private final boolean f91if;

    /* renamed from: ii, reason: collision with root package name */
    private boolean f19301ii;

    /* renamed from: jj, reason: collision with root package name */
    private final RecyclerView f19302jj;
    private jj jkt;

    /* renamed from: jr, reason: collision with root package name */
    private final ArrayList<Message> f19303jr;

    /* renamed from: ju, reason: collision with root package name */
    private final FrameLayout f19304ju;
    private jd.my kln;
    private final boolean nmd;

    /* renamed from: nq, reason: collision with root package name */
    private int f19305nq;
    private com.bytedance.sdk.openadsdk.activity.my nzb;
    private final PAGLogoView opi;
    private final HashSet<String> oya;
    private boolean pdm;

    /* renamed from: pe, reason: collision with root package name */
    private boolean f19306pe;
    private final boolean prr;

    /* renamed from: qk, reason: collision with root package name */
    private final jpo f19307qk;
    private FrameLayout roc;

    /* renamed from: rq, reason: collision with root package name */
    private boolean f19308rq;

    /* renamed from: rv, reason: collision with root package name */
    private boolean f19309rv;
    private boolean rxq;
    private Message sbx;

    /* renamed from: se, reason: collision with root package name */
    private boolean f19310se;

    /* renamed from: sq, reason: collision with root package name */
    private final HashSet<Integer> f19311sq;
    private xyk sz;
    private int tic;

    /* renamed from: tu, reason: collision with root package name */
    private int f19312tu;

    /* renamed from: uu, reason: collision with root package name */
    private int f19313uu;

    /* renamed from: va, reason: collision with root package name */
    private JSONObject f19314va;
    private boolean vrc;
    private boolean wcn;
    private JSONObject xk;
    private final LinearLayoutManager xyk;

    /* renamed from: ya, reason: collision with root package name */
    private boolean f19315ya;

    /* renamed from: yd, reason: collision with root package name */
    private final Handler f19316yd;
    private final TopLayoutDislike2 zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class jd extends my {

        /* renamed from: jd, reason: collision with root package name */
        private final com.bytedance.sdk.openadsdk.component.reward.view.jd f19330jd;
        private final jpo jpo;
        private com.bytedance.sdk.openadsdk.activity.jpo wqx;

        public jd(jpo jpoVar, View view) {
            super(view);
            this.jpo = jpoVar;
            this.f19330jd = (com.bytedance.sdk.openadsdk.component.reward.view.jd) view;
        }

        public xyk jpo() {
            return this.wqx;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.cm.my
        public void jpo(cm cmVar, C0098cm c0098cm, int i10) {
            int bindingAdapterPosition = getBindingAdapterPosition();
            Activity activity = cmVar.jpo;
            if (com.bytedance.sdk.component.utils.jd.jpo(activity)) {
                return;
            }
            dt dtVar = c0098cm.f19329jd;
            com.bytedance.sdk.openadsdk.activity.jpo jpoVar = this.wqx;
            if (jpoVar != null) {
                if (jpo(jpoVar, dtVar)) {
                    this.wqx.jpo(dtVar, bindingAdapterPosition, i10);
                } else {
                    this.jpo.jpo(this, false);
                }
            }
            com.bytedance.sdk.openadsdk.activity.jd jdVar = cmVar.f19408cm;
            if (this.wqx == null) {
                this.wqx = dtVar.jw() ? new qk(jdVar, dtVar, bindingAdapterPosition, i10, false) : new com.bytedance.sdk.openadsdk.activity.jj(jdVar, dtVar, bindingAdapterPosition, i10, false);
            }
            jd.my myVar = new jd.my(1, null);
            myVar.f19374cm = cmVar.f19309rv;
            this.wqx.jd(activity, myVar);
            this.jpo.jpo(this.wqx);
            com.bytedance.sdk.openadsdk.component.reward.view.zz zzVarJpo = this.wqx.jpo();
            if (zzVarJpo == null) {
                return;
            }
            ViewParent parent = zzVarJpo.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(zzVarJpo);
            }
            if (!cmVar.prr) {
                float fYjm = dtVar.yjm();
                if (fYjm > 0.0f) {
                    this.f19330jd.setWidthAndHeightRatio(fYjm);
                } else {
                    this.f19330jd.setWidthOrHeightInParentRatio(0.8f);
                }
            }
            this.f19330jd.jpo(zzVarJpo, new FrameLayout.LayoutParams(-1, -1));
            this.f19330jd.setScene(this.wqx);
        }

        private boolean jpo(xyk xykVar, dt dtVar) {
            kln klnVarJrx;
            if (xykVar.nzb() && (klnVarJrx = xykVar.f19412jj.jrx()) != null) {
                kln klnVarJrx2 = dtVar.jrx();
                if (TextUtils.equals(klnVarJrx.jpo(), klnVarJrx2.jpo()) && TextUtils.equals(klnVarJrx.jd(), klnVarJrx2.jd()) && xykVar.duq()) {
                    return true;
                }
            }
            return false;
        }

        public void jpo(boolean z10) {
            com.bytedance.sdk.openadsdk.activity.jpo jpoVar = this.wqx;
            if (jpoVar == null) {
                return;
            }
            jpoVar.jj(z10);
            this.wqx.nmd();
            if (!z10) {
                this.wqx = null;
            }
            this.f19330jd.jpo();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static abstract class jj implements Runnable {

        /* renamed from: cm, reason: collision with root package name */
        private long f19331cm;

        /* renamed from: jd, reason: collision with root package name */
        private final long f19332jd;
        private final Handler jpo = new Handler(Looper.getMainLooper());
        private long my;
        private long wqx;

        public jj(long j10) {
            this.f19332jd = j10;
        }

        public void cm() {
            this.jpo.removeCallbacks(this);
        }

        public void jd() {
            this.jpo.removeCallbacks(this);
            if (this.my > this.wqx) {
                return;
            }
            this.f19331cm = (SystemClock.elapsedRealtime() - this.wqx) + this.f19331cm;
            this.my = SystemClock.elapsedRealtime();
        }

        public long jj() {
            long jElapsedRealtime;
            long j10;
            if (this.wqx > this.my) {
                jElapsedRealtime = this.f19332jd - (SystemClock.elapsedRealtime() - this.wqx);
                j10 = this.f19331cm;
            } else {
                jElapsedRealtime = this.f19332jd;
                j10 = this.f19331cm;
            }
            long j11 = jElapsedRealtime - j10;
            if (j11 < 0) {
                return 0L;
            }
            return j11;
        }

        public abstract void jpo();

        public void my() {
            this.jpo.postDelayed(this, this.f19332jd);
            this.wqx = SystemClock.elapsedRealtime();
        }

        @Override // java.lang.Runnable
        public void run() {
            jpo();
        }

        public void wqx() {
            long j10 = this.f19332jd - this.f19331cm;
            if (j10 < 0) {
                return;
            }
            this.jpo.removeCallbacks(this);
            this.jpo.postDelayed(this, j10);
            this.wqx = SystemClock.elapsedRealtime();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static abstract class my extends RecyclerView.n {
        public my(View view) {
            super(view);
        }

        public abstract void jpo(cm cmVar, C0098cm c0098cm, int i10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class wqx extends my {
        private final TextView jpo;

        public wqx(View view) {
            super(view);
            com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(view.getContext());
            this.jpo = xykVar;
            xykVar.setTextColor(Color.parseColor("#99FFFFFF"));
            xykVar.setTextSize(14.0f);
            xykVar.setGravity(17);
            xykVar.setPadding(0, 24, 0, 24);
            ((FrameLayout) view).addView(xykVar, new FrameLayout.LayoutParams(-1, -2));
        }

        @Override // com.bytedance.sdk.openadsdk.activity.cm.my
        public void jpo(cm cmVar, C0098cm c0098cm, int i10) {
            this.jpo.setText(c0098cm.wqx);
        }
    }

    public cm(final Activity activity, final dt dtVar, final com.bytedance.sdk.openadsdk.activity.jd jdVar) throws IllegalStateException {
        nq nqVarM472if;
        super(activity, dtVar, jdVar);
        this.f19316yd = new Handler(Looper.getMainLooper(), this);
        this.f19293au = new AtomicBoolean(false);
        this.oya = new HashSet<>();
        this.f19311sq = new HashSet<>();
        this.f19303jr = new ArrayList<>();
        this.f19312tu = 5;
        this.f19296dt = 3;
        this.f19313uu = -1;
        int i10 = 1;
        this.kln = new jd.my(1, null);
        boolean z10 = dtVar.jkt() == 44;
        this.prr = z10;
        boolean zJw = dtVar.jw();
        this.f91if = zJw;
        this.hna = ju.jpo(activity, dtVar) == 1;
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar = new com.bytedance.sdk.openadsdk.core.jj.wqx(activity) { // from class: com.bytedance.sdk.openadsdk.activity.cm.1
            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                cm.this.xk = null;
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        this.f19304ju = wqxVar;
        if (Build.VERSION.SDK_INT >= 35) {
            wqxVar.setFitsSystemWindows(true);
        }
        activity.setContentView(wqxVar);
        this.my = String.valueOf(activity.hashCode());
        com.bytedance.sdk.openadsdk.core.model.jpo jpoVarCm = dtVar.cm();
        if (jpoVarCm != null && (nqVarM472if = jpoVarCm.m472if()) != null) {
            this.duq = nqVarM472if.prr();
            this.f19294dm = nqVarM472if.jj();
            this.f19297ef = Math.max(0, nqVarM472if.zz());
            this.pdm = nqVarM472if.oya();
            this.f19310se = nqVarM472if.ju();
            this.f19305nq = nqVarM472if.xyk();
            this.f19314va = nqVarM472if.m476if();
            this.hmu = nqVarM472if.yd();
            this.f19308rq = nqVarM472if.jpo();
            this.vrc = this.f19305nq > 0;
            this.f19312tu = nqVarM472if.cm();
            this.f19296dt = nqVarM472if.my();
            this.xk = nqVarM472if.jd();
            this.f19300ic = nqVarM472if.wqx();
            if (!this.f19310se) {
                this.duq = false;
            }
        }
        if (zJw) {
            this.f19299hx = (int) ((1.0f - (Math.max(0, Math.min(100, dtVar.ota() < 0 ? sq.cm().nq(String.valueOf(dtVar.jl())).f20868jj : r3)) / 100.0f)) * this.f19297ef);
        }
        RecyclerView recyclerView = new RecyclerView(activity);
        this.f19302jj = recyclerView;
        nq.jpo jpoVar = this.f19294dm;
        if (jpoVar != null) {
            int iWqx = jpoVar.wqx();
            int iCm = this.f19294dm.cm();
            if (iWqx > 0 || iCm > 0) {
                recyclerView.setPadding(va.jd(activity, iWqx), 0, va.jd(activity, iCm), 0);
            }
            int iJd = this.f19294dm.jd();
            int iJpo = this.f19294dm.jpo();
            int iMy = this.f19294dm.my();
            if (iJd > 0 || iMy > 0 || iJpo > 0) {
                final int iJd2 = va.jd(activity, iJd);
                final int iJd3 = va.jd(activity, iJpo);
                final int iJd4 = va.jd(activity, iMy);
                recyclerView.addItemDecoration(new RecyclerView.e() { // from class: com.bytedance.sdk.openadsdk.activity.cm.12
                    @Override // androidx.recyclerview.widget.RecyclerView.e
                    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView2, RecyclerView.l lVar) {
                        int childAdapterPosition = recyclerView2.getChildAdapterPosition(view);
                        int itemCount = recyclerView2.getAdapter().getItemCount();
                        if (childAdapterPosition == 0) {
                            rect.top = iJd2;
                        } else {
                            rect.top = iJd4 / 2;
                        }
                        if (childAdapterPosition == itemCount - 1) {
                            rect.bottom = iJd3;
                        } else {
                            rect.bottom = iJd4 / 2;
                        }
                    }
                });
            }
        }
        wqxVar.addView(recyclerView, new FrameLayout.LayoutParams(-1, -1));
        TopLayoutDislike2 topLayoutDislike2 = new TopLayoutDislike2(activity);
        this.zz = topLayoutDislike2;
        wqxVar.addView(topLayoutDislike2, new FrameLayout.LayoutParams(-1, -2));
        topLayoutDislike2.load(dtVar);
        topLayoutDislike2.setShowDislike(true);
        topLayoutDislike2.setShowSound(true);
        boolean zHna = sq.cm().hna(String.valueOf(dtVar.jl()));
        this.f19309rv = zHna;
        topLayoutDislike2.setSoundMute(zHna);
        topLayoutDislike2.setListener(new com.bytedance.sdk.openadsdk.component.reward.top.jd() { // from class: com.bytedance.sdk.openadsdk.activity.cm.13
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.jd
            public void jd(View view) {
                if (cm.this.sz != null) {
                    cm.this.sz.c_();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.jd
            public void jpo(View view) {
                com.bytedance.sdk.openadsdk.core.p000if.cm cmVarJpo;
                dt dtVar2 = dtVar;
                com.bytedance.sdk.openadsdk.cm.wqx.jpo("skip", dtVar2, dtVar2.my(), (Map<String, Object>) null);
                com.bytedance.sdk.openadsdk.core.model.cm cmVarKc = dtVar.kc();
                if (cmVarKc != null && (cmVarJpo = cmVarKc.jpo()) != null) {
                    cmVarJpo.jj(0L);
                    cmVarJpo.my(0L);
                }
                cm.this.se();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.jd
            public void wqx(View view) {
                jdVar.cm();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.jd
            public void jpo(View view, String str) {
                if (cm.this.sz != null) {
                    cm.this.sz.jpo(str);
                    cm.this.f19309rv = !r1.f19309rv;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.jd
            public void cm(View view) {
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity, i10, z) { // from class: com.bytedance.sdk.openadsdk.activity.cm.14
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public void calculateExtraLayoutSpace(RecyclerView.l lVar, int[] iArr) {
                super.calculateExtraLayoutSpace(lVar, iArr);
                int height = cm.this.f19302jj.getHeight();
                iArr[0] = height;
                iArr[1] = height;
            }
        };
        this.xyk = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        jpo jpoVar2 = new jpo(this, dtVar.dsh());
        this.f19307qk = jpoVar2;
        recyclerView.setAdapter(jpoVar2);
        if (!this.vrc && !this.hmu) {
            jpoVar2.jpo(com.bytedance.sdk.component.utils.dt.jpo(activity, "tt_list_end_tip"));
        }
        if (z10) {
            new q1().attachToRecyclerView(recyclerView);
        } else if (this.f19310se) {
            new com.bytedance.sdk.openadsdk.component.reward.view.jpo().attachToRecyclerView(recyclerView);
        }
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.bytedance.sdk.openadsdk.activity.cm.15

            /* renamed from: cm, reason: collision with root package name */
            private int f19321cm;

            /* renamed from: jd, reason: collision with root package name */
            private final Rect f19322jd = new Rect();
            private int wqx = -1;

            /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private void jpo() {
                /*
                    r8 = this;
                    com.bytedance.sdk.openadsdk.activity.cm r0 = com.bytedance.sdk.openadsdk.activity.cm.this
                    boolean r0 = com.bytedance.sdk.openadsdk.activity.cm.my(r0)
                    if (r0 != 0) goto La
                    goto L8d
                La:
                    com.bytedance.sdk.openadsdk.activity.cm r0 = com.bytedance.sdk.openadsdk.activity.cm.this
                    com.bytedance.sdk.openadsdk.activity.cm$jpo r0 = com.bytedance.sdk.openadsdk.activity.cm.jj(r0)
                    int r0 = r0.cm()
                    if (r0 != 0) goto L18
                    goto L8d
                L18:
                    com.bytedance.sdk.openadsdk.activity.cm r1 = com.bytedance.sdk.openadsdk.activity.cm.this
                    androidx.recyclerview.widget.LinearLayoutManager r1 = com.bytedance.sdk.openadsdk.activity.cm.qk(r1)
                    int r1 = r1.findFirstVisibleItemPosition()
                    com.bytedance.sdk.openadsdk.activity.cm r2 = com.bytedance.sdk.openadsdk.activity.cm.this
                    androidx.recyclerview.widget.LinearLayoutManager r2 = com.bytedance.sdk.openadsdk.activity.cm.qk(r2)
                    int r2 = r2.findLastVisibleItemPosition()
                    int r3 = r2 % r0
                    int r4 = r8.wqx
                    if (r3 <= r4) goto L8d
                    r3 = r1
                L33:
                    if (r3 > r2) goto L8d
                    int r4 = r3 % r0
                    int r5 = r8.wqx
                    if (r4 <= r5) goto L8a
                    if (r3 == r1) goto L3f
                    if (r3 != r2) goto L6d
                L3f:
                    com.bytedance.sdk.openadsdk.activity.cm r5 = com.bytedance.sdk.openadsdk.activity.cm.this
                    androidx.recyclerview.widget.LinearLayoutManager r5 = com.bytedance.sdk.openadsdk.activity.cm.qk(r5)
                    android.view.View r5 = r5.findViewByPosition(r3)
                    if (r5 == 0) goto L6d
                    android.graphics.Rect r6 = r8.f19322jd
                    r6.setEmpty()
                    android.graphics.Rect r6 = r8.f19322jd
                    r5.getGlobalVisibleRect(r6)
                    int r5 = r5.getHeight()
                    if (r5 <= 0) goto L8a
                    android.graphics.Rect r6 = r8.f19322jd
                    int r6 = r6.height()
                    float r6 = (float) r6
                    r7 = 1065353216(0x3f800000, float:1.0)
                    float r6 = r6 * r7
                    float r5 = (float) r5
                    float r6 = r6 / r5
                    r5 = 1056964608(0x3f000000, float:0.5)
                    int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
                    if (r5 < 0) goto L8a
                L6d:
                    com.bytedance.sdk.openadsdk.activity.cm r5 = com.bytedance.sdk.openadsdk.activity.cm.this
                    androidx.recyclerview.widget.RecyclerView r5 = com.bytedance.sdk.openadsdk.activity.cm.cm(r5)
                    androidx.recyclerview.widget.RecyclerView$n r5 = r5.findViewHolderForAdapterPosition(r3)
                    boolean r6 = r5 instanceof com.bytedance.sdk.openadsdk.activity.cm.jd
                    if (r6 == 0) goto L84
                    com.bytedance.sdk.openadsdk.activity.cm$jd r5 = (com.bytedance.sdk.openadsdk.activity.cm.jd) r5
                    com.bytedance.sdk.openadsdk.activity.jpo r5 = com.bytedance.sdk.openadsdk.activity.cm.jd.jpo(r5)
                    r5.pdm()
                L84:
                    int r5 = r8.wqx
                    if (r4 <= r5) goto L8a
                    r8.wqx = r4
                L8a:
                    int r3 = r3 + 1
                    goto L33
                L8d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.cm.AnonymousClass15.jpo():void");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView2, int i11) {
                super.onScrollStateChanged(recyclerView2, i11);
                int iFindFirstCompletelyVisibleItemPosition = cm.this.xyk.findFirstCompletelyVisibleItemPosition();
                cm.this.xyk.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = cm.this.xyk.findLastVisibleItemPosition();
                if (iFindFirstCompletelyVisibleItemPosition < 0) {
                    return;
                }
                if (i11 == 0 && iFindFirstCompletelyVisibleItemPosition != cm.this.f19313uu) {
                    boolean z11 = iFindFirstCompletelyVisibleItemPosition == cm.this.tic;
                    cm cmVar = cm.this;
                    cmVar.jpo(iFindFirstCompletelyVisibleItemPosition, cmVar.duq && z11);
                    if (cm.this.duq && !z11 && cm.this.pdm) {
                        cm.this.duq = false;
                    }
                    if (cm.this.jkt != null) {
                        cm.this.jkt.cm();
                        cm.this.jkt = null;
                    }
                }
                if (i11 == 0) {
                    cm.this.tic = -1;
                }
                if (!cm.this.vrc || cm.this.f19305nq <= 0 || iFindLastVisibleItemPosition < cm.this.f19307qk.jpo() - cm.this.f19305nq) {
                    return;
                }
                cm.this.dt();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView2, int i11, int i12) {
                super.onScrolled(recyclerView2, i11, i12);
                if (i12 == 0) {
                    return;
                }
                jpo();
                int iFindLastVisibleItemPosition = cm.this.xyk.findLastVisibleItemPosition();
                if (i12 > 0 && cm.this.vrc && cm.this.f19305nq > 0 && iFindLastVisibleItemPosition >= cm.this.f19307qk.jpo() - cm.this.f19305nq) {
                    cm.this.dt();
                }
                if (this.f19321cm != iFindLastVisibleItemPosition) {
                    this.f19321cm = iFindLastVisibleItemPosition;
                    if (!cm.this.f19311sq.isEmpty() && cm.this.f19311sq.contains(Integer.valueOf(iFindLastVisibleItemPosition))) {
                        cm.this.f19311sq.remove(Integer.valueOf(iFindLastVisibleItemPosition));
                        RecyclerView.n nVarFindViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(iFindLastVisibleItemPosition);
                        if (nVarFindViewHolderForAdapterPosition instanceof jd) {
                            jd jdVar2 = (jd) nVarFindViewHolderForAdapterPosition;
                            jdVar2.wqx.my(true);
                            jdVar2.wqx.uu();
                            return;
                        }
                        return;
                    }
                    if (cm.this.wcn) {
                        cm.this.wcn = false;
                        RecyclerView.n nVarFindViewHolderForAdapterPosition2 = recyclerView2.findViewHolderForAdapterPosition(iFindLastVisibleItemPosition);
                        if (nVarFindViewHolderForAdapterPosition2 instanceof jd) {
                            jd jdVar3 = (jd) nVarFindViewHolderForAdapterPosition2;
                            if (jdVar3.wqx != null) {
                                jdVar3.wqx.my(true);
                                jdVar3.wqx.rv();
                            }
                        }
                    }
                }
            }
        });
        kln();
        final int iTu = tu();
        recyclerView.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.cm.16
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.utils.jd.jpo(activity)) {
                    return;
                }
                cm.this.jpo(iTu, true);
            }
        });
        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(activity, dtVar);
        this.opi = pAGLogoViewCreatePAGLogoViewByMaterial;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 83;
        layoutParams.leftMargin = va.jd(activity, 16.0f);
        wqxVar.addView(pAGLogoViewCreatePAGLogoViewByMaterial, layoutParams);
        pAGLogoViewCreatePAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.cm.17
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Context context = view.getContext();
                dt dtVar2 = dtVar;
                TTWebsiteActivity.jpo(context, dtVar2, dtVar2.my());
            }
        });
        this.nmd = com.bytedance.sdk.openadsdk.rq.jpo.jpo("draw_feed_item_reuse", 0) == 1;
    }

    private void duq() {
        if (this.f19301ii) {
            this.f19298et = System.currentTimeMillis();
        }
        this.f19316yd.removeMessages(1);
        jj jjVar = this.jkt;
        if (jjVar != null) {
            jjVar.jd();
        }
    }

    private boolean ef() {
        FrameLayout frameLayout = this.roc;
        return (frameLayout == null || frameLayout.getParent() == null) ? false : true;
    }

    private void hx() {
        FrameLayout frameLayout = this.roc;
        if (frameLayout == null) {
            return;
        }
        ViewParent parent = frameLayout.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.roc);
        }
        this.roc = null;
        xyk xykVar = this.sz;
        if (xykVar instanceof com.bytedance.sdk.openadsdk.activity.jpo) {
            ((com.bytedance.sdk.openadsdk.activity.jpo) xykVar).kln();
        }
        nzb();
        Message message = this.sbx;
        if (message != null) {
            handleMessage(message);
            this.sbx = null;
        }
    }

    private void kln() {
        nq nqVarM472if;
        com.bytedance.sdk.openadsdk.core.model.jpo jpoVarCm = this.f19409jd.cm();
        if (jpoVarCm == null || (nqVarM472if = jpoVarCm.m472if()) == null || TextUtils.isEmpty(nqVarM472if.qk())) {
            return;
        }
        this.nzb = new com.bytedance.sdk.openadsdk.activity.my(this.f19408cm, this.f19409jd, -1, 1, false, false, true);
    }

    private void nzb() {
        if (this.f19298et != 0) {
            xyk xykVar = this.sz;
            if (xykVar != null && rv.jd(xykVar.f19412jj)) {
                int iCurrentTimeMillis = this.f19297ef - ((int) ((System.currentTimeMillis() - this.f19298et) / 1000));
                this.f19297ef = iCurrentTimeMillis;
                if (iCurrentTimeMillis < 0) {
                    this.f19297ef = 0;
                }
            }
            this.f19298et = 0L;
        }
        if (this.f19297ef >= 0) {
            this.f19316yd.removeMessages(1);
            this.f19316yd.sendEmptyMessage(1);
        }
        jj jjVar = this.jkt;
        if (jjVar != null) {
            jjVar.wqx();
        }
    }

    private void pdm() {
        xyk xykVar;
        if (!this.f91if || this.f19408cm.au() || (xykVar = this.sz) == null) {
            return;
        }
        xykVar.dn();
    }

    private void rv() {
        if (this.f19306pe || this.xk == null) {
            return;
        }
        this.f19316yd.removeMessages(3);
        this.f19316yd.sendEmptyMessageDelayed(3, this.f19312tu * 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void se() {
        com.bytedance.sdk.openadsdk.activity.my myVar = this.nzb;
        if (myVar == null || !myVar.jr()) {
            this.f19408cm.cm();
            return;
        }
        jd(this.nzb);
        this.f19304ju.removeView(this.f19302jj);
        this.zz.setVisibility(8);
        this.opi.setVisibility(8);
    }

    private void sz() {
        if (this.roc != null || this.xk == null || this.rxq) {
            return;
        }
        this.f19306pe = true;
        this.roc = new com.bytedance.sdk.openadsdk.core.jj.wqx(this.jpo) { // from class: com.bytedance.sdk.openadsdk.activity.cm.10
            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                cm.this.f19316yd.removeMessages(4);
                cm.this.f19316yd.sendEmptyMessage(4);
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        View view = this.hks;
        if (view != null && view.getParent() == null) {
            this.roc.addView(this.hks, new FrameLayout.LayoutParams(-1, -1));
        }
        this.f19304ju.addView(this.roc, new FrameLayout.LayoutParams(-1, -1));
        this.f19316yd.sendEmptyMessageDelayed(4, this.f19296dt * 1000);
        xyk xykVar = this.sz;
        if (xykVar instanceof com.bytedance.sdk.openadsdk.activity.jpo) {
            ((com.bytedance.sdk.openadsdk.activity.jpo) xykVar).sz();
        }
        duq();
    }

    private void uu() {
        if (this.xk == null) {
            return;
        }
        new com.bytedance.sdk.openadsdk.core.ju.zz.jpo(this.jpo).jpo(this.xk, com.bytedance.sdk.openadsdk.core.zz.jpo.jd.jd(), this.f19300ic, new com.bytedance.sdk.openadsdk.core.ju.qk.cm() { // from class: com.bytedance.sdk.openadsdk.activity.cm.9
            @Override // com.bytedance.sdk.openadsdk.core.ju.qk.cm
            public void jpo(int i10, String str) {
                cm.this.rxq = true;
            }

            @Override // com.bytedance.sdk.openadsdk.core.ju.qk.cm
            public void jpo(com.bytedance.adsdk.ugeno.jd.wqx<View> wqxVar) {
                View viewJu = wqxVar.ju();
                ViewGroup viewGroup = (ViewGroup) viewJu.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(viewJu);
                }
                cm.this.hks = viewJu;
                if (cm.this.roc != null) {
                    cm.this.roc.addView(viewJu, new FrameLayout.LayoutParams(-1, -1));
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public com.bytedance.sdk.openadsdk.component.reward.top.wqx au() {
        return null;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f19295dn) {
            this.f19303jr.add(this.f19316yd.obtainMessage(message.what, message.arg1, message.arg2, message.obj));
            return false;
        }
        int i10 = message.what;
        if (i10 == 1) {
            int i11 = this.f19297ef;
            if (i11 > 0) {
                if (i11 <= this.f19299hx) {
                    pdm();
                }
                TopLayoutDislike2 topLayoutDislike2 = this.zz;
                StringBuilder sb2 = new StringBuilder();
                int i12 = this.f19297ef;
                this.f19297ef = i12 - 1;
                sb2.append(i12);
                sb2.append(ApsMetricsDataMap.APSMETRICS_FIELD_SDK);
                topLayoutDislike2.setSkipText(sb2.toString());
                if (this.f19297ef >= 0) {
                    this.f19316yd.removeMessages(message.what);
                    this.f19316yd.sendEmptyMessageDelayed(message.what, 1000L);
                }
            } else {
                pdm();
                if (my()) {
                    this.zz.showSkipButton();
                } else {
                    this.zz.showCloseButton();
                }
            }
        } else if (i10 == 3) {
            sz();
        } else if (i10 == 4) {
            hx();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void jpo(int i10) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void jr() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void nmd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dt() {
        if (this.f19293au.compareAndSet(false, true)) {
            AdSlot adSlotGmx = this.f19409jd.gmx();
            hx hxVar = new hx();
            hxVar.f20667jj = true;
            if (this.f19409jd.vzb() != null || this.f19409jd.jrx() != null) {
                hxVar.zz = 2;
            }
            hxVar.f20669qk = this.f19314va;
            this.f19307qk.jpo(com.bytedance.sdk.component.utils.dt.jpo(this.jpo, SUvoXnn.YKjVNltt));
            if (com.bytedance.sdk.openadsdk.utils.jd.jpo()) {
                sq.wqx().jpo(adSlotGmx, hxVar, this.f19409jd.jp(), (nmd) new rq() { // from class: com.bytedance.sdk.openadsdk.activity.cm.18
                    @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.tu.jpo
                    public void jpo(int i10, String str) {
                        cm.this.jpo(i10, str);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.tu.jpo
                    public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, com.bytedance.sdk.openadsdk.core.model.wqx wqxVar) {
                        cm.this.jpo(jpoVar, wqxVar);
                    }
                });
            } else {
                sq.wqx().jpo(adSlotGmx, hxVar, this.f19409jd.jp(), new tu.jpo() { // from class: com.bytedance.sdk.openadsdk.activity.cm.19
                    @Override // com.bytedance.sdk.openadsdk.core.tu.jpo
                    public void jpo(int i10, String str) {
                        cm.this.jpo(i10, str);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.tu.jpo
                    public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, com.bytedance.sdk.openadsdk.core.model.wqx wqxVar) {
                        cm.this.jpo(jpoVar, wqxVar);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hmu() {
        if (this.vrc) {
            return;
        }
        if (this.hmu) {
            tu();
        } else {
            duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.cm.2
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.component.utils.jd.jpo(cm.this.jpo)) {
                        return;
                    }
                    cm.this.f19307qk.jpo(com.bytedance.sdk.component.utils.dt.jpo(sq.jpo(), "tt_list_end_tip"));
                }
            });
        }
    }

    private void nq() {
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.cm.5
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.utils.jd.jpo(cm.this.jpo)) {
                    return;
                }
                cm.this.f19293au.set(false);
                if (!cm.this.hmu) {
                    cm.this.f19307qk.jpo(com.bytedance.sdk.component.utils.dt.jpo(sq.jpo(), "tt_list_end_tip"));
                } else {
                    cm.this.f19307qk.jpo("");
                    cm.this.hmu();
                }
            }
        });
    }

    private int tu() {
        if (!this.hmu || this.f19307qk.wqx() || this.f19293au.get() || this.vrc) {
            return 0;
        }
        int iJpo = jpo(this.f19313uu, this.f19307qk.cm(), LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
        this.f19307qk.jpo(this.f19313uu, iJpo);
        if (this.f19313uu < 0) {
            this.f19302jj.scrollToPosition(iJpo);
            return iJpo;
        }
        this.f19313uu = iJpo;
        return iJpo;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public List<dt> hna() {
        return this.f19307qk.my();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    /* renamed from: if, reason: not valid java name */
    public xyk mo432if() {
        return this.sz;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public boolean jj() {
        return this.f19309rv;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public int ju() {
        return this.oya.size();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public boolean my() {
        return this.nzb != null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void opi() {
        super.opi();
        this.f19301ii = true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    /* renamed from: rq, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.openadsdk.activity.jpo oya() {
        RecyclerView.n nVarFindViewHolderForAdapterPosition = this.f19302jj.findViewHolderForAdapterPosition(this.f19313uu + 1);
        if (!(nVarFindViewHolderForAdapterPosition instanceof jd)) {
            return null;
        }
        xyk xykVarJpo = ((jd) nVarFindViewHolderForAdapterPosition).jpo();
        if (xykVarJpo instanceof com.bytedance.sdk.openadsdk.activity.jpo) {
            return (com.bytedance.sdk.openadsdk.activity.jpo) xykVarJpo;
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void sq() {
        if (this.f19315ya) {
            return;
        }
        this.f19315ya = true;
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.huv;
        long jCurrentTimeMillis = System.currentTimeMillis();
        dt dtVar = this.f19409jd;
        com.bytedance.sdk.openadsdk.cm.wqx.jpo(jCurrentTimeMillis, dtVar, dtVar.my(), "first_ad_loaded", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.activity.cm.11
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jd() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, jElapsedRealtime);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public int zz() {
        return this.f19297ef;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.activity.cm$cm, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0098cm {

        /* renamed from: jd, reason: collision with root package name */
        public dt f19329jd;
        public int jpo = 0;
        public String wqx;

        public C0098cm(dt dtVar) {
            this.f19329jd = dtVar;
        }

        public C0098cm(String str) {
            this.wqx = str;
        }
    }

    private void jd(xyk xykVar) {
        Iterator<xyk> it = this.f19307qk.jd().iterator();
        while (it.hasNext()) {
            xyk next = it.next();
            if (next != xykVar) {
                next.jpo(this.sz, xykVar, this.kln);
            }
        }
        com.bytedance.sdk.openadsdk.activity.my myVar = this.nzb;
        if (myVar != null && myVar != xykVar) {
            myVar.jpo(this.sz, xykVar, this.kln);
        }
        xyk xykVar2 = this.sz;
        this.sz = xykVar;
        if (xykVar2 != null) {
            xykVar2.f94if = false;
            xykVar2.oya();
            xykVar2.cm();
        }
        xykVar.f94if = true;
        xykVar.jd(this.jpo, new jd.my(1, null));
        com.bytedance.sdk.openadsdk.component.reward.view.zz zzVarJpo = xykVar.jpo();
        if (zzVarJpo.getVisibility() != 0) {
            zzVarJpo.setVisibility(0);
        }
        if (zzVarJpo.getParent() == null) {
            this.f19304ju.addView(zzVarJpo, new FrameLayout.LayoutParams(-1, -1));
        }
        this.f19408cm.jd(xykVar);
        if (xykVar.d_() != this.f19309rv) {
            xykVar.jpo("card_sync");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wqx(xyk xykVar) {
        xyk xykVar2 = this.sz;
        if (xykVar != xykVar2) {
            return;
        }
        if (this.duq) {
            if (this.f19313uu < this.f19307qk.jpo() - 1) {
                int i10 = this.f19313uu + 1;
                this.tic = i10;
                if (this.prr) {
                    this.f19302jj.smoothScrollToPosition(i10);
                } else {
                    jd(i10);
                }
            } else {
                this.tic = 0;
                this.f19302jj.scrollToPosition(0);
                this.f19302jj.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.cm.8
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.bytedance.sdk.component.utils.jd.jpo(cm.this.jpo)) {
                            return;
                        }
                        cm cmVar = cm.this;
                        cmVar.jpo(cmVar.tic, true);
                    }
                });
            }
        } else if (this.cgn) {
            xykVar2.wqx();
        } else {
            xykVar2.va();
        }
        this.jkt = null;
        this.cgn = false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void cm() {
        super.cm();
        xyk xykVar = this.sz;
        if (xykVar != null) {
            xykVar.huv();
        }
        com.bytedance.sdk.openadsdk.activity.my myVar = this.nzb;
        if (myVar != null) {
            myVar.nmd();
        }
        Iterator<xyk> it = this.f19307qk.jd().iterator();
        while (it.hasNext()) {
            it.next().nmd();
        }
        this.f19316yd.removeCallbacksAndMessages(null);
        jj jjVar = this.jkt;
        if (jjVar != null) {
            jjVar.cm();
            this.jkt = null;
        }
        xyk xykVar2 = this.sz;
        if (xykVar2 == null || xykVar2.dt() || this.f19409jd.rf()) {
            return;
        }
        oya.jd().post(new jd.wqx(this.f19409jd));
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class jpo extends RecyclerView.a {

        /* renamed from: cm, reason: collision with root package name */
        private boolean f19333cm;
        private boolean my;
        private final cm wqx;
        private final ArrayList<C0098cm> jpo = new ArrayList<>();

        /* renamed from: jd, reason: collision with root package name */
        private final ArrayList<xyk> f19334jd = new ArrayList<>();

        public jpo(cm cmVar, List<dt> list) {
            this.wqx = cmVar;
            for (int i10 = 0; i10 < list.size(); i10++) {
                dt dtVar = list.get(i10);
                if (dtVar != null && cmVar != null) {
                    dtVar.duq(cmVar.my);
                }
                this.jpo.add(new C0098cm(dtVar));
            }
        }

        public int cm() {
            return this.f19333cm ? this.jpo.size() - 1 : this.jpo.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            if (this.my) {
                return Integer.MAX_VALUE;
            }
            return this.jpo.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemViewType(int i10) {
            C0098cm c0098cm = this.jpo.get(i10 % this.jpo.size());
            if (c0098cm.jpo != 0) {
                return -1;
            }
            kln klnVarJrx = c0098cm.f19329jd.jrx();
            if (klnVarJrx == null) {
                return 1;
            }
            return (klnVarJrx.jpo() + klnVarJrx.jd()).hashCode();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        /* renamed from: jd, reason: merged with bridge method [inline-methods] */
        public void onViewDetachedFromWindow(my myVar) {
            com.bytedance.sdk.openadsdk.activity.jpo jpoVar;
            super.onViewDetachedFromWindow(myVar);
            if (!(myVar instanceof jd) || (jpoVar = ((jd) myVar).wqx) == null) {
                return;
            }
            jpoVar.se().hmu.pe();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public my onCreateViewHolder(ViewGroup viewGroup, int i10) {
            if (i10 == -1) {
                com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar = new com.bytedance.sdk.openadsdk.core.jj.wqx(viewGroup.getContext());
                wqxVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                return new wqx(wqxVar);
            }
            com.bytedance.sdk.openadsdk.component.reward.view.jd jdVar = new com.bytedance.sdk.openadsdk.component.reward.view.jd(viewGroup.getContext(), this.wqx.hna, this.wqx.prr, va.jd(viewGroup.getContext(), 10.0f));
            jdVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return new jd(this, jdVar);
        }

        public List<dt> my() {
            ArrayList arrayList = new ArrayList();
            Iterator<C0098cm> it = this.jpo.iterator();
            while (it.hasNext()) {
                C0098cm next = it.next();
                if (next.jpo == 0) {
                    arrayList.add(next.f19329jd);
                }
            }
            return arrayList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        /* renamed from: wqx, reason: merged with bridge method [inline-methods] */
        public void onViewRecycled(my myVar) {
            super.onViewRecycled(myVar);
            if (myVar instanceof jd) {
                jd jdVar = (jd) myVar;
                com.bytedance.sdk.openadsdk.activity.jpo jpoVar = jdVar.wqx;
                if (!this.wqx.nmd) {
                    jpo(jdVar, false);
                    return;
                }
                boolean zJd = jd(jpoVar);
                if (jpoVar != null) {
                    jpo(jdVar, zJd);
                }
            }
        }

        private boolean jd(xyk xykVar) {
            return xykVar != null && xykVar.nzb();
        }

        public ArrayList<xyk> jd() {
            return this.f19334jd;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(my myVar, int i10) {
            if (i10 >= this.jpo.size()) {
                i10 %= this.jpo.size();
            }
            myVar.jpo(this.wqx, this.jpo.get(i10), i10);
        }

        public boolean wqx() {
            return this.my;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public void onViewAttachedToWindow(my myVar) {
            super.onViewAttachedToWindow(myVar);
        }

        public int jpo() {
            int itemCount = getItemCount();
            return this.f19333cm ? itemCount - 1 : itemCount;
        }

        public void jpo(String str) {
            int size = this.jpo.size();
            C0098cm c0098cm = size > 0 ? this.jpo.get(size - 1) : null;
            boolean zIsEmpty = TextUtils.isEmpty(str);
            if (c0098cm == null || c0098cm.jpo != 1) {
                if (zIsEmpty) {
                    return;
                }
                this.jpo.add(new C0098cm(str));
                notifyItemInserted(size);
                this.f19333cm = true;
                return;
            }
            if (!zIsEmpty) {
                c0098cm.wqx = str;
                notifyItemChanged(size - 1);
            } else {
                this.jpo.remove(c0098cm);
                notifyItemRemoved(size - 1);
                this.f19333cm = false;
            }
        }

        public void jpo(xyk xykVar) {
            this.f19334jd.add(xykVar);
        }

        public void jpo(List<dt> list) {
            cm cmVar;
            int size = this.jpo.size();
            if (this.f19333cm) {
                size--;
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                dt dtVar = list.get(i10);
                if (dtVar != null && (cmVar = this.wqx) != null) {
                    dtVar.duq(cmVar.my);
                }
                this.jpo.add(size + i10, new C0098cm(dtVar));
                dtVar.sxw();
            }
            notifyItemRangeInserted(size, list.size());
        }

        public void jpo(int i10, int i11) {
            if (this.my) {
                return;
            }
            this.my = true;
            if (i10 < 0) {
                i10 = 0;
            }
            int size = this.jpo.size();
            notifyItemRangeInserted(size, (Integer.MAX_VALUE - i11) - (size - i10));
            notifyItemRangeInserted(0, i11 - i10);
        }

        public void jpo(jd jdVar, boolean z10) {
            if (jdVar.wqx == null) {
                return;
            }
            this.f19334jd.remove(jdVar.wqx);
            jdVar.jpo(z10);
        }
    }

    private static int jpo(int i10, int i11, int i12) {
        if (i10 < 0) {
            i10 = 0;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = i12 + i13;
            if (i14 % i11 == i10) {
                return i14;
            }
            int i15 = i12 - i13;
            if (i15 % i11 == i10) {
                return i15;
            }
        }
        return i12;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void jpo(Bundle bundle) {
        super.jpo(bundle);
        uu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(int i10, String str) {
        this.vrc = false;
        nq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, com.bytedance.sdk.openadsdk.core.model.wqx wqxVar) {
        this.vrc = false;
        if (jpoVar.cm() != null && !jpoVar.cm().isEmpty()) {
            jpo(jpoVar);
            return;
        }
        wqxVar.jpo(-3);
        wqxVar.wqx(1);
        com.bytedance.sdk.openadsdk.core.model.wqx.jpo(wqxVar);
        nq();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void wqx() {
        super.wqx();
        this.f19295dn = true;
        xyk xykVar = this.sz;
        if (xykVar != null) {
            xykVar.oya();
        }
        duq();
        this.cgn = this.jkt != null;
        this.f19316yd.removeMessages(3);
    }

    private void jd(int i10) {
        RecyclerView.n nVarFindViewHolderForAdapterPosition;
        int iFindFirstVisibleItemPosition = this.xyk.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = this.xyk.findLastVisibleItemPosition();
        if (i10 < iFindFirstVisibleItemPosition) {
            this.f19302jj.smoothScrollToPosition(i10);
            return;
        }
        if (i10 <= iFindLastVisibleItemPosition) {
            int i11 = i10 - iFindFirstVisibleItemPosition;
            int childCount = this.f19302jj.getChildCount();
            if (i11 <= 0 || i11 >= childCount || (nVarFindViewHolderForAdapterPosition = this.f19302jj.findViewHolderForAdapterPosition(i10 - 1)) == null) {
                return;
            }
            this.f19302jj.smoothScrollBy(0, nVarFindViewHolderForAdapterPosition.itemView.getBottom());
            return;
        }
        this.f19302jj.smoothScrollToPosition(this.tic);
    }

    private void jpo(final com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) {
        nq nqVarM472if = jpoVar.m472if();
        if (nqVarM472if != null) {
            this.f19314va = nqVarM472if.m476if();
            this.vrc = nqVarM472if.au();
        }
        if (!this.prr) {
            for (dt dtVar : jpoVar.cm()) {
                if (dtVar.ww() != null && dt.my(dtVar)) {
                    com.bytedance.sdk.openadsdk.core.au.jpo.jd jdVarJpo = dt.jpo(CacheDirFactory.getICacheDir(dtVar.ew()).jpo(), dtVar);
                    jdVarJpo.jpo("material_meta", dtVar);
                    jdVarJpo.jpo("ad_slot", dtVar.gmx());
                    com.bytedance.sdk.openadsdk.core.au.my.jpo.jpo(jdVarJpo, new com.bykv.vk.openvk.jpo.jpo.jpo.my.jd() { // from class: com.bytedance.sdk.openadsdk.activity.cm.3
                        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.my.jpo.InterfaceC0054jpo
                        public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar, int i10) {
                        }

                        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.my.jpo.InterfaceC0054jpo
                        public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar, int i10, String str) {
                        }
                    });
                }
            }
        }
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.cm.4
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.utils.jd.jpo(cm.this.jpo)) {
                    return;
                }
                cm.this.f19293au.set(false);
                cm.this.f19307qk.jpo("");
                cm.this.f19307qk.jpo(jpoVar.cm());
                cm.this.hmu();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void jd() {
        super.jd();
        this.f19295dn = false;
        this.f19301ii = false;
        xyk xykVar = this.sz;
        if (xykVar != null && !this.cgn) {
            xykVar.wqx();
        }
        if (this.huv == 0) {
            this.huv = SystemClock.elapsedRealtime();
        }
        nzb();
        rv();
        Iterator<Message> it = this.f19303jr.iterator();
        while (it.hasNext()) {
            handleMessage(it.next());
        }
        this.f19303jr.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(int i10, boolean z10) {
        int i11;
        RecyclerView.n nVarFindViewHolderForAdapterPosition = this.f19302jj.findViewHolderForAdapterPosition(i10);
        if (nVarFindViewHolderForAdapterPosition == null || !(nVarFindViewHolderForAdapterPosition instanceof jd) || (i11 = this.f19313uu) == i10) {
            return;
        }
        jpo(i11, i10, z10);
        this.f19313uu = i10;
        this.fy = SystemClock.elapsedRealtime();
        xyk xykVarJpo = ((jd) nVarFindViewHolderForAdapterPosition).jpo();
        jd(xykVarJpo);
        this.oya.add(xykVarJpo.f19412jj.roc());
        if (this.vrc && this.f19305nq > 0 && this.f19313uu >= this.f19307qk.jpo() - this.f19305nq) {
            dt();
        }
        com.bytedance.sdk.openadsdk.activity.jpo jpoVarOya = oya();
        if (jpoVarOya != null) {
            if (!this.prr && this.xyk.findLastVisibleItemPosition() >= this.f19313uu + 1) {
                jpoVarOya.my(true);
            }
            this.f19311sq.add(Integer.valueOf(this.f19313uu + 1));
            jpoVarOya.rv();
            this.wcn = false;
            return;
        }
        this.wcn = true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void jd(xyk xykVar, int i10) {
        xyk xykVar2 = this.sz;
        if (xykVar != xykVar2) {
            return;
        }
        if (i10 == 2) {
            duq();
            return;
        }
        if (i10 == 1) {
            if (ef()) {
                xyk xykVar3 = this.sz;
                if (xykVar3 instanceof com.bytedance.sdk.openadsdk.activity.jpo) {
                    ((com.bytedance.sdk.openadsdk.activity.jpo) xykVar3).sz();
                    return;
                }
                return;
            }
            nzb();
            return;
        }
        if (i10 == 3 || i10 == 4) {
            try {
                xykVar2.se().hmu.uu();
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.nmd.wqx("CardsLayoutManager", th2);
            }
        }
    }

    private void jpo(int i10, int i11, boolean z10) {
        String str;
        if (i10 < 0 || i11 < 0 || i10 == i11) {
            return;
        }
        if (z10) {
            str = "auto_down";
        } else {
            str = i11 > i10 ? "down" : "up";
        }
        final String str2 = str;
        final long jElapsedRealtime = (SystemClock.elapsedRealtime() - this.fy) / 1000;
        List<dt> listMy = this.f19307qk.my();
        final int size = i10 % listMy.size();
        final int size2 = i11 % listMy.size();
        dt dtVar = listMy.get(size);
        com.bytedance.sdk.openadsdk.cm.wqx.jpo(System.currentTimeMillis(), dtVar, dtVar.my(), "slide", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.activity.cm.6
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jpo() throws JSONException {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("from", size + 1);
                    jSONObject.put("to", size2 + 1);
                    jSONObject.put("direction", str2);
                    jSONObject.put("click_user_remaining", jElapsedRealtime);
                    return jSONObject;
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void jpo(Activity activity) {
        super.jpo(activity);
        va.jpo(activity);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void jpo(final xyk xykVar, xyk xykVar2, jd.my myVar) {
        long jCm;
        if (xykVar != this.sz) {
            return;
        }
        if (xykVar.hx() || rv.jd(xykVar.f19412jj)) {
            jCm = 500;
        } else {
            jCm = xykVar.f19412jj.zx() != null ? r6.cm() * 1000 : 0L;
        }
        jj jjVar = this.jkt;
        if (jjVar != null) {
            jjVar.cm();
        }
        jj jjVar2 = new jj(Math.max(500L, jCm)) { // from class: com.bytedance.sdk.openadsdk.activity.cm.7
            @Override // com.bytedance.sdk.openadsdk.activity.cm.jj
            public void jpo() {
                if (com.bytedance.sdk.component.utils.jd.jpo(cm.this.jpo)) {
                    return;
                }
                cm.this.wqx(xykVar);
            }
        };
        this.jkt = jjVar2;
        jjVar2.my();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void jpo(boolean z10) {
        super.jpo(z10);
        xyk xykVar = this.sz;
        if (xykVar != null) {
            xykVar.wqx(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public boolean jpo(xyk xykVar, int i10) {
        com.bytedance.sdk.openadsdk.activity.my myVar = this.nzb;
        return myVar != null && myVar == xykVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void jpo(View view) {
        super.jpo(view);
        if (view.getParent() != null) {
            return;
        }
        view.setVisibility(4);
        this.f19304ju.addView(view, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void jpo(Map<String, Object> map, xyk xykVar, float f10, float f11) throws JSONException {
        Object jSONObject = map.get("pag_json_data");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (jSONObject instanceof JSONObject) {
            try {
                com.bytedance.sdk.openadsdk.component.reward.view.zz zzVarJpo = xykVar.jpo();
                ((JSONObject) jSONObject).put("width", zzVarJpo.getWidth());
                ((JSONObject) jSONObject).put("height", zzVarJpo.getHeight());
                int i10 = xykVar.f19417yd;
                ((JSONObject) jSONObject).put("click_feed_top", i10 == this.xyk.findFirstVisibleItemPosition() ? 1 : 0);
                ((JSONObject) jSONObject).put("click_on_final", i10 == this.f19307qk.cm() ? 1 : 0);
                ((JSONObject) jSONObject).put("click_countdown_remaining", this.f19297ef);
                ((JSONObject) jSONObject).put("click_user_remaining", i10 == this.f19313uu ? (SystemClock.elapsedRealtime() - this.fy) / 1000 : 0L);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Exception unused) {
            }
        }
    }
}
