package x3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface i0 extends k0 {
    @Override // x3.i0, x3.k0
    /* synthetic */ boolean dispatchNestedFling(float f10, float f11, boolean z10);

    @Override // x3.i0, x3.k0
    /* synthetic */ boolean dispatchNestedPreFling(float f10, float f11);

    @Override // x3.i0, x3.k0
    /* synthetic */ boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2);

    boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2, int i12);

    @Override // x3.i0, x3.k0
    /* synthetic */ boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr);

    boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14);

    @Override // x3.i0, x3.k0
    /* synthetic */ boolean hasNestedScrollingParent();

    boolean hasNestedScrollingParent(int i10);

    @Override // x3.i0, x3.k0
    /* synthetic */ boolean isNestedScrollingEnabled();

    @Override // x3.i0, x3.k0
    /* synthetic */ void setNestedScrollingEnabled(boolean z10);

    @Override // x3.i0, x3.k0
    /* synthetic */ boolean startNestedScroll(int i10);

    boolean startNestedScroll(int i10, int i11);

    @Override // x3.i0, x3.k0
    /* synthetic */ void stopNestedScroll();

    void stopNestedScroll(int i10);
}
