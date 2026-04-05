package x3;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f2 implements Iterator, lv.c {

    /* renamed from: b, reason: collision with root package name */
    public int f91574b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f91575c;

    public f2(ViewGroup viewGroup) {
        this.f91575c = viewGroup;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f91574b < this.f91575c.getChildCount();
    }

    @Override // java.util.Iterator
    public void remove() {
        int i10 = this.f91574b - 1;
        this.f91574b = i10;
        this.f91575c.removeViewAt(i10);
    }

    @Override // java.util.Iterator
    public View next() {
        int i10 = this.f91574b;
        this.f91574b = i10 + 1;
        View childAt = this.f91575c.getChildAt(i10);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }
}
