package com.mbridge.msdk.tracker.network.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class c {

    /* renamed from: e, reason: collision with root package name */
    protected static final Comparator<byte[]> f44036e = new a();

    /* renamed from: a, reason: collision with root package name */
    private final List<byte[]> f44037a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<byte[]> f44038b = new ArrayList(64);

    /* renamed from: c, reason: collision with root package name */
    private int f44039c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final int f44040d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public c(int i10) {
        this.f44040d = i10;
    }

    public synchronized byte[] a(int i10) {
        for (int i11 = 0; i11 < this.f44038b.size(); i11++) {
            byte[] bArr = this.f44038b.get(i11);
            if (bArr.length >= i10) {
                this.f44039c -= bArr.length;
                this.f44038b.remove(i11);
                this.f44037a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }

    public synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f44040d) {
                this.f44037a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f44038b, bArr, f44036e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f44038b.add(iBinarySearch, bArr);
                this.f44039c += bArr.length;
                a();
            }
        }
    }

    private synchronized void a() {
        while (this.f44039c > this.f44040d) {
            byte[] bArrRemove = this.f44037a.remove(0);
            this.f44038b.remove(bArrRemove);
            this.f44039c -= bArrRemove.length;
        }
    }
}
