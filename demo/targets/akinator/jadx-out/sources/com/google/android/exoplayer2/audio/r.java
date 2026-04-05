package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final b5 f27271a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f27272b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f27273c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    public s f27274d;

    /* renamed from: e, reason: collision with root package name */
    public s f27275e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27276f;

    public r(b5 b5Var) {
        this.f27271a = b5Var;
        s sVar = s.f27278e;
        this.f27274d = sVar;
        this.f27275e = sVar;
        this.f27276f = false;
    }

    public final int a() {
        return this.f27273c.length - 1;
    }

    public final void b(ByteBuffer byteBuffer) {
        boolean z10;
        for (boolean z11 = true; z11; z11 = z10) {
            z10 = false;
            int i10 = 0;
            while (i10 <= a()) {
                if (!this.f27273c[i10].hasRemaining()) {
                    ArrayList arrayList = this.f27272b;
                    u uVar = (u) arrayList.get(i10);
                    if (!uVar.isEnded()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.f27273c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : u.f27291a;
                        long jRemaining = byteBuffer2.remaining();
                        uVar.queueInput(byteBuffer2);
                        this.f27273c[i10] = uVar.getOutput();
                        z10 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f27273c[i10].hasRemaining();
                    } else if (!this.f27273c[i10].hasRemaining() && i10 < a()) {
                        ((u) arrayList.get(i10 + 1)).queueEndOfStream();
                    }
                }
                i10++;
            }
        }
    }

    public s configure(s sVar) throws t {
        if (sVar.equals(s.f27278e)) {
            throw new t(sVar);
        }
        int i10 = 0;
        while (true) {
            b5 b5Var = this.f27271a;
            if (i10 >= b5Var.size()) {
                this.f27275e = sVar;
                return sVar;
            }
            u uVar = (u) b5Var.get(i10);
            s sVarConfigure = uVar.configure(sVar);
            if (uVar.isActive()) {
                com.google.android.exoplayer2.util.a.checkState(!sVarConfigure.equals(s.f27278e));
                sVar = sVarConfigure;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        b5 b5Var = ((r) obj).f27271a;
        b5 b5Var2 = this.f27271a;
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
        ArrayList arrayList = this.f27272b;
        arrayList.clear();
        this.f27274d = this.f27275e;
        this.f27276f = false;
        int i10 = 0;
        while (true) {
            b5 b5Var = this.f27271a;
            if (i10 >= b5Var.size()) {
                break;
            }
            u uVar = (u) b5Var.get(i10);
            uVar.flush();
            if (uVar.isActive()) {
                arrayList.add(uVar);
            }
            i10++;
        }
        this.f27273c = new ByteBuffer[arrayList.size()];
        for (int i11 = 0; i11 <= a(); i11++) {
            this.f27273c[i11] = ((u) arrayList.get(i11)).getOutput();
        }
    }

    public ByteBuffer getOutput() {
        if (!isOperational()) {
            return u.f27291a;
        }
        ByteBuffer byteBuffer = this.f27273c[a()];
        if (!byteBuffer.hasRemaining()) {
            b(u.f27291a);
        }
        return byteBuffer;
    }

    public s getOutputAudioFormat() {
        return this.f27274d;
    }

    public int hashCode() {
        return this.f27271a.hashCode();
    }

    public boolean isEnded() {
        return this.f27276f && ((u) this.f27272b.get(a())).isEnded() && !this.f27273c[a()].hasRemaining();
    }

    public boolean isOperational() {
        return !this.f27272b.isEmpty();
    }

    public void queueEndOfStream() {
        if (!isOperational() || this.f27276f) {
            return;
        }
        this.f27276f = true;
        ((u) this.f27272b.get(0)).queueEndOfStream();
    }

    public void queueInput(ByteBuffer byteBuffer) {
        if (!isOperational() || this.f27276f) {
            return;
        }
        b(byteBuffer);
    }

    public void reset() {
        int i10 = 0;
        while (true) {
            b5 b5Var = this.f27271a;
            if (i10 >= b5Var.size()) {
                this.f27273c = new ByteBuffer[0];
                s sVar = s.f27278e;
                this.f27274d = sVar;
                this.f27275e = sVar;
                this.f27276f = false;
                return;
            }
            u uVar = (u) b5Var.get(i10);
            uVar.flush();
            uVar.reset();
            i10++;
        }
    }
}
