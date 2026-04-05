package com.bytedance.adsdk.ugeno.jj;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.bytedance.adsdk.ugeno.xyk.wqx;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class jpo<T> extends FrameLayout implements wqx.cm {

    /* renamed from: hx, reason: collision with root package name */
    private static final Interpolator f17848hx = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.jj.jpo.1
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    };

    /* renamed from: au, reason: collision with root package name */
    private boolean f17849au;

    /* renamed from: cm, reason: collision with root package name */
    private int f17850cm;

    /* renamed from: dt, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.jj.jpo.jpo f17851dt;
    private C0063jpo hmu;
    private boolean hna;

    /* renamed from: if, reason: not valid java name */
    private boolean f37if;

    /* renamed from: jd, reason: collision with root package name */
    protected com.bytedance.adsdk.ugeno.xyk.wqx f17852jd;

    /* renamed from: jj, reason: collision with root package name */
    private int f17853jj;
    protected List<T> jpo;

    /* renamed from: jr, reason: collision with root package name */
    private int f17854jr;

    /* renamed from: ju, reason: collision with root package name */
    private float f17855ju;
    private int my;
    private int nmd;

    /* renamed from: nq, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.jj.wqx f17856nq;
    private int opi;
    private boolean oya;
    private final Runnable pdm;
    private boolean prr;

    /* renamed from: qk, reason: collision with root package name */
    private int f17857qk;

    /* renamed from: rq, reason: collision with root package name */
    private int f17858rq;

    /* renamed from: rv, reason: collision with root package name */
    private final Runnable f17859rv;

    /* renamed from: se, reason: collision with root package name */
    private Scroller f17860se;

    /* renamed from: sq, reason: collision with root package name */
    private boolean f17861sq;

    /* renamed from: tu, reason: collision with root package name */
    private FrameLayout f17862tu;
    protected Context wqx;
    private int xyk;

    /* renamed from: yd, reason: collision with root package name */
    private String f17863yd;
    private int zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class jd extends Scroller {
        public jd(Context context, Interpolator interpolator) {
            super(context, interpolator);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i10, int i11, int i12, int i13, int i14) {
            super.startScroll(i10, i11, i12, i13, jpo.this.f17853jj);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i10, int i11, int i12, int i13) {
            super.startScroll(i10, i11, i12, i13, jpo.this.f17853jj);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.adsdk.ugeno.jj.jpo$jpo, reason: collision with other inner class name */
    public class C0063jpo extends com.bytedance.adsdk.ugeno.xyk.jd {
        public C0063jpo() {
        }

        @Override // com.bytedance.adsdk.ugeno.xyk.jd
        public int jpo(Object obj) {
            return -2;
        }

        @Override // com.bytedance.adsdk.ugeno.xyk.jd
        public boolean jpo(View view, Object obj) {
            return view == obj;
        }

        @Override // com.bytedance.adsdk.ugeno.xyk.jd
        public int jpo() {
            if (jpo.this.oya) {
                return 1024;
            }
            return jpo.this.jpo.size();
        }

        @Override // com.bytedance.adsdk.ugeno.xyk.jd
        public Object jpo(ViewGroup viewGroup, int i10) {
            View viewJpo = jpo.this.jpo(i10, cm.jpo(jpo.this.oya, i10, jpo.this.jpo.size()));
            viewGroup.addView(viewJpo);
            return viewJpo;
        }

        @Override // com.bytedance.adsdk.ugeno.xyk.jd
        public void jpo(ViewGroup viewGroup, int i10, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // com.bytedance.adsdk.ugeno.xyk.jd
        public float jpo(int i10) {
            if (jpo.this.f17855ju <= 0.0f) {
                return 1.0f;
            }
            return 1.0f / jpo.this.f17855ju;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class wqx extends com.bytedance.adsdk.ugeno.xyk.wqx {
        public wqx(Context context) {
            super(context);
        }

        private MotionEvent jpo(MotionEvent motionEvent) {
            float width = getWidth();
            float height = getHeight();
            motionEvent.setLocation((motionEvent.getY() / height) * width, (motionEvent.getX() / width) * height);
            return motionEvent;
        }

        @Override // com.bytedance.adsdk.ugeno.xyk.wqx, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
            if (!jpo.this.prr) {
                return false;
            }
            try {
                if (jpo.this.f17858rq != 1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(jpo(motionEvent));
                jpo(motionEvent);
                return zOnInterceptTouchEvent;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.xyk.wqx, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!jpo.this.prr) {
                return false;
            }
            try {
                return jpo.this.f17858rq == 1 ? super.onTouchEvent(jpo(motionEvent)) : super.onTouchEvent(motionEvent);
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
    }

    public jpo(Context context) {
        super(context);
        this.jpo = new CopyOnWriteArrayList();
        this.f17850cm = 2000;
        this.my = 500;
        this.f17853jj = 500;
        this.f17857qk = 0;
        this.xyk = -1;
        this.zz = -1;
        this.f17863yd = "normal";
        this.f17855ju = 1.0f;
        this.f37if = true;
        this.f17849au = true;
        this.oya = true;
        this.prr = true;
        this.opi = 0;
        this.f17854jr = 0;
        this.nmd = 0;
        this.f17858rq = 0;
        this.pdm = new Runnable() { // from class: com.bytedance.adsdk.ugeno.jj.jpo.2
            @Override // java.lang.Runnable
            public void run() throws Resources.NotFoundException {
                int currentItem = jpo.this.f17852jd.getCurrentItem() + 1;
                if (jpo.this.oya) {
                    if (currentItem >= 1024) {
                        jpo.this.f17852jd.jpo(512, false);
                        return;
                    } else {
                        jpo.this.f17852jd.jpo(currentItem, true);
                        return;
                    }
                }
                com.bytedance.adsdk.ugeno.xyk.jd adapter = jpo.this.f17852jd.getAdapter();
                if (adapter != null) {
                    if (currentItem >= adapter.jpo()) {
                        jpo.this.f17852jd.jpo(0, false);
                    } else {
                        jpo.this.f17852jd.jpo(currentItem, true);
                    }
                }
            }
        };
        this.f17859rv = new Runnable() { // from class: com.bytedance.adsdk.ugeno.jj.jpo.3
            @Override // java.lang.Runnable
            public void run() throws Resources.NotFoundException {
                if (jpo.this.f17849au) {
                    int currentItem = jpo.this.f17852jd.getCurrentItem() + 1;
                    if (jpo.this.oya) {
                        if (currentItem >= 1024) {
                            jpo.this.f17852jd.jpo(512, false);
                        } else {
                            jpo.this.f17852jd.jpo(currentItem, true);
                        }
                        jpo jpoVar = jpo.this;
                        jpoVar.postDelayed(jpoVar.f17859rv, jpo.this.f17850cm);
                        return;
                    }
                    com.bytedance.adsdk.ugeno.xyk.jd adapter = jpo.this.f17852jd.getAdapter();
                    if (adapter != null) {
                        if (currentItem >= adapter.jpo()) {
                            jpo.this.f17852jd.jpo(0, false);
                            jpo jpoVar2 = jpo.this;
                            jpoVar2.postDelayed(jpoVar2.f17859rv, jpo.this.f17850cm);
                        } else {
                            jpo.this.f17852jd.jpo(currentItem, true);
                            jpo jpoVar3 = jpo.this;
                            jpoVar3.postDelayed(jpoVar3.f17859rv, jpo.this.f17850cm);
                        }
                    }
                }
            }
        };
        this.wqx = context;
        this.f17862tu = new FrameLayout(context);
        this.f17852jd = jpo();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.f17862tu.addView(this.f17852jd, layoutParams);
        addView(this.f17862tu);
    }

    public void au(int i10) throws Resources.NotFoundException {
        jpo(this.f17863yd, this.f17857qk, this.xyk, this.zz, true);
        if (this.hmu == null) {
            this.hmu = new C0063jpo();
            this.f17852jd.jpo((wqx.cm) this);
            this.f17852jd.setAdapter(this.hmu);
        }
        if (this.oya) {
            if (i10 >= 1024) {
                this.f17852jd.jpo(512, false);
                return;
            } else {
                this.f17852jd.jpo(i10, true);
                return;
            }
        }
        if (i10 < 0 || i10 >= this.jpo.size()) {
            return;
        }
        this.f17852jd.jpo(i10, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f17849au) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3 || action == 4) {
                if (!this.hna) {
                    my();
                }
            } else if (action == 0) {
                jj();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public com.bytedance.adsdk.ugeno.xyk.jd getAdapter() {
        return this.f17852jd.getAdapter();
    }

    public int getCurrentItem() {
        return this.f17852jd.getCurrentItem();
    }

    public com.bytedance.adsdk.ugeno.xyk.wqx getViewPager() {
        return this.f17852jd;
    }

    @Override // com.bytedance.adsdk.ugeno.xyk.wqx.cm
    /* renamed from: if, reason: not valid java name */
    public void mo390if(int i10) {
        if (i10 == 1 && this.hna) {
            jj();
        }
        com.bytedance.adsdk.ugeno.jj.wqx wqxVar = this.f17856nq;
        if (wqxVar != null) {
            wqxVar.jpo(this.oya, i10);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.xyk.wqx.cm
    public void ju(int i10) {
        int i11;
        if (this.f17856nq != null) {
            int iJpo = cm.jpo(this.oya, i10, this.jpo.size());
            i11 = i10;
            this.f17856nq.jpo(this.oya, iJpo, i11, iJpo == 0, iJpo == this.jpo.size() - 1);
        } else {
            i11 = i10;
        }
        if (this.f37if) {
            this.f17851dt.jpo(i11);
        }
    }

    public void setOnPageChangeListener(com.bytedance.adsdk.ugeno.jj.wqx wqxVar) {
        this.f17856nq = wqxVar;
    }

    public void setTwoItems(boolean z10) {
        this.f17861sq = z10;
    }

    public abstract View yd(int i10);

    public jpo zz(int i10) throws Resources.NotFoundException {
        this.zz = i10;
        jpo(this.f17863yd, this.f17857qk, this.xyk, i10, true);
        return this;
    }

    public jpo cm(float f10) {
        this.f17851dt.setIndicatorY(f10);
        return this;
    }

    public jpo jd(float f10) {
        this.f17851dt.setIndicatorHeight((int) f10);
        return this;
    }

    public jpo jj(int i10) {
        this.f17851dt.setUnSelectedColor(i10);
        return this;
    }

    public com.bytedance.adsdk.ugeno.xyk.wqx jpo() {
        return new wqx(getContext());
    }

    public jpo my(int i10) {
        this.f17851dt.setSelectedColor(i10);
        return this;
    }

    public jpo qk(int i10) {
        this.f17857qk = i10;
        jpo(this.f17863yd, i10, this.xyk, this.zz, true);
        return this;
    }

    public jpo wqx(float f10) {
        this.f17851dt.setIndicatorX(f10);
        return this;
    }

    public jpo<T> xyk(int i10) throws Resources.NotFoundException {
        this.xyk = i10;
        jpo(this.f17863yd, this.f17857qk, i10, this.zz, true);
        return this;
    }

    public jpo cm(int i10) {
        this.f17850cm = i10;
        my();
        return this;
    }

    public jpo jd() {
        this.f17851dt.jpo();
        return this;
    }

    public void jj() {
        removeCallbacks(this.f17859rv);
    }

    public jpo jpo(String str) {
        if (TextUtils.equals(str, "rectangle")) {
            this.f17851dt = new com.bytedance.adsdk.ugeno.jj.jpo.wqx(this.wqx);
        } else {
            this.f17851dt = new com.bytedance.adsdk.ugeno.jj.jpo.jd(this.wqx);
        }
        addView(this.f17851dt, new FrameLayout.LayoutParams(-2, -2));
        return this;
    }

    public jpo my(float f10) {
        this.f17855ju = f10;
        return this;
    }

    public jpo wqx(int i10) {
        this.f17853jj = i10;
        if (this.f17860se == null) {
            this.f17860se = new jd(this.wqx, f17848hx);
        }
        this.f17852jd.setScroller(this.f17860se);
        return this;
    }

    private boolean qk() {
        return this.jpo.size() <= 2 && this.oya;
    }

    public jpo jd(String str) {
        this.f17851dt.setIndicatorDirection(str);
        return this;
    }

    public jpo my(boolean z10) {
        this.hna = z10;
        return this;
    }

    public jpo cm(boolean z10) throws Resources.NotFoundException {
        this.f17851dt.setLoop(z10);
        if (this.oya != z10) {
            int iJpo = cm.jpo(z10, this.f17852jd.getCurrentItem(), this.jpo.size());
            this.oya = z10;
            C0063jpo c0063jpo = this.hmu;
            if (c0063jpo != null) {
                c0063jpo.wqx();
                this.f17852jd.setCurrentItem(iJpo);
            }
        }
        return this;
    }

    public jpo jd(int i10) {
        this.my = i10;
        return this;
    }

    public void my() {
        removeCallbacks(this.f17859rv);
        postDelayed(this.f17859rv, this.f17850cm);
    }

    public jpo jd(boolean z10) {
        this.prr = z10;
        return this;
    }

    public jpo jpo(float f10) {
        this.f17851dt.setIndicatorWidth((int) f10);
        return this;
    }

    public jpo wqx(boolean z10) {
        this.f37if = z10;
        return this;
    }

    public jpo jpo(int i10) {
        this.f17858rq = i10;
        return this;
    }

    public jpo wqx(String str) throws Resources.NotFoundException {
        this.f17863yd = str;
        jpo(str, this.f17857qk, this.xyk, this.zz, true);
        return this;
    }

    public jpo jpo(boolean z10) {
        this.f17849au = z10;
        my();
        return this;
    }

    public void wqx() {
        int i10;
        jpo(this.f17863yd, this.f17857qk, this.xyk, this.zz, true);
        if (this.hmu == null) {
            this.hmu = new C0063jpo();
            this.f17852jd.jpo((wqx.cm) this);
            this.f17852jd.setAdapter(this.hmu);
        }
        int i11 = this.opi;
        if (i11 < 0 || i11 >= this.jpo.size()) {
            this.opi = 0;
        }
        if (this.oya) {
            i10 = this.opi + 512;
        } else {
            i10 = this.opi;
        }
        this.f17852jd.jpo(i10, true);
        if (!this.oya) {
            ju(i10);
        }
        if (this.f17849au) {
            my();
        }
    }

    public void jpo(String str, int i10, int i11, int i12, boolean z10) throws Resources.NotFoundException {
        C0063jpo c0063jpo = this.hmu;
        if (c0063jpo != null) {
            c0063jpo.wqx();
        }
        this.f17852jd.setPageMargin(i10);
        if (i11 > 0 || i12 > 0) {
            if (this.f17858rq == 1) {
                this.f17852jd.setPadding(0, i11 + i10, 0, i12 + i10);
            } else {
                this.f17852jd.setPadding(i11 + i10, 0, i12 + i10, 0);
            }
            this.f17862tu.setClipChildren(false);
            this.f17852jd.setClipChildren(false);
            this.f17852jd.setClipToPadding(false);
        }
        if (this.f17858rq == 1) {
            com.bytedance.adsdk.ugeno.jj.jd.cm cmVar = new com.bytedance.adsdk.ugeno.jj.jd.cm();
            cmVar.jpo(str);
            this.f17852jd.jpo(true, (wqx.my) cmVar);
            this.f17852jd.setOverScrollMode(2);
        } else if (TextUtils.equals(str, "linear")) {
            this.f17852jd.jpo(false, (wqx.my) new com.bytedance.adsdk.ugeno.jj.jd.wqx());
        } else if (TextUtils.equals(str, "cube")) {
            this.f17852jd.jpo(false, (wqx.my) new com.bytedance.adsdk.ugeno.jj.jd.jpo());
        } else if (TextUtils.equals(str, "fade")) {
            this.f17852jd.jpo(false, (wqx.my) new com.bytedance.adsdk.ugeno.jj.jd.jd());
        } else {
            this.f17852jd.jpo(false, (wqx.my) null);
        }
        this.f17852jd.setOffscreenPageLimit((int) this.f17855ju);
    }

    public void cm() {
        jj();
        if (this.hmu != null) {
            this.f17852jd.jd((wqx.cm) this);
            this.f17852jd.setAdapter(null);
            this.hmu = null;
            this.f17852jd.removeAllViews();
            this.jpo.clear();
            this.f17851dt.wqx();
        }
    }

    public View jpo(int i10, int i11) {
        if (this.jpo.size() == 0) {
            return new View(getContext());
        }
        View viewYd = yd(i11);
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (viewYd instanceof ViewGroup) {
            frameLayout.setClipChildren(true);
        }
        if (qk()) {
            viewYd.setTag("two_items_tag");
        }
        if (viewYd.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewYd.getParent()).removeView(viewYd);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(viewYd, layoutParams);
        frameLayout.addView(new View(getContext()), new FrameLayout.LayoutParams(-1, -1));
        if (qk()) {
            frameLayout.setTag(Integer.valueOf(i10));
        }
        return frameLayout;
    }

    public jpo<T> jpo(T t10) {
        if (t10 != null) {
            this.jpo.add(t10);
            if (this.f37if) {
                this.f17851dt.jd();
            }
        }
        C0063jpo c0063jpo = this.hmu;
        if (c0063jpo != null) {
            c0063jpo.wqx();
            this.f17851dt.jpo(this.opi, this.f17852jd.getCurrentItem());
        }
        return this;
    }

    @Override // com.bytedance.adsdk.ugeno.xyk.wqx.cm
    public void jpo(int i10, float f10, int i11) {
        com.bytedance.adsdk.ugeno.jj.wqx wqxVar = this.f17856nq;
        if (wqxVar != null) {
            boolean z10 = this.oya;
            wqxVar.jpo(z10, cm.jpo(z10, i10, this.jpo.size()), f10, i11);
        }
        if (qk()) {
            jpo(i10, findViewWithTag(Integer.valueOf(i10)));
            if (f10 > 0.0f) {
                int i12 = i10 + 1;
                jpo(i12, findViewWithTag(Integer.valueOf(i12)));
            }
        }
    }

    private void jpo(int i10, View view) {
        View viewFindViewWithTag;
        if ((view instanceof ViewGroup) && (viewFindViewWithTag = view.findViewWithTag("two_items_tag")) == null) {
            T t10 = this.jpo.get(cm.jpo(true, i10, this.jpo.size()));
            if (t10 == null) {
                return;
            }
            if (t10 instanceof com.bytedance.adsdk.ugeno.jd.wqx) {
                viewFindViewWithTag = ((com.bytedance.adsdk.ugeno.jd.wqx) t10).ju();
            } else if (t10 instanceof View) {
                viewFindViewWithTag = (View) t10;
            }
            if (viewFindViewWithTag == null) {
                return;
            }
            if (viewFindViewWithTag.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewFindViewWithTag.getParent()).removeView(viewFindViewWithTag);
            }
            ((ViewGroup) view).addView(viewFindViewWithTag);
        }
    }
}
