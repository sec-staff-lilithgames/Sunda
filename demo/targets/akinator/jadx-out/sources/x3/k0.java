package x3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface k0 {
    boolean dispatchNestedFling(float f10, float f11, boolean z10);

    boolean dispatchNestedPreFling(float f10, float f11);

    boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2);

    boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z10);

    boolean startNestedScroll(int i10);

    void stopNestedScroll();
}
