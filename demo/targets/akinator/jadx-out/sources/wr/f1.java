package wr;

import com.ironsource.C3191e4;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f1 {

    /* renamed from: d, reason: collision with root package name */
    public static final b f90918d = b.create("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* renamed from: a, reason: collision with root package name */
    public final List f90919a;

    /* renamed from: b, reason: collision with root package name */
    public final c f90920b;

    /* renamed from: c, reason: collision with root package name */
    public final int f90921c;

    public f1(List<SocketAddress> list) {
        this(list, c.f90841b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        List list = f1Var.f90919a;
        List list2 = this.f90919a;
        if (list2.size() != list.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list2.size(); i10++) {
            if (!((SocketAddress) list2.get(i10)).equals(list.get(i10))) {
                return false;
            }
        }
        return this.f90920b.equals(f1Var.f90920b);
    }

    public List<SocketAddress> getAddresses() {
        return this.f90919a;
    }

    public c getAttributes() {
        return this.f90920b;
    }

    public int hashCode() {
        return this.f90921c;
    }

    public String toString() {
        return C3191e4.i.f36529d + this.f90919a + "/" + this.f90920b + C3191e4.i.f36531e;
    }

    public f1(List<SocketAddress> list, c cVar) {
        mh.p1.checkArgument(!list.isEmpty(), "addrs is empty");
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f90919a = listUnmodifiableList;
        this.f90920b = (c) mh.p1.checkNotNull(cVar, "attrs");
        this.f90921c = listUnmodifiableList.hashCode();
    }

    public f1(SocketAddress socketAddress) {
        this(socketAddress, c.f90841b);
    }

    public f1(SocketAddress socketAddress, c cVar) {
        this((List<SocketAddress>) Collections.singletonList(socketAddress), cVar);
    }
}
