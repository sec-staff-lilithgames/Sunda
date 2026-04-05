package x2;

import java.util.Arrays;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: b, reason: collision with root package name */
    public final c f91460b;

    /* renamed from: c, reason: collision with root package name */
    public final d f91461c;

    /* renamed from: a, reason: collision with root package name */
    public int f91459a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f91462d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f91463e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f91464f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f91465g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f91466h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f91467i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f91468j = false;

    public a(c cVar, d dVar) {
        this.f91460b = cVar;
        this.f91461c = dVar;
    }

    @Override // x2.b
    public void add(n nVar, float f10, boolean z10) {
        if (f10 <= -0.001f || f10 >= 0.001f) {
            int i10 = this.f91466h;
            c cVar = this.f91460b;
            if (i10 == -1) {
                this.f91466h = 0;
                this.f91465g[0] = f10;
                this.f91463e[0] = nVar.f91519e;
                this.f91464f[0] = -1;
                nVar.f91529o++;
                nVar.addToRow(cVar);
                this.f91459a++;
                if (this.f91468j) {
                    return;
                }
                int i11 = this.f91467i + 1;
                this.f91467i = i11;
                int[] iArr = this.f91463e;
                if (i11 >= iArr.length) {
                    this.f91468j = true;
                    this.f91467i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f91459a; i13++) {
                int i14 = this.f91463e[i10];
                int i15 = nVar.f91519e;
                if (i14 == i15) {
                    float[] fArr = this.f91465g;
                    float f11 = fArr[i10] + f10;
                    if (f11 > -0.001f && f11 < 0.001f) {
                        f11 = 0.0f;
                    }
                    fArr[i10] = f11;
                    if (f11 == 0.0f) {
                        if (i10 == this.f91466h) {
                            this.f91466h = this.f91464f[i10];
                        } else {
                            int[] iArr2 = this.f91464f;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            nVar.removeFromRow(cVar);
                        }
                        if (this.f91468j) {
                            this.f91467i = i10;
                        }
                        nVar.f91529o--;
                        this.f91459a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f91464f[i10];
            }
            int length = this.f91467i;
            int i16 = length + 1;
            if (this.f91468j) {
                int[] iArr3 = this.f91463e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f91463e;
            if (length >= iArr4.length && this.f91459a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f91463e;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f91463e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f91462d * 2;
                this.f91462d = i18;
                this.f91468j = false;
                this.f91467i = length - 1;
                this.f91465g = Arrays.copyOf(this.f91465g, i18);
                this.f91463e = Arrays.copyOf(this.f91463e, this.f91462d);
                this.f91464f = Arrays.copyOf(this.f91464f, this.f91462d);
            }
            this.f91463e[length] = nVar.f91519e;
            this.f91465g[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f91464f;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f91464f[length] = this.f91466h;
                this.f91466h = length;
            }
            nVar.f91529o++;
            nVar.addToRow(cVar);
            this.f91459a++;
            if (!this.f91468j) {
                this.f91467i++;
            }
            int i19 = this.f91467i;
            int[] iArr8 = this.f91463e;
            if (i19 >= iArr8.length) {
                this.f91468j = true;
                this.f91467i = iArr8.length - 1;
            }
        }
    }

    @Override // x2.b
    public final void clear() {
        int i10 = this.f91466h;
        for (int i11 = 0; i10 != -1 && i11 < this.f91459a; i11++) {
            n nVar = this.f91461c.f91476c[this.f91463e[i10]];
            if (nVar != null) {
                nVar.removeFromRow(this.f91460b);
            }
            i10 = this.f91464f[i10];
        }
        this.f91466h = -1;
        this.f91467i = -1;
        this.f91468j = false;
        this.f91459a = 0;
    }

    @Override // x2.b
    public boolean contains(n nVar) {
        int i10 = this.f91466h;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f91459a; i11++) {
            if (this.f91463e[i10] == nVar.f91519e) {
                return true;
            }
            i10 = this.f91464f[i10];
        }
        return false;
    }

    @Override // x2.b
    public void display() {
        int i10 = this.f91459a;
        System.out.print("{ ");
        for (int i11 = 0; i11 < i10; i11++) {
            n variable = getVariable(i11);
            if (variable != null) {
                System.out.print(variable + " = " + getVariableValue(i11) + " ");
            }
        }
        System.out.println(" }");
    }

    @Override // x2.b
    public void divideByAmount(float f10) {
        int i10 = this.f91466h;
        for (int i11 = 0; i10 != -1 && i11 < this.f91459a; i11++) {
            float[] fArr = this.f91465g;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f91464f[i10];
        }
    }

    @Override // x2.b
    public final float get(n nVar) {
        int i10 = this.f91466h;
        for (int i11 = 0; i10 != -1 && i11 < this.f91459a; i11++) {
            if (this.f91463e[i10] == nVar.f91519e) {
                return this.f91465g[i10];
            }
            i10 = this.f91464f[i10];
        }
        return 0.0f;
    }

    @Override // x2.b
    public int getCurrentSize() {
        return this.f91459a;
    }

    public int getHead() {
        return this.f91466h;
    }

    public final int getId(int i10) {
        return this.f91463e[i10];
    }

    public final int getNextIndice(int i10) {
        return this.f91464f[i10];
    }

    public final float getValue(int i10) {
        return this.f91465g[i10];
    }

    @Override // x2.b
    public n getVariable(int i10) {
        int i11 = this.f91466h;
        for (int i12 = 0; i11 != -1 && i12 < this.f91459a; i12++) {
            if (i12 == i10) {
                return this.f91461c.f91476c[this.f91463e[i11]];
            }
            i11 = this.f91464f[i11];
        }
        return null;
    }

    @Override // x2.b
    public float getVariableValue(int i10) {
        int i11 = this.f91466h;
        for (int i12 = 0; i11 != -1 && i12 < this.f91459a; i12++) {
            if (i12 == i10) {
                return this.f91465g[i11];
            }
            i11 = this.f91464f[i11];
        }
        return 0.0f;
    }

    @Override // x2.b
    public int indexOf(n nVar) {
        int i10 = this.f91466h;
        if (i10 == -1) {
            return -1;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f91459a; i11++) {
            if (this.f91463e[i10] == nVar.f91519e) {
                return i10;
            }
            i10 = this.f91464f[i10];
        }
        return -1;
    }

    @Override // x2.b
    public void invert() {
        int i10 = this.f91466h;
        for (int i11 = 0; i10 != -1 && i11 < this.f91459a; i11++) {
            float[] fArr = this.f91465g;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f91464f[i10];
        }
    }

    @Override // x2.b
    public final void put(n nVar, float f10) {
        if (f10 == 0.0f) {
            remove(nVar, true);
            return;
        }
        int i10 = this.f91466h;
        c cVar = this.f91460b;
        if (i10 == -1) {
            this.f91466h = 0;
            this.f91465g[0] = f10;
            this.f91463e[0] = nVar.f91519e;
            this.f91464f[0] = -1;
            nVar.f91529o++;
            nVar.addToRow(cVar);
            this.f91459a++;
            if (this.f91468j) {
                return;
            }
            int i11 = this.f91467i + 1;
            this.f91467i = i11;
            int[] iArr = this.f91463e;
            if (i11 >= iArr.length) {
                this.f91468j = true;
                this.f91467i = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f91459a; i13++) {
            int i14 = this.f91463e[i10];
            int i15 = nVar.f91519e;
            if (i14 == i15) {
                this.f91465g[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f91464f[i10];
        }
        int length = this.f91467i;
        int i16 = length + 1;
        if (this.f91468j) {
            int[] iArr2 = this.f91463e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f91463e;
        if (length >= iArr3.length && this.f91459a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f91463e;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f91463e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f91462d * 2;
            this.f91462d = i18;
            this.f91468j = false;
            this.f91467i = length - 1;
            this.f91465g = Arrays.copyOf(this.f91465g, i18);
            this.f91463e = Arrays.copyOf(this.f91463e, this.f91462d);
            this.f91464f = Arrays.copyOf(this.f91464f, this.f91462d);
        }
        this.f91463e[length] = nVar.f91519e;
        this.f91465g[length] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f91464f;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f91464f[length] = this.f91466h;
            this.f91466h = length;
        }
        nVar.f91529o++;
        nVar.addToRow(cVar);
        int i19 = this.f91459a + 1;
        this.f91459a = i19;
        if (!this.f91468j) {
            this.f91467i++;
        }
        int[] iArr7 = this.f91463e;
        if (i19 >= iArr7.length) {
            this.f91468j = true;
        }
        if (this.f91467i >= iArr7.length) {
            this.f91468j = true;
            this.f91467i = iArr7.length - 1;
        }
    }

    @Override // x2.b
    public final float remove(n nVar, boolean z10) {
        int i10 = this.f91466h;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f91459a) {
            if (this.f91463e[i10] == nVar.f91519e) {
                if (i10 == this.f91466h) {
                    this.f91466h = this.f91464f[i10];
                } else {
                    int[] iArr = this.f91464f;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    nVar.removeFromRow(this.f91460b);
                }
                nVar.f91529o--;
                this.f91459a--;
                this.f91463e[i10] = -1;
                if (this.f91468j) {
                    this.f91467i = i10;
                }
                return this.f91465g[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f91464f[i10];
        }
        return 0.0f;
    }

    @Override // x2.b
    public int sizeInBytes() {
        return (this.f91463e.length * 12) + 36;
    }

    public String toString() {
        int i10 = this.f91466h;
        String string = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f91459a; i11++) {
            StringBuilder sbU = o2.u(j1.o2.l(string, " -> "));
            sbU.append(this.f91465g[i10]);
            sbU.append(" : ");
            StringBuilder sbU2 = o2.u(sbU.toString());
            sbU2.append(this.f91461c.f91476c[this.f91463e[i10]]);
            string = sbU2.toString();
            i10 = this.f91464f[i10];
        }
        return string;
    }

    @Override // x2.b
    public float use(c cVar, boolean z10) {
        float f10 = get(cVar.f91469a);
        remove(cVar.f91469a, z10);
        b bVar = cVar.f91472d;
        int currentSize = bVar.getCurrentSize();
        for (int i10 = 0; i10 < currentSize; i10++) {
            n variable = bVar.getVariable(i10);
            add(variable, bVar.get(variable) * f10, z10);
        }
        return f10;
    }
}
