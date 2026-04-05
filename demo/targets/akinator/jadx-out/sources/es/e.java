package es;

import java.util.List;
import mh.g1;
import wr.b3;
import wr.f1;
import wr.f3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class e extends b3.e {
    @Override // wr.b3.e
    public wr.j asChannel() {
        return delegate().asChannel();
    }

    public abstract b3.e delegate();

    @Override // wr.b3.e
    public List<f1> getAllAddresses() {
        return delegate().getAllAddresses();
    }

    @Override // wr.b3.e
    public wr.c getAttributes() {
        return delegate().getAttributes();
    }

    @Override // wr.b3.e
    public wr.m getChannelLogger() {
        return delegate().getChannelLogger();
    }

    @Override // wr.b3.e
    public Object getInternalSubchannel() {
        return delegate().getInternalSubchannel();
    }

    @Override // wr.b3.e
    public void requestConnection() {
        delegate().requestConnection();
    }

    @Override // wr.b3.e
    public void shutdown() {
        delegate().shutdown();
    }

    @Override // wr.b3.e
    public void start(f3 f3Var) {
        delegate().start(f3Var);
    }

    public String toString() {
        return g1.toStringHelper(this).add("delegate", delegate()).toString();
    }

    @Override // wr.b3.e
    public void updateAddresses(List<f1> list) {
        delegate().updateAddresses(list);
    }
}
