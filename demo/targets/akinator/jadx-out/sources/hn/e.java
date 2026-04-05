package hn;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final b5 f59031a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f59032b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f59033c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    public f f59034d;

    /* renamed from: e, reason: collision with root package name */
    public f f59035e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f59036f;

    public e(b5 b5Var) {
        this.f59031a = b5Var;
        f fVar = f.f59037e;
        this.f59034d = fVar;
        this.f59035e = fVar;
        this.f59036f = false;
    }

    public final int a() {
        return this.f59033c.length - 1;
    }

    public final void b(ByteBuffer byteBuffer) {
        boolean z10;
        for (boolean z11 = true; z11; z11 = z10) {
            z10 = false;
            int i10 = 0;
            while (i10 <= a()) {
                if (!this.f59033c[i10].hasRemaining()) {
                    ArrayList arrayList = this.f59032b;
                    h hVar = (h) arrayList.get(i10);
                    if (!hVar.isEnded()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.f59033c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : h.f59042a;
                        long jRemaining = byteBuffer2.remaining();
                        hVar.queueInput(byteBuffer2);
                        this.f59033c[i10] = hVar.getOutput();
                        z10 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f59033c[i10].hasRemaining();
                    } else if (!this.f59033c[i10].hasRemaining() && i10 < a()) {
                        ((h) arrayList.get(i10 + 1)).queueEndOfStream();
                    }
                }
                i10++;
            }
        }
    }

    public f configure(f fVar) throws g {
        if (fVar.equals(f.f59037e)) {
            throw new g(fVar);
        }
        int i10 = 0;
        while (true) {
            b5 b5Var = this.f59031a;
            if (i10 >= b5Var.size()) {
                this.f59035e = fVar;
                return fVar;
            }
            h hVar = (h) b5Var.get(i10);
            f fVarConfigure = hVar.configure(fVar);
            if (hVar.isActive()) {
                io.bidmachine.media3.common.util.a.checkState(!fVarConfigure.equals(f.f59037e));
                fVar = fVarConfigure;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        b5 b5Var = ((e) obj).f59031a;
        b5 b5Var2 = this.f59031a;
        if (b5Var2.size() != b5Var.size()) {
            return false;
        }
        for (int i10 = 0; i10 < b5Var2.size(); i10++) {
            if (b5Var2.get(i10) != b5Var.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public void flush() {
        ArrayList arrayList = this.f59032b;
        arrayList.clear();
        this.f59034d = this.f59035e;
        this.f59036f = false;
        int i10 = 0;
        while (true) {
            b5 b5Var = this.f59031a;
            if (i10 >= b5Var.size()) {
                break;
            }
            h hVar = (h) b5Var.get(i10);
            hVar.flush();
            if (hVar.isActive()) {
                arrayList.add(hVar);
            }
            i10++;
        }
        this.f59033c = new ByteBuffer[arrayList.size()];
        for (int i11 = 0; i11 <= a(); i11++) {
            this.f59033c[i11] = ((h) arrayList.get(i11)).getOutput();
        }
    }

    public ByteBuffer getOutput() {
        if (!isOperational()) {
            return h.f59042a;
        }
        ByteBuffer byteBuffer = this.f59033c[a()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        b(h.f59042a);
        return this.f59033c[a()];
    }

    public f getOutputAudioFormat() {
        return this.f59034d;
    }

    public int hashCode() {
        return this.f59031a.hashCode();
    }

    public boolean isEnded() {
        return this.f59036f && ((h) this.f59032b.get(a())).isEnded() && !this.f59033c[a()].hasRemaining();
    }

    public boolean isOperational() {
        return !this.f59032b.isEmpty();
    }

    public void queueEndOfStream() {
        if (!isOperational() || this.f59036f) {
            return;
        }
        this.f59036f = true;
        ((h) this.f59032b.get(0)).queueEndOfStream();
    }

    public void queueInput(ByteBuffer byteBuffer) {
        if (!isOperational() || this.f59036f) {
            return;
        }
        b(byteBuffer);
    }

    public void reset() {
        int i10 = 0;
        while (true) {
            b5 b5Var = this.f59031a;
            if (i10 >= b5Var.size()) {
                this.f59033c = new ByteBuffer[0];
                f fVar = f.f59037e;
                this.f59034d = fVar;
                this.f59035e = fVar;
                this.f59036f = false;
                return;
            }
            h hVar = (h) b5Var.get(i10);
            hVar.flush();
            hVar.reset();
            i10++;
        }
    }
}
