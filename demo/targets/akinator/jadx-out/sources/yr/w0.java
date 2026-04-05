package yr;

import java.io.IOException;
import wr.m6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w0 implements y0, d1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f95105a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f95106b;

    /* renamed from: c, reason: collision with root package name */
    public final e1 f95107c;

    /* renamed from: d, reason: collision with root package name */
    public int f95108d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f95109e;

    public w0(int i10, Object obj, g1 g1Var, int i11) {
        this.f95105a = i10;
        this.f95106b = obj;
        this.f95107c = g1Var.createState(this, i10);
        this.f95108d = i11;
    }

    @Override // yr.y0
    public e1 getOutboundFlowState() {
        e1 e1Var;
        synchronized (this.f95106b) {
            e1Var = this.f95107c;
        }
        return e1Var;
    }

    @Override // yr.y0
    public boolean hasReceivedEndOfStream() {
        boolean z10;
        synchronized (this.f95106b) {
            z10 = this.f95109e;
        }
        return z10;
    }

    @Override // yr.y0
    public void inboundDataReceived(pw.g gVar, int i10, int i11, boolean z10) {
        synchronized (this.f95106b) {
            if (z10) {
                try {
                    this.f95109e = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f95108d -= i10 + i11;
            try {
                gVar.skip(gVar.size());
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    @Override // yr.y0
    public int inboundWindowAvailable() {
        int i10;
        synchronized (this.f95106b) {
            i10 = this.f95108d;
        }
        return i10;
    }

    @Override // yr.y0
    public void inboundRstReceived(m6 m6Var) {
    }

    @Override // yr.d1
    public void onSentBytes(int i10) {
    }

    @Override // yr.y0
    public void transportReportStatus(m6 m6Var) {
    }
}
