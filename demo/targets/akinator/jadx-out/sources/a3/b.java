package a3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class b extends d {

    /* renamed from: a, reason: collision with root package name */
    public final double[] f3925a;

    /* renamed from: b, reason: collision with root package name */
    public final a[] f3926b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3927c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Type inference failed for: r0v0, types: [a3.b, a3.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(int[] r33, double[] r34, double[][] r35) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.b.<init>(int[], double[], double[][]):void");
    }

    @Override // a3.d
    public void getPos(double d10, double[] dArr) {
        boolean z10 = this.f3927c;
        a[] aVarArr = this.f3926b;
        if (z10) {
            a aVar = aVarArr[0];
            double d11 = aVar.f3909c;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (aVar.f3924r) {
                    dArr[0] = (aVarArr[0].getLinearDX(d11) * d12) + aVar.getLinearX(d11);
                    dArr[1] = (aVarArr[0].getLinearDY(d11) * d12) + aVarArr[0].getLinearY(d11);
                    return;
                }
                aVar.e(d11);
                dArr[0] = (aVarArr[0].a() * d12) + aVarArr[0].c();
                dArr[1] = (aVarArr[0].b() * d12) + aVarArr[0].d();
                return;
            }
            if (d10 > aVarArr[aVarArr.length - 1].f3910d) {
                double d13 = aVarArr[aVarArr.length - 1].f3910d;
                double d14 = d10 - d13;
                int length = aVarArr.length - 1;
                a aVar2 = aVarArr[length];
                if (aVar2.f3924r) {
                    dArr[0] = (aVarArr[length].getLinearDX(d13) * d14) + aVar2.getLinearX(d13);
                    dArr[1] = (aVarArr[length].getLinearDY(d13) * d14) + aVarArr[length].getLinearY(d13);
                    return;
                }
                aVar2.e(d10);
                dArr[0] = (aVarArr[length].a() * d14) + aVarArr[length].c();
                dArr[1] = (aVarArr[length].b() * d14) + aVarArr[length].d();
                return;
            }
        } else {
            double d15 = aVarArr[0].f3909c;
            if (d10 < d15) {
                d10 = d15;
            }
            if (d10 > aVarArr[aVarArr.length - 1].f3910d) {
                d10 = aVarArr[aVarArr.length - 1].f3910d;
            }
        }
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            a aVar3 = aVarArr[i10];
            if (d10 <= aVar3.f3910d) {
                if (aVar3.f3924r) {
                    dArr[0] = aVar3.getLinearX(d10);
                    dArr[1] = aVarArr[i10].getLinearY(d10);
                    return;
                } else {
                    aVar3.e(d10);
                    dArr[0] = aVarArr[i10].c();
                    dArr[1] = aVarArr[i10].d();
                    return;
                }
            }
        }
    }

    @Override // a3.d
    public void getSlope(double d10, double[] dArr) {
        a[] aVarArr = this.f3926b;
        double d11 = aVarArr[0].f3909c;
        if (d10 < d11) {
            d10 = d11;
        } else if (d10 > aVarArr[aVarArr.length - 1].f3910d) {
            d10 = aVarArr[aVarArr.length - 1].f3910d;
        }
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            a aVar = aVarArr[i10];
            if (d10 <= aVar.f3910d) {
                if (aVar.f3924r) {
                    dArr[0] = aVar.getLinearDX(d10);
                    dArr[1] = aVarArr[i10].getLinearDY(d10);
                    return;
                } else {
                    aVar.e(d10);
                    dArr[0] = aVarArr[i10].a();
                    dArr[1] = aVarArr[i10].b();
                    return;
                }
            }
        }
    }

    @Override // a3.d
    public double[] getTimePoints() {
        return this.f3925a;
    }

    @Override // a3.d
    public double getSlope(double d10, int i10) {
        a[] aVarArr = this.f3926b;
        double d11 = aVarArr[0].f3909c;
        if (d10 < d11) {
            d10 = d11;
        }
        if (d10 > aVarArr[aVarArr.length - 1].f3910d) {
            d10 = aVarArr[aVarArr.length - 1].f3910d;
        }
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            a aVar = aVarArr[i11];
            if (d10 <= aVar.f3910d) {
                if (aVar.f3924r) {
                    if (i10 == 0) {
                        return aVar.getLinearDX(d10);
                    }
                    return aVar.getLinearDY(d10);
                }
                aVar.e(d10);
                if (i10 == 0) {
                    return aVarArr[i11].a();
                }
                return aVarArr[i11].b();
            }
        }
        return Double.NaN;
    }

    @Override // a3.d
    public void getPos(double d10, float[] fArr) {
        boolean z10 = this.f3927c;
        a[] aVarArr = this.f3926b;
        if (z10) {
            a aVar = aVarArr[0];
            double d11 = aVar.f3909c;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (aVar.f3924r) {
                    fArr[0] = (float) ((aVarArr[0].getLinearDX(d11) * d12) + aVar.getLinearX(d11));
                    fArr[1] = (float) ((aVarArr[0].getLinearDY(d11) * d12) + aVarArr[0].getLinearY(d11));
                    return;
                }
                aVar.e(d11);
                fArr[0] = (float) ((aVarArr[0].a() * d12) + aVarArr[0].c());
                fArr[1] = (float) ((aVarArr[0].b() * d12) + aVarArr[0].d());
                return;
            }
            if (d10 > aVarArr[aVarArr.length - 1].f3910d) {
                double d13 = aVarArr[aVarArr.length - 1].f3910d;
                double d14 = d10 - d13;
                int length = aVarArr.length - 1;
                a aVar2 = aVarArr[length];
                if (aVar2.f3924r) {
                    fArr[0] = (float) ((aVarArr[length].getLinearDX(d13) * d14) + aVar2.getLinearX(d13));
                    fArr[1] = (float) ((aVarArr[length].getLinearDY(d13) * d14) + aVarArr[length].getLinearY(d13));
                    return;
                }
                aVar2.e(d10);
                fArr[0] = (float) aVarArr[length].c();
                fArr[1] = (float) aVarArr[length].d();
                return;
            }
        } else {
            double d15 = aVarArr[0].f3909c;
            if (d10 < d15) {
                d10 = d15;
            } else if (d10 > aVarArr[aVarArr.length - 1].f3910d) {
                d10 = aVarArr[aVarArr.length - 1].f3910d;
            }
        }
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            a aVar3 = aVarArr[i10];
            if (d10 <= aVar3.f3910d) {
                if (aVar3.f3924r) {
                    fArr[0] = (float) aVar3.getLinearX(d10);
                    fArr[1] = (float) aVarArr[i10].getLinearY(d10);
                    return;
                } else {
                    aVar3.e(d10);
                    fArr[0] = (float) aVarArr[i10].c();
                    fArr[1] = (float) aVarArr[i10].d();
                    return;
                }
            }
        }
    }

    @Override // a3.d
    public double getPos(double d10, int i10) {
        boolean z10 = this.f3927c;
        a[] aVarArr = this.f3926b;
        if (z10) {
            a aVar = aVarArr[0];
            double d11 = aVar.f3909c;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (aVar.f3924r) {
                    if (i10 == 0) {
                        return (aVarArr[0].getLinearDX(d11) * d12) + aVar.getLinearX(d11);
                    }
                    return (aVarArr[0].getLinearDY(d11) * d12) + aVar.getLinearY(d11);
                }
                aVar.e(d11);
                if (i10 == 0) {
                    return (aVarArr[0].a() * d12) + aVarArr[0].c();
                }
                return (aVarArr[0].b() * d12) + aVarArr[0].d();
            }
            if (d10 > aVarArr[aVarArr.length - 1].f3910d) {
                double d13 = aVarArr[aVarArr.length - 1].f3910d;
                double d14 = d10 - d13;
                int length = aVarArr.length - 1;
                if (i10 == 0) {
                    return (aVarArr[length].getLinearDX(d13) * d14) + aVarArr[length].getLinearX(d13);
                }
                return (aVarArr[length].getLinearDY(d13) * d14) + aVarArr[length].getLinearY(d13);
            }
        } else {
            double d15 = aVarArr[0].f3909c;
            if (d10 < d15) {
                d10 = d15;
            } else if (d10 > aVarArr[aVarArr.length - 1].f3910d) {
                d10 = aVarArr[aVarArr.length - 1].f3910d;
            }
        }
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            a aVar2 = aVarArr[i11];
            if (d10 <= aVar2.f3910d) {
                if (aVar2.f3924r) {
                    if (i10 == 0) {
                        return aVar2.getLinearX(d10);
                    }
                    return aVar2.getLinearY(d10);
                }
                aVar2.e(d10);
                if (i10 == 0) {
                    return aVarArr[i11].c();
                }
                return aVarArr[i11].d();
            }
        }
        return Double.NaN;
    }
}
