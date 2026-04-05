package androidx.recyclerview.widget;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w0 implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public static final ThreadLocal f7296g = new ThreadLocal();

    /* renamed from: h, reason: collision with root package name */
    public static final t0 f7297h = new t0();

    /* renamed from: c, reason: collision with root package name */
    public long f7299c;

    /* renamed from: e, reason: collision with root package name */
    public long f7300e;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7298b = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f7301f = new ArrayList();

    public static RecyclerView.n c(RecyclerView recyclerView, int i10, long j10) {
        int childCount = recyclerView.mChildHelper.f7211a.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            RecyclerView.n childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.f7211a.getChildAt(i11));
            if (childViewHolderInt.mPosition == i10 && !childViewHolderInt.isInvalid()) {
                return null;
            }
        }
        RecyclerView.j jVar = recyclerView.mRecycler;
        if (j10 == Long.MAX_VALUE) {
            try {
                if (t3.u.isEnabled()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th2) {
                recyclerView.onExitLayoutOrScroll(false);
                Trace.endSection();
                throw th2;
            }
        }
        recyclerView.onEnterLayoutOrScroll();
        RecyclerView.n nVarK = jVar.k(i10, j10);
        if (nVarK != null) {
            if (!nVarK.isBound() || nVarK.isInvalid()) {
                jVar.a(nVarK, false);
            } else {
                jVar.recycleView(nVarK.itemView);
            }
        }
        recyclerView.onExitLayoutOrScroll(false);
        Trace.endSection();
        return nVarK;
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.f7298b.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f7299c == 0) {
                this.f7299c = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        u0 u0Var = recyclerView.mPrefetchRegistry;
        u0Var.f7278a = i10;
        u0Var.f7279b = i11;
    }

    public void add(RecyclerView recyclerView) {
        boolean z10 = RecyclerView.sDebugAssertionsEnabled;
        ArrayList arrayList = this.f7298b;
        if (z10 && arrayList.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        arrayList.add(recyclerView);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r18) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.w0.b(long):void");
    }

    public void remove(RecyclerView recyclerView) {
        boolean zRemove = this.f7298b.remove(recyclerView);
        if (RecyclerView.sDebugAssertionsEnabled && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList = this.f7298b;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f7300e);
                }
            }
        } finally {
            this.f7299c = 0L;
            Trace.endSection();
        }
    }
}
