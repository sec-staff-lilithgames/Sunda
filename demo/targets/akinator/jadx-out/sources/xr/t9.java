package xr;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class t9 implements r4 {

    /* renamed from: a, reason: collision with root package name */
    public final s9 f93022a;

    /* renamed from: c, reason: collision with root package name */
    public hf f93024c;

    /* renamed from: h, reason: collision with root package name */
    public final jf f93029h;

    /* renamed from: i, reason: collision with root package name */
    public final te f93030i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f93031j;

    /* renamed from: k, reason: collision with root package name */
    public int f93032k;

    /* renamed from: m, reason: collision with root package name */
    public long f93034m;

    /* renamed from: b, reason: collision with root package name */
    public int f93023b = -1;

    /* renamed from: d, reason: collision with root package name */
    public wr.d0 f93025d = wr.z.f91209a;

    /* renamed from: e, reason: collision with root package name */
    public boolean f93026e = true;

    /* renamed from: f, reason: collision with root package name */
    public final r9 f93027f = new r9(this);

    /* renamed from: g, reason: collision with root package name */
    public final ByteBuffer f93028g = ByteBuffer.allocate(5);

    /* renamed from: l, reason: collision with root package name */
    public int f93033l = -1;

    public t9(s9 s9Var, jf jfVar, te teVar) {
        this.f93022a = (s9) mh.p1.checkNotNull(s9Var, "sink");
        this.f93029h = (jf) mh.p1.checkNotNull(jfVar, "bufferAllocator");
        this.f93030i = (te) mh.p1.checkNotNull(teVar, "statsTraceCtx");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int d(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream instanceof wr.e1) {
            return ((cs.a) ((wr.e1) inputStream)).drainTo(outputStream);
        }
        long jCopy = ph.e0.copy(inputStream, outputStream);
        mh.p1.checkArgument(jCopy <= 2147483647L, "Message size overflow: %s", jCopy);
        return (int) jCopy;
    }

    public final void a(q9 q9Var, boolean z10) {
        ArrayList arrayList = q9Var.f92928b;
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((yr.b1) ((hf) it.next())).readableBytes();
        }
        int i11 = this.f93023b;
        if (i11 >= 0 && i10 > i11) {
            wr.m6 m6Var = wr.m6.f91043k;
            Locale locale = Locale.US;
            throw m6Var.withDescription("message too large " + i10 + " > " + i11).asRuntimeException();
        }
        ByteBuffer byteBuffer = this.f93028g;
        byteBuffer.clear();
        byteBuffer.put(z10 ? (byte) 1 : (byte) 0).putInt(i10);
        yr.b1 b1Var = (yr.b1) ((yr.c1) this.f93029h).allocate(5);
        b1Var.write(byteBuffer.array(), 0, byteBuffer.position());
        if (i10 == 0) {
            this.f93024c = b1Var;
            return;
        }
        int i12 = this.f93032k - 1;
        s9 s9Var = this.f93022a;
        s9Var.deliverFrame(b1Var, false, false, i12);
        this.f93032k = 1;
        for (int i13 = 0; i13 < arrayList.size() - 1; i13++) {
            s9Var.deliverFrame((hf) arrayList.get(i13), false, false, 0);
        }
        this.f93024c = (hf) j1.o2.e(1, arrayList);
        this.f93034m = i10;
    }

    public final int b(InputStream inputStream) throws IOException {
        q9 q9Var = new q9(this);
        OutputStream outputStreamCompress = this.f93025d.compress(q9Var);
        try {
            int iD = d(inputStream, outputStreamCompress);
            outputStreamCompress.close();
            int i10 = this.f93023b;
            if (i10 < 0 || iD <= i10) {
                a(q9Var, true);
                return iD;
            }
            wr.m6 m6Var = wr.m6.f91043k;
            Locale locale = Locale.US;
            throw m6Var.withDescription("message too large " + iD + " > " + i10).asRuntimeException();
        } catch (Throwable th2) {
            outputStreamCompress.close();
            throw th2;
        }
    }

    public final void c(int i10, int i11, byte[] bArr) {
        while (i11 > 0) {
            hf hfVar = this.f93024c;
            if (hfVar != null && ((yr.b1) hfVar).writableBytes() == 0) {
                hf hfVar2 = this.f93024c;
                this.f93024c = null;
                this.f93022a.deliverFrame(hfVar2, false, false, this.f93032k);
                this.f93032k = 0;
            }
            if (this.f93024c == null) {
                this.f93024c = ((yr.c1) this.f93029h).allocate(i11);
            }
            int iMin = Math.min(i11, ((yr.b1) this.f93024c).writableBytes());
            ((yr.b1) this.f93024c).write(bArr, i10, iMin);
            i10 += iMin;
            i11 -= iMin;
        }
    }

    @Override // xr.r4
    public void close() {
        hf hfVar;
        if (isClosed()) {
            return;
        }
        this.f93031j = true;
        hf hfVar2 = this.f93024c;
        if (hfVar2 != null && ((yr.b1) hfVar2).readableBytes() == 0 && (hfVar = this.f93024c) != null) {
            ((yr.b1) hfVar).release();
            this.f93024c = null;
        }
        hf hfVar3 = this.f93024c;
        this.f93024c = null;
        this.f93022a.deliverFrame(hfVar3, true, true, this.f93032k);
        this.f93032k = 0;
    }

    @Override // xr.r4
    public void dispose() {
        this.f93031j = true;
        hf hfVar = this.f93024c;
        if (hfVar != null) {
            ((yr.b1) hfVar).release();
            this.f93024c = null;
        }
    }

    public final int e(InputStream inputStream, int i10) throws IOException {
        if (i10 == -1) {
            q9 q9Var = new q9(this);
            int iD = d(inputStream, q9Var);
            a(q9Var, false);
            return iD;
        }
        this.f93034m = i10;
        int i11 = this.f93023b;
        if (i11 >= 0 && i10 > i11) {
            wr.m6 m6Var = wr.m6.f91043k;
            Locale locale = Locale.US;
            throw m6Var.withDescription("message too large " + i10 + " > " + i11).asRuntimeException();
        }
        ByteBuffer byteBuffer = this.f93028g;
        byteBuffer.clear();
        byteBuffer.put((byte) 0).putInt(i10);
        if (this.f93024c == null) {
            this.f93024c = ((yr.c1) this.f93029h).allocate(byteBuffer.position() + i10);
        }
        c(0, byteBuffer.position(), byteBuffer.array());
        return d(inputStream, this.f93027f);
    }

    @Override // xr.r4
    public void flush() {
        hf hfVar = this.f93024c;
        if (hfVar == null || ((yr.b1) hfVar).readableBytes() <= 0) {
            return;
        }
        hf hfVar2 = this.f93024c;
        this.f93024c = null;
        this.f93022a.deliverFrame(hfVar2, false, true, this.f93032k);
        this.f93032k = 0;
    }

    @Override // xr.r4
    public boolean isClosed() {
        return this.f93031j;
    }

    @Override // xr.r4
    public void setMaxOutboundMessageSize(int i10) {
        mh.p1.checkState(this.f93023b == -1, "max size already set");
        this.f93023b = i10;
    }

    @Override // xr.r4
    public void writePayload(InputStream inputStream) {
        if (isClosed()) {
            throw new IllegalStateException("Framer already closed");
        }
        this.f93032k++;
        int i10 = this.f93033l + 1;
        this.f93033l = i10;
        this.f93034m = 0L;
        te teVar = this.f93030i;
        teVar.outboundMessage(i10);
        boolean z10 = this.f93026e && this.f93025d != wr.z.f91209a;
        try {
            int iAvailable = ((inputStream instanceof wr.w2) || (inputStream instanceof ByteArrayInputStream)) ? inputStream.available() : -1;
            int iE = (iAvailable == 0 || !z10) ? e(inputStream, iAvailable) : b(inputStream);
            if (iAvailable != -1 && iE != iAvailable) {
                throw wr.m6.f91046n.withDescription(w0.i.a(iE, iAvailable, "Message length inaccurate ", " != ")).asRuntimeException();
            }
            long j10 = iE;
            teVar.outboundUncompressedSize(j10);
            teVar.outboundWireSize(this.f93034m);
            this.f93030i.outboundMessageSent(this.f93033l, this.f93034m, j10);
        } catch (IOException e10) {
            throw wr.m6.f91046n.withDescription("Failed to frame message").withCause(e10).asRuntimeException();
        } catch (wr.o6 e11) {
            throw e11;
        } catch (RuntimeException e12) {
            throw wr.m6.f91046n.withDescription("Failed to frame message").withCause(e12).asRuntimeException();
        }
    }

    @Override // xr.r4
    public t9 setCompressor(wr.d0 d0Var) {
        this.f93025d = (wr.d0) mh.p1.checkNotNull(d0Var, "Can't pass an empty compressor");
        return this;
    }

    @Override // xr.r4
    public t9 setMessageCompression(boolean z10) {
        this.f93026e = z10;
        return this;
    }
}
