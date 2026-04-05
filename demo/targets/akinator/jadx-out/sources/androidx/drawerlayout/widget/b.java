package androidx.drawerlayout.widget;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import i4.l;
import i4.m;
import q4.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b extends l {

    /* renamed from: a, reason: collision with root package name */
    public final int f6194a;

    /* renamed from: b, reason: collision with root package name */
    public m f6195b;

    /* renamed from: c, reason: collision with root package name */
    public final f f6196c = new f(this);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f6197d;

    public b(DrawerLayout drawerLayout, int i10) {
        this.f6197d = drawerLayout;
        this.f6194a = i10;
    }

    @Override // i4.l
    public int clampViewPositionHorizontal(View view, int i10, int i11) {
        DrawerLayout drawerLayout = this.f6197d;
        if (drawerLayout.a(3, view)) {
            return Math.max(-view.getWidth(), Math.min(i10, 0));
        }
        int width = drawerLayout.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i10, width));
    }

    @Override // i4.l
    public int clampViewPositionVertical(View view, int i10, int i11) {
        return view.getTop();
    }

    @Override // i4.l
    public int getViewHorizontalDragRange(View view) {
        if (DrawerLayout.i(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // i4.l
    public void onEdgeDragStarted(int i10, int i11) {
        int i12 = i10 & 1;
        DrawerLayout drawerLayout = this.f6197d;
        View viewC = i12 == 1 ? drawerLayout.c(3) : drawerLayout.c(5);
        if (viewC == null || drawerLayout.getDrawerLockMode(viewC) != 0) {
            return;
        }
        this.f6195b.captureChildView(viewC, i11);
    }

    @Override // i4.l
    public boolean onEdgeLock(int i10) {
        return false;
    }

    @Override // i4.l
    public void onEdgeTouched(int i10, int i11) {
        this.f6197d.postDelayed(this.f6196c, 160L);
    }

    @Override // i4.l
    public void onViewCaptured(View view, int i10) {
        ((DrawerLayout.a) view.getLayoutParams()).f6192c = false;
        int i11 = this.f6194a == 3 ? 5 : 3;
        DrawerLayout drawerLayout = this.f6197d;
        View viewC = drawerLayout.c(i11);
        if (viewC != null) {
            drawerLayout.closeDrawer(viewC);
        }
    }

    @Override // i4.l
    public void onViewDragStateChanged(int i10) {
        this.f6197d.o(i10, this.f6195b.getCapturedView());
    }

    @Override // i4.l
    public void onViewPositionChanged(View view, int i10, int i11, int i12, int i13) {
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.f6197d;
        float width2 = (drawerLayout.a(3, view) ? i10 + width : drawerLayout.getWidth() - i10) / width;
        drawerLayout.l(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        drawerLayout.invalidate();
    }

    @Override // i4.l
    public void onViewReleased(View view, float f10, float f11) {
        int i10;
        int[] iArr = DrawerLayout.M;
        float f12 = ((DrawerLayout.a) view.getLayoutParams()).f6191b;
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.f6197d;
        if (drawerLayout.a(3, view)) {
            i10 = (f10 > 0.0f || (f10 == 0.0f && f12 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = drawerLayout.getWidth();
            if (f10 < 0.0f || (f10 == 0.0f && f12 > 0.5f)) {
                width2 -= width;
            }
            i10 = width2;
        }
        this.f6195b.settleCapturedViewAt(i10, view.getTop());
        drawerLayout.invalidate();
    }

    public void removeCallbacks() {
        this.f6197d.removeCallbacks(this.f6196c);
    }

    public void setDragger(m mVar) {
        this.f6195b = mVar;
    }

    @Override // i4.l
    public boolean tryCaptureView(View view, int i10) {
        if (!DrawerLayout.i(view)) {
            return false;
        }
        int i11 = this.f6194a;
        DrawerLayout drawerLayout = this.f6197d;
        return drawerLayout.a(i11, view) && drawerLayout.getDrawerLockMode(view) == 0;
    }
}
