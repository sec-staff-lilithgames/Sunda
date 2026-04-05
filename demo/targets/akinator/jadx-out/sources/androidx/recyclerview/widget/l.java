package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class l {

    /* renamed from: h, reason: collision with root package name */
    public static final k f7172h = new k();

    /* renamed from: a, reason: collision with root package name */
    public final g1 f7173a;

    /* renamed from: b, reason: collision with root package name */
    public final f f7174b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f7175c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f7176d;

    /* renamed from: e, reason: collision with root package name */
    public List f7177e;

    /* renamed from: f, reason: collision with root package name */
    public List f7178f;

    /* renamed from: g, reason: collision with root package name */
    public int f7179g;

    public l(RecyclerView.a aVar, j0 j0Var) {
        this(new d(aVar), new e(j0Var).build());
    }

    public final void a(List list, Runnable runnable) {
        Iterator it = this.f7176d.iterator();
        while (it.hasNext()) {
            ((e1) ((j) it.next())).onCurrentListChanged(list, this.f7178f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void addListListener(j jVar) {
        this.f7176d.add(jVar);
    }

    public List<Object> getCurrentList() {
        return this.f7178f;
    }

    public void removeListListener(j jVar) {
        this.f7176d.remove(jVar);
    }

    public void submitList(List<Object> list) {
        submitList(list, null);
    }

    public void submitList(List<Object> list, Runnable runnable) {
        int i10 = this.f7179g + 1;
        this.f7179g = i10;
        List<Object> list2 = this.f7177e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List list3 = this.f7178f;
        g1 g1Var = this.f7173a;
        if (list == null) {
            int size = list2.size();
            this.f7177e = null;
            this.f7178f = Collections.EMPTY_LIST;
            g1Var.onRemoved(0, size);
            a(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f7174b.getBackgroundThreadExecutor().execute(new i(this, list2, list, i10, runnable));
            return;
        }
        this.f7177e = list;
        this.f7178f = Collections.unmodifiableList(list);
        g1Var.onInserted(0, list.size());
        a(list3, runnable);
    }

    public l(g1 g1Var, f fVar) {
        this.f7176d = new CopyOnWriteArrayList();
        this.f7178f = Collections.EMPTY_LIST;
        this.f7173a = g1Var;
        this.f7174b = fVar;
        if (fVar.getMainThreadExecutor() != null) {
            this.f7175c = fVar.getMainThreadExecutor();
        } else {
            this.f7175c = f7172h;
        }
    }
}
