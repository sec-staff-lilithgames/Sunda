package io;

import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public jn.y f59818a;

    public final void a(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((jn.x) list.get(i10)).f69804a == 1) {
                this.f59818a = jn.y.parse((jn.x) list.get(i10));
            }
        }
    }

    public void queueInputBuffer(ByteBuffer byteBuffer) {
        a(jn.z.split(byteBuffer));
    }

    public void reset() {
        this.f59818a = null;
    }

    public int sampleLimitAfterSkippingNonReferenceFrame(ByteBuffer byteBuffer, boolean z10) {
        jn.y yVar;
        jn.v vVar;
        List<jn.x> listSplit = jn.z.split(byteBuffer);
        a(listSplit);
        int size = listSplit.size() - 1;
        int i10 = 0;
        while (size >= 0) {
            jn.x xVar = listSplit.get(size);
            int i11 = xVar.f69804a;
            if (i11 != 2 && i11 != 15 && ((i11 == 3 && !z10) || ((i11 != 6 && i11 != 3) || (yVar = this.f59818a) == null || (vVar = jn.v.parse(yVar, xVar)) == null || vVar.isDependedOn()))) {
                break;
            }
            if (listSplit.get(size).f69804a == 6 || listSplit.get(size).f69804a == 3) {
                i10++;
            }
            size--;
        }
        return (i10 > 1 || size + 1 >= 8) ? byteBuffer.limit() : size >= 0 ? listSplit.get(size).f69805b.limit() : byteBuffer.position();
    }
}
