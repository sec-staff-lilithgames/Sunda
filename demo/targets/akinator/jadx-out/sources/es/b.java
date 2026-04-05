package es;

import mh.g1;
import wr.e4;
import wr.m6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class b extends wr.u {
    public abstract wr.u a();

    @Override // wr.u
    public void createPendingStream() {
        a().createPendingStream();
    }

    @Override // wr.u
    public void inboundHeaders() {
        a().inboundHeaders();
    }

    @Override // wr.p6
    public void inboundMessage(int i10) {
        a().inboundMessage(i10);
    }

    @Override // wr.p6
    public void inboundMessageRead(int i10, long j10, long j11) {
        a().inboundMessageRead(i10, j10, j11);
    }

    @Override // wr.u
    public void inboundTrailers(e4 e4Var) {
        a().inboundTrailers(e4Var);
    }

    @Override // wr.p6
    public void inboundUncompressedSize(long j10) {
        a().inboundUncompressedSize(j10);
    }

    @Override // wr.p6
    public void inboundWireSize(long j10) {
        a().inboundWireSize(j10);
    }

    @Override // wr.u
    public void outboundHeaders() {
        a().outboundHeaders();
    }

    @Override // wr.p6
    public void outboundMessage(int i10) {
        a().outboundMessage(i10);
    }

    @Override // wr.p6
    public void outboundMessageSent(int i10, long j10, long j11) {
        a().outboundMessageSent(i10, j10, j11);
    }

    @Override // wr.p6
    public void outboundUncompressedSize(long j10) {
        a().outboundUncompressedSize(j10);
    }

    @Override // wr.p6
    public void outboundWireSize(long j10) {
        a().outboundWireSize(j10);
    }

    @Override // wr.p6
    public void streamClosed(m6 m6Var) {
        a().streamClosed(m6Var);
    }

    @Override // wr.u
    public void streamCreated(wr.c cVar, e4 e4Var) {
        a().streamCreated(cVar, e4Var);
    }

    public String toString() {
        return g1.toStringHelper(this).add("delegate", a()).toString();
    }
}
