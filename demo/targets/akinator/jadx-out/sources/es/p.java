package es;

import java.net.SocketAddress;
import java.util.Arrays;
import java.util.Iterator;
import mh.p1;
import wr.f1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f55086a;

    /* renamed from: b, reason: collision with root package name */
    public final int f55087b;

    public p(f1 f1Var) {
        p1.checkNotNull(f1Var, "eag");
        this.f55086a = new String[f1Var.getAddresses().size()];
        Iterator<SocketAddress> it = f1Var.getAddresses().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            this.f55086a[i10] = it.next().toString();
            i10++;
        }
        Arrays.sort(this.f55086a);
        this.f55087b = Arrays.hashCode(this.f55086a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (pVar.f55087b == this.f55087b) {
            String[] strArr = pVar.f55086a;
            int length = strArr.length;
            String[] strArr2 = this.f55086a;
            if (length == strArr2.length) {
                return Arrays.equals(strArr, strArr2);
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f55087b;
    }

    public String toString() {
        return Arrays.toString(this.f55086a);
    }
}
