package com.applovin.mediation;

import com.applovin.impl.sdk.o;
import j1.o2;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class MaxSegment {

    /* renamed from: a, reason: collision with root package name */
    private final int f16397a;

    /* renamed from: b, reason: collision with root package name */
    private final List f16398b;

    public MaxSegment(int i10, List<Integer> list) {
        this.f16397a = i10;
        this.f16398b = list;
        a(i10);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            a(it.next().intValue());
        }
    }

    private void a(int i10) {
        if (i10 >= 0) {
            return;
        }
        o.h("MaxSegment", "Please ensure that the segment value entered is a non-negative number in the range of [0, 2147483647]: " + i10);
    }

    public int getKey() {
        return this.f16397a;
    }

    public List<Integer> getValues() {
        return this.f16398b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MaxSegment{key=");
        sb2.append(this.f16397a);
        sb2.append(", values=");
        return o2.p(sb2, this.f16398b, AbstractJsonLexerKt.END_OBJ);
    }
}
