package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.foundation.tools.FastKV;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
class y0 implements FastKV.b<Set<String>> {

    /* renamed from: a, reason: collision with root package name */
    static final y0 f41216a = new y0();

    private y0() {
    }

    @Override // com.mbridge.msdk.foundation.tools.FastKV.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<String> a(byte[] bArr, int i10, int i11) {
        int i12;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i11 > 0) {
            a0 a0Var = new a0(bArr, i10);
            int i13 = i10 + i11;
            while (true) {
                i12 = a0Var.f41058b;
                if (i12 >= i13) {
                    break;
                }
                linkedHashSet.add(a0Var.e(a0Var.g()));
            }
            if (i12 != i13) {
                throw new IllegalArgumentException("Invalid String set");
            }
        }
        return linkedHashSet;
    }

    @Override // com.mbridge.msdk.foundation.tools.FastKV.b
    public byte[] a(Set<String> set) {
        if (set.isEmpty()) {
            return new byte[0];
        }
        int size = set.size();
        int[] iArr = new int[size];
        String[] strArr = new String[size];
        int iF = 0;
        int i10 = 0;
        for (String str : set) {
            if (str == null) {
                iF += 5;
                iArr[i10] = -1;
            } else {
                int iB = a0.b(str);
                strArr[i10] = str;
                iArr[i10] = iB;
                iF = a0.f(iB) + iB + iF;
            }
            i10++;
        }
        a0 a0Var = new a0(iF);
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = iArr[i11];
            a0Var.h(i12);
            if (i12 >= 0) {
                a0Var.c(strArr[i11]);
            }
        }
        return a0Var.f41057a;
    }

    @Override // com.mbridge.msdk.foundation.tools.FastKV.b
    public String a() {
        return "StringSet";
    }
}
