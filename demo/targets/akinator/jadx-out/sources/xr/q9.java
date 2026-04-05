package xr;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q9 extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f92928b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public hf f92929c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t9 f92930e;

    public q9(t9 t9Var) {
        this.f92930e = t9Var;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        hf hfVar = this.f92929c;
        if (hfVar == null || ((yr.b1) hfVar).writableBytes() <= 0) {
            write(new byte[]{(byte) i10}, 0, 1);
        } else {
            ((yr.b1) this.f92929c).write((byte) i10);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        jf jfVar = this.f92930e.f93029h;
        hf hfVar = this.f92929c;
        ArrayList arrayList = this.f92928b;
        if (hfVar == null) {
            hf hfVarAllocate = ((yr.c1) jfVar).allocate(i11);
            this.f92929c = hfVarAllocate;
            arrayList.add(hfVarAllocate);
        }
        while (i11 > 0) {
            int iMin = Math.min(i11, ((yr.b1) this.f92929c).writableBytes());
            if (iMin == 0) {
                hf hfVarAllocate2 = ((yr.c1) jfVar).allocate(Math.max(i11, ((yr.b1) this.f92929c).readableBytes() * 2));
                this.f92929c = hfVarAllocate2;
                arrayList.add(hfVarAllocate2);
            } else {
                ((yr.b1) this.f92929c).write(bArr, i10, iMin);
                i10 += iMin;
                i11 -= iMin;
            }
        }
    }
}
