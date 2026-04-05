package q4;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.drawerlayout.widget.b f82401b;

    public f(androidx.drawerlayout.widget.b bVar) {
        this.f82401b = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        View viewC;
        int width;
        androidx.drawerlayout.widget.b bVar = this.f82401b;
        DrawerLayout drawerLayout = bVar.f6197d;
        int edgeSize = bVar.f6195b.getEdgeSize();
        int i10 = bVar.f6194a;
        boolean z10 = i10 == 3;
        if (z10) {
            viewC = drawerLayout.c(3);
            width = (viewC != null ? -viewC.getWidth() : 0) + edgeSize;
        } else {
            viewC = drawerLayout.c(5);
            width = drawerLayout.getWidth() - edgeSize;
        }
        if (viewC != null) {
            if (((!z10 || viewC.getLeft() >= width) && (z10 || viewC.getLeft() <= width)) || drawerLayout.getDrawerLockMode(viewC) != 0) {
                return;
            }
            DrawerLayout.a aVar = (DrawerLayout.a) viewC.getLayoutParams();
            bVar.f6195b.smoothSlideViewTo(viewC, width, viewC.getTop());
            aVar.f6192c = true;
            drawerLayout.invalidate();
            View viewC2 = drawerLayout.c(i10 == 3 ? 5 : 3);
            if (viewC2 != null) {
                drawerLayout.closeDrawer(viewC2);
            }
            if (drawerLayout.f6178t) {
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = drawerLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                drawerLayout.getChildAt(i11).dispatchTouchEvent(motionEventObtain);
            }
            motionEventObtain.recycle();
            drawerLayout.f6178t = true;
        }
    }
}
