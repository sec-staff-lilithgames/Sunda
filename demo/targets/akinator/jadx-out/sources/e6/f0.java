package e6;

import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f0 extends j0 implements o0, r4.w {

    /* renamed from: d, reason: collision with root package name */
    public boolean f53794d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f53795e;

    /* renamed from: f, reason: collision with root package name */
    public r4.e0 f53796f;

    /* renamed from: h, reason: collision with root package name */
    public final x0 f53798h;

    /* renamed from: i, reason: collision with root package name */
    public Runnable f53799i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s0 f53800j;

    /* renamed from: a, reason: collision with root package name */
    public long f53791a = -1;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f53792b = null;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f53793c = null;

    /* renamed from: g, reason: collision with root package name */
    public w3.b[] f53797g = null;

    public f0(s0 s0Var) {
        this.f53800j = s0Var;
        x0 x0Var = new x0();
        long[] jArr = new long[20];
        x0Var.f53893a = jArr;
        x0Var.f53894b = new float[20];
        x0Var.f53895c = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
        this.f53798h = x0Var;
    }

    public final void a() {
        ArrayList arrayList = this.f53793c;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f53793c.size();
        if (this.f53797g == null) {
            this.f53797g = new w3.b[size];
        }
        w3.b[] bVarArr = (w3.b[]) this.f53793c.toArray(this.f53797g);
        this.f53797g = null;
        for (int i10 = 0; i10 < size; i10++) {
            bVarArr[i10].accept(this);
            bVarArr[i10] = null;
        }
        this.f53797g = bVarArr;
    }

    @Override // e6.o0
    public void addOnProgressChangedListener(w3.b bVar) {
        if (this.f53793c == null) {
            this.f53793c = new ArrayList();
        }
        this.f53793c.add(bVar);
    }

    @Override // e6.o0
    public void addOnReadyListener(w3.b bVar) {
        if (isReady()) {
            bVar.accept(this);
            return;
        }
        if (this.f53792b == null) {
            this.f53792b = new ArrayList();
        }
        this.f53792b.add(bVar);
    }

    @Override // e6.o0
    public void animateToEnd() {
        b();
        this.f53796f.animateToFinalPosition(getDurationMillis() + 1);
    }

    @Override // e6.o0
    public void animateToStart(Runnable runnable) {
        this.f53799i = runnable;
        b();
        this.f53796f.animateToFinalPosition(0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.f0.b():void");
    }

    @Override // e6.o0
    public float getCurrentFraction() {
        return getCurrentPlayTimeMillis() / getDurationMillis();
    }

    @Override // e6.o0
    public long getCurrentPlayTimeMillis() {
        return Math.min(getDurationMillis(), Math.max(0L, this.f53791a));
    }

    @Override // e6.o0
    public long getDurationMillis() {
        return this.f53800j.K;
    }

    @Override // e6.o0
    public boolean isReady() {
        return this.f53794d;
    }

    @Override // r4.w
    public void onAnimationUpdate(r4.y yVar, float f10, float f11) {
        long jMax = Math.max(-1L, Math.min(getDurationMillis() + 1, Math.round(f10)));
        this.f53800j.q(jMax, this.f53791a);
        this.f53791a = jMax;
        a();
    }

    @Override // e6.j0, e6.g0
    public void onTransitionCancel(c0 c0Var) {
        this.f53795e = true;
    }

    @Override // e6.j0, e6.g0
    public /* bridge */ /* synthetic */ void onTransitionEnd(c0 c0Var, boolean z10) {
        super.onTransitionEnd(c0Var, z10);
    }

    @Override // e6.j0, e6.g0
    public /* bridge */ /* synthetic */ void onTransitionStart(c0 c0Var, boolean z10) {
        super.onTransitionStart(c0Var, z10);
    }

    public void ready() {
        this.f53794d = true;
        ArrayList arrayList = this.f53792b;
        if (arrayList != null) {
            this.f53792b = null;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((w3.b) arrayList.get(i10)).accept(this);
            }
        }
        a();
    }

    @Override // e6.o0
    public void removeOnProgressChangedListener(w3.b bVar) {
        ArrayList arrayList = this.f53793c;
        if (arrayList != null) {
            arrayList.remove(bVar);
        }
    }

    @Override // e6.o0
    public void removeOnReadyListener(w3.b bVar) {
        ArrayList arrayList = this.f53792b;
        if (arrayList != null) {
            arrayList.remove(bVar);
            if (this.f53792b.isEmpty()) {
                this.f53792b = null;
            }
        }
    }

    @Override // e6.o0
    public void setCurrentFraction(float f10) {
        if (this.f53796f != null) {
            throw new IllegalStateException("setCurrentFraction() called after animation has been started");
        }
        setCurrentPlayTimeMillis((long) (f10 * getDurationMillis()));
    }

    @Override // e6.o0
    public void setCurrentPlayTimeMillis(long j10) {
        if (this.f53796f != null) {
            throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
        }
        if (j10 == this.f53791a || !isReady()) {
            return;
        }
        if (!this.f53795e) {
            if (j10 != 0 || this.f53791a <= 0) {
                long durationMillis = getDurationMillis();
                if (j10 == durationMillis && this.f53791a < durationMillis) {
                    j10 = 1 + durationMillis;
                }
            } else {
                j10 = -1;
            }
            long j11 = this.f53791a;
            if (j10 != j11) {
                this.f53800j.q(j10, j11);
                this.f53791a = j10;
            }
        }
        a();
        this.f53798h.addDataPoint(AnimationUtils.currentAnimationTimeMillis(), j10);
    }
}
