package nh;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class hi extends ji implements c8 {
    @Override // nh.ji
    public final fc c() {
        return (c8) ((fc) this.f76515b);
    }

    @Override // nh.ji, nh.fc, nh.c8
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // nh.ji, nh.fc, nh.c8
    public List<Object> get(Object obj) {
        gi giVarJ;
        synchronized (this.f76516c) {
            giVarJ = jh.i.J(((c8) ((fc) this.f76515b)).get(obj), this.f76516c);
        }
        return giVarJ;
    }

    @Override // nh.ji, nh.fc, nh.c8
    public List<Object> removeAll(Object obj) {
        List<Object> listRemoveAll;
        synchronized (this.f76516c) {
            listRemoveAll = ((c8) ((fc) this.f76515b)).removeAll(obj);
        }
        return listRemoveAll;
    }

    @Override // nh.ji, nh.fc, nh.c8
    public List<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        List<Object> listReplaceValues;
        synchronized (this.f76516c) {
            listReplaceValues = ((c8) ((fc) this.f76515b)).replaceValues(obj, iterable);
        }
        return listReplaceValues;
    }
}
