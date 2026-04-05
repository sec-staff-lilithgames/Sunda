package xr;

import java.net.SocketAddress;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class ia {

    /* renamed from: a, reason: collision with root package name */
    public List f92636a;

    /* renamed from: b, reason: collision with root package name */
    public int f92637b;

    /* renamed from: c, reason: collision with root package name */
    public int f92638c;

    public ia(List<wr.f1> list) {
        this.f92636a = list == null ? Collections.EMPTY_LIST : list;
    }

    public SocketAddress getCurrentAddress() {
        if (isValid()) {
            return ((wr.f1) this.f92636a.get(this.f92637b)).getAddresses().get(this.f92638c);
        }
        throw new IllegalStateException("Index is past the end of the address group list");
    }

    public wr.c getCurrentEagAttributes() {
        if (isValid()) {
            return ((wr.f1) this.f92636a.get(this.f92637b)).getAttributes();
        }
        throw new IllegalStateException("Index is off the end of the address group list");
    }

    public boolean increment() {
        if (!isValid()) {
            return false;
        }
        wr.f1 f1Var = (wr.f1) this.f92636a.get(this.f92637b);
        int i10 = this.f92638c + 1;
        this.f92638c = i10;
        if (i10 < f1Var.getAddresses().size()) {
            return true;
        }
        int i11 = this.f92637b + 1;
        this.f92637b = i11;
        this.f92638c = 0;
        return i11 < this.f92636a.size();
    }

    public boolean isAtBeginning() {
        return this.f92637b == 0 && this.f92638c == 0;
    }

    public boolean isValid() {
        return this.f92637b < this.f92636a.size();
    }

    public void reset() {
        this.f92637b = 0;
        this.f92638c = 0;
    }

    public boolean seekTo(SocketAddress socketAddress) {
        for (int i10 = 0; i10 < this.f92636a.size(); i10++) {
            int iIndexOf = ((wr.f1) this.f92636a.get(i10)).getAddresses().indexOf(socketAddress);
            if (iIndexOf != -1) {
                this.f92637b = i10;
                this.f92638c = iIndexOf;
                return true;
            }
        }
        return false;
    }

    public int size() {
        List list = this.f92636a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    public void updateGroups(nh.b5 b5Var) {
        nh.b5 b5Var2 = b5Var;
        if (b5Var == null) {
            b5Var2 = Collections.EMPTY_LIST;
        }
        this.f92636a = b5Var2;
        reset();
    }
}
