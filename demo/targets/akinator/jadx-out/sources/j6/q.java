package j6;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final int f69150b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f69151c;

    public q(int i10, p pVar) {
        this.f69150b = i10;
        this.f69151c = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f69151c.smoothScrollToPosition(this.f69150b);
    }
}
