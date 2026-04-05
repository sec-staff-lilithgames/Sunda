package x2;

import androidx.core.app.NotificationCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f91504a = new Object[NotificationCompat.FLAG_LOCAL_ONLY];

    /* renamed from: b, reason: collision with root package name */
    public int f91505b;

    @Override // x2.h
    public Object acquire() {
        int i10 = this.f91505b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f91504a;
        Object obj = objArr[i11];
        objArr[i11] = null;
        this.f91505b = i10 - 1;
        return obj;
    }

    @Override // x2.h
    public boolean release(Object obj) {
        int i10 = this.f91505b;
        Object[] objArr = this.f91504a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = obj;
        this.f91505b = i10 + 1;
        return true;
    }

    @Override // x2.h
    public void releaseAll(Object[] objArr, int i10) {
        if (i10 > objArr.length) {
            i10 = objArr.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            int i12 = this.f91505b;
            Object[] objArr2 = this.f91504a;
            if (i12 < objArr2.length) {
                objArr2[i12] = obj;
                this.f91505b = i12 + 1;
            }
        }
    }
}
