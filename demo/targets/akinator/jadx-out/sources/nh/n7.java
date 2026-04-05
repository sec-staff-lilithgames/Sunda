package nh;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n7 extends ej {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterator f76495b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f76496c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f76497e;

    public n7(Iterator it, int i10, boolean z10) {
        this.f76495b = it;
        this.f76496c = i10;
        this.f76497e = z10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76495b.hasNext();
    }

    @Override // java.util.Iterator
    public List<Object> next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f76496c;
        Object[] objArr = new Object[i10];
        int i11 = 0;
        while (i11 < i10) {
            Iterator it = this.f76495b;
            if (!it.hasNext()) {
                break;
            }
            objArr[i11] = it.next();
            i11++;
        }
        for (int i12 = i11; i12 < i10; i12++) {
            objArr[i12] = null;
        }
        List<Object> listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(objArr));
        return (this.f76497e || i11 == i10) ? listUnmodifiableList : listUnmodifiableList.subList(0, i11);
    }
}
