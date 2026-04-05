package io.odeeo.internal.d1;

import io.odeeo.sdk.config.data.ExtendedUserId;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g extends ArrayList<ExtendedUserId> {

    /* renamed from: a, reason: collision with root package name */
    public static final g f63663a = new g();

    public final void add(String partner, String id2) {
        e0.checkNotNullParameter(partner, "partner");
        e0.checkNotNullParameter(id2, "id");
        remove(partner);
        add(new ExtendedUserId(partner, id2));
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        super.clear();
    }

    public /* bridge */ boolean contains(ExtendedUserId extendedUserId) {
        return super.contains((Object) extendedUserId);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(ExtendedUserId extendedUserId) {
        return super.indexOf((Object) extendedUserId);
    }

    public /* bridge */ int lastIndexOf(ExtendedUserId extendedUserId) {
        return super.lastIndexOf((Object) extendedUserId);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ ExtendedUserId remove(int i10) {
        return removeAt(i10);
    }

    public /* bridge */ ExtendedUserId removeAt(int i10) {
        return remove(i10);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ExtendedUserId) {
            return contains((ExtendedUserId) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ExtendedUserId) {
            return indexOf((ExtendedUserId) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ExtendedUserId) {
            return lastIndexOf((ExtendedUserId) obj);
        }
        return -1;
    }

    public /* bridge */ boolean remove(ExtendedUserId extendedUserId) {
        return super.remove((Object) extendedUserId);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof ExtendedUserId) {
            return remove((ExtendedUserId) obj);
        }
        return false;
    }

    public final void remove(String partner) {
        e0.checkNotNullParameter(partner, "partner");
        int size = size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i10 = size - 1;
            if (e0.areEqual(get(size).getPartner(), partner)) {
                remove(size);
            }
            if (i10 < 0) {
                return;
            } else {
                size = i10;
            }
        }
    }

    public final List<ExtendedUserId> getAll() {
        return this;
    }
}
