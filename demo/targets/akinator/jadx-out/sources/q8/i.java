package q8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i implements a {
    @Override // q8.a
    public int getElementSizeInBytes() {
        return 4;
    }

    @Override // q8.a
    public String getTag() {
        return "IntegerArrayPool";
    }

    @Override // q8.a
    public int getArrayLength(int[] iArr) {
        return iArr.length;
    }

    @Override // q8.a
    public int[] newArray(int i10) {
        return new int[i10];
    }
}
