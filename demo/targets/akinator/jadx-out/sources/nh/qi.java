package nh;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class qi extends ji implements sf {

    /* renamed from: j, reason: collision with root package name */
    public transient pi f76589j;

    @Override // nh.ji
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public sf c() {
        return (sf) ((fc) this.f76515b);
    }

    @Override // nh.ji, nh.fc, nh.c8
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // nh.ji, nh.fc
    public Set<Map.Entry<Object, Object>> entries() {
        pi piVar;
        synchronized (this.f76516c) {
            try {
                if (this.f76589j == null) {
                    this.f76589j = new pi(c().entries(), this.f76516c);
                }
                piVar = this.f76589j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return piVar;
    }

    @Override // nh.ji, nh.fc, nh.c8
    public Set<Object> get(Object obj) {
        pi piVar;
        synchronized (this.f76516c) {
            piVar = new pi(c().get(obj), this.f76516c);
        }
        return piVar;
    }

    @Override // nh.ji, nh.fc, nh.c8
    public Set<Object> removeAll(Object obj) {
        Set<Object> setRemoveAll;
        synchronized (this.f76516c) {
            setRemoveAll = c().removeAll(obj);
        }
        return setRemoveAll;
    }

    @Override // nh.ji, nh.fc, nh.c8
    public Set<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        Set<Object> setReplaceValues;
        synchronized (this.f76516c) {
            setReplaceValues = c().replaceValues(obj, iterable);
        }
        return setReplaceValues;
    }
}
