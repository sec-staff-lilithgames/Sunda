package androidx.recyclerview.widget;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f7129b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f7130c;

    public h(i iVar, i0 i0Var) {
        this.f7130c = iVar;
        this.f7129b = i0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        i iVar = this.f7130c;
        l lVar = iVar.f7144g;
        if (lVar.f7179g == iVar.f7142e) {
            List list = iVar.f7141c;
            Runnable runnable = iVar.f7143f;
            List list2 = lVar.f7178f;
            lVar.f7177e = list;
            lVar.f7178f = Collections.unmodifiableList(list);
            this.f7129b.dispatchUpdatesTo(lVar.f7173a);
            lVar.a(list2, runnable);
        }
    }
}
