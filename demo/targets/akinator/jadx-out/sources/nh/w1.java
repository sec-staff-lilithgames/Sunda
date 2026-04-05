package nh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w1 extends b {

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f76729e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f76730f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f76731g;

    /* renamed from: h, reason: collision with root package name */
    public int f76732h;

    public w1(List list) {
        this.f76729e = new ArrayList(list);
        int size = list.size();
        int[] iArr = new int[size];
        this.f76730f = iArr;
        int[] iArr2 = new int[size];
        this.f76731g = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 1);
        this.f76732h = Integer.MAX_VALUE;
    }

    @Override // nh.b
    public final Object computeNext() {
        if (this.f76732h <= 0) {
            this.f76111b = 3;
            return null;
        }
        ArrayList arrayList = this.f76729e;
        b5 b5VarCopyOf = b5.copyOf((Collection) arrayList);
        int size = arrayList.size() - 1;
        this.f76732h = size;
        if (size != -1) {
            int i10 = 0;
            while (true) {
                int i11 = this.f76732h;
                int[] iArr = this.f76730f;
                int i12 = iArr[i11];
                int[] iArr2 = this.f76731g;
                int i13 = iArr2[i11];
                int i14 = i12 + i13;
                if (i14 < 0) {
                    iArr2[i11] = -i13;
                    this.f76732h = i11 - 1;
                } else {
                    if (i14 != i11 + 1) {
                        Collections.swap(arrayList, (i11 - i12) + i10, (i11 - i14) + i10);
                        iArr[this.f76732h] = i14;
                        return b5VarCopyOf;
                    }
                    if (i11 == 0) {
                        break;
                    }
                    i10++;
                    iArr2[i11] = -i13;
                    this.f76732h = i11 - 1;
                }
            }
        }
        return b5VarCopyOf;
    }
}
