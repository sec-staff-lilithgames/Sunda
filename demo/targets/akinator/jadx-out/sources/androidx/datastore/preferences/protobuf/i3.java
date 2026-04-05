package androidx.datastore.preferences.protobuf;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.ta;
import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i3 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f5906a;

    public i3(int i10) {
        switch (i10) {
            case 1:
                this.f5906a = new ArrayDeque();
                break;
            case 2:
                this.f5906a = new ArrayDeque();
                break;
            default:
                this.f5906a = new ArrayDeque();
                break;
        }
    }

    public void a(x xVar) {
        if (!xVar.g()) {
            if (!(xVar instanceof l3)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + xVar.getClass());
            }
            l3 l3Var = (l3) xVar;
            a(l3Var.f5953h);
            a(l3Var.f5954i);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(l3.f5951l, xVar.size());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iO = l3.o(iBinarySearch + 1);
        ArrayDeque arrayDeque = this.f5906a;
        if (arrayDeque.isEmpty() || ((x) arrayDeque.peek()).size() >= iO) {
            arrayDeque.push(xVar);
            return;
        }
        int iO2 = l3.o(iBinarySearch);
        x l3Var2 = (x) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((x) arrayDeque.peek()).size() < iO2) {
            l3Var2 = new l3((x) arrayDeque.pop(), l3Var2);
        }
        l3 l3Var3 = new l3(l3Var2, xVar);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(l3.f5951l, l3Var3.size());
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((x) arrayDeque.peek()).size() >= l3.o(iBinarySearch2 + 1)) {
                break;
            } else {
                l3Var3 = new l3((x) arrayDeque.pop(), l3Var3);
            }
        }
        arrayDeque.push(l3Var3);
    }

    public void b(ByteString byteString) {
        if (!byteString.isBalanced()) {
            if (!(byteString instanceof ta)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
            }
            ta taVar = (ta) byteString;
            b(taVar.f22667c);
            b(taVar.f22668e);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(ta.f22665h, byteString.size());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iC = ta.c(iBinarySearch + 1);
        ArrayDeque arrayDeque = this.f5906a;
        if (arrayDeque.isEmpty() || ((ByteString) arrayDeque.peek()).size() >= iC) {
            arrayDeque.push(byteString);
            return;
        }
        int iC2 = ta.c(iBinarySearch);
        ByteString taVar2 = (ByteString) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((ByteString) arrayDeque.peek()).size() < iC2) {
            taVar2 = new ta((ByteString) arrayDeque.pop(), taVar2);
        }
        ta taVar3 = new ta(taVar2, byteString);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(ta.f22665h, taVar3.size());
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((ByteString) arrayDeque.peek()).size() >= ta.c(iBinarySearch2 + 1)) {
                break;
            } else {
                taVar3 = new ta((ByteString) arrayDeque.pop(), taVar3);
            }
        }
        arrayDeque.push(taVar3);
    }
}
