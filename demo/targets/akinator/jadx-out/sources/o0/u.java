package o0;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import j1.w1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u extends View {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f77377h;

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f77378i;

    /* renamed from: b, reason: collision with root package name */
    public e0 f77379b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f77380c;

    /* renamed from: e, reason: collision with root package name */
    public Long f77381e;

    /* renamed from: f, reason: collision with root package name */
    public ji.t f77382f;

    /* renamed from: g, reason: collision with root package name */
    public kv.a f77383g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
        f77377h = new int[]{R.attr.state_pressed, R.attr.state_enabled};
        f77378i = new int[0];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context) {
        super(context);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
    }

    private final void setRippleState(boolean z10) throws InterruptedException {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f77382f;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l9 = this.f77381e;
        long jLongValue = jCurrentAnimationTimeMillis - (l9 != null ? l9.longValue() : 0L);
        if (z10 || jLongValue >= 5) {
            int[] iArr = z10 ? f77377h : f77378i;
            e0 e0Var = this.f77379b;
            if (e0Var != null) {
                e0Var.setState(iArr);
            }
        } else {
            ji.t tVar = new ji.t(this, 21);
            this.f77382f = tVar;
            postDelayed(tVar, 50L);
        }
        this.f77381e = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setRippleState$lambda-2, reason: not valid java name */
    public static final void m5759setRippleState$lambda2(u this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        e0 e0Var = this$0.f77379b;
        if (e0Var != null) {
            e0Var.setState(f77378i);
        }
        this$0.f77382f = null;
    }

    /* renamed from: addRipple-KOepWvA, reason: not valid java name */
    public final void m5760addRippleKOepWvA(f0.t interaction, boolean z10, long j10, int i10, long j11, float f10, kv.a onInvalidateRipple) throws InterruptedException {
        kotlin.jvm.internal.e0.checkNotNullParameter(interaction, "interaction");
        kotlin.jvm.internal.e0.checkNotNullParameter(onInvalidateRipple, "onInvalidateRipple");
        if (this.f77379b == null || !kotlin.jvm.internal.e0.areEqual(Boolean.valueOf(z10), this.f77380c)) {
            e0 e0Var = new e0(z10);
            setBackground(e0Var);
            this.f77379b = e0Var;
            this.f77380c = Boolean.valueOf(z10);
        }
        e0 e0Var2 = this.f77379b;
        kotlin.jvm.internal.e0.checkNotNull(e0Var2);
        this.f77383g = onInvalidateRipple;
        m5761updateRipplePropertiesbiQXAtU(j10, i10, j11, f10);
        if (z10) {
            e0Var2.setHotspot(i1.h.m4185getXimpl(interaction.m3839getPressPositionF1C5BW0()), i1.h.m4186getYimpl(interaction.m3839getPressPositionF1C5BW0()));
        } else {
            e0Var2.setHotspot(e0Var2.getBounds().centerX(), e0Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void disposeRipple() throws InterruptedException {
        this.f77383g = null;
        ji.t tVar = this.f77382f;
        if (tVar != null) {
            removeCallbacks(tVar);
            ji.t tVar2 = this.f77382f;
            kotlin.jvm.internal.e0.checkNotNull(tVar2);
            tVar2.run();
        } else {
            e0 e0Var = this.f77379b;
            if (e0Var != null) {
                e0Var.setState(f77378i);
            }
        }
        e0 e0Var2 = this.f77379b;
        if (e0Var2 == null) {
            return;
        }
        e0Var2.setVisible(false, false);
        unscheduleDrawable(e0Var2);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable who) {
        kotlin.jvm.internal.e0.checkNotNullParameter(who, "who");
        kv.a aVar = this.f77383g;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public final void removeRipple() throws InterruptedException {
        setRippleState(false);
    }

    /* renamed from: updateRippleProperties-biQXAtU, reason: not valid java name */
    public final void m5761updateRipplePropertiesbiQXAtU(long j10, int i10, long j11, float f10) {
        e0 e0Var = this.f77379b;
        if (e0Var == null) {
            return;
        }
        e0Var.trySetRadius(i10);
        e0Var.m5754setColorDxMtmZc(j11, f10);
        Rect androidRect = w1.toAndroidRect(i1.p.m4269toRectuvyYCjk(j10));
        setLeft(androidRect.left);
        setTop(androidRect.top);
        setRight(androidRect.right);
        setBottom(androidRect.bottom);
        e0Var.setBounds(androidRect);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
