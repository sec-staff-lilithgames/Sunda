package com.bytedance.adsdk.ugeno.my;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import e3.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class cm {
    static final /* synthetic */ boolean wqx = true;

    /* renamed from: cm, reason: collision with root package name */
    private final com.bytedance.adsdk.ugeno.my.jpo f17923cm;

    /* renamed from: jd, reason: collision with root package name */
    long[] f17924jd;

    /* renamed from: jj, reason: collision with root package name */
    private long[] f17925jj;
    int[] jpo;
    private boolean[] my;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jd implements Comparable<jd> {

        /* renamed from: jd, reason: collision with root package name */
        int f17926jd;
        int jpo;

        private jd() {
        }

        @Override // java.lang.Comparable
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public int compareTo(jd jdVar) {
            int i10 = this.f17926jd;
            int i11 = jdVar.f17926jd;
            return i10 != i11 ? i10 - i11 : this.jpo - jdVar.jpo;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Order{order=");
            sb2.append(this.f17926jd);
            sb2.append(", index=");
            return g.m(sb2, this.jpo, AbstractJsonLexerKt.END_OBJ);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: jd, reason: collision with root package name */
        int f17927jd;
        List<wqx> jpo;

        public void jpo() {
            this.jpo = null;
            this.f17927jd = 0;
        }
    }

    public cm(com.bytedance.adsdk.ugeno.my.jpo jpoVar) {
        this.f17923cm = jpoVar;
    }

    private int cm(boolean z10) {
        return z10 ? this.f17923cm.getPaddingBottom() : this.f17923cm.getPaddingEnd();
    }

    private int jj(com.bytedance.adsdk.ugeno.my.jd jdVar, boolean z10) {
        return z10 ? jdVar.hna() : jdVar.prr();
    }

    private int my(com.bytedance.adsdk.ugeno.my.jd jdVar, boolean z10) {
        return z10 ? jdVar.oya() : jdVar.au();
    }

    private int wqx(boolean z10) {
        return z10 ? this.f17923cm.getPaddingTop() : this.f17923cm.getPaddingStart();
    }

    public int jd(long j10) {
        return (int) (j10 >> 32);
    }

    public int jpo(long j10) {
        return (int) j10;
    }

    public long jd(int i10, int i11) {
        return (i10 & 4294967295L) | (i11 << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] jpo(View view, int i10, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.f17923cm.getFlexItemCount();
        List<jd> listJd = jd(flexItemCount);
        jd jdVar = new jd();
        if (view == null || !(layoutParams instanceof com.bytedance.adsdk.ugeno.my.jd)) {
            jdVar.f17926jd = 1;
        } else {
            jdVar.f17926jd = ((com.bytedance.adsdk.ugeno.my.jd) layoutParams).wqx();
        }
        if (i10 == -1 || i10 == flexItemCount || i10 >= this.f17923cm.getFlexItemCount()) {
            jdVar.jpo = flexItemCount;
        } else {
            jdVar.jpo = i10;
            while (i10 < flexItemCount) {
                listJd.get(i10).jpo++;
                i10++;
            }
        }
        listJd.add(jdVar);
        return jpo(flexItemCount + 1, listJd, sparseIntArray);
    }

    private int cm(com.bytedance.adsdk.ugeno.my.jd jdVar, boolean z10) {
        if (z10) {
            return jdVar.prr();
        }
        return jdVar.hna();
    }

    private List<jd> jd(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            com.bytedance.adsdk.ugeno.my.jd jdVar = (com.bytedance.adsdk.ugeno.my.jd) this.f17923cm.jpo(i11).getLayoutParams();
            jd jdVar2 = new jd();
            jdVar2.f17926jd = jdVar.wqx();
            jdVar2.jpo = i11;
            arrayList.add(jdVar2);
        }
        return arrayList;
    }

    private int wqx(com.bytedance.adsdk.ugeno.my.jd jdVar, boolean z10) {
        if (z10) {
            return jdVar.au();
        }
        return jdVar.oya();
    }

    private void wqx(int i10) {
        boolean[] zArr = this.my;
        if (zArr == null) {
            this.my = new boolean[Math.max(i10, 10)];
        } else if (zArr.length < i10) {
            this.my = new boolean[Math.max(zArr.length * 2, i10)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    public boolean jd(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f17923cm.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i10 = 0; i10 < flexItemCount; i10++) {
            View viewJpo = this.f17923cm.jpo(i10);
            if (viewJpo != null && ((com.bytedance.adsdk.ugeno.my.jd) viewJpo.getLayoutParams()).wqx() != sparseIntArray.get(i10)) {
                return true;
            }
        }
        return false;
    }

    public void jd(jpo jpoVar, int i10, int i11) {
        jpo(jpoVar, i11, i10, Integer.MAX_VALUE, 0, -1, (List<wqx>) null);
    }

    private int jd(boolean z10) {
        if (z10) {
            return this.f17923cm.getPaddingEnd();
        }
        return this.f17923cm.getPaddingBottom();
    }

    public int[] jpo(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f17923cm.getFlexItemCount();
        return jpo(flexItemCount, jd(flexItemCount), sparseIntArray);
    }

    private int jd(View view, boolean z10) {
        if (z10) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private int[] jpo(int i10, List<jd> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i10];
        int i11 = 0;
        for (jd jdVar : list) {
            int i12 = jdVar.jpo;
            iArr[i11] = i12;
            sparseIntArray.append(i12, jdVar.f17926jd);
            i11++;
        }
        return iArr;
    }

    private int jd(com.bytedance.adsdk.ugeno.my.jd jdVar, boolean z10) {
        if (z10) {
            return jdVar.jd();
        }
        return jdVar.jpo();
    }

    private void jd(int i10, int i11, wqx wqxVar, int i12, int i13, boolean z10) {
        float f10;
        float f11;
        int iMax;
        int iQk;
        int i14 = wqxVar.my;
        float f12 = wqxVar.f17952ju;
        float f13 = 0.0f;
        if (f12 <= 0.0f || i12 > i14) {
            return;
        }
        float f14 = (i14 - i12) / f12;
        wqxVar.my = i13 + wqxVar.f17951jj;
        if (!z10) {
            wqxVar.f17953qk = Integer.MIN_VALUE;
        }
        int i15 = 0;
        boolean z11 = false;
        int i16 = 0;
        float f15 = 0.0f;
        while (i15 < wqxVar.xyk) {
            int i17 = wqxVar.prr + i15;
            View viewJd = this.f17923cm.jd(i17);
            if (viewJd == null || viewJd.getVisibility() == 8) {
                f10 = f13;
                f11 = f14;
            } else {
                com.bytedance.adsdk.ugeno.my.jd jdVar = (com.bytedance.adsdk.ugeno.my.jd) viewJd.getLayoutParams();
                int flexDirection = this.f17923cm.getFlexDirection();
                f10 = f13;
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = viewJd.getMeasuredHeight();
                    long[] jArr = this.f17925jj;
                    if (jArr != null) {
                        measuredHeight = jd(jArr[i17]);
                    }
                    int measuredWidth = viewJd.getMeasuredWidth();
                    long[] jArr2 = this.f17925jj;
                    if (jArr2 != null) {
                        measuredWidth = jpo(jArr2[i17]);
                    }
                    if (!this.my[i17] && jdVar.my() > f10) {
                        float fMy = measuredHeight - (jdVar.my() * f14);
                        if (i15 == wqxVar.xyk - 1) {
                            fMy += f15;
                            f15 = f10;
                        }
                        int iRound = Math.round(fMy);
                        if (iRound < jdVar.xyk()) {
                            iRound = jdVar.xyk();
                            this.my[i17] = true;
                            wqxVar.f17952ju -= jdVar.my();
                            z11 = true;
                        } else {
                            float f16 = (fMy - iRound) + f15;
                            double d10 = f16;
                            if (d10 > 1.0d) {
                                iRound++;
                                f16 -= 1.0f;
                            } else if (d10 < -1.0d) {
                                iRound--;
                                f16 += 1.0f;
                            }
                            f15 = f16;
                        }
                        int iJpo = jpo(i10, jdVar, wqxVar.f17948au);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewJd.measure(iJpo, iMakeMeasureSpec);
                        int measuredWidth2 = viewJd.getMeasuredWidth();
                        int measuredHeight2 = viewJd.getMeasuredHeight();
                        jpo(i17, iJpo, iMakeMeasureSpec, viewJd);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    iMax = Math.max(i16, jdVar.prr() + jdVar.au() + measuredWidth + this.f17923cm.jpo(viewJd));
                    wqxVar.my = jdVar.hna() + jdVar.oya() + measuredHeight + wqxVar.my;
                    f11 = f14;
                } else {
                    int measuredWidth3 = viewJd.getMeasuredWidth();
                    long[] jArr3 = this.f17925jj;
                    if (jArr3 != null) {
                        measuredWidth3 = jpo(jArr3[i17]);
                    }
                    int measuredHeight3 = viewJd.getMeasuredHeight();
                    long[] jArr4 = this.f17925jj;
                    f11 = f14;
                    if (jArr4 != null) {
                        measuredHeight3 = jd(jArr4[i17]);
                    }
                    if (!this.my[i17] && jdVar.my() > f10) {
                        float fMy2 = measuredWidth3 - (jdVar.my() * f11);
                        if (i15 == wqxVar.xyk - 1) {
                            fMy2 += f15;
                            f15 = f10;
                        }
                        int iRound2 = Math.round(fMy2);
                        if (iRound2 < jdVar.qk()) {
                            iQk = jdVar.qk();
                            this.my[i17] = true;
                            wqxVar.f17952ju -= jdVar.my();
                            z11 = true;
                        } else {
                            float f17 = (fMy2 - iRound2) + f15;
                            double d11 = f17;
                            if (d11 > 1.0d) {
                                iQk = iRound2 + 1;
                                f17 -= 1.0f;
                            } else if (d11 < -1.0d) {
                                iQk = iRound2 - 1;
                                f17 += 1.0f;
                            } else {
                                iQk = iRound2;
                            }
                            f15 = f17;
                        }
                        int iJd = jd(i11, jdVar, wqxVar.f17948au);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iQk, 1073741824);
                        viewJd.measure(iMakeMeasureSpec2, iJd);
                        int measuredWidth4 = viewJd.getMeasuredWidth();
                        int measuredHeight4 = viewJd.getMeasuredHeight();
                        jpo(i17, iMakeMeasureSpec2, iJd, viewJd);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    int iMax2 = Math.max(i16, jdVar.hna() + jdVar.oya() + measuredHeight3 + this.f17923cm.jpo(viewJd));
                    wqxVar.my = jdVar.prr() + jdVar.au() + measuredWidth3 + wqxVar.my;
                    iMax = iMax2;
                }
                wqxVar.f17953qk = Math.max(wqxVar.f17953qk, iMax);
                i16 = iMax;
            }
            i15++;
            f14 = f11;
            f13 = f10;
        }
        if (!z11 || i14 == wqxVar.my) {
            return;
        }
        jd(i10, i11, wqxVar, i12, i13, true);
    }

    public void jpo(jpo jpoVar, int i10, int i11) {
        jpo(jpoVar, i10, i11, Integer.MAX_VALUE, 0, -1, (List<wqx>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void jpo(jpo jpoVar, int i10, int i11, int i12, int i13, int i14, List<wqx> list) {
        int i15;
        jpo jpoVar2;
        boolean z10;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int iJpo;
        int i21;
        int i22;
        int i23;
        wqx wqxVar;
        int i24;
        int i25;
        boolean z11;
        int i26;
        int i27;
        int i28 = i10;
        boolean zJpo = this.f17923cm.jpo();
        int mode = View.MeasureSpec.getMode(i28);
        int size = View.MeasureSpec.getSize(i28);
        List<wqx> arrayList = list == null ? new ArrayList() : list;
        jpoVar.jpo = arrayList;
        boolean z12 = i14 == -1;
        int iJpo2 = jpo(zJpo);
        int iJd = jd(zJpo);
        int iWqx = wqx(zJpo);
        int iCm = cm(zJpo);
        wqx wqxVar2 = new wqx();
        int i29 = i13;
        wqxVar2.prr = i29;
        int i30 = iJpo2 + iJd;
        wqxVar2.my = i30;
        int flexItemCount = this.f17923cm.getFlexItemCount();
        boolean z13 = z12;
        wqx wqxVar3 = wqxVar2;
        int i31 = Integer.MIN_VALUE;
        int i32 = 0;
        int iCombineMeasuredStates = 0;
        int i33 = 0;
        while (true) {
            if (i29 >= flexItemCount) {
                i15 = iCombineMeasuredStates;
                jpoVar2 = jpoVar;
                break;
            }
            View viewJd = this.f17923cm.jd(i29);
            if (viewJd == null) {
                if (jpo(i29, flexItemCount, wqxVar3)) {
                    jpo(arrayList, wqxVar3, i29, i32);
                }
                i16 = i30;
                z10 = true;
            } else {
                z10 = true;
                i16 = i30;
                if (viewJd.getVisibility() == 8) {
                    wqxVar3.zz++;
                    wqxVar3.xyk++;
                    if (jpo(i29, flexItemCount, wqxVar3)) {
                        jpo(arrayList, wqxVar3, i29, i32);
                    }
                } else {
                    if (viewJd instanceof CompoundButton) {
                        jpo((CompoundButton) viewJd);
                    }
                    com.bytedance.adsdk.ugeno.my.jd jdVar = (com.bytedance.adsdk.ugeno.my.jd) viewJd.getLayoutParams();
                    int i34 = flexItemCount;
                    if (jdVar.jj() == 4) {
                        wqxVar3.oya.add(Integer.valueOf(i29));
                    }
                    int iJpo3 = jpo(jdVar, zJpo);
                    if (jdVar.mo391if() != -1.0f && mode == 1073741824) {
                        iJpo3 = Math.round(jdVar.mo391if() * size);
                    }
                    if (zJpo) {
                        i18 = mode;
                        iJpo = this.f17923cm.jpo(i28, i16 + wqx(jdVar, true) + cm(jdVar, true), iJpo3);
                        i17 = size;
                        i19 = i32;
                        int iJd2 = this.f17923cm.jd(i11, iWqx + iCm + my(jdVar, true) + jj(jdVar, true) + i32, jd(jdVar, true));
                        viewJd.measure(iJpo, iJd2);
                        jpo(i29, iJpo, iJd2, viewJd);
                        i20 = 0;
                    } else {
                        i17 = size;
                        i18 = mode;
                        i19 = i32;
                        i20 = 0;
                        int iJpo4 = this.f17923cm.jpo(i11, iWqx + iCm + my(jdVar, false) + jj(jdVar, false) + i19, jd(jdVar, false));
                        int iJd3 = this.f17923cm.jd(i28, i16 + wqx(jdVar, false) + cm(jdVar, false), iJpo3);
                        viewJd.measure(iJpo4, iJd3);
                        jpo(i29, iJpo4, iJd3, viewJd);
                        iJpo = iJd3;
                    }
                    jpo(viewJd, i29);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewJd.getMeasuredState());
                    int i35 = i20;
                    i21 = i29;
                    int i36 = iJpo;
                    wqx wqxVar4 = wqxVar3;
                    int i37 = i33;
                    i22 = i16;
                    i23 = i19;
                    boolean z14 = zJpo;
                    size = i17;
                    if (jpo(viewJd, i18, size, wqxVar3.my, jpo(viewJd, zJpo) + wqx(jdVar, zJpo) + cm(jdVar, zJpo), jdVar, i21, i37, arrayList.size())) {
                        if (wqxVar4.jd() > 0) {
                            jpo(arrayList, wqxVar4, i21 > 0 ? i21 - 1 : i35, i23);
                            i27 = i23 + wqxVar4.f17953qk;
                        } else {
                            i27 = i23;
                        }
                        if (z14) {
                            if (jdVar.jd() == -1) {
                                com.bytedance.adsdk.ugeno.my.jpo jpoVar3 = this.f17923cm;
                                viewJd.measure(i36, jpoVar3.jd(i11, jdVar.hna() + jdVar.oya() + jpoVar3.getPaddingTop() + this.f17923cm.getPaddingBottom() + i27, jdVar.jd()));
                                jpo(viewJd, i21);
                            }
                        } else if (jdVar.jpo() == -1) {
                            com.bytedance.adsdk.ugeno.my.jpo jpoVar4 = this.f17923cm;
                            viewJd.measure(jpoVar4.jpo(i11, jdVar.prr() + jdVar.au() + jpoVar4.getPaddingLeft() + this.f17923cm.getPaddingRight() + i27, jdVar.jpo()), i36);
                            jpo(viewJd, i21);
                        }
                        wqx wqxVar5 = new wqx();
                        wqxVar5.xyk = 1;
                        wqxVar5.my = i22;
                        wqxVar5.prr = i21;
                        i23 = i27;
                        i24 = i35;
                        wqxVar = wqxVar5;
                        i25 = Integer.MIN_VALUE;
                    } else {
                        wqxVar = wqxVar4;
                        wqxVar.xyk++;
                        i24 = i37 + 1;
                        i25 = i31;
                    }
                    wqxVar.f17954sq = (wqxVar.f17954sq ? 1 : 0) | (jdVar.cm() != 0.0f ? 1 : i35);
                    wqxVar.opi = (wqxVar.opi ? 1 : 0) | (jdVar.my() != 0.0f ? 1 : i35);
                    int[] iArr = this.jpo;
                    if (iArr != null) {
                        iArr[i21] = arrayList.size();
                    }
                    z11 = z14;
                    wqxVar.my = jpo(viewJd, z11) + wqx(jdVar, z11) + cm(jdVar, z11) + wqxVar.my;
                    wqxVar.f17955yd = jdVar.cm() + wqxVar.f17955yd;
                    wqxVar.f17952ju = jdVar.my() + wqxVar.f17952ju;
                    this.f17923cm.jpo(viewJd, i21, i24, wqxVar);
                    int iMax = Math.max(i25, jd(viewJd, z11) + my(jdVar, z11) + jj(jdVar, z11) + this.f17923cm.jpo(viewJd));
                    wqxVar.f17953qk = Math.max(wqxVar.f17953qk, iMax);
                    if (z11) {
                        if (this.f17923cm.getFlexWrap() != 2) {
                            wqxVar.f43if = Math.max(wqxVar.f43if, jdVar.oya() + viewJd.getBaseline());
                        } else {
                            wqxVar.f43if = Math.max(wqxVar.f43if, jdVar.hna() + (viewJd.getMeasuredHeight() - viewJd.getBaseline()));
                        }
                    }
                    i26 = i34;
                    if (jpo(i21, i26, wqxVar)) {
                        jpo(arrayList, wqxVar, i21, i23);
                        i23 += wqxVar.f17953qk;
                    }
                    if (i14 != -1 && arrayList.size() > 0) {
                        if (((wqx) o2.g(1, arrayList)).hna >= i14 && i21 >= i14 && !z13) {
                            i23 = -wqxVar.jpo();
                            z13 = true;
                        }
                    }
                    if (i23 > i12 && z13) {
                        jpoVar2 = jpoVar;
                        i15 = iCombineMeasuredStates;
                        break;
                    }
                    i31 = iMax;
                    i33 = i24;
                    int i38 = i21 + 1;
                    zJpo = z11;
                    wqxVar3 = wqxVar;
                    i30 = i22;
                    i32 = i23;
                    i28 = i10;
                    flexItemCount = i26;
                    i29 = i38;
                    mode = i18;
                }
            }
            i21 = i29;
            i18 = mode;
            i26 = flexItemCount;
            i23 = i32;
            z11 = zJpo;
            i22 = i16;
            wqxVar = wqxVar3;
            int i382 = i21 + 1;
            zJpo = z11;
            wqxVar3 = wqxVar;
            i30 = i22;
            i32 = i23;
            i28 = i10;
            flexItemCount = i26;
            i29 = i382;
            mode = i18;
        }
        jpoVar2.f17927jd = i15;
    }

    private int jd(int i10, com.bytedance.adsdk.ugeno.my.jd jdVar, int i11) {
        com.bytedance.adsdk.ugeno.my.jpo jpoVar = this.f17923cm;
        int iJd = jpoVar.jd(i10, jdVar.hna() + jdVar.oya() + jpoVar.getPaddingTop() + this.f17923cm.getPaddingBottom() + i11, jdVar.jd());
        int size = View.MeasureSpec.getSize(iJd);
        if (size > jdVar.yd()) {
            return View.MeasureSpec.makeMeasureSpec(jdVar.yd(), View.MeasureSpec.getMode(iJd));
        }
        return size < jdVar.xyk() ? View.MeasureSpec.makeMeasureSpec(jdVar.xyk(), View.MeasureSpec.getMode(iJd)) : iJd;
    }

    public void jd(int i10, int i11, int i12) {
        int mode;
        int size;
        int flexDirection = this.f17923cm.getFlexDirection();
        if (flexDirection != 0 && flexDirection != 1) {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
        } else {
            int mode2 = View.MeasureSpec.getMode(i11);
            int size2 = View.MeasureSpec.getSize(i11);
            mode = mode2;
            size = size2;
        }
        List<wqx> flexLinesInternal = this.f17923cm.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.f17923cm.getSumOfCrossSize() + i12;
            int i13 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).f17953qk = size - i12;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.f17923cm.getAlignContent();
                if (alignContent == 1) {
                    int i14 = size - sumOfCrossSize;
                    wqx wqxVar = new wqx();
                    wqxVar.f17953qk = i14;
                    flexLinesInternal.add(0, wqxVar);
                    return;
                }
                if (alignContent == 2) {
                    this.f17923cm.setFlexLines(jpo(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize < size) {
                        float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                        ArrayList arrayList = new ArrayList();
                        int size4 = flexLinesInternal.size();
                        float f10 = 0.0f;
                        while (i13 < size4) {
                            arrayList.add(flexLinesInternal.get(i13));
                            if (i13 != flexLinesInternal.size() - 1) {
                                wqx wqxVar2 = new wqx();
                                if (i13 == flexLinesInternal.size() - 2) {
                                    wqxVar2.f17953qk = Math.round(f10 + size3);
                                    f10 = 0.0f;
                                } else {
                                    wqxVar2.f17953qk = Math.round(size3);
                                }
                                int i15 = wqxVar2.f17953qk;
                                float f11 = (size3 - i15) + f10;
                                if (f11 > 1.0f) {
                                    wqxVar2.f17953qk = i15 + 1;
                                    f11 -= 1.0f;
                                } else if (f11 < -1.0f) {
                                    wqxVar2.f17953qk = i15 - 1;
                                    f11 += 1.0f;
                                }
                                f10 = f11;
                                arrayList.add(wqxVar2);
                            }
                            i13++;
                        }
                        this.f17923cm.setFlexLines(arrayList);
                        return;
                    }
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.f17923cm.setFlexLines(jpo(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    wqx wqxVar3 = new wqx();
                    wqxVar3.f17953qk = size5;
                    for (wqx wqxVar4 : flexLinesInternal) {
                        arrayList2.add(wqxVar3);
                        arrayList2.add(wqxVar4);
                        arrayList2.add(wqxVar3);
                    }
                    this.f17923cm.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f12 = 0.0f;
                    while (i13 < size7) {
                        wqx wqxVar5 = flexLinesInternal.get(i13);
                        float f13 = wqxVar5.f17953qk + size6;
                        if (i13 == flexLinesInternal.size() - 1) {
                            f13 += f12;
                            f12 = 0.0f;
                        }
                        int iRound = Math.round(f13);
                        float f14 = (f13 - iRound) + f12;
                        if (f14 > 1.0f) {
                            iRound++;
                            f14 -= 1.0f;
                        } else if (f14 < -1.0f) {
                            iRound--;
                            f14 += 1.0f;
                        }
                        f12 = f14;
                        wqxVar5.f17953qk = iRound;
                        i13++;
                    }
                }
            }
        }
    }

    private void jpo(CompoundButton compoundButton) {
        com.bytedance.adsdk.ugeno.my.jd jdVar = (com.bytedance.adsdk.ugeno.my.jd) compoundButton.getLayoutParams();
        int iQk = jdVar.qk();
        int iXyk = jdVar.xyk();
        Drawable drawableJpo = com.bytedance.adsdk.ugeno.qk.my.jpo(compoundButton);
        int minimumWidth = drawableJpo == null ? 0 : drawableJpo.getMinimumWidth();
        int minimumHeight = drawableJpo != null ? drawableJpo.getMinimumHeight() : 0;
        if (iQk == -1) {
            iQk = minimumWidth;
        }
        jdVar.jpo(iQk);
        if (iXyk == -1) {
            iXyk = minimumHeight;
        }
        jdVar.jd(iXyk);
    }

    private void jd(View view, int i10, int i11) {
        int measuredHeight;
        com.bytedance.adsdk.ugeno.my.jd jdVar = (com.bytedance.adsdk.ugeno.my.jd) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i10 - jdVar.au()) - jdVar.prr()) - this.f17923cm.jpo(view), jdVar.qk()), jdVar.zz());
        long[] jArr = this.f17925jj;
        if (jArr != null) {
            measuredHeight = jd(jArr[i11]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        jpo(i11, iMakeMeasureSpec2, iMakeMeasureSpec, view);
    }

    private int jpo(boolean z10) {
        if (z10) {
            return this.f17923cm.getPaddingStart();
        }
        return this.f17923cm.getPaddingTop();
    }

    private int jpo(View view, boolean z10) {
        if (z10) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private int jpo(com.bytedance.adsdk.ugeno.my.jd jdVar, boolean z10) {
        if (z10) {
            return jdVar.jpo();
        }
        return jdVar.jd();
    }

    private boolean jpo(View view, int i10, int i11, int i12, int i13, com.bytedance.adsdk.ugeno.my.jd jdVar, int i14, int i15, int i16) {
        if (this.f17923cm.getFlexWrap() == 0) {
            return false;
        }
        if (jdVar.ju()) {
            return true;
        }
        if (i10 == 0) {
            return false;
        }
        int maxLine = this.f17923cm.getMaxLine();
        if (maxLine != -1 && maxLine <= i16 + 1) {
            return false;
        }
        int iJpo = this.f17923cm.jpo(view, i14, i15);
        if (iJpo > 0) {
            i13 += iJpo;
        }
        return i11 < i12 + i13;
    }

    private boolean jpo(int i10, int i11, wqx wqxVar) {
        return i10 == i11 - 1 && wqxVar.jd() != 0;
    }

    private void jpo(List<wqx> list, wqx wqxVar, int i10, int i11) {
        wqxVar.f17948au = i11;
        this.f17923cm.jpo(wqxVar);
        wqxVar.hna = i10;
        list.add(wqxVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void jpo(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.bytedance.adsdk.ugeno.my.jd r0 = (com.bytedance.adsdk.ugeno.my.jd) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.qk()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.qk()
        L19:
            r3 = r4
            goto L27
        L1b:
            int r3 = r0.zz()
            if (r1 <= r3) goto L26
            int r1 = r0.zz()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.xyk()
            if (r2 >= r5) goto L32
            int r2 = r0.xyk()
            goto L3e
        L32:
            int r5 = r0.yd()
            if (r2 <= r5) goto L3d
            int r2 = r0.yd()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L50
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.jpo(r8, r1, r0, r7)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.my.cm.jpo(android.view.View, int):void");
    }

    public void jpo(int i10, int i11) {
        jpo(i10, i11, 0);
    }

    public void jpo(int i10, int i11, int i12) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i13;
        int i14;
        wqx(this.f17923cm.getFlexItemCount());
        if (i12 >= this.f17923cm.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f17923cm.getFlexDirection();
        int flexDirection2 = this.f17923cm.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
            int largestMainSize = this.f17923cm.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.f17923cm.getPaddingLeft();
            paddingRight = this.f17923cm.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
            if (mode2 != 1073741824) {
                size = this.f17923cm.getLargestMainSize();
            }
            paddingLeft = this.f17923cm.getPaddingTop();
            paddingRight = this.f17923cm.getPaddingBottom();
        }
        int i15 = paddingLeft + paddingRight;
        int i16 = size;
        int[] iArr = this.jpo;
        int i17 = iArr != null ? iArr[i12] : 0;
        List<wqx> flexLinesInternal = this.f17923cm.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i17 < size2) {
            wqx wqxVar = flexLinesInternal.get(i17);
            int i18 = wqxVar.my;
            if (i18 < i16 && wqxVar.f17954sq) {
                i13 = i10;
                i14 = i11;
                jpo(i13, i14, wqxVar, i16, i15, false);
            } else {
                i13 = i10;
                i14 = i11;
                if (i18 > i16 && wqxVar.opi) {
                    jd(i13, i14, wqxVar, i16, i15, false);
                }
            }
            i17++;
            i10 = i13;
            i11 = i14;
        }
    }

    private void jpo(int i10, int i11, wqx wqxVar, int i12, int i13, boolean z10) {
        int i14;
        float f10;
        float f11;
        int iMax;
        double d10;
        double d11;
        float f12 = wqxVar.f17955yd;
        float f13 = 0.0f;
        if (f12 <= 0.0f || i12 < (i14 = wqxVar.my)) {
            return;
        }
        float f14 = (i12 - i14) / f12;
        wqxVar.my = i13 + wqxVar.f17951jj;
        if (!z10) {
            wqxVar.f17953qk = Integer.MIN_VALUE;
        }
        int i15 = 0;
        boolean z11 = false;
        int i16 = 0;
        float f15 = 0.0f;
        while (i15 < wqxVar.xyk) {
            int i17 = wqxVar.prr + i15;
            View viewJd = this.f17923cm.jd(i17);
            if (viewJd == null || viewJd.getVisibility() == 8) {
                f10 = f13;
                f11 = f14;
                z11 = z11;
            } else {
                com.bytedance.adsdk.ugeno.my.jd jdVar = (com.bytedance.adsdk.ugeno.my.jd) viewJd.getLayoutParams();
                int flexDirection = this.f17923cm.getFlexDirection();
                f10 = f13;
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = viewJd.getMeasuredHeight();
                    long[] jArr = this.f17925jj;
                    if (jArr != null) {
                        measuredHeight = jd(jArr[i17]);
                    }
                    int measuredWidth = viewJd.getMeasuredWidth();
                    long[] jArr2 = this.f17925jj;
                    f11 = f14;
                    boolean z12 = z11;
                    if (jArr2 != null) {
                        measuredWidth = jpo(jArr2[i17]);
                    }
                    if (this.my[i17] || jdVar.cm() <= f10) {
                        z11 = z12;
                    } else {
                        float fCm = (jdVar.cm() * f11) + measuredHeight;
                        if (i15 == wqxVar.xyk - 1) {
                            fCm += f15;
                            f15 = f10;
                        }
                        int iRound = Math.round(fCm);
                        if (iRound > jdVar.yd()) {
                            iRound = jdVar.yd();
                            this.my[i17] = true;
                            wqxVar.f17955yd -= jdVar.cm();
                            z11 = true;
                        } else {
                            float f16 = (fCm - iRound) + f15;
                            double d12 = f16;
                            if (d12 > 1.0d) {
                                iRound++;
                                d11 = d12 - 1.0d;
                            } else {
                                if (d12 < -1.0d) {
                                    iRound--;
                                    d11 = d12 + 1.0d;
                                }
                                f15 = f16;
                                z11 = z12;
                            }
                            f16 = (float) d11;
                            f15 = f16;
                            z11 = z12;
                        }
                        int iJpo = jpo(i10, jdVar, wqxVar.f17948au);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewJd.measure(iJpo, iMakeMeasureSpec);
                        int measuredWidth2 = viewJd.getMeasuredWidth();
                        int measuredHeight2 = viewJd.getMeasuredHeight();
                        jpo(i17, iJpo, iMakeMeasureSpec, viewJd);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    iMax = Math.max(i16, jdVar.prr() + jdVar.au() + measuredWidth + this.f17923cm.jpo(viewJd));
                    wqxVar.my = jdVar.hna() + jdVar.oya() + measuredHeight + wqxVar.my;
                } else {
                    f11 = f14;
                    boolean z13 = z11;
                    int measuredWidth3 = viewJd.getMeasuredWidth();
                    long[] jArr3 = this.f17925jj;
                    if (jArr3 != null) {
                        measuredWidth3 = jpo(jArr3[i17]);
                    }
                    int measuredHeight3 = viewJd.getMeasuredHeight();
                    long[] jArr4 = this.f17925jj;
                    if (jArr4 != null) {
                        measuredHeight3 = jd(jArr4[i17]);
                    }
                    if (this.my[i17] || jdVar.cm() <= f10) {
                        z11 = z13;
                    } else {
                        float fCm2 = (jdVar.cm() * f11) + measuredWidth3;
                        if (i15 == wqxVar.xyk - 1) {
                            fCm2 += f15;
                            f15 = f10;
                        }
                        int iRound2 = Math.round(fCm2);
                        if (iRound2 > jdVar.zz()) {
                            iRound2 = jdVar.zz();
                            this.my[i17] = true;
                            wqxVar.f17955yd -= jdVar.cm();
                            z11 = true;
                        } else {
                            float f17 = (fCm2 - iRound2) + f15;
                            double d13 = f17;
                            if (d13 > 1.0d) {
                                iRound2++;
                                d10 = d13 - 1.0d;
                            } else {
                                if (d13 < -1.0d) {
                                    iRound2--;
                                    d10 = d13 + 1.0d;
                                }
                                f15 = f17;
                                z11 = z13;
                            }
                            f17 = (float) d10;
                            f15 = f17;
                            z11 = z13;
                        }
                        int iJd = jd(i11, jdVar, wqxVar.f17948au);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewJd.measure(iMakeMeasureSpec2, iJd);
                        int measuredWidth4 = viewJd.getMeasuredWidth();
                        int measuredHeight4 = viewJd.getMeasuredHeight();
                        jpo(i17, iMakeMeasureSpec2, iJd, viewJd);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    int iMax2 = Math.max(i16, jdVar.hna() + jdVar.oya() + measuredHeight3 + this.f17923cm.jpo(viewJd));
                    wqxVar.my = jdVar.prr() + jdVar.au() + measuredWidth3 + wqxVar.my;
                    iMax = iMax2;
                }
                wqxVar.f17953qk = Math.max(wqxVar.f17953qk, iMax);
                i16 = iMax;
            }
            i15++;
            f14 = f11;
            f13 = f10;
        }
        if (!z11 || i14 == wqxVar.my) {
            return;
        }
        jpo(i10, i11, wqxVar, i12, i13, true);
    }

    private int jpo(int i10, com.bytedance.adsdk.ugeno.my.jd jdVar, int i11) {
        com.bytedance.adsdk.ugeno.my.jpo jpoVar = this.f17923cm;
        int iJpo = jpoVar.jpo(i10, jdVar.prr() + jdVar.au() + jpoVar.getPaddingLeft() + this.f17923cm.getPaddingRight() + i11, jdVar.jpo());
        int size = View.MeasureSpec.getSize(iJpo);
        if (size > jdVar.zz()) {
            return View.MeasureSpec.makeMeasureSpec(jdVar.zz(), View.MeasureSpec.getMode(iJpo));
        }
        return size < jdVar.qk() ? View.MeasureSpec.makeMeasureSpec(jdVar.qk(), View.MeasureSpec.getMode(iJpo)) : iJpo;
    }

    private List<wqx> jpo(List<wqx> list, int i10, int i11) {
        int i12 = (i10 - i11) / 2;
        ArrayList arrayList = new ArrayList();
        wqx wqxVar = new wqx();
        wqxVar.f17953qk = i12;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (i13 == 0) {
                arrayList.add(wqxVar);
            }
            arrayList.add(list.get(i13));
            if (i13 == list.size() - 1) {
                arrayList.add(wqxVar);
            }
        }
        return arrayList;
    }

    public void jpo() {
        jpo(0);
    }

    public void jpo(int i10) {
        View viewJd;
        if (i10 >= this.f17923cm.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f17923cm.getFlexDirection();
        if (this.f17923cm.getAlignItems() == 4) {
            int[] iArr = this.jpo;
            List<wqx> flexLinesInternal = this.f17923cm.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i11 = iArr != null ? iArr[i10] : 0; i11 < size; i11++) {
                wqx wqxVar = flexLinesInternal.get(i11);
                int i12 = wqxVar.xyk;
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = wqxVar.prr + i13;
                    if (i13 < this.f17923cm.getFlexItemCount() && (viewJd = this.f17923cm.jd(i14)) != null && viewJd.getVisibility() != 8) {
                        com.bytedance.adsdk.ugeno.my.jd jdVar = (com.bytedance.adsdk.ugeno.my.jd) viewJd.getLayoutParams();
                        if (jdVar.jj() == -1 || jdVar.jj() == 4) {
                            if (flexDirection != 0 && flexDirection != 1) {
                                if (flexDirection != 2 && flexDirection != 3) {
                                    throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                                }
                                jd(viewJd, wqxVar.f17953qk, i14);
                            } else {
                                jpo(viewJd, wqxVar.f17953qk, i14);
                            }
                        }
                    }
                }
            }
            return;
        }
        for (wqx wqxVar2 : this.f17923cm.getFlexLinesInternal()) {
            for (Integer num : wqxVar2.oya) {
                View viewJd2 = this.f17923cm.jd(num.intValue());
                if (flexDirection != 0 && flexDirection != 1) {
                    if (flexDirection != 2 && flexDirection != 3) {
                        throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                    }
                    jd(viewJd2, wqxVar2.f17953qk, num.intValue());
                } else {
                    jpo(viewJd2, wqxVar2.f17953qk, num.intValue());
                }
            }
        }
    }

    private void jpo(View view, int i10, int i11) {
        int measuredWidth;
        com.bytedance.adsdk.ugeno.my.jd jdVar = (com.bytedance.adsdk.ugeno.my.jd) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i10 - jdVar.oya()) - jdVar.hna()) - this.f17923cm.jpo(view), jdVar.xyk()), jdVar.yd());
        long[] jArr = this.f17925jj;
        if (jArr != null) {
            measuredWidth = jpo(jArr[i11]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        jpo(i11, iMakeMeasureSpec, iMakeMeasureSpec2, view);
    }

    public void jpo(View view, wqx wqxVar, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.my.jd jdVar = (com.bytedance.adsdk.ugeno.my.jd) view.getLayoutParams();
        int alignItems = this.f17923cm.getAlignItems();
        if (jdVar.jj() != -1) {
            alignItems = jdVar.jj();
        }
        int i14 = wqxVar.f17953qk;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.f17923cm.getFlexWrap() != 2) {
                    int i15 = i11 + i14;
                    view.layout(i10, (i15 - view.getMeasuredHeight()) - jdVar.hna(), i12, i15 - jdVar.hna());
                    return;
                }
                view.layout(i10, jdVar.oya() + view.getMeasuredHeight() + (i11 - i14), i12, jdVar.oya() + view.getMeasuredHeight() + (i13 - i14));
                return;
            }
            if (alignItems == 2) {
                int iOya = ((jdVar.oya() + (i14 - view.getMeasuredHeight())) - jdVar.hna()) / 2;
                if (this.f17923cm.getFlexWrap() != 2) {
                    int i16 = i11 + iOya;
                    view.layout(i10, i16, i12, view.getMeasuredHeight() + i16);
                    return;
                } else {
                    int i17 = i11 - iOya;
                    view.layout(i10, i17, i12, view.getMeasuredHeight() + i17);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.f17923cm.getFlexWrap() != 2) {
                    int iMax = Math.max(wqxVar.f43if - view.getBaseline(), jdVar.oya());
                    view.layout(i10, i11 + iMax, i12, i13 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (wqxVar.f43if - view.getMeasuredHeight()), jdVar.hna());
                    view.layout(i10, i11 - iMax2, i12, i13 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.f17923cm.getFlexWrap() != 2) {
            view.layout(i10, jdVar.oya() + i11, i12, jdVar.oya() + i13);
        } else {
            view.layout(i10, i11 - jdVar.hna(), i12, i13 - jdVar.hna());
        }
    }

    public void jpo(View view, wqx wqxVar, boolean z10, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.my.jd jdVar = (com.bytedance.adsdk.ugeno.my.jd) view.getLayoutParams();
        int alignItems = this.f17923cm.getAlignItems();
        if (jdVar.jj() != -1) {
            alignItems = jdVar.jj();
        }
        int i14 = wqxVar.f17953qk;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z10) {
                    view.layout(((i10 + i14) - view.getMeasuredWidth()) - jdVar.prr(), i11, ((i12 + i14) - view.getMeasuredWidth()) - jdVar.prr(), i13);
                    return;
                }
                view.layout(jdVar.au() + view.getMeasuredWidth() + (i10 - i14), i11, jdVar.au() + view.getMeasuredWidth() + (i12 - i14), i13);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int iJpo = ((com.bytedance.adsdk.ugeno.qk.jj.jpo(marginLayoutParams) + (i14 - view.getMeasuredWidth())) - com.bytedance.adsdk.ugeno.qk.jj.jd(marginLayoutParams)) / 2;
                if (!z10) {
                    view.layout(i10 + iJpo, i11, i12 + iJpo, i13);
                    return;
                } else {
                    view.layout(i10 - iJpo, i11, i12 - iJpo, i13);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (!z10) {
            view.layout(jdVar.au() + i10, i11, jdVar.au() + i12, i13);
        } else {
            view.layout(i10 - jdVar.prr(), i11, i12 - jdVar.prr(), i13);
        }
    }

    private void jpo(int i10, int i11, int i12, View view) {
        long[] jArr = this.f17924jd;
        if (jArr != null) {
            jArr[i10] = jd(i11, i12);
        }
        long[] jArr2 = this.f17925jj;
        if (jArr2 != null) {
            jArr2[i10] = jd(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }
}
