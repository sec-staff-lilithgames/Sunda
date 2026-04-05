package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: Add missing generic type declarations: [K] */
/* renamed from: com.facebook.ads.redexgen.X.kF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2345kF<K> implements Iterator<K> {
    public static byte[] A03;

    @CheckForNull
    public Map.Entry<K, Collection<V>> A00;
    public final /* synthetic */ C08611l A01;
    public final /* synthetic */ Iterator A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-39, -38, -117, -50, -52, -41, -41, -34, -117, -33, -38, -117, -39, -48, -29, -33, -109, -108, -117, -34, -44, -39, -50, -48, -117, -33, -45, -48, -117, -41, -52, -34, -33, -117, -50, -52, -41, -41, -117, -33, -38, -117, -35, -48, -40, -38, -31, -48, -109, -108};
    }

    public C2345kF(final C08611l this$1, final Iterator val$entryIterator) {
        this.A01 = this$1;
        this.A02 = val$entryIterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A02.hasNext();
    }

    @Override // java.util.Iterator
    @ParametricNullness
    public final K next() {
        this.A00 = (Map.Entry) this.A02.next();
        return this.A00.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC2279jA.A0F(this.A00 != null, A00(0, 50, 26));
        Collection collection = (Collection) this.A00.getValue();
        this.A02.remove();
        AbstractC08581i.A03(this.A01.A00, collection.size());
        collection.clear();
        this.A00 = null;
    }
}
