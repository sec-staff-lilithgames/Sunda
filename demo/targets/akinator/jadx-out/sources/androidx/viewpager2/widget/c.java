package androidx.viewpager2.widget;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j6.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends RecyclerView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public a f7405a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewPager2 f7406b;

    /* renamed from: c, reason: collision with root package name */
    public final p f7407c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayoutManager f7408d;

    /* renamed from: e, reason: collision with root package name */
    public int f7409e;

    /* renamed from: f, reason: collision with root package name */
    public int f7410f;

    /* renamed from: g, reason: collision with root package name */
    public final j6.d f7411g;

    /* renamed from: h, reason: collision with root package name */
    public int f7412h;

    /* renamed from: i, reason: collision with root package name */
    public int f7413i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7414j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7415k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7416l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7417m;

    public c(ViewPager2 viewPager2) {
        this.f7406b = viewPager2;
        p pVar = viewPager2.f7390l;
        this.f7407c = pVar;
        this.f7408d = (LinearLayoutManager) pVar.getLayoutManager();
        this.f7411g = new j6.d();
        c();
    }

    public final void a(int i10) {
        a aVar = this.f7405a;
        if (aVar != null) {
            aVar.onPageSelected(i10);
        }
    }

    public final void b(int i10) {
        if ((this.f7409e == 3 && this.f7410f == 0) || this.f7410f == i10) {
            return;
        }
        this.f7410f = i10;
        a aVar = this.f7405a;
        if (aVar != null) {
            aVar.onPageScrollStateChanged(i10);
        }
    }

    public final void c() {
        this.f7409e = 0;
        this.f7410f = 0;
        j6.d dVar = this.f7411g;
        dVar.f69137b = -1;
        dVar.f69136a = 0.0f;
        dVar.f69138c = 0;
        this.f7412h = -1;
        this.f7413i = -1;
        this.f7414j = false;
        this.f7415k = false;
        this.f7417m = false;
        this.f7416l = false;
    }

    public final void d(boolean z10) {
        this.f7417m = z10;
        this.f7409e = z10 ? 4 : 1;
        int i10 = this.f7413i;
        if (i10 != -1) {
            this.f7412h = i10;
            this.f7413i = -1;
        } else if (this.f7412h == -1) {
            this.f7412h = this.f7408d.findFirstVisibleItemPosition();
        }
        b(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.c.e():void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
        a aVar;
        int i11 = this.f7409e;
        if (!(i11 == 1 && this.f7410f == 1) && i10 == 1) {
            d(false);
            return;
        }
        if ((i11 == 1 || i11 == 4) && i10 == 2) {
            if (this.f7415k) {
                b(2);
                this.f7414j = true;
                return;
            }
            return;
        }
        j6.d dVar = this.f7411g;
        if ((i11 == 1 || i11 == 4) && i10 == 0) {
            e();
            if (!this.f7415k) {
                int i12 = dVar.f69137b;
                if (i12 != -1 && (aVar = this.f7405a) != null) {
                    aVar.onPageScrolled(i12, 0.0f, 0);
                }
            } else if (dVar.f69138c == 0) {
                int i13 = this.f7412h;
                int i14 = dVar.f69137b;
                if (i13 != i14) {
                    a(i14);
                }
            }
            b(0);
            c();
        }
        if (this.f7409e == 2 && i10 == 0 && this.f7416l) {
            e();
            if (dVar.f69138c == 0) {
                int i15 = this.f7413i;
                int i16 = dVar.f69137b;
                if (i15 != i16) {
                    if (i16 == -1) {
                        i16 = 0;
                    }
                    a(i16);
                }
                b(0);
                c();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScrolled(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.f7415k = r6
            r5.e()
            boolean r0 = r5.f7414j
            r1 = -1
            j6.d r2 = r5.f7411g
            r3 = 0
            if (r0 == 0) goto L3c
            r5.f7414j = r3
            if (r8 > 0) goto L28
            if (r8 != 0) goto L30
            if (r7 >= 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = r3
        L19:
            androidx.viewpager2.widget.ViewPager2 r8 = r5.f7406b
            j6.i r8 = r8.f7387i
            int r8 = r8.getLayoutDirection()
            if (r8 != r6) goto L25
            r8 = r6
            goto L26
        L25:
            r8 = r3
        L26:
            if (r7 != r8) goto L30
        L28:
            int r7 = r2.f69138c
            if (r7 == 0) goto L30
            int r7 = r2.f69137b
            int r7 = r7 + r6
            goto L32
        L30:
            int r7 = r2.f69137b
        L32:
            r5.f7413i = r7
            int r8 = r5.f7412h
            if (r8 == r7) goto L48
            r5.a(r7)
            goto L48
        L3c:
            int r7 = r5.f7409e
            if (r7 != 0) goto L48
            int r7 = r2.f69137b
            if (r7 != r1) goto L45
            r7 = r3
        L45:
            r5.a(r7)
        L48:
            int r7 = r2.f69137b
            if (r7 != r1) goto L4d
            r7 = r3
        L4d:
            float r8 = r2.f69136a
            int r0 = r2.f69138c
            androidx.viewpager2.widget.a r4 = r5.f7405a
            if (r4 == 0) goto L58
            r4.onPageScrolled(r7, r8, r0)
        L58:
            int r7 = r2.f69137b
            int r8 = r5.f7413i
            if (r7 == r8) goto L60
            if (r8 != r1) goto L6e
        L60:
            int r7 = r2.f69138c
            if (r7 != 0) goto L6e
            int r7 = r5.f7410f
            if (r7 == r6) goto L6e
            r5.b(r3)
            r5.c()
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.c.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
