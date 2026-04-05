package xr;

import java.net.SocketAddress;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c6 {

    /* renamed from: a, reason: collision with root package name */
    public List f92328a;

    /* renamed from: b, reason: collision with root package name */
    public int f92329b;

    /* renamed from: c, reason: collision with root package name */
    public int f92330c;

    public c6(List<wr.f1> list) {
        this.f92328a = list;
    }

    public SocketAddress getCurrentAddress() {
        return ((wr.f1) this.f92328a.get(this.f92329b)).getAddresses().get(this.f92330c);
    }

    public wr.c getCurrentEagAttributes() {
        return ((wr.f1) this.f92328a.get(this.f92329b)).getAttributes();
    }

    public List<wr.f1> getGroups() {
        return this.f92328a;
    }

    public void increment() {
        wr.f1 f1Var = (wr.f1) this.f92328a.get(this.f92329b);
        int i10 = this.f92330c + 1;
        this.f92330c = i10;
        if (i10 >= f1Var.getAddresses().size()) {
            this.f92329b++;
            this.f92330c = 0;
        }
    }

    public boolean isAtBeginning() {
        return this.f92329b == 0 && this.f92330c == 0;
    }

    public boolean isValid() {
        return this.f92329b < this.f92328a.size();
    }

    public void reset() {
        this.f92329b = 0;
        this.f92330c = 0;
    }

    public boolean seekTo(SocketAddress socketAddress) {
        for (int i10 = 0; i10 < this.f92328a.size(); i10++) {
            int iIndexOf = ((wr.f1) this.f92328a.get(i10)).getAddresses().indexOf(socketAddress);
            if (iIndexOf != -1) {
                this.f92329b = i10;
                this.f92330c = iIndexOf;
                return true;
            }
        }
        return false;
    }

    public void updateGroups(List<wr.f1> list) {
        this.f92328a = list;
        reset();
    }
}
