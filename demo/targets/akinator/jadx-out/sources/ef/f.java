package ef;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f extends q {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f54313g;

    public f(g gVar) {
        this.f54313g = gVar;
    }

    @Override // ce.j
    public void release() {
        ArrayDeque arrayDeque = this.f54313g.f54316c;
        com.google.android.exoplayer2.util.a.checkState(arrayDeque.size() < 2);
        com.google.android.exoplayer2.util.a.checkArgument(!arrayDeque.contains(this));
        clear();
        arrayDeque.addFirst(this);
    }
}
